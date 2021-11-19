public static net.straylightlabs.tivolibre.PesHeader createFrom(java.nio.ByteBuffer buffer, net.straylightlabs.tivolibre.PesHeader.StartCode code, int priorTrailingZeroBits) {
    return new net.straylightlabs.tivolibre.PesHeader(buffer, code, priorTrailingZeroBits);
}