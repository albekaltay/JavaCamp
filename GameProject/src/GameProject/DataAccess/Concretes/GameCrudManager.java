package GameProject.DataAccess.Concretes;

import GameProject.DataAccess.Abstracts.BaseCrudService;
import GameProject.Entities.Concretes.Game;

public class GameCrudManager implements BaseCrudService<Game> {
    @Override
    public void add(Game game) {
        System.out.println("Oyun eklendi: " + game.getName());

    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun güncellendi: " + game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi: " + game.getName());
    }
}
