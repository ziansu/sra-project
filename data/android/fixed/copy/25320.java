@javax.annotation.Nullable
public mezz.jei.render.GuiIngredientFast getHovered(int mouseX, int mouseY) {
    for (mezz.jei.render.GuiIngredientFast guiItemStack : renderAll) {
        if (guiItemStack.isMouseOver(mouseX, mouseY)) {
            return guiItemStack;
        }
    }
    return null;
}