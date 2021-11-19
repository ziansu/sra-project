@java.lang.Override
public java.util.LinkedList<java.lang.String> eval(java.util.LinkedList<java.lang.String> output) {
    return stmt2.eval(stmt1.eval(output));
}