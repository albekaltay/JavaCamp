package GameProject.Core;

import GameProject.Entities.Concretes.Gamer;

public interface CheckPersonService {
    boolean isPersonReal(Gamer gamer) throws Exception;

}
