public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    startDetailsActivity(listOfTreatments.get(position).get_Id());
}

public void onClick(android.content.DialogInterface dialog, int id) {
    fragment.topic.tDatabaseReference.child(ui.TopicActivity.topicId).removeValue();
    android.content.Intent i = new android.content.Intent(ui.TopicActivity.AlertFragment.context, ui.TopicActivity.AlertFragment.okClass);
    com.deaspostudios.devchats.MainActivity.navItemIndex = 1;
    startActivity(i);
}

@java.lang.Override
public void onClick(android.view.View view) {
    org.swain.asa.famous_pres_speeches.Controller.PlaybackController.loadPlayerScreen(currentActivity, c, currentSpeech.getOrator().getFullName(), currentSpeech.getTitle());
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View arg1, int arg2, long arg3) {
    if (com.mk4droid.IMC_Activities.Fragment_NewIssueA.flagStarter) {
        com.mk4droid.IMC_Activities.Fragment_NewIssueA.flagStarter = false;
    }else {
        com.mk4droid.IMC_Activities.Fragment_NewIssueA.spPosition = arg2;
    }
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    mBottomBar.onSaveInstanceState(outState);
}

@java.lang.Override
protected void onStop() {
    android.util.Log.e(com.example.user.edeasy.Welcome.TAG, "onStop");
    super.onStop();
    if ((authStateListener) != null)
        auth.removeAuthStateListener(authStateListener);
    
    detachDatabaseListeners();
}

public void stopLoading() {
    android.app.ActionBar actionBar = getActivity().getActionBar();
    if (actionBar != null) {
        actionBar.setSubtitle(null);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    butterknife.ButterKnife.bind(this);
    com.bionic.kvt.serviceapp.db.DbUtils.createUserTableIfNotExist();
    com.bionic.kvt.serviceapp.helpers.HeaderHelper headerHelper = new com.bionic.kvt.serviceapp.helpers.HeaderHelper(this);
    headerHelper.setHeader();
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    viewPager.setCurrentItem(0);
    return true;
}

@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(MasterDetailOuterFragment.ARG_ITEM_ID)) {
        getLoaderManager().initLoader(nl.adaptivity.process.ui.task.TaskDetailFragment.LOADER_TASKITEM, getArguments(), this);
    }
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_configuration);
    auth = com.google.firebase.auth.FirebaseAuth.getInstance();
    database = com.google.firebase.database.FirebaseDatabase.getInstance();
    butterknife.ButterKnife.bind(this);
}

public void addFooterView(android.view.View footer) {
    mNextLoadEnable = false;
    if (footer == null) {
        throw new java.lang.RuntimeException("footer is null");
    }
    this.mFooterView = footer;
    this.notifyDataSetChanged();
}

public static void storeRecipientId(android.content.Context context, java.lang.String recipientId) {
    android.content.SharedPreferences sharedPreferences = com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(com.silverpop.engage.config.EngageConfig.SharedProperties.RECIPIENT_ID.toString(), recipientId).commit();
}

@java.lang.Override
public void onPreviewFrame(byte[] bytes, android.hardware.Camera camera) {
    com.futsal.manager.LogModule.LogManager.PrintLog("CameraRecordProcess", "onPreviewFrame", "Getting Video Frame Image Data", DefineManager.LOG_LEVEL_INFO);
}

@java.lang.Override
public int onTileAdded() {
    android.util.Log.d("QS", "Tile added");
    return android.service.quicksettings.TileService.TILE_MODE_ACTIVE;
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    this.fetchEmergencyDetails();
    this.sendSMSToNumber();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_my_favourite);
    mContext = this;
    mDataListener = this;
    super.onCreate(savedInstanceState);
    initLayout();
}

@java.lang.Override
public void onClick(android.view.View v) {
    popupWindow.dismiss();
    ((dynafios.trace.MainActivity) (getActivity())).restoreActivity();
}

public boolean isScreenSizeAtLeast(int screenSize) {
    int currentScreenSize = (android.support.test.InstrumentationRegistry.getContext().getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK);
    return currentScreenSize <= screenSize;
}

@java.lang.Override
public void onUpdateResult(org.wordpress.android.ui.reader.actions.ReaderActions.UpdateResult result) {
    if (!(isAdded())) {
        return ;
    }
    setIsUpdating(false, updateAction);
    if (result.isNewOrChanged()) {
        refreshPosts();
    }
}

public void play(android.content.Context context, cc.xiaoyuanzi.pianorobot.data.Staff staff) {
    play(context, cc.xiaoyuanzi.pianorobot.player.PlayerModelConvertor.getPlayStaffModel(staff));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    config.useAccelerometer = false;
    config.useCompass = false;
    initialize(new com.remnants.game.Remnants(), config);
}

void updateCommentList() {
    org.wordpress.android.ui.comments.CommentsListFragment listFragment = getListFragment();
    if (listFragment != null) {
        listFragment.updateComments(false);
        listFragment.setRefreshing(true);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSingleDocumentAnalyzer = ((net.gini.android.vision.screen.ScreenApiApp) (getApplication())).getSingleDocumentAnalyzer();
}

@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, com.nostra13.universalimageloader.core.assist.FailReason failReason) {
    imageView.setImageResource(R.drawable.notification_error);
    item.conError = true;
    item.save();
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
    if ((keyEvent.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK)) {
        clearFocus();
    }
    return false;
}

@java.lang.Override
public void onCreate() {
    android.util.Log.i("Information : ", "開啟打電話功能");
    android.telephony.TelephonyManager manager = ((android.telephony.TelephonyManager) (this.getSystemService(com.project.final_project.TELEPHONY_SERVICE)));
    manager.listen(phoneStateListener, phoneStateListener.LISTEN_CALL_STATE);
    super.onCreate();
}

private void finishTurn() {
    super.finishTurn(getNextParticipantId());
    android.util.Log.i(com.levigilad.javaplay.yaniv.YanivPlayFragment.TAG, "Turn Ended");
    mInstructionsTV.setText(R.string.games_waiting_for_other_player_turn);
}

public void deleteTable(java.lang.String milliIdentifier) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String SQL_DELETE_TABLE = ("DROP TABLE " + milliIdentifier) + ";";
    db.execSQL(SQL_DELETE_TABLE);
    db.close();
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    mMap.clear();
    circleOptions.radius((progress * 50));
    mMap.addCircle(circleOptions);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    if ((com.myandroid.popularmovies.fragments.MainActivityFragment.state) != null) {
        android.util.Log.v(LOG_TAG, "state != null");
        gridView.onRestoreInstanceState(com.myandroid.popularmovies.fragments.MainActivityFragment.state);
    }
}

@java.lang.Override
public void onAuthenticationHelp(int helpCode, java.lang.CharSequence helpString) {
    android.widget.Toast.makeText(this, "请重刷指纹", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View v = android.view.LayoutInflater.from(context).inflate(R.layout.recyclerview_sign_item_info, viewGroup, false);
    com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder nvh = new com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder(v);
    return nvh;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mClickListener.onClick();
}

private android.view.View setSystemUiVisilityMode() {
    android.view.View decorView = getWindow().getDecorView();
    int options;
    options = (android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    decorView.setSystemUiVisibility(options);
    return decorView;
}

int LAC() {
    return ((android.telephony.gsm.GsmCellLocation) (((android.telephony.TelephonyManager) (getSystemService(Context.TELEPHONY_SERVICE))).getCellLocation())).getLac();
}

public void glBufferData(int target, java.nio.ByteBuffer data, int usage) {
    com.jme3.renderer.android.AndroidGL.checkPosition(data);
    android.opengl.GLES20.glBufferData(target, com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data, usage);
}

private void setAnimation(android.view.View viewToAnimate, int position) {
    android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(viewToAnimate.getContext(), R.anim.scale_in);
    viewToAnimate.startAnimation(animation);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.i(com.shimastripe.gpsmountainview.MainActivity.TAG, "onStart");
    mGoogleApiClient.connect();
    android.util.Log.i(com.shimastripe.gpsmountainview.MainActivity.TAG, "Connect to Google Api");
}

public void sendGuidedPoint(com.o3dr.services.android.lib.coordinate.LatLong point, boolean force) {
    com.o3dr.android.client.apis.ControlApi.getApi(this).goTo(point, force);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.util.Log.v("a", "selected");
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    intent.setType("*/*");
    startActivityForResult(intent, com.example.pii5656.shadowingmanager.MainActivity.CHOSE_FILE_CODE);
    return true;
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    counter += event.values[0];
    android.widget.Toast.makeText(getApplicationContext(), ("STEP " + (counter)), Toast.LENGTH_SHORT).show();
    android.util.Log.d("SensorChange", "triggered");
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if (isDataSet) {
        com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(chosenTime);
    }else {
        com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(getResources().getText(R.string.tid_datum));
    }
}

@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    scrollLoading = false;
    de.greenrobot.event.EventBus.getDefault().postSticky(new com.projects.nosleepproject.events.FailedLoadEvent(new java.util.ArrayList<android.content.ContentValues>()));
    android.util.Log.e("getFrontpage: ", "failed to get front page");
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animator) {
    gameView.player.getCardsQueue().addFirst(GameConstants.NOT_A_CARD);
    gameView.player.updateOneMove();
    super.onAnimationStart(animator);
}

@java.lang.Override
protected void setResource(android.graphics.Bitmap resource) {
    android.support.v4.graphics.drawable.RoundedBitmapDrawable circularBitmapDrawable = android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory.create(mContext.getResources(), resource);
    circularBitmapDrawable.setCircular(true);
    homeVH.ivAuthor.setImageDrawable(circularBitmapDrawable);
}

public void addAll(java.util.ArrayList<com.dozuki.ifixit.model.guide.GuideInfo> list) {
    android.util.Log.d("GuideCreateActivity", "addall");
    mGuides.addAll(list);
    notifyDataSetChanged();
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase database) {
    nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(database).createTables();
}

@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem item) {
    android.util.Log.d("Reached", "Menu Collapse menu");
    dayAdapter.setFilter(talks);
    return true;
}

public void onClickTakeOff(android.view.View view) {
    sendCommand(de.hhn.munz.ardrone2.ATCommand.takeOff());
    networkLoop();
}

public synchronized boolean save(@android.support.annotation.NonNull
TTable model, com.raizlabs.android.dbflow.structure.database.DatabaseWrapper wrapper) {
    return save(model, getWritableDatabase(), modelAdapter.getInsertStatement(wrapper), new android.content.ContentValues());
}

private java.lang.String getContactName(android.database.Cursor contactLookupCursor) {
    java.lang.String name = null;
    if (contactLookupCursor.moveToFirst()) {
        name = contactLookupCursor.getString(contactLookupCursor.getColumnIndexOrThrow(ContactsContract.PhoneLookup.DISPLAY_NAME));
    }
    return name;
}

@java.lang.Override
public boolean onActionItemClicked(in.nashapp.epublibdroid.ActionMode mode, android.view.MenuItem item) {
    return true;
}

private java.lang.String getURL(android.content.Context ctx) {
    boolean isDebuggable = 0 != (ctx.getApplicationInfo().flags &= android.content.pm.ApplicationInfo.FLAG_DEBUGGABLE);
    if (isDebuggable) {
        return com.boha.golfpractice.library.util.OKUtil.DEV_URL;
    }else {
        return com.boha.golfpractice.library.util.OKUtil.PROD_URL;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    randomiseFortune();
    android.content.res.AssetManager am = this.getAssets();
}

@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
    android.support.multidex.MultiDex.install(this);
}

public static boolean shouldLoadMoreBars(android.app.Activity act) {
    return ((org.wordpress.android.ui.stats.StatsUtils.getSmallestWidthDP()) >= (org.wordpress.android.ui.stats.StatsUIHelper.TABLET_720DP)) || (((org.wordpress.android.ui.stats.StatsUtils.getSmallestWidthDP()) == (org.wordpress.android.ui.stats.StatsUIHelper.TABLET_600DP)) && (org.wordpress.android.ui.stats.StatsUIHelper.isInLandscape(act)));
}

public void regNoCheckDone(android.os.Bundle data) {
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    if (data.getBoolean("exists")) {
        mRegNo.setError("This Registration Number is already Registered.");
        mRegNo.requestFocus();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (superClassManager.saveSubject(subjectDialog, rootView, false, false, false)) {
        superClassManager.startNewDetailPage();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    butterknife.ButterKnife.bind(this);
    realm = io.realm.Realm.getDefaultInstance();
    loadVersionCode();
    checkIfUserIsLoggedIn();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}

@java.lang.Override
public void onNext(com.aniruddh.kubratest.API.Utils.apiModel.apiResponse response) {
    android.util.Log.i("Tag", "Tag");
    mUsers.add(response);
    mAdapter.setList(mUsers);
    mAdapter.notifyDataSetChanged();
}

public android.os.Parcelable getParent(android.os.Bundle state) {
    android.util.Log.e("Restore", baseKey);
    return state.getParcelable(((baseKey) + "$$SUPER"));
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main_activity_settings, menu);
    android.view.MenuItem item = menu.findItem(R.id.action_change_units);
    setDisplayModeMenuItemIcon(item);
    return true;
}

@java.lang.Override
public void onFailure(com.chalmers.tda367.localfeud.data.handler.DataResponseError error, java.lang.String errormessage) {
    imageButton.setImageResource(originalLikeDrawable);
    android.support.design.widget.Snackbar.make(recyclerView, getString(R.string.like_error_msg), Snackbar.LENGTH_LONG).show();
}

public static com.okhttplib.OkHttpUtil.Builder init(android.app.Application context) {
    com.okhttplib.OkHttpUtil.application = context;
    com.okhttplib.OkHttpUtil.application.registerActivityLifecycleCallbacks(new com.okhttplib.callback.BaseActivityLifecycleCallbacks());
    return com.okhttplib.OkHttpUtil.BuilderGlobal();
}

@java.lang.Override
protected android.webkit.WebView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    webView = reactContext;
    enableFileUpload(webView);
    return webView;
}

@java.lang.Override
void onError(java.lang.Throwable e) {
    android.util.Log.e(com.spartahack.spartahack17.Presenter.AnnouncementPresenter.TAG, e.toString());
    if (isViewAttached()) {
        getView().onError(e.toString());
    }
}

@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    super.onCancel(dialog);
    com.android.gallery3d.filtershow.FilterShowActivity activity = ((com.android.gallery3d.filtershow.FilterShowActivity) (mContext));
    activity.cancelCurrentFilter();
    activity.leaveSeekBarPanel();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    mFileDirectory = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
    super.onCreate(savedInstanceState);
}

@android.webkit.JavascriptInterface
public void stopRecording() {
    android.util.Log.e(org.innovationsforlearning.StudentPortal.MainActivity.TAG, "stop recording");
    audio.stopRecording();
    audio.startPlaying();
}

@java.lang.Override
public void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    if (!(this.paused)) {
        this.cacheView();
    }
}

@java.lang.Override
public com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View vi = inflater.inflate(R.layout.offers_list_item, null);
    com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder vh = new com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder(vi);
    return vh;
}

public int getFirstVisibleScrollPosition() {
    android.support.v7.widget.LinearLayoutManager layoutManager = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager()));
    int firstVisiblePosition = layoutManager.findFirstVisibleItemPosition();
    return firstVisiblePosition;
}

public static com.google.android.maps.GeoPoint coordinatesToGeoPoint(double latitude, double longitude) {
    return new com.google.android.maps.GeoPoint(new java.lang.Double((latitude * 1000000.0)).intValue(), new java.lang.Double((longitude * 1000000.0)).intValue());
}

@java.lang.Override
protected void onPreExecute() {
    setLocationStatus(org.wordpress.android.ui.posts.EditPostSettingsFragment.LocationStatus.SEARCHING);
    showLocationView();
}

@java.lang.Override
public void execute(android.os.Bundle bundle) {
    loadingMore = false;
    if ((skipMessages) != 0) {
        messagesListView.setSelection(0);
    }
    hideActionBarProgress();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle options = getIntent().getExtras();
    setBuilderOptions(options);
    this.finish();
}

public void setClaims(java.util.ArrayList<com.CMPUT301W15T02.teamtoapp.Model.Claim> claims) {
    this.claims = claims;
    android.util.Log.i("CLAIMSSET", "blah");
}

@java.lang.Override
public void onClick(android.view.View v) {
    mIsClick = true;
    int pos = ((int) (v.getTag()));
    highlight(pos);
    setCurrentItem(pos);
}

@java.lang.Override
public void onPageSelected(int position) {
    android.util.Log.d("myLogs", ("onPageSelected " + position));
    setCurrentPosition(position);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getSupportFragmentManager().beginTransaction().add(R.id.fragment, new com.weather.portiaprosampleweather.MainActivityFragment()).commit();
    setContentView(R.layout.activity_main);
}

private void sortByLocations(android.location.Location userLocation) {
    if (userLocation != null) {
        sortOrder = org.septa.android.app.models.SortOrder.LOCATION;
        returnedLocation = userLocation;
        mAdapter.sortByLocation(userLocation);
        removeSortOptions();
    }
}

private android.content.SharedPreferences getSharedPreferences() {
    android.content.SharedPreferences prefs = com.jana.android.core.app.AbstractApplication.getApplication().getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    return prefs;
}

public void onSongPrevious(android.view.View view) {
    musicService.previous();
    setPlayerTitleText();
}

@java.lang.Override
public void onMyError(com.android.volley.VolleyError err) {
    com.swjtu.walker.utils.L.v(com.swjtu.walker.activity.home.TAG, "请求失败");
    if ((proDialog) != null) {
        proDialog.dismiss();
    }
    mPullRefreshListView.setVisibility(View.GONE);
    networkErrorLayout.setVisibility(View.VISIBLE);
}

@com.facebook.react.uimanager.annotations.ReactProp(name = "title")
public void setTitle(com.reactlibrary.video.player.RCTVideoPlayer player, java.lang.String title) {
    android.util.Log.i("RCTVideoPlayer", ("set title " + title));
    player.getTitleTextView().setText(title);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (proceed)
        saveInformation();
    
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    @java.lang.SuppressWarnings(value = "VisibleForTests")
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    profile.setPhotoURI(downloadUrl.getPath());
    writeUser(profile);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    try {
        int totalOunces = java.lang.Integer.parseInt(editable.toString());
        mShipItem.setmOunces(totalOunces);
    } catch (java.lang.NumberFormatException e) {
        mShipItem.setmOunces(0);
    }
    updateViews();
}

@java.lang.Override
public void onClick(android.view.View view) {
    new com.example.margo.json.JSONDownloader(this, jsonURL, sp).execute();
}

public android.database.Cursor getTableCursorFromDB(java.lang.String tableName) {
    java.lang.String selectQuery = "SELECT * FROM " + tableName;
    com.mycompany.kittylogs.SQLiteDatabase db = this.getReadableDatabase();
    return db.rawQuery(selectQuery, null);
}

@java.lang.Override
public void onRefresh() {
    android.util.Log.d(name.parker.alon.viewerforgithub.view.InfoActivity.LOG_TAG, "PullToRefresh");
    swipeLayout.setRefreshing(false);
    loadData(true);
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
private void init() {
    setOrdering(com.volha.yandex.school.musicartists.ui.ORDERING_TOGETHER);
    addTransition(new android.transition.ChangeBounds()).addTransition(new android.transition.ChangeTransform()).addTransition(new android.transition.ChangeImageTransform());
}

protected native long createRenderer(long parent, android.view.Surface surface);

static long getMatchedMusicId(java.lang.Object musicInfo) {
    return ((long) (de.robv.android.xposed.XposedHelpers.callMethod(musicInfo, "getMatchedMusicId")));
}

private void freeMemory() {
    java.lang.System.runFinalization();
    java.lang.Runtime.getRuntime().gc();
    java.lang.System.gc();
    android.util.Log.e("Memory", "freeMemory executed...");
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    updateIntervalSettings.set(((java.lang.Integer) (newValue)));
    pirattoManager.refresh();
    return true;
}

private void startRun() throws java.lang.Exception {
    try {
        configure();
        android.util.Log.i(org.getlantern.lantern.service.LanternVpn.TAG, "Started VPN mode");
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.getlantern.lantern.service.LanternVpn.TAG, ("Error with VPN" + e));
    }
}

public static me.twango.twango.entity.User getInstance(android.content.Context context) {
    me.twango.twango.helper.DBHelper dbHelper = new me.twango.twango.helper.DBHelper(context);
    me.twango.twango.entity.User.me = dbHelper.getUser();
    return me.twango.twango.entity.User.me;
}

