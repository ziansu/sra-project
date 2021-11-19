@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("tag", ("onClick: user name " + (userName.getText())));
    getFlow().set(new com.example.testapp.feed.FeedScreen(userName.getText().toString()));
}