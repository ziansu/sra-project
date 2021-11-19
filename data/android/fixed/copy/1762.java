@java.lang.Override
public void onClick(android.view.View v) {
    com.fly.firefly.AnalyticsApplication.sendEvent("Click", "btnUpdateProfile");
    android.util.Log.e("Clicked", "Ok");
    mValidator.validate();
    com.fly.firefly.utils.Utils.hideKeyboard(getActivity(), v);
}