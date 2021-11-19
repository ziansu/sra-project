@java.lang.Override
public void onClick(android.view.View v) {
    com.lnyp.recyclerview.RecyclerViewStateUtils.setFooterViewState(getActivity(), listJuzi, mHasMore, RecyclerViewLoadingFooter.State.Loading, null);
    qryMeijus();
}