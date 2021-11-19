@org.junit.Test
public void testInvalidPieceValueLower() {
    try {
        stratego.logic.Piece newPiece = new stratego.logic.Piece((-0), 1);
    } catch (java.lang.Exception e) {
        org.junit.Assert.assertTrue((e instanceof stratego.logic.exceptions.InvalidPieceValue));
    }
}