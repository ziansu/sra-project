@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    context.sendBroadcast(io.github.mobodev.heartbeatfixerforgcm.HeartbeatReceiver.GTALK_HEART_BEAT_INTENT);
    context.sendBroadcast(io.github.mobodev.heartbeatfixerforgcm.HeartbeatReceiver.MCS_MCS_HEARTBEAT_INTENT);
    android.util.Log.d(io.github.mobodev.heartbeatfixerforgcm.HeartbeatFixerForGcmApp.TAG, "HeartbeatReceiver sent heartbeat request");
    io.github.mobodev.heartbeatfixerforgcm.HeartbeatFixerUtils.scheduleHeartbeatRequest(context);
}

public void searchByCategory(android.view.View v) {
    searchSpinner.getSelectedItem().toString();
    if ((category) != null) {
        new com.webwemser.letsmeetapp.MainActivity.SearchByCategoryAsync().execute();
    }
}

@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    mHostMediaPlayerManager.playMedia();
    setResult(response, DConnectMessage.RESULT_OK);
    return true;
}

@org.junit.Before
public void createSQLDBObject() {
    android.content.Context ctx = android.support.test.InstrumentationRegistry.getTargetContext();
    mDB1 = new com.example.boba.lookapplication.DB1(ctx, com.example.boba.lookapplication.TestSQLLiteDB.TEST_NAME_DB);
}

@java.lang.Override
public void init(android.os.Bundle savedInstanceState) {
    addSlide(com.github.paolorotolo.appintro.AppIntroFragment.newInstance("Lions", "Lion, lion everywhere!", R.drawable.ic_done_white_24px, R.color.colorAccent));
}

private void pushSpecies(java.lang.String speciesId, java.lang.String name, @android.support.annotation.Nullable
java.lang.String subname, int level) {
    subname = null;
    fragmentController.pushFragment(name, null, com.github.charmasaur.alpsinsects.ui.fragments.SpeciesItemDetailFragment.newInstance(speciesId), "SPECIES", level);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    listView = ((android.widget.ListView) (findViewById(R.id.tracking_list)));
    refreshList();
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    if (!(twoPane)) {
        inflater.inflate(R.menu.messgage_detail_menu, menu);
    }
    super.onCreateOptionsMenu(menu, inflater);
}

public static boolean confirmIntent(android.net.Uri uri, java.lang.String intent) {
    return uri.getPathSegments().get(1).equals(intent);
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    com.soctec.soctec.core.MainActivity main = ((com.soctec.soctec.core.MainActivity) (getActivity()));
    main.updateAchievementFragment();
}

@java.lang.Override
public void onClick(android.view.View v) {
    takePictureNoPreview(null);
}

@java.lang.Override
public void onClick(android.view.View view) {
    _originalList.remove(i);
    updateResults(_searchString);
    com.manoj.dlt.features.DeepLinkHistoryFeature.getInstance(_context).removeLinkFromHistory(deepLinkInfo.getDeepLink());
}

public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {
    ft.replace(R.id.fragment_container, fragment);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d(org.shreyans.greendot.fragments.CreateGoalFragment.TAG, "in CreateGoalFragment.onCreateView");
    return inflater.inflate(R.layout.fragment_create_goal, container);
}

public void setOnBackClickListener(android.view.View.OnClickListener listener) {
    titleBar.setOnClickListener(listener);
}

@java.lang.Override
public void onClick(android.view.View view) {
    button8.setText(((mark) + ""));
    placeMarkOnBoard(2, 1);
    button8.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}

public void checkMarkPressed(android.view.View v) {
    delayedStatus(500, "Liked", "#458B00");
    loadNextRecipe("Black Circle Recipe");
}

private void initFragments(android.os.Bundle savedInstanceState) {
    upcomingListFragment = new com.capstone.authorfollow.BookListFragment();
    upcomingListFragment.resetSearchBar();
    wishlistFragment = new com.capstone.authorfollow.WishlistFragment();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeValue(Nebdev);
    out.writeLong(DevId);
    out.writeValue(mBleGatt);
    out.writeValue(mDelegate);
    out.writeValue(mCtrlChar);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.borombo.mobileassignment.utils.LocationsManager.getInstance().delete(location);
    adapter.notifyItemRemoved(position);
    adapter.notifyDataSetChanged();
}

@java.lang.Override
public void onConfigured(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session) {
    onCaptureSessionConfigured(session, CameraDevice.TEMPLATE_PREVIEW);
    if ((mVideoRecorderStopped) != null) {
        mCurrentlyRecording = false;
        android.util.Log.d(com.dylankpowers.timelapse.TimeLapseCapture.TAG, "Video recorder stopped.");
        mVideoRecorderStopped.onEvent();
        mVideoRecorderStopped = null;
    }
}

android.net.Uri insertHistoryItem(java.lang.String url, java.lang.String guid, java.lang.Long lastVisited, java.lang.Integer visitCount) throws android.os.RemoteException {
    return insertHistoryItem(url, guid, java.lang.System.currentTimeMillis(), null, null);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.chteuchteu.lesjoiesdusysadmin.Activity_Gif.toggleTexts();
}

public void removeMyNoteView(android.view.ViewGroup parent) {
    boolean isMynoteTextEdit = isMyNoteViewShowing(parent);
    parent.setTag("");
    if (isMynoteTextEdit) {
        parent.removeView(myNoteText);
        mainActivity.unregisterForContextMenu(myNoteText);
    }
}

@java.lang.Override
public void onGetMessagesFailure(java.lang.String message) {
    android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    TicTacToeGame.sInfoColor = mInfoTextView.getTextColors();
    TicTacToeGame.sInfo = mInfoTextView.getText().toString();
    return ;
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar refocusSeekBar) {
    mHandler.removeMessages(com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.MSG_HIDE_DOF_VIEW);
    mDofView.setText(com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.DOFDATA[((mDepth) / 2)]);
    mDofView.setVisibility(View.VISIBLE);
}

void loadSites() {
    if (mIsTaskRunning) {
        org.wordpress.android.util.AppLog.w(AppLog.T.UTILS, "site picker > already loading sites");
    }else {
        new org.wordpress.android.ui.main.SitePickerAdapter.LoadSitesTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}

@java.lang.Override
public void onFailure(int i, java.lang.String s) {
    android.widget.Toast.makeText(mContext, ("图片下载失败" + s), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    return (mOnImageViewListener.onTouchEvent(event)) || (super.onTouchEvent(event));
}

public java.util.ArrayList<com.dozuki.ifixit.model.guide.GuideInfo> getAll() {
    android.util.Log.d("GuideCreateActivity", "Getall");
    return mGuides;
}

private void log(com.noveogroup.android.log.Logger.Level level, java.lang.String format, java.lang.Object arg1, java.lang.Object arg2) {
    logger.print(level, org.slf4j.helpers.MessageFormatter.format(format, arg1, arg2).getMessage(), null);
}

@java.lang.Override
public void onClick(android.view.View v) {
    operation.Connect(et_ip.getText().toString(), et_port.getText().toString());
    v.setClickable(false);
}

@java.lang.Override
public void onItemSelected() {
    recyclerViewItem.setScaleY(0.95F);
    canPullDown = false;
    android.util.Log.d("mmga", "canPullDownFalse");
}

public void sendSensorData(final long timestamp, final float value) {
    android.util.Log.i(edu.ucla.nesl.android.hrmonitor.DataMapClient.TAG, "In sendSensorData");
    executorService.submit(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            sendSensorDataInBackground(timestamp, value);
        }
    });
}

private void registerNetworkReceiver() {
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    filter.addAction(LocationManager.PROVIDERS_CHANGED_ACTION);
    registerReceiver(mNetworkStateReceiver, filter);
}

@java.lang.Override
public boolean onMenuItemActionExpand(android.view.MenuItem item) {
    android.util.Log.d("search", "search expanded");
    return true;
}

@java.lang.Override
protected void onSaveInstanceState(final android.os.Bundle outState) {
    outState.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
    super.onSaveInstanceState(outState);
    outState.putBoolean(com.egonzalez.simpleredditclient.view.MainActivity.SAVEDINSTANCESTATE_REQUESTDATA, mMustRequestData);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(context, com.ritwik.android.madfbla201415.AllEventsActivity.class);
    startActivity(intent);
}

private void navigateToNavigationActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.example.mobsoft.webkorhaz.ui.navigation.NavigationActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    closeFragment();
}

@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    android.net.Uri contactsQueryUri = DatabaseContract.ContactsContract.CONTENT_URI_CONTACTS;
    return new android.support.v4.content.CursorLoader(getActivity(), contactsQueryUri, projection, null, null, null);
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    android.util.Log.d("saas", "cancel");
    android.util.Log.w("Oye", "Failed to read value.", error.toException());
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    isCompleted = true;
    musicController.setImageResource(R.drawable.icon_play);
}

@java.lang.Override
protected void onPostExecute(java.util.List<com.example.davidberg.androidkurs.VasttrafikJourney> journeys) {
    updateJourneyList();
}

@java.lang.Override
public void forkSpecifiedCallLog(android.content.Context context, com.pioneer.aaron.dolly.fork.calllog.ForkCallLogData data) {
    if ((mForkBinder) != null) {
        mForkBinder.startFork(ForkTask.FORK_TYPE_SPECIFIED_CALLLOGS, data.getQuantity(), data);
        toastForkTask(context);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    registerCustomer();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_get_ip);
    io.github.hendraanggrian.circularrevealanimator.CircularRevealAnimator.of(this).onCreate(R.id.text);
}

public void addRequestToList(com.codepath.contact.models.Request request) {
    if ((requestsAdapter) != null)
        requestsAdapter.add(request);
    else
        android.util.Log.d(com.codepath.contact.fragments.ListFragment.TAG, "guess what, requestsAdapter is null...");
    
}

@java.lang.Override
public void done(com.parse.ParseException e) {
    android.util.Log.w("Yuval", "setAvatar() - in done");
    put(Const.COL_NAME_AVATAR, file);
    saveEventually();
}

public void onClick(android.view.View view) {
    if ((hours) == 12) {
        hours = 1;
    }else {
        ++(hours);
    }
    displayHours(hours);
}

public void setChannelInfoList(final java.util.List<com.meituan.android.walle.WalleConfig.ChannelInfo> channelInfosList) {
    this.channelInfoList = channelInfosList;
}

static android.graphics.drawable.Drawable setDrawableColor(android.graphics.drawable.Drawable icon, int color) {
    icon.setColorFilter(new android.graphics.PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
    return icon;
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.github.codetanzania.ui.activity.SettingsActivity.EDIT_PROFILE_REQUEST)) {
        updateUserProfile();
        mayChangeDefaultLanguage(data.getBooleanExtra(EditUserProfileActivity.FLAG_LANGUAGE_CHANGED, false));
    }
}

public com.raizlabs.android.dbflow.sql.language.Set<ModelClass> conditionQuery(com.raizlabs.android.dbflow.sql.builder.ConditionQueryBuilder<ModelClass> conditionQueryBuilder) {
    mConditionQueryBuilder = conditionQueryBuilder;
    return this;
}

@java.lang.Override
public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int width, int height) {
    com.aiyaapp.camera.sdk.base.Log.d("AnimE", "onSurfaceTextureSizeChanged");
    mEnv.surfaceChanged(null, 0, width, height);
}

@java.lang.Override
protected void onDestroy() {
    android.util.Log.v(LOG_TAG, "onDestroy()");
    super.onDestroy();
    com.example.shreekant.sunshine.app.ViewServer.get(this).removeWindow(this);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    if ((getCurrentOrientation()) == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
        getToolBar().setTitle("My Notes");
    }else {
    }
}

private void setupMap(android.os.Bundle savedInstanceState) {
    mapView.getMapAsync(this);
    mapView.onCreate(savedInstanceState);
}

@java.lang.Override
public void onTagDiscovered(android.nfc.Tag tag) {
    android.util.Log.i(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("onTagDiscovered " + tag));
    super.onTagDiscovered(tag);
    savedTag = tag;
    handleTag();
}

private void bindPreferenceSummaryToValue(android.preference.Preference preference) {
    preference.setOnPreferenceChangeListener(this);
    this.onPreferenceChange(preference, android.preference.PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), ""));
}

public void phoneLogin(android.view.View v) {
    if ((loginFramgent) != null)
        loginFramgent.phoneLogin(v);
    
}

public void smsRestore(android.view.View view) {
    try {
        com.mobilesafe.utils.SmsUtils.restoreSms(this);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.xmlpull.v1.XmlPullParserException e) {
        e.printStackTrace();
    }
}

public static android.support.v4.app.Fragment createGenericPlayerFragment(de.vanita5.twittnuker.model.ParcelableCardEntity card) {
    final java.lang.String playerUrl = card.getString("player_url");
    if (playerUrl == null)
        return null;
    
    return de.vanita5.twittnuker.fragment.support.card.CardBrowserFragment.show(playerUrl);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (!(mNavigationDrawerFragment.isDrawerOpen())) {
        getMenuInflater().inflate(R.menu.main, menu);
        restoreActionBar();
        return true;
    }
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public void run() {
    ((android.widget.ListView) (res.findViewById(R.id.settings_list))).setOnItemClickListener(listener);
    setAdapter();
    android.support.v7.widget.Toolbar toolbar = getActivity().findViewById(R.id.toolbar);
    us.dangeru.launcher.fragments.ThreadWatcherFragment.addOptions(toolbar);
}

@java.lang.Override
protected void updateView() {
    if (rebuildItems()) {
        android.util.Log.e(LOG_TAG, "Items are rebuilding, entering into Do Layout");
        measureLayout();
        doLayout(getWidth(), getHeight());
    }
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mAlarmAutoBegin.duration = (2 * position) + 1;
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("MyFormula", "onResume called");
    adapter.notifyDataSetChanged();
    android.util.Log.d("MyFormula", ("List count: " + (java.lang.Integer.toString(formulaList.size()))));
}

private void onCollectionClicked(java.lang.String collectionId) {
    android.content.Intent intent = new android.content.Intent(this, com.shopify.sample.activity.ProductListActivity.class);
    if (collectionId != null) {
        intent.putExtra(ProductListActivity.EXTRA_COLLECTION_ID, collectionId);
    }
    startActivity(intent);
}

public void onClick(android.view.View v) {
    initiatePopUp(((java.util.ArrayList) (finalList)), ((java.util.ArrayList) (finalIDList)), tv);
}

@java.lang.Override
public void onClick(android.view.View v) {
    textResponse.setText("lol");
}

public com.cube.storm.LanguageSettings.Builder localeUri(@android.support.annotation.Nullable
android.net.Uri localeUri) {
    this.localeUri = languageUri;
    return this;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    com.oneplus.base.Log.d(com.oneplus.camera.ui.PreviewGallery.ImageFragment.TAG, "onCreate");
    super.onCreate(savedInstanceState);
}

public static int v(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_VERBOSE) {
        return android.util.Log.v(tag, msg, tr);
    }
    return 0;
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    android.util.Log.d(TAG, "OnCreateOptionsMenu");
    inflater.inflate(R.menu.fragment_landing, menu);
}

@java.lang.Override
public void onItemClick(io.github.prashantsolanki3.snaplibrary.snap.layout.viewholder.SnapViewHolder viewHolder, android.view.View view, int position) {
    if ((isSelectionEnabled()) && (io.github.prashantsolanki3.snaplibrary.snap.utils.UtilsLayoutWrapper.isViewHolderSelectable(getLayoutWrappers(), ((io.github.prashantsolanki3.snaplibrary.snap.layout.viewholder.SnapSelectableViewHolder) (viewHolder))))) {
        toggleSelection(position);
    }
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((actionMode) == null) {
        actionMode = this.startActionMode(actionModeCallback);
        selectedMarker = marker;
    }
    return false;
}

@org.androidannotations.annotations.AfterViews
void afterViews() {
    com.google.android.gms.ads.AdView mAdView = ((com.google.android.gms.ads.AdView) (findViewById(R.id.adView)));
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    mAdView.loadAd(adRequest);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    undoPendingDismiss();
    performDismiss(downView, downPosition);
    mCallbacks.onViewSwiped(downPosition);
}

private void OnUserTripRetrievalFailure(java.lang.String message) {
    android.widget.Toast.makeText(getContext(), message, Toast.LENGTH_SHORT);
}

public java.lang.String getLabel() {
    android.util.Log.e(edu.byu.stringcheese.presenttime.recyclerviewresources.DashboardHeader.TAG, "Bad request of AbstractDashboardItem made!");
    return label;
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB_MR2)
public static void setAndroidThemeAccordingly13(android.app.Activity activity) {
    if (br.com.carlosrafaelgn.fplay.ui.UI.isAndroidThemeLight())
        activity.setTheme(android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen);
    else
        activity.setTheme(android.R.style.Theme_Holo_NoActionBar_Fullscreen);
    
}

private void sendReceivedDataToMulticastMessageReceivedHandler(android.os.Messenger handlerMessenger, java.net.DatagramPacket datagramPacket) throws android.os.RemoteException {
    android.os.Message handlerMessage = createHandlerMessage(getReceivedText(datagramPacket));
    handlerMessenger.send(handlerMessage);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        onItemClickListener.onRootFabClick();
        isOpen = !(isOpen);
        operateChildView(isOpen);
        android.util.Log.i("Tag", "click");
    }
}

android.util.Pair<java.util.List<net.oneread.aghanim.components.utility.IRecyclerItem>, java.lang.String> getHistory(int index) {
    return this.mPageHistory.get(index);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    edu.hm.cs.fs.app.App.getAppComponent(context).inject(this);
}

private void initViews() {
    mTweetAdapter = new com.thoughtworks.wechat.adapter.TweetAdapter(this);
    mTweetListView.setAdapter(mTweetAdapter);
    mHeaderView = android.view.LayoutInflater.from(this).inflate(R.layout.tweet_header, mTweetListView, false);
    mTweetListView.addHeaderView(mHeaderView);
}

@java.lang.Override
public void log(java.lang.String message) {
    android.util.Log.e("RetrofitLog", ("retrofitBack = " + message));
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.addressbook.thorrism.addressbook.DroidBook.getInstance().hideKeyboard(mCurrentEdit, getApplicationContext());
    mActivity.finish();
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    init();
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.e(com.example.sdp11.wmd.MainActivity.TAG, "onStart");
    mGoogleApiClient.connect();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (saveHighScore) {
        userName = input.getText().toString();
        saveHighScore(userName);
    }
    dialogIsDisplayed = false;
    startNewGame();
}

public static void initAndStart(java.lang.String serverAddr, java.lang.String userId, java.lang.String name, java.lang.String portraitUri, android.content.Context context, int queueId, java.lang.String ngsAddr) {
    com.elitecrm.rcclient.EliteChat.initAndStart(serverAddr, userId, name, portraitUri, context, queueId, ngsAddr, null);
}

@java.lang.Override
public void onError(java.lang.Throwable arg0) {
    android.util.Log.e(com.davidinchina.showcode.lightload.load.LightLoad.TAG, "img load failed");
    if (0 != defaultView) {
        imageView.setImageDrawable(mContext.getDrawable(defaultView));
        imageView.setTag(R.id.image_type, com.davidinchina.showcode.lightload.load.LightLoad.LOAD_FAILED);
    }
}

public static void setSdpInitiatedAddress(android.bluetooth.BluetoothDevice remBtDev) {
    com.android.bluetooth.OolConnManager.mAddress = remBtDev.getAddress();
    android.util.Log.d(com.android.bluetooth.OolConnManager.TAG, ("setSdpInitiatedAddress " + (com.android.bluetooth.OolConnManager.mAddress)));
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    mLastLocation = getIntent().getParcelableExtra(com.ddup4.autonav.module.main.MainActivity.EXTRA_LAST_LOCATION);
    super.onCreate(savedInstanceState, persistentState);
}

public void playAudio(android.media.MediaPlayer mp) {
    if (mp.isPlaying()) {
        mp.pause();
    }else {
        mp.start();
    }
}

public com.afollestad.materialdialogs.MaterialDialog.Builder titleColorAttr(@android.support.annotation.AttrRes
int colorAttr) {
    titleColor(com.afollestad.materialdialogs.util.DialogUtils.resolveColor(this.context, colorAttr));
    return this;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    toolbarBackToNormal();
    dialog.dismiss();
}

