package org.aoichaan0513.a_worldrealms.API.Inventory;

import net.wesjd.anvilgui.AnvilGUI;
import org.aoichaan0513.a_worldrealms.Main;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class InventoryManager {
    // メインメニュー
    public static void openMainMenu(Player p) {
        Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "メインメニュー");

        // ワールド作成アイテム
        ItemStack createItem = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta createItemMeta = createItem.getItemMeta();
        createItemMeta.setDisplayName(ChatColor.BOLD + "ワールドを作成");
        createItem.setItemMeta(createItemMeta);
        inv.setItem(10, createItem);

        // ワールド名編集アイテム
        ItemStack editItem = new ItemStack(Material.ANVIL, 1);
        ItemMeta editItemMeta = editItem.getItemMeta();
        editItemMeta.setDisplayName(ChatColor.BOLD + "ワールドの名前を変更");
        editItemMeta.setLore(Arrays.asList(ChatColor.YELLOW + "実装されていません。"));
        editItem.setItemMeta(editItemMeta);
        inv.setItem(11, editItem);

        // ワールド削除アイテム
        ItemStack deleteItem = new ItemStack(Material.TNT, 1);
        ItemMeta deleteItemMeta = deleteItem.getItemMeta();
        deleteItemMeta.setDisplayName(ChatColor.BOLD + "ワールドを削除");
        deleteItem.setItemMeta(deleteItemMeta);
        inv.setItem(12, deleteItem);

        // ワールド参加アイテム
        ItemStack joinItem = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta joinItemMeta = joinItem.getItemMeta();
        joinItemMeta.setDisplayName(ChatColor.BOLD + "ワールドに参加");
        joinItem.setItemMeta(joinItemMeta);
        inv.setItem(14, joinItem);

        // 他ワールド参加アイテム
        ItemStack otherjoinItem = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta otherjoinItemMeta = otherjoinItem.getItemMeta();
        otherjoinItemMeta.setDisplayName(ChatColor.BOLD + "他のワールドに参加");
        otherjoinItem.setItemMeta(otherjoinItemMeta);
        inv.setItem(16, otherjoinItem);

        p.openInventory(inv);
    }

    // かんたん作成メニュー
    public static void openEasyCreateMenu(Player p) {
        Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "ワールド種類 - かんたん作成");

        // ノーマルワールド作成アイテム
        ItemStack flatItem = new ItemStack(Material.GRASS, 1);
        ItemMeta flatItemMeta = flatItem.getItemMeta();
        flatItemMeta.setDisplayName(ChatColor.BOLD + "ノーマル");
        flatItem.setItemMeta(flatItemMeta);
        inv.setItem(10, flatItem);

        // ネザーワールド作成アイテム
        ItemStack netherItem = new ItemStack(Material.NETHERRACK, 1);
        ItemMeta netherItemMeta = netherItem.getItemMeta();
        netherItemMeta.setDisplayName(ChatColor.BOLD + "ネザー");
        netherItem.setItemMeta(netherItemMeta);
        inv.setItem(12, netherItem);

        // ジ・エンドワールド作成アイテム
        ItemStack g_endItem = new ItemStack(Material.ENDER_STONE, 1);
        ItemMeta g_endItemMeta = g_endItem.getItemMeta();
        g_endItemMeta.setDisplayName(ChatColor.BOLD + "ジ・エンド");
        g_endItem.setItemMeta(g_endItemMeta);
        inv.setItem(14, g_endItem);

        // カスタム作成メニューアイテム
        ItemStack customItem = new ItemStack(Material.COMMAND, 1);
        ItemMeta customItemMeta = customItem.getItemMeta();
        customItemMeta.setDisplayName(ChatColor.BOLD + "カスタム作成");
        customItem.setItemMeta(customItemMeta);
        inv.setItem(16, customItem);

        p.openInventory(inv);
    }

    // カスタム作成メニュー (1/2)
    public static void openCustomCreateMenu1(Player p) {
        Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "カスタム作成 (1/2)");

        // ノーマルワールド作成アイテム
        ItemStack flatItem = new ItemStack(Material.GRASS, 1);
        ItemMeta flatItemMeta = flatItem.getItemMeta();
        flatItemMeta.setDisplayName(ChatColor.BOLD + "ノーマル");
        flatItem.setItemMeta(flatItemMeta);
        inv.setItem(10, flatItem);

        // ネザーワールド作成アイテム
        ItemStack netherItem = new ItemStack(Material.NETHERRACK, 1);
        ItemMeta netherItemMeta = netherItem.getItemMeta();
        netherItemMeta.setDisplayName(ChatColor.BOLD + "ネザー");
        netherItem.setItemMeta(netherItemMeta);
        inv.setItem(12, netherItem);

        // ジ・エンドワールド作成アイテム
        ItemStack g_endItem = new ItemStack(Material.ENDER_STONE, 1);
        ItemMeta g_endItemMeta = g_endItem.getItemMeta();
        g_endItemMeta.setDisplayName(ChatColor.BOLD + "ジ・エンド");
        g_endItem.setItemMeta(g_endItemMeta);
        inv.setItem(14, g_endItem);

        // かんたん作成メニューアイテム
        ItemStack easyItem = new ItemStack(Material.CHEST, 1);
        ItemMeta easyItemMeta = easyItem.getItemMeta();
        easyItemMeta.setDisplayName(ChatColor.BOLD + "かんたん作成");
        easyItem.setItemMeta(easyItemMeta);
        inv.setItem(16, easyItem);

        p.openInventory(inv);
    }

    // カスタム作成メニュー (2/2)
    public static void openCustomCreateMenu2(Player p) {
        Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "カスタム作成 (2/2)");

        // デフォルトワールド作成アイテム
        ItemStack defaultItem = new ItemStack(Material.GOLD_ORE, 1);
        ItemMeta defaultItemMeta = defaultItem.getItemMeta();
        defaultItemMeta.setDisplayName(ChatColor.BOLD + "デフォルト");
        defaultItem.setItemMeta(defaultItemMeta);
        inv.setItem(10, defaultItem);

        // フラットワールド作成アイテム
        ItemStack flatItem = new ItemStack(Material.GRASS, 1);
        ItemMeta flatItemMeta = flatItem.getItemMeta();
        flatItemMeta.setDisplayName(ChatColor.BOLD + "フラット");
        flatItem.setItemMeta(flatItemMeta);
        inv.setItem(12, flatItem);

        // 採掘家の夢ワールド作成アイテム
        ItemStack stoneItem = new ItemStack(Material.STONE, 1);
        ItemMeta stoneItemMeta = stoneItem.getItemMeta();
        stoneItemMeta.setDisplayName(ChatColor.BOLD + "採掘家の夢");
        stoneItem.setItemMeta(stoneItemMeta);
        inv.setItem(13, stoneItem);

        // 水の世界ワールド作成アイテム
        ItemStack waterItem = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta waterItemMeta = waterItem.getItemMeta();
        waterItemMeta.setDisplayName(ChatColor.BOLD + "水の世界");
        waterItem.setItemMeta(waterItemMeta);
        inv.setItem(14, waterItem);

        // オーバーワールド作成アイテム
        ItemStack tallgrassItem = new ItemStack(Material.DIRT, 1);
        ItemMeta tallgrassItemMeta = tallgrassItem.getItemMeta();
        tallgrassItemMeta.setDisplayName(ChatColor.BOLD + "オーバーワールド");
        tallgrassItem.setItemMeta(tallgrassItemMeta);
        inv.setItem(15, tallgrassItem);

        // 奈落ワールド作成アイテム
        ItemStack voidItem = new ItemStack(Material.BARRIER, 1);
        ItemMeta voidItemMeta = voidItem.getItemMeta();
        voidItemMeta.setDisplayName(ChatColor.BOLD + "奈落");
        voidItem.setItemMeta(voidItemMeta);
        inv.setItem(16, voidItem);

        p.openInventory(inv);
    }

    // 作成時ワールド名入力メニュー (かんたん)
    public static void openCreateInputMenu(Player p, World.Environment environment, WorldType type) {
        new AnvilGUI(Main.getInstance(), p, "ワールド名を入力…", (player, reply) -> {
            p.sendMessage(ChatColor.GOLD + "ワールドを作成しています…");
            if (environment == World.Environment.NORMAL) {
                String configPath = "worlds." + p.getUniqueId() + ".normal";
                Main.getInstance().getConfig().set(configPath + ".name", reply);
                Main.getInstance().getConfig().set(configPath + ".isOpen", 0);
                Main.getInstance().getConfig().set(configPath + ".maxPlayer", 5);
                Main.getInstance().saveConfig();
            } else if (environment == World.Environment.NETHER) {
                String configPath = "worlds." + p.getUniqueId() + ".nether";
                Main.getInstance().getConfig().set(configPath + ".name", reply);
                Main.getInstance().getConfig().set(configPath + ".isOpen", 0);
                Main.getInstance().getConfig().set(configPath + ".maxPlayer", 5);
                Main.getInstance().saveConfig();
            } else if (environment == World.Environment.THE_END) {
                String configPath = "worlds." + p.getUniqueId() + ".the_end";
                Main.getInstance().getConfig().set(configPath + ".name", reply);
                Main.getInstance().getConfig().set(configPath + ".isOpen", 0);
                Main.getInstance().getConfig().set(configPath + ".maxPlayer", 5);
                Main.getInstance().saveConfig();
            }
            WorldCreator worldCreator = new WorldCreator(reply).environment(environment).type(type);
            Bukkit.createWorld(worldCreator);
            p.sendMessage(ChatColor.GREEN + "ワールドを作成しました。");
            return null;
        });
    }

    // 作成時ワールド名入力メニュー (カスタム)
    public static void openCreateInputMenu(Player p, World.Environment environment, WorldType type, String generator) {
        new AnvilGUI(Main.getInstance(), p, "ワールド名を入力…", (player, reply) -> {
            p.sendMessage(ChatColor.GOLD + "ワールドを作成しています…");
            if (environment == World.Environment.NORMAL) {
                String configPath = "worlds." + p.getUniqueId() + ".normal";
                Main.getInstance().getConfig().set(configPath + ".name", reply);
                Main.getInstance().getConfig().set(configPath + ".isOpen", 0);
                Main.getInstance().getConfig().set(configPath + ".maxPlayer", 5);
                Main.getInstance().saveConfig();
            } else if (environment == World.Environment.NETHER) {
                String configPath = "worlds." + p.getUniqueId() + ".nether";
                Main.getInstance().getConfig().set(configPath + ".name", reply);
                Main.getInstance().getConfig().set(configPath + ".isOpen", 0);
                Main.getInstance().getConfig().set(configPath + ".maxPlayer", 5);
                Main.getInstance().saveConfig();
            } else if (environment == World.Environment.THE_END) {
                String configPath = "worlds." + p.getUniqueId() + ".the_end";
                Main.getInstance().getConfig().set(configPath + ".name", reply);
                Main.getInstance().getConfig().set(configPath + ".isOpen", 0);
                Main.getInstance().getConfig().set(configPath + ".maxPlayer", 5);
                Main.getInstance().saveConfig();
            }
            WorldCreator worldCreator = new WorldCreator(reply).environment(environment).type(type).generatorSettings(generator);
            Bukkit.createWorld(worldCreator);
            p.sendMessage(ChatColor.GREEN + "ワールドを作成しました。");
            return null;
        });
    }

    // 削除メニュー
    public static void openDeleteMenu(Player p) {
        Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "ワールド種類 - 削除");

        // ノーマルワールド削除アイテム
        ItemStack normalItem = new ItemStack(Material.GRASS, 1);
        ItemMeta normalItemMeta = normalItem.getItemMeta();
        normalItemMeta.setDisplayName(ChatColor.BOLD + "ノーマル");
        normalItem.setItemMeta(normalItemMeta);
        inv.setItem(11, normalItem);

        // ネザーワールド削除アイテム
        ItemStack netherItem = new ItemStack(Material.NETHERRACK, 1);
        ItemMeta netherItemMeta = netherItem.getItemMeta();
        netherItemMeta.setDisplayName(ChatColor.BOLD + "ネザー");
        netherItem.setItemMeta(netherItemMeta);
        inv.setItem(13, netherItem);

        // ジ・エンドワールド削除アイテム
        ItemStack g_endItem = new ItemStack(Material.ENDER_STONE, 1);
        ItemMeta g_endItemMeta = g_endItem.getItemMeta();
        g_endItemMeta.setDisplayName(ChatColor.BOLD + "ジ・エンド");
        g_endItem.setItemMeta(g_endItemMeta);
        inv.setItem(15, g_endItem);

        p.openInventory(inv);
    }

    // 参加メニュー
    public static void openJoinMenu(Player p) {
        Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "ワールド種類 - 参加");

        // ノーマルワールド参加アイテム
        ItemStack normalItem = new ItemStack(Material.GRASS, 1);
        ItemMeta normalItemMeta = normalItem.getItemMeta();
        normalItemMeta.setDisplayName(ChatColor.BOLD + "ノーマル");
        normalItem.setItemMeta(normalItemMeta);
        inv.setItem(11, normalItem);

        // ネザーワールド参加アイテム
        ItemStack netherItem = new ItemStack(Material.NETHERRACK, 1);
        ItemMeta netherItemMeta = netherItem.getItemMeta();
        netherItemMeta.setDisplayName(ChatColor.BOLD + "ネザー");
        netherItem.setItemMeta(netherItemMeta);
        inv.setItem(13, netherItem);

        // ジ・エンドワールド参加アイテム
        ItemStack g_endItem = new ItemStack(Material.ENDER_STONE, 1);
        ItemMeta g_endItemMeta = g_endItem.getItemMeta();
        g_endItemMeta.setDisplayName(ChatColor.BOLD + "ジ・エンド");
        g_endItem.setItemMeta(g_endItemMeta);
        inv.setItem(15, g_endItem);

        p.openInventory(inv);
    }
}
