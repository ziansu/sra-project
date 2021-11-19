public static twitter4j.Twitter getTwitterInstance(final android.content.Context context, final long accountId, final boolean includeEntities) {
    return org.mariotaku.twidere.util.Utils.getTwitterInstance(context, accountId, includeEntities, true, (!(org.mariotaku.twidere.util.MIUIUtils.isMIUI())));
}