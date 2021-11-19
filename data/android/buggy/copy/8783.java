private static void onAccountCreated(android.accounts.Account newAccount, android.content.Context context) {
    com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.configurePeriodicSync(context, com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.SYNC_INTERVAL, com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.SYNC_FLEXTIME);
    android.content.ContentResolver.setSyncAutomatically(newAccount, context.getString(R.string.content_authority), true);
    com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.syncImmediately(context);
}