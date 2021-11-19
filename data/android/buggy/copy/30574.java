@java.lang.Override
public void onClick(android.view.View v) {
    if ((mOnItemClickListener) != null) {
        int position = holder.getAdapterPosition();
        mOnItemClickListener.onItemClick(v, mDataList.get(position), position);
    }
}