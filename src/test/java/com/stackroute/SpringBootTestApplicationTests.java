package com.stackroute;

import com.stackroute.muzix.Model.Track;
import com.stackroute.muzix.controller.TrackController;
import com.stackroute.muzix.repository.TrackRepository;
import com.stackroute.muzix.services.TrackService;
import com.stackroute.muzix.services.TrackServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {
	@Test
	public void test1() {
		TrackService trackService= Mockito.mock(TrackService.class);
		TrackController trackController=new TrackController(trackService);

		List<Track> list= new ArrayList<>();
		Track track=new Track(1,"a","b");
		list.add(track);
		trackController.saveTrack(list);
		Mockito.when(trackService.getAllTracks()).thenReturn(list);
		Assert.assertEquals(list,trackController.getAllTracks());
	}

	@Test
	public void test2() {
		TrackRepository trackRepository= Mockito.mock(TrackRepository.class);
		TrackServiceImpl trackService=new TrackServiceImpl(trackRepository) ;

		List<Track> list= new ArrayList<>();
		Track track=new Track(1,"a","b");
		list.add(track);
		trackService.saveTrack(list);
		Mockito.when(trackService.getAllTracks()).thenReturn(list);
		Assert.assertEquals(list,trackService.getAllTracks());
	}
}
