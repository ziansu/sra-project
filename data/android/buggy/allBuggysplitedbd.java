@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    if (!(navigateSuccess)) {
        funnel.logCancel();
    }
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.widget.Toast.makeText(getBaseContext(), "Attempt to POST made!", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    mPeople = new java.util.ArrayList<>();
    mAdapter = new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, mPeople);
}

@java.lang.Override
public void onConnected() {
    microsoftBands.register();
    notificationManager = new org.md2k.microsoftband.notification.NotificationManager(this, microsoftBands.find());
    android.widget.Toast.makeText(this, "MicrosoftBand Started successfully", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    android.util.Log.i("AudioService", "start to play music");
    mediaPlayer.start();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.mycompany.CMSBHelpdesk.Settings.class);
    sharedPreference.setString(this, "oneTS", "true");
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onError(@io.reactivex.annotations.NonNull
java.lang.Throwable e) {
    com.takescoop.americanwhitewaterandroid.utility.Dialogs.toast(e.getMessage());
}

@java.lang.Override
public void onGlobalLayout() {
    getViewTreeObserver().removeOnGlobalLayoutListener(this);
    mCameraPreviewContainer.setLayoutParams(new android.widget.LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, ((int) ((CAMERA_PREVIEW_ASPECT_RATIO) * (getWidth())))));
    setupCameraPreview();
}

public com.brouding.simpledialog.SimpleDialog.Builder setGuideImage(@android.support.annotation.DrawableRes
int imageId, @android.support.annotation.IntRange
int padding) {
    this.guideImageId = imageId;
    this.guideImagePadding = getPXWithDP(padding);
    return this;
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    yearsTerm.setText(((yearsBar.getProgress()) + " Year(s)"));
}

@java.lang.Override
public void onPress(int primaryCode) {
    android.util.Log.d(TAG, "onPress: ");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    mUnbinder = butterknife.ButterKnife.bind(this);
    initData();
    initView();
}

@java.lang.Override
public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
    mRecordCaptureSession = session;
    try {
        mRecordCaptureSession.setRepeatingRequest(mCaptureRequestBuilder.build(), null, null);
    } catch (android.hardware.camera2.CameraAccessException e) {
        e.printStackTrace();
    }
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
public static boolean isSystemAlertPermissionGranted(android.content.Context context) {
    return ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M)) || (android.provider.Settings.canDrawOverlays(context));
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.skillvo.android.ProjectApplication.projectApplication = this;
    setUpDefaultCalligraphy();
}

public boolean updatePerformed(long dataTime) {
    android.util.Log.i(com.tpb.brainfuck_app.Storage.TAG, ((("updatePerformed: DataTime " + dataTime) + " LastUpdate ") + (com.tpb.brainfuck_app.Storage.lastUpdate)));
    return (com.tpb.brainfuck_app.Storage.lastUpdate) > dataTime;
}

private void onMissingDisplayNamesComplete(int mResultCount, java.lang.StringBuffer debugMessage) {
    if (debugMessage != null) {
        android.util.Log.w(Global.LOG_CONTEXT, ((mDebugPrefix) + debugMessage));
    }
    if (mResultCount > 0) {
    }
}

private void toaster(java.lang.String message) {
    final java.lang.String toastMessage = message;
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(tcslab.syndesiapp.controllers.localization.WifiService.this, toastMessage, Toast.LENGTH_SHORT).show();
        }
    });
}

@android.support.annotation.CheckResult
com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(java.lang.Object... args);

@java.lang.Override
public void onPoiClick(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
    android.widget.Toast.makeText(mContext, "pointOfInterest.name", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onPageSelected(int position) {
    android.widget.Toast.makeText(getActivity(), ("Selected page position: " + position), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    activity.clickOnViewItem(cursor.getLong(cursor.getColumnIndex(StockContract.StockEntry._ID)));
}

private boolean isStoragePermissionGiven() {
    boolean tmp;
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this.getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        tmp = false;
    }else {
        tmp = true;
    }
    return tmp;
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.d(com.mmm.parq.fragments.DriverHomeFragment.TAG, "in HomeFragment onStart");
    if ((mState) != null) {
        setOverlayFragment();
    }
}

@java.lang.Override
public void onVerificationFailed(com.google.firebase.FirebaseException e) {
    android.util.Log.w(TAG, "onVerificationFailed", e);
    progressDialog.dismiss();
    if (e instanceof com.google.firebase.auth.FirebaseAuthInvalidCredentialsException) {
    }else
        if (e instanceof com.google.firebase.FirebaseTooManyRequestsException) {
        }
    
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.d("VideoPlayer", "Completed");
    mp.reset();
    mp.seekTo(0);
    videoUpdateListener.onComplete();
}

public void resetObject(com.mozidev.testopengl.Base3DObject object) {
    android.util.Log.d(com.mozidev.testopengl.MyGLRenderer.TAG, "resetObject");
    if (object != null) {
        m3DObject = object;
        createFigure();
        createMarkers();
    }
}

@java.lang.Override
public int getItemCount() {
    android.util.Log.d("SESSION SIZE", java.lang.Integer.toString(com.matthew.gymapp.SessionStore.getSize()));
    return com.matthew.gymapp.SessionStore.getSize();
}

protected final android.app.PendingIntent createPendingIntent(int notificationId, java.lang.String action, android.os.Bundle data, int flags) {
    return module.createPendingIntent(notificationId, action, data, flags);
}

public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        c.close();
        finish();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent nowPlayingIntent = new android.content.Intent(this, com.example.android.musique.NowPlaying.class);
    if (songSelected) {
        startActivity(nowPlayingIntent);
    }
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "onMapReady, setting up map");
    _googleMap = googleMap;
    _googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    _googleMap.setIndoorEnabled(false);
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "calling updateMap from onMapReady()");
    updateMap();
}

@java.lang.Override
public boolean onTouchEvent(@android.support.annotation.NonNull
android.view.MotionEvent event) {
    this.mDetector.onTouchEvent(event);
    return true;
}

public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.childstudios.promunchkincounter.player getplayer = players.get(position);
    playerScreen(view, getplayer);
}

public static twitter4j.Twitter getTwitterInstance(final android.content.Context context, final long accountId, final boolean includeEntities) {
    return org.mariotaku.twidere.util.Utils.getTwitterInstance(context, accountId, includeEntities, true, (!(org.mariotaku.twidere.util.MIUIUtils.isMIUI())));
}

@javax.annotation.Nonnull
public static java.lang.String encrypt(@javax.annotation.Nonnull
java.lang.String message, @javax.annotation.Nonnull
java.lang.String salt) {
    return new java.lang.String(android.util.Base64.encode(ua.boberproduction.bbr.util.Encryption.xor(message, salt).getBytes(), 0));
}

private void setPreferenceForRevenueItem(android.widget.CheckBox revenuSourceCheckbox, int revenueSourceId) {
    com.android.ssm.ssm.models.RevenueSource source = com.android.ssm.ssm.models.RevenueSource.findById(com.android.ssm.ssm.models.RevenueSource.class, revenueSourceId);
    if (source != null) {
        revenuSourceCheckbox.setChecked(true);
    }else {
        revenuSourceCheckbox.setChecked(false);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.pquach.vocabularynote.Category.delete(getActivity(), mCategory);
    ((com.pquach.vocabularynote.MainActivity) (getActivity())).updateSpinner();
}

public void handleMessage(android.os.Message msg) {
    if ((msg.what) == 0) {
        try {
            builder.show();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        ScrollingActivity.mAdapter.notifyDataSetChanged();
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    updateGUI(intent);
    android.util.Log.d("memelol", "received something");
}

public void registerAuthenticationListener(com.concavenp.artistrymuse.services.UserAuthenticationService.OnAuthenticationListener listener) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "Auth listener has been registered");
    mAuthListener = listener;
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "Listening for Auth changes");
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if (marker != (myLocation)) {
        com.vanshil.checkpoint.SelectedActivity.start(this, businesses.get(java.lang.Integer.parseInt(marker.getSnippet())));
    }
    return false;
}

@java.lang.Override
public void onSwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] dismissedItems) {
    if ((dismissedItems != null) && ((dismissedItems.length) > 0)) {
        handleAcceptDecline(false, 0);
    }
}

@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
    android.widget.Toast.makeText(getApplicationContext(), "About to get empty!", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    int position = getAdapterPosition();
    android.widget.Toast.makeText(v.getContext(), "SUCCESS", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void run() {
    android.util.Log.d(com.seniordesign.wolfpack.quizinator.Activities.HostGameActivity.TAG, "updateThisDevice: Runnable: update device in list fragment");
    com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment fragment = ((com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment) (getFragmentManager().findFragmentById(R.id.frag_list)));
    if (fragment != null) {
        fragment.updateThisDevice(device);
    }
}

@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    getActivity();
    android.support.test.espresso.Espresso.closeSoftKeyboard();
    if ((com.parse.ParseUser.getCurrentUser()) == null) {
        com.parse.ParseUser.logIn("TestUser", "1234");
    }
}

@java.lang.Override
public int getItemViewType(int position) {
    if ((mLuckResutList.get(position).get_id()) != null) {
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_NORMAL;
    }else {
        android.util.Log.i(com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TAG, "getItemViewType: type footer");
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_FOOTER;
    }
}

@com.squareup.otto.Subscribe
public void subscribe(today.gacha.android.services.GachaLocationService.CurrentLocationEvent event) {
    assertTrue(event.isSuccess());
    assertNotNull(event.getLocation());
    latch.countDown();
}

private boolean isTablet() {
    boolean isLarge = getResources().getBoolean(R.bool.isTablet);
    android.util.Log.d(com.example.android.musicstreamer.MainActivity.LOG_TAG, ("isLarge: " + isLarge));
    return isLarge;
}

private void randomImg(android.widget.ImageView imageView) {
    int num = mRandom.nextInt(6);
    if (num == 0) {
        num = 1;
    }
    mCount += num;
    imageView.setImageResource(mImgs[(num - 1)]);
}

protected void bleGattDisConnected(java.lang.String address) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_GATT_DISCONNECTED);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    sendBroadcast(intent);
    requestProcessed(address, RequestType.CONNECT_GATT, false);
}

@java.lang.Override
public void onBeginOfSpeech() {
    android.util.Log.d(com.lixl.waveform.WaveformViewModule.TAG, "evaluator begin");
    showTip("evaluator begin");
}

public void onClick(android.view.View v) {
    game.playTheGame(myMap.get(v));
    UpdateUIValues();
    ChangePlayer();
    CheckGameFinished();
}

public void glBufferSubData(int target, long offset, java.nio.ByteBuffer data) {
    com.jme3.renderer.android.AndroidGL.checkPosition(data);
    android.opengl.GLES20.glBufferSubData(target, ((int) (offset)), com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.os.Bundle bundle = getArguments();
    return inflater.inflate(R.layout.fragment_action, null);
}

@java.lang.Override
public texus.autozoneuae.fragments.ProductsFragment.ProductRecycleAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
    view.setBackgroundResource(mBackground);
    return new texus.autozoneuae.fragments.ProductsFragment.ProductRecycleAdapter.ViewHolder(view);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((fragment.getArguments()) == null) {
        fragment.getActivity().onBackPressed();
    }
    fragment.getActivity().onBackPressed();
}

@android.support.annotation.CheckResult
com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(A1 arg1, A2 arg2, A3 arg3, A4 arg4);

@java.lang.Override
public void onBitmapFailed(android.graphics.drawable.Drawable errorDrawable) {
    SearchActivity.protectedFromGarbageCollectorTargets.remove(this);
    onBitmapFailed.run();
}

@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(com.theah64.pigeon.receivers.LocationProviderListener.X, ("Location provider changed : " + intent));
    this.context = context;
    new com.theah64.pigeon.utils.PermissionUtils(context, this, null).begin();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResource());
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
}

@java.lang.Override
public void onScrollChange(android.view.View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
    if ((listener) != null) {
        listener.setRefresh((scrollY == 0));
    }
}

public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    mGoogleOAuthManager.onActivityResult(requestCode, resultCode, data);
}

@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.support.v4.app.Fragment fragment = ((android.support.v4.app.Fragment) (super.instantiateItem(container, position)));
    mIdMapper.put(position, fragment.getId());
    return fragment;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.master_detail);
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    android.util.Log.v("DEBUG", "MasterDetail.onCreate()");
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.category.base.BaseApplication.sApplicationContext = this;
    mRequestQueueInstance = com.android.volley.toolbox.Volley.newRequestQueue(getBaseContext());
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable(com.ratik.popularmovies.ui.MainActivity.MOVIES_DATA, movies);
}

private void initBitmap(int res) {
    mBitmap = android.graphics.BitmapFactory.decodeResource(getResources(), res);
    mBitWidth = mBitmap.getWidth();
    mBitHeight = mBitmap.getHeight();
}

@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    if ((badge) != null) {
        android.os.Bundle bundle = badge.saveState(indexInContainer);
        bundle.putParcelable("superstate", super.onSaveInstanceState());
        return bundle;
    }
    return super.onSaveInstanceState();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    initTheme();
    super.onCreate(savedInstanceState);
    initLayout();
    initToolbar();
}

public void saveHTML(android.view.View view) {
    cs246.ilearntracker.Student.getInstance().setHTMLData(HTMLData);
    java.lang.System.out.println(cs246.ilearntracker.Student.getInstance().getHTMLData());
    android.content.Intent intent = new android.content.Intent(this, cs246.ilearntracker.iLearnTracker.class);
    startActivity(intent);
}

public boolean onMenuItemClick(android.view.MenuItem item) {
    sortedByColor = true;
    updateList();
    return true;
}

@java.lang.Override
public com.yalantis.fitfilter.QuestionsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new com.yalantis.fitfilter.QuestionsAdapter.ViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false));
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    super.onTouchEvent(ev);
    android.util.Log.i("VerticalScrollView", ("onTouchEvent. action: " + (ev.getAction())));
    return true;
}

public void openFragmentNoHistory(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, fragment, tag);
    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    ft.commitAllowingStateLoss();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
}

@java.lang.Override
public void onPause() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this.context).unregisterReceiver(messageReceiver);
    this.myGridView.setAdapter(null);
    super.onPause();
}

@java.lang.Override
public void onListItemClick(android.widget.ListView listView, android.view.View view, int position, long id) {
    super.onListItemClick(listView, view, (position - 2), id);
    selectItem(position);
}

public static java.lang.String getDefaultSkin(java.lang.String targetName) {
    com.android.sdklib.IAndroidTarget target = com.motorola.studio.android.adt.SdkUtils.getTargetByName(targetName);
    return target != null ? target.getDefaultSkin() : "HVGA";
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.widget.ImageButton pause_button = ((android.widget.ImageButton) (findViewById(R.id.button_pause)));
    pause_button.setImageResource(R.drawable.resume);
    controller.stop();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.fly.firefly.AnalyticsApplication.sendEvent("Click", "btnUpdateProfile");
    android.util.Log.e("Clicked", "Ok");
    mValidator.validate();
    requestUpdateProfile();
    com.fly.firefly.utils.Utils.hideKeyboard(getActivity(), v);
}

@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    super.setPrimaryItem(container, position, object);
    com.example.xyzreader.ui.ArticleDetailFragment fragment = ((com.example.xyzreader.ui.ArticleDetailFragment) (object));
    if (fragment != null) {
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    com.bloodshare.bloodshareandroid.ui.login.MobileInputFragment mobileInputFragment = com.bloodshare.bloodshareandroid.ui.login.MobileInputFragment.newInstance();
    addFragment(mobileInputFragment, MobileInputFragment.TAG);
    startActivity(new android.content.Intent(this, com.bloodshare.bloodshareandroid.ui.main.MainActivity.class));
}

@java.lang.Override
public void onClick(android.view.View view) {
    textRequest(textUrl);
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.d(com.udacity.bakappies.fragment.FragmentStepDetail.TAG, ("onActivityCreated " + (step.getShortDescription())));
}

public void confirmationToDrinkOrdered(android.view.View view) {
    buildRecipe(drinkOrder);
    new com.example.lamperry.smartbar_r1.ConfirmationActivity.DrinkOrder().execute();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mobidev.com.notesfeed.User accessUser = ((mobidev.com.notesfeed.User) (savedInstanceState.getSerializable("currentUser")));
    java.lang.String userId = accessUser.getUserId();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startid) {
    fetchRssItemsFromResources();
    return START_NOT_STICKY;
}

@java.lang.Override
public void onResume() {
    android.widget.Toast.makeText(getApplicationContext(), "Resuming activity", Toast.LENGTH_SHORT).show();
    android.content.Intent serviceIntent = new android.content.Intent(getApplicationContext(), com.example.victor.lfm.MessageService.class);
    startService(serviceIntent);
    super.onResume();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        SendIMEI();
    } catch (java.lang.Exception e) {
        SendIMEIFailedDialog().show();
    }
    dialog.cancel();
}

@java.lang.Override
public void onConnectionSuspended(int i) {
    android.util.Log.d("GeofencesScanner.onConnectionSuspended", "xxx");
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.jady.retrofitclient.download.DownloadManager.getInstance().remove(downloadInfo);
    downloadInfoList.remove(position);
    notifyDataSetChanged();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    tasks.add(touchedTask);
    tasks.remove(touchedTask);
    touchedTask.setComplete(true);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}

private void setShareIntent(android.content.Intent shareIntent) {
    if (((mShareActionProvider) != null) && ((listViewScores.getItemAtPosition(0)) != null)) {
        mShareActionProvider.setShareIntent(shareIntent);
    }
}

@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    return (mController.onKeyUp(keyCode, event)) || (super.onKeyUp(keyCode, event));
}

@java.lang.Override
public void onStop() {
    android.util.Log.d(be.ugent.zeus.hydra.service.urgent.SimpleSessionCallback.TAG, "stop");
    ensureStop();
    if (registered) {
        context.unregisterReceiver(myNoisyAudioStreamReceiver);
        registered = false;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    speed += ((speed) == 4) ? 0 : -1;
    java.lang.String cmd = "" + (speed);
    this.sendCommand(cmd);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(POIpath.getText().toString().equals("")))
        checkPathField();
    else
        addNewPOI();
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    signUpForm = ((com.example.michael.tddc73project.SignUpForm) (findViewById(R.id.SignUpForm)));
    signUpForm.addEditableText("Extra TextField");
    setContentView(R.layout.activity_main);
}

