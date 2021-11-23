public boolean areEqual(java.lang.Object o1, java.lang.Object o2) {
    return (o1.getClass().equals(o2.getClass())) && ((compare(o1, o2)) == 0);
}