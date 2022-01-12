@java.lang.Override
public void onClick(android.view.View view) {
    if ((mStatus) == (STATUS_READY)) {
        mStatus = STATUS_RECOGNIZING;
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
        updateStatus();
    }
}

@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    com.namclu.android.bloquery.api.model.Question question = dataSnapshot.getValue(com.namclu.android.bloquery.api.model.Question.class);
    mQuestionAdapter.addQuestion(question);
    android.widget.Toast.makeText(this, "inside onChildAdded", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onResumeFragments() {
    super.onResumeFragments();
    pageChangeListener.onPageSelected(viewPager.getCurrentItem());
    android.util.Log.d("Test", "MainActivity.onResumeFragments()");
}

public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.example.hasun.payattention.LockTimeDialog lockTimeDialog = new com.example.hasun.payattention.LockTimeDialog();
    lockTimeDialog.show(fm, "setLockTime");
    mBeginButton.setEnabled(false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    revealCorrectAnswer(1);
    updatePoints();
}

private void reloadDimens() {
    android.content.res.Resources res = mContext.getResources();
    mIconSize = res.getDimensionPixelSize(R.dimen.status_bar_icon_size);
    mIconHPadding = res.getDimensionPixelSize(R.dimen.status_bar_icon_padding);
    mIconWidth = context.getResources().getDimensionPixelSize(R.dimen.status_bar_icon_size);
}

@java.lang.Override
public void onError() {
    progressBar.setVisibility(View.GONE);
    android.widget.Toast.makeText(mContext, "picasso error", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getActivity(), "Calendar - Looking for day", Toast.LENGTH_SHORT).show();
    mLoadingProgress.setVisibility(View.VISIBLE);
    com.sweproject.calorietracker.MainActivity.getDBData(com.sweproject.calorietracker.DataObjects.Days.class, this, "UserId", MainActivity.CurrentUser.Id);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.current_heroes)));
    populateListView();
    testClick();
}

private void initBookmarkFragment() {
    mMetaInfoListSource = com.java.team17.data.BookmarkManager.getInstance(com.java.team17.data.db.CacheDBOpenHelper.getInstance(getContext().getApplicationContext())).getNewsMetaInfoListSource();
    android.util.Log.i("bookmark", "bookmarkInited");
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.System.out.println("All tags deleted!");
    dbHelper.deleteAllTagsFromDB();
    allTags = dbHelper.getAllTags();
    adapter.updateTags(allTags);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    android.app.Activity hostActivity = getActivity();
    if (hostActivity instanceof com.group.mydea.FragmentModificaNota.addedItem) {
        listener = ((com.group.mydea.FragmentModificaNota.addedItem) (hostActivity));
    }
}

@java.lang.Override
public void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> callback) {
    mWebChromeClient.getVisitedHistory(callback);
}

public void decrement(android.view.View view) {
    (quantity)--;
    display(quantity);
}

private void requestNewInterstitial() {
    adRequest = new com.google.android.gms.ads.AdRequest.Builder().addTestDevice("4E441F0D2F1FEBCDB67463195D4E85A2").addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
}

@java.lang.Override
public void onClick(android.view.View v) {
    allRe.get(java.lang.Integer.parseInt(v.getTag().toString())).setHeading(1);
    updateTextNoteControlListners(R.id.action_heading1);
}

private void calculateEquation192() {
    equation192 = ((sexFactor) * (bodyWeightInKG)) * 24;
    android.util.Log.i("Lean Factor Info", java.lang.String.valueOf(leanFactorMultiplier));
}

public void onClick(android.view.View v) {
    guess(v);
    switchQuestionAndAnswers();
}

private void stopTimerTask() {
    android.util.Log.i("MyMapsActivity", "stopTimerTask()");
    if ((timer) != null) {
        timer.cancel();
        timer = null;
    }
}

public void setDataRetriever(org.matrix.androidsdk.data.DataRetriever dataRetriever) {
    checkIfActive();
    mDataRetriever = dataRetriever;
    mDataRetriever.setStore(mStore);
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.e("Error", "That didn't work!");
    android.widget.Toast.makeText(getApplicationContext(), "Error connecting to server please try again.", Toast.LENGTH_LONG).show();
    hideProgressDialog();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    myTimer.start();
    dialogInterface.dismiss();
    android.widget.Toast.makeText(this, "Timer started.", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    speed += ((speed) == 8) ? 0 : 1;
    java.lang.String cmd = "" + (speed);
    this.sendCommand(cmd);
}

@java.lang.Override
public void onClick(android.view.View v) {
    locFirst = false;
    run = true;
    sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()));
    launchSearch();
}

public void StartWifi() {
    android.content.Intent intent = new android.content.Intent(this, pt.inesc.termite.wifidirect.service.SimWifiP2pService.class);
    bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    mBound = true;
    new pt.ulisboa.tecnico.cmov.ubibike.WifiDirect.MsgSenderActivity.IncommingCommTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    guiUpdateDisconnectedState();
}

@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    intent.putExtra("mode", "view");
    intent.putExtra("obj", studentInfoList.get((pos + 1)));
    context.startActivity(intent);
}

@java.lang.Override
public void failure(com.appdest.hcue.services.RestError restError) {
    hideLoader();
    android.widget.Toast.makeText(this, restError.getErrorMessage(), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.util.ArrayList pArrayList = new java.util.ArrayList();
    matt.listmaker.ListObject test = new matt.listmaker.ListObject("List Name", 0, pArrayList);
    dbHelper.addListObject(test);
}

@java.lang.Override
public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
    return mWebChromeClient.onConsoleMessage(consoleMessage);
}

@java.lang.Override
public void forkContacts(android.content.Context context, int quantity, boolean allTypes) {
    if ((mForkBinder) != null) {
        mForkBinder.startFork((allTypes ? com.pioneer.aaron.dolly.fork.ForkTask.FORK_TYPE_ALL_TYPE_CONTACT : com.pioneer.aaron.dolly.fork.ForkTask.FORK_TYPE_RANDOM_CONTACT), quantity);
        toastForkTask(context);
    }
}

@java.lang.Override
protected void onStart() {
    initPlayServices();
    client.connect();
    android.util.Log.d(com.example.tameter.geofog.MainActivity.LOG_TAG, "START OP XXOX");
    super.onStart();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle savedInstance) {
    super.onSaveInstanceState(savedInstance);
    if (((listData) != null) || (listData.isEmpty())) {
        savedInstance.putSerializable("HEADER", listData);
    }
}

public void addTitle(@android.support.annotation.StringRes
int titleId) {
    addModel(com.kaliturin.blacklist.adapters.SettingsArrayAdapter.Model.TITLE, titleId, 0, null, null);
}

@org.junit.Test
public void PasswordResetScreenToLoginScreenTransistion() throws java.lang.Exception {
    launchActivityWithIntent();
    onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.regBackBtn)).perform(android.support.test.espresso.action.ViewActions.click());
}

@android.support.annotation.Nullable
public static com.tonyodev.storagegrapher.StorageVolume getSecondaryStorageVolume(android.content.Context context) {
    if (context == null) {
        return null;
    }
    java.io.File file = com.tonyodev.storagegrapher.Storage.getSecondaryStorageDir(context);
    if (file != null) {
        return com.tonyodev.storagegrapher.Storage.getStorageVolume(file);
    }
    return null;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (position != (showDetailPosition)) {
        showDetail(position);
    }else {
        hideDetail();
    }
}

@java.lang.Override
public void onViewStateRestored(android.os.Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);
    android.util.Log.d(ray.cyberpup.com.touchframework.InterceptsDialog.LOG_TAG, "onViewStateRestored");
}

@org.junit.Before
public void setUp() throws java.lang.Exception {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "setUp");
    android.test.RenamingDelegatingContext context = new android.test.RenamingDelegatingContext(android.support.test.InstrumentationRegistry.getContext(), "test_");
    helper = com.harlie.radiotheater.radiomysterytheater.data.RadioTheaterHelper.getInstance(context);
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if ((mRecorder) != null) {
        drawBars(canvas);
        postInvalidate();
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(it.rieger.happyhour.controller.database.DatabaseHelper.CREATE_TABLEFACEBOOK_LOGIN);
    db.execSQL(it.rieger.happyhour.controller.database.DatabaseHelper.CREATE_TABLE_FAVORITE_LOCATIONS);
    db.execSQL(it.rieger.happyhour.controller.database.DatabaseHelper.CREATE_TABLE_LOCATION_IMAGES);
}

@java.lang.Override
protected info.hearit.pluginslib.BaseModule newModule(android.app.Notification notification) {
    return new info.hearit.pluginsample.PluginAudioModule(notification, 1, 2);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    new com.boolong.hangrywaits.Home.LoadPlaces().execute();
    if (id == (R.id.action_settings)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    activate();
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder binder) {
    com.michaelflisar.lumberjack.overlay.OverlayService service = ((com.michaelflisar.lumberjack.overlay.OverlayService.OverlayServiceBinder) (binder)).getService();
    messageDispatcher.setSetup(setup);
    messageDispatcher.setService(service);
}

@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    aq.id(iv).image(com.florianmski.tracktoid.Utils.shadowBitmap(com.florianmski.tracktoid.Utils.borderBitmap(bm, context))).animate(android.R.anim.fade_in);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (type != (io.github.sdsstudios.ScoreKeeper.Dialog.ADD_PLAYER)) {
        mGame.setPlayer(oldPlayer, position);
    }
    dialog.dismiss();
    onDialogClose();
}

private int getItemViewTypeHelper(android.database.Cursor cursor) {
    boolean is_from_user = (cursor.getInt(cursor.getColumnIndexOrThrow("is_from_user"))) > 0;
    if (is_from_user == true) {
        return 0;
    }else {
        return 1;
    }
}

@java.lang.Override
public void onFailure(org.eclipse.paho.client.mqttv3.IMqttToken asyncActionToken, java.lang.Throwable exception) {
    android.util.Log.i(com.ajb.vendingmachine.service.MQTTService.TAG, "subscribeCallBackHandler订阅失败 ");
    exception.printStackTrace();
    doClientConnection();
}

public void goToCurrentLocation(com.google.android.gms.maps.model.LatLng latLng, java.lang.String currentAddress) {
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, com.angular.gerardosuarez.carpoolingapp.mvp.view.MyMapView.DEFAULT_ZOOM);
    map.animateCamera(cameraUpdate);
    removeLocationUpdates();
    setTextAutocompleteFragmentWithText(currentAddress);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    activity.startActivity(new android.content.Intent(activity, tda367.myapplication.controller.ActivityInfo.class));
    learnJava.setCurrentLevel(((learnJava.getCurrentLevel()) + 1));
}

@java.lang.Override
public final void onValidate(@android.support.annotation.NonNull
com.alexandrepiveteau.library.tutorial.ui.fragments.AbstractTutorialValidationFragment fragment, boolean is_ok) {
    if (is_ok) {
        _avoid_try_validate = true;
        onClick(mImageButtonRight);
        _avoid_try_validate = false;
    }
    invalidateSwipable();
}

private void initializeNavigationListener() {
    android.support.design.widget.BottomNavigationView navigation = ((android.support.design.widget.BottomNavigationView) (activity.findViewById(R.id.navigation)));
    navigation.setSelectedItemId(R.id.navigation_notifications);
}

public void showAtHomeView() {
    android.widget.TextView occupancyTextView = ((android.widget.TextView) (findViewById(R.id.occupancy_alert)));
    occupancyTextView.setText("User is at home");
}

@java.lang.Override
public void searchFirendOrCircle(com.zdn.CommandParser.CommandE e) {
    android.os.Message msg = handler.obtainMessage();
    msg.what = com.zdn.logic.InternetComponent.ThreadTaskHandler.SEND_MESSAGE_TO_SERVER;
    e.GetProperty("URL").SetPropertyContext(com.zdn.logic.InternetComponent.WEBSITE_ADDRESS_ADD_A_FRIEND_ANSWER_REQ);
    msg.obj = e;
    handler.sendMessage(msg);
}

private void updateBg(int color) {
    if ((mTargetView) instanceof android.widget.ImageView) {
        android.graphics.drawable.Drawable _bg = mTargetView.getBackground();
        if (_bg instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) (_bg)).setColor(color);
        }
    }
}

private void handleIntent() {
    android.content.Intent intent = getIntent();
    date = intent.getStringExtra(CommonConstants.DATE);
    isConfirmed = intent.getBooleanExtra(CommonConstants.IS_CONFIRMED, true);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(getBaseContext(), list_productName.get(position).toString(), Toast.LENGTH_LONG).show();
}

protected void onPostExecute(java.lang.Void result) {
    updateFragments();
    android.widget.Toast.makeText(getApplicationContext(), "Allotment created", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.d("on destory", "timetable");
    if ((courseRW) != null)
        courseRW.close();
    
}

public void draw(float[] initialMatrix) {
    plane.draw(initialMatrix);
    if ((flight) != null) {
        flight.draw(initialMatrix);
    }
    new uk.ac.aber.gij2.olandroid.view.Aircraft(0).draw(initialMatrix);
}

public void settings() {
    android.app.Dialog dialog = new android.app.Dialog(this);
    text1 = ((android.widget.TextView) (dialog.findViewById(R.id.textView2)));
    dialog.setContentView(R.layout.dialogbox);
    dialog.show();
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.qi.xiaohui.dingdang.model.webcontent.WebContent>> call, java.lang.Throwable t) {
    android.util.Log.i("error", t.toString());
    webView.setWebViewClient(new android.webkit.WebViewClient());
    _loadUrl();
}

public void checkGoalTableIsDefined() {
    android.database.sqlite.SQLiteDatabase myDb = this.getWritableDatabase();
    myDb.execSQL(("CREATE TABLE IF NOT EXISTS GOALS " + "(id integer primary key, name text, goal integer, deposited integer)"));
    myDb.close();
}

@java.lang.Override
public void onSuccess(com.androidsdk.snaphy.snaphyandroidsdk.models.Customer object) {
    super.onSuccess(object);
    mainActivity.onBackPressed();
    com.sdsmdg.tastytoast.TastyToast.makeText(mainActivity, "Successfully updated data", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
}

private void showOpen311ProblemFragment(edu.usf.cutr.open311client.models.Service service) {
    org.onebusaway.android.report.ui.Open311ProblemFragment.show(this, R.id.ri_report_stop_problem, mOpen311, service, this);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    etApiDialog = ((android.widget.EditText) (findViewById(R.id.et_api_dialog)));
    apiKey[0] = etApiDialog.getText().toString();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    myContext = activity.getApplicationContext();
    android.util.Log.d(TAG, "onAttach");
}

public void setOnCancelButtonClickListener(android.view.View.OnClickListener onCancelButtonClickListener) {
    this.onCancelButtonClickListener = onCancelButtonClickListener;
    if ((buttonCancel) != null)
        buttonCancel.setOnClickListener(onAcceptButtonClickListener);
    
}

@java.lang.Override
public final void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) {
    super.addView(child, params);
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.System.out.println("clicked");
    datePickerShow();
}

@java.lang.Override
public void setContentView(int layoutResID) {
    final android.view.View contentView = getLayoutInflater().inflate(layoutResID, mDrawerLayout, false);
    contentLayout.addView(contentView);
    setContentView(mDrawerLayout);
    initToolbar();
    initNavigationDrawer();
    initActionDrawerToggle();
}

@java.lang.Override
public void close() {
    database.close();
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(insertStatementMap);
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(updateStatementMap);
}

@java.lang.Override
public void onClick(android.view.View view) {
    DigitPressed(getContext(), "1", view);
}

@java.lang.Override
public void showBackgroundColor(com.huhx0015.screencolortester.domain.models.ScreenColor color) {
    if ((color.resource) != null) {
        mActivityLayout.setBackgroundColor(color.resource);
    }else {
        mActivityLayout.setBackgroundColor(android.graphics.Color.rgb(color.red, color.green, color.blue));
    }
}

public com.checkerbot.checkerbot.Square get(android.graphics.Point p) {
    try {
        return board[p.y][p.x];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
    return board[p.y][p.x];
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mRoutineId = savedInstanceState.getLong(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_WORKOUT_ID);
    mCheckedDays = savedInstanceState.getBooleanArray(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_CHECKED_DAYS);
    mTwoPane = savedInstanceState.getBoolean(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_TWO_PANE);
}

private boolean isUnlockMethodSecure(java.lang.String unlockMethod) {
    return !((com.android.settings.ChooseLockGeneric.ChooseLockGenericFragment.KEY_UNLOCK_SET_OFF.equals(unlockMethod)) || (com.android.settings.ChooseLockGeneric.ChooseLockGenericFragment.KEY_UNLOCK_SET_NONE.equals(unlockMethod)));
}

private java.lang.String displayName(java.lang.String nam) {
    android.widget.EditText txtname = ((android.widget.EditText) (findViewById(R.id.editxt_name)));
    setxt = txtname.getText().toString();
    return setxt;
}

@com.pilloxa.backgroundjob.ReactMethod
public void getAll(com.pilloxa.backgroundjob.Callback callback) {
    android.util.Log.d(LOG_TAG, "RN Getting aall");
    com.pilloxa.backgroundjob.WritableArray jobs = _getAll();
    callback.invoke(jobs);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager manager = getFragmentManager();
    com.littlegeektoys.www.picturepurrfect.ColorPickerFragment dialog = com.littlegeektoys.www.picturepurrfect.ColorPickerFragment.newInstance();
    dialog.setTargetFragment(this, com.littlegeektoys.www.picturepurrfect.BottomMenuFragment.REQUEST_COLOR);
    dialog.show(manager, com.littlegeektoys.www.picturepurrfect.BottomMenuFragment.DIALOG_COLOR_INPUT);
    mCallbacks.onToolSelect(MenuToolInterface.ToolName.COLOR);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mDeleteListener) != null) {
        com.cunoraz.tagview.Tag targetTag = tag;
        mDeleteListener.onTagDeleted(this, targetTag, position);
    }
}

@java.lang.Override
protected void drawSpecial(android.graphics.Canvas canvas, int offset) {
    for (com.gmail.wazappdotgithub.ships.model.IShip s : board.arrayOfShips()) {
        drawShip(canvas, offset, s);
    }
}

public static void init(android.app.Application application) {
    com.parse.Parse.initialize(application, com.rndapp.mtamap.Analytics.PARSE_KEY_ONE, com.rndapp.mtamap.Analytics.PARSE_KEY_TWO);
    com.flurry.android.FlurryAgent.init(application, com.rndapp.mtamap.Analytics.FLURRY_KEY);
}

@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    android.util.Log.d(com.whirlwind.school1.activity.GoogleSignInActivity.TAG, ("onConnectionFailed:" + connectionResult));
    android.widget.Toast.makeText(this, "Google Play Services error.", Toast.LENGTH_SHORT).show();
}

public static cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod fromString(java.lang.String string) {
    cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod method;
    try {
        method = cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod.valueOf(string);
    } catch (java.lang.IllegalArgumentException e) {
        method = null;
    }
    return method;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    android.util.Log.d(((TAG) + ".afterTextChanged()"), "afterTextChanged");
    com.nusclimb.live.crimp.common.BusProvider.getInstance().post(new com.nusclimb.live.crimp.common.busevent.AccumulatedScoreChange());
}

protected void doEncrypt(android.view.View v) {
    doWork(1);
}

public void requestPermission(io.dcloud.common.DHInterface.IWebview webview, org.json.JSONArray data) {
    int currentVersion = android.os.Build.VERSION.SDK_INT;
    if (currentVersion > (android.os.Build.VERSION_CODES.LOLLIPOP)) {
        cn.jpush.android.api.JPushInterface.requestPermission(webview.getContext());
    }
}

@java.lang.Override
public void showNetworkError(java.io.IOException e) {
    android.widget.Toast.makeText(java.security.AccessController.getContext(), java.lang.String.format("Network error: %s", e.getMessage()), Toast.LENGTH_SHORT).show();
}

public java.lang.String checkConnection(eu.epitech.serverandroid.beans.UserClientInfo info) {
    eu.epitech.serverandroid.tools.GoogleTools google = new eu.epitech.serverandroid.tools.GoogleTools();
    if ((info == null) || ((info.getToken()) == null)) {
        return "400";
    }
    return google.checkConnect(info);
}

public void parseInitial(android.content.Context c) {
    parseImage(c, com.koroshiya.ReadCache.CACHE_DIRECT, currentPage);
    cacheNext(c);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
        context.startService(new android.content.Intent(context, ru.spbau.mit.foodmanager.NotificationService.class));
    }
}

@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    userPreferences.setSleepTime(hourOfDay, minute);
    if (!(mSleepWakeEnable.isChecked())) {
    }
    mSleepTimeLabel.setText(formatTime(hourOfDay, minute));
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    sm.unregisterListener(this);
    try {
        lm.removeUpdates(this);
    } catch (java.lang.SecurityException se) {
        android.util.Log.e("This app", "exception", se);
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if (outState != null) {
        outState.putInt(com.elorri.android.tieus.fragments.BoardFragment.SELECTED_KEY, mPosition);
        mAdapter.onSaveInstanceState(getContext(), outState);
    }
    super.onSaveInstanceState(outState);
}

private void showGlobalContextActionBar() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
    actionBar.setTitle(R.string.app_name);
}

@java.lang.Override
public void onBindViewHolder(com.localytics.android.itracker.ui.MediaDownloadFragment.MediaDownloadAdapter.ViewHolder holder, int position) {
    holder.bindData(mDownloads.get(position));
}

@java.lang.Override
protected org.json.JSONObject doInBackground(java.lang.Void... voids) {
    if (!(com.bananaplan.workflowandroid.main.MainApplication.sUseTestData)) {
        if (com.bananaplan.workflowandroid.data.loading.RestfulUtils.isConnectToInternet(mContext)) {
            mPostRequestStrategy.post();
        }else {
            cancel(true);
        }
    }
    return null;
}

private void goToWelcome() {
    android.content.Intent welcomeIntent = new android.content.Intent(this, edu.gatech.cs2340.rattracker.controller.WelcomeActivity.class);
    startActivity(welcomeIntent);
    finish();
}

@java.lang.Override
public void run() {
    if ((isRefreshing) == 1) {
        android.widget.Toast.makeText(getActivity(), "Connection Failed", Toast.LENGTH_SHORT).show();
        swipeLayout.setRefreshing(false);
    }
}

