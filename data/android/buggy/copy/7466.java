@org.junit.Test
public final void testGUI() {
    try {
        new source.GUI();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}