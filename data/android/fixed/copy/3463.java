protected static void replaceLastElement(java.util.LinkedList<java.lang.Double> list, double price) {
    if (!(list.isEmpty())) {
        list.set(((list.size()) - 1), price);
    }
}