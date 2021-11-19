public static void addRecipe(net.minecraft.item.ItemStack input, net.minecraft.item.ItemStack output, java.lang.Object[] ingredients, net.minecraft.util.math.Vec3d color) {
    alec_wam.CrystalMod.api.CrystalModAPI.registerFusion(new alec_wam.CrystalMod.tiles.fusion.FusionRecipe(input, scala.actors.threadpool.Arrays.asList(ingredients), output, color));
}