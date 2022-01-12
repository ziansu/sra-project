@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    settings.setChangeLogPermanentlyHidden(isChecked);
}

public void setUpGameLevel(net.cloudhacking.androidgame2.SceneInfo sceneInfo) {
    mLevel = new net.cloudhacking.androidgame2.GameLevel(sceneInfo);
    setArenaSize(mLevel.getLevelSize());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((listener) != null)
        listener.onGridItemClick(gridGroupPosition, gridChildPosition);
    
}

@java.lang.Override
public void onPreference(james.colorpickerdialog.dialogs.PreferenceDialog dialog, java.lang.Integer preference) {
    android.widget.Toast.makeText(this, java.lang.String.format("#%06X", (16777215 & preference)), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((context) instanceof internetofeveryone.ioe.Browser.BrowserView) {
        ((internetofeveryone.ioe.Browser.BrowserView) (context)).onClickDownloadFavorite(name);
    }else {
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    emitButtonEvent(buttonDef, inAppWebView.getUrl(), index);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    setHasOptionsMenu(true);
    com.teamagam.gimelgimel.app.settings.SettingsActivity.bindPreferenceSummaryToValue(findPreference(getString(R.string.user_name_text_key)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent addCard = new android.content.Intent(this, org.talcrafts.udhari.QrCodeActivity.class);
    this.startActivity(addCard);
}

@java.lang.Override
public void onBeginningOfSpeech() {
    android.util.Log.d("onBeginningOfSpeech", "onBeginningOfSpeech");
    TTSIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
}

public abstract boolean onCanProcessClick(android.view.View _view);

public void serviceTracking(uk.co.rossbeazley.trackmytrain.android.wear.TrainViewModel trainViewModel) {
    if (isNotifing) {
        for (uk.co.rossbeazley.trackmytrain.android.wear.notification.WearNotificationService.WearNotification presenter : notificationPresenters) {
            this.trainViewModel = trainViewModel;
            presenter.show(this.trainViewModel);
        }
    }
}

private static synchronized android.content.SharedPreferences getSharedPrefs() {
    if ((com.magnet.mmx.client.api.MMX.sSharedPrefs) == null) {
        com.magnet.mmx.client.api.MMX.sSharedPrefs = com.magnet.max.android.MaxCore.getApplicationContext().getSharedPreferences(com.magnet.mmx.client.api.MMX.SHARED_PREFS_NAME, Context.MODE_PRIVATE);
    }
    return com.magnet.mmx.client.api.MMX.sSharedPrefs;
}

private boolean linearCollideVertical() {
    if ((verticalCollideIsElligible()) && ((operatorLeft) == (sliderLeft))) {
        android.util.Log.d(karavangelos.com.operator.gameparts.Slider.TAG, "VERTICAL COLLIDE");
        return true;
    }
    return false;
}

@java.lang.Override
public com.wanghong.dytt.DyttListItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new com.wanghong.dytt.DyttListItemViewHolder(android.view.LayoutInflater.from(context).inflate(viewType, null, false));
}

@java.lang.Override
public void run() {
    notifyInterfaceClassActivity(type, DataConnectionRealTimeInfo.DC_POWER_STATE_HIGH, android.os.SystemClock.elapsedRealtimeNanos(), true);
}

@java.lang.Override
public void onFinish(int result) {
    switch (result) {
        case Constants.ResultFinishLoadData.LOAD_DATA_FINISH :
            synChronizeData();
            mDataUtils.getEvents(this, mIdStore, com.example.framgia.imarketandroid.ui.activity.ChooseMarketActivity.sEventList);
            break;
        case Constants.ResultFinishLoadData.LOAD_EVENT_FINISH :
            pushNotification();
            break;
    }
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setListAdapter(new bd1415.unipd.dei.it.cardb.ClientiArrayAdapter(inflater.getContext(), ApplicationData.privati));
    mFM = getFragmentManager();
    return super.onCreateView(inflater, container, savedInstanceState);
}

@java.lang.Override
public android.view.View onCreateInputView() {
    keyboardView = ((android.inputmethodservice.KeyboardView) (getLayoutInflater().inflate(R.layout.keyboard, null)));
    keyboard = new android.inputmethodservice.Keyboard(this, R.xml.alpha);
    keyboardView.setOnKeyboardActionListener(this);
    return keyboardView;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((s.toString().length()) > 0) {
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
    }
}

public boolean changeDir(com.felhr.usbmassstorageforandroid.filesystems.VFSFile file) {
    fatHandler.stopCaching();
    boolean result = fatHandler.changeDir(file.getFileName());
    fatHandler.continueCaching();
    return result;
}

@java.lang.Override
public void upSwipe() {
    ch.blinkenlights.android.vanilla.PlaybackService.get(this).performAction(mUpAction, this);
}

public static void init(android.content.Context appContext) {
    com.unit5app.notifications.MyNotificationHandler.context = appContext;
    com.unit5app.Settings.load(com.unit5app.notifications.MyNotificationHandler.context);
    com.unit5app.notifications.MyNotificationHandler.calendar = new com.unit5app.calendars.Unit5Calendar(60, false);
    com.unit5app.notifications.MyNotificationHandler.checkCalendarLoaded();
}

@java.lang.Override
protected no.nordicsemi.android.nrftoolbox.profile.BleManager<no.nordicsemi.android.nrftoolbox.hrs.HRSManagerCallbacks> initializeManager() {
    final no.nordicsemi.android.nrftoolbox.hrs.HRSManager mManager = no.nordicsemi.android.nrftoolbox.hrs.HRSManager.getInstance(getApplicationContext());
    mManager.setGattCallbacks(this);
    return mManager;
}

private void createFromPicture(android.view.LayoutInflater mLayoutInflator, android.graphics.Typeface bitter, java.lang.String headerTitle) {
    mCamera.setHeader(headerTitle);
    mCamera.setType(type);
    mCamera.takePicture();
}

public void updateNotification(monakhv.samlib.db.entity.Author author) {
    if ((mProgressNotification) == null) {
        mProgressNotification = new monakhv.android.samlib.service.ProgressNotification(mSettingsHelper, "text");
    }
    mProgressNotification.update(author);
}

public void readFromParcel(android.os.Parcel in) {
    timestamp = in.readLong();
    in.readFloatArray(values);
    valuesList = new java.util.ArrayList();
    in.readList(valuesList, getClass().getClassLoader());
}

public static boolean isRegistered(android.content.Context context) {
    return io.soramitsu.iroha.IrohaApplication.getSharedPreferences(context).getBoolean(io.soramitsu.iroha.IrohaApplication.SHARED_PREF_REGISTERED_KEY, false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    onClickImage(i);
}

@java.lang.Override
public com.example.raf0c.movies.adapters.ImageItemAdapter.ImagesViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View v = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_list_item, viewGroup, false);
    com.example.raf0c.movies.adapters.ImageItemAdapter.ImagesViewHolder pvh = new com.example.raf0c.movies.adapters.ImageItemAdapter.ImagesViewHolder(v);
    return pvh;
}

@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.util.Log.e(Constants.TAG, "Error Saving order to the server.");
    mainActivity.getActivityHelper().closeLoadingBar();
}

public void onClick(android.view.View v) {
    java.lang.String message = "3";
    sendMessage(message);
    vibrator.vibrate(100);
    m3Background.setBackgroundResource(R.drawable.button_shape_bule);
    pushedNumber = 0;
    pushedButton = m3Background;
}

public void removeRingtoneState(android.content.Context context) {
    if ((timeEvent) == null)
        timeEvent = new com.wordpress.gatarblog.dzwonnik.States.RingtoneState.TimeEvent(context);
    
    timeEvent.stop();
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(this, getResources().getString(R.string.serverError), Toast.LENGTH_SHORT).show();
    refreshLayout.finishRefresh();
}

private void setPosterAdapter() {
    android.util.Log.v("Home Fragemnt", "Setting Adapter");
    imageAdapter.clear();
    imageAdapter.addAll(tmDbMovieArrayList);
    android.util.Log.v("Home Fragemnt", ("Added Adapter" + (tmDbMovieArrayList.toString())));
}

public void setNotificationBackgroundColorResource(@android.support.annotation.ColorRes
int color) {
    this.notificationBackgroundColor = android.support.v4.content.ContextCompat.getColor(context, color);
    notificationBackgroundDrawable = com.aurelhubert.ahbottomnavigation.AHHelper.getTintDrawable(notificationBackgroundDrawable, notificationBackgroundColor, true);
    updateNotifications(true, com.aurelhubert.ahbottomnavigation.AHBottomNavigation.UPDATE_ALL_NOTIFICATIONS);
}

private void startStageProject() {
    org.catrobat.catroid.ProjectManager.getInstance().getCurrentProject().getUserVariables().resetAllUserVariables();
    android.content.Intent intent = new android.content.Intent(this, org.catrobat.catroid.stage.PreStageActivity.class);
    startActivityForResult(intent, PreStageActivity.REQUEST_RESOURCES_INIT);
}

@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.user_profile :
            startActivity(new android.content.Intent(this, com.columbasms.columbasms.activity.UserProfileActivity.class));
            break;
    }
    drawer.closeDrawer(GravityCompat.START);
    return true;
}

public void unregisterOnStatusChange(final android.content.Intent response) {
    mOnStatusChangeEventFlag = false;
    response.putExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_OK);
    response.putExtra(DConnectMessage.EXTRA_VALUE, "Unregister OnStatusChange event");
    sendResponse(response);
}

protected void answerCorrect(android.view.View view) {
    answerCorrect();
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    int result;
    result = ResourceHostingTerminate();
    android.util.Log.d(TAG, ("ResourceHostingTerminate : " + result));
}

private void initialize() {
    com.project.coursera.dailyselfie.PhotoListFragment listFragment;
    listFragment = new com.project.coursera.dailyselfie.PhotoListFragment();
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.add(R.id.container, listFragment);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}

@java.lang.Override
public void onClusterItemInfoWindowClick(com.bridge.soom.Model.ProviderBasic providerBasic) {
    android.widget.Toast.makeText(this, ((providerBasic.getUserFirstName()) + " Clicked"), Toast.LENGTH_SHORT).show();
}

public static void readPhoneStatePermissions(android.app.Activity activity, int id, com.liangmayong.base.support.permission.ActivityPermission.OnPermissionListener listener) {
    java.lang.String[] permissionsNeeded = new java.lang.String[]{ Manifest.permission.READ_PHONE_STATE };
    com.liangmayong.base.support.permission.ActivityPermission.requestPermissions(activity, id, permissionsNeeded, listener);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        java.lang.String str = WeatherConditionsNames.Cloudiness.toString();
        this.importantConditionsAdapter = createImportantConditionsAdapter(this.importantWeatherConditionsNames);
    }
    setHasOptionsMenu(false);
}

private void savePreference(java.lang.String key, java.lang.String value) {
    android.content.SharedPreferences.Editor editor = pref.edit();
    editor.putString(key, value);
    editor.commit();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isMeasurementStarted)) {
        onStartClicked();
    }else {
        onStopClicked();
    }
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    animating = true;
    setTouchAble(false);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    if ((section) == (num_ex)) {
        dialog(2);
    }
    load(state);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    extInm = true;
    startFilterActivity(org.openhds.mobile.activity.UpdateActivity.FILTER_INMIGRATION);
}

public void onClick(android.view.View v) {
    android.widget.CheckBox cb = ((android.widget.CheckBox) (v));
    if (cb.isChecked()) {
        cb.setText("Avklarat!");
    }else {
        cb.setText("Avklarat?");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    launchExternalIntent(context);
}

@java.lang.Override
public void onDestroy() {
    metronome.stop();
    metronome = null;
    android.util.Log.i(com.example.vitalykulyk.metronom.MetronomService.TAG, "Service onDestroy");
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    drawerToggle.syncState();
}

@java.lang.Override
public boolean onRequestFailed(android.content.Context context, com.firexweb.newsi.sync.Request request, int requestStatusCode, java.lang.String requestStatusMessage) {
    android.util.Log.e(com.firexweb.newsi.sync.NewsiOperations.ERROR_LOG_TITLE, ("Oh shit, We Failed to fetch Article! The issue was " + requestStatusMessage));
    com.firexweb.newsi.MainSystem.displayToastMessage(R.string.request_failed);
    com.firexweb.newsi.MainSystem.refreshArticle();
    return true;
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.ozzyboshi.internetbeattimewatchface.InternetBeatTimeWatchFaceService.TAG, "Destroy engine");
    wakeLock.release();
    watchFace.wakelockDebug = wakeLock.isHeld();
    timeTick.removeCallbacks(timeRunnable);
    releaseGoogleApiClient();
    super.onDestroy();
}

@java.lang.Override
public void run() {
    org.owntracks.android.App.contactsViewModel.items.add(c);
    if (org.owntracks.android.support.Preferences.getEnableWidget())
        org.owntracks.android.services.ServiceProxy.getServiceApplication().requestWaypoints(c);
    
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    omer.parking.com.util.SharedPrefManager.getInstance(this).saveCameWithCar(true);
    startDecLotTask();
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(app.com.io.codephillip.soccerdashboard.Fixtures.LOADER_ID, null, this);
}

public static int mercatorToLatE7(final double mer) {
    return ((int) ((de.blau.android.util.GeoMath.mercatorToLat(mer)) * 1.0E7));
}

private void startClickScaleAnimation(android.view.View view) {
    mEffectManager.startClickScaleAnimation(mContext, view);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.amittpad.info.introductionslider.SignUpActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)));
    startActivity(intent);
}

static java.lang.String getLimitTracking(android.content.Context context) {
    try {
        return com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled();
    } catch (java.lang.Exception e) {
        android.util.Log.e("CS_SDK", "Failed to get isLimitAdTrackingEnabled", e);
        return null;
    }
}

@lombok.NonNull
@java.lang.Override
public final android.view.View newView(@lombok.NonNull
android.view.ViewGroup parent, @lombok.NonNull
com.nextfaze.poweradapters.ViewType viewType) {
    return adapterForViewType(viewType).newView(parent, viewType);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    setHasOptionsMenu(true);
    qwikstats.qwikcut.kerbysoft.com.qwikstats.SettingsActivity.bindPreferenceSummaryToValue(findPreference("example_text"));
    qwikstats.qwikcut.kerbysoft.com.qwikstats.SettingsActivity.bindPreferenceSummaryToValue(findPreference("example_list"));
}

@java.lang.Override
public void onClick(android.view.View v) {
    StationIntent.putExtra("mLat", myLat);
    StationIntent.putExtra("mLng", myLng);
    StationIntent.putExtra("ID", SelectedID);
    finish();
    startActivity(StationIntent);
    setContentView(R.layout.activity_station_picker);
}

public void onClick(android.content.DialogInterface dialog, int i) {
    dialog.cancel();
    android.widget.Toast.makeText(getApplicationContext(), ((claim.getStatus()) + " claims cannot be edited."), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((activity.MainActivity.cnt) == 0)
        for (int i = 0; i <= 1; i++)
            adapter2.add("asgdsgdasgsadg", adapter2.datas.size());
        
    
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.d("log", "click cancel");
}

public static it.kdevgroup.storelocator.PagerManager.StoresListFragment newInstance(android.content.Context ctx) {
    it.kdevgroup.storelocator.PagerManager.StoresListFragment.context = ctx;
    android.os.Bundle args = new android.os.Bundle();
    it.kdevgroup.storelocator.PagerManager.StoresListFragment fragment = new it.kdevgroup.storelocator.PagerManager.StoresListFragment();
    fragment.setArguments(args);
    return fragment;
}

private org.wordpress.android.models.Role getDefaultRole() {
    org.wordpress.android.models.Role[] inviteRoles = org.wordpress.android.models.Role.inviteRoles(mSite.isPrivate());
    return inviteRoles[0];
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    font_color = this.dialog.getColor();
    setColors(font_color, background_color);
}

@java.lang.Override
public int compare(com.alibaba.android.vlayout.LayoutHelper lhs, com.alibaba.android.vlayout.LayoutHelper rhs) {
    return (lhs.getRange().getLower().intValue()) - (rhs.getRange().getLower().intValue());
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    com.odong.buddhismhomework.services.MusicService.MusicBinder binder = ((com.odong.buddhismhomework.services.MusicService.MusicBinder) (service));
    musicService = binder.getService();
    musicService.setSong(book.getMp3());
}

@java.lang.Override
public final int onStartCommand(android.content.Intent intent, int flags, int startId) {
    setupFirTask(intent);
    return android.app.Service.START_STICKY_COMPATIBILITY;
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    ready = true;
    synchronized(this) {
        notifyAll();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    generateRandomTemperatureList(com.codingtest.malabika.tempo.MainActivity.MIN_TEMP, com.codingtest.malabika.tempo.MainActivity.MAX_TEMP);
    populateListView(weekdays_list, null, temperatureValue_List);
    Btn_CFToggleAll.setChecked(true);
    android.widget.Toast.makeText(this, "Temperature Values Refreshed", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    menu.setVisibility(View.VISIBLE);
    taille.setVisibility(View.INVISIBLE);
    rotation.setVisibility(View.INVISIBLE);
    horizontal.setVisibility(View.GONE);
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    if ((mMediaRecorder) != null) {
        this.click();
    }
    if (symbol1 = true) {
        mySensorManager.unregisterListener(sensorEventListener);
    }
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    buttonSound.start();
    finish();
    android.content.Intent i = new android.content.Intent(this, com.nedswebsite.ktog.Rules.class);
    this.startActivity(i);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) + 1));
    android.util.Log.i("SK-DEBUG", "Right Button is Clicked");
}

public void onNewProfileFragmentInteraction(android.net.Uri uri, net.tscloud.hivenotes.db.Profile profile);

public static java.lang.String formatTime(android.content.Context context, long timeInMs, java.lang.String timeZone) {
    org.mtransit.android.commons.ThreadSafeDateFormatter df = org.mtransit.android.commons.TimeUtils.getFormatTime(context, timeInMs);
    df.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));
    return df.formatThreadSafe(timeInMs);
}

@java.lang.Override
protected boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
    if ((super.verifyDrawable(drawable)) || (drawable == (this.mMarginDrawable))) {
        return true;
    }
    return false;
}

@java.lang.Override
protected void onPause() {
    super.onStop();
    cn.jpush.android.api.JPushInterface.onPause(this);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString(Constants.VIDEO_URL, videoUrl);
    outState.putString(Constants.STEP_DESCRIPTION, stepDescription);
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onRefresh() {
    mIsLoadMore = true;
    mPage = START_PAGE;
    if (!(android.text.TextUtils.isEmpty(mKey))) {
        mPresenter.searchCollections(mKey, mPage, com.masker.discover.search.fragment.SearchCollectionFragment.PER_PAGE);
    }else {
        mRefreshLayout.setRefreshing(false);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    allRe.get(java.lang.Integer.parseInt(v.getTag().toString())).setHeading(6);
    updateTextNoteControlListners(R.id.action_heading6);
}

@java.lang.Override
public void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic) {
    super.onCharacteristicChanged(gatt, characteristic);
    mBluetoothGattCallback.onReceivedNotification(characteristic.getValue());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_promotions);
    repository = com.example.piromsurang.ebookk.data.RealBookRepository.getInstance();
    presenter = new com.example.piromsurang.ebookk.BookPresenter(repository, this);
    initializeListview();
    initializeShowMoney();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    mNewsListPresenter.setView(null);
    com.fjoglar.etsitnews.presenter.PresenterHolder.getInstance().putPresenter(com.fjoglar.etsitnews.view.activities.NewsListActivity.class, mNewsListPresenter);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    com.irccloud.android.BackgroundTaskService.cancelBacklogSync(this);
    if (!(mResolvingError)) {
        mGoogleApiClient.connect();
    }
    com.irccloud.android.NetworkConnection.getInstance().registerForConnectivity();
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_BACK)) && (canGoBack())) {
        goBack();
        return true;
    }
    return super.onKeyDown(keyCode, event);
}

private void handleAndAssignImage(android.graphics.Bitmap bitmap) {
    initialiseNewBitmap();
    org.catrobat.paintroid.command.Command command = new org.catrobat.paintroid.command.implementation.LoadCommand(bitmap);
    PaintroidApplication.commandManager.commitCommandToLayer(new org.catrobat.paintroid.command.implementation.LayerCommand(org.catrobat.paintroid.listener.LayerListener.getInstance().getCurrentLayer()), command);
}

private void cropAndSetMethod(int position) {
    cropImageAndSetWallpaper(position);
    done();
    com.crashlytics.android.Crashlytics.log("crop true");
}

@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
    android.util.Log.d(TAG, ("onSingleTapConfirmed: " + (motionEvent.toString())));
    showCallout(motionEvent);
    return true;
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        notificationUtil.showNotification();
        mAdbUtil.openAirDebug();
    }else {
        notificationUtil.closeNotification();
        mAdbUtil.closeAirDebug();
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, com.example.darknight.mi2016.MapFragment.MY_PERMISSIONS_REQUEST_LOCATION);
}

public void initProcess(android.os.IBinder token, int vuid) {
    this.token = token;
    this.vuid = vuid;
    this.deviceInfo = com.lody.virtual.client.ipc.VDeviceManager.get().getDeviceInfo(com.lody.virtual.os.VUserHandle.getUserId(vuid));
}

public void onFinish() {
    android.util.Log.d("====>", "keke");
    com.novahub.voipcall.activity.MainActivity.GetStatusAsyncTask getStatusAsyncTask = new com.novahub.voipcall.activity.MainActivity.GetStatusAsyncTask(stringBuilder.toString());
    getStatusAsyncTask.execute();
}

@java.lang.Override
public void changeVideoQuality(int videoQuality) {
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_CHANGE_VIDEO_QUALITY, videoQuality, 0).sendToTarget();
}

