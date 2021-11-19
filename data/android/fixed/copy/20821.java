@java.lang.Override
public void failed(java.lang.Throwable exc, java.nio.ByteBuffer attachment) {
    java.lang.System.out.println(exc);
    close();
}