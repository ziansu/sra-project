@java.lang.Override
public void onClick(android.view.View v) {
    ((com.skyweather.MainActivity) (getActivity())).jumpToPage(1);
}

@java.lang.Override
public void run() {
    bannerAd.setVisibility(View.VISIBLE);
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    bannerAd.loadAd(adRequest);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    float value = minYaw + (progress * stepYaw);
    CurrentYawSpeed.setText(java.lang.Float.toString(value));
}

public void onclickKeep1(android.view.View view) {
    int num = 1;
    its.farkel.MainFarkel.hand.removeDie(num);
    view.setVisibility(ImageView.INVISIBLE);
    its.farkel.MainFarkel.available[num] = true;
}

public com.danimahardhika.cafebar.CafeBar.Builder customView(@android.support.annotation.Nullable
android.view.View customView) {
    return customView(customView, false);
}

public static void chooseBeautifulMapProvider(android.content.Context context, org.osmdroid.views.MapView map) {
    org.osmdroid.tileprovider.tilesource.MapBoxTileSource tileSource = new org.osmdroid.tileprovider.tilesource.MapBoxTileSource(context);
    map.setTilesScaledToDpi(true);
    tileSource.setMapboxMapid("mapbox.emerald");
    map.setTileSource(tileSource);
}

private void initializeLeakDetection() {
    com.squareup.leakcanary.LeakCanary.install(this);
}

@java.lang.Override
public void onCreate() {
}

@java.lang.Override
public final void onCreate() {
    android.util.Log.d(org.fraunhofer.cese.madcap.services.OnBootService.TAG, "onCreate Boot Service");
    android.content.Intent intent = new android.content.Intent(this, org.fraunhofer.cese.madcap.services.LoginService.class);
    startService(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_page);
    setUpWidgetsOnHomePage();
    longLatGrabber = new android.location.Geocoder(this);
    watchForLocationTextToChange();
    handlelocationButtonClick();
    handleSearchButtonPressed();
}

private com.google.android.gms.common.api.GoogleApiClient createGoogleApiClient() {
    googleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addApi(Places.GEO_DATA_API).addApi(Places.PLACE_DETECTION_API).build();
    connectGoogleApiClient();
    return googleApiClient;
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.pravallika.multiplealarms.beans.SpecialDaysReminder currentSpecialDaysReminder = extractCurrentSplReminder();
    if (null == currentSpecialDaysReminder) {
        return ;
    }
    saveSplRemToDB(currentSpecialDaysReminder);
    setNotificationForReminder(currentSpecialDaysReminder);
    finish();
}

@org.greenrobot.eventbus.Subscribe
public void onEvent(org.openbmap.events.onServiceShutdown event) {
    this.finish();
}

@android.support.annotation.NonNull
public abstract TMessage parse(@android.support.annotation.NonNull
final byte[] data) throws java.io.IOException;

@java.lang.Override
public void onClick(android.view.View view) {
    dbHandler.deleteHomework(java.lang.Integer.parseInt(dbHandler.getHomework()[position][4]));
    dismiss();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
}

@org.mozilla.gecko.annotation.ReflectionTarget
public static synchronized void onCreate(android.content.Context context) {
    if ((org.mozilla.gecko.push.PushService.sInstance) != null) {
        return ;
    }
    org.mozilla.gecko.push.PushService.sInstance = new org.mozilla.gecko.push.PushService(context);
    org.mozilla.gecko.push.PushService.sInstance.registerGeckoEventListener();
    org.mozilla.gecko.push.PushService.sInstance.onStartup();
}

public void btnAddOnClick(android.view.View view) {
    android.content.Intent resultIntent = new android.content.Intent();
    resultIntent.putExtra(BuildDeckActivity.CARD_ID, "bil125");
    setResult(manningk.bettercurve.RESULT_OK, resultIntent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    getFlow().set(new com.example.testapp.feed.FeedScreen(userName.getText().toString()));
}

public android.content.SyncRequest.Builder setRequiresCharging(boolean requiresCharging) {
    mRequiresCharging = requiresCharging;
    return this;
}

private void rebootRecoveryWithCommand(java.lang.String command) {
    try {
        mService.rebootRecoveryWithCommand(command);
    } catch (android.os.RemoteException ignored) {
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    folderInterface.openFolder(((com.example.abhilashmirji.virtualfileexplorer.FolderObject) (v.getTag())));
}

@com.facebook.react.bridge.ReactMethod
@javax.annotation.Nullable
public java.lang.Object variationForKey(@android.support.annotation.NonNull
java.lang.String key, @javax.annotation.Nullable
com.facebook.react.bridge.Callback callback) {
    java.lang.Object obj;
    obj = com.vwo.mobile.VWO.getVariationForKey(key);
    if (callback != null) {
        callback.invoke(null, obj);
    }
    return obj;
}

public void hideKeypad() {
    if ((m_editTextHandle) != null) {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (_context.getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(m_editTextHandle.getWindowToken(), 0);
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    rxBus.post(new com.safframework.study.rxbus3.domain.TestBackPressEvent());
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.infiniteshield.main.Shield.toggle(this);
}

public void init(android.content.Context context) {
    model = new com.example.tiferet.rebook.Model.ModelParse();
    model.init(context);
}

public synchronized android.content.Intent getSavedIntent() {
    return savedIntents[0];
}

@java.lang.Override
public void onClick(android.view.View v) {
    runGame(position);
}

public static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send, java.lang.String tag) {
    com.binarapps.android.cookielogger.AppContext.initialize(context, send, tag);
}

@java.lang.Override
public void handleGrip(int pointerIndex, int pointerId, android.view.MotionEvent ev) {
    x = ev.getX(pointerIndex);
    contentLeftFixed = contentLeftCurrent;
    velocityTracker = android.view.VelocityTracker.obtain();
    velocityTracker.addMovement(ev);
}

@java.lang.Override
protected void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) {
    mCallback.onInsertComplete();
    mCallback = null;
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    com.alexshtf.offlinenavigator.MapsDb.removeAnchor(mapsDbOpenHelper, mapId, com.alexshtf.offlinenavigator.AnchorsManager.pointOnImageOf(anchorView));
    anchorsManager.removeAnchor(anchorView);
    return true;
}

java.util.List<com.modelingbrain.home.model.Model> update(android.content.Context context, android.database.sqlite.SQLiteDatabase db);

@java.lang.Override
public void run() {
    mAdapter = new com.nathanromike.yes_you_can.adapters.GuideListAdapter(getContext(), mGuides);
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(getContext());
    mRecyclerView.setAdapter(mAdapter);
    mRecyclerView.setLayoutManager(layoutManager);
}

public com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfo copyWithPeriodIndex(int periodIndex) {
    com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfo playbackInfo = new com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfo(periodIndex, startPositionUs);
    playbackInfo.positionUs = positionUs;
    playbackInfo.bufferedPositionUs = bufferedPositionUs;
    playbackInfo.videoPositionUs = videoPositionUs;
    return playbackInfo;
}

public void createNew() {
    interview = new de.udk.drl.mazirecorderandroid.models.InterviewModel();
}

public void setNextView(android.view.View view) {
    mNextView = view;
}

@java.lang.Override
public void onDismiss() {
    java.lang.String atts = refreshList(finalItemIDs);
    new edu.gatech.cs4911.mintyfresh.HomeScreenActivity.ConnectToDB(current).execute(cl, atts);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    savedInstanceState.putInt(com.bignerdranch.android.geoquiz.QuizActivity.KEY_INDEX, mCurrentIndex);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    showItem(arg2);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    progress.dismiss();
    lon = location.getLongitude();
    lat = location.getLatitude();
    if ((reset) == false)
        findAddress();
    
}

public void onClick(android.view.View view) {
    happyBabyRequest.startRequest();
    android.util.Log.e("back", "back");
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    getLinRoot().setVisibility(View.GONE);
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.naman14.timber.permissions.Nammu.askForPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE, permissionReadstorageCallback);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((maximFeedListener) != null) {
        maximFeedListener.onLongClick(maxim);
    }
    return true;
}

@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
}

@java.lang.Override
public void onScroll(float v) {
    pager.requestDisallowInterceptTouchEvent(true);
    cardIssueAdapter.setFirstCardState(v);
}

public static java.lang.String buildURL() {
    java.lang.String baseUrl = appaloosa_store.com.appaloosa_android_tools.utils.UrlUtils.getServerBaseUrl();
    return baseUrl + (appaloosa_store.com.appaloosa_android_tools.tools.services.blacklist.BlacklistUrlUtils.buildParams());
}

@java.lang.Override
public int compareTo(de.blau.android.util.IndexSearchResult arg0) {
    if ((arg0.count) > (count)) {
        return -1;
    }else
        if ((arg0.count) < (count)) {
            return +1;
        }
    
    return 0;
}

@java.lang.Override
public void onRouteUnselected(android.support.v7.media.MediaRouter router, android.support.v7.media.MediaRouter.RouteInfo info) {
    com.fwgg8547.mycast.Lg.i(com.fwgg8547.mycast.MainActivity.TAG, ("onRouteUnselected: info=" + info));
    mSelectedDevice = null;
    mCastClientListener = null;
    mSlideshow.finalize();
}

@java.lang.Override
public void run() {
    android.util.Log.e("ProfileFragment", e.getMessage());
    e.printStackTrace();
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    return getOnItemLongClickListener().onItemLongClick(this, v, ((baseViewHolder.getLayoutPosition()) - (getHeaderLayoutCount())));
}

@java.lang.Override
public boolean onFling(android.view.MotionEvent e1, android.view.MotionEvent e2, float velocityX, float velocityY) {
    this.onFling(velocityX);
    return super.onFling(e1, e2, velocityX, velocityY);
}

public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    startService(new android.content.Intent(this, ru.mityaresh.cadromonitor.MyService.class));
    finish();
}

public void cancel(android.view.View view) {
    setResult(ph.intrepidstream.callmanager.ui.RESULT_CANCELED);
    finish();
}

private void pause(android.widget.ImageButton playButton) {
    mPlaying = false;
    playButton.setImageResource(android.R.drawable.ic_media_play);
    if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
        mMediaPlayer.pause();
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.chat_menu, menu);
    return true;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.letslunch.agileteam8.letslunch.homePage.eatingStatus userStatus = com.letslunch.agileteam8.letslunch.homePage.eatingStatus.BRING_LUNCH;
    dialog.dismiss();
    userResponseToEating(userStatus.toString());
}

@butterknife.OnClick(value = R.id.hourlybutton)
public void startHourlyActivity(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.moockpanel.weatherpanel.UI.HourlyForecastActivity.class);
    intent.putExtra(com.moockpanel.weatherpanel.UI.MainActivity.HOURLY_FORECAST, mForecast.getHourlyForecast());
    startActivity(intent);
}

private void updateUI() {
    mAdapter = new com.oestjacobsen.android.get2gether.view.groups.SelectedGroupMembersFragment.MembersAdapter(mMembersList);
    mRecyclerView.setAdapter(mAdapter);
}

public void pauseMenu(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.Popupmenu.class);
    pausestuff();
    startActivity(intent);
}

@java.lang.Override
public void onStartDrag(android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
    mItemTouchHelper.startDrag(viewHolder);
}

@java.lang.Override
public void onClick(android.view.View view) {
    showAlert(getString(R.string.help), getText(R.string.what_is_school_domain));
}

@java.lang.Override
public boolean onSelection(com.afollestad.materialdialogs.MaterialDialog dialog, android.view.View view, int which, java.lang.CharSequence text) {
    mes_selecionado = which;
    atualizarMes();
    showListView();
    return true;
}

public void decrement() {
    android.util.Log.d("CounterFrag", "Decremented Count");
    --(count);
    updateFieldFromCount();
}

protected void resumeRealm() {
    myRealm = io.realm.Realm.getDefaultInstance();
    android.util.Log.d(com.zhan.budget.Fragment.BaseRealmFragment.TAG, "----- RESUME REALM -----");
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (((predicate) == null) || (predicate.test(context, intent))) {
        loader.onContentChanged();
    }
}

public void addView(android.view.View imgView, android.view.View iconView) {
    addView(imgView);
    addView(iconView);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
}

@java.lang.Override
protected void handleClick() {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_POWERMENU);
    mContext.sendBroadcast(intent);
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.forecastfragment, menu);
}

@java.lang.Override
public void onPlanClicked(com.spadatech.mobile.android.foodframer.models.Plan plan) {
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    float value = ((progress * stepAgl) * 30) / 52;
    CurrentAngle.setText(java.lang.Float.toString(value));
}

@java.lang.Override
public void cellForItem(com.huterpu.baserecyclerview.BaseRecyclerView parent, android.view.ViewGroup container, int position) {
    if ((mDelegate) != null)
        mDelegate.cellForItem(parent, container, position);
    
}

void onItemClick(int position);

@java.lang.Override
public void onItemClick(java.lang.String id) {
    android.content.Intent i = new android.content.Intent();
    i.setClass(getActivity(), edu.mobapde.bloodnet.MyPledgeActivity.class);
    i.putExtra("id", id);
    startActivity(i);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (mIsPlaying) {
        mIsPlaying = false;
        mPlayerControl.setImageResource(R.drawable.ic_play_arrow_24dp);
    }
}

public com.google.android.gms.tasks.Task<java.lang.Void> send(android.content.Context context) {
    try {
        return project.sherpa.utilities.FirebaseProviderUtils.insertOrUpdateModel(this);
    } finally {
        project.sherpa.utilities.ContentProviderUtils.insertModel(context, this);
    }
}

private void Warning() {
    new com.afollestad.materialdialogs.MaterialDialog.Builder(this).title(R.string.warning).content(R.string.no_data).iconAttr(android.R.attr.alertDialogIcon).positiveText(android.R.string.yes).show();
}

@java.lang.Override
public android.content.Loader<java.util.ArrayList<com.abigailmathews.bookworm.Book>> onCreateLoader(int id, android.os.Bundle args) {
    return new com.abigailmathews.bookworm.BookLoader(this, query);
}

@java.lang.Override
public com.smilehacker.sample.Item0Component.ViewHolder getViewHolder(android.view.ViewGroup container) {
    android.view.View view = mLayoutInflater.inflate(R.layout.item_v0, container, false);
    return new com.smilehacker.sample.Item0Component.ViewHolder(view);
}

@java.lang.Override
public void onClick(android.view.View v) {
    setDeleteMode(true);
}

@java.lang.Override
public void onAttachFragment(com.google.android.apps.dashclock.configuration.Fragment fragment) {
    if (fragment instanceof com.google.android.apps.dashclock.configuration.BaseSettingsActivity.ExtensionPreferenceFragment) {
        mFragment = ((com.google.android.apps.dashclock.configuration.BaseSettingsActivity.ExtensionPreferenceFragment) (fragment));
    }
}

@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    super.onCreateActionMode(mode, menu);
    mode.setTitle(R.string.menu_item_reportEditAccount);
    return true;
}

private void initRecyclerView(android.support.v7.widget.RecyclerView recyclerView) {
    observerList.add(recyclerView);
    recyclerView.addOnScrollListener(new ninja.poepoe.library.ScrollListener(observerList, false));
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    myView = inflater.inflate(R.layout.first_layout, container, false);
    return myView;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    loadStopForecast(redLineSpinnerStop.getItemAtPosition(position).toString());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

public void populateSpinner(org.hisp.dhis2.android.sdk.utils.ui.views.CardSpinner spinner, java.util.List<java.lang.String> list) {
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(getActivity(), R.layout.spinner_item, list);
    spinner.setAdapter(adapter);
}

@java.lang.Override
public boolean onFail(int statusCode, @android.support.annotation.Nullable
T failDate, @android.support.annotation.Nullable
java.lang.Throwable error) {
    return ((mResponseCallback) != null) && (mResponseCallback.onFail(statusCode, failDate, error));
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    if (!(fromNotification)) {
        android.os.Bundle returnBundle = new android.os.Bundle();
        playTrackResultReceiver.send(com.dnbitstudio.spotifystreamer.services.PlayTrackService.NOTIFY_MP_PREPARED, returnBundle);
    }
    createNotification(false);
    mediaPlayer.start();
}

protected void onPostExecute(java.lang.Boolean t) {
    android.util.Log.d("gh", "hgh");
    pdia.dismiss();
    sendBarcodeToActivity(codeContent, t);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onServiceDisconnected() {
    mTransferService = null;
}

public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.navigation, menu);
    return true;
}

private void showSmsToast(com.unifyx.messagelistener.Sms sms) {
    android.widget.Toast.makeText(this, sms.toString(), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
}

