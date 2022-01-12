public static java.lang.String recordActivity(org.json.JSONObject jmessage) {
    return de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}

private void log(java.lang.String s) {
    android.util.Log.d(org.epfl.locationprivacy.privacyestimation.PrivacyEstimator.LOGTAG, s);
    org.epfl.locationprivacy.util.Utils.appendLog(((org.epfl.locationprivacy.privacyestimation.PrivacyEstimator.LOGTAG) + ".txt"), s, context);
}

@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    mFlingShow = (java.lang.Math.abs(velocityX)) >= (mFlingVelocity);
    return false;
}

public void onRestoreInstanceState(@android.support.annotation.Nullable
android.os.Bundle outState) {
    if ((outState != null) && (outState.containsKey("image_pick_request_code"))) {
        mRequestCode = outState.getInt("image_pick_request_code");
    }
}

public synchronized java.lang.String getAuthToken() {
    return authToken;
}

@org.opendatakit.common.android.views.JavascriptInterface
public void saveCheckpointAsIncomplete(java.lang.String tableId, java.lang.String rowId, java.lang.String callbackJSON, java.lang.String transId, java.lang.Boolean leaveTransactionOpen) throws android.os.RemoteException {
    weakData.get().saveCheckpointAsIncomplete(tableId, rowId, callbackJSON, transId, leaveTransactionOpen);
}

private void sortByLocations(android.location.Location userLocation) {
    if ((userLocation != null) && ((adapter) != null)) {
        adapter.sortByLocation(userLocation);
    }
}

public void openSong(studio6ty9.gesamp.Song song) {
    startSong = new android.content.Intent(this, studio6ty9.gesamp.MusicPlayer.class);
    startSong.putExtra("songId", song.getId());
    startActivity(startSong);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    saveScadenzeValues(dialogScadenze);
    org.greenrobot.eventbus.EventBus.getDefault().post(new simone.datecar.bus.DatiAggiornatiEvent());
}

@java.lang.Override
public void onClick(android.view.View v) {
    b.setText("6");
    startListener();
}

public void clickFAB(android.view.View view) {
    newProfile(mTabLayout.getSelectedTabPosition());
}

public boolean isTagEnabled(java.lang.String tag) {
    try {
        return mService.isTagEnabled(tag);
    } catch (android.os.RemoteException e) {
        return false;
    } catch (java.lang.NullPointerException n) {
        return false;
    }
}

protected void addTab(java.lang.String id, java.lang.String title, java.lang.Class<? extends android.support.v4.app.Fragment> fragment, android.os.Bundle args) {
    mTabsAdapter.addTab(mTabHost.newTabSpec(id), fragment, args, title);
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    filePicker.onActivityResult(this, requestCode, resultCode, data);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(getActivity(), com.example.emiya.myapp8.Open.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
    }
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker numberPicker, int oldVal, int newVal) {
    quantity = newVal * 5;
}

@java.lang.Override
public void onClick(android.view.View v) {
    it.bsdsoftware.library.BSDUtility.handleClickItem(getActivity(), image, 0, null);
}

@java.lang.Override
public void onClick(android.view.View v) {
    showNextPage();
}

@java.lang.Override
public void onClick(android.view.View v) {
    snackbar.dismiss();
    callingActivity.startActivityForResult(new android.content.Intent(android.provider.Settings.ACTION_SETTINGS), 0);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (mSignOut)) {
        finish();
        mFirebaseAuth.signOut();
        mIntent = new android.content.Intent(this, com.example.a6sigma.great4ip.LoginActivity.class);
        startActivity(mIntent);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
}

public void setLocOption(com.baidu.location.LocationClientOption option) {
    if ((mClient) == null)
        android.util.Log.e(getClass().getName(), "locationclient can not be null before using is");
    else
        mClient.setLocOption(option);
    
}

public void onClick(android.view.View view) {
    if (((hours) == 1) || ((hours) == 0)) {
        hours = 12;
    }else {
        --(hours);
    }
    displayHours(hours);
}

public void onSignInClick(android.view.View view) {
    if (!(googleApiClient.isConnecting())) {
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
            break;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}

protected void refresh(final android.os.Bundle b) {
    au.com.pactera.pacterapulse.core.BaseFragment.getLoaderManager().restartLoader(this.hashCode(), b, this);
}

@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    topic = topicS.getText().toString();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);
    initializeComponents();
}

@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    aq.id(ivScreen).image(com.florianmski.tracktoid.Utils.borderBitmap(bm, getActivity())).animate(android.R.anim.fade_in);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.inkenka.devdemos.ActivityStack.ThirdActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((mPairsSpinner) != null) {
        outState.putInt("position", mPairsSpinner.getSelectedItemPosition());
    }
}

protected static java.lang.String getDeviceID(android.content.Context context) {
    java.lang.String uuid = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    return uuid;
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    textToEdit.setText(((((year + "-") + ((+month) + 1)) + "-") + day), TextView.BufferType.EDITABLE);
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    findAttendees(query);
    return true;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init(savedInstanceState);
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    intent = new android.content.Intent(this, com.app.scope.myapplication.LoginActivity.class);
    startActivity(intent);
    finish();
    return ;
}

public void closeFragment() {
    android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
    fragmentManager.beginTransaction().remove(this).commit();
    fragmentManager.popBackStackImmediate();
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((me.ccrama.redditslide.Activities.AlbumPager) (getActivity())).showBottomSheetImage(url, false, i);
}

private int getAsOpaque(int color) {
    return argb(255, red(color), green(color), blue(color));
}

private void startAppendToMovieListTask(int firstPageToAppend) {
    if ((mLoadMovieListTask) != null) {
        return ;
    }
    mAppendProgressSpinner.setVisibility(View.VISIBLE);
    mLoadMovieListTask = new com.example.android.popularmovies.PosterGridFragment.LoadMovieList();
    mLoadMovieListTask.execute(firstPageToAppend, com.example.android.popularmovies.PosterGridFragment.APPEND_PAGE_COUNT, com.example.android.popularmovies.PosterGridFragment.LoadMovieList.APPEND_TO_LIST_ON_COMPLETE);
}

@java.lang.Override
public void onStopNestedScroll(android.view.View target) {
    mNestedScrollingParentHelper.onStopNestedScroll(target);
    if ((mTotalUnconsumed) > 0) {
        finishSpinner();
        mTotalUnconsumed = 0;
    }
    stopNestedScroll();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_error);
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
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    showOrtophoto = !(showOrtophoto);
    orthophotoOverlay.setEnabled(showOrtophoto);
    mapView.invalidate();
}

@java.lang.Override
public void onMapLongClick(com.google.android.gms.maps.model.LatLng ll) {
    com.digitalartthingy.witw.CustomMarker customMarker = new com.digitalartthingy.witw.CustomMarker(ll);
    com.digitalartthingy.witw.MarkerDetails details = new com.digitalartthingy.witw.MarkerDetails(mContext, mMarkerStorage);
    details.enterDetails(customMarker);
    mMarkerStorage.addNewMarker(customMarker);
}

@java.lang.Override
protected void onResume() {
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onResume()");
    super.onResume();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == false) {
            szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
            fwdToMain();
        }else {
        }
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_donate);
    butterknife.ButterKnife.bind(this);
}

@java.lang.Override
public void onClick(android.view.View view) {
    searchedLocationEditTextField.setText("My Location");
    shouldGetLocationFromLocationEditText = false;
    shouldGetLocationFromUserData = true;
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    updateVisibility();
    rl.setVisibility(View.GONE);
}

public static de.htwberlin.f4.ai.ma.measurement.IndoorMeasurement getIndoorMeasurement(android.content.Context context) {
    return new de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementImpl(context);
}

private static void sendMessage(com.google.api.services.gmail.model.Message message) throws java.io.IOException, javax.mail.MessagingException {
    if ((android.g38.ritik.Gmail.ScheduleMail.mService) != null)
        android.g38.ritik.Gmail.ScheduleMail.mService.users().messages().send("me", message).execute();
    
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent event) {
    ((com.coralcreations.mylittlescoreapp.MainActivity) (getContext())).handle_long_press();
}

@java.lang.Override
public void saveAdminDataToSharedPreferences(java.lang.Boolean isAdmin) {
    android.content.SharedPreferences.Editor editor = getSharedPreferences(Constants.ADMIN, cazimir.com.bancuribune.ui.list.MODE_PRIVATE).edit();
    editor.putBoolean(Constants.ADMIN, isAdmin);
    editor.apply();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_setting);
    init();
}

public void goToAnswersActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, ace.quizbowl.AnswersActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    java.lang.System.out.println(sensorEvent.toString());
    java.lang.System.out.println("new step registered!");
    manager.newStepDone();
    loadTodo();
}

@java.lang.Override
public void onClick(android.view.View v) {
    title[1] = null;
    stopMediaPlayer(mp);
    dialog.dismiss();
}

@org.androidannotations.annotations.Background
public void downloadMap(java.lang.String mapType) {
    publishDownloadComplete(mapType);
}

public void playPause(android.view.View view) {
    if (paused)
        startTimer();
    else
        stopTimer();
    
}

public void onClick(android.content.DialogInterface dialog, int which) {
}

public void onClick(android.view.View v) {
    (clicks)++;
    checknumberOfOutcomes("0");
    insertDisplayCharacter("0");
}

private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String format, java.lang.Object arg) {
    logger.print(level, null, org.slf4j.helpers.MessageFormatter.format(format, arg).getMessage());
}

private static native android.graphics.Bitmap generateQRCode(java.lang.String string, android.content.res.AssetManager assetManager);

@butterknife.OnClick(value = R.id.btn_next_step)
public void nextStep(android.view.View v) {
    nextButtonClickListener.onNextButtonClick(((currentStep.getId()) + 1));
}

@java.lang.Override
public void write(@android.support.annotation.NonNull
com.google.gson.stream.JsonWriter out, @android.support.annotation.NonNull
com.codebutler.farebot.core.ByteArray value) throws java.io.IOException {
    out.value((value != null ? value.base64() : null));
}

public void scheduledRecordingStopped() {
    android.util.Log.d(com.danielkim.soundrecorder.fragments.RecordFragment.TAG, "RecordFragment - scheduledRecordingStopped");
    updateUI(false, null);
    isRecording = false;
}

@java.lang.Override
public void start() {
    if ((audioRecord) == null) {
        audioRecord = new android.media.AudioRecord(MediaRecorder.AudioSource.MIC, com.novoda.canvas.audioviz.SimpleSoundMeter.SAMPLE_RATE, android.media.AudioFormat.CHANNEL_IN_MONO, android.media.AudioFormat.ENCODING_PCM_16BIT, minBufferSize);
    }
    audioRecord.startRecording();
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
}

@java.lang.Override
public void onSeekComplete(android.media.MediaPlayer mp) {
    android.util.Log.e(com.infthink.flintreceiver.receiver.SimpleMediaPlayerActivity.TAG, "onSeekComplete!");
    mFlintVideo.notifyEvents(FlintVideo.SEEKED, "Media SEEKED");
}

@java.lang.Override
public void onClick(android.view.View view) {
    this.loadNewIssue();
}

public void onClickItem(int position) {
    selectItem(position);
}

public void launchActivity(java.lang.Class target, android.support.v4.util.Pair<android.view.View, java.lang.String>[] sharedElements, java.util.Map<java.lang.String, java.lang.Object> data, boolean killCurrunt) {
    launchActivity(activity, target, null, null, killCurrunt);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splashscreen);
    handleSetUp();
}

private boolean isExternalStorageAvalaible() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    return state.equals(Environment.MEDIA_MOUNTED);
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
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
}

@java.lang.Override
public void onClick(android.view.View v) {
    try {
        retrieveDataFromBasicKidFields();
        Daos.KID.save(kid);
        startKidActivity(kid);
    } catch (ar.edu.unlp.info.hermescelascolus.validation.ValidationError validationError) {
    }
}

private void refreshMovieList() {
    mLoadManager.restartLoader(com.manpdev.androidnanodegree.popularmov.movie.movielist.MovieList.MOVIE_LOADER_ID, null, this);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    for (java.lang.Class c : us.michaelchen.compasslogger.receiver.PeriodicReceiver.PERIODICS) {
        context.startService(new android.content.Intent(context, c));
    }
}

@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mHandlerThread) != null) {
        mHandlerThread.quit();
    }
    android.util.Log.v(TAG, "onDestroy");
}

@java.lang.Override
public void run() {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            showPlay(btn);
        }
    }, 500);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    loadData(false);
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.v(leoliang.runningcadence.BackgroundService.LOG_TAG, "onUnbind'd");
    clientHandler = null;
    return true;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onRestResults(int state, java.util.ArrayList<?> results) {
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return view.equals(object);
}

@java.lang.Override
public void onItemClick(final android.view.View view, final int verticalIndex, final int position) {
    mc2.tvz.croatiago.activities.DetailActivity.startDetailsActivity(getActivity(), listModels.get(verticalIndex).objects, position, false);
}

private void createGridViewAdapter() {
    moviesAdapter = new com.example.android.popularmovies.app.MoviesAdapter(new java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>(), getActivity(), getContext(), gridView);
    updateMoviesViewMode();
    gridView.setAdapter(moviesAdapter);
}

@java.lang.Override
public void onActionTopicClicked(com.cngu.androidfun.data.ActionTopic topic, com.cngu.androidfun.main.TopicListAdapter.ViewHolder viewHolder) {
    pushTopicToHistory(topic);
}

public void run() {
    if ((null != (mMediaServer)) && (mMediaServer.isRunning())) {
        mMediaServer.stop();
        mMediaServer = null;
        android.util.Log.i(com.meizu.ruandongchuan.dlnatest.service.DLNAService.TAG, "stopMediaServer");
    }
}

@java.lang.Override
public void onImageDownloaded(android.graphics.Bitmap bitmapResult) {
    mainContentImageView.setImageBitmap(bitmapResult);
    imageLoadingProgress.setVisibility(View.GONE);
    floatingActionButton.setVisibility(View.VISIBLE);
}

public static void loadWriteImg(android.content.Context context, final android.widget.ImageView img, final com.aoliao.notebook.utils.entity.Write.Content content) {
    com.bumptech.glide.Glide.with(context).load(content.getImg()).diskCacheStrategy(DiskCacheStrategy.NONE).into(img);
}

private void displayPlayerRolesDialog() {
    android.app.FragmentManager fm = getActivity().getFragmentManager();
    com.cs428.pandemic.frontEnd.gamePlay.RoleSummaryFragment dialog = new com.cs428.pandemic.frontEnd.gamePlay.RoleSummaryFragment();
    dialog.setTargetFragment(this, 0);
    dialog.show(fm, "roles");
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    data.set(3, input.getText().toString());
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
        default :
            return uk.ac.aber.gij2.olandroid.visualisation.Component.ZERO;
    }
}

@java.lang.Override
public void create(android.app.Activity activity, android.os.Bundle savedInstanceState) {
    if (savedInstanceState == null) {
        loadNavList();
    }
    if ((mCategory) != null) {
        selectItem(mCategory, false);
    }
    mView.onLockDragLayout(needLockDrawerLayout());
}

public android.content.Context getContext() {
    return eu.focusnet.app.FocusApplication.instance;
}

@java.lang.Override
public android.view.View getHeader(android.app.Activity activity) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(activity);
    header = inflater.inflate(R.layout.view_browse_peer_header, null, false);
    updateHeader();
    return header;
}

protected boolean isValidFragment(java.lang.String fragmentName) {
    return (android.preference.PreferenceFragment.class.getName().equals(fragmentName)) || (com.is.was.be.wannareddit.SettingsActivity.GeneralPreferenceFragment.class.getName().equals(fragmentName));
}

