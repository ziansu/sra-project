@java.lang.Override
public void onBindViewHolder(com.ngynstvn.android.blocspot.ui.adapter.CategoryAdapter.CategoryAdapterViewHolder holder, int position) {
    holder.updateViewHolder(com.ngynstvn.android.blocspot.BlocspotApplication.getSharedDataSource().getCategoryList().get(position));
}