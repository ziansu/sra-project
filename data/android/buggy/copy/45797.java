@java.lang.Override
public final java.net.URL findResource(java.lang.String name) {
    java.lang.System.out.println(("Plugin resource: " + name));
    return findResource(this, name);
}