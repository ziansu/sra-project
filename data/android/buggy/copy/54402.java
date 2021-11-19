@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    listModel.addElement();
    layerJList.repaint();
    canvasPanel.repaint();
}