package com.khanh.musicappbackend.repository;

import com.khanh.musicappbackend.models.Song;
import com.khanh.musicappbackend.models.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Integer> {
    List<Song> getSongsByNameContaining(String key);
    boolean existsSongByResource(String resource);
    List<Song> getSongsByThemes(Theme theme);
}
