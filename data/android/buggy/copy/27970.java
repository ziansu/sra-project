@java.lang.Override
public com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if ((mInflater) == null) {
        mInflater = android.view.LayoutInflater.from(mContext);
    }
    return com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder.create(mInflater, parent, mClickListener);
}