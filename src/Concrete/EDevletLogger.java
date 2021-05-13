package Concrete;

import Adapters.Logger;

public class EDevletLogger extends Logger{

	@Override
	public void log() {
		   System.out.println("E-devlet sisteminde doðrulama yapýldý. ");
	   }
	 
	
}
