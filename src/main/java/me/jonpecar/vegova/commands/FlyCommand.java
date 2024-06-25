package me.jonpecar.vegova.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setAllowFlight(!player.getAllowFlight());
            player.sendMessage("Fly mode " + (player.getAllowFlight() ? "enabled" : "disabled"));
        }
        return true;
    }
}
