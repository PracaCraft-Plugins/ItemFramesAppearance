//package com.valdoveste.itemframesappearance.commands;
//
//import org.bukkit.ChatColor;
//import org.bukkit.entity.Player;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandSender;
//import org.bukkit.command.CommandExecutor;
//import com.valdoveste.itemframesappearance.ItemFramesAppearance;
//
//import java.util.UUID;
//
//public class invisibleItemFrameCommand implements CommandExecutor {
//
//    ItemFramesAppearance plugin;
//
//    public invisibleItemFrameCommand(ItemFramesAppearance plugin) {
//        this.plugin = plugin;
//    }
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//        if (command.getName().equalsIgnoreCase("iframe")) {
//            if (sender instanceof Player playerSender) {
//                UUID uuid = playerSender.getUniqueId();
//                if (args.length == 0) {
//                    playerSender.sendMessage(
//                            ChatColor.GRAY + "[" + ChatColor.AQUA + "ItemFramesAppearance" + ChatColor.GRAY + "] "
//                                    + ChatColor.RED + "This commands needs at least one argument!"
//                    );
//                    return false;
//                }
//
//                if (args.length == 1 && args[0].equalsIgnoreCase("i")) {
//                    playerSender.sendMessage(
//                            ChatColor.GRAY + "[" + ChatColor.AQUA + "ItemFramesAppearance" + ChatColor.GRAY + "] "
//                                    + ChatColor.YELLOW + "You will now place invisible item frames."
//                    );
//
//                    System.out.println(uuid);
//                    ItemFramesAppearance.removePlayerUUIDToMap(uuid);
//                } else if (args.length == 1 && args[0].equalsIgnoreCase("v")) {
//                    playerSender.sendMessage(
//                            ChatColor.GRAY + "[" + ChatColor.AQUA + "ItemFramesAppearance" + ChatColor.GRAY + "] "
//                                    + ChatColor.YELLOW + "You will now place invisible item frames."
//                    );
//
//                    System.out.println(uuid);
//                    ItemFramesAppearance.removePlayerUUIDToMap(uuid);
//                }
//
//                if (args.length > 1) {
//                    playerSender.sendMessage(
//                            ChatColor.GRAY + "[" + ChatColor.AQUA + "ItemFramesAppearance" + ChatColor.GRAY + "] "
//                                    + ChatColor.RED + "This command command does not accept more than one argument!"
//                    );
//                    return false;
//                }
//
//            }
//        }
//        return true;
//    }
//}
