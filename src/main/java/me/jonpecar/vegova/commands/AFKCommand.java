package me.jonpecar.vegova.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;


public class AFKCommand implements CommandExecutor {
    // if player executes /afk command, set player's name suffixed with [AFK]
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setDisplayName(player.getName() + " [AFK]");
            player.sendMessage("You are now AFK");
        }
        return true;
    }
}
