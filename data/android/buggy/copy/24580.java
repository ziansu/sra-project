private org.eclipse.draw2d.geometry.Point getConvertedLocation(final org.eclipse.gef.requests.CreateRequest request) {
    return getConvertedLocation(request.getLocation().getCopy(), getHost());
}