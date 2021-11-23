private static void addRespawnTime(org.bukkit.entity.Player p, java.lang.Integer add) {
    com.cubicb.ssm.game.Stock.setRespawnTime(p, ((com.cubicb.ssm.game.Stock.getRespawnTime(p)) + add));
}