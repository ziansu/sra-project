public java.lang.String getPath(org.bukkit.entity.Entity e, java.lang.String item) {
    return (("mobs." + (e.getType().getName())) + ".") + item;
}