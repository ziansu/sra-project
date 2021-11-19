public void postInit() {
    drillSkin = new me.nentify.drillify.armourers.skin.DrillSkin();
    skinTypeRegistry.registerSkin(drillSkin);
    drillSkinIron = loadSkin("Drill Iron.armour");
    drillSkinDiamond = loadSkin("Drill Diamond.armour");
    drillSkinObsidian = loadSkin("Drill Obsidian.armour");
}