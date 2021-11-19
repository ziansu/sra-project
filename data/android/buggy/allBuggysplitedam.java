public void ChangeRadius(long progress) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.example.xiaoyi.sleepinthetrain.MapsActivity.class);
    intent.putExtra("POINT_RADIUS_CHANGED", progress);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkAnswer(false, getCurrentQuestion());
}

public void bufferStrings(java.lang.String input) {
    allInput += input;
    android.util.Log.e(com.example.sdp11.wmd.BluetoothLEService.TAG, ("allInput = " + (allInput)));
    parseTransferredData();
}

private void saveStudent(com.example.pustikom.adapterplay.user.Student student, int mode) {
    android.database.sqlite.SQLiteDatabase wdb = db.getWritableDatabase();
    if (mode == 0) {
        db.insert(student);
    }else {
        db.update(student);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((targetBike) != null) {
        navigate(targetBike);
    }
}

@java.lang.Override
public void onNewTransfer(net.nitroshare.android.transfer.Transfer transfer) {
    transfer.setId(mTransferNotificationManager.nextId());
    mTransferManager.addTransfer(transfer);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    android.util.Log.d(com.app.kent.volume.Main.TAG, ("addDynamicButton onLongClick(): " + (v.getId())));
    actionLongClick(v, buttonName);
    return true;
}

@java.lang.Override
protected void onStop() {
    android.util.Log.i(net.videgro.ships.activities.OpenDeviceActivity.TAG, "onStop");
    if ((usbReceiver) != null) {
        unregisterReceiver(usbReceiver);
    }
    super.onStop();
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    onActivityResult(0, org.deviceconnect.android.manager.RESULT_CANCELED, null);
    if (mIsBind) {
        unbindService(mServiceConnection);
        mIsBind = false;
    }
    finish();
}

public static void startForResult(android.app.Activity activity, java.lang.String title) {
    android.content.Intent intent = new android.content.Intent(activity, com.everypay.sdk.views.CardFormActivity.class);
    intent.putExtra("title", title);
    activity.startActivityForResult(intent, com.everypay.sdk.views.CardFormActivity.REQUEST_CODE);
}

@java.lang.Override
public void onDelete(wipraktikum.informationwallandroidapp.BusinessObject.BlackBoard.BlackBoardAttachment blackboardAttachment) {
    attachmentContainer.removeView(attachmentView);
    blackBoardAttachments.remove(blackboardAttachment);
    blackBoardAttachmentViews.remove(attachmentView);
    blackboardDeleteAttachmentDialog.dismiss();
}

public static com.kantilever.t1c3android.domain.OrderState findOrderState(java.lang.String name) {
    com.kantilever.t1c3android.domain.OrderState state = null;
    for (com.kantilever.t1c3android.domain.OrderState orderState : com.kantilever.t1c3android.domain.OrderState.values())
        if (orderState.name.equals(name))
            state = orderState;
        
    
    return state;
}

@java.lang.Override
public void onPartialResults(android.os.Bundle partialResults) {
    restartListening();
    android.util.Log.d("onPartialResults", "onPartialResults");
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<java.util.List<io.volcain.booklisting.model.Book>> loader) {
    mAdapter.clear();
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception exception) {
    android.util.Log.e("tag", "signInAnonymously:FAILURE", exception);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.rahulgoel.moviesdb.Movie_Detail.Movie_result> call, java.lang.Throwable t) {
    android.util.Log.i("Failure", "Not Received");
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference mute, java.lang.Object val) {
    java.lang.Boolean disable = ((java.lang.Boolean) (val));
    if (disable.booleanValue()) {
    }else {
    }
    return false;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.v(bicyclewatchdog.com.bicyclewatchdog.gps_management.GpsManager.TAG, "Successful connection to google api");
    if ((shouldResume) || true) {
        android.util.Log.v(bicyclewatchdog.com.bicyclewatchdog.gps_management.GpsManager.TAG, "Calling resumeGPS...");
        resumeGPS();
        shouldResume = false;
    }
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    setIntent(intent);
    setupFragment(null);
}

@java.lang.Override
public void onNewAssignmentClick() {
    com.example.android.grader.fragments.CreateFragment createFragment = com.example.android.grader.fragments.CreateFragment.newInstance();
    fragmentManager.beginTransaction().replace(R.id.fragmentContainer, createFragment, com.example.android.grader.activities.MainActivity.CREATE_FRAGMENT).addToBackStack(null).commit();
}

@java.lang.Override
protected boolean onDeleteLight(final android.content.Intent request, final android.content.Intent response, final java.lang.String serviceId, final java.lang.String lightId) {
    return sendLightRequest(serviceId, "DELETE", response);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    if (this.isSystemShowing)
        setVisibility(View.GONE);
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    fragmentManager = getFragmentManager();
}

public static void setupActionBar(android.content.Context context) {
    if (((Build.VERSION.SDK_INT) >= 11) && (de.nico.ha_manager.helper.Utils.isActionBarAvailable)) {
        de.nico.ha_manager.helper.ActionBarWrapper actionBarWrapper = new de.nico.ha_manager.helper.ActionBarWrapper(context);
        actionBarWrapper.setDisplayHomeAsUpEnabled(true);
    }
}

@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(org.wordpress.android.ui.posts.services.PostEvents.PostMediaInfoUpdated event) {
    if ((isAdded()) && ((org.wordpress.android.WordPress.getCurrentBlog()) != null)) {
        getPostListAdapter().mediaUpdated(event.getMediaId(), event.getMediaUrl());
    }
}

@java.lang.Override
public void onMenuItemLongClick(android.view.View clickedView, int position) {
    android.widget.Toast.makeText(this, ("Long clicked on position: " + position), Toast.LENGTH_SHORT).show();
}

@android.test.suitebuilder.annotation.SmallTest
public void testEditText() {
    android.widget.EditText editText = ((android.widget.EditText) (getActivity().findViewById(R.id.email)));
    org.junit.Assert.assertNull(editText);
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent e) {
    java.lang.System.out.println((((("LISTENER: Got an 'onDown' MotionEvent at location (" + (e.getX())) + ", ") + (e.getY())) + ")"));
    return true;
}

@java.lang.Override
protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    super.onLayout(changed, left, top, right, bottom);
    android.util.Log.i(TAG, "onLayout");
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    throw new java.lang.UnsupportedOperationException("Not yet implemented");
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.example.foodnote.backend.apis.recipeApi.model.Recipe>> loader, java.util.List<com.example.foodnote.backend.apis.recipeApi.model.Recipe> data) {
    mAdapter.setRecipes(data);
    mAdapter.notifyDataSetChanged();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.activity_familychat, container, false);
    if ((jsc.cactus.com.weanimal.g_animal.main.familychat.FamilyChatDialog.chatListViewAdapter) == null)
        init(view);
    
    return view;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    isempty = true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String tag = v.getTag().toString();
    java.lang.System.out.println("I clicked on a classroom");
    java.lang.System.out.println(("The tag I clicked on was: " + tag));
    int tagNumber = java.lang.Integer.parseInt(tag);
    getTextBoxClicked(tagNumber);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    incompleteCB.setChecked(false);
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "power off success");
    updateLightBulb(false);
    _sbPwm.setProgress(0);
    done();
}

private int maxAdvertiseInstances() {
    com.android.bluetooth.btservice.AdapterService adapter = com.android.bluetooth.btservice.AdapterService.getAdapterService();
    int numOfAdvtInstances = adapter.getNumOfAdvertisementInstancesSupported();
    return numOfAdvtInstances - 1;
}

@java.lang.Override
public void onHomePressed(android.support.v4.app.Fragment fragment) {
    if (fragment instanceof valjevac.kresimir.homework3.fragments.AddPokemonFragment) {
        removeFragmentFromStack(valjevac.kresimir.homework3.activities.PokemonListActivity.ADD_POKEMON_FRAGMENT_TAG);
    }
}

private void syncContents(com.owncloud.android.lib.common.OwnCloudClient client) throws com.owncloud.android.lib.common.operations.OperationCancelledException {
    startDirectDownloads();
    startContentSynchronizations(mFilesToSyncContentsWithoutUpload, client);
    startContentSynchronizations(mFavouriteFilesToSyncContents, client);
    walkSubfolders(client);
}

@java.lang.Override
public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities cameraCapabilities) {
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_CHANGE_CAMERA_CAPABILITIES, cameraCapabilities).sendToTarget();
}

public synchronized boolean deleteAllFavorites() {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.clear();
    editor.apply();
    return true;
}

public static com.hgyllensvard.geofencemanager.geofence.Geofence create(java.lang.String name, com.google.android.gms.maps.model.LatLng latLng, float radius) {
    return new com.hgyllensvard.geofencemanager.geofence.AutoValue_Geofence.Builder().id(com.hgyllensvard.geofencemanager.geofence.Geofence.NO_ID).name(name).latLng(latLng).radius(radius).build();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            new com.namclu.android.popularreels.FetchMovieTask(mMovieAdapter).execute();
            mMovieAdapter.notifyDataSetChanged();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

private void addDynamicGraphicLayer() {
    mGraphicsLayer = new com.esri.android.map.GraphicsLayer();
    addLayer(mGraphicsLayer);
    mGraphicsLayerGGAdapter = new com.teamagam.gimelgimel.app.map.esri.GraphicsLayerGGAdapter(mGraphicsLayer, com.teamagam.gimelgimel.app.map.esri.EsriGGMapView.WGS_84_GEO, getSpatialReference());
}

protected android.content.Context getContext() {
    return this.mFrag.getActivity().getApplicationContext();
}

private void initAudio() {
    setupVisualizerFxAndUI();
    try {
        visualizer.setEnabled(true);
    } catch (java.lang.Exception ex) {
        android.util.Log.e("except", (" f" + (ex.getMessage())));
    }
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.i(com.binkery.module.citypicker.CitySearchActivity.TAG, ("onQueryTextSubmit query = " + query));
    showSearchTip(query);
    return false;
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent.hasExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE)) {
        handleJson(intent.getStringExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE));
    }
    return START_STICKY;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    prepareScheduleTable((position + 1));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Hey", Toast.LENGTH_SHORT);
}

private void flvFrameCacheAdd(net.ossrs.rtmp.SrsFlvMuxer.SrsFlvFrame frame) {
    try {
        mFlvTagCache.add(frame);
    } catch (java.lang.IllegalStateException e) {
        mFlvTagCache.clear();
        android.util.Log.i(net.ossrs.rtmp.SrsFlvMuxer.TAG, "frame discarded");
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    exportCsv();
    finish();
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if ((mode) == (com.bathem.vocabpower.Enum.AddEditMode.add_mode)) {
    }else {
        hideAddButtons();
        prepareFieldsForEditMode();
    }
}

@java.lang.Override
protected void initView(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_splash);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startMainActivity();
        }
    }, Constants.SPLASH_TIME);
}

@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(floatingmuseum.sample.sonic.MainActivity.TAG, "onDestroy");
    sonic.stopAllTask();
    sonic.unRegisterDownloadListener();
    super.onDestroy();
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_CANCELED)) {
        return ;
    }
    if (resultCode == (AnswerActivity.RESULT_DELETE)) {
    }
    if (resultCode == (RESULT_OK)) {
    }
}

@java.lang.Override
public void onError(com.facebook.FacebookException exception) {
    if (((pendingAction) != (map.minimap.LoginActivity.PendingAction.NONE)) && (exception instanceof com.facebook.FacebookAuthorizationException)) {
        showAlert();
        pendingAction = map.minimap.LoginActivity.PendingAction.NONE;
    }
    android.util.Log.v(LOG_TAG, "Error!");
    updateUI();
}

private void recordHighScore() {
    android.content.SharedPreferences settings = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putLong(com.narayan.a2048.MainGame.HIGH_SCORE, ((int) (highScore)));
    editor.commit();
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    io.geeteshk.hyper.helper.Firebase.removeProject(mAuth, mStorage, mObjects[newPos]);
    io.geeteshk.hyper.helper.Firebase.deleteProjectFiles(mAuth, mStorage, mObjects[newPos]);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, 15);
    googleMap.animateCamera(cameraUpdate);
}

@java.lang.Override
public void onClick(android.view.View view) {
    lb.loadingSuccessful();
    sucBtn.setEnabled(false);
    failedBtn.setEnabled(false);
    resetBtn.setEnabled(true);
}

public java.lang.String getUrl() {
    if (android.text.TextUtils.isEmpty(url))
        return "";
    else
        return url;
    
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    mActivity.finish();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public static io.branch.referral.Branch getAutoTestInstance(@android.support.annotation.NonNull
android.content.Context context) {
    io.branch.referral.Branch.isAutoSessionMode_ = true;
    io.branch.referral.Branch.customReferrableSettings_ = io.branch.referral.Branch.CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
    io.branch.referral.Branch.getBranchInstance(context, false);
    io.branch.referral.Branch.branchReferral_.setActivityLifeCycleObserver(((android.app.Application) (context)));
    return io.branch.referral.Branch.branchReferral_;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(com.jeonbase.wifidirectsample.WakeReceiver.ACTION_PASSIVE)) {
        alarm.setAlarm(context);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
    com.example.rahulchandrashekhar.geoquiz.HEAD mIsCheater = false;
    updateQuestion();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    pi.setVisibility(View.GONE);
    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    unregisterReceiver(helpFinishBroadcast);
    this.finish();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup root, android.os.Bundle savedState) {
    android.view.View view = inflater.inflate(R.layout.fragment_login, root, false);
}

public static int w(java.lang.String tag, java.lang.String msg) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_WARN) {
        return android.util.Log.w(tag, msg);
    }
    return 0;
}

public java.lang.Double distanceBetween(com.google.android.gms.maps.model.LatLng point1, com.google.android.gms.maps.model.LatLng point2) {
    if ((point1 == null) || (point2 == null)) {
        return null;
    }else {
        return com.google.maps.android.SphericalUtil.computeDistanceBetween(point1, point2);
    }
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN_MR1)
private boolean isRTL() {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN_MR1)) {
        return false;
    }
    android.content.res.Configuration config = getResources().getConfiguration();
    return (config.getLayoutDirection()) == (android.view.View.LAYOUT_DIRECTION_RTL);
}

@java.lang.Override
public void onFailure(retrofit2.Call<edu.depaul.csc595.jarvis.detection.classes.SmartProductContent.SmartProductInfo> call, java.lang.Throwable t) {
    android.util.Log.d("getnumregdecives", t.getMessage());
}

private void normalizeDate(android.content.ContentValues values) {
    if (values.containsKey(WeatherContract.WeatherEntry.COLUMN_DATE)) {
        long dateValue = values.getAsLong(WeatherContract.WeatherEntry.COLUMN_DATE);
        values.put(WeatherContract.WeatherEntry.COLUMN_DATE, com.example.tgzoom.sunshine.data.WeatherContract.normalizeDate(dateValue));
    }
}

private boolean isDiscoverModeEnabled() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.gcw.sapienza.places.PlacesApplication.getPlacesAppContext());
    boolean discoverMode = preferences.getBoolean("discoverMode", true);
    return discoverMode;
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    java.lang.String data = "scorelimit;0;" + (java.lang.String.valueOf((((this.seekBar.getProgress()) + 1) * 9)));
    sendDataToServer(data, getPlayer(), delegate);
}

@java.lang.Override
public void onCharacteristicWrite(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    android.util.Log.e(com.liwn.zzl.markbit.bluetooth.BluetoothLeService.TAG, "OnCharacteristicWrite");
}

void updatePoemText() {
    android.util.Log.d(ca.rmen.android.poetassistant.main.reader.ReaderViewModel.TAG, "Update poem text");
    mPoemPrefs.updatePoemText(poem.get().toString());
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String responseString, java.lang.Throwable throwable) {
    android.util.Log.e(TAG, responseString);
    listener.sendReportPoliceError();
}

@java.lang.Override
public void onDialogPositiveClick(br.com.androidzin.brunomateus.beerstodrink.model.Beer beer) {
    beer.setDrinked(false);
    updateDatabase(beer);
    android.util.Log.d(getClass().getSimpleName(), ((beer.getName()) + "was not drinked"));
}

public void addTask(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, iprog.group7.agendabuilder.android.AddTaskActivity.class);
    startActivity(intent);
    java.lang.String source = "new";
    intent.putExtra(iprog.group7.agendabuilder.android.MainActivity.SOURCE, source);
    finish();
}

public void showProgressDialog() {
    if ((progressDialog) == null) {
        progressDialog = new android.app.ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.loading));
        progressDialog.setIndeterminate(true);
    }
    progressDialog.show();
}

private int getRadioButtonResult(android.widget.RadioButton rightAnswer) {
    if (rightAnswer.isChecked()) {
        return 2;
    }
    return 0;
}

public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.preference.PreferenceManager.setDefaultValues(getActivity(), R.xml.prefs, false);
    addPreferencesFromResource(R.xml.prefs);
    setSummaries();
    com.alderferstudios.ritdebitsplitter.SettingsActivity.shared.registerOnSharedPreferenceChangeListener(this);
}

public static void initializeFonts(final android.content.Context context) {
    com.samknows.measurement.activity.components.Util.FONT_REGULAR = android.graphics.Typeface.createFromAsset(context.getAssets(), "typewriter.ttf");
}

protected synchronized com.google.android.gms.common.api.GoogleApiClient buildGoogleApiClient() {
    android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "building api client");
    return new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
}

public com.daro.spotifystreamer.models.Track getmCurrentTrack() {
    android.util.Log.d(TAG, mCurrentTrack.getId());
    return mCurrentTrack;
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    delayedHide(100);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.facebook.soloader.SoLoader.init(this, false);
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> arg0, android.view.View view, final int pos, long id) {
    show_edit_pop_up(pos);
    item_list.refreshDrawableState();
    return true;
}

public static void navigateToLocationSettings(android.content.Context context) {
    final android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    context.startActivity(intent);
}

public static com.ly.badiane.budgetmanager_finalandroidproject.divers.Categorie getInstance(int i) {
    if ((i <= 5) && (i >= 0))
        return com.ly.badiane.budgetmanager_finalandroidproject.divers.Categorie.ALL.get(i);
    
    return null;
}

private void SetLastLocation(com.google.android.gms.maps.model.LatLng latLng) {
    if (latLng != null)
        Utils.SharedPreferencesUtil.SaveLocationInSharedPreferences(getContext(), latLng.latitude, latLng.longitude, new java.util.Date());
    
    lastLocation = latLng;
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    mediaPlayer.seekTo(i);
}

public void openCellWithFastAnimate(android.widget.ImageView imageView, int coordinate) {
    this.imageView = imageView;
    this.coordinate = coordinate;
    isFastAnimation = true;
    isMineAnimation = false;
    openCell();
    imageView.startAnimation(fastShrink);
}

public final void showImage(android.content.Context context, java.lang.String str) {
    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
    intent.setDataAndType(android.net.Uri.fromFile(new java.io.File(str)), "image/*");
    context.startActivity(intent);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return position == (survey.getSize()) ? new it.telecomitalia.my.affiancamenti.SurveyLastFragment() : it.telecomitalia.my.affiancamenti.SurveyElementFragment.newInstance(survey.getSurveyElement(position));
}

public boolean onCreateOptionsMenu(android.view.Menu menu2) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.actionbar, menu2);
    return true;
}

private static void closeDB() {
    if ((com.mozzandroidutils.sqlite.MozzDB.mDatabase) != null) {
        if (com.mozzandroidutils.sqlite.MozzDB.mDatabase.isOpen()) {
            com.mozzandroidutils.sqlite.MozzDB.mDatabase.close();
            com.mozzandroidutils.sqlite.MozzDB.mDatabase = null;
        }else {
            com.mozzandroidutils.sqlite.MozzDB.mDatabase = null;
        }
    }
}

@java.lang.Override
public void onCreate() {
    android.widget.Toast.makeText(this, "notification service created", Toast.LENGTH_LONG).show();
    mNotificationsQueue = new ie.headway.howtodoit.NotificationQueue();
    mNotificationsFileObserver = new ie.headway.howtodoit.NotificationService.NotificationsFileObserver();
    mScheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    mNotificationsFileObserver.startWatching();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState = mDrawerResult.saveInstanceState(outState);
    outState = mDrawerResult.saveInstanceState(outState);
    super.onSaveInstanceState(outState);
}

