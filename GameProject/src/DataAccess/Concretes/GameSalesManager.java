package DataAccess.Concretes;

import Business.Abstracts.GameSalesService;
import Core.CheckPersonService;
import Entities.Concretes.Campaign;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

public class GameSalesManager implements GameSalesService {


    private CheckPersonService checkPersonService;


    public GameSalesManager(CheckPersonService checkPersonService) {
        this.checkPersonService = checkPersonService;
    }



    @Override
    public void gameSales(Gamer gamer, Game game, Campaign campaign) throws Exception {

        if(checkPersonService.isPersonReal(gamer)) {
            System.out.println("Kamyalı satış gerçekleşti --> " + " \n Alıcının ismi: "

                    + gamer.getName() + " \n Oyun ismi: " + game.getName() + " \n Kullanılan kampanya: " + campaign.getCampaignName());
        } else {

            System.out.println("Sisteme Kayıt Olmadan Oyunu Satın Alamazsınız.");
        }
    }
}
