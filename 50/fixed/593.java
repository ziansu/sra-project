@java.lang.Override
public java.lang.Object visitMultiByte(nez.lang.Nez.MultiByte e, java.lang.Object a) {
    If(_Not(_Match(e.byteSeq)));
    {
        Fail();
    }
    EndIf();
    return null;
}