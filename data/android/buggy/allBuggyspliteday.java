@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
    }
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
}

@android.annotation.SuppressLint(value = "InlinedApi")
@java.lang.Override
public void run() {
    mContentView.setSystemUiVisibility(((((((android.view.View.SYSTEM_UI_FLAG_LOW_PROFILE) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE)) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)));
}

protected void createUser(java.lang.String username, java.lang.String password) {
    com.example.root.quiettime.User user = new com.example.root.quiettime.User();
    user.name = username;
    user.pw = password;
    storeUser(user);
    android.util.Log.v("QT", "User stored");
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    de.greenrobot.event.EventBus.getDefault().register(this);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().hide();
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    drawer.onAnimationEnd(animation);
    state = org.codetwisted.widget.DrawerLayout.STATE_IDLE;
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    getFab().setVisibility(View.VISIBLE);
    getAnimationListener().onAnimationFinished();
}

private synchronized de.blau.android.osm.Node getClickedNodeOrCreatedWayNode(final float x, final float y) throws de.blau.android.exception.OsmIllegalOperationException {
    return getClickedNodeOrCreatedWayNode(null, x, y);
}

public void onStop(android.view.View view) {
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
    initializeAdapter();
    initializeRecyclerView(view);
    return view;
}

@java.lang.Override
public com.augmentis.ayp.alarmclock.AlarmListFragment.AlarmHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(getActivity()).inflate(R.layout.item_list_card_alarm, parent);
    return new com.augmentis.ayp.alarmclock.AlarmListFragment.AlarmHolder(itemView);
}

private boolean actionReset() {
    for (android.support.v4.app.Fragment player : mFragmentManager.getFragments().subList(0, numPlayers)) {
        ((com.blogspot.onekeyucd.healthtracker.PlayerFragment) (player)).reset();
    }
    return true;
}

@java.lang.Override
public void onCreate(final android.database.sqlite.SQLiteDatabase db) {
    getWritableDatabase().execSQL((((((("CREATE TABLE IF NOT EXISTS " + (this.tableName)) + " (") + "id INTEGER PRIMARY KEY AUTOINCREMENT, ") + "name TEXT, ") + "done INTEGER") + ");"));
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent i2 = new android.content.Intent(this, heyheyoheyhey.com.ifoundclassmate3.registerActivity.class);
    startActivityForResult(i2, 2);
}

static int getNewUniqueLoaderId() {
    return com.example.android.app.moviesapp.Generator.sCurrentUniqueId.getAndIncrement();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
@java.lang.Override
public void onDone(github.tmdb.bo.Film data) {
    final java.lang.String urlBackdrop = data.getBackdropPath(ApiTMDB.SizePoster.w1280);
    backdrop.setImageBitmap(null);
    backdrop.setTag(urlBackdrop);
    com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(urlBackdrop, backdrop);
}

@java.lang.Override
public void onAdFailed(com.rfm.sdk.RFMAdView adView) {
    android.util.Log.d(com.rfm.extras.adapters.RFMAdmobAdapter.LOG_TAG, "RFM :onAdFailed ");
    rfmAdView.setVisibility(View.GONE);
    if ((customEventListener) != null) {
        customEventListener.onAdFailedToLoad(222);
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    mMobvoiApiClient = new com.mobvoi.android.common.api.MobvoiApiClient.Builder(this).addApi(Wearable.API).build();
    mMobvoiApiClient.connect();
}

@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    super.finalize();
    if ((mLeakedException) != null) {
        android.util.Log.e(fast.simple.download.http.DownloadHttpClient.TAG, "Leak found", mLeakedException);
        mLeakedException = null;
    }
}

private void startOcrActivity(android.content.Intent data) {
    android.content.Intent intent = new android.content.Intent(this, com.mgtv.qxx.ttsdemo.OcrActivity.class);
    intent.putExtras(data);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.unibo.koci.moneytracking.Activities.EditActivity.class);
    intent.putExtra("item", item);
    startActivity(intent);
    finish();
}

public void winner() {
    android.widget.TextView t = ((android.widget.TextView) (findViewById(R.id.textView)));
    t.setText("Winner");
}

public void addFragment(android.support.v4.app.Fragment fragment, java.lang.String title) {
    mFragmentList.add(fragment);
    mFragmentTitleList.add(title);
}

public java.lang.String getQuantityString(@android.support.annotation.PluralsRes
int pluralId, int size) {
    return mContext.getResources().getQuantityString(pluralId, size);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.e("Destroy", "Changes");
    super.onDestroy();
    displayImage = null;
    myGallery.removeAllViews();
    myGallery = null;
    java.lang.System.gc();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.v(LOG_TAG, "onActivityCreated: initLoader");
    getLoaderManager().initLoader(com.example.shreekant.sunshine.app.ForecastFragment.FORECAST_LOADER_ID, null, this);
}

@java.lang.Override
public android.content.ComponentName proceed(final android.content.Intent intent) {
    return com.oasisfeng.condom.CondomContext.super.startService(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    fam.close(false);
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.me.squad.bankop.AddTransactionActivity.class);
    startActivity(i);
}

@com.android.tools.layoutlib.annotations.LayoutlibDelegate
static void native_getValues(long native_object, float[] values) {
    android.graphics.Matrix_Delegate d = android.graphics.Matrix_Delegate.sManager.getDelegate(native_object);
    if (d == null) {
        return ;
    }
    java.lang.System.arraycopy(d.mValues, 0, d.mValues, 0, android.graphics.Matrix_Delegate.MATRIX_SIZE);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    mediaPlayer.seekTo(0);
    android.widget.Toast.makeText(this, "The audio lesson has finished playing.", Toast.LENGTH_SHORT).show();
    fab.setImageResource(R.drawable.ic_play);
}

@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    org.md2k.utilities.Report.Log.d(org.md2k.ema.FragmentTextNumeric.TAG, ("Focus=" + b));
    if (b)
        setEditTextFocused();
    else
        setEditTextNotFocused();
    
}

private void moveToAddFillup() {
    android.content.Intent moveToAddFillup = new android.content.Intent(super.getContext(), com.twild.gastracker.ActivityAddFillup.class);
    moveToAddFillup.putExtra("car_index", currentCarIndex);
    getActivity().finish();
    startActivity(moveToAddFillup);
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    com.example.jarvus.tummybuddy.MenuClick.globalCal = s;
    android.util.Log.e("done", "*******************************************|||");
}

protected void doDecrypt(android.view.View v) {
    doWork(2);
}

@java.lang.Override
public void onPageScrollStateChanged(int state) {
    super.onPageScrollStateChanged(state);
    mUpButton.animate().alpha((state == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE) ? 1.0F : 0.0F)).setDuration(300);
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    israelbgf.gastei.mobile.actvities.ExpenseManagementActivity activity = getExpenseManagementActivity();
    return new android.app.DatePickerDialog(activity, this, activity.chosenYear, activity.chosenMonth, 1);
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.d(com.xiongxh.popularmovies.fragments.MovieGridFragment.LOG_TAG, "MoviesGridFragment starts!");
    getLoaderManager().initLoader(com.xiongxh.popularmovies.fragments.MovieGridFragment.LOADER_ID, null, this);
    super.onActivityCreated(savedInstanceState);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.widget.Toast.makeText(this, "onLocationChange", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle bundle) {
    currentState = bundle.getParcelable("state");
    onActivityModeChanged();
    locationHandler.onRestoreInstanceState(bundle);
    super.onRestoreInstanceState(bundle);
}

@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null)
        android.util.Log.d("Object saving error", e.toString());
    
    java.lang.System.out.println(("New upvote count: " + (object.getNumber("upvotes"))));
    java.lang.System.out.println("Post updated");
}

@java.lang.Override
public void run() {
    webSocket.ping("ping");
    if ((connectState) == (org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.CONNECT_STATE_CONNECTED)) {
        handler.postDelayed(this, org.deviceconnect.android.deviceplugin.slackmessagehook.slack.SlackManager.KEEPALIVE_SPAN);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    allRe.get(java.lang.Integer.parseInt(v.getTag().toString())).setUnderline();
    updateTextNoteControlListners(R.id.action_underline);
}

@java.lang.Override
public void onBindViewHolder(com.example.android.popularmovies.TrailerRecyclerViewAdapter.TrailerViewHolder holder, int position) {
    android.util.Log.d(com.example.android.popularmovies.TrailerRecyclerViewAdapter.TAG, ("#" + position));
    com.example.android.popularmovies.TrailerObject currentTrailer = myTrailerData[position];
    holder.trailerNameView.setText(currentTrailer.getName());
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Config.context = this;
}

@java.lang.Override
public void onCreate(android.os.Bundle state) {
    super.onCreate(state);
    mScannerView = new me.dm7.barcodescanner.zxing.ZXingScannerView(this);
    setContentView(mScannerView);
    com.example.chowdi.qremind.utils.QRCodeScanner.scanningCancelled = false;
    com.example.chowdi.qremind.utils.QRCodeScanner.scanningFinished = false;
    com.example.chowdi.qremind.utils.QRCodeScanner.result = "";
}

@java.lang.Override
public void onClick(android.view.View v) {
    insideScroller.scrollTo(0, ((insideScroller.getScrollY()) + 250));
    LogHop(hop.time, hop.name);
}

@java.lang.Override
public void onBatchScanResults(java.util.List<android.bluetooth.le.ScanResult> results) {
    android.util.Log.d(com.example.nutri_000.testinggauge.MainActivity.TAG, (("onBatchScanResults: " + (results.size())) + " results"));
    for (android.bluetooth.le.ScanResult result : results) {
        processResult(result);
    }
}

android.service.voice.VoiceInteractionSession.Request removeRequest(android.os.IBinder reqInterface) {
    synchronized(this) {
        android.service.voice.VoiceInteractionSession.Request req = mActiveRequests.get(reqInterface);
        if (req != null) {
            mActiveRequests.remove(req);
        }
        return req;
    }
}

private void conway() {
    for (android.graphics.Point toToggle : togglePoints()) {
        cellLoc[toToggle.y][toToggle.x].toggleLive();
    }
}

@java.lang.Override
public void onAssignmentClick(com.example.android.grader.models.Assignment assignment) {
    com.example.android.grader.fragments.AssignmentDetailFragment assignmentDetailFragment = com.example.android.grader.fragments.AssignmentDetailFragment.newInstance(assignment);
    fragmentManager.beginTransaction().replace(R.id.fragmentContainer, assignmentDetailFragment, com.example.android.grader.activities.MainActivity.ASSIGNMENT_DETAIL_FRAGMENT).addToBackStack(null).commit();
}

@java.lang.Override
protected void onNewIntent(final android.content.Intent intent) {
    android.util.Log.d(org.comparemydinner.activity.SearchListActivity.TAG, "onNewIntent");
    setIntent(intent);
    handleIntent(intent);
}

@java.lang.Override
public void onCreate() {
    mNotificationManager = android.support.v4.app.NotificationManagerCompat.from(getApplicationContext());
    showNotification(NOTIFICATION);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    mForceReset = false;
    if (!(mIsRefreshing)) {
        mWillReleaseToRefresh = true;
    }
    setHeaderForCurrentOffsetTop();
}

@java.lang.Override
public void onStopped() {
    java.lang.String toastMessage = "video stopped";
    android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
    toast.show();
}

public void start() {
    countDownHandler.cancel();
    android.util.Log.d("waleola", "called start..in CountDownManager");
    countDownHandler.start();
}

public void addTwoTeamA(android.view.View view) {
    scoreTeamA = (scoreTeamA) + 2;
    displayForTeamA(scoreTeamA);
}

private void changeRangeTemp(com.example.perk.xtremegreenclient.Ranges range) {
    android.content.Intent intent = new android.content.Intent(this, com.example.perk.xtremegreenclient.RangeSetterActivity.class);
    intent.putExtra("Range", range);
    startActivity(intent);
}

@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    handler.post(createRunnable(parent, startTime, startScale, endScale));
    can_scroll = false;
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.howell.protocol.utils.SDKDebugLog.LogEnable(true);
    initPlayView();
    initFun();
    start();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    mMvpDelegate.onCreate(com.rey.mvp.impl.MvpActivity.getPresenterCache(), com.rey.mvp.impl.MvpActivity.getViewStateCache(), savedInstanceState, mPresenterFactory, mViewStateFactory);
    super.onCreate(savedInstanceState);
}

void setAddress(android.location.Location loc) {
    address.updateAddress(loc);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent previewActivity = new android.content.Intent("com.keepingatimeline.kat.PreviewEvent");
    startActivity(previewActivity);
}

@java.lang.Override
public void onImagesSelected(java.util.ArrayList<android.net.Uri> uriList) {
    selectedUriList = uriList;
    android.widget.Toast.makeText(this, ("length " + (uriList.size())), Toast.LENGTH_SHORT).show();
}

public static void clearComm(com.airmap.airmapsdk.models.flight.AirMapFlight flight, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    com.airmap.airmapsdk.networking.services.FlightService.clearCommKey(flight, callback);
}

@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    ((android.support.v4.view.ViewPager) (container)).removeView(((com.kun.comicreader.Extra.ZoomImageView) (object)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    data.remove(text);
    notifyDataSetChanged();
    closeAllItems();
}

@android.support.annotation.NonNull
static me.oriley.bunyan.Bunyan.Level getThreshold(@android.support.annotation.NonNull
java.lang.Class c) {
    if (me.oriley.bunyan.Bunyan.sClassThresholds.containsKey(c)) {
        return me.oriley.bunyan.Bunyan.sClassThresholds.get(c);
    }else {
        return me.oriley.bunyan.Bunyan.sGlobalThreshold;
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    taskAdapter.saveState(this, outState);
}

private int getEvents(android.content.SharedPreferences prefs) {
    return prefs.getInt(Constants.PREF_KEY_RATING_EVENTS, 0);
}

@java.lang.Override
public void onClick(android.view.View v) {
    int idx = v.getId();
    name.mjs001.expensereport.User u2 = gc.getUserList().get(idx);
    gc.setCurUser(u2);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
}

void onClick(android.view.View view);

@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    listener.get().onTapped();
    return true;
}

public void secondChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 2) {
        updateScore();
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
    table.printTable();
}

@java.lang.Override
public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    return new com.layer.atlas.utilities.views.EmptyDelEditText.EmptyDelInputConnection(super.onCreateInputConnection(outAttrs), true);
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.hustunique.parsingplayer.LogUtil.d(com.hustunique.parsingplayer.player.android.VideoActivity.TAG, "click on view");
    toggle();
}

private static void updateSharedPreferences() {
    android.content.SharedPreferences.Editor editor = org.redcross.openmapkit.OSMMapBuilder.sharedPreferences.edit();
    editor.putStringSet(org.redcross.openmapkit.OSMMapBuilder.PERSISTED_OSM_FILES, org.redcross.openmapkit.OSMMapBuilder.persistedOSMFiles);
    editor.apply();
}

private void parseIntent(android.content.Intent intent) {
    if (intent == null)
        return ;
    
    token = intent.getStringExtra(IntentTypeUtils.INTENT_KEY);
    user = intent.getStringExtra(IntentTypeUtils.USER_KEY);
    rooms = java.lang.Integer.valueOf(intent.getStringExtra(IntentTypeUtils.ROOM_NUM));
}

@java.lang.Override
public void onTokenRefresh() {
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d(andre.com.datapushandroid.services.FCM_InstanceIdService.TAG, ("Refreshed token: " + refreshedToken));
    sendRegistrationToServer(refreshedToken);
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    bluetoothStatus.setSummaryOff(R.string.switch_pref_summary_off);
    databaseHelperActivity.onUpdateBluetoothValue(activityTitle, profileDisabled);
    android.bluetooth.BluetoothAdapter mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    mBluetoothAdapter.disable();
    return true;
}

@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    de.beacon.tom.viibenav_radiomapper.model.RadioMap.getRadioMap().deleteLastAnchor();
    main.getApplicationUI().updateLayer1();
    cleanBeacons();
    cleanInfo();
}

@java.lang.Override
protected void onStop() {
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        android.util.Log.d(edu.umbc.cs.iot.clients.android.UMBCIoTApplication.getDebugTag(), "Disconnecting API client");
        unsubscribe();
    }
    super.onStop();
}

public void setUserCoordinateSystem(int userCoordinateSystem) {
    if ((userCoordinateSystem < (com.example.damianmichalak.bluetooth_test.view.widget.JoystickView.COORDINATE_CARTESIAN)) || ((movementConstraint) > (com.example.damianmichalak.bluetooth_test.view.widget.JoystickView.COORDINATE_DIFFERENTIAL)))
        android.util.Log.e(TAG, "invalid value for userCoordinateSystem");
    else
        this.userCoordinateSystem = userCoordinateSystem;
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    hideStatusBar();
    mFirebaseAnalytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(this);
    registerJPushMessageReceiver();
    registerRongCloudReceiveMessageListener();
}

public void resume() {
    com.duckduckgo.mobile.android.duckduckgo.ui.tab.DDGWebView webView = getWebViewForTabId(currentId);
    if (webView == null)
        return ;
    
    browserPresenter.attachTabView(webView);
    resumeWebView(webView);
}

private void init() {
    progressBar = ((android.widget.ProgressBar) (findViewById(R.id.loading_progressBar)));
    tipTxt = ((android.widget.TextView) (findViewById(R.id.tip_txt)));
    setOnClickListener(this);
    eventBus = new org.greenrobot.eventbus.EventBus();
}

@java.lang.Override
protected java.util.ArrayList<com.android.infosessions.Session> doInBackground(java.lang.String... params) {
    java.util.ArrayList<com.android.infosessions.Session> sessions = com.android.infosessions.QueryUtils.fetchInfos(params[0], getContext());
    insertSession(sessions);
    return sessions;
}

protected void cancelNotification() {
    android.util.Log.i("Cancel", "notification");
    mNotificationManager.cancel(notificationID);
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    com.example.inspired.inspiredvideo.app.MovieAdapter videoAdapter = ((com.example.inspired.inspiredvideo.app.MovieAdapter) (mRecyclerView.getAdapter()));
    videoAdapter.updatemVideoItems(Context.mCurrentData, false);
}

public void onStart(android.app.Activity a) {
    this.active = true;
    ScheduleSleep();
}

public void downloadSelected(android.view.View v) {
    sk.matus.ksp.guitarist_swiss_knife.SongDatabaseHelper db = new sk.matus.ksp.guitarist_swiss_knife.SongDatabaseHelper(this);
    java.util.ArrayList<sk.matus.ksp.guitarist_swiss_knife.ScrapeUGActivity.ResultEntryView> marked = gatherMarked();
    saveExtracted = true;
    extractSongs(marked);
}

@java.lang.Override
public void onSuccess() {
    if ((mApp.getRepo()) != null)
        goToMain();
    else
        android.widget.Toast.makeText(this, "The selected repo does not exist", Toast.LENGTH_SHORT).show();
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_location_key)));
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_temperature)));
}

private void saveLog(android.preference.Preference logLoc) {
    java.lang.String file = com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.saveLogcat(getActivity());
    logLoc.setEnabled(true);
    logLoc.setSummary(file);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    setFullscreen(true);
    if ((mControlsFrame) != null)
        mControlsFrame.setVisibility(View.INVISIBLE);
    
}

public void onStartAgain() {
    android.util.Log.v(com.example.kirstiebooras.colors.activities.ColorActivity.TAG, "onStartAgain");
    android.content.Intent intent = new android.content.Intent(this, com.example.kirstiebooras.colors.activities.MainActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void handleMessage(android.os.Message message) {
    org.chromium.chromoting.TapGestureDetector detector = mDetector.get();
    if (detector != null) {
        detector.mListener.onLongPress(detector.mPointerCount, detector.mInitialPoint.x, detector.mInitialPoint.y);
        detector.mTapCancelled = true;
    }
}

void changeSecondViewPosition() {
    com.nineoldandroids.view.ViewHelper.setY(secondView, dragView.getBottom());
    com.nineoldandroids.view.ViewHelper.setX(secondView, dragView.getLeft());
}

public boolean checkCameraHardware(android.content.Context context) {
    if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
        return true;
    }else {
        return false;
    }
}

