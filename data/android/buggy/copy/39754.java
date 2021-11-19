public net.datafans.android.common.widget.table.TableView<T> bulid() {
    return new net.datafans.android.common.widget.table.TableView(context, refreshType, enableRefresh, enableLoadMore, enableAutoLoadMore, style, dataSource, delegate);
}