@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
}

public void onClickHide(android.view.View v) {
    startService(new android.content.Intent(this, com.vmordo.flashlite.TrackingService.class));
}

public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, edu.weber.housing1000.ClientInfoActivity.class);
    intent.putExtras(getIntent());
    startActivity(intent);
}

public final void setGui(@android.support.annotation.Nullable
org.empyrn.darkknight.GUIInterface guiInterface) {
    if (guiInterface != null) {
        mGuiInterface = new java.lang.ref.WeakReference(guiInterface);
    }else {
        mGuiInterface = null;
    }
}

@java.lang.Override
public void onRefresh() {
    downloadArticles(0, true);
}

@java.lang.Override
public void onDestroyView() {
    android.util.Log.i("onDestroyView", category);
    butterknife.ButterKnife.unbind(this);
    super.onDestroyView();
}

@java.lang.Override
public void onBackPressed() {
    if (doubleBackToExitPressedOnce) {
        super.onBackPressed();
        return ;
    }
    android.widget.Toast.makeText(this, "এখান থেকে বের হতে চাইলে আরেকবার চাপ দিন ", Toast.LENGTH_LONG).show();
    this.doubleBackToExitPressedOnce = true;
}

@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!(android.text.TextUtils.isEmpty(newText))) {
        savedSearchFilter = newText;
    }
    searchFilter = newText;
    getLoaderManager().restartLoader(org.xbmc.kore.ui.AbstractListFragment.LOADER, null, this);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (sliderView.isSlided()) {
        sliderView.setSlided((!(sliderView.isSlided())));
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    onHandleExtras(savedInstanceState, getIntent().getExtras());
    onLoadContent(savedInstanceState);
    onLoadModules(savedInstanceState);
}

private void unRegister() {
    com.mingle.utils.BusProvider.getInstance().unregister(this);
}

private void revokeAccess() {
    if ((mGoogleApiClient) != null) {
        Auth.GoogleSignInApi.revokeAccess(mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
            @java.lang.Override
            public void onResult(com.google.android.gms.common.api.Status status) {
            }
        });
    }
}

public void onServiceDisconnected(android.content.ComponentName className) {
    com.automatic.android.sdk.Automatic.mIsBound = false;
    com.automatic.android.sdk.Automatic.mService = null;
    android.util.Log.w(com.automatic.android.sdk.Automatic.TAG, "Disconnected.");
}

public static com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment newInstance() {
    com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment fragment = new com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment();
    com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment.exercise = ListActivity.lesson.getExam_questions().get(ListActivity.exerciseIndex);
    return fragment;
}

@java.lang.Override
public void onCompletion(io.vov.vitamio.MediaPlayer mp) {
    android.widget.Toast.makeText(this, "播放完毕！", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    android.util.Log.w(org.forestguardian.DataAccess.Location.LocationController.TAG, "onProviderDisabled");
    for (org.forestguardian.DataAccess.Location.LocationController.SimpleLocationListener listener : mListeners) {
        listener.onUnavailable();
    }
}

private void actionOnNextBtnClick() {
    if ((CUR_INPUT_COMMAND) != null) {
        CUR_INPUT_COMMAND.proceedToNext();
    }else {
        android.widget.Toast.makeText(this, "No previous input.\nSee help for instructions.", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(hasEmptyFields())) {
        setResult(Activity.RESULT_OK);
        dismiss();
    }
}

@java.lang.Override
public void dialogDismiss(android.content.DialogInterface dialog) {
    android.util.Log.e("CustomVersionDialogActi", "dialog dismiss 回调");
    if (com.allenliu.sample.CustomVersionDialogActivity.isForceUpdate) {
        MainActivity.mainActivity.finish();
    }
}

public static boolean IsDebug(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean("debugMode", true);
}

@org.junit.Test
public void testGetItemCount() {
    com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter adapter = new com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter(null, contentBlockList, null, false, null, null);
    junit.framework.TestCase.assertEquals(adapter.getItemCount(), 11);
}

protected void onPause() {
    super.onPause();
    android.util.Log.i(com.example.simplenfc.MainActivity.TAG, "onPause()");
    if ((mNFCadapter) != null) {
        mNFCadapter.disableForegroundDispatch(this);
    }
}

@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    if (autoHide) {
        delayedHide();
    }
    return false;
}

protected void showMessageDialog(android.content.Context context, java.lang.String title, java.lang.String msg, java.lang.String posString, android.content.DialogInterface.OnClickListener onClickListener) {
    new android.app.AlertDialog.Builder(context).setTitle(title).setMessage(msg).setPositiveButton(posString, onClickListener).show();
}

private void sendSchedule(edu.gatech.ledpathways.androidemployeeapp.objects.Schedule schedule, android.app.ProgressDialog p) {
    edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes post = new edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes(schedule, p, this);
    post.execute();
}

private void gotoMainActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.example.quanla.pomodoro.activities.MainActivity.class);
    startActivity(intent);
}

@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    setArrays();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
}

@java.lang.Override
protected void onServiceDisconnect() {
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    int id = ((int) (viewHolder.itemView.getTag()));
    deleteEntry(id);
}

private void registeReceiver() {
    localReceiver = new com.micrndemo.MainActivity.CompleteReceiver();
    registerReceiver(localReceiver, new android.content.IntentFilter(android.app.DownloadManager.ACTION_DOWNLOAD_COMPLETE));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    linkViews();
    emailID = getIntent().getStringExtra("emailID");
    initializeBackendless();
    getRecruitmentPhase();
    in.projectmanas.manasliaison.activities.HomeActivity.mCredential = FirstRunActivity.mCredential;
    getData();
}

private void initAdapter() {
    com.serien.android.androidserienprojekt.adapter.CustomSeriesExpandableListAdapter expListAdapter = new com.serien.android.androidserienprojekt.adapter.CustomSeriesExpandableListAdapter(getActivity(), seasonList, seriesCollection, seasonsWatchedTemp, db.getSeriesItem(guideboxName), this);
    expListView.setAdapter(expListAdapter);
}

@java.lang.Deprecated
public static synchronized com.smartdevicelink.transport.MultiplexBluetoothTransport getBluetoothSerialServerInstance(android.os.Handler handler) {
    return new com.smartdevicelink.transport.MultiplexBluetoothTransport(handler);
}

@java.lang.Override
public boolean onClose() {
    openProgressDialog();
    rest = list.search(null, listener);
    android.util.Log.d(diy.uigeneric.sampleserver.SampleServerListActivity.TAG, "search stop");
    return false;
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.e("ViewGroup", "Destroy!");
    pagerAdapter.removeAllfragments();
    orientationHandler.stop();
    super.onDestroy();
}

@java.lang.Override
public void onAuthSuccessful(com.onaio.steps.helper.AuthDialog authDialog) {
    authDialog.dismiss();
    this.onAuthSuccessful(flowType);
}

public static void setUp(android.content.Context context) {
    if (context == null) {
        throw new com.marcohc.architecture.common.helper.PreferencesException("Context must not be null!");
    }
    com.marcohc.architecture.common.helper.PreferencesHelper.instance = new com.marcohc.architecture.common.helper.PreferencesHelper(context);
}

public static boolean isEmailValid(java.lang.String email) {
    email = email.trim();
    return (!(android.text.TextUtils.isEmpty(email))) && (Patterns.EMAIL_ADDRESS.matcher(email).matches());
}

public void configureWithMyListener(com.github.hmallet.realparallaxandroid.RealHorizontalScrollView realHorizontalScrollView) {
    this.mRealHorizontalScrollView = realHorizontalScrollView;
    this.mRealHorizontalScrollViewWidth = this.mRealHorizontalScrollView.getWidth();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sign_up);
    butterknife.ButterKnife.bind(this);
    mSignUpButton.setOnClickListener(this);
    mAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
}

@java.lang.Override
public void onStatusOk(net.datafans.android.common.data.service.BaseResponse response, java.lang.Class<?> type) {
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    binder = ((unipd.dei.ESP1415.falldetector.FallService.MyBinder) (service));
    mService = binder.getService();
    mBound = true;
}

public void incSpeed() {
    tpi -= 10000;
}

@java.lang.Override
public void terminate() {
    if (!(isPreviousMarker())) {
        mView.stopService(com.gerus.pulpomatic.navigator.Navigator.getService(getContext()));
    }
}

@android.support.annotation.NonNull
@java.lang.Override
public java.lang.String getType() {
    return !(android.text.TextUtils.isEmpty(type)) ? type : STORY_TYPE;
}

public void sendAlert() throws java.lang.RuntimeException {
    android.util.Log.i(io.github.fbmediahack.quiethome.AudioDetector.LOG_TAG, "BE QUIET I AM Sleeping");
    this.stopThread();
    noiceListener.onNoiceDetected();
}

@java.lang.Override
public secureapps.com.fitsec.RealmAppAdapter.SecureAppViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(context).inflate(R.layout.app_view_holder, parent, false);
    return new secureapps.com.fitsec.RealmAppAdapter.SecureAppViewHolder(itemView);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mCurrentView = inflater.inflate(R.layout.fragment_friend_request, container, false);
    mContext = getContext();
    loadFriendRequest();
    return mCurrentView;
}

public void onEvent(java.lang.String basicEvent) {
    if (basicEvent.equals(LoginCallback.LOGIN_SUCCESS)) {
        progressDialog.dismiss();
        startActivity(new android.content.Intent(this, com.randomappsinc.blanknavigationdrawer.Activities.MainActivity.class));
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    com.uramonk.androidtemplateapp.databinding.ActivityMainBinding binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    com.uramonk.androidtemplateapp.viewmodel.MainViewModel mainViewModel = new com.uramonk.androidtemplateapp.viewmodel.MainViewModel(this);
    binding.setMainViewModel(mainViewModel);
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    if ((pickedObject) != (selectedObject)) {
        toggleSelection();
    }
    if ((pickedObject) == (selectedObject)) {
        edit();
        return true;
    }
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    int index = dataset.indexOf(movie);
    db.deleteMovieFromWatchlist(movie.getId());
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(this.value);
    dest.writeString(this.currency);
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    boolean display_unread_only = !(item.isChecked());
    if (loadContent(display_unread_only)) {
        item.setChecked(display_unread_only);
    }
    return false;
}

@java.lang.Override
public void resume(cn.woblog.android.downloader.domain.DownloadInfo downloadInfo) {
    if (isExecute()) {
        cacheDownloadTask.remove(downloadInfo.getId());
        download(downloadInfo);
    }
}

@java.lang.Override
public void onClick(android.view.View paramView) {
    rescheduleSession(0);
    showConference();
    showSession();
}

@java.lang.Override
protected void onPostExecute(java.lang.Integer responseCode) {
    if ((responseCode < 200) || (responseCode > 300)) {
        android.widget.Toast.makeText(context, "fail", Toast.LENGTH_LONG).show();
    }
}

private java.util.Map<java.lang.String, com.android.deskclock.data.City> getCityMap() {
    if ((mCityMap) == null) {
        mCityMap = com.android.deskclock.data.CityDAO.getCities(mContext);
    }
    return mCityMap;
}

public boolean backupDatabase(android.content.Context context) {
    return dbWriter.exportDatabase(context);
}

@java.lang.Override
public void setRotation(jp.co.cyberagent.android.gpuimage.Rotation rotation) {
}

@com.facebook.react.bridge.ReactMethod
public void rotate(int rotation) {
    setApplicationOrientation(rotation);
}

@java.lang.Override
public void onClick(android.view.View view) {
    button1.setText(((mark) + ""));
    placeMarkOnBoard(0, 0);
    button1.setEnabled(false);
    checkForWinOrDraw();
}

@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    android.graphics.Bitmap thumbnail = mStorage.getImageThumbnail(params[0]);
    return thumbnail;
}

private void closeRenderer() {
    if ((renderer) == null) {
        android.util.Log.w(com.bjss.plugin.PdfRendererPlugin.LOG_TAG, "Attempted to close null renderer. Skipping operation.");
        return ;
    }
    renderer.close();
}

@java.lang.Override
public void downloadComplete() {
    android.util.Log.d("Download", "Download complete");
    this.swap(3);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.reset();
    mp.release();
    mp = null;
}

private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String msg) {
    logger.print(level, null, msg);
}

@java.lang.Override
public void onGlobalLayout() {
    initLayout();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.input_categories);
    setup();
}

@java.lang.Override
public void run() {
    try {
        new gr.qpc.meteoclimaandroid.MeteoclimaMainFragment.GetLocationName(getActivity()).execute();
    } catch (java.lang.Exception e) {
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
}

public static int dp2Px(android.view.View view, int dp) {
    return com.welcome.to.sweden.utils.ViewUtils.dp2Px(view.getContext(), dp);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    java.lang.System.out.println("Negative click");
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.swjtu.walker.utils.L.v(com.swjtu.walker.activity.home.TAG, "刷新");
    loadAllShops();
}

@java.lang.Override
public void run() {
    android.os.Message incrementTimeMessage = new android.os.Message();
    incrementTimeMessage.what = 173;
    handler.get().sendMessage(incrementTimeMessage);
}

@java.lang.Override
public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
    super.onReceivedError(view, request, error);
    hideProgress();
    displayError();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    isLock = false;
    list.remove(position);
    animationGridViewAdapter.removeItem(0).commit();
}

protected void configRecyclerView(android.support.v7.widget.RecyclerView mList, com.kimeeo.library.listDataView.recyclerView.BaseRecyclerViewAdapter mAdapter) {
}

@java.lang.Override
public void prepare(com.google.android.exoplayer2.source.MediaSource mediaSource) {
    prepare(mediaSource, true, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    getGoals();
}

@java.lang.Override
public android.app.Fragment getItem(int position) {
    mCursor.moveToPosition(position);
    return com.example.xyzreader.ui.ArticleDetailFragment.newInstance(mCursor.getLong(ArticleLoader.Query._ID));
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
    updateQuestion();
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(com.hinohunomi.bgbeacon.BeaconService.TAG, "onBind");
    if ((mActionHandler) != null) {
        mActionHandler.sendEmptyMessage(com.hinohunomi.bgbeacon.BeaconService.ActionHandler.ACT_BEACON_DISABLE);
    }
    return mBinder;
}

public static void setContext(android.content.Context c) {
    if (c != null)
        com.adsamcik.signalcollector.utility.DataStore.contextWeak = new java.lang.ref.WeakReference(c);
    
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    currentMonth = position + 1;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
}

public void exception(java.lang.Exception e) {
    if ((com.yourtion.httpdns.Debug.isshow) && (e != null))
        this.error(android.util.Log.getStackTraceString(e));
    
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        confirmRename(((android.widget.EditText) (v)), mRenamePos);
    }
}

public void setGlobalTransparency(float value) {
    android.content.SharedPreferences preferences = AppGlobal.shared_preferences;
    preferences.edit().putString("Global_Transparency", java.lang.String.valueOf(value)).commit();
}

@java.lang.Override
public void run() {
    databaseOpenHelper = new com.ngynstvn.android.blocspot.api.model.database.DatabaseOpenHelper(com.ngynstvn.android.blocspot.BlocspotApplication.getSharedInstance(), poiTable);
}

public void setCurrentPosition(int currentPosition) {
    this.currentPosition = currentPosition;
}

@java.lang.Override
public void onClick(android.view.View v) {
    drawerLayout.closeDrawer(Gravity.LEFT);
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.imca2017.bookswant.BookDetailsActivity.FetchDeepData(this).execute();
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
}

@com.squareup.otto.Subscribe
public void onCreateCharacter(amagi82.modularcharactersheetcreator.events.CreateCharacterEvent event) {
    fm.beginTransaction().replace(R.id.container, new amagi82.modularcharactersheetcreator.fragments.CharacterFragment()).addToBackStack(null).commit();
}

public void logoutUser() {
    editor.clear();
    editor.commit();
}

