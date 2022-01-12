public static void recordActivity(org.json.JSONObject jmessage) {
    de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}

private void log(java.lang.String s) {
    android.util.Log.d(org.epfl.locationprivacy.privacyestimation.PrivacyEstimator.LOGTAG, s);
    org.epfl.locationprivacy.util.Utils.appendLog(((org.epfl.locationprivacy.privacyestimation.PrivacyEstimator.LOGTAG) + ".txt"), s);
}

@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    mFlingShow = (java.lang.Math.abs(velocityX)) >= (mFlingVelocity);
    return mFlingShow;
}

public void onRestoreInstanceState(android.os.Bundle outState) {
    if (outState.containsKey("image_pick_request_code")) {
        mRequestCode = outState.getInt("image_pick_request_code");
    }
}

public synchronized java.lang.String getAuthToken() {
    com.salesforce.androidsdk.util.SalesforceSDKLogger.i(com.salesforce.androidsdk.rest.RestClient.TAG, ("Found account -- get token " + (authToken)));
    return authToken;
}

@org.opendatakit.common.android.views.JavascriptInterface
public void saveCheckpointAsIncomplete(java.lang.String tableId, java.lang.String stringifiedJSON, java.lang.String rowId, java.lang.String callbackJSON, java.lang.String transId, java.lang.Boolean leaveTransactionOpen) throws android.os.RemoteException {
    weakData.get().saveCheckpointAsIncomplete(tableId, stringifiedJSON, rowId, callbackJSON, transId, leaveTransactionOpen);
}

private void sortByLocations(android.location.Location userLocation) {
    if (userLocation != null) {
        adapter.sortByLocation(userLocation);
    }
}

public void openSong(studio6ty9.gesamp.Song song) {
    android.content.Intent startSong = new android.content.Intent(this, studio6ty9.gesamp.MusicPlayer.class);
    startSong.putExtra("songId", song.getId());
    startActivity(startSong);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    saveScadenzeValues(dialogScadenze);
    org.greenrobot.eventbus.EventBus.getDefault().post(new simone.datecar.bus.DatiAggiornatiEvent("Aggiornati dati auto"));
}

@java.lang.Override
public void onClick(android.view.View v) {
    max.sudoku.MainActivity.b.setText("6");
    startListener();
}

public void clickFAB(android.view.View view) {
    com.fourthwardcoder.android.volumemanager.data.ProfileManager.newProfile(this, mTabLayout.getSelectedTabPosition());
}

public boolean isTagEnabled(java.lang.String tag) {
    try {
        return mService.isTagEnabled(tag);
    } catch (android.os.RemoteException e) {
        return false;
    }
}

protected void addTab(java.lang.String id, java.lang.String title, java.lang.Class<? extends android.support.v4.app.Fragment> fragment, android.os.Bundle args) {
    mTabsAdapter.addTab(mTabHost.newTabSpec(id).setIndicator(title), fragment, args);
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    filePicker.onActivityResult(requestCode, resultCode, data);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(getActivity(), com.example.emiya.myapp8.Open.class);
    startActivity(intent);
    getActivity().finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.home_find_bringer :
            android.content.Intent intent = new android.content.Intent(getActivity(), com.morgane.painauchocolat.activities.BringerActivity.class);
            startActivityForResult(intent, Constant.REQUEST_CODE_FIND_BRINGER);
            break;
    }
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker numberPicker, int oldVal, int newVal) {
    quantity = newVal * 5;
    android.util.Log.e("quantity", ((quantity) + ""));
}

@java.lang.Override
public void onClick(android.view.View v) {
    it.bsdsoftware.library.BSDUtility.handleClickItem(getActivity(), image, gallery, 0);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.crashlytics.android.Crashlytics.log(Log.DEBUG, TAG, "more clicked");
    showNextPage();
}

@java.lang.Override
public void onClick(android.view.View v) {
    callingActivity.startActivityForResult(new android.content.Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    snackbar.dismiss();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (mSignOut)) {
        mFirebaseAuth.signOut();
        finish();
        mIntent = new android.content.Intent(this, com.example.a6sigma.great4ip.LoginActivity.class);
    }
    startActivity(mIntent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent recordIntent = new android.content.Intent();
    startActivity(recordIntent);
}

public void setLocOption(com.baidu.location.LocationClientOption option) {
    if ((mClient) == null)
        android.util.Log.e(C.TAG, "locationclient can not be null before using is");
    else
        mClient.setLocOption(option);
    
}

public void onClick(android.view.View view) {
    if ((hours) == 1) {
        hours = 12;
    }else {
        --(hours);
    }
    displayHours(hours);
}

public void onSignInClick(android.view.View view) {
    if (!(googleApiClient.isConnecting())) {
        textViewStatus.setText("Signing in");
        resolveSignInError();
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_book_edit_save :
            if (saveBook()) {
                finish();
            }
        default :
            return super.onOptionsItemSelected(item);
    }
}

protected void refresh(final android.os.Bundle b) {
    if ((loader) != null) {
        onStartLoading();
    }
    au.com.pactera.pacterapulse.core.BaseFragment.getLoaderManager().restartLoader(this.hashCode(), b, this);
}

@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    topic = topicS.getText().toString();
    android.util.Log.e("Topic", topic);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);
    initializeComponents();
}

@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    aq.id(ivScreen).image(com.florianmski.tracktoid.Utils.shadowBitmap(com.florianmski.tracktoid.Utils.borderBitmap(bm, getActivity()))).animate(android.R.anim.fade_in);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.inkenka.devdemos.ActivityStack.SecondActivity.class);
    intent.setClass(this, com.inkenka.devdemos.ActivityStack.ThirdActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putInt("position", mPairsSpinner.getSelectedItemPosition());
}

protected static java.lang.String getDeviceID(android.content.Context context) {
    java.lang.String uuid = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    return java.util.UUID.nameUUIDFromBytes(uuid.getBytes()).toString();
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    textToEdit.setText(((((year + "-") + month) + "-") + day), TextView.BufferType.EDITABLE);
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.wtf("!!!!!!!!!!!!", query);
    findAttendees(query);
    return true;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
    initTabs(savedInstanceState);
    checkIntentData(getIntent());
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    android.content.Intent intent = new android.content.Intent(this, com.app.scope.myapplication.LoginActivity.class);
    startActivity(intent);
    finish();
}

private void closeFragment() {
    android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
    fragmentManager.beginTransaction().remove(this).commit();
    fragmentManager.popBackStackImmediate();
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((me.ccrama.redditslide.Activities.AlbumPager) (getActivity())).showBottomSheetImage(url, false);
}

private int getAsOpaque(int color) {
    return android.graphics.Color.argb(255, android.graphics.Color.red(color), android.graphics.Color.green(color), android.graphics.Color.blue(color));
}

private void startAppendToMovieListTask(int firstPageToAppend) {
    mAppendProgressSpinner.setVisibility(View.VISIBLE);
    if ((mLoadMovieListTask) != null) {
        return ;
    }
    mLoadMovieListTask = new com.example.android.popularmovies.PosterGridFragment.LoadMovieList();
    mLoadMovieListTask.execute(firstPageToAppend, com.example.android.popularmovies.PosterGridFragment.APPEND_PAGE_COUNT, com.example.android.popularmovies.PosterGridFragment.LoadMovieList.APPEND_TO_LIST_ON_COMPLETE);
}

@java.lang.Override
public void onStopNestedScroll(android.view.View target) {
    mNestedScrollingParentHelper.onStopNestedScroll(target);
    if ((mTotalUnconsumed) > 0) {
        finishSpinner(mTotalUnconsumed);
        mTotalUnconsumed = 0;
    }
    stopNestedScroll();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_error);
    final android.support.wearable.view.WatchViewStub stub = ((android.support.wearable.view.WatchViewStub) (findViewById(R.id.watch_view_stub)));
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_find_master :
            android.util.Log.d("BasicActivity", "find master");
            break;
        case R.id.action_free_area :
            android.util.Log.d("BasicActivity", "free area");
            break;
    }
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    org.osmdroid.views.overlay.TilesOverlay orthophotoOverlay = ((org.osmdroid.views.overlay.TilesOverlay) (mapView.getOverlayManager().get(0)));
    showOrtophoto = !(showOrtophoto);
    orthophotoOverlay.setEnabled(showOrtophoto);
    mapView.invalidate();
}

@java.lang.Override
public void onMapLongClick(com.google.android.gms.maps.model.LatLng ll) {
    com.digitalartthingy.witw.CustomMarker customMarker = new com.digitalartthingy.witw.CustomMarker(ll);
    com.digitalartthingy.witw.MarkerDetails details = new com.digitalartthingy.witw.MarkerDetails();
    details.enterDetails(mContext, customMarker);
    mMarkerStorage.addNewMarker(customMarker);
}

@java.lang.Override
protected void onResume() {
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onResume()");
    super.onResume();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == true)
            return ;
        
        szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
    }
    fwdToMain();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    setContentView(R.layout.activity_donate);
}

@java.lang.Override
public void onClick(android.view.View view) {
    searchedLocationEditTextField.setText("My Location");
    shouldGetLocationFromLocationEditText = true;
    shouldGetLocationFromUserData = false;
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    rl.setVisibility(View.GONE);
    updateVisibility();
}

public static de.htwberlin.f4.ai.ma.measurement.IndoorMeasurement getIndoorMeasurement(android.content.Context context) {
    if ((de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementFactory.indoorMeasurement) == null) {
        de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementFactory.indoorMeasurement = new de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementImpl(context);
    }
    return de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementFactory.indoorMeasurement;
}

public static void sendMessage(com.google.api.services.gmail.model.Message message) throws java.io.IOException, javax.mail.MessagingException {
    if ((android.g38.ritik.Gmail.ScheduleMail.mService) != null)
        android.g38.ritik.Gmail.ScheduleMail.mService.users().messages().send("me", message).execute();
    
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.e(com.coralcreations.mylittlescoreapp.ScoreView.MyGestureListener.DEBUG_TAG, "ScoreView onLongPress()");
    ((com.coralcreations.mylittlescoreapp.MainActivity) (getContext())).handle_long_press();
}

@java.lang.Override
public void saveAdminDataToSharedPreferences(java.lang.Boolean isAdmin) {
    android.content.SharedPreferences.Editor editor = getSharedPreferences(Constants.ADMIN, cazimir.com.bancuribune.ui.list.MODE_PRIVATE).edit();
    editor.putBoolean(Constants.ADMIN, true);
    editor.apply();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_setting);
    android.app.ActionBar actionBar = getActionBar();
    actionBar.setDisplayHomeAsUpEnabled(true);
}

protected void goToAnswersActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, ace.quizbowl.AnswersActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    java.lang.System.out.println("new step registered!");
    manager.newStepDone();
    loadTodo();
}

@java.lang.Override
public void onClick(android.view.View v) {
    stopMediaPlayer(mp);
    dialog.dismiss();
}

@org.androidannotations.annotations.Background
private void downloadMap(java.lang.String mapType) {
    publishDownloadComplete(mapType);
}

protected void playPause(android.view.View view) {
    if (paused)
        startTimer();
    else
        stopTimer();
    
}

public void onClick(android.content.DialogInterface dialog, int which) {
    writeToNFC = false;
}

public void onClick(android.view.View v) {
    (clicks)++;
    checknumberOfOutcomes(",");
    insertDisplayCharacter(",");
}

private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String format, java.lang.Object arg) {
    logger.print(level, org.slf4j.helpers.MessageFormatter.format(format, arg).getMessage(), null);
}

public static native android.graphics.Bitmap generateQRCode(java.lang.String string, android.content.res.AssetManager assetManager);

@butterknife.OnClick(value = R.id.btn_next_step)
public void nextStep(android.view.View v) {
    nextButtonClickListener.onNextButtonClick(currentStep.getId());
}

@java.lang.Override
public void write(@android.support.annotation.NonNull
com.google.gson.stream.JsonWriter out, @android.support.annotation.NonNull
com.codebutler.farebot.core.ByteArray value) throws java.io.IOException {
    out.value(value.base64());
}

public void scheduledRecordingStopped() {
    android.util.Log.d(com.danielkim.soundrecorder.fragments.RecordFragment.TAG, "RecordFragment - scheduledRecordingStopped");
    updateUI(false);
    isRecording = false;
}

@java.lang.Override
public void start() {
    if ((audioRecord) == null) {
        audioRecord = new android.media.AudioRecord(MediaRecorder.AudioSource.MIC, com.novoda.canvas.audioviz.SimpleSoundMeter.SAMPLE_RATE, android.media.AudioFormat.CHANNEL_IN_MONO, android.media.AudioFormat.ENCODING_PCM_16BIT, minBufferSize);
    }else {
        audioRecord.startRecording();
    }
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    android.content.Intent intent = getParentActivityIntent();
    startActivity(intent);
}

@java.lang.Override
public void onSeekComplete(android.media.MediaPlayer mp) {
    android.util.Log.e(com.infthink.flintreceiver.receiver.SimpleMediaPlayerActivity.TAG, "onSeekComplete!");
    mFlintVideo.notifyEvents(FlintVideo.SEEKED, "Media SEEKED");
    if (!(mMediaPlayer.isPlaying())) {
        mFlintVideo.notifyEvents(FlintVideo.PAUSE, "Media PAUSED?");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    this.loadNewIssue();
}

public void onClickItem(android.view.View v, int position) {
    selectItem(position);
}

public void launchActivity(java.lang.Class target, android.support.v4.util.Pair<android.view.View, java.lang.String>[] sharedElements, java.util.Map<java.lang.String, java.lang.Object> data, boolean killCurrunt) {
    launchActivity(activity, target, null, null, false);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splashscreen);
    try {
        handleSetUp();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}

private boolean isExternalStorageAvalaible() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if (state.equals(Environment.MEDIA_MOUNTED))
        return true;
    else
        return false;
    
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    android.os.Debug.waitForDebugger();
    try {
        cursor = dbManager.getAllBusinesses();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}

@java.lang.Override
public void onResume() {
    super.onResume();
    getActivity().registerReceiver(mScanResultsReceiver, new android.content.IntentFilter(android.net.wifi.WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
    mWifiUtils.startWifiScan();
}

@java.lang.Override
public void onClick(android.view.View v) {
    try {
        retrieveDataFromBasicKidFields();
        kid.setId(Daos.KID.save(kid));
        startKidActivity(kid);
    } catch (ar.edu.unlp.info.hermescelascolus.validation.ValidationError validationError) {
    }
}

@java.lang.Override
public void refreshMovieList() {
    mLoadManager.restartLoader(com.manpdev.androidnanodegree.popularmov.movie.movielist.MovieList.MOVIE_LOADER_ID, null, this);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    for (java.lang.Class c : us.michaelchen.compasslogger.receiver.PeriodicReceiver.PERIODICS) {
        context.startService(new android.content.Intent(context, c));
    }
    us.michaelchen.compasslogger.utils.PreferencesWrapper.updateLastAlarmTimestamp();
}

@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mHandlerThread.quit();
    android.util.Log.v(TAG, "onDestroy");
}

@java.lang.Override
public void run() {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            showPlay(btn);
            showChart(tag, chart, btn);
        }
    }, 500);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    loadData(false);
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.v(leoliang.runningcadence.BackgroundService.LOG_TAG, "onUnbind'd");
    clientHandler = null;
    return false;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(nmct.howest.be.desproject.ShowMapFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(nmct.howest.be.desproject.ShowMapFragment.ARG_PARAM2);
    }
}

@java.lang.Override
public void onRestResults(int state, java.util.ArrayList<?> results) {
    android.util.Log.d("TEST", "");
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return view == object;
}

@java.lang.Override
public void onItemClick(final android.view.View view, final int verticalIndex, final int position) {
    mc2.tvz.croatiago.activities.DetailActivity.startDetailsActivity(getActivity(), listModels.get(verticalIndex).objects, position);
}

private void createGridViewAdapter() {
    moviesAdapter = new com.example.android.popularmovies.app.MoviesAdapter(new java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>(), getActivity(), getContext());
    updateMoviesViewMode();
    gridView.setAdapter(moviesAdapter);
}

@java.lang.Override
public void onActionTopicClicked(com.cngu.androidfun.data.ActionTopic topic, com.cngu.androidfun.main.TopicListAdapter.ViewHolder viewHolder) {
    if (mTopicManager.isActionTopicReached()) {
        mTopicManager.popTopicFromHistory();
    }
    mTopicManager.pushTopicToHistory(topic);
}

public void run() {
    if ((null != (mMediaServer)) && (mMediaRenderer.isRunning())) {
        mMediaServer.stop();
        mMediaServer = null;
        android.util.Log.i(com.meizu.ruandongchuan.dlnatest.service.DLNAService.TAG, "stopMediaServer");
    }
}

@java.lang.Override
public void onImageDownloaded(android.graphics.Bitmap bitmapResult) {
    imageLoadingProgress.setVisibility(View.GONE);
    floatingActionButton.setVisibility(View.VISIBLE);
    mainContentImageView.setImageBitmap(bitmapResult);
}

public static void loadWriteImg(android.content.Context context, final android.widget.ImageView img, final com.aoliao.notebook.utils.entity.Write.Content content) {
    com.bumptech.glide.Glide.with(context).load(content.getImg()).error(R.mipmap.sidebar).diskCacheStrategy(DiskCacheStrategy.NONE).into(img);
}

public void displayPlayerRolesDialog() {
    android.app.FragmentManager fm = getActivity().getFragmentManager();
    com.cs428.pandemic.frontEnd.gamePlay.RoleSummaryFragment dialog = new com.cs428.pandemic.frontEnd.gamePlay.RoleSummaryFragment();
    dialog.setTargetFragment(this, 0);
    dialog.show(fm, "roles");
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    data.add(3, input.getText().toString());
    desc0 = input.getText().toString();
}

protected int parseComponentStrength(java.lang.String strength) {
    switch (strength) {
        case "MAX" :
            return uk.ac.aber.gij2.olandroid.visualisation.Component.MAX;
        case "ZERO" :
            return uk.ac.aber.gij2.olandroid.visualisation.Component.ZERO;
        case "MIN" :
            return uk.ac.aber.gij2.olandroid.visualisation.Component.MIN;
    }
    return uk.ac.aber.gij2.olandroid.visualisation.Component.ZERO;
}

@java.lang.Override
public void create(android.app.Activity activity, android.os.Bundle savedInstanceState) {
    loadNavList();
    if ((mCategory) != null) {
        selectItem(mCategory, false);
    }
    mView.onLockDragLayout(needLockDrawerLayout());
}

public android.content.Context getContext() {
    return eu.focusnet.app.FocusApplication.instance.getApplicationContext();
}

@java.lang.Override
public android.view.View getHeader(android.app.Activity activity) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(activity);
    header = inflater.inflate(R.layout.view_browse_peer_header, ((android.view.ViewGroup) (getView())));
    updateHeader();
    return header;
}

protected boolean isValidFragment(java.lang.String fragmentName) {
    android.util.Log.d("FRAG FETCH", "degug stop...");
    return (android.preference.PreferenceFragment.class.getName().equals(fragmentName)) || (com.is.was.be.wannareddit.SettingsActivity.GeneralPreferenceFragment.class.getName().equals(fragmentName));
}

