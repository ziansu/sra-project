public static boolean getKeepLoginState() {
    return edu.chl.leep.model.LeepModel.getUserInfo().getBoolean("RadioButton", false);
}