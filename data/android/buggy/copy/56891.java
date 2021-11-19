@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    mModel.setUser(mUserField.getText());
    mModel.setPass(java.lang.String.valueOf(mPassField.getPassword()));
    mModel.setFlag(true);
    dispose();
}