@java.lang.Override
public void onReceivedTitle(android.webkit.WebView view, java.lang.String title) {
    mWebChromeClient.onReceivedTitle(view, title);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        dialog.dismiss();
        renameItem(fileInfo, nameField.getText().toString());
    }
    return false;
}

public static android.widget.TextView setTextWithFormat(java.lang.Object container, int rid, java.lang.Object value) {
    return com.dhy.xintent.XCommon.setTextWithFormat(container, rid, value, false);
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

private void sendPlaybackFinishedEvent(com.willblaschko.android.alexa.interfaces.AvsItem item) {
    alexaManager.sendPlaybackFinishedEvent(item, requestCallback);
    android.util.Log.i(com.willblaschko.android.alexavoicelibrary.BaseActivity.TAG, "Sending SpeechFinishedEvent");
}

@java.lang.Override
public void onResume() {
    super.onResume();
    hideSystemUi();
    if (((com.google.android.exoplayer2.util.Util.SDK_INT) <= 23) || ((player) == null)) {
        initializePlayer(vid_url);
    }
}

@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    android.util.Log.d(com.lukedeighton.wheelsample.AttendantActivity.TAG, ("onTextChanged:" + s));
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.values[0]) <= 50)
        if (mode)
            flipNext();
        else
            flipPrevious();
        
    
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    OBHL.setEnermyTowerPosition(enTran);
    setEnTowerBtn.setVisibility(View.INVISIBLE);
    OKBtn.setVisibility(View.INVISIBLE);
    enProcess.startEnermyProcess();
}

public void bindGuardService() {
    com.squareup.leakcanary.CanaryLog.d("AssistiveResultService bindGuardService");
    android.content.Intent intent = new android.content.Intent(this, com.squareup.leakcanary.assistivetouch.AssistiveGuardService.class);
    intent.putExtra(AssistiveGuardService.BIND_KEY, AssistiveGuardService.BIND_ASSISTIVE_RESULT_SERVICE);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
    isBind = true;
}

public void surfaceCreated(android.view.SurfaceHolder holder) {
    android.util.Log.e(TAG, "recorder surfaceCreated:");
    android.view.SurfaceHolder surfaceHolder = holder;
}

@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    if (status.isSuccess()) {
        removeSavedGeofences();
    }else {
        android.util.Log.e(TAG, ("Removing geofence failed: " + (status.getStatusMessage())));
        sendError();
    }
}

public void stop(android.view.View view) {
    mySound.release();
    mySound = null;
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getMainActivity(), com.sandbox.parker.sandbox.song.SongActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    intent.putExtra("song", song);
    startActivity(intent);
}

public void refresh() {
    android.util.Log.d("heilige", "scheisse");
    getFragmentManager().beginTransaction().detach(this).attach(this).commit();
}

public static void loadMozGlue(final android.content.Context context) {
    synchronized(org.mozilla.gecko.mozglue.GeckoLoader.sLibLoadingLock) {
        if (org.mozilla.gecko.mozglue.GeckoLoader.sMozGlueLoaded) {
            return ;
        }
        org.mozilla.gecko.mozglue.GeckoLoader.sMozGlueLoaded = true;
    }
    org.mozilla.gecko.mozglue.GeckoLoader.doLoadLibrary(context, "mozglue");
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment = null;
    switch (position) {
        case 0 :
            fragment = com.fbm.nkd.cs403x_final.SectionsPagerAdapter.cameraFragment;
            break;
        case 1 :
            fragment = com.fbm.nkd.cs403x_final.SectionsPagerAdapter.feedFragment;
            break;
        case 2 :
            fragment = com.fbm.nkd.cs403x_final.SectionsPagerAdapter.mapFragment;
            break;
    }
    return fragment;
}

@java.lang.Override
protected android.support.v4.view.ViewPropertyAnimatorCompat onAnimatedAdd(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    int offsetDelay = 50;
    return android.support.v4.view.ViewCompat.animate(holder.itemView).translationY(0).setInterpolator(mInterpolator).setStartDelay((offsetDelay * (holder.getLayoutPosition())));
}

public void deleteUser(com.example.catherinemorris.shoppinwithfriends.User user) {
    android.util.Log.d("User deleteUser is called", ("" + user));
    db.deleteFriend(this, user.getUser());
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(context, com.nur.griesmic.grizllym_asus.nur_2.ScanActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.w("Event Listener", "loadHunt:onCancelled", databaseError.toException());
    android.widget.Toast.makeText(getActivity(), "Failed to retrieve hunt info.", Toast.LENGTH_SHORT).show();
}

public static boolean getAllowAdvancedData(android.content.Context context) {
    return com.paulvarry.intra42.Tools.AppSettings.Advanced.getAllowAdvancedData(com.paulvarry.intra42.Tools.AppSettings.getSharedPreferences(context));
}

public void rpc(@android.support.annotation.NonNull
java.lang.String procedureName, @android.support.annotation.NonNull
java.util.List<de.kuschku.libquassel.primitives.types.QVariant> params) {
    de.kuschku.util.AndroidAssert.assertNotNull(provider);
    provider.dispatch(new de.kuschku.libquassel.functions.types.RpcCallFunction(procedureName, params));
}

@java.lang.Override
public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.dhchoi.crowdsourcingapp.activities.TaskCompleteActivity.class);
    intent.putExtra(Task.TASK_KEY_SERIALIZABLE, mMarkerToTask.get(marker));
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentBook) == 66) {
        currentBook = 1;
    }else {
        currentBook += 1;
    }
    updateRecycleView(currentBook);
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        ((android.app.Activity) (v.getContext())).onBackPressed();
        mSearchName = search.getText().toString();
    }
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(getBaseContext(), "Authentication failed.", Toast.LENGTH_SHORT).show();
    }
}

private void onBlockClick(android.view.View view, int position) {
    io.rover.model.Block block = getBlockAtPosition(position);
    if ((block != null) && ((mBlockListener) != null)) {
        mBlockListener.onBlockClick(block);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    joinHouse(houseName, password);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getApplicationContext(), "大家一起方", Toast.LENGTH_SHORT).show();
}

private void setDescription(java.lang.String text) {
    android.widget.TextView infoView = ((android.widget.TextView) (view.findViewById(R.id.detail_info)));
    infoView.setText(text);
}

public static void recordAlert(org.json.JSONObject jmessage) {
    de.xavaro.android.common.Json.put(jmessage, "priority", "alertinfo");
    de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.net.Uri uri = mPhotoFiles.get(photoIndex);
    java.lang.System.out.println(("uri.toString " + (uri.toString())));
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(captureImage, com.bignerdranch.android.criminalintent.CrimeFragment.REQUEST_PHOTO);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((plugin) != null) {
        plugin.deleteRecording(getRecording());
        getMapActivity().getContextMenu().close();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    setContentView(R.layout.activity_info_preview);
    descendants(savedInstanceState);
    db = new com.itechex.centraly.credentials.database.DatabaseController(this);
    initOfFields();
    populatingView();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    setContentView(com.example.tombarrett.estimotemirror.R.layout.activity_main);
    setButtons();
    if ((tempProduct) != null)
        pickup(tempProduct);
    
}

public void skip() {
    android.content.Intent intent = new android.content.Intent();
    startActivity(intent.setClass(this, com.umb.cs682.projectlupus.activities.main.Home.class));
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mSignInClicked = false;
    if (mFirstTimeSignIn)
        android.widget.Toast.makeText(this, ("Connected to " + (getEmail())), Toast.LENGTH_LONG).show();
    
}

@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    android.util.Log.d(com.huhx0015.doordashchallenge.services.LocationService.LOG_TAG, "onConnectionFailed(): Google API client connection suspended.");
    mIsLocationFound = true;
    mListener.onLocationFailed();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((mTracksFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "tracks_fragment", mTracksFragment);
    }
}

private void goToRibbons() {
    updateDatabaseWithRibbon();
    android.content.Intent ribbonIntent = new android.content.Intent(getApplicationContext(), com.lerenard.bible.RibbonActivity.class).putExtra(com.lerenard.bible.ReadingActivity.RIBBON_KEY, ribbon);
    startActivityForResult(ribbonIntent, com.lerenard.bible.ReadingActivity.SELECT_RIBBON_CODE);
}

public void goToMainActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.android.ubclaunchpad.driver.UI.MainActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    android.content.Intent returnIntent = new android.content.Intent();
    returnIntent.putExtra(jycprogrammer.ultimatedbz.ezlapse.FullscreenCamera.EXTRA_PASS, true);
    setResult(jycprogrammer.ultimatedbz.ezlapse.RESULT_CANCELED, returnIntent);
    finish();
}

private void setTitle(java.lang.String title) {
    android.widget.TextView post_title = ((android.widget.TextView) (mView.findViewById(R.id.post_title)));
    post_title.setText(title);
}

@com.facebook.react.bridge.ReactMethod
public void getMacAddress(final com.facebook.react.bridge.Callback callback) {
    android.net.wifi.WifiInfo info = wifi.getConnectionInfo();
    java.lang.String macAddress = wInfo.getMacAddress();
    callback.invoke(ssid);
}

private java.lang.String arrayToString() {
    java.lang.String result = "";
    for (com.google.android.gms.maps.model.LatLng l : routePoints) {
        result += (((l.longitude) + " ") + (l.latitude)) + " ";
    }
    return result;
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.podraza.android.gaogao.gaogao.MainActivity.page = position;
    return com.podraza.android.gaogao.gaogao.MainActivity.PlaceholderFragment.newInstance((position + 1), getPageTitle(position));
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        textView.setText(textOfNote);
        vs.showPrevious();
    }
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    doUnbindService();
    unregisterReceiver(myNoisyAudioStreamReceiver);
    android.util.Log.d(com.fritzbang.theplayer.ThePlayerActivity.DEBUG_TAG, "destroying activity");
}

@java.lang.Override
public void stopScanning() {
    super.stopScanning();
    timerResortList.cancel();
    timerResortList.purge();
    android.util.Log.e(io.ap1.libap1beaconmngt.ServiceBeaconManagement.TAG, "stopScanning: timer canceled");
}

@java.lang.Override
protected void onPreExecute() {
    loading = android.app.ProgressDialog.show(context, "Loading", "Please Wait...");
}

void updateHaverStatus(@android.support.annotation.NonNull
long desireId, @android.support.annotation.NonNull
long userId, @android.support.annotation.NonNull
de.fau.cs.mad.wanthavers.common.Haver haver, @android.support.annotation.NonNull
int status, @android.support.annotation.NonNull
wanthavers.mad.cs.fau.de.wanthavers_android.data.source.haver.HaverDataSource.UpdateHaverStatusCallback callback);

@java.lang.Override
public void onStop() {
    super.onStop();
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    android.util.Log.i("onStop", ": CONTAINER");
}

public void onActivityResume(android.app.Activity activity) {
    databaseListenerActivity = null;
    activeActivity = activity;
    if ((mBackgroundTasks.mInitializationTask) != null) {
        mBackgroundTasks.mInitializationTask.setInitializationListener(this);
    }
    mBackgroundServices.clearDestroyingFlag();
    configureView();
    bindToService();
}

public java.util.List<android.hardware.Camera.Size> getSupportedPictureSizes(android.hardware.Camera.Parameters parameters) {
    java.util.List<android.hardware.Camera.Size> pictureSizes = parameters.getSupportedPictureSizes();
    checkSupportedPictureSizeAtPreviewSize(pictureSizes, parameters);
    return pictureSizes;
}

public static <T> T bind(android.database.Cursor cursor, java.lang.Class<T> entity, int position) {
    return curson.Curson.bind(cursor, entity, position);
}

@java.lang.Override
public void init(android.os.Bundle savedInstanceState) {
    setTargetRepository("ccrama");
    setGuestOAuth2Token(SecretConstants.GithubBotRepo);
    enableUserGitHubLogin();
    setExtraInfo(getIntent().getExtras().getString("stacktrace"));
    canEditDebugInfo();
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    currentAcceleration = event.values[1];
    telemetry.log.add(("acceleration is: " + (java.lang.Float.toString(currentAcceleration))));
    android.util.Log.d("accelerometer", java.lang.Float.toString(currentAcceleration));
}

public static int init(android.app.Activity activity) {
    org.qtproject.qt5.crypt.Crypter.mActivity = activity;
    org.qtproject.qt5.crypt.Crypter.provider = new org.qtproject.qt5.crypt.ZofenProvider(activity);
    if (!(org.qtproject.qt5.crypt.Crypter.isKukaytaInstalled())) {
        org.qtproject.qt5.crypt.Crypter.installKukatya();
        return org.qtproject.qt5.crypt.Crypter.KUKAYTA_NOT_INSTALLED_ERR;
    }
    return 0;
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    android.util.Log.i(com.example.dscs.StartFragment.TAG, "Service is connected.");
    mBinder = ((com.example.dscs.CrawlingService.CrawlingServiceBinder) (service));
    mBinder.setOnJobFinishedListener(this);
    refreshButtonState(false);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_options);
    findViewById(R.id.party_name).setVisibility(View.GONE);
}

public static void filePermissions(android.app.Activity activity, int id, com.liangmayong.base.support.permission.ActivityPermission.OnPermissionListener listener) {
    java.lang.String[] permissionsNeeded = new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE , Manifest.permission.READ_EXTERNAL_STORAGE };
    com.liangmayong.base.support.permission.ActivityPermission.requestPermissions(activity, id, permissionsNeeded, listener);
}

@java.lang.Override
public void onProviderDisabled(java.lang.String s) {
    android.util.Log.d("GPSTest", "onProviderDisabled called");
    checkLocationProviderEnabled();
}

@java.lang.Override
public void update() {
    executeTransaction(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder<>(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel<com.raizlabs.android.dbflow.structure.TModel>() {
        @java.lang.Override
        public void processModel(com.raizlabs.android.dbflow.structure.TModel model) {
            model.update();
        }
    }).build());
}

@java.lang.Override
public void onFailure(int statusCode, org.apache.http.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    android.util.Log.d("mentions timeline fail", errorResponse.toString());
    android.widget.Toast.makeText(getActivity(), R.string.get_timeline_fail, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String grabbedString = input.getText().toString();
    listItems.set(pos, new com.example.ud4.todo_list.ListItem(grabbedString));
    adapter.notifyDataSetChanged();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    save();
    super.onSaveInstanceState(bundle);
    this.finish();
}

private void cancelDueToCancellation(java.lang.Exception e) {
    if (cancelled)
        return ;
    
    cancelled = true;
    android.util.Log.d(org.floens.chan.utils.FileCache.TAG, "Cancel due to cancellation");
    purgeOutput();
    finish();
}

public static com.android.tigerhelp.http.request.requestBuilder newInstance(java.lang.String method) {
    return new com.android.tigerhelp.http.request.requestBuilder(method);
}

@java.lang.Override
public void onCarrierNameNotMatch(int smsId, java.lang.String message) {
    android.widget.Toast.makeText(this, ("onCarrierNameNotMatch: " + message), Toast.LENGTH_SHORT).show();
}

private java.lang.String updateURL(java.lang.String searchWord) {
    searchWord = cleanUpString(searchWord);
    java.lang.String updatedURL = ((com.example.android.booklistingproject_udacity.BookActivity.GOOGLE_BOOK_URL) + searchWord) + "&maxResults=30";
    return updatedURL;
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.ibm.mobilefirstplatform.clientsdk.android.security.facebookauthentication.FacebookAuthenticationManager.getInstance().onActivityResultCalled(requestCode, resultCode, data);
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    android.util.Log.i(TAG, "onSocketServiceDisconnected! ");
    socketIsBound = false;
    sSocketservice = null;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    listView = ((android.widget.ListView) (findViewById(R.id.vaccines_list)));
    registerForContextMenu(listView);
    loadDataWithCursor();
}

@java.lang.Override
public void noiseSensorDataReady(long timestamp, float rms, float spl, float[] bands) {
    noiseReading = new ch.ethz.soms.nervous.competition.model.NoiseReading(rms, timestamp, team);
    android.util.Log.d(ch.ethz.soms.nervous.competition.SensorService.DEBUG_TAG, "Noise data collected");
}

public io.appium.java_client.android.AndroidDriver<org.openqa.selenium.WebElement> getDriver() {
    if ((driver) == null) {
        try {
            this.initDriver();
        } catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        }
    }
    return driver;
}

public float getFontHeight(android.graphics.Paint paint, java.lang.String str) {
    android.graphics.Rect rect = new android.graphics.Rect();
    paint.getTextBounds(str, 0, str.length(), rect);
    return rect.height();
}

public void setCookingDay(ru.spbau.mit.foodmanager.Day day, java.lang.Boolean isCookingDay, android.content.Context c) {
    this.isCookingDay.put(day, isCookingDay);
    ru.spbau.mit.foodmanager.MenuSettings.saveMenuSettings(c);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.d(org.example.xwalkembedded.XWalkExoMediaPlayer.MediaPlayerListener.TAG, "=====onCompletion ");
    mCompletionListener.onCompletion(mp);
    showReplayButton(true);
}

@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, com.nostra13.universalimageloader.core.assist.FailReason failReason) {
    me.ccrama.redditslide.util.LogUtil.v(("Loading failed because " + (failReason.getCause().getMessage())));
}

public void decrement(android.view.View view) {
    int numberOfCoffees = (quantity) - 1;
    (quantity)--;
    if (numberOfCoffees < 0) {
        quantity = 0;
        numberOfCoffees = 0;
    }
    display(numberOfCoffees);
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    se.ju.taun15a16.group5.mjilkmjecipes.recipelist.ShowRecipeListActivity sct = ((se.ju.taun15a16.group5.mjilkmjecipes.recipelist.ShowRecipeListActivity) (activity));
    sct.itemClicked(data.get(mPosition).getId());
}

@java.lang.Override
protected void ItemViewClickListener(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if ((touchItemHolder) != null)
        touchItemHolder.SingleChoose(holder, getSection(position), position);
    
}

public void onClick(android.content.DialogInterface dialog, int which) {
    _activateProfile(_profile, _startupSource, _interactive, _activity, _eventNotificationSound);
}

@java.lang.Override
public com.wenjiehe.xingji.Adapter.ChatRecyclerViewAdapter.ChatViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(context).inflate(R.layout.recyclerview_chat_list, parent, false);
    com.wenjiehe.xingji.Adapter.ChatRecyclerViewAdapter.ChatViewHolder nvh = new com.wenjiehe.xingji.Adapter.ChatRecyclerViewAdapter.ChatViewHolder(v, com.baidu.location.h.a.i);
    return nvh;
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    if (((hyjjr.cs160.com.safe_radius.Global) (getApplication())).isTurnedOn()) {
        startRequestLocation2();
        routine_check_connection.startUpdates();
        routine_check_history.startUpdates();
    }
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    android.widget.Toast.makeText(context, "onDoubleTap", Toast.LENGTH_SHORT).show();
    return true;
}

private void initBundleVariables(android.os.Bundle bundle) {
    bundle_id = bundle.getInt(DBConstants.BUNDLE_CAR_ID);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.d("GeofencesScanner.onConnected", "xxx");
    registerAllEventGeofences();
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.ocetnik.timer.BackgroundTimerPackage(), new com.BV.LinearGradient.LinearGradientPackage(), new com.dieam.reactnativepushnotification.ReactNativePushNotificationPackage(), new co.apptailor.googlesignin.RNGoogleSigninPackage(), new com.mackentoch.beaconsandroid.BeaconsAndroidPackage());
}

@java.lang.Override
public void onGroupExpand(int i) {
    android.widget.Toast.makeText(this, ("그룹 열림 " + i), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    try {
        doDisconnect();
        this.wait(1000);
        doConnect();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}

public void decreaseBeerCount(android.view.View v) {
    if ((mBeerCount) != 0)
        (mBeerCount)--;
    
    mTotalBeersTextView.setText(getString(R.string.beers_had, mBeerCount));
    updateBAC();
}

private long getNowUnixTimeUs() {
    if ((elapsedRealtimeOffsetMs) != 0) {
        return ((android.os.SystemClock.elapsedRealtime()) * 1000) + (elapsedRealtimeOffsetMs);
    }else {
        return (java.lang.System.currentTimeMillis()) * 1000;
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    initializeInjector();
}

@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
    surface = new android.view.Surface(surfaceTexture);
    emExoPlayer.setSurface(surface);
    if (playRequested) {
        emExoPlayer.setPlayWhenReady(true);
    }
}

public void birthdayCheck(android.view.View view) {
    boolean isChecked = birthdayCheckBox.isChecked();
    if (isChecked) {
        birthdayChecked = true;
    }else {
        birthdayChecked = false;
        birthdayText = "Happy Birthday!";
    }
    setVisibility(birthdayChecked, birthdayEditText);
    saveBirthdayPreferences();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.teamname.tutortrader.ViewImageActivity.class);
    intent.putExtra("index", java.lang.String.valueOf(selectedSessionIndex));
    startActivity(intent);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.content.SharedPreferences.Editor editor = getPreferences(com.appfactory.quinn.m3ustreamtest2.MODE_PRIVATE).edit();
    editor.putInt("Last Channel", mCurrentIndex);
    editor.commit();
}

@java.lang.Override
public boolean onCreateOptionMenu(android.view.Menu menu) {
    super.onCreateOptionsMenu(menu);
    menu.add(0, com.example.marslander.MarsLanderActivity.MENU_START, 0, R.string.menu_start);
    return true;
}

