public static void display(final android.content.Context mContext, java.lang.String url, final android.widget.ImageView img) {
    com.bumptech.glide.Glide.with(mContext).load(url).placeholder(com.xinyi.czbasedevtool.base.manager.ui_about.GlideMaster.placeHolderRes).error(com.xinyi.czbasedevtool.base.manager.ui_about.GlideMaster.errorHolderRes).dontAnimate().into(img);
}