package com.stackroute.muzix.Model;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection="vishal")
public class Track {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String comment;

    public Track() {
    }

    public Track(int i, String a, String b) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
