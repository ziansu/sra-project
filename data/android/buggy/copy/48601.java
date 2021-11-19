@java.lang.Override
public void run() {
    getActivity().runOnUiThread(() -> mPresenter.loadTranslation());
}