void handleLoadPref(org.wahtod.wififixer.prefs.PrefConstants.Pref p) {
    org.wahtod.wififixer.prefs.PrefUtil.setFlag(p, org.wahtod.wififixer.prefs.PrefUtil.readBoolean(org.wahtod.wififixer.prefs.PrefUtil.context.get(), p.key()));
}