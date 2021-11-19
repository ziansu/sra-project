@java.lang.Override
public void close() throws java.io.IOException {
    if (null != (this.br)) {
        this.br.close();
    }
    if (null != (this.conn)) {
        this.conn.disconnect();
    }
}