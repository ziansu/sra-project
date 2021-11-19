@java.lang.Override
public void onPerformSync(android.accounts.Account account, android.os.Bundle bundle, java.lang.String authority, android.content.ContentProviderClient provider, android.content.SyncResult syncResult) {
    org.bottiger.podcast.cloud.drive.DriveSyncer syncer = new org.bottiger.podcast.cloud.drive.DriveSyncer(mContext, provider, account);
    syncer.performSync();
}