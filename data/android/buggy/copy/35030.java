@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    presenter.setLoading(false);
    presenter.setErrorMessage(caught.getMessage());
}