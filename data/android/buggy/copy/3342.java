@java.lang.Override
public boolean accept(java.io.File dir, java.lang.String name) {
    if (name.endsWith(".jpg")) {
        java.lang.System.out.println(("added: " + name));
        return true;
    }
    return false;
}