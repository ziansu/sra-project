@org.junit.Test
public void test() {
    model.impl.ChessBoardModelImpl cbm = new model.impl.ChessBoardModelImpl();
    assertTrue(cbm.initialize(9, 9, 10, 3));
    cbm.blockPrint();
}