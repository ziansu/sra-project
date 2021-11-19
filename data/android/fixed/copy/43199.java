@java.lang.Override
public void setIcon(de.rincewind.api.gui.elements.util.Icon icon) {
    if (icon != null) {
        this.icon = icon.toItem();
    }else {
        this.icon = null;
    }
    this.getHandle().readItemsFrom(this);
}