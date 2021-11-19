private void setTitle() {
    if ((currentStory) != null) {
        java.lang.String title = "#" + (currentStory.storyNum);
        ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(title);
    }
}