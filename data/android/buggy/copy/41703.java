@java.lang.Override
public void preInit() {
    final binnie.core.machines.MachineGroup machineGroup = new binnie.core.machines.MachineGroup(binnie.extratrees.ExtraTrees.instance, "kitchen", "kitchen", binnie.extratrees.kitchen.KitchenMachine.values());
    machineGroup.setCreativeTab(Tabs.tabArboriculture);
    machineGroup.customRenderer = false;
    blockKitchen = machineGroup.getBlock();
}