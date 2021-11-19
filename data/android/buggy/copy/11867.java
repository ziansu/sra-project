private void getUserID() {
    localUserID = java.lang.Integer.parseInt(sharedPref.getString("example_list", ""));
}