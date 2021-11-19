public void addToWhitelist(java.lang.String user) {
    if ((milkAdminUpdateThreadC) == null) {
        milkAdminUpdateThreadC = new com.sectorgamer.sharkiller.milkAdmin.milkAdminUpdateThread(milkAdminInstance);
    }
    this.milkAdminUpdateThreadC.myAddDefaultPlayer(user);
}