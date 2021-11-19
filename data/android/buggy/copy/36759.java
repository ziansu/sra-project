@java.lang.Override
public void onDestroyView() {
    android.util.Log.i(null, "MainFragment destroyed");
    super.onDestroyView();
    butterknife.ButterKnife.unbind(this);
}