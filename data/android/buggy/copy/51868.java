private static java.lang.String getUniqueName(net.minecraft.world.World world) {
    java.lang.String name = net.torocraft.nemesissystem.util.NameBuilder.build();
    if ((net.torocraft.nemesissystem.registry.NemesisRegistryProvider.get(world).getByName(name)) == null) {
        return name;
    }
    return net.torocraft.nemesissystem.util.NemesisBuilder.getUniqueName(world);
}