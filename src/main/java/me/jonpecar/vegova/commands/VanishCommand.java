package me.jonpecar.vegova.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class VanishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setInvisible(!player.isInvisible());
            player.sendMessage("Vanish mode " + (player.isInvisible() ? "enabled" : "disabled"));
        }
        return true;
    }
}
