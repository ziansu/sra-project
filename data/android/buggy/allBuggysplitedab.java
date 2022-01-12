@java.lang.Override
public long onGetSize() throws android.system.ErrnoException {
    android.system.StructStat stat = null;
    try {
        stat = mFile.fstat();
        return stat.st_size;
    } catch (java.io.IOException e) {
        android.util.Log.e(com.google.android.sambadocumentsprovider.provider.SambaProxyFileCallback.TAG, "Failed to get size for file");
    }
    return 0;
}

public int findUnusedId(android.view.View view) {
    while ((view.getRootView().findViewById((++(fID)))) != null);
    return fID;
}

@java.lang.Override
public void onSuccess(com.quickblox.users.model.QBUser qbUser, android.os.Bundle bundle) {
    regSF();
    loginQB();
}

@java.lang.Override
public void onBindViewHolder(com.ngynstvn.android.blocspot.ui.adapter.CategoryAdapter.CategoryAdapterViewHolder holder, int position) {
    holder.updateViewHolder(com.ngynstvn.android.blocspot.BlocspotApplication.getSharedDataSource().getCategoryList().get(position));
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    ((android.widget.TextView) (parent.getChildAt(0))).setTextSize(10);
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String buttonClickMessage = "Clicked button 1 at position " + position;
    android.util.Log.v(LOG_TAG, buttonClickMessage);
    recyclerViewButtonClickListener.onButton1Click(holder.mImageView.getId(), position);
}

@java.lang.Override
public void onExperimentError() {
    android.util.Log.i(GlassConfig.TAG, "Experiment callbacks. On error");
    super.isExperimentRunning.set(false);
    super.isExperimentRunning.set(false);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mQqzoneBtn.setChecked(isChecked);
    mQqzoneBtn.setBackgroundResource((isChecked ? R.drawable.btn_share_qzone : R.drawable.btn_share_qzone_unselected));
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    loadAllValues();
    mFilterCalender.set(java.util.Calendar.DAY_OF_MONTH, ((mFilterCalender.get(java.util.Calendar.DAY_OF_MONTH)) + 3));
}

public void start() {
    tm = ((android.telephony.TelephonyManager) (ctx.getSystemService(Context.TELEPHONY_SERVICE)));
    tm.listen(callStateListener, PhoneStateListener.LISTEN_CALL_STATE);
    android.content.IntentFilter intentFilter = new android.content.IntentFilter(android.content.Intent.ACTION_NEW_OUTGOING_CALL);
    ctx.registerReceiver(outgoingReceiver, intentFilter);
}

protected void questionFinish(android.view.View view) {
    gameHandler.postDelayed(endQuestionTimer, (5 * 1000));
}

public void enable() {
    android.util.Log.d("Reverb", "Enabled Reverb effect");
    if ((effect) != null) {
        effect.setEnabled(true);
    }
    isActive = true;
}

public void onClick(android.view.View v) {
    onCtrlClick(urlCtrlLock, true, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    postNewReviewIv.setVisibility(View.VISIBLE);
    activityTitle.setOnClickListener(activityTitleListenerHide);
}

@java.lang.Override
public void onStartSigning() {
    android.widget.Toast.makeText(this, "正在输入", Toast.LENGTH_SHORT).show();
}

public void share(android.view.View button) {
    if (!(facebook.isSessionValid())) {
        loginAndPostToWall();
        finish();
    }else {
        postToWall(messageToPost, Name);
    }
}

java.util.List<com.android.vending.billing.Purchase> getAllPurchases() {
    return new java.util.ArrayList<com.android.vending.billing.Purchase>(mPurchaseMap.values());
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    mRealmInstance = io.realm.Realm.getDefaultInstance();
}

public void deleteDataFromDB() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(database.DatabaseHandler.TABLE_CHILD, null, null);
    db.delete(database.DatabaseHandler.TABLE_SESSIONS, null, null);
    db.close();
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.barterbayucsb.barterbay.MyOffersActivity.currentOffer = com.barterbayucsb.barterbay.MyOffersActivity.LocalOffers.get((3 + (7 * ((page) - 1))));
    android.content.Intent intent = new android.content.Intent(this, com.barterbayucsb.barterbay.ViewMyPost.class);
    startActivity(intent);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initPlayBackView();
    initFun();
    start();
}

private void getBitRate() {
    handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        public void run() {
            bitRate();
            handler.postDelayed(this, 2000);
        }
    }, 1);
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("AMP", "ondestroy timetrial");
    announcementHandler.shutDown();
    vibrationHandler.stopVibrate();
    announcementHandler = null;
    vibrationHandler = null;
    gameHandler = null;
    prefs = null;
}

@java.lang.Override
public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
    if (((isVideoAd()) && (wasPlayingMusic)) && (!(shutdownAfter))) {
        com.frostwire.android.offers.AppLovinInterstitialAdapter.LOG.info("adDisplayed(): wasPlaying and not shutting down, resuming player playback");
        com.andrew.apollo.utils.MusicUtils.play();
    }
}

public static void print(com.noveogroup.android.log.Logger.Level level, java.lang.String message, java.lang.Throwable throwable) {
    com.noveogroup.android.log.LoggerManager.getLogger().print(level, message, throwable);
}

public void onClick(android.content.DialogInterface dialog, int whichIn) {
    openDatabase(files[which], true);
}

private void updateTotalUserInterface() {
    calculateScreenConfiguration();
    updateWindowParams();
    updateLayoutParams();
    if ((mOrientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        if (isAttachedToWindow()) {
            hide();
        }
    }
}

protected void selectLastSelectedTab() {
    if ((selectedTabPosition) >= 0) {
        android.support.design.widget.TabLayout.Tab selectedTab = tabLayout.getTabAt(selectedTabPosition);
        selectedTab.select();
    }
}

public void onClick(android.content.DialogInterface dialogBox, int id) {
    validateDeposit(depositView);
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    loading = android.app.ProgressDialog.show(this, "Fetching...", "Wait...", false, false);
}

@java.lang.Override
public void onRefresh() {
    android.widget.Toast.makeText(activity, "refreshed!", Toast.LENGTH_SHORT).show();
    refreshPingList();
}

private void setState(android.content.SharedPreferences prefs, com.apptentive.android.sdk.RatingModule.RatingState state) {
    prefs.edit().putString(Constants.PREF_KEY_RATING_STATE, state.name()).commit();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v("CLICK", "clickclickclick");
    sortByLocation();
    mAdapter.notifyDataSetChanged();
}

protected void restartPreview() {
    android.os.Message restartMessage = android.os.Message.obtain();
    restartMessage.what = R.id.restart_preview;
    handler.handleMessage(restartMessage);
}

@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    mc2.tvz.croatiago.activities.DetailActivity.startDetailsActivity(getActivity(), sublist, position);
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i1) {
    android.util.Log.v("MUSIC PLAYER", "Playback Error");
    mediaPlayer.reset();
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            save(dialog, false);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            if (!(editing))
                transmissionTab.addNew(null);
            
            break;
    }
}

public android.graphics.Bitmap getPhotoBitmap(android.content.ContentResolver contentResolver, java.lang.String photoUri) throws java.io.IOException {
    android.graphics.Bitmap photo = MediaStore.Images.Media.getBitmap(contentResolver, android.net.Uri.parse(photoUri));
    return photo;
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, com.expenx.expenx.activity.ExpenxActivity.class));
    LoginActivity.isExpenxActivityLaunched = true;
    this.finish();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences);
    de.danoeh.antennapod.activity.PreferenceActivity.instance.preferenceController.onCreate();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), ms_br.appriuso.ItemActivity.class);
    startActivity(i);
    finish();
    markerTemp.remove();
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.System.out.println("Value changed");
    aparato.setNetid(etNetID.getText().toString());
}

@org.junit.Test
public void configurePlayer() {
    com.psu.capstonew17.backend.api.VideoManager manager = com.psu.capstonew17.backend.data.ExternalVideoManager.getInstance(context);
    com.psu.capstonew17.backend.api.Video video = new com.psu.capstonew17.backend.api.stubs.VideoStub();
    android.media.MediaPlayer player = new android.media.MediaPlayer();
    video.configurePlayer(player);
}

@java.lang.Override
public void reloadData() {
    android.util.Log.d(com.flingsoftware.personalbudget.app.budgets.BudgetDetailsData.TAG, "Fragment Data reload data");
    new com.flingsoftware.personalbudget.app.budgets.BudgetDetailsData.GetBudgetDetailsTask().execute(budget.getId());
}

public void addSection(java.lang.String name, int iconId, java.util.List<java.lang.String> children) {
    mSections.add(new com.google.android.sambadocumentsprovider.browsing.BrowsingAdapter.Section(name, iconId, children));
    notifyDataSetChanged();
}

public void decimal(android.view.View v) {
    if (lastPress.equals("=")) {
        clearAll();
        lastPress = "";
    }
    Display.append(".");
    btnDot.setEnabled(false);
}

@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    super.setPrimaryItem(container, position, object);
    com.example.xyzreader.ui.ArticleDetailFragment fragment = ((com.example.xyzreader.ui.ArticleDetailFragment) (object));
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        commentPresenter.validateComment(v.getText().toString());
    }
    return false;
}

@java.lang.Override
public void onError(java.lang.String error) {
    android.widget.Toast.makeText(getActivity(), error, Toast.LENGTH_LONG).show();
    pDialog.hide();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.i(Constants.LOG_TAG, semester);
    save_and_refresh(view);
}

public final android.view.View getView() {
    if ((textureView) == null) {
    }
    return aspectRatioFrameLayout;
}

public android.view.View getView() {
    return (mNativePage) != null ? mNativePage.getView() : mContentViewParent;
}

@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    android.util.Log.wtf("searchView", "onQueryTextChange");
    return false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_course);
    com.idgi.event.ApplicationBus.register(this);
    java.lang.String courseName = com.idgi.session.SessionData.getCurrentCourse().getName();
    initializeWithTitle(courseName);
    setupViewPager();
}

public void addMedicine() {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(Constants.IS_INIT, isInit);
    startActivity(intent.setClass(this, com.umb.cs682.projectlupus.activities.medicineAlert.AddMedicine.class));
}

private void initContentId(final net.gini.android.vision.internal.camera.photo.ExifReader exifReader, final java.lang.String userComment) {
    mContentId = exifReader.getValueForKeyFromUserComment(Exif.USER_COMMENT_CONTENT_ID, userComment);
    if ((mContentId) == null) {
        mContentId = generateUUID();
    }
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, "onStart ");
    mGoogleApiClient.connect();
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        player.stop();
        player.release();
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(this, "Didnt stop", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onCreate() {
    android.util.Log.i("TimerService", "onCreate called");
    super.onCreate();
    handler.removeCallbacks(sendUpdatesToUI);
}

@java.lang.Override
public void onLoading() {
    android.util.Log.d("onLoading", ("category:" + (category)));
    swipeRefresh.setRefreshing(true);
}

public static void confApi(android.content.Context context) {
    if (com.subang.api.SubangAPI.isConfed()) {
        return ;
    }
    com.subang.worker.util.AppUtil.conf(context);
    com.subang.api.SubangAPI.conf(WebConst.WORKER, AppConf.cellnum, AppConf.password, AppConf.basePath);
}

public void increaseBeerCount(android.view.View v) {
    (mBeerCount)++;
    mTotalBeersTextView.setText(getString(R.string.beers_had, mBeerCount));
    updateBAC();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gameView = new abyssproductions.double0driver.GameEngine.GameSurfaceView(this);
    this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
    setContentView(gameView);
    super.onDestroy();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dashboard);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    bindListeners();
    findReferencesToDisplayControls();
}

private void enter(dot.dominionofcity.Message message) {
    android.util.Log.v(dot.dominionofcity.Chatroom.TAG, ("Out-> " + message));
    sender.enter(message);
}

@android.support.annotation.Nullable
@java.lang.Override
public edu.gatech.ledpathways.ledpathways.objects.Employee getItem(int position) {
    if ((mListFiltered.size()) > 0) {
        return mListFiltered.get(position);
    }
    return super.getItem(position);
}

@java.lang.Override
public void onResume() {
    android.util.Log.i("PlayListView", "onResume called");
    super.onResume();
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.localytics.android.itracker.ui.PhotoFragment.REQUEST_TAKE_PHOTO)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        galleryAddPhoto();
        reloadPhotosWithRequiredPermission();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    nu.yona.app.ui.YonaActivity.getActivity().showKeyboard(passcode);
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.mobilesolutionworks.android.app.ActivityControllerHost.MSG_REALLY_STOPPED :
            if (mStopped) {
                doReallyStop(false);
            }
            break;
        default :
            super.handleMessage(msg);
    }
}

@java.lang.Override
public void print(com.noveogroup.android.log.Level level, java.lang.String message, java.lang.Throwable throwable) {
    if ((handler) != null) {
        handler.print(getName(), level, throwable, message);
    }
}

private void removeNotification() {
    android.app.NotificationManager nMgr = ((android.app.NotificationManager) (getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE)));
    nMgr.cancel(Constants.NOTIFICATION_ID.FOREGROUND_SERVICE);
}

@android.support.annotation.NonNull
public static com.solera.defrag.TraversalAnimation newInstance(@android.support.annotation.NonNull
android.animation.Animator animator, @com.solera.defrag.TraversalAnimation.AnimateInDrawOrder
int drawOrder) {
    return new com.solera.defrag.AutoValue_TraversalAnimation(animator, drawOrder);
}

protected void startLocationUpdates() {
    com.google.android.gms.location.LocationServices.FusedLocationApi.requestLocationUpdates(gapiClient, locationRequest, this);
    android.widget.Toast.makeText(this, "startLocationUpdates", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected android.content.Intent createIntent(android.content.Context context) {
    return new android.content.Intent(context, org.gem.indo.dooit.views.settings.SettingsActivity.class);
}

private void subscribeToPushService() {
    com.google.firebase.messaging.FirebaseMessaging.getInstance().subscribeToTopic("Test");
    android.util.Log.d("AndroidBash", "Subscribed");
    java.lang.String token = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d("AndroidBash", token);
}

public static void test_031() {
    excute(testcase.Object_ResIdText, testcase.Operation_ClickWait, "com.android.music:id/albumtab", "专辑");
    excute(testcase.Object_ResIdInstance, testcase.Operation_ClickWait, "com.android.music:id/line1", "0");
    check(testcase.Object_TextScroll, testcase.Operation_checkExist, "Test");
    check(testcase.Object_TextScroll, testcase.Operation_checkExist, "Test1");
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.xunce.electrombile.database.MyDatabaseHelper.CREATE_DATETRACK);
    db.execSQL(com.xunce.electrombile.database.MyDatabaseHelper.CREATE_DATETRACKSECOND);
    android.widget.Toast.makeText(mContext, "created succeeded", Toast.LENGTH_SHORT).show();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    saveData();
    scheduleNotifications();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.ast.blocksave.DashboardActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (saveImagesInLocalDataStore()) {
    }else {
    }
    finish();
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (!(android.text.TextUtils.isEmpty(editable.toString()))) {
        com.openthos.appstore.MainActivity.mHandler.sendMessage(com.openthos.appstore.MainActivity.mHandler.obtainMessage(Constants.SEARCH_FRAGMENT, editable.toString()));
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent service = new android.content.Intent(context, it.android.unishare.BackgroundService.class);
    context.startService(service);
}

@java.lang.Override
public void bookmarkSelected(int position) {
    com.duckduckgo.mobile.android.duckduckgo.ui.bookmarks.BookmarkModel bookmarkModel = bookmarks.get(position);
    if (isEditing) {
        bookmarksView.showEditBookmark(bookmarkModel);
    }else {
        bookmarksView.resultOpenBookmark(bookmarkModel);
    }
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    if ((mMap) != null)
        mMap.clear();
    
    drawOwnLocation();
    drawPolylines();
    drawStations();
}

@java.lang.Override
public java.util.List<de.fau.amos.virtualledger.android.model.Contact> getAll() {
    return new java.util.LinkedList(this.allContacts);
}

public void onLocationChanged(android.location.Location location) {
    drawMap(location, map, finalCoord, locationManager, this);
}

@java.lang.Override
public void onReceive(android.content.Context arg0, android.content.Intent arg1) {
    smsServiceListener.OnSmsSent(sms, getResultCode());
}

@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    com.github.mikephil.charting.listener.OnChartGestureListener l = mChart.getOnChartGestureListener();
    if (l != null) {
        l.onChartSingleTapped(e);
    }
    performHighlight(e);
    return super.onSingleTapUp(e);
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    android.widget.Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    super.onPostExecute(s);
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int pos, long id) {
    showEntryDeleteDialog(((vocabletrainer.heinecke.aron.vocabletrainer.lib.Storage.Entry) (adapter.getItem(pos))), (pos - 1));
    return true;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            listener.onInputDone(new java.lang.String("男"));
            break;
        case 1 :
            listener.onInputDone(new java.lang.String("女"));
            break;
    }
}

private java.lang.String getLastDistro() {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    return null;
}

public void setItems(final it.sephiroth.android.library.bottomnavigation.BottomNavigationItem[] items) {
    this.items = items;
    this.shifting = (null != items) && ((items.length) > 3);
}

@java.lang.Override
public java.util.List<co.fddittmar.planbuilder.data.model.Program> getAllPrograms() {
    if ((repository) == null)
        android.util.Log.d("DEBUG", "Null repository");
    
    return repository.fetchAllPrograms();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    handleNewLocation(location);
    android.util.Log.d(com.agusgarcia.geonotes.MapFragment.TAG, ("onLocationChanged" + (mLastLocation.toString())));
}

private void startScreenshots() {
    android.content.Intent intent = new android.content.Intent(this, csci435.csci435_odbr.SnapshotIntentService.class);
    int index = csci435.csci435_odbr.BugReport.getInstance().numEvents();
    intent.putExtra("index", index);
    startService(intent);
}

@java.lang.Override
public void onKeyboardOpen(final int keyBoardHeight) {
    android.util.Log.d("MainActivity", "Opened soft keyboard");
}

@android.support.annotation.Nullable
@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    return new ch.dissem.apps.abit.service.ProofOfWorkService.PowBinder(ch.dissem.apps.abit.service.ProofOfWorkService.engine, this);
}

private void debug(int number) {
    android.widget.Toast.makeText(this, (("Test point " + number) + " ..."), Toast.LENGTH_SHORT).show();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    getActivity().finish();
}

