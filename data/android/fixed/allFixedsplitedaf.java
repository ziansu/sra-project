@java.lang.Override
protected void onStop() {
    unregisterReceiver(playerReceiver);
    super.onStop();
}

@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    return android.view.View.inflate(context, R.layout.item_category, null);
}

public void initAudio() {
    setupVisualizerFxAndUI();
}

private int getLenght() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    boolean v = preferences.getBoolean("EXTRA_SMALL_FONT", false);
    if (v)
        return 8;
    else
        return 6;
    
}

@java.lang.Override
public void onClick(android.view.View view) {
    mListener.onItemClicked(mPosition, mMemo);
}

@org.junit.Test
public void testFeatureMaskTranslation() {
    int caps = (IWifiStaIface.StaIfaceCapabilityMask.BACKGROUND_SCAN) | (IWifiStaIface.StaIfaceCapabilityMask.LINK_LAYER_STATS);
    int expected = (android.net.wifi.WifiManager.WIFI_FEATURE_SCANNER) | (android.net.wifi.WifiManager.WIFI_FEATURE_LINK_LAYER_STATS);
    assertEquals(expected, mWifiVendorHal.wifiFeatureMaskFromStaCapabilities(caps));
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.miSearch :
            onSearch();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onFailure(int code, java.lang.String msg, java.lang.Object data) {
}

@java.lang.Override
public boolean onActionItemClicked(android.support.v7.view.ActionMode mode, android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.deck_delete_selected :
            {
                mListAdapter.deleteSelectedItems();
                mActionMode.finish();
                return true;
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
    return message.getCustomHeader(key);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

void start();

public final void stopIndoorOutdoorDetector() {
    if ((org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext) != null) {
        org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.unregisterReceiver(currentStatusReceiver);
        org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.unregisterReceiver(wifiInfoReceiver);
        org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext.stopService(new android.content.Intent(org.mygeotrust.indoor.tasks.detectIndoorOutdoor.IndoorOutdoorDetectorController.activityContext, org.mygeotrust.indoor.tasks.detectIndoorOutdoor.algorithm.DetermineIndoorOutdoorService.class));
    }
}

private void showTripProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    if ((mArrivalInfo) == null) {
        showArrivalListFragment(obaStop);
    }else {
        org.onebusaway.android.report.ui.ReportTripProblemFragment.show(this, mArrivalInfo, R.id.ri_report_stop_problem);
        mArrivalInfo = null;
    }
}

public void init(com.google.android.gms.maps.GoogleMap mMap) {
    userLocTmp = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(userLoc).title("your current location"));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(userLoc));
}

@java.lang.Override
public void run() {
    com.mapswithme.maps.routing.RoutingController.continueSavedTour(tourLoadedListener);
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.content.Context a = getActivity();
    setListAdapter(new com.commonsware.calendarapp.MyCustomAdapter(getActivity(), events));
    getListView().setDivider(null);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
}

public boolean isNetworkAvailable(android.content.Context context) {
    if (context == null) {
        return true;
    }
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (context.getSystemService(Context.CONNECTIVITY_SERVICE)));
    return (cm.getActiveNetworkInfo()) != null;
}

public static void stopRecording(android.media.MediaRecorder recorder) {
    if (null != recorder) {
        recorder.stop();
        recorder.reset();
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
    updateChat(true);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}

public void unlockAndHide(android.view.animation.Animation.AnimationListener listener) {
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_DISABLED;
    if (mLogoEnabled) {
        hide(listener);
    }
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    bitmap.recycle();
    dismissDialog();
}

@java.lang.Override
public void run() {
    com.android.email.service.EmailServiceUtils.startRemoteServices(mContext);
}

@java.lang.Override
public void onClick(android.view.View view) {
    started = false;
    instop = true;
    first = true;
    android.widget.Toast.makeText(this, "recording has stopped, restart for continue or load another dataset", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.buttonLogin :
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
        hideDelayed(hideDelay);
    }
}

@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    authLatch.countDown();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_units_key)));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simon_game);
    cpuInput.add(randomNumber);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.naks.vk.presenter.NewsPagePresenterImpl.TAG, "onDestroy");
    interactor.onDestroy();
}

@java.lang.Override
public void Update() {
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mStudentsDbHandler = new com.studios.lucian.students.util.StudentsDbHandler(getActivity());
    mGroupDao = new com.studios.lucian.students.repository.GroupDAO(getActivity());
    mGroups = mGroupDao.getAll();
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mVideoView.start();
}

@java.lang.Override
public void onError(com.quickblox.videochat.webrtc.QBRTCSession qbrtcSession, com.quickblox.videochat.webrtc.QBRTCException e) {
}

private void changeFont(edu.utep.cs.cs4330.battleship.TextView textView) {
    android.graphics.Typeface typeface = android.graphics.Typeface.createFromAsset(getAssets(), getFontPath());
    textView.setTypeface(typeface);
}

@java.lang.Override
public void onPeerInvitedToRoom(com.google.android.gms.games.multiplayer.realtime.Room room, java.util.List<java.lang.String> arg1) {
    android.util.Log.e("#####", "F: onPeerInvitedToRoom");
    updateRoom(room);
}

private void displayFilterDialogue() {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    com.groupeighteen.unote.view.DisplayPreferencesDialogue preferencesAlert = new com.groupeighteen.unote.view.DisplayPreferencesDialogue();
    preferencesAlert.show(fragmentManager, "DISPLAY_PREFERENCES_FRAGMENT");
}

public void decrement(android.view.View view) {
    if ((quantity) == 1) {
        android.widget.Toast.makeText(this, "You can not order less than 1 cup of coffee", Toast.LENGTH_SHORT).show();
    }else {
        quantity = (quantity) - 1;
        display(quantity);
    }
}

public void removeWebView(android.view.ViewGroup parent) {
    boolean isWebView = isWebViewShowing(parent);
    if (isWebView) {
        parent.setTag("");
        removeChildViews(parent);
    }
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
}

@java.lang.Override
public void onPrepareLoad(android.graphics.drawable.Drawable placeHolderDrawable) {
}

@java.lang.Override
public void onLastItemVisible() {
}

@java.lang.Override
public void onPwsResultError(java.util.Collection<java.lang.String> urls, int httpResponseCode, java.lang.Exception e) {
    android.widget.Toast.makeText(getApplicationContext(), getString(R.string.shorten_error), Toast.LENGTH_LONG).show();
    stopSelf();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mBinding.fab.hide();
    mBinding.addTabV.show();
    mBinding.addTabOpLl.setVisibility(View.VISIBLE);
    mBinding.newTabLabelTv.setVisibility(View.VISIBLE);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
}

@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    synchronized(this) {
        mCameraListener.onPictureTaken(data);
        capturingImage = false;
        camera.startPreview();
    }
}

private void updateItems() {
    java.lang.String query = com.bignerdranch.android.photogallery.QueryPreferences.getStoredQuery(getActivity());
    lastPageFetched = 1;
    new com.bignerdranch.android.photogallery.PhotoGalleryFragment.FetchItemsTask(query).execute(lastPageFetched);
}

com.tk.foursquaresearch.model.util.LocationHandler locationHandlerInstance(android.content.Context ctx, com.tk.foursquaresearch.model.util.LocationHandlerInterface handlerListener);

public boolean restore(android.os.Bundle bundle) {
    if (bundle == null) {
        return false;
    }
    mContentListModel = bundle.getParcelableArrayList(com.stdnull.v2api.model.V2MainFragModel.KEY_V2EXBEAN);
    return ((mContentListModel) != null) && (!(mContentListModel.isEmpty()));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.companyname.hearts.model.Overlord.getInstance().prepareForNextGame();
    setUpGame();
    displayImages();
    createListeners();
    beginRound();
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    return null;
}

public void startNoInterventionService() {
    stopAllServices(false);
    android.util.Log.d(Constants.TAG, "NoIntervention started");
    kr.ac.kaist.nmsl.pushmanager.util.Util.writeLogToFile(this, Constants.LOG_NAME, "START", "==============NoIntervention started===============");
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int selectedYear, int selectedMonth, int selectedDay) {
    selectedMonth = selectedMonth + 1;
    dateET.setText(((((selectedMonth + "/") + selectedDay) + "/") + selectedYear));
}

private void stopScan() {
    if (mIsScanning) {
        android.util.Log.v(Utils.TAG, "Stopping scan");
        final no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat scanner = no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat.getScanner();
        scanner.stopScan(scanCallback);
        mScanHandler.removeCallbacks(mBleScannerTimeoutRunnable);
        mIsScanning = false;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.almasosorio.sharethatbill.RecyclerViewAdapter.TAG, ("adapter received click on item " + (getPosition())));
    if ((onListItemClickListener) != null)
        onListItemClickListener.onItemClick(getPosition());
    
}

public static android.net.Uri appendDistinct(@android.support.annotation.NonNull
final android.net.Uri uri) {
    return uri.buildUpon().appendQueryParameter(AbstractContentProviderProcessor.QUERY_PARAMETER_DISTINCT, "distinct").build();
}

@java.lang.Override
public void onAutoFocus(boolean success, android.hardware.Camera arg1) {
    if (success) {
    }
}

public static int px2dp(android.content.Context context, int px) {
    float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((px / scale) + 0.5F));
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    makesureFragmentStack();
}

@java.lang.Override
public void onInit(com.androidsdk.snaphy.snaphyandroidsdk.list.DataList<com.androidsdk.snaphy.snaphyandroidsdk.models.PostDetail> dataList) {
}

private void setPaletteForRootContainer(android.support.v7.graphics.Palette.Swatch colorDarkVaient) {
    if (colorDarkVaient != null) {
        svContainerTrailer.setBackgroundColor(colorDarkVaient.getRgb());
    }
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
}

@java.lang.Override
public void handleSnesClose() {
    snesState.closeCurrentListener();
}

@java.lang.Override
public void onClick(android.view.View v) {
    long result = dbHelper.sqlInsert(DbTables.RadioMap.TABLE_NAME, null, getDummy().toDbValues());
    android.widget.Toast.makeText(getContext(), (result + "rows inserted"), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v("dimamir999", "handle click on add photo button");
    presenter.addNewPhoto(photoView.getDrawable());
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (REQUEST_PICTURE_RESULT)) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            getAdapter().swap(getFiles());
        }
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
}

private boolean threatening(android.graphics.Point p1, android.graphics.Point p2) {
    return (!(isSameColour(p1, p2))) && (isBigger(p1, p2));
}

public void dataChanged() {
    listView = ((android.widget.ListView) (findViewById(R.id.downloads_list)));
    adapter = new internetofeveryone.ioe.Downloads.DownloadsAdapter(presenter.getDownloadedWebsiteNames(), this);
    listView.setAdapter(adapter);
}

public void activate(android.content.Context context) {
    if ((activity) != null) {
        context.startActivity(new android.content.Intent(context, activity));
    }
}

public int getUniqueId() {
    return nl.vanvianen.android.gcm.NotificationId.id.getAndAdd(1);
}

public static long addSensorToDB(com.example.ludvig.sens.SensorDBItem sensor, android.database.sqlite.SQLiteDatabase db) {
    return nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(db).put(sensor);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if ((cardExpirationCal) != null) {
        for (ve.com.abicelis.creditcardexpensemanager.model.CreditCard c : mCreditCardList) {
            c.setCardExpiration(cardExpirationCal);
        }
        mAdapter.notifyDataSetChanged();
    }
}

public void setEncodersCollection(java.util.Collection<org.mythtv.android.presentation.model.EncoderModel> encodersCollection) {
    this.validateEncodersCollection(encodersCollection);
    this.encodersCollection = new java.util.ArrayList(encodersCollection);
    this.notifyDataSetChanged();
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    dispalySnackBar(viewHolder.getAdapterPosition());
    list.remove(viewHolder.getAdapterPosition());
    adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
}

@com.facebook.react.uimanager.annotations.ReactProp(name = "rtl")
public void setRtl(com.facebook.react.views.toolbar.ReactToolbar view, boolean rtl) {
    view.setLayoutDirection((rtl ? android.util.LayoutDirection.RTL : android.util.LayoutDirection.LTR));
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent != null) {
        pendingIntent = intent.getParcelableExtra(ListPhotosPresenter.PENDING_INTENT_CODE);
    }
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
public void onSuccess() {
    android.widget.Toast.makeText(context, context.getResources().getString(R.string.sent_received_dispatch), Toast.LENGTH_SHORT).show();
    progressDialog.dismiss();
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    weight = java.lang.Integer.parseInt(java.lang.String.valueOf(seekBar1.getProgress()));
}

@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    activityStack.push(activity);
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println(((hours) + " <--..."));
    addForgottenUnit(unit, tempMins);
    dialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(performingLoad))
        mWebView.searchByUrl();
    
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(layoutSrcId, container, false);
    return rootView;
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mScannerView.setResultHandler(this);
    mScannerView.startCamera();
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if (actionBar != null) {
        actionBar.show();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.evanglazer.thecabaleffect.RegisterActivity.class);
    startActivity(intent);
}

public static java.lang.String toHtml(android.text.Spanned text) {
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    com.pxh.richparser.RichHtml.withinHtml(out, text);
    return out.toString();
}

@java.lang.Override
public void onSuccess(com.eeyuva.screens.DetailPage.ArticleDetailResponse responseBody) {
    mView.setOtherArticleDetails(responseBody.getResponse());
}

public edu.ccbcmd.pathwayguide.CourseClass getCourseByName(java.lang.String name, int count, android.content.Context context) {
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
    if (!(isLoading)) {
        urlLink = intent.getStringExtra("urlLink");
        isWhich = intent.getStringExtra("isWhich");
        connectToApi();
    }
}

private void onUploadProgress(org.wordpress.android.fluxc.model.MediaModel media, float progress) {
    java.lang.String localMediaId = java.lang.String.valueOf(media.getId());
    if ((mEditorMediaUploadListener) != null) {
        mEditorMediaUploadListener.onMediaUploadProgress(localMediaId, progress);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    (newQty)--;
    if ((newQty) < 1) {
        newQty = 1;
    }
    qtyEditText.setText(java.lang.Integer.toString(newQty));
}

public static com.imzoee.caikid.adapter.MainPagerAdapter instantiate(android.content.Context context, android.support.v4.app.FragmentManager fm) {
    return new com.imzoee.caikid.adapter.MainPagerAdapter(context, fm);
}

@org.androidannotations.annotations.AfterViews
public void main() {
    initImageOnBackground();
    onClickButton();
}

public void redirect(java.lang.String id) {
    android.content.Intent intent = new android.content.Intent(this, net.kodegeek.frontendioio.VisitorMainActivity.class);
    intent.putExtra("id", id);
    startActivity(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_status);
    com.hess.hessandroid.volley.VolleyRequest vr = new com.hess.hessandroid.volley.VolleyRequest();
    vr.postData(this, "", null);
    tv.setText("Testing.  Gogogo!");
}

@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.util.Log.e(Constants.TAG, "Error fetching all the offers images.");
    android.util.Log.e(Constants.TAG, t.toString());
}

