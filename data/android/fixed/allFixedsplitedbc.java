public static void updateViewWithCameraMaskValue(android.widget.ImageView view, com.omikronsoft.whatsthatcolor.component.CameraMask cameraMask, int value) {
    if (cameraMask != null) {
        view.setImageBitmap(cameraMask.getMaskBitmap(value));
        com.omikronsoft.whatsthatcolor.utility.ViewUtility.viewLastUpdate.put(view, org.joda.time.DateTime.now());
    }
}

public android.graphics.Paint getPaintColorFromUserId(java.lang.String userId) {
    if ((mUserList) != null) {
        return net.aboutgoods.remotedrawing.helper.PaintHelper.createPaintFromRGB(mUserList.get(userId));
    }else {
        return null;
    }
}

private java.util.List<com.tdp2.androidclient.activity.BaseDrawerActivity.MenuEntry> getStartMenuEntries() {
    return com.google.common.collect.ImmutableList.of(buildHomeMenuEntry(), buildWallMenuEntry(), buildContactListMenuEntry(), buildMapMenuEntry());
}

@java.lang.Override
protected void drawValue(android.graphics.Canvas c, java.lang.String value, float xPos, float yPos) {
    super.drawValue(c, value, xPos, (yPos + (mYOffset)));
}

@java.lang.Override
public void onRevMobRewardedVideoFinished() {
    android.util.Log.d(com.cranberrygame.cordova.plugin.ad.revmob.RevMobPluginOverlap.LOG_TAG, java.lang.String.format("%s", "onRevMobRewardedVideoFinished"));
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    savedInstanceState.putString(Constants.SavedInstanceState.Characters.LAST_ITEM_SEARCHED, java.lang.String.valueOf(searchView.getQuery()));
    super.onSaveInstanceState(savedInstanceState);
}

@java.lang.Override
public android.app.Fragment getItem(int position) {
    mCursor.moveToPosition(position);
    return com.example.xyzreader.ui.ArticleDetailFragment.newInstance(mCursor.getLong(ArticleLoader.Query._ID), position);
}

@java.lang.Override
public void onClick(android.view.View view) {
    new net.alhazmy13.hijridatepicker.HijriCalendarDialog.Builder(this).setOnDateSetListener(this).setMinMaxHijriYear(1430, 1450).setMinMaxGregorianYear(2013, 2020).setMode(HijriCalendarDialog.Mode.Hijri).show();
}

public static int timeBetweenInDays(long prevDate) {
    long diff = (java.lang.System.currentTimeMillis()) - prevDate;
    return ((int) (diff / (android.text.format.DateUtils.DAY_IN_MILLIS)));
}

@java.lang.Override
public void onDrawerStateChanged(int newState) {
}

@java.lang.Override
protected void onPause() {
    android.util.Log.d(com.cross.CrossActivity.TAG, "onPause");
    super.onPause();
    if (com.cross.CrossActivity.cross_initialized) {
        com.cross.CrossActivity.cross.Suspend();
    }
    renderer.onPause();
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    setupProfilePicture(view);
    setupLoginButton(view);
    setupMessageText(view);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int userDays = java.lang.Integer.parseInt(userDaysNumber);
    searchSingleCurrencyLastRates(singleCurrencyCode, userDays, singleMidRate);
}

@java.lang.Override
public void onClick(android.view.View view) {
    setParams(0);
    changeToolbar(null, 1);
    isInflate = true;
}

public void launch(android.view.View view) {
    if (mIsArtistRadio) {
        requestArtistRadio();
    }else {
        requestVibedPlaylist();
    }
}

@org.mozilla.gecko.annotation.WrapForJNI
public org.mozilla.gecko.media.HlsVideoInfo GetVideoInfo(int trackNumber) {
    if (org.mozilla.gecko.media.GeckoHlsSampleGetter.DEBUG)
        android.util.Log.d(org.mozilla.gecko.media.GeckoHlsSampleGetter.LOGTAG, "[HasTrackType]");
    
    org.mozilla.gecko.media.HlsVideoInfo vInfo = new org.mozilla.gecko.media.HlsVideoInfo();
    return vInfo;
}

public void validateInput(android.view.View v) {
    if ((etNameInput) != null)
        listener.onTextNameChanged(getPosition(), etNameInput);
    
}

public void onClickTrim(android.view.View view) {
    isRunning = false;
    sendCommand(de.hhn.munz.ardrone2.ATCommand.trim());
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
}

@java.lang.Override
public void onPause() {
    super.onPause();
    trinityconnect.android.bignerdranch.com.trinityconnect.EventLab.get(getActivity()).updateEvent();
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
}

public void drawCard(com.aause2s15.gruppe3.cheatingandroid.CardDeck cardDeck) {
    com.aause2s15.gruppe3.cheatingandroid.Card currentCard = cardDeck.drawTopCard();
    this.playerCards.add(currentCard);
    this.sortPlayerCards();
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
}

@java.lang.Override
public android.content.Intent buildVoiceRecognitionIntent() {
    android.content.Intent intent = new android.content.Intent(android.speech.RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
    intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
    intent.putExtra(RecognizerIntent.EXTRA_PROMPT, getContext().getString(R.string.speak_now));
    return intent;
}

@java.lang.Override
public void onLoadError() {
    super.onLoadError();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    check = false;
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences sharedPref = getPreferences(ru.caustic.lasertag.ui.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putBoolean("bridge_bluetooth_autoconnect", switchRememberDevice.isChecked());
    editor.commit();
}

@java.lang.Override
public void onItemClick(int position) {
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
private void setFullscreenFlags(boolean fullscreen) {
    int fullscreenFlags = android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        fullscreenFlags |= android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    }
    setSystemUiFlags(fullscreenFlags, fullscreen);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    com.techfly.liutaitai.util.Utility.getScreenSize(activity);
    mActivity = ((com.techfly.liutaitai.util.activities.CitySelectActivity) (activity));
    mIsFromMainActivity = mActivity.getIntent().getBooleanExtra(IntentBundleKey.REDIRECT_TYPE, true);
}

@java.lang.Override
@android.support.annotation.Nullable
protected java.lang.CharSequence queryValue() {
    android.net.Uri rideUri = getRideUri();
    if (rideUri == null)
        return null;
    
    return org.jraf.android.bikey.common.UnitUtil.formatSpeed(((float) (org.jraf.android.bikey.backend.log.LogManager.get().getAverageMovingSpeed(rideUri))));
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), com.example.justine.taragala.SignIn.class);
    startActivityForResult(intent, 0);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dashboard);
    this.mCurrentUser = this.mSession.getCurrentUser();
    this.bindUi();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i(com.example.eurka.comp90018.MyIntentService.TAG, "starting!!");
    startLogging();
    return 0;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (((currentValue) > (minValue)) && (((currentValue) - (stepValue)) >= (minValue))) {
        currentValue -= stepValue;
        updateCurrentValue();
    }
}

@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    return (onTap(e.getRawX(), e.getRawY())) || (super.onSingleTapConfirmed(e));
}

static long getInstallDate(android.content.Context context) {
    return hotchemi.android.rate.PreferenceHelper.getPreferences(context).getLong(hotchemi.android.rate.PreferenceHelper.PREF_KEY_INSTALL_DATE, 0);
}

public void onSharedPreferenceChanged(android.content.SharedPreferences prefs, java.lang.String key) {
    if (key == (com.af.synapse.Settings.PREF_THEME)) {
        com.af.synapse.Settings.theme = null;
        com.af.synapse.Settings.setWallpaper(Utils.mainActivity);
        com.af.synapse.Settings.setWallpaper(Utils.settingsActivity);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    refreshFxUi(net.atomarea.flowx.ui.FxUi.State.SINGLE_CONVERSATION, false, 1, (MessageCountToShow + 30));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((armor) > 0)
        (armor)--;
    
    updateValues(true);
}

@com.facebook.react.bridge.ReactMethod
public void sharedInstanceWithToken(java.lang.String apiToken) {
    this.mixpanel = com.mixpanel.android.mpmetrics.MixpanelAPI.getInstance(this.reactContext, apiToken);
}

private void placeView() {
    if (((mMenuView) == null) || ((mContentView) == null)) {
        throw new java.lang.NullPointerException("The content and menu can not be null!");
    }
    addView(mContentView, 0);
    addView(mMenuView, 1);
}

@java.lang.Override
public void onChartTranslate(android.view.MotionEvent event, float dX, float dY) {
    android.util.Log.i("Translate / Move", ((("dX: " + dX) + ", dY: ") + dY));
}

@java.lang.Override
public void onSearchResultDownloaded(java.util.ArrayList<com.example.user.cloudplayer.model.PlayList> playLists) {
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    config.useAccelerometer = true;
    config.useWakelock = true;
    initialize(new com.scarlettapps.skydiver3d.Skydiver3D(), config);
}

@java.lang.Override
public boolean shouldShow(android.content.SharedPreferences p) {
    return (manager.getUnansweredQuestions().getCount()) >= 1;
}

@java.lang.Override
public void onLeftCardExit(java.lang.Object dataObject) {
    if ((list.size()) < 0)
        android.widget.Toast.makeText(this, "no more users!", Toast.LENGTH_LONG).show();
    else
        com.bnutalk.ui.AddContactsActivity.makeToast(this, "dislike");
    
}

protected void updateGregorianDateLabel() {
    gregorianDateText.setText(org.odk.collect.android.utilities.DateTimeUtils.getDateTimeBasedOnUserLocale(getDateAsGregorian(getOriginalDate()).toDate(), calendarMode, false));
}

private void setupPullToRefresh() {
    swipeRefreshLayout.setOnRefreshListener(() -> {
        mainChannelPresenter.getLastVideosFromYoutubeChannel(true);
    });
}

@java.lang.Override
public void onSearchTermChanged(java.lang.String term) {
    if ((term.length()) > 1)
        getSearchResults(term);
    
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mCamera = android.hardware.Camera.open(0);
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeString(fileName);
    dest.writeInt(position);
}

@java.lang.Override
public boolean onCreateOptionsMenu(final android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu, menu);
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mCamera.takePicture(mShutterCallback, mRawCallback, null, mJPEGCallback);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    mEditTextCallback.changeErrorView();
    mEditTextCallback.toggleLineColorOnError(false);
}

void dispatchOnPanelSlide(android.view.View panel) {
    synchronized(mPanelSlideListeners) {
        for (com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener l : mPanelSlideListeners) {
            l.onPanelSlide(panel, mSlideOffset);
        }
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    speed += ((speed) == 1) ? 0 : -1;
    java.lang.String cmd = "" + (speed);
    this.sendCommand(cmd);
}

public void cancel(android.view.View view) {
    finish();
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        setResult();
        finish();
        return true;
    }
    return false;
}

@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    populateListView(result);
    dialog.dismiss();
    android.widget.Toast.makeText(this, "Items successfully parsed!", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main1);
    if (savedInstanceState == null)
        com.example.slava.lenta2.MainPresenter.createPresenter(getFragmentManager(), this);
    
    init();
}

@java.lang.Override
public void onStop() {
    if (gapiClient.isConnected()) {
        gapiClient.disconnect();
    }
    super.onStop();
}

@java.lang.Override
public void onScroll(com.comcast.freeflow.core.FreeFlowContainer container, int state) {
    android.util.Log.d(com.comcast.freeflow.examples.artbook.ArtbookActivity.TAG, ("scroll percent " + (container.getScrollPercentY())));
}

@java.lang.Override
public void onPrepareLayout() {
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity());
    mRecyclerView.setLayoutManager(layoutManager);
    mRecyclerView.setHasFixedSize(true);
    mRecyclerView.setNestedScrollingEnabled(true);
    getPresenter().getData(boxes);
}

@java.lang.Override
protected void onServiceConnected() {
    super.onServiceConnected();
    android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo = new android.accessibilityservice.AccessibilityServiceInfo();
    accessibilityServiceInfo.eventTypes = android.view.accessibility.AccessibilityEvent.TYPES_ALL_MASK;
    accessibilityServiceInfo.feedbackType = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_ALL_MASK;
    accessibilityServiceInfo.notificationTimeout = 0;
    setServiceInfo(accessibilityServiceInfo);
}

public void startAddExpense(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.vish.cloudexpense.AddExpenseActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    java.lang.System.err.println((("There was an error " + "getting the GeoFire location: ") + databaseError));
}

@java.lang.Override
public void onClick(final android.view.View view) {
    presentFragment(new org.telegram.techrunch.select_city.SelectCity(false), false);
}

public void onImageButtonBack_Clicked(android.view.View v) {
    if ((com.aiworker.bcineuroskyservice.MainActivity.layer) == 2) {
        switchToLayer1();
    }
}

private int extractInt(android.content.res.XmlResourceParser xpp) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    xpp.next();
    int val = java.lang.Integer.parseInt(xpp.getText());
    xpp.next();
    xpp.next();
    return val;
}

public void initTasksList(android.content.Intent intent) {
    android.support.v4.app.Fragment f = checkFragmentInstance(R.id.fragment_container, net.fred.taskgame.fragment.ListFragment.class);
    if (f != null) {
        ((net.fred.taskgame.fragment.ListFragment) (f)).initTasksList(intent, true);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    callback.accept(false);
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    com.github.dfa.diaspora_android.util.AppLog.i(this, "onConfigurationChanged()");
    super.onConfigurationChanged(newConfig);
}

public com.jana.android.core.app.config.Configuration build() {
    return new com.jana.android.core.app.config.Configuration(this);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((progressDialog) != null)
        progressDialog.dismiss();
    
    getActivity().finish();
}

@java.lang.Override
public void onStatusChanged(java.lang.String s, int i, android.os.Bundle bundle) {
    checkLocationProviderEnabled();
}

private void onStartTimeSet(int hourOfDay, int minute) {
    if (de.thm.ap.openfit.BuildConfig.DEBUG)
        android.util.Log.d(de.thm.ap.openfit.view.MotionFormActivity.LOG_TAG, ((hourOfDay + ":") + minute));
    
    mStart.setText(((hourOfDay + ":") + minute));
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    previewView = new android.view.TextureView(getActivity());
    previewView.setSurfaceTextureListener(this);
    return previewView;
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.i(com.example.annemarie.worldofbikesdublin.TAG, "The activity is visible and about to be started.");
}

@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
}

private void setToggleButton(java.lang.String str, android.widget.ToggleButton btn) {
    if (str.equals("1")) {
        btn.setChecked(true);
    }else {
        btn.setChecked(false);
    }
}

@java.lang.Override
public void onResponse(retrofit2.Response<com.example.sidneysmall.finalproject121.response.SchedulePost> response) {
    if ((response.body().response.compareTo("ok")) == 0) {
        getSchedule();
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.notify(ben.avgmovies.notifications.NotificationPublisher.NOT_OD, getNotification(context));
}

@java.lang.Override
public void onClick(android.view.View view) {
    contributorDialog(false).show();
    dialog.dismiss();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    startActivity(new android.content.Intent(this, hyjjr.cs160.com.safe_radius.MainActivity.class));
    this.finish();
}

@java.lang.Override
public void onActivityDestroyed(final android.app.Activity activity) {
}

@android.support.annotation.NonNull
public abstract PresenterT createPresenter();

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_done_verification);
}

protected com.github.vivchar.rendererrecyclerviewadapter.RendererRecyclerViewAdapter getAdapter() {
    return mAdapter;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mBlog) != null) {
        org.wordpress.android.ui.ActivityLauncher.viewBlogStats(getActivity(), mBlog.getLocalTableBlogId());
    }
}

java.lang.CharSequence getLabelForAccessibility(android.content.Context context);

public void attackersCancel(android.content.DialogInterface dialog, int id) {
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    grocText.setText(java.lang.String.valueOf((progress + 1)));
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    com.xiaolei.easyfreamwork.utils.Log.d(TAG, ((this.getClass().getName()) + ":onActivityCreated"));
    onSetContentView();
    super.onActivityCreated(savedInstanceState);
}

void setCalendarTextColor(@android.support.annotation.ColorInt
int calendarTextColor) {
    mCalendarTextColor = calendarTextColor;
    notifyDataSetChanged();
}

public void showResultButtonClicked(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.etasheva.kinveytest.activities.SecondActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onCreate() {
    mBluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if ((mBluetoothAdapter) == null) {
        java.lang.System.exit(0);
    }
    smokinoGUI = null;
    super.onCreate();
}

public synchronized void setLightControllable(org.deviceconnect.android.deviceplugin.fplug.profile.FlashingExecutor.LightControllable controllable) {
    mListener = controllable;
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    markCurrentSong(WebAPI.OP_END);
    if ((playedSong) >= (size)) {
        stop();
        return ;
    }
    nextSong();
}

