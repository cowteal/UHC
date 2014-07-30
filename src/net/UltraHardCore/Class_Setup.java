package net.UltraHardCore.Setup;

import org.bukkit.plugin.java.JavaPlugin;

public class Class_Startup extends JavaPlugin  {
	
	String author = "CrazymanJR, coldguy101 & darkzonex44";
 
	
	@Override
	public void onEnable() {
	   getLogger().info("UHC Has Been Enabled!");
	   getLogger().info("Developed By: " + author);
	    /*
	     * Config & More Stuff here!
	     */
	     register();
	     executecommands();
	}
	
	@Override
	public void onDisable() {
           getLogger().info("UHC Has Been Disabled!");
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
