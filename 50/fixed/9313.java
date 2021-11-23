@org.junit.Test
public void hashCodeReturn0Test() {
    unitTests.State state = new unitTests.State();
    assertEquals(state.hashCode(), (-2056846209));
}