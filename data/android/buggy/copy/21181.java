protected java.lang.Void doInBackground(edu.berkeley.eecs.emission.cordova.serversync.Context... ctxt) {
    edu.berkeley.eecs.emission.cordova.serversync.ServerSyncAdapter ssa = new edu.berkeley.eecs.emission.cordova.serversync.ServerSyncAdapter(ctxt[0], true);
    cta.onPerformSync(mAccount, null, edu.berkeley.eecs.emission.cordova.serversync.ServerSyncPlugin.AUTHORITY, null, null);
    return null;
}