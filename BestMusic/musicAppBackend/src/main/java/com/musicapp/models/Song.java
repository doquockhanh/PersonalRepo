package com.musicapp.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String nameAuthor;
    private Integer duration;

    private String resource;
    @ManyToMany
    Set<Theme> themes;

    public Song() {
    }

    public Song(String name, String nameAuthor, Integer duration, String resource, Set<Theme> themes) {
        this.name = name;
        this.nameAuthor = nameAuthor;
        this.duration = duration;
        this.resource = resource;
        this.themes = themes;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setThemes(Set<Theme> themes) {
        this.themes = themes;
    }

    public Set<Theme> getThemes() {
        return themes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
