package net.UltraHardCore.Setup;

import org.bukkit.plugin.java.JavaPlugin;

public class Class_Startup extends JavaPlugin  {
	
	String author = "CrazymanJR, coldguy101 & darkzonex44";
 
	
	 @Override
	public void onEnable() {
	   System.out.println("[UHC] Developed by " + author);
	    /*
	     * Config & More Stuff here!
	     */
	     register();
	     executecommands();
	}
	  
	private void register() {
	  getServer().getPluginManager().registerEvents(new Events(), this);
	}
	 
	 
	 private void executecommands() {
	   /*
	    Register Commands
	    */
	 }
}
