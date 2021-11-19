@java.lang.Override
protected void onStop() {
    unregisterReceiver(playerReceiver);
    android.util.Log.d(poche.fm.potunes.PlayerActivity.TAG, "onStop: ");
    super.onStop();
}

@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    return android.view.View.inflate(context, R.layout.item_category, parent);
}

public void initAudio() {
    setupVisualizerFxAndUI();
    try {
        visualizer.setEnabled(true);
    } catch (java.lang.Exception ex) {
        android.util.Log.e("except", (" f" + (ex.getMessage())));
    }
}

public int getLenght() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    boolean v = preferences.getBoolean("EXTRA_SMALL_FONT", false);
    if (v)
        return 8;
    else
        return 6;
    
}

@java.lang.Override
public void onClick(android.view.View view) {
    mListener.onItemClicked(mPosition, mMemo, mTextView);
}

@org.junit.Test
public void testFeatureMaskTranslation() {
    int caps = (IWifiStaIface.StaIfaceCapabilityMask.BACKGROUND_SCAN) | (IWifiStaIface.StaIfaceCapabilityMask.LINK_LAYER_STATS);
    int expected = ((android.net.wifi.WifiManager.WIFI_FEATURE_INFRA) | (android.net.wifi.WifiManager.WIFI_FEATURE_SCANNER)) | (android.net.wifi.WifiManager.WIFI_FEATURE_LINK_LAYER_STATS);
    assertEquals(expected, mWifiVendorHal.wifiFeatureMaskFromStaCapabilities(caps));
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.miOptions :
            onOptions();
            return true;
        case R.id.miSearch :
            onSearch();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onFailure(int code, java.lang.String msg, java.lang.Object data) {
    com.unbelievable.library.android.utils.ToastUtils.toastS(this, msg);
}

@java.lang.Override
public boolean onActionItemClicked(android.support.v7.view.ActionMode mode, android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.deck_delete_selected :
            {
                mListAdapter.deleteSelectedItems();
                mActionMode.finish();
            }
        default :
            {
                return false;
            }
    }
}

@android.support.annotation.Nullable
public java.lang.String getHeader(@android.support.annotation.NonNull
java.lang.String key) {
    return ir.siper.core.SiperUtils.decode(message.getCustomHeader(key));
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
    startActivity(getIntent());
}

void start(android.widget.TextView textView);

public final void stopIndoorOutdoorDetector() {
    org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.unregisterReceiver(currentStatusReceiver);
    org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.unregisterReceiver(wifiInfoReceiver);
    org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.stopService(new android.content.Intent(org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext, org.mygeotrust.indoor.tasks.detectIndoorOutdoor.algorithm.DetermineIndoorOutdoorService.class));
}

private void showTripProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    if ((mArrivalInfo) == null) {
        showArrivalListFragment(obaStop);
    }else {
        org.onebusaway.android.report.ui.ReportTripProblemFragment.show(this, mArrivalInfo, R.id.ri_report_stop_problem, this);
        mArrivalInfo = null;
    }
}

public void init(com.google.android.gms.maps.GoogleMap mMap) {
    marker = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(userLoc).title("your current location"));
    userLocTmp = marker;
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(userLoc));
}

public void run() {
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
    }
    android.util.Log.d(com.mapswithme.maps.routing.RoutingController.TAG, "trying to continue tour");
    com.mapswithme.maps.routing.RoutingController.continueSavedTour(tourLoadedListener);
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setListAdapter(new com.commonsware.calendarapp.MyCustomAdapter(getActivity(), events));
    getListView().setDivider(null);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    popDialog.show();
}

public boolean isNetworkAvailable(android.content.Context context) {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    return (cm.getActiveNetworkInfo()) != null;
}

public static void stopRecording(android.media.MediaRecorder recorder) {
    if (null != recorder) {
        recorder.stop();
        recorder.reset();
        recorder.release();
        recorder = null;
    }
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    sendButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            sendMessage();
        }
    });
    updateChat();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add_playlist :
            break;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}

public void unlockAndHide(android.view.animation.Animation.AnimationListener listener) {
    if (!(mLogoEnabled)) {
        return ;
    }
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_DISABLED;
    hide(listener);
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    dismissDialog();
    android.net.Uri uri = com.scanlibrary.Utils.getUri(getActivity(), bitmap);
    bitmap.recycle();
    scanner.onScanFinish(uri);
}

@java.lang.Override
public void run() {
    com.android.email.service.EmailServiceUtils.startRemoteServices(mContext);
    com.android.email.DebugUtils.updateLoggingFlags(mContext);
}

@java.lang.Override
public void onClick(android.view.View view) {
    started = false;
    instop = true;
    android.widget.Toast.makeText(this, "recording has stopped, restart for continue or load another dataset", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.buttonLogin :
            java.lang.System.out.println("Login");
            handleLogin(getUserManager().login("", ""));
            break;
    }
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    userInteracting = false;
    videoView.seekTo(seekToTime);
    if (pausedForSeek) {
        pausedForSeek = false;
        videoView.start();
    }
    hideDelayed(hideDelay);
}

@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    BoxAuthentication.BoxAuthenticationInfo.cloneInfo(mSession.mAuthInfo, info);
    mSession.setUserId(info.getUser().getId());
    mSession.onAuthCreated(info);
    authLatch.countDown();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_location_key)));
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_units_key)));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    sp = getSharedPreferences("my_HS", Activity.MODE_PRIVATE);
    editor = sp.edit();
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simon_game);
    cpuInput.add(randomNumber);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.naks.vk.presenter.NewsPagePresenterImpl.TAG, "onDestroy");
    view = null;
    interactor.onDestroy();
}

@java.lang.Override
public void Update() {
    android.opengl.Matrix.setIdentityM(localTransformation, 0);
    android.opengl.Matrix.translateM(localTransformation, 0, position[0], position[1], position[2]);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mStudentsDbHandler = new com.studios.lucian.students.util.StudentsDbHandler(getContext());
    mGroupDao = new com.studios.lucian.students.repository.GroupDAO(getActivity());
    mGroups = mGroupDao.getAll();
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mVideoView.start();
    avi.hide();
}

@java.lang.Override
public void onError(com.quickblox.videochat.webrtc.QBRTCSession qbrtcSession, com.quickblox.videochat.webrtc.QBRTCException e) {
    android.widget.Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
}

public void changeFont(edu.utep.cs.cs4330.battleship.TextView textView) {
    android.graphics.Typeface typeface = android.graphics.Typeface.createFromAsset(getAssets(), getFontPath());
    textView.setTypeface(typeface);
}

@java.lang.Override
public void onPeerInvitedToRoom(com.google.android.gms.games.multiplayer.realtime.Room room, java.util.List<java.lang.String> arg1) {
    android.util.Log.e("#####", "F: onPeerInvitedToRoom");
    updateRoom(room);
    checkStartLobby();
}

private void displayFilterDialogue() {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    com.groupeighteen.unote.view.DisplayPreferencesDialogue preferencesAlert = new com.groupeighteen.unote.view.DisplayPreferencesDialogue();
    preferencesAlert.show(fragmentManager, "DISPLAY_PREFERENCES_FRAGMENT");
    android.widget.Toast.makeText(this, "Display filter dialogue", Toast.LENGTH_SHORT).show();
}

public void decrement(android.view.View view) {
    if ((quantity) == 1) {
        android.widget.Toast.makeText(this, "You can not order less than 1 cup of coffee", Toast.LENGTH_SHORT).show();
    }
    quantity = (quantity) - 1;
    display(quantity);
}

public void removeWebView(android.view.ViewGroup parent) {
    boolean isWebView = isWebViewShowing(parent);
    parent.setTag("");
    if (isWebView) {
        removeChildViews(parent);
    }
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
}

@java.lang.Override
public void onPrepareLoad(android.graphics.drawable.Drawable placeHolderDrawable) {
    profilePic.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(profilePic.getContext(), R.drawable.contact_icon));
    smallProfilePic.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(smallProfilePic.getContext(), R.drawable.contact_icon));
}

@java.lang.Override
public void onLastItemVisible() {
    int page = ((mListAdapter.getCount()) / (com.xiaomei.yanyu.api.util.Constant.PERPAGE)) + 1;
    mQueue.add(new com.android.volley.toolbox.StringRequest(getTopicListUrl(page), mRefreshMoreListener, mRefreshErroListener));
}

@java.lang.Override
public void onPwsResultError(java.util.Collection<java.lang.String> urls, int httpResponseCode, java.lang.Exception e) {
    android.widget.Toast.makeText(getApplicationContext(), getString(R.string.shorten_error), Toast.LENGTH_LONG).show();
    stopSelf();
    return ;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mBinding.addTabV.show();
    mBinding.fab.hide();
    mBinding.addTabOpLl.setVisibility(View.VISIBLE);
    mBinding.newTabLabelTv.setText("");
    mBinding.newTabLabelTv.setVisibility(View.VISIBLE);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(context, ("Clicked " + position), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    mCameraListener.onPictureTaken(data);
    capturingImage = false;
    camera.startPreview();
}

private void updateItems() {
    java.lang.String query = com.bignerdranch.android.photogallery.QueryPreferences.getStoredQuery(getActivity());
    lastPageFetched = 0;
    new com.bignerdranch.android.photogallery.PhotoGalleryFragment.FetchItemsTask(query).execute(lastPageFetched);
}

com.tk.foursquaresearch.model.util.LocationHandler locationHandlerInstance(android.content.Context ctx, com.tk.foursquaresearch.model.util.LocationHandlerInterface handlerListener) {
}

public boolean restore(android.os.Bundle bundle) {
    mContentListModel = bundle.getParcelableArrayList(com.stdnull.v2api.model.V2MainFragModel.KEY_V2EXBEAN);
    return ((mContentListModel) != null) && (!(mContentListModel.isEmpty()));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.companyname.hearts.model.Overlord.getInstance().prepareForNextGame();
    removeCenterIcon();
    setUpGame();
    displayImages();
    createListeners();
    beginRound();
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onBind");
    return null;
}

public void startNoInterventionService() {
    stopAllServices(false);
    startService(new android.content.Intent(this, kr.ac.kaist.nmsl.pushmanager.activity.StepCounterService.class));
    android.util.Log.d(Constants.TAG, "NoIntervention started");
    kr.ac.kaist.nmsl.pushmanager.util.Util.writeLogToFile(this, Constants.LOG_NAME, "START", "==============NoIntervention started===============");
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int selectedYear, int selectedMonth, int selectedDay) {
    selectedMonth = selectedMonth + 1;
    dateET.setText(((((selectedDay + "/") + selectedMonth) + "/") + selectedYear));
}

private void stopScan() {
    if (mIsScanning) {
        android.util.Log.v(Utils.TAG, "Stopping scan");
        mScanHandler.removeCallbacks(mBleScannerTimeoutRunnable);
        final no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat scanner = no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat.getScanner();
        scanner.stopScan(scanCallback);
        mIsScanning = false;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.almasosorio.sharethatbill.RecyclerViewAdapter.TAG, ("adapter received click on item " + (getPosition())));
    onListItemClickListener.onItemClick(getPosition());
}

public static android.net.Uri appendDistinct(@android.support.annotation.NonNull
final android.net.Uri uri) {
    if (uri == null) {
        throw new java.lang.IllegalArgumentException("Uri can't be null");
    }
    return uri.buildUpon().appendQueryParameter(AbstractContentProviderProcessor.QUERY_PARAMETER_DISTINCT, "distinct").build();
}

@java.lang.Override
public void onAutoFocus(boolean success, android.hardware.Camera arg1) {
    if (success) {
        android.util.Log.i(com.terrydr.eyeScope.CameraView.TAG, "自动对焦成功");
    }
}

public static int px2dp(android.content.Context context, int px) {
    float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((px / scale) + (0.5F * px)));
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    makesureFragmentStack();
    pendingTransactionHandler.setAfterSaveInstanceState(false);
}

@java.lang.Override
public void onInit(com.androidsdk.snaphy.snaphyandroidsdk.list.DataList<com.androidsdk.snaphy.snaphyandroidsdk.models.PostDetail> dataList) {
    super.onInit(dataList);
    caseListAdapter = new com.orthopg.snaphy.orthopg.Fragment.CaseFragment.CaseListAdapter(mainActivity, dataList, com.orthopg.snaphy.orthopg.Fragment.CaseFragment.CaseFragment.TAG, casePresenter);
    recyclerView.setAdapter(caseListAdapter);
}

private void setPaletteForRootContainer(android.support.v7.graphics.Palette.Swatch colorDarkVaient) {
    svContainerTrailer.setBackgroundColor(colorDarkVaient.getRgb());
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(java.lang.String.valueOf(com.example.destr.busy_calendar.MainActivity.tag), "Destroying View ...");
    super.onDestroy();
}

@java.lang.Override
public void handleSnesClose() {
    android.util.Log.i("incomingstate", "handleSnesClose");
    snesState.closeCurrentListener();
}

@java.lang.Override
public void onClick(android.view.View v) {
    long result = dbHelper.sqlInsert(DbTables.RadioMap.TABLE_NAME, null, getDummy().toDbValues());
    android.widget.Toast.makeText(getContext(), (result + "rows inserted"), Toast.LENGTH_SHORT);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v("dimamir999", "handle click on add photo button");
    presenter.addNewPhoto(((android.graphics.drawable.BitmapDrawable) (photoView.getDrawable())).getBitmap());
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (REQUEST_PICTURE_RESULT)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        getAdapter().swap(getFiles());
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    m_batteryHandler = new com.asksven.betterbatterystats.BatteryChangedHandler();
    this.registerReceiver(m_batteryHandler, new android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED));
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    mSession.clearShooters();
    mSession.clearTeams();
}

private boolean threatening(android.graphics.Point p1, android.graphics.Point p2) {
    if ((!(isSameColour(p1, p2))) && (isBigger(p1, p2)))
        return true;
    
    return false;
}

public void dataChanged() {
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.downloads_list)));
    adapter = new internetofeveryone.ioe.Downloads.DownloadsAdapter(presenter.getDownloadedWebsiteNames(), this);
    listView.setAdapter(adapter);
}

public void activate(android.content.Context context) {
    context.startActivity(new android.content.Intent(context, activity));
}

public int getUniqueId() {
    int currentId = nl.vanvianen.android.gcm.NotificationId.id.getAndAdd(1);
}

private long addSensorToDB(com.example.ludvig.sens.SensorDBItem sensor, android.database.sqlite.SQLiteDatabase db) {
    return nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(db).put(sensor);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    for (ve.com.abicelis.creditcardexpensemanager.model.CreditCard c : mCreditCardList) {
        c.setCardExpiration(cardExpirationCal);
    }
    mAdapter.notifyDataSetChanged();
}

public void setEncodersCollection(java.util.Collection<org.mythtv.android.presentation.model.EncoderModel> encodersCollection) {
    this.validateEncodersCollection(encodersCollection);
    this.encodersCollection = ((java.util.List<org.mythtv.android.presentation.model.EncoderModel>) (encodersCollection));
    this.notifyDataSetChanged();
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    boolean proceed = dispalySnackBar(viewHolder.getAdapterPosition());
    list.remove(viewHolder.getAdapterPosition());
    adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
}

@com.facebook.react.uimanager.annotations.ReactProp(name = "rtl")
public void setRtl(com.facebook.react.views.toolbar.ReactToolbar view, boolean rtl) {
    view.setLayoutDirection((rtl ? android.util.LayoutDirection.LTR : android.util.LayoutDirection.RTL));
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent == null) {
        pendingIntent = intent.getParcelableExtra(ListPhotosPresenter.PENDING_INTENT_CODE);
    }
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
public void onSuccess() {
    android.widget.Toast.makeText(context, context.getResources().getString(R.string.sent_received_dispatch), Toast.LENGTH_SHORT).show();
    db.changeReceiveDispatch(dispatch.getId(), "receive");
    progressDialog.dismiss();
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int weight = java.lang.Integer.parseInt(java.lang.String.valueOf(seekBar1.getProgress()));
}

@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    synchronized(this) {
        activityStack.push(new java.lang.ref.WeakReference(activity));
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialog.dismiss();
    java.lang.System.out.println(((hours) + " <--..."));
    addForgottenUnit(unit, tempMins);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(performingLoad))
        searchByUrl(mWebView);
    
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(layoutSrcId, container);
    return rootView;
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("QR Fragment", "Resuming");
    mScannerView.setResultHandler(this);
    mScannerView.startCamera();
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if (actionBar != null) {
        actionBar.show();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.evanglazer.thecabaleffect.RegisterActivity.class);
    startActivity(intent);
}

public static java.lang.String toHtml(android.text.Spanned text) {
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    com.pxh.richparser.RichHtml.withinHtml(out, text);
    return android.text.Html.toHtml(text);
}

@java.lang.Override
public void onSuccess(com.eeyuva.screens.DetailPage.ArticleDetailResponse responseBody) {
    android.util.Log.e("Response:", new com.google.gson.Gson().toJson(responseBody).toString());
    mView.setOtherArticleDetails(responseBody.getResponse());
}

public edu.ccbcmd.pathwayguide.CourseClass getCourseByName(java.lang.String name, android.content.Context context) {
    for (edu.ccbcmd.pathwayguide.CourseClass course : sortedObject) {
        if (course.getTitle().equals(name)) {
            return course;
        }
    }
    return instantiateNewCourse(name, context);
}

@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
    if (!(isLoading))
        urlLink = intent.getStringExtra("urlLink");
    
    isWhich = intent.getStringExtra("isWhich");
    connectToApi();
}

private void onUploadProgress(org.wordpress.android.fluxc.model.MediaModel media, float progress) {
    java.lang.String localMediaId = java.lang.String.valueOf(media.getId());
    mEditorMediaUploadListener.onMediaUploadProgress(localMediaId, progress);
}

@java.lang.Override
public void onClick(android.view.View v) {
    (newQty)--;
    if ((newQty) < 0) {
        newQty = 0;
    }
    qtyEditText.setText(java.lang.Integer.toString(newQty));
}

public static com.imzoee.caikid.adapter.MainPagerAdapter instantiate(android.content.Context context, android.support.v4.app.FragmentManager fm) {
    if ((com.imzoee.caikid.adapter.MainPagerAdapter.instance) == null) {
        com.imzoee.caikid.adapter.MainPagerAdapter.instance = new com.imzoee.caikid.adapter.MainPagerAdapter(context, fm);
    }
    return com.imzoee.caikid.adapter.MainPagerAdapter.instance;
}

@org.androidannotations.annotations.AfterViews
private void main() {
    initImageOnBackground();
    onClickButton();
}

public void redirect(java.lang.String id) {
    android.content.Intent intent = new android.content.Intent(this, net.kodegeek.frontendioio.VisitorMainActivity.class);
    intent.putExtra("id", userID);
    startActivity(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_status);
    com.hess.hessandroid.volley.VolleyRequest vr = new com.hess.hessandroid.volley.VolleyRequest();
    vr.postData(this, "", new org.json.JSONObject());
    tv.setText("Testing.  Gogogo!");
}

@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.util.Log.e(Constants.TAG, "Error fetching all the offers images.");
}

