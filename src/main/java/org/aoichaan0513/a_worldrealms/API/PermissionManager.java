package org.aoichaan0513.a_worldrealms.API;

import org.aoichaan0513.a_worldrealms.Main;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

import java.util.HashMap;
import java.util.UUID;

public class PermissionManager {
    public static HashMap<UUID, PermissionAttachment> hashMap;

    public static void initManager() {
        hashMap = new HashMap<>();
        return;
    }

    public static PermissionAttachment addAttachment(Player p) {
        PermissionAttachment attachment = p.addAttachment(Main.getInstance());
        if (!hasMap(p)) {
            hashMap.put(p.getUniqueId(), attachment);
            return attachment;
        } else {
            return getAttachment(p, false);
        }
    }

    public static PermissionAttachment getAttachment(Player p, boolean add) {
        if (hasMap(p)) {
            return hashMap.get(p.getUniqueId());
        } else {
            if (add)
                return addAttachment(p);
            else
                return null;
        }
    }

    public static boolean removeAttachment(Player p) {
        if (hasMap(p)) {
            hashMap.remove(p.getUniqueId());
            return true;
        } else {
            return false;
        }
    }

    private static boolean hasMap(Player p) {
        if (hashMap.containsKey(p.getUniqueId()))
            return true;
        else
            return false;
    }
}
