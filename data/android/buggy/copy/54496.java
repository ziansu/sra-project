@java.lang.Override
public void visit(org.se.lab.Directory dir) {
    for (org.se.lab.Node n : dir.getNodes()) {
        visit(n);
    }
}