public void setGridData(java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> mGridData) {
    this.mGridData = mGridData;
    android.util.Log.v(com.example.android.popmovies.MovieImagesAdapter.TAG, mGridData.get(0).get("imageUrl"));
    notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) - 1) % (mQuestionBank.length);
    updateQuestion();
}

public void onSingleTap() {
    android.content.Intent launchIntent = packagemanager.getLaunchIntentForPackage(sPrefs.getSelectedApp(2));
    startActivity(launchIntent);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.example.android.popularmoviesstagetwo.model.MoviesListResponse> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(getContext(), getString(R.string.internet_connection_message), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    window.setStatusBarColor(((java.lang.Integer) (valueAnimator.getAnimatedValue())));
}

@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user == null) {
        startActivity(new android.content.Intent(this, bt.com.bombardiertransportation.LoginActivity.class));
        finish();
    }
    displaySelectedScreen(R.id.nav_QRDevice);
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    okButton.setProgress(0);
}

private void setDesc(java.lang.String desc) {
    android.widget.TextView post_desc = ((android.widget.TextView) (mView.findViewById(R.id.post_desc)));
    post_desc.setText(desc);
}

@java.lang.Override
public void onFailure(java.lang.Throwable error) {
    android.util.Log.e("seyi", "farmer fetch failed");
    android.util.Log.e("TAG", "failed to fetchFarmersIntoRealm", error);
}

@java.lang.Override
protected void onPause() {
    android.util.Log.v(com.example.andrea.tabsactionbar.chat.ConversationActivity.TAG, "onPause");
    if (bound) {
        unregisterConversation();
        unbindService(mConnection);
        mService = null;
    }
    super.onPause();
}

private void startHeadsetStateListener() {
    if ((receiver) == null) {
        android.content.IntentFilter receiverFilter = new android.content.IntentFilter(android.content.Intent.ACTION_HEADSET_PLUG);
        receiver = new ca.uqac.florentinth.speakerauthentication.Audio.HeadsetStateReceiver();
        registerReceiver(receiver, receiverFilter);
    }
}

public void defineTextViews() {
    rosTextView = ((org.ros.android.view.RosTextView<msgs.ImageData>) (com.github.ros_java.android_ROS.controller.Listener.app.findViewById(R.id.text)));
    rosTextView.setTopicName(topic);
    if (msgTyp.equals("msgs/ImageData")) {
        listenForImageData();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.leosko.todotxt_gdrive.TaskEditDialog ted = new com.leosko.todotxt_gdrive.TaskEditDialog(this, null);
    android.app.AlertDialog.Builder builder = ted.createTaskCreationDialog();
    final android.app.AlertDialog alertD = builder.create();
    alertD.show();
}

public static boolean needPermission(android.app.Activity activity, java.lang.String[] permissions) {
    for (java.lang.String permission : permissions) {
        if (org.gem.indo.dooit.helpers.permissions.PermissionsHelper.needPermission(activity, permission)) {
            return false;
        }
    }
    return true;
}

public void run() {
    try {
        android.app.Instrumentation inst = new android.app.Instrumentation();
        inst.sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
    } catch (java.lang.Exception e) {
        android.util.Log.w("TAG-T1", e.toString());
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    try {
        startForeground(com.tencent.tinker.lib.service.TinkerPatchService.notificationId, new android.app.Notification());
    } catch (java.lang.NullPointerException e) {
        com.tencent.tinker.lib.util.TinkerLog.e(com.tencent.tinker.lib.service.TinkerPatchService.TAG, "InnerService set service for push exception:%s.", e);
    }
    stopSelf();
}

private void handleErrorUpload() {
    dialog.dismiss();
    android.widget.Toast.makeText(mContext, R.string.error_has_occurred, Toast.LENGTH_SHORT).show();
    exitActivity();
}

public void setMusicUrls(java.util.List<java.lang.String> music) {
    musicUrls = music;
    TOR = new android.os.Parcelable.Creator<com.example.seanholcomb.spotifystreamer.ArtistParcel>() {
        {
        }
    };
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    mNotificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    android.util.Log.d(Constants.DEBUG_TAG, "NotificationService : onCreate");
    setState("start");
}

public org.ei.opensrp.domain.FetchStatus sync() {
    org.ei.opensrp.domain.FetchStatus fetchStatus = pullFromServer();
    android.content.org.ei.opensrp.Context.getInstance().pullAllDataFromCloudant();
    android.content.org.ei.opensrp.Context.getInstance().pushAllDataToCloudant();
    return fetched;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            finish();
            java.lang.System.exit(0);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@android.support.annotation.NonNull
@java.lang.Override
protected java.lang.String getIdColumnName(@android.support.annotation.NonNull
android.content.ContentValues contentValues) {
    return com.pushtorefresh.storio.sqlitedb.impl.Tweet.COLUMN_ID;
}

@java.lang.Override
public void onAttach(final android.app.Activity activity) {
    super.onAttach(activity);
    this.activity = activity;
    this.application = ((de.schildbach.wallet.WalletApplication) (activity.getApplication()));
    this.packageManager = activity.getPackageManager();
}

android.graphics.Bitmap readFile(java.io.File file) {
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(file.getPath());
    return bitmap;
}

@java.lang.Override
public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl) {
    android.opengl.GLES20.glClear(((android.opengl.GLES20.GL_COLOR_BUFFER_BIT) | (android.opengl.GLES20.GL_DEPTH_BUFFER_BIT)));
    mFilter.onDrawFrame(gl);
}

@java.lang.Override
public android.content.Loader<java.util.List<fr.sims.coachingproject.model.UserProfile>> onCreateLoader(int id, android.os.Bundle args) {
    return new fr.sims.coachingproject.loader.network.GroupMembersLoader(getContext(), mGroupId, true);
}

@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<tomsnuverink.com.workoutapp.model.Exercise>> call, retrofit2.Response<java.util.List<tomsnuverink.com.workoutapp.model.Exercise>> response) {
    android.util.Log.v("MAIN_ACTIVITY", response.body().toString());
    setAdapter(response.body());
}

public void removeFace(int index) {
    com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.get(index).stopSound();
    com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.remove(index);
    android.util.Log.d("fffa", "fffafffafffafffafffafffafffafffafffafffa");
}

@java.lang.Override
public void onResults(android.os.Bundle results) {
    android.util.Log.d(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.TAG, ("onResults " + results));
    java.util.List<java.lang.String> data = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
    m_listener.onRecognitionDone(data);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        lock.toggleLock(((app.lock.bluetooth.smart_lock_app.LockListScreen) (mContext)));
    }
}

public void close() throws java.io.IOException {
    net.fdloch.wifiPresenter.android.network.Connection.log.debug("Going to close socket...");
    this.in.close();
    this.out.close();
    this.socket.close();
    net.fdloch.wifiPresenter.android.network.Connection.log.debug("Successfully closed socket!");
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mp.isPlaying())
        mp.stop();
    
    finish();
}

private void sendToUnity(java.lang.String cmd) throws java.io.IOException {
    out = new java.io.BufferedWriter(new java.io.OutputStreamWriter(socket.getOutputStream()));
    out.write(cmd);
    out.flush();
    android.util.Log.d("sendUnity", cmd);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mAdapter = new android.widget.ArrayAdapter<ke.co.appslab.mu_graduation.fragments.dummy.DummyContent.DummyItem>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, ke.co.appslab.mu_graduation.fragments.dummy.DummyContent.ITEMS);
}

public static com.pquach.vocabularynote.WordFragment newInstance(long category) {
    com.pquach.vocabularynote.WordFragment fragment = new com.pquach.vocabularynote.WordFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putLong(Constant.ARG_CATEGORY, category);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    savedInstanceState.putInt("Position", myVideoView.getCurrentPosition());
    myVideoView.pause();
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    mFocusedView = (hasFocus) ? v : null;
    if (hasFocus && ((mReceipt) == null)) {
        new co.smartreceipts.android.widget.ShowSoftKeyboardOnFocusChangeListener().onFocusChange(v, hasFocus);
    }
}

private com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord constructBalanceRecord(final long availableRunningBalance, final long bookRunningBalance, com.bitdubai.fermat_api.layer.all_definition.enums.BlockchainNetworkType blockchainNetworkType) throws com.bitdubai.fermat_ccp_plugin.layer.basic_wallet.bitcoin_wallet.developer.bitdubai.version_1.exceptions.CantGetBalanceRecordException {
    com.bitdubai.fermat_api.layer.osa_android.database_system.DatabaseTableRecord record = getBalancesRecord(blockchainNetworkType);
    record.setLongValue(BitcoinWalletDatabaseConstants.BITCOIN_WALLET_BALANCE_TABLE_AVAILABLE_BALANCE_COLUMN_NAME, availableRunningBalance);
    record.setLongValue(BitcoinWalletDatabaseConstants.BITCOIN_WALLET_BALANCE_TABLE_BOOK_BALANCE_COLUMN_NAME, bookRunningBalance);
    return record;
}

public static void storeSession(android.content.Context context, long session) {
    android.content.SharedPreferences sharedPreferences = com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context);
    sharedPreferences.edit().putLong(com.silverpop.engage.config.EngageConfig.SharedProperties.SESSION.toString(), session).commit();
}

public static android.text.Spanned fromHtml(java.lang.String source, org.wordpress.aztec.spans.UnknownHtmlSpan.OnUnknownHtmlClickListener onUnknownHtmlClickListener, android.content.Context context, java.util.List<org.wordpress.aztec.plugins.IAztecPlugin> plugins) {
    return org.wordpress.aztec.Html.fromHtml(source, null, onUnknownHtmlClickListener, context, plugins);
}

public void setColorPressed(@android.support.annotation.ColorRes
int colorPressed) {
    this.mColorPressed = getColor(colorPressed);
    updateBackground();
}

private void getExtras() {
    android.os.Bundle bundle = getArguments();
    keyword = bundle.getString(com.jds.webapp.Fragment.FragmentListArticle.KEY_WORD);
}

void onItemClick(android.view.View view, M content, int position);

@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    android.widget.Toast.makeText(((com.example.thaislins.twitter.activities.DirectMessageActivity) (context)), "Server Stopped!", Toast.LENGTH_SHORT).show();
}

public void onDrawerOpened(android.view.View drawerView) {
    getSupportActionBar().setTitle(mDrawerTitle);
    invalidateOptionsMenu();
}

@java.lang.Override
public void onDisconnect() {
    android.util.Log.v(me.iasc.vultureegg.app.DeviceControlActivity.TAG, "mCottonServer onDisconnect");
    me.iasc.vultureegg.app.DeviceControlActivity.isCottonReady = false;
}

public void run() {
    android.util.Log.i(com.dubstin.btslapjack.MainActivity.TAG, "HERE111111");
    sendBluetoothMessage("passedAllJacks");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_navigation);
    initNavigation();
    new com.ws.apple.ayuep.proxy.DeviceProxy().registerDevice(this);
}

public static java.lang.String getPackageVersionName(final android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
    android.content.pm.PackageInfo info = com.jana.android.core.utils.DeviceInfo.getPackageInfo(context);
    java.lang.String version = info.versionName;
    return version;
}

@butterknife.OnClick(value = R.id.btn_End)
void onBtnEndClick() {
    android.widget.Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
    edu.aku.hassannaqvi.codi.core.AppMain.endActivity(this, this);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.home_menu, menu);
    android.view.MenuItem item = menu.findItem(R.id.menu_item_share);
    mShareActionProvider = ((android.support.v7.widget.ShareActionProvider) (android.support.v4.view.MenuItemCompat.getActionProvider(item)));
    return true;
}

@java.lang.Override
public sunny.com.criminalintent.CrimeListFragment.CrimeHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater layoutInflater = android.view.LayoutInflater.from(getActivity());
    android.view.View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
    updateUI();
    return new sunny.com.criminalintent.CrimeListFragment.CrimeHolder(view);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent settingIntent = new android.content.Intent(getApplicationContext(), com.example.yink.amadeus.SettingsActivity.class);
    startActivity(settingIntent);
}

public android.graphics.drawable.Drawable getBitmapToDrawable(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
    java.lang.System.out.println(("bitmap ::: " + bitmap));
    if (bitmap == null)
        return null;
    
    return new android.graphics.drawable.BitmapDrawable(resources, bitmap);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    saveGame();
    finish();
}

@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    android.util.Log.i(qwikstats.qwikcut.kerbysoft.com.qwikstats.drivetools.BaseDriveActivity.TAG, "GoogleApiClient connected");
    showMessage("Connection Successful!!!");
}

public java.lang.String getText() {
    if (android.text.TextUtils.isEmpty(text))
        return "";
    else
        return text;
    
}

@java.lang.Override
public void onDismissedBySwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] reverseSortedPositions) {
    for (int position : reverseSortedPositions) {
        mItems.remove(position);
        mTripListAdapter.notifyItemRemoved(position);
    }
    mTripListAdapter.notifyDataSetChanged();
}

public void addMasterList(java.lang.String value) {
    if (!(masterList.contains(value))) {
        if (value.contains("Treffer1")) {
            android.util.Log.d("testitest", "treffer1");
        }
        masterList.add(value);
    }
}

public void goToSceneComments(android.view.View view) {
    try {
        sceneId = Constants.sceneImages;
        moveButton(view);
    } catch (java.lang.Exception ex) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(Constants.LOG, ex.getMessage());
        }
    }
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        if (doneMenuItem.isVisible()) {
            showNotSaveNoteDialog();
        }
        return true;
    }
    return super.onKeyDown(keyCode, event);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase database) {
    database.execSQL((((((com.fyp.n3015509.db.MySQLiteHelper.CREATE_BOOK_TABLE) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_AUTHOR_TABLE)) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_BUZZLIST_TABLE)) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_BOOK_INTERIM_TABLE)) + (com.fyp.n3015509.db.MySQLiteHelper.CREATE_BUZZLIST_INTERIM_TABLE)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    (giveup)++;
    balanceText.setText((("COMMON FURSE: " + (commonPurse)) + ((giveup) * 50)));
}

@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String previousChildName) {
    android.util.Log.d(tpdev.megaphone.MapsActivity.TAG, ("onChildAdded:" + (dataSnapshot.getKey())));
    tpdev.megaphone.db.Message message = dataSnapshot.getValue(tpdev.megaphone.db.Message.class);
    add_message_marker(message);
}

private void startReboot() {
    android.util.Log.v(com.general.mediaplayer.csr.services.CsrManagerService.TAG, "==CsrManagerService==startReboot==");
    if (!(this.mRebootIsDo)) {
        android.util.Log.v(com.general.mediaplayer.csr.services.CsrManagerService.TAG, "==CsrManagerService==startReboot==do=========");
        this.mRebootIsDo = true;
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    nextAddestatePage(4);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    intent1.putExtra("cartype", mCarType);
    startActivity(intent1);
}

private void drawList() {
    this.adapter = new android.widget.ArrayAdapter<ch.hgdev.toposuite.points.Point>(this, R.layout.history_list_item, new java.util.ArrayList(this.orthoImpl.getMeasures()));
    this.measuresListView.setAdapter(this.adapter);
}

@java.lang.Override
public void onAudioFocusChange(int focusChange) {
    switch (focusChange) {
        case android.media.AudioManager.AUDIOFOCUS_LOSS :
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT :
        case android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK :
            pause();
            break;
        case android.media.AudioManager.AUDIOFOCUS_GAIN :
            resume();
            break;
    }
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    if (com.gigigo.vuforiacore.sdkimagerecognition.icloudrecognition.CloudRecognitionActivityLifeCycleCallBack.mActivity.equals(activity))
        this.mCloudReco.on_Destroy();
    
    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
}

@java.lang.Override
protected void onPause() {
    handler.removeCallbacks(zoomChecker);
    visible = false;
    super.onPause();
    android.util.Log.d(org.unchiujar.umbra.FogOfExplore.TAG, "onPause completed.");
}

public static com.example.uriel.ordertracker.App.Services.Impl.ConnectionService newTask(android.content.Context context) {
    com.example.uriel.ordertracker.App.Services.Impl.ConnectionService.writeIPtoFile(Constants.BASE_URL, false);
    return new com.example.uriel.ordertracker.App.Services.Impl.ConnectionService(context);
}

private boolean checkConnection() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    if (networkInfo == null) {
        return false;
    }
    return true;
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    gestureDetector.onTouchEvent(event);
    return super.onTouchEvent(event);
}

public void exit() {
    dispose();
    net.qiujuer.tips.factory.cache.Cache.destroy();
    for (android.app.Activity activity : mActivities) {
        if (!(activity.isFinishing()))
            activity.finish();
        
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelable(com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.KEY_MOVIES_LIST, org.parceler.Parcels.wrap(moviesList));
    android.util.Log.d(MovieApplication.TAG, ((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "onSaveInstanceState()"));
}

private java.lang.String getJsonStringForWeatherInfo(android.database.Cursor cursor) {
    java.lang.String weatherInfoJsonString = null;
    if (!(recordNeedsToBeUpdatedForWeatherInfo(cursor))) {
        int columnIndexForWeatherInfo = cursor.getColumnIndexOrThrow(columnNameForJsonString);
        weatherInfoJsonString = cursor.getString(columnIndexForWeatherInfo);
    }
    return weatherInfoJsonString;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}

private void onAuthGPlusSuccess(com.google.firebase.auth.FirebaseUser user) {
    android.util.Log.d(com.task.vasskob.firebase.ui.SignInActivity.TAG, ("onAuthGPlusSuccess UserName = " + (user.getEmail())));
    com.task.vasskob.firebase.model.User newUser = new com.task.vasskob.firebase.model.User(username, userEmail);
    com.task.vasskob.firebase.database.FirebaseOperations.CreateNewUser(Constants.USERS, newUser);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isInSearchUi())) {
        mActionBarController.onSearchBoxTapped();
        enterSearchUi(false, mSearchView.getText().toString());
    }
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    this.currentP = savedInstanceState.getInt("CurrentPosition");
}

@java.lang.Override
public java.util.Set<org.gammf.collabora_android.notes.Note> getAllNoteNotInModules() {
    final java.util.Set<org.gammf.collabora_android.notes.Note> allNotes = new java.util.HashSet<>();
    allNotes.addAll(super.getAllNotes());
    return allNotes;
}

private void showLocationSearch() {
    mLocationAddSection.setVisibility(View.GONE);
    mLocationSearchSection.setVisibility(View.VISIBLE);
    mLocationViewSection.setVisibility(View.GONE);
    org.wordpress.android.util.EditTextUtils.showSoftInput(mLocationEditText);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialogIsDisplayed = false;
    newGame();
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    boolean result = super.onUnbind(intent);
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onUnbind");
    return result;
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    signUpBinding = android.databinding.DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, container, false);
    return inflater.inflate(R.layout.fragment_sign_up, container, false);
}

public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {
    mViewPager.setCurrentItem(tab.getPosition());
    currentPage = tab.getPosition();
}

public <T extends com.takusemba.spotlight.Target> void start(@android.support.annotation.NonNull
android.app.Activity activity, @android.support.annotation.NonNull
T... targets) {
    com.takusemba.spotlight.SpotlightView spotlightView = createSpotlightView(activity);
    setUpSpotlightView(activity, spotlightView, java.util.Arrays.asList(targets));
}

public void setReachSearchResults(java.util.List<com.takescoop.americanwhitewaterandroid.model.ReachSearchResult> reachSearchResults) {
    this.reachSearchResults = reachSearchResults;
    display(reachSearchResults, map);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(v.getContext(), com.example.nick.countrypedia.view.CountryActivity.class);
    intent.putExtra("id", ((int) (v.getTag())));
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String value = input.getText().toString();
    addFood(value);
    populateFoodListView();
}

@java.lang.Override
protected void onReset() {
    android.util.Log.i("loader", ("onReset-" + (tag)));
    if ((presenter) != null) {
        presenter.onDestroyed();
        presenter = null;
    }
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    setState("start");
    android.util.Log.d(Constants.DEBUG_TAG, "NotificationService : onBind");
    return mBinder;
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    updatePlayer();
    if ((currentChapter.getCurrentDuration()) > 0) {
        newtech.audiolibrary.adapters.PlayThread.mediaPlayer.seekTo(currentChapter.getCurrentDuration());
    }
    newtech.audiolibrary.adapters.PlayThread.mediaPlayer.start();
}

@java.lang.Override
public void onClick(final android.view.View v) {
    final java.lang.String key = mRecipeAdapter.getRef(position).getKey();
    doDelete(key, item);
    android.widget.Toast.makeText(getContext(), "Eliminato con successo!", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.stepanp.luna2d.LunaPrefs.init(this);
    glView = new com.stepanp.luna2d.LunaGlView(getApplication());
    setContentView(glView);
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(ctx, com.engstuff.coloriphornia.activities.FavoriteColorsActivity.class));
    ctx.finish();
}

@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.app_preferences);
    com.piotr.localweather.view.SettingsFragment.pref_location_key = getString(R.string.pref_location_key);
    com.piotr.localweather.view.SettingsFragment.cityEditTextPreference = ((android.preference.EditTextPreference) (findPreference("settings_edit_city_name")));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    finish();
    startActivity(new android.content.Intent(getApplicationContext(), com.example.kapayakatongo.bikenapped.MapActivity.class));
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... none) {
    com.ibm.watson.developer_cloud.android.speech_to_text.v1.SpeechToText.sharedInstance().recognize();
    return null;
}

