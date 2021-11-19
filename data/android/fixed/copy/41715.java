public static <T extends net.minecraft.block.Block> T register(T block, java.lang.String name) {
    MysticalAgriculture.REGISTRY.register(block, name);
    return block;
}