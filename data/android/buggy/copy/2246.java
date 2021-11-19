@java.lang.Override
public void onFail(int failCode) {
    com.bumptech.glide.Glide.with(getActivity().getApplicationContext()).load(getResources().getDrawable(R.drawable.beans)).into(popupImageView);
    completionHandler.onComplete();
}