@java.lang.Override
public java.lang.String getDisplayName() {
    java.lang.String name = getUserName();
    if ((name != null) && ((name.length()) > 0)) {
        return name;
    }else {
        return getSystemName();
    }
}