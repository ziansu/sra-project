@org.junit.Test
public void surrogateInStringLiteralsWork() {
    assertEquals(56770, "a\uddc2b".charAt(1));
}