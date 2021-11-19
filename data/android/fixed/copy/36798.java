@java.lang.Override
public void onNext(com.ultraman.viewmodel.Contributor topContributor) {
    com.ultraman.presenter.ContributorView view = getView();
    view.onLoadContributorComplete(topContributor);
}