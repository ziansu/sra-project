@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@android.annotation.SuppressLint(value = "InlinedApi")
@java.lang.Override
public void run() {
}

protected void createUser(java.lang.String username, java.lang.String password) {
    com.example.root.quiettime.User user = new com.example.root.quiettime.User();
    user.name = username;
    user.pw = password;
    storeUser(user);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    de.greenrobot.event.EventBus.getDefault().register(this);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    drawer.onAnimationEnd(animation);
    setState(org.codetwisted.widget.DrawerLayout.STATE_IDLE, 0);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    getFab().setVisibility(View.VISIBLE);
    getAnimationListener().onAnimationFinished();
}

private synchronized de.blau.android.osm.Node getClickedNodeOrCreatedWayNode(final float x, final float y) throws de.blau.android.exception.OsmIllegalOperationException {
    return getClickedNodeOrCreatedWayNode(null, x, y, false);
}

@java.lang.Override
public void onStop() {
    super.onStop();
    if (mBound) {
        unbindService(mConnection);
        mBound = false;
    }
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_managing_existing_products, container, false);
    initializeData();
    initializeRecyclerView(view);
    initializeAdapter();
    return view;
}

@java.lang.Override
public com.augmentis.ayp.alarmclock.AlarmListFragment.AlarmHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(getActivity()).inflate(R.layout.item_list_card_alarm, parent, false);
    return new com.augmentis.ayp.alarmclock.AlarmListFragment.AlarmHolder(itemView);
}

private boolean actionReset() {
    for (android.support.v4.app.Fragment player : mFragmentManager.getFragments().subList(0, numPlayers)) {
        if (player != null)
            ((com.blogspot.onekeyucd.healthtracker.PlayerFragment) (player)).reset();
        
    }
    return true;
}

@java.lang.Override
public void onCreate(final android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((((((("CREATE TABLE IF NOT EXISTS " + (this.tableName)) + " (") + "id INTEGER PRIMARY KEY AUTOINCREMENT, ") + "name TEXT, ") + "done INTEGER") + ");"));
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent i2 = new android.content.Intent(this, heyheyoheyhey.com.ifoundclassmate3.registerActivity.class);
    startActivityForResult(i2, 1);
}

static int getNewUniqueLoaderId() {
    return com.example.android.app.moviesapp.Generator.sCurrentUniqueId.get();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
@java.lang.Override
public void onDone(github.tmdb.bo.Film data) {
    final java.lang.String urlBackdrop = data.getBackdropPath(ApiTMDB.SizePoster.w1280);
    com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(urlBackdrop, backdrop);
}

@java.lang.Override
public void onAdFailed(com.rfm.sdk.RFMAdView adView) {
    android.util.Log.d(com.rfm.extras.adapters.RFMAdmobAdapter.LOG_TAG, "RFM :onAdFailed ");
    if ((rfmAdView) != null)
        rfmAdView.setVisibility(View.GONE);
    
    if ((customEventListener) != null) {
        customEventListener.onAdFailedToLoad(222);
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
}

@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    super.finalize();
    if ((mLeakedException) != null) {
        mLeakedException = null;
    }
}

private void startOcrActivity(android.content.Intent data) {
    android.content.Intent intent = new android.content.Intent(this, com.mgtv.qxx.ttsdemo.OcrActivity.class);
    if (data != null) {
        intent.putExtras(data);
    }
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.unibo.koci.moneytracking.Activities.EditActivity.class);
    intent.putExtra("item", item);
    startActivity(intent);
}

public void winner() {
    android.widget.TextView t = ((android.widget.TextView) (findViewById(R.id.textView)));
    t.setText("Winner");
    status = 1;
}

public void addFragment(android.support.v4.app.Fragment fragment) {
    mFragmentList.add(fragment);
}

public java.lang.String getQuantityString(@android.support.annotation.PluralsRes
int pluralId, int size) {
    return mContext.getResources().getQuantityString(pluralId, size, size);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.e("Destroy", "Changes");
    super.onDestroy();
    java.lang.System.gc();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(com.example.shreekant.sunshine.app.ForecastFragment.FORECAST_LOADER_ID, null, this);
    super.onActivityCreated(savedInstanceState);
    android.util.Log.v(LOG_TAG, "onActivityCreated: initLoader");
}

@java.lang.Override
public android.content.ComponentName proceed() {
    return com.oasisfeng.condom.CondomContext.super.startService(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    fam.close(true);
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.me.squad.bankop.AddTransactionActivity.class);
    startActivity(i);
}

@com.android.tools.layoutlib.annotations.LayoutlibDelegate
static void native_getValues(long native_object, float[] values) {
    android.graphics.Matrix_Delegate d = android.graphics.Matrix_Delegate.sManager.getDelegate(native_object);
    if (d == null) {
        return ;
    }
    java.lang.System.arraycopy(d.mValues, 0, values, 0, android.graphics.Matrix_Delegate.MATRIX_SIZE);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    mediaPlayer.seekTo(0);
    fab.setImageResource(R.drawable.ic_play);
}

@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    if (b)
        setEditTextFocused();
    else
        setEditTextNotFocused();
    
}

private void moveToAddFillup() {
    android.content.Intent moveToAddFillup = new android.content.Intent(super.getContext(), com.twild.gastracker.ActivityAddFillup.class);
    moveToAddFillup.putExtra("car_index", currentCarIndex);
    startActivity(moveToAddFillup);
    getActivity().finish();
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
}

public void doDecrypt(android.view.View v) {
    doWork(2);
}

@java.lang.Override
public void onPageScrollStateChanged(int state) {
    super.onPageScrollStateChanged(state);
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    israelbgf.gastei.mobile.actvities.ExpenseManagementActivity activity = getExpenseManagementActivity();
    return new android.app.DatePickerDialog(activity, this, activity.chosenYear, ((activity.chosenMonth) - 1), 1);
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.d(com.xiongxh.popularmovies.fragments.MovieGridFragment.LOG_TAG, "MoviesGridFragment starts!");
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(com.xiongxh.popularmovies.fragments.MovieGridFragment.LOADER_ID, null, this);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle bundle) {
    currentState = bundle.getParcelable("state");
    onActivityModeChanged();
    super.onRestoreInstanceState(bundle);
}

@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null)
        android.util.Log.d("Object saving error", e.toString());
    
}

@java.lang.Override
public void run() {
    if ((connectState) == (org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.CONNECT_STATE_CONNECTED)) {
        webSocket.ping("ping");
        handler.postDelayed(this, org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.KEEPALIVE_SPAN);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    allRe.get(java.lang.Integer.parseInt(v.getTag().toString())).setUnderline();
}

@java.lang.Override
public void onBindViewHolder(com.example.android.popularmovies.TrailerRecyclerViewAdapter.TrailerViewHolder holder, int position) {
    com.example.android.popularmovies.TrailerObject currentTrailer = myTrailerData[position];
    holder.trailerNameView.setText(currentTrailer.getName());
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public void onCreate(android.os.Bundle state) {
    super.onCreate(state);
    com.example.chowdi.qremind.utils.QRCodeScanner.scanningCancelled = false;
    com.example.chowdi.qremind.utils.QRCodeScanner.scanningFinished = false;
    com.example.chowdi.qremind.utils.QRCodeScanner.result = "";
    mScannerView = new me.dm7.barcodescanner.zxing.ZXingScannerView(this);
    setContentView(mScannerView);
}

@java.lang.Override
public void onClick(android.view.View v) {
    LogHop(hop.time, hop.name);
}

@java.lang.Override
public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> results) {
    android.util.Log.i(com.example.nutri_000.testinggauge.MainActivity.TAG, (("onBatchScanResults: " + (results.size())) + " results"));
    for (android.bluetooth.le.ScanResult result : results) {
        processResult(result);
    }
}

android.service.voice.VoiceInteractionSession.Request removeRequest(android.os.IBinder reqInterface) {
    synchronized(this) {
        return mActiveRequests.remove(reqInterface);
    }
}

private void conway() {
    for (android.graphics.Point toToggle : togglePoints()) {
        cellLoc[toToggle.x][toToggle.y].toggleLive();
    }
}

@java.lang.Override
public void onAssignmentClick(com.example.android.grader.models.Assignment assignment) {
    assignmentDetailFragment = com.example.android.grader.fragments.AssignmentDetailFragment.newInstance(assignment);
    fragmentManager.beginTransaction().replace(R.id.fragmentContainer, assignmentDetailFragment, com.example.android.grader.activities.MainActivity.ASSIGNMENT_DETAIL_FRAGMENT).addToBackStack(null).commit();
}

@java.lang.Override
protected void onNewIntent(final android.content.Intent intent) {
    setIntent(intent);
    handleIntent(intent);
}

@java.lang.Override
public void onCreate() {
    mNotificationManager = android.support.v4.app.NotificationManagerCompat.from(getApplicationContext());
    showNotification();
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    mForceReset = false;
    if (!(mIsRefreshing)) {
        mWillReleaseToRefresh = true;
        setHeaderForCurrentOffsetTop();
    }
}

@java.lang.Override
public void onStopped() {
}

public void start() {
    countDownHandler.start();
}

public void addTwoTeamA(android.view.View view) {
    scoreTeamA += 2;
    displayForTeamA(scoreTeamA);
}

private void changeRangeTemp(com.example.perk.xtremegreenclient.Ranges range) {
}

@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    handler.post(createRunnable(parent, startTime, startScale, endScale));
    parent.init();
    can_scroll = false;
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.howell.protocol.utils.SDKDebugLog.LogEnable(true);
    initPlayView();
    initFun();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mMvpDelegate.onCreate(com.rey.mvp.impl.MvpActivity.getPresenterCache(), com.rey.mvp.impl.MvpActivity.getViewStateCache(), savedInstanceState, mPresenterFactory, mViewStateFactory);
}

void setAddress(android.location.Location loc) {
    if (loc != null)
        address.updateAddress(loc);
    
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@java.lang.Override
public void onImagesSelected(java.util.ArrayList<android.net.Uri> uriList) {
    selectedUriList = uriList;
}

public static void clearComm(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.flight.AirMapFlight flight, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    if (flight != null) {
        com.airmap.airmapsdk.networking.services.FlightService.clearCommKey(flight, callback);
    }
}

@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    container.removeView(((com.kun.comicreader.Extra.ZoomImageView) (object)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    data.remove(text);
    data.add(0, text);
    notifyDataSetChanged();
    closeAllItems();
}

@android.support.annotation.NonNull
static me.oriley.bunyan.Bunyan.Level getThreshold(@android.support.annotation.NonNull
java.lang.String className) {
    if (me.oriley.bunyan.Bunyan.sClassThresholds.containsKey(className)) {
        return me.oriley.bunyan.Bunyan.sClassThresholds.get(className);
    }else {
        return me.oriley.bunyan.Bunyan.sGlobalThreshold;
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    taskAdapter.saveState(this, outState);
    super.onSaveInstanceState(outState);
}

private static int getEvents(android.content.SharedPreferences prefs) {
    return prefs.getInt(Constants.PREF_KEY_RATING_EVENTS, 0);
}

@java.lang.Override
public void onClick(android.view.View v) {
    int idx = v.getId();
    name.mjs001.expensereport.User u2 = gc.getUserList().get(idx);
    gc.setCurUser(u2.getId());
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    first = true;
}

void onClick(android.view.View view, int position);

@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    listener.get().onTapped();
    return false;
}

public void secondChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 2) {
        updateScore(true);
    }
    timer.cancel();
    newMove();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setBaseContent();
    getPermissions();
    com.example.kaveon14.workoutbuddy.DataBase.TableManagers.ProgressPhotosTable table = new com.example.kaveon14.workoutbuddy.DataBase.TableManagers.ProgressPhotosTable(getBaseContext());
}

@java.lang.Override
public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    android.view.inputmethod.InputConnection c = super.onCreateInputConnection(outAttrs);
    if (c == null)
        return null;
    
    return new com.layer.atlas.utilities.views.EmptyDelEditText.EmptyDelInputConnection(c, true);
}

@java.lang.Override
public void onClick(android.view.View view) {
    toggle();
}

private static void updateSharedPreferences() {
    if ((org.redcross.openmapkit.OSMMapBuilder.sharedPreferences) == null)
        return ;
    
    android.content.SharedPreferences.Editor editor = org.redcross.openmapkit.OSMMapBuilder.sharedPreferences.edit();
    editor.putStringSet(org.redcross.openmapkit.OSMMapBuilder.PERSISTED_OSM_FILES, org.redcross.openmapkit.OSMMapBuilder.persistedOSMFiles);
    editor.apply();
}

private void parseIntent(android.content.Intent intent) {
    if (intent == null)
        return ;
    
    token = intent.getStringExtra(IntentTypeUtils.INTENT_KEY);
    user = intent.getStringExtra(IntentTypeUtils.USER_KEY);
    rooms = java.lang.Integer.parseInt(intent.getStringExtra(IntentTypeUtils.ROOM_NUM));
}

@java.lang.Override
public void onTokenRefresh() {
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d(andre.com.datapushandroid.services.FCM_InstanceIdService.TAG, ("Refreshed token: " + refreshedToken));
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    bluetoothStatus.setSummaryOff(R.string.switch_pref_summary_off);
    databaseHelperActivity.onUpdateBluetoothValue(activityTitle, profileDisabled);
    return true;
}

@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    cleanBeacons();
    de.beacon.tom.viibenav_radiomapper.model.RadioMap.getRadioMap().deleteLastAnchor();
    main.getApplicationUI().updateLayer1();
    cleanInfo();
}

@java.lang.Override
protected void onStop() {
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        unsubscribe();
    }
    super.onStop();
}

public void setUserCoordinateSystem(int userCoordinateSystem) {
    if ((userCoordinateSystem >= (com.example.damianmichalak.bluetooth_test.view.widget.JoystickView.COORDINATE_CARTESIAN)) && ((movementConstraint) <= (com.example.damianmichalak.bluetooth_test.view.widget.JoystickView.COORDINATE_DIFFERENTIAL))) {
        this.userCoordinateSystem = userCoordinateSystem;
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    hideStatusBar();
    mFirebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(this);
    registerRongCloudReceiveMessageListener();
}

public void resume() {
    resumeWebView(getWebViewForTabId(currentId));
}

private void init() {
    setOnClickListener(this);
    eventBus = new org.greenrobot.eventbus.EventBus();
}

@java.lang.Override
protected java.util.ArrayList<com.android.infosessions.Session> doInBackground(java.lang.String... params) {
    java.util.ArrayList<com.android.infosessions.Session> sessions = com.android.infosessions.QueryUtils.fetchInfos(params[0], getContext());
    insertSession(sessions, getActivity());
    return sessions;
}

protected void cancelNotification() {
    mNotificationManager.cancel(notificationID);
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    if ((videoAdapter) == null) {
        videoAdapter = ((com.example.inspired.inspiredvideo.app.MovieAdapter) (mRecyclerView.getAdapter()));
    }
    videoAdapter.updatemVideoItems(Context.mCurrentData, false);
}

public void onStart(android.app.Activity a) {
    ScheduleSleep();
}

public void downloadSelected(android.view.View v) {
    java.util.ArrayList<sk.matus.ksp.guitarist_swiss_knife.ScrapeUGActivity.ResultEntryView> marked = gatherMarked();
    saveExtracted = true;
    extractSongs(marked);
}

@java.lang.Override
public void onSuccess() {
    goToMain();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_location_key)));
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_temperature)));
}

private void saveLog(android.preference.Preference logLoc) {
    file = com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.saveLogcat(getActivity());
    logLoc.setEnabled(true);
    logLoc.setSummary(file);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if ((mControlsFrame) != null)
        mControlsFrame.setVisibility(View.INVISIBLE);
    
}

public void onStartAgain(android.view.View view) {
    android.util.Log.v(com.example.kirstiebooras.colors.activities.ColorActivity.TAG, "onStartAgain");
    android.content.Intent intent = new android.content.Intent(this, com.example.kirstiebooras.colors.activities.MainActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void handleMessage(android.os.Message message) {
    org.chromium.chromoting.TapGestureDetector detector = mDetector.get();
    if (detector != null) {
        detector.mTapCancelled = true;
        detector.mListener.onLongPress(detector.mPointerCount, detector.mInitialPoint.x, detector.mInitialPoint.y);
        detector.mInitialPoint = null;
    }
}

void changeSecondViewPosition() {
    com.nineoldandroids.view.ViewHelper.setY(secondView, dragView.getBottom());
}

public boolean checkCameraHardware(android.content.Context context) {
    return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
}

