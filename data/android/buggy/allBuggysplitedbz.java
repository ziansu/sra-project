@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if ((progress > 0) && (progress <= (screenCount))) {
        saveSurvey();
        mCurrentScreen = getScreen(progress);
        setupScreen();
    }
}

public void setData(java.util.List<com.ericsender.android_nanodegree.popmovie.parcelable.ReviewListObj> data) {
    int v = (data.isEmpty()) ? android.view.View.GONE : android.view.View.VISIBLE;
    mReviewListView.setVisibility(v);
    mRowObjs = data;
    notifyDataSetChanged();
}

private android.graphics.Bitmap loadImage(int id) {
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeResource(context.getResources(), id);
    android.graphics.Bitmap scaled = android.graphics.Bitmap.createScaledBitmap(bitmap, IMAGE_WIDTH, IMAGE_HEIGHT, true);
    bitmap.recycle();
    return scaled;
}

@java.lang.Override
public void onFailure(com.parse.ParseException exception) {
    android.util.Log.d("zzz-makeReservation", ("get available machine fail " + (exception.getMessage())));
    callback.onFailure(exception);
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    dispatchJSTouchEvent(ev);
    return super.onInterceptTouchEvent(ev);
}

public static android.widget.ImageView getImage(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    return ((com.alexvasilkov.gestures.sample.adapters.FlickrPhotoListAdapter.ViewHolder) (holder)).image;
}

public static void init(org.catrobat.paintroid.MainActivity mainActivity, android.graphics.Bitmap first_layer) {
    if ((org.catrobat.paintroid.dialog.LayersDialog.instance) == null)
        org.catrobat.paintroid.dialog.LayersDialog.instance = new org.catrobat.paintroid.dialog.LayersDialog(mainActivity, first_layer);
    
}

private void workoutComplete() {
    android.os.Bundle data = getIntent().getExtras();
    boolean isSaved = data.getBoolean("isSaved");
    if (!isSaved)
        timeTextView.setText("0");
    
    title.setText("YOU'RE DONE!");
}

@java.lang.Override
public void onClick(android.view.View view) {
    ch.dissem.apps.abit.util.Preferences.setWifiOnly(this, true);
    finish();
}

@android.webkit.JavascriptInterface
public void showLoadingScreen(boolean isLoading) {
    webModel.setIsLoading(isLoading);
    java.lang.System.out.println("SHOW LOADING SCREEN>>>");
    webModel.notifyObservers();
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i("GameActivity", "surfaceDestroyed");
    paulscode.android.mupen64plusae.jni.NativeExports.notifySDLSurfaceDestroyed();
    mSurface.setEGLContextNotReady();
    mIsSurface = false;
    tryPausing();
}

@java.lang.Override
public void onError(java.lang.Exception e) {
    android.util.Log.i("CZD Websocket", ("Error " + (e.getMessage())));
}

public void startMusic() {
    mediaPlayer = android.media.MediaPlayer.create(context, R.raw.classical_a_minor);
    mediaPlayer.setLooping(true);
    mediaPlayer.start();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.aboutMeMenuItem :
            return true;
        case R.id.preferences :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    android.util.Log.i(TAG, "onPageScrolled: ");
}

@java.lang.Override
public void finish() {
    super.finish();
    ((android.app.Activity) (context)).finish();
    setMode(com.example.try_gameengine.scene.Scene.FINISHED);
    gameModel.setData(new com.example.try_gameengine.scene.Scene.DestoryData());
    com.example.try_gameengine.framework.LayerManager.deleteSceneLayersByLayerLevel(sceneLayerLevel);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
    startNotificationService();
    checkFillingPhoneNumber();
    setRecyclerView();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putLong("bufferPosition", mExoPlayer.getCurrentPosition());
}

@java.lang.Override
public void onSearch(java.lang.String searchTerm) {
    android.widget.Toast.makeText(this, (searchTerm + " Searched"), Toast.LENGTH_LONG).show();
    toolbar.setTitle(searchTerm);
    getWeekPager(searchTerm);
}

public static int vfmt(java.lang.String tag, java.lang.String fmt, java.lang.Object... args) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_VERBOSE) {
        java.lang.String msg = java.lang.String.format(java.util.Locale.US, fmt, args);
        return android.util.Log.v(tag, msg);
    }
    return 0;
}

private void play(io.evercam.androidapp.dto.EvercamCamera camera) {
    nativeSetUsername(camera.getUsername());
    nativeSetPassword(camera.getPassword());
    nativePlay();
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, com.alpha.sound_recorder_app.ui.RecordListActivity.class));
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.ArrayList<com.theironyard.finalproject.representations.Reward>> call, java.lang.Throwable t) {
    android.support.design.widget.Snackbar.make(view, "There was an issue with the API.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (mTakePictureBtn.isEnabled()) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
            autoFocus();
        }else {
            takePicture();
        }
    }
}

public static com.andrejjj.criminalintent.models.CrimeLab get(android.content.Context context) {
    if ((com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab) == null) {
        return new com.andrejjj.criminalintent.models.CrimeLab(context);
    }else {
        return com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab;
    }
}

public static void stopForegroundDispatch(final android.app.Activity activity, android.nfc.NfcAdapter adapter) {
    adapter.disableForegroundDispatch(activity);
}

public boolean refreshList(android.view.MenuItem item) {
    new me.blueland.metro.activity.BusStationPre.BusController().execute(stationCode);
    return true;
}

@java.lang.Override
public void onPause() {
    int positie = s.getSelectedItemPosition();
    android.content.SharedPreferences.Editor editor = savedValues.edit();
    editor.putInt("spinnerPositie", positie);
    editor.commit();
    super.onPause();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onListItemSelectedListener(1);
}

public void launchActivity(java.lang.Class target, android.support.v4.util.Pair<android.view.View, java.lang.String>[] sharedElements, java.util.Map<java.lang.String, java.lang.Object> data, boolean killCurrunt) {
    launchActivity(activity, target, null, null, killCurrunt);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (seafDirent.isDir()) {
    }else {
    }
}

public void loadItems() {
    if (!(database.getRunningTask())) {
        android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listSubjects.TAG, "calling onLoadItemsSubjectsFinished() method");
    }else {
        android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listSubjects.TAG, "calling onLoadItemsSubjectStarted() method");
        onLoadItemsSubjectStarted();
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (mDrawerToggle.onOptionsItemSelected(item)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}

public static com.google.firebase.database.FirebaseDatabase getDatabase() {
    if ((com.irene.fintrip.Utils.DatabaseUtil.mDatabase) == null) {
        android.util.Log.e("DEBUG", "new DB instance");
        com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        com.irene.fintrip.Utils.DatabaseUtil.mDatabase = com.google.firebase.database.FirebaseDatabase.getInstance();
    }
    return com.irene.fintrip.Utils.DatabaseUtil.mDatabase;
}

@java.lang.Override
public void pause() {
    android.util.Log.v(TAG, "<< Pause has been called! >>");
    if ((isPlaying()) && ((currentState) == (com.piglettee.maxpipes.StreamPlayer.PlayerState.PAUSING))) {
        mediaPlayer.pause();
    }
}

R proceed(android.content.Intent intent) throws T;

public void mensajeGanador() {
    android.support.v7.app.AlertDialog.Builder alertDialog = new android.support.v7.app.AlertDialog.Builder(this);
    alertDialog.setTitle("Felicidades");
    alertDialog.setMessage("¡Juego terminado!");
    alertDialog.show();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    finish();
    setResult(android.app.Activity.RESULT_OK, null);
}

@java.lang.Override
public void onClick(android.view.View v) {
    getLeftButtonAccessor().setBehaviour(new com.matthewtamlin.sliding_intro_screen_library.buttons.IntroButton.RequestPermissions(com.matthewtamlin.testapp.TestBehaviours.PERMISSIONS, com.matthewtamlin.testapp.TestBehaviours.PERM_REQUEST_CODE));
    getFinalButtonAccessor().setText("REQUEST PERMS", null);
}

@java.lang.Override
public VH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return decoratedAdapter.onCreateViewHolder(parent, viewType);
}

public static boolean sniffFragmented(com.google.android.exoplayer.extractor.ExtractorInput input) throws java.io.IOException, java.lang.InterruptedException {
    return com.google.android.exoplayer.extractor.mp4.Sniffer.sniffInternal(input, (4 * 1024), true);
}

public void InitializeRealm(android.content.Context context) {
    mContext = context;
    io.realm.RealmConfiguration config = new io.realm.RealmConfiguration.Builder(context).name(context.getString(R.string.realm_name)).build();
    mRealm = io.realm.Realm.getInstance(config);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.hinohunomi.bgbeacon.BeaconService.TAG, "onDestroy");
    unregisterReceiver(broadcastReceiver);
    mActionHandler.abortBeacon();
}

public void showZeroOffBanner(@android.support.annotation.NonNull
final android.app.Activity activity, java.lang.String message, int background, int foreground) {
    android.support.design.widget.Snackbar snackbar = org.wikipedia.util.FeedbackUtil.makeSnackbar(activity.getWindow().getDecorView(), message, FeedbackUtil.LENGTH_DEFAULT);
    show(snackbar, background, foreground);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.Integer integer = ((java.lang.Integer) (parent.getItemAtPosition(position)));
    this.prio = com.example.andreas.studentmanager.models.Prio.makePrio(integer);
}

private void startStory(java.lang.String name) {
    android.content.Intent intent = new android.content.Intent(this, com.epicodus.storytime.StoryActivity.class);
    intent.putExtra(getString(R.string.key_name));
    startActivity(intent);
}

private void updatePageInfo() {
    updatePageInfo(quranPageFeeder.getCurrentPagePosition());
    com.quran.labs.androidquran.util.QuranSettings.getInstance().setLastPage(quranPageFeeder.getCurrentPagePosition());
}

private boolean netCheckin() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo netInfo = cm.getActiveNetworkInfo();
    return (netInfo != null) && (netInfo.isConnectedOrConnecting());
}

public void setThumbnailImage(android.graphics.Bitmap bm) {
    bmThumb = bm;
    if (bm != null) {
        imgThumb.setImageBitmap(bm);
    }
}

@java.lang.Override
public void run() {
    android.util.Log.d(com.project.ishoupbud.view.fragment.TAG, "run: ");
    transactionAdapter.notifyDataSetChanged();
    tabLayout.setupWithViewPager(viewPager);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    showItem(arg2);
}

@java.lang.Override
protected void onResume() {
    android.widget.Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
    mAdapter.swapCursor(com.mynotes.android.mynotes.data.DataUtils.getInstance(this).getAllNotes("date"));
    setAdapter();
    super.onResume();
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        con.disconnect();
    } catch (java.io.IOException e) {
        android.util.Log.e("ERROR", ("Read this: " + (e.getMessage())));
    }
}

private static com.ziftr.android.ziftrwallet.util.ZLog initLogger() {
    if ((com.ziftr.android.ziftrwallet.ZWApplication.isDebuggable()) || (com.ziftr.android.ziftrwallet.ZWPreferences.getDebugMode())) {
        return new com.ziftr.android.ziftrwallet.util.ZLog.AndroidLogger();
    }
    return new com.ziftr.android.ziftrwallet.util.ZLog.NoOpLogger();
}

public android.view.ViewGroup getInnerView() {
    if ((mHost) instanceof com.taobao.weex.ui.view.refresh.wrapper.BounceScrollerView) {
        return ((com.taobao.weex.ui.view.refresh.wrapper.BounceScrollerView) (mHost)).getInnerView();
    }else {
        return getHostView();
    }
}

public void resumeGame(android.view.View v) {
    finalproject.tap.PlayActivity.pausestatus = 0;
    finalproject.tap.PlayActivity.timerPaused = false;
    finalproject.tap.PlayActivity.timerResume = true;
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.PlayActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
    finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.example.alvinlam.drawer.activity.MainActivity.TAG, ("onClick: " + "1"));
    java.lang.Class destinationClass = com.example.alvinlam.drawer.activity.AddCardAddActivity.class;
    android.content.Intent intentToStartAddCardActivity = new android.content.Intent(this, destinationClass);
    startActivity(intentToStartAddCardActivity);
}

@java.lang.Override
public android.content.Loader<java.util.ArrayList<com.example.picturemanager.MyImage>> onCreateLoader(int id, android.os.Bundle args) {
    android.util.Log.d("AND", "HERE");
    return new com.example.picturemanager.ImageLoaderAsyncTask(activity, page, category);
}

public net.datafans.android.common.widget.table.TableView<T> bulid() {
    return new net.datafans.android.common.widget.table.TableView(context, refreshType, enableRefresh, enableLoadMore, enableAutoLoadMore, style, dataSource, delegate);
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    int time = intent.getExtras().getInt(MathActivity.INTENT_EXTRA_MINUTES);
    beginBroadcast(time);
    android.util.Log.i(com.hannah.hannahworld.BroadcastTimeCountService.TAG, ("time" + time));
    return mBinder;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = io.github.gdg_bucharest.gdg_feedly_client.EntryActivity.newIntent(this, streamContents.getItems());
    startActivity(intent);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    java.lang.System.out.println(position);
    activity.setTop(position);
    return fragmentList.get(position);
}

@java.lang.Override
public int compare(java.util.Map.Entry<java.lang.Long, com.asgj.android.appusage.Utility.UsageInfo> lhs, java.util.Map.Entry<java.lang.Long, com.asgj.android.appusage.Utility.UsageInfo> rhs) {
    return ((int) ((lhs.getKey()) - (rhs.getKey())));
}

@java.lang.Override
public com.mediamonkey.android.lib.dto.contents.ChapterInventory createFromParcel(final android.os.Parcel in) {
    return new com.mediamonkey.android.lib.dto.contents.ChapterInventory(in.readLong(), in.readLong(), com.mediamonkey.android.lib.dto.contents.ChapterInventory.MediaType.byValue(in.readInt()), in.readString());
}

private void scaleImage(android.graphics.Bitmap bm, android.widget.ImageView iv, int width, int length) {
    iv.setImageBitmap(android.graphics.Bitmap.createScaledBitmap(bm, width, length, false));
}

public void Delete(android.content.Context context) {
    context.deleteDatabase(InventoryContract.ProductEntry.TABLE_NAME);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(context, R.string.update_start_hint, Toast.LENGTH_SHORT).show();
    new com.oidiotlin.classmanager.utils.network.UpdateAppTask(context, handler).run();
}

private android.widget.FrameLayout createFrameLayout(android.content.Context context) {
    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
    frameLayout.setTag(null);
    frameLayout.setVisibility(com.wiky.ui.layout.INVISIBLE);
    frameLayout.setY(0.0F);
    return frameLayout;
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    android.widget.Toast.makeText(getBaseContext(), java.lang.String.valueOf(hasFocus), Toast.LENGTH_SHORT).show();
}

public com.berepublic.commons.manager.NavigationManager.Builder putData(android.os.Bundle extras) {
    extras.putAll(extras);
    return this;
}

public void addAttachment(@android.support.annotation.NonNull
ly.loud.loudly.new_base.interfaces.attachments.Attachment attachment) {
    attachmentList.add(attachment);
    setEditTextParams();
    setAttachmentsParams();
    adapter.notifyDataSetChanged();
    if ((onAttachmentListener) != null) {
        onAttachmentListener.onAttachmentAdded(attachment);
    }
}

@java.lang.Override
public void onTermChanged(int termID, java.lang.String termName) {
    adapter.newList(getCourseScoreByTerm(termID));
    android.util.Log.d("学期", termName);
}

android.text.Spanned enrichText(java.lang.String text) {
    return android.text.Html.fromHtml(text.replaceAll("<", "&lt;").replaceAll("\\{(.*)\\}", "<font color=#4caf50>$1</font>"));
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle state) {
    super.onActivityCreated(state);
    setUpState(state);
    setUpBindings();
    setUpRefreshing();
    setUpMetrics();
}

public void onStart() {
    final android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(UsbEventReceiverActivity.ACTION_USB_PERMISSION);
    intentFilter.addAction(UsbManager.ACTION_USB_DEVICE_DETACHED);
    mActivity.registerReceiver(mUsbReceiver, intentFilter);
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
    io.rmiri.skeleton.utils.CLog.i(("SkeletonMaster onInterceptTouchEvent  " + (position)));
    return (skeletonAttribute.isHoldTouchEventsFromChildren()) || (super.onInterceptTouchEvent(motionEvent));
}

public void doWrite(android.bluetooth.BluetoothGattCharacteristic characteristic, byte[] data) {
    characteristic.setValue(data);
    if (!(gatt.writeCharacteristic(characteristic))) {
        android.util.Log.d(it.innove.Peripheral.LOG_TAG, "Error on doWrite");
    }
}

public static void test_044() throws com.android.uiautomator.core.UiObjectNotFoundException {
    framework.common.PhoneCommon.Makecall("10086", 1);
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/floating_end_call_action_button");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
}

@java.lang.Override
public void run() {
    java.lang.String xmlData = addModelAndInstanceTag(data).replaceAll("\"", "\\\"");
    webView.loadUrl((("javascript:loadDraft('" + xmlData) + "')"));
    android.util.Log.d("posting data", xmlData);
}

@java.lang.Override
public void onBatchCompleted(com.facebook.GraphRequestBatch graphRequestBatch) {
    android.util.Log.d("called", "main req");
    (pageNumber)++;
}

public static free.rm.skytube.gui.businessobjects.SubsAdapter get(android.content.Context context, android.view.View progressBar) {
    if ((free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter) == null) {
        free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter = new free.rm.skytube.gui.businessobjects.SubsAdapter(context, progressBar);
    }else {
        free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter.setContext(context);
    }
    return free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter;
}

@java.lang.Override
public void onClick(android.view.View view) {
    startActvitiy(nl.yoerinijs.notebuddy.activities.NotesActivity.EDIT_NOTE_ACTIVITY, false, null, null);
}

@java.lang.Override
public android.content.Context setUpContext(flow.path.Path path, android.content.Context parentContext) {
    mortar.MortarScope screenScope = screenScoper.getScreenScope(parentContext, path.getClass().getName(), path);
    return new com.example.mortar.mortarflow.MortarContextFactory.TearDownContext(parentContext, screenScope);
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    index.add(position);
    if ((index.size()) == (com.vtewari.bunkconfidently.adapter.LectureListAdapter.list.size())) {
        return true;
    }else {
        return true;
    }
}

private void animateToLocation(final org.osmdroid.util.GeoPoint location) {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mapView.getController().animateTo(location);
        }
    }, 200);
}

public abstract void onScroll(android.view.ViewGroup container, int position, float positionOffset);

@butterknife.OnClick(value = R.id.faq_button)
public void onFaqButtonClicked(android.view.View view) {
    android.content.Intent faqIntent = new android.content.Intent(this, com.piemicrosystems.bancus.ui.activities.help.FAQActivity.class);
    startActivity(faqIntent);
    finish();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (!(location.equals(null))) {
        moveMarker(PositionMarker, location);
    }
}

@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    vpViewPager.setCurrentItem(tab.getPosition());
    android.util.Log.d("HERE", "HERE");
}

private void displayJokeActivity() {
    new com.elorri.android.builditbigger.GCEndpointsApiService(getActivity()).execute();
}

public static void addBitmapToMemoryCache(com.esaych.calc.utils.TextBookLoc key, android.graphics.Bitmap bitmap) {
    if ((com.esaych.calc.utils.ImageCache.imageCache.get(key)) == null) {
        com.esaych.calc.utils.ImageCache.imageCache.put(key, bitmap);
    }
}

public void addToDb(int id) {
    java.lang.String query_normal = "INSERT INTO %s VALUES ('%d');";
    java.lang.String query = java.lang.String.format(android.database.DatabaseUtils.sqlEscapeString(query_normal), DbContract.Bookmarks.TABLE_NAME, id);
    org.fossasia.openevent.dbutils.DbSingleton dbSingleton = org.fossasia.openevent.dbutils.DbSingleton.getInstance();
    dbSingleton.insertQuery(query);
}

@java.lang.Override
public com.github.kolandroid.kol.data.DataCache<java.lang.String, com.github.kolandroid.kol.data.RawSkill> getSkillCache() {
    if (skillsCache.isLoadRequired()) {
        synchronized(skillsCache) {
            if (skillsCache.isLoadRequired()) {
                skillsCache.load(this);
            }
        }
    }
    return skillsCache;
}

private void activateGeofences() {
    android.util.Log.v(com.ngynstvn.android.blocspot.ui.fragment.MapsFragment.TAG, "activateGeofences() called");
    LocationServices.GeofencingApi.addGeofences(googleApiClient, getGeofencingRequest(), getGeofencePendingIntent()).setResultCallback(this);
}

@java.lang.Override
public boolean onNestedPreFling(android.view.View target, float velocityX, float velocityY) {
    return true;
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mFile = new java.io.File(getActivity().getExternalFilesDir(Environment.DIRECTORY_PICTURES), "pic.jpg");
}

@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.app.LoaderManager loaderManager = getLoaderManager();
    loaderManager.initLoader(ahmadadam96.comicbookmovies.MainActivity.MOVIE_LOADER_ID, null, this);
    loaderManager.initLoader(ahmadadam96.comicbookmovies.MainActivity.CODES_LOADER_ID, null, this);
    mSwipeRefreshLayout.setRefreshing(false);
}

public void changeDataSet(java.util.ArrayList<com.bitbudai.fermat_cht_android_sub_app_chat_bitdubai.models.ChatMessage> data) {
    if (filterString.equals(""))
        this.chatMessages = data;
    else
        this.filteredData = data;
    
}

private static void applyChanges(@android.support.annotation.NonNull
final java.util.List<net.gini.android.vision.internal.camera.photo.PhotoModifier> modifiers) {
    for (final net.gini.android.vision.internal.camera.photo.PhotoModifier modifier : modifiers) {
        modifier.modify();
    }
}

@java.lang.Override
@org.xwalk.core.internal.XWalkAPI
public void setOnTouchListener(android.view.View.OnTouchListener l) {
    if ((mContent) == null)
        return ;
    
    org.xwalk.core.internal.XWalkViewInternal.checkThreadSafety();
    this.setOnTouchListener(l);
}

