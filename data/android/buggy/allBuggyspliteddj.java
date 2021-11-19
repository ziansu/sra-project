private void startMainActivity() {
    android.content.Intent mainActivityIntent = new android.content.Intent(this, com.teamagam.gimelgimel.app.mainActivity.view.MainActivity.class);
    mainActivityIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(mainActivityIntent);
    this.finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    mListener.onEmail(holder.email.getText().toString());
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    dialogView.findViewById(R.id.new_value);
}

@java.lang.Override
public void sendBroadcast(final android.content.Intent intent, final java.lang.String receiverPermission) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run(final android.content.Intent intent) {
            com.oasisfeng.condom.CondomContext.super.sendBroadcast(intent, receiverPermission);
        }
    });
}

private android.view.View getHeaderViewByType(int itemType) {
    if (isHeaderType(itemType))
        return null;
    
    return mHeaderViews.get((itemType - (com.jinqiang.RecyclerViewRefresh.IRecyclerView.HEADER_INIT_INDEX)));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mListener.onNewGameCreate(setOption, ((playerOption) + 1), rulesOption);
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    if (what == 1) {
        android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_ERROR_PREPARE);
        sendBroadcast(intent);
    }
    return false;
}

java.lang.String getPace() {
    java.lang.String str = settingPref.getString("Pace", "0");
    android.util.Log.i("getPace()", Pace);
    return str;
}

private java.lang.String getPortFromPreferences(android.content.Context context) {
    if ((org.wso2.emm.agent.utils.Preference.getString(context, Constants.PORT)) != null) {
        return org.wso2.emm.agent.utils.Preference.getString(context, Constants.PORT);
    }else {
        return org.wso2.emm.agent.utils.Constants.API_SERVER_PORT;
    }
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    mTextView.setText(error.getMessage());
}

@java.lang.Override
public void run() {
    android.location.Location last = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
    com.ibm.pisdk.geofencing.PIGeofencingService.log.debug(("setInitialLocation() last location = " + last));
    if (last != null) {
        geofenceManager.onLocationChanged(last);
    }
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((mFavorites) != null) {
        com.garpr.android.misc.FavoritesStore.write(mFavorites);
    }
}

public void loadPrev(android.content.ContentValues values) {
    values.put(RetrieveList.PAGE_NUMBER, ((currentPage) - 1));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActionBar().setTitle("Settings");
    addPreferencesFromResource(R.xml.preferences);
}

private boolean enableModePlayOffline(android.content.Intent intent) {
    if (intent.hasExtra(Extras.KEY_MODE_OFFLINE)) {
        return true;
    }
    return false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.worlds.prudnikoff.worlds.MainActivity.categoriesData = new com.worlds.prudnikoff.worlds.CategoriesData();
    setContentView(R.layout.main_activity);
    setUpActions();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.addDatabase :
            startActivity(new android.content.Intent(this, de.szut.passkeeper.Activity.CreateDatabaseActivity.class));
            break;
    }
    return super.onOptionsItemSelected(item);
}

private void onChangeAvatar(android.view.View view) {
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    startActivityForResult(i, 1);
}

public void openPDFView(java.lang.String path) {
    android.content.Intent i = new android.content.Intent(c, io.github.antishake.TextReader.class);
    i.putExtra("Path", path);
    c.startActivity(i);
}

public static void initialize(android.content.Context context, nuclei3.notifications.NotificationManager instance) {
    nuclei3.notifications.NotificationManager.CONTEXT = context.getApplicationContext();
    nuclei3.notifications.NotificationManager.INSTANCE = instance;
    nuclei3.notifications.NotificationManager.DB = android.arch.persistence.room.Room.databaseBuilder(nuclei3.notifications.NotificationManager.CONTEXT, nuclei3.notifications.model.NotificationsDb.class, "nuclei_notifications.db").fallbackToDestructiveMigration().build();
}

@java.lang.Override
public void onClick(android.view.View v) {
    btOff.setBackgroundColor(getResources().getColor(R.color.button_change));
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    android.webkit.WebView webView = ((android.webkit.WebView) (view));
    showDownloadConfirmDialog(webView);
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    btn.setBackgroundColor(Color.BLUE);
    max.sudoku.MainActivity.b = btn;
    numberListener();
}

public void addHeaderView(android.view.View view) {
    mListView.addHeaderView(view);
    mHeaderViews.add(view);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int i) {
    switch (i) {
        case 0 :
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterConvertFragment();
        case 1 :
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterPreviewFragment();
        default :
            return new com.offsec.nethunter.DuckHunterFragment.DuckHunterReferenceFragment();
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    listenerLongClick.onCellSelected(row, col);
    return false;
}

@java.lang.Override
public boolean onCreateWindow(android.webkit.WebView view, boolean isDialog, boolean isUserGesture, android.os.Message resultMsg) {
    return mWebChromeClient.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
}

private long getNavBarShowDelay() {
    if (mStatusBar.isKeyguardFadingAway()) {
        return mStatusBar.getKeyguardFadingAwayDelay();
    }else
        if (mBouncer.isShowing()) {
            return com.android.systemui.statusbar.phone.StatusBarKeyguardViewManager.NAV_BAR_SHOW_DELAY_BOUNCER;
        }else {
            return 0;
        }
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    j = new android.content.Intent(this, com.example.sweng.seiqol_app.PieTesting.class);
    i.putExtra("DATA", data);
    startActivity(j);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mPlaying)
        pause(playButton);
    else
        play(playButton);
    
}

@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    mCamera.stopPreview();
    mCamera.release();
    return true;
}

@java.lang.Override
public void call(org.croudtrip.api.account.Vehicle vehicle) {
    android.widget.Toast.makeText(getActivity(), "Updated vehicle info", Toast.LENGTH_SHORT);
    timber.log.Timber.v("Updated vehicle info");
}

@java.lang.Override
public void onClick(android.view.View view) {
    isUpdate = false;
    addMark("", "", "", "", false, 0);
}

@java.lang.Override
public void handleResult(com.google.android.gms.vision.barcode.Barcode barcode) {
    showPopUp(barcode.displayValue);
    java.lang.System.out.println(("Res: " + (barcode.displayValue)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    showMovieTasteTest();
    if ((movieList.size()) > 0) {
        movieList.remove(0);
    }
}

@java.lang.Override
public void onAdReceived(com.rfm.sdk.RFMAdView adView) {
    android.util.Log.d(com.rfm.extras.adapters.RFMAdmobAdapter.LOG_TAG, "RFM :onAdReceived ");
    rfmAdView.setVisibility(View.VISIBLE);
    if ((customEventListener) != null) {
        customEventListener.onAdLoaded(adView);
    }
}

public void chooseImageFromGallery() {
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
        light = true;
    }
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    android.util.Log.i(com.wolkabout.hexiwear.activity.Tracking.TAG, "in on restore");
    button_tracking.setText(savedInstanceState.getString("btn_text"));
}

public com.rey.material.widget.SnackBar height(int height) {
    mHeight = height;
    android.util.Log.v("asd", ("height: " + (mHeight)));
    return this;
}

public java.lang.String getDeviceId() {
    java.lang.String value = getString(R.string.pref_device_id, com.jana.android.core.utils.DeviceInfo.getUniqueId());
    return value;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    editor.putBoolean(Constants.PREFERENCES_SHOW_ALARM, false).commit();
    editor.apply();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    osmMap.deleteNode();
    dialogInterface.dismiss();
    proportionMapAndList(100, 0);
}

public void run() {
    android.util.Log.d("MY", "start init BT");
    b.init();
    control.postDelayed(new andreyanov.carcontrol.MainActivity.ControlSendRunner(), 1000L);
}

@java.lang.Override
public boolean onDoubleTap(final android.view.MotionEvent motionEvent) {
    return false;
}

private void openCamera(int id) {
    mCamera = android.hardware.Camera.open(id);
    if ((Build.VERSION.SDK_INT) > (Build.VERSION_CODES.JELLY_BEAN_MR1)) {
        mCamera.enableShutterSound(false);
    }
}

@java.lang.Override
public void onCallForwardingIndicatorChanged(boolean cfi) {
    android.util.Log.v(com.itachi46.autoredirect.app.MainActivity.TAG, "call forwarding indicator changed.");
    super.onCallForwardingIndicatorChanged(cfi);
    if ((forwardToggle.isChecked()) != cfi) {
        forwardingChangeDetected = true;
        forwardToggle.setChecked(cfi);
    }
}

@java.lang.Override
public void onPanelCollapsed(android.view.View panel) {
    es.usc.citius.servando.calendula.util.ScreenUtils.setStatusBarColor(this, android.graphics.Color.argb(50, 61, 63, 64));
    android.util.Log.v("SLINDINGPANEL", ((es.usc.citius.servando.calendula.pharmacies.util.Utils.getDate(d)) + " onPanelCollapsed"));
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    com.swrve.sdk.SwrveSDK.onNewIntent(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (com.fibelatti.accedomemory.helpers.GameHelper.getInstance().addResultListener(this, getAdapterPosition())) {
        setCardFaceUp(true);
    }
}

public float getFontlength(android.graphics.Paint paint, java.lang.String str) {
    android.graphics.Rect rect = new android.graphics.Rect();
    paint.getTextBounds(str, 0, str.length(), rect);
    return rect.width();
}

@java.lang.Override
public void run() {
    com.facebook.notifications.NotificationsManager.presentNotification(cordova.getActivity(), payload, new android.content.Intent(cordova.getActivity().getApplicationContext(), cordova.getActivity().$missing$));
}

@java.lang.Override
public void callVK() {
    addFragment(new org.letsdoitukraine.androidapp.ui.login.fragments.FrgReg());
    ((org.letsdoitukraine.androidapp.ui.login.activity.RegisterOrLoginActivity) (getActivity())).loginVk();
}

protected void initialiseGestureListener(android.view.View view, int position) {
    view.setOnTouchListener(new com.peekandpop.shalskar.peekandpop.PeekAndPop.PeekAndPopOnTouchListener(position));
    gestureDetector = new android.view.GestureDetector(builder.activity, new com.peekandpop.shalskar.peekandpop.PeekAndPop.GestureListener(view, position));
    gestureDetector.setIsLongpressEnabled(false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mCalenderListener.onSelectDate(mStartDate);
    mViewPager.setCurrentItem(mMiddlePoint);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    db = new com.android.bpcontrol.databases.BPcontrolDB(getActivity());
    showDialog();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerPane);
    return super.onPrepareOptionsMenu(menu);
}

private com.google.android.gms.location.LocationRequest createLocationRequest(long interval, long fastestInterval) {
    com.google.android.gms.location.LocationRequest locationRequest = new com.google.android.gms.location.LocationRequest();
    locationRequest.setInterval(interval);
    locationRequest.setFastestInterval(fastestInterval);
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
    mGoogleApiClient.disconnect();
}

public static boolean checkAction(android.content.Intent i, java.lang.String action) {
    return i.getAction().equals(action);
}

public void onClick(android.view.View v) {
    inOutFilter = "outdoor";
    mapboxMap.clear();
    setMarkers(mapboxMap, gml);
    if (filter_autoclose)
        FAM_InOut.close(true);
    
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    android.util.Log.d("ModuleManager", "OnSwipe called");
    viewHolder.itemView.setX(0);
    adapter.onItemDismiss(viewHolder);
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    android.widget.Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getActivity(), "อัพโหลดข้อมูล บันทึกเเบบสมบูรณ์ เรียบร้อย", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.i(LOG_TAG, "onCreate - start");
    configurePlayer();
    android.util.Log.i(LOG_TAG, "onCreate - end");
}

public static android.content.Context getmContext() {
    return com.app.nuts.App.mContext;
}

public void setPercent(float inputPercent) {
    percent = inputPercent;
    android.util.Log.println(Log.INFO, "Percent Set", ("Percent set to " + (percent)));
}

public void addFragment(android.support.v4.app.Fragment fragment) {
    android.util.Log.d("dudco", "add");
    mFragment.add(fragment);
}

private void setScore(int score_val) {
    android.widget.TextView score = ((android.widget.TextView) (findViewById(R.id.score_value)));
    score.setText(score_val);
}

public void hideTile(android.view.View view) {
    android.widget.RelativeLayout expTile = ((android.widget.RelativeLayout) (findViewById(R.id.expandedTile)));
    android.widget.Toast.makeText(this, "Hide", Toast.LENGTH_SHORT).show();
    expTile.setVisibility(View.GONE);
}

public void setCustomer(java.lang.String customerText) {
    android.util.Log.i("View", "Sätter text!");
    ((android.widget.EditText) (findViewById(R.id.twwelcome))).setText(customerText);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent sendIntent = new android.content.Intent(context, com.example.android.popularmovies.service.MovieService.class);
    sendIntent.putExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA, intent.getStringExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA));
    context.startService(sendIntent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Question sent!", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        v.clearFocus();
    }
    return false;
}

public boolean checkLocationRange(android.location.Location locA, android.location.Location locB, float accuracy) {
    float distance = locA.distanceTo(locB);
    if (distance < ((distanceRange) + accuracy)) {
        return true;
    }else {
        return false;
    }
}

public void onResume() {
    android.util.Log.d("lis", "resumeEdit");
    super.onResume();
}

@butterknife.OnClick(value = R.id.icon_toolbar_back)
public void onBackClick() {
    if ((toolbarBackIcon.getVisibility()) == (android.view.View.GONE))
        return ;
    
    onBackPressed();
}

public static void init(android.content.Context context, android.app.Activity activity) {
    main.mmwork.com.mmworklib.utils.DeviceInfo.sContext = context;
    main.mmwork.com.mmworklib.utils.DeviceInfo.MACADDRESS = main.mmwork.com.mmworklib.utils.DeviceInfo.getLocalMacAddress(context);
    main.mmwork.com.mmworklib.utils.DeviceInfo.RESOLUTION = main.mmwork.com.mmworklib.utils.DeviceInfo.getResolution(activity);
}

protected void postCreateView(android.app.Dialog view, android.os.Bundle savedInstanceState) {
    if ((presenter) == null) {
        throw new java.lang.RuntimeException("Failed to create presenter for fragment");
    }
    presenter.onViewCreated(view);
}

@java.lang.Override
public void onStart(android.content.Context pContext, android.os.Bundle arg1, java.lang.String[] arg2) {
    cn.jpush.android.api.JPushInterface.setDebugMode(false);
    cn.jpush.android.api.JPushInterface.init(pContext);
}

public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != (data.pvActiveSpriteId)) {
        data.pvActiveSpriteId = position;
        UpdateDisplay(container);
    }else {
    }
}

@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    android.util.Log.d("MyMaps", ("LocationListenerGPS: Provider diabled - " + provider));
}

public void funAdd(android.view.View v) {
    new com.engineer4myanmar.json.AdminActivity.HttpAsyncTask().execute(com.engineer4myanmar.json.AdminActivity.url_add);
    funClearAll();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_favorites, container);
    butterknife.ButterKnife.bind(this, view);
    return view;
}

@java.lang.Override
public void onClick(android.view.View v) {
    showInterstitial();
    gridLayout.removeAllViewsInLayout();
    initGame();
}

public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    android.util.Log.i(com.monmouth.fayePG.FayePG.LOG_TAG, ("fayePG onNewIntent called w/intent " + (intent.toString())));
}

@java.lang.Override
public void onScrollChange(android.view.View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
    setRealHorizontalScrollViewPosition(scrollX, mRealHorizontalScrollViewWidth, 0);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if (((mediaPlayer) != null) && b) {
        mediaPlayer.seekTo((i * 1000));
    }
}

@java.lang.Override
public void onMatrixError(org.matrix.androidsdk.rest.model.MatrixError e) {
    onError(e.getLocalizedMessage());
}

public void setAutoFocusCallback(android.hardware.Camera.AutoFocusCallback autoFocusCallback) {
    this.autoFocusCallback = autoFocusCallback;
    mCamera.autoFocus(autoFocusCallback);
}

@java.lang.Override
public com.battleshippark.rememberphoto.presentation.storylist.StoryListVH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return com.battleshippark.rememberphoto.presentation.storylist.StoryListVH.create(parent.getContext(), viewType);
}

@java.lang.Override
public void onCreate(int width, int height, boolean contextLost) {
    android.opengl.GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    square = new com.yanbin.magiccube.Square();
    square.setDrawMode(GLES20.GL_TRIANGLES);
}

public android.graphics.Bitmap getBitmap(java.lang.String key) {
    android.graphics.Bitmap bitmap = getBitmapFromMemoryCache(key);
    if (bitmap == null) {
        bitmap = getBitmapFromDiskCache(key);
    }
    return bitmap;
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    videoEndAt = (mp.getDuration()) * 1000;
    android.util.Log.d(LOG_TAG, ("onPrepared: " + (videoEndAt)));
}

@java.lang.Override
public void onClick(bbct.android.common.activity.View v) {
    handleTakePictureonClick(v.getContext());
}

@java.lang.Override
protected void onStartView() {
    timber.log.Timber.d("onStartView");
    commitFragment(activity, com.uramonk.androidtemplateapp.view.MainFragment.newInstance(), R.id.container);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), ualberta.cmput301w16t16.glamorousborrowingwhaleapp.NewListingActivity.class);
    startActivity(intent);
    android.util.Log.d("TEST", "aaa");
}

@java.lang.Override
public void onLayoutInflated(android.support.wearable.view.WatchViewStub stub) {
    android.support.wearable.view.CircledImageView circledImageView = ((android.support.wearable.view.CircledImageView) (stub.findViewById(R.id.circle)));
    circledImageView.showIndeterminateProgress(true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    toggleMovieFavorite((mMovie.getIsFavorite(getActivity()) ? true : false));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.example.com.broadcastbestpractice.ActivityCollector.finishAll();
    android.content.Intent intent1 = new android.content.Intent(context, com.example.com.broadcastbestpractice.LoginActivity.class);
    context.startActivity(intent);
}

