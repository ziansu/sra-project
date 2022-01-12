public void gotoDefaultHomeScreen(android.view.View view) {
    mTransitionManager.transitionTo(mDefaultScene);
    setFabOutline();
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    mapFragment.findMyLocation(googleClient);
    com.doo.study.dytransit.view.adapter.PlaceAutocompleteAdapter adapter = new com.doo.study.dytransit.view.adapter.PlaceAutocompleteAdapter(this, R.layout.auto_view_row);
    adapter.setGoogleApiClient(googleClient);
    searchView.setAdapter(adapter);
}

@java.lang.Override
public void onTitleSlect(android.widget.TextView tv, int position) {
    final com.mdground.hdenergy.models.Bulletin item = mDatas.get(position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((me.ccrama.redditslide.Activities.AlbumPager) (getActivity())).showBottomSheetImage(url, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) - 1));
    android.util.Log.i("SK-DEBUG", "Left Button is Clicked");
}

@java.lang.Override
public void onClick(android.view.View v) {
    printAllUrls();
    mSearchQuery = mSearchBox.getText().toString();
    java.lang.String searchScope = mStringSearchScope;
    mainFragmentListener.getSearchInfo(mSearchQuery, searchScope);
}

public static java.lang.String getGroupKey(final android.service.notification.StatusBarNotification sbn) {
    if (sbn instanceof com.oasisfeng.nevo.StatusBarNotificationCompat)
        return ((com.oasisfeng.nevo.StatusBarNotificationCompat) (sbn)).getBaseGroupKey();
    
    return sbn.getGroupKey();
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("Online", Online);
    intent.setClass(this, com.FSL.mcuTracker.ListActivity.class);
    callOtherActivity(intent, query);
    return false;
}

@java.lang.Override
protected void onPreExecute() {
    myLoadingDialog = new android.app.ProgressDialog(this);
    myLoadingDialog.setMessage("Loading");
    myLoadingDialog.setIndeterminate(false);
    myLoadingDialog.setCancelable(false);
    myLoadingDialog.show();
    super.onPreExecute();
}

public void drawPosts(android.app.Activity _activity) {
    getRestClient(1, "load");
    adapter = new budgetworld.ru.bw.PostsAdapter(_activity, posts);
    android.widget.ListView listView = ((android.widget.ListView) (_activity.findViewById(R.id.lvItems)));
    listView.setAdapter(adapter);
}

public static void recordActivity(java.lang.String message) {
    org.json.JSONObject jmessage = new org.json.JSONObject();
    de.xavaro.android.common.Json.put(jmessage, "message", message);
    de.xavaro.android.common.ActivityManager.recordActivity(jmessage);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.e("SPEAK RECEIVER", "received message ******");
    speaker = new com.nvharikrishna.whoisthat.Speaker(context);
    speaker.speak(intent.getStringExtra("message_to_speak"));
}

public void onClick(android.view.View v) {
    finish();
    java.lang.System.exit(0);
}

@java.lang.Override
public void onMatrixError(org.matrix.androidsdk.rest.model.MatrixError e) {
    org.matrix.androidsdk.util.Log.d(im.vector.activity.VectorMemberDetailsActivity.LOG_TAG, ("## mCreateDirectMessageCallBack: onMatrixError Msg=" + (e.getLocalizedMessage())));
    if (null != (mRoomActionsListener)) {
        mRoomActionsListener.onMatrixError(e);
    }
}

public void onCreate() {
    super.onCreate();
    com.example.matt.chromesthesia.Repeat Loop = Repeat.ALL;
    songposition = 0;
    mediaPlayer = new android.media.MediaPlayer();
    mp_init();
}

@javax.annotation.Nonnull
public static java.lang.String decrypt(@javax.annotation.Nonnull
java.lang.String message, @javax.annotation.Nonnull
java.lang.String salt) {
    return ua.boberproduction.bbr.util.Encryption.xor(new java.lang.String(android.util.Base64.decode(message, 0)), salt);
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    v.clearFocus();
    hideKeyBoard(v);
    return false;
}

@java.lang.Override
public void onFingerprintDialogStageUpdated(com.aitorvs.android.fingerlock.FingerprintDialog fingerprintDialog, com.aitorvs.android.fingerlock.FingerprintDialog.Stage stage) {
    android.widget.Toast.makeText(this, "onFPDSUpdated", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(this, "Started Cam", Toast.LENGTH_SHORT).show();
    qrScan.initiateScan();
}

@java.lang.Override
public void onClick(android.view.View v) {
    htl_leonding.fiplyteam.fiply.trainingssession.FFeedback fFeedback = new htl_leonding.fiplyteam.fiply.trainingssession.FFeedback();
    fFeedback.setArguments(getArguments());
    displayFragment.displayTSFeedback(fFeedback, getFragmentManager());
}

@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    mProgressDialog.show();
    android.graphics.Bitmap thumbnail = com.comp.iitb.vialogue.library.Storage.getVideoThumbnail(new java.io.File(params[0]).getAbsolutePath());
    mProgressDialog.dismiss();
    return thumbnail;
}

public void invalidateSelection() {
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
    this.peerListAdapter = new com.group.cs.wi_free.DeviceListFragment.WifiPeerListAdapter(getActivity(), R.layout.row_devices, peers);
    this.setListAdapter(peerListAdapter);
}

private void callbackProgressInternal(int progress) {
    android.util.Log.i(com.hans.doublewaybubbleseekbar.DoubleWaySeekBar.TAG, ("callbackProgressInternal: " + progress));
    if ((mListener) != null) {
        mListener.onSeekProgress(progress);
    }
}

private void onTextChanged(java.lang.CharSequence newText) {
    suggestionsListChanged();
    if (!(android.text.TextUtils.isEmpty(searchEditText.getText()))) {
        displayClearButton(true);
    }else {
        displayClearButton(false);
    }
}

private void sendPlayBroadcastMessage() {
    updateNotificationAction(false);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(getStandardPlayerBroadcast(com.example.tonykazanjian.mp4player.PlayerService.PLAYER_START_MSG));
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (action.equals(BluetoothAdapter.ACTION_LOCAL_NAME_CHANGED)) {
        updateDeviceName();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.reset_button :
            board.setOnBoardInteractionListener(this);
            board.resetBoard();
            break;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    ma.groupsCompiled.clear();
    ma.getInstituteList();
    ma.compileInstituteList(ma.institute);
    showInstituteChooseDialog();
}

public istat.android.freedev.forms.FormFiller use(istat.android.freedev.forms.Form form) {
    return istat.android.freedev.forms.FormFiller.using(form);
}

@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    if (!result) {
        synchronized(fi.lbd.mobile.fragments.ObjectListFragment.LOCK) {
            android.util.Log.d("________", "Couldn't connect to locationclient. Releasing lock.");
            fi.lbd.mobile.fragments.ObjectListFragment.searchInProgress = false;
        }
        statusText.setText(LOCATION_FAILED);
        lastStatusText = LOCATION_FAILED;
        lastStatusBackground = LOCATION_BACKGROUND;
    }
}

@java.lang.Override
public void run() {
    getAllPPTFiles(android.os.Environment.getExternalStorageDirectory());
    mHandler.sendEmptyMessage(com.changhong.touying.activity.OtherDetailsActivity.PPTLIST_REFRESH);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_calendar);
    initializeCalendar();
    restClient = new com.app.ssumobile.ssumobile_android.service.RestClient();
    initializeListener();
}

@java.lang.Override
public void onPause() {
    super.onPause();
    savedInstance = new android.os.Bundle();
    onSaveInstanceState(savedInstance);
    timingThread.stopTimer();
    handler.removeCallbacks(toggleInputMode);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String token = intent.getStringExtra(com.example.team11.MedicineActivity.GCMTOKEN);
    java.lang.String[] parts = token.split(":");
    gcmToken = parts[1];
    registerWithNotificationHubs();
}

@java.lang.Override
public void run() {
    android.util.Log.d(com.ckt.ckttodo.widgt.CircleAlarmTimerView.TAG, "TimerTask");
    handler.obtainMessage().sendToTarget();
}

private void sendNotification(android.support.v4.app.NotificationCompat.Builder notificationBuilder) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.notify(0, notificationBuilder.build());
}

@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    createAlarm(context, appWidgetIds);
    context.startService(new android.content.Intent(context, com.droid.manasshrestha.rxandroid.widget.UpdateWidget.class));
}

@android.webkit.JavascriptInterface
public void annotate(java.lang.String response) {
    android.util.Log.v("EpubReader", ("annotate<=19 " + response));
}

public void OnSetIndicatorView(android.widget.ImageView mIndicatorView, int position) {
    if (null != (mIndicatorBackgroundDrawable))
        mIndicatorView.setBackgroundDrawable(mIndicatorBackgroundDrawable);
    
    if (null != (mIndicatorSrcDrawable)) {
        mIndicatorView.setImageDrawable(mIndicatorSrcDrawable);
    }
}

public java.lang.String getRoomName(final java.lang.String roomKey) {
    com.pajato.android.gamechat.chat.model.Room room = roomMap.get(roomKey);
    return room != null ? room.name : "Anonymous";
}

public static void w(java.lang.Object obj, java.lang.Object... content) {
    dev.xesam.android.logtools.L.log(dev.xesam.android.logtools.L.TYPE_W, obj, content);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.as.atlas.googlemapfollowwe.MapsActivity.TAG, ("buttonSend.setOnclick destination=" + (com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination)));
    if (!("".equals(com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination))) {
        sendDestionationToServer(com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination);
    }
}

public void sendPackages(int frequency) {
    connectedThread = new com.example.make201512.bluetoothtester.BluetoothClassic.ConnectedThread(socket);
    connectedThread.start();
    connectedThread.write(frequency);
    android.util.Log.e(com.example.make201512.bluetoothtester.BluetoothClassic.TAG, "sendPackages被执行");
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.jimmyklein.pillreminder.PatientView obj = new com.example.jimmyklein.pillreminder.PatientView();
    obj.alertPebble();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.KITKAT)
@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... voids) {
    return sendSMS(receiverId, from);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.sparshik.yogicapple.utils.CommonUtils.openWebsite(getContext(), pack.getPackDevSiteUrl());
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    mActivityHelper.dismissDialog();
    com.firebase.ui.auth.util.SmartlockUtil.saveCredentialOrFinish(this, com.firebase.ui.auth.ui.email.RegisterEmailActivity.RC_SAVE_CREDENTIAL, getIntent(), mActivityHelper.getFlowParams(), firebaseUser, password, null);
}

@java.lang.Override
public void onClick(android.view.View v) {
    ipAddress = "null";
    startSession();
}

@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.util.Log.i(edu.washington.ruokua.quizdroid.QuizDroidModel.TAG, "onRestart event fired.");
    android.util.Log.e(edu.washington.ruokua.quizdroid.QuizDroidModel.TAG, ((topicIndex) + ""));
}

@java.lang.Override
public void onClick(android.content.DialogInterface anInterface, int i) {
    if ((loading.getVisibility()) == (android.view.View.VISIBLE))
        return ;
    
    new uiuc.mbr.ui.AddEventDialog.Worker().execute();
}

public void removeFromFavorites() {
    android.database.sqlite.SQLiteDatabase writeable = new dylan.com.adoptapet.FavoritesDBHelper(this).getWritableDatabase();
    writeable.delete(FavoritesDBHelper.table_name, "id = ?", new java.lang.String[]{ currentPet.getId() });
    writeable.close();
}

public void setProgressChangeListeners(java.util.concurrent.CopyOnWriteArrayList<com.mapbox.services.android.navigation.v5.listeners.ProgressChangeListener> progressChangeListeners) {
    progressChangeListeners.add(this);
    locationUpdatedThread.setProgressChangeListener(progressChangeListeners);
}

@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    if (activity instanceof com.example.alex.motoproject.screenMain.MainActivity) {
        mMainActivityVisible = false;
        android.widget.Toast.makeText(this, "Stopped", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.d("abc", ("getMyLikes: " + 3));
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Wearable.API).build();
    mGoogleApiClient.connect();
}

@java.lang.Override
public void onTradeNotification(com.android.futures.entity.TradeEntity entity) {
    mTradeSequence.add(entity);
    android.os.Message msg = android.os.Message.obtain();
    msg.what = TraderStatusListener.TradeNotification;
    msg.obj = entity;
    mHandler.sendMessage(msg);
}

public void onSurfaceChanged(int w, int h) {
    synchronized(lock) {
        com.giderosmobile.android.player.GiderosApplication.nativeSurfaceChanged(w, h, com.giderosmobile.android.player.GiderosApplication.getRotation());
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    savedInstanceState.putSerializable("SURFACE", surface);
    new edu.apsu.csci.teamaz.azpaint.DialogBoxColor(surface);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_tab_expenses_paid, container, false);
    initializaButterKnife(rootView);
    prepareAdapter(rootView);
    return rootView;
}

@java.lang.Override
public void onClick(android.view.View v) {
    imageIntent.setType("image/*");
    imageIntent.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(android.content.Intent.createChooser(imageIntent, "Select photo"), 0);
}

@java.lang.Override
public void onDateChanged(android.widget.DatePicker view, int yearChange, int monthOfYear, int dayOfMonth) {
    int age = yearCurrent - yearChange;
    ageTextView.setText(("" + age));
}

@java.lang.Override
public void onRefresh() {
    android.util.Log.d(name.parker.alon.viewerforgithub.view.InfoActivity.LOG_TAG, "PullToRefresh");
    swipeLayout.setRefreshing(true);
    loadData(true);
}

@java.lang.Override
public void onPageSelected(int position) {
    if ((mViewPager) != null) {
        if (position < 3) {
            mBottomNavigationView.setSelectedItemId(position);
            android.util.Log.d(DEBUG_KEY, ("item id is " + position));
        }
    }
}

@java.lang.Override
public void onWriteError(java.lang.Throwable e) {
    android.widget.Toast.makeText(context, R.string.error_write, Toast.LENGTH_LONG).show();
    android.util.Log.e(NFCDemoApplication.LOG_TAG, "Error occurred while writing NFC card", e);
}

private void setUpToolbar() {
    setSupportActionBar(((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar))));
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setTitle("Contacts");
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    android.util.Log.d(edu.umbc.cs.iot.clients.android.UMBCIoTApplication.getDebugTag(), "Came to onPostCreate");
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(StartAtraceActivity.ICON_SHOW)) {
        com.jrdcom.systrace.service.AtraceService.sIconShowing = mCommandUtil.getBooleanState(key);
        com.jrdcom.systrace.toolbox.CommandUtil.myLogger(com.jrdcom.systrace.service.AtraceService.TAG, ("onSharedPreferenceChanged: sIconShowing=" + (com.jrdcom.systrace.service.AtraceService.sIconShowing)));
    }
}

@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    mDateHeader = ((android.widget.TextView) (findViewById(R.id.date_header)));
    if (isInEditMode()) {
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    mShareNotSave = true;
    startBackup();
}

@java.lang.Override
public void onClick(android.view.View v) {
    getDownloadButton().setClickable(true);
    getDownloadButton().setText(getString(R.string.download));
    hideDownloadProgressBar();
    cancel(true);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.list_book_fragment, container, false);
    initUI();
    getBooks(0);
    return view;
}

@java.lang.Override
public void onAutoFocus(boolean success, android.hardware.Camera camera) {
    if (success) {
        camera.cancelAutoFocus();
    }
}

public static void applyForPermit(com.airmap.airmapsdk.models.permits.AirMapAvailablePermit permit, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.permits.AirMapPilotPermit> callback) {
    com.airmap.airmapsdk.networking.services.PermitService.applyForPermit(permit, callback);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    isActive = true;
    try {
        mLocationAccess.stopUpdates();
        mLocationAccess = null;
    } catch (java.lang.NullPointerException e) {
        mLocationAccess = new com.babykangaroo.android.mylocationlibrary.LocationAccess(this, this);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_game_list);
    viewModel = new ui.com.lightrpg.lightrpgui.game.GameListViewModel();
    setupDrawer();
    setupTopBar();
    setupGameList();
    setupBottomsheet();
}

public static java.lang.CharSequence applyToText(java.lang.CharSequence charSequence, android.graphics.Typeface typeface) {
    return cat.ppicas.customtypeface.CustomTypefaceSpan.applyToText(charSequence, typeface, 0, charSequence.length());
}

private static void killCurrentProcess() {
    android.os.Process.killProcess(android.os.Process.myPid());
    java.lang.System.exit(10);
}

@java.lang.Override
public void onEndOfSpeech() {
    ((android.widget.TextView) (getActivity().findViewById(R.id.result2))).setText("End of search!");
}

@java.lang.Override
public com.parse.ParseQuery create() {
    android.util.Log.d("TASKS_ADAPTER", currentUser);
    com.parse.ParseQuery query = new com.parse.ParseQuery("Task");
    query.whereEqualTo("user", currentUser);
    query.addDescendingOrder("createdAt");
    return query;
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName componentName) {
    timber.log.Timber.d("Disconnected from service.");
    navigationService = null;
    setBound(false);
}

public long getTimeSpent() {
    long time = sharedPreferences.getLong(context.getString(R.string.time), 0);
    android.util.Log.d("waleola", ("called SharedPreferenceManager.. time .... = " + time));
    return time;
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.about_us, menu);
    return true < (HEAD);
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
    finish();
    rx.Subscriber<? super io.relayr.java.model.User> subscriber = io.relayr.android.RelayrSdk.getLoginSubscriber();
    if (subscriber != null)
        subscriber.onError(e);
    
}

@android.annotation.TargetApi(value = 23)
@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setListAdapter(new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, com.firefly.shoppomem.HistoryActivity.getHistoryList()));
}

public static void setAppContext(android.content.Context appContext) {
    szu.bdi.hybrid.core.HybridTools._appContext = appContext;
}

@java.lang.Override
public void onScanning(java.lang.String paramString, int progress) {
    android.util.Log.d(io.haydar.filescanner.app.MainActivity.TAG, ("onScanning: " + progress));
}

@java.lang.Override
public void onClick(android.view.View view) {
    switchCoolFeed(false, true);
}

public static boolean showAdvancedPreferences(android.content.Context context) {
    return ((android.provider.Settings.Secure.getInt(context.getContentResolver(), android.provider.Settings.Secure.ADVANCED_MODE, 1)) == 1) && (context.getResources().getBoolean(com.android.internal.R.bool.config_advancedSettingsMode));
}

public void toAlarm(android.view.View view) {
    android.content.Intent changeToFavorites = new android.content.Intent(view.getContext(), com.davidtoh.helloworld.Alarm.class);
    startActivityForResult(changeToFavorites, 0);
}

private android.content.res.ThemeConfig getThemeConfig() {
    android.content.res.Configuration config = getConfiguration();
    if (config != null) {
        return config.themeConfig;
    }
    return null;
}

public static long normalizeDate(long startDate) {
    android.text.format.Time time = new android.text.format.Time();
    time.set(startDate);
    int julianDay = android.text.format.Time.getJulianDay(startDate, time.gmtoff);
    return time.setJulianDay(julianDay);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) < (mMaxPage)) {
        sbGotoPage.setProgress(mCurrentPage);
    }
    mCurrentPage = mGoToPage;
    showOrLoadPage();
    dialog.dismiss();
}

@java.lang.Override
public void onBackPressed() {
    android.util.Log.d("TKT_create", "onBackPressed");
    saveChanges(0);
}

@java.lang.Override
public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    handleSignInResult(googleSignInResult);
    com.oligon.bienentracker.ui.activities.HomeActivity.sp.edit().putBoolean("database_old", true).apply();
}

int MNC() {
    java.lang.String networkOperator = ((android.telephony.TelephonyManager) (getSystemService(Context.TELEPHONY_SERVICE))).getNetworkOperator();
    return !(android.text.TextUtils.isEmpty(networkOperator)) ? java.lang.Integer.parseInt(networkOperator.substring(3)) : 0;
}

public static void reapplyForcedLocale(android.content.Context context, android.app.Activity activityContext) {
    br.com.carlosrafaelgn.fplay.ui.UI.setForcedLocale(context, activityContext, br.com.carlosrafaelgn.fplay.ui.UI.forcedLocale);
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    boolean keep = intent.getExtras().getBoolean("keep");
    if (!keep) {
        finish();
    }
    setView(intent);
}

public static java.lang.String getBioSettingFromUri(android.net.Uri uri) {
    return uri.getPathSegments().get(0);
}

public void updateView(java.util.ArrayList data) {
    android.util.Log.d(com.example.ddong.xphoto.LocalGridViewAdapter.TAG, ("updateView: " + (data.size())));
    this.data = data;
}

