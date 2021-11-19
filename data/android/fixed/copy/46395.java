@android.support.annotation.Nullable
private gcum.gcumfisher.Spot getAddress() {
    return (forcedAddress) != null ? forcedAddress : (gpsAddress) != null ? gpsAddress.get(0) : null;
}