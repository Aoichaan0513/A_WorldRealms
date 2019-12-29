package org.aoichaan0513.a_worldrealms;

import org.aoichaan0513.a_worldrealms.API.PermissionManager;
import org.aoichaan0513.a_worldrealms.Command.Realm;
import org.aoichaan0513.a_worldrealms.Listener.onChat;
import org.aoichaan0513.a_worldrealms.Listener.onInventory;
import org.aoichaan0513.a_worldrealms.Listener.onPlayer;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        // コンフィグ
        saveDefaultConfig();

        // APIを登録
        PermissionManager.initManager();

        // コマンドを登録
        getCommand("realm").setExecutor(new Realm());

        // リスナーを登録
        getServer().getPluginManager().registerEvents(new onInventory(), this);
        getServer().getPluginManager().registerEvents(new onChat(), this);
        getServer().getPluginManager().registerEvents(new onPlayer(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static JavaPlugin getInstance() {
        return plugin;
    }
}
