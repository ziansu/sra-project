public void interpolate(org.geepawhill.contentment.core.Context context, double fraction) {
    double newOpacity = fraction * ((oldOpacity) + ((opacity) - (oldOpacity)));
    actor.group().setOpacity(newOpacity);
}