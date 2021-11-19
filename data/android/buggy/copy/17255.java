private static <T extends net.glowstone.entity.GlowEntity> void bind(net.glowstone.io.entity.EntityStore<T> store) {
    net.glowstone.io.entity.EntityStorage.idTable.put(store.getEntityType().getName(), store);
    net.glowstone.io.entity.EntityStorage.classTable.put(store.getType(), store);
}