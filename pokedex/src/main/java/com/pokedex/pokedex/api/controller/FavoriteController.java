package com.pokedex.pokedex.api.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.pokedex.pokedex.api.model.Favorite;
import com.pokedex.pokedex.service.FavoriteService;

@RestController
public class FavoriteController {
    private FavoriteService favoriteService;

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
        return favoriteService.createFavorite(favorite.getId(), favorite.getNote());
    }

    @PatchMapping("/favorite")
    public Favorite editFavorite(@RequestBody Favorite favorite) {
        return favoriteService.editFavorite(favorite.getId(), favorite.getNote());
    }

    @DeleteMapping("/favorite")
    public Favorite deleteFavorite(@RequestParam int id) {
        return favoriteService.deleteFavorite(id);
    }
}