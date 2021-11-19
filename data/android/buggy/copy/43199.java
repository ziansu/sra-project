@java.lang.Override
public void setIcon(de.rincewind.api.gui.elements.util.Icon icon) {
    org.apache.commons.lang.Validate.notNull(icon, "The icon cannot be null!");
    this.icon = icon.toItem();
    this.getHandle().readItemsFrom(this);
}