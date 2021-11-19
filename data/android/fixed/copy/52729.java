@butterknife.OnClick(value = R.id.sotn_inverted_castle_map_fab)
public void onInvertedCastleMapFabClicked() {
    mPresenter.setMenuShow(false);
    mPresenter.onInvertedCastleMapButtonPressed();
}