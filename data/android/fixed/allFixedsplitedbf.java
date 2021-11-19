boolean isSilver(android.graphics.Point p) {
    if (isEmpty(p)) {
        return false;
    }
    return (board.getColour(p)) == (email.com.gmail.songjiapei.arimaa.Piece.PieceColour.SILVER);
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
}

public void createDirectory() {
    this.identifyDir();
    java.io.File filePath = new java.io.File(this.proposedPath);
    filePath.mkdirs();
    android.util.Log.i(neildg.com.eagleeyesr.io.DirectoryStorage.TAG, ("Image storage is set to: " + (proposedPath)));
}

public static java.lang.String getUserName(android.content.Context ctx) {
    android.util.Log.d("SaveSharedPreference", ("Getting username" + (edu.purdue.cs.hvzmasterapp.SaveSharedPreference.PREF_USER_NAME)));
    return edu.purdue.cs.hvzmasterapp.SaveSharedPreference.getSharedPreferences(ctx).getString(edu.purdue.cs.hvzmasterapp.SaveSharedPreference.PREF_USER_NAME, "");
}

public void onClick(android.view.View activity_main) {
    startActivity(new android.content.Intent(this, com.example.good_morning.AccountSettingsActivityView.class));
}

public void addOneTeamA(android.view.View view) {
    (scoreTeamA)++;
    displayForTeamA(scoreTeamA);
}

public void setBrushSize(float newSize) {
    lastBrushSize = brushSize;
    brushSize = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, newSize, getResources().getDisplayMetrics());
    drawPaint.setStrokeWidth(brushSize);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((clickable) && (enabled))
        toggle(position, animateSelectorDuration, true);
    
}

private int getEmojiCoount() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    return preferences.getInt("emojiCount", 0);
}

public void deleteData(java.lang.String ID) {
    db.execSQL(("DELETE FROM Reminder_tabledb WHERE _id =" + ID));
}

public static synchronized com.vcredit.cameraHelper.CameraInterface getInstance() {
    if ((com.vcredit.cameraHelper.CameraInterface.mCameraInterface) == null) {
        com.vcredit.cameraHelper.CameraInterface.mCameraInterface = new com.vcredit.cameraHelper.CameraInterface();
    }
    return com.vcredit.cameraHelper.CameraInterface.mCameraInterface;
}

@java.lang.Override
public android.content.Loader<java.util.List<fr.sims.coachingproject.model.UserProfile>> onCreateLoader(int id, android.os.Bundle args) {
    return new fr.sims.coachingproject.loader.network.GroupMembersLoader(getActivity(), mGroupId, false);
}

public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    createAdapter();
    super.createHeaders("Milestones in:", ("Project: " + (this.mCallbacks.getSelectedProject().getName())));
}

@com.facebook.react.bridge.ReactMethod
public void isSimCardValid(com.facebook.react.bridge.Callback callback) {
    android.telephony.TelephonyManager tm = ((android.telephony.TelephonyManager) (this.reactContext.getSystemService(Context.TELEPHONY_SERVICE)));
    java.lang.Boolean isSimCardValid = (tm.getSimState()) == (android.telephony.TelephonyManager.SIM_STATE_READY);
    callback.invoke(isSimCardValid);
}

private static void ensurePreferencesEditor(android.content.Context context) {
    if ((ds.framework.v4.Settings.sPreferencesEditor) == null) {
        ds.framework.v4.Settings.getPreferencesEditor(context);
    }
}

@java.lang.Override
protected void logEvent(final java.lang.String event) {
    logEvent(event, null);
}

public void openDB() {
    if (((mSQLiteDatabase) == null) || ((mSQLiteDatabase.isOpen()) == false))
        mSQLiteDatabase = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(dbPath, null);
    
}

@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    if (dy > 0) {
        mViewModel.showLayoutFooter();
        return ;
    }
    mViewModel.showLayoutFooter();
}

@org.androidannotations.annotations.AfterViews
protected void init() {
    initSharedPreferences();
}

@java.lang.Override
public void onClick(android.view.View v) {
    sharedRadio.setChecked(false);
    edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.SHARED_BATHROOM);
    edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.PRIVATE_BATHROOM);
    edit.putBoolean(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.PRIVATE_BATHROOM, true);
    edit.apply();
}

public void stopAlarm(android.view.View view) {
    if ((sm) != null) {
        sm.close();
    }
    finish();
}

@java.lang.Override
protected void onPreExecute() {
    android.support.design.widget.Snackbar.make(mRootView, "Finished task, saving...", Snackbar.LENGTH_INDEFINITE).show();
}

public de.androidpit.androidcolorthief.MMCQ.VBox clone() {
    return new de.androidpit.androidcolorthief.MMCQ.VBox(r1, r2, g1, g2, b1, b2, histo);
}

@java.lang.Override
public void restoreUiState(@android.support.annotation.NonNull
android.os.Bundle savedInstanceState) {
    super.restoreUiState(savedInstanceState);
    progressLoading.setVisibility((savedInstanceState.getBoolean("progressLoadingVisible") ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    btnLoad.setEnabled(savedInstanceState.getBoolean("btnLoadEnabled"));
}

@android.support.annotation.DrawableRes
private int getStatusIcon(com.airmap.airmapsdk.models.rules.AirMapRule.Status status) {
    switch (status) {
        case Conflicting :
            return R.drawable.ic_restricted;
        case MissingInfo :
            return R.drawable.ic_asterisk;
        case InformationRules :
            return R.drawable.ic_asterisk_yellow;
        case NotConflicting :
            return R.drawable.ic_checkmark;
    }
    return R.drawable.ic_asterisk_yellow;
}

public void msgReciveManufacturer(de.dmarcini.submatix.android4.full.comm.BtServiceMessage msg) {
    if (de.dmarcini.submatix.android4.full.ApplicationDEBUG.DEBUG) {
        android.util.Log.d(de.dmarcini.submatix.android4.full.gui.MainActivity.TAG, (("SPX Manufacturer <" + (msg.getContainer())) + "> recived. Ignore."));
    }
}

private void parseServerData(java.lang.String dataFromServer, android.view.View rootView) {
    if (dataFromServer != null) {
        java.util.List<java.lang.String> arrayOfRankedStatus = java.util.Arrays.asList(dataFromServer.split("/"));
        setupTitle(rootView);
        setupRank(rootView, arrayOfRankedStatus);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    if ((Build.VERSION.SDK_INT) > 22) {
        if (needPermission()) {
            askForPermission();
        }
    }
    doDefaults();
}

public static void initBackGroundMusic(int musicRaw) {
    try {
        com.android.sjsofteducationapp.utils.Sound.mService = new com.android.sjsofteducationapp.utils.MusicBackground(com.android.sjsofteducationapp.utils.Sound.mContext, musicRaw, false);
        com.android.sjsofteducationapp.utils.Sound.mService.execute("");
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if (facesDetected) {
        showPanel(com.android.gallery3d.filtershow.category.MainPanel.TRUEPORTRAIT);
    }else {
        v.setEnabled(false);
        com.android.gallery3d.filtershow.tools.TruePortraitNativeEngine.getInstance().showNoFaceDetectedDialog(getFragmentManager());
    }
}

@java.lang.Override
public void run() {
    android.view.View view = mCommentsLayoutManager.findViewByPosition(destPos);
    if (view == null) {
        return ;
    }
    this.highlightRow(view);
}

public void startAndRestoreTime() {
    if ((this.pauseTime) > 0) {
        this.millisInFuture -= (android.os.SystemClock.elapsedRealtime()) - (this.pauseTime);
        this.pauseTime = 0;
    }
    this.start();
}

@java.lang.Override
public void onBackPressed() {
    if ((myCountDownTimer) != null)
        myCountDownTimer.cancel();
    
    android.content.Intent intent = new android.content.Intent(this, com.randpdevs.calcoff.MainActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

public void onItemLongClick(android.view.View view, int position);

@java.lang.Override
public void onChanged(@android.support.annotation.Nullable
com.abnormallydriven.architecturecomponentspost.common.data.entities.User[] users) {
    if (users != null) {
        userListAdapter.update(users);
    }else {
        userListAdapter.update(new com.abnormallydriven.architecturecomponentspost.common.data.entities.User[0]);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (callBack != null) {
        dialog.dismiss();
        callBack.onReplay();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    (quantity)++;
    quantityTextView.setText(java.lang.Integer.toString(quantity));
}

private void addFragment(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.place_fragement, fragment);
    transaction.addToBackStack(null);
    transaction.commit();
}

@java.lang.Override
public void onClick(android.view.View v) {
}

public static void showInputMethod(android.content.Context context) {
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (context.getSystemService(Context.INPUT_METHOD_SERVICE)));
    if (imm != null)
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.thepoweroftether.interactivetraining.LearningModule.DownloadFileFromURL().execute(new java.lang.String[]{ com.thepoweroftether.interactivetraining.LearningModule.file_url , filename });
}

private android.view.animation.Animation createFadeOutAnimation() {
    return createFadeOutAnimation(me.anoxic.bulber2.BaseActivity.ANIMATION_DURATION);
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    arret = marker.getTitle();
    return false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.event_list);
    android.content.Intent intent = getIntent();
    displayPrivateEvents();
    client = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
}

@java.lang.Override
public void onSucces(com.evernote.edam.type.Note result) {
    recycleview.scrollToPosition(0);
    arrayNotes.add(0, result);
    adapter.animateTo(arrayNotes);
}

@java.lang.Override
public void waypointFileLoaded(org.droidplanner.android.utils.file.IO.MissionReader reader) {
    openedMissionFilename = getSelectedFilename();
    if ((missionProxy) != null) {
        missionProxy.readMissionFromFile(reader);
        gestureMapFragment.getMapFragment().zoomToFit();
    }
}

@java.lang.Override
protected void onFreeBitmap(android.graphics.Bitmap bitmap) {
}

private static void setItemVisibility(android.app.Activity activity, int labelId, int spacerId, int valueId, boolean show) {
    org.cowboycoders.cyclismo.util.StatsUtils.setItemVisibility(activity, labelId, spacerId, valueId, show, show);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (zillaAdapterButtonClickListener != null) {
        zillaAdapterButtonClickListener.onZillaAdapterButtonClick(((android.widget.Button) (v)), position);
    }
}

private void notifyStateChangedToListeners(@android.support.annotation.Nullable
android.view.View bottomSheet, @com.github.ljarka.filterbottomsheet.BottomSheetBehavior.State
int newState) {
    if ((bottomSheet != null) && ((mCallback) != null)) {
        for (com.github.ljarka.filterbottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback : mCallback) {
            bottomSheetCallback.onStateChanged(bottomSheet, newState);
        }
    }
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    out[0] = langList.get(position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    removeAt(position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((check_if_SVM_params_set()) == false)
        return ;
    
    if ((is_svm_has_been_intialized) == false)
        initSVM();
    
    if ((is_cropped) && (is_svm_has_been_intialized))
        predict_this_picture();
    
}

public void nextActivity() {
    android.content.Intent templateIntent = new android.content.Intent(currentActivity, com.example.kbb12.dms.Template.TemplateActivity.class);
    currentActivity.startActivity(templateIntent);
}

public void onAddItem(android.view.View view) {
    android.widget.EditText etNewItem = findViewById(R.id.etNewItem);
    java.lang.String itemText = etNewItem.getText().toString();
    itemsAdapter.add(itemText);
    etNewItem.setText("");
}

@java.lang.Override
public void onClick(android.view.View view) {
    lineNum = 0;
    currentText = "";
    log.setText(currentText);
    shapeLayout.removeAllViews();
}

public android.os.Bundle putParent(android.os.Parcelable superState) {
    android.os.Bundle state = new android.os.Bundle();
    state.putParcelable(((baseKey) + "$$SUPER"), superState);
    return state;
}

@java.lang.Override
public boolean isPortrait() {
    return mNavigationManager.isPortrait();
}

public void onServiceDisconnected(android.content.ComponentName className) {
    boundToRadioService = false;
}

@java.lang.Override
public void onSaveSuccessful(long recordId) {
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    startActivityForResult(new android.content.Intent(android.provider.Settings.ACTION_SETTINGS), 0);
}

public void autoTwoLevelRefreshHint(@android.support.annotation.IntRange(from = 0, to = java.lang.Integer.MAX_VALUE)
int stayDuration) {
    autoTwoLevelRefreshHint(true, stayDuration, true);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_inbox);
    com.parse.Parse.initialize(this, "H9NFC1K9LmahxGcCrMOdT0qMaE0lDGT6BgbrSOAc", "4K2VfxRGIyk69KlQJ2B8NMnD71llrlkEPLdTNh9M");
    new com.example.ricardogarcia.politojobs.Inbox.RetrieveFromDatabase().execute("rgarcia");
}

@java.lang.Override
public void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    mActionBarDrawerToggle.syncState();
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.widget.Toast.makeText(getActivity(), "Long Press (gesture detector)", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    dagger.android.support.AndroidSupportInjection.inject(this);
    super.onAttach(context);
}

public void conceal(@android.support.annotation.Size(value = 2)
@android.support.annotation.NonNull
final int[] to) {
    if (changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_CONCEAL_STARTED)) {
        animationState = de.wackernagel.android.sidekick.widgets.CircularRevealView.ANIMATION_STARTING;
        circleX = to[0];
        circleY = to[1];
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
    }
}

public void newList(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.sashavarlamov.shubershop.NewListActivity.class);
    startActivity(intent);
}

public void tellJoke(android.view.View view) {
}

@java.lang.Override
public void show() {
    if ((isReady()) && ((ad) != null)) {
        ad.show();
    }
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.graphics.Bitmap> loader) {
}

public static void init(android.content.Context appContext) {
    com.unit5app.notifications.MyNotificationHandler.context = appContext;
    com.unit5app.Settings.load(com.unit5app.notifications.MyNotificationHandler.context);
    com.unit5app.notifications.MyNotificationHandler.calendar = new com.unit5app.calendars.Unit5Calendar(60, false);
    com.unit5app.notifications.MyNotificationHandler.checkCalendarLoaded();
}

public static alex.imhere.fragment.StatusFragment newInstance() {
    alex.imhere.fragment.StatusFragment fragment = new alex.imhere.fragment.StatusFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    startFayeClient();
    android.util.Log.i(com.elirex.fayeclient.FayeService.LOG_TAG, ("Faye Service Starts: " + (this)));
}

@java.lang.Override
public void turnFrontScreenFlashOn() {
    if (MyDebug.LOG)
        android.util.Log.d(vn.mbm.phimp.me.opencamera.MyApplicationInterface.TAG, "turnFrontScreenFlashOn");
    
    used_front_screen_flash = true;
    drawPreview.turnFrontScreenFlashOn();
}

@android.webkit.JavascriptInterface
public void reset() {
    stack.clear();
    nStep = -1;
    this.play = true;
    gameStates.clear();
    lins.clear();
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        com.bdqn.zev.videowallpaperdemo.VideoLiveWallpaper.voiceNormal(this);
    }else {
        com.bdqn.zev.videowallpaperdemo.VideoLiveWallpaper.voiceSilence(this);
    }
}

private void displayScreen(net.rossharper.hexrot.android.ScreenFactory screenFactory) {
    mFragmentManager.beginTransaction().replace(mRootContainerId, ((android.app.Fragment) (screenFactory.getScreen()))).commit();
}

public boolean updateAchievement(C change, android.content.Context context) {
    return updater.updateAchievement(this, change, context);
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.awchoudhary.bookpocket.BookNote note = new com.awchoudhary.bookpocket.BookNote();
    note.setBookId(book.getId());
    notes.add(note);
    updateEntries(notes);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    importFromFile();
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    android.util.Log.i(LOG_TAG, ((getId()) + ".onAttach()"));
    super.onAttach(context);
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    if ((sensorEvent.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER)) {
        xAccel = sensorEvent.values[0];
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    pageList.get(p).setIsSelected(isChecked);
}

@java.lang.Override
public void onPanelCollapsed(android.view.View view) {
    android.util.Log.d(com.gcw.sapienza.places.fragments.PlacesMapListFragment.TAG, "Panel collapsed");
}

@java.lang.Override
protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    super.onLayout(changed, left, top, right, bottom);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
}

public static void init(android.app.Application application) {
    com.facebook.FacebookSdk.sdkInitialize(application.getApplicationContext());
}

public android.view.View newView(android.content.Context context, android.database.Cursor cusor, android.view.ViewGroup parent) {
    return mLayoutInflater.inflate(R.layout.colmn_row, parent, false);
}

@org.junit.After
public void deleteSQLDBObject() {
    mDB1.close();
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    onTouchEvent(event);
    return false;
}

protected <T> void showActivity(java.lang.Class<T> cl) {
    android.app.Activity activity = getContext();
    if (activity != null) {
        activity.startActivity(new android.content.Intent(activity, cl));
    }
}

public void fetchCalls(int callType, long newerThan, int sub) {
    cancelFetch();
    fetchCalls(com.android.dialer.calllog.CallLogQueryHandler.QUERY_CALLLOG_TOKEN, callType, false, newerThan, sub);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (which == 0) {
        returnable.onResult(null);
    }else {
        returnable.onResult(playerDataList.get((which - 1)));
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    java.lang.System.out.printf("this is a test");
}

public S hasStartTime(long time) {
    org.assertj.android.api.view.animation.AbstractAnimationAssert.isNotNull();
    long actualTime = actual.getStartTime();
    org.assertj.android.api.view.animation.AbstractAnimationAssert.assertThat(actualTime).overridingErrorMessage("Expected start time <%s> but was <%s>.", time, actualTime).isEqualTo(time);
    return myself;
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    ca.uottawa.cookapp.CookApp.Recipeadapter.notifyDataSetChanged();
    ca.uottawa.cookapp.CookApp.Favouriteadapter.notifyDataSetChanged();
}

public void save(li.itcc.hackathon15.services.PoiDetailBean bean) {
    new li.itcc.hackathon15.poiadd.PoiAddSaver.SaveTask().execute(bean);
}

