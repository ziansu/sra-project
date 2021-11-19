@butterknife.OnClick(value = R.id.sotn_inverted_castle_map_fab)
public void onInvertedCastleMapFabClicked() {
    mPresenter.getInteractor().playSound(R.raw.sotn_menu_entry, this);
    mPresenter.setMenuShow(false);
    mPresenter.onInvertedCastleMapButtonPressed();
}