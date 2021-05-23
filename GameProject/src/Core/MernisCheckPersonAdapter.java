package Core;

import Entities.Concretes.Gamer;
import MernisServiceReferance.VVLKPSPublicSoap;


public class MernisCheckPersonAdapter implements CheckPersonService {
    @Override
    public boolean isPersonReal(Gamer gamer) throws Exception {

        VVLKPSPublicSoap client = new VVLKPSPublicSoap();
        return client.TCKimlikNoDogrula(gamer.getNationalityId(), gamer.getName(), gamer.getLastName(), gamer.getYearOfBirth());


    }
}
