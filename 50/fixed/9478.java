private void checkContent() {
    if (movieList.isEmpty()) {
        noContent.setVisibility(View.VISIBLE);
    }else {
        noContent.setVisibility(View.GONE);
    }
}