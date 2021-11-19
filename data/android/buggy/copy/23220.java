public static void applyRegistered(android.content.Context context, boolean isRegistered) {
    io.soramitsu.iroha.IrohaApplication.getSharedPreferences(context).edit().putBoolean(io.soramitsu.iroha.IrohaApplication.SHARED_PREF_REGISTERED_KEY, isRegistered).apply();
}