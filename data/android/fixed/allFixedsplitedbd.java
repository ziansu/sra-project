@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    super.onDismiss(dialogInterface);
    if (!(navigateSuccess)) {
        funnel.logCancel();
    }
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPeople = new java.util.ArrayList<>();
    mAdapter = new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, mPeople);
}

@java.lang.Override
public void onConnected() {
    microsoftBands.register();
    notificationManager = new org.md2k.microsoftband.notification.NotificationManager(this, microsoftBands.find());
    notificationManager.start();
    android.widget.Toast.makeText(this, "MicrosoftBand Started successfully", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    android.util.Log.i("AudioService", "start to play music");
    mp.start();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.mycompany.CMSBHelpdesk.Settings.class);
    sharedPreference.setString(this, "oneTS", "true");
    startActivity(intent);
}

@java.lang.Override
public void onError(@io.reactivex.annotations.NonNull
java.lang.Throwable e) {
}

@java.lang.Override
public void onGlobalLayout() {
    getViewTreeObserver().removeOnGlobalLayoutListener(this);
    mCameraPreviewContainer.setLayoutParams(new android.widget.LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, ((int) ((CAMERA_PREVIEW_ASPECT_RATIO) * (getWidth())))));
}

public com.brouding.simpledialog.SimpleDialog.Builder setGuideImage(@android.support.annotation.DrawableRes
int imageId) {
    setGuideImage(imageId, null);
    return this;
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
}

@java.lang.Override
public void onPress(int primaryCode) {
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    mUnbinder = butterknife.ButterKnife.bind(this);
    initData();
}

@java.lang.Override
public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
    try {
        session.setRepeatingRequest(mCaptureRequestBuilder.build(), null, null);
    } catch (android.hardware.camera2.CameraAccessException e) {
        e.printStackTrace();
    }
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
private static boolean isSystemAlertPermissionGranted(android.content.Context context) {
    return ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M)) || (android.provider.Settings.canDrawOverlays(context));
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    setUpDefaultCalligraphy();
}

public boolean updatePerformed(long dataTime) {
    return (com.tpb.brainfuck_app.Storage.lastUpdate) > dataTime;
}

private void onMissingDisplayNamesComplete(int mResultCount, java.lang.StringBuffer debugMessage) {
    if (debugMessage != null) {
        android.util.Log.w(Global.LOG_CONTEXT, ((mDebugPrefix) + debugMessage));
    }
}

public void toaster(java.lang.String message) {
    final java.lang.String toastMessage = message;
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(tcslab.syndesiapp.controllers.localization.WifiService.this, toastMessage, Toast.LENGTH_SHORT).show();
        }
    });
}

@android.support.annotation.CheckResult
public com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(java.lang.Object... args) {
    return super.invoke(args);
}

@java.lang.Override
public void onPoiClick(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
    android.widget.Toast.makeText(mContext, pointOfInterest.name, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onPageSelected(int position) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    activity.clickOnViewItem(id);
}

private boolean isStoragePermissionGiven() {
    boolean tmp;
    tmp = (android.support.v4.content.ContextCompat.checkSelfPermission(this.getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
    return tmp;
}

@java.lang.Override
public void onStart() {
    super.onStart();
    setOverlayFragment();
}

@java.lang.Override
public void onVerificationFailed(com.google.firebase.FirebaseException e) {
    android.util.Log.w(TAG, "onVerificationFailed", e);
    if (e instanceof com.google.firebase.auth.FirebaseAuthInvalidCredentialsException) {
    }else
        if (e instanceof com.google.firebase.FirebaseTooManyRequestsException) {
        }
    
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.d("VideoPlayer", "Completed");
    mp.seekTo(0);
    videoUpdateListener.onComplete();
}

public void resetObject(final com.mozidev.testopengl.Base3DObject object) {
    android.util.Log.d(com.mozidev.testopengl.MyGLRenderer.TAG, "resetObject");
    if (object != null) {
        m3DObject = new com.mozidev.testopengl.Base3DObject(object);
        createFigure();
        createMarkers();
    }
}

@java.lang.Override
public int getItemCount() {
    return com.matthew.gymapp.SessionStore.getSize();
}

protected final android.app.PendingIntent createPendingIntent(short notificationId, java.lang.String action, android.os.Bundle data, int flags) {
    return module.createPendingIntent(this, notificationId, action, data, flags);
}

public boolean onOptionsItemSelected(android.view.MenuItem item) {
    finish();
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    nowPlayingIntent = new android.content.Intent(this, com.example.android.musique.NowPlaying.class);
    startActivity(nowPlayingIntent);
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    _googleMap = googleMap;
    _googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    _googleMap.setIndoorEnabled(false);
    updateMap();
}

@java.lang.Override
public boolean onTouchEvent(@android.support.annotation.NonNull
android.view.MotionEvent event) {
    mDetector.onTouchEvent(event);
    return true;
}

public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.childstudios.promunchkincounter.player getplayer = players.get(position);
    playerScreen(view, getplayer, position);
}

public static twitter4j.Twitter getTwitterInstance(final android.content.Context context, final long accountId, final boolean includeEntities) {
    return org.mariotaku.twidere.util.Utils.getTwitterInstance(context, accountId, includeEntities, true);
}

@javax.annotation.Nonnull
public static java.lang.String encrypt(@javax.annotation.Nonnull
java.lang.String message, @javax.annotation.Nonnull
java.lang.String salt) {
    java.lang.String result = new java.lang.String(android.util.Base64.encode(ua.boberproduction.bbr.util.Encryption.xor(message, salt).getBytes(), 0));
    return result;
}

private void setPreferenceForRevenueItem(android.widget.CheckBox revenuSourceCheckbox, int revenueSourceId) {
    com.android.ssm.ssm.models.RevenueSource source = com.android.ssm.ssm.models.RevenueSource.findById(com.android.ssm.ssm.models.RevenueSource.class, revenueSourceId);
    if (source != null) {
        revenuSourceCheckbox.setChecked(true);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.pquach.vocabularynote.Category.delete(getActivity(), mCategory);
    updateSpinner();
}

public void handleMessage(android.os.Message msg) {
    if ((msg.what) == 0) {
        try {
            builder.show();
            ScrollingActivity.mAdapter.notifyDataSetChanged();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d("memelol", "received something");
}

public void registerAuthenticationListener(com.concavenp.artistrymuse.services.UserAuthenticationService.OnAuthenticationListener listener) {
    mAuthListener = listener;
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((marker.getSnippet()) != null) {
        com.vanshil.checkpoint.SelectedActivity.start(this, businesses.get(java.lang.Integer.parseInt(marker.getSnippet())));
    }
    return false;
}

@java.lang.Override
public void onSwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] dismissedItems) {
    if ((dismissedItems != null) && ((dismissedItems.length) > 0)) {
        handleAcceptDecline(false, dismissedItems[0]);
    }
}

@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    int position = getAdapterPosition();
}

@java.lang.Override
public void run() {
    com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment fragment = ((com.seniordesign.wolfpack.quizinator.WifiDirect.DeviceListFragment) (getFragmentManager().findFragmentById(R.id.frag_list)));
    if ((fragment != null) && (device != null)) {
        fragment.updateThisDevice(device);
    }
}

@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    if ((com.parse.ParseUser.getCurrentUser()) == null) {
        com.parse.ParseUser.logIn("TestUser", "1234");
    }
    getActivity();
    android.support.test.espresso.Espresso.closeSoftKeyboard();
}

@java.lang.Override
public int getItemViewType(int position) {
    if ((mLuckResutList.get(position).get_id()) != null) {
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_NORMAL;
    }else {
        return com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TYPE_FOOTER;
    }
}

@com.squareup.otto.Subscribe
public void subscribe(today.gacha.android.services.GachaLocationService.CurrentLocationEvent event) {
    assertTrue(event.isSuccess());
    assertNotNull(event.getData());
    latch.countDown();
}

private boolean isTablet() {
    return getResources().getBoolean(R.bool.isTablet);
}

private void randomImg(android.widget.ImageView imageView) {
    int num = mRandom.nextInt(6);
    mCount += num + 1;
    imageView.setImageResource(mImgs[num]);
}

public void bleGattDisConnected(java.lang.String address) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_GATT_DISCONNECTED);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    sendBroadcast(intent);
    requestProcessed(address, RequestType.CONNECT_GATT, false);
}

@java.lang.Override
public void onBeginOfSpeech() {
    android.util.Log.d(com.lixl.waveform.WaveformViewModule.TAG, "evaluator begin");
}

public void onClick(android.view.View v) {
    game.playTheGame(myMap.get(v));
    UpdateUIValues();
    CheckGameFinished();
}

public void glBufferSubData(int target, long offset, java.nio.ByteBuffer data) {
    android.opengl.GLES20.glBufferSubData(target, ((int) (offset)), com.jme3.renderer.android.AndroidGL.getLimitBytes(data), data);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_action, null);
}

@java.lang.Override
public texus.autozoneuae.fragments.ProductsFragment.ProductRecycleAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
    return new texus.autozoneuae.fragments.ProductsFragment.ProductRecycleAdapter.ViewHolder(view);
}

@java.lang.Override
public void onClick(android.view.View v) {
    fragment.getActivity().onBackPressed();
}

@android.support.annotation.CheckResult
public com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(A1 arg1, A2 arg2) {
    return super.invoke(arg1, arg2);
}

@java.lang.Override
public void onBitmapFailed(android.graphics.drawable.Drawable errorDrawable) {
    onBitmapFailed.run();
}

@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    this.context = context;
    new com.theah64.pigeon.utils.PermissionUtils(context, this, null).begin();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResource());
}

@java.lang.Override
public void onScrollChange(android.view.View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
    listener.setRefresh((scrollY == 0));
}

private void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    mGoogleOAuthManager.onActivityResult(requestCode, resultCode, data);
}

@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.support.v4.app.Fragment fragment = ((android.support.v4.app.Fragment) (super.instantiateItem(container, position)));
    mIdMapper.put(position, fragment);
    return fragment;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.master_detail);
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    mRequestQueueInstance = com.android.volley.toolbox.Volley.newRequestQueue(getBaseContext());
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putSerializable(com.ratik.popularmovies.ui.MainActivity.MOVIES_DATA, movies);
}

private void initBitmap(int res) {
    if (res <= 0)
        return ;
    
    mBitmap = android.graphics.BitmapFactory.decodeResource(getResources(), res);
    mBitWidth = mBitmap.getWidth();
    mBitHeight = mBitmap.getHeight();
}

@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    if ((badge) != null) {
        android.os.Bundle bundle = saveState();
        bundle.putParcelable("superstate", super.onSaveInstanceState());
        return bundle;
    }
    return super.onSaveInstanceState();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initTheme();
    initLayout();
    initToolbar();
}

public void saveHTML(android.view.View view) {
    cs246.ilearntracker.Student.getInstance().setHTMLData(HTMLData);
    android.content.Intent intent = new android.content.Intent(this, cs246.ilearntracker.iLearnTracker.class);
    startActivity(intent);
}

public boolean onMenuItemClick(android.view.MenuItem item) {
    sortedByColor = false;
    updateList();
    return true;
}

@java.lang.Override
public com.yalantis.fitfilter.QuestionsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new com.yalantis.fitfilter.QuestionsAdapter.ViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false));
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    super.onTouchEvent(ev);
    return true;
}

public void openFragmentNoHistory(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, fragment, tag);
    ft.commitAllowingStateLoss();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.support.v4.content.LocalBroadcastManager.getInstance(this.context).unregisterReceiver(messageReceiver);
    this.myGridView.setAdapter(null);
}

@java.lang.Override
public void onListItemClick(android.widget.ListView listView, android.view.View view, int position, long id) {
    super.onListItemClick(listView, view, (position - 2), id);
}

public static java.lang.String getDefaultSkin(java.lang.String targetName) {
    com.android.sdklib.IAndroidTarget target = com.motorola.studio.android.adt.SdkUtils.getTargetByName(targetName);
    target.getDefaultSkin().getName();
    return target != null ? target.getDefaultSkin().getName() : "HVGA";
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    controller.stop();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.fly.firefly.AnalyticsApplication.sendEvent("Click", "btnUpdateProfile");
    android.util.Log.e("Clicked", "Ok");
    mValidator.validate();
    com.fly.firefly.utils.Utils.hideKeyboard(getActivity(), v);
}

@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    super.setPrimaryItem(container, position, object);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    com.bloodshare.bloodshareandroid.ui.login.MobileInputFragment mobileInputFragment = com.bloodshare.bloodshareandroid.ui.login.MobileInputFragment.newInstance();
    addFragment(mobileInputFragment, MobileInputFragment.TAG);
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
}

public void confirmationToDrinkOrdered(android.view.View view) {
    new com.example.lamperry.smartbar_r1.ConfirmationActivity.DrinkOrder().execute();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startid) {
    fetchRssItemsFromResources();
    this.startid = startid;
    return START_NOT_STICKY;
}

@java.lang.Override
public void onResume() {
    super.onResume();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    if (!(SendIMEI())) {
        SendIMEIFailedDialog().show();
    }
    dialog.cancel();
}

@java.lang.Override
public void onConnectionSuspended(int i) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.jady.retrofitclient.download.DownloadManager.getInstance().remove(downloadInfo);
    downloadInfoList.remove(downloadInfo);
    notifyDataSetChanged();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    touchedTask.setComplete(true);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}

private boolean setShareIntent(android.content.Intent shareIntent) {
    if ((mShareActionProvider) != null) {
        mShareActionProvider.setShareIntent(shareIntent);
        return true;
    }
    return false;
}

@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((mController) == null) {
        return false;
    }
    return (mController.onKeyUp(keyCode, event)) || (super.onKeyUp(keyCode, event));
}

@java.lang.Override
public void onStop() {
    ensureStop();
    if (registered) {
        context.unregisterReceiver(myNoisyAudioStreamReceiver);
        registered = false;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    speed += ((speed) == 0) ? 0 : -1;
    java.lang.String cmd = "" + (speed);
    this.sendCommand(cmd);
}

@java.lang.Override
public void onClick(android.view.View v) {
    addNewPOI();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    signUpForm = ((com.example.michael.tddc73project.SignUpForm) (findViewById(R.id.SignUpForm)));
    signUpForm.addEditableText("Extra TextField");
}

