@java.lang.Override
public void onEnable() {
    de.SebastianMikolai.PlanetFx.Nick.Nick.instance = this;
    saveDefaultConfig();
    getCommand("nick").setExecutor(new de.SebastianMikolai.PlanetFx.Nick.CommandListener());
    new de.SebastianMikolai.PlanetFx.Nick.NickManager();
}