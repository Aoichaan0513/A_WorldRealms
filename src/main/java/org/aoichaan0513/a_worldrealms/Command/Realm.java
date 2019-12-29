package org.aoichaan0513.a_worldrealms.Command;

import org.aoichaan0513.a_worldrealms.API.Inventory.InventoryManager;
import org.aoichaan0513.a_worldrealms.API.Inventory.RealmInventoryManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Realm implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (RealmInventoryManager.isOwnWorld(p))
                RealmInventoryManager.openMainMenu(p);
            else
                InventoryManager.openMainMenu(p);
        } else {
            sender.sendMessage(ChatColor.RED + "プレイヤーからのみ実行可能です。");
            return true;
        }
        return true;
    }
}
