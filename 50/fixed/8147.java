@java.lang.Override
public void setDisabledIcon(de.rincewind.api.gui.elements.util.Icon icon) {
    if (icon != null) {
        this.disabledIcon = icon.toItem();
    }else {
        this.icon = null;
    }
    this.getHandle().readItemsFrom(this);
}