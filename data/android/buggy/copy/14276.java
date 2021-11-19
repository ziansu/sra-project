public int energy_getEnergyStored() {
    return cr0s.warpdrive.Commons.clamp(0, energy_getMaxStorage(), energyStored_internal);
}