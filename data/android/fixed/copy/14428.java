@org.junit.Test
public void shouldPutAnObjectToStorage() {
    storage.put(0, "0");
    assertThat(storage.size(), org.hamcrest.core.Is.is(1));
}