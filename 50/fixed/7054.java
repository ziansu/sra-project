@java.lang.Override
public java.io.InputStream getInputStream() {
    if (alreadyRead)
        return null;
    
    alreadyRead = true;
    return mockInput;
}