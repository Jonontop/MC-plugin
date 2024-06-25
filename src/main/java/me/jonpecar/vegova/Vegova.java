package me.jonpecar.vegova;

// Custom Commands Imports
import me.jonpecar.vegova.commands.*;
// Bukkit Imports
import org.bukkit.plugin.java.JavaPlugin;


public class Vegova extends JavaPlugin{

    @Override
    public void onEnable() {
        System.out.println("Vegova plugin enabled!");

        // getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new JoinLeave(), this);
        getCommand("god").setExecutor(new GodCommand());
        getCommand("craft").setExecutor(new CraftingCommand());
        getCommand("enchant").setExecutor(new EnchantCommand());
        getCommand("anvil").setExecutor(new AnvilCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        // getCommand("speed").setExecutor(new SpeedCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("enderchest").setExecutor(new EnderChestCommand());
        getCommand("repair").setExecutor(new RepairCommand());
        getCommand("afk").setExecutor(new AFKCommand());
        getCommand("clear").setExecutor(new ClearCommand());
        // getCommand("invsee").setExecutor(new InvseeCommand());
        // getCommand("enderpearl").setExecutor(new EnderPearlCommand());
        getCommand("nightvision").setExecutor(new NightVisionCommand());
        // getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        getCommand("kick").setExecutor(new KickCommand());
        getCommand("ban").setExecutor(new BanCommand());
        getCommand("unban").setExecutor(new UnbanCommand());
        // getCommand("mute").setExecutor(new MuteCommand());
        // getCommand("unmute").setExecutor(new UnmuteCommand());
        // getCommand("tp").setExecutor(new TeleportCommand());
        // getCommand("tpa").setExecutor(new TeleportAcceptCommand());
        // getCommand("tpdeny").setExecutor(new TeleportDenyCommand());
        // getCommand("tpall").setExecutor(new TeleportAllCommand());
        // getCommand("tpo").setExecutor(new TeleportHereCommand());
        // getCommand("tpohere").setExecutor(new TeleportHereCommand());
        // getCommand("tpoall").setExecutor(new TeleportAllHereCommand());
        // getCommand("tpohereall").setExecutor(new TeleportAllHereCommand());
        // getCommand("sethome").setExecutor(new SetHomeCommand());
        // getCommand("home").setExecutor(new HomeCommand());
        // getCommand("delhome").setExecutor(new DelHomeCommand());
        // getCommand("listhomes").setExecutor(new ListHomesCommand());
        // getCommand("spawn").setExecutor(new SpawnCommand());
        // getCommand("setspawn").setExecutor(new SetSpawnCommand());
        // getCommand("setwarp").setExecutor(new SetWarpCommand());
        // getCommand("warp").setExecutor(new WarpCommand());
        // getCommand("delwarp").setExecutor(new DelWarpCommand());
        // getCommand("listwarps").setExecutor(new ListWarpsCommand());
        // getCommand("back").setExecutor(new BackCommand());
        // getCommand("top").setExecutor(new TopCommand());

    }

}
