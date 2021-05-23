package GameProject.Business.Abstracts;

import GameProject.Entities.Concretes.Campaign;
import GameProject.Entities.Concretes.Gamer;
import GameProject.Entities.Concretes.Game;

public interface GameSalesService {
    void gameSales(Gamer gamer, Game game, Campaign campaign) throws Exception;
}

