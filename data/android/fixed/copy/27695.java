@java.lang.Override
public java.lang.String[] read() {
    if ((readIndex) < (source.size()))
        return source.get(((readIndex)++)).getTokens();
    else
        return null;
    
}