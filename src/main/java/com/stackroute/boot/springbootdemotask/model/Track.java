package com.stackroute.boot.springbootdemotask.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
    public class Track {
        @Id
        private int id;

        private String name;

        private String comment;



        }
    

