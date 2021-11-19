public void addToWhitelist(java.lang.String user) {
    if ((milkAdminInstance) != null) {
        if ((milkAdminUpdateThreadC) == null) {
            milkAdminUpdateThreadC = new com.sectorgamer.sharkiller.milkAdmin.milkAdminUpdateThread(milkAdminInstance);
        }
        milkAdminUpdateThreadC.myAddDefaultPlayer(user);
    }
}