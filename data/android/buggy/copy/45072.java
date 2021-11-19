public static boolean applyIptablesRules(android.content.Context ctx, boolean showErrors) {
    if (ctx == null) {
        return false;
    }
    dev.ukanth.ufirewall.Api.initSpecial();
    dev.ukanth.ufirewall.Api.saveRules(ctx);
    return dev.ukanth.ufirewall.Api.applySavedIptablesRules(ctx, showErrors);
}