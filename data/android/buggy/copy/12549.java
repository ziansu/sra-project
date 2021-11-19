@java.lang.Override
@Optional.Method(modid = com.minecolonies.api.compatibility.tinkers.SlimeTreeCheck.TCONSTRUCT)
public boolean checkForTinkersSlimeDirtOrGrass(@org.jetbrains.annotations.NotNull
final net.minecraft.block.Block block) {
    return (block == (slimeknights.tconstruct.world.TinkerWorld.slimeDirt)) || (block == (slimeknights.tconstruct.world.TinkerWorld.slimeGrass));
}