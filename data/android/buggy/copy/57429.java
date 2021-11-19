public void loadAllWires() {
    java.util.ArrayList<components.parts.Component> loadedComponents = components.infrastructure.ComponentRegistry.getInstance().getComponents();
    for (datastructures.ComponentConnections c : allConnections) {
        loadWire(c);
    }
}