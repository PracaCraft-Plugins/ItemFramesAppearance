package com.valdoveste.itemframesappearance;

import java.util.*;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.event.hanging.HangingPlaceEvent;
import com.valdoveste.itemframesappearance.commands.AppearanceFramesCommand;

public final class ItemFramesAppearance extends JavaPlugin implements Listener {

    private static final String PERMISSION = "frameditems.allow";

    public static final Set<UUID> mapPlayerUUID = Collections.newSetFromMap(new ConcurrentHashMap<UUID, Boolean>());

    public static void addPlayerUUIDToMap(UUID uuid) {
        mapPlayerUUID.add(uuid);
    }

    public static void removePlayerUUIDToMap(UUID uuid) {
        mapPlayerUUID.remove(uuid);
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        Objects.requireNonNull(getCommand("iframe")).setExecutor(new AppearanceFramesCommand(this));
    }

    @EventHandler
    public void blockPlaceEventHandler(HangingPlaceEvent event) {
        Player player = event.getPlayer();
        if (event.getEntity() instanceof ItemFrame frame && Objects.requireNonNull(player).hasPermission(PERMISSION))
            frame.setVisible(!mapPlayerUUID.contains(player.getUniqueId()));
    }

}