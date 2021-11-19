@java.lang.Override
public void onDestroyView() {
    android.util.Log.d("onDestroyView", category);
    butterknife.ButterKnife.unbind(this);
    super.onDestroyView();
}