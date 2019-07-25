package com.stackroute.boot.springbootdemotask.dao;

import com.stackroute.boot.springbootdemotask.model.Track;
import com.stackroute.boot.springbootdemotask.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import javax.transaction.Transactional;



    @Repository
    @Transactional
    public class TrackDaoImpl implements TrackDao {

        @Autowired
        private TrackRepository trackRepository;


        public TrackDaoImpl(TrackRepository trackRepository) {

            this.trackRepository = trackRepository;
        }

        //implement all the methods
        @Override
        public boolean saveTrack(Track track) {
            trackRepository.save(track);
            return true;
        }

        @Override
        public boolean deleteTrack(int id) {
            trackRepository.delete(getTrackById(id));
            return true;
        }

        @Override
        public List<Track> getAllTracks() {
            return  trackRepository.findAll();
        }

        @Override
        public Track getTrackById(int id) {
          return trackRepository.getOne(id);


        }

        @Override
        public boolean UpdateTrack(Track track) {
            trackRepository.save(track);
            return true;
        }

        public Track findByName(String name){
            return trackRepository.findByName(name);
        }

        public List<Track> findByComment(String comment){
            return trackRepository.findByComment(comment);
        }


    }


