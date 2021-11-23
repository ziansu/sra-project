public void print() {
    java.lang.System.out.println("PRINTING.");
    java.util.List<java.util.Map.Entry<java.lang.String, java.lang.Double>> entries = sort();
    for (java.util.Map.Entry<java.lang.String, java.lang.Double> entry : entries) {
        java.lang.System.out.println(entry);
    }
}