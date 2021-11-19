@org.junit.Before
public void prepare() throws java.lang.InterruptedException {
    if ((this.participantCt) != null) {
        this.participantCt.await(10000, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}