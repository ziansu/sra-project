@java.lang.Override
public void onDestroyView() {
    android.util.Log.i("onDestroyView", category);
    butterknife.ButterKnife.unbind(this);
    super.onDestroyView();
}