@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return mRallyActive ? new onl.deepspace.zoorallye.fragments.MapFragment() : new onl.deepspace.zoorallye.fragments.StartRallyFragment();
        case 1 :
            return mRallyActive ? new onl.deepspace.zoorallye.fragments.InfoFragment() : new onl.deepspace.zoorallye.fragments.MapFragment();
    }
    return null;
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    return (gestureDetector.onTouchEvent(event)) || (super.onTouchEvent(event));
}

@java.lang.Override
public void onClick(android.view.View view) {
    net.kyouko.cloudier.CloudierApplication.getBus().post(new net.kyouko.cloudier.event.CommentTweetEvent(tweet, tweet.nickname, time.getText().toString(), content.getText().toString(), this));
}

@java.lang.Override
public void onGameMessageReceived(java.lang.String playerId, org.json.JSONObject message) {
    android.util.Log.d(com.example.mirko.custombuttonexample.miniGameFragments.ShakeMinigame.TAG, ("onGameMessageReceived: " + message));
    if (message.has("startGame")) {
    }
}

protected void startLocationUpdates() {
    LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
}

@java.lang.Override
public void onSelection(com.afollestad.materialdialogs.MaterialDialog dialog, android.view.View itemView, int position, java.lang.CharSequence text) {
    mPriority = position + 1;
    android.util.Log.d(de.grau.organizer.activities.EditorActivity.DEBUG_TAG, ("User Priority Dialog Result = " + (mPriority)));
    setPriorityButton(mPriority);
}

@java.lang.Override
public void onCancel() {
    android.widget.Toast.makeText(this, "FaceBook Sign in cancelled", Toast.LENGTH_SHORT).show();
    updateUI(null);
}

private android.app.AlertDialog getAutoCheckinDialog(android.app.Activity activity, android.content.DialogInterface... checkinListeners) {
    createAutoCheckinAlertDialog(activity, checkinListeners);
    return autoCheckinDialog;
}

private boolean isRemoteVideoPlaying() {
    if ((castSession) != null) {
        com.google.android.gms.cast.framework.media.RemoteMediaClient remoteMediaClient = castSession.getRemoteMediaClient();
        return remoteMediaClient.isPlaying();
    }
    return false;
}

public void onClick(android.content.DialogInterface dialog, int which) {
}

private void initView() {
}

@java.lang.Override
public void onContactEntrySaveChanges(edu.pdx.ece558_fall15.alex_elizabeth.businesscardcontact.ContactEntry ce) {
    android.util.Log.d(edu.pdx.ece558_fall15.alex_elizabeth.businesscardcontact.ContactEditDetailActivity.TAG, "onContactEntrySaveChanges");
    mContactEntry = ce;
    finishActivity(true);
}

static void syncOpenUrlWhenUninstall(java.lang.String dirStr, java.lang.String openUrl) {
    cn.hiroz.uninstallfeedback.FeedbackUtils.init(1, dirStr, "com.android.browser/com.android.browser.BrowserActivity", "android.intent.action.VIEW", openUrl, Build.BRAND);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    getLocation();
    lat = location.getLatitude();
    lng = location.getLongitude();
}

@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getHeaders() throws com.android.volley.AuthFailureError {
    java.util.HashMap<java.lang.String, java.lang.String> headers = new java.util.HashMap<>();
    return headers;
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    connectGoogleApiClient();
    return START_STICKY;
}

private void showGlobalContextActionBar() {
    android.app.ActionBar actionBar = getActivity().getActionBar();
    if (actionBar != null) {
        actionBar.setDisplayShowTitleEnabled(true);
    }
}

@java.lang.Override
public void onAnimationEnd(android.view.View view) {
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    getAnimationListener().onAnimationFinished();
    android.support.v4.view.ViewCompat.animate(getFloatingToolbar()).setListener(null);
}

protected static void sendMsg(java.lang.String number, java.lang.String message) {
    if (number != null) {
        android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();
        smsManager.sendTextMessage(number, null, message, null, null);
    }
}

@java.lang.Override
public void removeOverlay(android.view.ViewGroup sceneRoot, android.view.View overlayView) {
    android.transitions.everywhere.utils.ViewOverlayPreJellybean viewOverlay = android.transitions.everywhere.utils.ViewOverlayPreJellybean.getOverlay(sceneRoot);
    if (viewOverlay != null) {
        viewOverlay.removeView(overlayView);
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if ((categorys) == null) {
        return null;
    }
    return com.wole.story.ui.fragment.TestFragment.newInstance(categorys.get(position).getType());
}

@java.lang.Override
public void onResume() {
    super.onResume();
}

@java.lang.Override
public com.github.geekarist.mine.list.StuffViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_view_stuff_item, parent, false);
    return new com.github.geekarist.mine.list.StuffViewHolder(view);
}

@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    for (android.os.AsyncTask task : tasks) {
        task.cancel(true);
    }
}

@java.lang.Override
public void showAuthenticationUI(java.lang.String url, com.ge.predix.mobile.core.AuthHandlerCallback authHandlerCallback) {
    android.content.Intent intent = new android.content.Intent(parentActivity, predix.ge.com.referenceapplication.AuthenticationActivity.class);
    intent.putExtra("url", url);
    parentActivity.startActivityForResult(intent, 999);
    this.authHandlerCallback = authHandlerCallback;
}

public void checkInternetConnection() {
    if (!(it.jaschke.alexandria.MainActivity.isNetworkAvailable(this))) {
        android.widget.Toast.makeText(this, R.string.noNetwork_connection, Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent();
    setResult(RESULT_NEXT, i);
    overridePendingTransition(0, 0);
    finish();
    overridePendingTransition(0, 0);
}

public void run(android.view.View view) {
    wireController.redrawWires();
    ((android.widget.GridView) (findViewById(R.id.circuit))).invalidateViews();
    circuitController.run(this);
    checkScenarioComplete();
}

@java.lang.Override
public int getCalculatedPreferredNetworkType() {
    enforceReadPermission();
    return com.android.internal.telephony.PhoneFactory.calculatePreferredNetworkType(mPhone.getContext(), 0);
}

@java.lang.Override
public void updateBus() {
    android.util.Log.i(com.ikardwynne.wheresthatbus.MainActivity.TAG, "Updating the location of the bus");
    action = null;
    getMapFragment(true, true);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.rndapp.mtamap.SubwayApplication.mInstance = this;
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    com.rndapp.mtamap.Analytics.init(this);
}

@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
}

private android.database.Cursor getAllUsers() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    return db.query("USER", null, null, null, null, null, null);
}

public void resumeRing() {
    if (com.android.phone.Ringer.DBG)
        com.android.phone.Ringer.log("resumeRing()...");
    
    synchronized(this) {
        getRingHandler().sendEmptyMessage(com.android.phone.Ringer.RingHandler.MSG_RESUME);
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    selectedTabPosition = tabLayout.getSelectedTabPosition();
}

android.arch.lifecycle.LiveData<com.hanihashemi.dictionary.network.Resource<com.hanihashemi.dictionary.model.Word>> getDefinition(java.lang.String word) {
    definition = dictionaryRepository.definition(word);
    return definition;
}

@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_crash_if_not_aa() {
    io.nlopez.smartadapters.builders.AABindableLayoutBuilder builder = new io.nlopez.smartadapters.builders.AABindableLayoutBuilder();
    int viewType = mapper.viewTypeFromViewClass(builder.viewType(mockModel, 0, mapper));
    android.view.View bindableLayout = builder.build(parent, viewType, mockModel, mapper);
}

@java.lang.Override
public void onError(com.facebook.FacebookException error) {
    android.widget.Toast.makeText(this, "FaceBook Sign in Failed", Toast.LENGTH_SHORT).show();
    updateUI(null);
}

private void takePhoto() {
    assertNotNull(activity.findViewById(ca.ualberta.CMPUT301W15T06.R.id.takephoto));
    ((android.view.View) (activity.findViewById(ca.ualberta.CMPUT301W15T06.R.id.takephoto))).performClick();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((listener) != null) {
        if (!(listener.onGroupClick(getAdapterPosition()))) {
            expand();
        }else {
            collapse();
        }
    }
}

@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<com.chiragawale.folinsight.entity.Follower>> loader, java.util.List<com.chiragawale.folinsight.entity.Follower> data) {
    mFollowerAdapter.clear();
    mFollowerAdapter.addAll(data);
    progressBar.setVisibility(View.INVISIBLE);
}

void showWaitingRoom(com.google.android.gms.games.multiplayer.realtime.Room room) {
    android.util.Log.e("#####", "F: SHOW WAITING ROOM");
    android.content.Intent intent = Games.RealTimeMultiplayer.getWaitingRoomIntent(mGoogleApiClient, room, ((com.seankelly001.assassin.MainActivity.MIN_PLAYERS) + 1));
    mRoom = room;
    startActivityForResult(intent, com.seankelly001.assassin.MainActivity.RC_WAITING_ROOM);
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.List<com.example.rev.pocketglobe.data.Article>> loader) {
}

private void initSwipeRefreshLayout() {
    mSwipeRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (getActivity().findViewById(R.id.swiperefreshlayout)));
    mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimaryDark, R.color.colorPrimary);
    mSwipeRefreshLayout.setOnRefreshListener(this);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    saveInstanceStateForFields(outState, getInstance(), getInstance().getClass());
    super.onSaveInstanceState(outState);
}

public void showMeaning(android.view.View view) {
    view.setVisibility(View.GONE);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
}

@android.support.annotation.Nullable
public static java.lang.Double getDouble(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Double defaultValue) {
    return java.lang.Double.valueOf(com.pepperonas.aesprefs.AesPrefs.get(key, java.lang.String.valueOf(defaultValue)));
}

public void initColorTheme(java.lang.String name, int color) {
    this.setWindowTop(name, color);
}

@java.lang.Override
public void onStatusChanged(java.lang.String s, int i, android.os.Bundle bundle) {
}

@java.lang.Override
protected void onStart() {
    super.onStart();
}

public static final com.google.android.gms.maps.model.MarkerOptions PersonToMarkerOption(net.hokiegeek.android.dondeestas.data.Person p) {
    return new com.google.android.gms.maps.model.MarkerOptions().position(net.hokiegeek.android.dondeestas.Util.PositionToLatLng(p.getPosition())).title(p.getName());
}

private android.graphics.Bitmap loadFavicon(com.example.jose.updated.model.Page page) {
    webView.loadData(page.getContents(), "text/html", null);
    webView.setActivated(false);
    return webView.getFavicon();
}

@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    intent = new android.content.Intent(this, com.app.scope.myapplication.MainActivity.class);
    startActivity(intent);
    finish();
    return ;
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.rut0.sqllistsync.DbHelper.CREATE_TABLE);
}

public void setRightIcon5(int drawableRes) {
    if ((rightIcon5View) == null) {
        rightIcon5View = ((android.widget.ImageButton) (rightIcon5ViewStub.inflate()));
    }
    rightIcon5View.setImageResource(drawableRes);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save :
            saveFile();
            return true;
        default :
            return true;
    }
}

public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    return new android.support.v4.content.CursorLoader(mContext, SongContract.SongData.CONTENT_URI, null, null, null, null);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    mainContentRVAdapter.readDataFromDB(readListContent());
    rv_main_content.setAdapter(mainContentRVAdapter);
}

public void run() {
    android.content.Intent i = new android.content.Intent();
    android.os.Bundle b = new android.os.Bundle();
    i.setClass(this, utc_4910.screenActivities.CreateBucketActivity.class);
    startActivity(i);
}

@java.lang.Override
public void onBufferingUpdate(android.media.MediaPlayer mp, int percent) {
    if ((this.bufferingUpdateListener) != null)
        this.bufferingUpdateListener.onBufferingUpdate(mp, percent);
    
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.example.xyzreader.ui.ArticleListActivity.TAG, "snack clicked!!!!!!!!");
    mIsRefreshing = true;
    refresh();
    updateRefreshingUI();
}

public io.reactivex.Observable<info.blockchain.wallet.payload.data.Wallet> createHdWallet(java.lang.String password, java.lang.String walletName, java.lang.String email) {
    return rxPinning.call(() -> payloadService.createHdWallet(password, walletName, email)).compose(piuk.blockchain.android.data.rxjava.RxUtil.applySchedulersToObservable());
}

@java.lang.Override
public void onClick(android.view.View v) {
    expressionListener("0");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    proceedToTheNextActivity();
}

public boolean contains(java.lang.String key) {
    android.content.SharedPreferences prefs = getSharedPreferences();
    return prefs.contains(key);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progresValue, boolean fromUser) {
    progress = progresValue;
    if ((sunView) != null) {
        sunView.redraw(progress);
    }
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if (mFinishActivity) {
        android.widget.Toast.makeText(getActivity(), "จำเป็นต้องได้รับอนุญาตในการเข้าถึงข้อมูลตำแหน่งของคุณ", Toast.LENGTH_SHORT).show();
    }
}

protected void setBits(android.graphics.Bitmap[] bits) {
    BackgroundImage = bits[0];
    set = true;
}

@java.lang.Override
public void onPhotoStoreReady(int requestId, byte[] data) {
    mStorageController.storePicture(data);
    getCurrentState().onPhotoStoreReady(data);
}

public void decrement(android.view.View view) {
    if ((quantity) > 0) {
        quantity = (quantity) - 1;
    }
    display(quantity);
}

@android.support.annotation.CallSuper
protected void doLoadItems() {
    isLoading = true;
    if ((adapter) != null) {
        adapter.showLoadingState(isLoading);
    }
    onDoLoadItems();
    timber.log.Timber.d("Loading items ...");
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((gem.com.support_client.screen.feedback.listfeedback.FeedbackAdapter.mListener) != null) {
        gem.com.support_client.screen.feedback.listfeedback.FeedbackAdapter.mListener.onRecyclerViewClick(getLayoutPosition());
    }
}

public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    v = inflater.inflate(R.layout.blueprint_layout, container, false);
    new com.connorboyle.elitetools.GetModulesTask(this).execute();
    setupControls();
    return v;
}

@java.lang.Override
public void onSuccess(org.deviceconnect.android.deviceplugin.fplug.fplug.FPLUGResponse response) {
    if ((getActivity()) != null) {
        updateText(root, R.id.init_res, getString(R.string.success));
    }
}

protected abstract void populateView(android.view.View v, T model, int position);

protected final android.view.accessibility.AccessibilityNodeInfo findNodeByText(java.lang.String text, int index) {
    return findNodeByText(text, index, 0);
}

private void setUpTest() {
    android.content.Intent intent = getIntent();
    if (intent.hasExtra(TestActivity.CURRENT_TEST))
        mTest = intent.getParcelableExtra(TestActivity.CURRENT_TEST);
    
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int progress = seekBar.getProgress();
    seekTo(progress);
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoLayout.TAG, "onStopTrackingTouch");
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkBox.performClick();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    setHasOptionsMenu(true);
    com.cogn.wifirecord.SettingsActivity.bindPreferenceSummaryToValue(findPreference(getString(R.string.key_number_of_scans)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
}

public void ListenButtonClick(final android.view.View view) {
    AIService.startListening();
}

public void updateNumConnectedOutput(android.view.View view) {
    java.lang.String a = java.lang.Integer.toString(hub.getNumConnected());
    numConnectedOutput.setText(a);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    java.security.Security.insertProviderAt(new org.spongycastle.jce.provider.BouncyCastleProvider(), 1);
}

@java.lang.Override
public void push(android.os.Bundle UpdateSnapshot) {
    if (UpdateSnapshot == null)
        return ;
    
    UpdateContent = UpdateSnapshot;
    ViewUpdate.post(this);
}

public void setFeedPartners(org.esn.mobilit.utils.parser.RSSFeed feedPartners) {
    this.feedPartners = feedPartners;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    upLloadUserToServer();
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i1) {
    android.util.Log.d(App.TAG, "onError");
    return false;
}

@java.lang.Override
public void run() {
    startPendingIntentDismissingKeyguard(intent);
}

private android.view.View createView(android.view.ViewGroup parent) {
    android.view.LayoutInflater layoutInflater = ((android.view.LayoutInflater) (getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    return layoutInflater.inflate(layout, parent, false);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.menu.menu, menu);
    return true;
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, "Wallpaper set", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    startService(intent);
    stopSelf();
    return START_NOT_STICKY;
}

public void setPackageName(java.lang.String packageName) {
    android.content.SharedPreferences.Editor editor = getPrefs().edit();
    editor.putString(net.oldev.aDictOnCopy.DictionaryOnCopyService.SettingsModel.PREFS_PACKAGE_NAME, packageName);
    editor.commit();
    fireChangeEvent();
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    if ((getActivity()) != null) {
        ((com.door43.translationstudio.MainActivity) (getActivity())).closeKeyboard();
    }
}

private void launchMain() {
    time = 0;
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.mad.utsstudcentre.Controller.MainActivity.class);
    startActivity(intent);
    finish();
}

