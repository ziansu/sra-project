public void glUniform4(int location, java.nio.IntBuffer value) {
    com.jme3.renderer.android.AndroidGL.checkPosition(value);
    android.opengl.GLES20.glUniform4iv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, 4), value);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.prod.jvuil.vuforiatest.MainActivity.LOGTAG, "SubmitButton clicked");
    com.prod.jvuil.vuforiatest.ARRenderer.getInstance().setSelectedOverlay();
    buildTracker();
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.spotify.sdk.android.player.Spotify.destroyPlayer(this);
    super.onDestroy();
}

@java.lang.Override
public void run() {
    clearFields();
    final com.metar.android.singleton.ApplicationSingleton app = ((com.metar.android.singleton.ApplicationSingleton) (getApplication()));
    app.setSatelliteStatusEnum(SatelliteStatusEnum.REPORT_IN_QUEUE);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    myRgb[2] = isChecked;
    adjustBrightness();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    binding = android.databinding.DataBindingUtil.inflate(inflater, R.layout.fragment_event_repeat_custom, container, false);
    return binding.getRoot();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getViewBinder()) != null) {
        getViewBinder().clearAllBindings();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.home_page_searchcompany_button :
            switchToSearchCompany();
            break;
        case R.id.home_page_company_profile_button :
            switchToCompanyProfile();
            break;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.design.widget.BottomNavigationView navigation = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.navigation)));
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
}

@java.lang.Override
public void onError(java.lang.Exception e) {
    android.util.Log.i(ru.sukharev.pathtracker.ui.MapActivity.TAG, "error!");
    android.widget.Toast.makeText(this, getString(R.string.error_saving_to_db), Toast.LENGTH_SHORT).show();
    e.printStackTrace();
}

public boolean connect(android.bluetooth.BluetoothDevice device) {
    if (com.android.settings.bluetooth.MapProfile.V)
        android.util.Log.d(com.android.settings.bluetooth.MapProfile.TAG, "connect() - should not get called");
    
    return true;
}

private void setImageData(android.content.Intent data) {
    mReportFragment.setImageData(data);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    finish();
    startActivity(new android.content.Intent(this, com.codeartist.applocker.activity.DummyActivity.class));
}

@java.lang.Override
public void run() {
    if ((testsRunning) == false) {
        android.widget.Toast.makeText(context, getString(R.string.no_connectivity), Toast.LENGTH_LONG).show();
        tv_Gauge_TextView_PsuedoButton.setClickable(false);
    }
}

@android.support.annotation.Nullable
@java.lang.Override
public io.skygear.plugins.chat.Conversation convert(io.skygear.skygear.Record record) {
    return new io.skygear.plugins.chat.Conversation(record, 0, null);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.doricovix.utif.retrofitgetmysql.ItemResponse> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
    android.util.Log.d("TAG", t.getMessage());
}

private java.io.File getAndroidBeginnerImageFile() {
    java.io.File mediaStorageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    java.io.File mediaFile = new java.io.File(mediaStorageDir.getPath(), "androidBeginnerImage.jpg");
    return mediaFile;
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (onItemClickListener != null) {
        onItemClickListener.onItemClick(element);
    }
}

@java.lang.Override
public void failure(@android.support.annotation.NonNull
retrofit2.Call<org.wikipedia.descriptions.DescriptionEdit> call, @android.support.annotation.NonNull
java.lang.Throwable caught) {
    editFailed(caught);
    if ((funnel) != null) {
        funnel.logError(caught.getMessage());
    }
}

@java.lang.Override
public void onPause() {
    super.onPause();
    trinityconnect.android.bignerdranch.com.trinityconnect.EventLab.get(getActivity()).updateEvent();
}

private boolean isImageLoaded(java.lang.String resourceName) {
    if (com.jstakun.gms.android.data.IconCache.images.containsKey(resourceName)) {
        return !(com.jstakun.gms.android.data.IconCache.images.get(resourceName).isRecycled());
    }else {
        return false;
    }
}

@java.lang.Override
public void setTopicResultsHaveChanged() {
    if (activityStarted)
        resultColour = android.graphics.Color.MAGENTA;
    
    if ((activityStarted) == false)
        textView.setBackgroundColor(resultColour);
    
}

public void setInactiveColor(int inActiveColor) {
    mInActiveColor = inActiveColor;
    labelView.setTextColor(inActiveColor);
    android.support.v4.graphics.drawable.DrawableCompat.setTint(mCompactIcon, inActiveColor);
    iconView.setImageDrawable(mCompactIcon);
}

public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    player.start();
    android.util.Log.v("FSDF", "Initializing sounds...");
    return 1;
}

private void init() {
    mBytes = null;
    mForePaint.setStrokeWidth(0.5F);
    mForePaint.setAntiAlias(true);
    mForePaint.setColor(android.graphics.Color.rgb(255, 255, 255));
}

@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mNote) != null) {
        mComment = null;
    }
    org.wordpress.android.util.EditTextUtils.hideSoftInput(mEditReply);
}

public void onItemClick(android.widget.AdapterView<?> av, android.view.View v, int arg2, long arg3) {
    address = mPairedDeviceAddressList.get(arg2).toString();
    new com.kanykei.slcs.ConnectToArduinoWithBluetooth.ConnectBT().execute();
}

@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.View.inflate(context, R.layout.movies, null);
    return new com.example.elson.popmovies.Adapters.GridAdapter.MovieViewHolder(view);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            cancelAndReturn();
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    CreateIcon(com.att.attcase.XayDungCase.iconDuocChon);
    disableall();
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.sinergiass.asistencia.model.Admin>> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, "Conexion Fallida al cargar admins", Toast.LENGTH_LONG).show();
    cargarOperadores();
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
    productListing.replace_fragment_upper(productModels.get(position_clciked));
    return true;
}

private void readFromParcel(android.os.Parcel in) {
    in.readStringList(meanings);
}

public void leaveRoom() {
    android.util.Log.d(com.sam.hex.NetActivity.TAG, "Leaving room.");
    stopKeepingScreenOn();
    if ((mRoomId) != null) {
        Games.RealTimeMultiplayer.leave(getClient(), null, mRoomId);
        mRoomId = null;
    }
}

public boolean popWithResult(@android.support.annotation.Nullable
java.lang.Object result) {
    return popWithResult(1, result);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_calendar_filters :
            startCalendarFiltersScreen();
            break;
        case R.id.action_request_time_off :
            startRequestTimeOffScreen();
            break;
    }
    return super.onOptionsItemSelected(item);
}

public static void start(@android.support.annotation.NonNull
de.jonasrottmann.realmbrowser.Context context) {
    android.content.Intent intent = new android.content.Intent(context, de.jonasrottmann.realmbrowser.RealmFilesActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    isInUpdateMode = true;
    saveSubject(viewedSubjectName, true, viewedSubjectShortening, viewedSubjectRelevance, 0);
}

protected void callToDialer(android.view.View v) {
    getPermissionsForPhoneCall();
}

public static boolean isEmpty(java.lang.String string) {
    return ((android.text.TextUtils.isEmpty(string)) || ((string.trim().length()) == 0)) || (com.destin.sehaikun.StringUtils.NULL.equalsIgnoreCase(string));
}

@java.lang.Override
public void onRestart() {
    super.onRestart();
    android.util.Log.d("", "");
}

@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 unused, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    viewX = 0.0F;
    viewY = 0.0F;
    fieldOfViewY = 120.0F;
    mLastTime = java.lang.System.currentTimeMillis();
    tick();
}

@java.lang.Override
public void dealWithCustomAction(android.content.Context context, com.umeng.message.entity.UMessage msg) {
    android.widget.Toast.makeText(context, msg.custom, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    itemClickListener.onItemClick(null, itemView, position, 0);
}

public void handleFeedback(java.io.InputStream in) {
    try {
        fb = CarControlProtos.FeedBack.parseDelimitedFrom(in);
        processFeedback(fb);
    } catch (java.io.IOException e) {
        android.util.Log.d("DEC", "IOException");
        e.printStackTrace();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    int a = 8;
    int b = 7;
    int ab = 15;
    int c = 76;
}

@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    butTrigSettings.setBackgroundColor(2201331);
    return super.onSingleTapUp(e);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    scannerQrCode(getActivity());
    dialog.cancel();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    region = new com.example.fernando.farmingfarming.RegionData(which);
    createModelDialogBox(cropID);
}

public void onClick(android.view.View v) {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction ft = fragmentManager.beginTransaction();
    ft.replace(R.id.fragment_container, new com.hsfl.speakshot.ui.ReadFragment());
    ft.addToBackStack(null);
    ft.commit();
}

@java.lang.Override
public com.ivanmagda.habito.widget.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
    int appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
    return new com.ivanmagda.habito.widget.ListProvider(this, intent);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if ((mContext) instanceof com.nerdzlab.mysound.Adapters.SoundInterface) {
        ((com.nerdzlab.mysound.Adapters.SoundInterface) (mContext)).soundLevelChanged(item.getResource_id(), i);
    }
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    setIntent(intent);
    com.facebook.notifications.NotificationsManager.presentCardFromNotification(cordova.getActivity());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.benjaminearley.mysubs.sync.MySubsSyncAdapter.syncImmediately(this);
    android.content.Intent intent = new android.content.Intent(this, com.benjaminearley.mysubs.StoryListActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onButton1Click(int imageViewID, int position) {
    android.util.Log.v(TAG, (" MA: Pressed button 1 at position " + position));
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent e) {
    mIsPrepressed = true;
    mPressedView = recyclerView.findChildViewUnder(e.getX(), e.getY());
    super.onDown(e);
    return false;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    super.onOptionsItemSelected(item);
    switch (item.getItemId()) {
        case R.id.settings :
            android.content.Intent intent = new android.content.Intent(this, com.example.ajinkya.stayhealthysg.SettingsActivity.class);
            startActivity(intent);
    }
    return false;
}

@java.lang.Override
protected void onStop() {
    android.util.Log.d("Jane", "unregister Receiver");
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver);
    super.onStop();
}

@java.lang.Override
public void onSuccess(@io.reactivex.annotations.NonNull
java.util.List<com.takescoop.americanwhitewaterandroid.model.ReachSearchResult> reachSearchResults) {
    setReachSearchResults(reachSearchResults);
    progressWheel.setVisibility(com.takescoop.americanwhitewaterandroid.view.GONE);
}

@java.lang.Override
public void onDrawerClosed(android.view.View v) {
    getSupportActionBar().setTitle(oldTitle);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    moviesAdapter = new com.example.nbtk123.tikalmovies.ui.RVMoviesAdapter(getActivity(), this);
    org.greenrobot.eventbus.EventBus.getDefault().register(moviesAdapter);
}

public com.shapematchandroid.Score add(int pts) {
    return new com.shapematchandroid.Score((points += pts));
}

@java.lang.Override
public void onTaskDone() {
    ((android.support.v7.app.AppCompatActivity) (getActivity())).setSupportProgressBarIndeterminateVisibility(false);
    getActivity().finish();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(_id);
    dest.writeString(_title);
    dest.writeString(_text);
    dest.writeByteArray(_textBitmap);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(com.jdelorenzo.capstoneproject.EditDayFragment.ARG_ROUTINE_ID, mRoutineId);
    mAdapter.onSaveInstanceState(outState);
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onClick(android.view.View v) {
    tripRowHolder.trip.startTrip();
    tripRowHolder.callback.onTripSelected(tripRowHolder.tripId);
    tripRowHolder.trip.setCurrentLocation(tripRowHolder.trip.getStartLocation());
    tripRowHolder.trip.setFuelPrice();
}

@java.lang.Override
public void onCreate(android.os.Bundle bundle, org.smssecure.smssecure.crypto.MasterSecret masterSecret) {
    super.onCreate(bundle, masterSecret);
    action.setVisibility(View.GONE);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    return ;
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btnToAddAgent :
            showEditPage();
            break;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initData(savedInstanceState);
    initGUI();
    initApplicationLogic();
    initEventToListenerMapping();
}

@android.annotation.SuppressLint(value = "InlinedApi")
private void show() {
    mContentView.setSystemUiVisibility(((android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)));
    mVisible = true;
    mHideHandler.removeCallbacks(mHidePart2Runnable);
    mHideHandler.postDelayed(mShowPart2Runnable, com.fireteam.loupsgarous.MainActivity.UI_ANIMATION_DELAY);
}

@java.lang.Override
public void onChanged() {
    android.util.Log.v(fr.nihilus.recyclerfragment.RecyclerFragment.TAG, "onChanged: dataset has changed");
    if (isVisible()) {
        this.setEmptyShown(isEmpty());
    }
}

protected void onPostExecute(java.lang.String webData) {
    super.onPostExecute(java.lang.String);
    flickrRecyclerViewAdapter = new com.example.android.flickrbrowser.FlickrRecyclerViewAdapter(this, getMPhotos());
    mRecyclerView.setAdapter(flickrRecyclerViewAdapter);
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    android.util.Log.i(TAG, ("Messenger received WHAT value: " + (msg.what)));
    doWork(msg);
}

@java.lang.Override
public void onClick(android.view.View v) {
    productListener.removeThisProduct(getItem(position).getProductId());
}

public void googleLoginClick(android.view.View view) {
    new com.github.randoapp.service.GoogleAuthService(this).process();
}

@java.lang.Override
protected void onCancelled(com.owncloud.android.ui.preview.PreviewImageFragment.LoadImage result) {
    if ((result.bitmap) != null) {
        result.bitmap.recycle();
    }
}

public void cleanTable(java.lang.String tableName) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.execSQL(("delete from " + tableName));
    db.execSQL((("UPDATE SQLITE_SEQUENCE SET SEQ=0 WHERE NAME='" + tableName) + "'"));
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    updateItem(getAdapterPosition());
    es.usc.citius.servando.calendula.database.DB.medicines().fireEvent();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((context) instanceof internetofeveryone.ioe.Downloads.DownloadsView) {
        ((internetofeveryone.ioe.Downloads.DownloadsView) (context)).onClickDelete(string);
    }else {
    }
}

public boolean isRunnable() {
    boolean result = ((java.lang.Thread.currentThread()) == (getThreadObject())) ? true : false;
    android.util.Log.i("ThreadCore=", (result + ""));
    return result;
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        penguinologist.diyandroidchallenge.Async.au.getUserProjects();
    } catch (java.lang.Exception e) {
        android.util.Log.e("error", e.toString());
    }
    return null;
}

@org.greenrobot.eventbus.Subscribe
public void onMediaUploaded(org.wordpress.android.fluxc.store.MediaStore.OnMediaUploaded event) {
    if ((event.progress) >= 1.0F) {
        assertEquals(org.wordpress.android.fluxc.release.ReleaseStack_MediaRestTest.TEST_EVENTS.UPLOADED_MEDIA, mExpectedEvent);
    }
    mCountDownLatch.countDown();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.widget.Toast.makeText(getActivity(), "브로드캐스트", Toast.LENGTH_SHORT).show();
    doClear = true;
    startKey = 0;
    getData();
}

public static void Vibrate(final android.app.Activity activity, long milliseconds) {
    android.os.Vibrator vib = ((android.os.Vibrator) (activity.getSystemService(Service.VIBRATOR_SERVICE)));
    vib.vibrate(milliseconds);
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    inflater.inflate(R.menu.main_menu, menu);
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    com.hyphenate.kefusdk.manager.main.LeaveMessageManager.getInstance().getProjectIds();
    loadFirstStatus();
    refreshAgentAvatar();
}

public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    boolean ret = super.onKeyDown(keyCode, event);
    if ((mPluginActivity) != null) {
        return mPluginActivity.onKeyDown(keyCode, event);
    }
    return ret;
}

public void changeFragment(android.support.v4.app.Fragment newFragment, android.support.v4.app.FragmentManager mFragmentManager) {
    android.support.v4.app.FragmentTransaction transaction = mFragmentManager.beginTransaction();
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
    return shouldConsume ? true : super.performEditorAction(editorAction);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton button, boolean checked) {
    showMap = !(showMap);
}

@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int whichButton) {
    ((cgeo.geocaching.ui.EditNoteDialog.EditNoteDialogListener) (getActivity())).onFinishEditNoteDialog(mEditText.getText().toString());
    dialog.dismiss();
}

@java.lang.Override
public void onBitmapLoaded(final android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    imageView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.booking.feedon.Utils.DisplayUtil.scaleImage(bitmap, imageView, mContext);
        }
    });
}

public android.view.Window getWindow() {
    return getActivity().getWindow();
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if ((java.lang.Integer.parseInt(currentSongModel.getSongDuration())) == (mp.getCurrentPosition())) {
        skipNext();
    }
}

private com.kontakt.sdk.android.ble.configuration.ScanMode getScanMode(int mode, com.facebook.react.bridge.Promise promise) throws java.lang.Exception {
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
    if (isRecipientAdded) {
        pickContact();
    }else {
        addRecipient();
        pickContact();
        isRecipientAdded = true;
    }
}

@java.lang.Override
public void onSessionStarted(com.google.android.gms.cast.framework.CastSession session, java.lang.String sessionId) {
    timber.log.Timber.d("VideoDetailsFragment : onSessionStarted()");
    onApplicationConnected(session);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String myoGesture = intent.getStringExtra("gesture");
    android.util.Log.i(com.example.drdc_admin.moverioapp.activities.ContentActivity.TAG, ("Got message: " + myoGesture));
    handleGesture(context, myoGesture);
}

public void changeImg(android.view.View view) {
    com.extenprise.mapp.util.Utility.captureImage(this).create().show();
}

