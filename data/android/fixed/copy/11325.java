public void callTargetEvent(org.bukkit.event.entity.EntityTargetEvent event) {
    for (net.citizensnpcs.npctypes.CitizensNPC type : types.values()) {
        type.onTarget(event);
    }
}