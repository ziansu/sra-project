@java.lang.SuppressWarnings(value = "unchecked")
public void addSearchPath(java.lang.String filePath, int priority) {
    nodes.add(new com.ocdsoft.bacta.tre.SearchPath(filePath, priority));
    java.util.Collections.sort(((java.util.ArrayList) (nodes)));
}