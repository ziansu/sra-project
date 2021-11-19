@java.lang.Override
public boolean isChildSelectable(int i, int i2) {
    com.jcw.ListViewMenu.MenuListItem item = items.get(i);
    if (item instanceof com.jcw.ListViewMenu.MenuListFolder) {
        return ((com.jcw.ListViewMenu.MenuListFolder) (item)).isOpen;
    }
    return false;
}