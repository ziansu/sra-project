public void removeInvitation(java.lang.String group) {
    this.invitations.remove(group);
    new com.ethangraf.blast.ui.MainActivity.Save().execute(this);
}