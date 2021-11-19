@java.lang.Override
public void run() {
    calculateGraphOrder();
    if ((annotations) != null) {
        mapper = new nl.tudelft.pl2016gr2.core.algorithms.GraphBaseMapper(graph);
        mapper.mapAnnotations(new java.util.LinkedList(annotations));
        annotations = null;
    }
}