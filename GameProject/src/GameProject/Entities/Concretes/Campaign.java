package GameProject.Entities.Concretes;

import GameProject.Entities.Abstracts.Entity;

public class Campaign implements Entity {

    private int id;
    private String campaignNumber;
    private String campaignName;

    public Campaign(int id, String campaignNumber, String campaignName) {
        this.id = id;
        this.campaignNumber = campaignNumber;
        this.campaignName = campaignName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignNumber() {
        return campaignNumber;
    }

    public void setCampaignNumber(String campaignNumber) {
        this.campaignNumber = campaignNumber;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
