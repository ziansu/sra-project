@java.lang.SuppressWarnings(value = "unused")
public void onRouteUnselected(android.support.v7.media.MediaRouter router, int type, android.support.v7.media.MediaRouter.RouteInfo route) {
    updatePresentation();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.widget.Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
    return START_STICKY;
}

public static void initialize(android.content.Context c) {
    com.adsamcik.signalcollector.Extensions.telephonyManager = ((android.telephony.TelephonyManager) (c.getSystemService(Context.TELEPHONY_SERVICE)));
    com.adsamcik.signalcollector.Extensions.connectivityManager = ((android.net.ConnectivityManager) (c.getSystemService(Context.CONNECTIVITY_SERVICE)));
    context = c;
}

@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.d("woo", "data change");
    edu.rosehulman.punttj.rosebuckets.model.SubItem item = dataSnapshot.getValue(edu.rosehulman.punttj.rosebuckets.model.SubItem.class);
    onSubItemSelected(item);
}

public static int get(final java.lang.String key) {
    if (!(com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.containsKey(key)))
        android.util.Log.e("WeaponImageMap", key);
    
    return com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.containsKey(key) ? com.ninetwozero.bf4intel.resources.maps.weapons.WeaponImageMap.map.get(key) : R.drawable.acc_none;
}

public void onMediaScannerConnected() {
    android.util.Log.v("onMediaScannerConnected", "the execution made it here...");
}

@java.lang.Override
public android.support.v4.util.Pair<java.lang.Integer, java.lang.Integer> call(java.lang.Integer completed, java.lang.Integer active) {
    return android.support.v4.util.Pair.create(completed, active);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    track = trackUtil.getLastTrack();
    io.github.data4all.logger.Log.d(io.github.data4all.service.GPSservice.TAG, "onStartCommand");
    return START_STICKY;
}

public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    int width = plot.getWidth();
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    doCallCropActivity(uri, dispSize, wpWidth, wpHeight);
}

@java.lang.Override
public void onAnimationRepeat(android.animation.Animator animator) {
    if (repeated) {
        current_instance.setText(com.example.cesarsk.say_it.Utility.getRandomWord(((android.app.Activity) (current_instance.getContext()))));
    }
    repeated = !(repeated);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent Carnetintent = new android.content.Intent(this, fr.diabhelp.diabhelp.Core.CoreActivity.class);
    this.startActivity(Carnetintent);
    this.finish();
}

public void clearPager() {
    android.util.Log.d("* SearchResultFrag *", "clearPager");
    mViewPager.setAdapter(null);
    mViewPager.removeAllViews();
}

@java.lang.Override
protected com.shadark.android.react.amaps.mapview.AMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    android.util.Log.d(com.shadark.android.react.amaps.mapview.AMapManager.TAG, "AMapView");
    com.amap.api.maps.AMapOptions options = new com.amap.api.maps.AMapOptions();
    options.zoomControlsEnabled(false);
    return new com.shadark.android.react.amaps.mapview.AMapView(reactContext, mAppContext, this, options);
}

@java.lang.Override
protected void getSaveInstanceState(android.os.Bundle savedInstanceState) {
    onViewStateRestored(savedInstanceState);
}

public static android.graphics.Bitmap getEmptyBitmap() {
    if ((com.androidquery.callback.BitmapAjaxCallback.empty) == null) {
        com.androidquery.callback.BitmapAjaxCallback.empty = android.graphics.Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    }
    return com.androidquery.callback.BitmapAjaxCallback.empty;
}

private static synchronized void stopVibrate() {
    android.util.Log.d(org.catrobat.catroid.utils.VibratorUtil.TAG, "stopVibrate()");
    org.catrobat.catroid.utils.VibratorUtil.vibrator.cancel();
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    if (preference == (this)) {
        android.util.Log.d(de.grau.organizer.settings.DeleteCategoriePreference.DEBUG_TAG, "Clicked deleteDialog");
        setValues();
    }
    return true;
}

public void execute(final org.wordpress.android.ui.accounts.helpers.FetchBlogListAbstract.Callback callback) {
    mCallback = callback;
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            fetchBlogList(callback);
        }
    }.start();
}

@org.junit.Test
public void startActivityWithDefaultIntentAndDefaultCategoryWithOptionalArgs() {
    io.appium.java_client.android.IntentTest.driver.startActivity("com.prgguru.android", ".GreetingActivity", "android.intent.action.MAIN", "android.intent.category.DEFAULT", "0x4000000", "--es \"USERNAME\" \"AppiumIntentTest\" -t \"text/plain\"");
    org.junit.Assert.assertEquals(io.appium.java_client.android.IntentTest.driver.findElementById("com.prgguru.android:id/textView1").getText(), "Welcome AppiumIntentTest");
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    listener.onAnimationRepeat(null);
}

public void signinOnClick(android.view.View v1) {
    android.content.Intent myIntent = new android.content.Intent(this, com.example.parthdoshi.articleshub.SignupPage.class);
    this.startActivity(myIntent);
    finish();
}

private void selectItem(int position) {
    switch (position) {
        case 0 :
            {
                android.content.Intent intent = new android.content.Intent(activity, com.columbasms.columbasms.activity.UserProfileActivity.class);
                startActivity(intent);
                break;
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
    newCamera();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    inflater.inflate(R.layout.article_fragment_layout, container);
    return super.onCreateView(inflater, container, savedInstanceState);
}

@butterknife.OnEditorAction
boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        return true;
    }
    return false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.Intent musicIntent = new android.content.Intent(this, com.example.jimmyle.pacmanandroid.BackgroundMusicService.class);
    startService(musicIntent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    spUtil.saveGpsInterval(values[i]);
    dialogInterface.dismiss();
    tvGpsInterval.setText(((items[i]) + " ms"));
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
java.lang.String sortDir);

public void setReminders(io.realm.RealmList<com.habitrpg.android.habitica.models.tasks.RemindersItem> reminders) {
    for (com.habitrpg.android.habitica.models.tasks.RemindersItem reminder : reminders) {
        reminder.setTask(this);
    }
    this.reminders = reminders;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviedroidPropertyReader = com.cloudskol.moviedroid.common.MoviedroidPropertyReader.getInstance(getActivity());
    moviedroidUriBuilder = new com.cloudskol.moviedroid.common.MoviedroidUriBuilder(moviedroidPropertyReader);
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onBackPressed() {
    finish();
    if ((wr) != null)
        wr.disconnect();
    
    android.os.Process.killProcess(android.os.Process.myPid());
    super.onBackPressed();
}

private void multipleimageClick() {
    android.util.Log.d(com.example.asus.travelamapdemo.view.activity.WriteNoteActivity.TAG, "multipleimageClick");
    multipleImage.setAddClickCallback(new com.goyourfly.multi_picture.MultiPictureView.AddClickCallback() {
        @java.lang.Override
        public void onAddClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            com.example.asus.travelamapdemo.util.MatisseUtil util = new com.example.asus.travelamapdemo.util.MatisseUtil(com.example.asus.travelamapdemo.view.activity.WriteNoteActivity.this);
        }
    });
}

public void refreshTaskManagerView() {
    if (DEBUG)
        android.util.Log.e(TAG, "refreshTaskManagerView");
    
    setTaskManagerTitle();
    loadRunningTasks();
    refreshMemoryUsagePanel();
    inflateTaskListView();
}

@java.lang.Override
public void onClick(android.view.View v) {
    hidePopupMenuForMarker();
    listener.onDeleteGeofence(model);
}

@java.lang.Override
public void onClick(android.view.View v2) {
    ((me.ccrama.redditslide.Activities.AlbumPager) (getActivity())).doImageSave(false, url);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(mContext, "Clicked button Edit", Toast.LENGTH_SHORT).show();
    asiantech.vn.main.MainActivity.showFragmentEditContact(new asiantech.vn.listcontact.ListContactClass(position, mListContacts));
}

@java.lang.Override
public com.twtstudio.bbs.bdpqchen.bbs.commons.base.BaseViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new com.twtstudio.bbs.bdpqchen.bbs.individual.message.MessageAdapter.MessageItemViewHolder(inflater.inflate(R.layout.item_rv_message, parent));
}

protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDataManager();
    initGui(savedInstanceState);
    checkIntent(getIntent());
    if (savedInstanceState == null) {
        showFragment(startFragmentMenuItemId, true);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null)
        onItemClickListener.onItemClick(v, content, getAdapterPosition());
    
}

@java.lang.Override
public com.nutomic.syncthingandroid.syncthing.RestApi getApi() {
    return new com.nutomic.syncthingandroid.test.MockRestApi(this, null, null, null);
}

private void OnOddEvenWeekChecked(boolean isOdd) {
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainFragment);
    if (f instanceof com.SFEDU.schedule_1.ScheduleEditRecordFragment) {
        return ;
    }
    updateCurrentDayReference();
    showDayWeek(mCurrentDay);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    command &= 199;
    command |= progress << 3;
    sendCommand();
    receiveAndUpdateStatus();
}

private static boolean getFirstRunFlowSignInComplete(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(org.chromium.chrome.browser.firstrun.FirstRunSignInProcessor.FIRST_RUN_FLOW_SIGNIN_COMPLETE, false);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    category = java.lang.String.valueOf(parent.getItemAtPosition(position));
    java.lang.System.out.println(category);
}

@java.lang.Override
protected void onViewCreated(android.os.Bundle savedInstanceState) {
    net.kibotu.android.materialmenu.ViewExtensions.setLayoutMargin(layout, 0, net.kibotu.android.materialmenu.ViewExtensions.getStatusBarHeight(), 0, 0);
    title.setText("Right Drawer Title");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mMainPresenter = new com.saphir.test.dailynews.presenter.MainPresenterImpl(this);
    initUI();
}

public void onClickDotsButton(final android.view.View view) {
    final android.content.Intent intent = new android.content.Intent(this, com.nervousfish.nervousfish.activities.SettingsActivity.class);
    intent.putExtra(ConstantKeywords.SERVICE_LOCATOR, this.serviceLocator);
    this.startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    org.greenrobot.eventbus.EventBus.getDefault().post(new com.shollmann.igcparser.events.FileClickEvent(new java.io.File(igcFile.getFilePath())));
}

@java.lang.Override
public void setAdBreakTimesMs(@android.support.annotation.Nullable
long[] adBreakTimesMs, int adBreakCount) {
    com.google.android.exoplayer2.util.Assertions.checkArgument(((adBreakCount == 0) || (adBreakTimesMs != null)));
    this.adBreakCount = adBreakCount;
    this.adBreakTimesMs = adBreakTimesMs;
}

public android.app.AlertDialog getFullLogDialog() {
    return this.getDialog(true);
}

private void saveToSharedPrefs() {
    android.content.Intent output = new android.content.Intent();
    output.putExtra(Constants.Keys.RECREATE_NEEDED, com.bridgeconn.autographago.ui.activities.SettingsActivity.recreateNeeded);
    setResult(com.bridgeconn.autographago.ui.activities.RESULT_OK, output);
    finish();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.media_list_view, container, false);
    tracks = new java.util.ArrayList<>();
    return rootView;
}

@java.lang.Override
public void onMessage(android.content.Context context, android.content.Intent intent) {
    super.onMessage(context, intent);
    android.util.Log.i(com.jiang.android.push.flyme.FlymeReceiver.TAG, "onMessage: ");
}

@java.lang.Override
public void onClick(android.view.View view) {
    getItem(position).changeMe(updateItem(cop, bought, perm, cooling));
    myFragment.getActivity().recreate();
}

public void fireNoDataAlarm(android.view.View v) {
    android.content.Intent alarmIntent = new android.content.Intent(this, com.philoertel.sfjuryduty.NoDataAlarmReceiver.class);
    alarmIntent.putExtra(NoDataAlarmReceiver.EXTRA_DATE, org.joda.time.DateTime.now());
    sendBroadcast(alarmIntent);
}

@java.lang.Override
protected void convert(com.chad.library.adapter.base.BaseViewHolder baseViewHolder, com.scnu.nita22.androidrss.weekly.WeeklyData weeklyData) {
    baseViewHolder.setText(R.id.weekly_title, weeklyData.getTitle());
    baseViewHolder.setText(R.id.weekly_date, ((weeklyData.getPublishTime()) + "发布"));
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    response(result);
    android.widget.Toast.makeText(getBaseContext(), "Data Sent!", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    mWaveformView.setIsBookmarking(false);
    mPlayer.stop();
    togglePlayButton();
    resetSelection();
    return ;
}

private static void clearNotifications() {
    android.app.NotificationManager manager = ((android.app.NotificationManager) (fforganizer.FFOrganizer.getInstance().getSystemService(Context.NOTIFICATION_SERVICE)));
    manager.cancelAll();
}

public static void showShortSnackBar(android.view.View parentView, java.lang.String message) {
    android.support.design.widget.Snackbar.make(parentView, message, Snackbar.LENGTH_SHORT);
}

@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    super.destroyItem(container, position, object);
}

public void resume() {
    if (org.lasarobotics.vision.android.Sensors.activated)
        return ;
    
    org.lasarobotics.vision.android.Sensors.activated = true;
    mSensorManager.registerListener(this, mAccelerometer, org.lasarobotics.vision.android.Sensors.READ_SPEED);
    mSensorManager.registerListener(this, mMagneticField, org.lasarobotics.vision.android.Sensors.READ_SPEED);
}

@java.lang.Override
public void onClick(android.view.View view) {
    ((com.xlythe.spotifysteamer.MainActivity) (getActivity())).addFragmentPlayer(mList, 0);
}

public void onAccelerationChanged(float p_x, float p_y, float p_z, float p_timestamp) {
    com.runrev.android.Engine.doAccelerationChanged(p_x, p_y, p_z, p_timestamp);
    if (m_wake_on_event)
        com.runrev.android.Engine.doProcess(false);
    
}

protected boolean onCaughtException(int request_code, android.app.mvp.MvpException error) {
    return android.app.mvp.MvpHandler.caughtException(error);
}

@java.lang.Override
public void run() {
    android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
    try {
        mSessions = com.androsz.electricsleepbeta.db.SleepSessions.getStartAndEndTimesFromCursor(this, data);
        eventsChanged();
    } catch (java.lang.IllegalStateException ex) {
    } catch (android.database.StaleDataException ex) {
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.ComponentName comp = new android.content.ComponentName(context.getPackageName(), com.quickblox.sample.chat.pushnotifications.GCMIntentService.class.getName());
    startWakefulService(context, intent.setComponent(comp));
    setResultCode(Activity.RESULT_OK);
}

private boolean filtLocation(com.chinaway.android.library.locationtracker.sampler.SampleLocation location) {
    boolean isTooClose = isTooClose(mLocation, location);
    mLocation = location;
    return isTooClose;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(accent_flag)) {
        com.example.cesarsk.say_it.MainActivity.tts.setVoice(com.example.cesarsk.say_it.MainActivity.voice_british_female);
        accent_flag = !(accent_flag);
    }else
        com.example.cesarsk.say_it.MainActivity.tts.setVoice(com.example.cesarsk.say_it.MainActivity.voice_american_female);
    
}

@java.lang.Override
public void onFailure(com.hanvon.rc.md.camera.HttpException e, java.lang.String s) {
    android.util.Log.i(com.hanvon.rc.md.camera.UploadImage.TAG, ("===onFailure=====" + s));
    android.os.Message msg = new android.os.Message();
    msg.what = com.hanvon.rc.utils.InfoMsg.FILE_RECO_FAIL;
    com.hanvon.rc.md.camera.UploadImage.handler.sendMessage(msg);
}

@java.lang.Override
public boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item) {
    boolean isProceed = mCallback.onAction(item.getItemId(), mPendingItems);
    if (isProceed) {
        mPendingItems.clear();
    }
    return isProceed;
}

public void onItemClick(int position, android.view.View v);

public static int getAppContentHeight(android.app.Activity paramActivity) {
    return (((unique.fancysherry.pigeons.util.system.ScreenUtils.getScreenHeight()) - (unique.fancysherry.pigeons.util.system.ScreenUtils.getStatusBarHeight())) - (unique.fancysherry.pigeons.util.system.ScreenUtils.getNavigationBarHeight())) - (unique.fancysherry.pigeons.util.system.ScreenUtils.getKeyboardHeight(paramActivity));
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(view, "Show history", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    expandTile(view);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.app.NotificationManager nManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    me.johannesnz.smsim.Main.sendMessage("DC");
    nManager.cancel(1);
    me.johannesnz.smsim.Main.sender.detachDuplexOutputChannel();
}

public void onClick(android.content.DialogInterface dialog, int buttonId) {
    item.setIcon(R.drawable.ic_no_anotado);
    carrera.setAnotado(false);
    carrera.setTiempo(0L);
    updateUsuarioCarrera();
    actualizarUsuarioCarrera(carrera, EstadoCarrera.NO_ANOTADO);
}

private void onSucces(java.io.File response) throws java.io.IOException {
    android.util.Log.d("Download", "Download succeeded");
    for (org.bottiger.podcast.service.Downloader.engines.Callback callback : mExternalCallback) {
        callback.downloadCompleted(mEpisode.getId());
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    startAutotune();
    autotuneButton.setAlpha(0);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.darly.dlclent.model.SecMenuModel model = ((com.darly.dlclent.model.SecMenuModel) (parent.getItemAtPosition(position)));
    thrOutListToCheckMenu(model, position);
}

@java.lang.Override
public void onLoadMore(int page, int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    if (!(filteredSearch)) {
        loadNextDataFromApi(searchQuery, page, view);
    }else {
        loadNextDataFilteredSearch(page, view);
    }
}

private void assignIndexForFields(java.util.List<org.unicef.rapidreg.forms.childcase.CaseField> fields, int index) {
    android.util.Log.i("sjyuan", ("assignIndexForFields index= " + index));
    for (org.unicef.rapidreg.forms.childcase.CaseField field : fields) {
        field.setIndex(index);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent launchCheckout = new android.content.Intent(getContext(), com.application.melanieh.kk.ui.CheckoutActivity.class);
    startActivity(launchCheckout);
}

public static void viewBlogStats(android.content.Context context, org.wordpress.android.fluxc.model.SiteModel site) {
    if (site == null)
        return ;
    
    android.content.Intent intent = new android.content.Intent(context, org.wordpress.android.ui.stats.StatsActivity.class);
    intent.putExtra(WordPress.SITE, site);
    context.startActivity(intent);
}

private void checkFavorite() {
    com.example.nizamudeenms.myflikz.MovieDbHelper movieDbHelper = new com.example.nizamudeenms.myflikz.MovieDbHelper(this);
    mMovieDb = movieDbHelper.getReadableDatabase();
    android.database.Cursor cFavoriteMovies = getFavoriteMovies();
}

public void frTest() {
    fr = 37000;
    if (ir.hasIrEmitter()) {
        android.hardware.ConsumerIrManager[] freqs = ir.getCarrierFrequencies();
        for (android.hardware.ConsumerIrManager.CarrierFrequencyRange range : freqs) {
            fr = range.getMaxFrequency();
        }
    }
}

public void startActivity(final android.content.Context context, android.content.Intent intent) {
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            captureScreen(context);
        }
    }.start();
    context.startActivity(intent);
}

private void addTaskItem(android.content.Intent intent) {
    if (intent != null) {
        java.util.ArrayList<com.bbbbiu.biu.gui.transfer.FileItem> fileItems = intent.getParcelableArrayListExtra(com.bbbbiu.biu.gui.transfer.TransferBaseActivity.EXTRA_FILE_ITEM);
        if (fileItems != null) {
            mTransferAdapter.addItem(fileItems);
            onAddTaskItem(fileItems);
        }
    }
}

public static void showLoading(android.support.v4.app.FragmentActivity activity, java.lang.String label) {
    com.liangmayong.loading.Loading.showLoading(activity, label, (-1), (-1));
}

public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    getSupportActionBar().setTitle(user.getDisplayName());
    invalidateOptionsMenu();
}

@java.lang.Override
public void onBackPressed() {
    setResult(com.kshitij.android.clickme.ui.RESULT_OK);
    super.onBackPressed();
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    startGeoFencing();
    fetchLocationService = new com.intrepid.miniproject.madslacker.FetchLocationService(this, googleApiClient);
    android.content.Intent fetchLocationIntent = new android.content.Intent();
    fetchLocationService.onHandleIntent(fetchLocationIntent);
}

@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    if ((count) != (-1)) {
        canvas.restore();
    }else {
        canvas.restoreToCount(count);
    }
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    android.widget.Toast.makeText(this, ((java.lang.CharSequence) (msg.toString())), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onLoadMore(int page, int totalItemsCount) {
    try {
        android.util.Log.d("PAGE", java.lang.Integer.toString(page));
        getMovies(page);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String msg, java.lang.Throwable t) {
    logger.print(level, msg, t);
}

@java.lang.Override
public void onClick(android.view.View view) {
    (mCurrentIndex)++;
    if ((mCurrentIndex) > 4) {
        mCurrentIndex = 0;
    }
    updateQuestion();
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    addSampleOnPlot(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
}

@java.lang.Override
public void onCompleted(java.lang.Exception e, android.widget.ImageView result) {
    holder.singleGifViewLoading.setVisibility(View.GONE);
    holder.gifChatView.setTag(ink.adapters.ChatAdapter.LOADED);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.view_drawer_search_filters_keyword_edittext));
    keywordEditText.setText("");
}

