@java.lang.Override
public com.softdesign.devintensive.ui.adapters.UsersAdapter.UserViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View converView = android.view.LayoutInflater.from(mContext).inflate(R.layout.item_user_list, parent, false);
    return new com.softdesign.devintensive.ui.adapters.UsersAdapter.UserViewHolder(converView, mListener);
}