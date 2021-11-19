@java.lang.Override
public com.leaven.mianjiao.bean.BusinessGoodListItemBean getItem(int position) {
    return ((mGoodList) == null) || ((mGoodList.size()) <= position) ? null : mGoodList.get(position);
}