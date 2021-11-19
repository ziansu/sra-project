@java.lang.Override
public java.util.List<java.lang.Integer> getSortedPhases() {
    java.util.List<java.lang.Integer> result = new java.util.LinkedList<java.lang.Integer>(phases);
    if (result.isEmpty()) {
        result.add(1);
    }
    return result;
}