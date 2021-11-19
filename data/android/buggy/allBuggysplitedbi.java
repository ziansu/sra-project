@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    android.widget.Toast.makeText(com.rohan.callnote.BaseCallNoteActivity.instance, ("Connection Failed " + (connectionResult.getErrorMessage())), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onCancelled(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo) {
    attach.hasUpload = false;
    cb.failed("上传失败");
}

public void checkBlacklist(java.lang.Integer storeID, java.lang.String storeToken, android.app.Activity activity) {
    this.activity = activity;
    appaloosa_store.com.appaloosa_android_tools.tools.services.blacklist.CheckBlacklistService.checkBlacklist(storeID, storeToken);
}

public void saveCookie(java.lang.String cookieStr) {
    android.content.SharedPreferences.Editor edit = perf.edit();
    edit.putString(com.coder4.amvt.agent.UserAgent.STORE_KEY_COOKIE, cookieStr);
    edit.apply();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.i(LOG_TAG, "onStart");
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    mDrawerLayout.closeDrawers();
    switch (item.getItemId()) {
        case R.id.action_notification_item :
            showNotificationTab();
    }
    return false;
}

private void plotNavigation(com.google.android.gms.maps.model.LatLng origin, com.google.android.gms.maps.model.LatLng destination) {
    com.prembros.artooproject.Directions directions = new com.prembros.artooproject.Directions(mMap);
    java.lang.String url = directions.getDirectionsUrl(origin, destination);
    directions.executeDownloadTask(url);
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mEventDay = dayOfMonth;
    mEventMonth = monthOfYear;
    mEventYear = year;
}

@android.webkit.JavascriptInterface
public void playEffectSound(final java.lang.String file, final java.lang.Float sound) {
    mMediaStorage.playEffectSound(file, sound);
}

private static com.o3dr.services.android.lib.drone.property.Type.Firmware getTypeFirmware(int droneType) {
    switch (droneType) {
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_COPTER :
            return com.o3dr.services.android.lib.drone.property.Type.Firmware.ARDU_COPTER;
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_PLANE :
            return com.o3dr.services.android.lib.drone.property.Type.Firmware.ARDU_PLANE;
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_ROVER :
            return com.o3dr.services.android.lib.drone.property.Type.Firmware.APM_ROVER;
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_SOLO :
            return com.o3dr.services.android.lib.drone.property.Type.Firmware.SOLO;
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_UNKNOWN :
        default :
            return null;
    }
}

public void enableBroadcastReceiver(android.view.View view) {
    android.content.ComponentName receiver = new android.content.ComponentName(this, app.easy.text.texteasy.Receiver.SmsReceiver.class);
    android.content.pm.PackageManager pm = this.getPackageManager();
    pm.setComponentEnabledSetting(receiver, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
}

private void markSavedSelectedItem(com.iolab.sightlocator.SightMarkerItem savedSelectedItem) {
    if (!(mCurrentSelectedItemsClustered.contains(savedSelectedItem))) {
        android.util.Log.d("MyLogs", "not clustered");
        addSelectedMarkerDelayed(savedSelectedItem, com.iolab.sightlocator.SelectedMarkerManager.ITEM_RETRIEVAL_DURATION);
    }
}

public void setView(android.content.Context ccd, int x, int y, android.graphics.Bitmap head) {
    this.head = head;
    this.x = x;
    this.y = y;
}

@java.lang.Override
public void run() {
    try {
        applyGlobalContent(true, view, activity);
        android.support.design.widget.Snackbar.make(view, "Updated!", Snackbar.LENGTH_SHORT).show();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    try {
        handleIntent(intent);
    } catch (com.qualicom.emvpaycard.EmvPayCardException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
protected void onPostCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    progressBarOnTop.setVisibility(View.VISIBLE);
    loadFeeds(tabLayout.getTabAt(0).getText().toString());
}

private void showActionBarIfNeeded() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if (((getActionBar()) != null) && (!(actionBar.isShowing()))) {
        getActionBar().show();
    }
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    Button_Takeoff.setSelected(true);
    set_selected_block(0, false);
    return false;
}

public void draw(android.graphics.Canvas canvas, android.graphics.Paint paint) {
    com.idonans.acommon.lang.CommonLog.d(((com.idonans.doodle.DoodleView.Render.CanvasBuffer.TAG) + " draw"));
    refreshBuffer(paint);
    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, paint);
}

@java.lang.Override
public void onClick(android.view.View v) {
    addFavorite(_station, _station.getName(), false);
    getListPagerAdapter().setupBTabStationARecap(_station);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    com.bfbstudio.routetracking.UI.MapsFragment fragmentMap = new com.bfbstudio.routetracking.UI.MapsFragment();
    getSupportFragmentManager().beginTransaction().add(R.id.Fragment_Map, fragmentMap).commit();
}

@java.lang.Override
public void protocolDidReceivePinCapability(int pin, int value) {
    android.util.Log.e(TAG, ((("protocolDidReceivePinCapability - pin: " + pin) + "\tvalue: ") + value));
}

public void clearToDoListInDB() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL(("delete from " + (ToDoListContract.ToDoList.TABLE_NAME)));
}

public abstract void create(android.view.View view);

@java.lang.Override
public com.kimeeo.library.listDataView.viewPager.TabIndicatorRecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = getView(parent);
    return getViewHolder(view);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0)
        return com.sam_chordas.android.stockhawk.ui.HistoricalListFragment.newInstance(mItems);
    
    return com.sam_chordas.android.stockhawk.ui.LineGraphFragment.newInstance(mItems);
}

@java.lang.Override
public void onAdOpened() {
    super.onAdOpened();
    showThksToast();
    com.crashlytics.android.answers.Answers.getInstance().logCustom(new com.crashlytics.android.answers.CustomEvent("Click on ads"));
}

private void changeFragment(android.support.v4.app.Fragment targetFragment) {
    resideMenu.clearIgnoredViewList();
    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, targetFragment, "fragment").setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
}

private void sendMail(java.lang.String newMail) {
    new samurai.geeft.android.geeft.database.BaaSMail(getView(), samurai.geeft.android.geeft.utilities.TagsValue.DEFAULT_EMAIL, samurai.geeft.android.geeft.utilities.TagsValue.DEFAULT_TAG, newMail, mCode).execute();
}

@android.webkit.JavascriptInterface
public void playEffectSound(final java.lang.String file, final java.lang.Float sound, final java.lang.Integer loop) {
    mMediaStorage.playEffectSound(file, sound, loop);
}

@java.lang.Override
public void onClick(android.view.View view) {
    startActivity(new android.content.Intent(this, com.geeconsystems.globalhr.UI.Etimesheet.class));
}

public void onClick(android.view.View view) {
    setResult(us.food4thought.pantryprotect.RESULT_OK);
    finish();
}

private void takePicture() {
    android.content.Intent gallery = new android.content.Intent(android.content.Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    if ((gallery.resolveActivity(getPackageManager())) != null) {
        startActivityForResult(gallery, 1);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    fp.returnPosition();
    dialog.dismiss();
}

public void initializeRecyclerView() {
    int columns = 2;
    android.util.Log.d(com.nunez.popularmovies.ShowMovies.MoviesFragment.TAG, ("initializeRecyclerView: " + (getActivity().getRequestedOrientation())));
}

private void doDraw(android.graphics.Canvas canvas) {
    canvas.save();
    canvas.scale(oscale, oscale, mx, my);
    canvas.drawBitmap(BackgroundImage, mx, my, null);
    canvas.restore();
}

@org.junit.Test
public void testInsertArtist() throws java.lang.Exception {
    com.bobrusha.android.yandex.content_provider_server.model.Artist artist = com.bobrusha.android.yandex.content_provider_server.TestUtils.getArtist(1);
    dbBackend.insertArtistCV(com.bobrusha.android.yandex.content_provider_server.db.DbBackend.convertArtistToContentValues(artist));
    org.junit.Assert.assertEquals(1, getCount(db, Contract.ArtistEntry.TABLE_NAME));
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    imageView.setImageBitmap(bitmap);
    android.util.Log.d("ImageLoader: ", "onPostExecute");
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mNotificationsEnabled = org.wordpress.android.ui.notifications.utils.NotificationsUtils.isNotificationsEnabled(getActivity());
    if (hasNotificationsSettings()) {
        new org.wordpress.android.ui.prefs.notifications.NotificationsSettingsFragment.LoadNotificationsTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, true);
    }
    refreshSettings();
}

private void initService() {
    connection = new com.lidengqi.lianxi.ui.activity.AidlActivity.AdditionServiceConnection();
    android.content.Intent intent = new android.content.Intent();
    intent.setClassName("com.lidengqi.lianxi.aidl", com.lidengqi.lianxi.aidl.AdditionService.class.getName());
    boolean ret = bindService(intent, connection, Context.BIND_AUTO_CREATE);
}

private static synchronized com.example.test.myweather.database.MyWeatherDB getInstance(android.content.Context context) {
    com.example.test.myweather.database.MyWeatherDB.myWeatherDB = new com.example.test.myweather.database.MyWeatherDB(context);
    return com.example.test.myweather.database.MyWeatherDB.myWeatherDB;
}

@java.lang.Override
public void onFailure(retrofit2.Call<okhttp3.ResponseBody> call, java.lang.Throwable throwable) {
    finishOneRequest();
    com.phicdy.mycuration.rss.UnreadCountManager.getInstance(context).refreshConut(feed.getId());
    context.sendBroadcast(new android.content.Intent(com.phicdy.mycuration.task.NetworkTaskManager.FINISH_UPDATE_ACTION));
}

public void increment(android.view.View view) {
    if ((quantity) == 99) {
        android.widget.Toast.makeText(this, "You can not order more than 99 cups of coffee", Toast.LENGTH_SHORT).show();
    }
    quantity = (quantity) + 1;
    display(quantity);
}

private com.owo.news.ui.ArticleItemView obtainArticleImageView(android.content.Context context, int position) {
    com.owo.news.ui.ArticleItemView itemView = new com.owo.news.ui.ArticleItemView(context);
    itemView.setData(mArticles.get(position), mImageLoader);
    return itemView;
}

private boolean isExist(java.lang.String name) {
    android.util.Log.e("checking", name);
    return (sqLiteHandler.getCategory(name.toUpperCase())) != null;
}

public void addTo(de.blau.android.util.rtree.RTree.Node parent) {
    assert (parent.children) != null;
    parent.children.add(this);
    this.parent = parent;
    computeMBR();
    splitter.split(parent);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    showToolbar();
    toolbar.setSubtitleTextColor(getResources().getColor(android.R.color.white));
    initView();
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i(com.vcredit.cameraHelper.CameraSurfaceView.TAG, "surfaceDestroyed...");
    com.vcredit.cameraHelper.CameraInterface.getInstance(getContext()).doStopCamera();
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    canvas.drawRoundRect(edgeRect, rx, rx, edgePaint);
    fillButton.draw(canvas);
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<java.util.List<com.bitsorific.findyourthings.models.Item>> loader) {
    android.util.Log.d("Loader", "Loader resetting after data change");
    itemListAdapter.setData(null);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    addFragment(com.mrebhan.disqus.fragment.PostsFragment.getInstance("894832"), false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment newFragment = new com.example.ilya.firsthomework.DateDialogFragment(textViewChooseDate, textWatcherChanged, buttonSave);
    newFragment.show(getActivity().getSupportFragmentManager(), "DatePicker");
}

public static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send, boolean logToLogcat) {
    com.binarapps.android.cookielogger.AppContext.initialize(context, send, logToLogcat, com.binarapps.android.cookielogger.CLog.TAG);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.e(com.example.franz.wordreminder.MainActivity.LOG_TAG, "leaving this activity");
    timeExecutorService.shutdown();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mStatus) == (STATUS_READY)) {
        mStatus = STATUS_RECOGNIZING;
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
        updateStatus();
        return ;
    }
}

public static void putSerializableExtra(android.content.Intent intent, java.io.Serializable... serializable) {
    intent.putExtra(com.dhy.xintent.XIntent.KEY_EXTRA, ((serializable.length) > 1 ? serializable : serializable[0]));
}

public java.lang.Object getAppearanceValue(@android.support.annotation.NonNull
final java.lang.String key) {
    return client.getAppearenceValue(key);
}

@java.lang.Override
protected void setupUI(android.view.View rootLayout) {
    rootLayout.findViewById(R.id.btnExportForProject).setOnClickListener(this);
    exportFragment = addChild(R.id.frgExportOnTabContainer, new uk.ac.ucl.excites.sapelli.collector.fragments.ExportFragment(getOwner().getCurrentProject(false)));
}

@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    android.widget.Toast.makeText(this, ((java.lang.String) (dataObject)), Toast.LENGTH_LONG).show();
    adapter.notifyDataSetChanged();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation paramAnimation) {
    hideViews();
    mIsShowing = false;
    onDismissed();
    mParent.setShowingDialog(false);
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    callback.onNestedScreenClicked(new org.broeuschmeul.android.gps.usb.ui.USBGpsSettingsFragment.RecordingPreferences());
    return false;
}

public com.android.volley.RequestQueue getRequestQueue() {
    if ((mRequestQueue) == null) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(getApplicationContext());
    }
    return mRequestQueue;
}

private void createOutOfBoundsOverlay() {
    if (((mMapOverlays) != null) && ((oOutOfBounds) == null)) {
        oOutOfBounds = new couk.chrisjenx.androidmaplib.overlays.OutOfBoundsOverlay(this);
        mMapOverlays.add(oOutOfBounds);
    }
}

private void setLoadedSorting(java.lang.String sorting) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    android.content.SharedPreferences.Editor edit = preferences.edit();
    edit.putString(getString(R.string.loaded_sorting), sorting);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.webkit.WebView myWebView = ((android.webkit.WebView) (findViewById(R.id.noteView)));
    noteViewClient = new com.kjipo.eartrainingandroid.CustomWebViewClient();
    noteViewClient.attachWebView(myWebView);
    sequenceGenerator = new com.kjipo.eartrainingandroid.SequenceGenerator();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_common_sign_in_sign_up);
    android.content.Intent intent = new android.content.Intent(this, guuber.cmu.edu.activities.passenger.ViewHistoryActivity.class);
    intent.putExtra("userName", "Bob");
    startActivity(intent);
}

public boolean dispatchTrackballEvent(android.view.MotionEvent ev) {
    boolean ret = super.dispatchTrackballEvent(ev);
    if ((mPluginActivity) != null) {
        return mPluginActivity.dispatchTrackballEvent(ev);
    }
    return ret;
}

@android.support.annotation.RequiresPermission(value = Manifest.permission.CAMERA)
private void startIfReady() throws java.io.IOException, java.lang.SecurityException {
    if ((mStartRequested) && (mSurfaceAvailable)) {
        mCameraSource.start(mSurfaceView.getHolder());
        mStartRequested = false;
    }
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((caldroidFragment) != null) {
        caldroidFragment.saveStatesToKey(outState, "CALDROID_SAVED_STATE");
    }
}

@java.lang.Override
public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
    super.onSignalStrengthsChanged(signalStrength);
    updateSignalStrength(signalStrength);
}

@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    java.util.UUID apartmentId = ((java.util.UUID) (getIntent().getSerializableExtra(com.example.alex.roomloo_v2.ApartmentActivity.EXTRA_APARTMENT_ID)));
    com.example.alex.roomloo_v2.ApartmentActivity.fragmentManager = getSupportFragmentManager();
    return com.example.alex.roomloo_v2.ApartmentFragment.newInstance(apartmentId);
}

@java.lang.Override
public void getHistoryItems() {
    android.util.Log.d("66666666666", ("getHistoryItems: " + (latestItemsBean.getDate())));
    new me.aaron.zhihudaily.presenter.MainPresenter.requestHistoryItems().execute(((me.aaron.zhihudaily.presenter.MainPresenter.sHistoryItemsAPI) + (latestItemsBean.getDate())));
}

@java.lang.Override
public void setDataSource(android.content.Context context, android.net.Uri uri) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
    org.bottiger.podcast.player.exoplayer.ExoPlayerMediaSourceHelper mediaSourceHelper = new org.bottiger.podcast.player.exoplayer.ExoPlayerMediaSourceHelper(context);
    com.google.android.exoplayer2.source.MediaSource source = mediaSourceHelper.buildMediaSource(uri);
    mExoplayer.prepare(source);
}

public static com.todoroo.astrid.data.Task createWithValues(android.content.ContentValues values, java.lang.String title, com.todoroo.astrid.service.TaskService taskService, com.todoroo.astrid.service.MetadataService metadataService, java.lang.String... flags) {
    com.todoroo.astrid.data.Task task = new com.todoroo.astrid.data.Task();
    return com.todoroo.astrid.service.TaskService.createWithValues(task, values, title, taskService, metadataService);
}

public void enqueue(com.example.brianchan.ripple_android.Song song) {
    songs.add(song);
    java.lang.String songName = song.getTitle();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.crashlytics.android.Crashlytics.log(Log.DEBUG, TAG, "onResume");
    com.crashlytics.android.Crashlytics.setString("screen", TAG);
}

@java.lang.Override
public void onMenuTabReSelected(@android.support.annotation.IdRes
int menuItemId) {
    mNavigator.removeAllFragment(true);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.search :
            onSearchRequested();
            return true;
        case R.id.action_settings :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

public static void save(android.support.v4.app.FragmentActivity source) {
    com.woodblockwithoutco.beretained.FieldsRetainer<android.support.v4.app.FragmentActivity> retainer = com.woodblockwithoutco.beretained.BeRetained.findFieldsRetainer(source.getClass());
    retainer.save(source);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    selectedSkills.remove(position);
    displaySkillAdapter.clear();
    displaySkillAdapter.addAll(selectedSkills);
    displaySkillAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null)
        android.util.Log.d("Object saving error", e.toString());
    
    java.lang.System.out.println("Post updated");
}

private void insertDefaultData() {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String insertQuery = "INSERT INTO categories VALUES (NULL, 'Daily', 1);";
    java.lang.String insertQuery2 = "INSERT INTO categories VALUES (NULL, 'Personal', 0);";
    java.lang.String insertQuery3 = "INSERT INTO categories VALUES (NULL, 'Work', 0);";
    db.execSQL(insertQuery);
    db.execSQL(insertQuery2);
    db.execSQL(insertQuery3);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    saveState();
    onListItemClicked(view);
}

@java.lang.Override
public void onSlide(@android.support.annotation.NonNull
android.view.View bottomSheet, float slideOffset) {
    android.util.Log.e("onSlide", "onSlide");
}

@java.lang.Override
public void onClick(android.view.View v) {
    imagebtnAnimationPopback();
    showBottomSheetDialog();
    viewStatus = com.bfbstudio.routetracking.UI.MapsFragment.VIEW_JOURNEY_KEY;
}

@java.lang.Override
public com.fuzz.indicator.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) {
    com.fuzz.indicator.CutoutViewLayoutParams params = new com.fuzz.indicator.CutoutViewLayoutParams(defaultChildParams);
    params.init(getContext(), attrs);
    return params;
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.firebase.ui.auth.ui.email.SignInActivity.RC_CREDENTIAL_SAVE)) {
        finish(com.firebase.ui.auth.ui.email.RESULT_OK, new android.content.Intent());
    }
}

@android.support.annotation.Nullable
@java.lang.Override
protected java.util.ArrayList<pasta.streamer.data.PlaylistListData> run() throws java.lang.InterruptedException {
    pasta.getPlaylists(data);
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    isFinishAnim = false;
    if ((page1.getParent()) == null) {
        attachViewToParent(page1, 0, page1.getLayoutParams());
    }
}

private void moveCursorToRandomPosition(android.database.Cursor cursor) {
    int rowCount = cursor.getCount();
    int randomRowPosition = ((int) ((java.lang.Math.random()) * (rowCount + 1)));
    cursor.moveToPosition(randomRowPosition);
}

public void init(android.content.Context context) {
    this.sensorManager = ((android.hardware.SensorManager) (context.getSystemService(Context.SENSOR_SERVICE)));
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        finishActivity();
    }
    return super.onKeyDown(keyCode, event);
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.monstersfromtheid.imready.DefineAccount.ACTIVITY_GOT_ACCOUNT)) {
        if (resultCode != (RESULT_CANCELED)) {
            finish();
        }
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.wewow.utils.Utils.setActivityToBeFullscreen(this);
    setContentView(R.layout.activity_lifelab_list);
    this.getSupportActionBar().setTitle(R.string.lifelab_title);
    this.setupUI();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), cn.an0nymous.chatroom.Activity.SignupActivity.class);
    startActivity(intent);
    finish();
    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
}

public boolean isScreenLarge() {
    final int screenSize = (getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK);
    return (screenSize == (android.content.res.Configuration.SCREENLAYOUT_SIZE_LARGE)) || (screenSize == (android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE));
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_refresh)) {
        GlanceService.singleton.refresh("user");
        redraw();
        return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int id, android.view.KeyEvent keyEvent) {
    if ((id == (R.id.login)) || (id == (android.view.inputmethod.EditorInfo.IME_NULL))) {
        attemptLogin();
        return true;
    }
    return false;
}

public void stopPlayback() {
    if (isAudioTrackInitialised()) {
        if ((isPlaying()) || (isPaused())) {
            android.util.Log.d(ch.zhaw.bait17.audio_signal_processing_toolbox.player.AudioPlayer.TAG, "Stop playback.");
            keepPlaying = false;
        }
    }
}

@java.lang.Override
protected void adjustAnchorOffsetXY(android.view.View child, float[] anchorOffsetXY) {
    anchorOffsetXY[0] = (child.getHeight()) / 2.0F;
}

