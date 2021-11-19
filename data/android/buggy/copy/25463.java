public boolean hasNext() {
    java.lang.System.out.println(("called primary hasNext() i: " + (i)));
    return (i) < ((secondaries.length) - 1);
}