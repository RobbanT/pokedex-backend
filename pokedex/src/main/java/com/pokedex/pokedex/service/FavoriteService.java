package com.pokedex.pokedex.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pokedex.pokedex.FavoriteRespository;
import com.pokedex.pokedex.api.model.Favorite;

@Service
public class FavoriteService {
    @Autowired
    private FavoriteRespository favoriteRepository;

    public Favorite getFavorite(int id) {
        return favoriteRepository.findById(id).orElse(null);
    }

    public List<Favorite> getFavorites() {
        List<Favorite> favoriteList = new ArrayList<Favorite>();
        favoriteRepository.findAll().forEach(favorite -> favoriteList.add(favorite));
        return favoriteList;
    }

    public Favorite createFavorite(int id, String note) {
        Favorite createFavorite = favoriteRepository.findById(id).orElse(null);
        if (createFavorite == null) {
            createFavorite = new Favorite(id, note);
            favoriteRepository.save(createFavorite);
        }
        return createFavorite;
    }

    public Favorite editFavorite(int id, String note) {
        Favorite editFavorite = favoriteRepository.findById(id).orElse(null);
        if (editFavorite != null) {
            favoriteRepository.updateFavorite(note, id);
            editFavorite.setNote(note);
        }
        return editFavorite;
    }

    public Favorite deleteFavorite(int id) {
        Favorite deleteFavorite = favoriteRepository.findById(id).orElse(null);
        if (deleteFavorite != null) {
            favoriteRepository.deleteById(id);
        }
        return deleteFavorite;
    }
}