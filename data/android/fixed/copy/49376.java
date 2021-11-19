@java.lang.Override
public int getItemViewType(int position) {
    if ((mLuckResutList.get(position).get_id()) != null) {
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_NORMAL;
    }else {
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_FOOTER;
    }
}