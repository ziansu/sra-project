@java.lang.Override
public void visit(interpreter.Abstraction a) {
    visit(a.exp());
    if ((passUp) != null) {
        a.setExp(passUp);
        passUp = null;
    }
}