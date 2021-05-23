package GameProject;

import DataAccess.Abstracts.BaseCrudService;
import Business.Abstracts.GameSalesService;
import DataAccess.Concretes.GameSalesManager;
import DataAccess.Concretes.GamerCrudManager;
import Core.MernisCheckPersonAdapter;
import Entities.Concretes.Campaign;
import Entities.Concretes.Game;
import Entities.Concretes.Gamer;

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