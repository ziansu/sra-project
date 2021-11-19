@org.junit.After
public void close() {
    accesser.releaseSpace(java.lang.String.valueOf(shmId));
}