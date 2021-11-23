@java.lang.Override
public void onEnable() {
    plugin.getPluginManager().registerEvent(this, TweakCartEvent.Sign.VehicleCollidesWithSignEvent, "elevator");
    parser = new net.tweakcraft.tweakcart2elevators.ElevatorParser();
    plugin.log("Elevators enabled");
}