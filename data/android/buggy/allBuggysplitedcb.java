private void connectingGoogleApiClient() {
    createLocationRequest();
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    mGoogleApiClient.connect();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    me.ccrama.redditslide.Reddit.forceRestart(this, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    sendCancelRoutineMessage();
    android.content.Intent intent = new android.content.Intent(this, com.sxnwlfkk.dailyroutines.views.profileActivity.ProfileActivity.class);
    intent.setData(mCurrentUri);
    startActivity(intent);
    sendStopTalkingMessage();
    finish();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.marz.snapprefs.PaintTools.width = seekBar2.getProgress();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    bundle.putBoolean(aaku492.smartfoodtracker.FragmentContainerActivity.IS_MODAL, this.isModal);
}

@java.lang.Override
public void onClick(android.view.View view) {
    new io.gloop.drawed.dialogs.SearchDialog(this, owner, mTwoPane, this.getSupportFragmentManager()).show();
    floatingActionMenu.close(false);
}

protected void setButtonState(android.view.View button, boolean show) {
    if (show) {
        button.setVisibility(View.VISIBLE);
    }else {
        button.setVisibility(View.INVISIBLE);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    onRefresh();
    if (!(com.calgen.stockhawk.utils.BasicUtils.isNetworkUp(getApplicationContext()))) {
        showInternetOffSnackBar();
    }
}

private void populateToDoObject() {
    try {
        todoItem = getTodo();
        displayDetail();
    } catch (java.lang.AssertionError err) {
        todoItem = new com.nearsoft.androidschool.todoapp.models.ToDoContent();
        buttonViewConfig(true);
    }
}

public void deleteRecipe(android.content.Context context, long id) {
    new com.example.caitlin.cookhelper.DatabaseHandler(context).deleteIngredientMeasures(id);
    new com.example.caitlin.cookhelper.DatabaseHandler(context).deleteRecipe(id);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (editable != null)
        answerList.get(getPosition()).setNumAns(java.lang.String.valueOf(editable));
    
    saveAnswer.onAnswerSave(answerList.get(getPosition()));
}

@java.lang.Override
public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    addActivity(activity);
    if ((activityLifeHandler) != null)
        activityLifeHandler.onCreated();
    
}

private android.util.ArrayMap<java.lang.String, java.lang.String> getMetaFromPuller() {
    return com.birdle.pranay.birdle.MetaDataPuller.pull(YTN, false);
}

public static java.lang.String getDateTimeString(@android.support.annotation.NonNull
android.content.res.Resources resources, @android.support.annotation.NonNull
java.util.Date date) {
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(resources.getString(R.string.format_date_time));
    return format.format(date);
}

@java.lang.Override
public void endRequest() {
    super.endRequest();
    com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPaginate().setHasMoreDataToLoad(com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPagePaginator().hasMorePages());
}

@java.lang.Override
public void onAdClosed() {
    super.onAdClosed();
    com.crashlytics.android.Crashlytics.log("onAdClosed");
}

public static boolean checkConnection(android.content.Context context) {
    if (org.wordpress.android.util.NetworkUtils.isNetworkAvailable(context)) {
        return true;
    }
    org.wordpress.android.util.ToastUtils.showToast(context, R.string.no_network_message);
    return false;
}

private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState, mHotAnthology);
    mHotAdapter = new com.jparkie.givesmehope.views.adapters.HotAdapter(mHotView.getContext(), mHotAnthology.getStories());
    mHotView.setAdapterForRecyclerView(mHotAdapter);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    list.archived = true;
    com.liamfruzyna.android.wishlister.data.IO.getInstance().saveAndSync();
    ((com.liamfruzyna.android.wishlister.activities.ListerActivity) (getActivity())).loadActivity();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.mozzandroidutils.file.MozzConfig.makeAppDirs(this);
    testEloquentCreate();
    testDB();
}

@java.lang.Override
public void show(android.support.v4.app.FragmentManager fragmentManager, java.lang.String tag) {
    fragmentManager.popBackStack();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.addToBackStack(tag);
    fragmentTransaction.add(this, tag);
    fragmentTransaction.commit();
}

public void updatePosts(java.util.List<com.theratio.utilities.Post> results, android.support.v7.widget.RecyclerView.Adapter adapterToNotify) {
    com.theratio.utilities.Post.updatePostsByUserID(this.id, results, adapterToNotify);
}

public static int optimalCharArraySize(int desiredSize) {
    return (de.dimensionv.android.androtools.datastructures.arrays.ArraySizeTools.optimalByteArraySize((desiredSize * 2))) / 2;
}

@java.lang.Override
public void onCreate() {
    android.util.Log.e(com.gerus.pulpomatic.services.LocationService.TAG, ("onCreate " + (com.gerus.pulpomatic.services.LocationService.isActiveAlive)));
    com.gerus.pulpomatic.services.LocationService.isActiveAlive = false;
    init();
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    if (!(this.isDatabaseExists())) {
        this.getReadableDatabase();
        this.close();
    }
}

@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onResume() {
    super.onResume();
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.SuppressWarnings(value = "deprecation")
        @java.lang.Override
        public void run() {
            mBluetoothAdapter.startLeScan(mLeScanCallback);
        }
    }).start();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    chaitanya.im.searchforreddit.ShareActivity.ruler.setVisibility(View.INVISIBLE);
    android.util.Log.d("ShareActivity.java", "onResume");
}

public void showEntries(@android.support.annotation.NonNull
java.util.List<com.demo.navigator.ds.model.Entry> entries) {
    mBinding.entryContentRv.setAdapter(new com.demo.navigator.navigation.EntryFragment.EntryListAdapter(entries));
}

public void onAnimationEnd(android.animation.Animator animation) {
    if (!(mWasCanceled)) {
        revealView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        revealView.setClipToOutline(false);
        if (shouldRemoveElevationDuringAnimation()) {
            revealView.setTranslationZ(0);
        }
    }
}

@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable runnable) {
    return new java.lang.Thread(runnable, ((com.fernandocejas.android10.sample.data.executor.JobExecutor.JobThreadFactory.THREAD_NAME) + (counter)));
}

@java.lang.Override
public void onTrackPositionChanged(int position) {
    android.util.Log.d(io.nya.powerlyrics.LyricsActivity.LOG_TAG, ("play position: " + (position * 1000)));
    mLyricView.updateCurrentTime((position * 1000));
}

@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    progress.dismiss();
    android.widget.Toast.makeText(getApplicationContext(), "YaY", Toast.LENGTH_LONG).show();
}

private void showSuggestList() {
    if ((mSearchLayout.getVisibility()) == (android.view.View.GONE)) {
        mRecyclerView.setVisibility(View.GONE);
        mSearchLayout.setVisibility(View.VISIBLE);
        mRecyclerView.setLayoutFrozen(true);
    }
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardSentFragment.TAG, "onActivityCreated");
    initAdapter();
    initListView();
}

public void onClick(android.view.View V) {
    saveData();
    android.content.Intent intent = new android.content.Intent(this, com.example.levinm.bcreaderv3.historyactivity.class);
    intent.putStringArrayListExtra("key", historyitems);
    startActivity(intent);
}

@com.squareup.otto.Subscribe
public void onAuthSuccess(cz.kovar.petr.homevoice.bus.events.AuthEvent.Success event) {
    android.util.Log.v(cz.kovar.petr.homevoice.frontend.FragmentPlan.LOG_TAG, "Auth Success!");
    createButtons(dataContext.getLocationsNames());
}

@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    container.removeView(((android.widget.ImageView) (object)));
}

public void makeExplosionSound(android.content.Context context) {
    if ((mp) != null) {
        mp.stop();
        mp.release();
    }
    mp = android.media.MediaPlayer.create(context, R.raw.torpedo);
    mp.start();
}

public void setDefaultHeadAndFoot() {
    android.content.Context context = getContext();
    setHeaderView(mLayoutInflater.inflate(R.layout.layout_google_header, mSwipe, false));
    setFooterView(mLayoutInflater.inflate(R.layout.layout_google_footer, mSwipe, false));
}

private void changeFragment(android.support.v4.app.Fragment destinationFragment) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fragment_container, destinationFragment);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(android.content.Intent, flags, startId);
    fireEvent(com.tenforwardconsulting.cordova.bgloc.BackgroundGpsPlugin.Event.MESSAGE, "StartBackGroundActivity");
    return START_REDELIVER_INTENT;
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
    this.hideViewLoading();
    this.showErrorMessage(new org.mythtv.android.domain.exception.DefaultErrorBundle(((java.lang.Exception) (e))));
    this.showViewRetry();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int i) {
    dialog.cancel();
    noPlayerAnsweredCorrectly();
    sendCard(null);
    clientsResponded = 0;
}

@java.lang.Override
public void onClick(android.view.View v) {
    SendGoods();
    sureSendGoods.setEnabled(false);
}

static boolean isFragment(java.lang.Class clazz) {
    return (android.support.v4.app.Fragment.class.isAssignableFrom(clazz)) || (android.support.v4.app.Fragment.class.isAssignableFrom(clazz));
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_main, container, false);
    butterknife.ButterKnife.bind(this, view);
    return view;
}

private boolean requestFocus() {
    return (android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED) == (mAudioManager.requestAudioFocus(this, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN));
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    duration = mp.getDuration();
    playMedia();
}

@java.lang.Override
protected void onClick(android.content.Context context) {
    if ((fileType) != (com.frostwire.android.core.Constants.FILE_TYPE_RINGTONES)) {
        com.frostwire.android.gui.util.UIUtils.openFile(context, path, mime);
    }else {
        com.andrew.apollo.utils.MusicUtils.playSimple(path);
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    pauseMedia();
    buildNotification(PlaybackStatus.PAUSED);
}

private void createQR() {
    android.graphics.Bitmap b = getQRBitmap();
    co.celloscope.printingdemo.FileHelper.saveBitmapFileToExternalCacheDirectory(this, b, "qr.png");
}

private void launchDialogsListFragment() {
    android.util.Log.d("MainActivity", "launchDialogsListFragment()");
    setCurrentFragment(com.quickblox.q_municate.ui.fragments.chats.DialogsListFragment.newInstance());
}

@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN)) || (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_UP))) {
        return true;
    }
    return false;
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    android.util.Log.i("info", (("T" + (client.finalUrl)) + errorResponse));
}

public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mUserIngredients = savedInstanceState.getStringArrayList("userIngredients");
    allIngredientsSearchValues = savedInstanceState.getStringArrayList("searchValues");
    userInput.setText(savedInstanceState.getString("userInput"));
}

public void setStateRevealed() {
    changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_REVEALED);
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}

public static void playSound(java.lang.String soundPath, android.media.MediaPlayer.OnCompletionListener playAllListener) {
    com.ichi2.libanki.Sound.playSound(soundPath, playAllListener, null);
}

public void stop() {
    if (mRunning) {
        mRunning = false;
        android.util.Log.i(ch.logixisland.anuto.game.GameEngine.TAG, "Stopping game loop");
        mGameThread.quit();
        mGameThread = null;
        mGameHandler = null;
    }
}

@java.lang.Override
public void onCancelled(com.firebase.client.FirebaseError firebaseError) {
    android.util.Log.e(getString(R.string.LogTagUserProfile), ((getString(R.string.FirebaseOnCancelledError)) + (firebaseError.getMessage())));
}

@java.lang.Override
public void setLocation(de.fau.cs.mad.wanthavers.common.Location location) {
    mFilterSettingFragBinding.setLocation(location);
    java.lang.System.out.println("reached set loaction");
    wanthavers.mad.cs.fau.de.wanthavers_android.baseclasses.WantHaversApplication.setLocation(location, getActivity().getApplicationContext());
    showLocationInView();
}

@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(me.ryanmiles.mysummoner.events.ExceptionHandle e) {
    timber.log.Timber.e(java.lang.String.valueOf(e));
    android.widget.Toast.makeText(this, e.getErrorString(), Toast.LENGTH_LONG).show();
}

public static boolean isRetryable(@android.support.annotation.NonNull
org.wikipedia.util.ThrowableUtil.AppError e) {
    return !(e.getDetail().contains("404"));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setTheme();
    setContentView(R.layout.activity_confirm_appointment);
    setUpRecyclerView();
}

public void apply() {
    net.gini.android.vision.internal.camera.photo.PhotoEdit.applyChanges(mPhotoModifiers);
    clearModifiers();
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((adapter.getmOnItemChildLongClickListener()) != null) {
        adapter.getmOnItemChildLongClickListener().onItemChildLongClick(adapter, view, getClickPosition());
    }
    return false;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable p1) {
    byte[] decoded = org.apache.commons.codec.binary.Base64.decodeBase64(p1.toString().getBytes());
    output.setText(new java.lang.String(decoded));
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new com.github.hintofbasil.hodl.settings.SettingsFragment()).commit();
}

private static android.net.Uri insertNut(android.content.ContentResolver contentResolver, com.izettle.wrench.core.Nut nut) {
    return contentResolver.insert(com.izettle.wrench.core.ConfigProviderContract.nutUri(), nut.toContentValues());
}

@java.lang.Override
public moneytracker2017.loftschool.com.loftschoolmoneytrackerjune17.ItemsAdapter.ItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new moneytracker2017.loftschool.com.loftschoolmoneytrackerjune17.ItemsAdapter.ItemViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null));
}

@android.support.annotation.Nullable
public java.lang.String[] listServices() {
    android.os.IBinder sspBinder = me.ycdev.android.lib.common.internalapi.android.os.ServiceManagerIA.getService(mSspName);
    me.ycdev.android.lib.ssproxy.proxy.ISysServiceProxy sspService = me.ycdev.android.lib.ssproxy.proxy.SysServiceProxyNative.asInterface(sspBinder);
    if (sspService != null) {
        return sspService.listServices();
    }
    return null;
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.opinions_fragment, container, false);
    initializeUI(view);
    return view;
}

public void open() {
    db = desDBHelper.getWritableDatabase();
    isOpen = true;
    android.util.Log.d(net.deschulz.desdatabase0.DesDBManager.DEBUG_TAG, "desDBHelper opened");
}

@java.lang.Override
public void onClick(android.view.View v) {
    mEventClickListener.onEventViewClick(v, this, mEvent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "open camera", Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
    startActivityForResult(intent, unical.master.computerscience.yellit.graphic.Activities.SignUpActivity.TAKE_PICTURE);
}

@java.lang.Override
public boolean onShowCustomView(android.view.View view, int requestedOrientation, android.webkit.WebChromeClient.CustomViewCallback callback) {
    return false;
}

public void onTick(long millisUntilFinished) {
    android.util.Log.i("COUNTTIME::", ("" + millisUntilFinished));
    broadcastToUI(millisUntilFinished);
}

private void setupViewPager() {
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewPager)));
    viewPagerAdapter = new sneer.android.ui.ConvoActivityWithTabs.ViewPagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(viewPagerAdapter);
}

@java.lang.Override
public void onError(com.facebook.FacebookException e) {
    bringBackWebView();
    android.util.Log.i("Error", "Error");
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
    updateQuestion();
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    new com.antest1.kcanotify.SettingActivity.getKcaStart2Data(context).execute();
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    presenter.onClickDelete(originalURL);
    dismiss();
}

@java.lang.Override
public void onError(com.google.android.gms.common.api.Status status) {
    android.util.Log.i("Advanced", ("An error occurred: " + status));
}

public void loadInitialData() {
    java.lang.String message = getString(org.hisp.dhis.android.sdk.R.string.finishing_up);
    org.hisp.dhis.android.sdk.utils.UiUtils.postProgressMessage(message);
    org.hisp.dhis.android.sdk.controllers.DhisService.loadInitialData(this);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (mEnabled) {
        setState(getNextState());
        notifyListeners();
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    com.android.EvtSpinner theSpinner = ((com.android.EvtSpinner) (mRootView.findViewById(R.id.spinner_didSomething)));
    theSpinner.setOnTouchListener(null);
    theSpinner.setOnItemSelectedListener(null);
    mListener = null;
}

@java.lang.Override
public boolean onBackPressed() {
    if ((bottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }
    return false;
}

private int getNumOfPoints() {
    if (!(isAdded())) {
        return 0;
    }
    if (org.wordpress.android.ui.stats.StatsUIHelper.shouldLoadMoreBars(getActivity())) {
        return 10;
    }else {
        return 7;
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    imageButton.setImageResource(R.drawable.fb_press_background);
    scanIntegrator.initiateScan();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mTele.isShown())) {
        mTeleField.setVisibility(View.VISIBLE);
    }else {
        mTeleField.setVisibility(View.GONE);
    }
}

public void toastError(java.lang.Exception error) {
    android.util.Log.e("MPissue", error.toString());
    error.fillInStackTrace().printStackTrace();
}

public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent();
    i.setClass(this, utc_4910.screenActivities.LoginActivity.class);
    finish();
    startActivity(i);
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem menuItem) {
    android.util.Log.d(com.codepath.nytimes.activity.NYTimesMainActivity.TAG, ("Menu Item Clicked = " + (menuItem.toString())));
    filteredSearch = true;
    showSearchFilterDialog();
    return false;
}

@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    if (position < (com.podraza.android.gaogao.gaogao.MainActivity.todos.size())) {
        return com.podraza.android.gaogao.gaogao.MainActivity.todos.get(position).getName();
    }else
        return "No More Dogs";
    
}

public void addStatusFilter(int statusFilter) {
    android.util.Log.d("FoodItemAdapter", ("adding status filter = " + (com.mfranklin.fridgeapp.data_model.Constants.statusToString(statusFilter))));
    statusFilters.add(statusFilter);
}

private void startCamera() {
    android.content.Intent intentCamera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    if ((intentCamera.resolveActivity(getPackageManager())) != null) {
        startActivityForResult(intentCamera, wwckl.projectmiki.activity.MainActivity.REQUEST_TAKE_PICTURE);
    }
    android.util.Log.e(wwckl.projectmiki.activity.MainActivity.LOG_TAG, "Unable to dispatch intent. No supported application available");
}

public void run() {
    android.bluetooth.BluetoothSocket cSocket = null;
    try {
        cSocket = mmSSocket.accept();
    } catch (java.io.IOException e) {
        showMessage("Socket Accept Error");
        return ;
    }
    onConnected(cSocket);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.i(LOG_TAG, (("Fragment" + (getId())) + ".onCreate()"));
    super.onCreate(savedInstanceState);
}

public static void startSwipeActivity(android.app.Activity activity, android.content.Intent intent) {
    com.github.bluzwong.swipeback.SwipeBackActivityHelper.startSwipeActivity(activity, intent, false, false);
}

@java.lang.Override
public void setOrientation(int orientation) {
    if ((android.widget.LinearLayout.HORIZONTAL) == orientation) {
        throw new java.lang.IllegalArgumentException("DragLinearLayout must be VERTICAL.");
    }
    super.setOrientation(orientation);
}

public void registerNetworkReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    filter.addAction(LocationManager.PROVIDERS_CHANGED_ACTION);
    registerReceiver(mNetworkStateReceiver, filter);
}

