public static void write(kNode w) {
    kNode id = w.child;
    kNode output = w.child.next.next;
    Interpreter.expr(output);
    id.token.value = Interpreter.avalue;
    java.lang.System.out.println(id.token.value);
}