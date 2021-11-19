@java.lang.Override
public java.util.Iterator<T> iterator() {
    return new br.com.zbra.androidlinq.ArrayStream.ArrayIterator<>(source, 0, 1, source.length);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    dataSource = MainActivity.dataSource;
    dataSource.deleteAllThrows();
    addDemoThrows();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.roigreenberg.easyshop.MainActivity.ShareList(getBaseContext(), userId, listId);
}

@java.lang.Override
public void onRequestFocus(android.webkit.WebView view) {
    mWebChromeClient.onRequestFocus(view);
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    removeAllViews();
    addView(gridLayout);
    android.util.Log.i("WASD", ("" + ((layout.getHeight()) / 5)));
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (isClosedOrder())
        return false;
    
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_order, menu);
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    button3.setText(((mark) + ""));
    placeMarkOnBoard(0, 2);
    button3.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sign_in_as_approver_or_claimant);
    user.setUserId(1);
}

public boolean isAppConfigured() {
    return ((mGcmTokenPreference) != null) && (!(android.text.TextUtils.isEmpty(mGcmTokenPreference.get())));
}

public static java.lang.String getLastAddr(android.content.Context context) {
    android.content.SharedPreferences pref = context.getSharedPreferences(com.cooper.wheellog.SettingsManager.key, Context.MODE_PRIVATE);
    if (pref.contains("last_mac")) {
        return pref.getString("last_addr", "");
    }
    return "";
}

public void onClick(android.content.DialogInterface dialog, int id) {
    com.spinecoin.app.Helper.SpinecoinLog.appendLog("[StartActivity generateJsonData] Alert dialog -> user clicked OK button");
    is_session_running = false;
}

private void sendState(com.example.grand.assignment31.State state) {
    android.content.Intent intent = new android.content.Intent(PlayerActivity.FILTER);
    intent.putExtra(PlayerActivity.PARAM_STATE, state);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}

public hotchemi.android.rate.OnClickButtonListener getListener() {
    return listener.get();
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    searchRequest = query;
    android.util.Log.i(com.example.camille.booklist.MainActivity.LOG_TAG, "TEST: Setting searchRequest to be the query");
    android.app.LoaderManager loaderManager = getLoaderManager();
    loaderManager.initLoader(com.example.camille.booklist.MainActivity.BOOK_LOADER_ID, null, this);
    return true;
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.e(com.biglynx.fulfiller.MainActivity.TAG, "Destroyed....");
    stopService(new android.content.Intent(this, com.biglynx.fulfiller.services.MyJobService.class));
}

@java.lang.Override
public final void addView(android.view.View child, int index) {
    super.addView(child, index);
}

public void cancelAdding(android.view.View v) {
    changeToModeNormal();
    java.util.Arrays.fill(selectedViews, java.lang.Boolean.FALSE);
    resetViews();
}

public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((temp) == 0) {
        check = false;
    }
    temp = 0;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(ctx, com.historicar.app.activity.AboutActivity.class);
    startActivity(intent);
}

@java.lang.Override
public android.view.View initView() {
    android.view.View view = com.fuyi.googleplay.utils.UIUtils.inflate(R.layout.listview_home_item);
    tvContent = ((android.widget.TextView) (view.findViewById(R.id.tvContent)));
    return view;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    adapterPresenter.unFavoriteSong(song);
    notifyDataSetChanged();
    viewHolder.favorite.setImageResource(R.drawable.unfavoritebutton);
}

@java.lang.Override
public void onStop() {
    com.crashlytics.android.Crashlytics.log(Log.DEBUG, TAG, "canceling Picasso request");
    com.squareup.picasso.Picasso.with(this).cancelRequest(mTarget);
    super.onStop();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    it.bsdsoftware.library.BSDImage image = adapter.getItem(position);
    it.bsdsoftware.library.BSDUtility.handleClickItem(getActivity(), image, gallery, position);
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... aVoid) {
    com.ringsterz.androidtextreader.BibleManager bibleManager = com.ringsterz.androidtextreader.BibleManager.getInstance(context);
    bibleManager.insertBook();
    bibleManager.insertPhrase();
    return null;
}

public synchronized int getDuration() {
    if (((currentTrackPlayer) != null) && (currentTrackPlayer.isPlaying()))
        return currentTrackPlayer.getDuration();
    
    android.util.Log.d(org.fitchfamily.android.symphony.MusicService.TAG, "getDuration() not playing?");
    return 0;
}

@java.lang.Override
public java.util.Map getFilterParams() {
    android.content.Intent packageIntent = getIntent();
    map.put("bankId", packageIntent.getStringExtra("bankId"));
    map.put("orderId", packageIntent.getStringExtra("orderId"));
    return map;
}

@java.lang.Override
public void onClick(android.view.View view) {
    button4.setText(((mark) + ""));
    placeMarkOnBoard(1, 0);
    button4.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}

protected void updateColors() {
    final android.content.ContentResolver resolver = mContext.getContentResolver();
    mLabelColor = Settings.System.getInt(resolver, Settings.System.QS_TEXT_COLOR, -1);
    mIconColor = Settings.System.getInt(resolver, Settings.System.QS_ICON_COLOR, -16738680);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String newNote = input.getText().toString();
    adapter.insert(newNote, 0);
    me.shreyasr.quicknote.notepad.NotepadUtils.setCurrentNote(newNote);
    me.shreyasr.quicknote.notepad.NotepadUtils.updateNotepad();
}

void addPlayerToUI(com.example.gideonsassoon.avariel.data.Player player) {
    android.widget.EditText mNameEditText = null;
    mNameEditText = ((android.widget.EditText) (findViewById(R.id.et_character_name)));
    mNameEditText.setText(player.getName());
}

protected void startLocationUpdates() {
    int permission = android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
    if (permission == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }else {
        requestPermission();
    }
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    if ((mLooper) != null) {
        mLooper.start();
    }
}

@java.lang.Override
public void loadAlbums() {
    android.content.ContentResolver cr = mTasksView.getAppCr();
    if (cr == null) {
        return ;
    }
    com.bilibili.boxing.model.BoxingManager.getInstance().loadAlbum(cr, mLoadAlbumCallback);
}

@java.lang.Override
public void onAuthenticateFailed() {
    br.org.cesar.knot.beamsensor.ui.login.Log.d("miguel", "lala");
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(br.org.cesar.knot.beamsensor.ui.login.LoginActivity.this, R.string.text_authentication_failed, Toast.LENGTH_SHORT).show();
        }
    });
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    this.c = getApplicationContext();
}

@java.lang.Override
public boolean canSwipe() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    boolean ob = sp.getBoolean(getString(R.string.sp_omnibox_control), true);
    return (!(io.github.UltimateBrowserProject.Activity.BrowserActivity.switcherPanel.isKeyBoardShowing())) && ob;
}

public void onClick(android.view.View v) {
    if (checkNumberOfTries()) {
        if (isCharInWord("å")) {
            android.util.Log.i("Button", "You guessed a right character");
        }else {
            btn_å.setEnabled(false);
        }
    }else {
        return ;
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.adleritech.android.developertest.application.DeveloperTestApplication.sInstance = this;
    android.content.Intent intent = new android.content.Intent(com.adleritech.android.developertest.application.DeveloperTestApplication.SERVICE_NAME);
    bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    mBound = true;
}

@android.support.annotation.NonNull
public java.lang.String getUserIDLang() {
    return org.apache.commons.lang3.StringUtils.defaultString(userIDLang, "");
}

private android.content.Intent GetBatteryStatusIntent() {
    android.content.IntentFilter ifilter = new android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED);
    android.content.Intent batteryStatus = context.registerReceiver(null, ifilter);
}

public void statusCheckGPS() {
    final android.location.LocationManager manager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    if (!(manager.isProviderEnabled(LocationManager.GPS_PROVIDER))) {
        buildAlertMessageNoGps();
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    setContentView(getLayoutResource());
    butterknife.ButterKnife.inject(this);
}

@java.lang.Override
public void onBindViewHolder(com.example.johannes.colorpicker.RVAdapter.TaskViewHolder taskViewHolder, int position) {
    taskViewHolder.headline.setText(tasks.get(position).getOtsikko());
    taskViewHolder.cv.setCardBackgroundColor(android.graphics.Color.parseColor(tasks.get(position).getOtsikko()));
}

@java.lang.Override
public final void onBindViewHolder(final com.henriquenfaria.popularmovies.ui.FavoriteMoviesRecyclerViewAdapter.ViewHolder holder, final int position) {
    final android.database.Cursor cursor = this.getItem(position);
    this.onBindViewHolder(holder, cursor);
}

public static int getDeviceWidth(android.content.Context context) {
    android.view.WindowManager wm = ((android.view.WindowManager) (context.getSystemService(Context.WINDOW_SERVICE)));
    android.view.Display display = wm.getDefaultDisplay();
    return display.getWidth();
}

@java.lang.Override
public void onNewsUpdateFailed(java.lang.String section, java.lang.String message) {
    android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    mSwipeRefreshLayout.setRefreshing(false);
    loading = true;
}

public void ProfileSetup(android.view.View view) {
    checkUser(this);
    android.content.Intent intent = new android.content.Intent(this, itsjustaaron.food.ProfileSetup.class);
    startActivity(intent);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    btnGenerate.setOnClickListener(new com.lava.ldc.randomnumbersapp.RandomNumberGeneratorFragment.ClickButton());
}

@java.lang.Override
public void onFailure(retrofit2.Call<org.septa.android.app.services.apiinterfaces.model.NextArrivalDetails> call, java.lang.Throwable t) {
    android.util.Log.d(org.septa.android.app.nextarrive.NextToArriveResultsActivity.TAG, t.getMessage());
    android.util.Log.d(org.septa.android.app.nextarrive.NextToArriveResultsActivity.TAG, t.getStackTrace().toString());
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == true)
            return ;
        
        szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
    }
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onStart()");
    fwdToMain();
}

@java.lang.Override
public void onClick(android.view.View v) {
    showMovieTasteTest();
    movieList.remove(0);
}

public void deauthenticate() {
    java.lang.String return_value = JSONSendCmd("deauthenticate", null);
    android.util.Log.d(Consts.LOG_TAG, ("Deauthenticate Return Value " + return_value));
}

private void btnLocalMultiplayerClicked() {
    startActivity(new android.content.Intent(this, com.vintagetechnologies.menschaergeredichnicht.Spieloberflaeche.class));
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.getInstance().setLocalGame(true);
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.getInstance().reset();
}

@java.lang.Override
public void onResponse(com.wilee8.coyotereader2.gson.UserInfo response) {
    com.wilee8.coyotereader2.mUserId = response.getUserId();
    android.util.Log.d("coyotereader", "return json: userid");
    subscriber.onNext(null);
}

public static void test_235() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "应用", "vertical");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/advanced");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "修改系统设置");
    check(testcase.Object_TextScroll, testcase.Operation_checkExist, "可修改系统设置");
}

private void commit(long[] selectedIds) {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(cwa115.trongame.FriendsListActivity.SELECTED_IDS_EXTRA, selectedIds);
    setResult(cwa115.trongame.RESULT_OK, data);
    finish();
}

public static com.alwaysrejoice.hexengine.dto.Game getGame() {
    android.util.Log.d("game", ("returning current game " + (com.alwaysrejoice.hexengine.util.GameUtils.game)));
    return com.alwaysrejoice.hexengine.util.GameUtils.game;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.zerohour.utils.Utility.navigateDashBoardFragment(new com.zerohour.fragments.NoticeBoardDetailFragment(), NoticeBoardDetailFragment.TAG, null, mParent);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    _adapter = new com.github.weimasoft.joke.list.JokeListAdapter(com.github.weimasoft.joke.list.TestJokeData.getTestData(getActivity().getResources()), getActivity());
    setListAdapter(_adapter);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    isOriginallyPlaying = mPlayer.isPlaying();
}

public void draw(android.graphics.Canvas canvas) {
    canvas.drawBitmap(resized, x, y, null);
    android.util.Log.i("x", java.lang.String.valueOf(x));
    android.util.Log.i("y", java.lang.String.valueOf(y));
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    if (false) {
        com.taobao.weex.WXSDKManager.getInstance().notifyTrimMemory();
    }
    if (true) {
        com.taobao.weex.WXSDKManager.getInstance().notifySerializeCodeCache();
    }
}

@java.lang.Override
public synchronized boolean isCached(java.lang.String key, long position, long length) {
    com.google.android.exoplayer.upstream.cache.CachedContent cachedContent = index.get(key);
    if (cachedContent == null) {
        return false;
    }
    return cachedContent.isCached(position, length);
}

@java.lang.Override
public void onSessionSuspended(com.google.android.gms.cast.framework.CastSession session, int reason) {
    timber.log.Timber.d("VideoDetailsFragment : onSessionSuspended()");
}

@java.lang.Override
public void onClick(android.view.View v) {
    chooseCategory(5);
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    stopService(new android.content.Intent(this, brotic.findmyfriends.Service.PositionService.class));
}

@android.support.annotation.Nullable
android.app.Activity getCurrent() {
    try {
        return activityStack.peek().get();
    } catch (java.util.EmptyStackException e) {
        return null;
    }
}

private android.net.Uri getDownloadUri() {
    return android.net.Uri.parse(getDownloadUrl().replace("https", "http"));
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    imagePreview.setImageBitmap(bitmap);
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.widget.Toast.makeText(main.getApplicationContext(), "press", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.widget.Toast.makeText(getActivity(), query, Toast.LENGTH_SHORT).show();
    return true;
}

@java.lang.Override
public void notifyDataSetChanged() {
    for (android.database.DataSetObserver observer : observes) {
        observer.onChanged();
    }
}

@java.lang.Override
public void stop() {
    super.stop();
    com.github.ybq.android.spinkit.animation.AnimationUtils.stop(sprites);
    com.github.ybq.android.spinkit.animation.AnimationUtils.stop(getAnimation());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mItem) != null) {
        mItem.set(mItem.getOriginal());
        setViews(rootView, mItem);
    }
}

private void stop() {
    android.util.Log.i("X", "ctrl STOP");
    stopProgress();
    audioState = pl.cprojekt.cpaudiopreview.CPAudio.AUDIO_STATE.STOPPED;
    mp.stop();
    setProgress(progressStartPos);
    showPlay();
}

private int createBundle(int varValueIndex) {
    int bundleIndex = com.rfo.basic.Run.theBundles.size();
    com.rfo.basic.Run.NumericVarValues.set(varValueIndex, ((double) (bundleIndex)));
    com.rfo.basic.Run.theBundles.add(new android.os.Bundle());
    return bundleIndex;
}

private android.widget.ScrollView createContentLayout(android.content.Context context) {
    android.widget.ScrollView sv = new android.widget.ScrollView(context);
    cn.bassy.library.widget.LayoutParams params = new cn.bassy.library.widget.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    sv.setLayoutParams(params);
    return sv;
}

@java.lang.Override
protected void onGeometryTouched(com.metaio.sdk.jni.IGeometry geometry) {
    if (geometry == (canonGeometry1)) {
        android.util.Log.d(com.google.sprint1.GameActivity.TAG, "hej");
    }
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker numberPicker, int oldVal, int newVal) {
    quantityUnit = unitOptions[newVal];
    android.util.Log.e("unit", quantityUnit);
}

public static void show(android.support.v7.app.AppCompatActivity activity, org.onebusaway.android.io.elements.ObaArrivalInfo arrival, org.onebusaway.android.report.ui.ReportProblemFragmentCallback callback) {
    org.onebusaway.android.report.ui.ReportTripProblemFragment.show(activity, arrival, null, true, callback);
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        expirationDatePicker.show();
    }
    v.clearFocus();
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    if ((mLastLocation) != null) {
        android.util.Log.d("location", java.lang.String.valueOf(mLastLocation.getLatitude()));
    }
}

public void postStartActivityDismissingKeyguard(final android.content.Intent intent, int delay) {
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            handleStartActivityDismissingKeyguard(intent, true);
        }
    }, delay);
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("called", "on destroy");
    dialog.dismiss();
    player.stopSelf();
}

private android.view.View getLastChild() {
    return getChildAt(((getChildCount()) - 1));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String email = etEmail.getText().toString();
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mMediaPlayer) {
    releaseMediaPlayer();
    mAudioManager.abandonAudioFocus(afChangeListener);
}

public com.example.caitlin.cookhelper.Recipe getRecipe(android.content.Context context, long id) {
    return new com.example.caitlin.cookhelper.DatabaseHandler(context).getRecipe(((int) (id)));
}

@org.androidannotations.annotations.Click(value = R.id.activity_login_btn_login)
void setBtnLogin() {
    validator.validate();
    doLogin();
}

@java.lang.Override
public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) {
    this.processAccessibilityEvent(event);
}

protected void onPostExecute(java.lang.Boolean success) {
    android.widget.TextView textView = new android.widget.TextView(this);
    textView.setText("yupppppp success");
}

private void Back() {
    android.support.v4.app.FragmentManager FM = getActivity().getSupportFragmentManager();
    FM.beginTransaction().remove(this).commit();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.d(org.fraunhofer.cese.madcap.SignInActivity.TAG, "On start being called, now trying to silently log in");
    org.fraunhofer.cese.madcap.authentification.MadcapAuthManager.silentLogin();
}

@java.lang.Override
public void iconTextViewOnClick(android.support.v7.widget.RecyclerView.ViewHolder v, int position) {
    if (position == 0)
        stopAnimation(v, R.drawable.power_disable_icon);
    else
        stopAnimation(v, R.drawable.power_enable_icon);
    
}

private void reloadTimeline() {
    android.util.Log.d("Reload", "Reloading timeline");
    this.adapter.refresh(this.timelineRefreshCallback);
}

@java.lang.Override
public boolean isSignedIn() {
    android.util.Log.d(com.ashomok.imagetotext.sign_in.social_networks.silent_login.SilentLoginGoogle.TAG, ("call to isSignedIn, returned " + (isSignedIn)));
    return isSignedIn;
}

@java.lang.Override
public void onInitializationSuccess(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubePlayer player, boolean wasRestored) {
    mPlayer = player;
    if (!wasRestored) {
        mPlayer = player;
        mPlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
        mPlayer.loadVideo("lc03JqnPbIk");
    }
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    canvasAngle = ((float) (animation.getAnimatedValue()));
    android.util.Log.e(com.xingstarx.canvas.view.CustomView.TAG, ("onAnimationUpdate canvasAngle == " + (canvasAngle)));
}

@java.lang.Override
public void onClick(android.view.View view) {
    new ir.rasen.charsoo.model.business.DeleteBusiness(context, ir.rasen.charsoo.controller.helper.LoginInfo.getUserId(context), businessId, iOnBusinessDeletedListener).execute();
    dismiss();
}

