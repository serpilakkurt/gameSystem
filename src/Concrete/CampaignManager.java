package Concrete;

import Abstract.ICampaignManager;
import Entities.Game;

public class CampaignManager implements ICampaignManager {

	@Override
	public void campaignAdd(Game game) {
       System.out.println(game.name + " adl� oyuna kampanya eklendi!");		
	}

	@Override
	public void campaignUpdate(Game game) {
	       System.out.println(game.name + " adl� oyunda kampanya g�ncellendi!");		
		
	}

	@Override
	public void campaignDelete(Game game) {
	       System.out.println(game.name + " adl� oyunda kampanya silindi!");		
		
	}

}
