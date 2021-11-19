@java.lang.Override
public int getItemCount() {
    return com.ngynstvn.android.blocspot.BlocspotApplication.getSharedDataSource().getCategoryList().size();
}