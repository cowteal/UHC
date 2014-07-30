package net.UltraHardCore.Features.DeathBan;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDeathEvent;

public class DeathBan implements Listener {
  
  String prefix = ChatColor.GRAY + "[" + ChatColor.RED + "UHC" + ChatColor.GRAY + "] ";
  
  @EventHandler
  public void onPlayerDeath(PlayerDeathEvent event){
  
  event.getPlayer().kickPlayer(prefix + ChatColor.AQUA + "You Have Been Defeated!");
  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban " + player.getName() + prefix + ChatColor.AQUA + "You Have Been Defeated!");
  }
}
