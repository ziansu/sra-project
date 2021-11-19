public void addItem(java.lang.String key, hackerrepublic.sarkarsalahkar.models.Post post) {
    posts.add(post);
    keys.add(key);
    notifyDataSetChanged();
}