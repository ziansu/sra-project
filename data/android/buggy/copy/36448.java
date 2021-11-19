@java.lang.Override
public java.lang.Character parse(com.ll.JParsec.lib.State state) {
    char data = state.next();
    if (data == chr) {
        return data;
    }
    throw new java.lang.RuntimeException(((("expect a value not equal" + chr) + " but get") + data));
}