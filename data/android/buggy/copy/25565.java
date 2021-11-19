@java.lang.Override
public void paint(java.awt.Graphics g) {
    if ((scenes) == null)
        g.drawImage(image_base, 50, 50, null);
    else
        g.drawImage(image_animated, 50, 50, null);
    
}