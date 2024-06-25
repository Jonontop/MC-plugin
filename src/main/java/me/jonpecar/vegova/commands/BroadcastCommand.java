package me.jonpecar.vegova.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("Usage: /broadcast <message>");
            return true;
        }

        String message = String.join(" ", args);
        Bukkit.broadcastMessage(ChatColor.RED + "[Broadcast] " + ChatColor.WHITE + message);
        return true;
    }
}
