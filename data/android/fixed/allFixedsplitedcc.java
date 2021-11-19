public void setIpAddress(android.view.View view) {
    showPopup(this, p, view);
}

public com.raizlabs.android.dbflow.sql.language.Where<ModelClass> and(com.raizlabs.android.dbflow.sql.builder.Condition condition) {
    mConditionQueryBuilder.and(condition);
    return this;
}

public void saveSelected(int id) {
    editor.putString("city", ("" + id));
    editor.commit();
    android.util.Log.d(org.scoutant.tf.TrafficMap.tag, ("saving preference : " + id));
}

@butterknife.OnClick(value = R.id.btn_sign_in_offline)
public void onSignInOffline() {
    android.content.Intent startAppInOffline = new android.content.Intent(getApplicationContext(), com.bytebuilding.affairmanager.activities.MainOfflineActivity.class);
    startActivity(startAppInOffline);
    finish();
}

@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    mProgressBar.setVisibility(View.GONE);
    mArrayAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onRetry() {
    try {
        joinRoom(roomIdOrAlias, params, callback);
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.matrix.androidsdk.rest.client.RoomsRestClient.LOG_TAG, ("resend joinRoomByAlias : failed " + (e.getMessage())));
    }
}

private void showProgressDialog(final java.lang.String message) {
    return ;
}

@java.lang.Override
public void onSessionResumed(com.google.android.gms.cast.framework.CastSession session, boolean wasSuspended) {
    onApplicationConnected(session);
}

@java.lang.Override
public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    jumpup.imi.fb4.htw.de.jumpupandroid.portal.trip.entity.search.SingleTripQueryResult singleTripQueryResult = singleTripsQueryResultListAdapter.getItem(position);
    navigateToViewTrip(singleTripQueryResult.getTrip(), true);
}

public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.DrawableRes
int res, boolean tintIcon) {
    return icon(com.danimahardhika.cafebar.CafeBarUtil.getDrawable(mContext, res), tintIcon);
}

@java.lang.Override
public void onProviderEnabled(java.lang.String s) {
}

private void loadShowBatteryTextSetting() {
    android.content.ContentResolver resolver = getContext().getContentResolver();
    mShowBatteryText = Settings.System.getInt(resolver, Settings.System.STATUS_BAR_SHOW_BATTERY_PERCENT, 0);
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    drawerToggle.onConfigurationChanged(newConfig);
}

public static void setText(android.app.Activity activity, android.widget.TextView textView, java.lang.String str) {
    activity.runOnUiThread(() -> textView.setText(str));
}

private void initRotationForDisplay(@android.support.annotation.Nullable
final net.gini.android.vision.internal.camera.photo.ExifReader exifReader) {
    if ((((mImageDocument) != null) && (mImageDocument.isImported())) && (exifReader != null)) {
        mRotationForDisplay = exifReader.getOrientationAsDegrees();
    }
}

void onCreateEventInteraction(tcss450.uw.edu.project18.event.Event createdEvent, java.lang.String url);

public void onClickButtonMyReservations(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.tmary.proresto2.ReservationsActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkAnswer(true);
    updateQuestion();
}

private void setupActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}

@java.lang.Override
public void showMoreItems() {
    homepageItemsAdapter.initData(me.aaron.zhihudaily.view.activities.MainActivity.returnMainPresenter().getLatestBean());
    homepageItemsAdapter.notifyDataSetChanged();
    me.aaron.zhihudaily.view.fragments.HomePageFragment.isLoading = false;
}

@java.lang.Override
public void call(final java.util.List<org.bookdash.android.domain.model.firebase.FireLanguage> fireLanguages) {
    this.languages = fireLanguages;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_insert_dummy_data :
            insertPet();
            displayDatabaseInfo();
            return true;
        case R.id.action_delete_all_entries :
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onComplete(java.lang.Void aVoid) {
    this.finish();
}

public void changeEntrySelection(vsd.co.za.sambugapp.DataAccess.DTO.ClassificationResultDTO currentEntry) {
    isClassified = true;
    android.widget.Toast.makeText(getApplicationContext(), "Species Identified!", Toast.LENGTH_SHORT).show();
    changeEntrySelection(currentEntry.SpeciesID);
}

private void handleIntent() {
    com.google.android.gms.common.api.Status status = getIntent().getParcelableExtra(pl.charmas.android.reactivelocation.observables.location.LocationSettingsActivity.ARG_STATUS);
    try {
        status.startResolutionForResult(this, pl.charmas.android.reactivelocation.observables.location.LocationSettingsActivity.REQUEST_CODE_RESOLUTION);
    } catch (android.content.IntentSender | java.lang.NullPointerException e) {
        setResolutionResultAndFinish(Activity.RESULT_CANCELED);
    }
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_welcome_step2, container, false);
    butterknife.ButterKnife.inject(this, v);
    return v;
}

public void startInfoActivity(java.lang.String textToShow) {
    infoIntent.putExtra("qr_content", textToShow);
    startActivityForResult(infoIntent, 3);
}

protected void start() {
    timerState = TimerService.State.RUNNING;
    android.util.Log.d(com.simpleworkout.timer.MainActivity.TAG, ("start: timerState=" + (timerState)));
    updateButtonsLayout();
}

public static void getFlight(@android.support.annotation.NonNull
java.lang.String flightId, boolean enhance, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.flight.AirMapFlight> callback) {
    if (flightId != null) {
        com.airmap.airmapsdk.networking.services.FlightService.getFlight(flightId, enhance, callback);
    }
}

@java.lang.Override
public void run() {
    android.widget.TextView textTime = ((android.widget.TextView) (findViewById(R.id.timer)));
    textTime.setText((((getString(R.string.play_activity_time)) + " ") + (seconds)));
    (seconds)++;
}

@java.lang.Override
public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long l) {
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.fjg.android.zxing.ZxingApplication.mInstance = this;
}

public void onRadioButtonClicked(android.view.View source) {
    switch (source.getId()) {
        case R.id.radioButtonDebtor :
            iAmCreditor = false;
            break;
        case R.id.radioButtonCreditor :
            iAmCreditor = true;
            break;
    }
}

@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    ab.setTitle(title);
}

@java.lang.Override
public boolean onAnimationEnd(android.view.View view) {
    return false;
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mPageflip.setPageflipListener(new com.shopgun.android.sdk.demo.PageflipListenerPrinter(com.shopgun.android.sdk.demo.CatalogViewerActivity.TAG, true));
}

public static void clearAddedEventTitles() {
    synchronized(com.dancedeets.android.gcm.ListenerService.addedEventTitles) {
        com.dancedeets.android.gcm.ListenerService.addedEventTitles.clear();
    }
}

public int obtainExtraMargin(android.view.View child, boolean isLayoutEnd) {
    return obtainExtraMargin(child, isLayoutEnd, true);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.laudandjolynn.mytv.ProgramTableFragment.newInstance();
}

@java.lang.Override
public com.nabwera.filamuapp.adapter.MoviesAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_card, viewGroup, false);
    return new com.nabwera.filamuapp.adapter.MoviesAdapter.MyViewHolder(view);
}

public void DeleteEvent(java.lang.String isAttending, int eventID, java.lang.String eventName) {
    android.widget.Toast.makeText(this, (("Deleting: " + eventName) + " Refresh List from menu"), Toast.LENGTH_LONG).show();
    com.plan_it.mobile.plan_it.UpdateDatabase.DeleteEvent(isAttending, eventID);
}

public static void load(android.content.Context context, java.lang.String path, android.widget.ImageView imageView) {
    com.bumptech.glide.Glide.with(context).load(path).into(imageView);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_toggle)) {
        toggle();
        return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    replaceViewFragment(new com.donor.oncall.fragments.RegisterationFragment(), false);
}

public static void save(java.util.ArrayList<java.lang.String> drafts) {
    android.content.SharedPreferences.Editor e = Authentication.authentication.edit();
    e.putString(SettingValues.PREF_DRAFTS, me.ccrama.redditslide.Reddit.arrayToString(drafts, "</newdraft>"));
    e.commit();
}

private void startNewNote() {
    android.content.Intent intent = new android.content.Intent(this, app.band.runawaynation.matth.plainnotes.EditorActivity.class);
    startActivityForResult(intent, app.band.runawaynation.matth.plainnotes.MainActivity.EDITOR_REQUEST_CODE);
}

public static com.example.kimichael.yandextranslate.data.objects.Language from(android.database.Cursor cursor) {
    return new com.example.kimichael.yandextranslate.data.objects.Language(cursor.getString(cursor.getColumnIndex(TranslationContract.LanguageEntry.COLUMN_LANGUAGE_NAME)), cursor.getString(cursor.getColumnIndex(TranslationContract.LanguageEntry.COLUMN_LANGUAGE_KEY)));
}

@java.lang.Override
public void onError(int error) {
    m_listener.onError(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.getErrorText(error));
}

public synchronized boolean putFavorite(java.lang.String imdbID, com.example.vineetpatil.moviesearch.TitleRecord titleRecord) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(imdbID, titleRecord.toString());
    editor.commit();
    return true;
}

public boolean onActivityResultImpl(@android.support.annotation.NonNull
V v, int requestCode, int resultCode, android.content.Intent data) {
    VP presenter = getPresenter(v, false);
    return (presenter != null) && (presenter.onActivityResult(v, requestCode, resultCode, data));
}

public net.rainville.android.outstreamads.ArticleItem getArticleItem(java.util.UUID id) {
    for (net.rainville.android.outstreamads.ArticleItem articleItem : mArticleItems) {
        if (articleItem.getArticleId().equals(id)) {
            return articleItem;
        }
    }
    return null;
}

@java.lang.Override
public void onInputGiven(java.lang.String number) {
    co.snagapp.android.model.Sms sms = new co.snagapp.android.model.Sms();
    sms.setId(number);
    numbers.add(sms);
    dataPersister.addNumberToBlockedNumbers(number);
    onBackPressed();
}

public static java.net.URL buildUrlPopular() {
    return com.baulen.androidmovies.utilities.NetworkUtils.buildUrlGeneric(com.baulen.androidmovies.utilities.NetworkUtils.URL_POPULAR);
}

public static synchronized android.database.sqlite.SQLiteDatabase open() throws android.database.SQLException {
    if ((net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter) == 0)
        net.polybugger.apollot.db.ApolloDbAdapter.sDb = net.polybugger.apollot.db.ApolloDbAdapter.sDbHelper.getWritableDatabase();
    
    (net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter)++;
    return net.polybugger.apollot.db.ApolloDbAdapter.sDb;
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeDouble(latitude);
    dest.writeDouble(longitude);
    dest.writeDouble(radius);
}

public eu.nullbyte.android.urllib.Urllib login() throws com.liato.bankdroid.banking.exceptions.BankException, com.liato.bankdroid.banking.exceptions.LoginException, java.io.IOException {
    com.liato.bankdroid.banking.banks.LoginPackage lp = preLogin();
    response = urlopen.open(lp.getLoginTarget(), lp.getPostData());
    return urlopen;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
}

public int getBaliseToTargetIndex() {
    return baliseToTarget;
}

@java.lang.Override
public android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter) {
    if (receiver != null) {
        receivers.add(receiver);
    }
    return super.registerReceiver(receiver, filter);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSharedPrefsManager = cz.ejstn.gargantua.model.DefaultSharedPreferencesManager.getInstance();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    displayLocation();
}

public void launchJokeActivity(android.view.View view) {
    new com.elorri.android.builditbigger.GCEndpointsApiService(this).execute(this);
}

public void callHandler() {
    handler = new android.os.Handler();
    my_update = new com.example.clock.stopwatchActivity.updateTimer();
    handler.postDelayed(my_update, 1000);
}

private void doLockScreenAnimation() {
    android.view.View lockScreen = mWrapperView.findViewById(R.id.lock_screen_interaction_container);
    lockScreen.animate().translationX(0);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.d(com.tacticsgames.dontdie.activities.PlayServicesActivity.TAG, "onConnected(): connected to Google APIs");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.event_list);
    displayPrivateEvents();
    client = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
}

public static void requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener) {
}

private void setTargetView(@android.support.annotation.IdRes
int resId) {
    setTargetView(((android.app.Activity) (getContext())).findViewById(resId));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mCurrentTrip = getArguments().getParcelable(Trip.PARCEL_KEY);
}

@java.lang.Override
public void onFailure(retrofit2.Call<in.tosc.doandroidlib.objects.Action> call, java.lang.Throwable t) {
    setSwitchWithoutTriggering(switchBackup, false);
    android.support.design.widget.Snackbar.make(coordinatorLayout, getString(R.string.network_error), Snackbar.LENGTH_SHORT).show();
}

@java.lang.Override
public void setPrimaryItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    super.setPrimaryItem(container, position, object);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.android.record.RecordApplication.mApplication = this;
    com.android.record.RecordApplication.mContext = getApplicationContext();
}

public void clickCreateDataBase(android.view.View v) {
    edu.byui.cs246.project.DataBaseCreator creator = new edu.byui.cs246.project.DataBaseCreator(db);
    if (creator != null) {
        creator.create();
    }
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    android.util.Log.d("DEBUG", throwable.toString());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.i(com.blabbertabber.blabbertabber.MainActivity.TAG, "onCreate()");
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_course_section, container, false);
}

public void connect(com.ericsson.addroneapplication.model.ConnectionInfo connectionInfo) {
    state = com.ericsson.addroneapplication.communication.TcpSocket.State.CONNECTING;
    connection = new com.ericsson.addroneapplication.communication.TcpSocket.SocketConnection();
    connection.execute(connectionInfo);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    cancelAlarm(false);
}

@java.lang.Override
public net.idik.lib.slimadapter.viewinjector.DefaultViewInjector typeface(int id, android.graphics.Typeface typeface) {
    android.widget.TextView view = findViewById(id);
    view.setTypeface(typeface);
    return this;
}

public void createBoundBitmap() {
    xWidth = (xWidth) + 1;
    yHeight = (yHeight) + 1;
    boundBM = android.graphics.Bitmap.createBitmap(xWidth, yHeight, Bitmap.Config.ARGB_8888);
}

void displayCoordinates(@android.support.annotation.NonNull
java.lang.String latitude, @android.support.annotation.NonNull
java.lang.String longitude, @android.support.annotation.Nullable
java.lang.String altitude, float accuracy) {
    statusIndicator.setText(getContext().getString(R.string.geo_location_accuracy, accuracyFormat.format(accuracy)));
    displayCoordinates(latitude, longitude, altitude);
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    android.util.Log.d("minko", "DummyCameraPreview.surfaceCreated");
    if (isActive())
        _callback.run(surfaceHolder, 0, 0, 0);
    
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    plugin.deleteRecording(recording, true);
    listAdapter.remove(recording);
}

private void newPAssError() {
    android.widget.Toast.makeText(getBaseContext(), "New passwords don't match!", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.kcb.teacher.activity.test.EditTestActivity.sTest.addQuestion();
    showTestNameNum();
    com.kcb.common.util.ToastUtil.toast(java.lang.String.format(getResources().getString(R.string.tch_question_added), questionNum));
}

@java.lang.Override
public void onResume() {
    if (com.android.messaging.util.OsUtil.hasStoragePermission()) {
        startMediaPickerDataLoader();
    }
}

public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
    updateButton(1);
    return false;
}

boolean isFileSaveEnabled() {
    return (codepath.apps.demointroandroid.ScoreKeeperUtils.getTodayAsNoTimeString().equals(fileSaveFeatureDate)) && (fileSaveForToday);
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.i(cn.bit.hao.ble.tool.activity.BaseActivity.TAG, ((this.getClass().getSimpleName()) + " onStop"));
    cn.bit.hao.ble.tool.response.manager.CommonResponseManager.getInstance().unregisterUINotification();
}

public void onClick(android.view.View v) {
    setNotificationData();
    firebaseAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initData();
    initView();
    viewPager.setAdapter(pageAdapter);
    initEvent();
}

@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
    if ((getCallback()) != null) {
        getCallback().invalidateDrawable(this);
    }
}

protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.friends);
}

@java.lang.Override
protected void onQueueInputBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer buffer) {
    if (((com.google.android.exoplayer2.util.Util.SDK_INT) < 23) && (tunneling)) {
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    com.rohitsuratekar.NCBSinfo.database.ContactsData.makeTable(db);
    com.rohitsuratekar.NCBSinfo.database.AlarmData.makeTable(db);
    com.rohitsuratekar.NCBSinfo.database.NotificationData.makeTable(db);
    com.rohitsuratekar.NCBSinfo.database.TalkData.makeTable(db);
}

@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    super.draw(canvas);
    if ((mScroller) != null)
        mScroller.draw(canvas);
    
}

@java.lang.Override
protected void onSaveInstanceState(final android.os.Bundle outState) {
    if ((progressDialog) != null) {
        outState.putSerializable(com.company.mbelogorodtsev.trainingapplication.HomeActivity.SAVE_PROGRESS_DIALOG_PROGRESS, progressDialog.getProgress());
    }
    super.onSaveInstanceState(outState);
}

private void registerBroadcastReceiver() {
    android.content.IntentFilter statusIntentFilter = new android.content.IntentFilter(com.njlabs.showjava.Constants.PROCESS_BROADCAST_ACTION);
    registerReceiver(processStatusReceiver, statusIntentFilter);
}

