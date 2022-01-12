@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
}

@java.lang.Override
public void onCancelled(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo) {
    cb.failed("上传失败");
}

public void checkBlacklist(android.app.Activity activity) {
    this.activity = activity;
    appaloosa_store.com.appaloosa_android_tools.tools.services.blacklist.CheckBlacklistService.checkBlacklist(null);
}

public void saveCookie(java.lang.String cookieStr) {
    android.content.SharedPreferences.Editor edit = perf.edit();
    edit.putString(com.coder4.amvt.agent.UserAgent.STORE_KEY_COOKIE, cookieStr);
    edit.commit();
}

@java.lang.Override
public void onStart() {
    super.onStart();
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    mDrawerLayout.closeDrawers();
    switch (item.getItemId()) {
        case R.id.action_notification_item :
            showNotificationTab();
    }
    return true;
}

private void plotNavigation(com.google.android.gms.maps.model.LatLng origin, com.google.android.gms.maps.model.LatLng destination) {
    directions = new com.prembros.artooproject.Directions(mMap);
    java.lang.String url = directions.getDirectionsUrl(origin, destination);
    directions.executeDownloadTask(url);
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mEventDay = dayOfMonth;
    mEventMonth = monthOfYear + 1;
    mEventYear = year;
}

@android.webkit.JavascriptInterface
public void playEffectSound(final java.lang.String file, final float sound) {
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
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_UNKNOWN :
        default :
            return null;
    }
}

public void enableBroadcastReceiver(android.view.View view) {
}

private void markSavedSelectedItem(com.iolab.sightlocator.SightMarkerItem savedSelectedItem) {
    if (!(mCurrentSelectedItemsClustered.contains(savedSelectedItem))) {
        addSelectedMarkerDelayed(savedSelectedItem, com.iolab.sightlocator.SelectedMarkerManager.ITEM_RETRIEVAL_DURATION);
    }
}

public void setView(int x, int y, android.graphics.Bitmap head) {
    this.head = head;
    this.x = x;
    this.y = y;
}

@java.lang.Override
public void run() {
    try {
        applyGlobalContent(true, false, view, activity);
        android.support.design.widget.Snackbar.make(view, "Updated!", Snackbar.LENGTH_SHORT).show();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    handleIntent(intent);
}

@java.lang.Override
protected void onPostCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    loadFeeds(tabLayout.getTabAt(0).getText().toString());
}

private void showActionBarIfNeeded() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if ((actionBar != null) && (!(actionBar.isShowing()))) {
        actionBar.show();
    }
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    set_selected_block(0, false);
    Button_Takeoff.setSelected(true);
    return false;
}

public void draw(android.graphics.Canvas canvas) {
    com.idonans.acommon.lang.CommonLog.d(((com.idonans.doodle.DoodleView.Render.CanvasBuffer.TAG) + " draw"));
    refreshBuffer();
    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, null);
}

@java.lang.Override
public void onClick(android.view.View v) {
    addFavorite(_station, _station.getName(), false, false);
    getListPagerAdapter().setupBTabStationARecap(_station);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    fragmentMap = new com.bfbstudio.routetracking.UI.MapsFragment();
    getSupportFragmentManager().beginTransaction().add(R.id.Fragment_Map, fragmentMap).commit();
}

@java.lang.Override
public void protocolDidReceivePinCapability(int pin, int value) {
    java.lang.System.out.println(((("protocolDidReceivePinCapability - pin: " + pin) + "\tvalue: ") + value));
    android.util.Log.e(TAG, ((("protocolDidReceivePinCapability - pin: " + pin) + "\tvalue: ") + value));
}

public void clearToDoListInDB() {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.execSQL(("delete from " + (ToDoListContract.ToDoList.TABLE_NAME)));
}

public abstract void create();

@java.lang.Override
public com.kimeeo.library.listDataView.viewPager.TabIndicatorRecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = getView(parent, viewType);
    return getViewHolder(view, viewType);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0)
        return com.sam_chordas.android.stockhawk.ui.LineGraphFragment.newInstance(mItems);
    
    return com.sam_chordas.android.stockhawk.ui.HistoricalListFragment.newInstance(mItems);
}

@java.lang.Override
public void onAdOpened() {
    super.onAdOpened();
    showThksToast();
}

private void changeFragment(android.support.v4.app.Fragment targetFragment) {
    resideMenu.clearIgnoredViewList();
    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, targetFragment, "fragment").setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
}

private void sendMail(java.lang.String newMail) {
    new samurai.geeft.android.geeft.database.BaaSMail(samurai.geeft.android.geeft.utilities.TagsValue.DEFAULT_EMAIL, newMail, mCode).execute();
}

@android.webkit.JavascriptInterface
public void playEffectSound(final java.lang.String file, final float sound, final int loop) {
    mMediaStorage.playEffectSound(file, sound, loop);
}

@java.lang.Override
public void onClick(android.view.View view) {
}

public void onClick(android.view.View view) {
    finish();
}

private void takePicture() {
    android.content.Intent gallery = new android.content.Intent(android.content.Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    if ((gallery.resolveActivity(getPackageManager())) != null) {
        startActivityForResult(gallery, 1);
    }else {
        return ;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialog.dismiss();
}

public void initializeRecyclerView() {
    int columns = 2;
}

private void doDraw(android.graphics.Canvas canvas) {
    canvas.save();
    canvas.drawBitmap(BackgroundImage, mx, my, null);
    canvas.restore();
}

@org.junit.Test
public void testInsertArtist() throws java.lang.Exception {
    com.bobrusha.android.yandex.content_provider_server.model.Artist artist = com.bobrusha.android.yandex.content_provider_server.TestUtils.getArtist(1);
    dbBackend.insertArtistCV(db, com.bobrusha.android.yandex.content_provider_server.db.DbBackend.convertArtistToContentValues(artist));
    org.junit.Assert.assertEquals(1, getCount(db, Contract.ArtistEntry.TABLE_NAME));
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    if (bitmap != null) {
        imageView.setImageBitmap(bitmap);
    }
    android.util.Log.d("ImageLoader: ", "onPostExecute");
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mNotificationsEnabled = org.wordpress.android.ui.notifications.utils.NotificationsUtils.isNotificationsEnabled(getActivity());
    refreshSettings();
}

private void initService() {
    connection = new com.lidengqi.lianxi.ui.activity.AidlActivity.AdditionServiceConnection();
    android.content.Intent intent = new android.content.Intent(this, com.lidengqi.lianxi.aidl.AdditionService.class);
    boolean ret = bindService(intent, connection, Context.BIND_AUTO_CREATE);
}

public static synchronized com.example.test.myweather.database.MyWeatherDB getInstance(android.content.Context context) {
    com.example.test.myweather.database.MyWeatherDB.myWeatherDB = new com.example.test.myweather.database.MyWeatherDB(context);
    return com.example.test.myweather.database.MyWeatherDB.myWeatherDB;
}

@java.lang.Override
public void onFailure(retrofit2.Call<okhttp3.ResponseBody> call, java.lang.Throwable throwable) {
    finishOneRequest(feed.getId());
}

public void increment(android.view.View view) {
    if ((quantity) == 99) {
        android.widget.Toast.makeText(this, "You can not order more than 99 cups of coffee", Toast.LENGTH_SHORT).show();
    }else {
        quantity = (quantity) + 1;
        display(quantity);
    }
}

private com.owo.news.ui.ArticleItemView obtainArticleImageView(android.content.Context context) {
    com.owo.news.ui.ArticleItemView itemView = new com.owo.news.ui.ArticleItemView(context);
    return itemView;
}

private boolean isExist(java.lang.String name) {
    return (sqLiteHandler.getCategory(name.toUpperCase())) != null;
}

public void addTo(de.blau.android.util.rtree.RTree.Node parent) {
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
    initView();
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i(com.vcredit.cameraHelper.CameraSurfaceView.TAG, "surfaceDestroyed...");
    com.vcredit.cameraHelper.CameraInterface.getInstance().doStopCamera();
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    canvas.drawRoundRect(edgeRect, rx, rx, edgePaint);
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<java.util.List<com.bitsorific.findyourthings.models.Item>> loader) {
    android.util.Log.i("Loader", "Loader resetting after data change");
    itemListAdapter.setData(null);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        addFragment(com.mrebhan.disqus.fragment.PostsFragment.getInstance("894832"), false);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment newFragment = new com.example.ilya.firsthomework.DateDialogFragment();
    newFragment.show(getActivity().getSupportFragmentManager(), "DatePicker");
}

public static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send, boolean logToLogcat) {
    com.binarapps.android.cookielogger.AppContext.initialize(context, send, logToLogcat);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    timeExecutorService.shutdown();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mStatus) == (STATUS_READY)) {
        mStatus = STATUS_RECOGNIZING;
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
        updateStatus();
    }
}

public static void putSerializableExtra(android.content.Intent intent, java.io.Serializable... serializable) {
    if ((serializable.length) == 0)
        return ;
    
    intent.putExtra(com.dhy.xintent.XIntent.KEY_EXTRA, ((serializable.length) > 1 ? serializable : serializable[0]));
}

public java.lang.Object getAppearanceValue(@android.support.annotation.NonNull
final java.lang.String key) {
    return client.getAppearanceValue(key);
}

@java.lang.Override
protected void setupUI(android.view.View rootLayout) {
    rootLayout.findViewById(R.id.btnExportForProject).setOnClickListener(this);
    exportFragment = addChild(R.id.frgExportOnTabContainer, new uk.ac.ucl.excites.sapelli.collector.fragments.ExportFragment());
}

@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    adapter.notifyDataSetChanged();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation paramAnimation) {
    hideViews();
    mIsShowing = false;
    onDismissed();
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    if ((callback) != null) {
        callback.onNestedScreenClicked(new org.broeuschmeul.android.gps.usb.ui.USBGpsSettingsFragment.RecordingPreferences());
    }
    return false;
}

public com.android.volley.RequestQueue getRequestQueue() {
    if ((mRequestQueue) == null) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(getApplicationContext());
        mRequestQueue.start();
    }
    return mRequestQueue;
}

private void createOutOfBoundsOverlay() {
    if (((mMapOverlays) != null) && ((oOutOfBounds) == null)) {
        oOutOfBounds = new couk.chrisjenx.androidmaplib.overlays.OutOfBoundsOverlay(this);
        mMapOverlays.add(0, oOutOfBounds);
    }
}

private void setLoadedSorting(java.lang.String sorting) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    android.content.SharedPreferences.Editor edit = preferences.edit();
    edit.putString(getString(R.string.loaded_sorting), sorting);
    edit.commit();
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.webkit.WebView myWebView = ((android.webkit.WebView) (findViewById(R.id.noteView)));
    noteViewClient = new com.kjipo.eartrainingandroid.CustomWebViewClient();
    noteViewClient.attachWebView(myWebView);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_common_sign_in_sign_up);
}

public boolean dispatchTrackballEvent(android.view.MotionEvent ev) {
    boolean ret = super.dispatchTrackballEvent(ev);
    if ((mPluginActivity) != null) {
        mPluginActivity.dispatchTrackballEvent(ev);
    }
    return ret;
}

@android.support.annotation.RequiresPermission(value = Manifest.permission.CAMERA)
private void startIfReady() throws java.io.IOException, java.lang.SecurityException {
    if (((mStartRequested) && (mSurfaceAvailable)) && ((mCameraSource) != null)) {
        mCameraSource.start(mSurfaceView.getHolder());
        mStartRequested = false;
    }
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    caldroidFragment.saveStatesToKey(outState, "CALDROID_SAVED_STATE");
}

@java.lang.Override
public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
    updateSignalStrength(signalStrength);
}

@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    java.util.UUID apartmentId = ((java.util.UUID) (getIntent().getSerializableExtra(com.example.alex.roomloo_v2.ApartmentActivity.EXTRA_APARTMENT_ID)));
    return com.example.alex.roomloo_v2.ApartmentFragment.newInstance(apartmentId);
}

@java.lang.Override
public void getHistoryItems() {
    new me.aaron.zhihudaily.presenter.MainPresenter.requestHistoryItems().execute(((me.aaron.zhihudaily.presenter.MainPresenter.sHistoryItemsAPI) + (latestItemsBean.getDate())));
}

@java.lang.Override
public void setDataSource(android.content.Context context, android.net.Uri uri) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
    org.bottiger.podcast.player.exoplayer.ExoPlayerMediaSourceHelper mediaSourceHelper = new org.bottiger.podcast.player.exoplayer.ExoPlayerMediaSourceHelper(context);
    com.google.android.exoplayer2.source.MediaSource source = mediaSourceHelper.buildMediaSource(uri);
    mExoplayer.prepare(source, true, false);
}

public static com.todoroo.astrid.data.Task createWithValues(android.content.ContentValues values, java.lang.String title, com.todoroo.astrid.service.TaskService taskService, com.todoroo.astrid.service.MetadataService metadataService) {
    com.todoroo.astrid.data.Task task = new com.todoroo.astrid.data.Task();
    return com.todoroo.astrid.service.TaskService.createWithValues(task, values, title, taskService, metadataService);
}

public void enqueue(com.example.brianchan.ripple_android.Song song) {
    if ((songs) == null) {
        songs = new java.util.LinkedList<com.example.brianchan.ripple_android.Song>();
    }
    songs.add(song);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
}

@java.lang.Override
public void onMenuTabReSelected(@android.support.annotation.IdRes
int menuItemId) {
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.search :
            return true;
        case R.id.action_settings :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

public static void save(android.support.v4.app.FragmentActivity source) {
    com.woodblockwithoutco.beretained.FieldsRetainer<android.support.v4.app.FragmentActivity> retainer = com.woodblockwithoutco.beretained.BeRetained.findFieldsRetainer(source.getClass());
    if (retainer != null) {
        retainer.save(source);
    }
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    selectedSkills.remove(position);
    displaySkillAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null)
        android.util.Log.d("Object saving error", e.toString());
    
}

private void insertDefaultData(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String insertQuery = "INSERT INTO categories VALUES (NULL, 'Daily', 1);";
    java.lang.String insertQuery2 = "INSERT INTO categories VALUES (NULL, 'Personal', 0);";
    java.lang.String insertQuery3 = "INSERT INTO categories VALUES (NULL, 'Work', 0);";
    db.execSQL(insertQuery);
    db.execSQL(insertQuery2);
    db.execSQL(insertQuery3);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    onListItemClicked(view);
}

@java.lang.Override
public void onSlide(@android.support.annotation.NonNull
android.view.View bottomSheet, float slideOffset) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    imagebtnAnimationPopback();
    showBottomSheetDialog();
}

@java.lang.Override
public com.fuzz.indicator.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) {
    return new com.fuzz.indicator.CutoutViewLayoutParams(getContext(), attrs, defaultChildParams);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.firebase.ui.auth.ui.email.SignInActivity.RC_CREDENTIAL_SAVE)) {
        finish(com.firebase.ui.auth.ui.email.RESULT_OK, data);
    }
}

@android.support.annotation.Nullable
@java.lang.Override
protected java.util.List<pasta.streamer.data.PlaylistListData> run() throws java.lang.InterruptedException {
    return pasta.getPlaylists(data);
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    isFinishAnim = false;
}

private void moveCursorToRandomPosition(android.database.Cursor cursor) {
    int rowCount = cursor.getCount();
    int randomRowPosition = ((int) ((java.lang.Math.random()) * rowCount));
    cursor.moveToPosition(randomRowPosition);
}

public void init(android.hardware.SensorManager sensorManager) {
    this.sensorManager = sensorManager;
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        finishActivity();
        return true;
    }
    return super.onKeyDown(keyCode, event);
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.monstersfromtheid.imready.DefineAccount.ACTIVITY_GOT_ACCOUNT)) {
        finish();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lifelab_list);
    this.getSupportActionBar().setTitle(R.string.lifelab_title);
    this.setupUI();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), cn.an0nymous.chatroom.Activity.SignupActivity.class);
    startActivity(intent);
    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
}

public boolean isScreenLarge() {
    final int screenSize = (getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK);
    return screenSize == (android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_refresh)) {
        GlanceService.singleton.refresh("user");
        return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int id, android.view.KeyEvent keyEvent) {
    return false;
}

public void stopPlayback() {
    android.util.Log.d(ch.zhaw.bait17.audio_signal_processing_toolbox.player.AudioPlayer.TAG, "Stop playback.");
    keepPlaying = false;
}

@java.lang.Override
public void adjustAnchorOffsetXY(android.view.View child, float[] anchorOffsetXY) {
    anchorOffsetXY[0] = (child.getHeight()) / 2.0F;
}

