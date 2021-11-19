@org.junit.Test
public void mismatch() {
    java.lang.System.out.println("SomeDemo");
    org.mockito.BDDMockito.given(mock.simpleMethod(2)).willReturn("");
    mock.simpleMethod(3);
}