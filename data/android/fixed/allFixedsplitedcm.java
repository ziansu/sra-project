@java.lang.Override
public java.util.Iterator<T> iterator() {
    return new br.com.zbra.androidlinq.ArrayStream.ArrayIterator<>(source, 0, ((source.length) - 1));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((dataSource) == null) {
        dataSource = MainActivity.dataSource;
        dataSource.deleteAllThrows();
        addDemoThrows();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.roigreenberg.easyshop.MainActivity.ShareList(v.getContext(), userId, listId);
}

@java.lang.Override
public void onRequestFocus(android.webkit.WebView view) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onRequestFocus(view);
    }
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    removeAllViews();
    addView(gridLayout);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (isClosedOrder())
        return true;
    
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_order, menu);
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    button3.setText(((mark) + ""));
    placeMarkOnBoard(0, 2);
    button3.setEnabled(false);
    checkForWinOrDraw();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sign_in_as_approver_or_claimant);
}

private boolean isAppConfigured() {
    return ((mGcmTokenPreference) != null) && (!(android.text.TextUtils.isEmpty(mGcmTokenPreference.get())));
}

public static java.lang.String getLastAddr(android.content.Context context) {
    android.content.SharedPreferences pref = context.getSharedPreferences(com.cooper.wheellog.SettingsManager.key, Context.MODE_PRIVATE);
    if (pref.contains("last_mac")) {
        return pref.getString("last_mac", "");
    }
    return "";
}

public void onClick(android.content.DialogInterface dialog, int id) {
    com.spinecoin.app.Helper.SpinecoinLog.appendLog("[StartActivity generateJsonData] Alert dialog -> user clicked OK button");
}

private void sendState() {
    android.content.Intent intent = new android.content.Intent(PlayerActivity.FILTER);
    intent.putExtra(PlayerActivity.PARAM_STATE, state);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}

public hotchemi.android.rate.OnClickButtonListener getListener() {
    return (listener) != null ? listener.get() : null;
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    searchRequest = query;
    android.util.Log.i(com.example.camille.booklist.MainActivity.LOG_TAG, "TEST: Setting searchRequest to be the query");
    loaderManager = getLoaderManager();
    loaderManager.initLoader(com.example.camille.booklist.MainActivity.BOOK_LOADER_ID, null, this);
    return true;
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.e(com.biglynx.fulfiller.MainActivity.TAG, "Destroyed....");
}

@java.lang.Override
public void addView(android.view.View child) {
    this.addView(child, (-1));
}

public void cancelAdding(android.view.View v) {
    changeToModeNormal();
    if ((selectedViews) != null) {
        java.util.Arrays.fill(selectedViews, java.lang.Boolean.FALSE);
        resetViews();
    }
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (temp) {
        check = false;
    }
    temp = true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(ctx, com.historicar.app.activity.AboutActivity.class));
}

@java.lang.Override
public android.view.View initView() {
    android.view.View view = com.fuyi.googleplay.utils.UIUtils.inflate(R.layout.listview_home_item);
    return view;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    adapterPresenter.unFavoriteSong(song);
    notifyDataSetChanged();
}

@java.lang.Override
public void onStop() {
    com.squareup.picasso.Picasso.with(this).cancelRequest(mTarget);
    super.onStop();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    it.bsdsoftware.library.BSDImage image = adapter.getItem(position);
    it.bsdsoftware.library.BSDUtility.handleClickItem(getActivity(), image, position, this);
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... aVoid) {
    com.ringsterz.androidtextreader.BibleManager bibleManager = com.ringsterz.androidtextreader.BibleManager.getInstance(context);
    bibleManager.insertBook();
    return null;
}

public synchronized int getDuration() {
    if ((currentTrackPlayer) != null)
        return currentTrackPlayer.getDuration();
    
    android.util.Log.d(org.fitchfamily.android.symphony.MusicService.TAG, "getDuration() not playing?");
    return 0;
}

@java.lang.Override
public java.util.Map getFilterParams() {
    android.content.Intent packageIntent = getIntent();
    map.put("bankId", packageIntent.getStringExtra("bankId"));
    return map;
}

@java.lang.Override
public void onClick(android.view.View view) {
    button4.setText(((mark) + ""));
    placeMarkOnBoard(1, 0);
    button4.setEnabled(false);
    checkForWinOrDraw();
}

protected void updateColors() {
    final android.content.ContentResolver resolver = mContext.getContentResolver();
    mLabelColor = Settings.System.getInt(resolver, Settings.System.QS_TEXT_COLOR, -1);
    mIconColor = Settings.System.getInt(resolver, Settings.System.QS_ICON_COLOR, -1);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String newNote = input.getText().toString();
    adapter.append(newNote);
    me.shreyasr.quicknote.notepad.NotepadUtils.setCurrentNote(newNote);
    me.shreyasr.quicknote.notepad.NotepadUtils.updateNotepad();
}

void addPlayerToUI(com.example.gideonsassoon.avariel.data.Player player) {
}

protected void startLocationUpdates() {
    int permission = android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
    if (permission == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
    }
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
}

@java.lang.Override
public void loadAlbums() {
    android.content.ContentResolver cr = mTasksView.getAppCr();
    com.bilibili.boxing.model.BoxingManager.getInstance().loadAlbum(cr, mLoadAlbumCallback);
}

@java.lang.Override
public void onAuthenticateFailed() {
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
}

@java.lang.Override
public boolean canSwipe() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    return sp.getBoolean(getString(R.string.sp_omnibox_control), true);
}

public void onClick(android.view.View v) {
    if (checkNumberOfTries()) {
        isCharInWord("å");
        btn_å.setEnabled(false);
    }else {
        return ;
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.adleritech.android.developertest.application.DeveloperTestApplication.sInstance = this;
}

@android.support.annotation.NonNull
public java.lang.String getUserIDLang() {
    return org.apache.commons.lang3.StringUtils.defaultString(userIDLang);
}

private android.content.Intent GetBatteryStatusIntent() {
    android.content.IntentFilter ifilter = new android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED);
    return context.registerReceiver(null, ifilter);
}

public boolean statusCheckGPS() {
    final android.location.LocationManager manager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    if (!(manager.isProviderEnabled(LocationManager.GPS_PROVIDER))) {
        buildAlertMessageNoGps();
        return false;
    }else
        return true;
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    setContentView(getLayoutResource());
}

@java.lang.Override
public void onBindViewHolder(com.example.johannes.colorpicker.RVAdapter.TaskViewHolder taskViewHolder, int position) {
    taskViewHolder.cv.setCardBackgroundColor(android.graphics.Color.parseColor(tasks.get(position).getOtsikko()));
}

@java.lang.Override
public final void onBindViewHolder(final com.henriquenfaria.popularmovies.ui.FavoriteMoviesRecyclerViewAdapter.ViewHolder holder, final int position) {
    final android.database.Cursor cursor = getItem(position);
    onBindViewHolder(holder, cursor);
}

@java.lang.SuppressWarnings(value = "deprecation")
private static int getDeviceWidth(android.content.Context context) {
    android.view.WindowManager wm = ((android.view.WindowManager) (context.getSystemService(Context.WINDOW_SERVICE)));
    android.view.Display display = wm.getDefaultDisplay();
    return display.getWidth();
}

@java.lang.Override
public void onNewsUpdateFailed(java.lang.String section, java.lang.String message) {
    android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    mSwipeRefreshLayout.setRefreshing(false);
    mSwipeRefreshLayout.setEnabled(true);
    loading = true;
}

public void ProfileSetup(android.view.View view) {
    if (checkUser(this)) {
        android.content.Intent intent = new android.content.Intent(this, itsjustaaron.food.ProfileSetup.class);
        startActivity(intent);
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onFailure(retrofit2.Call<org.septa.android.app.services.apiinterfaces.model.NextArrivalDetails> call, java.lang.Throwable t) {
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == false) {
            szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
            fwdToMain();
        }
    }
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onStart()");
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((movieList.size()) > 0) {
        movieList.remove(0);
        showMovieTasteTest();
    }
}

public void deauthenticate() {
    java.lang.String return_value = JSONSendCmd("deauthenticate");
    android.util.Log.d(Consts.LOG_TAG, ("Deauthenticate Return Value " + return_value));
}

private void btnLocalMultiplayerClicked() {
    startActivity(new android.content.Intent(this, com.vintagetechnologies.menschaergeredichnicht.Spieloberflaeche.class));
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.reset();
    com.vintagetechnologies.menschaergeredichnicht.Impl.ActualGame.getInstance().setLocalGame(true);
}

@java.lang.Override
public void onResponse(com.wilee8.coyotereader2.gson.UserInfo response) {
    com.wilee8.coyotereader2.mUserId = response.getUserId();
    subscriber.onNext(null);
}

public static void test_235() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_TextScroll, testcase.Operation_ClickWait, "应用", "vertical");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/advanced");
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "修改系统设置");
    check(testcase.Object_Text, testcase.Operation_checkExist, "可修改系统设置");
}

private void commit(java.util.ArrayList<java.lang.Integer> selectedIds) {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(cwa115.trongame.FriendsListActivity.SELECTED_IDS_EXTRA, selectedIds);
    setResult(cwa115.trongame.RESULT_OK, data);
    finish();
}

public static com.alwaysrejoice.hexengine.dto.Game getGame() {
    return com.alwaysrejoice.hexengine.util.GameUtils.game;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if ((mPlayer) == null)
        return ;
    
    isOriginallyPlaying = mPlayer.isPlaying();
}

public void draw(android.graphics.Canvas canvas) {
    canvas.drawBitmap(resized, x, y, null);
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    if (false) {
        com.taobao.weex.WXSDKManager.getInstance().notifyTrimMemory();
    }
    if (false) {
        com.taobao.weex.WXSDKManager.getInstance().notifySerializeCodeCache();
    }
}

@java.lang.Override
public synchronized boolean isCached(java.lang.String key, long position, long length) {
    com.google.android.exoplayer.upstream.cache.CachedContent cachedContent = index.get(key);
    return (cachedContent != null) && (cachedContent.isCached(position, length));
}

@java.lang.Override
public void onSessionSuspended(com.google.android.gms.cast.framework.CastSession session, int reason) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    chooseCategory(0);
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
}

@android.support.annotation.Nullable
android.app.Activity getCurrent() {
    try {
        return activityStack.peek();
    } catch (java.util.EmptyStackException e) {
        return null;
    }
}

private android.net.Uri getDownloadUri() {
    return android.net.Uri.parse(getDownloadUrl());
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    if (bitmap != null) {
        imagePreview.setImageBitmap(bitmap);
    }
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    return true;
}

@java.lang.Override
public void notifyDataSetChanged() {
    super.notifyDataSetChanged();
    for (android.database.DataSetObserver observer : observes) {
        observer.onChanged();
    }
}

@java.lang.Override
public void stop() {
    super.stop();
    com.github.ybq.android.spinkit.animation.AnimationUtils.stop(sprites);
}

@java.lang.Override
public void onClick(android.view.View v) {
    final android.view.View rootView = getView();
    if ((mItem) != null) {
        mItem.set(mItem.getOriginal());
        setViews(rootView, mItem);
    }
}

private void stop() {
    stopProgress();
    audioState = pl.cprojekt.cpaudiopreview.CPAudio.AUDIO_STATE.STOPPED;
    mp.stop();
    setProgress(progressStartPos);
    showPlay();
}

private int createBundle(int varValueIndex) {
    int bundleIndex = com.rfo.basic.Run.theBundles.size();
    com.rfo.basic.Run.theBundles.add(new android.os.Bundle());
    com.rfo.basic.Run.NumericVarValues.set(varValueIndex, ((double) (bundleIndex)));
    return bundleIndex;
}

private android.widget.ScrollView createContentLayout(android.content.Context context) {
    android.widget.ScrollView sv = new android.widget.ScrollView(context);
    sv.setLayoutParams(new cn.bassy.library.widget.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
    return sv;
}

@java.lang.Override
protected void onGeometryTouched(com.metaio.sdk.jni.IGeometry geometry) {
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker numberPicker, int oldVal, int newVal) {
    quantityUnit = unitOptions[newVal];
}

public static void show(android.support.v7.app.AppCompatActivity activity, org.onebusaway.android.io.elements.ObaArrivalInfo arrival) {
    org.onebusaway.android.report.ui.ReportTripProblemFragment.show(activity, arrival, null, true);
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        expirationDatePicker.show();
    }
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
}

@java.lang.Override
public void run() {
    handleStartActivityDismissingKeyguard(intent, true);
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("called", "on destroy");
    dialog.dismiss();
}

public android.view.View getLastChild() {
    return getChildAt(((getChildCount()) - 1));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mMediaPlayer) {
    releaseMediaPlayer();
}

public com.example.caitlin.cookhelper.Recipe getRecipe(android.content.Context context, long id) {
    return new com.example.caitlin.cookhelper.DatabaseHandler(context).getRecipe(id);
}

@org.androidannotations.annotations.Click(value = R.id.activity_login_btn_login)
void setBtnLogin() {
    validator.validate();
}

@java.lang.Override
public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) {
    processAccessibilityEvent(event);
}

protected void onPostExecute(java.lang.Boolean success) {
}

protected void Back() {
    android.support.v4.app.FragmentManager FM = getActivity().getSupportFragmentManager();
    FM.beginTransaction().remove(this).commit();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.d(org.fraunhofer.cese.madcap.SignInActivity.TAG, "On start being called, now trying to silently log in");
}

@java.lang.Override
public void iconTextViewOnClick(android.support.v7.widget.RecyclerView.ViewHolder v, int position) {
    if (position == 0)
        stopAnimation(v, R.drawable.power_enable_icon);
    else
        stopAnimation(v, R.drawable.power_disable_icon);
    
}

private void reloadTimeline() {
    this.adapter.refresh(this.timelineRefreshCallback);
}

@java.lang.Override
public boolean isSignedIn() {
    return isSignedIn;
}

@java.lang.Override
public void onInitializationSuccess(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubePlayer player, boolean wasRestored) {
    mPlayer = player;
    if (!wasRestored) {
        mPlayer = player;
        mPlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
    }
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    canvasAngle = ((float) (animation.getAnimatedValue()));
}

@java.lang.Override
public void onClick(android.view.View view) {
    new ir.rasen.charsoo.model.business.DeleteBusiness(context, ir.rasen.charsoo.controller.helper.LoginInfo.getUserId(context), businessId).execute();
    dismiss();
}

