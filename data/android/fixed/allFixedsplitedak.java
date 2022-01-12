private void startServiceDiscovery() {
    _manager.discoverServices(_channel, new net.sharksystem.android.protocols.wifidirect.WifiActionListener("Discover services"));
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    mKeyboard.show();
    return false;
}

public void returnResult(java.lang.String pathToBook) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("result", pathToBook);
    setResult(ru.spbau.library.RESULT_OK, intent);
    finish();
}

private void startAuthenticationActivity() {
    android.content.Intent intent = new android.content.Intent(this, org.wso2.iot.agent.activities.AuthenticationActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    return true;
}

@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... params) {
    boolean success = server.gameReady(params[0]);
    android.util.Log.i("success", "waiting");
    return success;
}

@java.lang.Override
public void onDialogPositiveClick(android.app.DialogFragment dialog) {
    android.os.Bundle mArgs = dialog.getArguments();
    java.lang.String name = mArgs.getString("name");
    java.lang.String uri = mArgs.getString("uri");
    socialAdd(uri);
    showNoticeDialog(name);
}

public void updateFontName(java.lang.String fontName) {
    if (fontName != null) {
        android.graphics.Typeface font = android.graphics.Typeface.createFromAsset(getContext().getAssets(), ("fonts/" + fontName));
        setTypeface(font);
        mfontName = fontName;
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_course_details, menu);
    this.menu = menu;
    return true;
}

@java.lang.Override
public void onPause() {
    super.onPause();
    storeMapState();
    android.support.v4.content.LocalBroadcastManager.getInstance(context).unregisterReceiver(mMessageReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(context).unregisterReceiver(placesUpdateReceiver);
}

protected abstract void configurePinnedHeader(android.view.View header, int position, int progress);

private void iniciarTollBar() {
    myToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar_menu)));
    setSupportActionBar(myToolbar);
}

public boolean stopRecordingAudio() {
    mStartRecordingAudio = false;
    return true;
}

public void selectDissatisfied(android.view.View view) {
    sentimentIndex = 1;
    updateSentiments();
}

public void writeAll(java.lang.String str) {
    android.util.Log.d("Server", "Attempting to write to all clients");
    for (com.semaphore_soft.apps.cypher.networking.Server.ClientHandler server : com.semaphore_soft.apps.cypher.networking.Server.clients) {
        server.write(str);
    }
}

@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
    if (com.almalence.opencam.ApplicationScreen.mApplicationStarted)
        return com.almalence.opencam.ApplicationScreen.getGUIManager().onTouch(view, event);
    
    return true;
}

public static java.lang.String getSDCardPath() {
    return android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
}

private static int getLastInstalledVersion(android.content.Context context) {
    if ((mini.app.orbis.VersionManager.initialized) && ((mini.app.orbis.VersionManager.previouslyInstalledVersions.length) > 0))
        return mini.app.orbis.VersionManager.previouslyInstalledVersions[((mini.app.orbis.VersionManager.previouslyInstalledVersions.length) - 1)];
    
    return -1;
}

@java.lang.Override
public void onStopListening(com.twilio.client.Device inDevice, int inErrorCode, java.lang.String inErrorMessage) {
    if ((basicDeviceListener) != null)
        basicDeviceListener.onDeviceStoppedListening(new java.lang.Exception(inErrorMessage));
    
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setHasOptionsMenu(true);
}

public synchronized void insertToCache(java.lang.String key, java.lang.Object data, mrrexz.github.com.downcachedroid.model.downfiles.BaseDownFileModule downFileType) {
    put(key, new android.support.v4.util.Pair(data, downFileType));
    dataUpdateListener.cacheElemAdded(key);
}

public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) {
    boolean ret = super.dispatchPopulateAccessibilityEvent(event);
    if ((mPluginActivity) != null) {
        mPluginActivity.dispatchPopulateAccessibilityEvent(event);
    }
    return ret;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.lang.System.out.println("Home onCreate:::::");
}

public void edit(int position, java.lang.Thread item) {
    mItems.set(position, item);
    notifyItemChanged(position);
}

@java.lang.Override
public void onDeviceRssiUpdate(java.lang.String deviceAddress, int rssi, int state) {
}

@java.lang.Override
public com.monits.agilefant.adapter.recyclerviewholders.TaskItemViewHolder onCreateViewHolder(final android.view.ViewGroup parent, final int viewType) {
    final android.view.View view = inflater.inflate(R.layout.my_tasks_item, parent, false);
    return new com.monits.agilefant.adapter.recyclerviewholders.TaskItemViewHolder(view, context, this);
}

public void onClick(android.view.View v) {
    this.finish();
}

@dagger.Provides
@sinolight.cn.qgapp.dagger.PerActivity
sinolight.cn.qgapp.presenter.SearchActivityPresenter provideSearchActivityPresenter(android.content.Context context, sinolight.cn.qgapp.views.view.ISearchActivityView view) {
    return new sinolight.cn.qgapp.presenter.SearchActivityPresenter(context, view);
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    marker.showInfoWindow();
    updatePanelHeader(marker);
    updatePanelHeaderButton(marker);
    mLastMarker = marker;
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.rcoem.enotice.enotice_app.Single_Post.class);
    intent.putExtra("postkey", Post_Key);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mChoice) >= 0) {
        process(mChoice);
        mFcDevice.savePersistent(mObject);
    }
    dialog.dismiss();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable("image", image);
    outState.putInt("level", level);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setSplashLayout();
    NavigationApplication.instance.startReactContext();
}

@java.lang.Override
public void bindView(@lombok.NonNull
android.view.View view, @lombok.NonNull
com.nextfaze.poweradapters.Holder holder) {
    outerToAdapter(holder.getPosition()).bindView(view, holder);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mOnDialogClickListener) != null) {
        mOnDialogClickListener.onClick();
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.maxspahn.studentbnb.TimePickerFragment newFragment = new com.example.maxspahn.studentbnb.TimePickerFragment();
    newFragment.show(getFragmentManager(), "timePicker");
    newFragment.setActivity(false);
}

private void loadSticker() {
    android.graphics.drawable.Drawable drawable = android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.haizewang_215);
    com.xiaopo.flying.sticker.DrawableSticker sticker = new com.xiaopo.flying.sticker.DrawableSticker(drawable, 1.0F, 1.0F);
    stickerView.addSticker(sticker, 1.0F, 1.0F);
}

protected void resumeFeedbackAndGraph() {
    android.util.Log.d("GRAPH_LIFE", "RESUME_GRAPH");
    if ((graphFragment) != null) {
        graphFragment.resumeReceivingData();
    }
    if ((feedback) != null) {
        feedback.resumeRecievingData();
    }
}

protected void onProgressUpdate(java.lang.Integer... progress) {
    android.widget.Toast.makeText(activity, "Getting data from server", Toast.LENGTH_LONG);
}

private void receiveIntent() {
    android.content.Intent intent = getIntent();
    articleId = intent.getStringExtra("ID_KEY");
    articleTitleExtra = intent.getStringExtra("TITLE_KEY");
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((adapter.getOnItemChildClickListener()) != null) {
        adapter.getOnItemChildClickListener().onItemChildClick(adapter, v, getClickPosition());
    }
}

@java.lang.Override
public void onResponse(java.lang.String response) {
    android.widget.Toast.makeText(this, response, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void run() {
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    super.onItemClick(parent, view, position, id);
    clearFocus(mSearchView);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean isChecked) {
    mPreferences.edit().putBoolean("showAds", isChecked).apply();
}

private void addToOpposingLiberties(com.pololanguage.ninedragongo.Stone stone) {
    for (com.pololanguage.ninedragongo.Chain chain : getNeighborChains(stone.coords, stone.color.getOther())) {
        chain.addLiberty(stone.coords);
    }
}

@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult result) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent nextActivity = new android.content.Intent(this, zcamara.washington.edu.quizdroid.QuestionPage.class);
    nextActivity.putExtra("mBundle", mBundle);
    startActivity(nextActivity);
    finish();
}

@java.lang.Override
public void onSuccess(@android.support.annotation.Nullable
java.util.List<T> data) {
    mDataCache.clear();
    if (data != null) {
        mDataCache.addAll(data);
    }
    callback.onSuccess(mDataCache);
}

public void navigate2Intent(java.lang.Class cl) {
    android.content.Intent intent = new android.content.Intent(this, cl);
    startActivity(intent);
}

void setStyle(@android.support.annotation.NonNull
java.lang.String style, boolean defaultStyle) {
    if (style == null) {
        return ;
    }
    mStyle = style;
    mDefaultStyle = defaultStyle;
}

@java.lang.Override
public void run() {
    if (!(mIsStartService.get())) {
        gatt.disconnect();
    }
}

@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onGlobalLayout() {
    view.invalidate();
}

@java.lang.Override
public boolean handleMessage(android.os.Message message) {
    if (((message.what) == (io.realm.BaseRealm.REALM_CHANGED)) && ((sharedGroupManager) != null)) {
        sharedGroupManager.advanceRead();
        sendNotifications();
    }
    return true;
}

public void onDestroy() {
    super.onDestroy();
}

private void notifyOnSlideToListeners(@android.support.annotation.Nullable
android.view.View bottomSheet, float slideOffset) {
    if ((bottomSheet != null) && ((mCallback) != null)) {
        for (com.github.ljarka.filterbottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback : mCallback) {
            bottomSheetCallback.onSlide(bottomSheet, slideOffset);
        }
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelable(com.owncloud.android.ui.fragment.OCFileListFragment.KEY_FILE, mFile);
    if ((mMultiChoiceModeListener) != null) {
        mMultiChoiceModeListener.storeStateIn(outState);
    }
}

public void setCellsFromList(java.util.List<com.android.kaffka.arduinoledpainel.models.Cell> cellList) {
    clearPixelScreen();
    for (com.android.kaffka.arduinoledpainel.models.Cell cell : cellList)
        cellChecked[cell.getY()][cell.getX()] = cell;
    
    invalidate();
}

@java.lang.Override
public void onConnected(final android.os.Bundle bundle) {
    android.util.Log.i(s.pahlplatz.fhict_companion.views.activities.LoginActivity.TAG, "onConnected: Requesting credentials.");
    requestCredentials();
}

static android.content.ContentValues createTrailerValues(long id) {
    android.content.ContentValues favoriteValues = new android.content.ContentValues();
    favoriteValues.put(MovieContract.TrailerEntry.COLUMN_DESCRIPTION, "Some description");
    favoriteValues.put(MovieContract.TrailerEntry.COLUMN_FAVORITE_ID, id);
    favoriteValues.put(MovieContract.TrailerEntry.COLUMN_URI, "some uri");
    return favoriteValues;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mListener) != null) {
        mListener.onListFragmentInteraction(holder.mItem);
    }
}

@java.lang.Override
public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    super.onPageStarted(view, url, favicon);
    progressBar.setProgress(0);
    progressBar.setVisibility(View.VISIBLE);
}

public void test_019() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "WLAN");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "更多选项");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "高级");
    check(testcase.Object_Text, testcase.Operation_checkExist, "高级WLAN");
}

@java.lang.Override
public void doOnResume() {
}

public void morphToView(@android.support.annotation.NonNull
android.view.View view, boolean lockContainer) {
    morphToView(view, lockContainer, (-1));
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.my_stocks, menu);
    return true;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mLoginPresenter = PresenterHolder.SINGLETON.getLoginPresenter();
    mLoginPresenter.setLoginFragment(this);
}

public void handleMoreButtonPressed(android.view.View pView) {
    com.yaboosh.ybtech.lasertally.TallyReportMaker tallyReportMaker = new com.yaboosh.ybtech.lasertally.TallyReportMaker(measurementsTable, companyName, jobName, "", adjustmentValue, tallyGoal, this);
    tallyReportMaker.init();
    tallyReportMaker.printTallyReport();
}

@java.lang.Override
public void _requestBacklog(int id, int first, int last, int limit, int additional) {
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    if ((mp) == null) {
        mp = dalbers.com.noise.LoopMediaPlayer.create(this);
    }
    return mBinder;
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mMap.setMyLocationEnabled(true);
    mMap.setOnCameraChangeListener(this);
    mFragment.setmMap(googleMap);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    this.menu = menu;
    return true;
}

public void takePhoto(android.support.v4.app.Fragment fragment, int requestCode) {
    mImageCaptureHelper.captureImage(fragment, requestCode);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    jetV.onNextStage(false, (which + 1));
}

void newList(java.lang.String name) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(DatabaseHelper.LIST_NAME, name);
    database.insert(DatabaseHelper.TABLE_NAME_MASTER, null, contentValues);
}

public static void d(java.lang.String tag, java.lang.Throwable t, @android.support.annotation.NonNull
java.lang.String message) {
    im.wangchao.mcommon.log.AbsLog[] array = im.wangchao.mcommon.log.LOG.logAsArray;
    for (im.wangchao.mcommon.log.AbsLog log : array) {
        log.d(tag, t, message);
    }
}

public void setPoiListAdapter(java.util.List<java.lang.String> poiList) {
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter<java.lang.String>(presenter, android.R.layout.simple_list_item_1, poiList);
    pois.setAdapter(adapter);
}

private void unsetDrawerItemSelected(android.widget.TextView item) {
    if (item != null) {
        item.setBackgroundColor(Color.TRANSPARENT);
        item.setTextColor(getResources().getColor(R.color.primary_dark_material_dark));
    }
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
}

public void doPageSelectedComments(int position) {
    header.animate().translationY(0).setInterpolator(new android.view.animation.LinearInterpolator()).setDuration(180);
    pager.setSwipeLeftOnly(false);
    me.ccrama.redditslide.Reddit.currentPosition = position;
}

@java.lang.Override
public com.jaspersoft.android.sdk.network.entity.execution.ExecutionStatus perform(java.lang.String token) throws com.jaspersoft.android.sdk.network.HttpException, java.io.IOException {
    return mExportApi.checkExportExecutionStatus(token, executionId, exportId);
}

public com.sst.anouncements.DbAdapter open() throws android.database.SQLException {
    this.dbHelper = new com.sst.anouncements.DbAdapter.DbHelper(this.context);
    this.SQLdb = this.dbHelper.getWritableDatabase();
    return this;
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    month = newVal - 1;
    updateDateControl();
    onDateTimeChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.android.starwarsv2.ListActivity.class);
    intent.putExtra("ListViewType", com.example.android.starwarsv2.MainActivity.PLANETS);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    try {
        java.lang.reflect.Method method = act.getClass().getMethod(clickStr);
        method.invoke(act, v);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
}

public void run() {
    hideLoadingAnimation();
    mImageView.setVisibility(View.VISIBLE);
    mImageView.setImageURI(android.net.Uri.parse(path));
    mAttacher.update();
    hideLoadingAnimation();
}

@java.lang.Override
public void onDismissedBySwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] reverseSortedPositions) {
    for (int position : reverseSortedPositions) {
        deleteItemFromCloud(position);
        _data.remove(position);
        _rAdapter.notifyItemRemoved(position);
    }
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
}

public void loadImage(android.net.Uri uri, java.lang.String chanName, java.lang.String key, boolean fromCacheOnly, android.widget.ImageView imageView) {
    loadImage(uri, chanName, key, new com.mishiranu.dashchan.content.ImageLoader.SimpleCallback(imageView), fromCacheOnly);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    org.redcross.openmapkit.tagswipe.TagEdit.updateUserLocationTags(location);
}

public void ChoosePicture() {
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    i.setType("image/* video/*");
    startActivityForResult(i, com.myflightbook.android.ActMFBForm.SELECT_IMAGE_ACTIVITY_REQUEST_CODE);
}

@java.lang.Override
public void onFocusChange(android.view.View view, boolean hasFocus) {
    if (hasFocus) {
        provider.setOpInfo(getOperandInfo(instrGroup, index));
        lastSelectedSearchView = index;
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    createMatchTable(db);
    createInningsTable(db);
    createTeamTable(db);
    createPlayerTable(db);
    createBatterTable(db);
    createBowlerTable(db);
    createArchiveTable(db);
}

public static void move() {
    cat.app.maps.MapOptions.osm.move();
}

@java.lang.Override
protected java.lang.Boolean doInBackground(com.harlie.radiotheater.radiomysterytheater.BaseActivity... params) {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data_helper.LoadRadioTheaterTablesAsyncTask.TAG, "doInBackground");
    for (int i = 0; i < 10; ++i) {
        android.os.SystemClock.sleep(1000);
    }
    return false;
}

public void setSingleButton() {
    cheersConfirmButton.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, 0, 0));
    setMargins(cheersTwoPurposeButton, 0, 0, 0, 0);
    setMargins(cheersConfirmButton, 0, 0, 0, 0);
}

