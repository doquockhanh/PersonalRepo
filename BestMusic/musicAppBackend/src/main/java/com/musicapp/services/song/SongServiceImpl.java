package com.musicapp.services.song;

import com.musicapp.models.Song;
import com.musicapp.models.Theme;
import com.musicapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    private SongRepository songRepository;

    @Override
    public List<Song> getByKeyWord(String key) {
        return songRepository.getSongsByNameContaining(key);
    }

    @Override
    public List<Song> getAll() {
        return songRepository.findAll();
    }

    @Override
    public void addSong(Song song) {
        songRepository.save(song);
    }

    @Override
    public boolean checkResource(String resource) {
        return songRepository.existsSongByResource(resource);
    }

    @Override
    public void deleteSong(Integer id) {
        songRepository.deleteById(id);
    }

    @Override
    public Song getById(Integer id) {
        return songRepository.findById(id).get();
    }

    @Override
    public List<Song> getByTheme(Theme theme) {
        return songRepository.getSongsByThemes(theme);
    }
}
