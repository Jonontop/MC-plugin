package me.jonpecar.vegova.commands;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class UnbanCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("Usage: /unban <player>");
            return true;
        }

        String playerName = args[0];
        Bukkit.getBanList(BanList.Type.NAME).pardon(playerName);
        sender.sendMessage("Player " + playerName + " has been unbanned");
        return true;
    }
}
