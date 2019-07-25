package com.stackroute.boot.springbootdemotask.controller;



import com.stackroute.boot.springbootdemotask.customexceptions.TrackAlreadyExistsException;
import com.stackroute.boot.springbootdemotask.customexceptions.TrackNotFoundException;
import com.stackroute.boot.springbootdemotask.dao.TrackDao;
import com.stackroute.boot.springbootdemotask.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


    @RestController
    @RequestMapping("api")
    public class TrackController {

        @Autowired
        TrackDao trackDao;

        //update all the methods with code
        @RequestMapping("/")
        public String indexPage(Model model) {
            List<Track> list = trackDao.getAllTracks();
            model.addAttribute("tracks", list);
            return "index";
        }

        @RequestMapping("/saveTrack")
        public ResponseEntity<?> saveTrack(@RequestBody Track track) throws TrackAlreadyExistsException {
            ResponseEntity responseEntity;
            trackDao.saveTrack(track);
            responseEntity = new ResponseEntity("Successfully created", HttpStatus.CREATED);
            return responseEntity;
        }

        @RequestMapping("/updateTrack")
            public Track updateTrack(@RequestBody Track track, Model model) {
            Track track1=new Track();
            track1.setId(track.getId());
            track1.setName(track.getName());
            track1.setComment(track.getComment());
            trackDao.deleteTrack(track.getId());
            trackDao.saveTrack(track1);
            return track1;
        }

            @RequestMapping("/getAllTracks")
            public ResponseEntity<?> getAllUsers() throws TrackNotFoundException{
                return new ResponseEntity<>(trackDao.getAllTracks(), HttpStatus.OK);
            }

            @RequestMapping("/name")
            public ResponseEntity<?> findTrackByName (@RequestBody Track track ){
                return new ResponseEntity<>(trackDao.findByName(track.getName()), HttpStatus.OK);
            }


            @RequestMapping("/comment")
            public ResponseEntity<?> findTrackByComment (@RequestBody Track track ){
                return new ResponseEntity<>(trackDao.findByComment(track.getComment()), HttpStatus.OK);
            }
        }


