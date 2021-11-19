@org.junit.After
public void tearDown() {
    if ((this.context) != null) {
        this.context.close();
    }
}