public boolean isStackValidForSlot(int slot, com.forgeessentials.jscripting.wrapper.mc.item.JsItemStack stack) {
    return that.isItemValidForSlot(slot, (stack == null ? null : stack.getThat()));
}