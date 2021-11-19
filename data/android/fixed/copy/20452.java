@org.junit.Test
public void testTint_withBelowZeroTintFactor() {
    final java.awt.Color color = new java.awt.Color(0, 0, 0);
    final java.awt.Color tintedColor = com.valkryst.VTerminal.misc.ColorFunctions.tint(color, (-1));
    org.junit.Assert.assertEquals(java.awt.Color.WHITE, tintedColor);
}