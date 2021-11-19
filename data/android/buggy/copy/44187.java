@java.lang.Override
public void accept(final ru.spbau.mit.Connection connection) {
    java.lang.Thread t = new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            connection.send("Hello world");
            connection.close();
        }
    });
    t.start();
}