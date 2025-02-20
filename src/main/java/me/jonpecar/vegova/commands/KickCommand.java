package me.jonpecar.vegova.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage("Usage: /kick <player>");
            } else {
                Player target = Bukkit.getPlayer(args[0]);
                if (target != null) {
                    target.kickPlayer("You have been kicked from the server!");
                    player.sendMessage("You have kicked " + target.getName() + " from the server!");
                } else {
                    player.sendMessage("Player not found!");
                }
            }
        }
        return true;
    }
}
