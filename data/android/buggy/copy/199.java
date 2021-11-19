public void removeLike(com.tattood.tattood.Tattoo t) {
    ((com.tattood.tattood.TattooRecyclerViewAdapter) (liked_view.getAdapter())).removeTattoo(t);
}