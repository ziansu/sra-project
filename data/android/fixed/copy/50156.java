@java.lang.Override
public void onBindViewHolder(com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder viewHolder, int position) {
    getDataBinder(viewHolder.getItemViewType()).bindViewHolder(viewHolder, position);
}