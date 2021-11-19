protected int getChoppingRange() {
    return 4 * (((getModifierForCategory(IUpgradeItem.ENUM_UPGRADE_CATEGORY.MEMORY)) * 4) / 16);
}