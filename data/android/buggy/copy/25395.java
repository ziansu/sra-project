@java.lang.Override
protected double impl_prefHeight(double width) {
    if (isAutoSizeChildren())
        layout();
    
    return super.impl_prefWidth(width);
}