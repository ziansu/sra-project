@java.lang.Override
public org.eclipse.smarthome.core.items.Item add(org.eclipse.smarthome.core.items.Item element) {
    if ((itemRegistry) != null) {
        return itemRegistry.add(element);
    }
    return element;
}