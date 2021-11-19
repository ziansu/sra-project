@java.lang.Override
protected void addBindingConfig(org.openhab.core.items.Item item, org.openhab.core.binding.BindingConfig config) {
    items.put(item.getName(), item);
    super.addBindingConfig(item, config);
}