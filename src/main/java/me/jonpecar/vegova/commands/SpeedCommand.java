package me.jonpecar.vegova.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            try {
                Player player = (Player) sender;
                if (args.length == 0) {
                    player.sendMessage("Usage: /speed <speed>");
                    return true;
                }
                float speed = Float.parseFloat(args[0]);
                player.setWalkSpeed(speed);
                player.sendMessage("Speed set to " + speed);
            } catch (NumberFormatException e) {
                Player player = (Player) sender;
                player.sendMessage("Invalid speed value");
            }
        }
        return true;
    }
}
