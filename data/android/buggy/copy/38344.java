private boolean getPistas() {
    searchPresenter.getLojas(null, null, null);
    spinner.setVisibility(View.VISIBLE);
    return true;
}