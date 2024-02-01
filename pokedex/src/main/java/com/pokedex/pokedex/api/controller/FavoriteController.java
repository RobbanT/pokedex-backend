package com.pokedex.pokedex.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pokedex.pokedex.api.model.Favorite;
import com.pokedex.pokedex.service.FavoriteService;

@RestController
public class FavoriteController {
    private FavoriteService favoriteService;

    @Autowired
    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @GetMapping("/favorite")
    public Favorite getfavorite(@RequestParam int id) {
        return favoriteService.getFavorite(id);
    }

    @GetMapping("/favorites")
    public List<Favorite> getfavorites() {
        return favoriteService.getFavorites();
    }

    @PostMapping("/favorite")
    public Favorite createFavorite(@RequestBody Favorite favorite) {
        return favoriteService.createFavorite(favorite);
    }

    @PatchMapping("/favorite")
    public Favorite editFavorite(@RequestBody Favorite favorite) {
        return favoriteService.editFavorite(favorite.getId(), favorite.getNote());
    }

}
