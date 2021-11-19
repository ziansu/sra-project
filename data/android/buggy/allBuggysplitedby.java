@java.lang.Override
public void onGeoQueryReady() {
    java.lang.System.out.println("All initial data has been loaded and events have been fired!");
    android.widget.Toast.makeText(this, "service ready", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    startCreateJournalEntryActivity(view, journalId, journalName);
    android.widget.Toast.makeText(this, ("Add to: " + journalId), Toast.LENGTH_SHORT).show();
}

public static mn.aug.restfulandroid.security.AuthorizationManager getInstance(mn.aug.restfulandroid.security.Context context) {
    if ((mn.aug.restfulandroid.security.AuthorizationManager.mInstance) == null) {
        mn.aug.restfulandroid.security.AuthorizationManager.mInstance = new mn.aug.restfulandroid.security.AuthorizationManager(context);
    }
    return mn.aug.restfulandroid.security.AuthorizationManager.mInstance;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie_detail);
    getSupportFragmentManager().beginTransaction().add(R.id.details_container, new com.example.mlanka.popularmovies.MovieDetailActivityFragment()).commit();
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    animating = true;
    setTouchAble((!(animating)));
}

public void submitAnswer(android.view.View view) {
    java.lang.String selectedValue = ((android.widget.Button) (view)).getText().toString();
    com.codequest.main.GameController.getGameController(this).update(selectedValue);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    if ((!(com.hijacker.MainActivity.watchdog_thread.isAlive())) && (watchdog)) {
        com.hijacker.MainActivity.watchdog_thread = new java.lang.Thread(com.hijacker.MainActivity.watchdog_runnable);
        com.hijacker.MainActivity.watchdog_thread.start();
    }
}

public void clearKeyguardWallpaper() {
    if (com.android.server.wallpaper.WallpaperManagerService.DEBUG)
        android.util.Slog.v(com.android.server.wallpaper.WallpaperManagerService.TAG, "clearWallpaper");
    
    synchronized(mLock) {
        clearKeyguardWallpaperLocked(android.os.UserHandle.getCallingUserId());
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_main);
    mPresentType = getResources().getStringArray(R.array.present_types);
    buildLoginDialog();
    mLoginDialog.show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    changeActivity(Activities.DESKTOP_SETTING_FERMAT_NETWORK.getCode(), ApplicationConstants.SETTINGS_FERMAT_NETWORK);
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int w, int h) {
    android.util.Log.i("guoli", "========surfaceChanged =============");
    if (needToResetMovieRatio) {
        mDisplaySizeMode = MediaPlayerMovieRatioView.MOVIE_RATIO_MODE_16_9;
        mMediaPlayerVideoView.setVideoLayout(mDisplaySizeMode);
        needToResetMovieRatio = false;
    }
}

@java.lang.Override
public void onPanelSlide(android.view.View panel, float slideOffset) {
    android.util.Log.i("Reid", "panel is sliding");
    slide_tab_text.setText("");
}

protected final void postNotification(int notificationId, android.support.v4.app.NotificationCompat.Builder builder) {
    module.postNotification(notificationId, builder);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((((("CREATE TABLE " + (com.gotwingm.my.meditation.RemindersDBHelper.TABLE_NAME)) + " (_ID INTEGER PRIMARY KEY AUTOINCREMENT, ") + (com.gotwingm.my.meditation.RemindersDBHelper.ACTION)) + " TEXT);"));
    android.util.Log.d("###", "Table created");
}

public void onDestroyActionMode(android.view.ActionMode mode) {
    for (int i = 0; i < (grvNoteList.getCount()); i++) {
        grvNoteList.getChildAt(i).setBackground(getResources().getDrawable(R.drawable.note_background));
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        if (!(questionListPresenter.handleDeepLinks(getIntent()))) {
            questionListPresenter.loadQuestions();
        }
    }
}

public static boolean isAutoincrement(android.support.database.Column column) {
    return (column.isPrimaryKey()) && (android.support.database.util.TableUtil.isIntegerType(column.getClass()));
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "set pwm success");
    if (pwm > 0) {
        updateLightBulb(true);
    }else {
        updateLightBulb(false);
    }
    done();
}

@java.lang.Override
public void onClick(co.snagapp.android.Sms sms) {
    dataPersister.addNumberToBlockedNumbers(sms.getId());
    numbers.add(sms);
    onBackPressed();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.mahovd.bignerdranch.criminalintent.Crime crime = mCrimes.get(position);
    return com.mahovd.bignerdranch.criminalintent.CrimeFragment.newInstance(crime.getId());
}

@java.lang.Override
public void onUploadCompleted() {
    android.util.Log.d(com.wolfpakapp.wolfpak2.camera.editor.PictureEditorLayout.TAG, "Upload Completed");
    com.wolfpakapp.wolfpak2.camera.editor.UndoManager.clearStates();
    startCamera();
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    return super.dispatchTouchEvent(ev);
}

protected void bleNoBtAdapter() {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_NO_BT_ADAPTER);
    sendBroadcast(intent);
}

private void showTimePickerDialog(android.view.View view) {
    android.support.v4.app.DialogFragment showTime = new com.example.framgia.hrm_10.controller.time.DatePickerFragment().setTextViewBirthday(mTextViewBirthday);
    showTime.show(getSupportFragmentManager(), Settings.DATE_PICKER);
}

public com.google.blockly.blocks.Block.Builder setPosition(android.graphics.Point position) {
    mPosition = position;
    return this;
}

@java.lang.Override
protected void onDestroy() {
    storeIP();
    android.os.Process.killProcess(android.os.Process.myPid());
    super.onDestroy();
}

@java.lang.Override
public void run() {
    final android.widget.TextView textView3 = ((android.widget.TextView) (findViewById(R.id.textView3)));
    textView3.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed, Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed.");
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    onSingleTapUp(event);
    onSingleTapUp(event);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    sharedPreference.addFavorite(myContext, places.get(position));
    java.lang.String temp = java.lang.String.valueOf(position);
    android.util.Log.v("position", temp);
}

private void showNetworkError() {
    hideAllInterfaceElements();
    android.support.v4.app.DialogFragment networkErrorFragment = new com.arjanvlek.cyngnotainfo.views.NetworkErrorFragment();
    networkErrorFragment.show(getFragmentManager(), "NetworkError");
}

public void setListAdapter(android.widget.ListAdapter adapter) {
    synchronized(this) {
        org.xbmc.android.util.LOG.D(org.xbmc.android.remote.presentation.controller.FileListController.TAG, "setListAdapter()...");
        mAdapter = adapter;
        mList.setAdapter(mAdapter);
    }
}

@java.lang.Override
public void onSuccess(com.quickblox.users.model.QBUser result, android.os.Bundle params) {
    android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.ListUsersActivity.TAG, "onSuccess login to chat with params");
    android.content.Intent intent = new android.content.Intent(this, com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.class);
    intent.putExtra("login", login);
    startActivity(intent);
}

private void closeDatabaseNow(java.lang.String dbName) {
    android.database.sqlite.SQLiteDatabase mydb = this.getDatabase(dbName);
    if (mydb != null) {
        mydb.close();
        org.pgsqlite.SQLitePlugin.dbmap.remove(dbName);
    }
}

void keepState(int state) {
    switch (state) {
        case android.service.quicksettings.Tile.STATE_ACTIVE :
            changeToActive();
            break;
        case android.service.quicksettings.Tile.STATE_INACTIVE :
            changeToInactive();
            break;
        default :
            break;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    mPendingDeleteItemPosition = android.support.v7.widget.RecyclerView.NO_POSITION;
    int mPosition = viewHolder.getAdapterPosition();
    notifyItemChanged(mPosition);
}

@java.lang.Override
protected void onCancelled(android.graphics.Bitmap bitmap) {
    super.onCancelled(bitmap);
    synchronized(mPauseWorkLock) {
        mPauseWorkLock.notifyAll();
    }
}

public void sendPauseStopMessage(android.view.View view) {
    byte[] message = com.example.acer.taxiapp.MessengerClient.getPauseStopMessage(lastLocation, this);
    tcpClientService.sendBytes(message);
}

private void setDateToView(int viewId) {
    com.example.eliasvensson.busify.DateDialog dialog = new com.example.eliasvensson.busify.DateDialog(findViewById(viewId));
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    dialog.show(ft, "DatePicker");
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    m = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(currentPos).draggable(true));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(currentPos, 16));
}

protected void loadMap(com.google.android.gms.maps.GoogleMap googleMap) {
    map = googleMap;
    if ((map) != null) {
        android.widget.Toast.makeText(getContext(), "Map Fragment was loaded properly!", Toast.LENGTH_SHORT).show();
        addMarkersToMap();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((R.id.submitButtonEditCard) == (view.getId())) {
        submitEdits(view);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((objSummaryMatrix) == null)
        objSummaryMatrix = new com.example.swsahu.duplicatecardgame.SummaryMatrix(new java.lang.ref.WeakReference<com.example.swsahu.duplicatecardgame.Game>(CurrentGame), CardHeight, CardWidth);
    
    objSummaryMatrix.SetMatrixType(objSummaryMatrix.MOVE_TRACE);
    objSummaryMatrix.CreateMatrix();
}

public static com.z4.zoptimization.ZOptimization.ZOptimizationBuilder withContext(android.content.Context context) {
    com.z4.zoptimization.ZOptimization.init(context);
    return com.z4.zoptimization.ZOptimization.get().new ZOptimizationBuilder();
}

public void startReceivingToken(android.view.View view) {
    isStarted = true;
    updateButtons();
    startReceiverService();
    tokenValueTextView.setText("");
    title22.setText("Awaiting Transfer...");
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) throws com.tonilopezmr.easysqlite.exception.SQLiteHelperException {
    if ((tables) == null) {
        throw new com.tonilopezmr.easysqlite.exception.SQLiteHelperException("The array of String tables can't be null!!");
    }
    executePragma(db);
    for (java.lang.String table : tables) {
        db.execSQL(table);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, ("Note " + (v.getId())), Toast.LENGTH_SHORT).show();
}

public void updateDataSet(int position) {
    android.util.Log.i("Gracker", ("update position =" + position));
    arrayList.remove(position);
    notifyDataSetInvalidated();
    notifyDataSetChanged();
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.desk.java.apiclient.model.Case> call, java.lang.Throwable throwable) {
    callback.onCreateCaseError(new com.desk.android.sdk.error.ErrorResponse(throwable));
}

private void drawNextMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 1);
    drawMonth(canvas, calendarWithFirstDayOfMonth, ((width) * ((-(monthsScrolledSoFar)) + 1)));
}

public void restoreActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
    actionBar.setDisplayShowTitleEnabled(true);
    actionBar.setTitle(mTitle);
}

public static void init(android.app.Activity act) {
    com.ryangame.pet.jni.Helper.mCanvas = new android.graphics.Canvas();
    com.ryangame.pet.jni.Helper.mPaint = new android.graphics.Paint();
    com.ryangame.pet.jni.Helper.mActivity = act;
    com.ryangame.pet.jni.Helper.mApp = com.ryangame.pet.AppContext.getInstance();
}

@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    bundle = new android.os.Bundle();
    bundle.putInt("position", position);
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    getDelegate().onPostCreate(savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.rmr.ngusarov.geoquiz.CheatActivity.class);
    i.putExtra(com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.QUEST_INDEX_TRUE_FALSE_PARAMETR, com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.questArr[com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter].isQuestionResult());
    startActivityForResult(i, 0);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    com.gcw.sapienza.places.MainActivity.isForeground = false;
    android.util.Log.d(com.gcw.sapienza.places.MainActivity.TAG, "pause");
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    final int lastSelectedPosition = org.droidplanner.android.activities.LocatorActivity.lastPositions.indexOf(selectedMsg);
    outState.putInt(org.droidplanner.android.activities.LocatorActivity.STATE_LAST_SELECTED_POSITION, lastSelectedPosition);
}

public static void show(android.support.v7.app.AppCompatActivity activity, org.onebusaway.android.io.elements.ObaStop stop, org.onebusaway.android.report.ui.ReportProblemFragmentCallback callback) {
    org.onebusaway.android.report.ui.ReportStopProblemFragment.show(activity, stop, null, callback);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    mapView.onSaveInstanceState(outState);
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    doFling(e1, e2, velocityX, velocityY);
    return false;
}

private void readFromParcel(android.os.Parcel in) {
    in.readList(unitIds, null);
}

private android.widget.CheckBox removeSupport(android.widget.CheckBox check, android.view.View convertView, int id) {
    check = ((android.widget.CheckBox) (convertView.findViewById(id)));
    check.setVisibility(View.GONE);
    return check;
}

@android.annotation.TargetApi(value = 14)
public static int getNavigationBarHeight(android.app.Activity activity) {
    com.gyf.barlibrary.BarConfig config = new com.gyf.barlibrary.BarConfig(activity, true, true);
    return config.getNavigationBarHeight();
}

public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {
    sg.edu.ntu.sce.fyp.calevent.model.DataManager dataMgr = sg.edu.ntu.sce.fyp.calevent.model.DataManager.getInstance();
    if (dataMgr != null) {
        dataMgr.setTimeSlotList(null);
    }
}

@java.lang.Override
public void onScreenStarted() {
    android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listDoneMaster.TAG, "calling onScreenStarted()");
    checkAddBtnVisibility();
    checkDeleteBtnVisibility();
    checkDoneBtnVisibility();
}

private void updateTask(vn.com.baohq.simpletodo.data.TaskItem taskItem) {
    android.content.ContentValues values = getContentValues(taskItem);
    vn.com.baohq.simpletodo.data.DataManager.mDbHelper.update(TaskEntry.TABLE_NAME, values, ((TaskEntry.COLUMN_TASK_ID) + " = ?"), new java.lang.String[]{ taskItem.getId().toString() });
}

private void reloadDimens() {
    android.content.res.Resources res = mContext.getResources();
    mIconSize = res.getDimensionPixelSize(R.dimen.status_bar_icon_size);
    mIconHPadding = res.getDimensionPixelSize(R.dimen.status_bar_icon_padding);
    mIconWidth = res.getDimensionPixelSize(R.dimen.status_bar_icon_size);
}

@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
    if ((mIsPrepressed) && ((mPressedView) != null)) {
        mIsShowPress = true;
    }
    super.onShowPress(e);
}

@java.lang.Override
public void onRemoveChannelMember(java.lang.String userId) {
    android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, (userId + " exit channel"));
    removeUser(userId);
    mProxy.onRemoveChannelMember(userId);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((mTransactionns.size()) != 0)
        sendUpdate();
    
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent homeIntent = new android.content.Intent(android.content.Intent.ACTION_MAIN);
    homeIntent.addCategory(Intent.CATEGORY_HOME);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    getContext().startActivity(homeIntent);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(false);
}

@java.lang.Override
public void onDestroy() {
    isRunning = false;
    android.util.Log.i(com.grayraven.robotexample.MyService.TAG, "Service onDestroy");
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((android.hardware.Camera.getNumberOfCameras()) > 0) {
        mPublisher.switchCameraFace((((mPublisher.getCamraId()) + 1) % (android.hardware.Camera.getNumberOfCameras())));
    }
}

@java.lang.Override
public void onCaptureCompleted(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session, @android.support.annotation.NonNull
android.hardware.camera2.CaptureRequest request, @android.support.annotation.NonNull
android.hardware.camera2.TotalCaptureResult result) {
    super.onCaptureCompleted(session, request, result);
    android.media.Image image = cameraImageReader.acquireNextImage();
    java.lang.System.out.println("Woohoo");
    unlockFocus();
}

public void onScanCompleted(java.lang.String path, android.net.Uri uri) {
    android.util.Log.i("ExternalStorage", (("Scanned " + path) + ":"));
    android.util.Log.i("ExternalStorage", ("-> uri=" + uri));
}

public void setFrameInScene(android.graphics.RectF frameInScene) {
    this.frameInScene = frameInScene;
    for (com.example.try_gameengine.framework.ILayer child : layers) {
        if (child.isComposite())
            child.setFrameInScene(child.frameInSceneByCompositeLocation());
        
    }
}

@java.lang.Override
public void onError(android.content.Context context, java.lang.Exception e) {
    progress.setVisibility(View.GONE);
    mLogcatSummary.setText(errorText);
    mLogcatSummary.setTextColor(android.support.v4.content.ContextCompat.getColor(getActivity(), errorTextColor));
    e.printStackTrace();
}

@java.lang.Override
public void onBackPressed() {
    android.util.Log.v(BezierGlobals.TAG, "%%%%%%%%%%%%%%> onBACKPressed");
    if ((this.task) != null) {
        this.task.setRunning(false);
    }
    super.onBackPressed();
}

@java.lang.Override
public void onEvent(int eventType, android.os.Bundle params) {
    printe(((("onEvent: type " + eventType) + ", with params: ") + (toString(params.keySet()))));
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.getWindow().requestFeature(Window.FEATURE_CONTEXT_MENU);
    dialog.setCancelable(true);
    return dialog;
}

public void onClick(android.view.View view) {
    java.lang.Thread thread = new java.lang.Thread(mutiThread);
    thread.start();
    try {
        startActivity(intent);
    } catch (java.lang.Exception e) {
        text.setText(e.toString());
    }
}

void handleTag() {
    cordova.getThreadPool().execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.util.Log.d(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("handleTag " + (savedTag)));
            fireTagEvent(tag);
        }
    });
}

@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    android.view.MenuItem checkable = menu.findItem(R.id.heatmap);
    checkable.setChecked(heatMapActive);
}

@java.lang.Override
public void onClick(android.view.View view) {
    view.setElevation(getResources().getDimension(R.dimen.elevation_card_pressed));
    startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, ItemsContract.Items.buildItemUri(getItemId(vh.getAdapterPosition()))));
}

public int getCurrent() {
    java.lang.String str = java.lang.String.valueOf(((android.widget.TextView) (mText)).getText());
    validateCurrentView(str);
    return mCurrent;
}

private void showStopProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    org.onebusaway.android.report.ui.ReportStopProblemFragment.show(this, obaStop, R.id.ri_report_stop_problem, this);
}

static void updatePublishDateIfShouldBePublishedImmediately(org.wordpress.android.fluxc.model.PostModel postModel) {
    if (org.wordpress.android.ui.posts.PostUtils.shouldPublishImmediately(postModel)) {
        postModel.setDateCreated(org.wordpress.android.util.DateTimeUtils.iso8601FromDate(org.wordpress.android.util.DateTimeUtils.nowUTC()));
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkAnswer(true);
    updateQuestion();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    android.util.Log.d("Ziolle", ("onCreateView: " + (mSelectedPosition)));
    savedInstanceState.putInt(com.example.android.sunshine.app.ForecastFragment.LIST_POSITION, mSelectedPosition);
    super.onSaveInstanceState(savedInstanceState);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "T1TTXPJcPzM830GZeCBIupyVU1cMT4tiqByRVFVt", "akwdXIApXkPOGA50FmcbBnWmFCEGatusbOJ1CQnr");
    buildGoogleApiClient();
}

@android.support.annotation.NonNull
@java.lang.Override
public java.lang.Object clone() {
    byte[] result = new byte[data.length];
    java.lang.System.arraycopy(data, 0, result, 0, data.length);
    return new jp.kshoji.javax.sound.midi.MetaMessage(result);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return ingredientListFragment;
        case 1 :
            return stepListFragment;
        default :
            return null;
    }
}

@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    didReceiveError = true;
    hideLoadingProgress();
    pageIsLoaded = false;
    ViewPagerDownloadManager.instance.done(this, false);
    showErrorMessage(R.string.network_error_message, FontAwesomeIcons.fa_exclamation_circle);
}

void clear(android.transition.Transition.TransitionListener transitionListener) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        transition.removeListener(transitionListener);
    }
    this.transitionListener = null;
    this.transition = null;
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception exception) {
    android.widget.Toast.makeText(this, (url + " does not exist"), Toast.LENGTH_SHORT).show();
}

public void updateAppInfo(com.dkanada.openapk.AppInfo appInfo) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    removeAppInfo(appInfo);
    addAppInfo(appInfo);
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    android.util.Log.d(((opensource.zeocompanion.fragments.MainDuringFragment._CTAG) + ".onTouch"), ("Touch on view " + v));
    userSelect = true;
    return false;
}

@java.lang.Override
public void onUnhandledKeyEvent(android.webkit.WebView view, android.view.KeyEvent event) {
    if (!(mInForeground)) {
        return ;
    }
    if (!(mWebViewController.onUnhandledKeyEvent(event))) {
        super.onUnhandledKeyEvent(view, event);
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    isLong = true;
    start();
    return false;
}

int addAlarm() {
    return addAlarm(true, "fully_charged", "", android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.toString(), "notification", false, true);
}

