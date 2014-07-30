package net.UltraHardCore.Features;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Result implements Listener {
	
	@EventHandler
	public void ResultTypes(PlayerLoginEvent e) {
		Player p = e.getPlayer(); 
		 if(e.getResult() == org.bukkit.event.player.PlayerLoginEvent.Result.KICK_WHITELIST)
		if(e.getKickMessage().equalsIgnoreCase("You are not whitelisted on this server!")) {
			 e.setKickMessage(ChatColor.AQUA + "[" + ChatColor.GOLD + "UHC" + ChatColor.AQUA + "] " + ChatColor.WHITE + "You are not whitelisted in this Event!");
		 if(p.isBanned()) {
			  e.setResult(org.bukkit.event.player.PlayerLoginEvent.Result.KICK_BANNED);
			   e.setKickMessage(ChatColor.AQUA + "[" + ChatColor.GOLD + "UHC" + ChatColor.AQUA + "] " + ChatColor.WHITE + " You have been Eliminated!");
		 }
			 
			 
		}
		
	}
	

}
