public void removeAt(int position) {
    projectList.remove(position);
    notifyItemRemoved(position);
    notifyItemRangeChanged(position, projectList.size());
}