@java.lang.Override
public void onClick(android.view.View view) {
    if (((onItemClickListener) != null) && ((io.simi.widget.RecyclerViewHolder.getAdapterPosition()) >= 0)) {
        onItemClickListener.onItemClick(binding, io.simi.widget.RecyclerViewHolder.getAdapterPosition());
    }
}