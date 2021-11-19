@butterknife.Optional
@butterknife.OnClick(value = R.id.debugSettings)
void onDebugSettings() {
    if ((debugSettingsClass) == null)
        return ;
    
    android.content.Intent intent = new android.content.Intent(this, debugSettingsClass);
    startActivity(intent);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.android.debug.hv.ViewServer.get(this).setFocusedWindow(this);
    buildAnim(this);
}

@java.lang.Override
public void handleMessage(android.os.Message message) {
    switch (message.what) {
        case com.example.blockwatch.BlockwatchFragment.MSG_UPDATE_TIME :
            pV.setCurrentHash(currentHash);
            pV.invalidate();
            break;
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    setScreen();
    setPlayerControls();
    setSongProgressSeekbar();
    setAlbumCoverImage();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.fragment_preference);
    configureCurrenciesPref();
}

@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    return true;
}

public void callBackFailed(com.mogujie.lever.calendarlever.core.ICallBack callback) {
    if (callback != null) {
        callback.onFailed();
    }
}

@java.lang.Override
public void endAnimation() {
    if (layout.isMovedOutSize()) {
        mDatas.remove(position);
        notifyDataSetChanged();
    }else {
        dragImageView.setVisibility(View.VISIBLE);
    }
}

public static com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache GetInstance() {
    if ((com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance) == null) {
        com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance = new com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache();
    }
    return com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance;
}

@java.lang.Override
public void onRebind(android.content.Intent intent) {
    super.onRebind(intent);
}

@java.lang.Override
public void onInput(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, java.lang.CharSequence input) {
    addStockQuote(input.toString().replaceAll("\\s", "").toUpperCase());
}

@java.lang.Override
public void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    if (bottom < oldBottom)
        mList.smoothScrollToPosition(ListView.FOCUS_DOWN);
    
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("GStreamer", ("Surface created: " + (surfaceHolder.getSurface())));
}

@java.lang.Override
public void success(kat.android.com.movielist.rest.pojo.userdatails.Token token, retrofit.client.Response response) {
    userAuthentication(token.getRequest_token());
}

public static com.flaredown.flaredownApp.Checkin.CheckInSummaryFragment newInstance() throws org.json.JSONException {
    com.flaredown.flaredownApp.Checkin.CheckInSummaryFragment fragment = new com.flaredown.flaredownApp.Checkin.CheckInSummaryFragment();
    return fragment;
}

public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    currentState = manager.getActiveGameState();
    if ((currentState) == null)
        return false;
    
    currentState.onTouchEvent(v, event);
    return true;
}

@java.lang.Override
public void done(java.lang.Object object) {
    java.lang.Integer rowsAffected = ((java.lang.Integer) (object));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    sharedpreferences = getSharedPreferences(io.rasprovers.remotus.activities.Settings.MyPREFERENCES, Context.MODE_PRIVATE);
}

@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.widget.Toast.makeText(this, ("Error in REST service: " + (t.toString())), Toast.LENGTH_LONG).show();
}

@android.support.annotation.CheckResult
public com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(A1 arg) {
    return super.invoke(arg);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    if ((s.getSelectedItem()) == null)
        return ;
    
    counter.load(s.getSelectedItem().toString());
}

public void setBackgroundResource(int resId) {
    mTargetView.setBackgroundResource(resId);
}

public void addRandomArticle() {
    getMvpView().setRandomArticle(this.mData.get(1));
}

public static com.exyui.android.debugbottle.components.DTInstaller install(java.lang.Object app) {
    android.util.Log.d(com.exyui.android.debugbottle.components.DTInstaller.TAG, "install");
    return new com.exyui.android.debugbottle.components.DTInstaller();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    api = com.tencent.mm.sdk.openapi.WXAPIFactory.createWXAPI(this, com.wanke.tv.wxapi.WXEntryActivity.WX_APP_ID, false);
    api.registerApp(com.wanke.tv.wxapi.WXEntryActivity.WX_APP_ID);
}

public com.anirudh.buttertoast.ButterToast.Builder setTextColor(@android.support.annotation.ColorInt
int textColor) {
    this.textColor = textColor;
    return this;
}

@java.lang.Override
public void run() {
    org.hisp.dhis.android.sdk.controllers.DhisService.loadInitialData(this);
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception e) {
    android.widget.Toast.makeText(this, "uploading error make shure tha you have internet connection", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onPostExecute(java.lang.String str) {
}

public static boolean supportsDrop(java.lang.Object info) {
    return info instanceof com.android.chavah.LauncherAppWidgetInfo;
}

@java.lang.Override
public void onReceivedTouchIconUrl(android.webkit.WebView view, java.lang.String url, boolean precomposed) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onReceivedTouchIconUrl(view, url, precomposed);
    }
}

public com.danimahardhika.cafebar.CafeBar.Builder negativeText(@android.support.annotation.StringRes
int res) {
    return negativeText(mContext.getResources().getString(res));
}

public static com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please stop() {
    return new com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please(com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please.END, com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please.NULL_REQUEST_CODE);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    getFragmentManager().popBackStack();
}

public java.lang.String getDeviceId() {
    try {
        return getITelephony().getDeviceId();
    } catch (android.os.RemoteException ex) {
        return null;
    } catch (java.lang.NullPointerException ex) {
        return null;
    }
}

@java.lang.Override
public void onStateReady() {
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((!(isSettlingProcess)) && (isMediaPlayerStarted)) {
        ominext.com.readmestories.fragments.ReadingBookFragment fragment = mPagerAdapter.getFragment(mViewPager.getCurrentItem());
        fragment.onPlayClick();
    }
}

@java.lang.Override
public void run() {
    notifyInterfaceClassActivity(params.type, DataConnectionRealTimeInfo.DC_POWER_STATE_LOW, android.os.SystemClock.elapsedRealtimeNanos(), true);
}

@java.lang.Deprecated
public void enableDebugLog(boolean enabled) {
    android.util.Log.w(com.google.example.games.basegameutils.GameHelper.TAG, ("GameHelper.enableDebugLog(boolean,String) is deprecated. " + "Use GameHelper.enableDebugLog(boolean)"));
}

public abstract void doBusiness(android.content.Context mContext, android.view.View view);

@java.lang.Override
public void onClick(android.view.View view) {
    com.alphan.mcan.snoozecharity.services.AlarmRingService.startSnoozeAlarmIntent(view.getContext(), currentAlarm.getId(), snoozeDurationInMinutes);
    finish();
}

public void onBackPressed() {
    super.onBackPressed();
    (com.health.openscale.gui.SettingsActivity.backPressed)++;
    if ((com.health.openscale.gui.SettingsActivity.backPressed) == 1) {
        MainActivity.mSectionsPagerAdapter.notifyDataSetChanged();
        com.health.openscale.gui.SettingsActivity.backPressed = 0;
    }
}

private void setLoggedIn(boolean loggedIn) {
    if (loggedIn) {
        android.content.Intent in = new android.content.Intent(this, com.activity.nikhilesh.dropphoto.PictureActivity.class);
        startActivity(in);
        finish();
    }
}

public static ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer someSecondsBack(int secondsBackToStartTheSessionFrom) {
    return new ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer((-(java.lang.Math.abs((secondsBackToStartTheSessionFrom * 1000)))));
}

@java.lang.Override
public void onInterpretationTextClick(org.dhis2.android.dashboard.api.models.Interpretation interpretation) {
    org.dhis2.android.dashboard.ui.fragments.interpretation.InterpretationTextFragment.newInstance(interpretation.getId()).show(getChildFragmentManager());
}

public void setSurfaceSize(int width, int height) {
    synchronized(mSurfaceHolder) {
        mCanvasWidth = width;
        mCanvasHeight = height;
        mBackgroundImage = mBackgroundImage.createScaledBitmap(mBackgroundImage, width, height, true);
    }
}

private boolean activityIsStartingForTheFirstTime(android.os.Bundle savedInstanceState) {
    return savedInstanceState == null;
}

@java.lang.Override
public void onCreate() {
    android.util.Log.d(com.freddykilo.smartdoor.AutoButton.TAG, "AutoButton.onCreate()");
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    dialog.dismiss();
    finish();
}

public void addFooterView(android.view.View view) {
    if (view == null) {
        throw new java.lang.RuntimeException("footer is null");
    }
    removeFooterView();
    mFooterViews.add(view);
}

private void SetupList2(java.util.Date date) {
    cursor = doableItemValueTableAdapter.getItems(date);
    adapter.changeCursor(cursor);
}

public static rx.Observable<java.util.List<com.example.alexander.yandexmoneyshops.data.entity.ShopEntity>> getShopsFromWeb() {
    return com.example.alexander.yandexmoneyshops.data.web.YandexMoneyShopsFetcher.sYandexMoneyShopsService.getShops();
}

private void addLineToFavorites() {
    team5.capstone.com.mysepta.Managers.FavoritesManager.addRailLineToFavorites(start, end);
    mOptionsMenu.findItem(R.id.favoriteIcon).setIcon(R.drawable.star_icon);
    favorite = true;
}

@java.lang.Override
public void gtError() {
    if ((gtListener) != null) {
        gtError();
    }
}

public void buttonOnClickHelpScreen1(android.view.View view) {
    android.content.Intent iphoneDesignActivityIntent = new android.content.Intent(this, com.example.meghanchua.remoteapp.IphoneHelpScreen.class);
    iphoneDesignActivityIntent.putExtra("user", user);
    this.startActivity(iphoneDesignActivityIntent);
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    setIntent(intent);
}

@java.lang.Override
public void addOverlay(android.view.ViewGroup sceneRoot, android.view.View overlayView, int screenX, int screenY) {
    android.transitions.everywhere.utils.ViewOverlayPreJellybean viewOverlay = android.transitions.everywhere.utils.ViewOverlayPreJellybean.getOverlay(sceneRoot);
    if (viewOverlay != null) {
        viewOverlay.addView(overlayView, screenX, screenY);
    }
}

@java.lang.Override
public void onResume() {
    super.onResume();
    updateUI();
}

@java.lang.Override
public void onClick(android.view.View view) {
    lb.reset();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (getShowsDialog()) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }else {
        return fillView(inflater, container, savedInstanceState);
    }
}

@java.lang.Override
public void onStart(java.lang.String utteranceId) {
}

public static java.lang.String render(android.content.Context ctx, java.util.Map<java.lang.String, java.lang.String> params) {
    java.lang.String jsonString = com.nuvolect.securesuite.webserver.SyncRest.parse(ctx, params);
    return jsonString;
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.frostwire.android.gui.services.Engine.instance().stopServices(false);
    com.frostwire.android.gui.util.UIUtils.openFile(context, com.frostwire.android.gui.SoftwareUpdater.getUpdateApk().getAbsolutePath(), Constants.MIME_TYPE_ANDROID_PACKAGE_ARCHIVE, false);
    newSoftwareUpdaterDialog.dismiss();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent(activity, org.give2peer.give2peer.activity.RegistrationActivity.class);
    activity.startActivity(intent);
}

private java.io.BufferedReader openTextFile(java.lang.String name) throws java.io.IOException {
    android.content.res.AssetManager am = fragment.getActivity().getAssets();
    return new java.io.BufferedReader(new java.io.InputStreamReader(am.open(name)));
}

static void setLocale(android.content.Context context) {
    com.dev.amazonadvisor.AmazonLocaleUtils.context = context;
    com.dev.amazonadvisor.AmazonLocaleUtils.locale = com.dev.amazonadvisor.AmazonLocaleUtils.getLocale(context);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void openMenu() {
}

@android.annotation.SuppressLint(value = "NewApi")
public void insert(final java.net.URI uri, final java.util.Map<java.lang.String, java.lang.Object> values) {
    org.toilelibre.libe.athg2sms.bp.SmsInserter.insert(uri, values, this.sourceActivity, this.sourceActivity.getContentResolver());
}

@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((rowItem.getEntry()) != null) {
        toggleChecked(position, holder.checkImageView);
    }
}

public void requestNewInterstitial() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    mInterstitialAd.loadAd(adRequest);
}

@java.lang.Override
public int onStartCommand(final android.content.Intent intent, final int flags, final int startId) {
    invalidateNotificationsQueue();
    return START_STICKY;
}

@java.lang.Override
public void onClick(android.view.View v) {
    disableall();
}

public void turnOffSync() {
    turnOffSync(mAccount);
}

@java.lang.Override
public void onFailure(java.lang.Throwable t) {
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
    butterknife.ButterKnife.bind(this);
    setupActivityComponent(com.example.sf.myapplication.MyApplication.getsInstance().getAppComponent());
    init();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mAdapter = new com.android1.homework3.msg.adapter.ChannelListAdapter(getActivity(), mChannels);
    setListAdapter(mAdapter);
}

@java.lang.Override
public android.content.Loader<java.util.List<com.example.android.booklistingproject_udacity.Book>> onCreateLoader(int i, android.os.Bundle bundle) {
    java.lang.String url = updateURL(mKeyword);
    return new com.example.android.booklistingproject_udacity.BookLoader(this, url);
}

@java.lang.Override
public void goToCourseUrl(java.lang.String url) {
    android.content.Intent mainIntent = com.epsilon.screens.main.MainActivity.makeIntent(getActivity(), true, url);
    startActivity(mainIntent);
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    hideProgress();
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.content.SharedPreferences sh = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    com.ecsm.android.movie.ui.ActivityBrows.prefWifi = sh.getBoolean(getString(R.string.pref_key_over_wifi), false);
    if (com.ecsm.android.movie.ui.ActivityBrows.refreshStatus)
        checkConnection();
    
    com.ecsm.android.movie.ui.ActivityBrows.refreshStatus = false;
}

public static android.net.Uri appendProfileWithDefault(final java.lang.String profile, final android.net.Uri uri) {
    if (profile == null) {
        return org.mozilla.gecko.db.DBUtils.appendProfile(GeckoProfile.DEFAULT_PROFILE, uri);
    }
    return org.mozilla.gecko.db.DBUtils.appendProfile(profile, uri);
}

@java.lang.Override
public void onLoadingComplete(java.lang.String imageUri, android.view.View view, android.graphics.Bitmap loadedImage) {
    pic.setImageBitmap(loadedImage);
    pic.setScaleType(ImageView.ScaleType.CENTER_CROP);
}

@java.lang.Override
public void updateHaverStatus(@android.support.annotation.NonNull
long desireId, @android.support.annotation.NonNull
long userId, @android.support.annotation.NonNull
int status, @android.support.annotation.NonNull
wanthavers.mad.cs.fau.de.wanthavers_android.data.source.haver.UpdateHaverStatusCallback callback) {
    callback.onUpdateFailed();
}

public void setImg(byte[] img) {
    this.img = img;
    if (img == null)
        bmp = null;
    else
        bmp = android.graphics.BitmapFactory.decodeByteArray(img, 0, img.length);
    
}

public void displayStepDetailView(eu.javimar.bakingapp.model.Step step) {
    mStep = step;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.PAGE_STATE, mPage);
    outState.putBoolean(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.TRANSLATED_DISMISSED, mTranslatedDismissed);
}

@java.lang.Override
public void nativeMaintainHome() {
    android.content.Intent intent = new android.content.Intent(this, tw.com.inx.ipm.view.CheckHomeActivity.class);
    startActivity(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_results);
    setUpToolbar(getString(R.string.title_result));
    setUpTest();
    setUpViews();
}

@java.lang.Override
@org.robolectric.annotation.Implementation
public void unbindService(android.content.ServiceConnection conn) {
    if (unbindServiceShouldThrowIllegalArgument) {
        throw new java.lang.IllegalArgumentException();
    }
    super.unbindService(conn);
}

@java.lang.Override
public void navigate(java.lang.Class<?> cls) {
    navigate(cls, com.kareem.mynursery.MainActivity.LOGIN_ACTIVITY_RESULT_CODE);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.cn6000.callrec.CallRecorderService.TAG, "service destory");
    this.stopRecording();
    this.cntx = null;
    super.onDestroy();
}

@java.lang.Override
protected void onStop() {
    super.onStop();
}

public void deleteItems() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(helper.SQLiteHandlerItem.TABLE, null, null);
    db.close();
    CreateTable();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i(edu.ucla.nesl.wearcontext.MainActivity.TAG, "onResume() called");
}

@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    send(((edu.byui.cs246.scandroid.Scanner) (o)).getScan());
}

@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
    setUpCamera(width, height);
    openCamera();
}

