@org.junit.Test
public void testProcessPressOnNonSelectedPiece() {
    org.junit.Assert.assertFalse(observer.nonSelectButtonPressed);
    piece.setSelected(false);
    piece.actionPerformed(null);
    org.junit.Assert.assertFalse(observer.nonSelectButtonPressed);
}