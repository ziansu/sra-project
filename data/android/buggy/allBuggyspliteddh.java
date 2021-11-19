@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    this.dialog_save.dismiss();
    android.widget.Toast.makeText(this, s.toString(), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(intent, flags, startId);
    java.lang.System.out.print("service starting");
    com.mycompany.geotracker.service.DataMovementService.initial(this);
    return START_NOT_STICKY;
}

public void unflattenComponentName(java.lang.String componentNameString) {
    mComponentName = android.content.ComponentName.unflattenFromString(componentNameString);
    mSelectedMediaPlayerPackageName = componentNameString.substring(0, componentNameString.indexOf("/"));
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    org.secuso.privacyfriendlyactivitytracker.persistence.StepCountPersistenceHelper.storeStepCounts(service, context, oldWalkingMode);
    org.secuso.privacyfriendlyactivitytracker.utils.StepDetectionServiceHelper.stopAllIfNotRequired(false, context);
    context.getApplicationContext().unbindService(mServiceConnection);
    org.secuso.privacyfriendlyactivitytracker.receivers.WidgetReceiver.forceWidgetUpdate(context);
}

@java.lang.Override
public void onReadRemoteRssi(android.bluetooth.BluetoothGatt gatt, int rssi, int status) {
    mBluetoothGatt = gatt;
    broadcastUpdateRSSI(sentek.drillanddropconfig.services.BluetoothLeService.ACTION_RSSI_AVAILABLE, rssi);
}

@java.lang.Override
public boolean shouldShowRequestPermissionRationale(@android.support.annotation.NonNull
java.lang.String permission) {
    if (Manifest.permission.GET_ACCOUNTS.equals(permission)) {
        return new de.iweinzierl.worktrack.util.SettingsHelper(this).askAgainForGetAccountsPermission();
    }
    return false;
}

@java.lang.Override
public void onPageScrollStateChanged(int i) {
    android.util.Log.i(com.xiaodong.dream.catcher.demo.express.ExpressFragment.TAG, ">>onPageScrollStateChanged");
}

public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    currentSchedule = adapter3.getItem(pos);
    android.widget.Toast.makeText(context, currentSchedule.getStart_hour(), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onFailure() {
    if ((progressBar) != null) {
        android.util.Log.e("ArticleActivity", "failed to load full content");
        progressBar.setVisibility(View.GONE);
    }
}

public static void setDefaults(android.content.Context context) {
    android.preference.PreferenceManager.setDefaultValues(context, Const.APP_PREFS_NAME, Context.MODE_PRIVATE, R.xml.prefs_defaults, false);
}

public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.Nullable
android.graphics.Bitmap icon, boolean tintIcon) {
    mIcon = com.danimahardhika.cafebar.CafeBarUtil.toDrawable(mContext, icon);
    mTintIcon = tintIcon;
    return this;
}

android.webkit.WebView getTopWindow() {
    if ((mSubView) != null) {
        return mSubView;
    }
    return webView;
}

public boolean onMenuItemClick(android.view.MenuItem item) {
    java.lang.String task = item.toString();
    android.util.Log.d("TAG", task);
    previewTask(task);
    return true;
}

@java.lang.Override
public void defocusFragment() {
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (activity.getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.hideSoftInputFromWindow(edit_text_native.getWindowToken(), 0);
}

public void onAccept(android.view.View v) {
    new edu.cs430x.fuschia.geosnap.network.imgur.services.UploadService(createUpload(), this).execute();
    android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
    android.util.Log.i(edu.cs430x.fuschia.geosnap.activity.PictureReviewActivity.TAG, "Started upload to imgur");
}

abstract com.mapbox.matching.v5.MapboxMapMatching.Builder timestamps(@android.support.annotation.Nullable
java.lang.String timestamps);

protected void createLocationRequest() {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(Constants.UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setFastestInterval(Constants.FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
}

private android.content.ContentValues monitoringAreaToContentValues(de.jordsand.birdcensus.core.MonitoringArea area) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(BirdCountContract.MonitoringArea.COLUMN_NAME_CODE, area.getCode());
    values.put(BirdCountContract.MonitoringArea.COLUMN_NAME_NAME, area.getCode());
    return values;
}

@java.lang.Override
public void draw(android.graphics.Canvas canvas, com.nextgis.maplib.map.MapDrawable mapDrawable) {
    if ((mMapPoint) != null) {
        mOverlayPoint.setCoordinates(mMapPoint.getX(), mMapPoint.getY());
        drawOverlayItem(canvas, mOverlayPoint);
    }
}

private void sendEditorStateChangedIntent() {
    sendBroadcastIntent(org.solovyev.android.calculator.CalculatorBroadcaster.ACTION_EDITOR_STATE_CHANGED);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.estimote.notification.MyApplication.ME = ((android.app.Activity) (this.getApplicationContext()));
    com.estimote.sdk.EstimoteSDK.initialize(getApplicationContext(), "maaswaal-college-veenseweg-15t", "4302f89a2ec3d5c5ec15596a0e1079d0");
}

public static void verifyPhoneToken(java.lang.String token, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    com.airmap.airmapsdk.networking.services.PilotService.verifyToken(token, callback);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    mApplication.setRestaurants(new java.util.ArrayList<com.example.amish.pickyeaters.helpers.Restaurant>());
    android.util.Log.e("Bitch please", "Baby please");
}

public void debug(java.lang.String message, java.lang.Throwable throwable, java.lang.Object... arguments) {
    if (android.util.Log.isLoggable(tag, Log.DEBUG)) {
        android.util.Log.d(tag, java.text.MessageFormat.format(message, arguments));
    }
}

@java.lang.Override
public void handleCallSessionEvent(int event) {
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_HANDLE_CALL_SESSION_EVENT, event).sendToTarget();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (android.support.compat.BuildConfig.DEBUG)
        android.util.Log.d(iso.piotrowski.marek.nyndro.RemainderService.RemainderService.TAG, "onStartCommand: [service] start");
    
    doRemind();
    setUpBroadcastReceiver();
    return START_NOT_STICKY;
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.example.android.finder.Models.DeveloperResponse> call, java.lang.Throwable t) {
    response_message("Could Not Get List");
    android.util.Log.e(com.example.android.finder.FinderActivity.class.getName(), "Error Getting Results");
}

public void run() {
    movePotion = false;
    cauldron.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.chemistryGameText));
    currQuestion += 1;
    movePotion = true;
    setUp();
}

private void setInitialDate() {
    dateEditText.setText(android.text.format.DateUtils.formatDateTime(getApplicationContext(), selectedDate.getTimeInMillis(), ((android.text.format.DateUtils.FORMAT_SHOW_DATE) | (android.text.format.DateUtils.FORMAT_SHOW_YEAR))));
}

@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    this.setInfo(this);
    super.onCreate(savedInstanceState);
    com.asmodehn.wkcocos.testapp.AppActivity.nativeInitGPGS(this);
    com.asmodehn.wkcocos.testapp.AppActivity.nativeOnActivityCreated(this, savedInstanceState);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int position, long arg3) {
    intent.putExtra("dayIndex", adapter.getItem(position).toString());
    this.startActivity(intent);
}

private void openBackgroundThread() {
    backgroundThread = new android.os.HandlerThread("camera_background_thread");
    backgroundThread.start();
    backgroundHandler = new android.os.Handler(backgroundHandler.getLooper());
}

@java.lang.Override
public void onClick(android.view.View view, int position) {
    mDrawerLayout.closeDrawer(GravityCompat.START);
    ((materialtest.sanjose.venkata.activities.MovieTabActivity) (getActivity())).onDrawerItemClicked(position);
}

public void bindViewPager(int viewPagerId) {
    if (viewPagerId != 0) {
        android.support.v4.view.ViewPager vPager = ((android.support.v4.view.ViewPager) (getRootView().findViewById(viewPagerId)));
        bindViewPager(vPager);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    m_prefsListener = new com.brightsilence.dev.androidphotobackup.PhotoBackupSettingsActivity.PhotoBackupPreferenceChanged();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    if (org.kore.kolabnotes.android.Utils.getReloadDataAfterDetail(this)) {
        org.kore.kolabnotes.android.Utils.setReloadDataAfterDetail(this, false);
        overviewFragment.setFromDetail();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map_select);
    msif = new com.unknown.navevent.interfaces.defaultImpl.MapSelectActivityLogicDefault(this);
    msif.onCreate(this);
}

@java.lang.Override
public void onResult(com.mobvoi.android.wearable.MessageApi.SendMessageResult result) {
    if (result.getStatus().isSuccess()) {
        com.mobvoi.android.test.Utils.setText(this, "send", ("S:" + fh));
    }
}

public void takePicture(final android.hardware.Camera.PictureCallback callback) {
    mCamera.takePicture(mShutterCallback, null, callback);
    android.widget.Toast.makeText(getContext(), R.string.shutter, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onFragmentCreated(int fragmentNumber) {
    fragmentsReadyArray[fragmentNumber] = true;
    android.util.Log.e("Fragment ready", ("" + fragmentNumber));
    if (isAllFragmentsCreated())
        notifyFragments();
    
}

public static void turnOnReminders(android.app.Activity activity, org.a5calls.android.a5calls.model.AccountManager manager) {
    if (manager.getAllowReminders(activity)) {
        org.a5calls.android.a5calls.model.NotificationUtils.setNotificationTime(activity, manager.getReminderMinutes(activity));
    }else {
        org.a5calls.android.a5calls.model.NotificationUtils.clearNotifications(activity);
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(TAG, "Service started");
    this.mMobileDataUses = false;
    initialBluetoothMode();
    createBroadcastReceiver();
    checkPowerConnection();
    startBluetoothMode();
    setWakeLock();
}

private void putDate(android.content.ContentValues values) {
    if (mEditFlag) {
        values.put("date", mDate);
    }else {
        values.put("date", mCurDate);
    }
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(UARTStatusChangeReceiver);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    dismiss();
    long profileSqlId = id;
    eu.chessdata.services.TournamentService.startActionTournamentAddPlayer(getContext(), mTournamentSqlId, profileSqlId);
}

public void onClick(android.view.View v) {
    try {
        android.content.Intent k = new android.content.Intent(this, com.example.eddy.where.they_activity.class);
        startActivity(k);
    } catch (java.lang.Exception e) {
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    listener.onApplyFilterEntry(entriesNames[which]);
    editedOrDeletedCall.call(null);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setHasOptionsMenu(true);
    initUI();
    getMoviesByType();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(getBaseContext(), ("item clicado " + position), Toast.LENGTH_SHORT).show();
    openUserEditor(arrayUsersId[position]);
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent i = new android.content.Intent(this, com.byteshop.slidingpanel.SlidingPanel.class);
    startActivity(i);
    overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
}

public void addBitmapToCache(java.lang.String url, android.graphics.Bitmap bitmap) {
    if ((mCache.get(url)) != null) {
        mCache.put(url, bitmap);
    }
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    v.getParent().getParent().getParent().requestDisallowInterceptTouchEvent(true);
    return false;
}

@java.lang.Override
public android.graphics.Bitmap getDefaultVideoPoster() {
    final android.content.res.Resources resources = mActivity.getResources();
    return android.graphics.BitmapFactory.decodeResource(resources, android.R.drawable.spinner_background);
}

@java.lang.Override
public void onClick(android.view.View v) {
    method("1", res);
}

@java.lang.Override
public void onDiskMoved(com.po.sample.hanoi.DiskView disk) {
    android.os.Message message = mainUIHandler.obtainMessage(com.po.sample.hanoi.MainActivity.MSG_POP_DISK_MOVEMENT);
    mainUIHandler.sendMessage(message);
}

@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    directionItem = menu.findItem(R.id.action_direction);
    if (com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound) {
        directionItem.setChecked(com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound);
    }else {
        directionItem.setChecked(com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound);
    }
    directionItem.setVisible(true);
}

@java.lang.Override
public void setUnselected() {
    setTextColor(android.support.v4.content.ContextCompat.getColor(getContext(), unselected_color));
    if ((unselected_image) != 0)
        setCompoundDrawablesWithIntrinsicBounds(null, android.support.v4.content.ContextCompat.getDrawable(getContext(), unselected_color), null, null);
    
}

public void showAssignment() {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    org.team2635.scoutnetclient.fragments.AssignmentsFragment fragment = new org.team2635.scoutnetclient.fragments.AssignmentsFragment();
    fragmentTransaction.add(R.id.assignment_container, fragment);
    fragmentTransaction.commit();
}

private void prepareAdapter(android.view.View rootView) {
    adapter = new org.upv.ccupeiro.contadroid.main.view.adapter.MainCardAdapter(mockListCards());
    rvPaidExpenses.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    rvPaidExpenses.setAdapter(adapter);
}

public static void setUsingAlternateTypefaceAndForcedLocale(android.content.Context context, boolean useAlternateTypeface, int localeCode) {
    br.com.carlosrafaelgn.fplay.ui.UI.isUsingAlternateTypeface = useAlternateTypeface;
    if (!(br.com.carlosrafaelgn.fplay.ui.UI.setForcedLocale(context, localeCode)))
        br.com.carlosrafaelgn.fplay.ui.UI.setUsingAlternateTypeface(context, useAlternateTypeface);
    
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mHVVideoController.setCurrentTime(0);
    mHVVideoController.setSeekBarProgress(0);
    mHVVideoController.setSeekBarSecondaryProgress(0);
    mHVVideoController.displayPlayImg();
    mHVVideoView.stopTimer();
    mHVVideoView.seekTo(0);
}

@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    for (int appWidgetId : appWidgetIds) {
        android.vassilis.wifionoff.WifiWidget.updateAppWidget(context, appWidgetManager, appWidgetId);
    }
    updateWidget(context, android.vassilis.wifionoff.WifiWidget.WIFI_INFO.getSSID());
}

private int removeView(android.support.v4.view.ViewPager pager, int position) {
    pager.setAdapter(null);
    cardDetails.remove(position);
    this.notifyDataSetChanged();
    pager.setAdapter(this);
    return position;
}

public void changeTaskStatus(java.util.UUID uuid, java.lang.String status) {
    android.util.Log.i("BaoBao111", uuid.toString());
    vn.com.baohq.simpletodo.data.TaskItem taskItem = getTaskById(uuid);
    taskItem.setStatus(status);
    updateTask(taskItem);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    java.lang.System.out.println("onCreateView");
    return inflater.inflate(R.layout.fragment_add_file, container);
}

@org.androidannotations.annotations.AfterViews
void init() {
    setAppAuth();
    manageCookies();
    getGlobalConfig();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_user_login);
    butterknife.ButterKnife.bind(this);
    mToken.setText("63ff7b2bf4977d187fca54489c890cf4");
}

private void setCourseSection() {
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    crux.bphc.cms.fragments.CourseSectionFragment courseSectionFragment = crux.bphc.cms.fragments.CourseSectionFragment.newInstance(app.Constants.TOKEN, course.getCourseId());
    fragmentTransaction.add(R.id.course_section_enrol_container, courseSectionFragment, "course_section_frag").commit();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (null != (mListener)) {
        mListener.onFragmentInteraction(DummyContent.ITEMS.get(position).id);
    }
}

@java.lang.Override
public void onStop() {
    super.onStop();
    java.lang.System.out.println("ON STOP");
    if (mierzwa.rafal.smartmouse2.MainView.D)
        android.util.Log.e(mierzwa.rafal.smartmouse2.MainView.TAG, "-- ON STOP --");
    
}

@java.lang.Override
public void onServiceInterestExpressedSuccess(java.lang.String msg) {
    android.widget.Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    setResult(humane.vuram.com.humane.displayservicedetail.RESULT_OK);
    this.finish();
}

@java.lang.Override
public void onLost(com.google.android.gms.nearby.messages.Message message) {
    java.lang.String messageAsString = new java.lang.String(message.getContent());
    android.util.Log.d(((de.ifgi.sc.smartcitiesapp.main.MainActivity.TAG) + " P2P"), ("Lost sight of message: " + messageAsString));
}

public java.lang.String getAirCode() {
    android.util.Log.i(model.SingleFlightResult.TAG, "getAirCode: ");
    return airCode;
}

@android.databinding.BindingAdapter(value = "humanReadableByteCount")
public static void setHumanReadableByteCount(android.widget.TextView textView, long byteCount) {
    textView.setText(cz.koto.misak.dbshowcase.android.mobile.utility.FileUtils.humanReadableByteCount(byteCount, false));
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    android.util.Log.i(com.aasavari.inventoryapp.EditorActivity.LOG_TAG, "Aasavari: onLoaderReset");
    mName.setText("");
    mPrice.setText("");
    mQuantity.setText("");
    mSupplier.setText("");
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference mute, java.lang.Object val) {
    java.lang.String newVal = ((java.lang.String) (val));
    uname.setSummary(newVal);
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    writeResult("0\n");
    setResult(3);
    finish();
}

@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    item.setChecked(true);
    mDrawerLayout.closeDrawers();
    return true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GlobalVariables.CUSTOMER_PHONE_NUM = com.example.FundigoApp.StaticMethod.FileAndImageMethods.getCustomerPhoneNumFromFile(this);
    if (GlobalVariables.IS_PRODUCER) {
        createProducerMainPage();
    }else {
        customerLogin();
        createCustomerMainPage();
        com.example.FundigoApp.MainActivity.EXIT = false;
    }
}

public void onClick(android.content.DialogInterface dialog, int which) {
    startActivity(new android.content.Intent(this, com.inst.mobileinstitutions.HomeActivity.class));
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d(TAG, "onSaveInstanceState - start");
    super.onSaveInstanceState(outState);
    outState.putInt(DetailActivity.DATABASE_ID, model.getDbId());
    android.util.Log.d(TAG, "onSaveInstanceState - finish");
}

private void updateMoviePosters() {
    com.blogspot.nagellaranjith.android.popularmoviesstage1.MainActivityFragment.FetchMovieTask fetchMoviePosters = new com.blogspot.nagellaranjith.android.popularmoviesstage1.MainActivityFragment.FetchMovieTask();
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String sort_order = sharedPreferences.getString(getString(R.string.pref_sort_order), "popularity.desc");
    fetchMoviePosters.execute(sort_order);
}

public void setProgress(int progress) {
    android.content.Context context = itemView.getContext();
    java.lang.String tips = context.getString(R.string.card_progress_caption_tips, progress);
    mBinding.progressCaptionTips.setText(tips);
    mBinding.progressMeter.setProgressValue(progress);
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    if (((getIndicator()) != null) && ((getIndicator().getTranslateState()) == (CustomPagerIndicator.STATE_MOVING))) {
        return true;
    }
    return isCanSliding;
}

@java.lang.Override
public void onNext(java.util.List<android.util.Pair<de.elanev.studip.android.app.backend.datamodel.Event, de.elanev.studip.android.app.backend.datamodel.Course>> pairs) {
    addEvents(pairs);
}

public void updateImage(android.graphics.Bitmap image) {
    ((android.widget.ImageView) (getView().findViewById(R.id.image))).setImageBitmap(image);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    openCameraForVideos(addVideo);
}

public void refresh(android.view.View view) {
    clearCurrentBusMarkers();
    try {
        busLocationRequest();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String jasonFromFile = readSavedData();
    com.google.gson.Gson json = new com.google.gson.Gson();
    com.petrsu.cardiacare.smartcarequestionnaire.Questionnaire qst = json.fromJson(jasonFromFile, com.petrsu.cardiacare.smartcarequestionnaire.Questionnaire.class);
    com.petrsu.cardiacare.smartcarequestionnaire.MainActivity.questionnaire = qst;
    printQuestionnaire(com.petrsu.cardiacare.smartcarequestionnaire.MainActivity.questionnaire);
}

public void setPiece(dimitris.android.chessviews.Pieces.Piece piece) {
    if (piece != null) {
        piece.setPositionCoords(row, col);
        this.piece = piece;
    }
}

private android.net.Uri appendTestParam(android.net.Uri uri) {
    try {
        return org.mozilla.gecko.background.db.DelegatingTestContentProvider.appendUriParam(uri, BrowserContract.PARAM_IS_TEST, "1");
    } catch (java.lang.Exception e) {
    }
    return null;
}

public void release() {
    continueLoadingHandler.removeCallbacksAndMessages(null);
    manifestFetcher.release();
    for (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper sampleStreamWrapper : sampleStreamWrappers) {
        sampleStreamWrapper.release();
    }
}

protected void onStatusError(net.datafans.android.common.data.service.BaseResponse response) {
    android.util.Log.e("statusError", response.toString());
    android.widget.Toast toast = android.widget.Toast.makeText(this, response.getErrorMsg(), Toast.LENGTH_SHORT);
    toast.show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.alexpol.alexminiapp.RecyclerViewAdapter.clickListener.onItemClick(getAdapterPosition(), v);
}

public void setShadowColor(@android.support.annotation.ColorInt
int color) {
    if (color != (mShadowColor)) {
        setShadowInternal(mShadowRadius, color);
        invalidate();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("TAG", "Canceling adding of Student");
    if ((delegate) != null)
        delegate.onCancel();
    
}

public void onClick(android.content.DialogInterface dialog, int arg1) {
    android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
    editor.putBoolean("EULA", false);
    editor.commit();
    finish();
}

public boolean isInAirplaneMode(android.content.Context context) {
    return (Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0)) != 0;
}

public void setEnabled() {
    if ((org.csploit.android.core.ChildManager.handlers) != null) {
        mEnabled = ChildManager.handlers.contains(mHandler);
    }
}

public void insertImage(android.graphics.Bitmap bitmap) {
    getImageExtensions().InsertImage(bitmap, (-1));
}

