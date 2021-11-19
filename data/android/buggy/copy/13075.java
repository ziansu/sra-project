@java.lang.Override
public void create() {
    for (org.kevoree.library.java.wrapper.port.RequiredPortImpl p : this.getRequiredPorts().values()) {
        java.lang.System.out.println(p.getPath());
    }
}