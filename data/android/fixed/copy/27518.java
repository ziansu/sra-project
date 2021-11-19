@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String text = javax.swing.JOptionPane.showInputDialog("Change Text", temp.getText());
    if (text != null)
        temp.setText(text);
    
    temp = null;
}