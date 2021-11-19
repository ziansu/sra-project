@java.lang.Override
public java.lang.String getIPv4() {
    java.lang.String[] aux = nic.getIPv4addr();
    return aux[0];
}