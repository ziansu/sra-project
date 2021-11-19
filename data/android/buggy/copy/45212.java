@org.junit.Test
public void testGetSpriteFinal() throws java.io.IOException {
    java.awt.image.BufferedImage result = ((java.awt.image.BufferedImage) (javax.imageio.ImageIO.read(new java.io.File("img/Juggernog.gif"))));
    assertEquals(Juggernaut2.getSpriteFinal(), result);
}