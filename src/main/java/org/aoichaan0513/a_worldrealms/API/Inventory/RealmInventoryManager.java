package org.aoichaan0513.a_worldrealms.API.Inventory;

import org.aoichaan0513.a_worldrealms.Main;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Wool;

import java.util.Arrays;

public class RealmInventoryManager {
    // メインメニュー
    public static void openMainMenu(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9 * 6, "メインメニュー");

        // 公開設定アイテム
        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".normal.name"))) {
                    int isOpen = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".normal.isOpen", 0);
                    if (isOpen == 0) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.LIME);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + ChatColor.GREEN + "公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    } else if (isOpen == 1) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.YELLOW);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + ChatColor.YELLOW + "限定公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    } else if (isOpen == 2) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.RED);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + "" + ChatColor.RED + "非公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    }
                }
            }
        } else if (p.getWorld().getEnvironment() == World.Environment.NETHER) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".nether.name"))) {
                    int isOpen = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".nether.isOpen", 0);
                    if (isOpen == 0) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.LIME);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + ChatColor.GREEN + "公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    } else if (isOpen == 1) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.YELLOW);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + ChatColor.YELLOW + "限定公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    } else if (isOpen == 2) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.RED);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + "" + ChatColor.RED + "非公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    }
                }
            }
        } else if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".the_end.name"))) {
                    int isOpen = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".the_end.isOpen", 0);
                    if (isOpen == 0) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.LIME);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + ChatColor.GREEN + "公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    } else if (isOpen == 1) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.YELLOW);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + ChatColor.YELLOW + "限定公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    } else if (isOpen == 2) {
                        ItemStack releaseItem = new ItemStack(Material.WOOL, 1);
                        Wool wool = new Wool(DyeColor.RED);
                        releaseItem.setDurability(wool.getData());
                        ItemMeta releaseItemMeta = releaseItem.getItemMeta();
                        releaseItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの公開設定");
                        releaseItemMeta.setLore(Arrays.asList(ChatColor.WHITE + "ワールドを公開/非公開するかどうかを設定します。", "", ChatColor.WHITE + "現在の設定: " + "" + ChatColor.RED + "非公開"));
                        releaseItem.setItemMeta(releaseItemMeta);
                        inv.setItem(0, releaseItem);
                    }
                }
            }
        }

        p.openInventory(inv);
    }

    // 自分がオーナーのワールドかどうか
    public static boolean isOwnWorld(Player p) {
        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".normal.name")))
                    return true;
                else
                    return false;
            }
        } else if (p.getWorld().getEnvironment() == World.Environment.NETHER) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".nether.name")))
                    return true;
                else
                    return false;
            }
        } else if (p.getWorld().getEnvironment() == World.Environment.THE_END) {
            if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                if (p.getWorld().getName().equalsIgnoreCase(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".the_end.name")))
                    return true;
                else
                    return false;
            }
        }
        return false;
    }
}
