@java.lang.Override
public void onEquipletCommandStatusChanged(HAL.EquipletCommandStatus status) {
    this.forwardTarget.onEquipletCommandStatusChanged(status);
    this.forwardTarget = null;
}