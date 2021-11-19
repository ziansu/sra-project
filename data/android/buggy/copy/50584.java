public static boolean isBlacklisted(java.lang.String token) {
    br.com.allchemistry.spf.SPF.Distribution distribution = br.com.allchemistry.spf.SPF.CacheDistribution.get(token, false);
    if (distribution == null) {
        return false;
    }else {
        return distribution.isBlacklisted(false);
    }
}