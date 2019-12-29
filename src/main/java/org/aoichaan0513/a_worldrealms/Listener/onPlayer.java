package org.aoichaan0513.a_worldrealms.Listener;

import org.aoichaan0513.a_worldrealms.API.PermissionManager;
import org.aoichaan0513.a_worldrealms.Main;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.permissions.PermissionAttachment;

public class onPlayer implements Listener {
    @EventHandler
    public void onTeleport(PlayerTeleportEvent e) {
        System.out.println(e.getTo().getWorld().getName());

        Player p = e.getPlayer();
        if (e.getTo().getWorld().getEnvironment() == World.Environment.NORMAL) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                if (e.getTo().getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".normal.name"))) {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.setPermission(permission, true);
                    }
                } else {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.unsetPermission(permission);
                    }
                    PermissionManager.removeAttachment(p);
                }
            }
        } else if (e.getTo().getWorld().getEnvironment() == World.Environment.NETHER) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                if (e.getTo().getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".nether.name"))) {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.setPermission(permission, true);
                    }
                } else {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.unsetPermission(permission);
                    }
                    PermissionManager.removeAttachment(p);
                }
            }
        } else if (e.getTo().getWorld().getEnvironment() == World.Environment.THE_END) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                if (e.getTo().getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".the_end.name"))) {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.setPermission(permission, true);
                    }
                } else {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.unsetPermission(permission);
                    }
                    PermissionManager.removeAttachment(p);
                }
            }
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".normal.name"))) {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.setPermission(permission, true);
                    }
                } else {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.unsetPermission(permission);
                    }
                    PermissionManager.removeAttachment(p);
                }
            }
        } else if (p.getWorld().getEnvironment() == World.Environment.NETHER) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".nether.name"))) {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.setPermission(permission, true);
                    }
                } else {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.unsetPermission(permission);
                    }
                    PermissionManager.removeAttachment(p);
                }
            }
        } else if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".the_end.name"))) {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.setPermission(permission, true);
                    }
                } else {
                    PermissionAttachment attachment = PermissionManager.getAttachment(p, true);
                    for (String permission : Main.getInstance().getConfig().getStringList("permissions")) {
                        attachment.unsetPermission(permission);
                    }
                    PermissionManager.removeAttachment(p);
                }
            }
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        PermissionManager.removeAttachment(p);
    }
}
