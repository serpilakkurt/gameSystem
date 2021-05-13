package Concrete;

import Abstract.ICampaignManager;
import Entities.Game;

public class CampaignManager implements ICampaignManager {

	@Override
	public void campaignAdd(Game game) {
       System.out.println(game.name + " adlý oyuna kampanya eklendi!");		
	}

	@Override
	public void campaignUpdate(Game game) {
	       System.out.println(game.name + " adlý oyunda kampanya güncellendi!");		
		
	}

	@Override
	public void campaignDelete(Game game) {
	       System.out.println(game.name + " adlý oyunda kampanya silindi!");		
		
	}

}
