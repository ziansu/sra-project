@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    profileGUI.setTextStyle(edu.asu.ser322.Session.getActiveUser().getUsername());
    client.showProfile();
}