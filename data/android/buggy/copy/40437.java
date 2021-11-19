@java.lang.Override
public com.google.gwt.user.client.ui.Widget asWidget() {
    if ((entity) != null) {
        view.setPresenter(this);
        return view.asWidget();
    }
    return null;
}