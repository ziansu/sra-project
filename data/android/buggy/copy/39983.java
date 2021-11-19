@org.junit.Before
public void setUp() {
    byte[] emptyArray = new byte[]{  };
    org.mockito.Mockito.when(importFile.isEmpty()).thenReturn(false);
}