@java.lang.Override
public void onItemClick(final android.view.View view, final int verticalIndex, final int position) {
    mc2.tvz.croatiago.activities.DetailActivity.startDetailsActivity(getActivity(), listModels.get(verticalIndex).objects, position);
}