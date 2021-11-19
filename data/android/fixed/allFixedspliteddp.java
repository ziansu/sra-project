@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
    mooncakemonster.orbitalcalendar.ImportExternal.ImportFacebookLogin fragment = new mooncakemonster.orbitalcalendar.ImportExternal.ImportFacebookLogin();
    fragment.show(fragmentManager, "facebook_login_fragment");
}

@java.lang.Override
public void displayImage(android.content.Context context, java.lang.Object path, android.widget.ImageView imageView) {
    com.bumptech.glide.Glide.with(context).load(path).crossFade().into(imageView);
}

public void returnToMain() {
    finish();
    android.content.Intent intent = new android.content.Intent(this, com.ericabraham.leapfrog.MainActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void hideTrackList(@org.jetbrains.annotations.NotNull
nl.sogeti.android.gpstracker.ng.tracklist.TrackListFragment trackListFragment) {
}

public void onClick(android.view.View v) {
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    preference.setSummary(fr.free.nrw.commons.Utils.licenseNameFor(((java.lang.String) (newValue)), context));
    return true;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mSelectedOrganization = (position != 0) ? mUserScopes.get((position - 1)) : null;
    mActivity.invalidateFragments();
}

public void showSplash() {
    mProgressDialog = new android.app.ProgressDialog(this, R.style.custom_dialog);
    mProgressDialog.setCancelable(false);
    mProgressDialog.show();
    mProgressDialog.setContentView(R.layout.splash_screen);
}

private long getLong(android.database.Cursor cursor, java.lang.String column) {
    int index = cursor.getColumnIndex(column);
    return cursor.getLong(index);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton checkbox, boolean isChecked) {
}

public android.graphics.Bitmap getImageAsBitMap() {
    if ((image) != null)
        return android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length);
    
    return null;
}

@java.lang.Override
public void onSessionResumeFailed(com.google.android.gms.cast.framework.CastSession session, int error) {
    onApplicationDisconnected();
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((tabs.getCurrentTab()) == 0) {
        launchEditItem(getActivity(), MainActivity.FragmentType.DETAILS_INCOME, null);
    }else {
        launchEditItem(getActivity(), MainActivity.FragmentType.DETAILS_EXPENDITURE, null);
    }
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d(org.omnirom.omnijaws.WeatherLocationListener.TAG, "The location has changed, schedule an update ");
    synchronized(org.omnirom.omnijaws.WeatherLocationListener.class) {
        org.omnirom.omnijaws.WeatherService.startUpdate(mContext);
        cancelTimeoutAlarm();
        org.omnirom.omnijaws.WeatherLocationListener.sInstance = null;
    }
}

@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (android.R.id.home)) {
        onBackPressed();
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    me.vucko.calendarapp.alarm.database.Database.init(context);
    me.vucko.calendarapp.alarm.database.Database.deleteEntry(alarms.get(position));
    alarms.remove(position);
    callAlarmScheduleService();
    notifyDataSetChanged();
}

@java.lang.Override
public void resume() {
    userListView.showLoading();
    userListView.hideRetry();
    getListUser();
}

@android.annotation.SuppressLint(value = "NewApi")
public void run() {
    android.widget.Toast.makeText(context, (((fromName[1]) + ": ") + msg), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void startEmergencySMSService() {
    startService(new android.content.Intent(this, com.praxisgs.emergencysms.services.EmergencySMSService.class));
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    if (db.isReadOnly()) {
        db = getWritableDatabase();
    }
    createLocationsTable(db);
    createServicesTable(db);
    createUsersTable(db);
    createLocationServicesTable(db);
}

public void done(com.parse.ParseUser user, com.parse.ParseException e) {
    if (user != null) {
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Wrong username/password combo", Toast.LENGTH_LONG).show();
    }
}

private boolean isFirstStart() {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean(io.gloop.drawed.SplashActivity.SHARED_PREFERENCES_FIRST_START, true);
}

@java.lang.Override
public void onItemLongClick(android.support.v7.widget.RecyclerView parent, android.view.View clickedView, int position) {
    com.marshalchen.ultimaterecyclerview.Logs.d("onItemLongClick()");
    toolbar.startActionMode(this);
    toggleSelection(position);
    dragDropTouchListener.startDrag();
    ultimateRecyclerView.enableSwipeRefresh(false);
}

@org.junit.Test
public void shouldRenderStatusTextView() {
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.status)));
    assertNotNull(textView);
}

@java.lang.Override
public void onItemClick(android.view.View view, int verticalIndex, int position) {
    mc2.tvz.croatiago.activities.DetailActivity.startDetailsActivity(getActivity(), novaLista, position, false);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
}

@com.facebook.react.bridge.ReactMethod
public void markConversionForGoalWithValue(@android.support.annotation.NonNull
java.lang.String goal, java.lang.Double value) {
    com.vwo.mobile.VWO.markConversionForGoal(goal, value);
}

@java.lang.Override
public void response(long code) throws android.os.RemoteException {
    android.widget.Toast.makeText(this, "error callback is invoked", Toast.LENGTH_SHORT).show();
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
    update();
}

public java.util.List<java.lang.String> getStartUrl() {
    android.util.Log.d(jason.github.com.photofans.crawler.processor.ImageRetrievePageProcessor.TAG, ("getStartUrl(): url = " + (jason.github.com.photofans.crawler.processor.ImageRetrievePageProcessor.sLastUrl.size())));
    return jason.github.com.photofans.crawler.processor.ImageRetrievePageProcessor.sLastUrl;
}

@java.lang.Override
public void onSuccess(com.quickblox.auth.model.QBSession result, android.os.Bundle params) {
    creatingSessionCallback.onSuccess(result, params);
}

public static void nullSafeAppend(android.widget.TextView textView, java.lang.String text) {
    if (text != null) {
        textView.append(text);
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onDateSelected(int day, int month, int year) {
    android.widget.Toast.makeText(this, ((((("day : " + day) + " month : ") + month) + " year : ") + year), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onResume() {
    android.widget.Toast.makeText(getActivity(), "Updating", Toast.LENGTH_SHORT).show();
    updateMovies(getView());
    super.onResume();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, new dannylui.c4q.nyc.surfaceviewdragdrop.MainFragment()).commit();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return codepathproject.nothinganswered.TinderExperiment.FragmentTinderQuestionsTimeline.newInstance(position);
    }else {
        return null;
    }
}

private void init() {
    snapperCarr.attachToRecyclerView(this);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.activity_main, container, false);
    com.wq.android.lightannotation.Injector.inject(this, root);
    return root;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    switch (intent.getAction()) {
        case android.content.Intent.ACTION_POWER_CONNECTED :
            determineAndNotify(true);
            break;
        case android.content.Intent.ACTION_POWER_DISCONNECTED :
            determineAndNotify(false);
            break;
    }
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return view == object;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.create_message)) {
        startActivity(new android.content.Intent(this, com.example.yass8n.whozthis.activities.NewMessages.class));
    }
}

@java.lang.Override
public int getItemPosition(java.lang.Object object) {
    int index = fragments.indexOf(object);
    if (index == (-1))
        return POSITION_NONE;
    else
        return index;
    
}

public void onClick(android.view.View v) {
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    getHandler();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
@java.lang.Override
public void onGlobalLayout() {
    getFullImageView().setImageBitmap(fullBorader);
    getImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
    getImageView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
}

private void editWord(android.app.Activity activity, lt.ru.lexio.db.Dictionary currentDictionary, java.lang.Long id) {
    lt.ru.lexio.db.Word word = wordDAO.read(id);
    saveWord(activity, currentDictionary, word);
}

public boolean unbind(android.content.Context context, java.lang.Object connection) throws java.lang.Exception {
    android.content.Intent intent = mServiceIntents.get(connection);
    onUnbind(context, intent);
    return intent != null;
}

@java.lang.Override
public void run() {
    android.util.Log.d("CALL_INTEGRATION", "CallActivity. initSwitchSpeakerTask lunched");
    videoChatHelper.switchMic();
}

public static void d(java.lang.String tag, java.lang.Object msg) {
    if ((net.opentracker.android.LogWrapper.m_logLevel.compareTo(net.opentracker.android.LogWrapper.LogLevel.kDebug)) <= 0)
        android.util.Log.d(tag, msg.toString());
    
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mQuery = savedInstanceState.getString("query");
}

@java.lang.Override
public void run() {
    android.content.Intent mainIntent = new android.content.Intent(this, com.slateandpencil.contact.MainActivity.class);
    this.startActivity(mainIntent);
    this.finish();
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
}

private void startServer() {
    sendTask(Constant.TASK_START_SERVER);
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    return super.onUnbind(intent);
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
}

@java.lang.Override
public void onDestroy() {
    sendTimerInfo(com.sofi.knittimer.TimerService.BROADCAST_ACTION_FINISH);
    handler.removeCallbacks(sendUpdatesToUI);
    super.onDestroy();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    cc.arduino.mvd.MvdHelper.loadDebug(getApplicationContext());
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    ((org.wordpress.android.WordPress) (getApplication())).component().inject(this);
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onUserClick(android.view.View view, long userDbId) {
    fr.sims.coachingproject.ui.activity.ProfileActivity.startActivity(getActivity(), userDbId);
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    de.dhbw_loerrach.laju.Receiver receiver = new de.dhbw_loerrach.laju.Receiver(this);
    receiver.fillEvents();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onDraw(@android.support.annotation.NonNull
android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, null);
}

@java.lang.Override
public java.lang.String readKey(android.database.Cursor cursor, int offset) {
    return cursor.isNull((offset + 1)) ? null : cursor.getString((offset + 1));
}

private void setPlayButtonIcon() {
    if ((playButton) != null) {
        if (stopwatchState.isRunning())
            playButton.setImageResource(android.R.drawable.ic_media_pause);
        else
            playButton.setImageResource(android.R.drawable.ic_media_play);
        
    }
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences pref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
}

@java.lang.Override
public void onApiConnected() {
    super.onApiConnected();
    getBroadcastManager().registerReceiver(eventReceiver, org.droidplanner.android.fragments.mode.ModeFollowFragment.eventFilter);
}

public void handleMessage(android.os.Message msg) {
    if (!(com.fionera.cleaner.utils.DroidWallApi.hasRootAccess(mContext, true))) {
        return ;
    }
    com.fionera.cleaner.utils.DroidWallApi.showIpTablesRules(mContext);
    if ((progress) != null) {
        progress.dismiss();
    }
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    try {
        mWindowManager.removeViewImmediate(mLayout);
        mLayout = null;
    } catch (java.lang.Exception e) {
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentBook) == 66) {
        currentBook = 1;
    }else {
        currentBook += 1;
    }
    updateRecycleView(currentBook);
}

@java.lang.Override
public boolean onScroll(android.view.MotionEvent e1, android.view.MotionEvent e2, float distanceX, float distanceY) {
    return false;
}

public java.lang.String getPosterUrl(android.content.Context context) {
    com.example.davidutterman.androidmovieapp.Config p = new com.example.davidutterman.androidmovieapp.Config(context);
    return (p.getProperty("poster_url")) + (getThumbnail());
}

@java.lang.Override
public void onClick(android.view.View v) {
    itemClickListener.onItemClick(null, itemView, position, 0);
}

@java.lang.Override
public void onError(java.lang.String error) {
    constructorCallback.onError(error);
    com.telerik.plugins.mapbox.OfflineRegion.removeOfflineRegion(getId());
}

public void unfriendUser(final com.android.summer.csula.foodvoter.models.User friend) {
    friendshipRef.child(friend.getId()).removeValue();
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    getGlobalState().selectSketch(APDE.DEFAULT_SKETCH_NAME, APDE.SketchLocation.TEMPORARY);
    newSketch();
    forceDrawerReload();
    getSupportActionBar().setTitle(getGlobalState().getSketchName());
}

@java.lang.Override
public void onInit(final int status) {
    tts.setLanguage(java.util.Locale.US);
}

public void updateBooksData(android.content.Context context) {
    if ((books) != null) {
        books = new java.util.ArrayList<>();
    }
}

@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    if (listener != null)
        listener.updated(com.tpb.projects.data.models.Card.parse(response));
    
}

@java.lang.Override
public void onSuccess(java.lang.Object o) {
    android.util.Log.d(TAG, "Device unregistered for push success");
    pushEnabled = false;
    mpushEnabled = pushEnabled;
    callback.onSuccess(new com.qwasi.sdk.QwasiError().errorWithCode(QwasiErrorCode.QwasiErrorNone, "UnSet Push Token success"));
}

public static android.app.PendingIntent getAlarmIntent(android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, com.voidgreen.privatcurrency.widget.CurrencyWidgetProvider.class);
    intent.setAction(Constants.ACTION_UPDATE);
    android.app.PendingIntent pi = android.app.PendingIntent.getBroadcast(context, 0, intent, 0);
    return pi;
}

public void postGenres(android.content.Context c, org.json.JSONArray genresArr) {
    com.melodies.bandup.DatabaseSingleton.getInstance(c).getBandUpDatabase().postGenres(genresArr, getPickListener(), getPickErrorListener(c));
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    progressBar.setVisibility(View.GONE);
}

private void resetDatabase() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.execSQL(createPersonTable);
    db.execSQL(createPersonWordTable);
    db.close();
}

@java.lang.Override
public void onTrigger(android.hardware.TriggerEvent event) {
    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, 30, locListener);
}

@org.junit.Test
public void shouldRenderChildNameTextView() {
    android.widget.TextView nameView = ((android.widget.TextView) (activity.findViewById(R.id.name)));
    assertNotNull(nameView);
}

private int getHeaderHeightForLayout(android.view.View header) {
    if (header != null) {
        return header.getMeasuredHeight();
    }
    return 0;
}

@java.lang.Override
public android.database.Cursor runQuery(java.lang.CharSequence constraint) {
    if (de.robv.android.xposed.installer.XposedApp.getInstance().areDownloadsEnabled()) {
        return de.robv.android.xposed.installer.repo.RepoDb.queryModuleOverview(mSortingOrder, constraint);
    }else {
        return null;
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(DATABASE_CREATE);
}

@java.lang.Override
public void onRequestSuccess(com.tapjoy.TJPlacement tjPlacement) {
    android.util.Log.d("Tapjoy", "onRequestSuccess");
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.book_another_search);
    android.content.Intent intent = getIntent();
    books = intent.getStringArrayListExtra("books");
    if ((books) == null) {
    }
}

private void showGlobalContextActionBar() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    dev.ukanth.ufirewall.Api.updateLanguage(getApplicationContext(), dev.ukanth.ufirewall.util.G.locale());
    menuSetApplyOrSave(menu, dev.ukanth.ufirewall.Api.isEnabled(this));
    return true;
}

private android.content.Intent getNotificationIntent() {
    android.content.Intent intent = new android.content.Intent(this, com.codepath.socialshopper.socialshopper.Activities.PickUpList.class);
    return intent;
}

private static boolean hasVibratorIntensity(android.content.Context context) {
    android.hardware.CmHardwareManager cmHardwareManager = ((android.hardware.CmHardwareManager) (context.getSystemService(Context.CMHW_SERVICE)));
    if (!(cmHardwareManager.isSupported(CmHardwareManager.FEATURE_VIBRATOR))) {
        return false;
    }
    return true;
}

@android.support.annotation.Nullable
@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    return null;
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    currentLocation = location;
    centerOnMapPosition(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
    updateDisplayedTags();
}

