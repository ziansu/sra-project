@java.lang.Override
public double getMinimumHeight() {
    org.eclipse.elk.core.math.ElkPadding padding = getPadding();
    return ((minimumContentAreaSize.x) + (padding.top)) + (padding.bottom);
}