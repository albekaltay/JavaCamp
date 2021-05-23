package Core;

import Entities.Concretes.Gamer;

public interface CheckPersonService {
    boolean isPersonReal(Gamer gamer) throws Exception;

}
