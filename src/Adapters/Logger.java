package Adapters;

import Concrete.GamerCheckService;

public abstract class Logger extends GamerCheckService{
	
	 public void log() {
		   System.out.println("Ortak konfigurasyon");
	   }
	 
}
