protected void onCreate(android.os.Bundle savedInstanceState) {
    setTheme(R.style.Theme_AppCompat_Light_DarkActionBar);
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_calltheroll);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    init();
    addIslandsToDB();
    loginSavedUser();
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    java.lang.System.out.println("error with media player");
    return true;
}

@java.lang.Override
public android.view.LayoutInflater cloneInContext(android.content.Context newContext) {
    return new cn.nekocode.emojix.EmojixLayoutInflater(this, newContext);
}

public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.Nullable
android.graphics.Bitmap icon) {
    mIcon = com.danimahardhika.cafebar.CafeBarUtil.toDrawable(mContext, icon);
    return this;
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(getName());
    dest.writeString(getLocation());
    dest.writeValue(getStartTime());
    dest.writeValue(getEndTime());
}

@java.lang.Override
@android.support.annotation.NonNull
public java.util.Iterator<cgeo.geocaching.maps.mapsforge.v6.caches.GeoitemLayer> iterator() {
    return this.geoitems.values().iterator();
}

public void onPageFinished(android.webkit.WebView view, java.lang.String address) {
    android.util.Log.e(ru.kuchanov.odnako.db.ServiceDB.LOG, "onPageFinished");
    view.loadUrl("javascript:console.log('MAGIC'+'<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
}

@java.lang.Override
protected void onPreExecute() {
    alertDialog = new android.app.AlertDialog.Builder(context).create();
    alertDialog.setTitle("Login");
}

private void doTheMainTask() throws com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantDeleteRecordException, com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantLoadTableToMemoryException, com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantUpdateRecordException, com.bitdubai.fermat_bch_api.layer.crypto_module.crypto_address_book.exceptions.CantRegisterCryptoAddressBookRecordException, com.bitdubai.fermat_bch_api.layer.crypto_network.bitcoin.exceptions.CantBroadcastTransactionException, com.bitdubai.fermat_bch_api.layer.crypto_network.bitcoin.exceptions.CantGetBroadcastStatusException, com.bitdubai.fermat_bch_api.layer.crypto_network.bitcoin.exceptions.CantGetCryptoTransactionException, com.bitdubai.fermat_bch_api.layer.crypto_vault.asset_vault.exceptions.CantCreateBitcoinTransactionException, com.bitdubai.fermat_bch_api.layer.crypto_vault.exceptions.CantCreateDraftTransactionException, com.bitdubai.fermat_bch_api.layer.crypto_vault.exceptions.CantSignTransactionException, com.bitdubai.fermat_dap_api.layer.all_definition.exceptions.DAPException, com.bitdubai.fermat_dap_api.layer.dap_wallet.asset_issuer_wallet.exceptions.CantRegisterDebitException, com.bitdubai.fermat_dap_api.layer.dap_wallet.common.exceptions.CantGetTransactionsException, com.bitdubai.fermat_dap_api.layer.dap_wallet.common.exceptions.CantLoadWalletException {
    checkUnreadMessages();
    checkPendingSells();
    checkTimeout();
}

public static boolean getZoomControlPreferences(android.content.Context ctx) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(ctx).getBoolean(Constants.PREF_SHOW_ZOOM_CONTROL, false);
}

public void launchIncludeContactPicker(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.mhmt.autoreplymate.activities.ContactPicker.class);
    if (edit) {
        intent.putExtra(com.mhmt.autoreplymate.activities.AddEditRule.outgoingExtraTag, includeString);
    }
    startActivityForResult(new android.content.Intent(this, com.mhmt.autoreplymate.activities.ContactPicker.class), com.mhmt.autoreplymate.activities.AddEditRule.PICK_INCLUDE_CONTACT_REQUEST);
}

public void insert(int position, com.saltycode.android.material2.material_playground.model.FeedItem item) {
    mItems.add(position, item);
    notifyItemInserted(position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.pokemongostats.view.dialogs.AddPkmnDialog() {
        @java.lang.Override
        public void onPokemonAdded(final com.pokemongostats.model.bean.Pokemon addedPokemon) {
            mCallback.onPokemonSelected(addedPokemon);
        }
    }.show(getFragmentManager(), com.pokemongostats.view.dialogs.AddTrainerDialog.class.getName());
}

public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    return false;
}

@java.lang.Override
public void onSelectDate(java.util.Date date, android.view.View view) {
    setSelectedDate(date);
    if ((calendarListener) != null) {
        calendarListener.onSelectDate(date);
    }
}

public void refreshDetails(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    mTextView.setText(relatedTopic.getText());
    android.util.Log.d(com.example.test.samplemasterdetail.fragments.DetailsFragment.TAG, ("refreshDetails: " + (mTextView)));
}

@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    connectAttempts = 0;
    if (loadSavedGame)
        loadSavedLevel();
    
    loadGameState();
}

@java.lang.Override
public void onTextFrame(com.neovisionaries.ws.client.WebSocket websocket, com.neovisionaries.ws.client.WebSocketFrame frame) throws java.lang.Exception {
    android.util.Log.i("fg", "onTextFrame");
    adapter.notifyItemRangeChanged(0, adapter.getItemCount());
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, at.sw2017.q_up.InfoActivity.class);
    intent.putExtra("title", at.sw2017.q_up.PlaceDetails.title);
    intent.putExtra("id", at.sw2017.q_up.PlaceDetails.id);
    startActivity(intent);
}

public void switchToBoardView() {
    if ((_viewAnimatorMain.getDisplayedChild()) != (jwtc.android.chess.pubnub.PubnubChessActivity.VIEW_MAIN_BOARD))
        _viewAnimatorMain.setDisplayedChild(jwtc.android.chess.pubnub.PubnubChessActivity.VIEW_MAIN_BOARD);
    
    startSession();
}

public void flush(@android.support.annotation.Nullable
com.google.android.sambadocumentsprovider.SambaConfiguration.OnConfigurationChangedListener listener) {
    new com.google.android.sambadocumentsprovider.SambaConfiguration.FlushTask(listener).execute();
}

public static void e(java.lang.String s) {
    if ((com.joe.zatuji.Constant.IS_DEBUG) || (com.joe.zatuji.helper.SettingHelper.isDebug())) {
        android.util.Log.e("Zatuji", s);
    }
}

public void animateRecyclerView() {
    recyclerView.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getActivity(), R.anim.bottom_to_top));
}

private android.graphics.Point convertSizeToLandscapeOrientation(android.graphics.Point size) {
    if (((getDisplaySurfaceOrientation()) % 180) != 0) {
        return size;
    }else {
        return new android.graphics.Point(size.y, size.x);
    }
}

private org.json.JSONArray transformCoordinate(com.google.android.gms.maps.model.LatLng latLng) throws org.json.JSONException {
    org.json.JSONArray jsonArray = new org.json.JSONArray();
    jsonArray.put(latLng.latitude);
    jsonArray.put(latLng.longitude);
    return jsonArray;
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(("Delete * FROM " + (com.example.john.knowwoodboardapp.DatabaseHandler.TABLE_NAME)));
    db.execSQL((("CREATE TABLE " + (com.example.john.knowwoodboardapp.DatabaseHandler.TABLE_NAME)) + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SCORE INTEGER)"));
}

public static boolean isInternetAvailable(android.content.Context context) {
    android.net.ConnectivityManager service = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo info = service.getActiveNetworkInfo();
    return info == null;
}

public void suspend() {
    android.util.Log.d("mbta", "Suspending");
    if ((m_db) != null) {
        m_db.close();
        m_db = null;
    }
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
private void tintTaskDescription(int colorId, java.lang.String name, android.app.Activity activity) {
    android.app.ActivityManager.TaskDescription tDesc = new android.app.ActivityManager.TaskDescription(name, null, activity.getResources().getColor(colorId));
    activity.setTaskDescription(tDesc);
}

@butterknife.OnClick(value = R.id.text_send_log)
public void onClickTextSendLog() {
    if (isDataLogSelected) {
        android.util.Log.d(Constants.LOG_TAG, "onClickTextSendLog");
        org.cmucreatelab.flutter_android.ui.dialogs.EmailDialog emailDialog = org.cmucreatelab.flutter_android.ui.dialogs.EmailDialog.newInstance(workingDataSet);
        emailDialog.show(getSupportFragmentManager(), "tag");
    }
}

public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
}

@java.lang.Override
public void onClick(android.view.View v) {
    it.bsdsoftware.library.BSDUtility.handleClickItem(getActivity(), image, gallery);
}

@java.lang.Override
protected void onPause() {
    if (logging)
        android.util.Log.d("MainActivity", "Start: onPause()");
    
    super.onPause();
    this.onClick(mStopButton);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((keyword) != null) {
        android.util.Log.i("keyword-> ", ("" + (keyword)));
        search(keyword);
    }
    adapter.notifyDataSetChanged();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    app.mapquest.com.mapquest.api.Getting.syncLocalDatastoreWithServer();
}

private void quitTinyScreen(android.view.ViewGroup itemContainer) {
    mXibaVideoPlayer.quitTinyScreen(itemContainer);
    mXibaVideoPlayer.setTinyScreenEventCallback(null);
    savePlayerInfo();
}

@butterknife.OnClick(value = R.id.enterConnect3)
public void setmEnterConnect3() {
    android.widget.Toast.makeText(getActivity(), "The button works", Toast.LENGTH_SHORT).show();
    startActivity(new android.content.Intent(getActivity(), com.example.kevin_sct.beastchat.activities.GameActivity.class));
}

@java.lang.Override
public void onResume() {
    if (this.application.getKioskModeEnabled()) {
        android.content.Intent intent = new android.content.Intent(this, org.fourdnest.androidclient.ui.NewEggActivity.class);
        this.startActivity(intent);
        finish();
    }
    super.onResume();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("debug", "quicklistener");
    attemptLogin();
    android.content.Intent myIntent = new android.content.Intent(this, app.com.example.shaunchua.sentientemr.NavigationActivity.class);
    this.startActivity(myIntent);
}

public static com.z299studio.pb.Application getInstance(android.app.Activity context) {
    if ((com.z299studio.pb.Application.__instance) == null) {
        com.z299studio.pb.Application.__instance = new com.z299studio.pb.Application(context);
    }
    com.z299studio.pb.Application.__instance.mContext = context;
    return com.z299studio.pb.Application.__instance;
}

@java.lang.Override
public void setCallback(com.scooter1556.sms.android.activity.Callback callback) {
}

public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    startPushData = getPushFromIntent(intent);
    checkMessage(intent);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return new com.codepath.apps.restclienttemplate.fragment.HomeTimelineFragment();
    }else
        if (position == 1) {
            return new com.codepath.apps.restclienttemplate.fragment.MentionsTimelineFragment();
        }else {
            return null;
        }
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    doFirst();
    setContentView(mContentView);
    findViews();
    mRes = getApplicationContext().getResources();
    doCreate();
}

public void setEmptyView(android.view.View emptyView) {
    setEmptyView(false, emptyView);
}

@java.lang.Override
public void onClick(android.view.View v) {
    org.wordpress.android.ui.people.RoleSelectDialogFragment.show(this, 0, mSite.isPrivate());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    context = this;
    android.content.SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
    setLocale(prefs.getString("lang", "undefined"));
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    android.util.Log.v(com.android.camera.VideoUI.TAG, ((("surfaceChanged: width = " + width) + ", height = ") + height));
    hidePreviewCover();
}

public static synchronized com.example.ajinkya.stayhealthysg.MySingleton getInstance(android.content.Context context) {
    if ((com.example.ajinkya.stayhealthysg.MySingleton.mInstance) == null) {
        android.util.Log.v(com.example.ajinkya.stayhealthysg.MySingleton.TAG, "Already called");
        com.example.ajinkya.stayhealthysg.MySingleton.mInstance = new com.example.ajinkya.stayhealthysg.MySingleton(context);
    }
    return com.example.ajinkya.stayhealthysg.MySingleton.mInstance;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable arg0) {
    arrTemp[holder.ref] = java.lang.Double.parseDouble(arg0.toString());
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    initTaskDescription();
    initTheme();
    super.onCreate(savedInstanceState);
    mFragmentManagerHelper = new com.ebnbin.ebapplication.base.FragmentManagerHelper(getFragmentManager(), android.R.id.content);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mCallbackManager = CallbackManager.Factory.create();
    setupTokenTracker();
    setupProfileTracker();
    mTokenTracker.startTracking();
    mProfileTracker.startTracking();
}

private void connectServer() {
    android.util.Log.i("Connecting ", null);
}

private void updateCanvas(android.graphics.Canvas canvas) {
    drawIcons(canvas);
    drawSelectedIcon(canvas);
    if (!(mIsTouchUp)) {
        return ;
    }
}

public long getTimeRemaining() {
    if (BuzzWordsApplication.DEBUG) {
        android.util.Log.d(com.buzzwords.PauseTimer.TAG, "getTimeRemaining()");
    }
    return this.mTimeRemaining;
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    menu.add("Clear Fields");
    menu.add("Stop Arrival Notification");
    menu.add("Start Arrival Notification");
    return true;
}

public void onSensorChanged(android.hardware.SensorEvent event) {
    x = event.values[0];
    y = event.values[1];
    z = event.values[2];
}

public void reloadSentMessages() {
    android.support.v4.app.Fragment fragment = pageAdapter.getRegisteredFragment(2);
    ((au.com.wallaceit.reddinator.ui.AccountFeedFragment) (fragment)).reload();
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.e("Error", "That didn't work!");
    android.widget.Toast.makeText(getApplicationContext(), "Unable to connect to server. Swipe down to try again.", Toast.LENGTH_SHORT).show();
}

private void drawLayoutCell(android.graphics.Canvas canvas) {
    canvas.drawRect(0, 1, getWidth(), getHeight(), cellPaint);
}

public int getUnitSystemType() {
    java.lang.String unitSystem = prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_UNIT_SYSTEM, null);
    if (unitSystem == null)
        return org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_UNIT_SYSTEM;
    
    return java.lang.Integer.parseInt(unitSystem);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String query = "CREATE TABLE todoList(_id INTEGER PRIMARY KEY AUTOINCREMENT," + " task TEXT)";
    android.util.Log.d("SQL-create", query);
    db.execSQL(query);
}

@java.lang.Override
public void register(java.lang.String pluginName) throws android.os.RemoteException {
    if (plugins.contains(pluginName)) {
        plugins.add(pluginName);
    }
}

private void register() {
    android.util.Log.e(com.mingle.autolist.AutoList.Tag, "register  Bus");
    com.mingle.utils.BusProvider.getInstance().register(this);
}

private android.support.v4.app.Fragment getCurrentFragment() {
    return getSupportFragmentManager().findFragmentById(R.id.configuration_screen);
}

public void onConnected(android.os.Bundle connectionHint) {
    if (mRequestingLocationUpdates) {
        startLocationUpdates();
    }
}

@java.lang.Override
public void onNext(java.util.List<com.angelkjoseski.live_results.model.Fixture> value) {
    android.util.Log.d(com.angelkjoseski.live_results.service.LiveResultsFetcherService.TAG, "onNext: ");
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("Clicked!");
    se.chalmers.projektgrupplp4.studentlivinggbg.SearchWatcherActivity.toggle();
}

public void loadAllOnlineData() {
    android.util.Log.d("WeFriends", "Loading All Data.");
    asyncTask.retrieveAndHandleNewMessages();
    asyncTask.loadOnlineFriendList();
    initNotifierService();
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    myView.setVisibility(View.VISIBLE);
}

protected void addViewToBody(android.view.View child) {
    paragraph.addView(child);
}

@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    android.widget.Toast.makeText(getActivity(), "Right!", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(new com.druger.firstandroidgame.GamePanel(this));
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
}

public void addButtonPressed() {
    android.content.Intent addIntent = new android.content.Intent(this, com.example.sung.timetracker.EditListActivity.class);
    listDatas = adapter.getListItems();
    addIntent.putExtra("LIST_DATA_TO_EDIT", listDatas);
    startActivityForResult(addIntent, com.example.sung.timetracker.ListActivity.REQ_ADD);
}

@java.lang.Override
public void onClick(android.view.View v) {
    doSearch();
    mSectionsPagerAdapter = new com.vchoose.Vchoose.MainPagerActivity.SectionsPagerAdapter(getSupportFragmentManager(), jsonlist);
    mViewPager.setAdapter(mSectionsPagerAdapter);
}

@java.lang.Override
public void onClick(android.view.View v) {
    LockControl(0, false);
}

@java.lang.Override
public void run() {
    android.content.Intent mainIntent = new android.content.Intent().setClass(this, com.bquiet.bquiet.activities.MainActivity.class);
    startActivity(mainIntent);
    finish();
}

public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        c.close();
        finish();
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}

@java.lang.Override
public com.google.android.gms.vision.Tracker<com.google.android.gms.vision.face.Face> create(com.google.android.gms.vision.face.Face face) {
    return new facetracker.donlingliang.facetrack.MainActivity.GraphicFaceTracker(mGraphicOverlay);
}

@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    com.demo.dropboxupload.utils.Preferences.setPreference(AppConstants.KEY_BOX_REFRESH_TOKEN, info.refreshToken(), mParentActivity);
    mParentActivity.startFilesActivity(info.accessToken());
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mBluetoothAdapter.cancelDiscovery();
    android.util.Log.d(edu.gatech.cc.cs7470.facecard.View.activities.MainActivity.TAG, "onDestroy GoogleApiClient disconnected");
    if (mGoogleApiClient.isConnected()) {
        mGoogleApiClient.disconnect();
    }
    super.onDestroy();
}

@java.lang.Override
public void onDataInserted(int positionStart, int itemCount) {
    mAdapter.notifyItemRangeInserted(positionStart, itemCount);
    mEventBus.post(new de.fau.cs.mad.fablab.android.view.fragments.icalandnews.NewsListChangeEvent(mAdapter.getItemCount()));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
    mContext = getBaseContext();
    mPresenter.attach();
}

private static void bindPreferenceSummaryToValue(android.preference.Preference preference) {
    preference.setOnPreferenceChangeListener(com.example.vijay.popularmovies.SettingsActivity.sBindPreferenceSummaryToValueListener);
    com.example.vijay.popularmovies.SettingsActivity.sBindPreferenceSummaryToValueListener.onPreferenceChange(preference, android.preference.PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), ""));
}

@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent propertyChangeEvent) {
    if (propertyChangeEvent.getPropertyName().equals("MatchList")) {
        android.util.Log.d("Yellow", "wallah");
        this.hasMatches = true;
        adapter.setHasMatches(true);
    }
}

@java.lang.Override
public void attach(uk.co.rossbeazley.trackmytrain.android.wear.trackingScreen.ServiceView serviceView) {
    this.serviceViews.add(serviceView);
    announceServiceViewAttached(serviceView);
    notificationManager.serviceViewAttached();
}

@java.lang.Override
public void onClick(android.view.View v) {
    cn.shyman.library.picture.picker.SPPicker.picker().count(9).compress(80).build(this, 1);
}

@java.lang.Override
protected void onPostExecute(final java.lang.Boolean success) {
    if (success) {
        java.lang.System.out.println("Remove Task succeed");
    }else {
        android.widget.Toast.makeText(getContext(), "内部错误，您的任务将自动关闭", Toast.LENGTH_LONG).show();
        java.lang.System.out.println("Remove Task Failed!");
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(this, mName, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onEnabled(android.content.Context context) {
    super.onEnabled(context);
    android.content.Intent intent = new android.content.Intent(de.reikodd.meinwidget.MainActivity.UpdateTimeService.UPDATE);
    intent.setPackage("de.reikodd.meinwidget");
    context.startService(intent);
    de.reikodd.meinwidget.MainActivity.mcontext = context;
}

public com.shapematchandroid.Score deduct(int pts) {
    return new com.shapematchandroid.Score((points -= pts));
}

private void scanPhoto(java.io.File imageFile) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    android.net.Uri contentUri = android.net.Uri.fromFile(imageFile);
    mediaScanIntent.setData(contentUri);
    cordova.getActivity().sendBroadcast(mediaScanIntent);
}

protected void createLocationRequest() {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(UPDATE_INTERVAL);
    mLocationRequest.setFastestInterval(FATEST_INTERVAL);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    mLocationRequest.setSmallestDisplacement(DISPLACEMENT);
}

@java.lang.Override
public void onOpened(boolean isSuccess) {
    if (isSuccess) {
        com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onCameraReady();
    }else {
        com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onCameraBusy();
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    mItemLongClickListener.onItemLongClick(view, realData.get(position), position);
    return true;
}

public void log(java.lang.String msg) {
    android.util.Log.d("MyApp", msg);
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.util.Log.d(com.example.notepad.NoteList.TAG, "onPause");
    if ((mSelectAll) != null) {
        changeDeleteMode(false);
    }
    mToolbar.setNavigationIcon(R.drawable.ic_event_note_white_3x);
}

public static float pxToDp(float px, android.content.Context context) {
    android.content.res.Resources resources = context.getResources();
    android.util.DisplayMetrics metrics = resources.getDisplayMetrics();
    float dp = px / ((metrics.densityDpi) / 160.0F);
    return dp;
}

