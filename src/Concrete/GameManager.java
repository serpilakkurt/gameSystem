
package Concrete;

import Abstract.ICampaignManager;
import Abstract.IGameManager;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements IGameManager{
	
    ICampaignManager _campaignManager;
    
	public GameManager() {
	}

	public GameManager(ICampaignManager _campaignManager) {
		this._campaignManager = _campaignManager;
	}

	@Override
	public void gameSale(Gamer gamer,Game game) {
		System.out.println(game.name+" isimli oyun " + gamer.firstName+" tarafýnda satýþa sunuldu.");
		
	}

}
