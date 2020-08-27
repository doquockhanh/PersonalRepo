package com.musicapp.services.song;

import com.musicapp.models.Song;
import com.musicapp.models.Theme;

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
