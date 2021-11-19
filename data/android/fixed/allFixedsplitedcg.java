public void gotoDefaultHomeScreen(android.view.View view) {
    mTransitionManager.transitionTo(mDefaultScene);
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
}

@java.lang.Override
public void onTitleSlect(android.widget.TextView tv, int position) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((me.ccrama.redditslide.Activities.AlbumPager) (getActivity())).showBottomSheetImage(url, true, i);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) - 1));
}

@java.lang.Override
public void onClick(android.view.View v) {
    mSearchQuery = mSearchBox.getText().toString();
    java.lang.String searchScope = mStringSearchScope;
    mainFragmentListener.getSearchInfo(mSearchQuery, searchScope);
}

private static java.lang.String getGroupKey(final android.service.notification.StatusBarNotification sbn) {
    if (sbn instanceof com.oasisfeng.nevo.StatusBarNotificationCompat)
        return ((com.oasisfeng.nevo.StatusBarNotificationCompat) (sbn)).getBaseGroupKey();
    
    return sbn.getGroupKey();
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.FSL.mcuTracker.ListActivity.class);
    callOtherActivity(intent, query);
    return false;
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    myLoadingDialog = new android.app.ProgressDialog(this);
    myLoadingDialog.setMessage("Loading");
    myLoadingDialog.setIndeterminate(false);
    myLoadingDialog.setCancelable(false);
    myLoadingDialog.show();
}

public void drawPosts(android.app.Activity _activity) {
    adapter = new budgetworld.ru.bw.PostsAdapter(_activity, posts);
    android.widget.ListView listView = ((android.widget.ListView) (_activity.findViewById(R.id.lvItems)));
    listView.setAdapter(adapter);
}

public static java.lang.String recordActivity(java.lang.String message) {
    org.json.JSONObject jmessage = new org.json.JSONObject();
    de.xavaro.android.common.Json.put(jmessage, "message", message);
    return de.xavaro.android.common.ActivityManager.recordActivity(jmessage);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.e("SPEAK RECEIVER", "received message ******");
    speaker.speak(intent.getStringExtra("message_to_speak"));
}

public void onClick(android.view.View v) {
    java.lang.System.exit(0);
}

@java.lang.Override
public void onMatrixError(org.matrix.androidsdk.rest.model.MatrixError e) {
    org.matrix.androidsdk.util.Log.d(im.vector.activity.VectorMemberDetailsActivity.LOG_TAG, ("## mCreateDirectMessageCallBack: onMatrixError Msg=" + (e.getLocalizedMessage())));
    mRoomActionsListener.onMatrixError(e);
}

public void onCreate() {
    super.onCreate();
    Loop = Repeat.ALL;
    songposition = 0;
    mediaPlayer = new android.media.MediaPlayer();
    mp_init();
}

@javax.annotation.Nonnull
public static java.lang.String decrypt(@javax.annotation.Nonnull
java.lang.String message, @javax.annotation.Nonnull
java.lang.String salt) {
    java.lang.String result = ua.boberproduction.bbr.util.Encryption.xor(new java.lang.String(android.util.Base64.decode(message, 0)), salt);
    return result;
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    hideKeyBoard(v);
    return false;
}

@java.lang.Override
public void onFingerprintDialogStageUpdated(com.aitorvs.android.fingerlock.FingerprintDialog fingerprintDialog, com.aitorvs.android.fingerlock.FingerprintDialog.Stage stage) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    qrScan.initiateScan();
}

@java.lang.Override
public void onClick(android.view.View v) {
    htl_leonding.fiplyteam.fiply.trainingssession.FFeedback fFeedback = new htl_leonding.fiplyteam.fiply.trainingssession.FFeedback();
    fFeedback.setArguments(getArguments());
    fFeedback.setArguments(getArguments());
    displayFragment.displayTSFeedback(fFeedback, getFragmentManager());
}

@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    android.graphics.Bitmap thumbnail = com.comp.iitb.vialogue.library.Storage.getVideoThumbnail(new java.io.File(params[0]).getAbsolutePath());
    return thumbnail;
}

public void invalidateSelection() {
    count = 1;
    calendarDateManager.clearCalendarData();
    new android.os.Handler().post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            notifyDataSetChanged();
        }
    });
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    this.setListAdapter(new com.group.cs.wi_free.DeviceListFragment.WifiPeerListAdapter(getActivity(), R.layout.row_devices, peers));
}

private void callbackProgressInternal(float progress) {
    if ((mListener) != null) {
        mListener.onSeekProgress(progress);
    }
}

private void onTextChanged(java.lang.CharSequence newText) {
    if (!(android.text.TextUtils.isEmpty(searchEditText.getText()))) {
        displayClearButton(true);
    }else {
        displayClearButton(false);
    }
}

private void sendPlayBroadcastMessage() {
    updateNotificationAction(true);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(getStandardPlayerBroadcast(com.example.tonykazanjian.mp4player.PlayerService.PLAYER_START_MSG));
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (action.equals(BluetoothAdapter.ACTION_LOCAL_NAME_CHANGED)) {
        updateDeviceName(context);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.reset_button :
            board.setEnabled(false);
            board.resetBoard();
            break;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    ma.groupsCompiled.clear();
    ma.getInstituteList();
    ma.getInstituteList();
    showInstituteChooseDialog();
}

public istat.android.freedev.forms.FormFiller use(istat.android.freedev.forms.Form form) {
    this.form = form;
    return this;
}

@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    if (!result) {
        synchronized(fi.lbd.mobile.fragments.ObjectListFragment.LOCK) {
            android.util.Log.d("________", "Couldn't connect to locationclient. Releasing lock.");
            fi.lbd.mobile.fragments.ObjectListFragment.searchInProgress = false;
            statusText.setText(LOCATION_FAILED);
            lastStatusText = LOCATION_FAILED;
            lastStatusBackground = LOCATION_BACKGROUND;
        }
    }
}

@java.lang.Override
public void run() {
    getAllPPTFiles(android.os.Environment.getExternalStorageDirectory(), 0);
    mHandler.sendEmptyMessage(com.changhong.touying.activity.OtherDetailsActivity.PPTLIST_REFRESH);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_calendar);
    restClient = new com.app.ssumobile.ssumobile_android.service.RestClient();
    initializeListener();
}

@java.lang.Override
public void onPause() {
    super.onPause();
    savedInstance = new android.os.Bundle();
    onSaveInstanceState(savedInstance);
    handler.removeCallbacks(toggleInputMode);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    gcmToken = intent.getStringExtra(com.example.team11.MedicineActivity.GCMTOKEN);
    registerWithNotificationHubs();
}

@java.lang.Override
public void run() {
    handler.obtainMessage().sendToTarget();
}

private void sendNotification(android.support.v4.app.NotificationCompat.Builder notificationBuilder) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.notify(id, notificationBuilder.build());
}

@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    context.startService(new android.content.Intent(context, com.droid.manasshrestha.rxandroid.widget.UpdateWidget.class));
}

@android.webkit.JavascriptInterface
public void annotate(java.lang.String response) {
}

public void OnSetIndicatorView(@android.support.annotation.NonNull
android.widget.ImageView mIndicatorView, int position) {
    if (null != (mIndicatorBackgroundDrawable)) {
        mIndicatorView.setBackgroundDrawable(mIndicatorBackgroundDrawable);
    }
    if (null != (mIndicatorSrcDrawable)) {
        mIndicatorView.setImageDrawable(mIndicatorSrcDrawable);
    }
}

public java.lang.String getRoomName(final java.lang.String roomKey) {
    com.pajato.android.gamechat.chat.model.Room room = roomMap.get(roomKey);
    return room != null ? room.name : null;
}

public static void w(java.lang.Object... content) {
    dev.xesam.android.logtools.L.log(dev.xesam.android.logtools.L.TYPE_W, content);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.as.atlas.googlemapfollowwe.MapsActivity.TAG, ("buttonSend.setOnclick destination=" + (com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination)));
    if ((com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination) != null) {
        sendDestionationToServer(com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination);
    }
}

public void sendPackages(int frequency) {
    connectedThread.write(frequency);
    android.util.Log.e(com.example.make201512.bluetoothtester.BluetoothClassic.TAG, "sendPackages被执行");
}

@java.lang.Override
public void onClick(android.view.View v) {
    alertPebble();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.KITKAT)
@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... voids) {
    return sendSMS(receiverId, msg);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.sparshik.yogicapple.utils.CommonUtils.openWebsite(getActivity(), pack.getPackDevSiteUrl());
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    mActivityHelper.dismissDialog();
    com.firebase.ui.auth.util.SmartlockUtil.saveCredentialOrFinish(this, com.firebase.ui.auth.ui.email.RegisterEmailActivity.RC_SAVE_CREDENTIAL, null, mActivityHelper.getFlowParams(), firebaseUser, password, null);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.util.Log.i(edu.washington.ruokua.quizdroid.QuizDroidModel.TAG, "onRestart event fired.");
}

@java.lang.Override
public void onClick(android.content.DialogInterface anInterface, int i) {
    if ((loading.getVisibility()) == (android.view.View.VISIBLE))
        return ;
    
    new uiuc.mbr.ui.AddEventDialog.Worker(true).execute();
}

private void removeFromFavorites() {
    android.database.sqlite.SQLiteDatabase writeable = new dylan.com.adoptapet.FavoritesDBHelper(this).getWritableDatabase();
    writeable.delete(FavoritesDBHelper.table_name, "id = ?", new java.lang.String[]{ currentPet.getId() });
    writeable.close();
}

public void setProgressChangeListeners(java.util.concurrent.CopyOnWriteArrayList<com.mapbox.services.android.navigation.v5.listeners.ProgressChangeListener> progressChangeListeners) {
    progressChangeListeners.add(this);
    locationUpdatedThread.setProgressChangeListener(progressChangeListeners);
    this.progressChangeListeners = progressChangeListeners;
}

@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    if (activity instanceof com.example.alex.motoproject.screenMain.MainActivity) {
        mMainActivityVisible = false;
    }
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Wearable.API).build();
    mGoogleApiClient.connect();
}

@java.lang.Override
public void onTradeNotification(com.android.futures.entity.TradeEntity entity) {
    mTradeSequence.add(0, entity);
    android.os.Message msg = android.os.Message.obtain();
    msg.what = TraderStatusListener.TradeNotification;
    msg.obj = entity;
    mHandler.sendMessage(msg);
}

public void onSurfaceChanged(int w, int h) {
    synchronized(lock) {
        com.giderosmobile.android.player.GiderosApplication.nativeSurfaceChanged(w, h, com.giderosmobile.android.player.GiderosApplication.getRotation(w, h));
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    new edu.apsu.csci.teamaz.azpaint.DialogBoxColor(surface);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_tab_expenses_paid, container, false);
    initializaButterKnife(rootView);
    prepareAdapter();
    return rootView;
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivityForResult(android.content.Intent.createChooser(imageIntent, "Select photo"), 0);
}

@java.lang.Override
public void onDateChanged(android.widget.DatePicker view, int yearChange, int monthOfYear, int dayOfMonth) {
    age = (yearCurrent) - yearChange;
    ageTextView.setText(("" + (age)));
}

@java.lang.Override
public void onRefresh() {
    android.util.Log.d(name.parker.alon.viewerforgithub.view.InfoActivity.LOG_TAG, "PullToRefresh");
    swipeLayout.setRefreshing(false);
    loadData(true);
}

@java.lang.Override
public void onPageSelected(int position) {
    if ((mViewPager) != null) {
        if (position < 3) {
            android.util.Log.d(DEBUG_KEY, ("item id is " + position));
        }
    }
}

@java.lang.Override
public void onWriteError(java.lang.Throwable e) {
    android.util.Log.e(NFCDemoApplication.LOG_TAG, "Error occurred while writing NFC card", e);
}

private void setUpToolbar() {
    setSupportActionBar(((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar))));
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayHomeAsUpEnabled(false);
    actionBar.setTitle("Contacts");
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(StartAtraceActivity.ICON_SHOW)) {
        com.jrdcom.systrace.service.AtraceService.sIconShowing = mCommandUtil.getBooleanState(key, true);
        com.jrdcom.systrace.toolbox.CommandUtil.myLogger(com.jrdcom.systrace.service.AtraceService.TAG, ("onSharedPreferenceChanged: sIconShowing=" + (com.jrdcom.systrace.service.AtraceService.sIconShowing)));
    }
}

@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    mDateHeader = ((android.widget.TextView) (findViewById(R.id.date_header)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    mShareNotSave = false;
    startBackup();
}

@java.lang.Override
public void onClick(android.view.View v) {
    cancel(true);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.list_book_fragment, container, false);
    initUI();
    return view;
}

@java.lang.Override
public void onAutoFocus(boolean b, android.hardware.Camera camera) {
}

public static void applyForPermit(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.permits.AirMapAvailablePermit permit, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.permits.AirMapPilotPermit> callback) {
    if (permit != null) {
        com.airmap.airmapsdk.networking.services.PermitService.applyForPermit(permit, callback);
    }
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    isActive = true;
    try {
        mLocationAccess.stopUpdates();
        mLocationAccess = null;
    } catch (java.lang.NullPointerException e) {
    }
    mLocationAccess = new com.babykangaroo.android.mylocationlibrary.LocationAccess(this, this);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_game_list);
    viewModel = new ui.com.lightrpg.lightrpgui.game.GameListViewModel();
    setupDrawer();
    setupTopBar();
    setupGameList();
}

public static void applyToText(java.lang.CharSequence charSequence, android.graphics.Typeface typeface) {
    cat.ppicas.customtypeface.CustomTypefaceSpan.applyToText(charSequence, typeface, 0, charSequence.length());
}

public static void killCurrentProcess() {
    android.os.Process.killProcess(android.os.Process.myPid());
    java.lang.System.exit(10);
}

@java.lang.Override
public void onEndOfSpeech() {
}

@java.lang.Override
public com.parse.ParseQuery create() {
    com.parse.ParseQuery query = new com.parse.ParseQuery("Task");
    query.whereEqualTo("user", currentUser);
    query.addDescendingOrder("createdAt");
    return query;
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName componentName) {
    timber.log.Timber.d("Disconnected from service.");
    navigationService = null;
}

public long getTimeSpent() {
    return sharedPreferences.getLong(context.getString(R.string.time), 0);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.about_us, menu);
    return true;
}

@java.lang.Override
public void error(java.lang.Throwable e) {
    finish();
    rx.Subscriber<? super io.relayr.java.model.User> subscriber = io.relayr.android.RelayrSdk.getLoginSubscriber();
    if (subscriber != null)
        subscriber.onError(e);
    
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setListAdapter(new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, com.firefly.shoppomem.HistoryActivity.getHistoryList()));
}

public static void setAppContext(android.content.Context appContext) {
    if (appContext != null)
        szu.bdi.hybrid.core.HybridTools._appContext = appContext;
    
}

@java.lang.Override
public void onScanning(java.lang.String paramString, int progress) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    switchCoolFeed(true, true);
}

public static boolean showAdvancedPreferences(android.content.Context context) {
    return (android.provider.Settings.Secure.getInt(context.getContentResolver(), android.provider.Settings.Secure.ADVANCED_MODE, 1)) == 1;
}

public void toAlarm(android.view.View view) {
}

private android.content.res.ThemeConfig getThemeConfig() {
    final android.content.res.Configuration config = getConfiguration();
    return config != null ? config.themeConfig : null;
}

public static long normalizeDate(long startDate) {
    return startDate;
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) < (mMaxPage)) {
        (mCurrentPage)++;
        showOrLoadPage();
    }
    dialog.dismiss();
}

@java.lang.Override
public void onBackPressed() {
    android.util.Log.d("TKT_create", "onBackPressed");
    if (!(state.isEmpty()))
        saveChanges(0);
    else
        super.onBackPressed();
    
}

@java.lang.Override
public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    handleSignInResult(googleSignInResult);
}

int MNC() {
    java.lang.String networkOperator = ((android.telephony.TelephonyManager) (c.getSystemService(Context.TELEPHONY_SERVICE))).getNetworkOperator();
    return !(android.text.TextUtils.isEmpty(networkOperator)) ? java.lang.Integer.parseInt(networkOperator.substring(3)) : 0;
}

public static void reapplyForcedLocale(android.content.Context context, android.app.Activity activityContext) {
    br.com.carlosrafaelgn.fplay.ui.UI.setForcedLocale(context, activityContext, br.com.carlosrafaelgn.fplay.ui.UI.forcedLocale, false);
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    setView(intent);
}

public static java.lang.String getBioSettingFromUri(android.net.Uri uri) {
    return uri.getPathSegments().get(1);
}

public void updateView(java.util.ArrayList data) {
    this.data = data;
}

