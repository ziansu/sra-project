@java.lang.Override
public me.iwf.photopicker.adapter.PhotoAdapter.PhotoViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    me.iwf.photopicker.adapter.PhotoAdapter.PhotoViewHolder viewHolder = PhotoPickUtils.holderGenerator.newGridViewHolder2(mContext);
    parent.addView(viewHolder.itemView);
    return viewHolder;
}