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

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/favorites")
    public List<Favorite> getfavorites() {
        return favoriteService.getFavorites();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/favorite")
    public Favorite createFavorite(@RequestBody Favorite favorite) {
        return favoriteService.createFavorite(favorite.getId(), favorite.getNote());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PatchMapping("/favorite")
    public Favorite editFavorite(@RequestBody Favorite favorite) {
        return favoriteService.editFavorite(favorite.getId(), favorite.getNote());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/favorite")
    public Favorite deleteFavorite(@RequestParam int id) {
        return favoriteService.deleteFavorite(id);
    }
}