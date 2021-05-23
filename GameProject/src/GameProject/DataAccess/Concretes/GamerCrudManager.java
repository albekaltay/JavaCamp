package GameProject.DataAccess.Concretes;

import GameProject.DataAccess.Abstracts.BaseCrudService;
import GameProject.Core.MernisCheckPersonAdapter;
import GameProject.Entities.Concretes.Gamer;

public class GamerCrudManager implements BaseCrudService<Gamer> {




    private MernisCheckPersonAdapter mernisCheckPersonAdapter;


    public GamerCrudManager(MernisCheckPersonAdapter mernisCheckPersonAdapter) {
        this.mernisCheckPersonAdapter = mernisCheckPersonAdapter;
    }


    @Override
    public void add(Gamer gamer) throws Exception {

        if (mernisCheckPersonAdapter.isPersonReal(gamer)) {

            System.out.println("Oyuncu eklendi: " + gamer.getName());

        } else {

            System.out.println("Bilgileriniz doğru olmadığından sisteme kayıt gerçekleşmemiştir.");
        }


    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu güncellendi: " + gamer.getName());
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu silindi: " + gamer.getName());
    }
}
