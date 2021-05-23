package GameProject;

import GameProject.DataAccess.Abstracts.BaseCrudService;
import GameProject.Business.Abstracts.GameSalesService;
import GameProject.DataAccess.Concretes.GameSalesManager;
import GameProject.DataAccess.Concretes.GamerCrudManager;
import GameProject.Core.MernisCheckPersonAdapter;
import GameProject.Entities.Concretes.Campaign;
import GameProject.Entities.Concretes.Game;
import GameProject.Entities.Concretes.Gamer;

public class Main {

    public static void main(String[] args) throws Exception {

        //  Aşağıdaki TC Kimlik Numarası Yanlış Girilmiştir.

        BaseCrudService crud = new GamerCrudManager(new MernisCheckPersonAdapter());
        crud.add(new Gamer(1,"Albek","Altay",1997,12345678912L));

        GameSalesService sales = new GameSalesManager(new MernisCheckPersonAdapter());
        sales.gameSales(new Gamer(1,"Albek","Altay",1997,12345678912L),
                new Game(1,"FIFA 2021",225.50),new Campaign(1,"123456","Öğrenci"));



    }
}