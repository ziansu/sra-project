@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int whichButton) {
    mAlertHandler = null;
    mTimer.cancel();
    modifyBootIni();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            deletePartOfTheMethod(id);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}

@java.lang.Override
public void run() {
    com.kakao.usermgmt.UserManagement.requestLogout(new com.kakao.usermgmt.callback.LogoutResponseCallback() {
        @java.lang.Override
        public void onCompleteLogout() {
            android.util.Log.v(com.lihak.plugin.kakao.KakaoTalk.LOG_TAG, "kakao : onCompleteLogout");
            callbackContext.success();
        }
    });
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("ONResume::", "Inside On Resume!");
    mTimer = new java.util.Timer();
    mDatasource.open();
}

private void setTexts() {
    mTextViewNameStore.setText(com.example.framgia.imarketandroid.data.FakeContainer.getNameProduct());
    mTextViewProportionVote.setText(com.example.framgia.imarketandroid.data.FakeContainer.getGeneralRate());
    mTextViewCountVote.setText(com.example.framgia.imarketandroid.data.FakeContainer.getAmountOfRates());
}

@java.lang.Override
public void onError(final int code, final java.lang.String message) {
    java.lang.String errMsg = (("ライトの状態更新に失敗しました hue:code = " + code) + "  message = ") + message;
    org.deviceconnect.android.message.MessageUtils.setUnknownError(response, errMsg);
    mErrorFlag = true;
    countDownLatch.countDown();
}

@java.lang.Override
public void onClick(android.view.View view) {
    mPlayer.stop();
    mPlayer = android.media.MediaPlayer.create(this, R.raw.e_note_sound);
    mPlayer.start();
}

@java.lang.Override
public void onClick(android.view.View v) {
    onRegisterClicked();
    android.widget.Toast.makeText(getContext(), "Hello", Toast.LENGTH_LONG).show();
}

public static kamini.app.moviecollection.MovieLoader newMovieFaboriteInstance(android.content.Context context, java.lang.String movieSelection) {
    return new kamini.app.moviecollection.MovieLoader(context, MovieContract.MovieEntry.buildMovieFavoriteStatus(movieSelection, "1"));
}

public void clear() {
    android.util.Log.d("GuideCreateActivity", "Clearing");
    mGuides.clear();
    notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("poooo");
    mItemClickListener.onClick(contentId);
}

@java.lang.Override
public void onClick(android.view.View v) {
    innerListener.onRowClick(position);
}

private void goToWelcome() {
    android.content.Intent intent = new android.content.Intent(this, edu.gatech.cs2340.rattracker.controller.WelcomeActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getApplicationContext(), "Difficulty picked", Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.lenni.blackjack_ptm.SettingsActivity.class);
    startActivity(intent);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            getActivity().onBackPressed();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public java.lang.Object onRetainCustomNonConfigurationInstance() {
    android.util.Log.d(com.cookbook.fenix.cookbook.CookBOOK.TEST, ("mImageDownloader = " + (mImageDownloader.hashCode())));
    return mImageDownloader;
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onCancelled", "error", error.getMessage());
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mCalendar.set(java.util.Calendar.YEAR, year);
    mCalendar.set(java.util.Calendar.MONTH, monthOfYear);
    mCalendar.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);
    updateDate();
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.aseupc.flattitude.Activities.InvitationDetails.callRespondInvitation callA = new com.aseupc.flattitude.Activities.InvitationDetails.callRespondInvitation();
    callA.execute(userID, flatID, "true");
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.support.v4.app.FragmentManager fm = getChildFragmentManager();
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (fm.findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    service.refreshWeather(("" + (fieldCity.getText())));
}

static boolean checkBluetooth(android.bluetooth.BluetoothAdapter bluetoothAdapter) {
    return (bluetoothAdapter == null) || (!(bluetoothAdapter.isEnabled()));
}

private void openOptions() {
    canrefresh = false;
    android.content.Intent intent = new android.content.Intent(getBaseContext(), com.lgallardo.youtorrentcontroller.OptionsActivity.class);
    startActivityForResult(intent, com.lgallardo.youtorrentcontroller.MainActivity.OPTION_CODE);
}

public static void run(android.content.Context context, java.lang.String url) {
    com.coolerfall.watcher.Watcher.run(context, url, false);
}

@java.lang.Override
public void onTransitionEnd(android.transition.Transition transition) {
    if (doNotShowAgain) {
        dialog.show();
        doNotShowAgain = false;
    }
}

private void onError() {
    android.widget.Toast.makeText(this.context, R.string.network_error, Toast.LENGTH_SHORT).show();
}

public static void unRegisterBluetoothBroadcast(android.content.Context context) {
    context.unregisterReceiver(com.bytereal.byterealblesdk.broadcast.register.RegisteredBroadcast.bluetoothBroadcastReceiver);
    com.bytereal.byterealblesdk.broadcast.register.RegisteredBroadcast.ILOG("broadcastreceiver unregistered!");
}

@java.lang.Override
public void onSliderClick(com.daimajia.slider.library.SliderTypes.BaseSliderView slider) {
    android.widget.Toast.makeText(getContext(), ((slider.getBundle().get("extra")) + ""), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onAnimationCancel(android.animation.Animator animation) {
    changeListener.onChangeCompleted();
    container.removeView(to);
}

public void onClick(android.view.View arg0) {
    mCurrentSearch = "";
    mTaxonId = null;
    mProjectId = null;
    mUsername = null;
    mLocationId = null;
    mSearchType = org.inaturalist.android.INaturalistMapActivity.FIND_NEAR_BY_OBSERVATIONS;
    mPage = 0;
    refreshActiveFilters();
    loadObservations();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    setOnItemClick(position, self);
}

@java.lang.Override
public void onClick(android.view.View view) {
    dbFunc();
    android.support.design.widget.Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.zqlite.android.logly.Logly.d(me.hejmo.cameratest.media.MediaActivity.TAG, "onResume");
    openCamera(me.hejmo.cameratest.media.VIDEO_WIDTH, me.hejmo.cameratest.media.VIDEO_HEIGHT, me.hejmo.cameratest.media.DESIRED_PREVIEW_FPS);
}

public boolean onPreferenceClick(android.preference.Preference preference) {
    com.example.karmali.homexperts.SettingsActivity.sendFeedback(getActivity());
    return true;
}

public static void resetHasSetDefaultValues() {
    android.content.SharedPreferences sp = org.andstatus.app.util.SharedPreferencesUtil.getSharedPreferences(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES);
    sp.edit().clear().commit();
    org.andstatus.app.util.SharedPreferencesUtil.forget();
}

private void loadCurrentList() {
    list = amrabed.android.release.evaluation.core.ActivityList.getCurrent();
    if (list.isEmpty()) {
        loadDefaultList();
    }
}

protected final android.app.PendingIntent createPendingIntent(int notificationId, java.lang.String action) {
    return createPendingIntent(notificationId, action, new android.os.Bundle());
}

protected internetofeveryone.ioe.Data.Website cursorToWebsite(android.database.Cursor cursor) {
    internetofeveryone.ioe.Data.Website website = new internetofeveryone.ioe.Data.Website(cursor.getString(0), cursor.getString(1), cursor.getString(2));
    return website;
}

public void changeView(int quizIndex) {
    android.content.Intent intent = new android.content.Intent(context, questioneerActivityClass);
    intent.putExtra("quiz", model.getQuiz(quizIndex));
    model.startQuiz();
    currentActivity.startActivity(intent);
}

@java.lang.Override
public void onCancel() {
    android.util.Log.i(co.theengine.loomplayer.LoomHTTP.TAG, ((index) + " cancel response"));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser) {
        canvas.setRadius(progress);
        brushDialog.setTitle(("Circle Radius: " + (canvas)));
    }
}

private void loadTopic() {
    mListView = ((android.widget.ListView) (findViewById(R.id.topic_list)));
    MAdapter = new com.lincanbin.carbonforum.adapter.IndexAdapter(this);
    new com.lincanbin.carbonforum.index.indexModel().execute(((com.lincanbin.carbonforum.config.ApiAddress.HOME_URL) + "1"));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.v(LOG_TAG, "This is onCreate");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    java.lang.System.out.println("this is the change");
    java.lang.System.out.println("this is the change");
}

public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_single_city, container, false);
    findView();
    initData();
    inflateTempBar(inflater, container);
    return view;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.new_thread :
            return true;
        case R.id.refresh :
            io.ohalloran.crypto.data.ParseFactory.refresh(this);
    }
    return false;
}

private void stopNotificationThread() {
    if (((this.notifierTimer) != null) && (this.notifierTimer.$missing$)) {
        android.util.Log.d(IotConstants.LOG_TAG, "stopping notification timer");
        this.notifierTimer.cancel();
    }
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    if ((m_listener) != null)
        m_listener.onLocalSelected();
    
    getDialog().dismiss();
}

public static void viewBlogStats(android.content.Context context, int blogLocalTableId) {
    android.content.Intent intent = new android.content.Intent(context, org.wordpress.android.ui.stats.StatsActivity.class);
    intent.putExtra(StatsActivity.ARG_LOCAL_TABLE_BLOG_ID, blogLocalTableId);
    context.startActivity(intent);
}

@java.lang.Override
public void addPictureToGallery(java.io.File imageUri) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    android.net.Uri contentUri = android.net.Uri.fromFile(imageUri);
    mediaScanIntent.setData(contentUri);
    getActivity().sendBroadcast(mediaScanIntent);
}

@java.lang.Override
public boolean handleUpOrCancelTouchEvent(android.view.MotionEvent event) {
    issueStateTransition(mBounceBackState);
    return true;
}

public void performMemoryAccelerationSetting(android.content.Context context) {
    performStartActivity(context, componentForMemoryAccelerationSetting());
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_insert_dummy_data :
            insertDummyPet();
            displayDatabaseInfo();
            return true;
        case R.id.action_delete_all_entries :
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@android.support.annotation.CallSuper
@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((adView) != null) {
        adView.destroy((!(isChangingConfigurations())));
    }
}

static com.solera.defrag.ViewStack.SaveStateEntry newInstance(int layout, @android.support.annotation.Nullable
android.os.Bundle parameters, @android.support.annotation.Nullable
android.util.SparseArray<android.os.Parcelable> viewState) {
    return new com.solera.defrag.AutoValue_ViewStack_SaveStateEntry(layout, parameters, viewState);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    boolean handled = false;
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_GO)) {
        Login();
        handled = true;
    }
    return handled;
}

@java.lang.Override
public void prepareViewModel(android.os.Bundle savedInstanceState, android.os.Bundle arguments, android.app.Activity activity) {
    mOnViewModelEventBind.hideNavigationButtons(false, false);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    setNewEdgeNotif();
    context1 = context;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((isOpenInvite) && (position == 0)) {
        listener.onItemClick(v, position);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    manager.removeView(view);
}

public boolean bluetoothStateOn(android.content.Intent intent) {
    int newState = mBluetoothAdapter.getState();
    if (newState == (android.bluetooth.BluetoothAdapter.STATE_ON)) {
        progress.dismiss();
        currentContext.unregisterReceiver(fragmentBr);
        return true;
    }
    return false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_topic_content);
    butterknife.ButterKnife.bind(this);
    setupToolbar();
    loadTopicName();
    setVocabularyListView();
    setDoExerciseButton();
}

public void onReadRecord(android.view.View view) {
    android.util.Log.v(TAG, "onReadRecord ->");
    readRecord();
    android.util.Log.v(TAG, "onReadRecord <-");
}

@java.lang.Override
public void onClick(android.view.View v) {
    max.sudoku.MainActivity.b.setBackgroundResource(R.drawable.back);
    startListener();
}

public void displayMessage(android.content.Context c) {
    if ((message) != null) {
        com.devmobile.ofait.utils.FastDialog.showDialog(c, FastDialog.SIMPLE_DIALOG, message);
    }
}

public static void startLine(@android.support.annotation.NonNull
final android.view.inputmethod.EditorInfo attribute, final boolean logBuffer) {
    if ((com.radicalninja.logger.LogManager.instance) != null) {
        com.radicalninja.logger.LogManager.instance.startNewLine(attribute, logBuffer);
    }
}

@java.lang.Override
public void onLoadMore(int currentPage) {
    android.util.Log.d(MovieApplication.TAG, (((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "onLoadMore() page = ") + currentPage));
    loadMoviesPage(currentPage);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    startActivity(new android.content.Intent(this, timetoadapt.me.adapt.UserCreationActivity.class));
}

@java.lang.Override
public void onColumnCountUpdate(int colCount) {
    android.widget.TextView currentCount = ((android.widget.TextView) (findViewById(R.id.colCount)));
    currentCount.setText(java.lang.String.valueOf(colCount));
    setUpGameMakerLayout();
}

@java.lang.Override
public void onFailure(java.lang.Throwable throwable) {
    android.util.Log.e("seyi", "failed to save address to kinvey");
}

@java.lang.Override
public void onPeerDisconnected(com.mobvoi.android.wearable.Node node) {
    android.util.Log.d(com.theteamgo.fancywatch.MainActivity.TAG, ("Node Disconnected" + (node.getId())));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if ((train1) != null) {
        train1.setSpeed(progress);
        java.lang.String text = train1.GetSpeedTxt();
        setSpeed(progress, train1);
    }
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    android.view.View card = mCards.getFirst();
    mMyTouchListener.onTouch(card, ev);
    return super.onInterceptTouchEvent(ev);
}

@java.lang.Override
public void onItemPosted() {
    android.widget.Toast.makeText(this.getContext(), "You event has been created!", Toast.LENGTH_LONG).show();
    this.dismiss();
}

public void addMarker(com.android.yardsale.models.YardSale ys) {
    btFlip.setVisibility(View.GONE);
    com.android.yardsale.fragments.SaleMapFragment.yardSaleList = null;
    com.android.yardsale.fragments.SaleMapFragment.yardSale = ys;
    addYardSale(ys, false);
}

@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    e.printStackTrace();
    android.widget.Toast.makeText(this, "错误：根据位置查询城市信息失败。", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setInitialFragment(com.shollmann.android.fogon.ui.fragments.FavoriteSongsFragment.newInstance());
}

@java.lang.Override
public void run() {
    org.matrix.matrixandroidsdk.activity.CommonActivityUtils.goToRoomPage(this.mAutomaticallyOpenedRoomId, this, mOpenedRoomIntent);
    this.mAutomaticallyOpenedRoomId = null;
    this.mOpenedRoomIntent = null;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    Wearable.DataApi.addListener(googleApiClient, this);
}

public static java.lang.String getLanguage(android.content.Context context) {
    return com.akexorcist.localizationactivity.LanguageSetting.getLanguagePreference(context).getString(com.akexorcist.localizationactivity.LanguageSetting.KEY_LANGUAGE, com.akexorcist.localizationactivity.LanguageSetting.DEFAULT_LANGUAGE);
}

@java.lang.Override
public void handleFault(com.backendless.exceptions.BackendlessFault fault) {
    android.util.Log.d("DEBUG", fault.getMessage());
    android.widget.Toast.makeText(this, fault.getMessage(), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBoolean("MyBoolean", false);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case com.sg.clockwork.R.id.action_search :
            return true;
        case com.sg.clockwork.R.id.action_notification :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.i(TAG, "MainActivity.onDestroy()");
    unregisterReceiver(receiver);
    super.onDestroy();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.main_tab_horder, container, false);
    isPrepared = true;
    lazyLoad();
    return view;
}

protected void showCurrentLocation() {
    android.location.Location location = edu.aku.hassannaqvi.dss_census.core.MainApp.locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    if (location != null) {
        java.lang.String message = java.lang.String.format("Current Location \n Longitude: %1$s \n Latitude: %2$s", location.getLongitude(), location.getLatitude());
    }
}

public java.lang.String getType() {
    if (android.text.TextUtils.isEmpty(type))
        return "";
    else
        return type;
    
}

public void setListData(java.util.List<by.evgen.android.apiclient.bo.Category> data) {
    if (data != null) {
        mContent = data;
        by.evgen.android.apiclient.fragment.DetailsFragment.Callbacks callbacks = getCallbacks();
        callbacks.onSetContents(data);
    }
}

@java.lang.Override
public in.tosc.digitaloceanapp.adapters.DropletsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.single_droplet, parent, false);
    itemView.setOnClickListener(this);
    return new in.tosc.digitaloceanapp.adapters.DropletsAdapter.ViewHolder(itemView);
}

public android.view.View getDecorView() {
    return getWindow().getDecorView();
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    if (data.moveToFirst()) {
        mCursorAdapter.swapCursor(data);
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    globalRelayPin = position + 6;
    return com.rmc.thienle.jedi2.MainActivity.PlaceholderFragment.newInstance((position + 1), switchId);
}

@java.lang.Override
public void onDestroy() {
    android.widget.Toast.makeText(this, "notification service destroyed", Toast.LENGTH_LONG).show();
    mNotificationsFileObserver.stopWatching();
}

private void readPhotosName() throws java.io.IOException {
    android.content.res.AssetManager am = fragment.getContext().getAssets();
    photos = am.list("photo");
}

protected synchronized void buildGoogleApiClient() {
    android.widget.Toast.makeText(this, "buildGoogleApiClient", Toast.LENGTH_SHORT).show();
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
}

private void showTripProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    if ((mArrivalInfo) == null) {
        showArrivalListFragment(obaStop);
    }else {
        org.onebusaway.android.report.ui.ReportTripProblemFragment.show(this, mArrivalInfo, R.id.ri_report_stop_problem, false, this);
        mArrivalInfo = null;
    }
}

public boolean start() {
    if (!(_isStarted)) {
        _isStarted = native_start();
        android.util.Log.i(com.android.server.onewire.OneWireNativeService.TAG, "started!");
    }
    return _isStarted;
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.accept_imageview :
            processResponse(1);
            break;
        case R.id.cancel_imageview :
            processResponse(0);
            break;
        case R.id.wait_imageview :
            waitButtonAction(id);
            break;
    }
}

public void initProcess(android.os.IBinder token, int vuid) {
    if ((this.token) != null) {
        throw new java.lang.IllegalStateException("Token is exist!");
    }
    this.token = token;
    this.vuid = vuid;
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 1 :
            return new hu.gdf.norbi.tabbedpagewithfragments.fragments.MainFragment();
        case 2 :
            return new hu.gdf.norbi.tabbedpagewithfragments.fragments.CartFragment();
    }
    return new hu.gdf.norbi.tabbedpagewithfragments.fragments.WishListFragment();
}

