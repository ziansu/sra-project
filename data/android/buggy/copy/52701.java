@java.lang.Override
public void run() {
    if ((client) == null) {
        throw new java.lang.NullPointerException();
    }
    setupControlChannel();
    createGenerators();
}