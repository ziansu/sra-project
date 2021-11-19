@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    org.joda.time.LocalDate setDate = new org.joda.time.LocalDate(year, (month + 1), dayOfMonth);
    infinitePager.setInfinitePagerData(new com.eleith.calchoochoo.utils.InfinitePagerDataDates(setDate));
}

@java.lang.Override
public void onClick(android.view.View view) {
    revealCorrectAnswer(1);
    updatePoints();
}

@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONArray array) {
    super.onSuccess(statusCode, headers, array);
    buidRouteDatalist(array.toString());
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    final java.lang.String action = intent.getAction();
    if (action.equals(Utils.STOP_RECORDING)) {
        stopRecordingAudio();
        stopSelf();
    }
}

@java.lang.Override
public void onRequestFailure(com.octo.android.robospice.persistence.exception.SpiceException spiceException) {
    super.onRequestFailure(spiceException);
    if ((getView()) != null) {
        getSwipeRefreshLayout().setRefreshing(false);
    }
}

public void show(android.support.v4.app.FragmentManager fm, java.lang.String tag) {
    mFragmentManager = fm;
    mTag = tag;
    mDatePicker.show(fm, mTag);
}

public java.lang.String getPassword() {
    return com.android.server.LockSettingsService.mSavePassword;
}

@java.lang.Override
public void onStudentDetailInteraction() {
    android.util.Log.d("digvijay", "Data sucessfully submitted");
    android.content.Intent intent = com.example.shivanshu.alumniconnect.ProfileActivity.getProfileActivityIntent(this);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    switch (item) {
        case 0 :
            startPreferenceActivity();
            break;
        case 1 :
            showDialog(R.id.dialog_gps_menu);
            break;
    }
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getApplicationContext(), fileName, Toast.LENGTH_SHORT).show();
    recent = (DownloadDir + '/') + fileName;
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.menu_main_fragment, menu);
    super.onCreateOptionsMenu(menu, inflater);
}

@java.lang.Override
protected void onPause() {
    android.util.Log.e(bluemix.ruazosa.fer.hr.bluemix.MainActivity.TAG, "onPause");
    super.onPause();
}

private void addAlarm(com.github.xzwj87.todolist.schedule.ui.model.ScheduleModel item) {
    android.util.Log.d(com.github.xzwj87.todolist.alarm.service.AlarmObserver.LOG_TAG, ("addAlarm(): title = " + (item.getTitle())));
    mAlarmService.addAlarmSchedule(item);
    mAlarmService.setAlarm(item);
}

public static <T> com.pr0gramm.app.ui.fragments.BusyDialogFragment.BusyDialogOperator<T> busyDialog(android.support.v4.app.FragmentActivity activity) {
    return new com.pr0gramm.app.ui.fragments.BusyDialogFragment.BusyDialogOperator(activity.getSupportFragmentManager(), null);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    ans.setNumAns(java.lang.String.valueOf(editable));
    answer.onAnswerSave(ans);
}

public static java.io.File databaseFileLocation(android.content.Context ctx) {
    java.io.File f = ctx.getFilesDir();
    f = new java.io.File(f, com.chaosinmotion.securechat.messages.SCMessageDatabase.MESSAGEFILE);
    return f;
}

@java.lang.Override
public void onError(com.facebook.FacebookException error) {
    android.util.Log.d(com.example.gek.firebaseauth.MyFaceBookActivity.TAG, "facebook:onError", error);
}

public void setCurrentInfo(test.homework.nick.snp20.events_for_eventbus.PlayerInfoEvent currentInfo) {
    this.currentInfo = currentInfo;
    playing = currentInfo.isPlaying();
    showNotification();
}

public synchronized void open(android.content.Context context) {
    if ((mUsbContext) != context) {
        disconnect();
        mUsbContext = context;
    }
    if (mIsOpen)
        return ;
    
    mIsOpen = true;
    connect();
}

@java.lang.Override
public void onPhotoTap(android.view.View view, float v, float v1) {
}

@android.support.annotation.NonNull
public static com.dm.wallpaper.board.databases.Database get(@android.support.annotation.NonNull
android.content.Context context) {
    return new com.dm.wallpaper.board.databases.Database(context);
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.d(TAG, "onUnbind()");
    return super.onUnbind(intent);
}

@java.lang.Override
public void onDataReceived(android.bluetooth.BluetoothDevice device, byte[] data) {
    final com.adamnickle.deck.Message message = com.adamnickle.deck.Message.fromBytes(data);
    if ((message != null) && (message.isValid())) {
        this.onMessageReceived(message);
    }
}

@java.lang.Override
public void onEditCategory(int position) {
    categoryIndexEditted = position;
    editCategory(position);
}

public static au.com.wallaceit.reddinator.activity.AboutDialog show(android.content.Context context, boolean isUserInitiated) {
    return new au.com.wallaceit.reddinator.activity.AboutDialog(context, isUserInitiated);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if (com.aidanas.torch.Const.DEBUG)
        android.util.Log.v(com.aidanas.torch.fragments.MainFragment.TAG, "In onSaveInstanceState()");
    
    outState.putBoolean(com.aidanas.torch.fragments.MainFragment.IS_LIGHT_ON, isLightOn);
}

public void pause() {
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.pause();
    }
}

public void startInterceptor() {
    android.content.Intent vpnIntent = android.net.VpnService.prepare(this);
    if (vpnIntent != null)
        startActivityForResult(vpnIntent, com.juliansparber.vpnMITM.InterceptorActivity.VPN_REQUEST_CODE);
    else
        onActivityResult(com.juliansparber.vpnMITM.InterceptorActivity.VPN_REQUEST_CODE, com.juliansparber.vpnMITM.RESULT_OK, null);
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    mOnMonthCellSelectListener.selectedCell(((com.lokman.event_calendar.view.MonthCellView) (v.getTag())).dateOfMonth);
}

@java.lang.Override
public void onDragFinished(android.view.View view, int position) {
    com.holenstudio.awesomeview.util.VibratorUtil.Vibrate(getContext(), 50);
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    switch (v.getId()) {
        case R.id.relative_from :
            imageCenterScreen.setImageDrawable(blackFlag);
            break;
        case R.id.relative_to :
            imageCenterScreen.setImageDrawable(greenFlag);
            break;
    }
    return true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        app = getBaseApplicationInterface();
    } catch (java.lang.Exception e) {
    }
    tcBaseDelegate.onCreate(this, savedInstanceState, app);
    app.addActivity(this);
}

@java.lang.Override
public void setCurrentViewport(lecho.lib.hellocharts.model.Viewport targetViewport) {
    if (null != targetViewport) {
        isLoading = false;
        chartRenderer.setCurrentViewport(targetViewport);
        setAxesY();
    }
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}

@java.lang.Override
public void onItemClick(android.view.View view) {
    int position = mRecyclerView.getChildPosition(view);
    mCallbacks.onItemSelected(java.lang.String.valueOf(position));
}

@org.junit.Before
public void setup() {
    context = android.support.test.InstrumentationRegistry.getTargetContext();
    access = new com.uri.team21.culinarycommrade.DataAccessor(context);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    studentList = db.fetchAllData();
    new com.example.pustikom.adapterplay.StudentActivity.DataSyncTask().execute(studentList);
}

public void increment(android.view.View view) {
    quantity = (quantity) + 1;
    displayQuantity(quantity);
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    setIntent(intent);
    com.facebook.notifications.NotificationsManager.presentCardFromNotification(cordova.getActivity());
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return super.onOptionsItemSelected(item);
}

public void addRecipes(java.util.ArrayList<edu.uw.informatics.brewsky.Recipe> recipes) {
    recipesList.addAll(recipes);
}

@java.lang.Override
public void onClick(android.view.View v) {
    int index = editorCore.getParentView().indexOfChild(layout);
    editorCore.getParentView().removeView(layout);
    hideInputHint(index);
    editorCore.getInputExtensions().setFocusToPrevious(index);
}

public static com.arcao.geocaching4locus.fragment.dialog.LocusTestingErrorDialogFragment newInstance(android.content.Context context) {
    com.arcao.geocaching4locus.fragment.dialog.LocusTestingErrorDialogFragment fragment = new com.arcao.geocaching4locus.fragment.dialog.LocusTestingErrorDialogFragment();
    fragment.prepareDialog(0, (locus.api.android.utils.LocusUtils.isLocusAvailable(context) ? R.string.error_locus_old : R.string.error_locus_not_found), AppConstants.LOCUS_MIN_VERSION.toString());
    return fragment;
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeSparseArray(((android.util.SparseArray) (this.commissions)));
}

public boolean initSession(io.branch.referral.Branch.BranchReferralInitListener callback, @android.support.annotation.NonNull
android.net.Uri data, android.app.Activity activity) {
    readAndStripParam(data, activity);
    return initSession(callback, activity);
}

public static android.content.BroadcastReceiver getBroadcastReceiver() {
    return (base.networkstate.NetworkStateReceiver.broadcastReceiver) == null ? base.networkstate.NetworkStateReceiver.broadcastReceiver = new base.networkstate.NetworkStateReceiver() : base.networkstate.NetworkStateReceiver.broadcastReceiver;
}

boolean onLongClick(android.view.View view, int position);

@java.lang.Override
public void getMessageList(int page) {
    mRxDoHttpClient.getMessageList(page).map(BaseResponse::getData).subscribeOn(io.reactivex.schedulers.Schedulers.io()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(mView::showMessageList);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt(Const.STEP_POS, stepPosition);
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    loadTodo();
    manager.newStepDone();
    loadTodo();
}

@java.lang.Override
public void onClick(android.view.View view) {
    add(view);
}

private void privateConstructor(android.content.Context context) {
    mMatrix.set(getImageMatrix());
    super.setScaleType(ScaleType.MATRIX);
    super.setLongClickable(false);
    setClickable(true);
}

@java.lang.Override
public void onClick(android.view.View view) {
}

public com.mapbox.services.android.navigation.v5.MapboxNavigationOptions getMapboxNavigationOptions() {
    return options;
}

public void choosePhoto() {
    android.content.Intent intent = new android.content.Intent();
    intent.setType("image/*");
    intent.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(android.content.Intent.createChooser(intent, "Select File"), SELECT_FILE);
}

public void onDrawerClosed(android.view.View view) {
    invalidateOptionsMenu();
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    super.onConnected(bundle);
    updateLocation(mLastLocation);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.androiddeveloper.webprog26.ghordsgenerator.engine.managers.screens_managers.PlayShapeActivityManager playShapeActivityManager = getPlayShapeActivityManager();
    if (playShapeActivityManager != null) {
    }
}

@java.lang.Override
public void sendImageToServer(final java.lang.String id) {
    net.hockeyapp.android.metrics.MetricsManager.trackEvent("Sending image");
    new com.example.zarehhakobian.hoylushare.MainActivity.UploadingAsyncTask().execute(id);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mathText.append("0");
    resultView.setText(mathText);
}

@java.lang.Override
protected void onPause() {
    if (logging)
        android.util.Log.d("MainActivity", "Start: onPause()");
    
    super.onPause();
}

private static void forceMainActivityReload() {
    android.content.pm.PackageManager pm = cordova.getActivity().getPackageManager();
    com.plugin.gcm.Intent launchIntent = pm.getLaunchIntentForPackage(getApplicationContext().getPackageName());
    cordova.getActivity().startActivity(launchIntent);
}

public int getCameWithCar() {
    android.content.SharedPreferences sharedPreferences = omer.parking.com.util.SharedPrefManager.mCtx.getSharedPreferences(omer.parking.com.util.SharedPrefManager.SHARED_PREF_NAME, Context.MODE_PRIVATE);
    return sharedPreferences.getInt(omer.parking.com.util.SharedPrefManager.TAG_CAME_WITH_CAR, 1);
}

public synchronized void error(com.bopr.android.smailer.MailMessage message, java.lang.Exception error) {
    com.bopr.android.smailer.ActivityLogItem item = new com.bopr.android.smailer.ActivityLogItem(com.bopr.android.smailer.ActivityLog.LEVEL_ERROR);
    item.setMessage(formatMessage(message, R.string.activity_log_message_send_email_failed));
    item.setDetails(error.toString());
    add(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, com.sinergiass.asistencia.facerecog.RecognitionActivity.class));
}

@java.lang.Override
public void onClick(android.view.View v) {
    ambiesoft.start.model.utility.SoftKeyboard.hideSoftKeyboard(this);
    skipSignIn();
}

@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    if ((mDrawerToggle) != null)
        mDrawerToggle.onDrawerOpened(drawerView);
    
    if ((getSupportActionBar()) != null)
        getSupportActionBar().setTitle(R.string.app_name);
    
}

public void showProgress(@android.support.annotation.NonNull
java.lang.String progressMessage) {
    if (!(mInProgress)) {
        mStepperFeedbackType.showProgress(progressMessage);
        mInProgress = true;
    }
}

private void init() {
    setupConnection();
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    if (com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.TAG, "onStart -- ");
    
}

public boolean onQueryTextChange(java.lang.String newText) {
    return true;
}

@java.lang.Override
public void loadingStart() {
    loading = new android.app.ProgressDialog(this);
    loading.setMessage("Loading");
    loading.show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    title[0] = title[1];
    ringtoneTextView.setText(title[0]);
    stopMediaPlayer(mp);
    dialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent selectorImageIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    selectorImageIntent.setType("image/*");
    getActivity().startActivityForResult(selectorImageIntent, mx.dev.franco.musicallibraryorganizer.DetailsTrackDialog.INTENT_OPEN_GALLERY);
}

@java.lang.Override
protected void onPostExecute(java.lang.Boolean value) {
    if (!value) {
        android.util.Log.e(com.iitp.mayank.celesta2k17.activities.SplashActivity.class.getName(), "Can't fetch the data highlights ");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    try {
        manageRideProposal(RideAction.FINISHED);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void onViewPositionChanged(android.view.View changedView, int left, int top, int dx, int dy) {
    if (changedView == (mContentView)) {
        adjustMenuItemViews(left, dx);
    }
    invalidate();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            break;
        case R.id.saveTask :
            assembleTaskAndSave();
            break;
    }
    return super.onOptionsItemSelected(item);
}

protected ProteusView.Manager createViewManager(@android.support.annotation.NonNull
com.flipkart.android.proteus.ViewTypeParser parser, @android.support.annotation.NonNull
com.flipkart.android.proteus.ProteusView view, @android.support.annotation.NonNull
com.flipkart.android.proteus.value.Layout layout, @android.support.annotation.NonNull
com.flipkart.android.proteus.value.ObjectValue data, @android.support.annotation.Nullable
android.view.ViewGroup parent, int dataIndex) {
    return parser.createViewManager(context, view, layout, data, parser, parent, dataIndex);
}

private void beginCrop(android.net.Uri source) {
    android.net.Uri destination = android.net.Uri.fromFile(new java.io.File(getCacheDir(), "cropped"));
    com.soundcloud.android.crop.Crop.of(source, destination).start(this);
}

@java.lang.Override
public int getMovementFlags(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
    int dragFlags = (android.support.v7.widget.helper.ItemTouchHelper.UP) | (android.support.v7.widget.helper.ItemTouchHelper.DOWN);
    int swipeFlags = android.support.v7.widget.helper.ItemTouchHelper.START;
    return makeMovementFlags(dragFlags, swipeFlags);
}

public static synchronized io.centeno.randominsultgenerator.HTMLParser getParser(android.content.Context context, java.lang.String tag1, java.lang.String tag2) {
    if ((io.centeno.randominsultgenerator.HTMLParser.instance) == null)
        io.centeno.randominsultgenerator.HTMLParser.instance = new io.centeno.randominsultgenerator.HTMLParser(context, tag1, tag2);
    
    return io.centeno.randominsultgenerator.HTMLParser.instance;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (!(currentQuery.equalsIgnoreCase(s.toString()))) {
        currentQuery = s.toString();
        notifySearchQueryChanged(currentQuery);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews();
    navigationView.setCheckedItem(R.id.nav_searchpeople);
    com.teamspeaghetti.www.gifster.interiorapplication.commonclasses.Utils.startFragment(new com.teamspeaghetti.www.gifster.interiorapplication.fragments.SearchPeopleFragment(), getSupportFragmentManager());
}

@java.lang.SuppressWarnings(value = "deprecation")
public static android.text.Spanned fromHtml(java.lang.String text) {
    if (org.linphone.mediastream.Version.sdkAboveOrEqual(Version.API24_NOUGAT_70)) {
        return android.text.Html.fromHtml(text, 0);
    }else {
        return android.text.Html.fromHtml(text);
    }
}

@java.lang.Override
public void onItemClear() {
    recyclerViewItem.setScaleY(1.0F);
    canPullDown = true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.mygaadi.driverassistance.adapter.JobModelAdapter.onItemClickListener.onItemClick(v, this.getAdapterPosition());
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.settings_rules);
}

@java.lang.Override
public void onClick(android.view.View v) {
    datePickerDialog.show(getActivity().getSupportFragmentManager(), com.fly.firefly.ui.activity.BookingFlight.SearchFlightFragment.DATEPICKER_TAG);
    PICKER = RETURN_DATE_PICKER;
    com.fly.firefly.AnalyticsApplication.sendEvent("Click", "returnDateblock");
}

public static com.sylvainautran.nanodegree.capstoneproject.data.loaders.CallsLoader getAllCallDetails(android.content.Context context, long callId, long classId) {
    return new com.sylvainautran.nanodegree.capstoneproject.data.loaders.CallsLoader(context, AppelContract.CallStudentLinkEntry.buildCallStudentLinkUriWithCallAndClass(classId, callId), com.sylvainautran.nanodegree.capstoneproject.data.loaders.CallsLoader.Query.PROJECTION_DETAILS, null, null, AppelContract.StudentEntry.DEFAULT_SORT);
}

public void onClickHome(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, nl.mprog.ghost.MainActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.dodola.rocoosample.HelloHack hack = new com.dodola.rocoosample.HelloHack();
    android.widget.Toast.makeText(this, hack.showHello(), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception exception) {
    android.util.Log.w(com.concavenp.artistrymuse.services.UploadService.TAG, "uploadFromUri:onFailure", exception);
    broadcastUploadFinished(null, fileUri);
    taskCompleted();
}

public void initTabLayout() {
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.tab_layout)));
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    android.util.Log.d(org.ShinRH.android.mocklocation.MapActivity.TAG, "onServiceConnected ");
    mMockLocationService = new android.os.Messenger(service);
    mIsBound = true;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
}

@java.lang.Override
public final void notifyBluetoothList(android.bluetooth.BluetoothDevice _device) {
    if (!(mDiscoveredDevices.contains(_device))) {
        mDiscoveredDevices.add(_device);
        mAdapter.notifyDataSetChanged();
    }
}

@java.lang.Override
protected void getView(java.util.List<com.baozou.rxjavaexample.model.ItemBean> itemBeans, android.widget.ListView listView) {
    view = mInflate.inflate(R.layout.adapteritem_main_item, listView, false);
    butterknife.ButterKnife.bind(this, view);
    dealWithTheView(itemBeans);
    listView.addHeaderView(view);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (s != null) {
        java.lang.String name = s.toString();
        if (options.contains(name)) {
            value.setValue(name);
        }
    }
}

public void restartSpeech() {
    speakerOut.speak("Parada", TextToSpeech.QUEUE_ADD, null);
    sr.startListening(android.speech.RecognizerIntent.getVoiceDetailsIntent(getApplicationContext()));
}

