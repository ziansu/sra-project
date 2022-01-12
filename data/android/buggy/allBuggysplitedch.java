@butterknife.Optional
@butterknife.OnClick(value = R.id.debugSettings)
void onDebugSettings() {
    android.content.Intent intent = new android.content.Intent(this, debugSettingsClass);
    startActivity(intent);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.android.debug.hv.ViewServer.get(this).setFocusedWindow(this);
    new com.example.ivan.champy_v2.activity.MainActivity.DownloadImageTask().buildAnim(this);
}

@java.lang.Override
public void handleMessage(android.os.Message message) {
    switch (message.what) {
        case com.example.blockwatch.BlockwatchFragment.MSG_UPDATE_TIME :
            pV.setCurrentHash(currentHash);
            pV.invalidate();
            android.widget.Toast.makeText(getContext(), "Refresh", Toast.LENGTH_SHORT).show();
            break;
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.v("PREPARED", "recieved prepared");
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
    configureNotificationsCB();
}

@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    mWebView.loadUrl(url);
    return true;
}

public void callBackFailed(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
com.mogujie.lever.calendarlever.core.ICallBack callback) {
    callback.onFailed();
}

@java.lang.Override
public void endAnimation() {
    if (layout.isMovedOutSize()) {
        mDatas.remove(position);
        notifyDataSetChanged();
    }else {
        android.util.Log.d("d", "-------- : ----------- movedOut");
        dragImageView.setVisibility(View.VISIBLE);
    }
}

public static com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache GetInstance(android.content.Context context) {
    if ((com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance) == null) {
        com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.ctx = context;
        com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance = new com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache();
    }
    return com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance;
}

@java.lang.Override
public void onRebind(android.content.Intent intent) {
    super.onRebind(intent);
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onRebind");
}

@java.lang.Override
public void onInput(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, java.lang.CharSequence input) {
    addStockQuote(input.toString().replaceAll("\\s", ""));
}

@java.lang.Override
public void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    mList.smoothScrollToPosition(ListView.FOCUS_DOWN);
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("GStreamer", ("Surface created: " + (surfaceHolder.getSurface())));
    nativeSurfaceInit(surfaceHolder.getSurface());
}

@java.lang.Override
public void success(kat.android.com.movielist.rest.pojo.userdatails.Token token, retrofit.client.Response response) {
    mToken = token.getRequest_token();
    userAuthentication();
}

public static com.flaredown.flaredownApp.Checkin.CheckInSummaryFragment newInstance() throws org.json.JSONException {
    com.flaredown.flaredownApp.Checkin.CheckInSummaryFragment fragment = new com.flaredown.flaredownApp.Checkin.CheckInSummaryFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.setArguments(args);
    return fragment;
}

public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    currentState = manager.getActiveGameState();
    currentState.onTouchEvent(v, event);
    return true;
}

@java.lang.Override
public void done(java.lang.Object object) {
    java.lang.Integer rowsAffected = ((java.lang.Integer) (object));
    com.pratilipi.mobile.android.util.Log.d(com.pratilipi.mobile.android.reader.textReader.bookmark.BookmarksListAdapter.TAG, ("Bookmark delete status : " + rowsAffected));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    sharedpreferences = getSharedPreferences(io.rasprovers.remotus.activities.Settings.MyPREFERENCES, Context.MODE_PRIVATE);
    java.lang.System.out.println(("====================>>" + (sharedpreferences.getString("Email", ""))));
}

@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.widget.Toast.makeText(this, ("Error in REST service: " + (t.getMessage())), Toast.LENGTH_LONG).show();
}

@android.support.annotation.CheckResult
com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(A1 arg1, A2 arg2);

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    counter.load(s.getSelectedItem().toString());
}

public void setBackgroundResource(int resId) {
    if ((mTargetView) instanceof android.widget.ImageView) {
        mTargetView.setBackgroundResource(resId);
    }
}

public void addRandomArticle() {
    android.util.Log.e(moizest89.geronimostudios.test.ui.main.MainPresenter.TAG, ("mData: " + (mData)));
    getMvpView().setRandomArticle(this.mData.get(1));
}

public com.exyui.android.debugbottle.components.DTInstaller install(java.lang.Object app) {
    android.util.Log.d(com.exyui.android.debugbottle.components.DTInstaller.TAG, "install");
    return this;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    api = com.tencent.mm.sdk.openapi.WXAPIFactory.createWXAPI(this, com.wanke.tv.wxapi.WXEntryActivity.WX_APP_ID, false);
    api.registerApp(com.wanke.tv.wxapi.WXEntryActivity.WX_APP_ID);
    api.handleIntent(getIntent(), this);
}

public com.anirudh.buttertoast.ButterToast.Builder setTextColor(@android.support.annotation.ColorInt
int textColor) {
    this.setTextColor(textColor);
    return this;
}

@java.lang.Override
public void run() {
    org.hisp.dhis.android.sdk.controllers.DhisService.loadInitialData(this);
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            showSelectProgramFragment();
        }
    });
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception e) {
    android.widget.Toast.makeText(this, "uploading error make shure tha you have internet connection", Toast.LENGTH_SHORT);
}

@java.lang.Override
protected void onPostExecute(java.lang.String str) {
    android.util.Log.e("resultHtml", ("resultHtml: " + str));
}

public static boolean supportsDrop(java.lang.Object info) {
    return ((info instanceof com.android.chavah.ShortcutInfo) || (info instanceof com.android.chavah.LauncherAppWidgetInfo)) || (info instanceof com.android.chavah.FolderInfo);
}

@java.lang.Override
public void onReceivedTouchIconUrl(android.webkit.WebView view, java.lang.String url, boolean precomposed) {
    mWebChromeClient.onReceivedTouchIconUrl(view, url, precomposed);
}

public com.danimahardhika.cafebar.CafeBar.Builder negativeText(@android.support.annotation.StringRes
int res) {
    mNegativeText = mContext.getResources().getString(res);
    return this;
}

public static com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please stop(android.content.Context context) {
    return new com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please(context, com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please.END, com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please.NULL_REQUEST_CODE);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (validate()) {
        submitEvent();
        getFragmentManager().popBackStack();
    }
}

public java.lang.String getDeviceId() {
    try {
        return getITelephony().getDeviceId();
    } catch (android.os.RemoteException ex) {
        return null;
    }
}

@java.lang.Override
public void onStateReady() {
    android.widget.Toast.makeText(this, "state ready", Toast.LENGTH_SHORT);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((!(isSettlingProcess)) && (!(isMediaPlayerStarted))) {
        ominext.com.readmestories.fragments.ReadingBookFragment fragment = mPagerAdapter.getFragment(mViewPager.getCurrentItem());
        fragment.onPlayClick();
    }
}

@java.lang.Override
public void run() {
    notifyInterfaceClassActivity(params.type, DataConnectionRealTimeInfo.DC_POWER_STATE_LOW, android.os.SystemClock.elapsedRealtimeNanos(), false);
}

@java.lang.Deprecated
public void enableDebugLog(boolean enabled, java.lang.String tag) {
    android.util.Log.w(com.google.example.games.basegameutils.GameHelper.TAG, ("GameHelper.enableDebugLog(boolean,String) is deprecated. " + "Use GameHelper.enableDebugLog(boolean)"));
    enableDebugLog(enabled);
}

public abstract void doBusiness(android.content.Context mContext);

@java.lang.Override
public void onClick(android.view.View view) {
    com.alphan.mcan.snoozecharity.services.AlarmManagerHelper.addToPendingDonation(getApplicationContext(), charityIndex, donationAmount);
    com.alphan.mcan.snoozecharity.services.AlarmRingService.startSnoozeAlarmIntent(view.getContext(), currentAlarm.getId(), snoozeDurationInMinutes);
    finish();
}

public void onBackPressed() {
    super.onBackPressed();
    android.util.Log.d("### ", "on back pressed setting activity ******************");
    (com.health.openscale.gui.SettingsActivity.backPressed)++;
    if ((com.health.openscale.gui.SettingsActivity.backPressed) == 1) {
        MainActivity.mSectionsPagerAdapter.notifyDataSetChanged();
        com.health.openscale.gui.SettingsActivity.backPressed = 0;
    }
}

private void setLoggedIn(boolean loggedIn) {
    if (loggedIn) {
        android.content.Intent in = new android.content.Intent(this, com.activity.nikhilesh.dropphoto.PictureActivity.class);
        in.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(in);
        finish();
    }
}

public static ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer someSecondsBack(int secondsBackToStartTheSessionFrom) {
    return new ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer((secondsBackToStartTheSessionFrom * 1000));
}

@java.lang.Override
public void onInterpretationTextClick(org.dhis2.android.dashboard.api.models.Interpretation interpretation) {
    org.dhis2.android.dashboard.ui.fragments.interpretation.InterpretationTextFragment.newInstance(interpretation).show(getChildFragmentManager());
}

public void setSurfaceSize(int width, int height) {
    synchronized(mSurfaceHolder) {
        mCanvasWidth = width;
        mCanvasHeight = height;
        mBackgroundImage = android.graphics.Bitmap.createScaledBitmap(mBackgroundImage, width, height, true);
    }
}

private boolean activityIsStartingForTheFirstTime(android.os.Bundle savedInstanceState) {
    return ((savedInstanceState == null) || (!(savedInstanceState.containsKey(com.popularmovies.popularmovies.activities.PopularMoviesActivity.KEY_MOVIES)))) || (!(favoriteMovieCursorWasSaved(savedInstanceState)));
}

@java.lang.Override
public void onCreate() {
    android.util.Log.d(com.freddykilo.smartdoor.AutoButton.TAG, "AutoButton.onCreate()");
    if (servicesOK()) {
        createGoogleApiClient().connect();
        com.freddykilo.smartdoor.BluetoothHelper.setup();
    }else {
        stopSelf();
    }
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    dialog.dismiss();
    sendString("abort");
    sendString("quit");
    finish();
}

public void addFooterView(android.view.View view) {
    if (view == null) {
        throw new java.lang.RuntimeException("footer is null");
    }
    if ((getFooterViewsCount()) > 0) {
        removeFooterView(getFooterView());
    }
    mFooterViews.add(view);
}

private void SetupList2(java.util.Date date) {
    android.database.Cursor cursor = doableItemValueTableAdapter.getItems(date);
    adapter.changeCursor(cursor);
}

public static rx.Observable<java.util.List<com.example.alexander.yandexmoneyshops.data.entity.ShopEntity>> getShopsFromWeb() {
    android.util.Log.i("_d", "WEB REQUEST");
    return com.example.alexander.yandexmoneyshops.data.web.YandexMoneyShopsFetcher.sYandexMoneyShopsService.getShops();
}

private void addLineToFavorites() {
    team5.capstone.com.mysepta.Managers.FavoritesManager.addRailLineToFavorites(start, end);
    mOptionsMenu.findItem(R.id.favoriteIcon).setIcon(R.drawable.star_icon);
    favorite = true;
    android.widget.Toast.makeText(this, "Added to Favorites", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onReceivedSslError(android.webkit.WebView view, android.webkit.SslErrorHandler handler, android.net.http.SslError error) {
    if ((gtListener) != null) {
        gtListener.gtError();
    }
}

public void buttonOnClickHelpScreen1(android.view.View view) {
    android.content.Intent iphoneDesignActivityIntent = new android.content.Intent(this, com.example.meghanchua.remoteapp.IphoneHelpScreen.class);
    iphoneDesignActivityIntent.putExtra("user", user);
    this.startActivity(iphoneDesignActivityIntent);
    finish();
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    android.util.Log.i(com.phuston.android.kyzr.TorchActivity.TAG, "onNewIntent called");
    setIntent(intent);
}

@java.lang.Override
public void addOverlay(android.view.ViewGroup sceneRoot, android.view.View overlayView, int screenX, int screenY) {
    android.transitions.everywhere.utils.ViewOverlayPreJellybean viewOverlay = android.transitions.everywhere.utils.ViewOverlayPreJellybean.getOverlay(sceneRoot);
    viewOverlay.addView(overlayView, screenX, screenY);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.widget.Toast.makeText(getActivity(), "onResume called", Toast.LENGTH_SHORT).show();
    updateUI();
}

@java.lang.Override
public void onClick(android.view.View view) {
    lb.reset();
    sucBtn.setEnabled(false);
    failedBtn.setEnabled(false);
    resetBtn.setEnabled(false);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (getShowsDialog()) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }else {
        return fillView(inflater, container);
    }
}

@java.lang.Override
public void onStart(java.lang.String utteranceId) {
    android.util.Log.d(((MD) + (LN)), "UtteranceProgressListener - onStart");
}

public static java.lang.String render(android.content.Context ctx, java.lang.String uniqueId, java.util.Map<java.lang.String, java.lang.String> params) {
    java.lang.String jsonString = com.nuvolect.securesuite.webserver.SyncRest.parse(ctx, uniqueId, params);
    return jsonString;
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.frostwire.android.gui.services.Engine.instance().stopServices(false);
    com.frostwire.android.gui.util.UIUtils.openFile(context, com.frostwire.android.gui.SoftwareUpdater.getUpdateApk().getAbsolutePath(), Constants.MIME_TYPE_ANDROID_PACKAGE_ARCHIVE);
    newSoftwareUpdaterDialog.dismiss();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent(activity, org.give2peer.give2peer.activity.RegistrationActivity.class);
    startActivity(intent);
}

private java.io.BufferedReader openTextFile(java.lang.String name) throws java.io.IOException {
    android.content.res.AssetManager am = fragment.getContext().getAssets();
    return new java.io.BufferedReader(new java.io.InputStreamReader(am.open(name)));
}

static void setLocale(android.app.Activity actitity) {
    com.dev.amazonadvisor.AmazonLocaleUtils.activity = actitity;
    com.dev.amazonadvisor.AmazonLocaleUtils.locale = com.dev.amazonadvisor.AmazonLocaleUtils.getLocale(actitity);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int mNavigationItemId = item.getItemId();
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void openMenu() {
    android.widget.Toast.makeText(mContext, "Menu is opened!", Toast.LENGTH_SHORT).show();
}

@android.annotation.SuppressLint(value = "NewApi")
public void insert(final java.net.URI uri, final java.util.Map<java.lang.String, java.lang.Object> values) {
    org.toilelibre.libe.athg2sms.bp.SmsInserter.insert(uri, values, this.sourceActivity.getContentResolver());
}

@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
    com.example.m.divis.ACRA.init(this);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((rowItem.getEntry()) != null) {
        toggleChecked(position1, holder.checkImageView);
    }
}

public void requestNewInterstitial() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice("B0CE4250758AE4B5BA9A7A7D491F75B3").build();
    mInterstitialAd.loadAd(adRequest);
}

@java.lang.Override
public int onStartCommand(final android.content.Intent intent, final int flags, final int startId) {
    android.widget.Toast.makeText(this, "notification service started", Toast.LENGTH_LONG).show();
    invalidateNotificationsQueue();
    return START_STICKY;
}

@java.lang.Override
public void onClick(android.view.View v) {
    disableall();
    CreateIcon(com.att.attcase.XayDungCase.iconDuocChon);
}

public void turnOffSync() {
    android.content.ContentResolver.setSyncAutomatically(mAccount, AUTHORITY, false);
}

@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    android.widget.Toast.makeText(getContext(), "failure", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
    butterknife.ButterKnife.bind(this);
    setupActivityComponent(com.example.sf.myapplication.MyApplication.getsInstance().getAppComponent());
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if ((mAdapter) == null) {
        mAdapter = new com.android1.homework3.msg.adapter.ChannelListAdapter(getActivity(), mChannels);
    }
    setListAdapter(mAdapter);
}

@java.lang.Override
public android.content.Loader<java.util.List<com.example.android.booklistingproject_udacity.Book>> onCreateLoader(int i, android.os.Bundle bundle) {
    java.lang.String url = updateURL(mKeyword.toString());
    return new com.example.android.booklistingproject_udacity.BookLoader(this, url);
}

@java.lang.Override
public void goToCourseUrl(java.lang.String url) {
    android.content.Intent mainIntent = com.epsilon.screens.main.MainActivity.makeIntent(getActivity(), MainActivity.COURSES_TAB_POSITION);
    startActivity(mainIntent);
    android.content.Intent browserIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(url));
    startActivity(browserIntent);
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    hideProgress();
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.content.SharedPreferences sh = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    com.ecsm.android.movie.ui.ActivityBrows.prefWifi = sh.getBoolean(getString(R.string.pref_key_over_wifi), true);
    if (com.ecsm.android.movie.ui.ActivityBrows.refreshStatus)
        checkConnection();
    
    com.ecsm.android.movie.ui.ActivityBrows.refreshStatus = false;
}

public static android.net.Uri appendProfileWithDefault(final java.lang.String profile, final android.net.Uri uri) {
    if (android.text.TextUtils.isEmpty(profile)) {
        return org.mozilla.gecko.db.DBUtils.appendProfile(GeckoProfile.DEFAULT_PROFILE, uri);
    }
    return org.mozilla.gecko.db.DBUtils.appendProfile(profile, uri);
}

@java.lang.Override
public void onLoadingComplete(java.lang.String imageUri, android.view.View view, android.graphics.Bitmap loadedImage) {
    pic.setImageBitmap(loadedImage);
    pic.setScaleType(ImageView.ScaleType.CENTER_CROP);
    fridgeView.findViewById(R.id.progress_load).setVisibility(View.GONE);
    pic.setVisibility(View.VISIBLE);
}

@java.lang.Override
public void updateHaverStatus(@android.support.annotation.NonNull
long desireId, @android.support.annotation.NonNull
long userId, @android.support.annotation.NonNull
de.fau.cs.mad.wanthavers.common.Haver haver, @android.support.annotation.NonNull
int status, @android.support.annotation.NonNull
wanthavers.mad.cs.fau.de.wanthavers_android.data.source.haver.UpdateHaverStatusCallback callback) {
    callback.onUpdateFailed();
}

public void setImg(byte[] img) {
    this.img = img;
    bmp = android.graphics.BitmapFactory.decodeByteArray(img, 0, img.length);
}

public void displayStepDetailView(eu.javimar.bakingapp.model.Step step) {
    mStep = step;
    android.util.Log.e(eu.javimar.bakingapp.view.RecipeStepDetailViewFragment.TAG, ("JAVIER en displayStepDetailView = " + (step.getmDescription())));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    musicAdapter = new de.teyzer.genie.ui.fragments.MusicListFragment.MusicAdapter();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putSerializable(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.PAGE_STATE, mPage);
    outState.putBoolean(augsburg.se.alltagsguide.utilities.ui.BasePageWebViewLanguageActivity.TRANSLATED_DISMISSED, mTranslatedDismissed);
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void nativeMaintainHome() {
    android.content.Intent intent = new android.content.Intent(this, tw.com.inx.ipm.view.CheckHomeActivity.class);
    startActivity(intent);
    this.finish();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_results);
    setUpToolbar(getString(R.string.title_result));
    setUpViews();
    setUpTest();
}

@java.lang.Override
@org.robolectric.annotation.Implementation
public void unbindService(android.content.ServiceConnection conn) {
    if (unbindServiceShouldThrowIllegalArgument) {
        throw new java.lang.IllegalArgumentException();
    }
}

@java.lang.Override
public void navigate(java.lang.Class<?> cls) {
    android.content.Intent intent = new android.content.Intent(this, cls);
    startActivityForResult(intent, com.kareem.mynursery.MainActivity.LOGIN_ACTIVITY_RESULT_CODE);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.cn6000.callrec.CallRecorderService.TAG, "service destory");
    this.stopRecording();
    this.unregisterReceiver();
    cntx = null;
    super.onDestroy();
}

@java.lang.Override
protected void onStop() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(msgReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(infoReceiver);
    super.onStop();
}

public void deleteItems() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(helper.SQLiteHandlerItem.TABLE, null, null);
    db.close();
    CreateTable();
    android.util.Log.d(helper.SQLiteHandlerItem.TAG, "Deleted all item info from sqlite");
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.widget.Toast.makeText(getActivity(), "recive", Toast.LENGTH_LONG).show();
    updateWeather();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i(edu.ucla.nesl.wearcontext.MainActivity.TAG, "onResume() called");
    android.content.SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
    mAlarmSet = sharedPref.getBoolean(getString(R.string.alarm_set), false);
}

@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    android.util.Log.i("Update: ", "Update Called");
    send(((edu.byui.cs246.scandroid.Scanner) (o)).getScan());
}

@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
    setUpCamera();
    openCamera();
}

