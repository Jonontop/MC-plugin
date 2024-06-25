package me.jonpecar.vegova.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BackCommand implements CommandExecutor {
    // if player executes /back command, teleport player to last location
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location lastLocation = (Location) player.getMetadata("lastLocation");
            player.teleport(lastLocation);
        }
        return true;
    }
}
