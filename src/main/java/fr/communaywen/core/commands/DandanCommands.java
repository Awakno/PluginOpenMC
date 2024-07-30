package fr.communaywen.core.commands;

import fr.communaywen.core.AywenCraftPlugin;
import fr.communaywen.core.credit.Credit;
import fr.communaywen.core.credit.Feature;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.Nullable;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Cooldown;
import revxrsal.commands.annotation.Description;
import revxrsal.commands.bukkit.annotation.CommandPermission;

import java.util.concurrent.TimeUnit;

@Features("Dandan")
@Credit("Awakno")
public final class DandanCommands {
    @Command("dandan")
    @Description("Dandan a pété ça pue !")
    @CommandPermission("ayw.command.dandan")
    @Cooldown(value = 2, unit = TimeUnit.MINUTES)
    public void onCommand(Player, player) {

        final Vector currentVelocity = player.getVelocity();
        currentVelocity.setY(0.55d);
        String broadcastMessage = "§f§l Dandan a pété ça pue !!! §2 Dégueu";
        Bukkit.broadcastMesssage(broadcastMessage);
    }
}