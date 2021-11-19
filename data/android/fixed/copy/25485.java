@java.lang.Override
public void onContentsChanged(int slot) {
    this.setHorseArmorStack(this.getStackInSlot(slot));
}