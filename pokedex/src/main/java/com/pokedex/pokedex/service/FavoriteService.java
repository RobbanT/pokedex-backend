package com.pokedex.pokedex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pokedex.pokedex.api.model.Favorite;

@Service
public class FavoriteService {
    private List<Favorite> favoriteList;

    public FavoriteService() {
        favoriteList = new ArrayList<>();
        favoriteList.add(new Favorite(1, "Pika Pika"));
        favoriteList.add(new Favorite(3, "Fånga mig"));
        favoriteList.add(new Favorite(9, "Vad är detta?"));
    }

    public Favorite getFavorite(int id) {
        return favoriteList.stream()
                .filter(favorite -> id == favorite.getId())
                .findFirst()
                .orElse(null);
    }

    public List<Favorite> getFavorites() {
        return favoriteList;
    }

    public Favorite createFavorite(Favorite favorite) {

        favoriteList.add(favorite);
        return favorite;
    }

    public Favorite editFavorite(int id, String note) {
        Favorite editFavorite = favoriteList.stream()
                .filter(favorite -> favorite.getId() == id)
                .findFirst()
                .orElse(null);
        if (editFavorite != null) {
            editFavorite.setNote(note);
        }
        return editFavorite;
    }
}
