@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    aq.id(ivScreen).image(com.florianmski.tracktoid.Utils.borderBitmap(bm, getActivity())).animate(android.R.anim.fade_in);
}