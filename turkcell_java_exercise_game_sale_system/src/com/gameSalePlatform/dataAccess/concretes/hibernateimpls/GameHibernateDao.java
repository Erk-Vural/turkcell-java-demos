package com.gameSalePlatform.dataAccess.concretes.hibernateimpls;

import com.gameSalePlatform.dataAccess.abstracts.GameDao;
import com.gameSalePlatform.entities.concretes.Game;

public class GameHibernateDao implements GameDao {
    @Override
    public void add(Game game) {
        System.out.println("Game hibernate added");
    }

    @Override
    public void update(Game game) {
        System.out.println("Game hibernate updated");
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game hibernate deleted");
    }
}
