@java.lang.Override
public void onTaskDone() {
}

@org.junit.Test
public void testToRunAfterSync() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.recipeGrid)).perform(android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition(1, android.support.test.espresso.action.ViewActions.click()));
}

@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    buildGoogleApiClient();
    savedCallbackContext.success("disconnected");
}

@java.lang.Override
public void onClick(android.view.View view) {
    deckEmptyDialog.cancel();
    deck = new com.micste.busdriver.Deck();
    resetGame();
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    showPopupMenu(view);
    return true;
}

public void onServiceDisconnected(android.content.ComponentName className) {
    mStumblerService = null;
}

void loadImage(android.widget.ImageView imageView, int index);

@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onStart()");
    fwdToMain();
}

public void deleteBatch(com.github.jmuthu.poovali.model.Batch batch) {
    batchList.remove(batch);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    changeSong(position);
    layoutDrawer.closeDrawers();
}

protected static boolean isSupported(int formatSupport, boolean allowExceedsCapabilities) {
    int maskedSupport = formatSupport & (com.google.android.exoplayer2.RendererCapabilities.FORMAT_SUPPORT_MASK);
    return (maskedSupport == (com.google.android.exoplayer2.RendererCapabilities.FORMAT_HANDLED)) || (true && (maskedSupport == (com.google.android.exoplayer2.RendererCapabilities.FORMAT_EXCEEDS_CAPABILITIES)));
}

@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(com.holger.mashpit.TempChartActivity.DEBUG_TAG, "onDestroy");
    snb.stopEvents();
    super.onDestroy();
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_LINEAR_ACCELERATION))
        filterLinAccValues(event);
    
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.rupik.newstoday.NewsCategory category = newsCategories.get(position);
    return com.rupik.newstoday.SuperAwesomeCardFragment.newInstance(position, newsCategories);
}

private static void invalidate(android.content.Context context) {
    com.mishiranu.dashchan.widget.ClickableToast clickableToast = com.mishiranu.dashchan.widget.ClickableToast.TOASTS.get(com.mishiranu.dashchan.widget.ClickableToast.obtainBaseContext(context));
    if ((clickableToast != null) && (clickableToast.mShowing))
        clickableToast.updateLayoutAndRealClickable();
    
}

public void onEvent(java.lang.Object event) {
    if (event instanceof org.tribler.android.restapi.json.EventsStartEvent) {
        runOnUiThread(() -> {
            progressBar.setVisibility(View.GONE);
        });
    }
}

public void init(android.content.Context context) {
    if ((modelSql) == null) {
        modelSql = new com.example.nofarcohenzedek.dogo.Model.Sql.ModelSql(context);
    }
    if ((modelParse) == null) {
        modelParse = new com.example.nofarcohenzedek.dogo.Model.Parse.ModelParse(context);
    }
}

@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    if (android.util.Log.isLoggable(com.example.android.sunshine.app.DigitalWatchFaceService.TAG, Log.DEBUG)) {
        android.util.Log.d(com.example.android.sunshine.app.DigitalWatchFaceService.TAG, ("onConnected: " + connectionHint));
    }
    requestWeatherDataToPhone();
}

@java.lang.Override
public void onClick(android.view.View v) {
    B2.setText(null);
    b2.setVisibility(View.VISIBLE);
    B2.setVisibility(View.GONE);
    (tag_num)--;
}

public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    writeLatLongToScreen();
}

private static com.google.android.gms.wearable.Asset createAssetFromBitmap(android.graphics.Bitmap bitmap) {
    final java.io.ByteArrayOutputStream byteStream = new java.io.ByteArrayOutputStream();
    return com.google.android.gms.wearable.Asset.createFromBytes(byteStream.toByteArray());
}

private void resumeRemoteVideo() {
    if ((castSession) != null) {
        com.google.android.gms.cast.framework.media.RemoteMediaClient remoteMediaClient = castSession.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.play();
        }
    }
}

private void stopImgWork() {
    if (((m_DownloadImageTask) != null) && ((m_DownloadImageTask.getStatus()) == (com.google.android.gms.common.api.Status.RUNNING))) {
        m_DownloadImageTask.cancel(true);
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.teamlz.cheTajo.fragment.HomeListFragment.newIstance();
        case 1 :
            return com.teamlz.cheTajo.fragment.BlankFragment.newInstance(position);
    }
    return null;
}

@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    float trans = interpolatedTime * height;
    mToolbarLayout.setTranslationY((-trans));
    setWebViewTranslation((height - trans));
}

@java.lang.Override
@org.xwalk.core.internal.XWalkAPI(disableReflectMethod = true, preWrapperLines = { "        return;" })
public void setLayerType(int layerType, android.graphics.Paint paint) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.pm.ActivityInfo activityInfo = mResolveInfo.activityInfo;
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_MAIN).setClassName(activityInfo.applicationInfo.packageName, activityInfo.name).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.FileDownloadTask.TaskSnapshot taskSnapshot) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    startActivity(new android.content.Intent(this, io.rasprovers.remotus.activities.NewDownloadActivity.class));
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
}

@java.lang.Override
public void reloadListFragment() {
    final org.openbmap.activities.SessionListFragment sessionFrag = ((org.openbmap.activities.SessionListFragment) (getSupportFragmentManager().findFragmentByTag("session")));
    if (sessionFrag != null) {
        sessionFrag.refreshAdapter();
    }
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    displayItem(0, false);
}

public void setItemsArray(final java.util.List<?> list) {
    android.widget.ArrayAdapter<?> adapter = new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, list);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    setAdapter(adapter);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((player) != null) {
        player.setPlayWhenReady((!(player.getPlayWhenReady())));
    }
}

public static java.lang.String getAccessTokenPref(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String accessToken = sharedPreferences.getString(context.getString(R.string.access_token_pref_key), null);
    return accessToken;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initNavigationManager();
    initActionBarHelper();
    initViews();
    initActionBar();
}

@android.support.annotation.Nullable
public static java.lang.String getEngineIdentifier(@android.support.annotation.Nullable
final org.mozilla.gecko.search.SearchEngine searchEngine) {
    if (searchEngine == null) {
        return null;
    }
    final java.lang.String identifier = searchEngine.getIdentifier();
    return android.text.TextUtils.isEmpty(identifier) ? null : identifier;
}

public void onItemSelected(android.widget.AdapterView<?> Spinner_D2_Adapter_View, android.view.View v, int position, long row) {
    Spinner_D2_Choice = Spinner_D2_Adapter_View.getItemAtPosition(position).toString();
    findViewById(R.id.map).invalidate();
    onDraw(tempCanvas);
}

@java.lang.Override
public void onClick(android.view.View view) {
    checkAnswer(true);
}

@java.lang.Override
public void onCTPCallback(com.android.futures.entity.TradeEntity entity) {
    mMdSequence.add(entity);
    if ((entity.getType()) != (TradeEntity.type.MD)) {
        onTradeNotification(entity);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.exit(0);
}

@java.lang.Override
protected void onProgressUpdate(java.lang.Object... object) {
    super.onProgressUpdate(object);
}

@java.lang.Override
public void displaySurveyError() {
    snackBarManager.displaySnackBar(this, R.string.surveys_error, getContext());
}

public void previousClick(android.view.View view) {
    if ((currentPosition) > 0) {
        (currentPosition)--;
        viewPager.setCurrentItem(currentPosition, true);
        updateProgress();
    }else {
    }
}

public static android.content.UriMatcher buildUriMatcher() {
    android.content.UriMatcher uriMatcher = new android.content.UriMatcher(android.content.UriMatcher.NO_MATCH);
    uriMatcher.addURI(MovieContract.AUTHORITY, MovieContract.PATH_MOVIE, 100);
    uriMatcher.addURI(MovieContract.AUTHORITY, ((MovieContract.PATH_MOVIE) + "/#"), 101);
    return uriMatcher;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    displayItem(position, true);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent event) {
    return true;
}

protected void onStop() {
    mGoogleApiClient.disconnect();
    super.onStop();
}

@java.lang.Override
public void liked(com.like.LikeButton likeButton) {
    firebaseutils.setlike(offlinedata.Id);
    holder.favoriteButton.setLiked(true);
}

public android.database.Cursor getData() {
    android.database.Cursor cursor = db.query(HabitContract.HabitEntry.TABLE, null, null, null, null, null, null);
    cursor.moveToFirst();
    return cursor;
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((selectedButton) != null) {
        selectedButton.setBackgroundColor(Color.RED);
        selectedButton = null;
    }
}

@android.support.annotation.Nullable
@butterknife.OnClick(value = R.id.stop)
void stop() {
    presenter.stopStream();
}

@java.lang.Override
protected void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        default :
            super.handleMessage(msg);
            break;
    }
}

public boolean updateStorageLocation(android.content.Context ctx, java.lang.String mount) {
    updateStorageLocation(ctx);
    return true;
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    return inflater.inflate(containerLayout.layoutId, container, false);
}

public void onClick(android.view.View v) {
    final android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    ft.replace(R.id.main_frame, new nudelsquad.nudelcalendar.CreateTaskView(0), "NewFragmentTag");
    ft.commit();
}

public static java.lang.String decodeUrl(java.lang.String url) {
    if (url == null)
        return null;
    
    return jp.hazuki.yuzubrowser.utils.UrlUtils.decodeUrl(android.net.Uri.parse(url));
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    cordinations = (("X:" + (location.getLatitude())) + "Y:") + (location.getLongitude());
}

@java.lang.Override
public void onNetworkError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.e(im.vector.util.VectorCallManager.LOG_TAG, ("## startIpCall(): onNetworkError Msg=" + (e.getMessage())));
    callback.onStartCallFailed(e.getLocalizedMessage(), null);
}

private void nextActivity(java.lang.Class activity) {
    if (activity != null) {
        android.content.Intent intentActivity = new android.content.Intent(this, activity);
        startActivity(intentActivity);
    }
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    creatingNewFolder = false;
    onDialogDismiss();
}

protected android.content.Context getContext() {
    android.content.Context context = null;
    if ((this.weakContext) != null) {
        context = this.weakContext.get();
    }
    return context;
}

private java.lang.String getEditText() {
    android.widget.EditText name = ((android.widget.EditText) (findViewById(R.id.edit)));
    return name.getText().toString().trim();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    recoveryArrayList.clear();
    service_is_paused = false;
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (callbackManager.onActivityResult(requestCode, resultCode, data)) {
        return ;
    }
}

@java.lang.Override
public void onConnectionSuspended(int i) {
}

public static com.teegarcs.mocker.MatchingInterceptor getMatchingInterceptor(android.content.Context context) {
    return new com.teegarcs.mocker.MatchingInterceptor();
}

void onModeChanged(com.wolkabout.hexiwear.model.Mode mode) {
    this.mode = mode;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    com.abhijitvalluri.android.fitnotifications.TimePickerFragment dialog = com.abhijitvalluri.android.fitnotifications.TimePickerFragment.newInstance(mStartTimeHour, mStartTimeMinute, mStopTimeHour, mStopTimeMinute, com.abhijitvalluri.android.fitnotifications.AppSettingsActivity.START_TIME_REQUEST);
    dialog.show(manager, com.abhijitvalluri.android.fitnotifications.AppSettingsActivity.DIALOG_TIME);
}

@java.lang.Override
public void succeed() {
    mRVAdapter.setList(com.pkhope.diary.MyApplication.getDoc().getDiaryManager().getList());
    mRVAdapter.notifyDataSetChanged();
}

public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        loadImage(data.getData());
    }
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    nameEditText.setText("");
    priceEditText.setText("");
    quantityText.setText("0");
    suppliersEmailEditText.setText("");
}

public void startBrowser() {
    java.lang.String url = com.freedom.freeclient.freeclient.util.Util.readFromProxyFile(proxyFile);
    android.net.Uri uriUrl = android.net.Uri.parse(url);
    android.content.Intent launchBrowser = new android.content.Intent(android.content.Intent.ACTION_VIEW, uriUrl);
    startActivity(launchBrowser);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    if ((firstLaunch) && (!(getIntent().hasExtra(com.bubelov.coins.ui.activity.MapActivity.NOTIFICATION_AREA_EXTRA)))) {
        firstLaunch = false;
        moveToLastLocation();
    }
}

@java.lang.Override
public boolean performEditorAction(int editorAction) {
    boolean shouldConsume = false;
    switch (editorAction) {
        case android.view.inputmethod.EditorInfo.IME_ACTION_DONE :
            shouldConsume = mListener.onPostCodeEntryComplete();
    }
    return shouldConsume || (super.performEditorAction(editorAction));
}

@org.junit.Test
public void testGetPropertyHandler() {
    com.eclipsesource.tabris.maps.MapOperator operator = new com.eclipsesource.tabris.maps.MapOperator(org.mockito.Mockito.mock(android.app.Activity.class), org.mockito.Mockito.mock(com.eclipsesource.tabris.android.TabrisContext.class));
    com.eclipsesource.tabris.android.TabrisPropertyHandler propertyHandler = operator.getPropertyHandler(null);
    assertTrue((propertyHandler instanceof com.eclipsesource.tabris.maps.MapPropertyHandler));
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((listener) != null) {
        listener.sendImageToServer(filteredDeviceList.get(position).getId());
    }
}

public void registerUsageCallback(int networkType, java.lang.String subscriberId, long thresholdBytes, android.app.usage.NetworkStatsManager.UsageCallback callback) {
    registerUsageCallback(networkType, subscriberId, thresholdBytes, callback, null);
}

@retrofit2.http.GET(value = ((((("services/rest/?" + ((("format=json" + "&nojsoncallback=1") + "&extras=url_s") + "&method=")) + (com.rpham64.android.photogallery.network.CoreApi.METHOD_SEARCH)) + "&api_key=") + (com.rpham64.android.photogallery.network.CoreApi.API_KEY)) + "&sort=") + (com.rpham64.android.photogallery.network.CoreApi.SORT_RELEVANCE))
rx.Observable<com.rpham64.android.photogallery.network.response.FlickrResponse> getPhotosBySearchRx(@retrofit2.http.Query(value = "page")
int page, @retrofit2.http.Query(value = "text")
java.lang.String query);

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d(com.rokid.movie.activity.MainActivity.TAG, ("onResume startPlay : " + (videoCommand.isStartedPlay())));
    if ((videoCommand) != null)
        videoCommand.resumePlay();
    
}

private com.mapbox.services.android.telemetry.location.LocationEngine getLocationEngine() {
    return (locationEngine) == null ? new com.mapbox.services.android.location.LostLocationEngine(context) : locationEngine;
}

@java.lang.Override
public void onClick(com.afollestad.materialdialogs.MaterialDialog dialog, com.afollestad.materialdialogs.DialogAction which) {
    com.adithyaupadhya.database.sharedpref.AppPreferenceManager.getAppPreferenceInstance(this).clearAllUserPreferenceData();
    startActivity(new android.content.Intent(this, com.adithyaupadhya.moviemaniac.login.SignInActivity.class));
    finish();
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    this.hasFocus = hasFocus;
    if ((this.onFocusChangeListener) != null) {
        this.onFocusChangeListener.onFocusChange(v, hasFocus);
    }
    focusChangedEvent();
}

public void onClick(android.view.View arg0) {
    stringBuffer.append("+");
    input.setText(stringBuffer.toString());
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent callIntent = new android.content.Intent(android.content.Intent.ACTION_CALL);
    callIntent.setData(android.net.Uri.parse(("tel:+" + (property.value))));
    startActivity(callIntent);
}

public void disconnect() {
    ((net.sharksystem.android.protocols.wifidirect.WifiDirectStreamStub) (currentStub)).disconnect();
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.d(Constants.DEBUG_TAG, "NotificationService : onUnbind");
    return super.onUnbind(intent);
}

public void showConfirmDelete() {
    android.app.DialogFragment dialog = new com.tanona.bill.positiveplasma.ConfirmDelete();
    dialog.show(getFragmentManager(), "ConfirmDelete");
}

public void onClick(android.content.DialogInterface dialog, int which) {
    if (which < (available.size())) {
        add(available.get(which));
    }else {
        showBroadcastTileDialog();
    }
}

@java.lang.Override
public void onError() {
    android.widget.Toast.makeText(getActivity(), "信息暂时无法加载", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onViewDetachedFromWindow(android.view.View v) {
    parent.onDismiss(this);
}

@java.lang.Override
public void onAttachFragment(android.support.v4.app.Fragment fragment) {
    fragList.add(new java.lang.ref.WeakReference(fragment));
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.raizlabs.android.dbflow.config.FlowManager.init(new com.raizlabs.android.dbflow.config.FlowConfig.Builder(this).build());
}

@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    saveScaledPhoto(data, true);
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    return new android.app.DatePickerDialog(getActivity(), ((com.thonners.crosswordmaker.HomeActivity) (getActivity())), startYear, startMonth, startDay);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.example.attracti.audiorecorderpicture.adapters.RecyclerViewAdapter adapter = ((com.example.attracti.audiorecorderpicture.adapters.RecyclerViewAdapter) (list.getAdapter()));
    adapter.notifyDataSetChanged();
}

private void updateSummaryList(java.lang.String key) {
    android.preference.ListPreference updatedPref = ((android.preference.ListPreference) (settingsFragment.findPreference(key)));
    updatedPref.setSummary(updatedPref.getEntry());
}

@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
    android.widget.Toast.makeText(this, R.string.login_toast_error_identification, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, R.string.ipNotReached, Toast.LENGTH_LONG).show();
}

