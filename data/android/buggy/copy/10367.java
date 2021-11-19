@java.lang.Override
public void put(double value) throws java.io.IOException {
    writer.append(java.lang.Double.toString(value));
    writer.append('\n');
}