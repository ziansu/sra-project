@java.lang.Override
public void onClick(android.view.View view) {
    if ((mStatus) == (STATUS_READY)) {
        mStatus = STATUS_RECOGNIZING;
        updateStatus();
        mTranscoder.transcode(mUser3GPFilePath, mUserWaveFilePath, this);
    }
}

@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    com.namclu.android.bloquery.api.model.Question question = dataSnapshot.getValue(com.namclu.android.bloquery.api.model.Question.class);
    mQuestionAdapter.addQuestion(question);
}

@java.lang.Override
protected void onResumeFragments() {
    super.onResumeFragments();
    pageChangeListener.onPageSelected(viewPager.getCurrentItem());
}

public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.example.hasun.payattention.LockTimeDialog lockTimeDialog = new com.example.hasun.payattention.LockTimeDialog();
    lockTimeDialog.show(fm, "setLockTime");
}

@java.lang.Override
public void onClick(android.view.View view) {
    revealCorrectAnswer(0);
    updatePoints();
}

private void reloadDimens() {
    android.content.res.Resources res = mContext.getResources();
    mIconSize = res.getDimensionPixelSize(R.dimen.status_bar_icon_size);
    mIconHPadding = res.getDimensionPixelSize(R.dimen.status_bar_icon_padding);
    mIconWidth = res.getDimensionPixelSize(R.dimen.status_bar_icon_size);
}

@java.lang.Override
public void onError() {
    progressBar.setVisibility(View.GONE);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mLoadingProgress.setVisibility(View.VISIBLE);
    com.sweproject.calorietracker.MainActivity.getDBData(com.sweproject.calorietracker.DataObjects.Days.class, this, "UserId", MainActivity.CurrentUser.Id);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.current_heroes)));
    populateListView();
}

private void initBookmarkFragment() {
    type = -1;
    mMetaInfoListSource = com.java.team17.data.BookmarkManager.getInstance(com.java.team17.data.db.CacheDBOpenHelper.getInstance(getContext().getApplicationContext())).getNewsMetaInfoListSource();
    android.util.Log.i("bookmark", "bookmarkInited");
}

@java.lang.Override
public void onClick(android.view.View view) {
    dbHelper.deleteAllTagsFromDB();
    allTags = dbHelper.getAllTags();
    adapter.updateTags(allTags);
}

@java.lang.Override
public void onAttach(android.app.Activity context) {
    super.onAttach(context);
    android.app.Activity hostActivity = getActivity();
    if (hostActivity instanceof com.group.mydea.FragmentModificaNota.addedItem) {
        listener = ((com.group.mydea.FragmentModificaNota.addedItem) (hostActivity));
    }else {
    }
}

@java.lang.Override
public void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> callback) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.getVisitedHistory(callback);
    }
}

public void decrement(android.view.View view) {
    if ((quantity) > 0)
        (quantity)--;
    
    display(quantity);
}

private void requestNewInterstitial() {
    adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
}

@java.lang.Override
public void onClick(android.view.View v) {
    allRe.get(java.lang.Integer.parseInt(v.getTag().toString())).setHeading(1);
}

private void calculateEquation192() {
    equation192 = ((sexFactor) * (bodyWeightInKG)) * 24;
}

public void onClick(android.view.View view) {
    guess(view);
    switchQuestionAndAnswers();
}

public void stopTimerTask() {
    android.util.Log.i("MyMapsActivity", "stopTimerTask()");
    if ((timer) != null) {
        timer.cancel();
        timer = null;
    }
}

public void setDataRetriever(org.matrix.androidsdk.data.DataRetriever dataRetriever) {
    checkIfActive();
    mDataRetriever = dataRetriever;
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.e("Error", "That didn't work!");
    hideProgressDialog();
    android.widget.Toast.makeText(getApplicationContext(), "Error connecting to server please try again.", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    myTimer.start();
    dialogInterface.dismiss();
}

@java.lang.Override
public void onClick(android.view.View v) {
    speed += ((speed) == 0) ? 0 : -1;
    java.lang.String cmd = "" + (speed);
    this.sendCommand(cmd);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()))) {
        locFirst = false;
        run = true;
        launchSearch();
    }
}

public void StartWifi() {
    mBound = true;
    new pt.ulisboa.tecnico.cmov.ubibike.WifiDirect.MsgSenderActivity.IncommingCommTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    guiUpdateDisconnectedState();
}

@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    intent.putExtra("mode", "view");
    intent.putExtra("obj", studentInfoList.get(pos));
    context.startActivity(intent);
}

@java.lang.Override
public void failure(com.appdest.hcue.services.RestError restError) {
    hideLoader();
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.util.ArrayList pArrayList = new java.util.ArrayList();
    matt.listmaker.ListObject test = new matt.listmaker.ListObject("List Name", (-1), pArrayList);
    dbHelper.addListObject(test);
}

@java.lang.Override
public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
    if ((mWebChromeClient) != null) {
        return mWebChromeClient.onConsoleMessage(consoleMessage);
    }
    return false;
}

@java.lang.Override
public void forkContacts(android.content.Context context, int quantity, boolean allTypes) {
    if ((mForkBinder) != null) {
        mForkBinder.startFork((allTypes ? com.pioneer.aaron.dolly.fork.ForkTask.FORK_TYPE_ALL_TYPE_CONTACT : com.pioneer.aaron.dolly.fork.ForkTask.FORK_TYPE_RANDOM_CONTACT), quantity);
    }
}

@java.lang.Override
protected void onStart() {
    initPlayServices();
    client.connect();
    super.onStart();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle savedInstance) {
    super.onSaveInstanceState(savedInstance);
    if ((listData) != null) {
        if (!(listData.isEmpty())) {
            savedInstance.putSerializable("HEADER", listData);
        }
    }
}

public void addTitle(@android.support.annotation.StringRes
int titleId) {
    addModel(com.kaliturin.blacklist.adapters.SettingsArrayAdapter.Model.TITLE, getString(titleId), null, null, null);
}

@org.junit.Test
public void PasswordResetScreenToLoginScreenTransistion() throws java.lang.Exception {
    launchActivityWithIntent();
}

@android.support.annotation.Nullable
public static com.tonyodev.storagegrapher.StorageVolume getSecondaryStorageVolume(android.content.Context context) {
    if (context == null) {
        return null;
    }
    java.io.File file = com.tonyodev.storagegrapher.Storage.getSecondaryStorageDir(context);
    if (file == null) {
        return null;
    }
    return com.tonyodev.storagegrapher.Storage.getStorageVolume(file);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (position != (showDetailPosition))
        showDetail(position);
    else
        hideDetail();
    
}

@java.lang.Override
public void onViewStateRestored(android.os.Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);
}

@org.junit.Before
public void setUp() throws java.lang.Exception {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "setUp");
    context = new android.test.RenamingDelegatingContext(android.support.test.InstrumentationRegistry.getContext(), "test_");
    helper = com.harlie.radiotheater.radiomysterytheater.data.RadioTheaterHelper.getInstance(context);
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if ((mRecorder) != null) {
        drawBars(canvas);
        postInvalidate();
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(it.rieger.happyhour.controller.database.DatabaseHelper.CREATE_TABLEFACEBOOK_LOGIN);
    db.execSQL(it.rieger.happyhour.controller.database.DatabaseHelper.CREATE_TABLE_FAVORITE_LOCATIONS);
}

@java.lang.Override
protected info.hearit.pluginslib.BaseModule newModule(android.app.Notification notification) {
    return new info.hearit.pluginsample.PluginAudioModule(notification, 2, 2);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder binder) {
    com.michaelflisar.lumberjack.overlay.OverlayService service = ((com.michaelflisar.lumberjack.overlay.OverlayService.OverlayServiceBinder) (binder)).getService();
    service.setSetup(setup);
    messageDispatcher.setService(service);
}

@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    aq.id(iv).image(com.florianmski.tracktoid.Utils.borderBitmap(bm, context)).animate(android.R.anim.fade_in);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (type != (io.github.sdsstudios.ScoreKeeper.Dialog.ADD_PLAYER)) {
        mGame.setPlayer(oldPlayer, position);
    }
    dialog.dismiss();
}

private int getItemViewTypeHelper(android.database.Cursor cursor) {
    int is_from_user = cursor.getInt(cursor.getColumnIndexOrThrow("is_from_user"));
    if (is_from_user == 1) {
        return 0;
    }else {
        return 1;
    }
}

@java.lang.Override
public void onFailure(org.eclipse.paho.client.mqttv3.IMqttToken asyncActionToken, java.lang.Throwable exception) {
    android.util.Log.i(com.ajb.vendingmachine.service.MQTTService.TAG, "subscribeCallBackHandler订阅失败 ");
    if (exception != null) {
        exception.printStackTrace();
    }
    doClientConnection();
}

public void goToCurrentLocation(com.google.android.gms.maps.model.LatLng latLng, java.lang.String currentAddress) {
    if ((map) != null) {
        com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, com.angular.gerardosuarez.carpoolingapp.mvp.view.MyMapView.DEFAULT_ZOOM);
        map.animateCamera(cameraUpdate);
        removeLocationUpdates();
        setTextAutocompleteFragmentWithText(currentAddress);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    learnJava.setCurrentLevel(((learnJava.getCurrentLevel()) + 1));
    activity.startActivity(new android.content.Intent(activity, tda367.myapplication.controller.ActivityInfo.class));
}

@java.lang.Override
public final void onValidate(@android.support.annotation.NonNull
com.alexandrepiveteau.library.tutorial.ui.fragments.AbstractTutorialValidationFragment fragment, boolean is_ok) {
    invalidateSwipable();
}

private void initializeNavigationListener() {
    android.support.design.widget.BottomNavigationView navigation = ((android.support.design.widget.BottomNavigationView) (activity.findViewById(R.id.navigation)));
    java.lang.System.out.println(navigation);
    navigation.setSelectedItemId(R.id.navigation_notifications);
}

private void showAtHomeView() {
    android.widget.TextView occupancyTextView = ((android.widget.TextView) (findViewById(R.id.occupancy_alert)));
    occupancyTextView.setText("User is at home");
}

@java.lang.Override
public void searchFirendOrCircle(com.zdn.CommandParser.CommandE e) {
    android.os.Message msg = handler.obtainMessage();
    msg.what = com.zdn.logic.InternetComponent.ThreadTaskHandler.SEND_MESSAGE_TO_SERVER;
    msg.obj = e;
    handler.sendMessage(msg);
}

private void updateBg(int color) {
    android.graphics.drawable.Drawable _bg = mTargetView.getBackground();
    if (_bg instanceof android.graphics.drawable.GradientDrawable) {
        ((android.graphics.drawable.GradientDrawable) (_bg)).setColor(color);
    }
}

private void handleIntent() {
    android.content.Intent intent = getIntent();
    date = intent.getStringExtra(CommonConstants.DATE);
    isConfirmed = intent.getBooleanExtra(CommonConstants.IS_CONFIRMED, false);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(this, list_productName.get(position).toString(), Toast.LENGTH_LONG).show();
}

protected void onPostExecute(java.lang.Void result) {
    updateFragments();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.d("on destory", "timetable");
}

public void draw(float[] initialMatrix) {
    plane.draw(initialMatrix);
    if ((flight) != null) {
        flight.draw(initialMatrix);
    }
}

public void settings() {
    android.app.Dialog dialog = new android.app.Dialog(this);
    dialog.setContentView(R.layout.dialogbox);
    dialog.show();
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.qi.xiaohui.dingdang.model.webcontent.WebContent>> call, java.lang.Throwable t) {
    android.util.Log.i("error", t.toString());
    _loadUrl();
}

public void checkGoalTableIsDefined() {
    android.database.sqlite.SQLiteDatabase myDb = this.getWritableDatabase();
    myDb.execSQL(("CREATE TABLE IF NOT EXISTS GOALS " + "(id integer primary key, name text, goal integer, deposited integer)"));
}

@java.lang.Override
public void onSuccess(com.androidsdk.snaphy.snaphyandroidsdk.models.Customer object) {
    super.onSuccess(object);
    com.sdsmdg.tastytoast.TastyToast.makeText(mainActivity, "Successfully updated data", TastyToast.LENGTH_SHORT, TastyToast.SUCCESS);
}

private void showOpen311ProblemFragment(edu.usf.cutr.open311client.models.Service service) {
    org.onebusaway.android.report.ui.Open311ProblemFragment.show(this, R.id.ri_report_stop_problem, mOpen311, service);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    apiKey[0] = etApiDialog.getText().toString();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    myContext = activity.getApplicationContext();
}

public void setOnCancelButtonClickListener(android.view.View.OnClickListener onCancelButtonClickListener) {
    this.onCancelButtonClickListener = onCancelButtonClickListener;
    if ((buttonCancel) != null)
        buttonCancel.setOnClickListener(onCancelButtonClickListener);
    
}

@java.lang.Override
public final void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) {
    addView(child, (-1), params);
}

@java.lang.Override
public void onClick(android.view.View view) {
    datePickerShow();
}

@java.lang.Override
public void setContentView(int layoutResID) {
    final android.view.View contentView = getLayoutInflater().inflate(layoutResID, mDrawerLayout, false);
    contentLayout.addView(contentView);
    setContentView(mDrawerLayout);
    initToolbar();
    initNavigationDrawer();
}

@java.lang.Override
public void close() {
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(insertStatementMap);
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(updateStatementMap);
    database.close();
}

@java.lang.Override
public void onClick(android.view.View view) {
    DigitPressed(getContext(), "0", view);
}

@java.lang.Override
public void showBackgroundColor(com.huhx0015.screencolortester.domain.models.ScreenColor color) {
    if ((color.resource) != 0) {
        mActivityLayout.setBackgroundColor(color.resource);
    }else {
        mActivityLayout.setBackgroundColor(android.graphics.Color.rgb(color.red, color.green, color.blue));
    }
}

public com.checkerbot.checkerbot.Square get(android.graphics.Point p) {
    try {
        return board[p.y][p.x];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        return null;
    }
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mRoutineId = savedInstanceState.getLong(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_WORKOUT_ID);
    mCheckedDays = savedInstanceState.getBooleanArray(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_CHECKED_DAYS);
}

private boolean isUnlockMethodSecure(java.lang.String unlockMethod) {
    return !(com.android.settings.ChooseLockGeneric.ChooseLockGenericFragment.KEY_UNLOCK_SET_OFF.equals(unlockMethod));
}

private java.lang.String displayName(java.lang.String nam) {
    android.widget.EditText txtname = ((android.widget.EditText) (findViewById(R.id.editxt_name)));
    nam = txtname.getText().toString();
    return nam;
}

@com.pilloxa.backgroundjob.ReactMethod
public void getAll(com.pilloxa.backgroundjob.Callback callback) {
    com.pilloxa.backgroundjob.WritableArray jobs = _getAll();
    callback.invoke(jobs);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager manager = getFragmentManager();
    com.littlegeektoys.www.picturepurrfect.ColorPickerFragment dialog = com.littlegeektoys.www.picturepurrfect.ColorPickerFragment.newInstance();
    dialog.setTargetFragment(this, com.littlegeektoys.www.picturepurrfect.BottomMenuFragment.REQUEST_COLOR);
    dialog.show(manager, com.littlegeektoys.www.picturepurrfect.BottomMenuFragment.DIALOG_COLOR_INPUT);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mDeleteListener) != null) {
        mDeleteListener.onTagDeleted(this, tag, position);
    }
}

@java.lang.Override
protected void drawSpecial(android.graphics.Canvas canvas, float offset) {
    for (com.gmail.wazappdotgithub.ships.model.IShip s : board.arrayOfShips()) {
        drawShip(canvas, offset, s);
    }
}

public static void init(android.app.Application application) {
    com.parse.Parse.initialize(application, com.rndapp.mtamap.Analytics.PARSE_KEY_ONE, com.rndapp.mtamap.Analytics.PARSE_KEY_TWO);
}

@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
}

public static cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod fromString(java.lang.String string) {
    cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod method = null;
    if (string != null) {
        try {
            method = cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod.valueOf(string);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }
    return method;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    android.util.Log.d(((TAG) + ".afterTextChanged()"), "afterTextChanged");
}

public void doEncrypt(android.view.View v) {
    doWork(1);
}

public void requestPermission(io.dcloud.common.DHInterface.IWebview webview, org.json.JSONArray data) {
}

@java.lang.Override
public void showNetworkError(java.io.IOException e) {
    android.widget.Toast.makeText(getContext(), java.lang.String.format("Network error: %s", e.getMessage()), Toast.LENGTH_SHORT).show();
}

public java.lang.String checkConnection(eu.epitech.serverandroid.beans.UserClientInfo info) {
    eu.epitech.serverandroid.tools.GoogleTools google = new eu.epitech.serverandroid.tools.GoogleTools();
    if ((info == null) || ((info.getToken()) == null)) {
        return null;
    }
    return google.checkConnect(info);
}

public void parseInitial(android.content.Context c) {
    parseImage(c, com.koroshiya.ReadCache.CACHE_DIRECT, currentPage);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    context.startService(new android.content.Intent(context, ru.spbau.mit.foodmanager.NotificationService.class));
}

@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    userPreferences.setSleepTime(hourOfDay, minute);
    mSleepTimeLabel.setText(formatTime(hourOfDay, minute));
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    sm.unregisterListener(this);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((mPosition) != null) {
        outState.putInt(com.elorri.android.tieus.fragments.BoardFragment.SELECTED_KEY, mPosition);
        mAdapter.onSaveInstanceState(getContext(), outState);
    }
    super.onSaveInstanceState(outState);
}

private void showGlobalContextActionBar() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
}

@java.lang.Override
public void onBindViewHolder(com.localytics.android.itracker.ui.MediaDownloadFragment.MediaDownloadAdapter.ViewHolder holder, int position) {
    holder.bindData(mDownloads.get((((mDownloads.size()) - 1) - position)));
}

@java.lang.Override
protected org.json.JSONObject doInBackground(java.lang.Void... voids) {
    if (!(com.bananaplan.workflowandroid.main.MainApplication.sUseTestData)) {
        if (com.bananaplan.workflowandroid.data.loading.RestfulUtils.isConnectToInternet(mContext)) {
            return mPostRequestStrategy.post();
        }else {
            cancel(true);
        }
    }
    return null;
}

private void goToWelcome() {
    finish();
}

@java.lang.Override
public void run() {
    if ((isRefreshing) == 1) {
        android.widget.Toast.makeText(getActivity(), "Connection Failed", Toast.LENGTH_SHORT).show();
        swipeLayout.setRefreshing(false);
        isRefreshing = 0;
    }
}

