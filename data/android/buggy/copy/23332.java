public void addTopics() {
    final int pos = (this.topics.size()) + 1;
    notifyItemRangeInserted(pos, topics.size());
}