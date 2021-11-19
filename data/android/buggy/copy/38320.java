public void renderBlock(int x, int y, client.view.utils.BlocksImages blocksImage) {
    java.lang.System.out.println(((("DISEGNO BLOCCO  " + x) + "   ") + y));
    insertImage(x, y, getImageIcon(blocksImage.getImage()));
}