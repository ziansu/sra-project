public void addAdmin(java.lang.String player) {
    cn.nukkit.utils.Config c = new cn.nukkit.utils.Config(((getDataFolder()) + "/Admin.yml"), cn.nukkit.utils.Config.YAML);
    c.set(player.toLowerCase(), true);
    c.save();
}