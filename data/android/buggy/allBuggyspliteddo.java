@java.lang.Override
public void onMessageReceived(uk.co.maxtingle.communication.client.Client client, uk.co.maxtingle.communication.common.Message message) throws java.lang.Exception {
    com.mt.easytv.activities.CommandResponse.setResponse(message);
    self.setIntent(new android.content.Intent(self, com.mt.easytv.activities.CommandResponse.class));
}

@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onClick(holder, position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.ibtnClose :
            windowManager.removeView(linearLayout);
            stopSelf();
            break;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    start(new android.view.View(this));
    atoms[1][1] = atoms[12][6];
}

public void devOps(android.view.View v) {
    storageProvider.ClearAll(this);
    android.util.Log.d("DevOps", "Cleared database");
}

private void sendResult(com.example.mborzenkov.readlaterlist.adt.ReadLaterItem resultData) {
    android.content.Intent resultIntent = new android.content.Intent();
    resultIntent.putExtra(ReadLaterItemParcelable.KEY_EXTRA, new com.example.mborzenkov.readlaterlist.adt.ReadLaterItemParcelable(resultData));
    setResult(com.example.mborzenkov.readlaterlist.activity.RESULT_OK, resultIntent);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (isTimerRunning) {
        stopTimer();
    }else {
        serviceBind.turnOnServices(getApplicationContext());
        startTimer();
    }
}

@java.lang.Override
public void onItemSelected(com.rey.material.widget.Spinner parent, android.view.View view, int position, long id) {
    selectedGrade1103 = mModeAdapter.getItemAsString(position);
    gp1104 = setGradePoint(selectedGrade1104);
    gradeToaster(selectedGrade1104);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new riyanshkarani011235.com.github.io.models_test_app.LoadFromJson();
    android.content.Intent intent = new android.content.Intent(this, riyanshkarani011235.com.github.io.models_test_app.LoginActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mApplication.getConfigurationManager().setEndUserAcceptedVideoLicense();
    setLicenseAcceptance(true);
    mVideoCodecAcceptance = true;
    joinTheCall(onlineMeetingFlag, meetingUrl, discoveryUrl, authToken);
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    if (intent.getAction().equals(Intent.ACTION_MAIN)) {
        resetState();
    }
}

@java.lang.Override
public void onContactListUpdated(android.content.Intent intent) {
    enterMainActivity();
}

@android.support.annotation.Nullable
private gcum.gcumfisher.Spot getAddress() {
    return (forcedAddress) != null ? forcedAddress : gpsAddress;
}

@java.lang.Override
public void run() {
    addFeedItem(new com.saltycode.android.material2.material_playground.model.FeedItem("Morten Salte", content, 0));
}

public static java.lang.String getAuthority(android.content.Context context) {
    if (android.text.TextUtils.isEmpty(org.xjy.android.treasure.provider.TreasureContract.sAuthority)) {
        org.xjy.android.treasure.provider.TreasureContract.sAuthority = context.getString(R.string.org_xjy_android_treasure_authority);
    }
    return org.xjy.android.treasure.provider.TreasureContract.sAuthority;
}

public android.graphics.Matrix refresh(android.graphics.Matrix newMatrix, com.github.mikephil.charting.charts.Chart<?> chart, boolean invalidate) {
    mMatrixTouch.set(newMatrix);
    limitTransAndScale(mMatrixTouch, mContentRect);
    chart.invalidate();
    newMatrix.set(mMatrixTouch);
    return newMatrix;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.bauble_app.bauble.MyDbOpener.getInstance(this);
}

public void setCardBackBackground(@android.support.annotation.DrawableRes
int cardBackBackground) {
    mCardBackBackground = cardBackBackground;
    setBackgroundResource(mCardBackBackground);
    redrawViews();
}

private boolean freezing(android.graphics.Point p1, android.graphics.Point p2) {
    if ((threatening(p1, p2)) && (!(isSafe(p2))))
        return true;
    
    return false;
}

public void onInterstitialAdDismissed(com.rfm.sdk.RFMAdView adView) {
    com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView.setVisibility(View.GONE);
    com.rfm.extras.adapters.RFMViewInterstitialActivity.dismissActivity();
    android.util.Log.v("LOG_TAG", "RFM Ad: Interstitial ad dismissed");
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.e("URL:  ", "ld");
    android.view.View v = inflater.inflate(R.layout.fragment_two, container, false);
    return v;
}

public void clear(android.view.View view) {
    res.setText("0");
    point = false;
    op = false;
    eq = false;
}

@java.lang.Override
protected java.util.Collection<TListClient> getClientObjects(de.fau.cs.mad.kwikshop.android.model.synchronization.ListSyncData<TListClient, TListServer> syncData) {
    return syncData.getClientLists();
}

private void play(android.widget.ImageButton playButton) {
    mPlaying = true;
    playButton.setImageResource(android.R.drawable.ic_media_pause);
    mMediaPlayer.start();
    mSeekBarHandler.postDelayed(updateSeekBar, 100);
}

public void onServiceDisconnected(android.content.ComponentName name) {
    mServiceInterface = null;
}

public android.view.ViewPropertyAnimator animateOffScreenLeft(int duration) {
    return card.animate().setDuration(SwipeDeck.ANIMATION_DURATION).x((-(parentWidth))).y(0).rotation((-30));
}

public void stopLoading() {
    progress.dismiss();
    progress = null;
    org.wildstang.wildrank.android.data.DataManager.prepareForEject();
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS));
    android.widget.Toast.makeText(getActivity(), "Scroll down, press \"Unmount\", press back button.", Toast.LENGTH_LONG).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_job_board);
    userID = getIntent().getExtras().getString("userID");
    new com.may1722.t_go.ui.JobBoardActivity.AsyncGetJobs().execute();
}

public void intentToRestartStart() {
    android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
    android.os.StrictMode.setThreadPolicy(policy);
    android.content.Intent restartIntent = new android.content.Intent(this, com.example.crimson30.cardczar.MainActivity.class);
    startActivity(restartIntent);
}

@java.lang.Override
public void onBackPressed() {
    if (!(backgroundPrefValue.equals(pref_background.getValue()))) {
        finishAffinity();
        startActivity(new android.content.Intent(this, com.johnsimon.payback.ui.FeedActivity.class));
    }else {
        super.onBackPressed();
    }
}

@java.lang.Override
public void onSurfaceChanged(int width, int height) {
    android.util.Log.i(spin.ncsa.org.moleculevr.MainActivity.TAG, "onSurfaceChanged");
}

public void setSwitchWithoutTriggering(android.support.v7.widget.SwitchCompat switchCompat, boolean newState) {
    switchCompat.setOnCheckedChangeListener(null);
    switchCompat.setChecked(newState);
    switchCompat.setOnCheckedChangeListener(this);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if ((intent != null) && (intent.getBooleanExtra(com.darshancomputing.BatteryIndicatorPro.BatteryInfoService.EXTRA_UPDATE_PREDICTOR, false)))
        update(null);
    
    return android.app.Service.START_STICKY;
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if ((org.mti.hip.utils.VisitDiagnosisListAdapter.stiContactsTreated) <= 0) {
        showStiContactsDialog();
    }
}

public void buttonAuth(android.view.View view) {
    ((com.example.brewchat.Application) (getApplication())).getChatService().login(username.getText().toString(), password.getText().toString());
}

public org.michaelbel.material.widget.ActionBarMenuItem addItem(int id, @android.support.annotation.DrawableRes
int icon, int backgroundColor) {
    return addItem(id, icon, backgroundColor, null, org.michaelbel.material.util.Utils.dp(getContext(), 48));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    if (savedInstanceState != null) {
        setupFromSavedInstanceState(savedInstanceState);
    }else {
        onNewIntent(getIntent());
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.util.Log.d("test", ("Getting " + (mFragments.get(position).getId())));
    return mFragments.get(position);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.support.v7.app.ActionBar ab = ((android.support.v7.app.ActionBarActivity) (context)).getSupportActionBar();
    ab.setTitle("Topical Bible");
    setHasOptionsMenu(true);
}

public void init(android.util.AttributeSet attrs) {
    try {
        setWillNotDraw(false);
        setupAttributes(attrs);
        setGravity(Gravity.CENTER);
        setupAnimators();
        setupPaint();
    } catch (java.lang.Exception ignored) {
    }
}

@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition arg0) {
    mClearMapLimit = false;
    mActiveSearch = false;
    mPage = 0;
    loadObservations();
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    IsActivityAlive = false;
    cMessenger = null;
    closeSeekThread();
    return super.onUnbind(intent);
}

private void initMarginRect(android.graphics.Rect marginRect, android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
    marginRect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
}

@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    android.support.design.widget.CollapsingToolbarLayout collapseBar = ((android.support.design.widget.CollapsingToolbarLayout) (findViewById(R.id.collapsing_toolbar_layout)));
}

@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    if (fromHeight == 0)
        view.setVisibility(View.VISIBLE);
    
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
}

@java.lang.Override
public void onShutterDone(int requestId) {
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onShutterDone();
    com.fezrestia.android.viewfinderanywhere.ViewFinderAnywhereApplication.getGlobalFirebaseAnalyticsController().createNewLogRequest().setEvent(ViewFinderAnywhereConstants.FIREBASE_EVENT_ON_SHUTTER_DONE).done();
}

public void myDraw(android.graphics.Canvas canvas) {
    canvas.drawBitmap(mBitmapBackground, 0, 0, null);
    android.util.Log.d(com.example.balloonpop.GameView.TAG, "myDraw draw background");
    mGroup.drawAll(canvas);
}

@java.lang.Override
public void onClick(android.view.View view) {
    pDialog.show();
    inputValidation();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    updateLocation(location.getLatitude(), location.getLongitude());
}

@org.androidannotations.annotations.AfterViews
protected void init() {
    initToolbar();
    initDrawer();
    com.noveogroup.android.log.Log.d("Storage path: %s", storageUtils.getExternalStoragePath());
    hideProgress();
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("gets called", "gets called");
    getActivity().setTitle(this.notebookName);
    refreshNotes();
}

private boolean addJoinableToStructure(@android.support.annotation.NonNull
su.j2e.rvjoiner.RvJoiner.Joinable joinable) {
    boolean wasAdded = joinables.add(joinable);
    if (wasAdded) {
        postStructureChanged();
    }
    return wasAdded;
}

@java.lang.Override
public void onBindViewHolder(com.example.android.moviemagazine.MovieAdapter.ViewHolder holder, int position) {
    com.squareup.picasso.Picasso.with(context).load(dummyData[position]).into(holder.MovieImageView);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save_details :
            updateDetails();
            finish();
        case R.id.action_delete_details :
            showDeleteConfirmationDialog();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

protected void selectVeryDissatisfied(android.view.View view) {
    sentimentIndex = 0;
    updateSentiments();
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mp.seekTo(seekBar.getProgress());
    android.util.Log.e("test", java.lang.String.valueOf(mp.getDuration()));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isTermsAndConditiionLoaded)) {
        webContentDisplayScreenlet.load();
    }
    goRight();
}

public static int getTextSizeId(android.content.Context context) {
    return com.project.nghicv.readingbook.util.PreferenceUtil.getUserPreference(context, com.project.nghicv.readingbook.util.PreferenceUtil.PREF_NOTIFICATION_ID, java.lang.Integer.class, 0);
}

private void loadViews() {
    mVideoView = ((android.widget.VideoView) (findViewById(R.id.videoView)));
    mVideoView.setFocusable(false);
    mVideoView.setFocusableInTouchMode(false);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.appbrain.AppBrain.init(this);
    setContentView(R.layout.activity_main);
    setSupportActionBar(((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar))));
    init();
}

@java.lang.Override
public void bitmapwork(android.graphics.Bitmap bitmap) {
    if (bitmap != null) {
        builder.setLargeIcon(bitmap);
    }else {
        builder.setLargeIcon(com.rks.musicx.misc.utils.ArtworkUtils.getDefaultArtwork(getApplicationContext()));
    }
}

public void removeMarker(java.lang.String id) {
    com.google.android.gms.maps.model.Marker marker = mapMarkers.get(id);
    if (marker != null) {
        marker.remove();
    }
}

public abstract rx.Observable<org.researchstack.skin.DataResponse> signUp(android.content.Context context, java.lang.String email, java.lang.String username, java.lang.String password);

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.hajir.morgenlandqr.DbHelper.SQL_CREATE);
    db.execSQL(com.example.hajir.morgenlandqr.DbHelper.SQL_CREATE2);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    updateParameterItem();
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(parameterItem.name);
}

public static void onCreate(android.support.v4.app.FragmentActivity activity) {
    com.woodblockwithoutco.beretained.FieldsRetainer<android.support.v4.app.FragmentActivity> retainer = com.woodblockwithoutco.beretained.BeRetained.findFieldsRetainer(activity.getClass());
    retainer.onCreate(activity);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.e(com.crosskr.flint.webview.browser.BrowserActivity.TAG, "onStart");
    mFlintVideoManager.onStart();
}

public void config(com.jiang.android.multirecyclerview.Adapter adapter) {
    config(null, adapter);
}

@java.lang.Override
public void onItemClear() {
    super.onItemClear();
    layout.setAlpha(1.0F);
    android.util.Log.e("FINISH DRAG", "FINISH DRAG");
}

@java.lang.Override
public void run() {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(hu.xmister.hermestool.OtherFragment.a);
    builder.setTitle(getString(R.string.missing_binaries)).setMessage(getString(R.string.missing_binaries_message)).show();
}

@java.lang.Override
@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public void onFocusChange(android.view.View view, boolean focused) {
    if ((mTrigger) == (net.xpece.material.floatinglabel.AbstractFloatingLabelView.Trigger.FOCUS)) {
        onOwnerViewFocusChanged(focused);
    }
}

public boolean isExternalStorageReadable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if ((Environment.MEDIA_MOUNTED.equals(state)) || (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state))) {
        return true;
    }
    return false;
}

@java.lang.Override
public int getCount() {
    android.content.SharedPreferences sharedPref = mContext.getSharedPreferences("Ride_id", Context.MODE_PRIVATE);
    int temp = sharedPref.getInt("ride_id", (-1));
    return temp;
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mCallbacks = ((org.onebusaway.android.ui.NavigationDrawerFragment.NavigationDrawerCallbacks) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException("Activity must implement NavigationDrawerCallbacks.");
    }
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    service.seekTo((i * 1000));
    updateUI();
}

@java.lang.Override
public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    java.lang.System.out.println("OWOOWOWOOWOWOWOOOOOOOOOOOOOOOOWOWOOWOOOWOOWOOWOOOOOWOOOW");
    return false;
}

@java.lang.Override
public void onReachedMaxAppCacheSize(long requiredStorage, long quota, android.webkit.WebStorage.QuotaUpdater quotaUpdater) {
    mWebChromeClient.onReachedMaxAppCacheSize(requiredStorage, quota, quotaUpdater);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (BtnViewHeatMap.isChecked())
        addHeatMap();
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    cn.ucai.fulicenter.utils.L.i("mingyue", "MainActivity.onCreate()");
    initView();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    background_color = this.dialog.getColor();
    setColors(font_color, background_color);
}

@java.lang.Override
public void set(java.lang.String ssid, java.lang.String psw) {
    mCenter.cSetSSID(ssid, psw);
    android.widget.Toast.makeText(this, "配置成功", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    com.arksine.resremote.ArduinoCom.ArduinoMessage message = parseBytes(((byte[]) (msg.obj)), msg.arg1);
    uInput.processInput(message.command, message.point);
}

public static void log(java.lang.String origin, java.lang.String message) {
    java.io.File logFile = null;
    if (mega.privacy.android.app.utils.Util.DEBUG) {
        nz.mega.sdk.MegaApiAndroid.log(MegaApiAndroid.LOG_LEVEL_INFO, message, origin);
    }
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    android.widget.Toast.makeText(getApplicationContext(), "Provider working", Toast.LENGTH_SHORT).show();
    mTaskCursorAdapter.swapCursor(data);
}

@java.lang.Override
public void run() {
    android.content.Intent newActivity = new android.content.Intent(this, com.itproject.android.androidtvsample.ListActivity.class);
    newActivity.putExtra("UNAME", username);
    newActivity.putExtra("HOURS", numberofhours);
    finish();
    startActivity(newActivity);
}

@java.lang.Override
public void onError(com.facebook.FacebookException exception) {
    android.util.Log.i(com.example.ivan.champy_v2.activity.LoginActivity.TAG, ("onError: " + exception));
}

public void layoutOnClickImpl(android.view.View v) {
    controller.onClickPeer(v);
}

private static java.io.File getAppropriateStorageDir(final android.content.Context context) {
    java.io.File storageDir = com.example.nicco.inspectionReviewManager.FileIO.getExternalStorageDir();
    if (storageDir == null) {
        storageDir = com.example.nicco.inspectionReviewManager.FileIO.getInternalCachedStorageDir(context);
    }
    return storageDir;
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.refresh_menu_items, menu);
    super.onCreateOptionsMenu(menu);
    return true;
}

public static java.lang.String getPostPath(android.content.Context context, android.net.Uri uri) throws edu.mit.mobile.android.locast.data.NoPublicPath {
    return edu.mit.mobile.android.locast.data.MediaProvider.getPublicPath(context, uri, null, true);
}

public com.benny.openlauncher.core.model.IconLabelItem withOnClickListener(@android.support.annotation.Nullable
android.view.View.OnClickListener listener) {
    this.listener = listener;
    return ((com.benny.openlauncher.core.model.IconLabelItem) (this));
}

public static java.lang.String fixupUrl(java.lang.String uri) {
    if (android.text.TextUtils.isEmpty(uri))
        return uri;
    
    return org.chromium.chrome.browser.UrlUtilities.nativeFixupUrl(uri, null);
}

@java.lang.Override
public void run() {
    if (o != null) {
        final me.eycia.msghub_android.ChanInfo[] cs = ((me.eycia.msghub_android.ChanInfo[]) (o));
        mAllChans.Update(cs);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
}

@java.lang.Override
public boolean handleUpOrCancelTouchEvent(android.view.MotionEvent event) {
    enterState(mBounceBackState);
    return false;
}

@android.webkit.JavascriptInterface
public void ringing(final java.lang.Long intensity) {
    mMediaStorage.ringing(intensity);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((R.id.action_refresh) == (item.getItemId())) {
        updateWeather();
        android.util.Log.d("Fragment", "execute");
        return true;
    }
    return super.onOptionsItemSelected(item);
}

public static com.ly.badiane.budgetmanager_finalandroidproject.divers.Mois extractMois(java.util.Calendar calendar) {
    int m = calendar.get(java.util.Calendar.MONTH);
    int a = calendar.get(java.util.Calendar.YEAR);
    return new com.ly.badiane.budgetmanager_finalandroidproject.divers.Mois(m, a);
}

public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
    }
    android.util.Log.d("Sheldon", "surfaceDestroyed() is called");
}

public static boolean isExternalStorageReadable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if ((Environment.MEDIA_MOUNTED.equals(state)) || (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state))) {
        return true;
    }
    return false;
}

