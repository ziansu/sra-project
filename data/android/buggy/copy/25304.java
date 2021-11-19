@java.lang.Override
public com.leaven.mianjiao.bean.GoodsListItemBean getItem(int position) {
    return isEmptyList() ? null : goodsItemList.get(position);
}