package GameProject.DataAccess.Concretes;

import GameProject.Business.Abstracts.GameSalesService;
import GameProject.Core.CheckPersonService;
import GameProject.Entities.Concretes.Campaign;
import GameProject.Entities.Concretes.Game;
import GameProject.Entities.Concretes.Gamer;

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
