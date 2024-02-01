package com.pokedex.pokedex;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import com.pokedex.pokedex.api.model.Favorite;
import jakarta.transaction.Transactional;

public interface FavoriteRespository extends CrudRepository<Favorite, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Favorite f SET f.note = ?1 WHERE f.id = ?2")
    int updateFavorite(String note, int id);
}
