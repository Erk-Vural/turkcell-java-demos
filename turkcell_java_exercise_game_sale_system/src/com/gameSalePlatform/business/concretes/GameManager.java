package com.gameSalePlatform.business.concretes;

import com.gameSalePlatform.business.abstracts.GameService;
import com.gameSalePlatform.dataAccess.abstracts.GameDao;
import com.gameSalePlatform.entities.concretes.Game;

public class GameManager implements GameService {
    private GameDao gameDao;

    public GameManager() {
    }

    public GameManager(GameDao gameDao) {
        this.gameDao = gameDao;
    }


    @Override
    public void add(Game game) {
        this.gameDao.add(game);
    }

    @Override
    public void update(Game game) {
        this.gameDao.update(game);
    }

    @Override
    public void delete(Game game) {
        this.gameDao.delete(game);
    }
}
