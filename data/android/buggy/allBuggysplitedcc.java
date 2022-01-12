public void setIpAddress(android.view.View view) {
    showPopup(this, p);
}

public com.raizlabs.android.dbflow.sql.language.Where<ModelClass> and(com.raizlabs.android.dbflow.sql.builder.Condition condition) {
    mConditionQueryBuilder.putCondition(condition);
    return this;
}

public void saveSelected(int id) {
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString("city", ("" + id));
    editor.commit();
    android.util.Log.d(org.scoutant.tf.TrafficMap.tag, ("saving preference : " + id));
}

@butterknife.OnClick(value = R.id.btn_sign_in_offline)
public void onSignInOffline() {
    android.os.Bundle bundle = getIntent().getExtras();
    android.content.Intent startAppInOffline = new android.content.Intent(getApplicationContext(), com.bytebuilding.affairmanager.activities.MainOfflineActivity.class);
    startAppInOffline.putExtras(bundle);
    startActivity(startAppInOffline);
    finish();
}

@java.lang.Override
protected void onPostExecute(java.lang.String aVoid) {
    super.onPostExecute(aVoid);
    mProgressBar.setVisibility(View.GONE);
    android.util.Log.d("ONPOSTEXECUTE", ("Array = " + (mArrayList.toString())));
    mArrayAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onRetry() {
    try {
        joinRoom(roomIdOrAlias, callback);
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.matrix.androidsdk.rest.client.RoomsRestClient.LOG_TAG, ("resend joinRoomByAlias : failed " + (e.getMessage())));
    }
}

private void showProgressDialog(final java.lang.String message) {
    jackpal.androidterm.Term.mActivity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mProgressDialog = android.app.ProgressDialog.show(jackpal.androidterm.Term.mContext, null, message);
        }
    });
}

@java.lang.Override
public void onSessionResumed(com.google.android.gms.cast.framework.CastSession session, boolean wasSuspended) {
    timber.log.Timber.d("VideoDetailsFragment : onSessionResumed()");
    onApplicationConnected(session);
}

@java.lang.Override
public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
    com.gigigo.ggglogger.GGGLogImpl.log("CloudRecognitionActivityLifeCycleCallBack.onActivitySaveInstanceState");
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    jumpup.imi.fb4.htw.de.jumpupandroid.portal.trip.entity.search.SingleTripQueryResult singleTripQueryResult = singleTripsQueryResultListAdapter.getItem(position);
    navigateToViewTrip(singleTripQueryResult.getTrip());
}

public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.DrawableRes
int res, boolean tintIcon) {
    mIcon = com.danimahardhika.cafebar.CafeBarUtil.getDrawable(mContext, res);
    mTintIcon = tintIcon;
    return this;
}

@java.lang.Override
public void onProviderEnabled(java.lang.String s) {
    android.util.Log.d("GPSTest", "onProviderEnabled called");
}

private void loadShowBatteryTextSetting() {
    android.content.ContentResolver resolver = getContext().getContentResolver();
    mShowBatteryText = 0 != (Settings.System.getInt(resolver, Settings.System.STATUS_BAR_SHOW_BATTERY_PERCENT, 0));
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    java.lang.System.out.println("--- onConfigurationChanged");
    super.onConfigurationChanged(newConfig);
    drawerToggle.onConfigurationChanged(newConfig);
}

public static void setText(android.app.Activity activity, android.widget.TextView textView, java.lang.String str) {
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            textView.setText(str);
        }
    });
}

private void initRotationForDisplay(final net.gini.android.vision.internal.camera.photo.ExifReader exifReader) {
    if (((mImageDocument) != null) && (mImageDocument.isImported())) {
        mRotationForDisplay = exifReader.getOrientationAsDegrees();
    }
}

void onCreateEventInteraction(android.widget.ProgressBar progressBar, tcss450.uw.edu.project18.event.Event createdEvent, java.lang.String url);

public void onClickButtonMyReservations(android.view.View view) {
    android.util.Log.v("onClickButtonRes", "OK");
    android.content.Intent intent = new android.content.Intent(this, com.example.tmary.proresto2.ReservationsActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkAnswer(false);
    updateQuestion();
}

private void setupActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(false);
    }
}

@java.lang.Override
public void showMoreItems() {
    homepageItemsAdapter.initData(me.aaron.zhihudaily.view.activities.MainActivity.returnMainPresenter().getLatestBean());
    homepageItemsAdapter.notifyDataSetChanged();
    android.util.Log.d("88888888", ("showMoreItems: " + (me.aaron.zhihudaily.view.fragments.HomePageFragment.isLoading)));
    me.aaron.zhihudaily.view.fragments.HomePageFragment.isLoading = false;
}

@java.lang.Override
public void call(final java.util.List<org.bookdash.android.domain.model.firebase.FireLanguage> fireLanguages) {
    this.languages = languages;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    if (Constants.ACTION_FOOTBALL_SCORE_UPDATED.equals(intent.getAction())) {
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_insert_dummy_data :
            insertPet();
            displayDatabaseInfo();
            break;
        case R.id.action_delete_all_entries :
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onComplete(java.lang.Void aVoid) {
    com.hackgsu.fall2016.android.HackGSUApplication.refreshAnnouncements(getApplicationContext());
    this.finish();
}

public void changeEntrySelection(vsd.co.za.sambugapp.DataAccess.DTO.ClassificationResultDTO currentEntry) {
    isClassified = true;
    android.widget.Toast.makeText(getApplicationContext(), "Species Identified!", Toast.LENGTH_SHORT).show();
    changeEntrySelection(((currentEntry.SpeciesID) + 1));
}

private void handleIntent(android.content.Intent intent) {
    com.google.android.gms.common.api.Status status = intent.getParcelableExtra(pl.charmas.android.reactivelocation.observables.location.LocationSettingsActivity.ARG_STATUS);
    try {
        status.startResolutionForResult(this, pl.charmas.android.reactivelocation.observables.location.LocationSettingsActivity.REQUEST_CODE_RESOLUTION);
    } catch (android.content.IntentSender | java.lang.NullPointerException e) {
        setResolutionResultAndFinish(Activity.RESULT_CANCELED);
    }
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_welcome_step2, null);
    butterknife.ButterKnife.inject(this, v);
    return v;
}

public void startInfoActivity(java.lang.String textToShow) {
    android.content.Intent infoIntent = new android.content.Intent(getBaseContext(), com.example.qrhelper_android.InfoActivity.class);
    infoIntent.putExtra("qr_content", textToShow);
    startActivityForResult(infoIntent, 3);
}

protected void start() {
    timerState = TimerService.State.RUNNING;
    android.util.Log.d(com.simpleworkout.timer.MainActivity.TAG, ("start: timerState=" + (timerState)));
    updateButtonsLayout();
    updateSetsDisplay();
}

public static void getFlight(java.lang.String flightId, boolean enhance, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.flight.AirMapFlight> callback) {
    com.airmap.airmapsdk.networking.services.FlightService.getFlight(flightId, enhance, callback);
}

@java.lang.Override
public void run() {
    android.widget.TextView textTime = ((android.widget.TextView) (findViewById(R.id.timer)));
    textTime.setText((((getString(R.string.play_activity_time)) + " ") + (seconds)));
}

@java.lang.Override
public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long l) {
    android.util.Log.e("CALL BACK", "SCH");
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.fjg.android.zxing.ZxingApplication.mInstance = this;
    cn.jpush.android.api.JPushInterface.setDebugMode(false);
    cn.jpush.android.api.JPushInterface.init(this);
}

public void onRadioButtonClicked(android.view.View source) {
    switch (source.getId()) {
        case R.id.radioButtonDebtor :
            iAmCreditor = false;
            setButtons();
            break;
        case R.id.radioButtonCreditor :
            iAmCreditor = true;
            setButtons();
            break;
    }
}

@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    ab.setTitle(title);
    invalidateOptionsMenu();
}

@java.lang.Override
public boolean onAnimationEnd(android.view.View view) {
    if ((mSearchViewListener) != null) {
        mSearchViewListener.onSearchViewShown();
    }
    return false;
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mPageflip.setPageflipListener(new com.shopgun.android.sdk.demo.PageflipListenerPrinter(com.shopgun.android.sdk.demo.CatalogViewerActivity.TAG, false));
}

public static synchronized void clearAddedEventTitles() {
    com.dancedeets.android.gcm.ListenerService.addedEventTitles.clear();
}

public int obtainExtraMargin(android.view.View child, boolean isLayoutEnd) {
    if (child != null) {
        return computeAlignOffset(child, isLayoutEnd, true);
    }
    return 0;
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.laudandjolynn.mytv.ProgramTableFragment.newInstance(getPageTitle(position).toString(), date);
}

@java.lang.Override
public com.nabwera.filamuapp.adapter.MoviesAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_card, android.view.ViewGroup, false);
    return new com.nabwera.filamuapp.adapter.MoviesAdapter.MyViewHolder(view);
}

public void DeleteEvent(java.lang.String isAttending, int eventID, java.lang.String eventName) {
    com.plan_it.mobile.plan_it.UpdateDatabase.DeleteEvent(isAttending, eventID);
    android.widget.Toast.makeText(this, (("Deleting: " + eventName) + " Refresh List from menu"), Toast.LENGTH_LONG).show();
}

public static void load(android.content.Context context, java.lang.String path, android.widget.ImageView imageView) {
    com.bumptech.glide.Glide.with(context).load(path).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_toggle :
            updateMenuIcon(item);
            toggle();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    replaceViewFragment(new com.donor.oncall.fragments.RegisterationFragment(), true);
}

public static void save(java.util.ArrayList<java.lang.String> drafts) {
    android.content.SharedPreferences.Editor e = Authentication.authentication.edit();
    e.putString(SettingValues.PREF_DRAFTS, me.ccrama.redditslide.Reddit.arrayToString(drafts, "</newdraft>"));
    e.apply();
}

private void startNewNote(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, app.band.runawaynation.matth.plainnotes.EditorActivity.class);
    startActivityForResult(intent, app.band.runawaynation.matth.plainnotes.MainActivity.EDITOR_REQUEST_CODE);
}

public static com.example.kimichael.yandextranslate.data.objects.Language from(android.database.Cursor cursor) {
    return new com.example.kimichael.yandextranslate.data.objects.Language(cursor.getString(cursor.getColumnIndex(TranslationContract.LanguageEntry.COLUMN_LANGUAGE_KEY)), cursor.getString(cursor.getColumnIndex(TranslationContract.LanguageEntry.COLUMN_LANGUAGE_NAME)));
}

@java.lang.Override
public void onError(int error) {
    android.util.Log.e(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.TAG, ((("error " + error) + ": ") + (com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.getErrorText(error))));
    m_listener.onError(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.getErrorText(error));
}

public synchronized boolean putFavorite(java.lang.String imdbID, com.example.vineetpatil.moviesearch.TitleRecord titleRecord) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(imdbID, titleRecord.toString());
    editor.apply();
    return true;
}

public boolean onActivityResultImpl(@android.support.annotation.NonNull
V v, int requestCode, int resultCode, android.content.Intent data) {
    VP presenter = getPresenter(v);
    return (presenter != null) && (presenter.onActivityResult(v, requestCode, resultCode, data));
}

public net.rainville.android.outstreamads.ArticleItem getArticleItem(java.util.UUID id) {
    for (net.rainville.android.outstreamads.ArticleItem articleItem : mArticleItems) {
        if ((articleItem.getArticleId()) == id) {
            return articleItem;
        }
    }
    return null;
}

@java.lang.Override
public void onInputGiven(java.lang.String number) {
    dataPersister.addNumberToBlockedNumbers(number);
    co.snagapp.android.model.Sms sms = new co.snagapp.android.model.Sms();
    sms.setId(number);
    numbers.add(sms);
    onBackPressed();
}

public static java.net.URL buildUrlPopular() {
    android.util.Log.d("----->>>>> NetworkUtils", "buildUrlPopular");
    return com.baulen.androidmovies.utilities.NetworkUtils.buildUrlGeneric(com.baulen.androidmovies.utilities.NetworkUtils.URL_POPULAR);
}

public static synchronized android.database.sqlite.SQLiteDatabase open() throws android.database.SQLException {
    (net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter)++;
    if ((net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter) == 1) {
        net.polybugger.apollot.db.ApolloDbAdapter.sDb = net.polybugger.apollot.db.ApolloDbAdapter.sDbHelper.getWritableDatabase();
    }
    return net.polybugger.apollot.db.ApolloDbAdapter.sDb;
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeDouble(latitude);
    dest.writeDouble(longitude);
    dest.writeFloat(radius);
}

public eu.nullbyte.android.urllib.Urllib login() throws com.liato.bankdroid.banking.exceptions.BankException, com.liato.bankdroid.banking.exceptions.LoginException, java.io.IOException {
    com.liato.bankdroid.banking.banks.LoginPackage lp = preLogin();
    java.lang.String response = urlopen.open(lp.getLoginTarget(), lp.getPostData());
    return urlopen;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d(aditi.hangman.Game.TAG, "game onResume");
}

public int getBaliseToTargetIndex() {
    android.util.Log.d(fr.univ_lille1.iut_info.caronic.mapsv3.maps.map_objects.Parcours.LOG, ("getBaliseToTargetIndex " + (baliseToTarget)));
    return baliseToTarget;
}

@java.lang.Override
public android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter) {
    receivers.add(receiver);
    return super.registerReceiver(receiver, filter);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSharedPrefsManager = cz.ejstn.gargantua.model.DefaultSharedPreferencesManager.getInstance(this);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    android.widget.Toast.makeText(c, "Location changed!", Toast.LENGTH_SHORT).show();
    displayLocation();
}

public void launchJokeActivity(android.view.View view) {
    new com.elorri.android.builditbigger.GCEndpointsApiService(this).execute();
}

public void callHandler() {
    handler = new android.os.Handler();
    com.example.clock.stopwatchActivity.updateTimer my_update = new com.example.clock.stopwatchActivity.updateTimer();
    handler.postDelayed(my_update, 1000);
}

private void doLockScreenAnimation() {
    android.util.Log.d(com.vitaminbacon.lockscreendialer.LockScreenActivity.TAG, "doLockScreenAnimation() called");
    android.view.View lockScreen = mWrapperView.findViewById(R.id.lock_screen_interaction_container);
    lockScreen.animate().translationX(0);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.widget.Toast.makeText(this, "onConnected", Toast.LENGTH_SHORT).show();
    android.util.Log.d(com.tacticsgames.dontdie.activities.PlayServicesActivity.TAG, "onConnected(): connected to Google APIs");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.event_list);
    android.content.Intent intent = getIntent();
    displayPrivateEvents();
    client = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
}

public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener) {
    return null;
}

private void setTargetView(@android.support.annotation.IdRes
int resId) {
    setTargetView(((android.app.Activity) (mContext)).findViewById(resId));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.ReceiptsFragment.TAG, "onCreate");
    }
    mCurrentTrip = getArguments().getParcelable(Trip.PARCEL_KEY);
}

@java.lang.Override
public void onFailure(retrofit2.Call<in.tosc.doandroidlib.objects.Action> call, java.lang.Throwable t) {
    setSwitchWithoutTriggering(switchBackup, true);
    android.support.design.widget.Snackbar.make(coordinatorLayout, getString(R.string.network_error), Snackbar.LENGTH_SHORT).show();
}

@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    uk.co.senab.photoview.PhotoView imageView = ((uk.co.senab.photoview.PhotoView) (object));
    mCurrentPrimaryItem = imageView;
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.android.record.RecordApplication.mApplication = this;
    com.android.record.RecordApplication.mContext = getApplicationContext();
    setDatabase();
}

public void clickCreateDataBase(android.view.View v) {
    edu.byui.cs246.project.DataBaseCreator creator = new edu.byui.cs246.project.DataBaseCreator(db);
    creator.create();
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    android.util.Log.d("DEBUG", errorResponse.toString());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.launch_recording_activity);
    android.util.Log.i(com.blabbertabber.blabbertabber.MainActivity.TAG, "onCreate()");
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    linearLayout = ((android.widget.LinearLayout) (inflater.inflate(R.layout.fragment_course_section, container, false)));
    return linearLayout;
}

public void connect(com.ericsson.addroneapplication.model.ConnectionInfo connectionInfo) {
    android.util.Log.e(com.ericsson.addroneapplication.communication.TcpSocket.DEBUG_TAG, "connect");
    state = com.ericsson.addroneapplication.communication.TcpSocket.State.CONNECTING;
    connection = new com.ericsson.addroneapplication.communication.TcpSocket.SocketConnection();
    android.util.Log.e(com.ericsson.addroneapplication.communication.TcpSocket.DEBUG_TAG, "connect22");
    connection.execute(connectionInfo);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    canActivateAlarmNow = false;
    cancelAlarm(false);
}

@java.lang.Override
public net.idik.lib.slimadapter.viewinjector.DefaultViewInjector typeface(int id, android.graphics.Typeface typeface) {
    android.widget.TextView view = findViewById(id);
    view.setTypeface(typeface);
    return null;
}

public void createBoundBitmap() {
    boundBM = android.graphics.Bitmap.createBitmap(xWidth, yHeight, Bitmap.Config.ARGB_8888);
}

void displayCoordinates(@android.support.annotation.NonNull
java.lang.String latitude, @android.support.annotation.NonNull
java.lang.String longitude, @android.support.annotation.Nullable
java.lang.Double altitude, float accuracy) {
    statusIndicator.setText(getContext().getString(R.string.geo_location_accuracy, accuracyFormat.format(accuracy)));
    displayCoordinates(latitude, longitude, altitude);
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("minko", "DummyCameraPreview.surfaceCreated");
    if (isActive())
        _callback.run(surfaceHolder);
    
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    plugin.deleteRecording(recording);
    listAdapter.remove(recording);
}

private void newPAssError() {
    android.widget.Toast.makeText(getBaseContext(), "New passwords don't match!", Toast.LENGTH_SHORT).show();
    changeDocFirebase.removeEventListener(changeDocListener);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.kcb.teacher.activity.test.EditTestActivity.sTest.addQuestion();
    showTestNameNum();
    switchNextButton();
    com.kcb.common.util.ToastUtil.toast(java.lang.String.format(getResources().getString(R.string.tch_question_added), questionNum));
}

@java.lang.Override
public void onResume() {
    if (com.android.messaging.util.OsUtil.hasStoragePermission()) {
        startMediaPickerDataLoader();
        updateForPermissionState(true);
    }else {
        updateForPermissionState(false);
    }
}

public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
    updateButton(2);
    return false;
}

boolean isFileSaveEnabled() {
    if (codepath.apps.demointroandroid.ScoreKeeperUtils.getTodayAsNoTimeString().equals(fileSaveFeatureDate)) {
        return fileSaveForToday;
    }
    return false;
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.i(cn.bit.hao.ble.tool.activity.BaseActivity.TAG, ((this.getClass().getSimpleName()) + " onStop"));
    cn.bit.hao.ble.tool.response.manager.CommonResponseManager.getInstance().unregisterUINotification(this);
}

public void onClick(android.view.View v) {
    setNotificationData();
    switch (v.getId()) {
        case R.id.btnMainSendNotificationActionBtn :
            setDataForNotificationWithActionButton();
            break;
    }
    firebaseAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
    initData();
    viewPager.setAdapter(pageAdapter);
    initEvent();
}

@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
    android.util.Log.e("CALL BACK", "invalidate");
    if ((getCallback()) != null) {
        getCallback().invalidateDrawable(this);
    }
}

protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.friends);
    android.widget.ImageButton disableFriends = ((android.widget.ImageButton) (findViewById(R.id.friends_button)));
    disableFriends.setEnabled(false);
}

@java.lang.Override
protected void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer buffer) {
    if (((com.google.android.exoplayer2.util.Util.SDK_INT) < 23) && (tunneling)) {
        maybeNotifyRenderedFirstFrame();
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    new com.rohitsuratekar.NCBSinfo.database.ContactsData(context).makeTable();
    new com.rohitsuratekar.NCBSinfo.database.AlarmData(context).makeTable();
    new com.rohitsuratekar.NCBSinfo.database.NotificationData(context).makeTable();
    new com.rohitsuratekar.NCBSinfo.database.TalkData(context).makeTable();
}

@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    super.draw(canvas);
    java.lang.System.out.println(" indexable list view draw .");
    if ((mScroller) != null)
        mScroller.draw(canvas);
    
}

@java.lang.Override
protected void onSaveInstanceState(final android.os.Bundle outState) {
    outState.putSerializable(com.company.mbelogorodtsev.trainingapplication.HomeActivity.SAVE_PROGRESS_DIALOG_PROGRESS, progressDialog.getProgress());
    super.onSaveInstanceState(outState);
}

public void registerBroadcastReceiver() {
    android.content.IntentFilter statusIntentFilter = new android.content.IntentFilter(com.njlabs.showjava.Constants.PROCESS_BROADCAST_ACTION);
    registerReceiver(processStatusReceiver, statusIntentFilter);
}

