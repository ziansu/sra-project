@java.lang.Override
public void onEnable() {
    de.SebastianMikolai.PlanetFx.Nick.Nick.instance = this;
    saveDefaultConfig();
    de.SebastianMikolai.PlanetFx.Nick.Datenbank.MySQL.LadeTabellen();
    de.SebastianMikolai.PlanetFx.Nick.Datenbank.MySQL.getMinecraftServers();
    getCommand("nick").setExecutor(new de.SebastianMikolai.PlanetFx.Nick.CommandListener());
    new de.SebastianMikolai.PlanetFx.Nick.NickManager();
}