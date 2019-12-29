package org.aoichaan0513.a_worldrealms.Listener;

import org.aoichaan0513.a_worldrealms.API.Inventory.InventoryManager;
import org.aoichaan0513.a_worldrealms.Main;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.io.File;

public class onInventory implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Inventory inv = e.getInventory();
        Player p = (Player) e.getWhoClicked();
        if (inv.getType() == InventoryType.CHEST && inv.getTitle().equalsIgnoreCase("メインメニュー")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.IRON_PICKAXE && e.getSlot() == 10
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ワールドを作成")) {
                InventoryManager.openEasyCreateMenu(p);
            } else if (e.getCurrentItem().getType() == Material.TNT && e.getSlot() == 12
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ワールドを削除")) {
                InventoryManager.openDeleteMenu(p);
            } else if (e.getCurrentItem().getType() == Material.IRON_BOOTS && e.getSlot() == 14
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ワールドに参加")) {
                InventoryManager.openJoinMenu(p);
            }
        }
        if (inv.getType() == InventoryType.CHEST && inv.getTitle().equalsIgnoreCase("ワールド種類 - かんたん作成")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.GRASS && e.getSlot() == 10
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ノーマル")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NORMAL, WorldType.NORMAL);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.NETHERRACK && e.getSlot() == 12
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ネザー")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NETHER, null);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.ENDER_STONE && e.getSlot() == 14
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ジ・エンド")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.THE_END, null);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.COMMAND && e.getSlot() == 16
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "カスタム作成")) {
                InventoryManager.openCustomCreateMenu1(p);
            }
        }
        if (inv.getType() == InventoryType.CHEST && inv.getTitle().equalsIgnoreCase("カスタム作成 (1/2)")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.GRASS && e.getSlot() == 10
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ノーマル")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCustomCreateMenu2(p);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.NETHERRACK && e.getSlot() == 12
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ネザー")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NETHER, null);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.ENDER_STONE && e.getSlot() == 14
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ジ・エンド")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.THE_END, null);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.CHEST && e.getSlot() == 16
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "かんたん作成")) {
                InventoryManager.openEasyCreateMenu(p);
            }
        }
        if (inv.getType() == InventoryType.CHEST && inv.getTitle().equalsIgnoreCase("カスタム作成 (2/2)")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.GOLD_ORE && e.getSlot() == 10
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "デフォルト")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NORMAL, WorldType.NORMAL);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.GRASS && e.getSlot() == 12
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "フラット")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NORMAL, WorldType.FLAT);
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.STONE && e.getSlot() == 13
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "採掘家の夢")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NORMAL, WorldType.FLAT, "3;minecraft:bedrock,230*minecraft:stone,5*minecraft:dirt,minecraft:grass;3;biome_1,decoration,stronghold,mineshaft,dungeon");
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.WATER_BUCKET && e.getSlot() == 14
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "水の世界")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NORMAL, WorldType.FLAT, "3;minecraft:bedrock,5*minecraft:stone,5*minecraft:dirt,5*minecraft:sand,90*minecraft:water;24;oceanmonument,biome_1");
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.DIRT && e.getSlot() == 15
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "オーバーワールド")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NORMAL, WorldType.FLAT, "3;minecraft:bedrock,59*minecraft:stone,3*minecraft:dirt,minecraft:grass;1;village,biome_1,decoration,stronghold,mineshaft,lake,lava_lake,dungeon");
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.BARRIER && e.getSlot() == 16
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "奈落")) {
                if (!Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    InventoryManager.openCreateInputMenu(p, World.Environment.NORMAL, WorldType.FLAT, "3;minecraft:air;127;decoration");
                    return;
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドがすでに作成されています。");
                    return;
                }
            }
        }
        if (inv.getType() == InventoryType.CHEST && inv.getTitle().equalsIgnoreCase("ワールド種類 - 削除")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.GRASS && e.getSlot() == 11
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ノーマル")) {
                if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    World world = Bukkit.getWorld(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".normal.name"));
                    if (world != null) {
                        Bukkit.unloadWorld(world, true);
                        if (deleteWorld(world.getWorldFolder())) {
                            Main.getInstance().getConfig().set("worlds." + p.getUniqueId() + ".normal", null);
                            Main.getInstance().saveConfig();
                            p.sendMessage(ChatColor.GREEN + "ワールドを削除しました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドを削除できませんでした。");
                            return;
                        }
                    } else {
                        p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                        return;
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.NETHERRACK && e.getSlot() == 13
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ネザー")) {
                if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                    World world = Bukkit.getWorld(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".nether.name"));
                    if (world != null) {
                        Bukkit.unloadWorld(world, true);
                        if (deleteWorld(world.getWorldFolder())) {
                            Main.getInstance().getConfig().set("worlds." + p.getUniqueId() + ".nether", null);
                            Main.getInstance().saveConfig();
                            p.sendMessage(ChatColor.GREEN + "ワールドを削除しました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドを削除できませんでした。");
                            return;
                        }
                    } else {
                        p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                        return;
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.ENDER_STONE && e.getSlot() == 15
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ジ・エンド")) {
                if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                    World world = Bukkit.getWorld(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".the_end.name"));
                    if (world != null) {
                        Bukkit.unloadWorld(world, true);
                        if (deleteWorld(world.getWorldFolder())) {
                            Main.getInstance().getConfig().set("worlds." + p.getUniqueId() + ".the_end", null);
                            Main.getInstance().saveConfig();
                            p.sendMessage(ChatColor.GREEN + "ワールドを削除しました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドを削除できませんでした。");
                            return;
                        }
                    } else {
                        p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                        return;
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                    return;
                }
            }
        }
        if (inv.getType() == InventoryType.CHEST && inv.getTitle().equalsIgnoreCase("ワールド種類 - 参加")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.GRASS && e.getSlot() == 11
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ノーマル")) {
                if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".normal")) {
                    World world = Bukkit.getWorld(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".normal.name"));
                    if (world != null) {
                        int max = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".normal.maxPlayer", 5);
                        if (world.getPlayers().size() < max) {
                            p.teleport(world.getSpawnLocation());
                            p.sendMessage(ChatColor.GOLD + "ワールドにテレポートしました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドの参加上限に達しています。これ以上は参加できません。");
                            return;
                        }
                    } else {
                        p.sendMessage(ChatColor.GOLD + "ワールドを読み込んでいます…");
                        world = Bukkit.createWorld(new WorldCreator(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".normal.name")));
                        p.sendMessage(ChatColor.GREEN + "ワールドを読み込みました。");
                        int max = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".normal.maxPlayer", 5);
                        if (world.getPlayers().size() < max) {
                            p.teleport(world.getSpawnLocation());
                            p.sendMessage(ChatColor.GOLD + "ワールドにテレポートしました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドの参加上限に達しています。これ以上は参加できません。");
                            return;
                        }
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.NETHERRACK && e.getSlot() == 13
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ネザー")) {
                if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".nether")) {
                    World world = Bukkit.getWorld(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".nether.name"));
                    if (world != null) {
                        int max = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".nether.maxPlayer", 5);
                        if (world.getPlayers().size() < max) {
                            p.teleport(world.getSpawnLocation());
                            p.sendMessage(ChatColor.GOLD + "ワールドにテレポートしました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドの参加上限に達しています。これ以上は参加できません。");
                            return;
                        }
                    } else {
                        p.sendMessage(ChatColor.GOLD + "ワールドを読み込んでいます…");
                        world = Bukkit.createWorld(new WorldCreator(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".nether.name")));
                        p.sendMessage(ChatColor.GREEN + "ワールドを読み込みました。");
                        int max = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".nether.maxPlayer", 5);
                        if (world.getPlayers().size() < max) {
                            p.teleport(world.getSpawnLocation());
                            p.sendMessage(ChatColor.GOLD + "ワールドにテレポートしました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドの参加上限に達しています。これ以上は参加できません。");
                            return;
                        }
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                    return;
                }
            } else if (e.getCurrentItem().getType() == Material.ENDER_STONE && e.getSlot() == 15
                    && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "ジ・エンド")) {
                if (Main.getInstance().getConfig().contains("worlds." + p.getUniqueId() + ".the_end")) {
                    World world = Bukkit.getWorld(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".the_end.name"));
                    if (world != null) {
                        int max = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".the_end.maxPlayer", 5);
                        if (world.getPlayers().size() < max) {
                            p.teleport(world.getSpawnLocation());
                            p.sendMessage(ChatColor.GOLD + "ワールドにテレポートしました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドの参加上限に達しています。これ以上は参加できません。");
                            return;
                        }
                    } else {
                        p.sendMessage(ChatColor.GOLD + "ワールドを読み込んでいます…");
                        world = Bukkit.createWorld(new WorldCreator(Main.getInstance().getConfig().getString("worlds." + p.getUniqueId() + ".the_end.name")));
                        p.sendMessage(ChatColor.GREEN + "ワールドを読み込みました。");
                        int max = Main.getInstance().getConfig().getInt("worlds." + p.getUniqueId() + ".the_end.maxPlayer", 5);
                        if (world.getPlayers().size() < max) {
                            p.teleport(world.getSpawnLocation());
                            p.sendMessage(ChatColor.GOLD + "ワールドにテレポートしました。");
                            return;
                        } else {
                            p.sendMessage(ChatColor.RED + "ワールドの参加上限に達しています。これ以上は参加できません。");
                            return;
                        }
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "ワールドが見つかりませんでした。");
                    return;
                }
            }
        }
    }

    public boolean deleteWorld(File path) {
        if (path.exists()) {
            File files[] = path.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    deleteWorld(files[i]);
                } else {
                    files[i].delete();
                }
            }
        }
        return (path.delete());
    }
}
