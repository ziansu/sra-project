@java.lang.Override
public java.lang.Object parse(com.ll.JParsec.lib.State state) {
    char data = 0;
    try {
        data = state.next();
    } catch (java.lang.RuntimeException e) {
    }
    throw new java.lang.RuntimeException(("expect eof but" + data));
}