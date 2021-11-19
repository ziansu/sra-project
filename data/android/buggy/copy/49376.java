@java.lang.Override
public int getItemViewType(int position) {
    if ((mLuckResutList.get(position).get_id()) != null) {
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_NORMAL;
    }else {
        android.util.Log.i(com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TAG, "getItemViewType: type footer");
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_FOOTER;
    }
}