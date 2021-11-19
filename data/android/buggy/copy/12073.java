@java.lang.Override
public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    this.drawDefaultBackground();
    this.customException.drawScreen(this, fontRenderer, mouseX, mouseY, partialTicks);
}