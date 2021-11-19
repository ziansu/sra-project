@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(" ", "Insta clicked");
    android.content.Intent intent = new android.content.Intent(getActivity(), com.appspot.glancesocial.glance.InstaWebViewActivity.class);
    startActivity(intent);
}