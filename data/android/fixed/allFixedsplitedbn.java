public void glUniform4(int location, java.nio.IntBuffer value) {
    android.opengl.GLES20.glUniform4iv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, 4), value);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.prod.jvuil.vuforiatest.MainActivity.LOGTAG, "SubmitButton clicked");
    buildTracker();
    com.prod.jvuil.vuforiatest.ARRenderer.getInstance().setSelectedOverlay();
}

@java.lang.Override
protected void onDestroy() {
    com.spotify.sdk.android.player.Spotify.destroyPlayer(this);
    super.onDestroy();
}

@java.lang.Override
public void run() {
    final com.metar.android.singleton.ApplicationSingleton app = ((com.metar.android.singleton.ApplicationSingleton) (getApplication()));
    app.setSatelliteStatusEnum(SatelliteStatusEnum.REPORT_IN_QUEUE);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    myRgb[0] = isChecked;
    adjustBrightness();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    if ((binding) == null) {
        binding = android.databinding.DataBindingUtil.inflate(inflater, R.layout.fragment_event_repeat_custom, container, false);
    }
    return binding.getRoot();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public void onError() {
    android.util.Log.i(ru.sukharev.pathtracker.ui.MapActivity.TAG, "error!");
    android.widget.Toast.makeText(this, getString(R.string.error_saving_to_db), Toast.LENGTH_SHORT).show();
}

public boolean connect(android.bluetooth.BluetoothDevice device) {
    if (com.android.settings.bluetooth.MapProfile.V)
        android.util.Log.d(com.android.settings.bluetooth.MapProfile.TAG, "connect() - should not get called");
    
    return false;
}

private void setImageData(android.content.Intent data) {
    if ((mReportFragment) != null) {
        mReportFragment.setImageData(data);
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    startActivity(new android.content.Intent(this, com.codeartist.applocker.activity.DummyActivity.class));
    finish();
}

@java.lang.Override
public void run() {
    if ((testsRunning) == false) {
        android.widget.Toast.makeText(context, getString(R.string.no_connectivity), Toast.LENGTH_LONG).show();
    }
}

@android.support.annotation.Nullable
@java.lang.Override
public io.skygear.plugins.chat.Conversation convert(io.skygear.skygear.Record record) {
    return new io.skygear.plugins.chat.Conversation(record);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.doricovix.utif.retrofitgetmysql.ItemResponse> call, java.lang.Throwable t) {
    android.util.Log.d("TAG", t.getMessage());
}

private java.io.File getAndroidBeginnerImageFile() {
    java.io.File mediaStorageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    return new java.io.File(mediaStorageDir.getPath(), "androidBeginnerImage.jpg");
}

@java.lang.Override
public void onClick(android.view.View view) {
    listener.onItemClick(element);
}

@java.lang.Override
public void error(@android.support.annotation.NonNull
java.lang.Throwable caught) {
    editFailed(caught);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    trinityconnect.android.bignerdranch.com.trinityconnect.EventLab.get(getActivity()).updateEvent(null);
}

private boolean isImageLoaded(java.lang.String resourceName) {
    return com.jstakun.gms.android.data.IconCache.images.containsKey(resourceName);
}

@java.lang.Override
public void setTopicResultsHaveChanged() {
    resultColour = android.graphics.Color.MAGENTA;
    if ((activityStarted) == false)
        textView.setBackgroundColor(resultColour);
    
}

public void setInactiveColor(int inActiveColor) {
    mInActiveColor = inActiveColor;
    labelView.setTextColor(inActiveColor);
}

public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    player.start();
    return 1;
}

private void init() {
    mBytes = null;
    mForePaint.setStrokeWidth(1.0F);
    mForePaint.setAntiAlias(true);
    mForePaint.setColor(android.graphics.Color.rgb(255, 255, 255));
}

@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mNote) != null) {
        mComment = null;
    }
}

public void onItemClick(android.widget.AdapterView<?> av, android.view.View v, int arg2, long arg3) {
    address = mPairedDeviceAddressList.get(arg2);
    new com.kanykei.slcs.ConnectToArduinoWithBluetooth.ConnectBT().execute();
}

@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    android.view.View view = android.view.View.inflate(context, R.layout.movies, null);
    return new com.example.elson.popmovies.Adapters.GridAdapter.MovieViewHolder(view);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            cancelAndReturn();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    disableall();
    CreateIcon(com.att.attcase.XayDungCase.iconDuocChon);
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.sinergiass.asistencia.model.Admin>> call, java.lang.Throwable t) {
    cargarOperadores();
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
    return true;
}

private void readFromParcel(android.os.Parcel in) {
    meanings = new java.util.ArrayList<>();
    in.readStringList(meanings);
}

public void leaveRoom() {
    android.util.Log.d(com.sam.hex.NetActivity.TAG, "Leaving room.");
    stopKeepingScreenOn();
    if ((mRoomId) != null) {
        Games.RealTimeMultiplayer.leave(getClient(), this, mRoomId);
        mRoomId = null;
    }
}

public void popWithResult(@android.support.annotation.Nullable
java.lang.Object result) {
    popWithResult(1, result);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_calendar_filters :
            startCalendarFiltersScreen();
            return true;
        case R.id.action_request_time_off :
            startRequestTimeOffScreen();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

public static void start(@android.support.annotation.NonNull
android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, de.jonasrottmann.realmbrowser.RealmFilesActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    isInUpdateMode = true;
    saveSubject(viewedSubjectName, true, viewedSubjectShortening, viewedSubjectRelevance);
}

private void callToDialer() {
    getPermissionsForPhoneCall();
}

public static boolean isEmpty(java.lang.String string) {
    return (android.text.TextUtils.isEmpty(string)) || ((string.trim().length()) == 0);
}

@java.lang.Override
public void onRestart() {
    super.onRestart();
}

@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 unused, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
    viewX = 0.0F;
    viewY = 0.0F;
    fieldOfViewY = 120.0F;
    mLastTime = java.lang.System.currentTimeMillis();
    tick();
}

@java.lang.Override
public void dealWithCustomAction(android.content.Context context, com.umeng.message.entity.UMessage msg) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((itemClickListener) != null)
        itemClickListener.onItemClick(null, itemView, position, 0);
    
}

public void handleFeedback(java.io.InputStream in) throws java.io.IOException {
    fb = CarControlProtos.FeedBack.parseDelimitedFrom(in);
    processFeedback(fb);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    int a = 8;
    int b = 7;
    int ab = a + b;
    int c = 76;
}

@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    return super.onSingleTapUp(e);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    scannerQrCode();
    dialog.cancel();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    region = new com.example.fernando.farmingfarming.RegionData(which);
}

public void onClick(android.view.View v) {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction ft = fragmentManager.beginTransaction();
    ft.replace(R.id.fragment_container, new com.hsfl.speakshot.ui.ReadFragment());
    ft.commit();
}

@java.lang.Override
public com.ivanmagda.habito.widget.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
    intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
    return new com.ivanmagda.habito.widget.ListProvider(this, intent);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if (((mContext) instanceof com.nerdzlab.mysound.Adapters.SoundInterface) && b) {
        ((com.nerdzlab.mysound.Adapters.SoundInterface) (mContext)).soundLevelChanged(item.getResource_id(), i);
    }
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    com.facebook.notifications.NotificationsManager.presentCardFromNotification(cordova.getActivity());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent intent = new android.content.Intent(this, com.benjaminearley.mysubs.StoryListActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onButton1Click(int position) {
    android.util.Log.v(TAG, (" MA: Pressed button 1 at position " + position));
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent e) {
    mIsPrepressed = true;
    mPressedView = recyclerView.findChildViewUnder(e.getX(), e.getY());
    return false;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.settings :
            android.content.Intent intent = new android.content.Intent(this, com.example.ajinkya.stayhealthysg.SettingsActivity.class);
            startActivity(intent);
            break;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
protected void onStop() {
    android.util.Log.d("Jane", "unregister Receiver");
    unregisterReceiver(broadcastReceiver);
    super.onStop();
}

@java.lang.Override
public void onSuccess(@io.reactivex.annotations.NonNull
java.util.List<com.takescoop.americanwhitewaterandroid.model.ReachSearchResult> reachSearchResults) {
    progressWheel.setVisibility(com.takescoop.americanwhitewaterandroid.view.GONE);
    setReachSearchResults(reachSearchResults);
}

@java.lang.Override
public void onDrawerClosed(android.view.View v) {
    if ((getSupportActionBar()) != null)
        getSupportActionBar().setTitle(oldTitle);
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviesAdapter = new com.example.nbtk123.tikalmovies.ui.RVMoviesAdapter(getActivity(), this, savedInstanceState);
    org.greenrobot.eventbus.EventBus.getDefault().register(moviesAdapter);
}

public com.shapematchandroid.Score add(int pts) {
    return new com.shapematchandroid.Score(((points) + pts));
}

@java.lang.Override
public void onTaskDone() {
    getActivity().finish();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(_id);
    dest.writeString(_title);
    dest.writeString(_text);
    dest.writeInt(_textBitmap.length);
    dest.writeByteArray(_textBitmap);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(com.jdelorenzo.capstoneproject.EditDayFragment.ARG_ROUTINE_ID, mRoutineId);
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onClick(android.view.View v) {
    tripRowHolder.trip.setCurrentLocation(tripRowHolder.trip.getStartLocation());
    tripRowHolder.trip.startTrip();
    tripRowHolder.callback.onTripSelected(tripRowHolder.tripId);
}

@java.lang.Override
public void onCreate(android.os.Bundle bundle, org.smssecure.smssecure.crypto.MasterSecret masterSecret) {
    super.onCreate(bundle, masterSecret);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initGUI();
    initData(savedInstanceState);
    initApplicationLogic();
    initEventToListenerMapping();
}

@android.annotation.SuppressLint(value = "InlinedApi")
private void show() {
}

@java.lang.Override
public void onChanged() {
    if (isVisible()) {
        this.setEmptyShown(isEmpty());
    }
}

protected void onPostExecute(java.lang.String webData) {
    super.onPostExecute(webData);
    flickrRecyclerViewAdapter = new com.example.android.flickrbrowser.FlickrRecyclerViewAdapter(this, getMPhotos());
    mRecyclerView.setAdapter(flickrRecyclerViewAdapter);
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    android.util.Log.i(TAG, ("Messenger received WHAT value: " + (msg.what)));
    doWork(msg);
}

@java.lang.Override
public void onClick(android.view.View v) {
    productListener.removeThisProduct(getItem(position));
}

public void googleLoginClick(android.view.View view) {
}

@java.lang.Override
protected void onCancelled(com.owncloud.android.ui.preview.PreviewImageFragment.LoadImage result) {
    if ((result != null) && ((result.bitmap) != null)) {
        result.bitmap.recycle();
    }
}

public void cleanTable(java.lang.String tableName) {
    db.execSQL(("delete from " + tableName));
    db.execSQL((("UPDATE SQLITE_SEQUENCE SET SEQ=0 WHERE NAME='" + tableName) + "'"));
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    updateItem(getAdapterPosition());
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((context) instanceof internetofeveryone.ioe.Downloads.DownloadsView) {
        ((internetofeveryone.ioe.Downloads.DownloadsView) (context)).onClickDelete(string);
    }
}

public boolean isRunnable() {
    boolean result = (java.lang.Thread.currentThread()) == (getThreadObject());
    android.util.Log.i("ThreadCore=", (result + ""));
    return result;
}

@java.lang.Override
protected java.lang.Void doInBackground(android.view.View... params) {
    try {
        penguinologist.diyandroidchallenge.Async.au.getUserProjects(params[0]);
    } catch (java.lang.Exception e) {
        android.util.Log.e("error", e.toString());
    }
    return null;
}

@org.greenrobot.eventbus.Subscribe
public void onMediaUploaded(org.wordpress.android.fluxc.store.MediaStore.OnMediaUploaded event) {
    if ((event.progress) >= 1.0F) {
        assertEquals(org.wordpress.android.fluxc.release.ReleaseStack_MediaRestTest.TEST_EVENTS.UPLOADED_MEDIA, mExpectedEvent);
        mCountDownLatch.countDown();
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    doClear = true;
    startKey = 0;
    getData();
}

public static void Vibrate(android.content.Context context, long milliseconds) {
    android.os.Vibrator vib = ((android.os.Vibrator) (context.getSystemService(Service.VIBRATOR_SERVICE)));
    vib.vibrate(milliseconds);
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    loadFirstStatus();
    refreshAgentAvatar();
}

public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    boolean ret = super.onKeyDown(keyCode, event);
    if ((mPluginActivity) != null) {
        mPluginActivity.onKeyDown(keyCode, event);
    }
    return ret;
}

public void changeFragment(android.support.v4.app.Fragment newFragment, android.support.v4.app.FragmentTransaction mFragmentManager) {
    android.support.v4.app.FragmentTransaction transaction = mFragmentManager;
    transaction.replace(R.id.content_frame, newFragment);
    transaction.addToBackStack(null);
    transaction.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
    transaction.commit();
}

@java.lang.Override
public boolean performEditorAction(int editorAction) {
    boolean shouldConsume = false;
    switch (editorAction) {
        case android.view.inputmethod.EditorInfo.IME_ACTION_DONE :
            shouldConsume = true;
            mListener.onCVVEntryComplete();
    }
    return shouldConsume || (super.performEditorAction(editorAction));
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton button, boolean checked) {
    showMap = checked;
}

@java.lang.Override
public void onClick(final android.view.View view) {
    ((cgeo.geocaching.ui.EditNoteDialog.EditNoteDialogListener) (getActivity())).onFinishEditNoteDialog(mEditText.getText().toString());
    dialog.dismiss();
}

@java.lang.Override
public void onBitmapLoaded(final android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    com.booking.feedon.Utils.DisplayUtil.scaleImage(bitmap, imageView, mContext);
}

private android.view.Window getWindow() {
    return getActivity().getWindow();
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if ((java.lang.Integer.parseInt(currentSongModel.getSongDuration())) <= (mp.getCurrentPosition())) {
        skipNext();
    }
}

private com.kontakt.sdk.android.ble.configuration.ScanMode getScanMode(int mode) throws java.lang.Exception {
    switch (mode) {
        case 0 :
            return com.kontakt.sdk.android.ble.configuration.ScanMode.LOW_POWER;
        case 1 :
            return com.kontakt.sdk.android.ble.configuration.ScanMode.BALANCED;
        case 2 :
            return com.kontakt.sdk.android.ble.configuration.ScanMode.LOW_LATENCY;
        default :
            throw new java.lang.Exception("The value of scanMode has to be either LOW_POWER, BALANCED or LOW_LATENCY");
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    pickContact();
}

@java.lang.Override
public void onSessionStarted(com.google.android.gms.cast.framework.CastSession session, java.lang.String sessionId) {
    onApplicationConnected(session);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String myoGesture = intent.getStringExtra("gesture");
    handleGesture(context, myoGesture);
}

public void changeImg(android.view.View view) {
    com.extenprise.mapp.util.Utility.captureImage(this);
}

