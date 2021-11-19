@java.lang.Override
public void facebookPostLinkReceived(java.lang.String facebookPostLinkWithId) {
    this.facebookPostLinkWithId = facebookPostLinkWithId;
    loserManager.activateFacebookCommentBtn();
}