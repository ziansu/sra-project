@java.lang.Override
protected void onLoad() {
    super.onLoad();
    applyType(typeMixin.getType().getCssName(), getElement());
}