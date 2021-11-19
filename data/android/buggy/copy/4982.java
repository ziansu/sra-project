public int getHeight() {
    return ((int) ((titleTextView.getText().length()) == 0 ? itemView.getResources().getDimension(R.dimen.section_height_small) : getOriginalHeight()));
}