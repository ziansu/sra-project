@java.lang.Override
public com.example.android.bakingapp.Adapters.RecipeAdapter.RecipeViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = mInflater.inflate(R.layout.recipe_item, null);
    return new com.example.android.bakingapp.Adapters.RecipeAdapter.RecipeViewHolder(view);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    if (b) {
        com.project.nghicv.readingbook.util.NotificationUtil.scheduleNotification(getActivity());
    }else {
        com.project.nghicv.readingbook.util.NotificationUtil.clearNotification();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    uploadImage(imageView);
}

private void doAnimation(float startAt, float endAt) {
    android.view.animation.TranslateAnimation animate = new android.view.animation.TranslateAnimation(startAt, endAt, 0, 0);
    animate.setDuration(100);
    animate.setFillAfter(true);
    this.holder.item.startAnimation(animate);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.add :
            {
                setDate();
            }
            break;
    }
    return true;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mCurrentPhotoLarge) != null)
        outState.putParcelable(sk.momosi.fuelapp.activities.AddCarActivity.PHOTO, mCurrentPhotoLarge);
    
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    toast_canel.show();
    dialogInterface.cancel();
    dialog_builder.show();
}

@java.lang.Override
public void run() {
    (index)++;
    getData(index);
    android.util.Log.d("test", "load more completed");
    isLoading = false;
}

public long getSavedArticles(android.content.Context context) {
    return getSavedArticles(context, (-1));
}

@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    android.util.Log.d("MovieListActivity", "Search Text Change");
    onQueryTextSubmit(s);
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((co.megaterios.shoppingcarttest.ui.adapter.ShoppingCartRecyclerViewAdapter.AdapterShoppingCartInteractionListener) (context)).onDeleteProduct(boundOrderProduct.getId());
}

protected synchronized void buildGoogleApiClient() {
    if ((mGoogleApiClient) == null) {
        mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this.getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants.setUserAgentValue(BuildConfig.APPLICATION_ID);
    sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, de.huk_coburg.tdp.activities.GalleryActivity.class);
    startActivityForResult(intent, CallbackID.EXT_IMAGE);
}

@java.lang.Override
@android.support.annotation.CallSuper
public void attachView(@android.support.annotation.NonNull
V view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    mView = view;
    restoreInstanceState(savedInstanceState);
    addObservables();
}

@java.lang.Override
public android.support.v4.content.Loader<ru.codingworkshop.gymm.data.model.ProgramTraining> onCreateLoader(int id, android.os.Bundle args) {
    return new ru.codingworkshop.gymm.program.activity.training.TrainingAsyncLoader(this, id, args);
}

@java.lang.Override
public void onPause() {
    if (mediaManager.isStateOneOf(MediaState.STARTED, MediaState.PAUSED, MediaState.PLAYBACK_COMPLETED)) {
        mediaManager.pause();
    }
}

public void startActivity(android.view.View view) {
}

public void updatePosts(android.support.v7.widget.RecyclerView.Adapter adapterToNotify) {
    com.theratio.utilities.Post.updatePostsByUserID(this.id, this.posts, adapterToNotify, true);
}

private boolean connexion2Client(com.smartmanageragent.smartagent.message.JSONMessage jsmessage, java.lang.String ipAd) {
    android.os.Handler clientHandler = new android.os.Handler();
    com.smartmanageragent.exteriorcomm.ClientConnection clientConnection = new com.smartmanageragent.exteriorcomm.ClientConnection(ipAd, com.smartmanageragent.exteriorcomm.CommunicationService.portNumber, clientHandler, jsmessage);
    return clientConnection.connection();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.pschuette.android.calendarlibrary.ExtendedCalendarView calendarView = new com.pschuette.android.calendarlibrary.ExtendedCalendarView(this, this);
    com.pschuette.android.calendarlibrary.CalendarSyncStateView syncStateView = new com.pschuette.android.calendarlibrary.CalendarSyncStateView(this, this);
    setContentView(calendarView);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    handleNewLocation(location);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    enableBluetooth();
    setupActionBar();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    ((io.locative.app.LocativeApplication) (getApplication())).inject(this);
}

@java.lang.Override
public android.os.IInterface createInterface() {
    android.os.IBinder binder = ServiceManager.getService.call(Context.MEDIA_ROUTER_SERVICE);
    if ((IMediaRouterService.Stub.asInterface) != null) {
        return IMediaRouterService.Stub.asInterface.call(binder);
    }
    return null;
}

private static synchronized okhttp3.Cache getCache(android.content.Context application) {
    if ((org.gem.indo.dooit.api.managers.DooitManager.cache) == null) {
        org.gem.indo.dooit.api.managers.DooitManager.cache = new okhttp3.Cache(application.getCacheDir(), ((10 * 1024) * 1024));
    }
    return org.gem.indo.dooit.api.managers.DooitManager.cache;
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    swipeRefreshLayout.setRefreshing(false);
    swipeRefreshLayout.setEnabled(false);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mPresenter = new com.abhinav.keepsafe.login.LoginPresenter(this);
    return inflater.inflate(R.layout.fragment_login, container, false);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    getActivity().setTitle(R.string.crimes_title);
    mSubtitleVisible = false;
}

public final void setResult(com.shkil.android.util.Result<V> result) {
    fireResult(result);
}

protected void onPostExecute(java.lang.String file_url) {
    if (file_url != null) {
        android.widget.Toast.makeText(this, file_url, Toast.LENGTH_LONG).show();
    }
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.d("DEBUG_TAG", "On Longpress OscMode Event!");
    mOscilloscopeFragmentController.butOscModeOnLongPress();
    super.onLongPress(e);
}

public static void test_061() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/name");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    inputSomeCode();
    return false;
}

@kr.co.namee.permissiongen.PermissionSuccess(requestCode = com.awen.photo.photopick.ui.PhotoPickActivity.REQUEST_CODE_PERMISSION_CAMERA)
private void selectPicFromCameraSuccess() {
    android.util.Log.e(TAG, "selectPicFromCameraSuccess");
    selectPicFromCamera();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.simplecity.amp_library.ui.fragments.WidgetFragment.newInstance(layouts[position]);
}

public void saveInstanceState(@android.support.annotation.NonNull
android.os.Bundle outState) {
    outState.putParcelableArrayList(com.proxerme.app.adapter.PagingAdapter.STATE_LIST, this.list);
}

@java.lang.Override
protected void prepareAnimateAdd(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    android.support.v4.view.ViewCompat.setTranslationX(holder.itemView, (+(mRecyclerView.getWidth())));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardUnsentFragment.TAG, "onCreate");
    super.onCreate(savedInstanceState);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_friends_list);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mActionListener.sendAmplitudeEvent(StaticConstants.CONTENT_NEW_REVIEW_LANDED, null, null);
    mActionListener.loadWriteReviewDialog();
}

public boolean encodeFrame(android.graphics.Bitmap bitmap, int delayMs) {
    if (0 == (instance)) {
        return false;
    }
    nativeEncodeFrame(instance, bitmap, delayMs);
    return true;
}

private void connectToDevice(android.bluetooth.BluetoothDevice device) {
    if ((mGatt) == null) {
        mGatt = device.connectGatt(getApplicationContext(), false, gattCallback);
        stopScan();
    }
}

@android.annotation.SuppressLint(value = "Assert")
void release() {
    assert (mProcessingThread.getState()) == (java.lang.Thread.State.TERMINATED);
    if ((mDetector) != null) {
        mDetector.release();
        mDetector = null;
    }
}

public static android.content.SharedPreferences getSharedPreferences(@android.support.annotation.NonNull
final android.content.Context context) {
    return context.getSharedPreferences(io.soramitsu.iroha.IrohaApplication.SHARED_PREF_FILE, io.soramitsu.iroha.MODE_PRIVATE);
}

public static android.content.Intent makeIntent(android.content.Context context) {
    return new android.content.Intent(context, vandy.mooc.services.DownloadImagesBoundService.class);
}

@java.lang.Override
public void onDestroy() {
    stopService(new android.content.Intent(this, edu.umt.csci427.canary.OpenICEService.class));
    super.onDestroy();
}

public void zoomInOn(@android.support.annotation.NonNull
com.google.android.gms.maps.model.LatLng latLng) {
    mIgnoreCameraZoom = false;
    com.github.dstaflund.geomemorial.common.util.CameraUpdateStrategy.zoomTo(mMap, mVisibleMarkers, latLng);
}

public void onGetStarted(android.view.View view) {
    android.content.Intent getStarted = new android.content.Intent(this, com.example.corneeldenhartogh.corneel_pset2.FillWords.class);
    getStarted.putExtra("callingFillWords", getString(R.string.instruction_filler));
    startActivity(getStarted);
}

public boolean isLightOutOfBounds(int x, int y) {
    return (((x >= (com.captainhampton.android.lightsout.fragment.FragmentClassic.NUM_ROWS)) || (x < 0)) || (y >= (com.captainhampton.android.lightsout.fragment.FragmentClassic.NUM_COLS))) || (y < 0);
}

private void showProgressToast(int message) {
    if (this.showProgress) {
        int duration = android.widget.Toast.LENGTH_SHORT;
        android.widget.Toast toast = android.widget.Toast.makeText(context, message, duration);
        toast.show();
    }
}

public void start() {
    if ((mClient) == null) {
        android.util.Log.e(getClass().getName(), "locationclient can not be null before using is");
    }else {
        mClient.start();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    orderEntries.remove(position);
    notifyDataSetChanged();
}

@java.lang.Override
protected void onStop() {
    super.onStop();
}

public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    alarmList.get((position - 1)).setState(isChecked);
}

@java.lang.Override
public void onTick(android.view.View view, long millisUntilFinished) {
    mCountDownTextView.setText(java.lang.String.valueOf((millisUntilFinished / 1000)));
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    android.util.Log.d("Preference changed", key);
    com.tomer.dtfc.Preferences.initialize(getApplicationContext());
    if (Preferences.enabled) {
        killBrodcastReciever();
        startBrodcastReciever();
    }else
        killBrodcastReciever();
    
}

@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    return com.xiaohong.codecode.adpter.MainViewPagerAdapter.fragmentTitle[position];
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.fathzer.android.keyboard.DecimalKeyboard mCustomKeyboard = new net.yapbam.android.keyboard.AutoHideDecimalKeyboard(this, R.id.keyboardview, R.xml.deckbd);
    mCustomKeyboard.registerEditText(R.id.amount);
    addItemsOnSpinner2();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.i(com.example.myapplication.ui.fragment.manager.PackageManagerFragment.TAG, "onDestroy: ");
    if ((actionMode) != null) {
        actionMode.finish();
        actionMode = null;
    }
}

public void show(android.support.v4.app.FragmentManager fragmentManager, @android.support.annotation.IdRes
int viewId) {
    fragmentManager.beginTransaction().replace(viewId, this).commit();
}

private void setUpRecyclerView() {
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    recyclerView.setItemAnimator(new android.support.v7.widget.DefaultItemAnimator());
    recyclerView.setAdapter(adapter);
}

@java.lang.Override
public void onClick(android.view.View v) {
    state = STATE_STOP;
    this.sendCommand("0");
}

@java.lang.Override
public void onClick(android.view.View view) {
    geofenceName.setError(null);
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.showSoftInput(geofenceName, InputMethodManager.SHOW_IMPLICIT);
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.os.Bundle args = getArguments();
    int id = args.getInt(com.michael.attackpoint.discussion.DiscussionFragment.DISCUSSION_ID);
    mPresenter = new com.michael.attackpoint.discussion.DiscussionPresenter(this, id);
}

public void onClick(android.view.View sender) {
    if ((mStartPos) == 0) {
        onPlay(mStartPos);
    }else {
        onPlay(mWaveformView.getmPlaybackPos());
    }
    togglePlayButton();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(text);
    parcel.writeString(id);
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    int action = e.getAction();
    switch (action) {
        case android.view.MotionEvent.ACTION_MOVE :
            rv.getParent().requestDisallowInterceptTouchEvent(true);
    }
    return false;
}

@java.lang.Override
public void onClick(android.view.View view) {
    button6.setText(((mark) + ""));
    placeMarkOnBoard(1, 2);
    button6.setEnabled(false);
    checkForWinOrDraw();
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    remove(position);
}

@java.lang.Override
public void onClick(android.view.View view) {
    addField();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    org.jdc.template.App.getInjectComponent(this).inject(this);
    setHasOptionsMenu(true);
    showIndividual();
}

@java.lang.Override
protected void onDestroy() {
    nativeFinalize();
    super.onDestroy();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.fragment_browse_peer_menu_filter :
            return true;
        case R.id.fragment_browse_peer_menu_checkbox :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void clearView(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
    viewBeingCleared = true;
    super.clearView(recyclerView, viewHolder);
}

@java.lang.Override
public void onStart() {
    super.onStart();
}

@java.lang.Override
public void filter(@android.support.annotation.Nullable
java.lang.String filter) {
    if ((adapter) != null) {
        this.filter = filter;
        adapter.filter(filter);
    }
}

@java.lang.Override
public void onUnexpectedError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.d(im.vector.activity.VectorMemberDetailsActivity.LOG_TAG, ("## mCreateDirectMessageCallBack: onUnexpectedError Msg=" + (e.getLocalizedMessage())));
    mRoomActionsListener.onUnexpectedError(e);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((step) == 2) {
        attempBack();
    }else {
    }
    overridePendingTransition(R.anim.activity_in_from_left, R.anim.activity_out_to_right);
}

@android.support.annotation.NonNull
@java.lang.Override
public java.security.PrivateKey getPrivateKey() {
    return null;
}

@java.lang.Override
public void onActivityResult(final int requestCode, final int resultCode, final android.content.Intent intent) {
    if (requestCode == (co.apptailor.googlesignin.RNGoogleSigninModule.RC_SIGN_IN)) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(intent);
        handleSignInResult(result, false);
    }
}

@java.lang.Override
public com.kosbrother.mongmongwoo.adpters.ShoppingCarGoodsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buy_goods, parent, false);
    return new com.kosbrother.mongmongwoo.adpters.ShoppingCarGoodsAdapter.ViewHolder(v);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            updateUI();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onSessionClosed(com.quickblox.videochat.webrtc.QBRTCSession session) {
    if (session.equals(currentSession)) {
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Stop session");
        addOpponentsFragmentWithDelay();
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Remove current session");
        currentSession = null;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    track_screenView();
}

@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putParcelable(com.cleveroad.pulltorefresh.firework.FireworkyPullToRefreshLayout.EXTRA_SUPER_STATE, super.onSaveInstanceState());
    bundle.putBoolean(com.cleveroad.pulltorefresh.firework.FireworkyPullToRefreshLayout.EXTRA_IS_REFRESHING, mIsRefreshing);
    return bundle;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mRightDrawerFriendContainer.setVisibility(View.VISIBLE);
    mRightDrawerFriendContainer.startAnimation(animScaleUp);
    mRightDrawerGroupContainer.setVisibility(View.GONE);
}

private com.google.android.gms.common.api.GoogleApiClient buildGoogleApiClient(com.google.android.gms.auth.api.signin.GoogleSignInOptions gso) {
    return new com.google.android.gms.common.api.GoogleApiClient.Builder(this).enableAutoManage(this, this).addApi(Auth.GOOGLE_SIGN_IN_API, gso).build();
}

public static double add(double x, double y) {
    return x + y;
}

private void toggle(boolean state) {
    timber.log.Timber.i("Sync: %s", (state ? "enable" : "disable"));
    android.content.ContentResolver.setMasterSyncAutomatically(state);
}

@java.lang.Override
public void onClick(android.view.View view) {
    nextAddestatePage(5);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.record);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.adnroid.pigknight.example.ui.Example.getInstance().switchChildUI(Example.CHILD_ID_PLAYING, false);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if ((end > 0) && ((mOnPushLoadMoreListener) != null)) {
        mLoadMore = true;
        mOnPushLoadMoreListener.onLoadMore();
    }else {
        mLoadMore = false;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mLogAccelerometerData) {
        mAccelerometerToggleButton.setText(R.string.start_accel_data);
        mLogAccelerometerData = false;
    }else {
        mAccelerometerToggleButton.setText(R.string.stop_accel_data);
        mLogAccelerometerData = true;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    sizeSetter.dismiss();
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.e(com.example.android.quakereport.EarthquakeActivity.LOG_TAG, "Earthquake Activity stopped");
}

@java.lang.Override
protected void onDestroy() {
    this.unregisterReceiver(finishActivity);
    android.util.Log.i(GLOBAL_TRACK_LOG, ((LOG_TAG_ACTIVITY) + "Stopped service"));
    super.onDestroy();
}

