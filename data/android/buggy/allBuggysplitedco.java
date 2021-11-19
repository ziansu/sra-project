private android.app.AlertDialog getNetworkErrorDialog(android.app.Activity activity, android.content.DialogInterface.OnClickListener createNetworkListener) {
    if ((networkErrorDialog) == null) {
        createNetworkErrorDialog(activity, createNetworkListener);
    }
    return networkErrorDialog;
}

public void setOrder(android.view.MenuItem order) {
    if ((setItemOrder()) == (com.example.personale.noteexam.controller.utilities.Field.ORDER_DESC)) {
        order.setIcon(R.drawable.ic_desc);
    }else {
        order.setIcon(R.drawable.ic_asc);
    }
}

@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    mMode = mode;
    getMenuInflater().inflate(R.menu.select_all, menu);
    mode.setTitle("已選擇:0");
    android.util.Log.i("zj", "onCreateActionMode");
    return true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tv_test = ((android.widget.TextView) (findViewById(R.id.tv_test)));
    tv_test.setText(BuildConfig.MARKET_URL);
}

@java.lang.Override
public rx.Completable call(java.lang.Throwable throwable) {
    return rx.Completable.error(new com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException.CANNOT_WRITE_CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR));
}

void pause() {
    camera.stopPreview();
    camera.setPreviewCallback(null);
    camera.release();
    android.util.Log.d("", "pause: camera released");
}

public static void showLoading(@android.support.annotation.NonNull
android.view.View loadingView, @android.support.annotation.NonNull
android.view.View contentView, @android.support.annotation.NonNull
android.view.View errorView) {
    errorView.setVisibility(View.GONE);
    loadingView.setVisibility(View.VISIBLE);
}

@java.lang.Override
protected void onDetachedFromWindow() {
    android.util.Log.d("CustomViewFlipper", "onDetachedFromWindow");
    super.onDetachedFromWindow();
}

public static com.obabichev.artists.fragments.ArtistDetailsFragment create(android.content.Context context, com.obabichev.artists.model.Artist artist) {
    com.obabichev.artists.fragments.ArtistDetailsFragment fragment = new com.obabichev.artists.fragments.ArtistDetailsFragment();
    fragment.artist = artist;
    fragment.context = context;
    return fragment;
}

@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    mCalendar.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    mCalendar.set(java.util.Calendar.MINUTE, minute);
    updateTime();
}

@java.lang.Override
public void onClick(android.view.View v) {
    ipv.setCoverDrawable(R.drawable.no_cover);
    playlist.play(((playlist.getSongIndex()) + 1), songInfo, sharerInfo);
    playing = true;
}

@java.lang.Override
public void onDateSetSuccess(java.util.Date date) {
    mDob = date;
    java.lang.String dateString = com.lftechnology.khop.khop.utils.DateUtils.getDateString(date, com.lftechnology.khop.khop.activity.AddChildActivity.DATE_FORMAT);
    android.widget.Toast.makeText(this, dateString, Toast.LENGTH_SHORT).show();
    mDateOfBirth.setText(dateString);
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.morning.AlarmService.snoozeAlarm(this, mAlarm);
    finish();
}

public com.takahirom.android_abtest_builder.ABTest<T> buildIfFirstTime() {
    com.takahirom.android_abtest_builder.ABTest<T> builtInstance = com.takahirom.android_abtest_builder.ABTest.getBuiltInstance(context, clazz);
    if (builtInstance != null) {
        return builtInstance;
    }
    return build();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.util.Log.v(TAG, "onCreateOptionsMenu()");
    getMenuInflater().inflate(R.menu.options_menu, menu);
    return true;
}

@java.lang.Override
public void onCloseWindow(android.webkit.WebView window) {
    android.util.Log.d(getString(R.string.TAG), "Window Closed");
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    if ((menu.size()) == 2) {
        inflater.inflate(R.menu.menu_favourite, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}

@com.facebook.react.bridge.ReactMethod
@android.support.annotation.NonNull
public java.lang.Object variationForKeyWithDefaultValue(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.NonNull
java.lang.Object defaultValue, @javax.annotation.Nullable
com.facebook.react.bridge.Callback callback) {
    java.lang.Object retrievedObject = com.vwo.mobile.VWO.getVariationForKey(key, defaultValue);
    if (callback != null) {
        callback.invoke(retrievedObject);
    }
    return retrievedObject;
}

@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    progressBar.setVisibility(View.VISIBLE);
    android.widget.Toast.makeText(this, "Started Loading", Toast.LENGTH_SHORT).show();
    forceLoad();
}

@java.lang.Override
public void onClick(android.view.View v) {
    uploadImage();
    uploadImage();
    android.widget.Toast.makeText(getApplicationContext(), "Upload Here", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.v("Flathead", "[Flow] Java - onDestroy");
    com.flathead.MYFWPackage.MYFWActivity.NativeOnDestroy();
    if (m_ShowAds) {
    }
    super.onDestroy();
    m_IAPManager.Shutdown();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.input_categories);
    connector = new be.coenenjonas.spendapp.Connector();
    java.lang.System.out.println("helloworldomgyes");
    setup();
}

private void init() {
    if (isInEditMode()) {
        android.view.View view = inflate(this.getContext(), R.layout.card, this);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    boolean checked = ((android.widget.CheckBox) (v)).isChecked();
}

@java.lang.Override
public void onMessageReceived(java.lang.String endpointId, byte[] payload, boolean isReliable) {
    if (!isReliable) {
        return ;
    }
    int message = de.handler.mobile.android.videobox.MessageHelper.unmapPayload(payload);
    this.handleMessage(message);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    command &= 248;
    command |= progress;
    sendCommand();
    receiveAndUpdateStatus();
}

public void speak(java.lang.String toSpeak) {
    android.widget.Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, params);
}

private void navigateToMain() {
    android.content.Intent intent = new android.content.Intent(this, com.patels95.sanam.ewb.ui.MainActivity.class);
    startActivity(intent);
    android.widget.Toast.makeText(this, "You have been logged out.", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    _processed = true;
    android.widget.Toast.makeText(getApplicationContext(), "Przetworzono ", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    countmaterial.add(position, s.toString());
}

public void initVariable() {
    android.util.Log.i("INIT", "TopupFragment");
    hideSoftKeyboard(getActivity().getCurrentFocus());
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    tvShowDetailPresenter.seasonSelected(position);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    singleton.removeFromAllLinks(positionToRemove);
    notifyDataSetChanged();
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    intentFilter.addAction("android.location.PROVIDERS_CHANGED");
    getActivity().registerReceiver(receiver, intentFilter);
    setup();
}

public void newCameraOpen(android.view.View view) {
    android.widget.Toast.makeText(this, "NewCamera", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(this, cs321.classcamapp.CameraActivity2.class);
    startActivity(intent);
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    ensureRecycler();
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if (((isInPlaybackState()) && ((mMediaController) != null)) && ((mCurrentState) != (meng.videoplayproto.widget.TextureVideoView.STATE_PLAYBACK_COMPLETED))) {
        toggleMediaControlsVisibility();
    }
    return false;
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((googleApiClient) != null) {
        android.util.Log.i(au.com.mazeit.seedaudit.GoogleDrive.TAG, "In onStop() - disConnecting...");
        googleApiClient.disconnect();
    }
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int what, int extra) {
    if ((videoView) == null) {
        return false;
    }
    com.medo.tweetspie.utils.IntentUtils.openUrl(this, url);
    exit();
    return false;
}

public static void synchronizeMotivationCsv(android.content.Context context) {
    android.util.Log.d("darkGoals", "synchronizing csv");
    aman.darkgoals.MotivationAlarm.DownloadCsvTask csvTask = new aman.darkgoals.MotivationAlarm.DownloadCsvTask(context);
    csvTask.execute(((aman.darkgoals.MotivationAlarm.MOTIVATION_PATH) + (aman.darkgoals.MotivationAlarm.MESSAGES_CSV)));
}

private void showEditDialog(info.dylansymons.fpfrhelper.player.Player player) {
    android.app.DialogFragment fragment = info.dylansymons.fpfrhelper.game.management.NewPlayerDialogFragment.newEditInstance(mGame.getFirefighterList(), mColourList, this, player);
    fragment.show(getFragmentManager(), "dialog");
}

public void onConfigurationChanged(android.content.res.Configuration config) {
    com.gigigo.ggglogger.GGGLogImpl.log("onConfigurationChanged");
    vuforiaAppSession.onConfigurationChanged();
}

public static java.lang.String retrieveAuthToken(android.content.Context context) {
    com.reminisense.fa.models.LoginResult loginResult = com.reminisense.fa.managers.CacheManager.retrieveLoginResult(context);
    return loginResult.getAuthenticationToken();
}

@java.lang.Override
public void onBackPressed() {
    android.app.FragmentManager fm = getFragmentManager();
    fm.popBackStack(null, android.support.v4.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_intros, container, false);
    initView(view);
    initData();
    return view;
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    android.view.ViewGroup.LayoutParams params = mTabs.getLayoutParams();
    params.height = mToolbar.getHeight();
    mTabs.setLayoutParams(params);
    mLoadingContainer.setVisibility(View.GONE);
}

private void checkForResumedCalculating() {
    if ((!(android.text.TextUtils.isEmpty(answer))) && (android.text.TextUtils.isEmpty(equation))) {
        equationHandler.handleResumedCalculating(equation, answer);
    }
}

public static boolean isT9Auto(android.content.Context context) {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return sp.getBoolean("t9_auto", false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("TEST", ("TAG" + (view.getTag())));
    com.jayway.alphabet.tracking.FirebaseTracker.getInstance().send(("REGISTRATION_ON_FIELD_CLICKED_" + (view.getTag())));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((targetAccuracy) == (com.geoodk.collect.android.widgets.GeoPointNewWidget.UNSET_LOCATION_ACCURACY)) {
        currentMode = com.geoodk.collect.android.activities.GeoPointMapNewActivity.MODE_AUTO;
        resetLocationPointAtCurrentPosition();
        refreshClearButtonVisibility();
    }else {
        showClearDialog();
    }
}

@com.o3dr.services.android.lib.drone.connection.ConnectionType.Type
public int getConnectionParameterType() {
    @com.o3dr.services.android.lib.drone.connection.ConnectionType.Type
    int connectionType = java.lang.Integer.parseInt(prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_CONNECTION_TYPE, org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_CONNECTION_TYPE));
    return connectionType;
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    mp = new android.media.MediaPlayer();
}

@java.lang.Override
public void onClick(android.view.View v) {
    root.setDefault(s, view);
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    setCurrentItem(msg.what);
}

@javax.inject.Singleton
@dagger.Provides
com.kamk2k.alkobuddy.presenter.MainActivityPresenter provideMainActivityPresenter(com.kamk2k.alkobuddy.presenter.logic.UserStateChangeHandler userStateChangeHandler, android.os.Handler updateHandler, com.kamk2k.alkobuddy.presenter.CreateDrinkPresenter createDrinkPresenter) {
    return new com.kamk2k.alkobuddy.presenter.MainActivityPresenterImpl(userStateChangeHandler, updateHandler, createDrinkPresenter);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (vacationMode) {
        confirmOff();
        vacationMode = false;
    }else {
        confirmOn();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    setTitle("DetailActivity");
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.tag = ((io.tanners.taggedwallpaper.interfaces.IGetTag) (getActivity())).getTag();
}

public void setPermission(int permission) {
    android.util.Log.d("Journee-permission", ("setting permission:" + permission));
    this.permission = permission;
}

@java.lang.Override
public void onProviderDisabled(java.lang.String s) {
    android.util.Log.d("GPSTest", "onProviderDisabled called");
    org.redcross.openmapkit.tagswipe.TagEdit.cleanUserLocationTags();
    checkLocationProviderEnabled();
}

@java.lang.Override
public void onBandUpErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.d(com.melodies.bandup.gcm_tools.RegistrationIntentService.TAG, error.getMessage());
}

public void showJobActivity(android.view.View view) {
    saveInfo();
    android.content.Intent intent = new android.content.Intent(this, dat255.chalmers.com.welcome.JobActivity.class);
    dat255.chalmers.com.welcome.GenderAndBirthActivity.jobActivityActivated = true;
    startActivity(intent);
}

public void addHeaderView(android.view.View view) {
    mHeaderView = view;
    mGloriousAdapter.notifyItemInserted(0);
}

public void resetSelectedTags() {
    for (android.widget.CheckBox c : checkBoxes)
        c.setChecked(false);
    
    selectedStrings.clear();
}

@java.lang.Override
public nu.yona.app.ui.challenges.TimeZoneGoalViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layoutView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.timezoen_goal_item_layout, null);
    nu.yona.app.ui.challenges.TimeZoneGoalViewHolder rHolder = new nu.yona.app.ui.challenges.TimeZoneGoalViewHolder(layoutView, clickListener);
    return rHolder;
}

private void handleIntent(android.content.Intent intent) {
    com.sina.weibo.sdk.api.share.IWeiboShareAPI api = mIShareWeiboHelper.getIWeiboShareAPI();
    if (api != null) {
        api.handleWeiboResponse(intent, com.idonans.ishare.weibo.IShareWeiboHelper.getGlobalWeiboHandlerResponseAdapter());
    }
}

public static void returnToDefaultTheme(android.content.Context context) {
    Settings.Secure.putInt(context.getContentResolver(), Settings.Secure.THEME_PRIMARY_COLOR, 1);
    Settings.Secure.putInt(context.getContentResolver(), Settings.Secure.THEME_ACCENT_COLOR, 0);
}

@java.lang.Override
public void onItemSelected(android.net.Uri eventUri) {
    android.content.Intent intent = new android.content.Intent(this, com.example.olivi.maphap.DetailActivity.class).setData(eventUri);
    startActivity(intent);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    cn.alien95.util.Utils.Log("fragment onCreate");
    getActivity().setTitle("吃货");
    adapter = new cn.zhou.foodie.module.adapter.CommodityAdapter(java.security.AccessController.getContext());
}

@javax.annotation.Nullable
public static java.lang.String getCleanString(android.text.Editable editable) {
    java.lang.String str = editable.toString().trim();
    return (str.length()) > 0 ? str : null;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.i("alertdialog", " Please save the home location");
}

public void onClick(android.content.DialogInterface dialog, int which) {
    progressDialog.dismiss();
    getFragmentManager().popBackStack();
}

public void ProfileSetting() {
    android.content.Intent myIntent = new android.content.Intent(this, gopackdev.arrivalpack.ProfileSettingActivity.class);
    startActivity(myIntent);
}

@java.lang.Override
protected void onStop() {
    if ((photoListAdapter) != null) {
        android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
    }
    super.onStop();
}

public static android.security.KeyStore getInstance() {
    android.security.IKeystoreService keystore = IKeystoreService.Stub.asInterface(android.os.ServiceManager.getService("android.security.keystore"));
    return new android.security.KeyStore(keystore);
}

public void onClick(android.view.View v) {
    startActivity(game_intent);
    startService(new android.content.Intent(this, com.example.veronika.ball.MusicService.class));
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.allfeedsitem, menu);
    android.view.MenuItem searchItem = menu.findItem(R.id.action_search);
    searchItem.setVisible(false);
    return super.onCreateOptionsMenu(menu);
}

public static com.android.volley.RequestQueue getRequestQueue() {
    if ((com.aspsine.swipetoloadlayout.demo.App.sRequestQueue) == null) {
        synchronized(com.aspsine.swipetoloadlayout.demo.App.class) {
            com.aspsine.swipetoloadlayout.demo.App.sRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.aspsine.swipetoloadlayout.demo.App.sContext);
        }
    }
    return com.aspsine.swipetoloadlayout.demo.App.sRequestQueue;
}

@java.lang.Override
public java.lang.Boolean proceed(final android.content.Intent intent) {
    return com.oasisfeng.condom.CondomContext.super.bindService(intent, conn, flags);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.v(TAG, ("onDestroy() called for fragment with tag: " + (mTag)));
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map);
    init();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), dsca.cs.nju.mytabmenudemo.login.LoginActivity.class);
    startActivity(intent);
    finish();
}

private void pushToBackstack(@android.support.annotation.NonNull
com.bluelinelabs.conductor.RouterTransaction entry) {
    backstack.push(entry);
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    java.lang.System.out.println(new com.google.gson.Gson().toJson(error));
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    audioVisualization.linkTo(DbmHandler.Factory.newVisualizerHandler(getContext(), 0));
    viewPager.setCurrentItem(mPreferences.getStartPageIndex());
}

@java.lang.Override
public void onLoadMore(int current_page) {
    page = current_page;
    new com.androidbelieve.drawerwithswipetabs.SerialsFragment.LoadSerials(false).execute();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent intent1 = new android.content.Intent(context, com.example.kali.weathy.WeatherActivity.class);
    intent1.putExtra("refresh", "refresh");
    startActivity(intent1);
    finish();
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.w("TopicsFragment:Destroy", "I am here");
    super.onDestroy();
    topicsData = null;
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    boolean startAgain = false;
    snakeThread.setRunning(false);
    while (startAgain) {
        try {
            snakeThread.join();
            startAgain = false;
        } catch (java.lang.InterruptedException e) {
        }
    } 
}

@java.lang.Override
public void onClick(android.view.View v) {
    MainContent.setText(R.string.reverb_text);
    TitleContent.setText(R.string.reverb_title);
    if (ReverbButton.isChecked()) {
        ReverbButton.setBackgroundColor(Color.GREEN);
    }else
        ReverbButton.setBackgroundColor(Color.LTGRAY);
    
}

public static void postStressMeasurementData(android.content.Context context, org.json.JSONObject object) {
    java.lang.String url = (NetworkConstants.BASE_URL) + (NetworkConstants.POST_PIP_DATA_ENDPOINT);
    new com.wearables.networking.NetworkingTask(url, true, com.wearables.networking.NetworkConstants.METHOD_TYPE.POST, com.wearables.networking.NetworkConstants.REQUEST_TYPE.POST_PIP, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, object);
}

@java.lang.Override
public void responseCallBack(org.json.JSONObject response) {
    android.widget.Toast.makeText(getApplicationContext(), ("Meetup successfully created!" + " Now to add content and people to it!"), Toast.LENGTH_LONG).show();
}

public void onClick(android.view.View v) {
    if ((features.backButtonCanClose) && (!(inAppWebView.canGoBack()))) {
        closeDialog();
    }else {
        goBack();
    }
}

private static boolean isGpsHardwarePresent(android.content.Context context) {
    try {
        return com.jstakun.gms.android.location.LocationServicesManager.HelperInternal.isGpsHardwarePresent(context);
    } catch (java.lang.VerifyError e) {
        return true;
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    sbGotoPage.setProgress(((mMaxPage) - 1));
    mCurrentPage = mGoToPage;
    mOffsetInPage = LAST_FLOOR_OFFSET;
    showOrLoadPage();
    dialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View view) {
    setUserLocationNoStair();
    finishButton.setVisibility(View.INVISIBLE);
}

@java.lang.Override
public void onBindViewHolder(final adapter.EstacaoAdapter.PersonViewHolder personViewHolder, int position) {
    personViewHolder.tvSupervisor.setText(lista.get(position).getDescricao());
    personViewHolder.cbCheck.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
        }
    });
}

public void onLocationChanged(android.location.Location location) {
    location.getLatitude();
    location.getLongitude();
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    acquisitionSaveRequest = null;
    chartComponent.play(true);
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    endDateEditText.setText(formatDate(year, monthOfYear, dayOfMonth));
    startDateEditText.clearFocus();
    layout.requestFocus();
}

