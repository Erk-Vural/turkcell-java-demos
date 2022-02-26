package com.gameSalePlatform.dataAccess.concretes.jdbcimpls;

import com.gameSalePlatform.dataAccess.abstracts.GameDao;
import com.gameSalePlatform.entities.concretes.Game;

public class GameJdbsDao implements GameDao {
    @Override
    public void add(Game game) {
        System.out.println("Game jdbs added");
    }

    @Override
    public void update(Game game) {
        System.out.println("Game jdbs updated");
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game jdbs deleted");
    }
}
