@java.lang.Override
public void onGeoQueryReady() {
    java.lang.System.out.println("All initial data has been loaded and events have been fired!");
}

@java.lang.Override
public void onClick(android.view.View view) {
    startCreateJournalEntryActivity(view, journalId, journalName);
}

public static mn.aug.restfulandroid.security.AuthorizationManager getInstance(android.content.Context context) {
    if ((mn.aug.restfulandroid.security.AuthorizationManager.mInstance) == null) {
        mn.aug.restfulandroid.security.AuthorizationManager.mInstance = new mn.aug.restfulandroid.security.AuthorizationManager(context);
    }
    return mn.aug.restfulandroid.security.AuthorizationManager.mInstance;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_detail);
    if (savedInstanceState == null)
        getSupportFragmentManager().beginTransaction().add(R.id.details_container, new com.example.mlanka.popularmovies.MovieDetailActivityFragment()).commit();
    
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    animating = true;
    setTouchAble(false);
}

public void submitAnswer(android.view.View view) {
    java.lang.String selectedValue = ((android.widget.Button) (view)).getText().toString();
    com.codequest.main.GameController.getGameController().update(selectedValue);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    if (watchdog) {
        com.hijacker.MainActivity.watchdog_thread = new java.lang.Thread(com.hijacker.MainActivity.watchdog_runnable);
        com.hijacker.MainActivity.watchdog_thread.start();
    }
}

public void clearKeyguardWallpaper() {
    if (com.android.server.wallpaper.WallpaperManagerService.DEBUG)
        android.util.Slog.v(com.android.server.wallpaper.WallpaperManagerService.TAG, "clearWallpaper");
    
    synchronized(mLock) {
        clearKeyguardWallpaperLocked(android.os.UserHandle.getCallingUserId(), null);
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mPresentType = getResources().getStringArray(R.array.present_types);
    buildLoginDialog();
    mLoginDialog.show();
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int w, int h) {
    android.util.Log.i("guoli", "========surfaceChanged =============");
}

@java.lang.Override
public void onPanelSlide(android.view.View panel, float slideOffset) {
    slide_tab_text.setText("");
}

protected final void postNotification(android.support.v4.app.NotificationCompat.Builder builder, short notificationId) {
    module.postNotification(builder, notificationId);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((((("CREATE TABLE " + (com.gotwingm.my.meditation.RemindersDBHelper.TABLE_NAME)) + " (_ID INTEGER PRIMARY KEY AUTOINCREMENT, ") + (com.gotwingm.my.meditation.RemindersDBHelper.ACTION)) + " TEXT);"));
}

public void onDestroyActionMode(android.view.ActionMode mode) {
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        questionListPresenter.handleDeepLinks(getIntent());
        questionListPresenter.loadQuestions();
    }
}

public static boolean isAutoincrement(android.support.database.Column column) {
    return (column.isPrimaryKey()) && (android.support.database.util.TableUtil.isIntegerType(column.getType()));
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "set pwm success");
    done();
}

@java.lang.Override
public void onClick(co.snagapp.android.Sms sms) {
    numbers.add(sms);
    dataPersister.addNumberToBlockedNumbers(sms.getId());
    onBackPressed();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.mahovd.bignerdranch.criminalintent.Crime crime = mCrimes.get(position);
    return com.mahovd.bignerdranch.criminalintent.CrimeFragment.newInstance(crime.getId(), false);
}

@java.lang.Override
public void onUploadCompleted() {
    android.util.Log.d(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.TAG, "Upload Completed");
    startCamera();
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    return false;
}

public void bleNoBtAdapter() {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_NO_BT_ADAPTER);
    sendBroadcast(intent);
}

private void showTimePickerDialog(android.view.View view) {
    com.example.framgia.hrm_10.controller.time.DatePickerFragment showTime = new com.example.framgia.hrm_10.controller.time.DatePickerFragment().setTextViewBirthday(mTextViewBirthday);
    showTime.show(getSupportFragmentManager(), Settings.DATE_PICKER);
}

public com.google.blockly.blocks.Block.Builder setPosition(int x, int y) {
    mPosition.x = x;
    mPosition.y = y;
    return this;
}

@java.lang.Override
protected void onDestroy() {
    storeIP();
    super.onDestroy();
}

@java.lang.Override
public void run() {
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    onSingleTapUp(event);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    sharedPreference.addFavorite(myContext, places.get(position));
    java.lang.String temp = java.lang.String.valueOf(position);
}

private void showNetworkError() {
    android.support.v4.app.DialogFragment networkErrorFragment = new com.arjanvlek.cyngnotainfo.views.NetworkErrorFragment();
    networkErrorFragment.show(getFragmentManager(), "NetworkError");
}

public void setListAdapter(android.widget.ListAdapter adapter) {
    synchronized(this) {
        mAdapter = adapter;
        mList.setAdapter(mAdapter);
    }
}

@java.lang.Override
public void onSuccess(com.quickblox.users.model.QBUser result, android.os.Bundle params) {
    android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.ListUsersActivity.TAG, "onSuccess login to chat with params");
    android.content.Intent intent = new android.content.Intent(this, com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.class);
    intent.putExtra("login", login);
}

private void closeDatabaseNow(java.lang.String dbName) {
    android.database.sqlite.SQLiteDatabase mydb = this.getDatabase(dbName);
    if (mydb != null) {
        mydb.close();
    }
}

void keepState(boolean state) {
    if (state) {
        changeToActive();
    }else {
        changeToInactive();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    int mPosition = mPendingDeleteItemPosition;
    mPendingDeleteItemPosition = android.support.v7.widget.RecyclerView.NO_POSITION;
    notifyItemChanged(mPosition);
}

@java.lang.Override
protected void onCancelled() {
    super.onCancelled();
    synchronized(mPauseWorkLock) {
        mPauseWorkLock.notifyAll();
    }
}

public void sendPauseStopMessage(android.view.View view) {
}

private void setDateToView(int viewId) {
    com.example.eliasvensson.busify.DateDialog dialog = new com.example.eliasvensson.busify.DateDialog(findViewById(viewId), this);
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    dialog.show(ft, "DatePicker");
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    m = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(currentPos).draggable(false));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(currentPos, 16));
}

protected void loadMap(com.google.android.gms.maps.GoogleMap googleMap) {
    map = googleMap;
    if ((map) != null) {
        addMarkersToMap();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((R.id.submitButtonEditCard) == (view.getId())) {
        submitEdits();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((objSummaryMatrix) == null)
        objSummaryMatrix = new com.example.swsahu.duplicatecardgame.SummaryMatrix(new java.lang.ref.WeakReference(CurrentGame), CardHeight, CardWidth);
    
    objSummaryMatrix.SetMatrixType(objSummaryMatrix.MOVE_TRACE);
    objSummaryMatrix.CreateMatrix();
}

public static com.z4.zoptimization.ZOptimization get(android.content.Context context) {
    return new com.z4.zoptimization.ZOptimization(context);
}

public void startReceivingToken(android.view.View view) {
    isStarted = true;
    updateButtons();
    tokenValueTextView.setText("");
    title22.setText("Awaiting Transfer...");
    startReceiverService();
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) throws com.tonilopezmr.easysqlite.exception.SQLiteHelperException {
    for (java.lang.String table : tables) {
        db.execSQL(table);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
}

public void updateDataSet(int position) {
    android.util.Log.i("Gracker", ("update position =" + position));
    arrayList.remove(position);
    notifyDataSetChanged();
}

@java.lang.Override
public void onFailure(java.lang.Throwable throwable) {
    callback.onCreateCaseError(new com.desk.android.sdk.error.ErrorResponse(throwable));
}

private void drawNextMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 1);
    drawMonth(canvas, calendarWithFirstDayOfMonth, ((height) * ((-(monthsScrolledSoFar)) + 1)));
}

public void restoreActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
    actionBar.setTitle(mTitle);
}

public static void init(android.app.Activity act) {
    com.ryangame.pet.jni.Helper.mCanvas = new android.graphics.Canvas();
    com.ryangame.pet.jni.Helper.mPaint = new android.graphics.Paint();
    com.ryangame.pet.jni.Helper.mActivity = act;
}

@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    getDelegate().onPostCreate(savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.rmr.ngusarov.geoquiz.CheatActivity.class);
    i.putExtra(com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.QUEST_INDEX_TRUE_FALSE_PARAMETR, com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.questArr[counter].isQuestionResult());
    startActivityForResult(i, 0);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    com.gcw.sapienza.places.MainActivity.isForeground = false;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    final int lastSelectedPosition = org.droidplanner.android.activities.LocatorActivity.lastPositions.indexOf(selectedMsg);
    outState.putInt(org.droidplanner.android.activities.LocatorActivity.STATE_LAST_SELECTED_POSITION, lastSelectedPosition);
}

public static void show(android.support.v7.app.AppCompatActivity activity, org.onebusaway.android.io.elements.ObaStop stop) {
    org.onebusaway.android.report.ui.ReportStopProblemFragment.show(activity, stop, null);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    mapView.onSaveInstanceState(outState);
}

@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    doFling(e1, e2, (-velocityX), (-velocityY));
    return false;
}

private void readFromParcel(android.os.Parcel in) {
    unitIds = new java.util.ArrayList<>();
    in.readList(unitIds, null);
}

private android.widget.CheckBox removeSupport(android.view.View convertView, int id) {
    android.widget.CheckBox check = ((android.widget.CheckBox) (convertView.findViewById(id)));
    check.setVisibility(View.GONE);
    return check;
}

@android.annotation.TargetApi(value = 14)
public static int getNavigationBarHeight(android.app.Activity activity) {
    com.gyf.barlibrary.BarConfig config = new com.gyf.barlibrary.BarConfig(activity);
    return config.getNavigationBarHeight();
}

public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {
}

@java.lang.Override
public void onScreenStarted() {
    android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listDoneMaster.TAG, "calling onScreenStarted()");
    checkDeleteBtnVisibility();
}

public void updateTask(vn.com.baohq.simpletodo.data.TaskItem taskItem) {
    android.content.ContentValues values = getContentValues(taskItem);
    vn.com.baohq.simpletodo.data.DataManager.mDbHelper.update(TaskEntry.TABLE_NAME, values, ((TaskEntry.COLUMN_TASK_ID) + " = ?"), new java.lang.String[]{ taskItem.getId().toString() });
}

private void reloadDimens() {
    android.content.res.Resources res = mContext.getResources();
    mIconSize = res.getDimensionPixelSize(R.dimen.status_bar_icon_size);
    mIconHPadding = res.getDimensionPixelSize(R.dimen.status_bar_icon_padding);
    mIconWidth = context.getResources().getDimensionPixelSize(R.dimen.status_bar_icon_size);
}

@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
    if ((mIsPrepressed) && ((mPressedView) != null)) {
        mIsShowPress = true;
    }
}

@java.lang.Override
public void onRemoveChannelMember(java.lang.String userId) {
    android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, (userId + " exit channel"));
    removeUser(userId);
    if ((mProxy) != null)
        mProxy.onRemoveChannelMember(userId);
    
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    sendUpdate();
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.System.exit(0);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
}

@java.lang.Override
public void onDestroy() {
    isRunning = false;
    android.util.Log.i(com.grayraven.robotexample.MyService.TAG, "Service onDestroy");
    super.onDestroy();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mPublisher.switchCameraFace((((mPublisher.getCamraId()) + 1) % (android.hardware.Camera.getNumberOfCameras())));
}

@java.lang.Override
public void onCaptureCompleted(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session, @android.support.annotation.NonNull
android.hardware.camera2.CaptureRequest request, @android.support.annotation.NonNull
android.hardware.camera2.TotalCaptureResult result) {
    super.onCaptureCompleted(session, request, result);
}

public void onScanCompleted(java.lang.String path, android.net.Uri uri) {
}

public void setFrameInScene(android.graphics.RectF frameInScene) {
    this.frameInScene = frameInScene;
}

@java.lang.Override
public void onError(android.content.Context context, java.lang.Exception e) {
    progress.setVisibility(View.GONE);
    mLogcatSummary.setText(errorText);
    mLogcatSummary.setTextColor(errorTextColor);
    e.printStackTrace();
}

@java.lang.Override
public void onBackPressed() {
    if ((this.task) != null) {
        this.task.setRunning(false);
    }
    super.onBackPressed();
}

@java.lang.Override
public void onEvent(int eventType, android.os.Bundle params) {
    printe(((("onEvent: type " + eventType) + ", with params: ") + (toString(params))));
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
    return dialog;
}

public void onClick(android.view.View view) {
    java.lang.Thread thread = new java.lang.Thread(mutiThread);
    thread.start();
}

void handleTag() {
    cordova.getThreadPool().execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.util.Log.d(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("handleTag " + (savedTag)));
            fireTagEvent(savedTag);
        }
    });
}

@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, ItemsContract.Items.buildItemUri(getItemId(vh.getAdapterPosition()))));
}

public int getCurrent() {
    java.lang.String str = java.lang.String.valueOf(((android.widget.TextView) (mText)).getText());
    validateCurrentView(str, true);
    return mCurrent;
}

private void showStopProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    org.onebusaway.android.report.ui.ReportStopProblemFragment.show(this, obaStop, R.id.ri_report_stop_problem);
}

static void updatePublishDateIfShouldBePublishedImmediately(org.wordpress.android.fluxc.model.PostModel postModel) {
    if (org.wordpress.android.ui.posts.PostUtils.shouldPublishImmediately(postModel)) {
        postModel.setDateCreated(org.wordpress.android.util.DateTimeUtils.iso8601FromDate(new java.util.Date()));
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkAnswer(false);
    updateQuestion();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    savedInstanceState.putInt(com.example.android.sunshine.app.ForecastFragment.LIST_POSITION, mSelectedPosition);
    super.onSaveInstanceState(savedInstanceState);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    buildGoogleApiClient();
}

@android.support.annotation.NonNull
@java.lang.Override
public java.lang.Object clone() {
    super.clone();
    byte[] result = new byte[data.length];
    java.lang.System.arraycopy(data, 0, result, 0, data.length);
    return new jp.kshoji.javax.sound.midi.MetaMessage(result);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return stepListFragment;
        case 1 :
            return ingredientListFragment;
        default :
            return null;
    }
}

@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    didReceiveError = true;
    pageIsLoaded = false;
    ViewPagerDownloadManager.instance.done(this, false);
    showErrorMessage(R.string.network_error_message, FontAwesomeIcons.fa_exclamation_circle);
}

void clear(android.transition.Transition.TransitionListener transitionListener) {
    transition.removeListener(transitionListener);
    this.transitionListener = null;
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception exception) {
    android.widget.Toast.makeText(this, (item + " does not exist"), Toast.LENGTH_SHORT).show();
}

public void updateAppInfo(com.dkanada.openapk.AppInfo appInfo) {
    removeAppInfo(appInfo);
    addAppInfo(appInfo);
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    userSelect = true;
    return false;
}

@java.lang.Override
public void onUnhandledKeyEvent(android.webkit.WebView view, android.view.KeyEvent event) {
    if (!(mInForeground)) {
        return ;
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    isLong = true;
    start();
    return true;
}

int addAlarm() {
    return addAlarm(true, "fully_charged", "", "notification", false, true);
}

