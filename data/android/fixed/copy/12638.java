private double getLowestPrice(java.util.List<java.lang.Double> list) {
    java.util.List<java.lang.Double> temp = new java.util.ArrayList<>(list);
    java.util.Collections.sort(temp);
    return temp.get(0);
}