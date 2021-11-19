@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    if (org.wahtod.wififixer.WifiFixerService.logging)
        org.wahtod.wififixer.utility.LogService.log(this, org.wahtod.wififixer.WifiFixerService.APP_NAME, ((getString(R.string.onbind_intent)) + (intent.toString())));
    
    return null;
}

public void onClickSetPathUp(android.view.View view) {
    mProfileService.getMapClient(mMasInstanceId).setFolderUp();
    goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.SET_PATH);
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> cursorLoader) {
    android.util.Log.i(Constants.APP_NAME, "onLoaderReset");
    mMovieGridAdapter.swapCursor(null);
}

public static com.defch.blogwbly.MyApplication getInstance(android.content.Context context) {
    return context != null ? ((com.defch.blogwbly.MyApplication) (context.getApplicationContext())) : com.defch.blogwbly.MyApplication.instance;
}

public void onItemClick(android.widget.ImageView ivIcon, com.codepath.spiderman.mooddiary.models.ActivityModel activity, boolean isSelected);

public void onReceivedTitle(android.webkit.WebView webView, java.lang.String title) {
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (getActivity()));
    activity.getSupportActionBar().setSubtitle(title);
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    viewPager.setCurrentItem(1);
    return true;
}

@java.lang.Override
public int getViewVerticalDragRange(android.view.View child) {
    return ((dragEdge) == (com.liuguangqiang.swipeback.SwipeBackLayout.DragEdge.TOP)) || ((dragEdge) == (com.liuguangqiang.swipeback.SwipeBackLayout.DragEdge.BOTTOM)) ? (android.support.v4.widget.ViewDragHelper.EDGE_TOP) | (android.support.v4.widget.ViewDragHelper.EDGE_BOTTOM) : 0;
}

@java.lang.Override
public void artistSearchEnded() {
    android.util.Log.v(au.com.kbrsolutions.spotifystreamer.activities.SpotifyStreamerActivity.LOG_TAG, ("showTracksData - mTracksFragment: " + (mTracksFragment)));
    if (((mTracksFragment) != null) && (mTracksFragment.isVisible())) {
        mTracksFragment.setEmptyText("Select an artist to see top 10 tracks");
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, diy.uigeneric.sample.SampleEditActivity.class);
    startActivityForResult(intent, diy.uigeneric.sampleserver.SampleServerListActivity.REQUEST_ADD);
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    showEditDialog();
    return true;
}

public void beitreten(android.view.View v) {
    if (appsolutegamesgmbh.schnaps2gether.GUI.Lobby.m_GoogleApiClient.isConnected()) {
        android.widget.Toast.makeText(appContext, "Suche nach offenen Spielen...", Toast.LENGTH_SHORT).show();
        appsolutegamesgmbh.schnaps2gether.GUI.Lobby.spieleIdListe.clear();
        appsolutegamesgmbh.schnaps2gether.GUI.Lobby.spieleListe.clear();
        startDiscovery();
    }
}

private static void requestAd() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    com.tomade.saufomat.AdService.interstitialAd.loadAd(adRequest);
    android.util.Log.i(com.tomade.saufomat.AdService.TAG, "new InterstitialAd requested");
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    com.rocdev.guardianreader.models.Section section = sectionsList.get(i);
    mListener.onSectionClicked(section);
}

private void setDotRevealFraction(int dot, float fraction) {
    dotRevealFractions[dot] = fraction;
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}

public void showBannerAdd(android.app.Activity activity) {
    android.widget.LinearLayout adlayout = ((android.widget.LinearLayout) (activity.findViewById(R.id.AdLinearLayout)));
    cn.waps.AppConnect.getInstance(mContext).showBannerAd(mContext, adlayout);
}

private boolean isProtectAvailable(android.content.Context context) {
    return (protectmanager.getCount()) < (scm.get(context));
}

@java.lang.Override
protected int getMetricsCategory() {
    return com.android.internal.logging.MetricsLogger.OMNI_SETTINGS;
}

@java.lang.Override
public void onFinish() {
    android.util.Log.d("animation", "onFinishCalled");
    setUpMap(latLng, addressText.substring(1), addressText);
}

public android.database.Cursor getCursor() {
    android.database.Cursor c = database.query(DBHelper.USER_TABLE, new java.lang.String[]{ DBHelper.USER_NAME_COLUMN , DBHelper.USER_PASSWORD_COLUMN }, null, null, null, null, null);
    return c;
}

public static void init(android.content.Context context) {
    email.schaal.ocreader.api.APIService.instance = new email.schaal.ocreader.api.APIService();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.hamom.bbtest.ui.base.BaseFragment.setRetainInstance(true);
    initDagger();
}

public static boolean isUiThread(java.lang.Thread thread) {
    return (com.nillith.android.common.MiscUtils.UI_THREAD) == thread;
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.xchange_place.traxists.traxists.EnterUsernameAndPasswordFragment.VerifyUsername().doInBackground();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    markerTemp.remove();
}

public kaaes.spotify.webapi.android.models.Track getTrack() {
    if ((track) == null) {
        android.util.Log.d(MainActivity.TAG, "getting new empty track");
        track = new com.tbse.nano.nano_proj_1_spotify_streamer.models.MyTrack();
    }
    return track;
}

public void goToStoreLocation(android.view.View view) {
    android.widget.Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(getEntry().getAbsolutePath());
    dest.writeBooleanArray(new boolean[]{ isSelected , isParent });
}

private void signup() {
    android.content.Intent k = new android.content.Intent(this, com.example.mover.mover.signupActivity.class);
    startActivity(k);
}

public void setFeedUrl(java.lang.String url) {
    this.feedUrl = org.wordpress.android.util.StringUtils.notNullStr(feedUrl);
}

@java.lang.Override
public final void onNext(java.util.List<com.hansjin.mukja_android.Model.Food> response) {
    if (response != null) {
        refresh();
        uiThread_Search(response);
    }else {
        android.widget.Toast.makeText(getActivity(), "검색 결과가 없습니다", Toast.LENGTH_SHORT).show();
    }
}

public static void restartMainProcess(android.content.Context context) {
    context.startService(new android.content.Intent(context, me.ele.amigo.AmigoService.class).setAction(me.ele.amigo.AmigoService.ACTION_RESTART_MANI_PROCESS));
    java.lang.System.exit(0);
    java.lang.Process.killProcess(java.lang.Process.myPid());
}

public static android.net.Uri buildCouponUri(long id) {
    return com.example.android.gcncouponalert.app.data.CouponsContract.CouponEntry.CONTENT_URI.buildUpon().appendPath(("_" + id)).build();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    controller = new com.my.fitness.controller.Controller();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.android.starwarsv2.ListActivity.class);
    intent.putExtra("ListViewType", com.example.android.starwarsv2.MainActivity.PEOPLE);
    startActivity(intent);
    finish();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_categories);
    rowItems = new java.util.ArrayList<>();
    queryParse();
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    abyssproductions.double0driver.GameGlobals.getInstance().setScreenHeight(height);
    abyssproductions.double0driver.GameGlobals.getInstance().setScreenWidth(width);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.muhammad.movieapp.MovieDatabase.CREATE_TABLE);
    android.widget.Toast.makeText(context, "DB Created", Toast.LENGTH_LONG).show();
}

public void setiReceive(android.content.Intent iReceive) {
    android.util.Log.e("Good", "HElppoooooooooooooooooooo");
    this.iReceive = iReceive;
}

public void setLeftText(java.lang.CharSequence text) {
    leftTextView = ((android.widget.TextView) (leftTextViewStub.inflate()));
    leftTextView.setText(text);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("onResume", category);
    setUserVisibleHint(true);
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    if (intent.getAction().equals("GETLOCATION")) {
        android.widget.Toast.makeText(context, "in on handle intent of my location getter", Toast.LENGTH_SHORT).show();
        startLocationUpdates();
    }
}

@java.lang.Override
public void setToolbar(android.support.v7.widget.Toolbar toolbar) {
    setToolbarSize(toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
}

public io.realm.Realm getNewRealmInstance() {
    if ((org.glucosio.android.db.DatabaseHandler.mRealmConfig) == null) {
        org.glucosio.android.db.DatabaseHandler.mRealmConfig = new io.realm.RealmConfiguration.Builder(mContext).schemaVersion(4).migration(new org.glucosio.android.db.Migration()).build();
    }
    return io.realm.Realm.getInstance(org.glucosio.android.db.DatabaseHandler.mRealmConfig);
}

@java.lang.Override
public void onClick(android.view.View v) {
    questions.remove((position + 1));
    notifyItemRemoved(position);
    notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(LOG_TAG, "2 ");
    android.content.Intent photoPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    photoPickerIntent.setType("image/*");
    startActivityForResult(photoPickerIntent, com.vyn.motoclick.activities.MapsActivity.REQUEST);
}

private void loadBanner(int i) {
    mAdView = ((com.google.android.gms.ads.AdView) (findViewById(R.id.adBanner)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice("2C75B378313C32C7D50757BB562FF544").build();
    mAdView.loadAd(adRequest);
}

public void getMovieInfoByTitle(android.app.Activity activity, java.lang.String title) {
    ga.neerajdelima.themovieapp.model.network.FetchMovieInfoTask fetchMovieInfoTask = new ga.neerajdelima.themovieapp.model.network.FetchMovieInfoTask(("t=" + title));
    fetchMovieInfoTask.delegate = ((ga.neerajdelima.themovieapp.model.network.FetchMovieInfoResponse) (activity));
    fetchMovieInfoTask.execute();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    this.act = ((com.example.visvikis.f1story.Communication) (activity));
}

@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot appSnapshot : dataSnapshot.getChildren()) {
        appSnapshot.getRef().removeValue();
    }
    android.widget.Toast.makeText(this, "Favorite data retrieved", Toast.LENGTH_SHORT).show();
}

public com.brouding.simpledialog.SimpleDialog.Builder setPermanentCheck(@android.support.annotation.NonNull
java.lang.String preferenceName, @android.support.annotation.NonNull
java.lang.String preferenceKey) {
    if (this.showProgress) {
        throw new java.lang.IllegalStateException("'setPermanentCheck' is unavailable when you want showProgress()");
    }
    this.preferenceName = preferenceName;
    this.permanentCheckKey = preferenceKey;
    return this;
}

public org.ligi.gobandroid_hd.ui.tsumego.TsumegoHelper.Max update(int candidate) {
    if (candidate > (value))
        return new org.ligi.gobandroid_hd.ui.tsumego.TsumegoHelper.Max(candidate);
    
    return this;
}

protected static void setUp(android.content.Context context, java.lang.String sharedPreferencesName) {
    if (context == null) {
        throw new com.marcohc.architecture.common.helper.PreferencesException("Context must not be null!");
    }
    com.marcohc.architecture.common.helper.PreferencesHelper.instance = new com.marcohc.architecture.common.helper.PreferencesHelper(context, sharedPreferencesName, null);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    reminderCreator.createReminder(location, name, dialogInputString);
    dialogInputString = "";
}

private android.net.Uri getOutputMediaFileUri(int type) {
    return android.net.Uri.fromFile(getOutputMediaFile(type));
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.d(com.glasstowerstudios.garrulo.ui.GarruloMainActivity.LOGTAG, "Destroying Garrulo main activity");
    stopService(new android.content.Intent(this, com.glasstowerstudios.garrulo.service.GarruloListenerService.class));
    mAdapter.shutdown();
    com.glasstowerstudios.garrulo.app.GarruloApplication.getInstance().unsuppressNotifications();
}

@java.lang.Override
public android.widget.EditText build() {
    return mEditText;
}

@java.lang.Override
public void onStop() {
    super.onStop();
    cz.vspj.schrek.im.activity.MainActivity mainActivity = ((cz.vspj.schrek.im.activity.MainActivity) (getActivity()));
    mainActivity.showMenuIcon(true);
    android.support.v7.app.ActionBar actionBar = mainActivity.getSupportActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
}

@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    if ((isTracked) == false)
        return ;
    
    android.util.Log.d("MyMaps", "Network onStatusChanged called");
    android.widget.Toast.makeText(this, "Network onStatusChanged called", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) {
        subscriberListFragmentActions = ((com.globant.practice.presentation.view.fragment.SubscriberListFragment.SubscriberListFragmentActions) (context));
    }
}

public void setNotificationBackgroundColor(@android.support.annotation.ColorInt
int color) {
    this.notificationBackgroundColor = color;
    notificationBackgroundDrawable = com.aurelhubert.ahbottomnavigation.AHHelper.getTintDrawable(notificationBackgroundDrawable, notificationBackgroundColor, true);
    updateNotifications(true, com.aurelhubert.ahbottomnavigation.AHBottomNavigation.UPDATE_ALL_NOTIFICATIONS);
}

@java.lang.Override
public boolean onLibraryAuthorClicked(android.view.View v, com.mikepenz.aboutlibraries.entity.Library library) {
    return false;
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    _adapter = new com.axelby.podax.ui.ITunesToplistFragment.ITunesToplistAdapter(getActivity());
    _listView.setAdapter(_adapter);
}

public void onPrevClicked(android.view.View v) {
    com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.utils.LogHelper.d(com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.TAG, "prev clicked");
    sendSkipToPrevMessageToService();
}

public void onTextChanged(java.lang.CharSequence c, int start, int before, int count) {
    mTaskTitle = c.toString();
    com.bignerdranch.android.done.AppData.User.get().getList(listId).getTask(taskId).setTaskName(mTaskTitle);
}

public static void increaseHuntNumber(android.content.Context context) {
    int huntNumber = com.kappa_labs.ohunter.client.utilities.SharedDataManager.getHuntNumber(context);
    com.kappa_labs.ohunter.client.utilities.SharedDataManager.getSharedPreferences(context).edit().putInt(com.kappa_labs.ohunter.client.utilities.SharedDataManager.HUNT_NUMBER_KEY, (huntNumber + 1)).commit();
}

@java.lang.Override
public boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed) {
    return true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_selected_route);
    this.selectedRoute = ((com.pmanager.humbertolinero.pmanager.HelperClasses.route) (getIntent().getSerializableExtra("selectedRoute")));
    android.util.Log.d("Sche", "Activity Created");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gps);
    android.location.LocationManager lMgr = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    lMgr.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 10, this);
}

public void addNewTitle(android.view.View view) {
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.edit_text)));
    java.lang.String message = editText.getText().toString();
    comingSoon.add(message);
}

public void addItem(com.hiwhitley.potatoandtomato.bean.Tomato tomato) {
    mItems.add(tomato);
    android.util.Log.i(com.hiwhitley.potatoandtomato.adapter.RecyclerListAdapter.TAG, ("addItem" + (mItems.size())));
    notifyItemInserted(((mItems.size()) - 1));
}

@java.lang.Override
public void onClick(android.view.View view) {
    nextopic.com.nextopic.UI.TimePickerFragment timePicker = new nextopic.com.nextopic.UI.TimePickerFragment();
    timePicker.show(getSupportFragmentManager(), TAG);
}

@java.lang.Override
protected void onUnsubscribed(com.google.android.gms.common.api.GoogleApiClient apiClient) {
    LocationServices.FusedLocationApi.removeLocationUpdates(apiClient, locationListener);
}

@java.lang.Override
public java.lang.Object check(android.support.v4.app.FragmentActivity activity, android.support.v4.app.FragmentManager fragmentManager) {
    int index = getIndexOf(target);
    if (index > 1) {
        return getFragmentAt((index - 1));
    }
    return null;
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    cOP.setThreshold(((fX) / 10));
    dispatcher.addAudioProcessor(cOP);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.main);
    init();
    initImageLoader();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    db = new vn.asiantech.training.DatabaseHelper(getBaseContext());
    this.registerReceiver(new vn.asiantech.training.myService.AlarmReceiver(), new android.content.IntentFilter(vn.asiantech.training.myService.ACTION));
    FindMinTime();
}

@java.lang.Override
public void onSessionResuming(com.google.android.gms.cast.framework.CastSession session, java.lang.String sessionId) {
    timber.log.Timber.d("VideoDetailsFragment : onSessionResuming()");
}

@java.lang.Override
public void onPlayListAdded(com.example.user.cloudplayer.model.PlayList playList) {
    if (playList == null) {
        android.widget.Toast.makeText(this, getResources().getString(R.string.on_playList_added), Toast.LENGTH_LONG).show();
    }
}

@java.lang.Override
protected void onRefresh(boolean forceApiReload) {
    android.support.v4.content.Loader loader = getSupportLoaderManager().getLoader(eu.zkkn.android.barcamp.MainActivity.LOADER_SESSIONS_ID);
    if (forceApiReload) {
        ((eu.zkkn.android.barcamp.DataLoader) (loader)).loadFromApi();
    }else {
        loader.forceLoad();
    }
}

public android.graphics.RectF getGridClippingRect() {
    mGridClippingRect.set(mViewPortHandler.getContentRect());
    mGridClippingRect.inset(((-(mAxis.getGridLineWidth())) / 2.0F), 0.0F);
    return mGridClippingRect;
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            com.vibeosys.rorderapp.fragments.FragmentChefMyServing fragmentChefMyServing = new com.vibeosys.rorderapp.fragments.FragmentChefMyServing();
            return fragmentChefMyServing;
        case 1 :
            com.vibeosys.rorderapp.fragments.FragmentChefPlacedOrder fragmentChefPlacedOrder = new com.vibeosys.rorderapp.fragments.FragmentChefPlacedOrder();
            return fragmentChefPlacedOrder;
        default :
            return null;
    }
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    nameEditText.setText("");
    breedEditText.setText("");
    weightEditText.setText(null);
    genderSpinner.setSelection(PetEntry.GENDER_UNKNOWN);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.architecture.realarchitecture.domain.request.Request<java.util.Map<java.lang.String, java.lang.Object>> request = new com.architecture.realarchitecture.presention.request.DemoObjectRequest("testObject");
    enqueueRequest(request);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    return ((onLongClickListener) != null) && (onLongClickListener.onLongClick(v, content, getAdapterPosition()));
}

@java.lang.Override
public void onSoftKeyboardShown(boolean isShowing) {
    keyboardIsShowing = isShowing;
    if ((this.fragmentAddField) != null)
        this.fragmentAddField.keyboardShowing = isShowing;
    
    android.util.Log.d("MainActivity", ("Keyboard Showing:" + (java.lang.Boolean.toString(isShowing))));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_screen);
    com.parse.Parse.initialize(this, "4Zq7ugmsgzwIWgyczr6oEQpd3mdTerqwI0j9OrbX", "ZPf6nqSWHXVdxZnPyAkyaUapse3C2iLtdXtQWpwS");
    com.parse.ParseInstallation.getCurrentInstallation().saveInBackground();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.dotua.goldendictbridge.SharedFunction.sendMessage(((android.widget.TextView) (v)).getText().toString());
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(downloadReceiver);
}

public void download() {
    android.util.Log.d(com.telerik.plugins.mapbox.OfflineRegion.LOG_TAG, "download()");
    com.telerik.plugins.mapbox.OfflineRegion.mapboxRegions.get(this.mapboxOfflineRegionId).setDownloadState(com.telerik.plugins.mapbox.com.mapbox.mapboxsdk.offline.OfflineRegion.STATE_ACTIVE);
}

@java.lang.Override
public void done() {
    progressDialog = android.app.ProgressDialog.show(getContext(), "", "正在加载");
    getInfo();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    com.owncloud.android.lib.common.utils.Log_OC.d(com.owncloud.android.ui.fragment.EditShareFragment.TAG, "onActivityCreated");
    getActivity().setTitle(mShare.getSharedWithDisplayName());
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object o) {
    return view == ((android.view.View) (o));
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    this.onAnimationEnd(animation);
    topSearch.setVisibility(View.VISIBLE);
}

public void speech(android.view.View view) {
    android.widget.Toast.makeText(this, "speech", Toast.LENGTH_SHORT).show();
    int speak = mSpeechSynthesizer.speak("哈哈哈");
    java.lang.System.out.println(("88888888=====speak=" + speak));
}

@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    java.lang.System.out.println("FOOBAR");
    return new android.content.CursorLoader(this, com.scrawlsoft.gjournal.data.GJEntryProvider.CONTENT_URI, null, null, null, null);
}

public void checkRequirements(android.content.Context context) {
    if (isFirstRun()) {
        android.content.Intent welcomeIntent = new android.content.Intent(context, com.physical_web.cms.physicalwebcms.WelcomeActivity.class);
        context.startActivity(welcomeIntent);
    }else {
    }
}

public void onClick(android.view.View v) {
    android.content.Intent theintent = new android.content.Intent(this, com.groupc.officelocator.masterSearchWithHeaders.class);
    theintent.putExtras(dataContainer);
    this.finish();
    startActivity(theintent);
}

private android.content.DialogInterface.OnClickListener setIgnore() {
    android.content.SharedPreferences.Editor editor = preferences.edit();
    TTSignore = true;
    editor.putBoolean("TTSignore", TTSignore);
    editor.commit();
    return null;
}

public void openSwords(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, csis.ie.ul.mhis.activities.SwordList.class);
    startActivity(i);
    finish();
}

