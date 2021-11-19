public void onUserClicked(dk.jbfp.staveapp.User user) {
    java.lang.String[] words = new java.lang.String[]{ "da" , "bo" , "by" };
    this.view.navigateToStepsActivity(user, words);
}