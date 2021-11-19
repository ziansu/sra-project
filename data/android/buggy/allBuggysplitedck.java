@java.lang.Override
protected void onResume() {
    super.onResume();
    makeToast("onResume!!");
    if (!(isDataMapServiceBound)) {
        isDataMapServiceBound = true;
        bindService(new android.content.Intent(this, com.qi.airstat.dataMap.DataMapService.class), serviceConnection, Context.BIND_AUTO_CREATE);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    (cards)--;
    updateValues();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.bugsense.trace.BugSenseHandler.initAndStartSession(this, com.kvest.developerslife.ui.activity.DevlifeBaseActivity.BUGSENS_APIKEY);
    supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(this, "Failed !", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.prasilabs.rssexample.rssfeeds.WebpageView.openRssDetail(context, rssItem.getTitle(), rssItem.getUrlLink());
}

@java.lang.Override
protected void prepare() throws at.bitfire.vcard4android.ContactsStorageException {
    journal = new at.bitfire.davdroid.journalmanager.JournalEntryManager(httpClient, remote, localCalendar().getName());
}

@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    viewPager.setCurrentItem(tab.getPosition());
    viewPagerAdapter.getCurrentFragment().onResume();
}

android.database.Cursor getCursor(java.io.File databaseFile) {
    android.database.sqlite.SQLiteDatabase database = getReadableDatabase(databaseFile);
    openedDatabases.put(databaseFile.getPath(), database);
    return getCursor(database);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    java.lang.System.out.println(((("Longitude: " + (location.getLongitude())) + " Latitude: ") + (location.getLatitude())));
    userLocation = location;
    loadUpvoteData();
}

@java.lang.Override
public void onResume() {
    android.util.Log.e("123", "frgmengt on resume");
    checkSoundImage();
    super.onResume();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPhotoPicker = blueprint.com.sage.shared.validators.PhotoPicker.newInstance(getParentActivity(), getParentFragment());
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(UserModel.UserNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(TripModel.TripNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(AccDataModel.AccDataNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(TripDataView.TripDataNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(GpsDataModel.GpsDataNames.CREATE_TABLE);
}

public android.content.Context getContext() {
    if (containsObject(com.jstakun.gms.android.config.ConfigurationManager.CONTEXT, android.content.Context.class)) {
        return ((android.content.Context) (com.jstakun.gms.android.config.ConfigurationManager.objectCache.get(com.jstakun.gms.android.config.ConfigurationManager.CONTEXT)));
    }
    return null;
}

private void setBitmap(android.graphics.Bitmap bitmap) {
    setBitmap(bitmap, 0, null, 0, 0);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new capstoneproject.androidnanodegree.com.cochelper.fragments.VideoFragment();
        case 1 :
            return new capstoneproject.androidnanodegree.com.cochelper.fragments.FileFragment();
        default :
            return null;
    }
}

public synchronized void close() {
    (de.danoeh.antennapod.core.storage.PodDBAdapter.counter)--;
    if ((de.danoeh.antennapod.core.storage.PodDBAdapter.counter) == 0) {
        android.util.Log.v(de.danoeh.antennapod.core.storage.PodDBAdapter.TAG, "Closing DB");
        de.danoeh.antennapod.core.storage.PodDBAdapter.db.close();
        de.danoeh.antennapod.core.storage.PodDBAdapter.db = null;
    }
}

public void onScanCompleted(java.lang.String path, android.net.Uri uri) {
    android.util.Log.v("Encode activity", path);
}

@java.lang.Override
public void switchToFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().add(R.id.content_container, fragment, "chatFragment").addToBackStack(java.lang.String.valueOf(fragment.getId())).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commitAllowingStateLoss();
}

public static java.lang.String getApplicationVersion(final android.app.Activity activity) {
    return im.vector.util.im.vector.Matrix.getInstance(activity).getVersion(false);
}

@java.lang.Override
public java.util.List<de.fau.amos.virtualledger.android.views.shared.transactionList.Transaction> getAll() {
    return this.allBankTransactions;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            refresh();
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onInterstitialLoaded(com.mopub.mobileads.MoPubInterstitial interstitial) {
    super.onInterstitialLoaded(interstitial);
    android.util.Log.d(BuildConfig.LOG_TAG, "Interstitial loaded");
    listener.onAdLoaded(adapter);
}

private void prepareStartProfile(int requestCode) throws android.os.RemoteException {
    android.content.Intent requestpermission = mService.prepareVPNService();
    if (requestpermission == null) {
        onActivityResult(requestCode, Activity.RESULT_OK, null);
    }else {
        startActivityForResult(requestpermission, requestCode);
    }
}

@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    android.widget.TextView tv = ((android.widget.TextView) (view));
    tv.setText(convertCursorRowToUXFormat(cursor));
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    mCallbackManager.onActivityResult(requestCode, resultCode, data);
    gameCallbackManager.onActivityResult(requestCode, resultCode, data);
}

public static void saveLastPath(java.io.File file, android.app.Activity act) {
    cn.liangxiwen.picpresser.SP.saveString(act, file.toString(), cn.liangxiwen.picpresser.SP.EXTRA_NAME_LAST_PATH);
}

@java.lang.Override
public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeString(getClass().getName());
    out.writeLong(timestamp);
    out.writeFloatArray(values);
    out.writeList(valuesList);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBooleanArray(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_CHECKED_DAYS, mCheckedDays);
    outState.putLong(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_WORKOUT_ID, mRoutineId);
    outState.putBoolean(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_TWO_PANE, mTwoPane);
}

public void backToMain(android.view.View view) {
    unregisterReceiver(msgReceiver);
    android.content.Intent result = new android.content.Intent();
    setResult(Activity.RESULT_OK, result);
    finish();
}

public static void addStock(android.content.Context context, java.lang.String symbol) {
    com.udacity.stockhawk.data.PrefUtils.editStockPref(context, symbol, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    resetColorAndBackground(index);
    btnSelected(v, index);
    mPager.setCurrentItem(index);
}

@java.lang.Override
public java.lang.String getItem(int position) {
    android.util.Log.e("SchoolIDItem", ("" + (cityZipList.get(position).get("sch_id"))));
    return cityZipList.get(position).get("sch_id");
}

private void refreshMarkers(com.google.android.gms.maps.GoogleMap map, java.util.List<com.busao.gyn.stops.BusStop> stops) {
    clearMarkers();
    for (com.busao.gyn.stops.BusStop stop : stops) {
        createMarker(stop);
    }
}

public void sendAll(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.therr.kenpodefinitionapp.DisplaySearchActivity.class);
    intent.putExtra(com.example.therr.kenpodefinitionapp.MainActivity.EXTRA_SEARCH_ALL, true);
    intent.putExtra(com.example.therr.kenpodefinitionapp.MainActivity.EXTRA_ARRAY_LIST, arrTerms);
    startActivity(intent);
}

@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.ArrayList<com.example.picturemanager.MyImage>> loader, java.util.ArrayList<com.example.picturemanager.MyImage> data) {
    android.util.Log.d("WAS", "I HERE?");
    setAdapter(data);
}

public void addMessage(android.view.View view, dot.dominionofcity.LayoutParams params) {
    messageList.addView(view, params);
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            messageWindow.fullScroll(ScrollView.FOCUS_DOWN);
        }
    });
}

public static void setVideoUri(java.lang.String uri) {
    com.hustunique.parsingplayer.player.media.ParsingMediaManager.getInstance(android.support.test.InstrumentationRegistry.getTargetContext()).playOrigin(uri);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    if ((mMainFab.getVisibility()) == (android.view.View.VISIBLE))
        mMainFab.setVisibility(View.INVISIBLE);
    
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((onItemLongClickListener) != null) {
        onItemLongClickListener.onItemLongClick(holder.itemView, position);
    }
    return false;
}

public android.graphics.Bitmap getImage() {
    byte[] imageAsByte = android.util.Base64.decode(image, Base64.DEFAULT);
    return android.graphics.BitmapFactory.decodeByteArray(imageAsByte, 0, imageAsByte.length);
}

public void receive(java.lang.Object data) {
    _handler.obtainMessage(hs_mannheim.gestureframework.connection.wifidirect.WifiDirectChannel.MSG_DATA_RECEIVED, data).sendToTarget();
    android.util.Log.d(TAG, ("Data received: " + data));
}

void stop(android.widget.TextView textView);

@java.lang.Override
public void removeRecyclerViewFromView() {
    android.view.ViewGroup parent = ((android.view.ViewGroup) (mContainer.getChildAt(0)));
    parent.removeViewAt(1);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    this.finish();
    super.onSaveInstanceState(outState);
}

private java.lang.String getFileName(co.smartreceipts.android.model.Trip trip) {
    return (trip.getDirectory().getName()) + ".pdf";
}

@java.lang.Override
public void onClick(android.view.View v) {
    uk.ac.ncl.csc2022.t14.bankingapp.Utilities.DataStore.sharedInstance().getConnector().logout(this);
    android.util.Log.d("TEST", "logout button: ON CLICK");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    app.minimize.com.seek_bar_compat.MaterialSeekBar materialSeekBar = ((app.minimize.com.seek_bar_compat.MaterialSeekBar) (findViewById(R.id.materialSeekBar)));
    materialSeekBar.setThumbColor(Color.BLUE);
    materialSeekBar.setProgressColor(Color.RED);
}

@java.lang.Override
public void onGlobalFocusChanged(android.view.View oldFocus, android.view.View newFocus) {
    self.internalUpdateLayoutForKeyboardStateChange();
}

@java.lang.Override
public void attachView(android.view.View header) {
    mParent.attachView(header);
}

@android.support.annotation.Nullable
public Model valueOrNull() {
    if ((offset) != (-1)) {
        return getOrNull(offset);
    }
    return getOrNull(0);
}

@java.lang.Override
public void onClick(android.view.View v) {
    max.sudoku.MainActivity.b = null;
    stopListenerOptions();
    stopListener();
    getValues();
    checkHorizontal();
    checkVertical();
    checkBox();
    startListenerOptions();
    startListener();
}

@java.lang.Override
public void onServiceDisconnected(final android.content.ComponentName name) {
    mService = null;
    mBounded = false;
    android.util.Log.d(diplom.jodoapp.LoginActivity.TAG, "onServiceDisconnected");
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.Intent cancelPendingFoodNotifications = new android.content.Intent(this, de.tum.in.tumcampusapp.services.FavoriteDishAlarmScheduler.class);
    cancelPendingFoodNotifications.putExtra(FavoriteDishAlarmScheduler.INTENT_CANCEL_ALL_NOTIFICATIONS, true);
    sendBroadcast(cancelPendingFoodNotifications);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mCurrentIndex = (((mCurrentIndex) - 1) + (mQuestionBank.length)) % (mQuestionBank.length);
    mCheated = false;
    updateQuestion();
}

public void setTemporaryImage(android.graphics.Bitmap bitmap) {
    this.img = bitmap.copy(Bitmap.Config.ARGB_8888, true);
    android.util.Log.d("PuzzleAdapter", ("New image has been set " + (imgId)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.david_2.petshop.Intent intent = new com.example.david_2.petshop.Intent(this, com.example.david_2.petshop.Record.class);
    startActivity(intent);
    adapter.notifyDataSetChanged();
}

public void removeItemFromBuffer(int departurePoint) {
    android.util.Log.d("mbta", "Removing item");
    getDB().deleteDeparturePointFromProfile(com.github.tommywalsh.mbta.ProfileEditHelper.BUFFER_PROFILE, departurePoint);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.i(LAG, "what to do");
    aa = $missing$;
}

private void drawDivider(android.graphics.Canvas canvas) {
    android.util.Log.d("Divider bound", mDividerBound.toString());
    canvas.drawLine(mDividerBound.left, mDividerBound.top, mDividerBound.right, mDividerBound.bottom, mDividerPaint);
}

void handlePostDhcpSetup() {
    setSuspendOptimizationsNative(com.android.server.wifi.WifiStateMachine.SUSPEND_DUE_TO_DHCP, true);
    mWifiNative.setPowerSave(true);
    mWifiP2pChannel.sendMessage(WifiP2pServiceImpl.BLOCK_DISCOVERY, WifiP2pServiceImpl.DISABLED);
    mWifiNative.setBluetoothCoexistenceMode(mWifiNative.BLUETOOTH_COEXISTENCE_MODE_SENSE);
    mDhcpActive = false;
    startBatchedScan();
    com.android.server.wifi.WifiNative.restartScan();
}

public void returnResult() {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(com.example.marco.criminalintent.CrimeFragment.HAS_CRIME_CHANGED, mHasCrimeChanged);
    data.putExtra(com.example.marco.criminalintent.CrimeFragment.ARG_CRIME_ID, mCrime.getId());
    getActivity().setResult(Activity.RESULT_OK, data);
}

@android.support.annotation.CallSuper
public void onDraw(@android.support.annotation.NonNull
android.graphics.Canvas canvas, @android.support.annotation.NonNull
android.graphics.Paint paint) {
    com.idonans.acommon.lang.CommonLog.d(((TAG) + " onDraw"));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getActivity(), "Cancel clicked", Toast.LENGTH_SHORT).show();
    dismiss();
}

public void onLogout() {
    com.parse.ParseUser.logOut();
    android.util.Log.d("TAG", "on log out");
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.tiferet.rebook.LoginActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onItemClick(int position, android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "Suggestion Selected!", Toast.LENGTH_SHORT);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.flatstack.android.App.appContext = this;
    timber.log.Timber.plant((BuildConfig.DEBUG ? new timber.log.Timber.DebugTree() : new com.flatstack.android.utils.TimberCrashReportingTree()));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.ab.piggybank.activity.MainDebtActivity.class);
    startActivity(i);
    finish();
}

public void surfaceChanged(android.view.SurfaceHolder holder, int format, int w, int h) {
    android.util.Log.d("surfaceChanged", "surfaceChanged");
    refreshCamera(mCamera);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    com.example.jack.thousandorigamicranes.NoteList.updateAdapter();
    hideActionBar();
    mListView.setAdapter(com.example.jack.thousandorigamicranes.NoteList.mAdapter);
    mListView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
}

public static final boolean isValidEmail(java.lang.CharSequence target) {
    if (target == null) {
        return false;
    }else {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_bus_view, container, false);
    displayTimes();
    return rootView;
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    removeGroup();
    removePersistentGroups();
    removeService();
    removeServiceDiscoveryRequest();
    unregisterP2pReceiver();
    unregisterP2p();
    unregisterWifiReceiver();
    android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Wifi Handler service destroyed");
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    setClipPosition(seekBar.getProgress(), seekBar.getMax());
}

public void toStageHint(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.sweets.rumandapp.StageHintActivity.class);
    intent.putExtra(Const.STAGE_ID_KEY, stageId);
    startActivity(intent);
    this.finish();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    tasks.remove(touchedTask);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    parent.notifyTasksChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}

private android.app.PendingIntent createPendingIntent() {
    android.content.Intent intent = new android.content.Intent(mContext, org.deviceconnect.android.deviceplugin.host.HostDeviceService.class);
    intent.setAction(org.deviceconnect.android.deviceplugin.host.camera.CameraOverlay.DELETE_PREVIEW_ACTION);
    android.app.PendingIntent contentIntent = android.app.PendingIntent.getService(mContext, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    return contentIntent;
}

public static void verifyStoragePermissions(android.app.Activity activity) {
    int permission = android.support.v4.app.ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    if (permission != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(activity, com.balloon.printer.printpdf.MainActivity.PERMISSIONS_STORAGE, com.balloon.printer.printpdf.MainActivity.REQUEST_EXTERNAL_STORAGE);
    }
}

public android.graphics.Rect getRectangle() {
    return new android.graphics.Rect(x, y, ((x) - (width)), ((y) - (height)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mInKbMode) && (isTypedTimeFullyLegal())) {
        finishKbMode(false);
    }else {
        tryVibrate();
    }
    notifyOnDateListener();
    dismiss();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.util.Log.i("Frag_position", ("" + position));
    edu.temple.markopromo.DisplayMessageActivity.filename = filelist.get(position);
    return edu.temple.markopromo.MessageFragment.create(position, filelist.get(position));
}

private void sendPlaybackNearlyFinishedEvent(com.willblaschko.android.alexa.interfaces.AvsItem item, long offsetInMilliseconds) {
    alexaManager.sendPlaybackNearlyFinishedEvent(item, offsetInMilliseconds, requestCallback);
    android.util.Log.i(com.willblaschko.android.alexavoicelibrary.BaseActivity.TAG, "Sending PlaybackNearlyFinishedEvent");
}

public void onClick(android.view.View v) {
    java.lang.System.out.println("Button clicked");
    java.lang.String loginString = loginTxt.getText().toString();
    _mClickListener.onLogInClick(loginString);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    com.firebirdberlin.nightdream.services.AlarmService.startAlarm(context);
    android.os.Bundle alarm = new android.os.Bundle();
    alarm.putString("action", "start alarm");
    com.firebirdberlin.nightdream.NightDreamActivity.start(context, alarm);
}

@java.lang.Override
public void onClick(android.view.View v) {
    setNewCredentials();
    verifyServerSettings(v);
    refreshCredentialsDisplay();
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    mDegree = ((float) (trembleAnimator.getAnimatedValue()));
    refresh();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.person_name :
            toggleDetails(v);
            break;
        case R.id.person_call :
            callButtonOnClick(v);
            break;
    }
}

@java.lang.Override
public void onStatusChanged(java.lang.String arg0, int arg1, android.os.Bundle arg2) {
    if ((org.immopoly.android.helper.LocationHelper.mlocListener) != null)
        org.immopoly.android.helper.LocationHelper.mLocationManager.removeUpdates(org.immopoly.android.helper.LocationHelper.mlocListener);
    
    org.immopoly.android.helper.LocationHelper.mlocListener = null;
    if (callback != null) {
        callback.onLocationChanged(true);
    }
}

public boolean requestAudioFocus() {
    mAudioManager = ((android.media.AudioManager) (getSystemService(Context.AUDIO_SERVICE)));
    int result = mAudioManager.requestAudioFocus(afChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
    return result == (android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.usc.itp476.contact.contactproject.ingamescreen.TargetActivity.REQUEST_TAKE_PHOTO)) && (resultCode == (RESULT_OK)))
        setPic();
    else
        if (resultCode == (com.usc.itp476.contact.contactproject.ingamescreen.TargetActivity.RETURN_FROM_RESULT))
            finish();
        
    
}

public void OnSetSelectedIndicatorView(android.widget.ImageView mSelectedIndicatorView) {
    if (null != (mMovingIndicatorBackgroundDrawable))
        mSelectedIndicatorView.setBackgroundDrawable(mMovingIndicatorBackgroundDrawable);
    
    if (null != (mMovingIndicatorSrcDrawable)) {
        mSelectedIndicatorView.setImageDrawable(mMovingIndicatorSrcDrawable);
    }
}

@java.lang.Override
public rx.Single<? extends okhttp3.ResponseBody> call(okhttp3.ResponseBody responseBody) {
    if (com.xabber.android.data.xaccount.XabberAccountManager.getInstance().deleteXMPPAccountsFromRealm())
        return rx.Single.just(responseBody);
    else
        return rx.Single.error(new java.lang.Throwable("Realm: xmpp accounts deletion error"));
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    btn.setVisibility(View.INVISIBLE);
    java.lang.String text = "Enter Time in MM:SS";
    editText.setText(text);
    setProgressBarProgress(root, 0);
    setStartButton(root);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    CountryPos = 0;
    PhoneCode.setText(("+" + (myCountries.get(position).getCode())));
}

@java.lang.Override
public void onClick(android.view.View v) {
    time = java.lang.System.currentTimeMillis();
    mSensorManager.registerListener(this, mAccelerometerSensor, SensorManager.SENSOR_DELAY_GAME);
    mSensorManager.registerListener(this, mGyroscopeSensor, SensorManager.SENSOR_DELAY_GAME);
    java.io.File path = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
}

public void back() {
    if ((indexPointer) == 0) {
        android.util.Log.d("ProgressDotBar", "Index can't be negative");
        return ;
    }
    (indexPointer)--;
    updateDots();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    android.content.Intent intentLogin = new android.content.Intent(this, com.leptonsoftware.route.MainActivity.class);
    startActivity(intentLogin);
}

public static android.content.Context getContext() {
    if ((org.qtproject.qt5.android.QtNative.m_activity) == null)
        return org.qtproject.qt5.android.QtNative.m_activity;
    
    return org.qtproject.qt5.android.QtNative.m_service;
}

@java.lang.Override
public void init(android.content.Context context, boolean bought) {
    game = new breathing.philipps.apps.com.breathing.BreathingOption(context);
    options = new breathing.philipps.apps.com.breathing.BreathingGame(context);
    this.bought = bought;
}

@java.lang.Override
public int getPoints() {
    android.util.Log.d("myLog", ("points = " + (points)));
    return points;
}

@java.lang.Override
public void unLiked(com.like.LikeButton likeButton) {
    firebaseutils.removelike(offlinedata.Id);
    holder.favoriteButton.setLiked(false);
    android.widget.Toast.makeText(com.example.massa.luxvilla.adaptadores.adaptadorrvtodasoffline.ctx, offlinedata.Id, Toast.LENGTH_LONG).show();
}

