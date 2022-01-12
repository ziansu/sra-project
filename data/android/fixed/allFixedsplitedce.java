@java.lang.Override
protected void onServiceConnected() {
    super.onServiceConnected();
    android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo = new android.accessibilityservice.AccessibilityServiceInfo();
    accessibilityServiceInfo.eventTypes = android.view.accessibility.AccessibilityEvent.TYPES_ALL_MASK;
    accessibilityServiceInfo.feedbackType = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_ALL_MASK;
    accessibilityServiceInfo.notificationTimeout = 0;
    setServiceInfo(accessibilityServiceInfo);
}

@java.lang.Override
public void onTextQueryFragmentInteraction(android.net.Uri uri) {
}

@java.lang.Override
public void onAudioFocusChange(int focusChange) {
    if (focusChange == (android.media.AudioManager.AUDIOFOCUS_LOSS)) {
        mAudioManager.abandonAudioFocus(afChangeListener);
        if ((null != (mPlayer)) && (mPlayer.isPlaying()))
            stopPlaying();
        
    }
}

@java.lang.Override
public void onLocationUpdated(android.location.Location location) {
    showLocation(location);
}

private boolean SaveData() {
    ActivityMain.mainUser.SaveDiaryEntry(diaryEntry);
    android.widget.Toast.makeText(this, R.string.Tagebucheintraggespeichert, Toast.LENGTH_SHORT).show();
    return true;
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    if ((drawThread) == null) {
        return ;
    }
    drawThread.setSurfaceHolder(holder);
}

@java.lang.Override
public void onClick(android.view.View view) {
}

public void refreshGallery(java.io.File file) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    mediaScanIntent.setData(android.net.Uri.fromFile(file));
    sendBroadcast(mediaScanIntent);
}

public void warn(java.lang.String msg) {
    if ((com.yourtion.httpdns.Debug.isshow) && (msg != null))
        android.util.Log.w(((com.yourtion.httpdns.Debug.PREFIX) + (this.name)), msg);
    
}

private static boolean isMediaDocument(android.net.Uri uri) {
    return "com.android.providers.media.documents".equals(uri.getAuthority());
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

public void setPackageName(java.lang.String packageName) {
    android.content.SharedPreferences.Editor editor = getPrefs().edit();
    editor.putString(net.oldev.aDictOnCopy.DictionaryOnCopyService.SettingsModel.PREFS_PACKAGE_NAME, packageName);
    editor.commit();
    notifyPropertyChanged(BR.packageName);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    android.widget.Toast.makeText(this, "Đã theo dõi", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> arg0) {
}

public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == 1) {
        }
    }
}

@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    if ((getActivity()) == null) {
        return ;
    }
}

@java.lang.Override
public void onBackStackChanged() {
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainContent);
    if (f != null)
        setTitle(f.getTag());
    
}

public void unbindCustomTabsService(android.app.Activity activity) {
    if ((mConnection) == null)
        return ;
    
    activity.unbindService(mConnection);
    mClient = null;
    mCustomTabsSession = null;
    mConnection = null;
}

@java.lang.Override
public void onClick(android.view.View view) {
    button2.setText(((mark) + ""));
    placeMarkOnBoard(0, 1);
    button2.setEnabled(false);
    checkForWinOrDraw();
}

public void onCameraUnavailable(java.lang.String cameraId) {
    mPreferences.setCamActiv(cameraId, true);
    de.simu.decoit.android.decomap.util.Toolbox.logTxt(this.getLocalClassName(), "Camera is in use!");
}

@java.lang.Override
public void setEpisode(@android.support.annotation.NonNull
org.bottiger.podcast.provider.IEpisode argItem) {
    super.setEpisode(argItem);
    setState(calcState());
    setProgressPercent(new org.bottiger.podcast.listeners.DownloadProgress());
}

public void setImage(java.lang.String image) {
    switcher.setImageURI(android.net.Uri.parse(image));
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    super.onFailure(statusCode, headers, throwable, errorResponse);
    android.widget.Toast.makeText(context, "Unable to retweet", Toast.LENGTH_SHORT).show();
}

public void editEvent(int position) {
    org.hisp.dhis2.android.sdk.events.MessageEvent message = new org.hisp.dhis2.android.sdk.events.MessageEvent(BaseEvent.EventType.showDataEntryFragment);
    message.item = displayedExistingEvents.get(position).localId;
    Dhis2Application.bus.post(message);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.list_view);
    this.setTitle(mainObject.restarauntName);
    onDisplayCategoryList();
}

@java.lang.Override
public void onClick(android.view.View v) {
    setNewValues();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent == null) {
        dev.ukanth.ufirewall.log.Log.i(dev.ukanth.ufirewall.log.LogService.TAG, "Restarting LogService");
        startLogService();
    }
    return android.app.Service.START_STICKY;
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    canPullDown = ((v.getScrollY()) == 0) && ((mCurrentViewIndex) == 1);
    return false;
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mNewLocationReceiver);
    if (mBound) {
        mBound = false;
        unbindService(mConnection);
    }
}

@android.support.annotation.Nullable
@java.lang.Override
public mihaljevic.miroslav.foundry.slimplayer.BrowserRoot onGetRoot(@android.support.annotation.NonNull
java.lang.String clientPackageName, int clientUid, @android.support.annotation.Nullable
android.os.Bundle rootHints) {
    return null;
}

@java.lang.Override
public void onTimeTick() {
    super.onTimeTick();
    invalidate();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initWifiInfo();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    init();
    getAllComments();
}

private void handleIntent(android.content.Intent intent) {
    com.sina.weibo.sdk.api.share.IWeiboShareAPI api = mIShareWeiboHelper.getIWeiboShareAPI(false);
    if (api != null) {
        api.handleWeiboResponse(intent, this);
    }
}

public int currentPoints() {
    return gameLogic.currentPoints();
}

@java.lang.Override
public void onRestoreStateForActivityResult(android.os.Bundle state, uk.co.onefile.nomadionic.filepicker.CallbackContext callbackContext) {
    super.onRestoreStateForActivityResult(state, callbackContext);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((costList.size()) < 5) {
        createNewCostDialog();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialogo(sTitles[position], java.lang.Integer.valueOf(sEncId[position]), position, false);
}

public void SelectModel(android.view.View v) {
    if ((modelADBObject) != null) {
        modelADBObject.show();
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d("Receiver", "I received the message");
}

@java.lang.Override
public void onClick(android.view.View v) {
    update();
}

@java.lang.Override
public void showOnFailure() {
    if ((pagerAdapter.getCount()) == 0) {
        showNoData();
    }
    android.widget.Toast.makeText(this, "加载数据失败，请检查您的网络", Toast.LENGTH_SHORT).show();
}

private void deleteCategory(ch.rmy.android.http_shortcuts.realm.models.Category category) {
    controller.deleteCategory(category);
    showSnackbar(R.string.message_category_deleted);
}

public void CallNextActivity() {
    finish();
}

public void sendMessage(java.lang.String message) {
    if ((displayMessageFragment) == null) {
        android.util.Log.w(com.e_conomic.jonfirstapp.MainActivity.MAIN_ACTIVITY_TAG, "Trying to send message, but displayMessageFragment is null.");
        return ;
    }
    displayMessageFragment.updateMessage(message);
    writeMessageToFile(message);
}

@android.annotation.SuppressLint(value = "InlinedApi")
@java.lang.Override
public void run() {
}

public static void show(android.support.v7.app.AppCompatActivity activity, org.onebusaway.android.io.elements.ObaStop stop, java.lang.Integer containerViewId) {
    org.onebusaway.android.report.ui.ReportStopProblemFragment.show(activity, stop, containerViewId, true);
}

public void updateWifiEnabled(int state) {
    switch (state) {
        case android.net.wifi.WifiManager.WIFI_STATE_DISABLED :
            mHandler.sendEmptyMessage(com.android.systemui.statusbar.notificationbars.WifiDialog.WIFI_UNABLE);
            break;
        case android.net.wifi.WifiManager.WIFI_STATE_ENABLED :
            mHandler.sendEmptyMessage(com.android.systemui.statusbar.notificationbars.WifiDialog.WIFI_ENABLE);
            break;
        default :
            break;
    }
}

@android.support.annotation.NonNull
android.content.Context getContext() {
    return mContext;
}

public static int getIconSize() {
    android.app.ActivityManager am = ((android.app.ActivityManager) (Share.activityContext.getSystemService(Context.ACTIVITY_SERVICE)));
    return am.getLauncherLargeIconSize();
}

public static int getDefaultCategory(android.content.Context context) {
    return org.wordpress.android.ui.prefs.SiteSettingsInterface.siteSettingsPreferences(context).getInt(org.wordpress.android.ui.prefs.SiteSettingsInterface.DEF_CATEGORY_PREF_KEY, 1);
}

public void addChannel(fr.unicaen.info.users.hivinaugraffe.apps.android.rssreader.controllers.Channel channel) {
    channels.add(channel);
    notifyDataSetChanged();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    clearInvalid();
}

protected static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send, java.lang.String tag) {
    com.binarapps.android.cookielogger.AppContext.instance = new com.binarapps.android.cookielogger.AppContext(context, send, tag);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (progress == 0) {
        progress = 1;
    }
    timer = progress;
    timerTextView.setText(java.lang.String.valueOf(timer));
}

public void validateBefore(final android.view.View view, final boolean async) {
    createRulesSafelyAndLazily(false);
    android.view.View previousView = getViewBefore(view);
    validateOrderedFieldsWithCallbackTill(previousView, "when using 'validateBefore(View)'.", async);
}

private static void onAccountCreated(android.accounts.Account newAccount, android.content.Context context) {
    com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.configurePeriodicSync(context, com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.SYNC_INTERVAL, com.upenn.chriswang1990.sunshine.sync.SunshineSyncAdapter.SYNC_FLEXTIME);
    android.content.ContentResolver.setSyncAutomatically(newAccount, context.getString(R.string.content_authority), true);
}

private void onMoreButtonClick(android.view.View v) {
    moreBtnClick();
    if (!(moreOptionOpen)) {
        moreOptionOpen = true;
    }else {
        moreOptionOpen = false;
    }
}

@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    if (mGuideViewPage.dispatchKeyGuidePage(event)) {
        return true;
    }
    return super.dispatchKeyEvent(event);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

public android.view.View getFirstChild() {
    return getChildAt(0);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    peter.util.searcher.activity.BaseActivity.LIST.add(this);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    context.sendBroadcast(new android.content.Intent("NOTIFICATION_DISMISSED"));
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.navigation_home :
            return true;
        case R.id.navigation_dashboard :
            return true;
    }
    return false;
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    preference.setSummary(getString(fr.free.nrw.commons.Utils.licenseNameFor(((java.lang.String) (newValue)))));
    return true;
}

@java.lang.Override
public void onPageStarted(java.lang.String url, android.graphics.Bitmap favicon) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    savedOriginalPosition = getAdapterPosition();
    startLevel();
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if ((nativeCanvasBitmap) != null) {
        java.lang.System.out.println(("nativeCanvas being drawn " + (nativeCanvasBitmap)));
        canvas.drawBitmap(nativeCanvasBitmap, 0, 0, mPaint);
    }
}

public void cameraVIntent() {
    android.content.Intent videoIntent = new android.content.Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
    startActivityForResult(videoIntent, CAMERA_VIDEO_CAPTURE);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mp.start();
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToStop(this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((getActivityTab()) != null)
        handleBackPressedWithoutBackStack(true);
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    reAdd(t2, pos);
}

@java.lang.Override
public void addChild(com.caverock.androidsvg.SVG.SvgObject object) throws org.xml.sax.SAXException {
    if (object instanceof com.caverock.androidsvg.SVG.TextChild)
        super.addChild(object);
    else
        throw new org.xml.sax.SAXException((("Text content elements cannot contain " + object) + " elements."));
    
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    delayedHide(1000);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    confirmAdd(position);
}

public synchronized void updateAll(@android.support.annotation.NonNull
java.util.Collection<TModel> tableCollection) {
    updateAll(tableCollection, modelSaver.getWritableDatabase());
}

@com.facebook.react.bridge.ReactMethod
public void getPublishableKey(final com.facebook.react.bridge.Callback callback) {
    android.content.Context context = getReactApplicationContext();
    callback.invoke(com.hypertrack.lib.HyperTrack.getPublishableKey(context));
}

@java.lang.Override
public void onClick(android.view.View view) {
    removeOrder(view.getContext(), item, appCompatDialog);
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    return event.isAltPressed() ? false : super.onKeyDown(keyCode, event);
}

private void onUploadProgress(org.wordpress.android.fluxc.model.MediaModel media, float progress) {
    java.lang.String localMediaId = java.lang.String.valueOf(media.getId());
    mEditorMediaUploadListener.onMediaUploadProgress(localMediaId, progress);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mContext) instanceof com.jaylecavalier.chessvisionplus.DefaultActivity) {
        java.lang.String coord = itemIdToCoord(getItemId(f_position));
        ((com.jaylecavalier.chessvisionplus.DefaultActivity) (mContext)).checkIfCorrect(coord, f_imageView, f_position);
    }
}

public java.util.List<ca.owenpeterson.twittegorize.models.User> getAllUsers() {
    java.util.List<ca.owenpeterson.twittegorize.models.User> users;
    users = new com.activeandroid.query.Select().from(ca.owenpeterson.twittegorize.models.User.class).orderBy("Id ASC").execute();
    return users;
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent gameStartActivity = new android.content.Intent(this, com.guessgame.akwag.myapplication.GameStartActivity.class);
    startActivity(gameStartActivity);
    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
}

@dagger.Provides
@com.tomeokin.lspush.injection.scope.PerActivity
public com.tomeokin.lspush.biz.usercase.CheckCaptchaAction provideCheckCaptchaAction(@com.tomeokin.lspush.injection.qualifier.ActivityContext
android.content.Context context, com.tomeokin.lspush.data.remote.LsPushService lsPushService, com.google.gson.Gson gson) {
    return new com.tomeokin.lspush.biz.usercase.CheckCaptchaAction(context.getResources(), lsPushService, gson);
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    double price = new com.carpooler.trips.FuelPrice().getFuelUnitPrice(geoPoint);
    android.util.Log.i("Trip", ("fuelPrice: " + price));
    tripData.setFuelPrice(price);
    return null;
}

private void showTimePickerDialog(android.widget.EditText timeDisplay, java.util.Calendar date) {
    activeTimeDisplay = timeDisplay;
    activeTime = date;
    android.app.DialogFragment newFragment = new com.project.team16.nfclock.timePickerFragment();
    newFragment.show(getFragmentManager(), "myDialog");
}

private void setDrawerItemSelected(android.widget.TextView item) {
    if (item != null) {
        item.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        item.setTextColor(Color.WHITE);
    }
}

public void onFinish() {
    showtimer.setText("END TIMER");
    com.itproject.android.androidtvsample.MainActivity.mp.stop();
    android.content.Intent intent = new android.content.Intent(this, com.itproject.android.androidtvsample.WelcomeActivity.class);
    startActivity(intent);
}

void speakToFile() {
    mTts.speakToFile(poem.get());
    snackbarText.set(new ca.rmen.android.poetassistant.main.reader.ReaderViewModel.SnackbarText(R.string.share_poem_audio_snackbar));
}

private void requestResourcePermission() {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.RECORD_AUDIO , Manifest.permission.WRITE_EXTERNAL_STORAGE }, com.google.sample.echo.MainActivity.AUDIO_ECHO_REQUEST);
    }
}

private void clearMatchFoundArrays() {
    matchFoundArrays.clear();
    matchFoundArrays = new java.util.ArrayList<>();
}

@java.lang.Override
protected void onStop() {
    com.app.game.quizee.backend.PlayerManager.getInstance().saveCurrentPlayer();
    super.onStop();
    stopService(new android.content.Intent(this, com.app.game.quizee.backend.MusicService.class));
    com.app.game.quizee.backend.PlayerManager.getInstance().onStop();
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    onCreate(db);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        setUpMultiChoiceRecyclerView();
    }
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    dataManager = com.lunokhod.java.android.cashflowapp.DataManager.getInstance(getApplicationContext());
    updateSpinnerData();
    selectedDate = java.util.Calendar.getInstance();
    setInitialDate(selectedDate);
}

void saveState(@android.support.annotation.NonNull
android.view.View view) {
    final android.util.SparseArray<android.os.Parcelable> parcelableSparseArray = new android.util.SparseArray<android.os.Parcelable>();
    view.saveHierarchyState(parcelableSparseArray);
    mViewState = parcelableSparseArray;
}

@java.lang.Override
public void onClick(android.view.View v) {
    act.onBackPressed();
}

private void resetAndSaveLayout() {
    if (((mLayout) instanceof android.text.BoringLayout) && ((mSavedLayout) == null)) {
        mSavedLayout = ((android.text.BoringLayout) (mLayout));
    }
    mLayout = null;
    mBoring = null;
}

@java.lang.Override
public void run() {
    android.util.Log.d("BoardUpdater", "Displaying board");
    android.util.Log.d("BoardUpdater", myBoard.toString());
    activity.displayBoard(myBoard);
}

