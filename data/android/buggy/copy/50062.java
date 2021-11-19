@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    c.SendPublicChat(ChatField.getText());
    ChatField.setText("");
}