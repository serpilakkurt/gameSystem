package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerManager;
import Entities.Gamer;

public class GamerManager implements IGamerManager {
	
	IGamerCheckService _gamerCheckService;
	

	public GamerManager(IGamerCheckService _gamerCheckService) {
		this._gamerCheckService = _gamerCheckService;
	}

	@Override
	public void register(Gamer gamer) {
         try {
        	 if(_gamerCheckService.CheckIfRealPerson(gamer)) {
        		 
        		 System.out.println(gamer.firstName+ ": kay�t edildi.");
        	 }
        	 
         }catch(Exception e) {
    		 System.out.println("Ge�ersiz bilgi.");

         }
	}

	@Override
	public void update(Gamer gamer) {
        System.out.println(gamer.firstName +":  bilgileri g�ncelledi.");		

	}

	@Override
	public void delete(Gamer gamer) {
        System.out.println(gamer.firstName +":  kay�t silindi.");		
		
	}

}
