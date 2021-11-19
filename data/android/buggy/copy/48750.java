public boolean isExpired() {
    return ((time.getTime()) + (net.sourceforge.subsonic.domain.PlayStatus.TTL_MILLIS)) > (java.lang.System.currentTimeMillis());
}