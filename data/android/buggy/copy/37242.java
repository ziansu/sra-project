@java.lang.Override
public void close() {
    synchronized(this) {
        if ((client) != null) {
            client.close();
            this.close();
        }
    }
}