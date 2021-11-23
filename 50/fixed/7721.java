public void addItem(java.lang.String key, hackerrepublic.sarkarsalahkar.models.Post post) {
    posts.add(0, post);
    keys.add(0, key);
    notifyDataSetChanged();
}