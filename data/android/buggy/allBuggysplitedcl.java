@java.lang.Override
public void onSkipToQueueItem(long queueId) {
    com.example.android.uamp.utils.LogHelper.d(com.example.android.uamp.playback.PlaybackManager.TAG, ("OnSkipToQueueItem:" + queueId));
    mQueueManager.setCurrentQueueItem(queueId);
    handlePlayRequest();
    mQueueManager.updateMetadata();
}

static com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder create(android.view.LayoutInflater inflater, android.view.ViewGroup parent, com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.ItemClickListener clickListener) {
    return new com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder(inflater.inflate(R.layout.row_item, parent, false), clickListener);
}

@android.support.annotation.UiThread
@java.lang.Override
public T remove(int i) {
    final T removed = mData.remove();
    org.spacebison.recyclerviewlistadapter.RecyclerViewListAdapter.notifyItemRemoved(i);
    return removed;
}

public org.michaelbel.material.widget.ActionBarMenuItem addItemWithWidth(int id, @android.support.annotation.DrawableRes
int icon, int width) {
    return addItem(id, icon, actionBar.itemsBackgroundColor, null, width);
}

@java.lang.Override
public void onClick(android.view.View v) {
    org.croudtrip.utils.DataHolder.getInstance().setVehicle_id(0);
    ((it.neokree.materialnavigationdrawer.MaterialNavigationDrawer) (_this.getActivity())).setFragmentChild(new org.croudtrip.fragments.VehicleInfoFragment(), "Add new vehicle");
}

java.lang.String getSaveAsFilename() {
    ca.rmen.android.poetassistant.main.reader.PoemFile poemFile = mPoemPrefs.getSavedPoem();
    if (poemFile != null) {
        return poemFile.name;
    }else {
        return ca.rmen.android.poetassistant.main.reader.PoemFile.generateFileName(poem.get().toString());
    }
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    android.util.Log.i("TAG", "---- onAnimationEnd ----");
    view.setTranslationY(0);
}

public static boolean confirmRequest(android.net.Uri uri, java.lang.String request) {
    return uri.getPathSegments().get(3).equals(request);
}

@java.lang.Override
protected void onPause() {
    super.onResume();
    if (mEditMode) {
        mFileContent.loadUrl(me.sheimi.android.utils.CodeGuesser.wrapUrlScript("save();"));
    }
}

@java.lang.Override
public void consume(edu.hm.cs.bikebattle.app.modell.User input) {
    principal = input;
    userPhoto = android.net.Uri.parse(input.getFotoUri());
    android.util.Log.d(edu.hm.cs.bikebattle.app.activities.BaseActivity.TAG, principal.toString());
    refreshUserInfo();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    setHasOptionsMenu(true);
    android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "in onCreate, connecting to google api services");
    _googleApiClient = buildGoogleApiClient();
    _googleApiClient.connect();
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    android.util.Log.w(org.thoughtcrime.securesms.components.camera.SurfacePreviewStrategy.TAG, "surfaceChanged()");
    cameraView.initPreview();
}

@java.lang.Override
protected void onStart() {
    spiceManager.start(this);
    super.onStart();
    android.util.Log.v("MainActiviry.onStart", "Execute repositoriesPreviews");
}

public static co.japo.mindexplotion.service.InternalStorageService getCurrentInstance(android.content.Context appContext) {
    if ((co.japo.mindexplotion.service.InternalStorageService.instance) == null) {
        co.japo.mindexplotion.service.InternalStorageService.instance = new co.japo.mindexplotion.service.InternalStorageService();
        co.japo.mindexplotion.service.InternalStorageService.context = appContext;
        co.japo.mindexplotion.service.InternalStorageService.init();
    }
    return co.japo.mindexplotion.service.InternalStorageService.instance;
}

public static native void doReconfigure(int w, int h, com.runrev.android.Bitmap bitmap);

private void playMusic(int song) {
    android.util.Log.i(TAG, "playing music");
    android.media.MediaPlayer play = android.media.MediaPlayer.create(this, song);
    play.start();
}

public void setColumnWidth(int width) {
    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(tesla.andrew.magicchart.custom_views.Column.dpToPx(context, width), tesla.andrew.magicchart.custom_views.Column.dpToPx(context, 120), 0);
    column.setLayoutParams(layoutParams);
}

@java.lang.Override
public void onChildMoved(com.google.firebase.database.DataSnapshot snapshot, java.lang.String previousChildName) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onChildMoved", "child", snapshot.getValue());
}

public void finishActivity() {
    android.app.Activity activity = com.hitomi.aslibrary.ActivityManager.activityStack.lastElement();
    finishActivity(activity);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    updateDsp();
}

@java.lang.Override
public void onError(java.lang.String message) {
    android.util.Log.e(net.nitroshare.android.transfer.TransferService.TAG, java.lang.String.format("transfer %d failed: %s", transferId, message));
    showErrorNotification(device, message);
}

public void onClick(android.view.View view) {
    pager.setCurrentItem(getItem((-1)), true);
    updateButtonVisibility();
}

private com.android.volley.RequestQueue getRequestQueue() {
    if ((mRequestQueue) == null) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.joelimyx.flipvicefeed.classes.VolleySingleton.mCtx.getApplicationContext());
    }
    return mRequestQueue;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString(com.gcw.sapienza.places.ShareActivity.BUNDLED_IMG_PATH, this.imageFile.getAbsolutePath());
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d(com.udacity.bakappies.fragment.FragmentStepDetail.TAG, ("onResume " + (step.getShortDescription())));
    if (getUserVisibleHint()) {
        load(step);
    }
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getApplicationContext(), "Not on a WiFi Connection", Toast.LENGTH_LONG).show();
}

public void onClick(android.view.View v) {
    jbarton.simple.string school = "Thank you for clicking the button";
    jbarton.simple.string myname = "HelloDearSir";
    nschoolTextView.setText(school);
    mnameTextView.setText(myname);
    nButton.setVisibility(View.GONE);
}

@java.lang.Override
protected void dispatchDraw(android.graphics.Canvas canvas) {
    super.dispatchDraw(canvas);
    onUpdateScrollbar();
    mScrollbar.draw(canvas);
}

public boolean exifSupported(android.content.Context context, us.koller.cameraroll.data.AlbumItem albumItem) {
    java.lang.String mimeType = us.koller.cameraroll.util.MediaType.getMimeType(context, albumItem.getUri(context));
    return us.koller.cameraroll.util.MediaType.doesSupportExif_MimeType(mimeType);
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    stopPreview();
    this.ispriv = false;
    com.wx.imx53server.MyCamera.mCamera.release();
    android.util.Log.d(com.wx.imx53server.MyCamera.TAG, "surface destoryed,release resource");
}

@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    super.onRestoreInstanceState(state);
    if (((mRecyclerView) != null) && (state != null)) {
        mRecyclerView.getLayoutManager().onRestoreInstanceState(state);
    }
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (v == (mWebView)) {
        webViewHasFocus = hasFocus;
    }
}

private void monitorChildController(com.bluelinelabs.conductor.Controller controller) {
    mChildBackstack.add(controller);
    controller.addLifecycleListener(new com.bluelinelabs.conductor.Controller.LifecycleListener() {
        @java.lang.Override
        public void postDestroy(@android.support.annotation.NonNull
        com.bluelinelabs.conductor.Controller controller) {
            mChildBackstack.remove(controller);
        }
    });
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    currentLocation = location;
    double lat = location.getLatitude();
    double lng = location.getLongitude();
    editTextCity.setText(getLocationName(lat, lng));
}

public void play(android.database.Cursor cursor) {
    if (isPaused()) {
        start();
        paused = false;
    }else {
        playPrepared(cursor);
        start();
    }
}

public static void forceRestart(android.content.Context c, boolean forceLoadScreen) {
    me.ccrama.redditslide.Reddit.appRestart.edit().putString("startScreen", "").apply();
    me.ccrama.redditslide.Reddit.forceRestart(c);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    isPaused = true;
    chronometerClick();
    dialog.dismiss();
    immersiveMode();
}

@java.lang.Override
protected java.util.ArrayList<noh.android.moviemanager.models.Movie> doInBackground(java.lang.String... params) {
    android.util.Log.e(noh.android.moviemanager.adapters.MovieAsyncTaskLoader.TAG_MovieAsyncTaskLoader, noh.android.moviemanager.adapters.MovieAsyncTaskLoader.getJson());
    return ConvertJsontoMovieList(noh.android.moviemanager.adapters.MovieAsyncTaskLoader.getJson(params));
}

public void init(android.content.Context context, com.github.mikephil.charting.data.CombinedData priceChartData, com.github.mikephil.charting.data.CombinedData volumeChartData);

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    setContentView(R.layout.activity_main);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    return true;
}

public static void showMessage(android.content.Context context, java.lang.String message) {
    com.shuruta.sergey.ftpclient.ui.DialogFactory.showMessage(context, message, null);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mGoToPage = 1;
    sbGotoPage.setProgress(mGoToPage);
    mCurrentPage = mGoToPage;
    showOrLoadPage();
    dialog.dismiss();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    twoPlayerManager.setDisplaying(false);
    dialog.dismiss();
}

private void updateButtonStates() {
    ((android.widget.Button) (findViewById(R.id.startListeningButton))).setText((isListening ? R.string.stop_listening : R.string.start_listening));
    findViewById(R.id.clearConsoleButton).setEnabled(isListening);
    findViewById(R.id.sendMessageButton).setEnabled(isListening);
}

private void read() {
    android.graphics.Bitmap mBitmap = com.unimelb.feelinglucky.snapsheet.Util.DatabaseUtils.getImg(DatabaseInstance.database);
    if (mBitmap != null) {
        mImg.setImageBitmap(mBitmap);
        mGrid.setVisibility(View.VISIBLE);
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    android.util.Log.v(database.DatabaseHelper.TAG, TaskContract.CREATE_TABLE);
    db.execSQL(TaskContract.DELETE_TABLE);
    db.execSQL(TaskContract.CREATE_TABLE);
    database.InitDb.initDb(this);
}

@java.lang.Override
protected void sendUpdatedStateTo(edu.up.cs301.game.GamePlayer p) {
    android.util.Log.d("sending state", "updated state");
    edu.up.cs301.blokus.BlokusGameState copyState = new edu.up.cs301.blokus.BlokusGameState(gameState);
    p.sendInfo(((edu.up.cs301.game.infoMsg.GameState) (copyState)));
}

public void closeSingleton() {
    com.example.zoardgeocze.clickonmap.Singleton.SingletonFacadeController.INSTANCE = null;
    java.lang.System.gc();
    android.util.Log.d("Teste", "Matei singleton");
}

public static android.graphics.Bitmap getBitmapFromBytes(byte[] image) {
    java.io.ByteArrayInputStream imageStream = new java.io.ByteArrayInputStream(image);
    android.graphics.Bitmap decodedImage = android.graphics.BitmapFactory.decodeStream(imageStream);
    return decodedImage;
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    gestureDetector.onTouchEvent(event);
    return ((event.getAction()) != (android.view.MotionEvent.ACTION_UP)) && ((focused) != (-1));
}

private void changeActionBarColor() {
    getActionBar().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getColors()[com.hkm.sampleswipe.DemoActivity.mBgIndex]));
    (com.hkm.sampleswipe.DemoActivity.mBgIndex)++;
    if ((com.hkm.sampleswipe.DemoActivity.mBgIndex) >= (getColors().length)) {
        com.hkm.sampleswipe.DemoActivity.mBgIndex = 0;
    }
}

@java.lang.Override
public void onConfigure(android.database.sqlite.SQLiteDatabase database) {
    this.onConfigure(database);
}

public static int retrieveCompanyId(android.content.Context context) {
    com.reminisense.fa.models.LoginResult loginResult = com.reminisense.fa.managers.CacheManager.retrieveLoginResult(context);
    return loginResult.getCompanyId();
}

private boolean shouldCancelDragOnDataUpdated() {
    return (!(com.h6ah4i.android.widget.advrecyclerview.draggable.DraggableItemWrapperAdapter.DEBUG_BYPASS_MOVE_OPERATION_MODE)) && (isDragging());
}

@java.lang.Override
public void onClick(android.view.View view) {
    getActivity().startActivityForResult(pickIntent, com.olehm.criminalintent.controller.crime.details.CrimeFragment.REQUEST_CONTACT);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.zhangwx.dynamicpermissionsrequest.permission.EasyPermissions.requestPermissions(getParent(), R.mipmap.ic_launcher, "RequestLocationPermissions", getString(R.string.action_settings), PermissionUtils.REQUEST_CONTACTS_CODE, PermissionUtils.PERMISSIONS_CONTACTS_GROUP);
}

public void done(com.parse.ParseException e) {
    if (e != null) {
        android.content.Intent mapIntent = new android.content.Intent();
        mapIntent.setClass(getApplicationContext(), com.example.cmput401.classdiscuss.MapActivity.class);
        startActivity(mapIntent);
    }else {
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    layout_MainMenu.getForeground().setAlpha(20);
    layout_MainMenu.getForeground().setColorFilter(R.color.gray, PorterDuff.Mode.OVERLAY);
    initiateCommentPopup();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    presenter = new com.sean.nanastudio.taoyuanstreetparking.MainPresenterImpl(this, new com.sean.nanastudio.taoyuanstreetparking.MainModelImpl());
    presenter.onCreate();
}

public java.lang.String getNextPlayerTeamB() {
    if ((++(playerTurnCounterOfTeamB)) == (com.example.michael.archerygame.TaskFragment.playerListOfTeamB.size()))
        playerTurnCounterOfTeamB = 0;
    
    android.util.Log.v("playerName", com.example.michael.archerygame.TaskFragment.playerListOfTeamB.get(playerTurnCounterOfTeamB));
    return com.example.michael.archerygame.TaskFragment.playerListOfTeamB.get(playerTurnCounterOfTeamB);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    finish();
}

@java.lang.Override
public void onNewData(long timestamp, android.os.Bundle value) {
    this.onNewData(timestamp, value);
    recordFragmentObserver.onNewData(timestamp, value);
}

public static android.content.Intent createIntent(final android.content.Context context, com.vlabs.medicinetracker.singleMeasurement.mvp.SMInstance extra) {
    final android.content.Intent intent = new android.content.Intent(context, com.vlabs.medicinetracker.singleMeasurement.SingleMeasurementActivity.class);
    intent.putExtra(com.vlabs.medicinetracker.singleMeasurement.SingleMeasurementActivity.PRESENTER_TYPE_KEY, extra);
    return intent;
}

public void enableBluetooth() {
    if (!(mBluetoothAdapter.isEnabled())) {
        mBluetoothAdapter.enable();
        android.util.Log.d(TAG, "enableBluetooth():  BluetoothAdapter 실행");
    }
}

@java.lang.Override
public void initControl() {
    lstPost = ((android.widget.ListView) (findViewById(R.id.lsPost)));
    lstPost.setAdapter(com.example.llh_pc.it_support.activities.frmLuuTru.adapter);
}

public static int getLongSide(android.app.Activity activity) {
    com.easy.util.MeasureUtil.measure(activity);
    return (com.easy.util.MeasureUtil.type) == (com.easy.util.MeasureUtil.TYPE_PHONE) ? com.easy.util.MeasureUtil.screenHeight : com.easy.util.MeasureUtil.screenWidth;
}

@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    int id = menuItem.getItemId();
    menu.clear();
    doMenuAction(id);
    return true;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    alertDialogBuilder.setCancelable(true);
    android.content.Intent intent = new android.content.Intent(this, droidahmed.com.jm3eia.start.MainActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onEnabled(android.content.Context context) {
    android.util.Log.d(ru.sigil.fantasyradio.widget.FantasyRadioWidgetProvider.TAG, "onEnabled method called");
}

public void run() {
    android.util.Log.i(org.opencv.samples.tutorial1.MarkerTracker.TAG, "sasquatch");
    onLandmark_enabled = true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mContext.startActivity(new android.content.Intent(mContext, com.easemob.qixin.activity.PersonalInfoActivity.class).putExtra("userId", item));
}

@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle outState) {
    updateValuesFromBundle(outState);
    updateUI();
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    getSaveEffectValue(((seekBar.getProgress()) * (com.fesskiev.player.widgets.dialogs.effects.EffectDialog.SCALE)));
}

public void update(android.graphics.Canvas canvas) {
    if ((animationCount) < (singleAnimation.animationFrames.size()))
        (animationCount)++;
    else
        isFinished = true;
    
    drawSelf(canvas);
}

@java.lang.Override
public void processFinish(com.group02.guard.AsyncGetConnectivityData.Wrapper output) {
    mSsid = output.ssid;
    android.util.Log.d("processFinish", output.ssid);
    mIp = output.ip;
    android.util.Log.d("processFinish", output.ip);
    mNetworkpass = output.password;
    android.util.Log.d("processFinish", output.password);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    loadFromFile();
    adapter = new android.widget.ArrayAdapter<ca.ualberta.cs.lonelytwitter.Tweet>(this, R.layout.list_item, tweets);
    oldTweetsList.setAdapter(adapter);
    adapter.notifyDataSetChanged();
}

@java.lang.Override
public void onConfigurationChanged(final android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if (de.azapps.mirakel.helper.MirakelCommonPreferences.isTablet()) {
        setResult(de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailActivity.SWITCH_LAYOUT, de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailActivity.getIntent());
        de.azapps.mirakel.settings.model_settings.generic_list.GenericModelDetailActivity.finish();
    }
}

@java.lang.Override
public void onEventLongPress(com.alamkanak.weekview.WeekViewEvent event, android.graphics.RectF eventRect) {
    ShowDialog(event);
    events.remove(event);
    mWeekView.notifyDatasetChanged();
}

public void run() {
    applyToChildren(new com.artifex.mupdfdemo.ReaderView.ViewMapper() {
        @java.lang.Override
        void applyToView(android.view.View view) {
            ((com.artifex.mupdfdemo.MuPDFView) (view)).update();
        }
    });
}

@java.lang.Override
public void onClick(android.view.View v) {
    super.onClick(v);
    if ((v.getId()) == (R.id.btnSend)) {
        sendMessage();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment a = new ediger.diarynutrition.AddFoodDialog();
    a.setTargetFragment(this, ediger.diarynutrition.Fragments.tabs.FoodTab.REQ_CODE_ADD);
    a.show(getFragmentManager(), "add_dialog");
    getLoaderManager().getLoader(0).forceLoad();
}

@java.lang.Override
public void onDestroy() {
    android.widget.Toast.makeText(this, "SUCCESS DESTROY", Toast.LENGTH_LONG);
    super.onDestroy();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.os.Bundle args = getArguments();
    loadPage(args.getString(ru.yandex.money.android.fragments.WebFragment.KEY_URL), ru.yandex.money.android.utils.Bundles.readStringMapFromBundle(args.getBundle(ru.yandex.money.android.fragments.WebFragment.KEY_POST_DATA)));
}

@java.lang.Override
public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    mPaint.setColorFilter(colorFilter);
    invalidateSelf();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    mToolbar = ((android.support.v7.widget.Toolbar) (activity.findViewById(R.id.toolbar)));
}

@java.lang.Override
public void onError(com.quickblox.core.exception.QBResponseException e) {
    progress.dismiss();
    android.widget.Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
}

public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    getSupportActionBar().setTitle("Setari");
    invalidateOptionsMenu();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    if (favorite) {
        menu.getItem(1).setTitle("查看全部");
    }else {
        menu.getItem(1).setTitle("查看收藏");
    }
    return true;
}

@java.lang.Override
public void onDestroy() {
    try {
        super.onDestroy();
        mapFragment.removeOnTouchListeners();
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.platypii.baseline.MapActivity.TAG, "Exception in onDestroy", e);
    }
}

@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    returnPaletteAble();
    act.add(key, num);
    p.dismiss();
    return true;
}

@java.lang.Override
public void onSearchShopsSuccess(java.util.List<com.framgia.forder.data.model.Shop> shops) {
    android.support.v4.app.Fragment fragment = mAdapter.getFragment(SearchContainerAdapter.SearchResultsTab.TAB_SHOP);
    if (fragment instanceof com.framgia.forder.screen.searchshop.ShopSearchResultFragment) {
        ((com.framgia.forder.screen.searchshop.ShopSearchResultFragment) (fragment)).setShops(shops);
    }
}

public com.example.natis.hagana.Model.ClientUser getOneUser(java.lang.String uid) {
    android.util.Log.d("TEST", "1");
    return com.example.natis.hagana.Model.ClientUserSQL.getUser(modelSql.getReadableDatabase(), uid);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.i(com.example.android.uamp.ui.tv.MusicPlaybackOverlayFragment.TAG, "onCreate");
    super.onCreate(savedInstanceState);
    setFadingEnabled(false);
    setupRows();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onCreate");
    articleDBUtil = new com.tianyl.android.offlinereader.dao.ArticleDBUtil(this);
}

void onClick(android.view.View v, com.track.android.TrackData data);

@java.lang.Override
protected void onStart() {
    visible = true;
    super.onStart();
    android.util.Log.d(org.unchiujar.umbra.FogOfExplore.TAG, "onStart completed: Activity started");
}

@java.lang.Override
public void run() {
    android.util.Log.e(com.junhzhan.cal.widget.CalendarWidgetNew.TAG, "change current month");
    mAdapter.increment();
}

public void disconnect() {
    if ((_socket) != null) {
        try {
            _socket.close();
        } catch (java.lang.Exception ex) {
        }
        cancelDateTimer();
        _socket = null;
        android.util.Log.d(jwtc.android.chess.ics.ICSClient.TAG, "disconnect method");
    }
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng));
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle instanceState) {
    super.onSaveInstanceState(instanceState);
    stopQuizTimerCount();
    saveViewData(instanceState);
}

