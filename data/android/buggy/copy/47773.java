private static void updateCardBackgroundColor(android.support.v17.leanback.widget.ImageCardView view, boolean selected) {
    int color = (selected) ? org.mythtv.android.presentation.presenter.tv.CardPresenter.sSelectedBackgroundColor : org.mythtv.android.presentation.presenter.tv.CardPresenter.sDefaultBackgroundColor;
    view.setBackgroundColor(color);
    view.findViewById(R.id.info_field).setBackgroundColor(color);
}