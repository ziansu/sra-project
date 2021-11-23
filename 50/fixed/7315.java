public java.util.ArrayList<com.ocwvar.darkpurple.Bean.SongItem> stopMuiltMode() {
    isMuiltSelecting = false;
    notifyDataSetChanged();
    return new java.util.ArrayList(checkedItems);
}