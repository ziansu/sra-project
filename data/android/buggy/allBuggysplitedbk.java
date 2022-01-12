@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.content.SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.clear().commit();
    resetList();
}

public void onClickHide(android.view.View v) {
    com.vmordo.flashlite.TakePhoto.getOne(com.vmordo.flashlite.FlashLiteActivity.sv);
    startService(new android.content.Intent(this, com.vmordo.flashlite.TrackingService.class));
    com.vmordo.flashlite.TakePhoto.getOne(com.vmordo.flashlite.FlashLiteActivity.sv);
}

public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, edu.weber.housing1000.ClientInfoActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    intent.putExtras(getIntent());
    startActivity(intent);
}

public final void setGui(@android.support.annotation.Nullable
org.empyrn.darkknight.GUIInterface guiInterface) {
    this.mGuiInterface = new java.lang.ref.WeakReference(guiInterface);
}

@java.lang.Override
public void onRefresh() {
    scrollListener.resetState();
    if ((mFragPosition) != 0)
        mNetManager.downloadArticles(0, true, com.android.casopisinterfon.interfon.model.Category.getCategory(mFragPosition));
    else
        mNetManager.downloadArticles(0, true, null);
    
}

@java.lang.Override
public void onDestroyView() {
    android.util.Log.d("onDestroyView", category);
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
    demo.kolorob.kolorobdemoversion.activity.PlaceDetailsActivityNewLayout.currentCategoryID = 0;
}

@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!(android.text.TextUtils.isEmpty(searchFilter))) {
        savedSearchFilter = searchFilter;
    }
    searchFilter = newText;
    getLoaderManager().restartLoader(org.xbmc.kore.ui.AbstractListFragment.LOADER, null, this);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    sliderView.setSlided((!(sliderView.isSlided())));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    onHandleExtras(savedInstanceState, getIntent().getExtras());
    onLoadModules(savedInstanceState);
    onLoadContent(savedInstanceState);
}

private void unRegister() {
    android.util.Log.e(com.mingle.autolist.AutoList.Tag, "unRegister Bus");
    com.mingle.utils.BusProvider.getInstance().unregister(this);
}

private void revokeAccess() {
    Auth.GoogleSignInApi.revokeAccess(mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
        @java.lang.Override
        public void onResult(com.google.android.gms.common.api.Status status) {
        }
    });
}

public void onServiceDisconnected(android.content.ComponentName className) {
    com.automatic.android.sdk.Automatic.mIsBound = false;
    com.automatic.android.sdk.Automatic.mService = null;
    android.util.Log.w(com.automatic.android.sdk.Automatic.TAG, "Disconnected.");
    android.widget.Toast.makeText(context, "Service Disconnected", Toast.LENGTH_SHORT).show();
}

public static com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment newInstance() {
    com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment fragment = new com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment();
    android.os.Bundle args = new android.os.Bundle();
    com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment.exercise = ListActivity.lesson.getExam_questions().get(ListActivity.exerciseIndex);
    return fragment;
}

@java.lang.Override
public void onCompletion(io.vov.vitamio.MediaPlayer mp) {
    android.widget.Toast.makeText(this, "播放完毕！", Toast.LENGTH_SHORT).show();
    finish();
}

@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    android.util.Log.w(org.forestguardian.DataAccess.Location.LocationController.TAG, "onProviderDisabled");
    mListeners.forEach(org.forestguardian.DataAccess.Location.LocationController.SimpleLocationListener::onUnavailable);
}

public void actionOnNextBtnClick() {
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
        alertDialog.dismiss();
    }
}

@java.lang.Override
public void dialogDismiss(android.content.DialogInterface dialog) {
    android.util.Log.e("CustomVersionDialogActi", "dialog dismiss 回调");
    finish();
    if (com.allenliu.sample.CustomVersionDialogActivity.isForceUpdate) {
        MainActivity.mainActivity.finish();
    }
}

private static boolean IsDebug(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean("debugMode", true);
}

@org.junit.Test
public void testGetItemCount() {
    com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter adapter = new com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter(null, contentBlockList, null, null, false, null, null);
    junit.framework.TestCase.assertEquals(adapter.getItemCount(), 11);
}

protected void onPause() {
    super.onPause();
    android.util.Log.i(com.example.simplenfc.MainActivity.TAG, "onPause()");
    mNFCadapter.disableForegroundDispatch(this);
}

@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    if (autoHide) {
        delayedHide(autoHideDelayMillis);
    }
    return false;
}

protected void showMessageDialog(java.lang.String title, java.lang.String msg, java.lang.String posString, android.content.DialogInterface.OnClickListener onClickListener) {
    new android.app.AlertDialog.Builder(getApplicationContext()).setTitle(title).setMessage(msg).setPositiveButton(posString, onClickListener).show();
}

private void sendSchedule(edu.gatech.ledpathways.androidemployeeapp.objects.Schedule schedule, android.app.ProgressDialog p, android.widget.TextView v) {
    edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes post = new edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes(schedule, v, p, this);
    post.execute();
}

private void gotoMainActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.example.quanla.pomodoro.activities.MainActivity.class);
    intent.addFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
}

@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
    com.jmgarzo.dublinbus.sync.SyncTasks.syncRoute(this);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    java.lang.System.out.println("Doing this");
    setArrays();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        de.mkrtchyan.recoverytools.FlashUtil.uninstallXZDual(mActivity.getShell());
    } catch (org.sufficientlysecure.rootcommands.util.FailedExecuteCommand failedExecuteCommand) {
        failedExecuteCommand.printStackTrace();
    }
}

@java.lang.Override
protected void onServiceDisconnect() {
    if ((mService) != null) {
        try {
            mService.destory(mInvokeCallback);
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    int id = ((int) (viewHolder.itemView.getTag()));
    deleteEntry(id);
    showCustomToast();
}

private void registeReceiver() {
    com.micrndemo.MainActivity.CompleteReceiver localReceiver = new com.micrndemo.MainActivity.CompleteReceiver();
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
    getCount();
}

private void initAdapter() {
    com.serien.android.androidserienprojekt.adapter.CustomSeriesExpandableListAdapter expListAdapter = new com.serien.android.androidserienprojekt.adapter.CustomSeriesExpandableListAdapter(getActivity(), seasonList, seriesCollection, seasonsWatchedTemp, db.getSeriesItem(guideboxName));
    expListView.setAdapter(expListAdapter);
}

public static synchronized com.smartdevicelink.transport.MultiplexBluetoothTransport getBluetoothSerialServerInstance(android.os.Handler handler) {
    return com.smartdevicelink.transport.MultiplexBluetoothTransport.getBluetoothSerialServerInstance(handler, true);
}

@java.lang.Override
public boolean onClose() {
    openProgressDialog();
    rest = list.search("", listener);
    android.util.Log.d(diy.uigeneric.sampleserver.SampleServerListActivity.TAG, "search stop");
    return false;
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.e("ViewGroup", "Destroy!");
    pagerAdapter.removeAllfragments();
    orientationHandler.stop();
}

@java.lang.Override
public void onAuthSuccessful(com.onaio.steps.helper.AuthDialog authDialog) {
    authDialog.dismiss();
    android.widget.LinearLayout settingsLayout = ((android.widget.LinearLayout) (activity.findViewById(R.id.settings)));
    settingsLayout.setVisibility(View.VISIBLE);
    getFlow(flowType).prepareSettingScreen();
}

protected static void setUp(android.content.Context context) {
    if (context == null) {
        throw new com.marcohc.architecture.common.helper.PreferencesException("Context must not be null!");
    }
    com.marcohc.architecture.common.helper.PreferencesHelper.instance = new com.marcohc.architecture.common.helper.PreferencesHelper(context);
}

public static boolean isEmailValid(java.lang.String email) {
    return (!(android.text.TextUtils.isEmpty(email))) && (Patterns.EMAIL_ADDRESS.matcher(email).matches());
}

public void configureWithMyListener(com.github.hmallet.realparallaxandroid.RealHorizontalScrollView realHorizontalScrollView) {
    this.mRealHorizontalScrollView = realHorizontalScrollView;
    mRealHorizontalScrollViewWidth = this.mRealHorizontalScrollView.getWidth();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sign_up);
    butterknife.ButterKnife.bind(this);
    mSignUpButton.setOnClickListener(this);
    mAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
    createAuthStateListener();
}

protected void onStatusOk(net.datafans.android.common.data.service.BaseResponse response, java.lang.Class<?> type) {
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    unipd.dei.ESP1415.falldetector.FallService.MyBinder binder = ((unipd.dei.ESP1415.falldetector.FallService.MyBinder) (service));
    mService = binder.getService();
    mBound = true;
}

public void incSpeed() {
    tpi -= 10000;
    android.util.Log.i("Chip8", ("" + (tpi)));
}

@java.lang.Override
public void terminate() {
    if (!(isPreviousMarker())) {
        android.util.Log.e("MUEReeeeeee", "servicio");
        mView.stopService(com.gerus.pulpomatic.navigator.Navigator.getService(getContext()));
    }
}

@android.support.annotation.NonNull
@java.lang.Override
public java.lang.String getType() {
    android.util.Log.e(TAG, ("Type " + (type)));
    return !(android.text.TextUtils.isEmpty(type)) ? type : STORY_TYPE;
}

public void sendAlert() throws java.lang.RuntimeException {
    android.util.Log.i(io.github.fbmediahack.quiethome.AudioDetector.LOG_TAG, "BE QUIET I AM Sleeping");
    noiceListener.onNoiceDetected();
    this.stopThread();
}

@java.lang.Override
public secureapps.com.fitsec.RealmAppAdapter.SecureAppViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    timber.log.Timber.d("creating viewholder...");
    android.view.View itemView = android.view.LayoutInflater.from(context).inflate(R.layout.app_view_holder, parent, false);
    return new secureapps.com.fitsec.RealmAppAdapter.SecureAppViewHolder(itemView);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mCurrentView = inflater.inflate(R.layout.fragment_friend_request, container, false);
    mContext = getActivity().getApplicationContext();
    loadFriendRequest();
    return mCurrentView;
}

public void onEvent(java.lang.String basicEvent) {
    if (basicEvent.equals(LoginCallback.LOGIN_SUCCESS)) {
        progressDialog.dismiss();
        android.content.Intent intent = new android.content.Intent(this, com.randomappsinc.blanknavigationdrawer.Activities.MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.uramonk.androidtemplateapp.databinding.ActivityMainBinding binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    com.uramonk.androidtemplateapp.viewmodel.MainViewModel mainViewModel = new com.uramonk.androidtemplateapp.viewmodel.MainViewModel(this);
    binding.setMainViewModel(mainViewModel);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.mBackHandledInterface = mActivity;
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    if ((pickedObject) != (selectedObject)) {
        toggleSelection();
    }
    edit();
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    int index = dataset.indexOf(movie);
    db.deleteMovieFromWatchlist(movie.getId());
    removeItemFromView(index);
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeDouble(this.value);
    dest.writeString(this.currency);
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    boolean display_unread_only = !(item.isChecked());
    item.setChecked(display_unread_only);
    loadContent(display_unread_only);
    return false;
}

@java.lang.Override
public void resume(cn.woblog.android.downloader.domain.DownloadInfo downloadInfo) {
    if (isExecute()) {
        downloadInfo.setStatus(DownloadInfo.STATUS_PAUSED);
        cacheDownloadTask.remove(downloadInfo.getId());
        download(downloadInfo);
    }
}

@java.lang.Override
public void onClick(android.view.View paramView) {
    if ((rescheduleSession(0)) == null) {
        createDialog("Rescheduling failed", "The session cannot be scheduled. Minimize duration or use another location.").show();
    }
    showConference();
    showSession();
}

protected void onPostExecute(int responseCode) {
    if ((responseCode < 200) || (responseCode > 300)) {
        android.widget.Toast.makeText(context, "fail", Toast.LENGTH_LONG).show();
    }
}

private java.util.Map<java.lang.String, com.android.deskclock.data.City> getCityMap() {
    mCityMap = com.android.deskclock.data.CityDAO.getCities(mContext);
    return mCityMap;
}

public boolean backupDatabase(android.content.Context context) {
    return (dbWriter.exportDatabase(context)) != null;
}

@java.lang.Override
public void setRotation(jp.co.cyberagent.android.gpuimage.Rotation rotation) {
    setRotation(0, rotation);
}

@com.facebook.react.bridge.ReactMethod
public void rotate(int rotation) {
    android.util.Log.e("YES", ("rotation : " + rotation));
    setApplicationOrientation(rotation);
}

@java.lang.Override
public void onClick(android.view.View view) {
    button1.setText(((mark) + ""));
    placeMarkOnBoard(0, 0);
    button1.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}

@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    mProgressDialog.show();
    android.graphics.Bitmap thumbnail = mStorage.getImageThumbnail(params[0]);
    mProgressDialog.dismiss();
    return thumbnail;
}

private void closeRenderer() {
    android.util.Log.d(com.bjss.plugin.PdfRendererPlugin.LOG_TAG, "closeRenderer");
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
    this.soundListFragment.refreshList(this.soundCategories);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    java.lang.System.out.println("!!REACHED COMPLETION!!");
    mp.reset();
    mp.release();
    mp = null;
}

private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String msg) {
    logger.print(level, msg, null);
}

@java.lang.Override
public void onGlobalLayout() {
    initLayout();
    android.util.Log.i(TAG, "m onGlobalLayout \n\n");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.input_categories);
    setup();
}

@java.lang.Override
public void run() {
    handler.post(new java.lang.Runnable() {
        public void run() {
            try {
                new gr.qpc.meteoclimaandroid.MeteoclimaMainFragment.GetLocationName(getActivity()).execute();
            } catch (java.lang.Exception e) {
            }
        }
    });
}

@java.lang.Override
public void onClick(android.view.View view) {
    getFragmentManager().beginTransaction().replace(R.id.container, new com.shawn.br.fragment.BookFragment()).commit();
}

public static int dp2Px(android.view.View context, int dp) {
    return com.welcome.to.sweden.utils.ViewUtils.dp2Px(context.getContext(), dp);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    java.lang.System.out.println("Negative click");
    dialog.cancel();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.swjtu.walker.utils.L.v(com.swjtu.walker.activity.home.TAG, "刷新");
    loadAllShops();
    mAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void run() {
    android.os.Message incrementTimeMessage = new android.os.Message();
    incrementTimeMessage.what = 173;
    handler.sendMessage(incrementTimeMessage);
}

@java.lang.Override
public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
    hideProgress();
    displayError();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    isLock = false;
    list.remove(position);
    animationGridViewAdapter.removeItem(0).removeItem(0).commit();
}

protected void configRecyclerView(android.support.v7.widget.RecyclerView mList, com.kimeeo.library.listDataView.recyclerView.BaseRecyclerViewAdapter mAdapter) {
    mAdapter.supportLoader = false;
}

@java.lang.Override
public void prepare(com.google.android.exoplayer2.source.MediaSource mediaSource) {
    prepare(mediaSource, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (checkMissingFieldError(((android.widget.EditText) (findViewById(R.id.user_entered_calories))))) {
        getGoals();
    }
}

@java.lang.Override
public android.app.Fragment getItem(int position) {
    mCursor.moveToPosition(position);
    android.util.Log.v("TEST", ("getItem called position: " + position));
    return com.example.xyzreader.ui.ArticleDetailFragment.newInstance(mCursor.getLong(ArticleLoader.Query._ID), mStartId);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = (mCurrentIndex) - 1;
    if ((mCurrentIndex) < 0) {
        mCurrentIndex = (mQuestionBank.length) - 1;
    }
    updateQuestion();
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(com.hinohunomi.bgbeacon.BeaconService.TAG, "onBind");
    mActionHandler.sendEmptyMessage(com.hinohunomi.bgbeacon.BeaconService.ActionHandler.ACT_BEACON_DISABLE);
    return mBinder;
}

public static void setContext(android.content.Context c) {
    if (c != null)
        com.adsamcik.signalcollector.utility.DataStore.contextWeak = new java.lang.ref.WeakReference(c.getApplicationContext());
    
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    currentMonth = position;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    getActivityComponent().inject(this);
}

public void exception(java.lang.Exception e) {
    if (com.yourtion.httpdns.Debug.isshow)
        this.error(android.util.Log.getStackTraceString(e));
    
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
    }else {
        confirmRename(((android.widget.EditText) (v)), mRenamePos);
    }
}

public void setGlobalTransparency(float value) {
    android.content.SharedPreferences preferences = AppGlobal.shared_preferences;
    preferences.edit().putString("Global_Transparency", java.lang.String.valueOf(value)).apply();
}

@java.lang.Override
public void run() {
    databaseOpenHelper = new com.ngynstvn.android.blocspot.api.model.database.DatabaseOpenHelper(com.ngynstvn.android.blocspot.BlocspotApplication.getSharedInstance(), poiTable);
    dbFakeData();
}

public void setCurrentPosition(int currentPosition) {
    android.util.Log.e("ForecastArrayAdapter", ("setCurrentPosition " + currentPosition));
    printisFlipp("setCurrentPosition");
    this.currentPosition = currentPosition;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
    drawerLayout.closeDrawer(Gravity.LEFT);
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.imca2017.bookswant.BookDetailsActivity.FetchDeepData().execute();
}

@java.lang.Override
public void onActivityResult(android.app.Activity activity, int requestCode, int resultCode, android.content.Intent data) {
}

@com.squareup.otto.Subscribe
public void onCreateCharacter(amagi82.modularcharactersheetcreator.events.CreateCharacterEvent event) {
    final android.support.v4.app.Fragment fragment = new amagi82.modularcharactersheetcreator.fragments.CharacterFragment();
    fm.beginTransaction().replace(R.id.container, fragment).addToBackStack("transaction").commit();
}

public void logoutUser() {
    editor.clear();
    editor.commit();
    android.content.Intent intent = new android.content.Intent(mContext, com.shannor.theloyaltynetwork.activities.LoginActivity.class);
    mContext.startActivity(intent);
}

