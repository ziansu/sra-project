private void connectingGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    mGoogleApiClient.connect();
    createLocationRequest();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.System.exit(0);
}

@java.lang.Override
public void onClick(android.view.View v) {
    sendStopTalkingMessage();
    sendCancelRoutineMessage();
    android.content.Intent intent = new android.content.Intent(this, com.sxnwlfkk.dailyroutines.views.profileActivity.ProfileActivity.class);
    intent.setData(mCurrentUri);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.marz.snapprefs.PaintTools.width = seekBar2.getProgress();
    if ((com.marz.snapprefs.PaintTools.width) == 0) {
        com.marz.snapprefs.PaintTools.width = (com.marz.snapprefs.PaintTools.width) + 1;
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    super.onSaveInstanceState(bundle);
    bundle.putBoolean(aaku492.smartfoodtracker.FragmentContainerActivity.IS_MODAL, this.isModal);
}

@java.lang.Override
public void onClick(android.view.View view) {
    new io.gloop.drawed.dialogs.SearchDialog(this, floatingActionMenu, owner, mTwoPane, this.getSupportFragmentManager());
    floatingActionMenu.close(false);
}

protected void setButtonState(@android.support.annotation.Nullable
android.view.View button, boolean show) {
    if (button == null) {
        return ;
    }
    if (show) {
        button.setVisibility(View.VISIBLE);
    }else {
        button.setVisibility(View.INVISIBLE);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    onRefresh();
    if (!(com.calgen.stockhawk.utils.BasicUtils.isNetworkUp(this))) {
        showInternetOffSnackBar();
    }
}

private void populateToDoObject() {
    try {
        todoItem = getTodo();
        displayDetail();
        buttonViewConfig(false);
    } catch (java.lang.AssertionError err) {
        todoItem = new com.nearsoft.androidschool.todoapp.models.ToDoContent();
    }
}

public void deleteRecipe(android.content.Context context, long id) {
    new com.example.caitlin.cookhelper.DatabaseHandler(context).deleteRecipe(id);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (editable != null) {
        answerList.get(getPosition()).setNumAns(java.lang.String.valueOf(editable));
        saveAnswer.onAnswerSave(answerList.get(getPosition()));
    }
}

@java.lang.Override
public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    addActivity(activity);
}

private android.util.ArrayMap<java.lang.String, java.lang.String> getMetaFromPuller() {
    return com.birdle.pranay.birdle.MetaDataPuller.pull(YTN, true);
}

public static java.lang.String getDateTimeString(@android.support.annotation.NonNull
android.content.res.Resources resources, java.util.Date date) {
    if (date == null)
        return null;
    
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(resources.getString(R.string.format_date_time));
    return format.format(date);
}

@java.lang.Override
public void endRequest() {
    super.endRequest();
    if ((com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPaginate()) != null) {
        com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPaginate().setHasMoreDataToLoad(com.smartydroid.android.starter.kit.app.RecyclerViewPagedFragment.getPagePaginator().hasMorePages());
    }
}

@java.lang.Override
public void onAdClosed() {
    super.onAdClosed();
}

public static boolean checkConnection(android.content.Context context) {
    if (context == null) {
        return false;
    }
    if (org.wordpress.android.util.NetworkUtils.isNetworkAvailable(context)) {
        return true;
    }
    org.wordpress.android.util.ToastUtils.showToast(context, R.string.no_network_message);
    return false;
}

private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    mHotAnthology = com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState);
    mHotAdapter = new com.jparkie.givesmehope.views.adapters.HotAdapter(mHotView.getContext(), mHotAnthology.getStories());
    mHotView.setAdapterForRecyclerView(mHotAdapter);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    list.archived = true;
    com.liamfruzyna.android.wishlister.data.IO.getInstance().saveAndSync(list.name);
    ((com.liamfruzyna.android.wishlister.activities.ListerActivity) (getActivity())).loadActivity();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.mozzandroidutils.file.MozzConfig.makeAppDirs(this);
    testDB();
}

@java.lang.Override
public void show(android.support.v4.app.FragmentManager fragmentManager, java.lang.String tag) {
    fragmentManager.popBackStack();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.add(this, tag);
    fragmentTransaction.commit();
}

public void updatePosts(java.util.List<com.theratio.utilities.Post> results, android.support.v7.widget.RecyclerView.Adapter adapterToNotify) {
    com.theratio.utilities.Post.updatePostsByUserID(this.id, results, adapterToNotify, false);
}

public static int optimalCharArraySize(int desiredSize) {
    return (de.dimensionv.android.androtools.datastructures.arrays.ArraySizeTools.optimalByteArraySize((desiredSize << 1))) >>> 1;
}

@java.lang.Override
public void onCreate() {
    init();
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
}

@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onResume() {
    super.onResume();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d("ShareActivity.java", "onResume");
}

private void showEntries(@android.support.annotation.NonNull
java.util.List<com.demo.navigator.ds.model.Entry> entries) {
    mBinding.entryContentRv.setAdapter(new com.demo.navigator.navigation.EntryFragment.EntryListAdapter(entries));
}

public void onAnimationEnd(android.animation.Animator animation) {
    if (!(mWasCanceled)) {
        if (shouldRemoveElevationDuringAnimation()) {
            revealView.setTranslationZ(0);
        }
    }
}

@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable runnable) {
    return new java.lang.Thread(runnable, ((com.fernandocejas.android10.sample.data.executor.JobExecutor.JobThreadFactory.THREAD_NAME) + ((counter)++)));
}

@java.lang.Override
public void onTrackPositionChanged(int position) {
    mLyricView.updateCurrentTime((position * 1000));
}

@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    progress.dismiss();
}

private void showSuggestList() {
    if ((mSearchLayout.getVisibility()) == (android.view.View.GONE)) {
        mSearchLayout.setVisibility(View.VISIBLE);
        mRecyclerView.setLayoutFrozen(true);
    }
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardSentFragment.TAG, "onActivityCreated");
    super.onActivityCreated(savedInstanceState);
    initAdapter();
    initListView();
}

public void onClick(android.view.View V) {
    android.content.Intent intent = new android.content.Intent(this, com.example.levinm.bcreaderv3.historyactivity.class);
    intent.putStringArrayListExtra("key", historyitems);
    startActivity(intent);
}

@com.squareup.otto.Subscribe
public void onAuthSuccess(cz.kovar.petr.homevoice.bus.events.AuthEvent.Success event) {
    android.util.Log.v(cz.kovar.petr.homevoice.frontend.FragmentPlan.LOG_TAG, "Auth Success!");
}

@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    container.removeView(((android.view.View) (object)));
}

private void makeExplosionSound(android.content.Context context) {
    if ((mp) != null) {
        mp.stop();
        mp.release();
    }
    mp = android.media.MediaPlayer.create(context, R.raw.torpedo);
    mp.start();
}

public void setDefaultHeadAndFoot() {
    setHeaderView(mLayoutInflater.inflate(R.layout.layout_google_header, mSwipe, false));
    setFooterView(mLayoutInflater.inflate(R.layout.layout_google_footer, mSwipe, false));
}

public void changeFragment(android.support.v4.app.Fragment destinationFragment) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fragment_container, destinationFragment);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(intent, flags, startId);
    fireEvent(com.tenforwardconsulting.cordova.bgloc.BackgroundGpsPlugin.Event.MESSAGE, "StartBackGroundActivity");
    return START_REDELIVER_INTENT;
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
    this.hideViewLoading();
    this.showErrorMessage(new org.mythtv.android.domain.exception.DefaultErrorBundle(new java.lang.Exception(e)));
    this.showViewRetry();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int i) {
    dialog.cancel();
    noPlayerAnsweredCorrectly();
}

@java.lang.Override
public void onClick(android.view.View v) {
    SendGoods();
}

static boolean isFragment(java.lang.Class clazz) {
    return android.support.v4.app.Fragment.class.isAssignableFrom(clazz);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_main, container, false);
    butterknife.ButterKnife.bind(this, view);
    return view;
}

private boolean requestFocus() {
    int result = mAudioManager.requestAudioFocus(this, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
    if (result == (android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED)) {
        return true;
    }else {
        return false;
    }
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    playMedia();
}

@java.lang.Override
protected void onClick(android.content.Context context) {
    if ((fileType) != (com.frostwire.android.core.Constants.FILE_TYPE_RINGTONES)) {
        com.frostwire.android.gui.util.UIUtils.openFile(context, path, mime, true);
    }else {
        com.andrew.apollo.utils.MusicUtils.playSimple(path);
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    pauseMedia();
}

private void createQR() {
    android.graphics.Bitmap b = getQRBitmap();
    if (b != null) {
        co.celloscope.printingdemo.FileHelper.saveBitmapFileToExternalCacheDirectory(this, b, "qr.png");
    }
}

private void launchDialogsListFragment() {
    android.util.Log.d("MainActivity", "launchDialogsListFragment()");
    setCurrentFragment(com.quickblox.q_municate.ui.fragments.chats.DialogsListFragment.newInstance(), true);
}

@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN)) || (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_UP))) {
        return true;
    }
    return super.onKeyUp(keyCode, event);
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    android.util.Log.i("info", ((client.finalUrl) + errorResponse));
}

public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mUserIngredients = savedInstanceState.getStringArrayList("userIngredients");
    userInput.setText(savedInstanceState.getString("userInput"));
}

public void setStateRevealed() {
    if (changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_REVEALED)) {
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
    }
}

public void playSound(java.lang.String soundPath, android.media.MediaPlayer.OnCompletionListener playAllListener) {
    playSound(soundPath, playAllListener, null);
}

public void stop() {
    if (mRunning) {
        android.util.Log.i(ch.logixisland.anuto.game.GameEngine.TAG, "Stopping game loop");
        mRunning = false;
    }
}

@java.lang.Override
public void onCancelled(com.firebase.client.FirebaseError firebaseError) {
}

@java.lang.Override
public void setLocation(de.fau.cs.mad.wanthavers.common.Location location) {
    mFilterSettingFragBinding.setLocation(location);
    wanthavers.mad.cs.fau.de.wanthavers_android.baseclasses.WantHaversApplication.setLocation(location, getActivity().getApplicationContext());
    showLocationInView();
}

@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(me.ryanmiles.mysummoner.events.ExceptionHandle e) {
    timber.log.Timber.i(java.lang.String.valueOf(e));
    android.widget.Toast.makeText(this, e.getErrorString(), Toast.LENGTH_LONG).show();
}

public static boolean isRetryable(@android.support.annotation.NonNull
org.wikipedia.util.ThrowableUtil.AppError e) {
    return !(((e.getDetail()) != null) && (e.getDetail().contains("404")));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setTheme();
    setContentView(R.layout.activity_confirm_appointment);
    init();
    setUpRecyclerView();
}

public void apply() {
    net.gini.android.vision.internal.camera.photo.PhotoEdit.applyChanges(mPhotoModifiers);
    mPhotoModifiers = null;
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((adapter.getmOnItemChildLongClickListener()) != null) {
        adapter.getmOnItemChildLongClickListener().onItemChildLongClick(adapter, v, getClickPosition());
    }
    return false;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable p1) {
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new com.github.hintofbasil.hodl.settings.SettingsFragment()).commit();
}

private static void insertNut(android.content.ContentResolver contentResolver, com.izettle.wrench.core.Nut nut) {
    contentResolver.insert(com.izettle.wrench.core.ConfigProviderContract.nutUri(), nut.toContentValues());
}

@java.lang.Override
public moneytracker2017.loftschool.com.loftschoolmoneytrackerjune17.ItemsAdapter.ItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new moneytracker2017.loftschool.com.loftschoolmoneytrackerjune17.ItemsAdapter.ItemViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
}

@java.lang.SuppressWarnings(value = "unused")
java.lang.String[] listServices() {
    android.os.IBinder sspBinder = me.ycdev.android.lib.common.internalapi.android.os.ServiceManagerIA.getService(mSspName);
    me.ycdev.android.lib.ssproxy.proxy.ISysServiceProxy sspService = me.ycdev.android.lib.ssproxy.proxy.SysServiceProxyNative.asInterface(sspBinder);
    if (sspService != null) {
        return sspService.listServices();
    }
    return null;
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((view) == null)
        view = inflater.inflate(R.layout.opinions_fragment, container, false);
    
    initializeUI(view);
    return view;
}

public void open() {
    db = desDBHelper.getWritableDatabase();
    isOpen = true;
    android.util.Log.i(net.deschulz.desdatabase0.DesDBManager.DEBUG_TAG, "desDBHelper opened");
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mEventClickListener) != null) {
        mEventClickListener.onEventViewClick(v, this, mEvent);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getContext(), "open camera", Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
    startActivityForResult(intent, unical.master.computerscience.yellit.graphic.Activities.SignUpActivity.TAKE_PICTURE);
}

@java.lang.Override
public boolean onShowCustomView(android.view.View view, int requestedOrientation, android.webkit.WebChromeClient.CustomViewCallback callback) {
    return onShowCustomView(view, callback);
}

public void onTick(long millisUntilFinished) {
    broadcastToUI(millisUntilFinished);
}

private void setupViewPager() {
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewPager)));
    viewPagerAdapter = new sneer.android.ui.ConvoActivityWithTabs.ViewPagerAdapter();
    viewPager.setAdapter(viewPagerAdapter);
}

@java.lang.Override
public void onError(com.facebook.FacebookException e) {
    android.util.Log.i("Error", "Error");
}

@java.lang.Override
public void onClick(android.view.View v) {
    updateQuestion();
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    new com.antest1.kcanotify.SettingActivity.getKcaStart2Data(getActivity()).execute();
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    presenter.onClickDelete(originalURL);
}

@java.lang.Override
public void onError(com.google.android.gms.common.api.Status status) {
}

public void loadInitialData() {
    org.hisp.dhis.android.sdk.controllers.DhisService.loadInitialData(this);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (mEnabled) {
        setState(getNextState(), true);
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    com.android.EvtSpinner theSpinner = ((com.android.EvtSpinner) (mRootView.findViewById(R.id.spinner_didSomething)));
    theSpinner.setOnTouchListener(null);
    theSpinner.setOnItemSelectedListener(null);
}

@java.lang.Override
public boolean onBackPressed() {
    if ((bottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }
    return true;
}

private int getNumOfPoints() {
    if (!(isAdded())) {
        return 0;
    }
    if (org.wordpress.android.ui.stats.StatsUIHelper.shouldLoadMoreBars()) {
        return 10;
    }else {
        return 7;
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    scanIntegrator.initiateScan();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mTeleField.isShown())) {
        mTeleField.setVisibility(View.VISIBLE);
    }else {
        mTeleField.setVisibility(View.GONE);
    }
}

public void toastError(java.lang.String error) {
    android.util.Log.e("MPissue", error);
}

public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent();
    i.setClass(this, utc_4910.screenActivities.LoginActivity.class);
    startActivity(i);
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem menuItem) {
    filteredSearch = true;
    showSearchFilterDialog();
    return false;
}

@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    if (position < (com.podraza.android.gaogao.gaogao.MainActivity.todos.size())) {
        return com.podraza.android.gaogao.gaogao.MainActivity.todos.get(position).getName();
    }else
        return null;
    
}

public void addStatusFilter(int statusFilter) {
    statusFilters.add(statusFilter);
}

private void startCamera() {
    android.content.Intent intentCamera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(intentCamera, wwckl.projectmiki.activity.MainActivity.REQUEST_TAKE_PICTURE);
}

public void run() {
    android.bluetooth.BluetoothSocket cSocket = null;
    try {
        cSocket = mmSSocket.accept();
    } catch (java.io.IOException e) {
        return ;
    }
    onConnected(cSocket);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.i(LOG_TAG, ((getId()) + ".onCreate()"));
    super.onCreate(savedInstanceState);
}

public static void startSwipeActivity(android.app.Activity activity, android.content.Intent intent) {
    com.github.bluzwong.swipeback.SwipeBackActivityHelper.startSwipeActivity(activity, intent, false, false, false);
}

@java.lang.Override
public void setOrientation(int orientation) {
    super.setOrientation(orientation);
}

public void registerNetworkReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    registerReceiver(mNetworkStateReceiver, filter);
}

