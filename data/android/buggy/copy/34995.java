@java.lang.Override
public int getItemViewType(int position) {
    switch (position) {
        case 0 :
            return com.aspsine.zhihu.daily.ui.adapter.NavigationDrawerAdapter.Type.TYPE_HEADER;
        case 1 :
            return com.aspsine.zhihu.daily.ui.adapter.NavigationDrawerAdapter.Type.TYPE_MAIN_ITEM;
        default :
            return com.aspsine.zhihu.daily.ui.adapter.NavigationDrawerAdapter.Type.TYPE_ITEM;
    }
}