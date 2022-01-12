@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
    if ((com.facebook.AccessToken.getCurrentAccessToken()) == null) {
        mooncakemonster.orbitalcalendar.ImportExternal.ImportFacebookLogin fragment = new mooncakemonster.orbitalcalendar.ImportExternal.ImportFacebookLogin();
        fragment.show(fragmentManager, "facebook_login_fragment");
    }
}

@java.lang.Override
public void displayImage(android.content.Context context, java.lang.Object path, android.widget.ImageView imageView) {
    com.bumptech.glide.Glide.with(context).load(path).placeholder(R.mipmap.sidebar).error(R.mipmap.sidebar).crossFade().into(imageView);
}

public void returnToMain() {
    android.content.Intent intent = new android.content.Intent(this, com.ericabraham.leapfrog.MainActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void hideTrackList(@org.jetbrains.annotations.NotNull
nl.sogeti.android.gpstracker.ng.tracklist.TrackListFragment trackListFragment) {
    getSupportFragmentManager().popBackStack(nl.sogeti.android.gpstracker.ng.track.TrackActivity.TRANSACTION_TRACKS, android.support.v4.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
}

public void onClick(android.view.View v) {
    new com.example.miyoideal.extra.API(getBaseContext()).clearDieta();
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    preference.setSummary(fr.free.nrw.commons.Utils.licenseNameFor(((java.lang.String) (newValue)), getActivity().getApplicationContext()));
    return true;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mSelectedOrganization = (position != 0) ? mUserScopes.get(position) : null;
    mActivity.invalidateFragments();
}

public void showSplash() {
    if ((mProgressDialog) == null) {
        mProgressDialog = new android.app.ProgressDialog(this, R.style.custom_dialog);
        mProgressDialog.setCancelable(false);
    }
    mProgressDialog.show();
    mProgressDialog.setContentView(R.layout.splash_screen);
}

private long readLong(android.database.Cursor cursor, java.lang.String column) {
    int index = cursor.getColumnIndex(column);
    return cursor.getLong(index);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton checkbox, boolean isChecked) {
    emailEditText.setEnabled(((checkbox.isEnabled()) && isChecked));
    emailEditText.requestFocus();
}

public android.graphics.Bitmap getImageAsBitMap() {
    return android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length);
}

@java.lang.Override
public void onSessionResumeFailed(com.google.android.gms.cast.framework.CastSession session, int error) {
    timber.log.Timber.d("VideoDetailsFragment : onSessionResumeFailed()");
    onApplicationDisconnected();
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    android.widget.Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((tabs.getCurrentTab()) == 0) {
        launchEditItem(MainActivity.FragmentType.DETAILS_INCOME, null);
    }else {
        launchEditItem(MainActivity.FragmentType.DETAILS_EXPENDITURE, null);
    }
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d(org.omnirom.omnijaws.WeatherLocationListener.TAG, "The location has changed, schedule an update ");
    synchronized(org.omnirom.omnijaws.WeatherLocationListener.class) {
        org.omnirom.omnijaws.WeatherService.startUpdate(mContext, true);
        cancelTimeoutAlarm();
        org.omnirom.omnijaws.WeatherLocationListener.sInstance = null;
    }
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.w(taylorandtanner.gasscanmk1.MainActivity.TAG, "loadPost:onCancelled", databaseError.toException());
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if ((item.getItemId()) == (android.R.id.home)) {
        onBackPressed();
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    alarms.remove(position);
    me.vucko.calendarapp.alarm.database.Database.init(context);
    me.vucko.calendarapp.alarm.database.Database.deleteEntry(alarms.get(position));
    callAlarmScheduleService();
    notifyDataSetChanged();
}

@java.lang.Override
public void resume() {
    android.util.Log.i(vn.tnc.tncframework.presenter.UserListPresenter.TAG, "resume");
    userListView.showLoading();
    userListView.hideRetry();
    getListUser();
}

@android.annotation.SuppressLint(value = "NewApi")
public void run() {
    if (msg.contains("drawView")) {
    }else
        android.widget.Toast.makeText(context, (((fromName[0]) + ": ") + msg), Toast.LENGTH_SHORT).show();
    
}

@java.lang.Override
public void startEmergencySMSService() {
    startService(new android.content.Intent(getBaseContext(), com.praxisgs.emergencysms.services.EmergencySMSService.class));
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    if (db.isReadOnly()) {
        db = getWritableDatabase();
    }
    createLocationsTable(db);
    createServicesTable(db);
    createVehiclesTable(db);
    createUsersTable(db);
    createLocationServicesTable(db);
}

public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (user != null) {
        startService(serviceIntent);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Wrong username/password combo", Toast.LENGTH_LONG).show();
    }
}

private boolean isFirstStart() {
    android.content.SharedPreferences getPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    return getPrefs.getBoolean(io.gloop.drawed.SplashActivity.SHARED_PREFERENCES_FIRST_START, true);
}

@java.lang.Override
public void onItemLongClick(android.support.v7.widget.RecyclerView parent, android.view.View clickedView, int position) {
    com.marshalchen.ultimaterecyclerview.Logs.d("", "onItemLongClick()");
    toolbar.startActionMode(this);
    toggleSelection(position);
    dragDropTouchListener.startDrag();
    ultimateRecyclerView.enableSwipeRefresh(false);
}

@org.junit.Test
public void shouldRenderStatusTextView() {
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.status)));
    junit.framework.Assert.assertNotNull(textView);
}

@java.lang.Override
public void onItemClick(android.view.View view, int verticalIndex, int position) {
    mc2.tvz.croatiago.activities.DetailActivity.startDetailsActivity(getActivity(), novaLista, position);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    setAppStateToBundle(outState);
}

@com.facebook.react.bridge.ReactMethod
public void markConversionForGoalWithValue(@android.support.annotation.NonNull
java.lang.String goal, double value) {
    com.vwo.mobile.VWO.markConversionForGoal(goal, value);
}

@java.lang.Override
public void response(long code) throws android.os.RemoteException {
    android.widget.Toast.makeText(this, "error callback id invoked", Toast.LENGTH_SHORT).show();
    android.util.Log.i(cn.ac.iie.rpclient.MainActivity.TAG, "error callback is invoked");
}

@java.lang.Override
public void setDuration(long duration) {
    this.duration = duration;
    if ((scrubbing) && (duration == (com.google.android.exoplayer2.C.TIME_UNSET))) {
        stopScrubbing(true);
    }else {
        updateScrubberState();
    }
}

public java.lang.String getStartUrl() {
    android.util.Log.d(jason.github.com.photofans.crawler.processor.ImageRetrievePageProcessor.TAG, ("getStartUrl(): url = " + (jason.github.com.photofans.crawler.processor.ImageRetrievePageProcessor.sLastUrl)));
    return jason.github.com.photofans.crawler.processor.ImageRetrievePageProcessor.sLastUrl;
}

@java.lang.Override
public void onSuccess(com.quickblox.auth.model.QBSession result, android.os.Bundle params) {
    com.quickblox.sample.groupchatwebrtc.utils.TokenUtils.saveTokenData();
    creatingSessionCallback.onSuccess(result, params);
}

public static void nullSafeAppend(android.widget.TextView textView, java.lang.String text) {
    if (text == null) {
        return ;
    }else {
        textView.append(text);
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.home :
            return true;
        case R.id.action_settings :
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onDateSelected(int day, int month, int year) {
    android.widget.Toast.makeText(this, ((((("day : " + day) + " month : ") + month) + " year : ") + year), Toast.LENGTH_SHORT);
}

@java.lang.Override
public void onResume() {
    android.widget.Toast.makeText(getActivity(), "Updating", Toast.LENGTH_SHORT).show();
    initComponents(getView());
    updateMovies();
    super.onResume();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    dannylui.c4q.nyc.surfaceviewdragdrop.MainActivity.activity = this;
    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, new dannylui.c4q.nyc.surfaceviewdragdrop.MainFragment()).commit();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return codepathproject.nothinganswered.TinderExperiment.FragmentTinderQuestionsTimeline.newInstance(position);
    }
    if (position == 1) {
        return codepathproject.nothinganswered.TinderExperiment.FragmentTinderVideosTimeline.newInstance(position);
    }else {
        return null;
    }
}

private void init(android.content.Context context) {
    setLayoutManager(new android.support.v7.widget.LinearLayoutManager(context));
    snapperCarr.attachToRecyclerView(this);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.activity_main, container, false);
    com.wq.android.lightannotation.Injector.inject(this);
    return root;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    switch (intent.getAction()) {
        case android.content.Intent.ACTION_POWER_CONNECTED :
            determineAndNotify(true);
        case android.content.Intent.ACTION_POWER_DISCONNECTED :
            determineAndNotify(false);
    }
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return (view.getTag()) == object;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.create_message)) {
        startActivity(new android.content.Intent(getActivity(), com.example.yass8n.whozthis.activities.NewMessages.class));
    }
}

@java.lang.Override
public int getItemPosition(java.lang.Object object) {
    int index = fragments.indexOf(((android.support.v4.app.Fragment) (object)));
    if (index == (-1))
        return POSITION_NONE;
    else
        return index;
    
}

public void onClick(android.view.View v) {
    java.lang.System.exit(0);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    com.kit10.csci448.catastrophe.GameFragment.mHandler = getHandler();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
public void onGlobalLayout() {
    getFullImageView().setImageBitmap(fullBorader);
    ((com.mixcolours.photoshare.photoview.PhotoView) (getImageView())).setScaleType(ImageView.ScaleType.CENTER_CROP);
    getImageView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
}

private void editWord(android.app.Activity activity, lt.ru.lexio.db.Dictionary currentDictionary, java.lang.Integer position) {
    lt.ru.lexio.db.Word word = wordDAO.read(lWords.getItemIdAtPosition(position));
    saveWord(activity, currentDictionary, word);
}

public void unbind(android.content.Context context, java.lang.Object connection) throws java.lang.Exception {
    android.content.Intent intent = mServiceIntents.get(connection);
    if (intent != null) {
        onUnbind(context, intent);
    }
}

@java.lang.Override
public void run() {
    android.util.Log.d("CALL_INTEGRATION", "CallActivity. initSwitchSpeakerTask lunched");
    boolean result = videoChatHelper.switchMic();
}

public static void d(java.lang.String tag, java.lang.Object msg) {
    if ((net.opentracker.android.LogWrapper.m_logLevel.compareTo(net.opentracker.android.LogWrapper.LogLevel.kDebug)) <= 0)
        android.util.Log.v(tag, msg.toString());
    
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    mQuery = savedInstanceState.getString("query");
    super.onRestoreInstanceState(savedInstanceState);
}

@java.lang.Override
public void run() {
    android.content.Intent mainIntent = new android.content.Intent(this, com.slateandpencil.contact.MainActivity.class);
    mainIntent.putExtra("Launch", true);
    this.startActivity(mainIntent);
    this.finish();
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    deleteItem(viewHolder.getAdapterPosition());
}

private void startServer() {
    android.util.Log.i(TAG, "MainActivity.startServer()");
    sendTask(Constant.TASK_START_SERVER);
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    player.stop();
    return super.onUnbind(intent);
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    android.content.Intent i = new android.content.Intent(this, org.oo.oodroid2.OoDroidActivity.class);
    startActivity(i);
    finish();
}

@java.lang.Override
public void onDestroy() {
    sendTimerInfo(com.sofi.knittimer.TimerService.BROADCAST_ACTION_FINISH);
    handler.removeCallbacks(sendUpdatesToUI);
    android.util.Log.i("TimerService", "onDestroy called");
    super.onDestroy();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setupFirebaseTest();
    setupHttpTest();
    cc.arduino.mvd.MvdHelper.loadDebug(getApplicationContext());
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((org.wordpress.android.WordPress) (getApplication())).component().inject(this);
}

@java.lang.Override
public void onUserClick(android.view.View view, long userDbId) {
    fr.sims.coachingproject.ui.activity.ProfileActivity.startActivity(getContext(), userDbId);
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    de.dhbw_loerrach.laju.Receiver receiver = new de.dhbw_loerrach.laju.Receiver(this);
    receiver.clearQueue();
    receiver.fillEvents();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.view.View view = getView();
    if (view != null) {
        view.invalidate();
    }
}

@java.lang.Override
public void onDraw(@android.support.annotation.NonNull
android.graphics.Canvas canvas, @android.support.annotation.NonNull
android.graphics.Paint paint) {
    super.onDraw(canvas, paint);
    com.idonans.doodle.DoodleView.resetPaint(paint);
    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, paint);
}

@java.lang.Override
public java.lang.Long readKey(android.database.Cursor cursor, int offset) {
    return cursor.isNull((offset + 0)) ? null : cursor.getLong((offset + 0));
}

private void setPlayButtonIcon() {
    if ((stopwatchState.isRunning()) && ((playButton) != null))
        playButton.setImageResource(android.R.drawable.ic_media_pause);
    else
        playButton.setImageResource(android.R.drawable.ic_media_play);
    
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences pref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    pref.unregisterOnSharedPreferenceChangeListener(this);
}

@java.lang.Override
public void onApiConnected() {
    super.onApiConnected();
    adapter.addAll(com.o3dr.services.android.lib.gcs.follow.FollowType.values());
    getBroadcastManager().registerReceiver(eventReceiver, org.droidplanner.android.fragments.mode.ModeFollowFragment.eventFilter);
}

public void handleMessage(android.os.Message msg) {
    if ((progress) != null) {
        progress.dismiss();
    }
    if (!(com.fionera.cleaner.utils.DroidWallApi.hasRootAccess(mContext, true))) {
        return ;
    }
    com.fionera.cleaner.utils.DroidWallApi.showIpTablesRules(mContext);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    try {
        mWindowManager.removeViewImmediate(mLayout);
    } catch (java.lang.Exception e) {
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    this.finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentBook) == 1) {
        currentBook = 66;
    }else {
        currentBook -= 1;
    }
    updateRecycleView(currentBook);
}

@java.lang.Override
public boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) {
    mOffset += getHoizontalDistance((-distanceX));
    requestLayout();
    return true;
}

public java.lang.String getPosterUrl(android.content.Context c) {
    com.example.davidutterman.androidmovieapp.Config p = new com.example.davidutterman.androidmovieapp.Config(c.getAssets());
    java.lang.String posterUrl = p.getProperty("poster_url");
    return posterUrl + (getThumbnail());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((itemClickListener) != null)
        itemClickListener.onItemClick(null, itemView, position, 0);
    
}

@java.lang.Override
public void onError(java.lang.String error) {
    constructorCallback.onError(error);
    android.util.Log.e(com.telerik.plugins.mapbox.OfflineRegion.LOG_TAG, error);
    com.telerik.plugins.mapbox.OfflineRegion.removeOfflineRegion(getId());
}

public void unfriendUser(final java.lang.String hostId, final com.android.summer.csula.foodvoter.models.User friend) {
    friendshipRef.child(friend.getId()).removeValue();
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    autoSave();
    getGlobalState().selectSketch(APDE.DEFAULT_SKETCH_NAME, APDE.SketchLocation.TEMPORARY);
    newSketch();
    forceDrawerReload();
    getSupportActionBar().setTitle(getGlobalState().getSketchName());
}

@java.lang.Override
public void onInit(final int status) {
    tts.setLanguage(java.util.Locale.US);
    counter.setEnabled((status == (android.speech.tts.TextToSpeech.SUCCESS)));
}

public void updateBooksData(android.content.Context context) {
    if ((books) != null) {
        for (moe.feng.nhentai.model.Book book : books) {
            book.updateDataFromOldData(context);
        }
    }
}

@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    android.util.Log.i(com.tpb.projects.data.Editor.TAG, ("onResponse: Card update: " + (response.toString())));
    if (listener != null)
        listener.updated(com.tpb.projects.data.models.Card.parse(response));
    
}

@java.lang.Override
public void onSuccess(java.lang.Object o) {
    android.util.Log.d(TAG, "Device unregistered for push success");
    mpushEnabled = false;
    pushEnabled = mpushEnabled;
    callback.onSuccess(new com.qwasi.sdk.QwasiError().errorWithCode(QwasiErrorCode.QwasiErrorNone, "UnSet Push Token success"));
}

private static android.app.PendingIntent getAlarmIntent(android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, com.voidgreen.privatcurrency.widget.CurrencyWidgetProvider.class);
    intent.setAction(Constants.ACTION_UPDATE);
    android.app.PendingIntent pi = android.app.PendingIntent.getBroadcast(context, 0, intent, 0);
    return pi;
}

public void postGenres(android.content.Context c, org.json.JSONArray genresArr) {
    com.melodies.bandup.DatabaseSingleton.getInstance(com.facebook.FacebookSdk.getApplicationContext()).getBandUpDatabase().postGenres(genresArr, getPickListener(), getPickErrorListener(c));
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    progressBar.setVisibility(View.GONE);
    view.loadUrl("javascript:alert(functionThatReturnsSomething())");
}

private void resetDatabase() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL("drop table person;");
    db.execSQL("drop table personcapture;");
    db.execSQL(createPersonTable);
    db.execSQL(createPersonWordTable);
    db.close();
}

@java.lang.Override
public void onTrigger(android.hardware.TriggerEvent event) {
    speedCalc();
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, 30, locListener);
}

@org.junit.Test
public void shouldRenderChildNameTextView() {
    android.widget.TextView nameView = ((android.widget.TextView) (activity.findViewById(R.id.name)));
    junit.framework.Assert.assertNotNull(nameView);
}

private int getHeaderHeightForLayout(android.view.View header) {
    if (header != null) {
        return mRenderHeaderInline ? 0 : header.getMeasuredHeight();
    }
    return 0;
}

@java.lang.Override
public android.database.Cursor runQuery(java.lang.CharSequence constraint) {
    if (de.robv.android.xposed.installer.XposedApp.getInstance().areDownloadsEnabled()) {
        return de.robv.android.xposed.installer.repo.RepoDb.queryModuleOverview(mSortingOrder, constraint);
    }else {
        showDisabledDownloadsDialog();
        return null;
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(DATABASE_CREATE);
    android.util.Log.v("111", "111");
}

@java.lang.Override
public void onRequestSuccess(com.tapjoy.TJPlacement tjPlacement) {
    android.util.Log.d("Tapjoy", "onRequestSuccess");
    this.isReady = false;
    com.app.woney.fragment.EarnMainFragment.updateButtonLayout();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.book_another_search);
    android.content.Intent intent = getIntent();
    books = intent.getStringArrayListExtra("books");
    if ((books) == null) {
    }
}

private void showGlobalContextActionBar() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    actionBar.setCustomView(getActivity().getLayoutInflater().inflate(R.layout.stockboo_action_bar, null));
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    menuSetApplyOrSave(menu, dev.ukanth.ufirewall.Api.isEnabled(this));
    dev.ukanth.ufirewall.Api.updateLanguage(getApplicationContext(), dev.ukanth.ufirewall.util.G.locale());
    return super.onPrepareOptionsMenu(menu);
}

private android.content.Intent getNotificationIntent() {
    android.content.Intent intent = new android.content.Intent(this, com.codepath.socialshopper.socialshopper.Activities.PickUpList.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    return intent;
}

private static boolean hasVibratorIntensity(com.android.settings.notification.Content context) {
    android.hardware.CmHardwareManager cmHardwareManager = ((android.hardware.CmHardwareManager) (context.getSystemService(Context.CMHW_SERVICE)));
    if (!(cmHardwareManager.isSupported(CmHardwareManager.FEATURE_VIBRATOR))) {
        return false;
    }
    return true;
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    if (com.fezrestia.android.util.log.Log.IS_DEBUG)
        com.fezrestia.android.util.log.Log.logDebug(com.fezrestia.android.viewfinderanywhere.service.OverlayViewFinderService.TAG, "onBind() : E");
    
    if (com.fezrestia.android.util.log.Log.IS_DEBUG)
        com.fezrestia.android.util.log.Log.logDebug(com.fezrestia.android.viewfinderanywhere.service.OverlayViewFinderService.TAG, "onBind() : X");
    
    return null;
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.e("locationListener", "Location update");
    currentLocation = location;
    centerOnMapPosition(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
    updateDisplayedTags();
}

