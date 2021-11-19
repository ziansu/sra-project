@java.lang.Override
public java.lang.Object visitNot(nez.lang.Nez.Not e, java.lang.Object a) {
    nez.lang.Expression exp = e.get(0);
    addElement(new nez.bx.FormatGenerator.NotElement());
    return null;
}