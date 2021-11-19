@java.lang.Override
public void onDetach() {
    super.onDetach();
    if ((presenter) != null)
        presenter.onViewDetached();
    
    view = null;
}