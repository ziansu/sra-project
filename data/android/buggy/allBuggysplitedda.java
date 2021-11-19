@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        scheduleItems = getArguments().getParcelableArrayList(com.digzdigital.hebronradio.fragment.ScheduleDetails.ARG_PARAM1);
    }
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.content.Intent intent = new android.content.Intent(this, com.example.ksusha.tetris.GameOver.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    this.finish();
    startActivity(intent);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_compose_message, menu);
    if ((Build.VERSION.SDK_INT) < 11) {
        android.view.MenuItem copyUrl = menu.findItem(R.id.menu_copy_url);
        copyUrl.setVisible(false);
    }
    return true;
}

public void Start() {
    android.util.Log.d("SOUND", "START");
    isRecording = true;
}

@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    android.util.Log.d("DEBUG_TAG", "On SingleTapConfirmed OscMode Event!");
    mOscilloscopeFragmentController.butOscModeOnSingleTapConfirmed();
    butOscMode.setBackgroundColor(2201331);
    return super.onSingleTapConfirmed(e);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.atomhacks.Main.setLogin(true);
    android.content.Intent projectList = new android.content.Intent(this, com.example.atomhacks.Main.class);
    startActivity(projectList);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCamera.takePicture(null, null, jpegCallBack);
    if ((firstPicTaken) == false) {
        zeroAzimuth = azimuth;
        firstPicTaken = true;
    }
    mCamera.startPreview();
}

private void registerEmailPw(android.view.View view) {
    android.content.Intent regEmail = new android.content.Intent(this, com.example.friends.fitfriend.RegisterWithEmailAndPwActivity.class);
    startActivity(regEmail);
    this.finish();
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    try {
        play();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    java.util.UUID taskId = ((java.util.UUID) (getIntent().getSerializableExtra(com.codepath.preassignment.todoapp.activity.ToDoListActivity.EXTRA_TASK_ID)));
    if (taskId != null) {
        return com.codepath.preassignment.todoapp.fragments.ToDoListFragment.newInstance(taskId);
    }
    return com.codepath.preassignment.todoapp.fragments.ToDoListFragment.newInstance();
}

protected void closeApp(android.view.View view) {
    finish();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    setContentView(R.layout.activity_geofence);
}

public com.android.volley.RequestQueue getRequestQueue() {
    if ((mRequestQueue) == null) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.joelimyx.flipvicefeed.classes.VolleySingleton.mCtx.getApplicationContext());
    }
    return mRequestQueue;
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    if (mp == (mPlayer)) {
        mPlayer.start();
    }
}

public void add(com.example.felipe.androidchat.entities.ChatMessage msg) {
    if (!(alreadyInAdapter(msg))) {
        this.chatMessages.add(msg);
        this.notifyDataSetChanged();
    }
}

@java.lang.Override
public void run() {
    android.util.Log.i("HIPSTER", "LOGIN SUCCESSFUL");
    android.content.Intent intent = new android.content.Intent(this, net.ilexiconn.hipster.MainActivity.class);
    intent.putExtra("magister", magister);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.assistant_check :
            {
                checkAccount.setEnabled(false);
                accountCreator.isAccountActivated();
                break;
            }
    }
}

@java.lang.Override
protected void setupUI(android.view.View rootLayout) {
    rootLayout.findViewById(R.id.btnExportForProject).setOnClickListener(this);
    exportFragment = addChild(R.id.frgExportOnTabContainer, new uk.ac.ucl.excites.sapelli.collector.fragments.ExportFragment(getOwner().getCurrentProject(true)));
}

@java.lang.Override
public void onCategoryIncomeClick(com.zhan.budget.Model.Category category) {
    android.widget.Toast.makeText(getApplicationContext(), ("clicked on income category : " + (category.getName())), Toast.LENGTH_SHORT).show();
    selectedIncomeCategory = category;
}

public void disable() {
    android.util.Log.d("Reverb", "Disabled Reverb effect");
    if ((effect) != null) {
        effect.setEnabled(false);
    }
    isActive = false;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putParcelableArrayList("movies", movies);
    super.onSaveInstanceState(outState);
}

public void launch(android.view.View v, java.lang.String uid) {
    android.content.Intent login = new android.content.Intent(this, com.cultivate.juniordesign.cultivate.LoginActivity.class);
    login.putExtra("uid", uid);
    startActivity(login);
}

@java.lang.Override
public void onGeolocationPermissionsShowPrompt(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
    callback.invoke(origin, true, false);
}

@java.lang.Override
public void onMapReady(final com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.i(net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.TAG, "GoogleMap is ready");
    setupGoogleMaps(googleMap);
    net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.CountryIdentifier countryIdentifier = new net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.CountryIdentifier();
    countryIdentifier.countryId = 1;
    countryIdentifier.year = 2000;
    new net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.GetCountryDetailsAsyncTask().execute(countryIdentifier);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View viewClicked, int position, long id) {
    edu.kit.pse.client.goapp.datamodels.User clickedUser = users.get(position);
    java.lang.String message = clickedUser.getName();
    edu.kit.pse.client.goapp.activity.GroupMemberActivity.start(this);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    callback.invoke(okTitle_f);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add :
            add();
            break;
        case R.id.pushUpdate :
            pushUpdate();
            break;
    }
    return super.onOptionsItemSelected(item);
}

public void onClick(android.view.View v) {
    dbHandler.deleteItem(buttonName);
    android.util.Log.d("android:HELP", buttonName);
    linearLayout.removeView(button);
}

public void getAllUsers() {
    android.util.Log.i(LOG_TAG, "Requesting all users");
    if (connected) {
        out.println("getAllUsers");
        return ;
    }else {
        android.util.Log.e(LOG_TAG, "getAllUsers() failed!");
    }
}

public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    printToastDialog(bl.Attend(appData.get_userToken(), currEvent.getId(), isChecked));
    appData.set_userEventList(bl.getUserEvents(appData.get_userToken()));
}

@java.lang.Override
public void showDetails(android.net.wifi.p2p.WifiP2pDevice device) {
    android.util.Log.d("details", "details-wifi-direct");
    com.swipetogive.wifidirect.DeviceDetailFragment fragment = ((com.swipetogive.wifidirect.DeviceDetailFragment) (getFragmentManager().findFragmentById(R.id.frag_detail)));
    fragment.showDetails(device);
}

@java.lang.Override
public void onClick(android.view.View v) {
    MainActivity.tm.deleteCompletedTask(cTaskList);
    cm.startTaskMenu();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    mediaSessionConn = buildMediaSession();
    dataSourceFactory = buildDataSource();
    extractorFactory = buildExtractorFactory();
    playList = new java.util.ArrayList<>();
    initPlayListRemoveObserver();
    return START_STICKY;
}

public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_contact_designer);
    getTitleFromIntent(this.getIntent());
    initActionBar();
    initTabHost();
    initListView();
}

@java.lang.Override
public void showNotificationCallback(org.adblockplus.libadblockplus.Notification notification) {
    android.util.Log.d(org.adblockplus.libadblockplus.tests.NotificationTest.TAG, ((((this) + " received [") + notification) + "]"));
    retValue = notification;
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.util.Log.d(getClass().toString(), "Failed to fetch trailers");
    reviewTextView.setText(getResources().getString(R.string.no_trailers));
    trailerExpandButton.setVisibility(View.INVISIBLE);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (com.fashare.activitytracker.AccessibilityUtil.checkAccessibility(this)) {
        com.fashare.activitytracker.Tile.instance.onClick();
        finish();
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.guanyf.appmanager.Tab1();
        case 1 :
            return new com.guanyf.appmanager.Tab2();
        case 2 :
            return new com.guanyf.appmanager.Tab3();
    }
    return null;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    com.CMPUT301W15T02.teamtoapp.Model.Claim claim = adapter.getItem(position);
    claimListController.removeClaim(claim);
    if ((mSelectedItems.size()) > 0) {
        setUpFilteredAdapter();
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCropImageView.getCroppedImageAsync();
    ((com.comp.iitb.vialogue.activity.CropMainActivity) (getActivity())).done(currentBitmap);
}

private void setupGridView(com.tonykazanjian.codenamescompanion.LinearLayoutAbsListView gridPanel, com.tonykazanjian.codenamescompanion.main.GamePresenter gamePresenter, android.widget.GridView gridView) {
    gridPanel.setOnDragListener(new com.tonykazanjian.codenamescompanion.listeners.ViewDragListener(gamePresenter));
    gridPanel.setAbsListView(gridView);
    gridView.setOnItemLongClickListener(new com.tonykazanjian.codenamescompanion.listeners.GridItemLongClickListener(gamePresenter));
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    try {
        mCamera.setPreviewDisplay(holder);
        mCamera.startPreview();
    } catch (java.io.IOException e) {
    }
}

@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        login(user.getEmail(), user.getDisplayName());
        progressDialog.dismiss();
    }
}

public static void validateMovieCursor(java.lang.String error, android.database.Cursor valueCursor, android.content.ContentValues expectedValues) {
    junit.framework.Assert.assertTrue(("Cursor should have records" + error), valueCursor.moveToFirst());
    com.franktan.popularmovies.data.DataTestUtilities.validateMovieRecordUnderCursor(error, valueCursor, expectedValues);
    valueCursor.close();
}

@java.lang.Override
public void setImageResource(@android.support.annotation.DrawableRes
int resId) {
    super.setImageResource(resId);
    if ((mImageHelper) != null) {
        mImageHelper.applySkin();
    }
}

@java.lang.Override
public void onPageScrollStateChanged(int state) {
    if (state == (android.support.v4.view.ViewPager.SCROLL_STATE_SETTLING))
        swipeSave = true;
    
}

@java.lang.Override
public void run() {
    violationSyncHandler.post(violationSync);
    android.util.Log.d("ViolationSyncTask:", "started");
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parentView, android.view.View selectedItemView, int position, long id) {
    mGradientSource = position;
    if ((mTrackSegments.size()) != 0) {
        mCustomMapFragment.plotRoute(mTrackSegments, mGradientSource);
    }
}

public static nju.com.piece.database.helpers.PeriodDBHelper instance(android.content.Context context) {
    return new nju.com.piece.database.helpers.PeriodDBHelper(context, nju.com.piece.database.helpers.PeriodDBHelper.DATABASE_NAME, null, DATABASE_VERSION);
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "relay off success");
    updateLightBulb(false);
    done();
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
    android.widget.Toast.makeText(mContext, "onError()!", Toast.LENGTH_SHORT).show();
    e.printStackTrace();
    mIBlibiliFragment.hideProgressbar();
    mIBlibiliFragment.showError(e.getMessage());
}

void startVector(android.content.Context mContext, java.lang.String mimetype, java.lang.String vectorData, java.lang.String vectorName);

private void showMainActivity() {
    android.content.Intent mainIntent = new android.content.Intent(getApplicationContext(), com.farfromsober.ffs.activities.MainActivity.class);
    startActivity(mainIntent);
    this.finish();
}

public void switchActivity() {
    android.util.Log.d("alex", "aex");
    android.content.Intent intent = new android.content.Intent(this, com.echopen.asso.echopen.ListImagesActivity.class);
    startActivity(intent);
}

public void enter(@android.support.annotation.NonNull
android.widget.ImageView from, boolean withAnimation) {
    mImageFrom = from;
    mIsOpen = true;
    mAnimator.init(from, this);
    setImageDrawable(from.getDrawable());
    mAnimator.enter(withAnimation);
}

public static void setEnv(final android.content.Context p) {
    net.sourceforge.clonekeenplus.Settings.SdcardAppPath.get().setEnvInternal(p);
}

@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot snapshot) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onChildRemoved", "child", snapshot.getValue());
}

private java.lang.String getSampleType(java.lang.String SAK) {
    java.lang.String unknownTypeString = "Unknown type";
    android.util.Log.e(palarax.e_key_card.NFC_Tag_Tech.nfcATag.TAG, "getting sample");
    return palarax.e_key_card.NFC_Tag_Tech.SampleTagAttributes.lookup(SAK, unknownTypeString);
}

void e(java.lang.String message) {
    if (should(com.otaliastudios.zoom.ZoomLogger.LEVEL_ERROR)) {
        android.util.Log.w(mTag, message);
        com.otaliastudios.zoom.ZoomLogger.lastMessage = message;
        com.otaliastudios.zoom.ZoomLogger.lastTag = mTag;
    }
}

public void spinWheel(android.view.View v) {
    v.setEnabled(false);
    java.util.Random random = new java.util.Random();
    dialer.setEnabled(false);
    dialer.post(new com.concon.talkabout.talkabout.SpinWheelGameplay.FlingRunnable(random.nextInt(1500), v));
}

@java.lang.Override
public com.podgpavel.yal_task1.Adapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemLayoutView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_layout, null);
    com.podgpavel.yal_task1.Adapter.ViewHolder viewHolder = new com.podgpavel.yal_task1.Adapter.ViewHolder(itemLayoutView);
    return viewHolder;
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
}

@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    android.util.Log.d("m", "=====================camera move=====================");
    java.lang.System.out.println(getBoundedMarkers(markerArray));
}

@java.lang.Override
public void onDestroyActionMode(android.support.v7.view.ActionMode mode) {
    enableSelectionMode(false);
    getView().findViewById(R.id.DescriptionText).setVisibility(View.GONE);
    runSelection(false);
    listAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.support.v13.app.FragmentCompat.requestPermissions(parent, new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.INTERNET }, com.tapifolti.emotiondetection.EmotionDetectionFragment.REQUEST_APP_PERMISSION);
}

@java.lang.Override
public void onShowCollaborators(com.box.androidsdk.content.models.BoxIteratorCollaborations collaborations) {
    android.content.Intent collabsIntent = com.box.androidsdk.share.activities.BoxCollaborationsActivity.getLaunchIntent(this, ((com.box.androidsdk.content.models.BoxFolder) (mShareItem)), mSession);
    startActivity(collabsIntent);
}

@java.lang.Override
public void onCustomerRetrieved(@android.support.annotation.NonNull
com.stripe.android.model.Customer customer) {
    mCustomer = customer;
    removeError();
    createListFromCustomerSources();
}

@java.lang.Override
public void messageReceived(de.mhid.android.timerecordingforpebble.PebbleMessenger msgr, com.getpebble.android.kit.util.PebbleDictionary dict) {
    evtRequestStatus(firstTimelineUpdate, true, false);
    firstTimelineUpdate = false;
}

private void onLocation(android.location.Location location) {
    for (int i = 0; i < (_locationListeners.size()); i++) {
        _locationListeners.get(i).onLocation(location);
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    mContext.startActivity(new android.content.Intent("com.android.settings.POWERMANAGER_SETTINGS").addFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK))));
    this.dismiss();
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    android.util.Log.d("Animate", ((animation.getAnimatedValue()) + ""));
    animateAlpha = 255 - ((java.lang.Integer) (animation.getAnimatedValue()));
    invalidate();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapter, android.view.View v, int position) {
    android.content.Intent intent = new android.content.Intent(this, com.kingsley.android.kupsfood.activities.FoodDescriptionActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void start(android.app.Activity activity, com.auth0.identity.IdentityProviderRequest request, com.auth0.core.Application application) {
    checkPermissions(activity, request.getServiceName());
}

private void checkQuestionTwoAnswers() {
    android.widget.RadioButton radioButtonBruce = ((android.widget.RadioButton) (findViewById(R.id.radio_bruce)));
    boolean isRadioButtonBruceChecked = radioButtonBruce.isChecked();
    if (isRadioButtonBruceChecked) {
        correctAnswers += 1;
    }
}

@java.lang.Override
public void setTTYMode(int ttyMode, android.os.Message onComplete) {
    super.setTTYMode(ttyMode, onComplete);
    mCT.setTtyMode(ttyMode);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "onConnected");
    refreshLocationAndWeather();
}

@com.squareup.otto.Subscribe
public void onAuthFail(cz.kovar.petr.homevoice.bus.events.AuthEvent.Fail event) {
    android.util.Log.v(cz.kovar.petr.homevoice.frontend.FragmentPlan.LOG_TAG, "Auth Failed!");
    clearButtons();
}

@java.lang.Override
public void onClick(android.view.View v) {
    int pos = getAdapterPosition();
    com.android.summer.csula.foodvoter.yelpApi.models.Business business = mChoiceData.get(pos).getBusiness();
    mOnClickListener.onListItemClick(business);
}

public org.osmdroid.views.overlay.OverlayItem putMarkerAt(org.osmdroid.util.GeoPoint p, android.graphics.drawable.Drawable markerDrawable) {
    org.osmdroid.views.overlay.OverlayItem markerItem = makeMarker(p, markerDrawable);
    markersOverlay.addItem(markerItem);
    map.invalidate();
    return markerItem;
}

@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, ir.rasen.charsoo.controller.image_loader.core.assist.FailReason failReason) {
    if ((imageType == (Image_M.ImageType.BUSINESS)) && (imageSize == 1))
        imageView.setImageBitmap(android.graphics.BitmapFactory.decodeResource(context.getResources(), R.drawable.default_user_image));
    
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.spilgames.spilsdk.utils.permissions.dialog.MaterialDialog materialDialog, @android.support.annotation.NonNull
com.spilgames.spilsdk.utils.permissions.dialog.internal.DialogAction dialogAction) {
    com.spilgames.spilsdk.SpilSdk.getInstance(context).getSocialCallbacks().RequestLogin();
    materialDialog.dismiss();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getQiushiData();
    mAdapter = new com.hp.qiushibaike.adapter.QiushiAdapter(mQiushiBriefs);
}

public static boolean doesDeviceHaveSecuritySetup(org.apache.cordova.devicesecurity.Context context) {
    android.app.KeyguardManager keyguardManager = ((android.app.KeyguardManager) (context.getSystemService(Context.KEYGUARD_SERVICE)));
    return keyguardManager.isKeyguardSecure();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent captureImage = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    android.net.Uri uri = android.net.Uri.fromFile(mPhotoFile);
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE), com.example.suren.criminalintent.CrimeFragment.REQUEST_PHOTO);
}

@java.lang.Override
protected void onBeforeClusterItemRendered(org.ecomap.android.app.Problem problem, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    markerOptions.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(problem.res_id)).title(problem.getTitle());
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.view.View childView = new android.view.View(getActivity());
    childView.setBackgroundColor(colorItems[new java.util.Random().nextInt(colorItems.length)]);
    layout.addView(childView);
}

@java.lang.Override
public void onRebind(android.content.Intent intent) {
    android.util.Log.v(unipd.dei.ESP1415.falldetector.FallService.LOG_TAG, "in onRebind");
    super.onRebind(intent);
}

public org.openobservatory.measurement_kit.android.IntentRouter emit_intent(java.lang.String event, android.content.Intent intent) {
    lbm.sendBroadcast(intent);
    return this;
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.util.Log.i("Inside onLoaderReset", "Swapped the Cursor");
    mMovieCursorAdapter.notifyDataSetChanged();
    mMovieCursorAdapter.swapCursor(null);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mMapFragment.showAllFloors();
    mMapFragment.showMarkersForSpecificFloor(1);
}

public static void setSeen(android.content.Context c, java.lang.String key) {
    c.getSharedPreferences("Kantidroid", Context.MODE_PRIVATE).edit().putBoolean("key", true).commit();
}

@java.lang.Override
public void onClick(android.view.View v) {
    location_data.push_data();
    android.content.Intent intent = new android.content.Intent(this, tcss450.gps_app_phase_i.MovementData.class);
    startActivity(intent);
}

public static void startCrashlytics(android.content.Context context) {
    if (!(com.musenkishi.wally.BuildConfig.DEBUG)) {
        com.crashlytics.android.Crashlytics.start(context);
    }
}

@java.lang.Override
public void onDownloadCompleted() {
    android.util.Log.d(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.TAG, "Download Completed");
    if (!(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.isImage)) {
        mVideoView.resume();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    knowSwipe(prefs, knowToCContainer);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.spatialdev.osm.model.OSMNode node = osmMap.addNode();
    toggleNodeMode();
    node.select();
    identifyOSMFeature(node);
}

public void setRecyclerViewAdapter() {
    adapter = new ambiesoft.start.utility.RecyclerViewAdapter(ambiesoft.start.fragment.HomeFragment.filteredPerformances, getContext());
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.app.kent.volume.Main.TAG, ((("addDynamicButton onClick(): " + (v.getId())) + "name = ") + buttonName));
    customSetVolume(buttonName);
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    java.lang.String downloadUrl = taskSnapshot.getDownloadUrl().toString();
    android.util.Log.i(com.google.codeu.chatme.presenter.CreateGroupPresenter.TAG, ("uploadGroupPicture:success:downloadUrl " + downloadUrl));
    updateGroupPhotoUrl(downloadUrl, conversationId);
    view.openMessageActivity();
}

