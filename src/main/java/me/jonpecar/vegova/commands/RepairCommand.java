package me.jonpecar.vegova.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RepairCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = player.getInventory().getItemInMainHand();
            if (item != null) {
                item.setDurability((short) 0);
                player.sendMessage("Item repaired!");
            } else {
                player.sendMessage("You must be holding an item to repair it!");
            }
        }
        return true;
    }
}
