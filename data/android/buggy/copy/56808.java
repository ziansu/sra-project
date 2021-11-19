@java.lang.Override
void call(org.bukkit.event.Event ev) {
    for (org.bukkit.entity.Entity entity : ((org.bukkit.event.world.ChunkEvent) (ev)).getChunk().getEntities()) {
        callWithEntity(event, entity);
    }
}