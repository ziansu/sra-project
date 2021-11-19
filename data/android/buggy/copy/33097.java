@java.lang.Override
public java.util.LinkedList<java.lang.String> eval(java.util.LinkedList<java.lang.String> output) {
    stmt1.eval(output);
    stmt2.eval(output);
    return output;
}