@java.lang.Override
public void send(java.lang.String data) throws java.io.IOException {
    if (data == null) {
        return ;
    }
    mOutputStream.write(data.getBytes("UTF-8"));
    mOutputStream.flush();
}