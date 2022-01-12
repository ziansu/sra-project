@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mCurrentLocation = location;
}

@java.lang.Override
public void onItemClick(android.view.View v, int position) throws org.json.JSONException {
    android.util.Log.v("input", java.lang.String.valueOf(position));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.classify = getArguments().getString(com.laudandjolynn.mytv.ProgramTableFragment.ARG_CLASSIFY);
    this.date = getArguments().getString(com.laudandjolynn.mytv.ProgramTableFragment.ARG_AIR_DATE);
}

@java.lang.Override
public void navigateToStepsActivity(dk.jbfp.staveapp.User user, java.lang.String[] words) {
    android.content.Intent intent = new android.content.Intent(this, dk.jbfp.staveapp.steps.StepsActivity.class);
    intent.putExtra(StepsActivity.USER_KEY, user);
    startActivity(intent);
}

protected void removeHandler(android.os.Handler handler) {
    handler.removeCallbacksAndMessages(null);
    io.realm.BaseRealm.handlers.remove(handler);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    android.util.Log.d(TAG, "onAttach: called from webview fragment");
    webviewFragmentListener = ((camelcase.searchemall.WebViewFragment.WebviewFragmentListener) (context));
}

public void loginSuccess() {
    android.content.Intent intent = new android.content.Intent(this, com.seng480b.bumerang.activities.HomeActivity.class);
    com.facebook.login.LoginManager.getInstance().logInWithReadPermissions(this, java.util.Arrays.asList("public_profile"));
    startActivity(intent);
}

public static void setUsingAlternateTypefaceAndForcedLocale(android.content.Context context, boolean useAlternateTypeface, int localeCode) {
    br.com.carlosrafaelgn.fplay.ui.UI.isUsingAlternateTypeface = useAlternateTypeface;
    if (!(br.com.carlosrafaelgn.fplay.ui.UI.setForcedLocale(context, null, localeCode)))
        br.com.carlosrafaelgn.fplay.ui.UI.setUsingAlternateTypeface(context, useAlternateTypeface);
    
}

@java.lang.Override
public void onStop() {
    final android.webkit.WebView webView = ((android.webkit.WebView) (findViewById(R.id.WebViewPrint)));
    webView.loadUrl("about:blank");
    super.onStop();
}

@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    gDetector.onTouchEvent(motionEvent);
    return true;
}

@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    android.util.Log.d("myLogs", newText);
    pleaseSearchIt(newText);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.zhan.budget.Adapter.CategorySection.TAG, ("on click : " + (getLayoutPosition())));
    if ((mListener) != null) {
        mListener.onClick(getAdapterPosition());
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    finish();
    startActivity(new android.content.Intent(this, com.agameoffriends.agameoffriends.MainActivity.class));
}

@java.lang.Override
public void onClick(android.view.View v) {
    play();
    songPlayerThread = new com.bitdubai.sub_app.music_player.fragments.MusicPlayerMainActivity.ThreadSong(false);
    songPlayerThread.execute();
}

public android.app.Notification.Builder addAction(android.app.Notification.Action action) {
    mActions.add(action);
    return this;
}

private static void updateCardBackgroundColor(android.support.v17.leanback.widget.ImageCardView view, boolean selected) {
    int color = (selected) ? org.mythtv.android.presentation.presenter.tv.CardPresenter.sSelectedBackgroundColor : org.mythtv.android.presentation.presenter.tv.CardPresenter.sDefaultBackgroundColor;
    view.setBackgroundColor(color);
    view.findViewById(R.id.info_field).setBackgroundColor(color);
}

@java.lang.Override
public com.nrinehart.purdueclasswatcher.PurdueClassRealmAdapter.ViewHolder onCreateRealmViewHolder(android.view.ViewGroup viewGroup, int viewType) {
    android.view.View v = inflater.inflate(R.layout.row_class, viewGroup, false);
    return new com.nrinehart.purdueclasswatcher.PurdueClassRealmAdapter.ViewHolder(((android.widget.RelativeLayout) (v)));
}

public void info(java.lang.String msg) {
    if (com.yourtion.httpdns.Debug.isshow)
        android.util.Log.i(((com.yourtion.httpdns.Debug.PREFIX) + (this.name)), msg);
    
}

public java.lang.String getTitle() {
    if (android.text.TextUtils.isEmpty(title))
        return "";
    else
        return title;
    
}

@java.lang.Override
public void onCompleted(sep.software.anicare.model.AniCareUser entity) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(mThisActivity, sep.software.anicare.activity.PetSettingActivity.class);
    startActivity(intent);
    mAppContext.dismissProgressDialog();
    finish();
}

@java.lang.Override
public void onPageScrolled(int i, float v, int i2) {
    android.util.Log.i(com.xiaodong.dream.catcher.demo.express.ExpressFragment.TAG, ">>onPageScrolled");
}

@java.lang.Override
public void setMyLocationEnabled(boolean enabled) {
    if ((myLocationEnabled) != enabled) {
        myLocationEnabled = enabled;
        com.airbnb.android.airmapview.RuntimePermissionUtils.checkLocationPermissions(getActivity(), this);
    }
}

private void exitActivity() {
    android.util.Log.i(LOG, "Returning to MainActivity...");
    startActivity(new android.content.Intent(this, net.kenneho.runnow.MainActivity.class));
    finish();
}

@java.lang.Override
public void createTable(android.database.sqlite.SQLiteDatabase database) {
    database.execSQL(("DROP TABLE IF EXISTS " + (net.razysoft.production.Contract.Category.TABLE_NAME)));
    database.execSQL(net.razysoft.production.Contract.Category.SQL_CREATE_TABLE);
    database.close();
}

public void zoomTo(android.graphics.RectF dst) {
    if (mZoomAnimator.isRunning())
        mZoomAnimator.cancel();
    
    mStartRect.set(mImageArea);
    mEndRect.set(dst);
    mZoomAnimator.start();
}

public static java.lang.String byteToString(byte[] data, int flag) {
    return android.util.Base64.encodeToString(data, ((android.util.Base64.NO_PADDING) | (android.util.Base64.NO_WRAP)));
}

@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.content.Intent intent = getIntent();
    intent.putExtra("currentView", viewPager.getCurrentItem());
    startActivity(intent);
    finish();
}

@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.view.View instantiateItem = ((android.view.View) (getInstantiateItem(container, mList.get(position))));
    container.addView(instantiateItem);
    return instantiateItem;
}

public void startRoundAction(android.view.MenuItem item) {
    mRound.startRound();
    setMenuView(item);
    mView.showRoundMessage(mContext.getString(R.string.result_round_started));
}

@java.lang.Override
public void onClose() {
    android.support.v4.app.Fragment f = getSupportFragmentManager().findFragmentByTag(dialogTag);
    android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
    trans.remove(f).commit();
}

public void setMediaPlayer(android.media.MediaPlayer newVal) {
    if (newVal == null) {
        mediaplayer = new android.media.MediaPlayer();
    }else {
        mediaplayer = newVal;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isActivated()))
        activate(true);
    
    setHasFocus(true);
    inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent addSourceIntent = com.stripe.android.view.AddSourceActivity.newIntent(this, false, true);
    if (mStartedFromPaymentSession) {
        addSourceIntent.putExtra(com.stripe.android.PaymentSession.EXTRA_PAYMENT_SESSION_ACTIVE, true);
    }
    startActivityForResult(addSourceIntent, com.stripe.android.view.PaymentMethodsActivity.REQUEST_CODE_ADD_CARD);
}

public void onSuccess(java.lang.String s) {
    android.widget.Toast.makeText(this, "Location sent.", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.desk.java.apiclient.model.ApiResponse<com.desk.java.apiclient.model.Article>> call, java.lang.Throwable throwable) {
    callbacks.onArticlesLoadError(new com.desk.android.sdk.error.ErrorResponse(throwable));
}

public void onPlayPauseClicked(android.view.View v) {
    com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.utils.LogHelper.d(com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.TAG, "play-pause clicked");
    switch (currentSongState) {
        case com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.STATE_STOPPED :
        case com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.STATE_PAUSED :
            sendResumeMessageToService();
            break;
        case com.rukiasoft.androidapps.udacity.nanodegree.spotifystreamer.MusicServiceActivity.STATE_PLAYING :
            sendPauseMessageToService();
            break;
        default :
            break;
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    switch (view.getId()) {
        case R.id.input_reg_fullname :
            validateFullName();
            break;
        case R.id.input_reg_Surname :
            validateSurname();
            break;
        case R.id.input_reg_idParents :
            break;
    }
}

public void guestLogin(android.view.View view) {
    guestLayout.setVisibility(View.VISIBLE);
    providerLayout.setVisibility(View.GONE);
}

@java.lang.Override
public void onStart() {
    android.util.Log.d(com.seafile.seadroid2.ui.activity.AccountsActivity.DEBUG_TAG, "onStart");
    super.onStart();
    com.seafile.seadroid2.ui.activity.Intent bIntent = new com.seafile.seadroid2.ui.activity.Intent(this, com.seafile.seadroid2.monitor.FileMonitorService.class);
    bindService(bIntent, mMonitorConnection, Context.BIND_AUTO_CREATE);
}

public void openChromeTab(java.lang.String url) {
    intentBuilder.addMenuItem("Share", createPendingShareIntent());
    com.hitherejoe.tabby.CustomTabActivityHelper.openCustomTab(activity, intentBuilder.build(), android.net.Uri.parse(url), getCustomTabFallback());
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.widget.Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    return android.view.LayoutInflater.from(context).inflate(R.layout.fragment_list_item, parent);
}

@java.lang.Override
public void onSuccess(com.hkust.comp4521.hippos.datastructures.Inventory inventory) {
    android.widget.Toast.makeText(mContext, ((("Inventory " + (inventory.getName())) + " updated with category=") + category), Toast.LENGTH_SHORT).show();
    finish();
}

@java.lang.Override
android.graphics.Bitmap transmit(java.util.List<com.psu.capstonew17.backend.data.Card> cards, java.util.List<com.psu.capstonew17.backend.data.Deck> decks, com.psu.capstonew17.backend.data.SharingManager.TxOptions opts, com.psu.capstonew17.backend.data.SharingTransmitListener listener) {
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    android.util.Log.i(com.dailynews.dailynews.widget.fragment.PageFragment.TAG, ("mTopic: " + (mTopic)));
    mLoadNewsAdapter.swapCursor(data);
    getActivity().supportStartPostponedEnterTransition();
}

@java.lang.Override
public void onClick(android.view.View view) {
    mWordCards.remove(position);
    notifyDataSetChanged();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    this.savedInstanceState = savedInstanceState;
    if (savedInstanceState == null) {
        launchTabsFragmentNoBackTrace();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    playPreviousSong();
    if (mServiceBound)
        mBoundService.togglePlayer();
    
}

public void setSwitchView(android.widget.ImageView mSwitchView) {
    if ((this.mSwitchView) == null) {
        this.mSwitchView = mSwitchView;
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.discflux.android.spotifystreamer.PlayFragment.LOG_TAG, "Activity Paused");
    mHandler.removeCallbacks(mUpdateTimeTask);
    if (mBound) {
        getActivity().unbindService(mConnection);
        mBound = false;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    imageViewResult4.setBackgroundColor(getResources().getColor(R.color.Gold));
    band4 = 0.1;
    doCalc();
}

public int getIncorrectAns() {
    do {
        incorrectAnswer = generateIncorrectAns();
    } while (hasSameValueInBaffaAs(incorrectAnswer) );
    pushToBaffa(incorrectAnswer);
    android.util.Log.d("CalcurationQuestion", "1 successfully generated");
    return incorrectAnswer;
}

@java.lang.Override
public void writeToParcel(final android.os.Parcel out, final int flags) {
    out.writeSerializable(direction);
    out.writeInt((caseSensitive ? 1 : 0));
    super.writeToParcel(out, flags);
}

@java.lang.Override
public void onClickItem(android.view.View v, int position) {
    android.widget.Toast.makeText(this, "Em breve..", Toast.LENGTH_SHORT).show();
}

public static void e(final java.lang.String logTag, final java.lang.String msg) {
    if (com.stanko.tools.Log.isDebuggable)
        android.util.Log.e(logTag, msg);
    
}

@android.support.annotation.CheckResult
com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(A1 arg1, A2 arg2, A3 arg3);

private static void printStatus(byte status) {
    android.util.Log.d(com.aspsine.swipetoloadlayout.SwipeToLoadLayout.TAG, ("printStatus:" + (com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.getStatus(status))));
}

@java.lang.Override
public void run() {
    if ((gatt.getDevice().getBondState()) != (android.bluetooth.BluetoothDevice.BOND_BONDING)) {
        if ((mBluetoothGatt) != null) {
            mBluetoothGatt.discoverServices();
            checkServiceDiscover();
        }
    }
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem menuItem) {
    onDrawerItemClick(menuItem.getItemId());
    mDrawerLayout.closeDrawers();
    return true;
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    if ((newVersion == 2) && (oldVersion == 1)) {
        db.execSQL("alter table COVERS add column COVERTYPE integer default '0'");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    float score = computeScore();
    saveDrawing(v);
    drawView.setEnabled(true);
    started = false;
    callback.onFinish(score, (10000 - (duration)));
}

public static com.xinyi.czbasedevtool.base.manager.ui_about.dialog.MaterialDialogFactory getInstance(android.content.Context context) {
    com.xinyi.czbasedevtool.base.manager.ui_about.dialog.MaterialDialogFactory.mContext = context;
    return com.xinyi.czbasedevtool.base.manager.ui_about.dialog.MaterialDialogFactory.mInstance;
}

public boolean onCreateOptionMenu(android.view.Menu menu) {
    super.onCreateOptionsMenu(menu);
    android.view.MenuInflater mMenuInflater = getMenuInflater();
    mMenuInflater.inflate(R.menu.my_menu, menu);
    return true;
}

public void Backfromsingle(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "you click back", Toast.LENGTH_SHORT).show();
    com.bumptech.glide.Glide.get(this).clearMemory();
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(intent, 1);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i("forserv ", "yo :3");
    android.widget.Toast.makeText(this, "Have the safest of trips!", Toast.LENGTH_SHORT).show();
    com.example.buttkicker.trainator.GotOnTrainNotification.cancel(this);
    return START_STICKY;
}

public static void clearDiskCache(final android.content.Context context) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.bumptech.glide.Glide.get(context).clearDiskCache();
        }
    }).start();
}

public void switchToCompanyProfile() {
    android.content.Intent intent = new android.content.Intent(this, seniordesign.ratemybusinesspartners.CompanyProfile.class);
    intent.putExtra(CompanyProfile.COMPANY_PROFILE_TARGET_COMPANY, "Walmart");
    startActivity(intent);
}

public void clearArray() throws org.json.JSONException {
    jArray = new org.json.JSONArray();
    android.util.Log.d(((com.logistics.service.PushAndPull.TAG) + "nihao"), jArray.toString());
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.app.FragmentTransaction fm = getFragmentManager().beginTransaction();
    fm.addToBackStack(null);
    fm.replace(R.id.profileFragment, new com.example.thang.mobile_dating_app_v20.Fragments.EditProfile());
    fm.commit();
}

public void onITSemester(android.view.View view) {
    backSemester = backString;
    backString = "IT Wahlfächer";
    openList(Subjects.wpfgIT);
    setHeadline(backString);
}

public void onClick(android.view.View v) {
    if (showAssassin.isChecked()) {
        moreAssassin.setVisibility(View.VISIBLE);
    }else {
        moreMordred.setVisibility(View.GONE);
    }
}

@android.annotation.TargetApi(value = 14)
public static boolean hasNavigationBar(android.app.Activity activity) {
    com.gyf.barlibrary.BarConfig config = new com.gyf.barlibrary.BarConfig(activity, true, true);
    return config.hasNavigtionBar();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    addPreferencesFromResource(R.xml.settings);
}

private static void toast(android.content.Context context, final java.lang.String message, final int length) {
    android.widget.Toast.makeText(context, message, length).show();
}

@java.lang.Override
public void onFailure(java.lang.Error error) {
    timber.log.Timber.e(error.getMessage());
    android.widget.Toast.makeText(this, error.getMessage(), Toast.LENGTH_LONG).show();
}

public void CashDrawer_Test_346_click(android.view.View view) {
    CashDrawer_Write("21");
    CashDrawer_Write("20");
    CashDrawer_Write("21");
    CashDrawer_Write("20");
}

@java.lang.Override
protected void onPostExecute(@android.support.annotation.NonNull
final java8.util.Optional<com.lima2017.neuralguide.api.ImageCaptionResult> result) {
    _listener.onImageCaptioned(result.get());
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    selectedEntry = which;
    super.onClick(dialog, DialogInterface.BUTTON_POSITIVE);
    dialog.dismiss();
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    createContextMenu(position, view);
    return false;
}

private void setUpMap() {
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(0, 0)).title("Marker"));
}

void close() {
    android.util.Log.d("mbta", "CLOSING DB!!!!!!!!!!!!!!!!!!!!!!!");
    m_db.close();
}

public void refreshGallery(java.io.File file) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    mediaScanIntent.setData(android.net.Uri.fromFile(file));
    sendBroadcast(mediaScanIntent);
}

public android.widget.Toast makeToast(int textId) {
    return android.widget.Toast.makeText(getContext(), textId, Toast.LENGTH_SHORT);
}

private com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration getActivityCheckConfiguration(java.lang.String mode, com.facebook.react.bridge.Promise promise) throws java.lang.Exception {
    switch (mode) {
        case "DISABLED" :
            return com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration.DISABLED;
        case "MINIMAL" :
            return com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration.MINIMAL;
        case "DEFAULT" :
            return com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration.DEFAULT;
        default :
            throw new java.lang.Exception("activityCheckConfiguration default value has to be either DISABLED, MINIMAL or DEFAULT");
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_note_list);
    listView = ((android.widget.ListView) (findViewById(R.id.list)));
    refreshData();
}

@java.lang.Override
public void onAnimationCancel(android.animation.Animator animation) {
    state = org.codetwisted.widget.DrawerLayout.STATE_IDLE;
}

@java.lang.Override
public void onPause() {
    android.util.Log.d(org.openhab.habdroid.ui.OpenHABMainActivity.TAG, "onPause()");
    super.onPause();
    org.openhab.habdroid.ui.OpenHABMainActivity.mAsyncHttpClient.cancelAllRequests(true);
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String[] paths = com.github.angads25.filepicker.model.MarkedItemList.getSelectedPaths();
    callbacks.onSelectedFilePaths(paths);
    dismiss();
}

@java.lang.Override
public void done(io.cloudboost.CloudUser user, io.cloudboost.CloudException e) throws io.cloudboost.CloudException {
    android.content.Intent in = new android.content.Intent(this, com.gusycorp.travel.activity.Login.TripLoginActivity.class);
    startActivity(in);
    finish();
}

public boolean updateTagState(prada.lab.android.pingo.model.Tag tag, boolean selected) {
    int idx = findTagPosition(tag);
    if (idx < 0) {
        return false;
    }
    tags.get(idx).getTag().setSelected(selected);
    return true;
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onCreate();
    mTrackPosition = 0;
    mPlayer = new android.media.MediaPlayer();
    initMusicPlayer();
    return START_STICKY;
}

private android.view.View getCordovaView() {
    return cordova.getActivity().getWindow().getDecorView();
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(latitude, longitude)).title("Your location"));
    android.widget.Toast.makeText(this, "Map is ready", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if (null != (view)) {
        ((android.view.ViewGroup) (view.getParent())).removeView(view);
        unbinder.unbind();
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.shoukhin.locatingfriends.MyDbHelper.CREATE_FRIEND_TABLE);
    android.util.Log.d(MapsActivity.TAG, "db created");
}

@java.lang.Override
public void onActivityPaused(android.app.Activity activity) {
    if ((self.getContext().equals(activity)) || (self.getContext().equals(com.vilyever.contextholder.ContextHolder.getContext()))) {
        self.onActivityPaused(activity);
    }
}

@java.lang.Override
public void onPageSelected(int position) {
    if ((scrollingState) == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE)) {
        updateIndicatorPosition(position, 0);
    }
    tabWidget.setCurrentTab(position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_bet_acept :
            bet = 1;
            android.util.Log.d("Estamos en ", "el boton de aposta'00000000000000000000000000000000000000000000000000000000r");
            communication.sendBet(bet);
            break;
    }
}

@org.junit.Test
public void useAppContext() {
    android.content.Context appContext = android.support.test.InstrumentationRegistry.getTargetContext();
    org.junit.Assert.assertEquals("de.nenick.androidannotations.plugin.mvp.sample", appContext.getPackageName());
}

