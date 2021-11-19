public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_sound_dialog, container, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (timerRunning) {
        stopTimer();
    }else {
        startTimer();
    }
}

@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    adapter.notifyDataSetChanged();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (((java.lang.System.currentTimeMillis()) - (Main.lastPing)) > 60000) {
        main.connFail();
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int value = numberPicker.getValue();
    mCallback.setServoInputPin(servoType, value);
    editText.setText(java.lang.String.valueOf(value));
}

public void remove(android.content.ComponentName componentName, com.android.launcher3.compat.UserHandleCompat user) {
    mCache.remove(new com.android.launcher3.IconCache.CacheKey(componentName, user));
}

public void jobDetails(android.view.View view) {
    if ((currentJob) != null) {
        android.content.Intent intent = new android.content.Intent(this, com.example.phil.httppost.JobView.class);
        intent.putExtra("job", currentJob.getId());
        startActivity(intent);
    }
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    latitude = location.getLatitude();
    longitude = location.getLongitude();
}

public void onButtonClick(android.view.View v) {
    com.almalence.opencam.ApplicationScreen.getGUIManager().onButtonClick(v);
}

private void startPreview() {
    camera.startPreview();
    inPreview = true;
    getHost().autoFocusAvailable();
}

private static void init() {
}

private void increment() {
    if ((mListener) != null) {
        mListener.onRepeatUpdaterEvent(gemstone.gemster.RepeatUpdater.EventMode.EVENT_INCREMENT, null);
    }
}

@java.lang.Override
public void onBindViewHolder(com.example.android.popularmoviesapp.MovieAdapter.MovieViewHolder holder, int position) {
    com.example.android.popularmoviesapp.Movie movie = mMoviesList.get(position);
    holder.bind(movie);
}

public static java.lang.String getStringPreference(java.lang.String key) {
    return com.sinfreu.marie.resume.singletons.App.getPreferences().getString(key, "");
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    im.vector.util.BugReporter.sendBugReportWithMail(currentActivity, true);
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception e) {
    android.widget.Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(v.getContext(), com.yask.android.photorocket.NewEventActivity.class);
    startActivity(i);
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    com.vincent.easymusic.EasyMusicMainActivity.mediaPlayer.start();
    com.vincent.easymusic.EasyMusicMainActivity.isMusicPlaying = true;
    com.vincent.easymusic.EasyMusicMainActivity.positionPlay = position;
    com.vincent.easymusic.EasyMusicMainActivity.setMusicViewInfos();
}

private android.app.AlertDialog getInfoAlertDialog(android.app.Activity activity) {
    createInfoAlertDialog(activity);
    return infoDialog;
}

private void iniciar_login() {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, py.com.puntofarma.deliverytracker30.Login.newInstance("", "")).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
    ft.commit();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration_interests);
    android.os.Bundle extras = getIntent().getExtras();
    data_gender = extras.getString("gender");
}

public boolean deleteTaskRow(java.lang.String where) {
    return (mDb.delete(DatabaseContract.TasksContract.TABLE_NAME, where, null)) != 0;
}

public static android.net.wifi.WifiConfiguration createEapNetwork() {
    android.net.wifi.WifiConfiguration configuration = com.android.server.wifi.WifiConfigurationTestUtil.generateWifiConfig(com.android.server.wifi.WifiConfigurationTestUtil.TEST_NETWORK_ID, com.android.server.wifi.WifiConfigurationTestUtil.TEST_UID, com.android.server.wifi.WifiConfigurationTestUtil.createNewSSID(), true, true, null, null, com.android.server.wifi.WifiConfigurationTestUtil.SECURITY_EAP);
    return configuration;
}

private void startCamera() {
}

public void addFilter(com.raizlabs.android.coreutils.functions.Predicate<T> filter) {
    this.filters.addPredicate(true, filter);
    update();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app = com.defch.blogwbly.MyApplication.getInstance();
    theme = app.getWTheme();
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    com.xiaolei.easyfreamwork.utils.Log.d(TAG, ((this.getClass().getName()) + ":onActivityCreated"));
    onSetContentView();
    super.onActivityCreated(savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);
    mv = new com.ruinkami.overrider.view.GameView(this);
    android.widget.LinearLayout.LayoutParams lp = new android.widget.LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
    addContentView(mv, lp);
}

private void showAddContactDialog(java.lang.String qrCodeData) {
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject(qrCodeData);
        showAddContactDialog(jsonObject);
    } catch (org.json.JSONException e) {
        android.widget.Toast.makeText(mContext, "Error : Malformed QR code data", Toast.LENGTH_LONG).show();
    }
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onLongClick(android.view.View view, int position) {
}

@butterknife.OnClick(value = R.id.button2)
public void clickedBt(android.view.View view) {
    finish();
    return ;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    clickCancel();
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        eventExec(nameEditText, nameClickList, "lastName");
    }
}

@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
    android.support.multidex.MultiDex.install(base);
}

public abstract android.graphics.Bitmap getIcon(android.content.res.Resources res);

@java.lang.Override
public int getCount() {
    android.content.SharedPreferences sharedPref = mContext.getSharedPreferences("Ride_id", Context.MODE_PRIVATE);
    int temp = sharedPref.getInt("ride_id", (-1));
    return temp + 1;
}

public void setRotation(int index, jp.co.cyberagent.android.gpuimage.Rotation rotation) {
    rotations[index] = rotation;
    adjustImageScaling();
    adjustImageScaling(index);
}

@java.lang.Override
public void onSuccess(android.graphics.Bitmap image) {
    ((android.widget.ImageView) (view.findViewById(R.id.addImg))).setImageBitmap(image);
    oldImageBitmap = image;
}

@java.lang.Override
public void run() {
    android.util.Log.d("paddingbottom final", java.lang.Integer.toString(mACA.mListFragment.mRView.getPaddingBottom()));
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString(com.valevich.moneytracker.ui.activities.MainActivity.TOOLBAR_TITLE_KEY, java.lang.String.valueOf(getTitle()));
    super.onSaveInstanceState(outState);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    final android.view.inputmethod.InputConnection ic = super.onCreateInputConnection(outAttrs);
    if (ic == null)
        return null;
    
    inputConnectionHacker = new com.jecelyin.editor.v2.widget.text.InputConnectionHacker(ic, this);
    return inputConnectionHacker;
}

@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    callBack.completed();
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    actionBar = ((android.support.v7.app.AppCompatActivity) (context)).getSupportActionBar();
    if ((actionBar) != null) {
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}

@java.lang.Override
public void onSuccess() {
    mainActivity.getActivityHelper().closeLoadingBar();
    android.util.Log.d(Constants.TAG, "New Order successfully created on the server.");
    mainActivity.replaceFragment(R.id.fragment_verifying_order_textview1, null);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == (etec.coda_softwares.meupdv.Caixa.REQ_CAIXA)) {
            finish();
        }
    }
}

public void start() {
    if (!(mediaPlayer.isPlaying())) {
        mediaPlayer.start();
    }
}

public void onClick(com.example.utente.calcolaorauscita.DialogInterface dialog, int which) {
    if (which == (DialogInterface.BUTTON_NEGATIVE)) {
        timePickerChoseTime = false;
    }
}

public synchronized void moveGPSScreen() {
    android.content.Intent gpsOptionsIntent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    startActivity(gpsOptionsIntent);
}

public com.github.jorgecastilloprz.FABProgressCircle withArcColor(@android.support.annotation.ColorInt
int arcColor) {
    this.arcColor = arcColor;
    if ((progressArc) != null) {
        progressArc.setArcColor(arcColor);
    }
    return this;
}

protected void bindImpl() {
    getContext().bindService(createServiceIntent(new android.content.Intent(IpcConstant.ACTION_MESSAGE_SERVICE)), (mMessageServiceConn = new com.heaven7.android.ipc.RemoteMessageContext.MessageServiceConnectionImpl()), Context.BIND_AUTO_CREATE);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent startNewActivity = new android.content.Intent(getApplicationContext(), com.example.danielfox.foodchoices.NewVisit.class);
    startNewActivity.putExtra("userID", userID);
    startActivity(startNewActivity);
    finish();
}

public void setTintColor(int color) {
    setColorFilter(color);
}

public void playInterstitial2(android.view.View v) {
}

private java.io.File getStorageDir() {
    return new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "TestApp");
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.support.v4.media.session.MediaButtonReceiver.handleIntent(mediaSession, intent);
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedState) {
    super.onCreate(savedState);
    executeRequest(venuesInteractor.getVenues(0), new biz.stratadigm.tpi.presenter.VenuesPresenter.VenuesSubscriber());
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.lang.System.exit(1);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt("active_view", mCurrentView);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.scan_button)) {
        starthack.fridgetogo.com.google.zxing.integration.android.IntentIntegrator scanIntegrator = new starthack.fridgetogo.com.google.zxing.integration.android.IntentIntegrator(getActivity());
        scanIntegrator.initiateScan();
    }
}

@java.lang.Override
public void onPageScrollStateChanged(int state) {
    if (state == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE))
        mIsClick = false;
    
    if ((mListener) != null)
        mListener.onPageScrollStateChanged(state);
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
}

public boolean isChromeGoogleSigned(android.content.Context context) {
    return isGoogleSigned(context, context.getPackageName());
}

@org.xwalk.core.internal.XWalkAPI
public boolean saveState(android.os.Bundle outState) {
    if ((mContent) == null)
        return false;
    
    mContent.saveState(outState);
    return true;
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.widget.Toast.makeText(context, error.getMessage(), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((onChannelInfoItemSelectedListener) != null) {
        onChannelInfoItemSelectedListener.selected(info.serviceId, info.getLink(), info.channelName);
    }
}

public void nextPage(android.view.View view) {
    if ((com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER) != (com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_THRESH))
        com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER = (com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER) + 1;
    
    generateFilmQuery();
    update();
}

private void setupToolbar() {
    setSupportActionBar(mToolbar);
    android.support.v7.app.ActionBar ab = getSupportActionBar();
    ab.setDisplayHomeAsUpEnabled(false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    setBackgroundColorForLayout(listColor.get(1), dialog);
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
}

@java.lang.Override
@android.support.annotation.CallSuper
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d(com.nichesoftware.giftlist.views.BaseActivity.TAG, "onCreate");
    com.nichesoftware.giftlist.views.BaseActivity.setContentView(getContentView());
    initPresenter();
    initView();
}

private void updatePosters() {
    com.example.akgul.movies_application.MainActivityFragment.FetchMovieTask fetchMovieTask = new com.example.akgul.movies_application.MainActivityFragment.FetchMovieTask();
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String sortType = sharedPreferences.getString("order", "popularity.desc");
    fetchMovieTask.execute(sortType);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (checkAndAskForContactsReadPermission(PermissionUtil.PERMISSIONS_READ_CONTACTS_AUTOMATIC)) {
        if (isChecked) {
            setAutomaticBackup(true);
        }else {
            setAutomaticBackup(false);
        }
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
}

@java.lang.Override
public void onClick(android.view.View v) {
    validateCredentials(username, password);
}

@butterknife.OnClick(value = R.id.txt_accept)
public void accept(android.view.View view) {
    com.examples.ankit.breakpoint.prefences.MyPreferenceManager.setUserConsent(true);
    if ((mListener) != null) {
        mListener.onAgreementAccepted(true);
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    searchInput = searchMovieView.getText().toString().toLowerCase(java.util.Locale.getDefault());
    if ((movieListAdapter) != null)
        movieListAdapter.filter(searchInput, chosenCategory);
    
}

private void startContentAnimation() {
    btnCreate.animate().translationY(0).setInterpolator(new android.view.animation.OvershootInterpolator(1.0F)).setStartDelay(300).setDuration(com.rolling.ten_thousand_hours.instamaterial.activity.MainActivity.ANIM_DURATION_FAB).start();
    feedAdapter.updateItems(false);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.util.Log.i("myMapFragment", "onViewCreated");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_firstbundle);
}

@butterknife.OnClick(value = R.id.btnUploadPicture)
public void uploadImage() {
    com.androidapp.network.Items items = new com.androidapp.network.Items(this);
    items.addImage("", token, android.net.Uri.parse(filePath), idItem);
}

private boolean resetKeyEventEventFlag(final int flag) {
    org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage &= ~flag;
    return (org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage) != 0;
}

@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    android.util.Log.d(com.pajato.android.gamechat.database.handler.MessagesChangeHandler.TAG, java.lang.String.format(java.util.Locale.US, com.pajato.android.gamechat.database.handler.MessagesChangeHandler.LOG_FORMAT, "onChildAdded", dataSnapshot, s));
    process(dataSnapshot, com.pajato.android.gamechat.event.MessageChangeEvent.NEW);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_custom_view, container, false);
    return view;
}

public static boolean getAllowAdvancedData(android.content.SharedPreferences settings) {
    boolean mDefault = false;
    return (com.paulvarry.intra42.Tools.AppSettings.Advanced.getAllowAdvanced(settings)) && (settings.getBoolean(com.paulvarry.intra42.Tools.AppSettings.Advanced.PREFERENCE_ADVANCED_ALLOW_DATA, false));
}

@java.lang.Override
public void run() {
    try {
        controller.sendString(cmd);
    } catch (java.lang.Exception e) {
        android.util.Log.w(de.hhn.munz.ardrone2.ControlActivity.TAG, e.getMessage());
    }
}

protected void AllocateCache() {
    mCacheBitmap = android.graphics.Bitmap.createBitmap(mFrameHeight, mFrameWidth, Bitmap.Config.ARGB_8888);
}

public void addControl(it.geosolutions.android.map.control.MapControl m) {
    synchronized(controls) {
        controls.add(m);
    }
    android.util.Log.v("CONTROL", ("total controls:" + (controls.size())));
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
}

private void components() {
    mainText = ((android.widget.TextView) (rootView.findViewById(R.id.unlockTextView)));
}

public static void navigation(android.content.Context context) {
    android.widget.TextView tv = new android.widget.TextView(context);
    if ((meng.animtest.asdemo.BasicShortcutsDemo.testListener) != null) {
        meng.animtest.asdemo.BasicShortcutsDemo.testListener.onEvent();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    mMapFragment.showAllFloors(true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    drawerLayout.closeDrawer(Gravity.LEFT);
}

@java.lang.Override
public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    outRect.bottom = mSpaceHeight;
    outRect.top = mSpaceHeight;
}

public void setLeftOuterView(android.view.View view) {
    mLeftOuterView = view;
}

public void removeTile(android.content.ComponentName tile) {
    java.util.List<java.lang.String> newSpecs = new java.util.ArrayList<>(mTileSpecs);
    newSpecs.remove(com.android.systemui.qs.external.CustomTile.toSpec(tile));
    changeTiles(mTileSpecs, newSpecs, true);
}

