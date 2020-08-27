package com.musicapp.repository;

import com.musicapp.models.Song;
import com.musicapp.models.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Integer> {
    List<Song> getSongsByNameContaining(String key);
    boolean existsSongByResource(String resource);
    List<Song> getSongsByThemes(Theme theme);
}
