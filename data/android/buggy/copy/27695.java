@java.lang.Override
public java.lang.String[] read() {
    return source.get(((readIndex)++)).getTokens();
}