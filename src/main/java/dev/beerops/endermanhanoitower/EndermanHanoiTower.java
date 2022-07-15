package dev.beerops.endermanhanoitower;

import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * Created by Levi Muniz on 7/29/20.
 *
 * @author Copyright (c) Levi Muniz. All Rights Reserved.
 */
public class EndermanHanoiTower extends JavaPlugin {

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    saveDefaultConfig();
  }
}
