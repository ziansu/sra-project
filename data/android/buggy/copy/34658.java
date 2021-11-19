public static void registerDataFixers() {
    choonster.testmod3.init.ModDataFixers.MOD_FIXES.registerFix(FixTypes.BLOCK_ENTITY, new choonster.testmod3.util.datafix.fixes.TileEntityId());
}