public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    startDetailsActivity(listOfTreatments.get(position));
}

public void onClick(android.content.DialogInterface dialog, int id) {
    fragment.topic.tDatabaseReference.child(ui.TopicActivity.topicId).removeValue();
    android.content.Intent i = new android.content.Intent(ui.TopicActivity.AlertFragment.context, ui.TopicActivity.AlertFragment.okClass);
    startActivity(i);
}

@java.lang.Override
public void onClick(android.view.View view) {
    org.swain.asa.famous_pres_speeches.Controller.PlaybackController.loadPlayerScreen(currentActivity, currentSpeech.getOrator().getFullName(), currentSpeech.getTitle());
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View arg1, int arg2, long arg3) {
    com.mk4droid.IMC_Activities.Fragment_NewIssueA.spPosition = arg2;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    mBottomBar.onSaveInstanceState();
}

@java.lang.Override
protected void onStop() {
    android.util.Log.e(com.example.user.edeasy.Welcome.TAG, "onStop");
    super.onStop();
    detachDatabaseListeners();
}

public void stopLoading() {
    if ((getActivity()) != null) {
        android.app.ActionBar actionBar = getActivity().getActionBar();
        if (actionBar != null) {
            actionBar.setSubtitle(null);
        }
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    butterknife.ButterKnife.bind(this);
    com.bionic.kvt.serviceapp.helpers.HeaderHelper headerHelper = new com.bionic.kvt.serviceapp.helpers.HeaderHelper(this);
    headerHelper.setHeader();
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    viewPager.setCurrentItem(1, true);
    return true;
}

@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_configuration);
    auth = com.google.firebase.auth.FirebaseAuth.getInstance();
    database = com.google.firebase.database.FirebaseDatabase.getInstance();
    context = this;
    butterknife.ButterKnife.bind(this);
}

public void addFooterView(android.view.View footer) {
    mNextLoadEnable = false;
    this.mFooterView = footer;
    this.notifyDataSetChanged();
}

public static void storeRecipientId(android.content.Context context, java.lang.String recipientId) {
    com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context).edit().putString(com.silverpop.engage.config.EngageConfig.SharedProperties.RECIPIENT_ID.toString(), recipientId).commit();
}

@java.lang.Override
public void onPreviewFrame(byte[] bytes, android.hardware.Camera camera) {
}

@java.lang.Override
public void onTileAdded() {
    android.util.Log.d("QS", "Tile added");
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    this.fetchEmergencyDetails();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_my_favourite);
    mContext = this;
    super.onCreate(savedInstanceState);
    initLayout();
}

@java.lang.Override
public void onClick(android.view.View v) {
    popupWindow.dismiss();
    if (null != ((dynafios.trace.MainActivity) (getActivity()))) {
        ((dynafios.trace.MainActivity) (getActivity())).restoreActivity();
    }
}

public boolean isScreenSizeAtLeast(int screenSize) {
    int currentScreenSize = (android.support.test.InstrumentationRegistry.getContext().getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK);
    return currentScreenSize >= screenSize;
}

@java.lang.Override
public void onUpdateResult(org.wordpress.android.ui.reader.actions.ReaderActions.UpdateResult result) {
    if (!(isAdded())) {
        return ;
    }
    setIsUpdating(false, updateAction);
    if (result.isNewOrChanged()) {
        refreshPosts(false);
    }
}

public void play(cc.xiaoyuanzi.pianorobot.data.Staff staff) {
    play(cc.xiaoyuanzi.pianorobot.player.PlayerModelConvertor.getPlayStaffModel(staff));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    initialize(new com.remnants.game.Remnants(), config);
}

void updateCommentList() {
    org.wordpress.android.ui.comments.CommentsListFragment listFragment = getListFragment();
    if (listFragment != null) {
        listFragment.setRefreshing(true);
        listFragment.updateComments(false);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, com.nostra13.universalimageloader.core.assist.FailReason failReason) {
    item.conError = true;
    item.save();
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
    if ((keyEvent != null) && ((keyEvent.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK))) {
        clearFocus();
    }
    return false;
}

@java.lang.Override
public void onCreate() {
    android.util.Log.i("Information : ", "開啟打電話功能");
    super.onCreate();
}

private void finishTurn() {
    android.util.Log.i(com.levigilad.javaplay.yaniv.YanivPlayFragment.TAG, "Turn Ended");
    super.finishTurn(getNextParticipantId());
    mInstructionsTV.setText(R.string.games_waiting_for_other_player_turn);
}

public void deleteTable(java.lang.String milliIdentifier) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String SQL_DELETE_TABLE = ("DROP TABLE " + milliIdentifier) + ";";
    db.execSQL(SQL_DELETE_TABLE);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    circleOptions.radius((progress * 50));
}

@java.lang.Override
public void onResume() {
    super.onResume();
    if ((com.myandroid.popularmovies.fragments.MainActivityFragment.state) != null) {
        gridView.onRestoreInstanceState(com.myandroid.popularmovies.fragments.MainActivityFragment.state);
    }
}

@java.lang.Override
public void onAuthenticationHelp(int helpCode, java.lang.CharSequence helpString) {
    android.widget.Toast.makeText(this, helpString, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View v = android.view.LayoutInflater.from(context).inflate(R.layout.recyclerview_sign_item_info, viewGroup, false);
    com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder nvh = new com.wenjiehe.xingji.RecyclerViewAdapter.NewsViewHolder(v, i);
    return nvh;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mClickListener.onClick(0, 0);
}

private android.view.View setSystemUiVisilityMode() {
    android.view.View decorView = getWindow().getDecorView();
    int options;
    options = android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
    decorView.setSystemUiVisibility(options);
    return decorView;
}

int LAC() {
    return ((android.telephony.gsm.GsmCellLocation) (((android.telephony.TelephonyManager) (c.getSystemService(Context.TELEPHONY_SERVICE))).getCellLocation())).getLac();
}

public void glBufferData(int target, java.nio.ByteBuffer data, int usage) {
    android.opengl.GLES20.glBufferData(target, com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data, usage);
}

private void setAnimation(android.view.View viewToAnimate) {
    android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(viewToAnimate.getContext(), R.anim.scale_in);
    viewToAnimate.startAnimation(animation);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.i(com.shimastripe.gpsmountainview.MainActivity.TAG, "onStart");
    android.util.Log.i(com.shimastripe.gpsmountainview.MainActivity.TAG, "Connect to Google Api");
    mGoogleApiClient.connect();
}

public void sendGuidedPoint(com.o3dr.services.android.lib.coordinate.LatLong point, boolean force) {
    com.o3dr.android.client.apis.ControlApi.getApi(this).goTo(point, force, null);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    intent.setType("*/*");
    startActivityForResult(intent, com.example.pii5656.shadowingmanager.MainActivity.CHOSE_FILE_CODE);
    return true;
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    counter += event.values[0];
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if (isDataSet) {
        com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(chosenTime);
    }else {
        com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(null);
    }
}

@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    scrollLoading = false;
    de.greenrobot.event.EventBus.getDefault().postSticky(new com.projects.nosleepproject.events.FailedLoadEvent(new java.util.ArrayList<android.content.ContentValues>()));
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animator) {
    super.onAnimationStart(animator);
}

@java.lang.Override
protected void setResource(android.graphics.Bitmap resource) {
    android.support.v4.graphics.drawable.RoundedBitmapDrawable circularBitmapDrawable = android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory.create(homeVH.ivAuthor.getContext().getResources(), resource);
    circularBitmapDrawable.setCircular(true);
    homeVH.ivAuthor.setImageDrawable(circularBitmapDrawable);
}

public void addAll(java.util.ArrayList<com.dozuki.ifixit.model.guide.GuideInfo> list) {
    mGuides.addAll(list);
    notifyDataSetChanged();
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase database) {
    nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(database).createTables();
    if (database == null) {
    }
}

@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem item) {
    dayAdapter.setFilter(talks);
    return true;
}

public void onClickTakeOff(android.view.View view) {
    sendCommand(de.hhn.munz.ardrone2.ATCommand.takeOff(), false);
}

public synchronized boolean save(@android.support.annotation.NonNull
TTable model, com.raizlabs.android.dbflow.structure.database.DatabaseWrapper wrapper) {
    return save(model, wrapper, modelAdapter.getInsertStatement(wrapper), new android.content.ContentValues());
}

private java.lang.String getContactName(android.database.Cursor contactLookupCursor) {
    java.lang.String name = null;
    if ((null != contactLookupCursor) && (contactLookupCursor.moveToFirst())) {
        name = contactLookupCursor.getString(contactLookupCursor.getColumnIndexOrThrow(ContactsContract.PhoneLookup.DISPLAY_NAME));
    }
    return name;
}

@java.lang.Override
public boolean onActionItemClicked(in.nashapp.epublibdroid.ActionMode mode, android.view.MenuItem item) {
    return false;
}

private java.lang.String getURL(android.content.Context ctx) {
    boolean isDebuggable = 0 != (ctx.getApplicationInfo().flags &= android.content.pm.ApplicationInfo.FLAG_DEBUGGABLE);
    if (isDebuggable) {
        return com.boha.golfpractice.library.util.OKUtil.PROD_URL;
    }else {
        return com.boha.golfpractice.library.util.OKUtil.PROD_URL;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    randomiseFortune();
}

@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
}

public static boolean shouldLoadMoreBars() {
    return (org.wordpress.android.ui.stats.StatsUtils.getSmallestWidthDP()) >= (org.wordpress.android.ui.stats.StatsUIHelper.TABLET_720DP);
}

public void regNoCheckDone(android.os.Bundle data) {
    if (data.getBoolean("exists")) {
        mRegNo.setError("This Registration Number is already Registered.");
        mRegNo.requestFocus();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (superClassManager.saveSubject(subjectDialog, rootView, false, true, false)) {
        superClassManager.startNewDetailPage();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    butterknife.ButterKnife.bind(this);
    realm = io.realm.Realm.getDefaultInstance();
    checkIfUserIsLoggedIn();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mapFragment.getMapAsync(this);
}

@java.lang.Override
public void onNext(java.util.List<com.aniruddh.kubratest.API.Utils.apiModel.apiResponse> response) {
    android.util.Log.i("Tag", "Tag");
    mAdapter.setList(response);
    mAdapter.notifyDataSetChanged();
}

public android.os.Parcelable getParent(android.os.Bundle state) {
    return state.getParcelable(((baseKey) + "$$SUPER"));
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    return true;
}

@java.lang.Override
public void onFailure(com.chalmers.tda367.localfeud.data.handler.DataResponseError error, java.lang.String errormessage) {
    imageButton.setImageResource(originalLikeDrawable);
    android.support.design.widget.Snackbar.make(recyclerView, getString(R.string.like_error_msg), Snackbar.LENGTH_LONG).show();
    imageButton.setEnabled(true);
}

public static com.okhttplib.OkHttpUtil.Builder init(android.content.Context context) {
    com.okhttplib.OkHttpUtil.context = context;
    ((android.app.Application) (com.okhttplib.OkHttpUtil.context)).registerActivityLifecycleCallbacks(new com.okhttplib.callback.BaseActivityLifecycleCallbacks());
    return com.okhttplib.OkHttpUtil.BuilderGlobal();
}

@java.lang.Override
protected android.webkit.WebView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    android.webkit.WebView webView = reactContext;
    enableFileUpload(webView);
    return webView;
}

@java.lang.Override
void onError(java.lang.Throwable e) {
    if (isViewAttached()) {
        getView().onError(e.toString());
    }
}

@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    com.android.gallery3d.filtershow.FilterShowActivity activity = ((com.android.gallery3d.filtershow.FilterShowActivity) (mContext));
    activity.cancelCurrentFilter();
    activity.leaveSeekBarPanel();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@android.webkit.JavascriptInterface
public void stopRecording() {
    android.util.Log.e(org.innovationsforlearning.StudentPortal.MainActivity.TAG, "stop recording");
    audio.stopRecording();
}

@java.lang.Override
public void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    if (!(paused)) {
        this.cacheView();
    }
}

@java.lang.Override
public com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View vi = inflater.inflate(R.layout.offers_list_item, parent, false);
    com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder vh = new com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder(vi);
    return vh;
}

public int getFirstVisibleScrollPosition() {
    android.support.v7.widget.LinearLayoutManager layoutManager = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager()));
    return layoutManager.findFirstVisibleItemPosition();
}

public static com.google.android.maps.GeoPoint coordinatesToGeoPoint(double latitude, double longitude) {
    return new com.google.android.maps.GeoPoint(((int) (latitude * 1000000.0)), ((int) (longitude * 1000000.0)));
}

@java.lang.Override
protected void onPreExecute() {
}

@java.lang.Override
public void execute(android.os.Bundle bundle) {
    loadingMore = true;
    if ((skipMessages) != 0) {
        messagesListView.setSelection(0);
    }
    hideActionBarProgress();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle options = getIntent().getExtras();
    if (options != null) {
        setBuilderOptions(options);
    }
    this.finish();
}

public void setClaims(java.util.ArrayList<com.CMPUT301W15T02.teamtoapp.Model.Claim> claims) {
    this.claims = claims;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mIsClick = true;
    int pos = ((int) (v.getTag()));
    setCurrentItem(pos);
}

@java.lang.Override
public void onPageSelected(int position) {
    setCurrentPosition(position);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

private void sortByLocations(android.location.Location userLocation) {
    if ((userLocation != null) && ((mAdapter) != null)) {
        sortOrder = org.septa.android.app.models.SortOrder.LOCATION;
        returnedLocation = userLocation;
        mAdapter.sortByLocation(userLocation);
        removeSortOptions();
    }
}

private android.content.SharedPreferences getSharedPreferences() {
    return com.jana.android.core.app.AbstractApplication.getApplication().getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
}

public void onSongPrevious(android.view.View view) {
    if ((musicService) != null) {
        musicService.previous();
        setPlayerTitleText();
    }
}

@java.lang.Override
public void onMyError(com.android.volley.VolleyError err) {
    if ((proDialog) != null) {
        proDialog.dismiss();
    }
    mPullRefreshListView.setVisibility(View.GONE);
    networkErrorLayout.setVisibility(View.VISIBLE);
}

@com.facebook.react.uimanager.annotations.ReactProp(name = "title")
public void setTitle(com.reactlibrary.video.player.RCTVideoPlayer player, java.lang.String title) {
    android.util.Log.i("RCTVideoPlayer", ("set title " + title));
    this.title = title;
}

@java.lang.Override
public void onClick(android.view.View v) {
    saveInformation();
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    @java.lang.SuppressWarnings(value = "VisibleForTests")
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    if (downloadUrl != null)
        profile.setPhotoURI(downloadUrl.getPath());
    
    writeUser(profile);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    new com.example.margo.json.JSONDownloader(jsonURL, this, sp).execute();
}

public android.database.Cursor getTableCursorFromDB(java.lang.String tableName) {
    java.lang.String selectQuery = "SELECT * FROM " + tableName;
    com.mycompany.kittylogs.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor query = db.rawQuery(selectQuery, null);
    return query;
}

@java.lang.Override
public void onRefresh() {
    android.util.Log.d(name.parker.alon.viewerforgithub.view.InfoActivity.LOG_TAG, "PullToRefresh");
    swipeLayout.setRefreshing(true);
    loadData(true);
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
private void init() {
    setOrdering(com.volha.yandex.school.musicartists.ui.ORDERING_TOGETHER);
    addTransition(new android.transition.ChangeBounds()).addTransition(new android.transition.ChangeTransform());
}

protected native long createRenderer(long parent);

long getMatchedMusicId() {
    return ((long) (de.robv.android.xposed.XposedHelpers.callMethod(musicInfo, "getMatchedMusicId")));
}

private void freeMemory() {
    android.util.Log.e("Memory", "freeMemory executed...");
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    updateIntervalSettings.set(java.lang.Integer.parseInt(((java.lang.String) (newValue))));
    pirattoManager.refresh();
    return true;
}

private void startRun() throws java.lang.Exception {
    try {
        configure();
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.getlantern.lantern.service.LanternVpn.TAG, ("Error with VPN" + e));
    }
}

public static me.twango.twango.entity.User getInstance(android.content.Context context) {
    if ((me.twango.twango.entity.User.me) != null) {
        return me.twango.twango.entity.User.me;
    }
    me.twango.twango.helper.DBHelper dbHelper = new me.twango.twango.helper.DBHelper(context);
    me.twango.twango.entity.User.me = dbHelper.getUser();
    return me.twango.twango.entity.User.me;
}

