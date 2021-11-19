@java.lang.Override
public java.lang.String toString() {
    java.lang.String name = ((java.lang.String) (networkInterface.getValue(NetworkInterface.NAME)));
    return ((device.toString()) + ": ") + name;
}