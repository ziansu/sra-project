@java.lang.Override
public void onBindViewHolder(com.madun.yeehaw.adapter.viewHolder.ComHolder holder, int position) {
    mLayoutId = getViewHolderLayoutId(position, mData);
    conver(holder, mData.get(position), mLayoutId);
}