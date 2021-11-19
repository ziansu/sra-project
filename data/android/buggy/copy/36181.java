@java.lang.Override
public boolean check(org.shaman.rpg.engine.menu.inventory.DialogState state) {
    org.shaman.rpg.engine.objects.items.Item.Category cat = state.getSelectedItem().getCategory();
    return set.contains(cat);
}