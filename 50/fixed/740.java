@java.lang.Override
public void stop() {
    if (((outputStream) != null) && ((outputStream) != (java.lang.System.out)))
        outputStream.close();
    
}