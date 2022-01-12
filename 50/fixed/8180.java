private void clearSearchAfterNewArtistSelection() {
    imm.hideSoftInputFromWindow(edtextinput.getWindowToken(), 0);
    edtextinput.removeTextChangedListener(fo);
    searchlist.cleanAdpater();
}