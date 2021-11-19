@java.lang.Override
public void consumersConnected(final org.osgi.service.wireadmin.Wire[] wires) {
    java.util.Objects.requireNonNull(wires, "Null Message");
    this.outputWires = wires;
    this.wireSupport.consumersConnected(wires);
}