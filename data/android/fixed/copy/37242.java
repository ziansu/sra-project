@java.lang.Override
public void close() {
    synchronized(this) {
        if ((client) != null) {
            this.client.close();
        }
    }
}