@java.lang.Override
public void facebookPostLinkReceived(java.lang.String postLink) {
    facebookPostLinkWithId = postLink;
    loserManager.activateFacebookCommentBtn();
}