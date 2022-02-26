package com.gameSalePlatform.business.abstracts;

import com.gameSalePlatform.entities.concretes.Game;

public interface GameService {
    void add(Game game);

    void update(Game game);

    void delete(Game game);
}
