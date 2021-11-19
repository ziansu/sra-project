@org.junit.Test
public void surrogateInStringLiteralsWork() {
    org.junit.Assert.assertEquals(56770, "a\uddc2b".charAt(1));
}