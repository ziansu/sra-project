@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    viewCode(vno[position]);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game_view);
    if ((gameUpdater) == null) {
        gameUpdater = new com.group7.farmtycoon.GameUpdater(this);
        gameUpdater.start();
    }
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_profile, container, false);
    initialization();
    return view;
}

void loadCalls(android.content.Context context, java.lang.String phoneNumberIncoming);

@java.lang.Override
public void onFailure(retrofit2.Call call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, getString(R.string.set_userdestination_api_fail), Toast.LENGTH_LONG).show();
}

public void registerOnStatusChange(final android.content.Intent response, final java.lang.String serviceId) {
    mOnStatusChangeEventFlag = true;
    response.putExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_OK);
    sendResponse(response);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    prepareFragment(savedInstanceState);
    showIconInActionBar();
}

@java.lang.Override
public void onText(java.lang.CharSequence text) {
}

private void launchPlayMenuActivity(final java.lang.String romPath) {
    paulscode.android.mupen64plusae.util.Notifier.showToast(this, java.lang.String.format(getString(R.string.toast_loadingGameInfo)));
    new paulscode.android.mupen64plusae.task.ComputeMd5Task(new java.io.File(romPath), this).execute();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (!(serviceIsStarted)) {
        serviceIsStarted = true;
    }
    return START_NOT_STICKY;
}

@java.lang.Override
public void onClick(android.view.View view) {
    sendMessages();
}

public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((camera) != null) {
    }
}

public void onClick(android.content.DialogInterface dialog, int which) {
    EndGame();
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    return clickDetector.onTouchEvent(event);
}

private void launchDetailsActivity(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.test.samplemasterdetail.DetailsActivity.class);
    intent.putExtra(com.example.test.samplemasterdetail.MainActivity.DETAILS_KEY, relatedTopic);
    startActivity(intent);
}

public void toBack() {
    android.view.ViewGroup parent = ((android.view.ViewGroup) (this.getParent()));
    parent.removeView(this);
    parent.addView(this, 1);
}

public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    initviews();
}

@java.lang.Override
public void onBackPressed() {
    if (!(decision)) {
        android.widget.Toast.makeText(getApplicationContext(), "You have to exit the queue first !", Toast.LENGTH_SHORT).show();
    }else {
        super.onBackPressed();
    }
}

protected void onResume() {
    super.onResume();
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED))
        com.example.gdev.unipicityguide.MainActivity.locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonRestart :
            start();
            break;
        case R.id.buttonStop :
            stop();
            break;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

void shutdown() {
    android.os.Looper.myLooper().quit();
}

public void loadVisite(java.lang.String element) {
    m_GoogleMap.clear();
    theron_b.com.visitetablette.tool.DataExplorer dataExplorer = new theron_b.com.visitetablette.tool.DataExplorer(element, m_GoogleMap);
    m_ListPlacesObjects = dataExplorer.getM_ListPlacesObjects();
}

@java.lang.Override
public void run() {
}

@java.lang.Override
public void onTerminate() {
    super.onTerminate();
    component.episodeDownloads().unregisterReceiver();
}

@java.lang.Override
public org.appcelerator.titanium.view.TiUIView createView(android.app.Activity activity) {
    mView = new de.appwerft.spinkit.SpinnerViewProxy.SpinnerView(this);
    return mView;
}

@android.support.annotation.NonNull
public java.util.Set<java.lang.String> readFilteredCategories() {
    return new java.util.HashSet(getDefaultPrefs().getStringSet(com.blogspot.e_kanivets.moneytracker.controller.PreferenceController.KEY_FILTERED_CATEGORIES, new java.util.HashSet<java.lang.String>()));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (deletarCotacaoNaBase()) {
        finish();
    }
}

@java.lang.Override
public void onNext(android.view.View view) {
    com.srmarlins.weather.network.model.WeatherInfo info = ((com.srmarlins.weather.network.model.WeatherInfo) (view.getTag()));
    startActivity(com.srmarlins.weather.ui.activity.DetailActivity.newIntent(this, info));
}

private com.teamagam.gimelgimel.app.Alerts.view.BubbleAlertsSubcomponent.PeakColorToolbarAnimator createActionbarAnimator(android.app.Activity activity) {
    return new com.teamagam.gimelgimel.app.Alerts.view.BubbleAlertsSubcomponent.PeakColorToolbarAnimator(mToolbar, activity);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.app.Activity a, android.view.Menu m) {
    menu = m;
    if ((size()) > 0) {
        return generateMenu();
    }
    return false;
}

public void loadProgram() {
    android.content.Intent intent = new android.content.Intent(tech.michaeloverman.android.mscount.dataentry.MetaDataEntryFragment.mActivity, tech.michaeloverman.android.mscount.database.LoadNewProgramActivity.class);
    startActivityForResult(intent, tech.michaeloverman.android.mscount.dataentry.MetaDataEntryFragment.REQUEST_NEW_PROGRAM);
}

public static synchronized void send(java.lang.String message) {
    if ((com.example.simon.battleships.GameManager.client) != null) {
        android.util.Log.e("Trying to send ", message);
        com.example.simon.battleships.GameManager.clientWrite = new com.example.simon.battleships.ClientWrite(com.example.simon.battleships.GameManager.client, message);
        com.example.simon.battleships.GameManager.clientWrite.start();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    input2.setText(solve(input2.getText().toString().substring(((bracket) + 1))));
    actionLocation = -1;
}

public void updateArticleView(int position) {
    android.widget.TextView textView = ((android.widget.TextView) (getView().findViewById(R.id.article_text)));
    textView.setText(Articles.Articles[position]);
}

public void onCompletion(android.media.MediaPlayer player) {
    player.reset();
}

@java.lang.Override
public void onStart() {
    super.onStart();
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null))
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().seekTo(progress);
    
}

@java.lang.Override
public java.lang.Boolean call(com.etiennelawlor.moviehub.data.model.MoviesPage moviesPage) {
    return !(moviesPage.isExpired());
}

public java.util.List<android.location.Location> getLocationsToProcess() {
    java.util.List<android.location.Location> outputList = new java.util.ArrayList<android.location.Location>(locationsToProcess);
    return outputList;
}

public void setVerticalInterval(float interval) {
    mVerticalInterval = ((int) (dp2px(getContext(), interval)));
    postInvalidate();
}

public static void e(final java.lang.String msg) {
    android.util.Log.e(com.stanko.tools.Log.getMethodName(), msg);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_project_photo_select);
    super.onCreate(savedInstanceState);
    project_photo_select_activity = this;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    menuhandler = new com.nag.android.stm.MenuHandler(getActivity(), this, this);
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    stopPlaying();
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
}

public static void config(android.content.Context context, boolean debug, boolean useDefaultDialogDisplay) {
    UpdateConfigs.context = context;
    UpdateConfigs.DEBUG = debug;
    UpdateConfigs.useDefaultDialogDisplay = useDefaultDialogDisplay;
}

@java.lang.Override
public com.lweynant.yearly.model.BirthdayBuilder set(android.os.Bundle bundle) {
    super.set(bundle);
    if (bundle.containsKey(com.lweynant.yearly.model.BirthdayBuilder.KEY_LAST_NAME)) {
        lastName = bundle.getString(com.lweynant.yearly.model.BirthdayBuilder.KEY_LAST_NAME);
    }else {
        lastName = null;
    }
    return this;
}

public void update(com.beccap.weathervane.model.WeatherStatus weatherStatus, android.location.Location currentLocation) {
    _weatherStatus = weatherStatus;
    _currentLocation = currentLocation;
    updateView(getView());
    updateMap();
}

public void globalToast(final java.lang.String text) {
    jwtc.android.chess.ics.Toast t = jwtc.android.chess.ics.Toast.makeText(this, text, Toast.LENGTH_LONG);
    t.setGravity(Gravity.BOTTOM, 0, 0);
    t.show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mOnItemClickListener) != null) {
        mOnItemClickListener.onItemClick(v, mDataList.get(position), position);
    }
}

@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "onSaveInstanceState");
    android.os.Parcelable p = super.onSaveInstanceState();
    return p;
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    mTaskCursorAdapter.swapCursor(null);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    java.lang.System.exit(0);
}

@java.lang.Override
public void extractIntentData() {
    if (getIntent().hasExtra(com.skillvo.android.views.PortFolioActivity.KEY_DATA_MODEL)) {
        mPagedDataModel = getIntent().getParcelableExtra(com.skillvo.android.views.PortFolioActivity.KEY_DATA_MODEL);
        portfolioViewModel.bindPagedDataModel(mPagedDataModel);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_done, menu);
    return true;
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    spring.setCurrentValue(0);
    spring.setEndValue(1);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (id != (spinnerPos)) {
        spinnerPos = ((int) (id));
        updateMethodIcon(position);
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_two, container, false);
    return view;
}

public void swapCursor(android.database.Cursor cursor) {
    if ((mCursor) == cursor)
        return ;
    
    this.mCursor = cursor;
    notifyDataSetChanged();
}

@java.lang.Override
public void onQuestionsLoaded(java.util.List<com.jbrys.android.bloquery.api.model.Question> questions) {
    for (com.jbrys.android.bloquery.api.model.Question q : questions) {
        if (mQuestionList.contains(q)) {
            continue;
        }
        mQuestionList.add(q);
    }
    mAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onHandRelease(com.daimajia.swipe.SwipeLayout arg0, float arg1, float arg2) {
}

@java.lang.Override
public void onPanelCollapsed(android.view.View panel) {
    android.util.Log.i(com.pipit.waffle.TestFragmentNew.TAG, "onPanelCollapsed");
    if (isExpanded) {
    }
}

@java.lang.Override
public void onDestroy() {
    this.unregisterReceiver(this.m24HourResetReceiver);
    android.util.Log.v(com.general.mediaplayer.csr.services.CsrManagerService.TAG, "===onDestroy==");
    super.onDestroy();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.graphic_fragment, container, false);
    initView(view);
    InitUUID(savedInstanceState);
    return view;
}

@java.lang.Override
public void oneclick() {
    android.content.Intent camera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(camera, 0);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    me.nereo.multi_image_selector.MultiImageSelector.create().single().start(this, Config.REQUEST_IMAGE_CODE);
    dismissDialog();
}

public void registerReceiver() {
    broadcastReceiver = new com.kiwi.flickrbatchdownload.photolist.PhotoListActivity.MBroadcastReceiver();
    registerReceiver(broadcastReceiver, new android.content.IntentFilter(com.kiwi.flickrbatchdownload.download.DownloadService.IMAGE_TASKINFO_SENDBACK_ACTION));
}

private engine.LocalFolder getDcim() {
    if ((mDcim) == null) {
        java.io.File root = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        mDcim = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
    }
    return mDcim;
}

@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    adapter.notifyDataSetChanged();
    updateTitleAndUnread();
}

public void updateUI(com.ashokgujju.newsonair.PlaybackStatus status) {
    buildNotification(status);
    org.greenrobot.eventbus.EventBus.getDefault().postSticky(new com.ashokgujju.newsonair.MediaPlayerServiceResult(android.app.Activity.RESULT_OK, status));
}

@java.lang.Override
public org.akanza.androidosms.core.OSms build() throws java.io.IOException, org.akanza.androidosms.core.exception.HttpApiOrangeException {
    if (((id) != null) && ((secretCode) != null)) {
        org.akanza.androidosms.entity.Token token = obtainsToken();
        return new org.akanza.androidosms.core.OSms(token, Builder.client);
    }
    return null;
}

@java.lang.Override
public void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) {
    boolean available = false;
    if (null != locationAvailability) {
        available = locationAvailability.isLocationAvailable();
    }
    googleApiClientStatus(native_ptr_, (available ? ru.dublgis.androidlocation.GmsLocationProvider.STATUS_REQUEST_SUCCESS : ru.dublgis.androidlocation.GmsLocationProvider.STATUS_REQUEST_FAIL));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
}

public void ReleaseButton(int i) {
    SendData(releaseKey[i]);
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animator) {
    super.onAnimationStart(animator);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    de.fau.sensorlib.DsSensorManager.checkBtLePermissions(this, true);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
}

@java.lang.Override
public void run() {
    processView(view);
}

@java.lang.Override
public processing.core.PApplet createSketch() {
    processing.core.PApplet sketch = new devel.android_everything_test.WallpaperSketch();
    return sketch;
}

public static org.shreyans.greendot.fragments.CreateGoalFragment newInstance() {
    org.shreyans.greendot.fragments.CreateGoalFragment f = new org.shreyans.greendot.fragments.CreateGoalFragment();
    return f;
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((mNfcAdapter) != null) {
        org.smap.smapTask.android.activities.MainTabsActivity.stopNFCDispatch(this, mNfcAdapter);
    }
    if (listenerRegistered) {
        unregisterReceiver(listener);
        listenerRegistered = false;
    }
}

private void updateScore() {
    android.widget.TextView scoreDisplay = ((android.widget.TextView) (findViewById(R.id.scoreId)));
    scoreDisplay.setText(java.lang.Integer.toString(getScore()));
}

public synchronized void removeAll(java.util.List<T> items) {
    this.data.removeAll(items);
    com.flyn.smartandroid.ui.interfaces.ListBaseAdapter.notifyDataSetChanged();
}

public boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    return Environment.MEDIA_MOUNTED.equals(state);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    deleteMember(simNumber);
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i1) {
    return true;
}

@java.lang.Override
public void onCancelScanDone() {
    getCurrentState().onCancelScanDone();
}

@java.lang.Override
public void onPersonAdded(com.djonique.birdays.models.Person person) {
    pagerAdapter.addPerson(person);
    android.support.design.widget.Snackbar.make(findViewById(R.id.container), R.string.record_added, Snackbar.LENGTH_SHORT).show();
}

@java.lang.Override
public void onLocationAvailable(java.lang.String postalCode) {
    mSearchFilter.setPostalCode(postalCode);
}

public void seekToPosition(int i) {
    this.player.seekToPosition(i);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return (id == (R.id.action_search)) || (super.onOptionsItemSelected(item));
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_best_day :
            return true;
        default :
            return false;
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int which) {
    deleteBottomFolder(path);
    dialog.dismiss();
    dialog = null;
}

private void openActivity(java.lang.Class myClass) {
    android.content.Intent intent = new android.content.Intent(this, myClass);
    startActivity(intent);
}

public void onSwipeLeft() {
    android.util.Log.d(com.lyk.ai_2048.main.MainGameActivity.TAG, "swiped left");
    numberGrid.moveLeft();
}

private int getDefaultNightMode() {
    return android.support.v7.app.AppCompatDelegate.getDefaultNightMode();
}

