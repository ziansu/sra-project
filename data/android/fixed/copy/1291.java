@java.lang.Override
public java.util.List<lcmc.utilities.UpdatableItem> getPulldownMenu() {
    final java.util.List<lcmc.utilities.UpdatableItem> items = super.getPulldownMenu();
    addVncViewersToTheMenu(items);
    return items;
}