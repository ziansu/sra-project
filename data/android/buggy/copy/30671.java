private int getParentVisibility() {
    android.view.View parentView = com.marvinlabs.widget.floatinglabel.FloatingLabelWidgetBase.getRootView().findViewById(((android.view.ViewGroup) (com.marvinlabs.widget.floatinglabel.FloatingLabelWidgetBase.getParent())).getId());
    return parentView != null ? parentView.getVisibility() : android.view.View.GONE;
}