public void printAll() {
    simplify();
    java.lang.System.out.println("--");
    for (Quad q : Quad.getAll()) {
        java.lang.System.out.println(q.fullExpr());
    }
}