@java.lang.Override
protected void onResume() {
    super.onResume();
    dispatchKeyEvent(new android.view.KeyEvent(android.view.KeyEvent.ACTION_DOWN, android.view.KeyEvent.KEYCODE_DPAD_CENTER));
    dispatchKeyEvent(new android.view.KeyEvent(android.view.KeyEvent.ACTION_UP, android.view.KeyEvent.KEYCODE_DPAD_CENTER));
    mVoiceDetection.changePhrases(Constants.VOICE_MENU_MODE.KEYWORD);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case android.R.id.home :
            onBackPressed();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onNext(java.io.File file) {
}

public static boolean hasAccessToken(android.content.Context context) {
    return true;
}

public void useAppContext() throws java.lang.Exception {
}

private void addPolylineToMap() {
    line = mMap.addPolyline(new com.google.android.gms.maps.model.PolylineOptions().width(10).color(Color.BLUE));
    android.util.Log.i("Development", "addPolylineToMap");
}

private static boolean isPackageInstalled(android.content.Context context, java.lang.String package_name) {
    android.content.pm.PackageManager pm = context.getPackageManager();
    try {
        pm.getPackageInfo(package_name, PackageManager.GET_ACTIVITIES);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    configShare.setPermitConnectMore(isChecked);
}

private void loginSuccess(java.lang.String uid) {
    android.content.Intent intent = new android.content.Intent(this, com.freelancewatermelon.factordiary.SubUsersActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    this.currentFragementIndex = savedInstanceState.getInt(CurrentFragementTAG_KEY);
}

@java.lang.Override
public void onClick(android.view.View view) {
    button9.setText(((mark) + ""));
    placeMarkOnBoard(2, 2);
    button9.setEnabled(false);
    checkForWinOrDraw();
}

@java.lang.Override
public void onNavigationDrawerItemSelected(int position) {
}

@android.support.annotation.NonNull
public static com.androidadvance.topsnackbar.TSnackbar make(@android.support.annotation.NonNull
android.view.View view, @android.support.annotation.NonNull
java.lang.CharSequence text, @com.androidadvance.topsnackbar.TSnackbar.Duration
int duration) {
    com.androidadvance.topsnackbar.TSnackbar snackbar = new com.androidadvance.topsnackbar.TSnackbar(com.androidadvance.topsnackbar.TSnackbar.findSuitableParent(view), view);
    snackbar.setText(text);
    snackbar.setDuration(duration);
    return snackbar;
}

@java.lang.Override
public void decorate(com.prolificinteractive.materialcalendarview.DayViewFacade view) {
    view.addSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD));
    view.addSpan(new android.text.style.RelativeSizeSpan(1.5F));
    view.setBackgroundDrawable(drawable);
}

protected int getResult(final android.content.Intent response) {
    return response.getIntExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_ERROR);
}

private void initAdds() {
    mAdView = ((com.google.android.gms.ads.AdView) (findViewById(R.id.main_adView)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    mAdView.loadAd(adRequest);
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.i("SaleHistory", "onQueryTextSubmit called!");
    return onQueryTextChange(query);
}

private void showKeyboard(android.view.Window window) {
    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((downPosition) >= 0) {
        openAnimate(downPosition);
    }
    return false;
}

public void onLeftToRightSwipe(android.view.View v) {
    activity.onLeftToRight(v);
}

@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, @android.support.annotation.IdRes
int checkedId) {
    if (checkedId == (R.id.radioMale)) {
        gender = 0;
    }else {
        gender = 1;
    }
}

@butterknife.OnFocusChange(value = R.id.eTPassword)
void onPassFocusChanged(boolean focused) {
    final android.view.View llpass = findViewById(R.id.layoutPassword);
    if (!focused) {
        llpass.setAlpha(0.5F);
    }else {
        llpass.setAlpha(1.0F);
    }
}

@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState.containsKey(view.RankingResult.STATE_SELECTED_NAVIGATION_ITEM)) {
        getActionBar().setSelectedNavigationItem(savedInstanceState.getInt(view.RankingResult.STATE_SELECTED_NAVIGATION_ITEM));
    }else {
    }
}

public void onClick(android.view.View view) {
    getMacros();
    if ((customFatIsFilledIn) && (customProteinIsFilledIn)) {
        goToFinalCaloriesAndMacrosActivity();
    }
}

public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void refreshScreen() {
    new com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeItemsFragment.LoadInformation().execute(mUsername);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    openAdder(images.get(position)).show();
}

public android.view.ViewPropertyAnimator animateOffScreenLeft() {
    return card.animate().setDuration(150).x((-(parent.getWidth()))).y(0).rotation((-30));
}

public static int getSpinnerLabelPhone(int type) {
    switch (type) {
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_HOME :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_HOME;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_WORK :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_WORK;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_MOBILE :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_MOBILE;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_OTHER :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_OTHER;
        default :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_OTHER;
    }
}

void dispatchOnPanelStateChanged(android.view.View panel, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState previousState, com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelState newState) {
    synchronized(mPanelSlideListeners) {
        for (com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener l : mPanelSlideListeners) {
            l.onPanelStateChanged(panel, previousState, newState);
        }
    }
    sendAccessibilityEvent(AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED);
}

private void savePreferences() {
    editor.edit().putBoolean("music", musicOn).apply();
}

private void showAddDialog() {
    android.app.DialogFragment fragment = info.dylansymons.fpfrhelper.game.management.NewPlayerDialogFragment.newInstance(mGame, mColourList, this);
    fragment.show(getFragmentManager(), "dialog");
}

public boolean onTouchEvent(android.view.MotionEvent e) {
    switch (e.getAction()) {
        case android.view.MotionEvent.ACTION_UP :
            android.util.Log.i(TAG, "Screen touched ");
            break;
        default :
            break;
    }
    return true;
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(initPosition, initZoom));
    mMap.setOnMapLoadedCallback(this);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.michaelt.paycheckmileagecalculator.fragment.PaycheckInputFragment();
        default :
            break;
    }
    return null;
}

public void readFromParcel(android.os.Parcel in) {
    this.id = in.readInt();
    this.url = in.readString();
    this.frequency = in.readLong();
    this.timestamp = in.readLong();
}

@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    doDrawerMenuAction(menuItem.getItemId());
    drawerLayout.closeDrawers();
    return true;
}

@java.lang.Override
public void onInit(com.androidsdk.snaphy.snaphyandroidsdk.list.DataList<java.util.Map<java.lang.String, java.lang.Object>> dataList) {
}

private void parseResult(org.json.JSONArray response) {
    feedItemList = com.locol.locol.Parser.parseJSONResponse(response);
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    mViewPager.setCurrentItem(0);
    return true;
}

@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    if (!(mShow)) {
        mLensDiameterHiding = true;
    }else {
        mLensDiameterHiding = false;
    }
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    callbacks = ((ayp.aug.contactapp.ContactListFragment.Callbacks) (context));
}

@butterknife.OnClick(value = R.id.get_button)
public void onGetButtonClicked(android.view.View view) {
    android.util.Log.i(com.example.azvk.butterknife.Fragments.ButtonsFragment.TAG, "onGetButtonClicked");
    com.example.azvk.butterknife.EventList eventList = new com.example.azvk.butterknife.EventList();
    eventList.setResultCode(111);
    org.greenrobot.eventbus.EventBus.getDefault().post(eventList);
}

public static void test_059() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        check(testcase.Object_ResIdContainsText, testcase.Operation_checkExist, "com.android.dialer:id/callStateLabel", "主卡");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}

@java.lang.Override
public void success(java.util.List<com.google.android.apps.forscience.whistlepunk.metadata.SensorTrigger> triggers) {
    startObservingWithTriggers(readOptions, triggers);
    updateCardMenu();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (savedInstanceState != null) {
        editText.setText(savedInstanceState.getString(ly.loud.loudly.ui.PostCreateFragment.EDIT_TEXT));
    }
}

@java.lang.Override
public void accept(@io.reactivex.annotations.NonNull
com.eternal.common.serial.BaseSerialMessage serialMessage) throws java.lang.Exception {
    android.databinding.ObservableField observableField;
    synchronized(callbackMap) {
        observableField = callbackMap.get(serialMessage.getClass());
    }
    if (observableField != null) {
        observableField.set(serialMessage);
    }
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.e(com.alpha2.duenem.view_pager_cards.TrainActivity.TAG, databaseError.getMessage());
}

public void onStartMultiTouch(android.view.View view) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = fm.beginTransaction();
    transaction.add(R.id.container, new org.sensors2.osc.fragments.MultiTouchFragment());
    transaction.addToBackStack(null);
    transaction.commit();
}

@java.lang.Override
public void onClick(android.view.View view) {
    friend.sendingStarted = true;
    sendImageListener.onImageUploadStarted(friend);
}

public void startService(java.lang.String category, int pageNumber) {
    android.content.Intent intent = new android.content.Intent(this, com.example.picturemanager.ThumbnailDownloadService.class);
    intent.putExtra("category", category);
    intent.putExtra("pageNumber", pageNumber);
    startService(intent);
}

@butterknife.OnClick(value = R.id.view_helper_overlay_button)
void dismissOverlay() {
    if ((getParent()) != null) {
        ((android.view.ViewGroup) (getParent())).removeView(this);
    }
}

public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (com.firebase.ui.auth.ui.AcquireEmailHelper.REQUEST_CODES.contains(requestCode)) {
        mActivityHelper.finish(resultCode, data);
    }
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((sharedPreferences.getBoolean(com.way.telecine.TelecineActivity.HIDE_FROM_RECENTS_KEY, true)) && (!(isChangingConfigurations()))) {
        android.util.Log.d("way", "Removing task because hide from recents preference was enabled.");
        finishAndRemoveTask();
    }
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressDialog = new android.app.ProgressDialog(getContext());
    progressDialog.setTitle("LOADING");
    progressDialog.show();
}

public boolean onPreferenceClick(android.preference.Preference preference) {
    (version_taps)++;
    if ((version_taps) == 3) {
        android.util.Log.d("Easter egg", "Activated");
        version_taps = 0;
    }
    return true;
}

@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    if (position > 0) {
        highlightCurrentFragment(position);
    }
    super.setPrimaryItem(container, position, object);
}

@java.lang.Override
@java.lang.SuppressWarnings(value = "deprecation")
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    return false;
}

@java.lang.Override
public void msgRecivedAlive(de.dmarcini.submatix.android4.full.comm.BtServiceMessage msg) {
    if (de.dmarcini.submatix.android4.full.ApplicationDEBUG.DEBUG) {
        android.util.Log.d(de.dmarcini.submatix.android4.full.gui.SPX42PreferencesFragment.TAG, (("SPX Alive <" + (msg.getContainer())) + "> recived"));
    }
    theToast.dismissDial();
}

@java.lang.Override
public void onClick(android.content.DialogInterface anInterface, int i) {
    if ((loading.getVisibility()) == (android.view.View.VISIBLE))
        return ;
    
    new uiuc.mbr.ui.AddEventDialog.Worker().execute();
}

@java.lang.Override
public void onClick(android.view.View view) {
    intent.putExtra("linia", lines.get(position).getTag());
    intent.putExtra("linia_id", position);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    ctx.startActivity(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome);
    initLogin();
    initRegister();
}

@java.lang.Override
public void onResume() {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.MonitorFragment.TAG, "onResume");
    registerSurveysReceiver();
    super.onResume();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_getURL :
            get_address();
            break;
        case R.id.btn_analyze :
            getTextFromActivity();
            break;
        case R.id.btn_reset :
            resetText();
            break;
    }
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
    mDownloadController.setState(new zlc.season.rxdownloadproject.DownloadController.Paused());
}

static void setDebuggerViewerLayout(boolean visible) {
    if ((com.atinternet.tracker.Debugger.debuggerViewerLayout) != null) {
        com.atinternet.tracker.Debugger.viewerVisibility = (visible) ? android.view.View.VISIBLE : android.view.View.GONE;
        com.atinternet.tracker.Debugger.debuggerViewerLayout.get().setVisibility(com.atinternet.tracker.Debugger.viewerVisibility);
        com.atinternet.tracker.Debugger.setAlphaBackground(visible, false);
    }
}

@android.support.annotation.ColorInt
private static int resolveThemeColor(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.AttrRes
@android.support.annotation.StyleableRes
int attr) {
    return com.heinrichreimersoftware.androidissuereporter.util.ThemeUtils.resolveThemeColors(context, new int[]{ attr }, new int[]{ 0 })[0];
}

void positionRecieved(com.embedded.socialexercise.person.Person p);

public void addTile(android.content.ComponentName tile) {
    java.util.List<java.lang.String> newSpecs = new java.util.ArrayList<>(mTileSpecs);
    newSpecs.add(0, com.android.systemui.qs.external.CustomTile.toSpec(tile));
    changeTiles(mTileSpecs, newSpecs, true);
}

private java.lang.String getRandomFromList(java.util.List<java.lang.String> list) {
    return com.decote.partygames.utils.RandomHelper.getNextRandomString(list, getApplicationContext());
}

@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    showRecipeDetails(((int) (id)));
}

public static com.morax.homelibrary.DetailsFragment newInstance() {
    com.morax.homelibrary.DetailsFragment fragment = new com.morax.homelibrary.DetailsFragment();
    return fragment;
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    return ;
}

public void addFace(com.google.android.gms.vision.face.com.google.android.gms.samples.vision.face.facetracker.Face face) {
    face.initSound(getApplicationContext());
    com.google.android.gms.samples.vision.face.facetracker.FaceTrackerActivity.faces.append(face.id, face);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    setUpHeader();
    setHariini();
    setNotifHarian();
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.widget.ImageButton button = ((android.widget.ImageButton) (findViewById(R.id.imageButton4)));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_register);
    super.onCreate(savedInstanceState);
    initBackDialog();
}

public void onClick(@java.lang.SuppressWarnings(value = "unused")
final android.content.DialogInterface dialog, @java.lang.SuppressWarnings(value = "unused")
final int id) {
}

public static void restoreDensity(android.content.Context context) {
    context.getResources().getDisplayMetrics().setToDefaults();
    android.util.DisplayMetrics metrics = com.bulong.rudeness.RudenessScreenHelper.getMetricsOnMiui(context.getResources());
    if (metrics != null)
        metrics.setToDefaults();
    
}

public void setGeoFence(android.view.View view) {
}

public void resume() {
    if (org.lasarobotics.vision.android.Sensors.activated)
        return ;
    
    org.lasarobotics.vision.android.Sensors.activated = true;
    mSensorManager.registerListener(this, mAccelerometer, org.lasarobotics.vision.android.Sensors.READ_SPEED);
    mSensorManager.registerListener(this, mMagneticField, org.lasarobotics.vision.android.Sensors.READ_SPEED);
}

private void changeSortOrder(final com.setiawanpaiman.tmdb.android.movielist.MovieListContract.Presenter.SortOrder oldSortOrder, final com.setiawanpaiman.tmdb.android.movielist.MovieListContract.Presenter.SortOrder newSortOrder) {
    if (oldSortOrder.equals(newSortOrder)) {
        return ;
    }
    mSortOrder = newSortOrder;
    onRefresh();
}

@java.lang.Override
protected boolean acaoDosEventosDoMenu(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            finish();
            break;
    }
    return true;
}

private synchronized void buildGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).enableAutoManage(this, this).build();
}

@android.annotation.TargetApi(value = 21)
private void speakOut() {
    tts.speak(txtFromDesc.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, UTTERANCE_ID);
}

@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    view.loadUrl(url);
    return super.shouldOverrideUrlLoading(view, url);
}

public void sendBroadcastIntent(@javax.annotation.Nonnull
java.lang.String action) {
    context.sendBroadcast(new android.content.Intent(action));
}

public void onClick(android.view.View v) {
    if ((player2_textureState) > 1) {
        (Gameplay.player2_pers)--;
        (player2_textureState)--;
        com.example.myapplication.Options.setPlayersPicturesForVar(player2_textureState, player2_leftArrow, player2_texture, player2_rightArrow);
    }
}

@java.lang.Override
protected void onPostExecute(java.util.ArrayList<java.lang.String> collections) {
    adapterCollections.clear();
    if ((adapterCollections) != null) {
        adapterCollections.addAll(collections);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    alertDialog.dismiss();
    if ((com.kongzue.dialog.SelectDialog.positiveClick) != null)
        com.kongzue.dialog.SelectDialog.positiveClick.onClick(v);
    
}

public void scanNow(android.view.View v) {
    startActivityForResult(new android.content.Intent(getApplicationContext(), com.soctec.soctec.core.ScanActivity.class), com.soctec.soctec.core.MainActivity.REQUEST_CODE);
}

@java.lang.Override
public void onAnimationStart() {
    if ((mTargetVisibility) == (android.view.View.VISIBLE)) {
        mCallback.setViewVisibilityState(mViewId, mTargetVisibility);
    }
}

@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.d(com.pajato.android.gamechat.database.handler.MessagesChangeHandler.TAG, java.lang.String.format(java.util.Locale.US, com.pajato.android.gamechat.database.handler.MessagesChangeHandler.LOG_FORMAT, "onChildRemoved", dataSnapshot, null));
    process(dataSnapshot, com.pajato.android.gamechat.event.MessageChangeEvent.REMOVED);
}

@java.lang.Override
protected void onDestroy() {
    this.unregisterReceiver(hRemoval);
    this.unregisterReceiver(NBR);
    notificationManager.cancel(notificationID);
    super.onDestroy();
}

private void updateToolbarTitle(android.support.v4.app.Fragment fragment, java.lang.String title) {
    java.lang.String fragmentClassName = fragment.getClass().getName();
    if (fragmentClassName.equals(fragment.getClass().getName())) {
        setTitle(title);
    }
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    bg = new com.droidkings.game.Background(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.gamebg1));
    thread.setRunning(true);
    thread.start();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((scheduleDisplayed) >= ((schedules.size()) - 1))
        scheduleDisplayed = 0;
    else
        (scheduleDisplayed)++;
    
    updateSchedulesUI();
}

@java.lang.Override
public void executeCallbacks(int requestCode, int responseCode, android.content.Intent data) {
    mTwitterAuthClient.onActivityResult(requestCode, responseCode, data);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

