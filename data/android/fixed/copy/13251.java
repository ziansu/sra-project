private boolean isAdmin(java.lang.String player) {
    cn.nukkit.utils.Config c = new cn.nukkit.utils.Config(((getDataFolder()) + "/Admin.yml"), cn.nukkit.utils.Config.YAML);
    return c.exists(player.toLowerCase());
}