public static void updateViewWithCameraMaskValue(android.widget.ImageView view, com.omikronsoft.whatsthatcolor.component.CameraMask cameraMask, int value) {
    view.setImageBitmap(cameraMask.getMaskBitmap(value));
    com.omikronsoft.whatsthatcolor.utility.ViewUtility.viewLastUpdate.put(view, org.joda.time.DateTime.now());
}

public android.graphics.Paint getPaintColorFromUserId(java.lang.String userId) {
    return net.aboutgoods.remotedrawing.helper.PaintHelper.createPaintFromRGB(mUserList.get(userId));
}

private java.util.List<com.tdp2.androidclient.activity.BaseDrawerActivity.MenuEntry> getStartMenuEntries() {
    return com.google.common.collect.ImmutableList.of(buildHomeMenuEntry(), buildWallMenuEntry(), buildMapMenuEntry(), buildContactListMenuEntry());
}

@java.lang.Override
protected void drawValue(android.graphics.Canvas c, float val, float xPos, float yPos, com.github.mikephil.charting.utils.ValueFormatter formatter) {
    super.drawValue(c, val, xPos, (yPos + (mYOffset)), formatter);
}

@java.lang.Override
public void onRevMobRewardedVideoFinished() {
    android.util.Log.d(com.cranberrygame.cordova.plugin.ad.revmob.RevMobPluginOverlap.LOG_TAG, java.lang.String.format("%s", "onRevMobRewardedVideoFinished"));
    org.apache.cordova.PluginResult pr = new org.apache.cordova.PluginResult(PluginResult.Status.OK, "onRewardedVideoAdHidden");
    pr.setKeepCallback(true);
    plugin.getCallbackContextKeepCallback().sendPluginResult(pr);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    savedInstanceState.putString(Constants.SavedInstanceState.Characters.LAST_ITEM_SEARCHED, java.lang.String.valueOf(searchView.getQuery()));
}

@java.lang.Override
public android.app.Fragment getItem(int position) {
    mCursor.moveToPosition(position);
    return com.example.xyzreader.ui.ArticleDetailFragment.newInstance(mCursor.getLong(ArticleLoader.Query._ID));
}

@java.lang.Override
public void onClick(android.view.View view) {
    new net.alhazmy13.hijridatepicker.HijriCalendarDialog.Builder(this).setOnDateSetListener(this).setMinMaxHijriYear(1430, 1450).setMinMaxGregorianYear(2013, 2020).setUILanguage(HijriCalendarDialog.Language.English).setMode(HijriCalendarDialog.Mode.Hijri).show();
}

public static int timeBetweenInDays(long prevDate) {
    long diff = (java.lang.System.currentTimeMillis()) - prevDate;
    diff /= android.text.format.DateUtils.DAY_IN_MILLIS;
    return ((int) (diff));
}

@java.lang.Override
public void onDrawerStateChanged(int newState) {
    android.util.Log.v("Sokolov", ("onDrawerStateChanged " + newState));
}

@java.lang.Override
protected void onPause() {
    android.util.Log.d(com.cross.CrossActivity.TAG, "onPause");
    super.onPause();
    if (com.cross.CrossActivity.cross_initialized) {
        com.cross.CrossActivity.cross.Suspend();
        renderer.onPause();
    }
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    setupProfilePicture(view);
    setupButton(view);
    setupLoginButton(view);
    setupMessageText(view);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int userDays = java.lang.Integer.parseInt(userDaysNumber);
    clearChart();
    searchSingleCurrencyLastRates(singleCurrencyCode, userDays, singleMidRate);
    android.util.Log.d(com.example.android.currencyobserver.ChartActivity.LOG_TAG, java.lang.String.valueOf(userDays));
}

@java.lang.Override
public void onClick(android.view.View view) {
    changeToolbar(null, 1);
    setParams(0);
    isInflate = true;
}

public void launch(android.view.View view) {
    android.util.Log.d(com.vibejukebox.jukebox.activities.MusicParameterActivty.TAG, " Start Playlist Launch ");
    if (mIsArtistRadio)
        requestArtistRadio();
    else
        requestVibedPlaylist();
    
}

@org.mozilla.gecko.annotation.WrapForJNI
public org.mozilla.gecko.media.HlsVideoInfo GetVideoInfo(int trackNumber) {
    if (org.mozilla.gecko.media.GeckoHlsSampleGetter.DEBUG)
        android.util.Log.d(org.mozilla.gecko.media.GeckoHlsSampleGetter.LOGTAG, "[HasTrackType]");
    
    vInfo = new org.mozilla.gecko.media.HlsVideoInfo();
    return vInfo;
}

public void validateInput(android.view.View v) {
    listener.onTextNameChanged(getPosition(), etNameInput);
}

public void onClickTrim(android.view.View view) {
    isRunning = false;
    sendCommand(de.hhn.munz.ardrone2.ATCommand.trim(), false);
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (mHelper.handleActivityResult(requestCode, resultCode, data)) {
        return ;
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    trinityconnect.android.bignerdranch.com.trinityconnect.EventLab.get(getActivity()).updateEvent(mEvent);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && ((mProgressAnimator) != null)) {
        mProgressAnimator.cancel();
        mProgressAnimator = null;
    }
}

public void drawCard(com.aause2s15.gruppe3.cheatingandroid.CardDeck cardDeck) {
    cardDeck.drawTopCard();
    com.aause2s15.gruppe3.cheatingandroid.Card currentCard = cardDeck.drawTopCard();
    this.playerCards.add(currentCard);
    this.sortPlayerCards();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent serviceUpdateIntent = new android.content.Intent(getApplicationContext(), com.wojtechnology.sunami.TheBrain.class);
    serviceUpdateIntent.setAction(TheBrain.UPDATE_SETTINGS);
    startService(serviceUpdateIntent);
    finish();
}

@java.lang.Override
public android.content.Intent buildVoiceRecognitionIntent() {
    android.content.Intent intent = new android.content.Intent(android.speech.RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
    intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
    intent.putExtra(RecognizerIntent.EXTRA_PROMPT, getActivity().getString(R.string.speak_now));
    return intent;
}

@java.lang.Override
public void onLoadError() {
    super.onLoadError();
    if ((mImageView) != null) {
        mImageView.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(getContext(), R.color.light_gray));
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    pdialog.dismiss();
    check = false;
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences sharedPref = getPreferences(ru.caustic.lasertag.ui.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putBoolean("bridge_bluetooth_autoconnect", switchRememberDevice.isChecked());
}

@java.lang.Override
public void onItemClick(int position) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("url", albumList.get(position).getUrl());
    goToNext(storm.magicspace.activity.album.WebActivity.class, bundle);
}

private void setFullscreenFlags(boolean fullscreen) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        int fullscreenFlags = (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN);
        setSystemUiFlags(fullscreenFlags, fullscreen);
    }
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    com.techfly.liutaitai.util.Utility.getScreenSize(activity);
    mActivity = ((com.techfly.liutaitai.util.activities.CitySelectActivity) (activity));
    mIsFromMainActivity = mActivity.getIntent().getBooleanExtra(IntentBundleKey.REDIRECT_TYPE, false);
}

@java.lang.Override
protected java.lang.CharSequence queryValue() {
    android.net.Uri rideUri = getRideUri();
    if (rideUri == null)
        return "";
    
    return org.jraf.android.bikey.common.UnitUtil.formatSpeed(((float) (org.jraf.android.bikey.backend.log.LogManager.get().getAverageMovingSpeed(rideUri))));
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), com.example.justine.taragala.SignIn.class);
    startActivityForResult(intent, 0);
    finish();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dashboard);
    this.bindUi();
    this.mCurrentUser = this.mSession.getCurrentUser();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i(com.example.eurka.comp90018.MyIntentService.TAG, "starting!!");
    android.util.Log.i(com.example.eurka.comp90018.MyIntentService.TAG, "THIS WAS HIT IN THE BACKGROUND SERVICE");
    startLogging();
    return 0;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (((currentValue) > (minValue)) && (((currentValue) - (stepValue)) > (minValue))) {
        currentValue -= stepValue;
        updateCurrentValue();
    }
}

@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    java.lang.System.out.println("CaptureGestureListener");
    return (onTap(e.getRawX(), e.getRawY())) || (super.onSingleTapConfirmed(e));
}

static long getInstallDate(android.content.Context context) {
    return hotchemi.android.rate.PreferenceHelper.getPreferences(context).getLong(hotchemi.android.rate.PreferenceHelper.PREF_KEY_INSTALL_DATE, new java.util.Date().getTime());
}

public void onSharedPreferenceChanged(android.content.SharedPreferences prefs, java.lang.String key) {
    switch (key) {
        case com.af.synapse.Settings.PREF_THEME :
            {
                com.af.synapse.Settings.theme = null;
                com.af.synapse.Settings.setWallpaper(Utils.mainActivity);
                com.af.synapse.Settings.setWallpaper(Utils.settingsActivity);
                break;
            }
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    refreshFxUi(net.atomarea.flowx.ui.FxUi.State.SINGLE_CONVERSATION, false, (MessageCountToShow + 30));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((armor) > 0)
        (armor)--;
    
    updateValues();
}

@com.facebook.react.bridge.ReactMethod
public void sharedInstanceWithToken(java.lang.String apiToken) {
    this.mixpanel = com.mixpanel.android.mpmetrics.MixpanelAPI.getInstance(this.reactContext, apiToken);
    android.util.Log.d("mixpanel", "sharedInstanceWithToken");
}

private void placeView(android.content.Context context) {
    if (((mMenuView) == null) || ((mContentView) == null)) {
        throw new java.lang.NullPointerException("The content and menu can not be null!");
    }
    addView(mContentView, 0);
    addView(mMenuView, 1);
}

@java.lang.Override
public void onChartTranslate(android.view.MotionEvent me, float dX, float dY) {
    android.util.Log.i("Translate / Move", ((("dX: " + dX) + ", dY: ") + dY));
}

@java.lang.Override
public void onSearchResultDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.PlayList> playLists) {
    if (playLists == null) {
        android.widget.Toast.makeText(this, getResources().getString(R.string.search_alert), Toast.LENGTH_LONG).show();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    config.useAccelerometer = false;
    config.useWakelock = true;
    initialize(new com.scarlettapps.skydiver3d.Skydiver3D(), config);
}

@java.lang.Override
public boolean shouldShow(android.content.SharedPreferences p) {
    de.tum.in.tumcampusapp.auxiliary.Utils.log((("CountUnansweredQuesti: " + (manager.getUnansweredQuestions().getCount())) + " "));
    return (manager.getUnansweredQuestions().getCount()) >= 1;
}

@java.lang.Override
public void onLeftCardExit(java.lang.Object dataObject) {
    if ((list.size()) == 0)
        android.widget.Toast.makeText(this, "no more users!", Toast.LENGTH_LONG).show();
    else
        com.bnutalk.ui.AddContactsActivity.makeToast(this, "dislike");
    
}

protected void updateGregorianDateLabel() {
    gregorianDateText.setText(org.odk.collect.android.utilities.DateTimeUtils.getDateTimeBasedOnUserLocale(getDateAsGregorian(getOriginalDate()).toLocalDate().toDate(), calendarMode, false));
}

private void setupPullToRefresh() {
    swipeRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {
        @java.lang.Override
        public void onRefresh() {
            mainChannelPresenter.getLastVideosFromYoutubeChannel(true);
        }
    });
}

@java.lang.Override
public void onSearchTermChanged(java.lang.String term) {
    android.util.Log.e("debug", ("searching.. " + term));
    getSearchResults(term);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mCamera = android.hardware.Camera.open(0);
    android.hardware.camera2.CameraManager manager = ((android.hardware.camera2.CameraManager) (getActivity().getSystemService(Context.CAMERA_SERVICE)));
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeString(fileName);
    dest.writeParcelable(warranty, flags);
    dest.writeInt(position);
}

@java.lang.Override
public boolean onCreateOptionsMenu(final android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu, menu);
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    mCamera.takePicture(mShutterCallback, mRawCallback, null, mJPEGCallback);
    showSavedCrouton();
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    mEditTextCallback.changeErrorView();
    mEditTextCallback.toggleLineColorOnError(false);
    if ((s.length()) == 0) {
        mEditTextCallback.saveIdentificationName("");
    }
}

void dispatchOnPanelSlide(android.view.View panel) {
    for (com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener l : mPanelSlideListeners) {
        l.onPanelSlide(panel, mSlideOffset);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    speed += ((speed) == 0) ? 0 : -1;
    java.lang.String cmd = "" + (speed);
    this.sendCommand(cmd);
}

public void cancel(android.view.View view) {
    android.widget.Toast.makeText(getBaseContext(), "Cancel pressed! No changes made to the alarm. ", Toast.LENGTH_LONG).show();
    finish();
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        setResult();
        finish();
    }
    return false;
}

@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
    molecule.scale().x += 0.01F;
    molecule.scale().y += 0.01F;
    molecule.scale().z += 0.01F;
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    setContentView(R.layout.activity_master);
    populateListView(result);
    dialog.dismiss();
    android.widget.Toast.makeText(this, "Items successfully parsed!", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main1);
    if (savedInstanceState == null)
        com.example.slava.lenta2.MainPresenter.createPresenter(getFragmentManager());
    
}

@java.lang.Override
public void onStop() {
    super.onStop();
    if (gapiClient.isConnected()) {
        gapiClient.disconnect();
        android.widget.Toast.makeText(this, "Compass gapiClient.disconnect();", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onScroll(com.comcast.freeflow.core.FreeFlowContainer container) {
    android.util.Log.d(com.comcast.freeflow.examples.artbook.ArtbookActivity.TAG, ("scroll percent " + (container.getScrollPercentY())));
}

@java.lang.Override
public void onPrepareLayout() {
    mRecyclerView.setHasFixedSize(true);
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    mRecyclerView.setLayoutManager(layoutManager);
    mRecyclerView.setNestedScrollingEnabled(false);
    getPresenter().getData(boxes);
}

@java.lang.Override
protected void onServiceConnected() {
    super.onServiceConnected();
    android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo = new android.accessibilityservice.AccessibilityServiceInfo();
    accessibilityServiceInfo.eventTypes = android.view.accessibility.AccessibilityEvent.TYPES_ALL_MASK;
    accessibilityServiceInfo.feedbackType = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_ALL_MASK;
    accessibilityServiceInfo.notificationTimeout = 50;
    setServiceInfo(accessibilityServiceInfo);
}

protected void startAddExpense() {
    android.content.Intent intent = new android.content.Intent(this, com.vish.cloudexpense.AddExpenseActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    java.lang.System.err.println((("There was an error " + "getting the GeoFire location: ") + databaseError));
    android.widget.Toast.makeText(this, "Permission Denied. Please Login again.", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(final android.view.View view) {
    presentFragment(new org.telegram.techrunch.select_city.SelectCity(), false);
}

public void onImageButtonBack_Clicked(android.view.View v) {
    if ((com.aiworker.bcineuroskyservice.MainActivity.layer) == 2) {
        switchToLayer1();
    }
    if ((com.aiworker.bcineuroskyservice.MainActivity.layer) == 3) {
        switchToLayer2from3();
    }
}

private int extractInt(android.content.res.XmlResourceParser xpp) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    xpp.next();
    int val = java.lang.Integer.parseInt(xpp.getName());
    xpp.next();
    xpp.next();
    return val;
}

public void initTasksList(android.content.Intent intent) {
    android.support.v4.app.Fragment f = checkFragmentInstance(R.id.fragment_container, net.fred.taskgame.fragment.ListFragment.class);
    if (f != null) {
        ((net.fred.taskgame.fragment.ListFragment) (f)).initTasksList(intent);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    callback.accept(true);
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    com.github.dfa.diaspora_android.util.AppLog.i(this, "onConfigurationChanged()");
    super.onConfigurationChanged(newConfig);
    setContentView(R.layout.main__activity);
    com.github.dfa.diaspora_android.util.AppLog.v(this, "Rebuild the UI");
    setupUI(null);
}

public com.jana.android.core.app.config.Configuration build() {
    com.jana.android.core.app.config.Configuration configs = new com.jana.android.core.app.config.Configuration(this);
    return configs;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    progressDialog.dismiss();
    getActivity().finish();
}

@java.lang.Override
public void onStatusChanged(java.lang.String s, int i, android.os.Bundle bundle) {
    android.util.Log.d("GPSTest", "onStatusChanged called");
    checkLocationProviderEnabled();
}

private void onStartTimeSet(int hourOfDay, int minute) {
    if (de.thm.ap.openfit.BuildConfig.DEBUG)
        android.util.Log.d(de.thm.ap.openfit.view.MotionFormActivity.LOG_TAG, ((hourOfDay + ":") + minute));
    
    mStart.setText(((hourOfDay + ':') + minute));
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.TextureView previewView = new android.view.TextureView(getActivity());
    previewView.setSurfaceTextureListener(this);
    return previewView;
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.i(com.example.annemarie.worldofbikesdublin.TAG, "The activity is visible and about to be started.");
}

@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    android.widget.Toast t = android.widget.Toast.makeText(getApplicationContext(), java.lang.Integer.toString(status), Toast.LENGTH_SHORT);
    t.show();
}

private void setToggleButton(java.lang.String str, android.widget.ToggleButton btn) {
    if (str == "1") {
        btn.setChecked(true);
    }else {
        btn.setChecked(false);
    }
}

@java.lang.Override
public void onResponse(retrofit2.Response<com.example.sidneysmall.finalproject121.response.SchedulePost> response) {
    if ((response.body().response.compareTo("ok")) == 0) {
        android.util.Log.d("DEBUG", "Should be calling getSchedule here");
        getSchedule();
    }
}

public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.notify(ben.avgmovies.notifications.NotificationPublisher.NOT_OD, getNotification());
}

@java.lang.Override
public void onClick(android.view.View view) {
    contributorDialog(true).show();
    dialog.dismiss();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    dialog.dismiss();
    startActivity(new android.content.Intent(this, hyjjr.cs160.com.safe_radius.MainActivity.class));
    this.finish();
}

@java.lang.Override
public void onActivityDestroyed(final android.app.Activity activity) {
    com.apptentive.android.sdk.ApptentiveInternal.getInstance().onActivityDestroyed(activity);
}

@android.support.annotation.NonNull
protected abstract PresenterT createPresenter();

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_done_verification);
    android.content.Intent intent = getIntent();
    image_path = intent.getStringExtra("ImagePathForAvatar");
}

@android.support.annotation.NonNull
protected com.github.vivchar.rendererrecyclerviewadapter.RendererRecyclerViewAdapter getAdapter() {
    if ((mAdapter) == null) {
        mAdapter = createAdapter();
    }
    return mAdapter;
}

@java.lang.Override
public void onClick(android.view.View v) {
    org.wordpress.android.ui.ActivityLauncher.viewBlogStats(getActivity(), mBlog.getLocalTableBlogId());
}

java.lang.CharSequence getLabelForAccessibility(android.content.Context context) {
}

public void attackersCancel(android.content.DialogInterface dialog, int id) {
    mBinding.nextStep.setEnabled(true);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    grocText.setText(java.lang.String.valueOf(progress));
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    handler = new android.os.Handler();
    com.xiaolei.easyfreamwork.utils.Log.d(TAG, ((this.getClass().getName()) + ":onActivityCreated"));
    onSetContentView();
    super.onActivityCreated(savedInstanceState);
}

void setCalendarTextColor(android.content.res.ColorStateList calendarTextColor) {
    mCalendarTextColor = calendarTextColor;
    notifyDataSetChanged();
}

public void showResultButtonClicked(android.view.View view) {
    java.util.ArrayList<com.example.etasheva.kinveytest.models.LaptopSqlite> result = this.mLoadDataService.showResult();
    android.content.Intent intent = new android.content.Intent(this, com.example.etasheva.kinveytest.activities.SecondActivity.class);
    intent.putExtra("result", result);
    startActivity(intent);
}

@java.lang.Override
public void onCreate() {
    btManager = null;
    mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if ((mBluetoothAdapter) == null) {
        java.lang.System.exit(0);
    }
    smokinoGUI = null;
    super.onCreate();
}

public synchronized void setLightControllable(org.deviceconnect.android.deviceplugin.fplug.profile.FlashingExecutor.LightControllable controllable) {
    mListener = controllable;
    java.lang.Object o = null;
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    markCurrentSong(WebAPI.OP_END);
    if ((playedSong) >= (size))
        stop();
    
    nextSong();
}

