@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.lang.System.out.println("yoooo");
    addPreferencesFromResource(R.xml.preferences);
    update_remove_interest_values();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.support.v4.app.ActivityCompat.requestPermissions(mActivity, new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE }, org.y20k.transistor.MainActivityFragment.PERMISSION_REQUEST_READ_EXTERNAL_STORAGE);
}

@java.lang.Override
public void onGeolocationPermissionsShowPrompt(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
    mWebChromeClient.onGeolocationPermissionsShowPrompt(origin, callback);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_chart);
    getSupportActionBar().setDisplayShowTitleEnabled(false);
    initFragments();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.login_help :
    }
    return false;
}

@java.lang.Override
public void afterDelivered(int smsId) {
    android.widget.Toast.makeText(this, "afterDelivered!", Toast.LENGTH_SHORT).show();
}

@org.junit.Test
public void shouldRenderZierIDTextView() {
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.idforclient)));
    junit.framework.Assert.assertNotNull(textView);
}

private void parseResTable() {
    this.table = new com.chris.pkg.manager.bean.android.resource.bean.ResChunkTable();
    parseResTableHeader();
    parseResPkg();
}

private void addLoadMore(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    if (isLoadMore()) {
        mLoadingMoreEnable = true;
        mRequestLoadMoreListener.onLoadMoreRequested();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    takePhoto();
    meta.setType("image");
}

public static void applyRegistered(android.content.Context context, boolean isRegistered) {
    io.soramitsu.iroha.IrohaApplication.getSharedPreferences(context).edit().putBoolean(io.soramitsu.iroha.IrohaApplication.SHARED_PREF_REGISTERED_KEY, isRegistered).apply();
}

@java.lang.Override
public void onFailure(int reasonCode) {
    android.widget.Toast.makeText(getApplicationContext(), "Peer Discovery not ready", Toast.LENGTH_SHORT).show();
    android.util.Log.d("WiFiDBC", "Peer Discovery not ready");
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    POIpath.setText("");
    POIpath.setHint(("Lägg till punkt nr " + ((listOfPath.size()) + 1)));
    addNewPOI();
}

@java.lang.Override
public void onLinkDisconnected() {
    if ((compListener) != null)
        compListener.onDisconnected();
    
    if (!(org.droidplanner.services.android.BuildConfig.SITL_DEBUG)) {
        controllerLinkManager.stop();
    }
    soloLinkMgr.stop();
}

@java.lang.Override
protected boolean onPostLight(final android.content.Intent request, final android.content.Intent response, final java.lang.String serviceId, final java.lang.String lightId, final java.lang.Integer color, final java.lang.Double brightness, final long[] flashing) {
    return sendLightRequest(serviceId, "POST", response);
}

private void initDependencyInjection() {
    component = com.wisdomlanna.www.dagger2_mvp_example.DaggerApplicationComponent.builder().androidModule(new com.wisdomlanna.www.dagger2_mvp_example.AndroidModule(this)).utilModule(new com.wisdomlanna.www.dagger2_mvp_example.UtilModule()).build();
    getComponent().inject(this);
}

public static final void e(java.lang.Object tag, java.lang.String msg) {
    android.util.Log.e(tag.getClass().getSimpleName(), ((com.llxx.socket.loger.Ll_Loger.LOG_BUILD) + msg));
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.d(TAG, error.toString());
    handler.onError(error.getMessage());
    progress.hide();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.eyeseetea.malariacare.database.utils.PreferencesState.getInstance().setContext(getApplicationContext());
    com.raizlabs.android.dbflow.config.FlowManager.init(this);
}

@java.lang.Override
protected void onPostExecute(java.util.ArrayList<fastrackm.nanodegree.udacity.abhis.popularmovies_s2.models.Movie> movieData) {
    if (movieData != null) {
        mAdapter.setMovieData(movieData);
    }else {
        android.util.Log.d(fastrackm.nanodegree.udacity.abhis.popularmovies_s2.MainActivity.TAG, "this failed terribly");
    }
}

public static synchronized taskr.se.taskr.repository.TaskRContentProviderImpl getInstance(android.content.Context context) {
    if ((taskr.se.taskr.repository.TaskRContentProviderImpl.instance) == null) {
        taskr.se.taskr.repository.TaskRContentProviderImpl.instance = new taskr.se.taskr.repository.TaskRContentProviderImpl(context, new taskr.se.taskr.repository.RefreshItemsListener() {
            @java.lang.Override
            public void refreshItems() {
            }
        });
    }
    return taskr.se.taskr.repository.TaskRContentProviderImpl.instance;
}

@java.lang.Override
public void onStopNestedScroll(android.view.View child) {
    super.onStopNestedScroll(child);
    if ((java.lang.Math.abs(swipeDistance)) >= (nich.work.aequorea.common.ui.widget.SwipeBackCoordinatorLayout.SWIPE_TRIGGER)) {
        swipeBack();
    }else {
        reset();
    }
}

public void getRouteSegment(android.location.net.osmand.Location loc, net.osmand.ResultMatcher<net.osmand.binary.RouteDataObject> result) {
    currentPositionHelper.getLastKnownRouteSegment(loc, result);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mRscpService.getSupportedFeature();
    mStateProgressBar.setVisibility(View.VISIBLE);
    mStateTextView.setText(com.example.android.bluetoothlegatt.RSCPActivity.EXEC);
}

@java.lang.Override
public harman.musicplayer.SongsAdapter.DataObjectHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
    harman.musicplayer.SongsAdapter.DataObjectHolder dataObjectHolder = new harman.musicplayer.SongsAdapter.DataObjectHolder(view);
    return dataObjectHolder;
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (mCellIsMobile)
        return ;
    
    mAboveItemId = INVALID_ID;
    mMobileItemId = INVALID_ID;
    mBelowItemId = INVALID_ID;
    mobileView.setVisibility(com.juztoss.dancemaker.views.VISIBLE);
    mHoverCell = null;
    setEnabled(true);
    invalidate();
}

public java.util.List<org.jraf.androidcontentprovidergenerator.model.Field> getFieldsIncludingJoins() {
    return getFieldsIncludingJoins(false, "");
}

public void onUpdate(boolean root, com.jecelyin.android.file_explorer.io.JecFile path);

@java.lang.Override
public void tearDown() throws java.lang.Exception {
    bbct.android.common.test.DatabaseUtil dbUtil = new bbct.android.common.test.DatabaseUtil(this.inst.getTargetContext());
    dbUtil.clearDatabase();
    super.tearDown();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.ContentValues headers = new android.content.ContentValues();
    headers.put("Authorization", "09703443d12cf0adf39e49f8048ea692dc3da55da2e6377dded3204dca6cc939895fd01cccdec573");
    com.gjuddy.easyhttprequest.GjuddyRequest.getInstance().setPersistentHeaders(headers);
}

public com.allen.library.LayoutParams getParams(com.allen.library.LayoutParams params) {
    if (params == null) {
        params = new android.widget.LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    }
    return params;
}

private void checkPreview() {
    if (android.provider.Settings.canDrawOverlays(this))
        preview.setChecked(true);
    else
        preview.setOnTouchListener(this);
    
}

protected void initLoader(android.os.Bundle bundle) {
    onStartLoading();
    au.com.pactera.pacterapulse.core.BaseFragment.getLoaderManager().initLoader(this.hashCode(), bundle, this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    viewPager.imageClick((position - 1));
}

@java.lang.Override
public void onResume() {
    android.util.Log.e("mainActivityFragment", "onResume :: start");
    mMoviesAdapter.notifyDataSetChanged();
    super.onResume();
}

protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDB();
    initParse();
    getLocalHighscore();
    setupUI();
    getScoreList();
}

private void setUpMapIfNeeded() {
    if ((mMap) == null) {
        mMap = ((com.google.android.gms.maps.MapFragment) (getFragmentManager().findFragmentById(R.id.map))).getMap();
    }
    setUpMap();
}

public void updateRecyclerAdapter(com.ringsterz.androidtextreader.db.DBHelper.PhraseCursor phraseCursor) {
    java.util.ArrayList<com.ringsterz.androidtextreader.model.Phrase> phrases = com.ringsterz.androidtextreader.util.CursorToListUtil.getPhraseList(phraseCursor);
    recyclerAdapter = new com.ringsterz.androidtextreader.adapter.RecyclerViewAdapter(phrases);
    recyclerView.setAdapter(recyclerAdapter);
}

@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    android.util.Log.e("inside do PostExecute", ("before if" + (trails.get(i).getDownlImage())));
    picture.setImageBitmap(trails.get(i).getDownlImage());
}

@java.lang.Override
public void onClick(android.view.View v) {
    drawView.setPaintMode(true);
    drawView.setEraseMode(true);
    v.setBackgroundResource(R.mipmap.ic_eraser_pressed);
    mPaintButton.setBackgroundColor(Color.TRANSPARENT);
    mHandButton.setBackgroundResource(R.mipmap.ic_hand);
}

@java.lang.Override
public void setAdapter(android.widget.Adapter adapter) {
    mAdapter = adapter;
    mCurrent = 0;
    requestLayout();
}

public static void notifyChanged() {
    for (pom.poly.com.tabatatimer.Utility.Observer observer : pom.poly.com.tabatatimer.ContentProvider.Eventinf.observers) {
        try {
            observer.update();
        } catch (java.lang.Exception exp) {
            android.util.Log.d("Eventinf.notifyChanged", exp.toString());
        }
    }
}

public com.amaze.filemanager.fragments.TabFragment getTabFragment() {
    android.support.v4.app.Fragment fragment = getContentFrameFragment();
    if ((fragment == null) || (!(fragment instanceof com.amaze.filemanager.fragments.TabFragment)))
        return null;
    else
        return ((com.amaze.filemanager.fragments.TabFragment) (fragment));
    
}

private void onLogInFailed() {
    android.widget.Toast.makeText(com.example.damian.projektgrupowy.App.getAppContext(), R.string.wrong_login_data, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    android.view.MenuItem menuItem = menu.findItem(R.id.action_day_view);
    menuItem.setChecked(true);
}

public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
    }
}

@java.lang.Override
public void onHostResume() {
    final android.app.Activity activity = getCurrentActivity();
    assert activity != null;
    activity.registerReceiver(receiver, new com.github.yamill.orientation.IntentFilter("onConfigurationChanged"));
}

@java.lang.Override
public void updateConversation(@org.jetbrains.annotations.NotNull
com.criptext.monkeykitui.conversation.MonkeyConversation conversation) {
    com.criptext.monkeychatandroid.models.ConversationItem conversationItem = ((com.criptext.monkeychatandroid.models.ConversationItem) (conversation));
    conversationItem.lastOpen = lastOpen;
    activeConversationItem.setTotalNewMessage(0);
    activeConversationItem.setSecondaryText(lastMessageText);
}

public void ocEODBack(android.view.View v) {
    popupWindow.dismiss();
    android.util.Log.i("Finished", tech.travis.poolpos.MainActivity.getMethodName());
}

public void onClick(final android.content.DialogInterface dialog, final int which) {
    _actMain.PrepareMediaPlayer(localurl);
}

public static com.hitec16.hiteshdemo.fragment.ListOfNews getInstance(java.lang.String tag) {
    com.hitec16.hiteshdemo.fragment.ListOfNews fragment = new com.hitec16.hiteshdemo.fragment.ListOfNews();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.hitec16.hiteshdemo.fragment.ListOfNews.TAG, tag);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dm.delete(allFiles[index]);
    updateFiles();
    dialog.dismiss();
    mDialog.dismiss();
}

public void onClick(com.example.utente.calcolaorauscita.DialogInterface dialog, int which) {
    if (which == (DialogInterface.BUTTON_POSITIVE)) {
        timePickerChoseTime = true;
        android.util.Log.v("", "Impostato il timepicker");
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case R.id.action_settings :
            settingsActivity();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

public void appendMsg(java.lang.String msg) {
    android.util.Log.i(TAG, (("MainActivity.appendMsg(" + msg) + ")"));
    mTextView.setText((((mTextView.getText()) + "\n") + msg));
}

public void updateData() {
    android.widget.GridView gridView = ((android.widget.GridView) (findViewById(R.id.gridview)));
    Adapter = new com.onelio.myuacloud.Apps.AdAdapter(getBaseContext(), data);
    gridView.setVisibility(View.VISIBLE);
    gridView.setAdapter(Adapter);
}

@java.lang.Override
public nanodegree.android.com.popularmoviesapp.model.Trailer getItem(int position) {
    return this.trailers.get((position + 1));
}

@android.support.annotation.CheckResult
com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(A1 arg);

public android.database.Cursor fetchAllUnCommonNames() {
    return database.query(balu.android.database.UnCommonNamesAdapter.DATABASE_TABLE_2, new java.lang.String[]{ balu.android.database.UnCommonNamesAdapter.UN_COMMON_NAME_ROWID , balu.android.database.UnCommonNamesAdapter.UN_COMMON_NAME , balu.android.database.UnCommonNamesAdapter.UN_COMMON_NAME_MEANING }, null, null, null, null, null);
}

private void onError(java.lang.String message) {
    android.util.Log.d(com.juztoss.rhythmo.audio.AdvancedMediaPlayer.class.toString(), "onErrorCalled");
    if ((mOnErrorListener) != null)
        mOnErrorListener.onError(message);
    
}

@java.lang.Override
public void onDidLoadView() {
    com.android.debug.hv.ViewServer.get(this).addWindow(this);
    setFullScreen();
    initMenu();
    initContentView();
    refreshListDataFromNet();
}

@java.lang.Override
public void onBackPressed() {
    this.finish();
    startActivity(new android.content.Intent(this, fuelfinder.mann.Activity.MapsActivity.class));
    return ;
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    com.liangmayong.qrcode.view.DecodeScanView.setCameraDisplayOrientation(activity, com.liangmayong.qrcode.camera.CameraManager.get().getCamera());
}

protected void onClosestAlertUpdate(android.location.Location currentLocation, put.sailhero.model.Alert alert) {
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if (context instanceof android.app.Activity) {
            doAttach(((android.app.Activity) (context)));
        }
    }
}

@com.squareup.otto.Subscribe
public void onCurrentLocation(today.gacha.android.services.GachaLocationService.CurrentLocationEvent event) {
    if (event.isSuccess()) {
        animateGoogleMapCamera(event.getLocation());
        return ;
    }
    android.util.Log.w(today.gacha.android.ui.MapsActivity.TAG, ("Request current location failed - " + (event.getThrowableMessage())));
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference anon, java.lang.Object val) {
    java.lang.Boolean disable = ((java.lang.Boolean) (val));
    if (disable.booleanValue()) {
        setTheme(R.style.AppTheme_Dark);
    }else {
        setTheme(R.style.anonTheme);
    }
    return false;
}

@java.lang.Override
public void done(java.util.List<com.royalplate.royalplate.data.KidsMenuParse> kidsItems, com.parse.ParseException e) {
    kidsmenuAdapter = new com.royalplate.royalplate.adapter.KidsMenuAdapter(this, kidsItems);
    android.util.Log.e("name", " pass kidsItem");
    listview.setAdapter(kidsmenuAdapter);
}

private void initView() {
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recycler_view)));
    mPresenter = new com.lxy.stock.presenter.StockPresenter();
}

public void seeAll(android.view.View view) {
    intent = new android.content.Intent(this, com.example.android.week05rachell.SecondActivity.class);
    intent.putExtra("avatar", avatar);
    intent.putExtra("BlogPosts", blogPostArrayList);
    startActivity(intent);
}

@java.lang.Override
public void onReadyForSpeech(android.os.Bundle params) {
    android.util.Log.d(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.TAG, "onReadyForSpeech");
    m_listener.onBeginningOfSpeech();
}

@java.lang.Override
public void run() {
    android.util.Log.i("EVENT :", "당겨서 새로고침 중...");
    scrap_folder_recyclerrefreshview.pullRefreshComplete();
    scrapfolderListAdapter.set_ScrapFolderList(scrapfolderData);
    init_scrap_folder_list();
    get_ScrapFolder_Data();
    scrap_folder_recyclerview.removeHeaderView(headerview);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        this.listener = ((com.urbanairship.richpush.sample.inbox.AbstractInboxFragment.Listener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.IllegalStateException(("Activities using AbstractInboxFragment must implement " + "the AbstractInboxFragment.Listener interface."));
    }
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.card_template_editor, menu);
    if (isStandardModel()) {
        menu.findItem(R.id.action_delete).setVisible(false);
    }
    super.onCreateOptionsMenu(menu, inflater);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    butterknife.ButterKnife.bind(this);
    setContentView(R.layout.user_registration);
    timber.log.Timber.v("Registration OnCreate");
}

@java.lang.Override
public void onClick(android.view.View view) {
    saveLostGameIfNecessary(layout);
    numberOfDigits = 2;
    reset(layout);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.hanani.android.drawer.FragmentFourOne.newInstance((position + 1));
        case 1 :
            return com.hanani.android.drawer.FragmentFourTwo.newInstance(position);
    }
    return null;
}

private void getFabricList() {
    mFabrics = com.geekeclectic.android.stashcache.StashData.get(this).getStashFabricList();
}

public void run() {
    android.util.Log.v(net.hokiegeek.android.dondeestas.data.Model.TAG, "Executor retrieving Following");
    new net.hokiegeek.android.dondeestas.data.Model.GetFollowingTask().execute(user.getFollowing());
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, tda367.myapplication.controller.ActivityInfo.class));
    learnJava.setCurrentLevel(getLevelId(v));
    java.lang.System.out.println((" " + (getLevelId(v))));
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    com.nosideracing.rchipremote.RemoteMain.json.deauthenticate();
    alarm.cancel(CheckMessagesPendingIntent);
    android.util.Log.d(Consts.LOG_TAG, "onDestroy: rchip");
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_stream, container, false);
    butterknife.ButterKnife.inject(app.rackdon.com.securitycam.StreamActivity.class, rootView);
    return rootView;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            com.cusnews.app.activities.TopicListActivity.showInstance(this);
            break;
        case 1 :
            com.cusnews.app.activities.CustomizedTopicsActivity.showInstance(this);
            break;
    }
    dialog.dismiss();
}

protected boolean onUndo(android.view.View view) {
    com.google.engedu.wordstack.LetterTile tile = placedTiles.pop();
    tile.moveToViewGroup(stackedLayout);
    return true;
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    showDeleteReminderDialog(position);
    return false;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.premiss);
    setContentView(R.layout.main);
    login = new com.androk.Login();
    android.view.View loginButton = findViewById(R.id.login_button);
    loginButton.setOnClickListener(this);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.example.rj.cryptodisplay.model.Hourly> call, java.lang.Throwable t) {
    android.util.Log.d("HELP", "ONFAILURE");
}

public void initLocation(android.location.Location location) {
    this.location = location;
    if (isResumed())
        setup();
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    retrieveDataFromLocalDatabase();
    setHasOptionsMenu(true);
    setRetainInstance(true);
}

private static net.sourceforge.clonekeenplus.Settings.SdcardAppPath get() {
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.KITKAT))
        return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Kitkat.Holder.sInstance;
    else
        if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.FROYO))
            return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Froyo.Holder.sInstance;
        else
            return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Dummy.Holder.sInstance;
        
    
}

@java.lang.Override
protected void onStop() {
    android.util.Log.i(softwarepoets.stldroid.STLView.TAG, "STLView onStop called.");
    mesh = null;
    super.onStop();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((getOnItemClickListener()) != null) {
        getOnItemClickListener().onItemClick(this, v, ((baseViewHolder.getLayoutPosition()) - (getHeaderLayoutCount())));
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.millennialmedia.android.MMSDK.initialize(this);
    setContentView(R.layout.activity_main);
    new com.skyweather.MainActivity.CallApi().execute();
}

public void addHeaderView(android.view.View header) {
    if (header == null) {
        throw new java.lang.RuntimeException("header is null");
    }
    this.mHeaderView = header;
    this.notifyDataSetChanged();
}

@java.lang.Override
public void onCaptureDone(int requestId) {
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onStillCaptureDone();
}

@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onServiceConnected(final android.content.ComponentName name, final android.os.IBinder service) {
    mService = ((diplom.jodoapp.LocalBinder<diplom.jodoapp.XMPPServiceConnection>) (service)).getService();
    mBounded = true;
    android.util.Log.d(diplom.jodoapp.LoginActivity.TAG, "onServiceConnected");
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    finish();
    java.lang.System.exit(0);
}

@java.lang.Override
protected void setInternalArguments(android.os.Bundle args) {
    super.setInternalArguments(args);
    args.putParcelable(de.aw.reports.DBDEFINITION, de.aw.reports.ReportSimpleDetails.tbd);
    args.putString(de.aw.reports.SELECTION, de.aw.reports.ReportSimpleDetails.selection);
    args.putIntArray(de.aw.reports.FROMRESIDS, fromResIDs);
}

@java.lang.Override
public void didEnterRegion(org.altbeacon.beacon.Region region) {
    android.util.Log.i(com.liferay.ldxdemo.app.ShopApplication.TAG, "I just saw an beacon for the first time!");
    com.liferay.ldxdemo.beacon.NotificationUtil.sendNotification(getApplicationContext());
}

@java.lang.Override
public void onBufferingUpdate(io.vov.vitamio.MediaPlayer mp, int percent) {
    android.util.Log.e(com.infthink.flintreceiver.receiver.MediaPlayerActivity.TAG, (("onBufferingUpdate:percent[" + percent) + "]"));
}

