package net.endlight.posh;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable(){
        this.getLogger().info("PositionHelper Enabled!");
        this.getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        String level_name = player.getLevel().getName();
        double x = player.getX();
        String x2 = String.format("%.3f",x);
        double y = player.getY();
        String y2 = String.format("%.3f",y);
        double z = player.getZ();
        String z2 = String.format("%.3f",z);
        double yaw = player.getYaw();
        String yaw2 = String.format("%.3f",yaw);
        double pitch = player.getPitch();
        String pitch2 = String.format("%.3f",pitch);
        player.sendTip("§bLevel:§r"+level_name+" §bx:§r"+x2+" §by:§r"+y2+" §bz:§r"+z2+"\n§bYaw:§r"+yaw2+" §bPitch:§r"+pitch2);
    }
}
