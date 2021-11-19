@java.lang.Override
public void onSuccess(org.ednovo.gooru.shared.model.content.StarRatingsDo result) {
    collectionPlayerPresenter.updateRatReacSessionActivityItem(starRatingValue, resourceGooruId, org.ednovo.gooru.client.mvp.play.resource.body.ResourcePlayerMetadataPresenter.RATING);
    getView().setUserStarRatings(result, showThankYouToolTip);
}