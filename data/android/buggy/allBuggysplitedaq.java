@java.lang.Override
public void onTaskDone() {
    ((android.support.v7.app.ActionBarActivity) (getActivity())).setSupportProgressBarIndeterminateVisibility(false);
}

@org.junit.Test
public void testToRunAfterSync() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.recipeGrid)).perform(android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition(0, android.support.test.espresso.action.ViewActions.click()));
}

@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    mGoogleApiClient = buildGoogleApiClient();
    savedCallbackContext.success("disconnected");
}

@java.lang.Override
public void onClick(android.view.View view) {
    deckEmptyDialog.cancel();
    resetGame();
    deck = new com.micste.busdriver.Deck();
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    showPopupMenu(view);
    return false;
}

public void onServiceDisconnected(android.content.ComponentName className) {
    mStumblerService = null;
    android.util.Log.d(LOG_TAG, "Service disconnected", new java.lang.Exception());
}

void loadImage(android.widget.ImageView imageView, java.lang.String url, int index);

@java.lang.Override
protected void onStart() {
    super.onStart();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == null) {
            szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
            fwdToMain();
        }
    }
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onStart()");
}

public void deleteBatch(android.content.Context context, int position) {
    com.github.jmuthu.poovali.model.Batch batch = batchList.get(position);
    batchList.remove(position);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    changeSong(position);
    play();
    layoutDrawer.closeDrawers();
}

protected static boolean isSupported(int formatSupport, boolean allowExceedsCapabilities) {
    int maskedSupport = formatSupport & (com.google.android.exoplayer2.RendererCapabilities.FORMAT_SUPPORT_MASK);
    return (maskedSupport == (com.google.android.exoplayer2.RendererCapabilities.FORMAT_HANDLED)) || (allowExceedsCapabilities && (maskedSupport == (com.google.android.exoplayer2.RendererCapabilities.FORMAT_EXCEEDS_CAPABILITIES)));
}

@java.lang.Override
protected void onDestroy() {
    android.util.Log.i(com.holger.mashpit.TempChartActivity.DEBUG_TAG, "onDestroy");
    MashPit.sensors.clear();
    snb.stopEvents();
    super.onDestroy();
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_ACCELEROMETER))
        filterAccValues(event);
    else
        if ((event.sensor.getType()) == (android.hardware.Sensor.TYPE_LINEAR_ACCELERATION))
            filterLinAccValues(event);
        
    
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.rupik.newstoday.NewsCategory category = newsCategories.get(position);
    return com.rupik.newstoday.SuperAwesomeCardFragment.newInstance(position, category);
}

private static void invalidate(android.content.Context context) {
    com.mishiranu.dashchan.widget.ClickableToast clickableToast = com.mishiranu.dashchan.widget.ClickableToast.TOASTS.get(com.mishiranu.dashchan.widget.ClickableToast.obtainBaseContext(context));
    if ((clickableToast != null) && (clickableToast.mShowing))
        clickableToast.updateLayoutAndRealClickable(false);
    
}

public void onEvent(java.lang.Object event) {
    android.util.Log.w("onEvent", (" " + event));
    if (event instanceof org.tribler.android.restapi.json.EventsStartEvent) {
        runOnUiThread(() -> {
            progressBar.setVisibility(View.GONE);
        });
    }
}

public void init(android.content.Context context) {
    modelSql = new com.example.nofarcohenzedek.dogo.Model.Sql.ModelSql(context);
    modelParse = new com.example.nofarcohenzedek.dogo.Model.Parse.ModelParse(context);
}

@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    if (android.util.Log.isLoggable(com.example.android.sunshine.app.DigitalWatchFaceService.TAG, Log.DEBUG)) {
        android.util.Log.d(com.example.android.sunshine.app.DigitalWatchFaceService.TAG, ("onConnected: " + connectionHint));
    }
    requestWeatherDataToPhone();
    updateConfigDataItemAndUiOnStartup();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(B1.getText().equals(""))) {
        b2.setVisibility(View.VISIBLE);
        B2.setVisibility(View.GONE);
        (tag_num)--;
    }
}

public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    java.lang.System.out.println("***STATUS_CHANGED");
    writeLatLongToScreen();
}

private static com.google.android.gms.wearable.Asset createAssetFromBitmap(android.graphics.Bitmap bitmap) {
    final java.io.ByteArrayOutputStream byteStream = new java.io.ByteArrayOutputStream();
    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteStream);
    return com.google.android.gms.wearable.Asset.createFromBytes(byteStream.toByteArray());
}

private void resumeRemoteVideo() {
    timber.log.Timber.d("VideoDetailsFragment : resumeRemoteVideo()");
    if ((castSession) != null) {
        com.google.android.gms.cast.framework.media.RemoteMediaClient remoteMediaClient = castSession.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.play();
        }
    }
}

private void stopImgWork() {
    if ((m_DownloadImageTask.getStatus()) == (com.google.android.gms.common.api.Status.RUNNING)) {
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
        default :
            return null;
    }
}

@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    float trans = interpolatedTime * totalHeight;
    mToolbarLayout.setTranslationY((trans - totalHeight));
    setWebViewTranslation(trans);
}

@java.lang.Override
@org.xwalk.core.internal.XWalkAPI
public void setLayerType(int layerType, android.graphics.Paint paint) {
    if (layerType != (LAYER_TYPE_SOFTWARE)) {
        super.setLayerType(layerType, paint);
    }else {
        android.util.Log.w(org.xwalk.core.internal.XWalkViewInternal.TAG, "LAYER_TYPE_SOFTWARE is not supported by XwalkView");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.pm.ActivityInfo activityInfo = mResolveInfo.activityInfo;
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_MAIN).setClassName(activityInfo.applicationInfo.packageName, activityInfo.name).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(i);
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.FileDownloadTask.TaskSnapshot taskSnapshot) {
    android.widget.Toast.makeText(this, "Transcript Download Complete", Toast.LENGTH_SHORT).show();
    mProgress.dismiss();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    startActivity(new android.content.Intent(this, io.rasprovers.remotus.activities.NewDownloadActivity.class));
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    running = true;
    progressDialog = android.app.ProgressDialog.show(this, "", "Please wait...", true, false);
    progressDialog.setCanceledOnTouchOutside(true);
}

@java.lang.Override
public void reloadListFragment() {
    android.util.Log.i(org.openbmap.activities.StartscreenActivity.TAG, "Refreshing session list fragment");
    final org.openbmap.activities.SessionListFragment sessionFrag = ((org.openbmap.activities.SessionListFragment) (getSupportFragmentManager().findFragmentByTag("session")));
    if (sessionFrag != null) {
        sessionFrag.refreshAdapter();
    }
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    displayItem(0);
}

public void setItemsArray(final java.util.List<?> list) {
    android.widget.ArrayAdapter<?> adapter = new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, list);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mSpinner.setAdapter(adapter);
}

@java.lang.Override
public void onClick(android.view.View view) {
    player.setPlayWhenReady((!(player.getPlayWhenReady())));
}

public static java.lang.String getAccessTokenPref(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String accessToken = sharedPreferences.getString(context.getString(R.string.access_token_pref_key), "0");
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
    setUpFragments();
}

@android.support.annotation.Nullable
public static java.lang.String getEngineIdentifier(final org.mozilla.gecko.search.SearchEngine searchEngine) {
    final java.lang.String identifier = searchEngine.getIdentifier();
    return android.text.TextUtils.isEmpty(identifier) ? null : identifier;
}

public void onItemSelected(android.widget.AdapterView<?> Spinner_D2_Adapter_View, android.view.View v, int position, long row) {
    Spinner_D2_Choice = Spinner_D2_Adapter_View.getItemAtPosition(position).toString();
    onDraw(tempCanvas);
    findViewById(R.id.map).invalidate();
}

@java.lang.Override
public void onClick(android.view.View view) {
    checkAnswer(false);
}

@java.lang.Override
public void onCTPCallback(com.android.futures.entity.TradeEntity entity) {
    entity.setInstrument(mCurrentInstrument);
    mMdSequence.add(entity);
    if ((entity.getType()) != (TradeEntity.type.MD)) {
        onTradeNotification(entity);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    submitAnswer(true);
}

@java.lang.Override
protected void onProgressUpdate(java.lang.Object... object) {
    super.onProgressUpdate(object);
    android.util.Log.d("progressUpdate", (("progress: " + (((java.lang.Integer) (object[0])) * 2)) + "%"));
}

@java.lang.Override
public void displaySurveyError() {
    android.view.View coordinatorLayout = getRootView().findViewById(R.id.coordinator_layout);
    snackBarManager.displaySnackBar(coordinatorLayout, R.string.surveys_error, getContext());
}

public void previousClick(android.view.View view) {
    (currentPosition)--;
    viewPager.setCurrentItem(currentPosition, true);
    updateProgress();
}

public static android.content.UriMatcher buildUriMatcher() {
    android.content.UriMatcher uriMatcher = new android.content.UriMatcher(android.content.UriMatcher.NO_MATCH);
    me.androidbox.busbymovies.data.MovieContentProvider.sUriMatcher.addURI(MovieContract.AUTHORITY, MovieContract.PATH_MOVIE, 100);
    me.androidbox.busbymovies.data.MovieContentProvider.sUriMatcher.addURI(MovieContract.AUTHORITY, ((MovieContract.PATH_MOVIE) + "/#"), 101);
    return uriMatcher;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    displayItem(position);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    adapter = new com.alexgilleran.hiitme.activity.ProgramListFragment.ProgramAdapter(com.alexgilleran.hiitme.data.ProgramDAOSqlite.getInstance(getActivity().getApplicationContext()).getProgramList());
    setListAdapter(adapter);
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent event) {
    android.util.Log.e(com.coralcreations.mylittlescoreapp.ScoreView.MyGestureListener.DEBUG_TAG, "ScoreView onDown()");
    return true;
}

protected void onStop() {
    LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, ((com.google.android.gms.location.LocationListener) (this)));
    if ((mGoogleApiClient) != null) {
        mGoogleApiClient.disconnect();
    }
    super.onStop();
}

@java.lang.Override
public void liked(com.like.LikeButton likeButton) {
    firebaseutils.setlike(offlinedata.Id);
    holder.favoriteButton.setLiked(true);
    android.widget.Toast.makeText(com.example.massa.luxvilla.adaptadores.adaptadorrvtodasoffline.ctx, offlinedata.Id, Toast.LENGTH_LONG).show();
}

public android.database.Cursor getData() {
    android.database.Cursor cursor = db.rawQuery(("SELECT * FROM " + (HabitContract.HabitEntry.TABLE)), null);
    cursor.moveToFirst();
    return cursor;
}

@java.lang.Override
public void onClick(android.view.View view) {
    selectedButton.setBackgroundColor(Color.RED);
}

@android.support.annotation.Nullable
@butterknife.OnClick(value = R.id.stop)
void stop() {
    presenter.stopStream(getCachedMelody());
}

@java.lang.Override
protected void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.oneplus.camera.ui.PreviewGallery.MSG_START_BURST_CAPTURE :
            this.startBurstCapture();
            break;
        default :
            super.handleMessage(msg);
            break;
    }
}

public void updateStorageLocation(android.content.Context ctx, java.lang.String mount) {
    updateStorageLocation(ctx);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    com.defch.blogwbly.util.LogUtil.v(com.defch.blogwbly.fragments.FragmentContainer.TAG, java.lang.Integer.toString(containerLayout.key));
    return inflater.inflate(containerLayout.layoutId, container, false);
}

public void onClick(android.view.View v) {
    final android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    ft.replace(R.id.main_frame, new nudelsquad.nudelcalendar.CreateTaskView(1), "NewFragmentTag");
    ft.commit();
}

public static java.lang.String decodeUrl(java.lang.String url) {
    if (url == null)
        return null;
    
    return jp.hazuki.yuzubrowser.utils.UrlUtils.decodeUrl(android.net.Uri.parse(url)).toString();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if ((startAndStopBool) == true) {
    }else {
        cordinations = (("X:" + (location.getLatitude())) + "Y:") + (location.getLongitude());
    }
}

@java.lang.Override
public void onNetworkError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.e(im.vector.util.VectorCallManager.LOG_TAG, ("## startIpCall(): onNetworkError Msg=" + (e.getMessage())));
    callback.onStartCallFailed(e.getLocalizedMessage());
}

private void nextActivity(java.lang.Class activity) {
    android.content.Intent intentActivity = new android.content.Intent(this, activity);
    startActivity(intentActivity);
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    onDialogDismiss();
    creatingNewFolder = false;
}

protected android.content.Context getContext() {
    android.content.Context context = null;
    if ((weakContext) != null) {
        context = weakContext.get();
    }
    return context;
}

private java.lang.String getEditText() {
    android.widget.EditText name = ((android.widget.EditText) (findViewById(R.id.edit)));
    return name.getText().toString();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    recoveryArrayList.clear();
    acceleratorArrayList.clear();
    service_is_paused = false;
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    callbackManager.onActivityResult(requestCode, resultCode, data);
}

@java.lang.Override
public void onConnectionSuspended(int i) {
    android.widget.Toast.makeText(this, "onConnectionSuspended", Toast.LENGTH_SHORT).show();
}

public static com.teegarcs.mocker.MatchingInterceptor getMatchingInterceptor(android.content.Context context) {
    return null;
}

void onModeChanged(@org.androidannotations.annotations.Receiver.Extra
final com.wolkabout.hexiwear.model.Mode mode) {
    this.mode = mode;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    com.abhijitvalluri.android.fitnotifications.TimePickerFragment dialog = com.abhijitvalluri.android.fitnotifications.TimePickerFragment.newInstance(mStartTimeHour, mStartTimeMinute, mStopTimeHour, mStopTimeMinute, stopTimeFormatted, is24hFormat, com.abhijitvalluri.android.fitnotifications.AppSettingsActivity.START_TIME_REQUEST);
    dialog.show(manager, com.abhijitvalluri.android.fitnotifications.AppSettingsActivity.DIALOG_TIME);
}

@java.lang.Override
public void succeed() {
    mRVAdapter.setList(com.pkhope.diary.MyApplication.getDoc().getDiaryManager().getList());
    mRVAdapter.notifyDataSetChanged();
    android.widget.Toast.makeText(getApplicationContext(), "Load succeed", Toast.LENGTH_SHORT).show();
}

public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        loadImage(data.getData());
        mImagePath = data.getData().toString();
    }
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    nameEditText.setText("");
    priceEditText.setText("");
    quantityText.setText("0");
    suppliersEmailEditText.setText("");
    productsImageView.setImageURI(null);
}

public void startBrowser() {
    java.lang.String url = com.freedom.freeclient.freeclient.util.Util.readFromProxyFile(proxyFile, this);
    android.net.Uri uriUrl = android.net.Uri.parse(url);
    android.content.Intent launchBrowser = new android.content.Intent(android.content.Intent.ACTION_VIEW, uriUrl);
    startActivity(launchBrowser);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    if ((firstLaunch) && (!(getIntent().hasExtra(com.bubelov.coins.ui.activity.MapActivity.NOTIFICATION_AREA_EXTRA)))) {
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
    return shouldConsume ? true : super.performEditorAction(editorAction);
}

@org.junit.Test
public void testGetPropertyHandler() {
    com.eclipsesource.tabris.maps.MapOperator operator = new com.eclipsesource.tabris.maps.MapOperator(org.mockito.Mockito.mock(android.app.Activity.class), org.mockito.Mockito.mock(com.eclipsesource.tabris.android.TabrisContext.class));
    com.eclipsesource.tabris.android.TabrisPropertyHandler propertyHandler = operator.getPropertyHandler();
    assertTrue((propertyHandler instanceof com.eclipsesource.tabris.maps.MapPropertyHandler));
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((listener) != null) {
        listener.sendImageToServer(filteredDeviceList.get(position).getId(), "BluetoothClient");
    }
}

public void registerUsageCallback(int networkType, java.lang.String subscriberId, long thresholdBytes, android.app.usage.NetworkStatsManager.UsageCallback callback) {
    registerUsageCallback(networkType, subscriberId, thresholdBytes, null);
}

@retrofit2.http.GET(value = "services/rest/?format=json&nojsoncallback=1&extras=url_s")
rx.Observable<com.rpham64.android.photogallery.network.response.FlickrResponse> getPhotosBySearchRx(@retrofit2.http.Query(value = "page")
int page, @retrofit2.http.Query(value = "method")
java.lang.String method, @retrofit2.http.Query(value = "api_key")
java.lang.String key, @retrofit2.http.Query(value = "text")
java.lang.String query, @retrofit2.http.Query(value = "sort")
java.lang.String order);

@java.lang.Override
protected void onResume() {
    super.onResume();
    if (videoCommand.isStartedPlay()) {
        android.util.Log.d(com.rokid.movie.activity.MainActivity.TAG, ("onResume startPlay : " + (videoCommand.isStartedPlay())));
        videoCommand.resumePlay();
    }
}

public com.mapbox.services.android.telemetry.location.LocationEngine getLocationEngine() {
    return (locationEngine) == null ? new com.mapbox.services.android.location.LostLocationEngine(context) : locationEngine;
}

@java.lang.Override
public void onClick(com.afollestad.materialdialogs.MaterialDialog dialog, com.afollestad.materialdialogs.DialogAction which) {
    com.facebook.login.LoginManager.getInstance().logOut();
    com.adithyaupadhya.database.sharedpref.AppPreferenceManager.getAppPreferenceInstance(this).clearAllUserPreferenceData();
    startActivity(new android.content.Intent(this, com.adithyaupadhya.moviemaniac.login.SignInActivity.class));
    finish();
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if ((this.onFocusChangeListener) != null) {
        this.onFocusChangeListener.onFocusChange(v, hasFocus);
    }
    focusChangedEvent(hasFocus);
}

public void onClick(android.view.View arg0) {
    if (true) {
        stringBuffer.append("+");
        input.setText(stringBuffer.toString());
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent callIntent = new android.content.Intent(android.content.Intent.ACTION_CALL);
    callIntent.setData(android.net.Uri.parse(("tel:+" + (android.telephony.PhoneNumberUtils.getStrippedReversed(property.value)))));
    startActivity(callIntent);
}

public void disconnect(net.sharksystem.android.protocols.wifidirect.WifiDirectPeer peer) {
    ((net.sharksystem.android.protocols.wifidirect.WifiDirectStreamStub) (currentStub)).disconnect(peer);
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    setState("stop");
    android.util.Log.d(Constants.DEBUG_TAG, "NotificationService : onUnbind");
    return super.onUnbind(intent);
}

public void showConfirmDelete() {
    android.app.DialogFragment dialog = new com.tanona.bill.positiveplasma.ConfirmDelete();
    dialog.show(getFragmentManager(), "ConfirmDelete");
    onDialogPositiveClick(dialog);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    if (which < ((available.length) - 1)) {
        add(availableTiles[which]);
    }else {
        showBroadcastTileDialog();
    }
}

@java.lang.Override
public void onError() {
    android.widget.Toast.makeText(getContext(), "信息暂时无法加载", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onViewDetachedFromWindow(android.view.View v) {
    parent.onDismiss();
}

@java.lang.Override
public void onAttachFragment(android.support.v4.app.Fragment fragment) {
    fragList.add(new java.lang.ref.WeakReference<android.support.v4.app.Fragment>(fragment));
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.raizlabs.android.dbflow.config.FlowManager.init(new com.raizlabs.android.dbflow.config.FlowConfig.Builder(this).build());
    if (com.squareup.leakcanary.LeakCanary.isInAnalyzerProcess(this)) {
        return ;
    }
    refWatcher = com.squareup.leakcanary.LeakCanary.install(this);
}

@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    saveScaledPhoto(data);
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.DatePickerDialog dialog = new android.app.DatePickerDialog(getActivity(), ((com.thonners.crosswordmaker.HomeActivity) (getActivity())), startYear, startMonth, startDay);
    return dialog;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.example.attracti.audiorecorderpicture.adapters.RecyclerViewAdapter adapter = ((com.example.attracti.audiorecorderpicture.adapters.RecyclerViewAdapter) (list.getAdapter()));
    android.util.Log.wtf("on Resume works ", "in FirstscreenActivity");
    list.getAdapter().notifyDataSetChanged();
}

private void updateSummaryList(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    android.preference.ListPreference updatedPref = ((android.preference.ListPreference) (settingsFragment.findPreference(key)));
    updatedPref.setSummary(updatedPref.getEntry());
}

@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
    android.widget.Toast.makeText(this, R.string.login_toast_error_identification, Toast.LENGTH_LONG);
}

@java.lang.Override
public void run() {
    info.setText(getString(R.string.serverIpNotSet));
    android.widget.Toast.makeText(this, R.string.ipNotReached, Toast.LENGTH_LONG).show();
}

