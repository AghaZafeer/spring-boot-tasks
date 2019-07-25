package com.stackroute.boot.springbootdemotask.dao;


import com.stackroute.boot.springbootdemotask.model.Track;

import java.util.List;

public interface TrackDao {


        public boolean saveTrack(Track track);

        public boolean deleteTrack(int id);

        public List<Track> getAllTracks();

        public Track getTrackById(int id);

        public boolean UpdateTrack(Track track);

        public Track findByName(String name);

        public List<Track> findByComment(String comment);


    }



