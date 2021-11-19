@java.lang.Override
public java.lang.Object visitRepeat(nez.lang.Nez.Repeat e, java.lang.Object a) {
    While(_op(ParserFunc("decCount"), _noteq(), "0"));
    {
        visit(e, a);
    }
    EndWhile();
    return null;
}