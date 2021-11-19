private void onRequestMaximumRecipeOutput(elec332.craftingtableiv.blocks.slot.SlotCrafter slot) {
    elec332.craftingtableiv.handler.WrappedRecipe recipe = slot.getIRecipe();
    if (recipe == null)
        return ;
    
    elec332.craftingtableiv.blocks.container.GuiCTableIV.onRequestMaximumRecipeOutput(thePlayer, recipe, theTile);
}