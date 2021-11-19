@java.lang.Override
public int hashCode() {
    java.lang.String identication = ((java.lang.String) (networkDevice.getValue(NetworkDevice.IDENTICATION)));
    if (identication == null)
        return 0;
    
    return identication.hashCode();
}