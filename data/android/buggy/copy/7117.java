@java.lang.Override
public int compare(android.hardware.Camera.Size o1, android.hardware.Camera.Size o2) {
    return ((o1.width) * (o1.height)) - ((o2.width) * (o2.height));
}