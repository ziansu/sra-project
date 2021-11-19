@java.lang.Override
public void onClick(android.view.View view) {
    startActivity(new android.content.Intent(getApplicationContext(), appcorp.mmb.activities.feeds.ManicureFeed.class));
}

public void setLoadMoreEnabled(boolean loadMoreEnabled) {
    isLoadMoreEnabled = loadMoreEnabled;
    if ((com.kogimobile.android.baselibrary.app.base.recyclerview.BaseFragmentMVPList.getAdapter()) != null) {
        com.kogimobile.android.baselibrary.app.base.recyclerview.BaseFragmentMVPList.getAdapter().setLoadMoreEnabled(loadMoreEnabled);
    }
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    android.util.Log.d(se.anotherhermit.voxels.GLESView.MyGestureListener.DEBUG_TAG, "onDoubleTap");
    se.anotherhermit.voxels.GLESView.doubleTap();
    return super.onDoubleTap(e);
}

protected void onPostExecute(java.util.ArrayList<java.lang.String> alerts) {
    caller.asyncResponse(alerts);
}

private void hideSubmitBarFragment(android.app.Fragment submitBarFragment) {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
    ft.hide(submitBarFragment);
    ft.commit();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(JsonKeys.VIDEO_POSITION_KEY, videoPosition);
    outState.putParcelable(JsonKeys.VIDEO_DATA_KEY, stepItem);
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onError(java.lang.Throwable t) {
    onConnectionError();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.READ_CONTACTS }, MY_PERMISSIONS_REQUEST_READ_CONTACTS);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    checkedItems[((int) (buttonView.getTag()))] = isChecked;
    activity.onItemSelected();
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_choose_market);
    findViews();
    setListeners();
    supportActionBar();
    setSearchSuggestionAdapter();
    initRececlerView();
}

@java.lang.Override
protected void onPostExecute(upv.ejercicios.proyectofinal.quierosermillonario.model.taskParams.HighScoresTableParams highScoresTableParams) {
    super.onPostExecute(highScoresTableParams);
    android.widget.TableLayout highScoresTable;
    highScoresTable = ((android.widget.TableLayout) (findViewById(R.id.user_high_scores_table_view)));
    if (highScoresTableParams != null)
        displayInTable(highScoresTable, highScoresTableParams.getGameScoreList());
    
}

@java.lang.SuppressWarnings(value = "unused")
public void expand(java.lang.String url) {
    android.util.Log.d("TEST", "expand with url");
    loadUrl(url);
    expand();
}

public void setRestoreItemClicked(int clickedPosition) {
    if (twoPane) {
        android.util.Log.v(LOG_TAG, "GOT HERE134");
        ((example.com.popularmovies.Main.MovieMainFragment.MovieMainListener) (context)).itemClicked(movieList.get(clickedPosition), clickedPosition, null);
    }
}

protected org.androidannotations.internal.model.AnnotationElements validateAnnotations(org.androidannotations.internal.model.AnnotationElements extractedModel, org.androidannotations.internal.model.AnnotationElementsHolder validatingHolder) {
    timeStats.start("Validate Annotations");
    org.androidannotations.internal.process.ModelValidator modelValidator = new org.androidannotations.internal.process.ModelValidator(androidAnnotationsEnv);
    org.androidannotations.internal.model.AnnotationElements validatedAnnotations = modelValidator.validate(extractedModel, validatingHolder);
    timeStats.stop("Validate Annotations");
    return validatedAnnotations;
}

public void onClick(android.view.View button) {
    int[] location = new int[2];
    cb.getLocationOnScreen(location);
    mColorId = (cb.isChecked()) ? com.sharad.epocket.AddCategoryActivity.UNASSIGNED : color;
    updateColorGroup(cb);
}

public boolean CheckEmailFormat(java.lang.String emailAddress) {
    emailAddress.trim();
    if (emailAddress == null) {
        return false;
    }else {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches();
    }
}

public void layoutInit() {
    android.widget.TextView textView4 = ((android.widget.TextView) (findViewById(R.id.textView4)));
    textView4.setText(android.text.Html.fromHtml(getString(R.string.sign_up_link)));
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
protected void setFragment(android.app.Fragment fragment) {
    android.app.FragmentManager fm = getFragmentManager();
    android.app.FragmentTransaction transaction = fm.beginTransaction();
    transaction.replace(R.id.id_content, fragment);
    transaction.commit();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.amazingcoders_android.activities.VenuePageActivity.class);
    intent.putExtra("id", venue.id);
    startActivity(intent);
}

public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    org.indywidualni.fblite.webview.MyWebViewClient.webView.loadUrl(page.get(position));
    dialog.dismiss();
}

@java.lang.Override
public void onLike() {
    liked[position] = !(liked[position]);
    setLikeDrawable();
    com.lupolupo.android.controllers.retrofit.LupolupoHTTPManager.getInstance().postLikeUnlike(episodeData.id, liked[position]);
}

public boolean onOptionsItemSelectedImpl(@android.support.annotation.NonNull
V v, android.view.MenuItem item) {
    VP presenter = getPresenter(v, false);
    return (presenter != null) && (presenter.onOptionsItemSelected(v, item));
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    if (exitOnFinish) {
        getActivity().finish();
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    return super.onCreateOptionsMenu(menu);
}

public void fetchMovieGallery(int movieIdForQuery) {
    galleryTask = new com.example.android.popularmovies.fetchRawJSON.FetchMovieGalleryTask(getActivity(), ((android.support.v4.view.ViewPager) (getView().findViewById(R.id.pager))));
    galleryTask.execute(java.lang.Integer.toString(movieIdForQuery));
}

public static void changeVirtualizerLevel(android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, com.fesskiev.player.services.PlaybackService.class);
    intent.setAction(com.fesskiev.player.services.PlaybackService.ACTION_PLAYBACK_VIRTUALIZER_LEVEL);
    context.startService(intent);
}

@com.fasterxml.jackson.annotation.JsonIgnore
public void setMyImage(android.graphics.Bitmap myImage) {
    this.myImage = myImage;
}

@java.lang.Override
public void onMultiPageStateChanged(boolean isMultiPage) {
    if ((paginationView) != null) {
        paginationView.show(isMultiPage);
    }
}

@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.dbquerycard, parent, false);
    com.zhangwx.z_utils.Z_DB.DataBaseActivity.DBAdapter.DBViewHolder viewHolder = new com.zhangwx.z_utils.Z_DB.DataBaseActivity.DBAdapter.DBViewHolder(view);
    return viewHolder;
}

@javax.annotation.Nullable
public static org.dbtools.android.domain.LocalDateTime longToLocalDateTimeUtc(@javax.annotation.Nullable
java.lang.Long l) {
    if (l == null) {
        return null;
    }
    return org.dbtools.android.domain.Instant.ofEpochMilli(l).atZone(ZoneOffset.UTC).toLocalDateTime();
}

private void addMarker(com.whiterabbit.pisabike.model.Station s) {
    mClusterManager.addItem(new com.whiterabbit.pisabike.screens.map.MapItem(s));
}

@android.support.annotation.Nullable
public java.lang.Object getCache(java.lang.String name) {
    try {
        return com.xushuzhan.quiltnews.cache.CacheFileManger.readFromCache(name);
    } catch (java.io.IOException e) {
        return null;
    }
}

protected me.gujun.android.taggroup.TagGroup.TagView getLastNormalTagView() {
    final int lastNormalTagIndex = (isAppendMode) ? (getChildCount()) - 2 : (getChildCount()) - 1;
    return getTagAt(lastNormalTagIndex);
}

public void onLocationChanged(android.location.Location location) {
    makeUseOfNewLocation(location, callbackContext);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
        case R.id.action_finish :
            setResult(BaseActivity.CODE_RESULT_CHANGED);
            finish();
            break;
    }
    return true;
}

@java.lang.Override
public void onStop() {
    super.onStop();
    android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out);
    relativeLayout.startAnimation(animation);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (mDrawerToggle.onOptionsItemSelected(item)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.CheckBox checkBox = ((android.widget.CheckBox) (v));
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mTextView = ((android.widget.TextView) (findViewById(R.id.msg_view)));
    startServer();
}

@java.lang.Override
public void onTouched(nl.saxion.act.playground.model.GameBoard gameBoard) {
}

public void init(final android.content.Context context) {
    if ((sharedPreferences) == null) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context set.");
        }
        sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    }
}

public java.lang.String cleanEmail(android.widget.EditText email) {
    return email.getText().toString().replaceAll("\\.", "");
}

@java.lang.Override
public void onClick(android.view.View view) {
    onSupportNavigateUp();
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == 0) && (resultCode == (RESULT_OK))) {
        fragmentSwitcher.updateFragment();
    }
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
}

@java.lang.Override
public void onLoadComplete(android.media.SoundPool soundPool, int sampleId, int status) {
    com.huhx0015.hxaudio.utils.HXLog.d(com.huhx0015.hxaudio.audio.HXSoundEngine.LOG_TAG, (("READY (" + (engineID)) + "): onLoadComplete(): The SoundPool object is ready."));
    playSoundFx(sampleId, isLoop, volume);
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return object == view;
}

@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    if ((dialog.getWindow()) != null) {
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    }
    return dialog;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    saveTask.execute();
    org.catrobat.paintroid.dialog.LayersDialog.getInstance().resetLayer();
    startLoadImageIntent();
}

public static ru.spbau.mit.foodmanager.MenuStorage getInstance() {
    if ((ru.spbau.mit.foodmanager.MenuStorage.instance) == null) {
        ru.spbau.mit.foodmanager.MenuStorage.instance = new ru.spbau.mit.foodmanager.MenuStorage(ru.spbau.mit.foodmanager.CookBookStorage.getInstance());
    }
    return ru.spbau.mit.foodmanager.MenuStorage.instance;
}

protected float[] getMvMatrix(float[] mMatrix, float[] vMatrix) {
    android.opengl.Matrix.multiplyMM(mvMatrix, 0, vMatrix, 0, mMatrix, 0);
    return mvMatrix;
}

public void onNewQuestionClick(android.view.MenuItem item) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.cp1.translator.fragments.AskQuestionFragment askQuestionFragment = com.cp1.translator.fragments.AskQuestionFragment.newInstance();
    askQuestionFragment.show(fm, "AskQuestion");
}

@java.lang.Override
public void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, android.os.Bundle newOptions) {
    super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
    android.util.Log.d("MainWidget", "onAppWidgetOptionsChanged");
}

public static com.example.administrator.leehom.fragment.ThridFragment getInstance() {
    android.os.Bundle bundle = new android.os.Bundle();
    com.example.administrator.leehom.fragment.ThridFragment thridFragment = new com.example.administrator.leehom.fragment.ThridFragment();
    thridFragment.setArguments(bundle);
    return thridFragment;
}

protected void loadPageSync(java.lang.String title, @android.support.annotation.NonNull
org.wikipedia.Site site, @android.support.annotation.NonNull
org.wikipedia.page.PageLoadLatchCallback callback) {
    getActivity().setPageLoadCallbacks(callback);
    loadPage(title, site);
    callback.await();
}

public static boolean satisfiesTextContrast(int backgroundColor, int foregroundColor) {
    return (com.android.internal.util.NotificationColorUtil.calculateContrast(foregroundColor, backgroundColor)) >= 4.5;
}

@java.lang.Override
public void onAnimationUpdate(final android.animation.ValueAnimator animation) {
    pbProgress.setProgress(((int) (animation.getAnimatedValue())));
}

@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    android.util.Log.d(TAG, "Search results read");
    android.content.Intent intent = new android.content.Intent(this, com.inhand.inhandappbeta.ResultsActivity.class);
    com.inhand.inhandappbeta.DataHolder.getInstance().setData(url);
    startActivity(intent);
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    if ((savedInstanceState != null) && (savedInstanceState.getBoolean("isConflict", false)))
        return ;
    
    super.onActivityCreated(savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mPhoneTwoEditTextString = mPhoneTwoEditText.getText().toString();
    if (validateEditText()) {
        sendingDataToServer();
    }
}

@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    android.util.Log.d("DEBUG_TAG", "On SingleTapUp OscMode Event!");
    return super.onSingleTapUp(e);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ctrl);
    initRobotControl();
    initInfoView();
    initHandler();
    initVideoView();
    initTestBtn();
    initMoveBtns();
    initServoBtns();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    com.ufone.uess.UserAuthentication.unauthenticate();
    finish();
    android.content.Intent intent = new android.content.Intent(this, com.ufone.uess.LoginActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = this.getIntent();
    startActivityForResult(intent, 1);
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_yes :
            c.finish();
            break;
        default :
            break;
    }
    dismiss();
}

@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    progressBar.setVisibility(View.GONE);
    recyclerView.setVisibility(View.GONE);
    if (v != null) {
        android.support.design.widget.Snackbar.make(v, "Unable to load fake people", Snackbar.LENGTH_LONG).show();
    }
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    com.example.sunshinewatch.MyWatchFace.Engine engine = mWeakReference.get();
    if (engine != null) {
        switch (msg.what) {
            case com.example.sunshinewatch.MyWatchFace.MSG_UPDATE_TIME :
                break;
        }
    }
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    getData("n2");
    getData("p2");
}

@java.lang.Override
public void onClick(android.view.View view) {
    spinner.setVisibility(View.VISIBLE);
    new com.udacity.gradle.builditbigger.JokeEndpointsAsyncTask().execute(new android.support.v4.util.Pair<android.content.Context, java.lang.Integer>(getContext(), (-1)));
}

private java.util.Set<java.lang.String> getStringSetFromSharedPreferences(java.lang.String preferenceName) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    return new java.util.HashSet<java.lang.String>(prefs.getStringSet(preferenceName, new java.util.HashSet<java.lang.String>()));
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mItemClickListener) != null) {
        mItemClickListener.onItemClick(viewHolder, mDatas.get(position), position, viewType);
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return amai.org.conventions.events.activities.ProgrammeDayFragment.newInstance(getDate(position), delayScrolling);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_input_flights);
    FlightNoEnter = ((android.widget.EditText) (findViewById(R.id.FlNoEnter)));
    DateEnter = ((android.widget.EditText) (findViewById(R.id.FlightDateEnter)));
}

private void toast(java.lang.String message) {
    android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.signInButton :
            signIn();
            break;
    }
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.d("WiFiDBC", "Peer Discovery ready");
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    int result = super.onStartCommand(intent, flags, startId);
    return result;
}

private void openErrorPopup() {
    android.widget.Toast.makeText(this, R.string.input_error_msg, Toast.LENGTH_SHORT).show();
}

public static void updatePilot(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.pilot.AirMapPilot pilot, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.pilot.AirMapPilot> callback) {
    if (pilot != null) {
        com.airmap.airmapsdk.networking.services.PilotService.updatePilot(pilot, callback);
    }
}

public boolean store(android.content.Context context) {
    boolean wasStore;
    if (hasPrimaryKeyValue())
        wasStore = update(context);
    else
        wasStore = insert(context, false);
    
    return wasStore;
}

public void incrementCounter(android.view.View v) {
    selectedCounter.setCurrentValue(((selectedCounter.getCurrentValue()) + 1));
    selectedCounter.setDate(new java.util.Date());
    updateCurrentValueField();
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    return super.dispatchTouchEvent(ev);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new android.support.v4.app.Fragment();
        case 1 :
            return new com.dismas.imaya.info_parks.GameReservesFragment();
    }
    return null;
}

@butterknife.OnClick(value = R.id.buttonAddTurn)
public void addInning(android.view.View view) {
    showAddTurnDialog();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bluetooth__app);
    bT = new com.example.bluetooth_app.Bluetooth(this);
    bT.isCompat();
    bT.getAdapter();
}

@java.lang.Override
public void onBeaconStoppedSeeking() {
    android.util.Log.d("BEACON", "Beacon stopped");
}

private void finish() {
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    readMarkerView.setVisibility(View.GONE);
}

public void goToTexting() {
    startActivity(new android.content.Intent(this, com.example.guy.smsclassproject.TextingActivity.class));
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mPresenter.copy(mAskAdapter.getItem(((java.lang.Integer) (v.getTag()))));
    return true;
}

public com.google.android.gms.maps.model.LatLng getLocation() {
    if ((latitude) != 0.0)
        return new com.google.android.gms.maps.model.LatLng(latitude, longitude);
    else
        return null;
    
}

@java.lang.Override
protected com.shadark.android.react.amaps.mapview.ATextureMapView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    com.amap.api.maps.AMapOptions options = new com.amap.api.maps.AMapOptions();
    return new com.shadark.android.react.amaps.mapview.ATextureMapView(reactContext, mAppContext, this, options);
}

public void Action_Signup(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, project.tp.whattocook.Signup.class);
    this.startActivity(intent);
}

public void show(int x, int y, @android.support.annotation.Nullable
android.view.animation.Animation.AnimationListener listener) {
    show(x, y, me.yugy.github.reveallayout.RevealLayout.DEFAULT_DURATION, listener);
}

public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int prevPosition = floorPosition(seekBar.getProgress(), 0, false);
    musicService.seekTo(prevPosition);
    seekBar.setProgress(prevPosition);
    ignoreSeekBar = false;
}

public void onSettingsButtonClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.sensei.easycalc.SettingsActivity.class);
    startActivity(intent);
}

public void onWakeupReceived(android.content.Context applicationContext, android.content.Intent intent) {
    com.magnet.mmx.client.common.Log.d(com.magnet.mmx.client.api.MMX.TAG, "onWakeupReceived() start");
    com.magnet.mmx.client.api.MMX.wakeup(applicationContext, intent);
}

@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    view.loadUrl(url);
    return false;
}

public void loginUser(java.lang.String username, java.lang.String password, final com.onehilltech.gatekeeper.android.ResponseListener<com.onehilltech.gatekeeper.android.model.UserToken> listener) {
    this.client_.getUserToken(username, password, listener);
}

