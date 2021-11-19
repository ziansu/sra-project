@java.lang.Override
public void onSuccess(org.ednovo.gooru.shared.model.content.StarRatingsDo result) {
    getView().setUserStarRatings(result, showThankYouToolTip);
    if ((collectionPlayerPresenter) != null) {
        collectionPlayerPresenter.updateRatReacSessionActivityItem(starRatingValue, resourceGooruId, org.ednovo.gooru.client.mvp.play.resource.body.ResourcePlayerMetadataPresenter.RATING);
    }
}