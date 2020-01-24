package aquarius0715.minecraftjoinquietplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class Join implements Listener {


    public Join(Main main) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onJoin(PlayerJoinEvent event) {

        if (event.getPlayer().hasPlayedBefore()) {
            //Aquarius0715がログインしました
            for (Player on : Bukkit.getOnlinePlayers()) {
                on.sendMessage(ChatColor.AQUA + event.getPlayer().getName() + "がログインしました");
            }
        } else {
            for (Player on : Bukkit.getOnlinePlayers()) {
                on.sendMessage(ChatColor.AQUA + event.getPlayer().getName() + "さんが初めてログインしました");
            }

        }
        event.getPlayer().sendMessage("サーバーへようこそ");
    }
}
