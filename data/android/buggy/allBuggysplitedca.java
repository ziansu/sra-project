public void showFab() {
    if ((getFab().getVisibility()) == (android.view.View.GONE)) {
        getFab().show();
    }
    java.lang.System.out.println(getFab().getVisibility());
}

public void producerPath(android.view.View view) {
}

private void onStartAnimation(int itemId) {
    android.view.View item = mFixedItem.get(itemId);
    itemAutoMove(item, mPerTranslateY, 2.0F);
    preItemId = itemId;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(com.huhx0015.doordashchallenge.view.fragments.RestaurantListFragment.INSTANCE_TAG, mTag);
    outState.putParcelableArrayList(com.huhx0015.doordashchallenge.view.fragments.RestaurantListFragment.INSTANCE_RESTAURANT_LIST, new java.util.ArrayList(mRestaurantList));
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    isSensorServiceBound = false;
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    activity.startActivity(activity.getIntent());
    return true;
}

public static void initUserReferences(android.content.Context context) {
    com.k12nt.k12netframe.utils.userSelection.K12NetUserReferences.references = new com.k12nt.k12netframe.utils.userSelection.K12NetUserReferences(context);
}

@java.lang.Override
public int compareTo(@android.support.annotation.NonNull
co.smartreceipts.android.model.Category category) {
    return category.getName().compareTo(mName);
}

public void initCallbacks() {
    mCameraManager.registerAvailabilityCallback(getCamAvailabilityCallback(), new android.os.Handler(mContext.getMainLooper()));
    if ((mCamNoPreview) != null) {
        mCamNoPreview.registerCameraListener(this);
    }
}

@java.lang.Override
public void before() {
    android.util.Log.w(com.google.android.perftesting.testrules.GetExecutionTime.LOG_TAG, "------GetExecutionTime before--------");
    try {
        android.util.Log.w(com.google.android.perftesting.testrules.GetExecutionTime.LOG_TAG, "--------------start------------");
        StartTime = java.lang.System.nanoTime();
    } catch (java.lang.Exception exception) {
    }
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if (((curPosition) < (phraseFiles.size())) || (repeat)) {
        (curPosition)++;
        playQueue();
    }else {
        mp.release();
    }
}

@java.lang.Override
public void LongclickListener(android.view.View view) {
    layout.addMovedView(view);
    view.setVisibility(View.INVISIBLE);
    dragImageView.disallowInterceptTouchEvent(true);
    layout.setMaxRecylerViewWidth(recyclerview.getMeasuredWidth());
}

public void start() {
    mediaPlayer.start();
    state = edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.PLAYING;
    android.util.Log.e("Media Player Service", ("State: " + (getState())));
}

public void initData(com.bumptech.glide.RequestManager manager, com.mobcent.discuz.bean.Banner banner) {
    this.banner = banner;
    com.litesuits.android.log.Log.d("Banner", ("startLoad:" + (banner.getImg())));
}

@java.lang.Override
public java.lang.Throwable handleError(retrofit.RetrofitError err) {
    retrofit.client.Response resp = err.getResponse();
    android.util.Log.v("Error :", ("err: " + (resp.toString())));
    return err;
}

public void deleteUser(io.github.data4all.model.data.User user) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(io.github.data4all.model.DataBaseHandler.TABLE_USER, ((io.github.data4all.model.DataBaseHandler.KEY_USERNAME) + "=?"), new java.lang.String[]{ user.getUsername() });
    db.close();
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    doOnActivityResult(requestCode, resultCode, data);
}

public void done(java.lang.Boolean result, com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.i("Results :", result.toString());
    }else {
        android.util.Log.i("Error", e.getMessage());
    }
}

public void clearExerciseTable() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    java.lang.String qry = "DELETE FROM " + (com.liftlog.data.DataAccessObject.EXERCISE_TABLE_NAME);
    db.execSQL(qry);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    editor.putBoolean("firstAppStart", false);
    editor.commit();
    createUser(androidId, userInput.getText().toString());
    setRecentReviews();
}

@java.lang.Override
public void onNext(com.scala.exp.android.sdk.model.Thing thing) {
    java.lang.Object zones = thing.get("location.zones");
    android.util.Log.e("Response", thing.toString());
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    alarms.deleteAlarm(position);
    alarms.cancelAlarm(position);
    notifyDataSetChanged();
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            removeOverlayFromMap(overlay);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
        default :
            break;
    }
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    etBeginDate.setText(com.codepath.nytquest.utils.DateHelper.getFormatteDate(year, month, day));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean fromUser) {
    if (fromUser)
        jcAudioPlayer.seekTo(i);
    
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    wakeLock();
    android.util.Log.d(com.neirx.stopwatchtimer.MainActivity.TAG, ((com.neirx.stopwatchtimer.MainActivity.CLASS_NAME) + "onResume"));
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    save();
    android.widget.Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public android.database.Cursor loadInBackground() {
    android.database.Cursor cursor = db.getUserFood();
    try {
        java.util.concurrent.TimeUnit.MILLISECONDS.sleep(1);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return cursor;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent("ml.yats.connect.mainactivity");
    i.putExtra("mode", "router");
    i.putExtra("number", mPhoneText.getText());
    startActivity(i);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    android.os.Bundle args = getArguments();
    if (args != null) {
        mPageIndex = args.getInt(me.li2.android.inteliment_demo.ui.SimplePageFragment.ARG_KEY_PAGE_INDEX);
    }
}

@java.lang.Override
public void onLoaded(@android.support.annotation.NonNull
com.demo.navigator.ds.model.Entry entry) {
    if ((mBinding) == null) {
        return ;
    }
    setupMenuBar();
    navigateEntry(entry, true);
    mBinding.getFragment().getChildFragmentManager().addOnBackStackChangedListener(this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    int clickedPosition = getAdapterPosition();
    if (isSteps) {
        mOnClickListener.onListItemClick(clickedPosition);
    }
}

@java.lang.Override
public void onClick(android.view.View onClickView) {
    com.example.kangjisung.likeroom.FragmentStamp.StampUseDialog stampUseDialog = new com.example.kangjisung.likeroom.FragmentStamp.StampUseDialog(context, activity, (((position * 2) + 1) * (com.example.kangjisung.likeroom.DefineManager.standardMileage)));
    stampUseDialog.show();
}

public static boolean applyIptablesRules(android.content.Context ctx, boolean showErrors) {
    if (ctx == null) {
        return false;
    }
    dev.ukanth.ufirewall.Api.initSpecial();
    dev.ukanth.ufirewall.Api.saveRules(ctx);
    return dev.ukanth.ufirewall.Api.applySavedIptablesRules(ctx, showErrors);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.i(TAG, "onDestroy");
    if (fi.vtt.nubotest.MainActivity.kurentoRoomAPI.isWebSocketConnected())
        fi.vtt.nubotest.MainActivity.kurentoRoomAPI.sendLeaveRoom(roomId);
    
    fi.vtt.nubotest.MainActivity.kurentoRoomAPI.disconnectWebSocket();
}

public void addMarker(java.lang.String title, double longitude, double latitude) {
    myMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().title(title).position(new com.google.android.gms.maps.model.LatLng(longitude, latitude)));
}

public void startGMail(android.view.View view) {
    com.example.asds_template.IMAPManager imap = new com.example.asds_template.IMAPManager();
    imap.checkInBox();
}

public synchronized android.database.sqlite.SQLiteDatabase openDB(int type) {
    android.database.sqlite.SQLiteDatabase database = org.spinsuite.base.DB_Manager.getInstance().open();
    database.enableWriteAheadLogging();
    return database;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.d(foodie.com.foodie.GPSLocation.TAG, "Locations API connected successfully");
    getLastKnownLocation();
    locationSubject.notifyAllObservers();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mMovieDetail) != null) {
        mUserFavoriteViewModel.deleteMovieById(mMovieId);
    }
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    br.pro.hashi.ensino.desagil.sqlite.StudentDAO dao = new br.pro.hashi.ensino.desagil.sqlite.SQLiteStudentDAO(this);
    dao.delete(student);
    dao.close();
    refresh();
    return false;
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String responseString, java.lang.Throwable throwable) {
    super.onFailure(statusCode, headers, responseString, throwable);
    android.widget.Toast.makeText(com.codepath.apps.tweetter.TweetAdapter.context, "Unable to unretweet", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onLoadSuccess() {
    android.util.Log.i(app.park.com.vr.VrVideoActivity.TAG, ("Sucessfully loaded video " + (mVrVideoView.getDuration())));
    loadVideoStatus = app.park.com.vr.VrVideoActivity.LOAD_VIDEO_STATUS_SUCCESS;
    mVrVideoView.pauseVideo();
}

private void checkIsInEditMode() {
    final android.os.Bundle arguments = getArguments();
    if (null == arguments) {
        edit = false;
    }else {
        edit = arguments.getBoolean(com.google.samples.apps.topeka.fragment.SignInFragment.ARG_EDIT, false);
    }
}

@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    if (verticalOffset < 0) {
        translateContent(verticalOffset);
        animatePinningView(verticalOffset);
    }
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String res, java.lang.Throwable t) {
    android.widget.Toast.makeText(getApplicationContext(), ("" + res), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    android.widget.Toast.makeText(this, "Sent Information to Server...", Toast.LENGTH_LONG);
    android.widget.Toast.makeText(this, s, Toast.LENGTH_LONG);
}

public void returnToMainLoop(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(ctx, hackmit2016.moodometer.ContactsActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getBaseContext(), de.androidnewcomer.pendlerwecker.Geo_Service.class);
    startService(intent);
    android.util.Log.d("Log", "hier1");
}

@java.lang.Override
public void onNetError(com.example.dramtar.testprojectforestafeta.libs.NetWork.NetErrors oError) {
    mNetProgressDialog.dismiss();
    android.widget.Toast.makeText(getContext(), "Error Connection", Toast.LENGTH_LONG);
}

@java.lang.Override
public boolean onClusterItemClick(com.whiterabbit.pisabike.screens.map.MapItem mapItem) {
    android.util.Log.d("MAP", ((mapItem.getTitle()) + "cliccked"));
    mPresenter.onStationClicked(mapItem.getStation().getName());
    return true;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((android.content.pm.PackageManager.PERMISSION_GRANTED) != (android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE))) {
        refreshPhotoList();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.visiontech.yummysmile.ui.adapter.MainCardsAdapter.listener) != null) {
        com.visiontech.yummysmile.ui.adapter.MainCardsAdapter.listener.onMealCardClicked(meal);
    }
}

public void onConnected(android.os.Bundle connectionHint) {
    signInStatus = "Sign Out Of Google";
}

void updateChart(int position) {
    android.view.View view = getViewAtPosition(position);
    updateChart(((com.github.mikephil.charting.charts.LineChart) (view.findViewById(R.id.chart))));
}

public void turnOnSync() {
    context.getContentResolver();
    android.content.ContentResolver.setSyncAutomatically(mAccount, AUTHORITY, true);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        login(v);
        return true;
    }
    return false;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    setFilterSpinnerValue(position, currentPagePosition);
    getFilterInputValue(position, currentPagePosition);
}

@java.lang.Override
public void onClick(android.view.View v) {
    AnimationSupport.Reveal.closeToLeft(LLcontainerSBvolume, new com.android.simplemusic.Support.AnimationSupport.Reveal.AnimationAction() {
        @java.lang.Override
        public void onPrepare() {
        }

        @java.lang.Override
        public void onStart() {
            RFLcontainerSBvolume.setVisibility(View.GONE);
        }
    });
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Reddit.seen.edit().putBoolean(SettingValues.PREF_FAB_CLEAR, true).apply();
    me.ccrama.redditslide.Reddit.fabClear = true;
    clearSeenPosts(false);
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    dialog.setCancelable(true);
    return dialog;
}

public void onClick(android.view.View v) {
    gameClick(v);
}

@java.lang.Override
public void run(java.lang.Boolean success, java.lang.Exception error) {
    if (success) {
        list.remove(position);
        notifyDataSetChanged();
    }else {
        android.util.Log.d("a", "CANNOT REMOVE RULE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}

public static void report(android.app.Activity activity, com.heinrichreimersoftware.androidissuereporter.model.Report report, com.heinrichreimersoftware.androidissuereporter.model.github.GithubTarget target, com.heinrichreimersoftware.androidissuereporter.model.github.GithubLogin login) {
    new com.heinrichreimersoftware.androidissuereporter.IssueReporterActivity.ReportIssueTask(activity, report, target, login).execute();
}

@java.lang.Override
protected void onPostExecute(java.lang.Void ignore) {
    try {
        new com.ilyarudyak.android.portfel.ui.StockDetailActivity.FetchNewsFeed().execute(com.ilyarudyak.android.portfel.api.Config.getCompanyNewsUrl(mSymbol));
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void locationCallback(android.location.Location location) {
    init();
}

public void connectToNetworkService() {
    com.android1.homework3.Logger.d("Connect to network service");
    disconnect();
    android.content.Intent intent = new android.content.Intent(this, com.android1.homework3.net.NetworkService.class);
    bindService(intent, mServiceConnection, com.android1.homework3.ui.BIND_AUTO_CREATE);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    mCallbackListener = ((eu.intermodalics.tango_ros_streamer.android.SaveMapDialog.CallbackListener) (activity));
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    android.graphics.Rect boundingRect = new android.graphics.Rect(0, 0, width, height);
    pudding.setBoundingRect(boundingRect);
}

@java.lang.Override
public void onMainViewAppeared(com.innovativetech.audio.audiobookmaster.fabreveallayout.FABRevealLayout fabRevealLayout, android.view.View mainView) {
    if (((mMediaPlayer) == null) || (!(mMediaPlayer.isPlaying()))) {
        showMainViewItems();
    }else {
        showSecondaryViewItems();
    }
}

@java.lang.Override
protected void onResume() {
    android.content.SharedPreferences shared = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    shared.registerOnSharedPreferenceChangeListener(this);
    placeSubredditCurrent();
    if ((mPrefTimeFenceMinutes) < 999L) {
        registerFence("timeFenceKey");
    }
    super.onResume();
}

public static int e(java.lang.String msg) {
    return android.util.Log.w(za.co.cporm.util.CPOrmLog.TAG, msg);
}

public void refresh(android.widget.CheckBox checkbox, int index) {
    java.util.Set<java.lang.Object> modelValues = retrieveModelValues();
    checkbox.setChecked(modelValues.contains((areValuesDefined() ? checkbox.getText() : index)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.relLayout :
            android.content.Intent myCartIntent = new android.content.Intent(getApplicationContext(), com.cb.vmss.MyCartActivity.class);
            startActivityForResult(myCartIntent, Constant.CODE_MAIN_LOGIN);
            break;
        case R.id.searchImageView :
            break;
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.i(com.sparq.application.userinterface.EventActivity.TAG, "onPause");
    if (isReceiverRegistered) {
        unregisterReceiver(timerReceiver);
        isReceiverRegistered = false;
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    shareIntent.putExtra(Intent.EXTRA_TEXT, editor.getText());
    share.setShareIntent(shareIntent);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.v("Nick", (" " + (mShowMainUI)));
    if (mShowMainUI) {
        loadMainUI();
    }
}

@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    studentInfoList.remove((pos + 1));
    notifyItemRangeRemoved(pos, 1);
}

public co.bitsquared.vanitygenerator.android.query.ParcelableQuery[] newArray(int size) {
    return new co.bitsquared.vanitygenerator.android.query.ParcelableQuery[0];
}

@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(mTimer);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    handler.sendMessage(new android.os.Message());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    android.widget.Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(accent_flag))
        com.example.cesarsk.say_it.MainActivity.american_speaker_google.speak(com.example.cesarsk.say_it.PlayActivity.selected_word, android.speech.tts.TextToSpeech.QUEUE_FLUSH, null, null);
    else
        com.example.cesarsk.say_it.MainActivity.british_speaker_google.speak(com.example.cesarsk.say_it.PlayActivity.selected_word, android.speech.tts.TextToSpeech.QUEUE_ADD, null, null);
    
}

private static android.content.IntentFilter makeGattUpdateIntentFilter() {
    final android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(OsswService.ACTION_WATCH_CONNECTING);
    intentFilter.addAction(OsswService.ACTION_WATCH_CONNECTED);
    intentFilter.addAction(OsswService.ACTION_WATCH_DISCONNECTED);
    intentFilter.addAction(OsswService.ACTION_WATCH_AUTO_RECONNECT);
    return intentFilter;
}

private void setBitmap(android.graphics.Bitmap bitmap, int imageResource) {
    setBitmap(bitmap, imageResource, null, 0, 0);
}

public void selection2(java.lang.String value) {
    android.util.Log.v("EpubReader", ("SELECTION2<=19:" + value));
}

@java.lang.Override
public void accept(org.oneat1.android.model.VideoItemResponse.VideoItem videoItem) throws java.lang.Exception {
    videoIDCache.put(videoItem.id, videoItem);
    populateMainVideoDetails(videoItem);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return com.romankaranchuk.musicplayer.ui.tracklist.TracklistFragment.newInstance();
    }else
        if (position == 1) {
            return com.romankaranchuk.musicplayer.ui.player.PlayerFragment.getSingleton();
        }
    
    return null;
}

public void startChronometer(android.view.View view) {
    android.widget.Chronometer chronometer = ((android.widget.Chronometer) (layout.findViewById(R.id.trip_timer)));
    chronometer.setBase(android.os.SystemClock.elapsedRealtime());
    chronometer.start();
    hideSoftKeyboard();
}

private void register(com.xfrocks.api.androiddemo.Api.User u) {
    android.content.Intent registerIntent = new android.content.Intent(this, com.xfrocks.api.androiddemo.RegisterActivity.class);
    registerIntent.putExtra(RegisterActivity.EXTRA_USER, u);
    startActivityForResult(registerIntent, com.xfrocks.api.androiddemo.LoginActivity.RC_REGISTER);
}

@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem item) {
    kat.android.com.movielist.MovieListActivity.drawerResult.setSelection(2);
    showFragment(kat.android.com.movielist.MovieListActivity.TOP_RATED_FRAGMENT);
    return true;
}

public static java.lang.String getPath(final android.content.Context p) {
    try {
        return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.get().path(p);
    } catch (java.lang.Exception e) {
    }
    return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Dummy.Holder.sInstance.path(p);
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.d(se.anotherhermit.voxels.GLESView.MyGestureListener.DEBUG_TAG, "onLongPress");
    se.anotherhermit.voxels.GLESView.longPress();
    android.widget.Toast.makeText(getContext(), "Toggled Light/Camera", Toast.LENGTH_SHORT).show();
    super.onLongPress(e);
}

@android.support.annotation.CallSuper
protected void onStop(@android.support.annotation.NonNull
final android.view.View view, @android.support.annotation.NonNull
final TActivity activity) {
    if (appeared) {
        onDisappear(view, activity);
        appeared = false;
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    prefs.edit().putString(java.lang.String.valueOf(editText.getId()), s.toString()).apply();
}

public void remove() {
    android.content.SharedPreferences.Editor editor;
    editor = sharedPreferences.edit();
    editor.remove(com.example.msk.onlinebotique.Utilities.KeyStore.fileName);
    editor.commit();
}

@java.lang.Override
public void onMergedCellClick(com.hzn.easytableview.EasyTableView.MergeInfo mergeInfo) {
    if (null != (mergeInfo.texts))
        android.widget.Toast.makeText(this, mergeInfo.texts[0], Toast.LENGTH_SHORT).show();
    
}

public void openOutListView(android.view.View view) {
    outListView.setVisibility(View.VISIBLE);
    showInImageView.setVisibility(View.INVISIBLE);
    showOutImageView.setVisibility(View.INVISIBLE);
}

@android.annotation.TargetApi(value = 14)
public static boolean isNavigationAtBottom(android.app.Activity activity) {
    com.gyf.barlibrary.BarConfig config = new com.gyf.barlibrary.BarConfig(activity, true, true);
    return config.isNavigationAtBottom();
}

@java.lang.Override
public void done(java.util.List<com.terpsync.parse.UMDBuildings> arg0, com.parse.ParseException arg1) {
    com.terpsync.parse.UMDBuildings building = arg0.get(0);
    updateMarker(building, true);
    android.widget.Toast.makeText(getApplicationContext(), "Added event to map", Toast.LENGTH_SHORT).show();
}

public static de.struckmeierfliesen.ds.micromanagement.Food cursorToFood(android.database.Cursor cursor) {
    return de.struckmeierfliesen.ds.micromanagement.sqlite.DatabaseConnection.cursorToFood(cursor, (-1), true);
}

