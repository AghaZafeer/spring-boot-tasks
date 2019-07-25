package com.stackroute.boot.springbootdemotask.repository;

import com.stackroute.boot.springbootdemotask.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Integer> {

    @Query("from Track where name=?1")
    public Track findByName(String name);
    public List<Track> findByComment(String comment);

}
