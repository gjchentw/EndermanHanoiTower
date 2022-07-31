package dev.beerops.endermanhanoitower;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
// import org.bukkit.entity.Player;

/**
 * Command for /dotower.
 */
public class DoTowerCommand implements CommandExecutor {

  @Override
  public boolean onCommand(
      CommandSender sender,
      Command command,
      String label,
      String[] args
  ) {
    // if (sender instanceof Player) {
    //   Player player = (Player) sender;
    //   // Here we need to give items to our player
    // }
    return true;
  }
}
