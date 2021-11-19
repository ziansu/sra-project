@java.lang.Override
public void onBindViewHolder(com.example.alexm.kunzhutproject.RecyclerViewAdapter.MyViewHolder holder, int position) {
    com.example.alexm.kunzhutproject.InformationForRecyclerView current = data.get(position);
    holder.textView.setText(current.title);
}