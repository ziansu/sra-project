@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    for (pcgen.facade.core.EquipmentFacade item : targets) {
        destination.addPurchasedEquipment(item, 1, false);
    }
}