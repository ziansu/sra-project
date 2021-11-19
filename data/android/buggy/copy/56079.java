@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("event", "click");
    feedbackManager.giveLikeToFeedback(getItem(pos));
}