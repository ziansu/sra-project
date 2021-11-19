@org.junit.Test
public void testGetTipoo() {
    entities.Cashier transacao = new entities.Cashier("Teste 1", "Teste 2", 50, "Teste 3", "Teste 4", "Teste 5", "Teste 6", 0, 100, "10/10/2020", "transacaoTeste", 1);
    assertEquals(transacao.getType(), 0);
}