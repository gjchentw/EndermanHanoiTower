package dev.beerops.endermanhanoitower;

import io.papermc.lib.PaperLib;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by gjchen@beerops.dev.
 *
 * @author Copyright (c) Levi Muniz. All Rights Reserved.
 */
public class EndermanHanoiTower extends JavaPlugin {

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    saveDefaultConfig();

    PluginCommand c = getCommand("dotower");
    
    if (c != null) {
      c.setExecutor(new DoTowerCommand());
    }
  }
}
