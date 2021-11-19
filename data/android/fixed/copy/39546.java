@java.lang.Override
public java.util.Set<java.lang.String> getRegisteredChannels(org.spongepowered.api.Platform.Type side) {
    if (side == (Platform.Type.SERVER)) {
        return com.google.common.collect.ImmutableSet.copyOf(this.channels.keySet());
    }else {
        return com.google.common.collect.ImmutableSet.of();
    }
}