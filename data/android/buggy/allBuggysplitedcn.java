@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(this, vno[position], Toast.LENGTH_SHORT).show();
    viewCode(vno[position]);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game_view);
    gameUpdater = new com.group7.farmtycoon.GameUpdater(this);
    gameUpdater.start();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_profile, container, false);
    initialization();
    fetchData();
    return view;
}

void loadCalls(android.content.Context context, java.lang.String phoneNumberIncoming, int pageIncoming);

@java.lang.Override
public void onFailure(retrofit2.Call call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, getString(R.string.set_userdestination_api_fail), Toast.LENGTH_LONG);
}

public void registerOnStatusChange(final android.content.Intent response, final java.lang.String serviceId) {
    mOnStatusChangeEventFlag = true;
    response.putExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_OK);
    response.putExtra(DConnectMessage.EXTRA_VALUE, "Register OnStatusChange event");
    sendResponse(response);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    prepareFragment(savedInstanceState);
    showIconInActionBar();
    initializeParse();
}

@java.lang.Override
public void onText(java.lang.CharSequence text) {
    android.util.Log.d(TAG, "onText: ");
}

private void launchPlayMenuActivity(final java.lang.String romPath, java.lang.String action) {
    paulscode.android.mupen64plusae.util.Notifier.showToast(this, java.lang.String.format(getString(R.string.toast_loadingGameInfo)));
    new paulscode.android.mupen64plusae.task.ComputeMd5Task(new java.io.File(romPath), this, action).execute();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (!(serviceIsStarted)) {
        serviceIsStarted = true;
        showNotification();
    }
    return START_NOT_STICKY;
}

@java.lang.Override
public void onClick(android.view.View view) {
    getChatMessages();
    sendMessages();
    handler.post(timedTask);
}

public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((camera) != null) {
        camera.stopPreview();
    }
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.d("log", "click zamknij");
    EndGame();
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    android.util.Log.d("BackEnd", ("On method onTouch " + event));
    return clickDetector.onTouchEvent(event);
}

private void launchDetailsActivity(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    android.util.Log.d(com.example.test.samplemasterdetail.MainActivity.TAG, "launchDetailsActivity: ");
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.test.samplemasterdetail.DetailsActivity.class);
    intent.putExtra(com.example.test.samplemasterdetail.MainActivity.DETAILS_KEY, relatedTopic);
    startActivity(intent);
}

public void toBack() {
    android.view.ViewGroup parent = ((android.view.ViewGroup) (this.getParent()));
    parent.removeView(this);
    parent.addView(this, 0);
}

public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    cancelLoader();
    initviews();
}

@java.lang.Override
public void onBackPressed() {
    if (decision.equals("NO")) {
        android.widget.Toast.makeText(getApplicationContext(), "You have to exit the queue first !", Toast.LENGTH_SHORT).show();
    }else {
        super.onBackPressed();
    }
}

protected void onResume() {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED))
        com.example.gdev.unipicityguide.MainActivity.locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    
    super.onResume();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonRestart :
            start();
            break;
        case R.id.buttonStop :
            stop();
            finish();
            break;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_choose_topic);
}

void shutdown() {
    android.os.Looper.myLooper().quit();
    synchronized(renderObj) {
        isReady = true;
        renderObj.notify();
    }
    android.util.Log.d(com.flipcam.view.CameraView.TAG, "Camera thread done... main thread can continue");
}

public void loadVisite(java.lang.String element, boolean french, android.content.Context context) {
    m_GoogleMap.clear();
    theron_b.com.visitetablette.tool.DataExplorer dataExplorer = new theron_b.com.visitetablette.tool.DataExplorer(element, m_GoogleMap);
    m_ListPlacesObjects = dataExplorer.getM_ListPlacesObjects();
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onTerminate() {
    super.onTerminate();
    component.episodeDownloads().unregisterReceiver();
    android.util.Log.d("APP", "unregister");
}

@java.lang.Override
public org.appcelerator.titanium.view.TiUIView createView(android.app.Activity activity) {
    mView = new de.appwerft.spinkit.SpinnerViewProxy.SpinnerView(this);
    mView.getLayoutParams().autoFillsHeight = true;
    mView.getLayoutParams().autoFillsWidth = true;
    return mView;
}

@android.support.annotation.NonNull
public java.util.Set<java.lang.String> readFilteredCategories() {
    return getDefaultPrefs().getStringSet(com.blogspot.e_kanivets.moneytracker.controller.PreferenceController.KEY_FILTERED_CATEGORIES, new java.util.HashSet<java.lang.String>());
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getApplicationContext(), "Apagar da base de dados", Toast.LENGTH_SHORT).show();
    if (deletarCotacaoNaBase()) {
        finish();
    }
}

@java.lang.Override
public void onNext(android.view.View view) {
    com.srmarlins.weather.network.model.WeatherInfo info = ((com.srmarlins.weather.network.model.WeatherInfo) (view.getTag(WeatherRecyclerAdapter.VIEW_KEY)));
    startActivity(com.srmarlins.weather.ui.activity.DetailActivity.newIntent(this, info));
}

private com.teamagam.gimelgimel.app.Alerts.view.BubbleAlertsSubcomponent.PeakColorToolbarAnimator createActionbarAnimator(android.app.Activity activity) {
    return new com.teamagam.gimelgimel.app.Alerts.view.BubbleAlertsSubcomponent.PeakColorToolbarAnimator(mToolbar, activity.getResources());
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.app.Activity a, android.view.Menu m) {
    menu = m;
    generateMenu();
    return (size()) > 0;
}

private void loadProgram() {
    android.content.Intent intent = new android.content.Intent(tech.michaeloverman.android.mscount.dataentry.MetaDataEntryFragment.mActivity, tech.michaeloverman.android.mscount.database.LoadNewProgramActivity.class);
    startActivityForResult(intent, tech.michaeloverman.android.mscount.dataentry.MetaDataEntryFragment.REQUEST_NEW_PROGRAM);
}

public static synchronized void send(java.lang.String message) {
    android.util.Log.e("Trying to send ", message);
    com.example.simon.battleships.GameManager.clientWrite = new com.example.simon.battleships.ClientWrite(com.example.simon.battleships.GameManager.client, message);
    com.example.simon.battleships.GameManager.clientWrite.start();
}

@java.lang.Override
public void onClick(android.view.View v) {
    input2.setText(vickenkrikorian.calculator.Advanced.solve(input2.getText().toString().substring(((bracket) + 1))));
    actionLocation = -1;
}

public void updateArticleView(int position) {
    mCurrentPosition = position;
    android.widget.TextView textView = ((android.widget.TextView) (getView().findViewById(R.id.article_text)));
    textView.setText(Articles.Articles[position]);
}

public void onCompletion(android.media.MediaPlayer player) {
    player.reset();
    playSound();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    cm = ((android.net.ConnectivityManager) (com.adsamcik.signalcollector.DataStore.context.getSystemService(Context.CONNECTIVITY_SERVICE)));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && ((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null))
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.seekTo(progress);
    
}

@java.lang.Override
public java.lang.Boolean call(com.etiennelawlor.moviehub.data.model.MoviesPage moviesPage) {
    android.util.Log.d(com.etiennelawlor.moviehub.data.source.movies.MoviesRepository.TAG, ("call: moviesPage.isExpired() - " + (moviesPage.isExpired())));
    return !(moviesPage.isExpired());
}

public java.util.List<android.location.Location> getLocationsToProcess() {
    java.util.List<android.location.Location> outputList = new java.util.ArrayList<android.location.Location>(locationsToProcess);
    locationsForThisRun.addAll(locationsToProcess);
    locationsToProcess.clear();
    return outputList;
}

public void setVerticalInterval(float interval) {
    mVerticalInterval = co.lujun.androidtagview.Utils.dp2px(getContext(), interval);
    postInvalidate();
}

public static void e(final java.lang.String msg) {
    if (com.stanko.tools.Log.isDebuggable)
        android.util.Log.e(com.stanko.tools.Log.getMethodName(), msg);
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_project_photo_select);
    project_photo_select_activity = this;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    menuhandler = new com.nag.android.stm.MenuHandler(getActivity(), this);
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mListener = ((com.akash.vachana.fragment.KathruListFragment.OnKathruListFragmentInteractionListener) (getArguments().getSerializable("listener")));
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mRecordButton.setEnabled(true);
    mDeleteButton.setEnabled(true);
    stopPlaying();
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.e("ListView", ("onItemSelected:" + position));
}

public com.lzj.appupdate.UpdateManager config(android.content.Context context, boolean debug, boolean useDefaultDialogDisplay) {
    UpdateConfigs.context = context;
    UpdateConfigs.DEBUG = debug;
    UpdateConfigs.useDefaultDialogDisplay = useDefaultDialogDisplay;
    return com.lzj.appupdate.UpdateManager.getInstance();
}

@java.lang.Override
public com.lweynant.yearly.model.BirthdayBuilder set(android.os.Bundle bundle) {
    super.set(bundle);
    if (bundle.containsKey(com.lweynant.yearly.model.BirthdayBuilder.KEY_LAST_NAME)) {
        lastName = bundle.getString(com.lweynant.yearly.model.BirthdayBuilder.KEY_LAST_NAME);
    }
    return this;
}

public void update(com.beccap.weathervane.model.WeatherStatus weatherStatus, android.location.Location currentLocation) {
    _weatherStatus = weatherStatus;
    _currentLocation = currentLocation;
    updateView(getView());
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "calling updateMap from update()");
    updateMap();
}

private void globalToast(final java.lang.String text) {
    jwtc.android.chess.ics.Toast t = jwtc.android.chess.ics.Toast.makeText(this, text, Toast.LENGTH_LONG);
    t.setGravity(Gravity.BOTTOM, 0, 0);
    t.show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mOnItemClickListener) != null) {
        int position = holder.getAdapterPosition();
        mOnItemClickListener.onItemClick(v, mDataList.get(position), position);
    }
}

@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "onSaveInstanceState");
    return super.onSaveInstanceState();
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.widget.Toast.makeText(getApplicationContext(), "Provider resetting", Toast.LENGTH_SHORT).show();
    mTaskCursorAdapter.swapCursor(null);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    this.finish();
}

@java.lang.Override
public void extractIntentData() {
    if (getIntent().hasExtra(com.skillvo.android.views.PortFolioActivity.KEY_DATA_MODEL)) {
        mPagedDataModel = getIntent().getParcelableExtra(com.skillvo.android.views.PortFolioActivity.KEY_DATA_MODEL);
        portfolioViewModel.bindPagedDataModel(mPagedDataModel);
        com.skillvo.android.utils.DialogUtils.showToast(getApplicationContext(), "Portfolio Object Found");
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().add(R.id.settings_fragment, new com.dbtest.ivan.app.fragment.SettingsFragment()).commit();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_done, menu);
    menu.getItem(0).setVisible(false);
    return true;
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    spring.setCurrentValue(1);
    spring.setEndValue(0);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != (spinnerPos)) {
        spinnerPos = position;
        updateMethodIcon(position);
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    this.finish();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_two, container, false);
    return super.onCreateView(inflater, container, savedInstanceState);
}

public void swapCursor(android.database.Cursor cursor) {
    this.mCursor = cursor;
    notifyDataSetChanged();
}

@java.lang.Override
public void onQuestionsLoaded(java.util.List<com.jbrys.android.bloquery.api.model.Question> questions) {
    for (com.jbrys.android.bloquery.api.model.Question q : questions) {
        mQuestionList.add(q);
    }
    mAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onHandRelease(com.daimajia.swipe.SwipeLayout arg0, float arg1, float arg2) {
    android.util.Log.d("TimeFleeting", "onHandRelease");
}

@java.lang.Override
public void onPanelCollapsed(android.view.View panel) {
    android.util.Log.i(com.pipit.waffle.TestFragmentNew.TAG, "onPanelCollapsed");
    isExpanded = false;
}

@java.lang.Override
public void onDestroy() {
    this.unregisterReceiver(this.m24HourResetReceiver);
    android.util.Log.v(com.general.mediaplayer.csr.services.CsrManagerService.TAG, "===onDestroy==");
    this.mHandler.removeCallbacks(this.mTimerRunable);
    super.onDestroy();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.graphic_fragment, null);
    initView(view);
    InitUUID(savedInstanceState);
    return view;
}

@java.lang.Override
public void oneclick() {
    android.content.Intent camera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(camera, 0);
    android.content.Intent i = new android.content.Intent(this, com.example.bordia98.drawer.upload_activity.class);
    startActivity(i);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    me.nereo.multi_image_selector.MultiImageSelector.create(this).single().start(this, Config.REQUEST_IMAGE_CODE);
    dismissDialog();
}

public void registerReceiver() {
    broadcastReceiver = new com.kiwi.flickrbatchdownload.photolist.PhotoListActivity.MBroadcastReceiver();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new android.content.IntentFilter(com.kiwi.flickrbatchdownload.download.DownloadService.IMAGE_TASKINFO_SENDBACK_ACTION));
}

private engine.LocalFolder getDcim() {
    if ((mDcim) == null) {
        java.io.File root = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        mDcim = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
        mDcim.setPredefinedThumbnail(R.drawable.ic_photo_camera_grey600_24dp);
    }
    return mDcim;
}

@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    updateTitleAndUnread();
    adapter.notifyDataSetChanged();
}

private void updateUI(com.ashokgujju.newsonair.PlaybackStatus status) {
    buildNotification(status);
    org.greenrobot.eventbus.EventBus.getDefault().postSticky(new com.ashokgujju.newsonair.MediaPlayerServiceResult(android.app.Activity.RESULT_OK, status));
}

@java.lang.Override
public org.akanza.androidosms.core.OSms build() throws java.io.IOException, org.akanza.androidosms.core.exception.HttpApiOrangeException {
    if (((id) == null) || ((secretCode) == null)) {
        org.akanza.androidosms.entity.Token token = obtainsToken();
        return new org.akanza.androidosms.core.OSms(token, Builder.client);
    }
    return null;
}

@java.lang.Override
public void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) {
    boolean available = locationAvailability.isLocationAvailable();
    googleApiClientStatus(native_ptr_, (available ? ru.dublgis.androidlocation.GmsLocationProvider.STATUS_REQUEST_SUCCESS : ru.dublgis.androidlocation.GmsLocationProvider.STATUS_REQUEST_FAIL));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (!(com.hungnt.customlogin.fragments.MusicPlayerFragment.isPlaying)) {
        seekTime();
    }
}

public void ReleaseButton(int i) {
    SendData(releaseKey[i]);
    android.util.Log.i("iBeatCon", (("Button " + i) + " Released"));
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animator) {
    gameView.animatedCards.add(cardView.getCard());
    gameView.drawQueue();
    super.onAnimationStart(animator);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    de.fau.sensorlib.DsSensorManager.checkBtLePermissions(this, true);
    android.util.Log.d(de.fau.teksample.MainActivity.TAG, ("Ver: " + (Build.VERSION.SDK_INT)));
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.i(ch.hevs.aislab.paams.ui.ListValuesFragment.TAG, "Warning: onDestroy() was called!");
    super.onDestroy();
}

@java.lang.Override
public void run() {
    menuProcessor.processActivity(activity);
    android.view.View view = activity.getWindow().getDecorView();
    processView(view);
}

@java.lang.Override
public void createSketch() {
    processing.core.PApplet sketch = new devel.android_everything_test.WallpaperSketch();
    java.lang.System.out.println(("created sketch " + sketch));
    setSketch(sketch);
}

public static org.shreyans.greendot.fragments.CreateGoalFragment newInstance() {
    android.util.Log.d(org.shreyans.greendot.fragments.CreateGoalFragment.TAG, "in CreateGoalFragment.newInstance");
    org.shreyans.greendot.fragments.CreateGoalFragment f = new org.shreyans.greendot.fragments.CreateGoalFragment();
    return f;
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    org.smap.smapTask.android.activities.MainTabsActivity.stopNFCDispatch(this, mNfcAdapter);
    if (listenerRegistered) {
        unregisterReceiver(listener);
        listenerRegistered = false;
    }
}

private void updateScore() {
    android.widget.TextView scoreDisplay = ((android.widget.TextView) (findViewById(R.id.scoreId)));
    scoreDisplay.setText(java.lang.Integer.toString(l00lgamescommunity.movingsquares.MainActivity.getScore()));
}

public synchronized void removeAll(java.util.List<T> items) {
    this.data.remove(items);
    com.flyn.smartandroid.ui.interfaces.ListBaseAdapter.notifyDataSetChanged();
}

public boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if (Environment.MEDIA_MOUNTED.equals(state)) {
        return true;
    }
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            deleteMember(simNumber);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            dialog.cancel();
            break;
    }
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i1) {
    android.util.Log.v("MUSIC PLAYER", "Playback Error");
    return true;
}

@java.lang.Override
public void onCancelScanDone() {
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onCancelScanDone();
}

@java.lang.Override
public void onPersonAdded(com.djonique.birdays.models.Person person) {
    pagerAdapter.addPerson(person);
    android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(findViewById(R.id.container), R.string.record_added, Snackbar.LENGTH_SHORT);
    snackbar.show();
}

@java.lang.Override
public void onLocationAvailable(java.lang.String postalCode) {
    mSearchFilter.setPostalCode(postalCode);
    android.support.design.widget.Snackbar.make(findViewById(android.R.id.content), ("Location found: " + postalCode), Snackbar.LENGTH_LONG).show();
}

public void seekToPosition(int i) {
    if (i > 10000) {
        this.player.seekToPosition(i);
    }else {
        android.util.Log.d(saiboten.no.synclistener.musicservice.SpotifyPlayerWrapper.TAG, (("Position " + i) + " is less than three seconds. Let's just skip the seek. Probably a new track"));
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if ((id == (R.id.action_search)) || (super.onOptionsItemSelected(item)))
        return true;
    else
        return false;
    
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_best_day :
            onBestDaySelected();
            return true;
        default :
            return false;
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int which) {
    deleteBottomFolder(path);
    dialog.dismiss();
}

private void openActivity(java.lang.Class myClass) {
    android.content.Intent intent = new android.content.Intent(this, myClass);
    startActivity(intent);
    stopAlarm();
}

public void onSwipeLeft() {
    android.util.Log.d(com.lyk.ai_2048.main.MainGameActivity.TAG, "swiped left");
    numberGrid.saveState();
    numberGrid.moveLeft();
}

public int getDefaultNightMode() {
    return android.support.v7.app.AppCompatDelegate.getDefaultNightMode();
}

