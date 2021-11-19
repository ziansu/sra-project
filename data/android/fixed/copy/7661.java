@java.lang.Override
protected void actionPerformed(net.minecraft.client.gui.GuiButton button) throws java.io.IOException {
    if (button == (buttonJEI))
        com.phylogeny.extrabitmanipulation.api.jei.JustEnoughItemsPlugin.openCategory(ChiseledArmorInfoRecipeCategory.UID);
    else
        super.actionPerformed(button);
    
    helpMode = buttonHelp.selected;
    if (com.phylogeny.extrabitmanipulation.reference.JeiReferences.isJeiLoaded)
        buttonJEI.visible = helpMode;
    
}