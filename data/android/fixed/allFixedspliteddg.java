@java.lang.Override
public void onRouteUnselected(android.support.v7.media.MediaRouter router, android.support.v7.media.MediaRouter.RouteInfo route) {
    updatePresentation();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    return START_STICKY;
}

public static void initialize(android.content.Context c) {
    com.adsamcik.signalcollector.Extensions.telephonyManager = ((android.telephony.TelephonyManager) (c.getSystemService(Context.TELEPHONY_SERVICE)));
    com.adsamcik.signalcollector.Extensions.connectivityManager = ((android.net.ConnectivityManager) (c.getSystemService(Context.CONNECTIVITY_SERVICE)));
}

@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    edu.rosehulman.punttj.rosebuckets.model.SubItem item = dataSnapshot.getValue(edu.rosehulman.punttj.rosebuckets.model.SubItem.class);
    onSubItemSelected(item);
}

public static int get(final java.lang.String key) {
    return com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.containsKey(key) ? com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.get(key) : R.drawable.acc_none;
}

public void onMediaScannerConnected() {
}

@java.lang.Override
public android.support.v4.util.Pair<java.lang.Integer, java.lang.Integer> call(java.lang.Integer completed, java.lang.Integer active) {
    return android.support.v4.util.Pair.create(active, completed);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    io.github.data4all.logger.Log.d(io.github.data4all.service.GPSservice.TAG, "onStartCommand");
    return START_STICKY;
}

public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    doCallCropActivity(uri, dispSize, dispSize.x, dispSize.y);
}

@java.lang.Override
public void onAnimationRepeat(android.animation.Animator animator) {
    if (!(repeated)) {
        current_instance.setText(com.example.cesarsk.say_it.Utility.getRandomWord(((android.app.Activity) (current_instance.getContext()))));
    }
    repeated = !(repeated);
}

@java.lang.Override
public void onClick(android.view.View v) {
    this.finish();
}

public void clearPager() {
    mViewPager.setAdapter(null);
    mViewPager.removeAllViews();
}

@java.lang.Override
protected com.shadark.android.react.amaps.mapview.AMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    com.amap.api.maps.AMapOptions options = new com.amap.api.maps.AMapOptions();
    options.zoomControlsEnabled(false);
    return new com.shadark.android.react.amaps.mapview.AMapView(reactContext, mAppContext, this, options);
}

@java.lang.Override
protected void getSaveInstanceState(android.os.Bundle savedInstanceState) {
}

public static android.graphics.Bitmap getEmptyBitmap() {
    return com.androidquery.callback.BitmapAjaxCallback.empty;
}

private static synchronized void stopVibrate() {
    if ((org.catrobat.catroid.utils.VibratorUtil.vibrator) != null) {
        android.util.Log.d(org.catrobat.catroid.utils.VibratorUtil.TAG, "stopVibrate()");
        org.catrobat.catroid.utils.VibratorUtil.vibrator.cancel();
    }
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    if (preference == (this)) {
        setValues();
    }
    return true;
}

public void execute(final org.wordpress.android.ui.accounts.helpers.FetchBlogListAbstract.Callback callback) {
    mCallback = callback;
    fetchBlogList(callback);
}

@org.junit.Test
public void startActivityWithDefaultIntentAndDefaultCategoryWithOptionalArgs() {
    io.appium.java_client.android.IntentTest.driver.startActivity("com.prgguru.android", ".GreetingActivity", null, null, "android.intent.action.MAIN", "android.intent.category.DEFAULT", "0x4000000", "--es \"USERNAME\" \"AppiumIntentTest\" -t \"text/plain\"");
    org.junit.Assert.assertEquals(io.appium.java_client.android.IntentTest.driver.findElementById("com.prgguru.android:id/textView1").getText(), "Welcome AppiumIntentTest");
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    listener.onAnimationEnd(null);
}

public void signinOnClick(android.view.View v1) {
    android.content.Intent myIntent = new android.content.Intent(this, com.example.parthdoshi.articleshub.SignupPage.class);
    this.startActivity(myIntent);
}

private void selectItem(int position) {
    switch (position) {
        case 0 :
            {
            }
        default :
            break;
    }
    mDrawerLayout.closeDrawer(mDrawerList);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    mFrame = ((android.widget.FrameLayout) (findViewById(R.id.fullscreen_camera)));
    Globals.lastImageTaken = null;
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.article_fragment_layout, container, false);
}

@butterknife.OnEditorAction
boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    return actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    startService(new android.content.Intent(this, com.example.jimmyle.pacmanandroid.BackgroundMusicService.class));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    spUtil.saveGpsInterval(values[i]);
    dialogInterface.dismiss();
    tvGpsInterval.setText(items[i]);
}

@retrofit2.http.GET(value = "vehicles/{vehicleId}/codes")
rx.Observable<li.vin.net.TimeSeries<li.vin.net.Dtc>> codes(@android.support.annotation.NonNull
@retrofit2.http.Path(value = "vehicleId")
java.lang.String vehicleId, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "since")
java.lang.Long since, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "until")
java.lang.Long until, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "limit")
java.lang.Integer limit, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "sortDir")
java.lang.String sortDir, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "state")
java.lang.String state);

public void setReminders(io.realm.RealmList<com.habitrpg.android.habitica.models.tasks.RemindersItem> reminders) {
    this.reminders = reminders;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviedroidPropertyReader = com.cloudskol.moviedroid.common.MoviedroidPropertyReader.getInstance(getActivity());
    moviedroidUriBuilder = new com.cloudskol.moviedroid.common.MoviedroidUriBuilder(moviedroidPropertyReader);
}

@java.lang.Override
public void onBackPressed() {
    finish();
    disconnect();
    android.os.Process.killProcess(android.os.Process.myPid());
    super.onBackPressed();
}

private void multipleimageClick() {
    android.util.Log.d(com.example.asus.travelamapdemo.view.activity.WriteNoteActivity.TAG, "multipleimageClick");
    multipleImage.setAddClickCallback(new com.goyourfly.multi_picture.MultiPictureView.AddClickCallback() {
        @java.lang.Override
        public void onAddClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            com.example.asus.travelamapdemo.util.MatisseUtil util = new com.example.asus.travelamapdemo.util.MatisseUtil(com.example.asus.travelamapdemo.view.activity.WriteNoteActivity.this, multipleImage);
        }
    });
}

public void refreshTaskManagerView() {
    loadRunningTasks();
    refreshMemoryUsagePanel();
    inflateTaskListView();
}

@java.lang.Override
public void onClick(android.view.View v) {
    hidePopupMenuForMarker();
}

@java.lang.Override
public void onClick(android.view.View v2) {
    ((me.ccrama.redditslide.Activities.AlbumPager) (getActivity())).doImageSave(false, url, i);
}

@java.lang.Override
public void onClick(android.view.View v) {
    asiantech.vn.main.MainActivity.showFragmentEditContact(new asiantech.vn.listcontact.ListContactClass(position, mListContacts));
}

@java.lang.Override
public com.twtstudio.bbs.bdpqchen.bbs.commons.base.BaseViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new com.twtstudio.bbs.bdpqchen.bbs.individual.message.MessageAdapter.MessageItemViewHolder(inflater.inflate(R.layout.item_rv_message, parent, false));
}

protected void onCreate(android.os.Bundle savedInstanceState) {
    initDataManager();
    super.onCreate(savedInstanceState);
    initGui();
    checkIntent(getIntent());
    if (savedInstanceState == null) {
        showFragment(startFragmentMenuItemId, true);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null)
        onItemClickListener.onItemClick(v, getAdapterPosition());
    
}

@java.lang.Override
public com.nutomic.syncthingandroid.syncthing.RestApi getApi() {
    return new com.nutomic.syncthingandroid.test.MockRestApi(this, null, null, null, null, null);
}

private void OnOddEvenWeekChecked(boolean isOdd) {
    updateCurrentDayReference();
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainFragment);
    if (f instanceof com.SFEDU.schedule_1.ScheduleEditRecordFragment) {
        return ;
    }
    showDayWeek(mCurrentDay);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    command &= 199;
    command |= progress << 3;
    sendCommand();
}

@org.chromium.base.VisibleForTesting
public static boolean getFirstRunFlowSignInComplete(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(org.chromium.chrome.browser.firstrun.FirstRunSignInProcessor.FIRST_RUN_FLOW_SIGNIN_COMPLETE, false);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    category = java.lang.String.valueOf(parent.getItemAtPosition(position));
}

@java.lang.Override
protected void onViewCreated(android.os.Bundle savedInstanceState) {
    title.setText("Right Drawer Title");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mMainPresenter = new com.saphir.test.dailynews.presenter.MainPresenterImpl(this);
    initUI();
    mMainPresenter.onCreate();
}

public void onClickDotsButton(final android.view.View view) {
    final android.content.Intent intent = new android.content.Intent(this, com.nervousfish.nervousfish.activities.SettingsActivity.class);
    this.startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (igcFile != null) {
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.shollmann.igcparser.events.FileClickEvent(new java.io.File(igcFile.getFilePath())));
    }
}

@java.lang.Override
public void setAdBreakTimesMs(@android.support.annotation.Nullable
long[] adBreakTimesMs, int adBreakCount) {
    com.google.android.exoplayer2.util.Assertions.checkArgument(((adBreakCount == 0) || (adBreakTimesMs != null)));
    this.adBreakCount = adBreakCount;
    this.adBreakTimesMs = adBreakTimesMs;
    update();
}

public android.app.AlertDialog getFullLogDialog() {
    return this.getDialog();
}

private void saveToSharedPrefs() {
    android.content.Intent output = new android.content.Intent();
    setResult(com.bridgeconn.autographago.ui.activities.RESULT_OK, output);
    finish();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((rootView) == null)
        rootView = inflater.inflate(R.layout.media_list_view, container, false);
    
    tracks = new java.util.ArrayList<>();
    return rootView;
}

@java.lang.Override
public void onMessage(android.content.Context context, android.content.Intent intent) {
    super.onMessage(context, intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    getItem(position).changeMe(updateItem(cop, bought, cooling));
}

public void fireNoDataAlarm(android.view.View view) {
    android.content.Intent alarmIntent = new android.content.Intent(this, com.philoertel.sfjuryduty.NoDataAlarmReceiver.class);
    alarmIntent.putExtra(NoDataAlarmReceiver.EXTRA_DATE, org.joda.time.DateTime.now());
    sendBroadcast(alarmIntent);
}

@java.lang.Override
protected void convert(com.chad.library.adapter.base.BaseViewHolder baseViewHolder, com.scnu.nita22.androidrss.weekly.WeeklyData weeklyData) {
    baseViewHolder.setText(R.id.weekly_title, weeklyData.getTitle());
    baseViewHolder.setText(R.id.weekly_date, weeklyData.getPublishTime());
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    response(result);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    mWaveformView.setIsBookmarking(false);
    mPlayer.stop();
    togglePlayButton();
    return ;
}

private static void clearNotifications(android.content.Context context) {
    android.app.NotificationManager manager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    manager.cancelAll();
}

public static void showShortSnackBar(android.view.View parentView, java.lang.String message) {
    android.support.design.widget.Snackbar.make(parentView, message, Snackbar.LENGTH_SHORT).show();
}

@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
}

public void resume() {
    org.lasarobotics.vision.android.Sensors.activated = true;
    mSensorManager.registerListener(this, mAccelerometer, org.lasarobotics.vision.android.Sensors.READ_SPEED);
    mSensorManager.registerListener(this, mMagneticField, org.lasarobotics.vision.android.Sensors.READ_SPEED);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mList.size()) > 0) {
        ((com.xlythe.spotifysteamer.MainActivity) (getActivity())).addFragmentPlayer(mList, 0);
    }
}

public void onAccelerationChanged(float p_x, float p_y, float p_z, double p_timestamp) {
    com.runrev.android.Engine.doAccelerationChanged(p_x, p_y, p_z, p_timestamp);
    if (m_wake_on_event)
        com.runrev.android.Engine.doProcess(false);
    
}

protected boolean onCaughtException(int request_code, android.app.mvp.MvpException error) {
    return android.app.mvp.MvpHandler.caughtException(request_code, error);
}

@java.lang.Override
public void run() {
    android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
    try {
        mSessions = com.androsz.electricsleepbeta.db.SleepSessions.getStartAndEndTimesFromCursor(this, data);
        eventsChanged((-1));
    } catch (java.lang.IllegalStateException ex) {
    } catch (android.database.StaleDataException ex) {
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.ComponentName comp = new android.content.ComponentName(context.getPackageName(), com.quickblox.sample.chat.pushnotifications.GCMIntentService.class.getName());
    startWakefulService(context, intent.setComponent(comp));
}

private boolean filtLocation(com.chinaway.android.library.locationtracker.sampler.SampleLocation location) {
    boolean isTooClose = isTooClose(mLocation, location);
    if (!isTooClose) {
        mLocation = location;
    }
    return isTooClose;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(accent_flag)) {
        com.example.cesarsk.say_it.MainActivity.tts.setVoice(com.example.cesarsk.say_it.MainActivity.voice_british_female);
        accent_flag = !(accent_flag);
    }else {
        com.example.cesarsk.say_it.MainActivity.tts.setVoice(com.example.cesarsk.say_it.MainActivity.voice_american_female);
        accent_flag = !(accent_flag);
    }
}

@java.lang.Override
public void onFailure(com.hanvon.rc.md.camera.HttpException e, java.lang.String s) {
    android.util.Log.i(com.hanvon.rc.md.camera.UploadImage.TAG, ("===onFailure=====" + s));
    android.os.Message msg = new android.os.Message();
    msg.what = com.hanvon.rc.utils.InfoMsg.FILE_RECO_FAIL;
    msg.obj = s;
    com.hanvon.rc.md.camera.UploadImage.handler.sendMessage(msg);
}

@java.lang.Override
public boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item) {
    return mCallback.onAction(item.getItemId(), mPendingItems);
}

void onItemClick(int position, android.view.View view);

public static int getAppContentHeight(android.app.Activity paramActivity) {
    return ((unique.fancysherry.pigeons.util.system.ScreenUtils.getScreenHeight()) - (unique.fancysherry.pigeons.util.system.ScreenUtils.getStatusBarHeight())) - (unique.fancysherry.pigeons.util.system.ScreenUtils.getKeyboardHeight(paramActivity));
}

@java.lang.Override
public void onClick(android.view.View view) {
    expandTile(view);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.app.NotificationManager nManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    nManager.cancel(1);
    me.johannesnz.smsim.Main.sendMessage("DC");
    me.johannesnz.smsim.Main.sender.detachDuplexOutputChannel();
}

public void onClick(android.content.DialogInterface dialog, int buttonId) {
    item.setIcon(R.drawable.ic_no_anotado);
    carrera.setAnotado(false);
    carrera.setTiempo(0L);
    actualizarUsuarioCarrera(carrera, EstadoCarrera.NO_ANOTADO);
}

private void onSucces(java.io.File response) throws java.io.IOException {
    android.util.Log.d("Download", "Download succeeded");
    for (org.bottiger.podcast.service.Downloader.engines.Callback callback : mExternalCallback) {
        callback.downloadCompleted(mEpisode);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    startAutotune();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    thrOutListToCheckMenu(position);
}

@java.lang.Override
public void onLoadMore(int page, int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    loadNextDataFilteredSearch(page, view);
}

private void assignIndexForFields(java.util.List<org.unicef.rapidreg.forms.childcase.CaseField> fields, int index) {
    for (org.unicef.rapidreg.forms.childcase.CaseField field : fields) {
        field.setIndex(index);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
}

public static void viewBlogStats(android.content.Context context, org.wordpress.android.fluxc.model.SiteModel site) {
    android.content.Intent intent = new android.content.Intent(context, org.wordpress.android.ui.stats.StatsActivity.class);
    intent.putExtra(WordPress.SITE, site);
    context.startActivity(intent);
}

private android.database.Cursor checkFavorite() {
    com.example.nizamudeenms.myflikz.MovieDbHelper movieDbHelper = new com.example.nizamudeenms.myflikz.MovieDbHelper(this);
    mMovieDb = movieDbHelper.getReadableDatabase();
    android.database.Cursor cFavoriteMovies = getFavoriteMovies();
    return cFavoriteMovies;
}

public void frTest() {
    fr = 37000;
}

public void startActivity(final android.content.Context context, android.content.Intent intent) {
    captureScreen(context);
    context.startActivity(intent);
}

protected void addTaskItem(android.content.Intent intent) {
    if (intent != null) {
        java.util.ArrayList<com.bbbbiu.biu.gui.transfer.FileItem> fileItems = intent.getParcelableArrayListExtra(com.bbbbiu.biu.gui.transfer.TransferBaseActivity.EXTRA_FILE_ITEM);
        if (fileItems != null) {
            mTransferAdapter.addItem(fileItems);
            onAddTaskItem(fileItems);
        }
    }
}

public static void showLoading(android.support.v4.app.FragmentActivity activity, java.lang.String label) {
    com.liangmayong.loading.Loading.showLoading(activity, label, (-1), (-1), 0.0F);
}

public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    getSupportActionBar().setTitle(user.getDisplayName());
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    fetchLocationService = new com.intrepid.miniproject.madslacker.FetchLocationService(this, googleApiClient);
    android.content.Intent fetchLocationIntent = new android.content.Intent();
    fetchLocationService.onHandleIntent(fetchLocationIntent);
}

@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    if ((count) == (-1)) {
        canvas.restore();
    }else {
        canvas.restoreToCount(count);
    }
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
}

@java.lang.Override
public void onLoadMore(int page, int totalItemsCount) {
    try {
        getMovies(page);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String msg, java.lang.Throwable t) {
    logger.print(level, t, msg);
}

@java.lang.Override
public void onClick(android.view.View view) {
    (mCurrentIndex)--;
    if ((mCurrentIndex) < 0) {
        mCurrentIndex = 0;
    }
    updateQuestion();
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
}

@java.lang.Override
public void onCompleted(java.lang.Exception e, android.widget.ImageView result) {
    holder.gifChatView.setTag(ink.adapters.ChatAdapter.LOADED);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.view_drawer_search_filters_keyword_edittext)) {
        keywordEditText.setText("");
    }
}

