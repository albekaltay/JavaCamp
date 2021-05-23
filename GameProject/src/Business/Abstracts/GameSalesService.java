package Business.Abstracts;

import Entities.Concretes.Campaign;
import Entities.Concretes.Gamer;
import Entities.Concretes.Game;

public interface GameSalesService {
    void gameSales(Gamer gamer, Game game, Campaign campaign) throws Exception;
}

