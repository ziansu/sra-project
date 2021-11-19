@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    this.dialog_save.dismiss();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(intent, flags, startId);
    java.lang.System.out.println("service starting");
    com.mycompany.geotracker.service.DataMovementService.initial(this);
    return START_NOT_STICKY;
}

public void unflattenComponentName(java.lang.String componentNameString) {
    if (componentNameString.isEmpty())
        return ;
    
    mComponentName = android.content.ComponentName.unflattenFromString(componentNameString);
    mSelectedMediaPlayerPackageName = componentNameString.substring(0, componentNameString.indexOf("/"));
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    org.secuso.privacyfriendlyactivitytracker.persistence.StepCountPersistenceHelper.storeStepCounts(service, context, oldWalkingMode);
    context.getApplicationContext().unbindService(mServiceConnection);
    org.secuso.privacyfriendlyactivitytracker.utils.StepDetectionServiceHelper.stopAllIfNotRequired(false, context);
    org.secuso.privacyfriendlyactivitytracker.receivers.WidgetReceiver.forceWidgetUpdate(context);
}

@java.lang.Override
public void onReadRemoteRssi(android.bluetooth.BluetoothGatt gatt, int rssi, int status) {
    broadcastUpdateRSSI(sentek.drillanddropconfig.services.BluetoothLeService.ACTION_RSSI_AVAILABLE, rssi);
}

@java.lang.Override
public boolean shouldShowRequestPermissionRationale(@android.support.annotation.NonNull
java.lang.String permission) {
    return (Manifest.permission.GET_ACCOUNTS.equals(permission)) && (new de.iweinzierl.worktrack.util.SettingsHelper(this).askAgainForGetAccountsPermission());
}

@java.lang.Override
public void onPageScrollStateChanged(int i) {
}

public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    currentSchedule = adapter3.getItem(pos);
}

@java.lang.Override
public void onFailure() {
    if ((progressBar) != null)
        progressBar.setVisibility(View.GONE);
    
}

public static void setDefaultValues(android.content.Context context) {
    android.preference.PreferenceManager.setDefaultValues(context, Const.APP_PREFS_NAME, Context.MODE_PRIVATE, R.xml.prefs_defaults, false);
}

public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.Nullable
android.graphics.Bitmap icon, boolean tintIcon) {
    return icon(com.danimahardhika.cafebar.CafeBarUtil.toDrawable(mContext, icon), tintIcon);
}

android.webkit.WebView getTopWindow() {
    return webView;
}

public boolean onMenuItemClick(android.view.MenuItem item) {
    java.lang.String task = item.toString();
    previewTask(task);
    return true;
}

@java.lang.Override
public void defocusFragment() {
    if ((activity) != null) {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (activity.getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(edit_text_native.getWindowToken(), 0);
    }
}

public void onAccept(android.view.View v) {
    android.util.Log.i(edu.cs430x.fuschia.geosnap.activity.PictureReviewActivity.TAG, "Started upload to imgur");
    new edu.cs430x.fuschia.geosnap.network.imgur.services.UploadService(createUpload(), this).execute();
    android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
}

@java.lang.SuppressWarnings(value = "WeakerAccess")
protected abstract com.mapbox.matching.v5.MapboxMapMatching.Builder timestamps(@android.support.annotation.Nullable
java.lang.String timestamps);

protected void createLocationRequest() {
    this.mLocationRequest = new com.google.android.gms.location.LocationRequest();
    this.mLocationRequest.setInterval(Constants.UPDATE_INTERVAL_IN_MILLISECONDS);
    this.mLocationRequest.setFastestInterval(Constants.FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS);
    this.mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
}

private android.content.ContentValues monitoringAreaToContentValues(de.jordsand.birdcensus.core.MonitoringArea area) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(BirdCountContract.MonitoringArea.COLUMN_NAME_CODE, area.getCode());
    values.put(BirdCountContract.MonitoringArea.COLUMN_NAME_NAME, area.getName());
    return values;
}

@java.lang.Override
public void draw(android.graphics.Canvas canvas, com.nextgis.maplib.map.MapDrawable mapDrawable) {
    if ((mMapPoint) != null) {
        mOverlayPoint.setCoordinates(mMapPoint);
        drawOverlayItem(canvas, mOverlayPoint);
    }
}

public void sendEditorStateChangedIntent() {
    sendBroadcastIntent(org.solovyev.android.calculator.CalculatorBroadcaster.ACTION_EDITOR_STATE_CHANGED);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.estimote.sdk.EstimoteSDK.initialize(getApplicationContext(), "maaswaal-college-veenseweg-15t", "4302f89a2ec3d5c5ec15596a0e1079d0");
}

public static void verifyPhoneToken(@android.support.annotation.NonNull
java.lang.String token, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    if (token != null) {
        com.airmap.airmapsdk.networking.services.PilotService.verifyToken(token, callback);
    }
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    mApplication.setRestaurants(new java.util.ArrayList<com.example.amish.pickyeaters.helpers.Restaurant>());
}

public void debug(java.lang.String message, java.lang.Throwable throwable, java.lang.Object... arguments) {
    if (android.util.Log.isLoggable(tag, Log.DEBUG)) {
        android.util.Log.d(tag, java.text.MessageFormat.format(message, arguments), throwable);
    }
}

@java.lang.Override
public void handleCallSessionEvent(int event) {
    if ((mHandler) == null) {
        return ;
    }
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_HANDLE_CALL_SESSION_EVENT, event).sendToTarget();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (android.support.compat.BuildConfig.DEBUG)
        android.util.Log.d(iso.piotrowski.marek.nyndro.RemainderService.RemainderService.TAG, "onStartCommand: [service] start");
    
    doRemind();
    return START_NOT_STICKY;
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.example.android.finder.Models.DeveloperResponse> call, java.lang.Throwable t) {
    response_message("Could Not Get List");
}

public void run() {
    cauldron.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.chemistryGameText));
    currQuestion += 1;
    movePotion = true;
    setUp();
}

private void setInitialDate(java.util.Calendar date) {
    dateEditText.setText(android.text.format.DateUtils.formatDateTime(getApplicationContext(), date.getTimeInMillis(), ((android.text.format.DateUtils.FORMAT_SHOW_DATE) | (android.text.format.DateUtils.FORMAT_SHOW_YEAR))));
}

@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    this.setInfo(this);
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int position, long arg3) {
    intent.putExtra("dayIndex", java.lang.Integer.toString(position));
    this.startActivity(intent);
}

private void openBackgroundThread() {
    backgroundThread = new android.os.HandlerThread("camera_background_thread");
    backgroundThread.start();
    backgroundHandler = new android.os.Handler(backgroundThread.getLooper());
}

@java.lang.Override
public void onClick(android.view.View view, int position) {
    mDrawerLayout.closeDrawer(GravityCompat.START);
    ((materialtest.sanjose.venkata.activities.MovieTabActivity) (getActivity())).onDrawerItemClicked((position - 1));
}

public void bindViewPager(int viewPagerId) {
    android.support.v4.view.ViewPager vPager = ((android.support.v4.view.ViewPager) (getRootView().findViewById(viewPagerId)));
    bindViewPager(vPager);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    m_prefsListener = new com.brightsilence.dev.androidphotobackup.PhotoBackupSettingsActivity.PhotoBackupPreferenceChanged(this);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    if (org.kore.kolabnotes.android.Utils.getReloadDataAfterDetail(this)) {
        org.kore.kolabnotes.android.Utils.setReloadDataAfterDetail(this, false);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map_select);
    msif.onCreate(this);
}

@java.lang.Override
public void onResult(com.mobvoi.android.wearable.MessageApi.SendMessageResult result) {
    if (result.getStatus().isSuccess()) {
        com.mobvoi.android.test.Utils.setText(this, "send", fh);
    }
}

public void takePicture(final android.hardware.Camera.PictureCallback callback) {
    if ((mCamera) != null) {
        mCamera.takePicture(mShutterCallback, null, callback);
        android.widget.Toast.makeText(getContext(), R.string.shutter, Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onFragmentCreated(int fragmentNumber) {
    fragmentsReadyArray[fragmentNumber] = true;
    if (isAllFragmentsCreated())
        notifyFragments();
    
}

public static void turnOnReminders(android.content.Context context, org.a5calls.android.a5calls.model.AccountManager manager) {
    if (manager.getAllowReminders(context)) {
        org.a5calls.android.a5calls.model.NotificationUtils.setNotificationTime(context, manager.getReminderMinutes(context));
    }else {
        org.a5calls.android.a5calls.model.NotificationUtils.clearNotifications(context);
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
}

private void putDate(android.content.ContentValues values) {
    values.put("date", mCurDate);
}

@java.lang.Override
public void onDestroy() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(UARTStatusChangeReceiver);
    super.onDestroy();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    dismiss();
    long profileSqlId = id;
    eu.chessdata.services.TournamentService.startActionTournamentAddPlayer(getContext(), mTournamentSqlId, profileSqlId);
    dismiss();
}

public void onClick(android.view.View v) {
    try {
    } catch (java.lang.Exception e) {
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    editedOrDeletedCall.call(null);
    listener.onApplyFilterEntry(entriesNames[which]);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    initUI();
    getMoviesByType();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    openUserEditor(arrayUsersId[position]);
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent i = new android.content.Intent(this, com.byteshop.slidingpanel.SlidingPanel.class);
    startActivity(i);
}

public void addBitmapToCache(java.lang.String url, android.graphics.Bitmap bitmap) {
    if ((mCache.get(url)) == null) {
        mCache.put(url, bitmap);
    }
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    v.getParent().getParent().requestDisallowInterceptTouchEvent(true);
    return false;
}

@java.lang.Override
public android.graphics.Bitmap getDefaultVideoPoster() {
    if ((mActivity) == null) {
        return null;
    }
    final android.content.res.Resources resources = mActivity.getResources();
    return android.graphics.BitmapFactory.decodeResource(resources, android.R.drawable.spinner_background);
}

@java.lang.Override
public void onClick(android.view.View v) {
    method("1");
}

@java.lang.Override
public void onDiskMoved(com.po.sample.hanoi.DiskView disk) {
}

@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    directionItem = menu.findItem(R.id.action_direction);
    directionItem.setChecked(com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound);
    directionItem.setVisible(true);
}

@java.lang.Override
public void setUnselected() {
    setTextColor(android.support.v4.content.ContextCompat.getColor(getContext(), unselected_color));
    if ((unselected_image) != 0)
        setCompoundDrawablesWithIntrinsicBounds(null, android.support.v4.content.ContextCompat.getDrawable(getContext(), unselected_image), null, null);
    
}

public void showAssignment(android.view.View view) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    org.team2635.scoutnetclient.fragments.AssignmentsFragment fragment = new org.team2635.scoutnetclient.fragments.AssignmentsFragment();
    fragmentTransaction.add(R.id.assignment_container, fragment);
    fragmentTransaction.commit();
}

private void prepareAdapter() {
    adapter = new org.upv.ccupeiro.contadroid.main.view.adapter.MainCardAdapter(mockListCards());
    rvPaidExpenses.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    rvPaidExpenses.setAdapter(adapter);
}

public static void setUsingAlternateTypefaceAndForcedLocale(android.content.Context context, boolean useAlternateTypeface, int localeCode) {
    br.com.carlosrafaelgn.fplay.ui.UI.isUsingAlternateTypeface = useAlternateTypeface;
    if (!(br.com.carlosrafaelgn.fplay.ui.UI.setForcedLocale(context, null, localeCode)))
        br.com.carlosrafaelgn.fplay.ui.UI.setUsingAlternateTypeface(context, useAlternateTypeface);
    
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mHVVideoController.displayPlayImg();
    mHVVideoController.setCurrentTime(0);
    mHVVideoController.setSeekBarProgress(0);
    mHVVideoController.setSeekBarSecondaryProgress(0);
    mHVVideoView.stopTimer();
    mHVVideoView.seekTo(0);
}

@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    for (int appWidgetId : appWidgetIds) {
        android.vassilis.wifionoff.WifiWidget.updateAppWidget(context, appWidgetManager, appWidgetId);
    }
}

private int removeView(android.support.v4.view.ViewPager pager, int position) {
    pager.setAdapter(null);
    cardDetails.remove(position);
    pager.setAdapter(this);
    this.notifyDataSetChanged();
    return position;
}

public void changeTaskStatus(java.util.UUID uuid, java.lang.String status) {
    vn.com.baohq.simpletodo.data.TaskItem taskItem = getTaskById(uuid);
    taskItem.setStatus(status);
    updateTask(taskItem);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_add_file, container);
}

@org.androidannotations.annotations.AfterViews
void init() {
    manageCookies();
    getGlobalConfig();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_user_login);
    butterknife.ButterKnife.bind(this);
}

private void setCourseSection() {
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    crux.bphc.cms.fragments.CourseSectionFragment courseSectionFragment = crux.bphc.cms.fragments.CourseSectionFragment.newInstance(app.Constants.TOKEN, course.getCourseId());
    fragmentTransaction.replace(R.id.course_section_enrol_container, courseSectionFragment, "course_section_frag").commit();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
}

@java.lang.Override
public void onStop() {
    super.onStop();
    java.lang.System.out.println("ON STOP");
}

@java.lang.Override
public void onServiceInterestExpressedSuccess(java.lang.String msg) {
    setResult(humane.vuram.com.humane.displayservicedetail.RESULT_OK);
    this.finish();
}

@java.lang.Override
public void onLost(com.google.android.gms.nearby.messages.Message message) {
    android.util.Log.d(((de.ifgi.sc.smartcitiesapp.main.MainActivity.TAG) + " P2P"), ("Lost sight of message: " + message));
}

public java.lang.String getAirCode() {
    return airCode;
}

@android.databinding.BindingAdapter(value = "humanReadableByteCount")
public static void setHumanReadableByteCount(android.widget.TextView textView, long byteCount) {
    textView.setText(cz.koto.misak.dbshowcase.android.mobile.utility.FileUtils.humanReadableByteCount(byteCount, true));
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    mName.setText("");
    mPrice.setText("");
    mQuantity.setText("");
    mSupplier.setText("");
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference mute, java.lang.Object val) {
    java.lang.String newVal = ((java.lang.String) (val));
    uname.setSummary(newVal);
    return true;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    setResult(3);
    finish();
}

@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    mDrawerLayout.closeDrawers();
    return true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GlobalVariables.CUSTOMER_PHONE_NUM = com.example.FundigoApp.StaticMethod.FileAndImageMethods.getCustomerPhoneNumFromFile(this);
    customerLogin();
    createCustomerMainPage();
    com.example.FundigoApp.MainActivity.EXIT = false;
}

public void onClick(android.content.DialogInterface dialog, int which) {
    context.startActivity(new android.content.Intent(context, com.inst.mobileinstitutions.HomeActivity.class));
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d(TAG, "onSaveInstanceState - start");
    outState.putInt(DetailActivity.DATABASE_ID, model.getDbId());
    super.onSaveInstanceState(outState);
    android.util.Log.d(TAG, "onSaveInstanceState - finish");
}

private void updateMoviePosters() {
    com.blogspot.nagellaranjith.android.popularmoviesstage1.MainActivityFragment.FetchMovieTask fetchMoviePosters = new com.blogspot.nagellaranjith.android.popularmoviesstage1.MainActivityFragment.FetchMovieTask();
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    sort_order = sharedPreferences.getString(getString(R.string.pref_sort_order), "popularity.desc");
    fetchMoviePosters.execute(sort_order);
}

public void setProgress(int progress) {
    mBinding.progressMeter.setProgressValue(progress);
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    if (((getIndicator()) != null) && ((getIndicator().getTranslateState()) == (CustomPagerIndicator.STATE_MOVING))) {
        return false;
    }
    return isCanSliding;
}

@java.lang.Override
public void onNext(android.util.Pair<de.elanev.studip.android.app.backend.datamodel.Event, de.elanev.studip.android.app.backend.datamodel.Course> pairs) {
    addEvents(pairs);
}

public void updateImage(android.graphics.Bitmap image) {
    if ((getView()) != null)
        ((android.widget.ImageView) (getView().findViewById(R.id.image))).setImageBitmap(image);
    
}

public void onClick(android.content.DialogInterface dialog, int which) {
    openCameraForVideos();
}

public void refresh(android.view.View view) {
    try {
        busLocationRequest();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
}

public void setPiece(dimitris.android.chessviews.Pieces.Piece piece) {
    if (piece != null) {
        piece.setPositionCoords(row, col);
    }
    this.piece = piece;
}

private android.net.Uri appendTestParam(android.net.Uri uri) {
    return org.mozilla.gecko.background.db.DelegatingTestContentProvider.appendUriParam(uri, BrowserContract.PARAM_IS_TEST, "1");
}

public void release() {
    continueLoadingHandler.removeCallbacksAndMessages(null);
    manifestFetcher.release();
    if ((sampleStreamWrappers) != null) {
        for (com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper sampleStreamWrapper : sampleStreamWrappers) {
            sampleStreamWrapper.release();
        }
    }
}

@java.lang.Override
public void onStatusError(net.datafans.android.common.data.service.BaseResponse response) {
    android.util.Log.e("statusError", response.toString());
    android.widget.Toast toast = android.widget.Toast.makeText(this, response.getErrorMsg(), Toast.LENGTH_SHORT);
    toast.show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.alexpol.alexminiapp.RecyclerViewAdapter.clickListener.onItemClick(getAdapterPosition(), view);
}

public void setShadowColor(@android.support.annotation.ColorInt
int color) {
    if (color != (mShadowColor)) {
        setShadowInternal(mShadowRadius, color, true);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((delegate) != null)
        delegate.onCancel();
    
}

public void onClick(android.content.DialogInterface dialog, int arg1) {
    finish();
}

public boolean isInAirplaneMode(android.content.Context context) {
    if (context == null) {
        return true;
    }
    return (Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0)) != 0;
}

public void setEnabled() {
    mEnabled = ((org.csploit.android.core.ChildManager.handlers) != null) && (ChildManager.handlers.contains(mHandler));
}

public void insertImage(android.graphics.Bitmap bitmap) {
    getImageExtensions().insertImage(bitmap, (-1));
}

