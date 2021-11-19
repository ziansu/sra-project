public com.example.ddmeng.hellodialogfragment.MyCustomDialogFragment.Builder setNegativeButton(java.lang.String text, android.content.DialogInterface.OnClickListener listener) {
    this.negative = text;
    this.negativeListener = listener;
    return this;
}

public void showCompleteView() {
    android.util.Log.d("tianbin", "show complete view");
    controlsContainer.setVisibility(com.devbrackets.android.exomediademo.hotbody.GONE);
    mBtnReplay.setVisibility(com.devbrackets.android.exomediademo.hotbody.VISIBLE);
}

private static void launchIntent(java.lang.String activity, java.lang.Class clazz, android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, clazz);
    edu.txstate.mobile.tracs.util.MenuController.configureBackstack(intent, context, activity);
    context.startActivity(intent);
}

public void run() {
    android.widget.Toast.makeText(this, (("Has: " + status) + "!!!!!"), Toast.LENGTH_SHORT);
}

@java.lang.Override
public void onPageSelected(int page) {
    android.util.Log.d(de.blau.android.propertyeditor.PropertyEditor.DEBUG_TAG, ("onPageSelected " + page));
    if ((page == (tagFormFragmentPosition)) && ((tagFormFragment) != null)) {
        tagFormFragment.update();
    }
}

@java.lang.Override
protected final void onHandleIntent(android.content.Intent intent) {
    processIntent(intent);
    com.onesignal.GcmBroadcastReceiver.completeWakefulIntent(intent);
}

private void updateSize() {
    android.util.Log.d("updateSize", ((getHealth()) + " "));
    setSize(((float) ((health) * 0.025)));
}

android.view.View create(android.content.Context context, android.view.View convertView, android.view.ViewGroup parent, android.view.LayoutInflater inflater) {
}

private int dpToPx(int dp) {
    return ((int) (android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics())));
}

private void startAuthActivity(agency.tango.skald.core.AuthException authException) {
    agency.tango.skald.core.errors.AuthError authError = authException.getAuthError();
    if (authError.hasResolution()) {
        android.content.Intent intent = authError.getResolution();
        startActivityForResult(intent, com.spotify.sdk.android.authentication.LoginActivity.REQUEST_CODE);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    mUser = com.pratilipi.mobile.android.homescreen.profile.ProfileUtil.getLoggedInUser(activity);
    if ((mUser) != null) {
        if (isAddedToLibrary)
            removeFromLibraryRequest();
        else
            addToLibraryRequest();
        
    }else {
        startLoginActivity();
    }
}

@java.lang.Override
public void onFailure(java.lang.Throwable e) {
    android.util.Log.e("seyi", "farmer delete failed");
    android.util.Log.e("TAG", "failed to save event data", e);
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.lta_setAudio_btn :
            chooseAudio();
            break;
        case R.id.aa_save_alarm :
            startAlarm();
            break;
        default :
            super.onClick(v);
    }
}

@java.lang.Override
public void onMapLongClick(final com.google.android.gms.maps.model.LatLng point) {
    android.widget.Toast.makeText(mContext, ("Long Press" + (point.toString())), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
    super.onSaveInstanceState(outState, outPersistentState);
    outState.putString(com.gh4a.activities.IssueListActivity.STATE_KEY_SEARCH_QUERY, mSearchQuery);
    outState.putBoolean(com.gh4a.activities.IssueListActivity.STATE_KEY_SEARCH_MODE, mSearchMode);
}

private com.apptentive.android.sdk.RatingModule.RatingState getState(android.content.SharedPreferences prefs) {
    return com.apptentive.android.sdk.RatingModule.RatingState.valueOf(prefs.getString(Constants.PREF_KEY_RATING_STATE, com.apptentive.android.sdk.RatingModule.RatingState.START.toString()));
}

@java.lang.Override
public void onGetChannelMember(java.lang.String userId) {
    android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, ("onGetChannelMember " + userId));
    addUser(userId);
    mProxy.onGetChannelMember(userId);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK, null);
    intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
    startActivityForResult(android.content.Intent.createChooser(intent, "Select an Image."), rainvisitor.personal_assistant.DetailScheduleFragmet.AddFragment.Pick_Image_Request);
}

@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    android.os.Parcelable superState = super.onSaveInstanceState();
    return new com.andrognito.patternlockview.PatternLockView.SavedState(superState, com.andrognito.patternlockview.utils.PatternLockUtils.patternToString(mPattern), mPatternViewMode, mInputEnabled, mInStealthMode, mEnableHapticFeedback);
}

public static void setupAndroidNatures(org.eclipse.core.resources.IProject project, org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
    com.android.ide.eclipse.adt.internal.project.AndroidNature.setupProjectNatures(project, monitor);
}

private void delayedHide(int delayMillis) {
    android.util.Log.d("BackEnd", ("On method delayedHide " + delayMillis));
    mHideHandler.removeMessages(0);
    mHideHandler.sendEmptyMessageDelayed(0, delayMillis);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (isNewClaim == true) {
        createDestinationButton(isNewClaim, Destination, newDestination, doNothing);
    }else {
        Destination = claim.getDestination();
        createDestinationButton(isNewClaim, Destination, editDestination, doNothing);
    }
}

public void onNothingSelected(android.widget.AdapterView<?> parent) {
    tipo_bebida = "";
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(TAG, "OnClick Call");
    if (mSQLiteManager.updateCheckStateInTodo(mDataList.get(position)._ID)) {
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setupBroadcastManagers();
    setProfileInformation();
    setContentView(R.layout.activity_main);
}

private int getParentVisibility() {
    android.view.View parentView = com.marvinlabs.widget.floatinglabel.FloatingLabelWidgetBase.getRootView().findViewById(((android.view.ViewGroup) (com.marvinlabs.widget.floatinglabel.FloatingLabelWidgetBase.getParent())).getId());
    return parentView != null ? parentView.getVisibility() : android.view.View.GONE;
}

@java.lang.SuppressWarnings(value = "ResourceType")
@java.lang.Override
public void onGenerated(android.support.v7.graphics.Palette palette) {
    int vibrantColor = palette.getVibrantColor(R.color.colorPrimary);
    int vibrantDarkColor = palette.getDarkVibrantColor(R.color.colorPrimary);
    collapsingToolbarLayout.setContentScrimColor(vibrantColor);
    collapsingToolbarLayout.setStatusBarScrimColor(vibrantDarkColor);
}

@java.lang.Override
protected void onPostExecute(com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException ex) {
    super.onPostExecute(ex);
    if (com.spjanson.restdemo.REST.mConnected) {
        com.spjanson.restdemo.REST.mConnCBs.onConnOK();
    }else {
        com.spjanson.restdemo.REST.mConnCBs.onConnFail((ex == null ? null : ex.getIntent()));
    }
}

@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] results) {
    if ((results[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        determineCurrentLocation();
    }else {
    }
}

@java.lang.Override
public void onFinish() {
    de.greenrobot.event.EventBus.getDefault().postSticky(new com.sqvat.squat.events.RestFinished(position));
    android.media.MediaPlayer mPlayer = android.media.MediaPlayer.create(getActivity(), R.raw.timer_finish);
    mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    mPlayer.start();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mThumbnailThread.quit();
    android.util.Log.i(com.example.photogallery.PhotoGalleryFragment.TAG, "Background thread destroyed!");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tingle);
    if (savedInstanceState == null) {
        setFragment();
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(com.ripplex.fileobservertester.MainApplication.TAG, "onCreate()");
    manager = new com.ripplex.fileobservertester.FileObserverManager();
    manager.startWatch();
}

public void onDrawerClosed(android.view.View drawerView) {
    isOpened = 0;
}

@java.lang.Override
public void bind(android.content.Context context, java.lang.Object item) {
}

public void next() {
    (indexPointer)++;
    if ((indexPointer) > ((mSize) - 1)) {
        android.util.Log.d("ProgressDotBar", "Index overflow");
        return ;
    }
    updateDots();
}

@android.support.annotation.NonNull
public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getLinks() {
    if ((links) == null)
        return java.util.Collections.emptyList();
    
    return links;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (existAccount())
        startActivity(new android.content.Intent(this, it.eternitywall.eternitywall.activity.DebugActivity.class));
    else
        dialogCreateAccount();
    
}

public static int getType(android.app.Activity activity) {
    com.easy.util.MeasureUtil.measure(activity);
    return com.easy.util.MeasureUtil.type;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((originalFile) != null) {
        mplayer.play(originalFile);
    }
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (camera) {
        mScannerView.stopCamera();
    }
    listView.setAdapter(null);
    android.widget.FrameLayout frameLayout = findViewById(R.id.content);
    frameLayout.removeAllViews();
}

private void loadImages() {
    if ((com.best_slopes.bestslopes.ImageAdapter.baseDir) == null)
        com.best_slopes.bestslopes.ImageAdapter.baseDir = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    
    if (trail.isNew()) {
        getDebuggingImages();
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(com.solderbyte.openfit.NotificationService.LOG_TAG, "Stopping Service");
    stopSelf();
    unregisterReceiver(appsReceiver);
    unregisterReceiver(stopServiceReceiver);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.app.Activity activity = ((android.app.Activity) (v.getTag()));
    activity.startActivityForResult(android.content.Intent.createChooser(new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT).setType("image/*"), "Choose an image"), com.dreamfactory.sampleapp.activities.CreateContactActivity.CHOOSE_IMAGE_REQUEST);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent gallery = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    gallery.setType("image/*");
    gallery.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(gallery, de.mpg.mpdl.www.datacollector.app.Workflow.WorkflowSectionFragment.INTENT_PICK_PHOTO);
    meta.setType("image");
}

public void close(android.view.View view) {
    mListener.closeThis(this);
}

protected android.support.v4.app.Fragment createFragment() {
    com.innovativetech.audio.audiobookmaster.AudioBook book = ((com.innovativetech.audio.audiobookmaster.AudioBook) (getIntent().getSerializableExtra(com.innovativetech.audio.audiobookmaster.AudioPlayerActivity.EXTRA_BOOK)));
    return com.innovativetech.audio.audiobookmaster.AudioPlayerFragment.newInstance(book);
}

protected void onPermissionResult(ext.android.permissions.ExtPermission permission, java.lang.Integer permissionResult) {
    if ((permission.isMandatory()) && (permissionResult != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        requestPermissionHandler.onPermissionDenied();
    }
}

public void storeImage(java.lang.String completePath, android.net.Uri fileUri, android.content.Context context) {
    android.graphics.Bitmap bitmap = compressBitmap(fileUri, context);
    storeImage(completePath, bitmap);
}

@java.lang.Override
protected void onDestroy() {
    android.util.Log.d(edu.grinnell.kdic.MainActivity.TAG, "MainActivity Destroyed.");
    super.onDestroy();
}

public byte[] readFile(com.felhr.usbmassstorageforandroid.filesystems.VFSFile file) {
    fatHandler.stopCaching();
    byte[] data = fatHandler.readFile(file.getFileName());
    fatHandler.continueCaching();
    return data;
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader loader) {
    mCursorAdapter.getCursor().close();
    mCursorAdapter.swapCursor(null);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    onItemSelectedMethod(position);
}

@java.lang.Override
public void onError(com.androidnetworking.error.ANError error) {
    android.util.Log.d("rgqergqe", error.toString());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((OnItemClickListener) != null) {
        int id = ((int) (v.getTag()));
        OnItemClickListener.onItemClick(id);
    }
}

@java.lang.Override
public void onError(com.androidnetworking.error.ANError anError) {
    android.util.Log.i(com.tpb.projects.data.Editor.TAG, ("onError: Card update: " + (anError.getErrorBody())));
    if (listener != null)
        listener.updateError(parseError(anError));
    
}

@android.annotation.RequiresPermission(value = Manifest.permission.BLUETOOTH)
public java.lang.String getAddress() {
    try {
        return com.oinux.android.ConfigLoader.getInstance(true).get(Config.BLUETOOTH_ADDRESS, mManagerService.getAddress());
    } catch (android.os.RemoteException e) {
        android.util.Log.e(android.bluetooth.BluetoothAdapter.TAG, "", e);
    }
    return null;
}

@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
    com.markupartist.sthlmtraveling.provider.planner.JourneyQuery journeyQuery = com.markupartist.sthlmtraveling.PlannerActivity.getJourneyQuery(cursor);
    inflateView(view, journeyQuery, cursor);
}

@java.lang.Override
protected android.view.View initComponentHostView(android.content.Context context) {
    return new android.widget.TextView(context);
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    android.util.Log.d("DownloadData", ("Result was : " + result));
}

public com.yalantis.ucrop.UCrop withMaxResultSize(@android.support.annotation.IntRange(from = 100)
int width, @android.support.annotation.IntRange(from = 100)
int height) {
    mCropOptionsBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_SET, true);
    mCropOptionsBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_X, width);
    mCropOptionsBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_Y, height);
    return this;
}

protected com.android.internal.telephony.uicc.IccRecords getUiccRecords(int appFamily) {
    return mUiccController.getIccRecords(mPhone.getPhoneId(), appFamily);
}

@java.lang.Override
public void onClick(android.view.View view) {
    choiceA.setBackground(drw);
    choiceB.setBackgroundResource(0);
    choiceC.setBackgroundResource(0);
    answers[position] = 0;
}

protected net.sharkfw.protocols.Stub createWifiDirectStreamStub(net.sharkfw.asip.SharkStub kepStub) throws net.sharkfw.kep.SharkProtocolNotSupportedException {
    if ((currentStub) == null) {
        currentStub = new net.sharksystem.android.protocols.wifidirect.WifiDirectStreamStub(context, activityRef);
        currentStub.setHandler(((net.sharkfw.protocols.RequestHandler) (kepStub)));
    }
    return currentStub;
}

public void BackToBooking(android.view.View v) {
    android.content.Intent i = new android.content.Intent(getBaseContext(), team2beat.com.qrcodes.Staff_Bookings.class);
    this.startActivity(i);
}

public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    if (itemSelected) {
        showOptions(false);
    }else {
        mAdapter.onItemDismiss(viewHolder.getAdapterPosition());
        moving = true;
        updateUI();
    }
}

@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    container.removeView(((android.widget.RelativeLayout) (object)));
    com.squareup.picasso.Picasso.with(mMeFullScreenActivity).cancelRequest(mImageView);
}

public void decrease(android.view.View view) {
    android.widget.TextView tv = getTextView(R.id.quantity_text_view);
    numberOfCoffees = (numberOfCoffees) - 1;
    tv.setText(("" + (numberOfCoffees)));
}

@java.lang.Override
public void onRefresh() {
    refreshList();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            swipeRefreshLayout.setRefreshing(false);
        }
    }, 1500);
}

@java.lang.Override
public void onPageScrollStateChanged(int state) {
    android.util.Log.i(TAG, ("onPageScrollStateChanged: " + state));
    if (state == 1) {
        slideByUser = true;
    }else
        if (state == 2) {
        }else {
            slideByUser = false;
        }
    
}

public static void setWidth(final android.view.View aView, final int aWidth) {
    final android.view.ViewGroup.LayoutParams params = aView.getLayoutParams();
    params.width = com.deepercreeper.vampireapp.util.ViewUtil.calcPx(aWidth, aView.getContext());
    aView.setLayoutParams(params);
}

@org.junit.After
public void tearDown() throws java.lang.Exception {
    android.util.Log.v(nl.sense_os.userdataapi.SenseUserDataAPITest.TAG, "Tearing Down SenseUserDataAPITest");
    clearUsersData();
}

private void maybeSwapSearchIcon(@android.annotation.NonNull
android.content.ComponentName assistComponent, boolean isService) {
    if ((mView) == null) {
        onConfigurationChanged();
    }
    replaceDrawable(mView.getOrb().getLogo(), assistComponent, com.android.systemui.assist.AssistManager.ASSIST_ICON_METADATA_NAME, isService);
}

private void clickCancel(android.content.DialogInterface dialog, int id) {
    dismiss();
}

@java.lang.Override
public synchronized boolean act(com.xengine.android.toolkit.sm.XAction action) {
    if ((mActionWorker) == null)
        return false;
    
    if (action == null) {
        return false;
    }
    return mActionQueue.offer(action);
}

private android.content.Intent createShareIntent() {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
    return shareIntent;
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    injectDependencies();
    mSettingsPresenter.setView(this);
}

private boolean isNotificationsEnabled() {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean(getString(R.string.pref_chat_notifications_key), false);
}

public static boolean checkIfPackageChanged(android.content.Context context) {
    return !(context.getPackageName().equals(((((ru.dante.scpfoundation.util.SecureUtils.ONE) + (ru.dante.scpfoundation.util.SecureUtils.TWO)) + (ru.dante.scpfoundation.util.SecureUtils.THREE)) + (ru.dante.scpfoundation.util.SecureUtils.FOUR))));
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        default :
            break;
    }
}

public void quitOnClick(android.view.View view) {
    finish();
}

public static com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment newInstance(com.flaredown.flaredownApp.Helpers.APIv2.EndPoints.CheckIns.TrackableType trackableType) {
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable(com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment.ARG_TRACKABLE_TYPE, trackableType);
    com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment fragment = new com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment();
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void onPageScrollStateChanged(int state) {
    android.util.Log.e(com.gamecard.view.AppDescriptionActivity.TAG, "onPageScrolledStateChanged called");
}

public void setItemSize(int columnWidth) {
    if ((mItemSize) == columnWidth) {
        return ;
    }
    mItemSize = columnWidth;
    mItemLayoutParams = new android.widget.GridView.LayoutParams(mItemSize, mItemSize);
    notifyDataSetChanged();
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    mCamera.stopPreview();
    mCamera.release();
}

@java.lang.Override
public com.starlabs.h2o.adapter.ViewPurityReportsAdapter.CustomViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_purity_report, null);
    com.starlabs.h2o.adapter.ViewPurityReportsAdapter.CustomViewHolder viewHolder = new com.starlabs.h2o.adapter.ViewPurityReportsAdapter.CustomViewHolder(view);
    return viewHolder;
}

private static java.util.Locale getLocale(android.app.Activity activity) {
    return activity.getResources().getConfiguration().locale;
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    refreshSeekPosition(java.util.concurrent.TimeUnit.SECONDS.toMillis(seekBar.getProgress()), mMediaPlayer.getStreamDuration());
}

@java.lang.Override
public void onClick(android.view.View v) {
    addStarBook(mBook);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.support.v7.widget.RecyclerView rv = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.f1_recyclerview)));
    setupRecyclerView(rv);
    initiliazeYoutubeFragment();
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    android.util.Log.e("map is ckicked", "true");
    openMapFull(requestCode);
}

@java.lang.Override
public void run() {
    callback.onSuccess(new org.matrix.androidsdk.crypto.MXCrypto.DoKeyDownloadForUsersResponse(usersDevicesInfoMap, failedUserIds));
}

@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(this.name);
    parcel.writeInt(this.cant);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    java.lang.System.out.println("this is the change");
}

void setControls() {
    linFirstRun = ((android.widget.LinearLayout) (findViewById(R.id.linFirstRun)));
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (null != fileName) {
        this.onPlayButtonClick(playButton, fileName);
    }else {
        this.onPlayButtonClick(playButton, mCurrent.getFilePath());
    }
}

private void displayDatePicker(org.apache.cordova.CallbackContext callbackContext) {
    android.app.FragmentManager manager = cordova.getActivity().getFragmentManager();
    com.plugin.datepicker.MaterialDatePickerPlugin.DatePickerFragment dialog = new com.plugin.datepicker.MaterialDatePickerPlugin.DatePickerFragment();
    dialog.show(manager, com.plugin.datepicker.MaterialDatePickerPlugin.DIALOG_DATE);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.add.toeic.activity.DetailWordActivity.PlaceholderFragment.newInstance((position + 1), mArrayList, mGroupWord, mWord);
}

public void doneExpenseItem(android.view.View v) throws java.text.ParseException {
    if (createExpenseItem(v)) {
        finish();
    }
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    if (intent.getAction().equals(Intent.ACTION_MAIN)) {
        fadeDateTime(1, 300);
        resetState();
    }
}

