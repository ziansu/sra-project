@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result != null) {
        com.example.ckinn.honoursproject.HomeScreenActivity.readingCard = false;
        WelcomeText.setText(("Read content: " + result));
    }else {
        com.example.ckinn.honoursproject.HomeScreenActivity.readingCard = false;
        WelcomeText.setText("Tag was empty, but still read");
    }
}