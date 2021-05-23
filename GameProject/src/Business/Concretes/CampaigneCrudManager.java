package Business.Concretes;

import Business.Abstracts.BaseCrudService;
import Entities.Concretes.Campaign;

public class CampaigneCrudManager implements BaseCrudService<Campaign> {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya eklendi: " + campaign.getCampaignName());

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi: " + campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi: " + campaign.getCampaignName());
    }
}
