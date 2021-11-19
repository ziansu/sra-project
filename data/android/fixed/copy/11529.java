public void interpolate(org.geepawhill.contentment.core.Context context, double fraction) {
    double newOpacity = (oldOpacity) + (fraction * ((opacity) - (oldOpacity)));
    actor.group().setOpacity(newOpacity);
}