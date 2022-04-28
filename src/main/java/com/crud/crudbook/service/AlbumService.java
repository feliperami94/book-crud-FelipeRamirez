package com.crud.crudbook.service;


import com.crud.crudbook.entity.SpotifyAlbum;
import com.crud.crudbook.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService implements AlbumServiceInterface {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public List<SpotifyAlbum> getAllAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public SpotifyAlbum saveAlbum(SpotifyAlbum album) {
        return albumRepository.save(album);
    }

    @Override
    public SpotifyAlbum updateAlbum(SpotifyAlbum album) {
        if (albumRepository.existsById(album.getId())){
            return albumRepository.save(album);
        }
        return null;

    }

    @Override
    public void deleteAlbum(Long id) {
        albumRepository.deleteById(id);
    }

}
