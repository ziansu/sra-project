private android.app.AlertDialog getNetworkErrorDialog(android.app.Activity activity, android.content.DialogInterface.OnClickListener createNetworkListener) {
    createNetworkErrorDialog(activity, createNetworkListener);
    return networkErrorDialog;
}

public void setOrder(android.view.MenuItem order) {
    if ((setItemOrder()) == (com.example.personale.noteexam.controller.utilities.Field.ORDER_DESC)) {
        order.setIcon(R.drawable.ic_asc);
    }else {
        order.setIcon(R.drawable.ic_desc);
    }
}

@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    mMode = mode;
    getMenuInflater().inflate(R.menu.select_all, menu);
    android.util.Log.i("zj", "onCreateActionMode");
    return true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tv_test = ((android.widget.TextView) (findViewById(R.id.tv_test)));
}

@java.lang.Override
public rx.Completable call(java.lang.Throwable throwable) {
    return rx.Completable.error(new com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException.CANNOT_WRITE_CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR, throwable));
}

void pause() {
    camera.stopPreview();
    camera.setPreviewCallback(null);
    camera.release();
}

public static void showLoading(@android.support.annotation.NonNull
android.view.View loadingView, @android.support.annotation.NonNull
android.view.View errorView) {
    errorView.setVisibility(View.GONE);
    loadingView.setVisibility(View.VISIBLE);
}

@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
}

public static com.obabichev.artists.fragments.ArtistDetailsFragment create(com.obabichev.artists.model.Artist artist) {
    com.obabichev.artists.fragments.ArtistDetailsFragment fragment = new com.obabichev.artists.fragments.ArtistDetailsFragment();
    fragment.artist = artist;
    return fragment;
}

@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hourOfDay, int minute) {
    mCalendar.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    mCalendar.set(java.util.Calendar.MINUTE, minute);
    updateTime(mCalendar);
}

@java.lang.Override
public void onClick(android.view.View v) {
    playlist.play(((playlist.getSongIndex()) + 1), songInfo, sharerInfo);
    playing = true;
}

@java.lang.Override
public void onDateSetSuccess(java.util.Date date) {
    mDob = date;
    java.lang.String dateString = com.lftechnology.khop.khop.utils.DateUtils.getDateString(date, com.lftechnology.khop.khop.activity.AddChildActivity.DATE_FORMAT);
    mDateOfBirth.setText(dateString);
}

@java.lang.Override
public void onClick(android.view.View view) {
    finish();
}

public com.takahirom.android_abtest_builder.ABTest<T> buildIfFirstTime() {
    com.takahirom.android_abtest_builder.ABTest<T> builtInstance = com.takahirom.android_abtest_builder.ABTest.getBuiltInstance(context, name, clazz);
    if (builtInstance != null) {
        return builtInstance;
    }
    return build();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.options_menu, menu);
    return true;
}

@java.lang.Override
public void onCloseWindow(android.webkit.WebView window) {
    super.onCloseWindow(window);
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
}

@com.facebook.react.bridge.ReactMethod
@android.support.annotation.NonNull
public java.lang.Object variationForKeyWithDefaultValue(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.NonNull
java.lang.Object defaultValue, @javax.annotation.Nullable
com.facebook.react.bridge.Callback callback) {
    java.lang.Object retrievedObject = com.vwo.mobile.VWO.getVariationForKey(key, defaultValue);
    if (callback != null) {
        callback.invoke(null, retrievedObject);
    }
    return retrievedObject;
}

@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    progressBar.setVisibility(View.VISIBLE);
    forceLoad();
}

@java.lang.Override
public void onClick(android.view.View v) {
    uploadImage();
    android.widget.Toast.makeText(getApplicationContext(), "Upload Here", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.v("Flathead", "[Flow] Java - onDestroy");
    com.flathead.MYFWPackage.MYFWActivity.NativeOnDestroy();
    if (m_ShowAds) {
    }
    m_IAPManager.Shutdown();
    super.onDestroy();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.input_categories);
    connector = new be.coenenjonas.spendapp.Connector();
    setup();
}

private void init() {
    if (isInEditMode()) {
        inflate(this.getContext(), R.layout.card, this);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    boolean checked = ((android.widget.CheckBox) (v)).isChecked();
    if (checked) {
    }
}

@java.lang.Override
public void onMessageReceived(java.lang.String endpointId, byte[] payload, boolean isReliable) {
    if (!isReliable) {
        return ;
    }
    int message = de.handler.mobile.android.videobox.MessageHelper.unmapPayload(payload);
    this.handleMessage(message, endpointId);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    command &= 248;
    command |= progress;
    sendCommand();
}

public void speak(java.lang.String toSpeak) {
    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, params);
}

private void navigateToMain() {
    android.content.Intent intent = new android.content.Intent(this, com.patels95.sanam.ewb.ui.MainActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    _processed = true;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    countmaterial.set(position, s.toString());
}

public void initVariable() {
    android.util.Log.i("INIT", "TopupFragment");
    hideSoftKeyboard(getActivity());
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    tvShowDetailPresenter.seasonSelected((position + 1));
}

public void onClick(android.content.DialogInterface dialog, int which) {
    singleton.removeFromAllLinks(positionToRemove);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    setup();
    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    intentFilter.addAction("android.location.PROVIDERS_CHANGED");
    getActivity().registerReceiver(receiver, intentFilter);
}

public void newCameraOpen(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, cs321.classcamapp.CameraActivity2.class);
    startActivity(intent);
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    ensureRecycler();
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if ((isInPlaybackState()) && ((mMediaController) != null)) {
        toggleMediaControlsVisibility();
    }
    return false;
}

@java.lang.Override
protected void onStop() {
    super.onStop();
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int what, int extra) {
    com.medo.tweetspie.utils.IntentUtils.openUrl(this, url);
    exit();
    return false;
}

public static void synchronizeMotivationCsv(android.content.Context context) {
    aman.darkgoals.MotivationAlarm.DownloadCsvTask csvTask = new aman.darkgoals.MotivationAlarm.DownloadCsvTask(context);
    csvTask.execute(((aman.darkgoals.MotivationAlarm.MOTIVATION_PATH) + (aman.darkgoals.MotivationAlarm.MESSAGES_CSV)));
}

private void showEditDialog(info.dylansymons.fpfrhelper.player.Player player) {
    android.app.DialogFragment fragment = info.dylansymons.fpfrhelper.game.management.NewPlayerDialogFragment.newEditInstance(mGame, mColourList, this, player);
    fragment.show(getFragmentManager(), "dialog");
}

public void onConfigurationChanged(android.content.res.Configuration config) {
    vuforiaAppSession.onConfigurationChanged();
}

public static java.lang.String retrieveAuthToken(android.content.Context context) {
    com.reminisense.fa.models.LoginResult loginResult = com.reminisense.fa.managers.CacheManager.retrieveLoginResult(context);
    return loginResult == null ? null : loginResult.getAuthenticationToken();
}

@java.lang.Override
public void onBackPressed() {
    android.app.FragmentManager fm = getFragmentManager();
    fm.popBackStack();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_intros, container, false);
    init();
    initView(view);
    initData();
    return view;
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    mLoadingContainer.setVisibility(View.GONE);
}

private void checkForResumedCalculating() {
    if ((!(android.text.TextUtils.isEmpty(answer))) && (android.text.TextUtils.isEmpty(equation))) {
        equation = equationHandler.handleResumedCalculating(equation, answer);
    }
}

public static boolean isT9Auto(android.content.Context context) {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return sp.getBoolean("t9_auto", true);
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.jayway.alphabet.tracking.FirebaseTracker.getInstance().send(("REGISTRATION_ON_FIELD_CLICKED_" + (view.getTag())));
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@com.o3dr.services.android.lib.drone.connection.ConnectionType.Type
public int getConnectionParameterType() {
    @com.o3dr.services.android.lib.drone.connection.ConnectionType.Type
    int connectionType = java.lang.Integer.parseInt(prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_CONNECTION_TYPE, org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_CONNECTION_TYPE).trim());
    return connectionType;
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    init();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) != (view.getId())) {
    }
    root.setDefault(s, view);
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    setCurrentItem(msg.what, false);
}

@javax.inject.Singleton
@dagger.Provides
com.kamk2k.alkobuddy.presenter.MainActivityPresenter provideMainActivityPresenter(com.kamk2k.alkobuddy.presenter.logic.UserStateChangeHandler userStateChangeHandler, android.os.Handler updateHandler, com.kamk2k.alkobuddy.presenter.CreateDrinkPresenter createDrinkPresenter, android.content.Context context) {
    return new com.kamk2k.alkobuddy.presenter.MainActivityPresenterImpl(userStateChangeHandler, updateHandler, createDrinkPresenter, context);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (vacationMode) {
        confirmOff();
        vacationMode = false;
    }else {
        confirmOn();
        vacationMode = true;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getActivity()) instanceof io.tanners.taggedwallpaper.interfaces.IGetTag) {
        this.tag = ((io.tanners.taggedwallpaper.interfaces.IGetTag) (getActivity())).getTag();
    }else {
    }
}

public void setPermission(int permission) {
    this.permission = permission;
}

@java.lang.Override
public void onProviderDisabled(java.lang.String s) {
    org.redcross.openmapkit.tagswipe.TagEdit.cleanUserLocationTags();
    checkLocationProviderEnabled();
}

@java.lang.Override
public void onBandUpErrorResponse(com.android.volley.VolleyError error) {
    if (error == null) {
        return ;
    }
    android.util.Log.d(com.melodies.bandup.gcm_tools.RegistrationIntentService.TAG, error.getMessage());
}

public void showJobActivity(android.view.View view) {
    saveInfo();
    android.content.Intent intent = new android.content.Intent(this, dat255.chalmers.com.welcome.JobActivity.class);
    startActivity(intent);
}

public void addHeaderView(android.view.View view) {
    if ((view != null) && ((mHeaderView) == null)) {
        mHeaderView = view;
        mGloriousAdapter.notifyItemInserted(0);
    }
}

public void resetSelectedTags() {
    for (android.widget.CheckBox c : checkBoxes)
        c.setChecked(false);
    
}

@java.lang.Override
public nu.yona.app.ui.challenges.TimeZoneGoalViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layoutView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.timezoen_goal_item_layout, parent, false);
    nu.yona.app.ui.challenges.TimeZoneGoalViewHolder rHolder = new nu.yona.app.ui.challenges.TimeZoneGoalViewHolder(layoutView, clickListener);
    return rHolder;
}

private void handleIntent(android.content.Intent intent) {
    com.sina.weibo.sdk.api.share.IWeiboShareAPI api = mIShareWeiboHelper.getIWeiboShareAPI();
    if (api != null) {
        api.handleWeiboResponse(intent, this);
    }
}

public static void returnToDefaultTheme(android.content.Context context) {
    Settings.Secure.putInt(context.getContentResolver(), Settings.Secure.THEME_PRIMARY_COLOR, 0);
    Settings.Secure.putInt(context.getContentResolver(), Settings.Secure.THEME_ACCENT_COLOR, 0);
}

@java.lang.Override
public void onItemSelected(android.net.Uri eventUri, int position) {
    android.content.Intent intent = new android.content.Intent(this, com.example.olivi.maphap.DetailActivity.class).setData(eventUri);
    startActivity(intent);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    cn.alien95.util.Utils.Log("fragment onCreate");
    getActivity().setTitle("吃货");
    adapter = new cn.zhou.foodie.module.adapter.CommodityAdapter(getContext());
}

@javax.annotation.Nullable
static java.lang.String getCleanString(java.lang.String str) {
    if (str == null) {
        return null;
    }else {
        str = str.trim();
        return (str.length()) > 0 ? str : null;
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    getFragmentManager().popBackStack();
}

public void ProfileSetting() {
    if (!(getClass().equals(gopackdev.arrivalpack.ProfileSettingActivity.class))) {
        android.content.Intent myIntent = new android.content.Intent(this, gopackdev.arrivalpack.ProfileSettingActivity.class);
        startActivity(myIntent);
    }
}

@java.lang.Override
protected void onStop() {
    unregisterReceiver(broadcastReceiver);
    super.onStop();
}

public static android.security.KeyStore getInstance() {
    android.security.IKeystoreService keystore = IKeystoreService.Stub.asInterface(android.os.ServiceManager.getService("android.security.keystore"));
    if (keystore == null) {
        return null;
    }
    return new android.security.KeyStore(keystore);
}

public void onClick(android.view.View v) {
    startActivity(game_intent);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.allfeedsitem, menu);
    android.view.MenuItem searchItem = menu.findItem(R.id.action_search);
    return super.onCreateOptionsMenu(menu);
}

public static com.android.volley.RequestQueue getRequestQueue() {
    if ((com.aspsine.swipetoloadlayout.demo.App.sRequestQueue) == null) {
        com.aspsine.swipetoloadlayout.demo.App.sRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.aspsine.swipetoloadlayout.demo.App.sContext);
    }
    return com.aspsine.swipetoloadlayout.demo.App.sRequestQueue;
}

@java.lang.Override
public java.lang.Boolean proceed() {
    return com.oasisfeng.condom.CondomContext.super.bindService(intent, conn, flags);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    init();
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
}

protected void pushToBackstack(@android.support.annotation.NonNull
com.bluelinelabs.conductor.RouterTransaction entry) {
    backstack.push(entry);
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    java.lang.System.out.println(error.toString());
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    viewPager.setCurrentItem(mPreferences.getStartPageIndex());
}

@java.lang.Override
public void onLoadMore() {
    (page)++;
    new com.androidbelieve.drawerwithswipetabs.SerialsFragment.LoadSerials(false).execute();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent intent1 = new android.content.Intent(context, com.example.kali.weathy.WeatherActivity.class);
    startActivity(intent1);
    finish();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    topicsData = null;
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    boolean startAgain = true;
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
}

public static void postStressMeasurementData(android.content.Context context, org.json.JSONObject object) {
    java.lang.String url = (NetworkConstants.BASE_URL) + (NetworkConstants.POST_PIP_DATA_ENDPOINT);
    new com.wearables.networking.NetworkingTask(url, false, com.wearables.networking.NetworkConstants.METHOD_TYPE.POST, com.wearables.networking.NetworkConstants.REQUEST_TYPE.POST_PIP, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, object);
}

@java.lang.Override
public void responseCallBack(org.json.JSONObject response) {
    android.widget.Toast.makeText(getApplicationContext(), ("Meetup successfully created!" + " Now to add content and people to it!"), Toast.LENGTH_LONG).show();
    getData(false);
}

public void onClick(android.view.View v) {
    if ((features.backButtonCanClose) && (canGoBack())) {
        closeDialog();
    }else {
        goBack();
    }
}

public static boolean isGpsHardwarePresent(android.content.Context context) {
    try {
        return com.jstakun.gms.android.location.LocationServicesManager.HelperInternal.isGpsHardwarePresent(context);
    } catch (java.lang.VerifyError e) {
        return true;
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    mCurrentPage = mMaxPage;
    mOffsetInPage = LAST_FLOOR_OFFSET;
    showOrLoadPage();
    dialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View view) {
    finishButton.setVisibility(View.INVISIBLE);
}

@java.lang.Override
public void onBindViewHolder(final adapter.EstacaoAdapter.PersonViewHolder personViewHolder, int position) {
    personViewHolder.tvSupervisor.setText(lista.get(position).getDescricao());
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    acquisitionSaveRequest = null;
    chartComponent.play();
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    startDateEditText.setText(formatDate(year, monthOfYear, dayOfMonth));
    startDateEditText.clearFocus();
    layout.requestFocus();
}

