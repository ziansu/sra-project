@java.lang.Override
public void onSuccess(net.dean.jraw.models.CommentNode comment) {
    if (isViewAttached()) {
        view.showSavedToast();
        view.addComment(comment, (position + 1));
    }
}