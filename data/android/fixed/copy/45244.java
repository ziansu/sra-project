@org.bukkit.event.EventHandler
public void onDestroyVehicleSpectator(org.bukkit.event.vehicle.VehicleDestroyEvent e) {
    if (((e.getAttacker()) instanceof com.thebubblenetwork.api.game.Player) && (isSpectating(((com.thebubblenetwork.api.game.Player) (e.getAttacker())))))
        e.setCancelled(true);
    
}