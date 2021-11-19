@java.lang.Override
public void onBindViewHolder(menudroid.aybars.arslan.menudroid.main.RestaurantAdapter.ViewHolder viewHolder, int position) {
    viewHolder.txtViewTitle.setText(itemsData.get(position).getTitle());
    viewHolder.imgViewIcon.setImageResource(itemsData.get(position).getImageUrl());
}