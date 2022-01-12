public void showFab() {
    if ((getFab().getVisibility()) == (android.view.View.GONE)) {
        getFab().show();
    }
}

public void producerPath(android.view.View view) {
    return ;
}

private void onStartAnimation() {
    android.view.View item = mFixedItem.get(itemId);
    itemAutoMove(item, mPerTranslateY, 2.0F);
    preItemId = itemId;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(com.huhx0015.doordashchallenge.view.fragments.RestaurantListFragment.INSTANCE_TAG, mTag);
    if ((mRestaurantList) != null) {
        outState.putParcelableArrayList(com.huhx0015.doordashchallenge.view.fragments.RestaurantListFragment.INSTANCE_RESTAURANT_LIST, new java.util.ArrayList(mRestaurantList));
    }
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    return true;
}

public static void initUserReferences(android.content.Context context) {
    if ((com.k12nt.k12netframe.utils.userSelection.K12NetUserReferences.references) == null) {
        com.k12nt.k12netframe.utils.userSelection.K12NetUserReferences.references = new com.k12nt.k12netframe.utils.userSelection.K12NetUserReferences(context);
    }
}

@java.lang.Override
public int compareTo(@android.support.annotation.NonNull
co.smartreceipts.android.model.Category category) {
    return mName.compareTo(category.getName());
}

public void initCallbacks() {
    mCameraManager.registerAvailabilityCallback(getCamAvailabilityCallback(), new android.os.Handler(mContext.getMainLooper()));
    mCamNoPreview.registerCameraListener(this);
}

@java.lang.Override
public void before() {
    try {
        StartTime = java.lang.System.nanoTime();
    } catch (java.lang.Exception exception) {
    }
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    playQueue();
}

@java.lang.Override
public void LongclickListener(android.view.View view) {
    layout.addMovedView(view);
    view.setVisibility(View.INVISIBLE);
    dragImageView.disallowInterceptTouchEvent(true);
}

public void start() {
    mediaPlayer.start();
    setState(edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.PLAYING);
    android.util.Log.e("Media Player Service", ("State: " + (getState())));
}

public void initData(com.bumptech.glide.RequestManager manager, com.mobcent.discuz.bean.Banner banner) {
    this.banner = banner;
}

@java.lang.Override
public java.lang.Throwable handleError(retrofit.RetrofitError err) {
    if (err != null) {
        retrofit.client.Response resp = err.getResponse();
        android.util.Log.v("Error :", ("err: " + (resp.toString())));
        return err;
    }
}

public void deleteUser(io.github.data4all.model.data.User user) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(io.github.data4all.model.DataBaseHandler.TABLE_USER, ((io.github.data4all.model.DataBaseHandler.KEY_USERNAME) + "=?"), new java.lang.String[]{ user.getUsername() });
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    doOnActivityResult(requestCode, resultCode, data);
}

public void done(java.lang.String result, com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.i("Results :", result);
    }else {
        android.util.Log.i("Error", e.getMessage());
    }
}

public void clearExerciseTable() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    clearExerciseTable(db);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    editor.putBoolean("firstAppStart", false);
    editor.commit();
    createUser(androidId, userInput.getText().toString());
    setRecentReviews(androidId);
}

@java.lang.Override
public void onNext(com.scala.exp.android.sdk.model.Thing thing) {
    java.lang.Object zones = thing.get("location.zones");
    android.util.Log.i("Response", thing.toString());
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    alarms.cancelAlarm(position);
    alarms.deleteAlarm(position);
    notifyDataSetChanged();
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            removeOverlayFromMap(this);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
        default :
            break;
    }
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    etBeginDate.setText(com.codepath.nytquest.utils.DateHelper.getFormatteDate(year, (month + 1), day));
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean fromUser) {
    if (fromUser && ((jcAudioPlayer) != null))
        jcAudioPlayer.seekTo(i);
    
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d(com.neirx.stopwatchtimer.MainActivity.TAG, ((com.neirx.stopwatchtimer.MainActivity.CLASS_NAME) + "onResume"));
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    save();
}

@java.lang.Override
public android.database.Cursor loadInBackground() {
    android.database.Cursor cursor = db.getUserFood();
    return cursor;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent("ml.yats.connect.mainactivity");
    i.putExtra("mode", "router");
    i.putExtra("number", mPhoneText.getText().toString());
    startActivity(i);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
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
    navigateEntry(entry, true);
    mBinding.getFragment().getChildFragmentManager().addOnBackStackChangedListener(this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    int clickedPosition = getAdapterPosition();
    if (isSteps) {
        mOnClickListener.onListItemClick(clickedPosition, v);
    }
}

@java.lang.Override
public void onClick(android.view.View onClickView) {
    com.example.kangjisung.likeroom.FragmentStamp.StampUseDialog stampUseDialog = new com.example.kangjisung.likeroom.FragmentStamp.StampUseDialog(context, activity, ((((position + 1) * 2) - 1) * (com.example.kangjisung.likeroom.DefineManager.standardMileage)));
    stampUseDialog.show();
}

public static boolean applyIptablesRules(android.content.Context ctx, boolean showErrors) {
    if (ctx == null) {
        return false;
    }
    dev.ukanth.ufirewall.Api.saveRules(ctx);
    return dev.ukanth.ufirewall.Api.applySavedIptablesRules(ctx, showErrors);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.i(TAG, "onDestroy");
    if (fi.vtt.nubotest.MainActivity.kurentoRoomAPI.isWebSocketConnected()) {
        fi.vtt.nubotest.MainActivity.kurentoRoomAPI.sendLeaveRoom(roomId);
    }
    fi.vtt.nubotest.MainActivity.kurentoRoomAPI.disconnectWebSocket();
    super.onDestroy();
}

public void addMarker(java.lang.String title, double longitude, double latitude) {
    myMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().title(title).position(new com.google.android.gms.maps.model.LatLng(latitude, longitude)));
}

public void startGMail(android.view.View view) {
    imap.checkInBox();
}

public synchronized android.database.sqlite.SQLiteDatabase openDB(int type) {
    android.database.sqlite.SQLiteDatabase database = org.spinsuite.base.DB_Manager.getInstance().open();
    return database;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    getLastKnownLocation();
    locationSubject.notifyAllObservers();
    android.util.Log.d(foodie.com.foodie.GPSLocation.TAG, "Locations API connected successfully");
}

@java.lang.Override
public void onClick(android.view.View view) {
    mUserFavoriteViewModel.deleteMovieById(mMovieId);
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    br.pro.hashi.ensino.desagil.sqlite.StudentDAO dao = new br.pro.hashi.ensino.desagil.sqlite.StudentDAO(this);
    dao.delete(student);
    dao.close();
    refresh();
    return false;
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String responseString, java.lang.Throwable throwable) {
    super.onFailure(statusCode, headers, responseString, throwable);
    android.widget.Toast.makeText(context, "Unable to unretweet", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onLoadSuccess() {
    android.util.Log.i(app.park.com.vr.VrVideoActivity.TAG, ("Sucessfully loaded video " + (mVrVideoView.getDuration())));
    loadVideoStatus = app.park.com.vr.VrVideoActivity.LOAD_VIDEO_STATUS_SUCCESS;
    pauseVideo();
}

private void checkIsInEditMode() {
    final android.os.Bundle arguments = getArguments();
    if (arguments == null) {
        edit = false;
    }else {
        edit = arguments.getBoolean(com.google.samples.apps.topeka.fragment.SignInFragment.ARG_EDIT, false);
    }
}

@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    if (verticalOffset <= 0) {
        translateContent(verticalOffset);
        animatePinningView(verticalOffset);
    }
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String res, java.lang.Throwable t) {
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    android.widget.Toast.makeText(this, "Sent Information to Server...", Toast.LENGTH_LONG).show();
    android.widget.Toast.makeText(this, s, Toast.LENGTH_LONG).show();
}

public void returnToMainLoop(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, hackmit2016.moodometer.ContactsActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("Log", "hier1");
    android.content.Intent intent = new android.content.Intent(getBaseContext(), de.androidnewcomer.pendlerwecker.Geo_Service.class);
    startService(intent);
}

@java.lang.Override
public void onNetError(com.example.dramtar.testprojectforestafeta.libs.NetWork.NetErrors oError) {
    mNetProgressDialog.dismiss();
    android.widget.Toast.makeText(getContext(), "Error Connection", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public boolean onClusterItemClick(com.whiterabbit.pisabike.screens.map.MapItem mapItem) {
    mPresenter.onStationClicked(mapItem.getStation().getName());
    return true;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((android.content.pm.PackageManager.PERMISSION_GRANTED) == (android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE))) {
        refreshPhotoList();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((listener) != null) {
        listener.onMealCardClicked(meal);
    }
}

public void onConnected(android.os.Bundle connectionHint) {
}

void updateChart(int position) {
    android.view.View view = getViewAtPosition(position);
    if (view != null) {
        updateChart(((com.github.mikephil.charting.charts.LineChart) (view.findViewById(R.id.chart))));
    }
}

public void turnOnSync() {
    turnOnSync(mAccount);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        login(getView());
        return true;
    }
    return false;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    getFilterInputValue(position, currentPagePosition);
}

@java.lang.Override
public void onClick(android.view.View v) {
    RFLcontainerSBvolume.setVisibility(View.GONE);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Reddit.seen.edit().putBoolean(SettingValues.PREF_FAB_CLEAR, true).apply();
    me.ccrama.redditslide.Reddit.fabClear = true;
    clearSeenPosts(true);
}

@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    return dialog;
}

public void onClick(android.view.View v) {
    gameClick(0);
}

@java.lang.Override
public void run(java.lang.Boolean success, java.lang.Exception error) {
    if (success != null) {
        list.remove(position);
        notifyDataSetChanged();
    }else {
        android.util.Log.d("a", "CANNOT REMOVE RULE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}

private static void report(android.app.Activity activity, com.heinrichreimersoftware.androidissuereporter.model.Report report, com.heinrichreimersoftware.androidissuereporter.model.github.GithubTarget target, com.heinrichreimersoftware.androidissuereporter.model.github.GithubLogin login) {
    new com.heinrichreimersoftware.androidissuereporter.IssueReporterActivity.ReportIssueTask(activity, report, target, login).execute();
}

@java.lang.Override
protected void onPostExecute(java.lang.Void ignore) {
}

@java.lang.Override
public void locationCallback(android.location.Location location) {
}

public void connectToNetworkService() {
    disconnect();
    android.content.Intent intent = new android.content.Intent(this, com.android1.homework3.net.NetworkService.class);
    bindService(intent, mServiceConnection, com.android1.homework3.ui.BIND_AUTO_CREATE);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    mCallbackListener = ((eu.intermodalics.tango_ros_streamer.android.SaveMapDialog.CallbackListener) (context));
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    pudding.setBoundingRect(new android.graphics.Rect(0, 0, width, height));
}

@java.lang.Override
public void onMainViewAppeared(com.innovativetech.audio.audiobookmaster.fabreveallayout.FABRevealLayout fabRevealLayout, android.view.View mainView) {
    showMainViewItems();
}

@java.lang.Override
protected void onResume() {
    android.content.SharedPreferences shared = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    shared.registerOnSharedPreferenceChangeListener(this);
    if ((mPrefTimeFenceMinutes) < 999L) {
        registerFence("timeFenceKey");
    }
    super.onResume();
}

public static int e(java.lang.String msg) {
    return android.util.Log.e(za.co.cporm.util.CPOrmLog.TAG, msg);
}

public void refresh(android.widget.CheckBox checkbox, int index) {
    java.util.Set<java.lang.Object> modelValues = retrieveModelValues();
    checkbox.setChecked(modelValues.contains((!(areValuesDefined()) ? checkbox.getText() : index)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.relLayout :
            android.content.Intent myCartIntent = new android.content.Intent(getApplicationContext(), com.cb.vmss.MyCartActivity.class);
            startActivityForResult(myCartIntent, Constant.CODE_MAIN_LOGIN);
            break;
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    if (isReceiverRegistered) {
        unregisterReceiver(timerReceiver);
        isReceiverRegistered = false;
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    shareIntent.putExtra(Intent.EXTRA_TEXT, s.toString());
    share.setShareIntent(shareIntent);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    if (mShowMainUI) {
        loadMainUI();
    }
}

@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    studentInfoList.remove(pos);
    notifyItemRangeRemoved(pos, 1);
}

public co.bitsquared.vanitygenerator.android.query.ParcelableQuery[] newArray(int size) {
    return new co.bitsquared.vanitygenerator.android.query.ParcelableQuery[size];
}

@java.lang.Override
public void run() {
    handler.sendMessage(new android.os.Message());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(accent_flag))
        com.example.cesarsk.say_it.MainActivity.american_speaker_google.speak(com.example.cesarsk.say_it.PlayActivity.selected_word, android.speech.tts.TextToSpeech.QUEUE_FLUSH, null, null);
    else
        com.example.cesarsk.say_it.MainActivity.british_speaker_google.speak(com.example.cesarsk.say_it.PlayActivity.selected_word, android.speech.tts.TextToSpeech.QUEUE_FLUSH, null, null);
    
}

static android.content.IntentFilter makeGattUpdateIntentFilter() {
    final android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(OsswService.ACTION_WATCH_CONNECTING);
    intentFilter.addAction(OsswService.ACTION_WATCH_CONNECTED);
    intentFilter.addAction(OsswService.ACTION_WATCH_DISCONNECTED);
    intentFilter.addAction(OsswService.ACTION_WATCH_AUTO_RECONNECT);
    return intentFilter;
}

private void setBitmap(android.graphics.Bitmap bitmap, int imageResource) {
    setBitmap(bitmap, imageResource, null, 1, 0);
}

public void selection2(java.lang.String value) {
}

@java.lang.Override
public void accept(org.oneat1.android.model.VideoItemResponse.VideoItem videoItem) throws java.lang.Exception {
    videoIDCache.put(videoItem.getId(), videoItem);
    populateMainVideoDetails(videoItem);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return new com.romankaranchuk.musicplayer.ui.tracklist.TracklistFragment();
    }else
        if (position == 1) {
            return com.romankaranchuk.musicplayer.ui.player.PlayerFragment.getSingleton();
        }
    
    return null;
}

private void startChronometer(android.view.View view) {
    android.widget.Chronometer chronometer = ((android.widget.Chronometer) (layout.findViewById(R.id.trip_timer)));
    chronometer.setBase(android.os.SystemClock.elapsedRealtime());
    chronometer.start();
    hideSoftKeyboard();
}

private void register(com.xfrocks.api.androiddemo.Api.User u) {
    android.content.Intent registerIntent = new android.content.Intent(this, com.xfrocks.api.androiddemo.RegisterActivity.class);
    if (u != null) {
        registerIntent.putExtra(RegisterActivity.EXTRA_USER, u);
    }
    startActivityForResult(registerIntent, com.xfrocks.api.androiddemo.LoginActivity.RC_REGISTER);
}

@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem item) {
    kat.android.com.movielist.MovieListActivity.drawerResult.setSelection(kat.android.com.movielist.MovieListActivity.TOP_RATED_FRAGMENT);
    showFragment(kat.android.com.movielist.MovieListActivity.TOP_RATED_FRAGMENT);
    return true;
}

public java.lang.String path(final android.content.Context p) {
    return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.get().path(p);
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.d(se.anotherhermit.voxels.GLESView.MyGestureListener.DEBUG_TAG, "onLongPress");
    se.anotherhermit.voxels.GLESView.longPress();
    super.onLongPress(e);
}

protected void onDisappear(@android.support.annotation.NonNull
final android.view.View view, @android.support.annotation.NonNull
final TActivity activity) {
    appeared = false;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    prefs.edit().putString(name, s.toString()).apply();
}

public void remove(java.lang.String fileName) {
    android.content.SharedPreferences.Editor editor;
    editor = sharedPreferences.edit();
    editor.remove(fileName);
    editor.commit();
}

@java.lang.Override
public void onMergedCellClick(com.hzn.easytableview.EasyTableView.MergeInfo mergeInfo) {
}

public void openOutListView(android.view.View view) {
    outListView.setVisibility(View.VISIBLE);
}

@android.annotation.TargetApi(value = 14)
public static boolean isNavigationAtBottom(android.app.Activity activity) {
    com.gyf.barlibrary.BarConfig config = new com.gyf.barlibrary.BarConfig(activity);
    return config.isNavigationAtBottom();
}

@java.lang.Override
public void done(java.util.List<com.terpsync.parse.UMDBuildings> arg0, com.parse.ParseException arg1) {
    com.terpsync.parse.UMDBuildings building = arg0.get(0);
    updateMarker(building, true);
}

private static de.struckmeierfliesen.ds.micromanagement.Food cursorToFood(android.database.Cursor cursor) {
    return de.struckmeierfliesen.ds.micromanagement.sqlite.DatabaseConnection.cursorToFood(cursor, (-1), true);
}

