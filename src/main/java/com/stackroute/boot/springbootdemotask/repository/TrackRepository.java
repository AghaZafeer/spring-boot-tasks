package com.stackroute.boot.springbootdemotask.repository;

import com.stackroute.boot.springbootdemotask.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Integer> {

}
