@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    return null;
}

public void onClickSetPathUp(android.view.View view) {
    if (((mProfileService) != null) && ((mProfileService.getMapClient(mMasInstanceId)) != null)) {
        mProfileService.getMapClient(mMasInstanceId).setFolderUp();
        goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.SET_PATH);
    }
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> cursorLoader) {
    mMovieGridAdapter.swapCursor(null);
}

public static com.defch.blogwbly.MyApplication getInstance() {
    if ((com.defch.blogwbly.MyApplication.instance) == null) {
        com.defch.blogwbly.MyApplication.instance = new com.defch.blogwbly.MyApplication();
    }
    return com.defch.blogwbly.MyApplication.instance;
}

public void onItemClick(android.widget.ImageView ivIcon, com.codepath.spiderman.mooddiary.models.ActivityModel activity);

public void onReceivedTitle(android.webkit.WebView webView, java.lang.String title) {
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    viewPager.setCurrentItem(0, true);
    return true;
}

@java.lang.Override
public int getViewVerticalDragRange(android.view.View child) {
    return ((dragEdge) == (com.liuguangqiang.swipeback.SwipeBackLayout.DragEdge.BOTTOM)) || ((dragEdge) == (com.liuguangqiang.swipeback.SwipeBackLayout.DragEdge.TOP)) ? (android.support.v4.widget.ViewDragHelper.EDGE_TOP) | (android.support.v4.widget.ViewDragHelper.EDGE_BOTTOM) : 0;
}

@java.lang.Override
public void artistSearchEnded() {
    if (((mTracksFragment) != null) && (mTracksFragment.isVisible())) {
        mTracksFragment.setEmptyText("Select an artist to see top 10 tracks");
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    showEditDialog(position);
    return true;
}

public void beitreten(android.view.View v) {
    if (appsolutegamesgmbh.schnaps2gether.GUI.Lobby.m_GoogleApiClient.isConnected()) {
        android.widget.Toast.makeText(appContext, "Suche nach offenen Spielen...", Toast.LENGTH_SHORT).show();
        startDiscovery();
    }
}

public static void requestAd() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    com.tomade.saufomat.AdService.interstitialAd.loadAd(adRequest);
    android.util.Log.i(com.tomade.saufomat.AdService.TAG, "new InterstitialAd requested");
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    mListener.onSectionClicked(sectionsList.get(i));
}

private void setDotRevealFraction(int dot, float fraction) {
    if (dot < (dotRevealFractions.length)) {
        dotRevealFractions[dot] = fraction;
    }
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}

public void showBannerAdd(android.app.Activity activity) {
}

private boolean isProtectAvailable(android.content.Context context) {
    return (protectmanager.getCount()) < ((scm.get(context)) - 1);
}

@java.lang.Override
protected int getMetricsCategory() {
    return 0;
}

@java.lang.Override
public void onFinish() {
    android.util.Log.d("animation", "onFinishCalled");
    setUpMap(latLng, addressText);
}

public android.database.Cursor getCursor() {
    android.database.Cursor c = database.query(DBHelper.USER_TABLE, null, null, null, null, null, null);
    return c;
}

public static void init() {
    email.schaal.ocreader.api.APIService.instance = new email.schaal.ocreader.api.APIService();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDagger();
}

public static boolean isUiThread(java.lang.Thread thread) {
    return (com.nillith.android.common.MiscUtils.UI_THREAD.get()) == thread;
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.xchange_place.traxists.traxists.EnterUsernameAndPasswordFragment.VerifyUsername().execute();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    if ((markerTemp) != null)
        markerTemp.remove();
    
}

public kaaes.spotify.webapi.android.models.Track getTrack() {
    if ((track) == null) {
        android.util.Log.d(MainActivity.TAG, "getting new empty track");
        track = new kaaes.spotify.webapi.android.models.Track();
    }
    return track;
}

public void goToStoreLocation(android.view.View view) {
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(getAbsolutePath());
    dest.writeBooleanArray(new boolean[]{ isSelected , isParent });
}

public void signup(android.view.View view) {
    android.content.Intent k = new android.content.Intent(this, com.example.mover.mover.signupActivity.class);
    startActivity(k);
}

public void setFeedUrl(java.lang.String feedUrl) {
    this.feedUrl = org.wordpress.android.util.StringUtils.notNullStr(feedUrl);
}

@java.lang.Override
public final void onNext(java.util.List<com.hansjin.mukja_android.Model.Food> response) {
    if (response != null) {
        uiThread_Search(response);
    }else {
        android.widget.Toast.makeText(getActivity(), "검색 결과가 없습니다", Toast.LENGTH_SHORT).show();
    }
}

public static void restartMainProcess(android.content.Context context) {
    context.startService(new android.content.Intent(context, me.ele.amigo.AmigoService.class).setAction(me.ele.amigo.AmigoService.ACTION_RESTART_MANI_PROCESS));
    java.lang.Process.killProcess(java.lang.Process.myPid());
}

public static android.net.Uri buildCouponUri(long id) {
    return com.example.android.gcncouponalert.app.data.CouponsContract.CouponEntry.CONTENT_URI.buildUpon().appendPath("id").appendPath(java.lang.Long.toString(id)).build();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.android.starwarsv2.ListActivity.class);
    intent.putExtra("ListViewType", com.example.android.starwarsv2.MainActivity.PEOPLE);
    startActivity(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_categories);
    rowItems = new java.util.ArrayList<>();
    names = new java.util.ArrayList<>();
    queryParse();
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.muhammad.movieapp.MovieDatabase.CREATE_TABLE);
}

public void setiReceive(android.content.Intent iReceive) {
    this.iReceive = iReceive;
}

public void setLeftText(java.lang.CharSequence text) {
    if ((leftTextView) == null) {
        leftTextView = ((android.widget.TextView) (leftTextViewStub.inflate()));
    }
    leftTextView.setText(text);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i("onResume", category);
    setUserVisibleHint(true);
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    if (intent.getAction().equals("GETLOCATION")) {
        startLocationUpdates();
    }
}

@java.lang.Override
public void setToolbar(android.support.v7.widget.Toolbar toolbar) {
    setToolbarSize(toolbar);
    setSupportActionBar(toolbar);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}

public io.realm.Realm getNewRealmInstance() {
    if ((org.glucosio.android.db.DatabaseHandler.mRealmConfig) == null) {
        org.glucosio.android.db.DatabaseHandler.mRealmConfig = new io.realm.RealmConfiguration.Builder().schemaVersion(4).migration(new org.glucosio.android.db.Migration()).build();
    }
    return io.realm.Realm.getInstance(org.glucosio.android.db.DatabaseHandler.mRealmConfig);
}

@java.lang.Override
public void onClick(android.view.View v) {
    questions.remove(position);
    notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent photoPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    photoPickerIntent.setType("image/*");
    startActivityForResult(photoPickerIntent, com.vyn.motoclick.activities.MapsActivity.REQUEST);
}

private void loadBanner(int i) {
}

public void getMovieInfoByTitle(android.app.Activity activity, java.lang.String title) {
    ga.neerajdelima.themovieapp.model.network.FetchMovieInfoTask fetchMovieInfoTask = new ga.neerajdelima.themovieapp.model.network.FetchMovieInfoTask(title);
    fetchMovieInfoTask.delegate = ((ga.neerajdelima.themovieapp.model.network.FetchMovieInfoResponse) (activity));
    fetchMovieInfoTask.execute();
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    act = ((com.example.visvikis.f1story.Communication) (getActivity()));
}

@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot appSnapshot : dataSnapshot.getChildren()) {
        appSnapshot.getRef().removeValue();
    }
}

public com.brouding.simpledialog.SimpleDialog.Builder setPermanentCheck(@android.support.annotation.NonNull
java.lang.String preferenceName, @android.support.annotation.NonNull
java.lang.String preferenceKey) {
    this.preferenceName = preferenceName;
    this.permanentCheckKey = preferenceKey;
    return this;
}

public org.ligi.gobandroid_hd.ui.tsumego.TsumegoHelper.Max update(int candidate) {
    if (candidate > (value)) {
        value = candidate;
    }
    return this;
}

public static void setUp(android.content.Context context, java.lang.String sharedPreferencesName) {
    if (context == null) {
        throw new com.marcohc.architecture.common.helper.PreferencesException("Context must not be null!");
    }
    com.marcohc.architecture.common.helper.PreferencesHelper.instance = new com.marcohc.architecture.common.helper.PreferencesHelper(context, sharedPreferencesName, null);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    reminderCreator.createReminder(location, dialogInputString, name);
    dialogInputString = "";
}

private android.net.Uri getOutputMediaFileUri(int type) {
    if ((getOutputMediaFile(type)) != null) {
        return android.net.Uri.fromFile(getOutputMediaFile(type));
    }else {
        return null;
    }
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    stopService(new android.content.Intent(this, com.glasstowerstudios.garrulo.service.GarruloListenerService.class));
    mAdapter.shutdown();
    com.glasstowerstudios.garrulo.app.GarruloApplication.getInstance().unsuppressNotifications();
}

@java.lang.Override
public android.widget.EditText build() {
    super.build();
    return mEditText;
}

@java.lang.Override
public void onStop() {
    super.onStop();
}

@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    android.util.Log.d("MyMaps", "Network onStatusChanged called");
    android.widget.Toast.makeText(this, "Network onStatusChanged called", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if ((getActivity()) instanceof com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) {
        subscriberListFragmentActions = ((com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) (context));
    }
}

public void setNotificationBackgroundColor(@android.support.annotation.ColorInt
int color) {
    this.notificationBackgroundColor = color;
    updateNotifications(true, com.aurelhubert.ahbottomnavigation.AHBottomNavigation.UPDATE_ALL_NOTIFICATIONS);
}

@java.lang.Override
public boolean onLibraryAuthorClicked(final android.view.View view, final com.mikepenz.aboutlibraries.entity.Library library) {
    return false;
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    _adapter = new com.axelby.podax.ui.ITunesToplistFragment.ITunesToplistAdapter();
    _listView.setAdapter(_adapter);
}

public void onPrevClicked() {
    com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.utils.LogHelper.d(com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.TAG, "prev clicked");
    sendSkipToPrevMessageToService();
}

public void onTextChanged(java.lang.CharSequence c, int start, int before, int count) {
}

public static void increaseHuntNumber(android.content.Context context) {
    int huntNumber = (com.kappa_labs.ohunter.client.utilities.SharedDataManager.getHuntNumber(context)) + 1;
    com.kappa_labs.ohunter.client.utilities.SharedDataManager.getSharedPreferences(context).edit().putInt(com.kappa_labs.ohunter.client.utilities.SharedDataManager.HUNT_NUMBER_KEY, huntNumber).commit();
}

@java.lang.Override
public boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed) {
    return false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_selected_route);
    this.selectedRoute = ((com.pmanager.humbertolinero.pmanager.HelperClasses.route) (getIntent().getSerializableExtra("selectedRoute")));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gps);
    android.location.LocationManager lMgr = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    lMgr.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
}

public void addNewTitle(android.view.View view) {
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.edit_text)));
    java.lang.String message = editText.getText().toString();
    comingSoon.add(message);
    java.util.Collections.sort(comingSoon);
}

public void addItem(com.hiwhitley.potatoandtomato.bean.Tomato tomato) {
    mItems.add(tomato);
    android.util.Log.i(com.hiwhitley.potatoandtomato.adapter.RecyclerListAdapter.TAG, ("addItem" + (mItems.size())));
    notifyItemInserted(mItems.size());
}

@java.lang.Override
public void onClick(android.view.View view) {
    timePicker.show(getSupportFragmentManager(), TAG);
}

@java.lang.Override
protected void onUnsubscribed(com.google.android.gms.common.api.GoogleApiClient apiClient) {
    LocationServices.FusedLocationApi.removeLocationUpdates(apiClient, locationListener);
    locationListener.onUnsubscribed();
    locationListener = null;
}

@java.lang.Override
public java.lang.Object check(android.support.v4.app.FragmentActivity activity, android.support.v4.app.FragmentManager fragmentManager) {
    int index = getIndexOf(target);
    if (index >= 1) {
        return getFragmentAt((index - 1));
    }
    return null;
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    cOP.setThreshold(((fX) / 10));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.main);
    initImageLoader();
    init();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    db = new vn.asiantech.training.DatabaseHelper(getBaseContext());
    this.registerReceiver(new vn.asiantech.training.myService.AlarmReceiver(), new android.content.IntentFilter(vn.asiantech.training.myService.ACTION));
}

@java.lang.Override
public void onSessionResuming(com.google.android.gms.cast.framework.CastSession session, java.lang.String sessionId) {
}

@java.lang.Override
public void onPlayListAdded(com.example.user.cloudplayer.model.PlayList playList) {
}

@java.lang.Override
protected void onRefresh(boolean forceApiReload) {
    android.support.v4.content.Loader loader = getSupportLoaderManager().getLoader(eu.zkkn.android.barcamp.MainActivity.LOADER_SESSIONS_ID);
    if (forceApiReload) {
        ((eu.zkkn.android.barcamp.DataLoader) (loader)).loadFromApi(true);
    }else {
        loader.forceLoad();
    }
}

public android.graphics.RectF getGridClippingRect() {
    mGridClippingRect.set(mViewPortHandler.getContentRect());
    mGridClippingRect.inset((-(mAxis.getGridLineWidth())), 0.0F);
    return mGridClippingRect;
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            com.vibeosys.rorderapp.fragments.FragmentChefPlacedOrder fragmentChefPlacedOrder = new com.vibeosys.rorderapp.fragments.FragmentChefPlacedOrder();
            return fragmentChefPlacedOrder;
        case 1 :
            com.vibeosys.rorderapp.fragments.FragmentChefMyServing fragmentChefMyServing = new com.vibeosys.rorderapp.fragments.FragmentChefMyServing();
            return fragmentChefMyServing;
        default :
            return null;
    }
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    nameEditText.setText("");
    breedEditText.setText("");
    weightEditText.setText("");
    genderSpinner.setSelection(PetEntry.GENDER_UNKNOWN);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    return ((onLongClickListener) != null) && (onLongClickListener.onLongClick(v, getAdapterPosition()));
}

@java.lang.Override
public void onSoftKeyboardShown(boolean isShowing) {
    keyboardIsShowing = isShowing;
    if ((this.fragmentAddField) != null)
        this.fragmentAddField.keyboardShowing = isShowing;
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_screen);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.dotua.goldendictbridge.SharedFunction.sendMessage(context, ((android.widget.TextView) (v)).getText().toString());
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    unregisterReceiver(downloadReceiver);
}

public void download() {
    com.telerik.plugins.mapbox.OfflineRegion.mapboxRegions.get(this.mapboxOfflineRegionId).setDownloadState(com.telerik.plugins.mapbox.com.mapbox.mapboxsdk.offline.OfflineRegion.STATE_ACTIVE);
}

@java.lang.Override
public void done() {
    context = getContext();
    if ((context) != null) {
        progressDialog = android.app.ProgressDialog.show(getContext(), "", "正在加载");
        getInfo();
    }
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    com.owncloud.android.lib.common.utils.Log_OC.d(com.owncloud.android.ui.fragment.EditShareFragment.TAG, "onActivityCreated");
}

@java.lang.Override
public boolean isEmpty() {
    return false;
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    onAnimationEnd(animation);
    topSearch.setVisibility(View.VISIBLE);
}

public void speech(android.view.View view) {
    android.widget.Toast.makeText(this, "speech", Toast.LENGTH_SHORT).show();
    speak();
}

@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    return new android.content.CursorLoader(this, com.scrawlsoft.gjournal.data.GJEntryProvider.CONTENT_URI, null, null, null, null);
}

public void checkRequirements() {
    if (isFirstRun()) {
        android.content.Intent welcomeIntent = new android.content.Intent(this.context, com.physical_web.cms.physicalwebcms.WelcomeActivity.class);
        context.startActivity(welcomeIntent);
    }else {
    }
}

public void onClick(android.view.View v) {
    android.content.Intent theintent = new android.content.Intent(this, com.groupc.officelocator.masterSearchWithHeaders.class);
    theintent.putExtras(dataContainer);
    startActivity(theintent);
}

private android.content.DialogInterface.OnClickListener setIgnore() {
    android.content.SharedPreferences.Editor editor = preferences.edit();
    TTSignore = true;
    editor.putBoolean("TTSignore", true);
    editor.commit();
    return null;
}

public void openSwords(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, csis.ie.ul.mhis.activities.SwordList.class);
    startActivity(i);
}

