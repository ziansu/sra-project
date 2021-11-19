@java.lang.Override
public void onBindViewHolder(com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder viewHolder, int position) {
    int binderPosition = getBinderPosition(position);
    getDataBinder(viewHolder.getItemViewType()).bindViewHolder(viewHolder, binderPosition);
}