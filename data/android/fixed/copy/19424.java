@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    search.setVisible(false);
    try {
        performRecommend();
    } catch (javax.swing.text.BadLocationException e1) {
    }
    recommend.setVisible(true);
    miniYelp.setVisible(true);
}