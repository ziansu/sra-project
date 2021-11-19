@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((layers.size()) > 1) {
        listModel.removeElement();
    }
    layerJList.repaint();
    canvasPanel.repaint();
}