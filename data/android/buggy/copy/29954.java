public void setFilter(java.util.List<com.bss.arrahmanlyrics.models.songModel> songlists) {
    songlist = new java.util.ArrayList<>();
    songlist.addAll(songlists);
    notifyDataSetChanged();
}