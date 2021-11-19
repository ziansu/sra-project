private double y_body(final double x_body) {
    final net.sf.openrocket.rocketcomponent.SymmetricComponent sym = ((net.sf.openrocket.rocketcomponent.Transition) (getParent()));
    return (sym.getRadius(x_body)) - (sym.getForeRadius());
}