package network.mcplayer.kitpvp.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodEvent implements Listener {

    @EventHandler
    public void food(FoodLevelChangeEvent e){
        e.setCancelled(true);
    }


}
