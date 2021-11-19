public void visit(Print e) {
    e.getRhs().accept(this);
    java.lang.System.out.println(("\nPrinting : " + (val)));
    val = 0;
}