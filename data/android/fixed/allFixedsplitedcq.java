private void startBackgroundThread() {
    if ((mBackgroundThread) != null) {
        return ;
    }
    mBackgroundThread = new android.os.HandlerThread("CameraBackground");
    mBackgroundThread.start();
    mBackgroundHandler = new android.os.Handler(mBackgroundThread.getLooper());
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception exception) {
    android.widget.Toast.makeText(getApplicationContext(), exception.getMessage(), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onServiceReady(com.amazon.ags.api.AmazonGamesClient amazonGamesClient) {
    com.gcex.GameCircle.agsClient = amazonGamesClient;
    android.util.Log.i(com.gcex.GameCircle.TAG, "GameCircle: initialize Successful");
}

@java.lang.Override
protected void onActivityResult(final int requestCode, final int resultCode, final android.content.Intent data) {
    if (de.azapps.mirakel.settings.SettingsHelper.handleActivityResult(requestCode, resultCode, data, this)) {
        finish();
    }
}

@java.lang.Override
public void onPause() {
    getPersistenceManager().getDatabase().unregisterReceiptRowListener();
    super.onPause();
}

public static android.graphics.drawable.Drawable getBackButtonIcon(android.content.Context context) {
    return com.popdeem.sdk.uikit.utils.PDUIColorUtils.getTintedDrawable(context, R.drawable.pd_ic_arrow_back, R.color.pd_back_button_color, true);
}

@java.lang.Override
public void pause() {
    playing = false;
    try {
        gameThread.join();
    } catch (java.lang.InterruptedException e) {
        android.util.Log.e("bbb", ("InterruptedException:" + e));
    }
}

public void btnExitClicked(android.view.View button) {
    android.content.Intent intent = new android.content.Intent(this, com.app.carnelao.presentation.ui.login.LoginActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
    finish();
}

public boolean isNewsArticlesTableEmpty(android.database.sqlite.SQLiteDatabase database) {
    return (this.getNumberOfNewsArticles(database)) == 0;
}

public void set_complexty(int c) {
    this.complexty = c;
}

@java.lang.Override
public void requestFail() {
    android.widget.Toast.makeText(getContext(), R.string.load_fail, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(com.concentrationgame.MainApplication.mCallbackManager));
}

@retrofit2.http.FormUrlEncoded
@retrofit2.http.POST(value = "v1.0/")
retrofit2.Call<io.caly.calyandroid.Model.Response.BasicResponse> test(@retrofit2.http.Field(value = "key")
java.lang.String key);

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        progressBar.cancel();
        com.firebasechatdemo.support.utils.SnackBarUtil.showSnackBar(getActivityRegister(), R.string.warning_registration_fail);
    }else {
        updateProfile();
    }
}

protected android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
    if ((preferences) == null) {
        preferences = context.getSharedPreferences(getSharePreferenceName(), Context.MODE_PRIVATE);
    }
    return preferences;
}

@java.lang.Override
public android.view.View initView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_preview, container, false);
}

@java.lang.Override
public synchronized void onLoadMore() {
    loading = true;
    movieListAdapter.add(getMovies(((currentPgNo) + 1)));
    loading = false;
}

public void exoPlayerPause() {
    if ((isPlaying()) == true) {
        pause();
    }
}

private void setupMainWindowDisplayMode() {
    startLockTask();
    android.view.View decorView = setSystemUiVisilityMode();
    decorView.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {
        @java.lang.Override
        public void onSystemUiVisibilityChange(int visibility) {
            setSystemUiVisilityMode();
        }
    });
}

public void oCclearorder(android.view.View v) {
    clearorder();
}

@java.lang.Override
public void onConnected(android.os.Bundle dataBundle) {
    LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    mBestReading = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    if ((mBestReading) != null) {
        handleLocationChanged();
    }
}

public void onEvent(blueprint.com.sage.events.sessions.ResetPasswordEvent event) {
    android.widget.Toast.makeText(getActivity(), event.getApiSuccess().getMessage(), Toast.LENGTH_SHORT).show();
    blueprint.com.sage.utility.view.FragUtils.popBackStack(this);
}

private void showDocumentForUri(@android.support.annotation.NonNull
android.net.Uri uri, @android.support.annotation.Nullable
final java.lang.String password, @android.support.annotation.NonNull
final com.pspdfkit.configuration.activity.PdfActivityConfiguration configuration) {
    com.pspdfkit.ui.PdfActivity.showDocument(cordova.getActivity(), uri, password, configuration);
}

@android.support.annotation.Nullable
@java.lang.Override
public T get() {
    if (mBackingPreference.exists()) {
        return mGson.fromJson(mBackingPreference.get(), mType);
    }else {
        return com.garpr.android.preferences.persistent.PersistentGsonPreference.getDefaultValue();
    }
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    if (com.gigigo.vuforiacore.sdkimagerecognition.icloudrecognition.CloudRecognitionActivityLifeCycleCallBack.mActivity.equals(activity))
        this.mCloudReco.on_Destroy();
    
    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    populateCampaignsParse();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
}

public void setProgressChangeListeners(java.util.concurrent.CopyOnWriteArrayList<com.mapbox.services.android.navigation.v5.listeners.ProgressChangeListener> progressChangeListeners) {
    this.progressChangeListeners = progressChangeListeners;
    if ((navigationEngine) != null) {
        navigationEngine.setProgressChangeListeners(progressChangeListeners);
    }
}

@java.lang.Override
public void onClickSmile(int id) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.neri.alexa.cartaovacina.CadastroActivity.class);
    startActivity(intent);
}

private static void setStartOfRatingPeriod(android.content.SharedPreferences prefs, long startOfRatingPeriod) {
    prefs.edit().putLong(Constants.PREF_KEY_START_OF_RATING_PERIOD, startOfRatingPeriod).commit();
}

@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    setActivityInitialTouchMode(true);
    mActivity = getActivity();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    D_introWeekSystem().show();
}

@java.lang.Override
protected void onStop() {
    super.onStop();
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    super.onTouchEvent(ev);
    return true;
}

@java.lang.Override
public android.view.View getSelectedView() {
    return null;
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    videoPresenter.onSpinnerSelected(0);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    return true;
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String CREATE_LUMINARIAS_TABLE = context.getString(R.string.create_table_luminarias);
    db.execSQL(CREATE_LUMINARIAS_TABLE);
    java.lang.String CREATE_IMAGENES_TABLE = context.getString(R.string.create_table_imagenes);
    db.execSQL(CREATE_IMAGENES_TABLE);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@java.lang.Override
public android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
    return super.query(uri, projection, selection, selectionArgs, sortOrder);
}

private boolean isValidInLength(android.text.Editable s) {
    if ((respectPatternLength) && ((s.length()) > (maxLength)))
        return false;
    
    return true;
}

void up(android.view.MotionEvent event) {
    if ((controller) != null) {
        int index = event.getActionIndex();
        int id = event.getPointerId(index);
        controller.removePoint(id);
    }
}

private boolean controlling(android.graphics.Point p1, android.graphics.Point p2) {
    return (threatening(p1, p2)) && (!(isFrozen(p1)));
}

@java.lang.Override
public void onCaptureCompleted(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session, @android.support.annotation.NonNull
android.hardware.camera2.CaptureRequest request, @android.support.annotation.NonNull
android.hardware.camera2.TotalCaptureResult result) {
    showToast(("Saved: " + (mFile)));
    android.util.Log.d(com.example.android.camera2basic.Camera2BasicFragment.TAG, ("Saved: " + (mFile.toString())));
    unlockFocus();
}

@java.lang.Override
protected void populateView(android.view.View view, com.speedyfirecyclone.cardstore.Cardstructure card, int position) {
    android.widget.TextView listCardname = ((android.widget.TextView) (view.findViewById(R.id.listCardnameCardlistAdapter)));
    listCardname.setText(card.getCardTitle());
}

@java.lang.Override
public void onConnected() {
    microsoftBands.register();
    notificationManager = new org.md2k.microsoftband.notification.NotificationManager(this, microsoftBands.find());
    notificationManager.start();
}

@java.lang.Override
public void onNetworkError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.d(org.matrix.androidsdk.data.EventTimeline.LOG_TAG, "backPaginate onNetworkError");
    mIsBackPaginating = false;
    if (null != callback) {
        callback.onNetworkError(e);
    }else {
        super.onNetworkError(e);
    }
}

public void doShowBalance(android.view.View v) {
    act.sayOk("Customer Balance", A.balance, null);
}

public void Pause() {
    isRecording = false;
}

public void test_012() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "WLAN");
    check(testcase.Object_Text, testcase.Operation_checkExist, "WLAN");
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}

public void setEmptyView(android.view.View emptyView) {
    setEmptyView(false, emptyView);
}

@java.lang.Override
protected void afterViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.afterViewCreated(view, savedInstanceState);
    loadList(false);
}

@java.lang.Override
protected void onPostExecute(java.util.List<java.lang.String> cities) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()))) {
        locFirst = true;
    }
}

@java.lang.Override
public void onProgressChange(android.location.Location location, com.mapbox.services.android.navigation.v5.RouteProgress routeProgress) {
    if ((routeProgress.getAlertUserLevel()) == (NavigationConstants.ARRIVE_ALERT_LEVEL)) {
        endNavigation();
    }
}

private void returnSelectedWinery(final long wineryId) {
    android.content.Intent intent = new android.content.Intent(this, com.robcutmore.vinotes.ui.AddNoteActivity.class);
    intent.putExtra("id", wineryId);
    setResult(com.robcutmore.vinotes.ui.RESULT_OK, intent);
    finish();
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    view.setVisibility(View.GONE);
    searchView.setVisibility(View.GONE);
    if (listener != null) {
        listener.onClose();
    }
}

boolean isLoginOK() throws com.xsoft.android.ebookreader.repository.exceptions.CacheException;

@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    android.util.Log.v(org.radare2.installer.WebActivity.TAG, "Error: radare2 webserver did not start");
    mUtils.myToast("Error: radare2 webserver did not start", Toast.LENGTH_LONG);
}

@java.lang.Override
public void onResourceReady(java.io.File resource, com.bumptech.glide.request.animation.GlideAnimation<? super java.io.File> glideAnimation) {
    addSticker(android.graphics.BitmapFactory.decodeFile(resource.getAbsolutePath()));
}

public void fillFood(java.util.ArrayList<com.bulkes.myapplication2.Bulk> bulkesMap) {
    generateSmartMap(bulkesMap);
    startFoodTimer();
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    switchCoolFeed(false, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    popup(sms);
}

@java.lang.Override
public void changeBackground() {
    android.widget.RelativeLayout rl = ((android.widget.RelativeLayout) (this.findViewById(R.id.relLayout_layout)));
    teamfmg.hangman.Settings.setColor(rl);
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    if ((address) != null) {
    }
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    dropAllTables(db);
    this.onCreate(db);
}

@java.lang.Override
public void onDetected(java.lang.String instance_id) {
    gameController.interrupt(instance_id);
}

@java.lang.Override
public void handleMessage(android.os.Message message) {
    java.util.HashSet<scar.ChunkMetaPub> chunks = ((java.util.HashSet<scar.ChunkMetaPub>) (message.obj));
}

public android.view.MenuItem setVisible(boolean visible) {
    mFlags = ((mFlags) & (~(com.cocosw.bottomsheet.ActionMenuItem.HIDDEN))) | (visible ? 0 : com.cocosw.bottomsheet.ActionMenuItem.HIDDEN);
    return this;
}

@java.lang.Override
public void run() {
    onAnsweredElsewhere();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    com.lkworm.miniservice.GPSTrackService.StartService(this);
    android.util.Log.d(com.lkworm.miniservice.MainActivity.TAG, "onStart");
}

public void showGooglePlayServicesAvailabilityErrorDialog(final int connectionStatusCode) {
    com.google.android.gms.common.GoogleApiAvailability api = com.google.android.gms.common.GoogleApiAvailability.getInstance();
    android.app.Dialog dialog = api.getErrorDialog(this, connectionStatusCode, com.y_taras.scheduler.activity.MainActivity.RequestGooglePlayServices);
    dialog.show();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBoolean(io.github.hidroh.materialistic.LazyLoadFragment.STATE_EAGER_LOAD, mEagerLoad);
}

@java.lang.Override
public void process(net.osmand.plus.osmedit.data.Tag tag) {
    editText.setText(tag.value);
}

@android.support.annotation.RequiresPermission(value = Manifest.permission.BLUETOOTH)
public final boolean hasBluetoothLeAdvertising() {
    return (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) && (hasBluetoothLe())) && (android.bluetooth.BluetoothAdapter.getDefaultAdapter().isMultipleAdvertisementSupported());
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    ((org.wordpress.android.WordPress) (context.getApplicationContext())).component().inject(this);
    super.onReceive(context, intent);
}

@java.lang.Override
public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
    frameAvailable.set(true);
}

@java.lang.Override
public void onCommentEdit(org.dhis2.android.dashboard.api.models.InterpretationComment comment) {
    org.dhis2.android.dashboard.ui.fragments.interpretation.InterpretationCommentEditFragment.newInstance(comment.getId()).show(getChildFragmentManager());
}

public void grow(android.view.View view) {
    character += factor;
    t.setText(java.lang.Integer.toString(character));
}

public android.graphics.Bitmap getAsBitmap(java.lang.String key) {
    byte[] bytes = getAsBytes(key);
    if (bytes == null)
        return null;
    
    return com.zhy.base.cache.disk.Utils.bytes2Bitmap(bytes);
}

@java.lang.Override
public void onClick(android.view.View v) {
    displaySummary();
    setView(com.flaredown.flaredownApp.Checkin.CheckinActivity.Views.SUMMARY);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    mZMQRecvTask = new com.fan.gazeshutter.service.ZMQReceiveTask(this);
    mZMQRecvTask.execute(com.fan.gazeshutter.utils.NetworkUtils.getServerIP());
    return START_STICKY;
}

@java.lang.Override
public void onError(java.lang.Exception ex) {
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    handleGoogleResult(googleSignInResult, callback);
}

@java.lang.Override
public void onClick(android.view.View v) {
    int adapterPosition = getAdapterPosition();
    com.darurats.baking.models.Step Step = mStepData.get(adapterPosition);
    mClickHandler.onStepClick(Step, adapterPosition);
}

@java.lang.Override
public void onCancel(android.content.DialogInterface dialogInterface) {
    super.onCancel(dialogInterface);
    m_mediaPlayer.stop();
    if ((m_thread) != null) {
        m_thread.cancel(true);
    }
    m_mediaPlayer.release();
    m_mediaPlayer = null;
}

static void stopTransfer(int transferId) {
    synchronized(net.nitroshare.android.transfer.TransferWrapper.sActiveTransfers) {
        net.nitroshare.android.transfer.TransferWrapper transferWrapper = net.nitroshare.android.transfer.TransferWrapper.sActiveTransfers.get(transferId);
        if (transferWrapper != null) {
            transferWrapper.mTransfer.stop();
        }
    }
}

@dagger.Provides
@javax.inject.Named(value = "androidBluetoothPlatform")
@javax.inject.Singleton
public com.sensorberg.sdk.internal.interfaces.BluetoothPlatform provideAndroidBluetoothPlatform(android.bluetooth.BluetoothAdapter adapter, android.content.Context context) {
    return new com.sensorberg.sdk.internal.AndroidBluetoothPlatform(adapter, context);
}

@java.lang.Override
public void onRefresh() {
    this.messageCount += 10;
    getMessages();
}

public void datasetChanged(java.util.List<com.random.recyclerviewbug.MainModel> dataset) {
    android.support.v7.util.DiffUtil.DiffResult diffResult = calculateDiffResult(dataset);
    this.dataset = new java.util.ArrayList(dataset);
    diffResult.dispatchUpdatesTo(this);
}

@java.lang.Override
public void onRecordFrame(final java.nio.ByteBuffer frame) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    startActivityForResult(new android.content.Intent(getActivity(), ru.ifmo.md.lesson8.AddCity.class), REQUEST_ADD_CITY);
}

public void loadCategoryFragment() {
    android.support.v4.app.Fragment categoryFragment = new habit.duyle.habit.Fragments.CategoryMainFragment("display");
    replaceFragment(categoryFragment, R.id.category_container);
}

@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
    byte[] in = intent.getByteArrayExtra("CRYPTO_FILE_INPUT");
    if ((in.length) > 0)
        java.lang.System.out.println("Dekitaaaaaa");
    else
        java.lang.System.out.println("Dekinaiiiii");
    
}

@java.lang.Override
public void onWeatherError(com.survivingwithandroid.weather.lib.exception.WeatherLibException e) {
    temp.setText("Weather Error - parsing data");
    e.printStackTrace();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setListData();
}

