package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckService implements IGamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}

}
