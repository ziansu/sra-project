@java.lang.Override
public void onBindViewHolder(com.example.johannes.colorpicker.RVAdapter.TaskViewHolder taskViewHolder, int position) {
    taskViewHolder.headline.setText(tasks.get(position).getOtsikko());
    taskViewHolder.cv.setCardBackgroundColor(android.graphics.Color.parseColor(tasks.get(position).getOtsikko()));
}