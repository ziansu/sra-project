public mytown.datasource.Resident getOrMakeResident(java.lang.String username) {
    com.mojang.authlib.GameProfile profile = net.minecraft.server.MinecraftServer.getServer().func_152358_ax().func_152655_a(username);
    return profile == null ? null : getOrMakeResident(profile.getId(), profile.getName());
}