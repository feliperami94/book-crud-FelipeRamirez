package com.crud.crudbook.repository;

import com.crud.crudbook.entity.SpotifyAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<SpotifyAlbum, Long> {



}
