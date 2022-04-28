package com.crud.crudbook.service;

import com.crud.crudbook.entity.SpotifyAlbum;

import java.util.List;

public interface AlbumServiceInterface {

    List<SpotifyAlbum> getAllAlbums();

    SpotifyAlbum saveAlbum(SpotifyAlbum album);

    SpotifyAlbum updateAlbum(SpotifyAlbum album);

    void deleteAlbum(Long id);

}
