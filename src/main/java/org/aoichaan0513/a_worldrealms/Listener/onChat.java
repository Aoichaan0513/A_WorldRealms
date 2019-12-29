package org.aoichaan0513.a_worldrealms.Listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onChat implements Listener {
    @EventHandler
    public void onAsyncChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if (e.getMessage().startsWith("@g ") || e.getMessage().startsWith("@global ")) {
            e.setCancelled(true);
            String msg = e.getMessage().replace("@g ", "").replace("@global ", "");
            Bukkit.broadcastMessage(ChatColor.BLUE + "[Global] " + ChatColor.RESET + p.getName() + ChatColor.GREEN + ": " + ChatColor.RESET + msg);
        } else {
            e.setCancelled(true);
            for (Player player : p.getWorld().getPlayers()) {
                player.sendMessage(ChatColor.BLUE + "[World] " + ChatColor.RESET + p.getName() + ChatColor.GREEN + ": " + ChatColor.RESET + e.getMessage());
            }
        }
    }
}
