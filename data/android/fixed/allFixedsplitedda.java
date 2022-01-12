@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        filePath = getArguments().getString(com.digzdigital.hebronradio.fragment.ScheduleDetails.ARG_PARAM1);
    }
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_compose_message, menu);
    return true;
}

public void Start() {
    isRecording = true;
}

@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    android.util.Log.d("DEBUG_TAG", "On SingleTapConfirmed OscMode Event!");
    mOscilloscopeFragmentController.butOscModeOnSingleTapConfirmed();
    return super.onSingleTapConfirmed(e);
}

@java.lang.Override
public void onClick(android.view.View v) {
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
}

public void registerEmailPw(android.view.View view) {
    android.content.Intent regEmail = new android.content.Intent(this, com.example.friends.fitfriend.RegisterWithEmailAndPwActivity.class);
    startActivity(regEmail);
    this.finish();
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
}

@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    taskId = ((java.util.UUID) (getIntent().getSerializableExtra(com.codepath.preassignment.todoapp.activity.ToDoListActivity.EXTRA_TASK_ID)));
    if ((taskId) != null) {
        return com.codepath.preassignment.todoapp.fragments.ToDoListFragment.newInstance(taskId);
    }
    return com.codepath.preassignment.todoapp.fragments.ToDoListFragment.newInstance();
}

public void closeApp(android.view.View view) {
    finish();
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_geofence);
}

private com.android.volley.RequestQueue getRequestQueue() {
    if ((mRequestQueue) == null) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.joelimyx.flipvicefeed.classes.VolleySingleton.mCtx.getApplicationContext());
    }
    return mRequestQueue;
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mPlayer.start();
}

public void add(com.example.felipe.androidchat.entities.ChatMessage msg) {
    this.chatMessages.add(msg);
    this.notifyDataSetChanged();
}

@java.lang.Override
public void run() {
    android.content.Intent intent = new android.content.Intent(this, net.ilexiconn.hipster.MainActivity.class);
    intent.putExtra("magister", magister);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    int id = v.getId();
    if (id == (R.id.assistant_check)) {
        checkAccount.setEnabled(false);
        accountCreator.isAccountActivated();
    }
}

@java.lang.Override
protected void setupUI(android.view.View rootLayout) {
    rootLayout.findViewById(R.id.btnExportForProject).setOnClickListener(this);
    exportFragment = addChild(R.id.frgExportOnTabContainer, new uk.ac.ucl.excites.sapelli.collector.fragments.ExportFragment(getOwner().getCurrentProject(false)));
}

@java.lang.Override
public void onCategoryIncomeClick(com.zhan.budget.Model.Category category) {
    selectedIncomeCategory = category;
}

public void disable() {
    if ((effect) != null) {
        effect.setEnabled(false);
    }
    isActive = false;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelableArrayList("movies", movies);
}

public void launch(android.view.View v) {
    android.content.Intent login = new android.content.Intent(this, com.cultivate.juniordesign.cultivate.LoginActivity.class);
    startActivity(login);
}

@java.lang.Override
public void onGeolocationPermissionsShowPrompt(java.lang.String origin, android.webkit.GeolocationPermissions.Callback callback) {
    callback.invoke(origin, true, false);
    super.onGeolocationPermissionsShowPrompt(origin, callback);
}

@java.lang.Override
public void onMapReady(final com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.i(net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.TAG, "GoogleMap is ready");
    setupGoogleMaps(googleMap);
    new net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.GetCountryDetailsAsyncTask().execute(0);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View viewClicked, int position, long id) {
    edu.kit.pse.client.goapp.datamodels.User clickedUser = users.get(position);
    java.lang.String message = clickedUser.getName();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (callback != null) {
        callback.invoke(okTitle_f);
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add :
            add();
            break;
    }
    return super.onOptionsItemSelected(item);
}

public void onClick(android.view.View v) {
    dbHandler.deleteItem(buttonName);
    linearLayout.removeView(button);
}

public void getAllUsers() {
    android.util.Log.i(LOG_TAG, "Requesting all users");
    if (connected) {
        out.println("getAllUsers");
        out.println("getAllUsers");
    }else {
        android.util.Log.e(LOG_TAG, "getAllUsers() failed!");
    }
}

public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    appData.set_userEventList(bl.getUserEvents(appData.get_userToken()));
    if (isChecked) {
    }else {
    }
}

@java.lang.Override
public void showDetails(android.net.wifi.p2p.WifiP2pDevice device) {
    com.swipetogive.wifidirect.DeviceDetailFragment fragment = ((com.swipetogive.wifidirect.DeviceDetailFragment) (getFragmentManager().findFragmentById(R.id.frag_detail)));
    fragment.showDetails(device);
}

@java.lang.Override
public void onClick(android.view.View v) {
    cm.startTaskMenu();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    return START_STICKY;
}

public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_contact_designer);
    getTitleFromIntent(this.getIntent());
    initActionBar();
    initTabHost(this.getIntent());
    initListView();
}

@java.lang.Override
public void showNotificationCallback(org.adblockplus.libadblockplus.Notification notification) {
    retValue = notification;
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.util.Log.d(getClass().toString(), "Failed to fetch trailers");
    reviewTextView.setText(context.getResources().getString(R.string.no_trailers));
    trailerExpandButton.setVisibility(View.INVISIBLE);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (com.fashare.activitytracker.AccessibilityUtil.checkAccessibility(this)) {
        if ((com.fashare.activitytracker.Tile.instance) != null) {
            com.fashare.activitytracker.Tile.instance.onClick();
        }
        finish();
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.guanyf.appmanager.Tab1();
        case 2 :
            return new com.guanyf.appmanager.Tab2();
        case 1 :
            return new com.guanyf.appmanager.Tab3();
    }
    return null;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    com.CMPUT301W15T02.teamtoapp.Model.Claim claim = adapter.getItem(position);
    claimListController.removeClaim(claim);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((com.comp.iitb.vialogue.activity.CropMainActivity) (getActivity())).done(currentBitmap);
}

private void setupGridView(com.tonykazanjian.codenamescompanion.LinearLayoutAbsListView gridPanel, com.tonykazanjian.codenamescompanion.main.GamePresenter gamePresenter, android.widget.GridView gridView) {
    gridPanel.setOnDragListener(new com.tonykazanjian.codenamescompanion.listeners.ViewDragListener(gamePresenter, this));
    gridPanel.setAbsListView(gridView);
    gridView.setOnItemLongClickListener(new com.tonykazanjian.codenamescompanion.listeners.GridItemLongClickListener(gamePresenter));
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
}

@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        login(user.getEmail(), user.getDisplayName());
    }
    progressDialog.dismiss();
}

public static void validateMovieCursor(java.lang.String error, android.database.Cursor valueCursor, android.content.ContentValues expectedValues) {
    junit.framework.Assert.assertTrue(("Cursor should have records" + error), valueCursor.moveToFirst());
    com.franktan.popularmovies.data.DataTestUtilities.validateMovieRecordUnderCursor(error, valueCursor, expectedValues);
}

@java.lang.Override
public void setImageResource(@android.support.annotation.DrawableRes
int resId) {
    super.setImageResource(resId);
    if ((mImageHelper) != null) {
        mImageHelper.setImageResource(resId);
    }
}

@java.lang.Override
public void onPageScrollStateChanged(int state) {
}

@java.lang.Override
public void run() {
    violationSyncHandler.post(violationSync);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parentView, android.view.View selectedItemView, int position, long id) {
    mGradientSource = position;
    if ((mTrackSegments.size()) != 0) {
        mCustomMapFragment.plotRoute(mTrackSegments, mGradientSource, false);
    }
}

public static nju.com.piece.database.helpers.PeriodDBHelper instance(android.content.Context context) {
    return new nju.com.piece.database.helpers.PeriodDBHelper(context, null, DATABASE_VERSION);
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "relay off success");
    done();
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
    e.printStackTrace();
    mIBlibiliFragment.hideProgressbar();
    mIBlibiliFragment.showError(e.getMessage());
}

void startVector(java.lang.String mimetype, java.lang.String vectorData, java.lang.String vectorName);

private void showMainActivity() {
    android.content.Intent mainIntent = new android.content.Intent(getApplicationContext(), com.farfromsober.ffs.activities.MainActivity.class);
    startActivity(mainIntent);
}

public void switchActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.echopen.asso.echopen.ListImagesActivity.class);
    startActivity(intent);
}

public void enter(@android.support.annotation.NonNull
android.widget.ImageView from, boolean withAnimation) {
    mImageFrom = from;
    mIsOpen = true;
    mAnimator.init(from, this);
    mAnimator.enter(withAnimation);
}

public void setEnv(final android.content.Context p) {
    net.sourceforge.clonekeenplus.Settings.SdcardAppPath.get().setEnv(p);
}

@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot snapshot) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    if (remoteObject != null)
        remoteObject.notify("onChildRemoved", "child", snapshot.getValue());
    
}

private java.lang.String getSampleType(java.lang.String SAK) {
    java.lang.String unknownTypeString = "Unknown type";
    android.util.Log.i(palarax.e_key_card.NFC_Tag_Tech.nfcATag.TAG, "getting sample");
    return palarax.e_key_card.NFC_Tag_Tech.SampleTagAttributes.lookup(SAK, unknownTypeString);
}

void e(java.lang.String message) {
    if (should(com.otaliastudios.zoom.ZoomLogger.LEVEL_ERROR)) {
        android.util.Log.e(mTag, message);
        com.otaliastudios.zoom.ZoomLogger.lastMessage = message;
        com.otaliastudios.zoom.ZoomLogger.lastTag = mTag;
    }
}

public void spinWheel(android.view.View v) {
    v.setEnabled(false);
    dialer.setEnabled(false);
    dialer.post(new com.concon.talkabout.talkabout.SpinWheelGameplay.FlingRunnable(random.nextInt(1500), v));
}

@java.lang.Override
public com.podgpavel.yal_task1.Adapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemLayoutView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_layout, null);
    return new com.podgpavel.yal_task1.Adapter.ViewHolder(itemLayoutView);
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
}

@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
}

@java.lang.Override
public void onDestroyActionMode(android.support.v7.view.ActionMode mode) {
    enableSelectionMode(false);
    getView().findViewById(R.id.DescriptionText).setVisibility(View.GONE);
    listAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.support.v13.app.FragmentCompat.requestPermissions(parent, new java.lang.String[]{ Manifest.permission.CAMERA }, com.tapifolti.emotiondetection.EmotionDetectionFragment.REQUEST_APP_PERMISSION);
}

@java.lang.Override
public void onShowCollaborators(com.box.androidsdk.content.models.BoxIteratorCollaborations collaborations) {
    android.content.Intent collabsIntent = com.box.androidsdk.share.activities.BoxCollaborationsActivity.getLaunchIntent(this, ((com.box.androidsdk.content.models.BoxFolder) (mShareItem)), mSession, collaborations);
    startActivity(collabsIntent);
}

@java.lang.Override
public void onCustomerRetrieved(@android.support.annotation.NonNull
com.stripe.android.model.Customer customer) {
    mCustomer = customer;
    createListFromCustomerSources();
}

@java.lang.Override
public void messageReceived(de.mhid.android.timerecordingforpebble.PebbleMessenger msgr, com.getpebble.android.kit.util.PebbleDictionary dict) {
    evtRequestStatus(true, firstTimelineUpdate, false);
    firstTimelineUpdate = false;
}

public void onLocation(android.location.Location location) {
    for (int i = 0; i < (_locationListeners.size()); i++) {
        _locationListeners.get(i).onLocation(location);
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    mContext.startActivity(new android.content.Intent("com.android.settings.POWERMANAGER_SETTINGS").addFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK))));
    dismiss();
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    animateAlpha = 255 - ((java.lang.Integer) (animation.getAnimatedValue()));
    invalidate();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapter, android.view.View v, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, com.kingsley.android.kupsfood.activities.FoodDescriptionActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void start(android.app.Activity activity, com.auth0.identity.IdentityProviderRequest request, com.auth0.core.Application application) {
    checkPermissions(activity, request.getServiceName(), true);
}

private void checkQuestionTwoAnswers() {
    android.widget.RadioButton radioButtonBruce = ((android.widget.RadioButton) (findViewById(R.id.radio_bruce)));
    boolean isRadioButtonBruceChecked = radioButtonBruce.isChecked();
    if (isRadioButtonBruceChecked) {
        correctAnswers += 1;
    }else {
        correctAnswers += 0;
    }
}

@java.lang.Override
public void setTTYMode(int ttyMode, android.os.Message onComplete) {
    mCT.setTtyMode(ttyMode);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    refreshLocationAndWeather();
}

@com.squareup.otto.Subscribe
public void onAuthFail(cz.kovar.petr.homevoice.bus.events.AuthEvent.Fail event) {
    android.util.Log.v(cz.kovar.petr.homevoice.frontend.FragmentPlan.LOG_TAG, "Auth Failed!");
}

@java.lang.Override
public void onClick(android.view.View view) {
    int pos = getAdapterPosition();
    com.android.summer.csula.foodvoter.yelpApi.models.Business business = mChoiceData.get(pos).getBusiness();
    mOnClickListener.onListItemClick(business);
}

private org.osmdroid.views.overlay.OverlayItem putMarkerAt(org.osmdroid.util.GeoPoint p, android.graphics.drawable.Drawable markerDrawable) {
    org.osmdroid.views.overlay.OverlayItem markerItem = makeMarker(p, markerDrawable);
    markersOverlay.addItem(markerItem);
    map.invalidate();
    return markerItem;
}

@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, ir.rasen.charsoo.controller.image_loader.core.assist.FailReason failReason) {
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.spilgames.spilsdk.utils.permissions.dialog.MaterialDialog materialDialog, @android.support.annotation.NonNull
com.spilgames.spilsdk.utils.permissions.dialog.internal.DialogAction dialogAction) {
    materialDialog.dismiss();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getData();
    mAdapter = new com.hp.qiushibaike.adapter.QiushiAdapter(mQiushiBriefs);
}

public boolean doesDeviceHaveSecuritySetup(android.content.Context context) {
    android.app.KeyguardManager keyguardManager = ((android.app.KeyguardManager) (context.getSystemService(Context.KEYGUARD_SERVICE)));
    return keyguardManager.isKeyguardSecure();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent captureImage = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    android.net.Uri uri = android.net.Uri.fromFile(mPhotoFile);
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(captureImage, com.example.suren.criminalintent.CrimeFragment.REQUEST_PHOTO);
}

@java.lang.Override
protected void onBeforeClusterItemRendered(org.ecomap.android.app.Problem problem, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    markerOptions.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(problem.res_id));
}

@java.lang.Override
public void onClick(android.view.View v) {
    layout.addView(new android.view.View(getActivity()));
}

@java.lang.Override
public void onRebind(android.content.Intent intent) {
    super.onRebind(intent);
}

public org.openobservatory.measurement_kit.android.IntentRouter emit_intent(android.content.Intent intent) {
    lbm.sendBroadcast(intent);
    return this;
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.util.Log.i("Inside onLoaderReset", "Swapped the Cursor");
    mMovieCursorAdapter.swapCursor(null);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mMapFragment.showAllFloors(false);
    mMapFragment.showMarkersForSpecificFloor(1);
}

public static void setSeen(android.content.Context c, java.lang.String key) {
    c.getSharedPreferences("Kantidroid", Context.MODE_PRIVATE).edit().putBoolean(key, true).commit();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, tcss450.gps_app_phase_i.MovementData.class);
    startActivity(intent);
}

public static void startCrashlytics(android.content.Context context) {
    if (!(com.musenkishi.wally.BuildConfig.DEBUG)) {
    }
}

@java.lang.Override
public void onDownloadCompleted() {
    android.util.Log.d(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.TAG, "Download Completed");
    if (!(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.isImage)) {
        mVideoView.start();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    knowSwipe(prefs);
}

@java.lang.Override
public void onClick(android.view.View v) {
    toggleNodeMode();
}

public void setRecyclerViewAdapter() {
    adapter = new ambiesoft.start.utility.RecyclerViewAdapter(ambiesoft.start.fragment.HomeFragment.filteredPerformances, getActivity());
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
}

@java.lang.Override
public void onClick(android.view.View v) {
    customSetVolume(buttonName);
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    java.lang.String downloadUrl = taskSnapshot.getDownloadUrl().toString();
    android.util.Log.i(com.google.codeu.chatme.presenter.CreateGroupPresenter.TAG, ("uploadGroupPicture:success:downloadUrl " + downloadUrl));
    updateGroupPhotoUrl(downloadUrl, conversationId);
    view.openMessageActivity(conversationId);
}

