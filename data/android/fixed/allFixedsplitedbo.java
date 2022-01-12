public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.leoyoon.habittracker.AddHabit.class);
    startActivity(intent);
}

private boolean isInternetConnectionAvailable() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
    return (activeNetwork != null) && (activeNetwork.isConnectedOrConnecting());
}

public void onClick(android.content.DialogInterface dialog, int id) {
    absenmobilehr.app.kalbenutritionals.absenmobilehr.Data.DatabaseHelper helper = absenmobilehr.app.kalbenutritionals.absenmobilehr.Data.DatabaseManager.getInstance().getHelper();
    helper.clearDataAfterLogout();
    helper.close();
    logout();
}

public void testToast(java.lang.String text) {
    android.widget.Toast toast = android.widget.Toast.makeText(context, text, Toast.LENGTH_SHORT);
    toast.show();
}

public void askPermission(java.lang.String reqPerm) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(context, reqPerm)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(com.avigezerit.callssmslogs.checkPermissionsHelper.activity, new java.lang.String[]{ reqPerm }, setReqCode(reqPerm));
    }
}

public static void log(java.lang.Object tag, java.lang.String message) {
    if (!(kaist.cs550_2016.poche.Debug.isDebug))
        return ;
    
    android.util.Log.w(tag.toString(), message);
}

public static com.nag.android.stm.ThumbnailAdapter getInstance(android.content.Context context, boolean side, android.graphics.Point size) {
    if ((com.nag.android.stm.ThumbnailAdapter.instance) == null) {
        com.nag.android.stm.ThumbnailAdapter.instance = new com.nag.android.stm.ThumbnailAdapter(context, side, size);
    }
    return com.nag.android.stm.ThumbnailAdapter.instance;
}

private void refreshDetailsFragment(com.example.test.samplemasterdetail.entities.RelatedTopic relatedTopic) {
    if ((mDetailsFragment) != null) {
        mDetailsFragment.refreshDetails(relatedTopic);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    navigation = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.navigation)));
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    instantiateFragmentsAndManager();
}

protected void extraSet() {
    android.util.Log.d(com.simpleworkout.timer.MainActivity.TAG, ("extraSet: setsCurrent=" + (setsCurrent)));
    updateButtonsLayout(com.simpleworkout.timer.MainActivity.ButtonsLayout.RUNNING);
}

public void onSettingsMenuClick(android.view.MenuItem item) {
}

public java.lang.Boolean matches(java.lang.String check) {
    if (phrases.contains(check.toLowerCase())) {
        return true;
    }
    return false;
}

public void onPause() {
    super.onPause();
    android.util.Log.d("info", "List on Pause");
}

void OnItemClick(int position, android.view.View view, int size);

@java.lang.Override
public void onTabReSelected(@android.support.annotation.IdRes
int tabId) {
    if (tabId != (com.example.user.kchat01.ContactsActivity.tabId)) {
    }
}

public void returnToMain() {
    android.content.Intent intent = new android.content.Intent(this, com.ericabraham.leapfrog.MainActivity.class);
    startActivity(intent);
    finish();
}

private void notifyAlarm(android.app.Notification n) {
    mNotificationManager.notify(com.darshancomputing.BatteryIndicatorPro.BatteryInfoService.NOTIFICATION_ALARM, n);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View view) {
    launchApp(mActivityInfos.get((position % (mActivityInfos.size()))));
}

@java.lang.Override
public void forkRandomCallLogs(android.content.Context context, int quantity) {
    if ((mForkBinder) != null) {
        mForkBinder.startFork(ForkTask.FORK_TYPE_RANDOM_CALLLOGS, quantity);
    }
}

public void onClick(android.view.View v) {
    if (goodCB.isChecked()) {
        globalPlay.setFgMadeFlag(true);
    }else {
        globalPlay.setFgMadeFlag(false);
    }
    flow = true;
    newPlayDialog();
    dialog.dismiss();
}

public void stopCameraPreview() {
    mPreviewing = false;
    mCamera.cancelAutoFocus();
    try {
        mCamera.stopPreview();
    } catch (java.lang.Exception e) {
        android.util.Log.d(app.anish.com.tapp.camera.CameraPreview.TAG, "Tried stopping non-existent preview");
    }
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mFile = new java.io.File(getActivity().getExternalFilesDir(null), "pic.jpg");
}

public void UpdateName(java.lang.String name) {
    if (name != null)
        ((android.widget.TextView) (header.findViewById(R.id.username))).setText(name);
    
}

@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(registered)) {
        getActivity().registerReceiver(broadcastClass, new android.content.IntentFilter(cell.signalwatcher.CellSignalFragment.BROADCAST_PACKAGE));
        registered = true;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((orthodoxHolidayMajor.getDescriptionUrl()) != null) {
        startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(orthodoxHolidayMajor.getDescriptionUrl())));
    }
}

private void addMoodModule() {
    for (com.nmatte.mood.chart.cell.ReadonlyCheckbox cellView : com.nmatte.mood.logbookentries.MoodList.getCellViews(context, entry.getMoods())) {
        addView(cellView);
    }
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError volleyError) {
    volleyError.printStackTrace();
    if (null != resultListener)
        resultListener.onSearchError("Network Error");
    
}

@java.lang.Override
public void saveTask(java.lang.String title, java.lang.String description, android.graphics.Bitmap image) {
    if (isNewTask()) {
        createTask(title, description, image);
    }else {
        updateTask(title, description, image);
    }
}

private void removeLineFromFavorites() {
    team5.capstone.com.mysepta.Managers.FavoritesManager.removeRailLineFromFavorites(start, end);
    mOptionsMenu.findItem(R.id.favoriteIcon).setIcon(android.R.drawable.star_big_off);
    favorite = false;
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return net.hokiegeek.android.dondeestas.MapFragment.newInstance();
        case 1 :
            return net.hokiegeek.android.dondeestas.PersonFragment.newInstance();
    }
    return null;
}

public synchronized void addCluster(long cluster) {
    clusterList.add(cluster);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d("testing", "onStartCommand");
    return START_STICKY;
}

public void getVideos(java.lang.String playlistId) {
    android.widget.RelativeLayout activityLayout = ((android.widget.RelativeLayout) (findViewById(R.id.video_display_layout)));
    net.computingtutor.robert.computingtutor.PlaylistGetter videoPlaylistGetter = new net.computingtutor.robert.computingtutor.PlaylistGetter(this, videoList, playlistId, activityLayout);
    videoPlaylistGetter.GetPlaylist();
}

@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    activity = getActivity();
}

@java.lang.Override
public void onClick(android.view.View view) {
    init_twitter_data(0);
}

public void previousPage(android.view.View view) {
    if ((com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER) != 1)
        com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER = (com.example.kelvin_pc.film.Model.System.System_Variables.PAGE_NUMBER) - 1;
    
    generateFilmQuery();
    update();
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
}

@org.androidannotations.annotations.AfterInject
void initData() {
    hasFooter = true;
}

public void launchPictureLibrary() {
    org.wordpress.android.ui.media.WordPressMediaUtils.launchPictureLibrary(this);
}

@java.lang.Override
public void onShowCustomView(android.view.View view, acr.browser.lightning.view.CustomViewCallback callback) {
    mUIController.onShowCustomView(view, callback);
}

public java.lang.String getLabel() {
    return org.wordpress.android.WordPress.getContext().getString(mLabelResId).toUpperCase();
}

public com.actinarium.rhythm.layer.GridLines setStep(@android.support.annotation.FloatRange(from = 0.0F, fromInclusive = false)
float step) {
    mStep = step;
    return this;
}

@java.lang.Override
public void uncaughtException(java.lang.Thread thread, java.lang.Throwable throwable) {
    throwable.printStackTrace();
    android.util.Log.e(logTag, throwable.getLocalizedMessage());
}

public java.util.Date getNextBirthday() {
    return birthday.getNextAnniversary();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    inject();
    initView();
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    timer = new android.os.CountDownTimer(8000, 1000) {
        @java.lang.Override
        public void onTick(long l) {
        }

        @java.lang.Override
        public void onFinish() {
            sayInitialInstructions();
        }
    };
    timer.start();
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
}

@java.lang.Override
public void onNewFrame(com.google.vr.sdk.base.HeadTransform headTransform) {
}

@java.lang.Override
public void onSuccess(com.owsega.hellotractorsample.model.FarmerEntity farmerEntity) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    flingContainer.getTopCardListener().selectRight();
}

public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) {
    return com.runrev.android.LCBInvocationHandler.doNativeListenerCallback(m_handler_ptr, method.getName(), args);
}

@java.lang.Override
public void onClick(android.view.View v) {
    v.setTag(info);
    onClickSubject.onNext(v);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which, boolean isChecked) {
    if (isChecked)
        selected[which] = true;
    else
        selected[which] = false;
    
}

@java.lang.Override
public void run() {
    android.util.Log.d("CALL_INTEGRATION", "CallActivity. initRejectCallTask lunched");
    cancelPlayer();
    videoChatHelper.rejectCall(userInfo);
}

public void forceLocationUpdate(@android.support.annotation.Nullable
android.location.Location location) {
    updateLocation(location);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    currentMonth = position;
}

public void setContent(java.lang.String content) {
    this.content = content;
    android.widget.TextView tvContent = ((android.widget.TextView) (findViewById(R.id.content)));
    tvContent.setText(content);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 1) {
        PlaylistAdapter.PlaylistCheckboxList.clear();
        com.leokomarov.jamstreamer.playlist.PlaylistAdapter.PlaylistCheckboxCount = 0;
    }
}

@java.lang.Override
public void onFailure(retrofit2.Call<okhttp3.ResponseBody> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(mActivity.getApplicationContext(), "网络获取数据失败", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    acceptDialogClick(v, mShouldPaste.isChecked());
    dismiss();
}

public void refresh(android.app.Activity activity) {
    mActivity = activity;
    new net.skweez.sipgate.model.AccountInfo.RefreshAccountInfoTask().execute();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mStateProgressBar.setVisibility(View.VISIBLE);
    mStateTextView.setText(com.example.android.bluetoothlegatt.RSCPActivity.EXEC);
    mRscpService.getSensorLocation();
}

public static com.voidgreen.friendsrelations.AlbumsFragment newInstance(java.lang.String param1, java.lang.String param2) {
    com.voidgreen.friendsrelations.AlbumsFragment fragment = new com.voidgreen.friendsrelations.AlbumsFragment();
    return fragment;
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    buildRestaurantMapPopUp(fm, marker);
    return true;
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    stopSelf();
    return true;
}

public void updateData(android.util.SparseArray<com.quickblox.content.model.QBFile> qbFileSparseArray) {
    this.qbFileSparseArray = qbFileSparseArray;
    notifyDataSetChanged();
}

@java.lang.Override
public void onEndOfSpeech() {
    android.util.Log.d(com.lixl.waveform.WaveformViewModule.TAG, "evaluator stoped");
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mSubscription.setShowListened((!isChecked));
    OnSwitchChangedHandler(isChecked, contentResolver, mHideListenedListener);
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    if ((com.Yamate.Camera.MainActivity.mYcameraOutputStream) == null)
        com.Yamate.Camera.MainActivity.mYcameraOutputStream = new java.io.ByteArrayOutputStream();
    
    mCamera.takePicture();
}

@java.lang.Override
public void onFailure(com.mercadopago.exceptions.MercadoPagoError error) {
}

private void updateSeekTime(android.content.Intent intent) {
    int seekTimeMsec = getSeekTime(intent);
    if (seekTimeMsec >= 0) {
        mediaPlayer.seekTo(seekTimeMsec);
    }
}

@java.lang.SuppressWarnings(value = "unused")
public void onActivityResult(android.app.Activity activity, int resultCode, @android.support.annotation.NonNull
android.content.Intent data) {
    if ((callback) == null) {
        return ;
    }
    if (resultCode == (android.app.Activity.RESULT_OK)) {
        processEvent(data);
        return ;
    }
    callback.onCanceled();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.widget.RelativeLayout layout = ((android.widget.RelativeLayout) (inflater.inflate(R.layout.fragment_fragment1, container, false)));
    return layout;
}

public byte[] pcmToWav(byte[] pcm) {
    return ee.ioc.phon.android.speechutils.utils.AudioUtils.getRecordingAsWav(pcm, getSampleRate(), ee.ioc.phon.android.speechutils.RESOLUTION_IN_BYTES, ee.ioc.phon.android.speechutils.CHANNELS);
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    this.holder = holder;
    if (null != (currVideoModel)) {
        if (videoPauseFlag) {
            videoPauseFlag = false;
        }
        playVideo(currVideoModel);
    }
}

@java.lang.Override
public <T extends android.arch.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) {
    return ((T) (viewModelMap.get(modelClass).get()));
}

public static void e(java.lang.String c, java.lang.String s, java.lang.Throwable tr) {
    if ((org.piwik.sdk.tools.Logy.sLoglevel) != (org.piwik.sdk.tools.Logy.SILENT)) {
        android.util.Log.e(c, s, tr);
    }
}

public static synchronized void init(android.content.ContentResolver resolver) {
    if ((com.robotoworks.mechanoid.db.SQuery.mAsync) == null) {
        com.robotoworks.mechanoid.db.SQuery.mAsync = new com.robotoworks.mechanoid.db.SQuery.Async(resolver);
    }
}

private void initializeCitiesSpinner() {
    if ((mCity) == null)
        return ;
    
    mCity.setAdapter(new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, mCityList));
    mCity.setSelection(0);
}

public static android.support.design.widget.Snackbar getErrorSnackBar(java.lang.String message, android.view.View attachedView) {
    final android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(attachedView, message, Snackbar.LENGTH_LONG);
    return snackbar;
}

public static void show(android.support.v7.app.AppCompatActivity activity, java.lang.Integer containerViewId, edu.usf.cutr.open311client.Open311 open311, edu.usf.cutr.open311client.models.Service service) {
    org.onebusaway.android.report.ui.Open311ProblemFragment.show(activity, containerViewId, open311, service, null, null);
}

@java.lang.Override
public void onClick(android.view.View view) {
    int nextPage = mCurrentPage.getChoice1().getNextPage();
    loadPage(nextPage);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_workout, container, false);
    butterknife.ButterKnife.bind(this, view);
    return view;
}

public void setPhoneStatusBar(com.android.systemui.statusbar.phone.PhoneStatusBar phoneStatusBar) {
    mPhoneStatusBar = phoneStatusBar;
    updateCameraVisibility();
    updateLeftButtonVisibility();
    updateCameraIconColor();
    updatePhoneIconColor();
    updateLockIconColor();
    updateIndicationTextColor();
    updateLeftButtonVisibility();
}

public boolean dispatchTouchEvent(android.view.MotionEvent event) {
    onTouchEvent(event);
    return super.dispatchTouchEvent(event);
}

public void start() {
    while ((playList.size()) < (size)) {
        updatePlayList();
    } 
    nextSong();
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    stepsSinceLastReboot = java.lang.String.valueOf(event.values[0]);
    com.example.android.msc_project.StepCounter.sendInfo(stepsSinceLastReboot);
}

public void openFragmentNoHistory(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, fragment);
    ft.commitAllowingStateLoss();
}

public static com.patrickcorriganjr.boardgameapp.UI.GameListFragment newInstance() {
    com.patrickcorriganjr.boardgameapp.UI.GameListFragment fragment = new com.patrickcorriganjr.boardgameapp.UI.GameListFragment();
    return fragment;
}

public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
    }else {
        monumentList.setVisibility(View.INVISIBLE);
    }
}

private void setupSharedPreferences() {
    android.content.SharedPreferences sharedPreferences = android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(this);
    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
}

@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    if (databaseError != null) {
        android.widget.Toast.makeText(this, R.string.account_created, Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    attemptLogin();
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    getLikedUsers();
    getBestFriends(likedUsers);
    getInstagramFeed();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (buttonLogIn)) {
        CandidateLogIn();
    }
    if (view == (textViewregister)) {
        finish();
        startActivity(new android.content.Intent(this, com.example.hp.hireme.HIREME.class));
    }
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    launchEditItem(getActivity(), MainActivity.FragmentType.DETAILS_INCOME, ((mahappdev.caresilabs.com.timr.models.IncomeModel) (incomeAdapter.getItem(position))));
}

@java.lang.Override
public com.android.news24x7.adapter.NewsRecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int viewType) {
    view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_list, viewGroup, false);
    return new com.android.news24x7.adapter.NewsRecyclerViewAdapter.ViewHolder(view);
}

@java.lang.Override
public void onClick(android.view.View v) {
    int current = getItem((+1));
    if (current < (layouts.length)) {
        viewPager.setCurrentItem(current);
    }
}

public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    switch (keyCode) {
        case android.view.KeyEvent.KEYCODE_VOLUME_DOWN :
            zoom(false);
            return true;
        case android.view.KeyEvent.KEYCODE_VOLUME_UP :
            zoom(true);
            return true;
    }
    return super.onKeyDown(keyCode, event);
}

