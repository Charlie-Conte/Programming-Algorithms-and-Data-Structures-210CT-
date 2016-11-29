package main;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class openText 
{
	public static void openPsuedoCode(String input) 
	{
		File explanation = new File(System.getProperty("user.dir").replaceAll("\\\\", "\\\\\\\\") + "\\PsuedoCode&Text_Tasks\\" + input);
		Desktop desktop = Desktop.getDesktop();
		if(explanation.exists())
			try {
				desktop.open(explanation);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	
	}
}
