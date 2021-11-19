private java.util.ArrayList<java.lang.Integer> createArrayList(int[] intArray) {
    java.util.ArrayList<java.lang.Integer> newArrayList = new java.util.ArrayList<java.lang.Integer>();
    for (int i : intArray) {
        newArrayList.add(i);
    }
    return newArrayList;
}