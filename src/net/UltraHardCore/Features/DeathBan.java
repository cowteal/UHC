package net.UltraHardCore.Features.DeathBan;

public class DeathBan implements Listener {
  
  String prefix = ChatColor.GRAY + "[" + ChatColor.RED + "UHC" + ChatColor.GRAY + "] ";
  
  @EventHandler
  public void onPlayerDeath(PlayerDeathEvent event){
  
  event.getPlayer().kickPlayer(prefix + ChatColor.AQUA + "You Have Been Defeated!");
  Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban " + player.getName() + prefix + ChatColor.AQUA + "You Have Been Defeated!");
  }
}
