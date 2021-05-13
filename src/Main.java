import java.sql.Date;

import Abstract.IGamerCheckService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckService;
import Concrete.GamerManager;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
     Game game= new Game(1,"Super Mario",100);
     Gamer gamer= new Gamer(1,"Shigeru","Miyamoto",new Date(1952,11,16),"00000000000");
     
     IGamerCheckService gamerCheckService= new GamerCheckService();
     
     GamerManager gamerManager = new GamerManager(gamerCheckService);
     
     gamerManager.register(gamer);
     
     CampaignManager campaignManager= new CampaignManager();
     GameManager gameManager= new GameManager();
     
     campaignManager.campaignAdd(game);
     gameManager.gameSale(gamer, game);
     
     
		
	}

}
