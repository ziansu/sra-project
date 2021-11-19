@org.junit.Test
public void testDecodificaMessaggio() {
    java.lang.System.out.println("decodificaMessaggio");
    java.lang.String msg = cript.codificaMessaggio("#La su io & te 4ever!");
    java.lang.String expResult = "#La su io & te 4ever!";
    java.lang.String result = cript.decodificaMessaggio(msg);
    assertEquals(expResult, result);
}