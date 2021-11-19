private void sort() {
    java.util.Collections.sort(arraySongs, Comparators.comparatorSongs);
    adapter.notifyDataSetChanged();
}