public void registerTimerCallback(com.fivetrue.workout.timer.service.IRTimerCallback callback) {
    if ((callback != null) && ((com.fivetrue.workout.timer.service.RTimerHelper.sTimerService) != null)) {
        try {
            com.fivetrue.workout.timer.service.RTimerHelper.sTimerService.registerTimerCallback(callback);
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((com.example.lucasrosario.extensionchord.RoomActivity) (getActivity())).startMediaPlayer();
}

public void onClick(android.view.View v) {
    if ((player1_textureState) < 4) {
        (Gameplay.player1_pers)++;
        (player1_textureState)++;
        com.example.myapplication.Options.setPlayersPicturesForVar(player1_textureState, player1_leftArrow, player1_texture, player1_rightArrow);
    }
}

@java.lang.Override
public boolean isValid(java.lang.CharSequence value) {
    return (!(android.text.TextUtils.isEmpty(value))) && ((value.length()) >= (minLength));
}

@java.lang.Override
public void onResponse(java.lang.String response) {
    android.util.Log.d(this.getClass().getSimpleName(), response);
}

@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    aq.id(iv).image(com.florianmski.tracktoid.Utils.roundBitmap(bm)).animate(android.R.anim.fade_in);
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    return (mFabAnimatorBuilder.isAnimating()) || (super.dispatchTouchEvent(ev));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app = com.defch.blogwbly.MyApplication.getInstance();
    addPreferencesFromResource(R.xml.settings);
    bindPreference(findPreference(SettingsActivity.THEME_KEY));
    findPreference(SettingsActivity.KEY_DARK_THEME).setOnPreferenceChangeListener(this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.jialin.chat.MessageInputToolBox.faceLayout.getVisibility()) == (VISIBLE)) {
        hideFaceLayout();
        com.jialin.chat.MessageInputToolBox.showKeyboard(context);
    }else {
        showFaceLayout();
    }
}

@java.lang.Override
public okhttp3.Response intercept(org.gdg.frisbee.android.api.Chain chain) throws java.io.IOException {
    org.gdg.frisbee.android.api.EspressoIdlingResource.increment();
    okhttp3.Request request = chain.request();
    return chain.proceed(request);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_folder, container, false);
}

private boolean resetTouchEventFlag(final int flag) {
    org.deviceconnect.android.deviceplugin.sw.profile.SWTouchProfile.sFlagTouchEventManage &= ~flag;
    return (org.deviceconnect.android.deviceplugin.sw.profile.SWTouchProfile.sFlagTouchEventManage) != 0;
}

@java.lang.Override
public void navigateChangedImagesScreen() {
    finish();
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    isCount = true;
    setEnabled(false);
    onTimeListener.startTime();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_setting);
    addListenerOnButton();
}

@java.lang.Override
public void onClick(android.view.View view) {
    mChatPresenter.sendClicked();
    mChatBox.setText("");
}

private int copyNativeLibs(android.content.Context context, java.lang.String apkfile, android.content.pm.ApplicationInfo applicationInfo) throws java.lang.Exception {
    java.lang.String nativeLibraryDir = com.morgoo.droidplugin.core.PluginDirHelper.getPluginNativeLibraryDir(context, applicationInfo.packageName);
    return com.morgoo.helper.compat.NativeLibraryHelperCompat.copyNativeBinaries(new java.io.File(apkfile), new java.io.File(nativeLibraryDir));
}

@java.lang.Override
public void onConnected(android.os.Bundle arg0) {
    getLocation();
}

public void fetchCalls(java.lang.String filter) {
    cancelFetch();
    fetchCalls(com.android.dialer.calllog.CallLogQueryHandler.QUERY_CALLLOG_TOKEN, filter);
}

@java.lang.Override
public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    at.sw2017.q_up.Place p = ((at.sw2017.q_up.Place) (marker.getTag()));
    if (p != null)
        mapsGoDetails(p.placeId);
    
}

private com.mapbox.mapboxsdk.geometry.LatLng getLatLng(final android.location.Location location) {
    if (location != null) {
        return new com.mapbox.mapboxsdk.geometry.LatLng(location.getLatitude(), location.getLongitude());
    }else {
        return null;
    }
}

public void deleteTask(int count) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL(("DELETE from TASKS WHERE ID == " + count));
}

public void createButtons() {
    refreshButton = ((android.widget.Button) (findViewById(R.id.refresh_button)));
    android.view.View addButton = findViewById(R.id.add_button);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    this.db = db;
    tdd.tracker.hobby.hobbytrackerincremental.database.TableManager tableAdmin = tdd.tracker.hobby.hobbytrackerincremental.database.TableManager.getInstance();
    for (tdd.tracker.hobby.hobbytrackerincremental.database.Table t : tableAdmin.getTables())
        t.createTable(db);
    
}

public void notifyRunInBackground(com.wangjie.androidbucket.services.network.HippoResponse<T> response) {
    if (response.isSuccess()) {
        if ((listener) != null)
            listener.onResponseInBackground(response.getResult());
        
    }
}

public static void i(java.lang.String msg) {
    if ((com.vinci.imageloader.core.util.MLog.DEBUG) || (android.text.TextUtils.isEmpty(msg))) {
        return ;
    }
    android.util.Log.i(com.vinci.imageloader.core.util.MLog.TAG, msg);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    hestia.backend.BackendInteractor backendInteractor = hestia.backend.BackendInteractor.getInstance();
    android.content.SharedPreferences prefs = getSharedPreferences(hestia.UI.DeviceListActivity.HESTIA_IP, 0);
}

public void onNewGame(android.view.View v) {
    BattleActivity.score_player_one = 0;
    BattleActivity.score_player_two = 0;
    BattleActivity.winner = 0;
    android.content.Intent intent = new android.content.Intent(this, com.bugsnguns.asprokopov.tapattack.ChooseTargetActivity.class);
    startActivity(intent);
}

public void onFinish() {
    es.carlosrolindez.kbfinder.SelectBtActivity.service.start();
}

private void OnWeekDayChecked(int dayIndex, java.lang.String dayName) {
    updateCurrentDayReference();
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainFragment);
    if (f instanceof com.SFEDU.schedule_1.ScheduleEditRecordFragment) {
        return ;
    }
    showDayWeek(mCurrentDay);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initTabs();
    initDrawer();
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    startActivity(new android.content.Intent(this, ch.defiant.purplesky.activities.AboutActivity.class));
    return true;
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeString(this.action);
}

@java.lang.Override
public void onClick(android.view.View v) {
    startStopWatch();
    startService(intent);
    android.widget.Toast.makeText(getApplicationContext(), Constants.STARTED, Toast.LENGTH_LONG).show();
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.util.Log.d(com.playxiangqi.hoxchess.MainActivity.TAG, "onPause");
    com.playxiangqi.hoxchess.MessageManager.getInstance().removeListener(this);
    com.playxiangqi.hoxchess.NetworkController.getInstance().removeListener(this);
}

@java.lang.Override
public void run() {
    com.okandroid.boot.widget.PageDataAdapter.ExtraPageLoadingStatusCallback safetyCallback = callback;
    if (safetyCallback == null) {
        safetyCallback = new com.okandroid.boot.widget.PageDataAdapter.SimpleExtraPageLoadingStatusCallback();
    }
    ensurePageLoadingStatusHandler();
    mPageLoadingStatusHandler.showPageLoadingStatus(this, pageLoadingStatus, safetyCallback);
}

public void stop() {
    if ((mClient) == null) {
        android.util.Log.e(getClass().getName(), "locationclient can not be null before using is");
    }else {
        mClient.stop();
    }
}

@java.lang.Override
public void handlerNotification(android.content.Context context, boolean binded, com.yy.httpproxy.service.PushedNotification pushedNotification) {
    if (!binded) {
        showNotification(context, pushedNotification);
    }else {
        sendArrived(context, pushedNotification);
    }
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    return START_STICKY;
}

@java.lang.Override
public void setButtonDrawable(android.graphics.drawable.Drawable d) {
    super.setButtonDrawable(null);
    getPaddingDrawable().setWrappedDrawable(d);
    super.setButtonDrawable(getPaddingDrawable());
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.reset();
    ibPlay.setImageResource(R.drawable.ic_track_play);
}

public static int dp2px(android.content.Context context, int dp) {
    float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((dp * scale) + 0.5F));
}

@java.lang.Override
public void onDelete(android.view.View view) {
    int position = mSlideItemPosition;
    if ((mSlideItemPosition) != (-1)) {
        onItemDelete(view, position);
        mSlideItemPosition = -1;
    }
}

@java.lang.Override
public void run() {
    com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onAlias(context, subAliasStatus.getAlias());
}

public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    if ((jsCommand) != null)
        webView.loadUrl(jsCommand);
    
    setProgressDialogVisible(false);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
    getSupportFragmentManager().putFragment(outState, hu.tvarga.popularmovies.GridViewActivity.GRID_FRAGMENT_SAVED_INSTANCE_KEY, gridViewFragment);
    super.onSaveInstanceState(outState, outPersistentState);
}

private void openLink() {
    if (!(isPermissionGranted())) {
        android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, ru.dzgeorgy.versioncheck.VersionUpdateDialog.PERMISSION_WRITE_EXTERNAL_STORAGE);
        openLink();
    }else {
        ru.dzgeorgy.versioncheck.VersionUpdateDialog.startDownload();
    }
}

public void reset(java.lang.String input) {
    this.input = input;
    currentPos = 0;
    pushedBackTokens = new java.util.Stack<>();
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    if (shouldClearOnOpen && ((editText.length()) > 0)) {
        editText.getText().clear();
    }
    editText.requestFocus();
}

@java.lang.Override
public void onClick(android.view.View v) {
    toggleLike(v.getContext(), holder, position);
}

public static void deleteFlight(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.flight.AirMapFlight flight, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    if (flight != null) {
        com.airmap.airmapsdk.networking.services.FlightService.deleteFlight(flight, callback);
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    username = s.toString();
}

private java.lang.String getLastUpdatedDate() {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    return sharedPref.getString(Constants.KEY_LAST_UPDATED_DATE, "N/A");
}

public void NewWordClicked(android.view.View Sender) {
    selectedWord = wordGenerator.nextWord(selectedLength).toUpperCase();
    scrambledWord = edu.westga.rnrscramble.model.WordScrambler.Scramble(selectedWord);
    setScrambleTextView(scrambledWord);
    setAnswerTextView("");
}

public void refresh(android.widget.CheckBox checkbox, int index) {
    java.util.Set<java.lang.Object> modelValues = retrieveModelValues();
    checkbox.setChecked(modelValues.contains((areValuesDefined() ? values.get(index) : index)));
}

@java.lang.Override
public void onJoinedRoom(int statusCode, com.google.android.gms.games.multiplayer.realtime.Room room) {
    if (statusCode != (com.google.android.gms.games.GamesStatusCodes.STATUS_OK)) {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        showGameError();
    }
    showWaitingRoom(room);
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    mediaPlayer.stop();
    mediaPlayer.release();
    if ((seekBarUpdateHandler) != null)
        seekBarUpdateHandler.removeCallbacks(seekBarUpdateRunnable);
    
    return false;
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    authenticateUser();
}

public static void init(android.content.Context context) {
    try {
        java.lang.Class.forName("com.koushikdutta.ion.Ion");
        com.egame.proxy.support.ion.IonProxy.doInit(context);
    } catch (java.lang.ClassNotFoundException e) {
        android.util.Log.d(ProxyUtil.TAG, "Ion is invalid");
    }
}

public void showAlertDialog() {
    alertDialog = new android.app.Dialog(mainActivity, R.style.DialogTheme);
    alertDialog.setContentView(R.layout.custom_alert_dialog);
    alertDialog.show();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    new com.myhitchhikingspots.SettingsActivity.getCountriesAsyncTask(true).execute();
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    updatePreference(findPreference(key), true);
}

public boolean hasInternetConnection(android.content.Context context) {
    if (context == null) {
        return true;
    }
    return (!(isInAirplaneMode(context))) && (isNetworkAvailable(context));
}

@java.lang.Override
public void onClick(android.view.View view) {
    sendMessageWithPayload(mMessageEditText.getText().toString(), FriendlyMessage.MessageType.Text, false, false);
    mMessageEditText.setText("");
}

public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    setActionBarTitle();
    invalidateOptionsMenu();
}

void sendCode(java.lang.String code, android.content.Context context, com.mooo.ewolvy.uppidown.AASuper aaState, android.widget.ImageView iv) {
    codeToSend = code;
    currentAAState = aaState;
    com.mooo.ewolvy.uppidown.SSLServer.doConnection connection = new com.mooo.ewolvy.uppidown.SSLServer.doConnection();
    connection.execute(context);
    onOffSign = iv;
}

public void showQuestion() {
    android.util.Log.e(rocks.throw20.funwithcountries.MainActivity.LOG_TAG, ("showQuestion " + true));
    rocks.throw20.funwithcountries.Question newQuestions = new rocks.throw20.funwithcountries.Question(this);
    newQuestions.getQuestion("", new java.lang.String[]{  });
}

@java.lang.Override
protected void onResume() {
    super.onResume();
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(("create table clipboard " + "(id integer primary key autoincrement not null, cliptext text,starred boolean default 0,timestamp default current_timestamp not null)"));
}

private static void showMsg(android.view.View targetView, int strId) {
    android.support.design.widget.Snackbar.make(targetView, strId, Snackbar.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialogOnAddButtonPressed();
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.EventBuilder().setCategory("GlucoseDialog").setAction("Add").build());
}

@java.lang.Override
public void onSuccess(com.facebook.share.Sharer.Result shareResult) {
    android.util.Log.i("Share Success", "Shared to facebook");
}

@butterknife.OnClick(value = R.id.today_course_import_or_see_all)
public void seeAll() {
    android.content.Intent through_out = new android.content.Intent(getActivity(), me.gensh.helloustb.Timetable.class);
    startActivity(through_out);
}

public void stop() {
    soloLinkMgr.stop();
    if (!(org.droidplanner.services.android.BuildConfig.SITL_DEBUG)) {
        controllerLinkManager.stop();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.detailed_item_screen_withpicker);
    init_views();
    setHomeButton();
    get_set_intentdata();
    setInitial_itemPrice();
    send_data_tomainmenu();
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.content.SharedPreferences sharedPreferences = settingsFragment.getPreferenceScreen().getSharedPreferences();
    sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkIfClueFound();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (com.comp.ninti.general.NavigationUtil.switchNavigation(item, this))
        return true;
    
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(final android.view.View v) {
    android.support.v4.app.FragmentActivity activity = getActivity();
    com.example.alexm.kunzhutproject.MainActivity mainActivity = ((com.example.alexm.kunzhutproject.MainActivity) (activity));
    mainActivity.showFragment(new com.example.alexm.kunzhutproject.ChatFragmant(), true);
}

public void onFailure(java.io.IOException e) {
    android.util.Log.w("Download", "Download Failed");
    for (org.bottiger.podcast.service.Downloader.engines.Callback callback : mExternalCallback) {
        callback.downloadInterrupted(mEpisode);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.appspot.glancesocial.glance.InstaWebViewActivity.class);
    startActivity(intent);
}

private void showSpinner(java.lang.String message) {
    this.mSpinner = new android.app.ProgressDialog(this);
    this.mSpinner.setMessage(message);
    this.mSpinner.setCancelable(false);
    this.mSpinner.show();
}

private void onPlayButtonClick(java.lang.String fileName) {
    mInput.playback(fileName);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    ((com.supafly.swampdefense.MainActivity) (getActivity())).isPaused = false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    buildGeoFence();
}

public static android.graphics.Bitmap getAvatarValidBitmap(android.graphics.Bitmap bitmap) {
    return org.puresoftware.chocalandroid.ChocalImage.resize(org.puresoftware.chocalandroid.ChocalImage.cropToSquare(bitmap), 128, 128);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.SharedPreferences sharedPrefs = edu.mit.mitmobile2.PreferenceUtils.getDefaultSharedPreferencesMultiProcess(getActivity());
    if (filterChanged(sharedPrefs)) {
        getCalendarEvents(getArguments().getString(edu.mit.mitmobile2.events.fragment.CalendarDayFragment.DATE));
    }
}

@java.lang.Override
public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() {
    if ((mIsHceCapable) && ((mCardEmulationManager) != null)) {
        return mCardEmulationManager.getNfcCardEmulationInterface();
    }else {
        return null;
    }
}

@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    spinner.setSelection(firstVisibleItem);
}

@java.lang.Override
public void onViewPagerDataChanged(android.support.v4.view.ViewPager viewPager) {
    mTabLayout.setupWithViewPager(viewPager);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    mAnimator = null;
    if ((mTouchedDotView.getOnDotStateChangedListener()) != null) {
        mTouchedDotView.getOnDotStateChangedListener().onDismissed(mTouchedDotView);
    }
    dismissed();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    handler = new android.os.Handler();
    showMessage("Service created");
}

void userFavorites(com.dreamdigitizers.androidbaselibrary.utilities.UtilsDialog.IRetryAction pRetryAction);

@java.lang.Override
public void onNext(lt.dualpair.android.data.resource.Match match) {
    adapter.append(match);
    adapter.notifyDataSetChanged();
    publish();
}

public void displayForTeamA(int score) {
    int a;
    android.widget.TextView scoreView = ((android.widget.TextView) (findViewById(R.id.team_a_score)));
    scoreView.setText(java.lang.String.valueOf(score));
}

public void openEditorForNewNote(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.plainolnotes.EditorActivity.class);
    startActivityForResult(intent, com.example.plainolnotes.MainActivity.EDITOR_REQUEST_CODE);
}

public abstract void init(android.widget.ImageView imageView, android.widget.ImageView imageView2, com.xingzhiqiao.zipperlockdemo.LockScreenUtils lockScreenUtils);

@java.lang.Override
public void onClick(android.view.View v) {
    makeQuickAction(indexInItineraryList, position, mDataset.get(position));
}

private void handleStartApp(android.content.Intent intent) {
    android.os.Bundle bundle = intent.getExtras();
    mPendingIntent = ((android.app.PendingIntent) (bundle.get("PendingIntent")));
}

private void hideOption(int id) {
    if ((mOptionsMenu) != null) {
        android.view.MenuItem item = mOptionsMenu.findItem(id);
        item.setVisible(false);
    }
}

