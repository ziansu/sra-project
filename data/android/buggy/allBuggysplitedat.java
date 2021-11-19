private void saveToFile(java.io.File folder) {
    com.github.peejweej.androidsideloading.utilities.ShareManager.copyFile(new java.io.File(sideLoadInformation.getUri().getPath()), folder);
}

public com.mikepenz.iconics.IconicsDrawable color(int color) {
    mIconPaint.setAlpha(android.graphics.Color.alpha(color));
    mIconPaint.setColor(color);
    invalidateSelf();
    return this;
}

@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    android.util.Log.d("favoritesfrag update", "entered");
    this.detailsAdapter.notifyDataSetChanged();
    listView.setAdapter(detailsAdapter);
}

@java.lang.Override
public void onNext(com.infinote.differentthinking.infinote.models.base.UserContract value) {
    android.util.Log.d("HERE", "sdfhadsfg");
    view.notifySuccessful();
    view.showListNotesActivity();
}

@java.lang.Override
public com.mecuryli.xianxia.support.adapter.adapter.ReadingAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reading, null);
    final com.mecuryli.xianxia.support.adapter.adapter.ReadingAdapter.ViewHolder vh = new com.mecuryli.xianxia.support.adapter.adapter.ReadingAdapter.ViewHolder(itemView);
    return vh;
}

@org.testng.annotations.Test
public void useAppContext() throws java.lang.Exception {
    android.content.Context appContext = android.support.test.InstrumentationRegistry.getTargetContext();
    junit.framework.Assert.assertEquals("com.example.dellpc.wechat", appContext.getPackageName());
}

@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    mDbHelper.queryTable(table, contentArray);
    scrollLoading = false;
    de.greenrobot.event.EventBus.getDefault().postSticky(new com.projects.nosleepproject.events.FailedLoadEvent(contentArray));
    android.util.Log.e("getListings: ", "failed to get list");
}

public android.graphics.Bitmap getPhotoBitmap(android.content.ContentResolver contentResolver, android.net.Uri photoUri) throws java.io.IOException {
    android.graphics.Bitmap photo = MediaStore.Images.Media.getBitmap(contentResolver, photoUri);
    return photo;
}

@java.lang.Override
public void onGlobalLayout() {
    if ((mScreenChangedListener) != null) {
        getWindowVisibleDisplayFrame(mWindowRect);
        mScreenChangedListener.onScreenChanged((((mLastUiVisibility) != (android.view.View.SYSTEM_UI_FLAG_VISIBLE)) || ((mWindowRect.top) == 0)));
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        com.example.c4q_ac35.espy.FavoritesFragment.venueList = myFavoritesHelper.getVenueDao().queryForAll();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    myFavoritesHelper.close();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(com.codepath.apps.tweetter.TweetAdapter.context, "DMing...", Toast.LENGTH_SHORT).show();
}

@android.support.annotation.NonNull
public java.io.InputStream getStream(org.thoughtcrime.securesms.crypto.MasterSecret masterSecret, long id) throws java.io.IOException {
    final byte[] cached = cache.get(id);
    return cached != null ? new java.io.ByteArrayInputStream(cached) : new org.thoughtcrime.securesms.crypto.DecryptingPartInputStream(getFile(id), masterSecret);
}

@java.lang.Override
public void onCompleted(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo, net.gotev.uploadservice.ServerResponse serverResponse) {
    attach.hasUpload = true;
    cb.success();
}

@java.lang.Override
public void onClick(android.view.View v) {
    basic.zhenyuan0502.nguyenlt.armstore.global.GlobalFunction.setNumberOfItem(rowView.getRootView().getContext(), position);
    arrayCart.notifyAll();
}

@java.lang.Override
public void run() {
    for (android.support.v4.widget.SwipeRefreshLayout current : com.zigapk.gimvic.suplence.Main.swipeRefreshLayouts) {
        current.setRefreshing(state);
    }
    if (state)
        android.support.design.widget.Snackbar.make(com.zigapk.gimvic.suplence.Main.coordinatorLayout, R.string.refreshed, Snackbar.LENGTH_SHORT).show();
    
}

public void DoDraw(android.graphics.Canvas c) {
    c.save();
    listener.drawing(c);
    c.restore();
}

private void changeToMenu() {
    android.content.Intent i = new android.content.Intent(this, com.phil.whisha.Activitys.ActivityMenu.class);
    startActivity(i);
}

@java.lang.Override
public java.lang.CharSequence[] getAutofillOptions() {
    android.util.Log.i("POSITION", "getAutofillOptions: ");
    return new java.lang.CharSequence[0];
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    com.app.deemounus.musiccards.MainActivity mainActivity = ((com.app.deemounus.musiccards.MainActivity) (getActivity()));
    ismTwoPane = mainActivity.ismTwoPane();
}

@java.lang.Override
public void onGroupExpand(int groupPosition) {
    android.widget.Toast.makeText(getApplicationContext(), ((expandableListTitle.get(groupPosition)) + " List Expanded."), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.list_credits);
}

public void addBitmap(java.lang.String key, android.graphics.Bitmap bitmap) {
    addBitmapToMemoryCache(key, bitmap);
    addBitmapToDiskCache(key, bitmap);
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    mCameraModel = new com.yydcdut.note.camera.model.camera.CameraModel(getApplicationContext(), holder, mCategoryId);
    mCameraModel.onCreate(this);
    mCameraModel.openCamera(mCameraId, mCameraRotation);
}

private android.content.Context getContext() {
    return context;
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if ((getActivity()) instanceof com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) {
        subscriberListFragmentActions = ((com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) (context));
    }
}

public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    switch (keyCode) {
        case android.view.KeyEvent.KEYCODE_BACK :
            android.content.Intent intent = new android.content.Intent(this, com.system.dormitory.dormitory_system_android.activity_main.Manager.Activity_Manager_Rental.class);
            startActivity(intent);
            finish();
            return false;
        default :
            return false;
    }
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    com.example.marinex.gittrendapp.HttpHandler sh = new com.example.marinex.gittrendapp.HttpHandler();
    jsonStr = sh.makeServiceCall(url);
    android.util.Log.e(TAG, ("Response from url: " + (jsonStr)));
    return null;
}

@java.lang.Override
public void finish() {
    super.finish();
    overridePendingTransition(0, android.R.anim.fade_out);
    com.videobox.main.DownloadTubeRecomActivity.launch(mContext);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void addFragment(android.support.v4.app.Fragment fragment, int stringResource) {
    com.framgia.fpoll.util.ActivityUtil.addFragmentToActivity(getSupportFragmentManager(), fragment, R.id.frame_layout);
    setTitle(stringResource);
}

@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.d(MovieApplication.TAG, ((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "onStop()"));
    bus.unregister(this);
}

@java.lang.Override
public void onMakeReceivedProcessFinish() {
    android.content.Intent intent = getIntent();
    setResult(humane.vuram.com.humane.organisationgoodsdetail.RESULT_OK, intent);
    finish();
    hideProgress();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_osm_generator);
    if ((getIntent().getExtras()) != null) {
        extractData(getIntent().getExtras());
    }
}

public void onClick(android.view.View v) {
    if (!(com.meezo.eventtus.twittereventtus.ListOnLineFollowersActivity.waitingForRefresh))
        com.meezo.eventtus.twittereventtus.ListOnLineFollowersActivity.onLineFollowersListKeeper.forceRefresh();
    
}

public void updateScreen(android.graphics.Canvas canvas) {
    android.graphics.Paint paintBackground = new android.graphics.Paint();
    canvas.drawBitmap(mBackground, 0, 0, paintBackground);
    mNote.update(canvas);
    mScoreBar.update(canvas);
}

public void onClick(android.view.View v) {
    setResult(henrywei.henrywei_sizebook.RESULT_OK);
    setIntent(new android.content.Intent());
    finish();
}

@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    switch (checkedId) {
        case R.id.male :
            sexFactor = 1.0;
            android.util.Log.i("AppInfo", java.lang.String.valueOf(sexFactor));
            break;
        case R.id.female :
            sexFactor = 0.9;
            break;
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            drawerLayout.openDrawer(GravityCompat.START);
            onBackPressed();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

private org.adaptlab.chpir.android.participanttracker.models.ParticipantType getParticipantType() {
    int participantTypeId = getArguments().getInt(org.adaptlab.chpir.android.participanttracker.ParticipantListActivity.ParticipantListFragment.ARG_SECTION_NUMBER, 0);
    org.adaptlab.chpir.android.participanttracker.models.ParticipantType participantType = org.adaptlab.chpir.android.participanttracker.models.ParticipantType.getAll().get(participantTypeId);
    return participantType;
}

public void logout(android.view.View view) {
    com.parse.ParseUser.getCurrentUser().logOut();
    android.content.Intent intent = new android.content.Intent(this, com.blueit.g1_chat.LoginActivity.class);
    startActivity(intent);
}

public void addFooterView(android.view.View view) {
    mFooterView = view;
    mGloriousAdapter.notifyItemInserted(((mGloriousAdapter.getItemCount()) - 1));
}

@java.lang.Override
public void onAnimationUpdate(com.nineoldandroids.animation.ValueAnimator animation) {
    float alpha = ((float) (animation.getAnimatedValue()));
    mHeaderColorIsChanging = alpha != 0;
    changeHeaderBarColor(alpha);
}

private void changeState(@de.wackernagel.android.sidekick.widgets.CircularRevealView.State
int newState) {
    if ((state) == newState) {
        return ;
    }
    state = newState;
    if ((stateChangeListener) != null) {
        stateChangeListener.onStateChange(newState);
    }
}

@java.lang.Override
public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
    super.onSignalStrengthsChanged(signalStrength);
    statusView.setSignalStrength(((int) ((signalStrength.getGsmSignalStrength()) / 7.75)));
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(context, getString(R.string.slow_connectivity), Toast.LENGTH_LONG).show();
    tv_Gauge_TextView_PsuedoButton.setClickable(true);
}

private void updatePortActionHandler(android.content.Intent intent) {
    int port = intent.getIntExtra(WifiP2pService.INTENT_EXTRA_REGISTRATION_PORT, 0);
    if (port == 0) {
        ip = "";
    }
    wifiP2pActivity.setPort(port);
}

public void slideshowSpeedChanged(int newSpeed) {
    android.widget.Toast.makeText(this, ("speed = " + newSpeed), Toast.LENGTH_SHORT).show();
    asbridge.me.uk.MPhoto.helper.Utils.setSlideshowDelay(this, newSpeed);
}

public void onClickFinalize(android.view.View view) {
    android.content.Intent newIntent = new android.content.Intent(getApplicationContext(), pinkteampdm.farmerhelper.PlantActivity.class);
    newIntent.putExtra("cultures", insertedCulturesArray);
    newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(newIntent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.io.File oldFile = new java.io.File(keepFileName);
    oldFile.renameTo(file);
    fragmentMedia.close();
    fragmentMedia.open(file.getPath());
    keepFileName = null;
}

@java.lang.Override
public void onReceivedLoginRequest(android.webkit.WebView view, java.lang.String realm, java.lang.String account, java.lang.String args) {
    new com.github.takahirom.zerobrowser.webview.DeviceAccountLogin(mWebViewController.getActivity(), view, this, mWebViewController).handleLogin(realm, account, args);
}

private boolean canChildDragDown() {
    ensureTarget();
    boolean result = android.support.v4.view.ViewCompat.canScrollVertically(mTarget, (-1));
    return result;
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.i(LOG_TAG, "destroying...");
    stopForeground(true);
}

@java.lang.Override
public void writeToParcel(final android.os.Parcel out, final int flags) {
    out.writeSerializable(direction);
    super.writeToParcel(out, flags);
}

@java.lang.Override
public void onSecondaryViewAppeared(final com.innovativetech.audio.audiobookmaster.fabreveallayout.FABRevealLayout fabRevealLayout, android.view.View secondaryView) {
    showSecondaryViewItems();
    if ((mMediaPlayer) == null) {
        initializeMediaPlayer();
    }
    if (!(mMediaPlayer.isPlaying())) {
        mMediaPlayer.start();
    }
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    this.mContext = context;
}

@java.lang.Override
public void peerDeviceListUpdated(java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> deviceList) {
    jobSocketListener.peerListUpdated(deviceList);
    if (com.minhld.multihop.supports.Utils.getConfig("role").equals("server")) {
        return ;
    }
}

@java.lang.Override
public void onSwipeRight(android.support.v7.widget.RecyclerView recyclerView, int[] dismissedItems) {
    if ((dismissedItems != null) && ((dismissedItems.length) > 0)) {
        handleAcceptDecline(true, 0);
    }
}

public void logout(android.view.View view) {
    com.facebook.login.LoginManager.getInstance().logOut();
    android.content.Intent login = new android.content.Intent(this, com.example.friends.fitfriend.LoginActivity.class);
    startActivity(login);
    finish();
}

private int dip2px(android.content.Context context, float dpValue) {
    final float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((dpValue * scale) + 0.5F));
}

private void log(java.lang.String msg) {
    java.lang.String format = "pos[%s], pages[%s] %s";
    java.lang.String text = java.lang.String.format(format, mPosition, com.shopgun.android.sdk.pageflip.utils.PageflipUtils.join(",", mPages), msg);
    com.shopgun.android.sdk.log.SgnLog.d(com.shopgun.android.sdk.pageflip.CatalogPageFragment.TAG, text);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        currentFragment = new advancedui.android.bootcamp.end.advancedui.FragmentWillBeContent();
        return new advancedui.android.bootcamp.end.advancedui.FragmentWillBeContent();
    }else {
        return new advancedui.android.bootcamp.end.advancedui.FragmentThereWasContentContent();
    }
}

public android.graphics.Bitmap getFromCache(java.lang.String filename) {
    java.io.File path = new java.io.File(directory, filename);
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    return android.graphics.BitmapFactory.decodeFile(path.getAbsolutePath(), options);
}

private android.graphics.Bitmap getScreenShot() {
    return getScreenShot(tolomet.getWindow().getDecorView().findViewById(android.R.id.content));
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    com.utama.madtodo.models.LocalRemoteTodo.setupPersistence(getActivity());
    if (key.equals("offlineMode")) {
        setupOfflineModePreferenceDependencies();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(null, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.options_menu, menu);
    menu.removeItem(R.id.item_goto_move);
    return true;
}

public void addButton(int id, java.lang.String description) {
    android.widget.RadioButton radioButton = getNewButton();
    radioButton.setId(id);
    radioButton.setContentDescription(description);
    addButton(radioButton);
}

@java.lang.Override
protected void bindImpl() {
    getContext().bindService(createServiceIntent().setAction(IpcConstant.ACTION_CLIENT_MANAGER), (mClientManagerConn = new com.heaven7.android.ipc.MessageClient.ClientManagerConnectionImpl()), Context.BIND_AUTO_CREATE);
    super.bindImpl();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.floatingActionButton :
            getData();
    }
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    isLock = false;
    list.remove(position);
    animationGridViewAdapter.removeItem(0).commit();
}

@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.soomla.profile.SoomlaProfile.getInstance().getSocialController().logout(mProvider);
    } catch (com.soomla.profile.exceptions.ProviderNotFoundException e) {
        e.printStackTrace();
    }
    updateUIOnLogout();
}

@java.lang.Override
public void onClick(android.view.View v) {
    int current = getItem((-1));
    if (current > 0) {
        viewPager.setCurrentItem(current);
    }
}

public void withMaxResultSize(@android.support.annotation.IntRange(from = 100)
int width, @android.support.annotation.IntRange(from = 100)
int height) {
    mOptionBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_SET, true);
    mOptionBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_X, width);
    mOptionBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_Y, height);
}

@java.lang.Override
public void run() {
    try {
        applyGlobalContent(false, view, activity);
        android.support.design.widget.Snackbar.make(view, "Updated special date!", Snackbar.LENGTH_SHORT).show();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    java.lang.System.out.println("ConfirmationActivity : onActivityResult");
    if (com.simplify.android.sdk.Simplify.handleAndroidPayResult(requestCode, resultCode, data)) {
        return ;
    }
    super.onActivityResult(requestCode, resultCode, data);
}

@java.lang.Override
public void run() {
    player.markCurrentSong(DoubanAPI.OP_MARK_AS_LIKE);
    mine.android.api.ContextAPI.makeToast("已标记为喜欢");
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onConfigurationChanged");
}

@java.lang.Override
public void onTaskViewDismissed(com.android.systemui.recents.model.Task t) {
    com.android.systemui.recents.model.RecentsTaskLoader loader = com.android.systemui.recents.model.RecentsTaskLoader.getInstance();
    loader.deleteTaskData(t, false);
    loader.getSystemServicesProxy().removeTask(t.key.id);
    updateMemoryStatus();
}

@android.annotation.SuppressLint(value = "NewApi")
@android.support.annotation.RequiresPermission(value = Manifest.permission.USE_FINGERPRINT)
public final boolean areFingerprintsEnrolled() {
    if ((fingerprintManager) != null) {
        return fingerprintManager.hasEnrolledFingerprints();
    }else {
        return false;
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.salesforce.androidsdk.reactnative.app.SalesforceReactSDKManager.initReactNative(getApplicationContext(), new com.salesforce.samples.smartsyncexplorerreactnative.ReactNativeKeyImpl(), com.salesforce.samples.smartsyncexplorerreactnative.MainActivity.class);
}

public void postGame(android.view.View v) {
    if (load) {
        android.content.Intent i = new android.content.Intent(this, com.example.recleague.PostGame.class);
        startActivity(i);
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString("messageDraft", message.getText().toString());
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    if ((uk.ac.abertay.firedroidpager.SQLDatabaseHelper.DBVER) > 1) {
        db.execSQL(("DROP IF TABLE EXISTS " + (uk.ac.abertay.firedroidpager.SQLDatabaseHelper.TABLE_NAME)));
    }
}

private void initializeInjector() {
    this.activityComponent = getApplicationComponent().plus(new cat.xlagunas.andrtc.di.modules.ActivityModule(this));
    activityComponent.inject(this);
    android.util.Log.d(cat.xlagunas.andrtc.view.activity.LoginActivity.TAG, ("CallbackManager " + (callbackManager.toString())));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    showSpinnerDialog();
    randomNumber2to10 = (nyc.c4q.ashiquechowdhury.androidnekoproject.util.RandomNumberChooser.chooseRandomNumber(8)) + 2;
}

@java.lang.Override
public void onBackPressed() {
    drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        super.onBackPressed();
    }
}

private synchronized void actionPause() {
    pauseActiveElements();
    mState = com.android.mms.dom.smil.SmilPlayer.SmilPlayerState.PAUSED;
    mAction = com.android.mms.dom.smil.SmilPlayer.SmilPlayerAction.NO_ACTIVE_ACTION;
    notifyPlayStateChangeListener();
}

private void scanInternalSubtitleTracks() {
    if ((mSubtitleController) == null) {
        android.util.Log.d(android.media.MediaPlayer.TAG, "setSubtitleAnchor in MediaPlayer");
        setSubtitleAnchor();
    }
    populateInbandTracks();
    if ((mSubtitleController) != null) {
        mSubtitleController.selectDefaultTrack();
    }
}

@java.lang.Override
public void onPlaceSelected(com.google.android.gms.location.places.Place place) {
    vacationLatitude = place.getLatLng().latitude;
    vacationLongitude = place.getLatLng().longitude;
    android.util.Log.i(com.example.kevin.wear_where.MainActivity.TAG, ("Place: " + (place.getName())));
}

private com.visenze.visearch.android.ResultList getResult(java.lang.String jsonResponse) {
    com.visenze.visearch.android.ResultList resultList = null;
    try {
        resultList = com.visenze.visearch.android.util.ResponseParser.parseResult(jsonResponse);
    } catch (com.visenze.visearch.android.ViSearchException exception) {
        exception.printStackTrace();
    }
    return resultList;
}

public void clearKeyguardWallpaper() {
    if (com.android.server.wallpaper.WallpaperManagerService.DEBUG)
        android.util.Slog.v(com.android.server.wallpaper.WallpaperManagerService.TAG, "clearWallpaper");
    
    synchronized(mLock) {
        clearKeyguardWallpaperLocked(android.os.UserHandle.getCallingUserId(), null);
    }
}

public void showDialogInitializingCommandPlayer(final android.app.Activity uiContext, boolean warningNoneProvider) {
    showDialogInitializingCommandPlayer(uiContext, warningNoneProvider, null, true);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mSettings.setShowImeWithHardKeyboard(isChecked);
    hideInputMethodMenu();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_delete_from_trash :
            handleRemoveFromTrashAction();
        case R.id.action_restore_from_trash :
            handleRestoreFromTrashAction();
            break;
    }
    return true;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    com.facebook.Session session = com.facebook.Session.getActiveSession();
    com.facebook.Session.saveSession(session, outState);
    com.kii.cloud.storage.Kii.onSaveInstanceState(outState);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.example.guest.coffeeShop.ui.CoffeeShopDetailFragment.newInstance(mCoffeeShops, position);
}

@java.lang.Override
public void onFingerprintDialogVerifyPassword(com.aitorvs.android.fingerlock.FingerprintDialog fingerprintDialog, java.lang.String s) {
    android.widget.Toast.makeText(this, "onFPDverifyPassword", Toast.LENGTH_SHORT).show();
}

protected void onCancelPressed(android.view.View view) {
    android.util.Log.d("Edit", "Cancel User Profile");
    finish();
}

@java.lang.Override
public void onError(java.lang.Exception e) {
    android.widget.Toast.makeText(getApplicationContext(), "Error fetching data", Toast.LENGTH_SHORT).show();
}

private void initLauncherChildren(android.view.View launcher) {
    icList = ((android.support.v7.widget.RecyclerView) (launcher.findViewById(R.id.ic_list)));
    trigger = ((android.widget.ImageView) (launcher.findViewById(R.id.touch_trigger)));
    initIconList();
    initTrigger();
}

