package me.jonpecar.vegova.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class GodCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isInvulnerable()) {
                player.setInvulnerable(false);
                player.sendMessage("God mode disabled!");
            } else {
                player.setInvulnerable(true);
                player.sendMessage("God mode enabled!");
            }
        }
        return true;
    }

}

