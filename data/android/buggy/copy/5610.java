@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    View.returnButton.setVisible(false);
    history.push(currentURL);
    analyzeAndBind(View.list.getSelectedValue());
}