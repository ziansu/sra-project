public void addItemSlot(net.minecraft.inventory.Slot slot) {
    this.addSlotToContainer(slot);
    if (slot instanceof cd4017be.lib.Gui.GlitchSaveSlot)
        specialInvSync |= 1;
    
}