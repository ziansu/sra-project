public boolean allowsAds() {
    if (!(isInherited("AllowAds")))
        return ((java.lang.Boolean) (Setting.CHAN_ALLOWADS.get(this)));
    
    return getGuildExt().allowsAds();
}