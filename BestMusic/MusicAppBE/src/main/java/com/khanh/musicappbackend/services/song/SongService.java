package com.khanh.musicappbackend.services.song;

import com.khanh.musicappbackend.models.Song;
import com.khanh.musicappbackend.models.Theme;

import java.util.List;

public interface SongService {
    List<Song> getByKeyWord(String key);
    List<Song> getAll();
    List<Song> getByTheme(Theme theme);
    void addSong(Song song);
    boolean checkResource(String resource);
    void deleteSong(Integer id);
    Song getById(Integer id);
}
