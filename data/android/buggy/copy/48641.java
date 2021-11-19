@java.lang.Override
public boolean accept(java.io.File dir, java.lang.String name) {
    java.lang.System.out.println(name);
    if (name.endsWith(".macro")) {
        return true;
    }
    return false;
}