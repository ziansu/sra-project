@java.lang.Override
public java.lang.Object visitRepeat(nez.lang.Nez.Repeat e, java.lang.Object a) {
    While(ParserFunc("decCount"));
    {
        visit(e.get(0), a);
    }
    EndWhile();
    return null;
}