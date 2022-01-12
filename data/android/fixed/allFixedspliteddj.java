private void startMainActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.teamagam.gimelgimel.app.mainActivity.view.MainActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
    this.finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    mListener.onEmail(holder.email.getText().toString(), false);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
}

@java.lang.Override
public void sendBroadcast(final android.content.Intent intent, final java.lang.String receiverPermission) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run() {
            com.oasisfeng.condom.CondomContext.super.sendBroadcast(intent, receiverPermission);
        }
    });
}

private android.view.View getHeaderViewByType(int itemType) {
    if (!(isHeaderType(itemType)))
        return null;
    
    return mHeaderViews.get((itemType - (com.jinqiang.RecyclerViewRefresh.IRecyclerView.HEADER_INIT_INDEX)));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mListener.onNewGameCreate(setOption, playerOption, rulesOption);
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    error = true;
    android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_ERROR_PREPARE);
    sendBroadcast(intent);
    return false;
}

java.lang.String getPace() {
    java.lang.String str = settingPref.getString("Pace", "0");
    android.util.Log.i("getPace()", str);
    return str;
}

public java.lang.String getPortFromPreferences(android.content.Context context) {
    if ((org.wso2.emm.agent.utils.Preference.getString(context, Constants.PORT)) != null) {
        return org.wso2.emm.agent.utils.Preference.getString(context, Constants.PORT);
    }else {
        return org.wso2.emm.agent.utils.Constants.API_SERVER_PORT;
    }
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
}

@java.lang.Override
public void run() {
    android.location.Location last = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
    com.ibm.pisdk.geofencing.PIGeofencingService.log.debug(("setInitialLocation() last location = " + last));
    if (last != null) {
        geofenceManager.onLocationChanged(last, true);
    }
}

@java.lang.Override
protected void onStop() {
    if ((mFavorites) != null) {
        com.garpr.android.misc.FavoritesStore.write(mFavorites);
    }
    super.onStop();
}

public void loadPrev(android.content.ContentValues values) {
    values.remove(RetrieveList.PAGE_NUMBER);
    values.put(RetrieveList.PAGE_NUMBER, ((currentPage) - 1));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setTitle("Settings");
    addPreferencesFromResource(R.xml.preferences);
}

private boolean enableModePlayOffline(android.content.Intent intent) {
    return intent.hasExtra(Extras.KEY_MODE_OFFLINE);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    setUpActions();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
    }
    return super.onOptionsItemSelected(item);
}

protected void onChangeAvatar(android.view.View view) {
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    startActivityForResult(i, 1);
}

private void openPDFView(java.lang.String path) {
    android.content.Intent i = new android.content.Intent(c, io.github.antishake.TextReader.class);
    i.putExtra("Path", path);
    c.startActivity(i);
}

public static void initialize(android.content.Context context, nuclei3.notifications.NotificationManager instance) {
    nuclei3.notifications.NotificationManager.CONTEXT = context;
    nuclei3.notifications.NotificationManager.INSTANCE = instance;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    showDownloadConfirmDialog(((android.webkit.WebView) (view)));
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    btn.setBackgroundColor(Color.BLUE);
    b = btn;
    numberListener();
}

public void addHeaderView(android.view.View view) {
    addHeaderView(view, null, true);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int i) {
    switch (i) {
        case 1 :
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterPreviewFragment();
        default :
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterConvertFragment();
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (listenerLongClick == null) {
        return false;
    }
    listenerLongClick.onCellSelected(row, col);
    return false;
}

@java.lang.Override
public boolean onCreateWindow(android.webkit.WebView view, boolean isDialog, boolean isUserGesture, android.os.Message resultMsg) {
    if ((mWebChromeClient) != null) {
        return mWebChromeClient.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
    }
    return false;
}

private long getNavBarShowDelay() {
    if (mStatusBar.isKeyguardFadingAway()) {
        return mStatusBar.getKeyguardFadingAwayDelay();
    }else {
        return com.android.systemui.statusbar.phone.StatusBarKeyguardViewManager.NAV_BAR_SHOW_DELAY_BOUNCER;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    j = new android.content.Intent(this, com.example.sweng.seiqol_app.PieTesting.class);
    j.putExtra("DATA", data);
    startActivity(j);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mPlaying)
        pause(playButton);
    else
        play();
    
}

@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    mCamera.stopPreview();
    mCamera.release();
    mCamera = null;
    return false;
}

@java.lang.Override
public void call(org.croudtrip.api.account.Vehicle vehicle) {
    android.widget.Toast.makeText(getActivity(), "Updated vehicle info", Toast.LENGTH_SHORT).show();
    timber.log.Timber.v("Updated vehicle info");
}

@java.lang.Override
public void onClick(android.view.View view) {
    isUpdate = false;
    addMark("", "", "", "", false);
}

@java.lang.Override
public void handleResult(com.google.android.gms.vision.barcode.Barcode barcode) {
    showPopUp(barcode.displayValue);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((movieList.size()) > 0) {
        movieList.remove(0);
        showMovieTasteTest();
    }
}

@java.lang.Override
public void onAdReceived(com.rfm.sdk.RFMAdView adView) {
    android.util.Log.d(com.rfm.extras.adapters.RFMAdmobAdapter.LOG_TAG, "RFM :onAdReceived ");
    if ((rfmAdView) != null)
        rfmAdView.setVisibility(View.VISIBLE);
    
    if ((customEventListener) != null) {
        customEventListener.onAdLoaded(adView);
    }
}

private void chooseImageFromGallery() {
    android.content.Intent pictureFromGalleryIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    pictureFromGalleryIntent.setType("image/*");
    startActivityForResult(pictureFromGalleryIntent, com.lucianoleitefabris.inventoryapp.ProductDetailsActivity.GALLERY_REQUEST);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        switch1.setText("Light");
        light = true;
    }else {
        switch1.setText("Sound");
        light = false;
    }
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    android.util.Log.i(com.wolkabout.hexiwear.activity.Tracking.TAG, "in on restore");
}

public com.rey.material.widget.SnackBar height(int height) {
    mHeight = height;
    return this;
}

public java.lang.String getDeviceId() {
    return getString(R.string.pref_device_id, com.jana.android.core.utils.DeviceInfo.getUniqueId());
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    editor.putBoolean(Constants.PREFERENCES_SHOW_ALARM, false).commit();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    deleteNode();
    dialogInterface.dismiss();
    proportionMapAndList(100, 0);
}

@java.lang.Override
public void run() {
    android.util.Log.d("MY", "start init BT");
    b.init();
}

@java.lang.Override
public boolean onDoubleTap(final android.view.MotionEvent motionEvent) {
    return true;
}

private void openCamera(int id) {
    mCamera = android.hardware.Camera.open(id);
    if (((Build.VERSION.SDK_INT) > (Build.VERSION_CODES.JELLY_BEAN_MR1)) && ((mCamera) != null)) {
        mCamera.enableShutterSound(false);
    }
}

@java.lang.Override
public void onCallForwardingIndicatorChanged(boolean cfi) {
    super.onCallForwardingIndicatorChanged(cfi);
    if ((forwardToggle.isChecked()) != cfi) {
        forwardingChangeDetected = true;
        forwardToggle.setChecked(cfi);
    }
}

@java.lang.Override
public void onPanelCollapsed(android.view.View panel) {
    es.usc.citius.servando.calendula.util.ScreenUtils.setStatusBarColor(this, android.graphics.Color.argb(50, 61, 63, 64));
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    com.swrve.sdk.SwrveSDK.onNewIntent(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (com.fibelatti.accedomemory.helpers.GameHelper.getInstance().addResultListener(this, index)) {
        setCardFaceUp(true);
    }
}

private float getFontlength(android.graphics.Paint paint, java.lang.String str) {
    android.graphics.Rect rect = new android.graphics.Rect();
    paint.getTextBounds(str, 0, str.length(), rect);
    return rect.width();
}

@java.lang.Override
public void run() {
}

@java.lang.Override
public void callVK() {
    ((org.letsdoitukraine.androidapp.ui.login.activity.RegisterOrLoginActivity) (getActivity())).loginVk();
}

protected void initialiseGestureListener(android.view.View view, int position) {
    view.setOnTouchListener(new com.peekandpop.shalskar.peekandpop.PeekAndPop.PeekAndPopOnTouchListener(position));
    gestureDetector.setIsLongpressEnabled(false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCalenderListener) != null) {
        mCalenderListener.onSelectDate(mStartDate);
    }
    mViewPager.setCurrentItem(mMiddlePoint);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    db = new com.android.bpcontrol.databases.BPcontrolDB(getActivity());
    showDialog();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    return super.onPrepareOptionsMenu(menu);
}

private com.google.android.gms.location.LocationRequest createLocationRequest(long interval) {
    com.google.android.gms.location.LocationRequest locationRequest = new com.google.android.gms.location.LocationRequest();
    locationRequest.setInterval(interval);
    locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    return locationRequest;
}

@java.lang.Override
public void onResult(com.google.android.gms.wearable.DataApi.DataItemResult dataItemResult) {
    if (dataItemResult.getStatus().isSuccess()) {
        android.util.Log.e("Watch Log", "Successfully send weather info");
    }else {
        android.util.Log.e("Watch Log", "Failed to send weather info ");
    }
}

public static boolean checkAction(android.content.Intent i, java.lang.String action) {
    return action.equals(i.getAction());
}

public void onClick(android.view.View v) {
    inOutFilter = "outdoor";
    mapboxMap.clear();
    setMarkers(mapboxMap, gml);
    if (filter_autoclose)
        FAM_InOut.close(filter_autoclose);
    
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    android.util.Log.d("ModuleManager", "OnSwipe called");
    adapter.onItemDismiss(viewHolder);
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    configurePlayer();
}

public static android.content.Context getContext() {
    return com.app.nuts.App.mContext;
}

public void setPercent(float inputPercent) {
    percent = inputPercent;
}

public void addFragment(android.support.v4.app.Fragment fragment) {
    mFragment.add(fragment);
}

private void setScore(int score_val) {
    android.widget.TextView score = ((android.widget.TextView) (findViewById(R.id.score_value)));
    score.setText(java.lang.Integer.toString(score_val));
}

public void hideTile(android.view.View view) {
    android.widget.RelativeLayout expTile = ((android.widget.RelativeLayout) (findViewById(R.id.expandedTile)));
    expTile.setVisibility(View.GONE);
}

public void setCustomer(java.lang.String customerText) {
    ((android.widget.EditText) (findViewById(R.id.twwelcome))).setText(customerText);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent sendIntent = new android.content.Intent(context, com.example.android.popularmovies.service.MovieService.class);
    sendIntent.putExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA, intent.getStringExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA));
    context.startService(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
    }
    return false;
}

public boolean checkLocationRange(android.location.Location locA, android.location.Location locB) {
    float distance = locA.distanceTo(locB);
    if (distance < (distanceRange)) {
        return true;
    }else {
        return false;
    }
}

public void onResume() {
    super.onResume();
}

@butterknife.OnClick(value = R.id.icon_toolbar_back)
public void onBackClick() {
    onBackPressed();
}

public static void init(android.content.Context context) {
    main.mmwork.com.mmworklib.utils.DeviceInfo.sContext = context;
    main.mmwork.com.mmworklib.utils.DeviceInfo.MACADDRESS = main.mmwork.com.mmworklib.utils.DeviceInfo.getLocalMacAddress(context);
    main.mmwork.com.mmworklib.utils.DeviceInfo.RESOLUTION = main.mmwork.com.mmworklib.utils.DeviceInfo.getResolution(context);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    presenter.onViewCreated(view);
}

@java.lang.Override
public void onStart(android.content.Context pContext, android.os.Bundle arg1, java.lang.String[] arg2) {
    cn.jpush.android.api.JPushInterface.init(pContext);
    cn.jpush.android.api.JPushInterface.setDebugMode(false);
}

public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != (data.pvActiveSpriteId)) {
        data.pvActiveSpriteId = position;
        UpdateDisplay(container);
    }
}

public void onProviderDisabled(java.lang.String provider) {
}

public void funAdd(android.view.View v) {
    new com.engineer4myanmar.json.AdminActivity.HttpAsyncTask().execute(com.engineer4myanmar.json.AdminActivity.url_add);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_favorites, container, false);
    butterknife.ButterKnife.bind(this, view);
    return view;
}

@java.lang.Override
public void onClick(android.view.View v) {
    gridLayout.removeAllViewsInLayout();
    initGame();
}

public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
}

@java.lang.Override
public void onScrollChange(android.view.View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
    setRealHorizontalScrollViewPosition(scrollX, 0);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
}

@java.lang.Override
public void onMatrixError(final org.matrix.androidsdk.rest.model.MatrixError e) {
    onError(e.getLocalizedMessage());
}

public void setAutoFocusCallback(android.hardware.Camera.AutoFocusCallback autoFocusCallback) {
    mCamera.autoFocus(autoFocusCallback);
}

@java.lang.Override
public com.battleshippark.rememberphoto.presentation.storylist.StoryListVH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return com.battleshippark.rememberphoto.presentation.storylist.StoryListVH.create(parent.getContext(), parent, viewType);
}

@java.lang.Override
public void onCreate(int width, int height, boolean contextLost) {
    android.opengl.GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    square = new com.yanbin.magiccube.Square();
}

public android.graphics.Bitmap getBitmap(java.lang.String key) {
    android.graphics.Bitmap bitmap = getBitmapFromMemoryCache(key);
    if (bitmap == null) {
        synchronized(this) {
            bitmap = getBitmapFromDiskCache(key);
        }
    }
    return bitmap;
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    videoEndAt = mp.getDuration();
    android.util.Log.d(LOG_TAG, ("onPrepared: " + (videoEndAt)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    handleTakePictureonClick(v.getContext());
}

@java.lang.Override
protected void onStartView() {
    timber.log.Timber.d("onStartView");
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), ualberta.cmput301w16t16.glamorousborrowingwhaleapp.NewListingActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onLayoutInflated(android.support.wearable.view.WatchViewStub stub) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    toggleMovieFavorite();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.example.com.broadcastbestpractice.ActivityCollector.finishAll();
    android.content.Intent intent = new android.content.Intent(context, com.example.com.broadcastbestpractice.LoginActivity.class);
    context.startActivity(intent);
}

