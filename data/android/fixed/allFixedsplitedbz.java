@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
}

public void setData(java.util.List<com.ericsender.android_nanodegree.popmovie.parcelable.ReviewListObj> data) {
    mRowObjs = data;
    notifyDataSetChanged();
}

private android.graphics.Bitmap loadImage(int id) {
    return android.graphics.BitmapFactory.decodeResource(context.getResources(), id);
}

@java.lang.Override
public void onFailure(com.parse.ParseException exception) {
    callback.onFailure(exception);
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    return super.onInterceptTouchEvent(ev);
}

public static android.widget.ImageView getImage(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    if (holder instanceof com.alexvasilkov.gestures.sample.adapters.FlickrPhotoListAdapter.ViewHolder) {
        return ((com.alexvasilkov.gestures.sample.adapters.FlickrPhotoListAdapter.ViewHolder) (holder)).image;
    }else {
        return null;
    }
}

public static void init(org.catrobat.paintroid.MainActivity mainActivity, android.graphics.Bitmap first_layer) {
    org.catrobat.paintroid.dialog.LayersDialog.instance = new org.catrobat.paintroid.dialog.LayersDialog(mainActivity, first_layer);
}

private void workoutComplete() {
    android.os.Bundle data = getIntent().getExtras();
    timeTextView.setText("0");
    title.setText("YOU'RE DONE!");
}

@java.lang.Override
public void onClick(android.view.View view) {
    ch.dissem.apps.abit.util.Preferences.setWifiOnly(this, false);
    finish();
}

@android.webkit.JavascriptInterface
public void showLoadingScreen(boolean isLoading) {
    webModel.setIsLoading(isLoading);
    webModel.notifyObservers();
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i("GameActivity", "surfaceDestroyed");
    paulscode.android.mupen64plusae.jni.NativeExports.notifySDLSurfaceDestroyed();
    mSurface.setEGLContextNotReady();
    mIsSurface = false;
}

public void onError(java.lang.Exception e) {
    error = e.getMessage();
}

public void startMusic() {
    mediaPlayer.setLooping(true);
    mediaPlayer.start();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
}

@java.lang.Override
public void finish() {
    super.finish();
    setMode(com.example.try_gameengine.scene.Scene.FINISHED);
    gameModel.setData(new com.example.try_gameengine.scene.Scene.DestoryData());
    com.example.try_gameengine.framework.LayerManager.deleteSceneLayersByLayerLevel(sceneLayerLevel);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
    checkFillingPhoneNumber();
    setRecyclerView();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mExoPlayer) != null) {
        outState.putLong("bufferPosition", mExoPlayer.getCurrentPosition());
    }
}

@java.lang.Override
public void onSearch(java.lang.String searchTerm) {
    toolbar.setTitle(searchTerm);
    getWeekPager(searchTerm);
}

public static void vfmt(java.lang.String tag, java.lang.String fmt, java.lang.Object... args) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_VERBOSE) {
        java.lang.String msg = java.lang.String.format(java.util.Locale.US, fmt, args);
        android.util.Log.v(tag, msg);
    }
}

private void play(io.evercam.androidapp.dto.EvercamCamera camera) {
    nativePlay();
}

@java.lang.Override
public void onClick(android.view.View v) {
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.theironyard.finalproject.representations.Reward> call, java.lang.Throwable t) {
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (mTakePictureBtn.isEnabled()) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
            mTakePictureBtn.setEnabled(false);
            autoFocus();
        }else {
            takePicture();
        }
    }
}

public static com.andrejjj.criminalintent.models.CrimeLab get(android.content.Context context) {
    if ((com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab) == null) {
        com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab = new com.andrejjj.criminalintent.models.CrimeLab(context);
    }
    return com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab;
}

public static void stopForegroundDispatch(final android.app.Activity activity, android.nfc.NfcAdapter adapter) {
    if (adapter != null) {
        adapter.disableForegroundDispatch(activity);
    }
}

public boolean refreshList(android.view.MenuItem item) {
    return true;
}

@java.lang.Override
public void onPause() {
    super.onPause();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onListItemSelectedListener(index);
}

public void launchActivity(java.lang.Class target, android.support.v4.util.Pair<android.view.View, java.lang.String>[] sharedElements, java.util.Map<java.lang.String, java.lang.Object> data, boolean killCurrunt) {
    launchActivity(activity, target, sharedElements, data, killCurrunt);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

public void loadItems() {
    android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listSubjects.TAG, "calling onLoadItemsSubjectStarted() method");
    onLoadItemsSubjectStarted();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return (mDrawerToggle.onOptionsItemSelected(item)) || (super.onOptionsItemSelected(item));
}

public static com.google.firebase.database.FirebaseDatabase getDatabase() {
    if ((com.irene.fintrip.Utils.DatabaseUtil.mDatabase) == null) {
        android.util.Log.e("DEBUG", "new DB instance");
        com.irene.fintrip.Utils.DatabaseUtil.mDatabase = com.google.firebase.database.FirebaseDatabase.getInstance();
    }
    return com.irene.fintrip.Utils.DatabaseUtil.mDatabase;
}

@java.lang.Override
public void pause() {
    android.util.Log.v(TAG, "<< Pause has been called! >>");
    if ((isPlaying()) || ((currentState) == (com.piglettee.maxpipes.StreamPlayer.PlayerState.PAUSING))) {
        mediaPlayer.pause();
    }
}

R proceed() throws T;

private void mensajeGanador() {
    android.support.v7.app.AlertDialog.Builder alertDialog = new android.support.v7.app.AlertDialog.Builder(this);
    alertDialog.setTitle("Felicidades");
    alertDialog.setMessage("¡Juego terminado!");
    alertDialog.show();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    setResult(android.app.Activity.RESULT_OK, null);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    getFinalButtonAccessor().setBehaviour(new com.matthewtamlin.sliding_intro_screen_library.buttons.IntroButton.RequestPermissions(com.matthewtamlin.testapp.TestBehaviours.PERMISSIONS, com.matthewtamlin.testapp.TestBehaviours.PERM_REQUEST_CODE));
    getFinalButtonAccessor().setText("REQUEST PERMS", null);
}

@java.lang.Override
public VH onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return (decoratedAdapter) == null ? null : decoratedAdapter.onCreateViewHolder(parent, viewType);
}

public static boolean sniffFragmented(com.google.android.exoplayer.extractor.ExtractorInput input) throws java.io.IOException, java.lang.InterruptedException {
    return com.google.android.exoplayer.extractor.mp4.Sniffer.sniffInternal(input, true);
}

public void InitializeRealm() {
    io.realm.RealmConfiguration config = new io.realm.RealmConfiguration.Builder(mContext).name(mContext.getString(R.string.realm_name)).build();
    mRealm = io.realm.Realm.getInstance(config);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.hinohunomi.bgbeacon.BeaconService.TAG, "onDestroy");
    if ((mActionHandler) != null) {
        unregisterReceiver(broadcastReceiver);
        mActionHandler.abortBeacon();
    }
}

public void showZeroOffBanner(@android.support.annotation.NonNull
final android.app.Activity activity, java.lang.String message, int background, int foreground) {
    android.support.design.widget.Snackbar snackbar = org.wikipedia.util.FeedbackUtil.makeSnackbar(activity, message, FeedbackUtil.LENGTH_DEFAULT);
    show(snackbar, background, foreground);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.Integer integer = ((java.lang.Integer) (parent.getItemAtPosition(position)));
    this.prio = integer;
}

private void startStory(java.lang.String name) {
    android.content.Intent intent = new android.content.Intent(this, com.epicodus.storytime.StoryActivity.class);
    intent.putExtra(getString(R.string.key_name), name);
    startActivity(intent);
}

private void updatePageInfo() {
    updatePageInfo(quranPageFeeder.getCurrentPagePosition());
}

protected boolean netCheckin() {
    android.net.ConnectivityManager cm = ((android.net.ConnectivityManager) (getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo netInfo = cm.getActiveNetworkInfo();
    return (netInfo != null) && (netInfo.isConnectedOrConnecting());
}

public void setThumbnailImage(android.graphics.Bitmap bm) {
    bmThumb = bm;
    if ((bm != null) && ((imgThumb) != null)) {
        imgThumb.setImageBitmap(bm);
    }
}

@java.lang.Override
public void run() {
    tabLayout.setupWithViewPager(viewPager);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    showItem((arg2 + 1));
}

@java.lang.Override
protected void onResume() {
    setAdapter();
    super.onResume();
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
}

private static com.ziftr.android.ziftrwallet.util.ZLog initLogger() {
    if (com.ziftr.android.ziftrwallet.ZWApplication.isDebuggable()) {
        return new com.ziftr.android.ziftrwallet.util.ZLog.AndroidLogger();
    }
    return new com.ziftr.android.ziftrwallet.util.ZLog.NoOpLogger();
}

public android.view.ViewGroup getInnerView() {
    if ((mHost) == null)
        return null;
    
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
    finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.Class destinationClass = com.example.alvinlam.drawer.activity.AddCardAddActivity.class;
    android.content.Intent intentToStartAddCardActivity = new android.content.Intent(this, destinationClass);
    startActivity(intentToStartAddCardActivity);
}

@java.lang.Override
public android.content.Loader<java.util.ArrayList<com.example.picturemanager.MyImage>> onCreateLoader(int id, android.os.Bundle args) {
    return new com.example.picturemanager.ImageLoaderAsyncTask(activity, page, category);
}

public net.datafans.android.common.widget.table.TableView<T> build() {
    return new net.datafans.android.common.widget.table.TableView(context, refreshType, enableRefresh, enableLoadMore, enableAutoLoadMore, style, dataSource, delegate);
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    int time = intent.getExtras().getInt(MathActivity.INTENT_EXTRA_MINUTES);
    android.util.Log.i(com.hannah.hannahworld.BroadcastTimeCountService.TAG, ("time" + time));
    return mBinder;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = io.github.gdg_bucharest.gdg_feedly_client.EntryActivity.newIntent(this, streamContents.getItems(), position);
    startActivity(intent);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return fragmentList.get(position);
}

@java.lang.Override
public int compare(java.util.Map.Entry<java.lang.Long, com.asgj.android.appusage.Utility.UsageInfo> lhs, java.util.Map.Entry<java.lang.Long, com.asgj.android.appusage.Utility.UsageInfo> rhs) {
    return ((int) ((rhs.getKey()) - (lhs.getKey())));
}

@java.lang.Override
public com.mediamonkey.android.lib.dto.contents.ChapterInventory createFromParcel(final android.os.Parcel in) {
    return new com.mediamonkey.android.lib.dto.contents.ChapterInventory(in.readLong(), in.readLong(), in.readInt(), in.readString());
}

private void scaleImage(android.graphics.Bitmap bm, android.widget.ImageView iv, int width, int height) {
    iv.setImageBitmap(android.graphics.Bitmap.createScaledBitmap(bm, width, height, false));
}

public void delete(android.content.Context context) {
    context.deleteDatabase(InventoryContract.ProductEntry.TABLE_NAME);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(context, R.string.update_start_hint, Toast.LENGTH_SHORT).show();
    new java.lang.Thread(new com.oidiotlin.classmanager.utils.network.UpdateAppTask(context, handler)).start();
}

private android.widget.FrameLayout createFrameLayout(android.content.Context context) {
    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
    frameLayout.setVisibility(com.wiky.ui.layout.INVISIBLE);
    return frameLayout;
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
}

public com.berepublic.commons.manager.NavigationManager.Builder putData(android.os.Bundle extras) {
    this.extras.putAll(extras);
    return this;
}

public void addAttachment(@android.support.annotation.NonNull
ly.loud.loudly.new_base.interfaces.attachments.Attachment attachment) {
    attachmentList.add(attachment);
    setAttachmentsParams();
    setEditTextParams();
    adapter.notifyDataSetChanged();
    if ((onAttachmentListener) != null) {
        onAttachmentListener.onAttachmentAdded(attachment);
    }
}

@java.lang.Override
public void onTermChanged(int termID, java.lang.String termName) {
    adapter.newList(getCourseScoreByTerm(termID));
}

android.text.Spanned enrichText(java.lang.String text) {
    return android.text.Html.fromHtml(text.replaceAll("\\{(.*)\\}", "<font color=#4caf50>$1</font>"));
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle state) {
    super.onActivityCreated(state);
    setUpBindings();
    setUpRefreshing();
    setUpMetrics();
    setUpState(state);
}

public void onStart() {
    final android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(UsbEventReceiverActivity.ACTION_USB_PERMISSION);
    mActivity.registerReceiver(mUsbReceiver, intentFilter);
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
    return (skeletonAttribute.isHoldTouchEventsFromChildren()) || (super.onInterceptTouchEvent(motionEvent));
}

public boolean doWrite(android.bluetooth.BluetoothGattCharacteristic characteristic, byte[] data) {
    characteristic.setValue(data);
    if (!(gatt.writeCharacteristic(characteristic))) {
        android.util.Log.d(it.innove.Peripheral.LOG_TAG, "Error on doWrite");
        return false;
    }
    return true;
}

public static void test_044() throws com.android.uiautomator.core.UiObjectNotFoundException {
    try {
        framework.common.PhoneCommon.Makecall("10086", 1);
        check(testcase.Object_ResourceId, testcase.Operation_checkExist, "com.android.dialer:id/floating_end_call_action_button");
    } finally {
        excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.dialer:id/floating_end_call_action_button");
    }
}

@java.lang.Override
public void run() {
    webView.loadUrl((("javascript:loadDraft('" + data) + "')"));
    android.util.Log.d("posting data", data);
}

@java.lang.Override
public void onBatchCompleted(com.facebook.GraphRequestBatch graphRequestBatch) {
    (pageNumber)++;
}

public static free.rm.skytube.gui.businessobjects.SubsAdapter get(android.content.Context context, android.view.View progressBar) {
    if ((free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter) == null) {
        free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter = new free.rm.skytube.gui.businessobjects.SubsAdapter(context, progressBar);
    }
    return free.rm.skytube.gui.businessobjects.SubsAdapter.subsAdapter;
}

@java.lang.Override
public void onClick(android.view.View view) {
    startActvitiy(nl.yoerinijs.notebuddy.activities.NotesActivity.EDIT_NOTE_ACTIVITY, true, null, null);
}

@java.lang.Override
public android.content.Context setUpContext(flow.path.Path path, android.content.Context parentContext) {
    mortar.MortarScope screenScope = screenScoper.getScreenScope(parentContext, path.toString(), path);
    return new com.example.mortar.mortarflow.MortarContextFactory.TearDownContext(parentContext, screenScope);
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    index.add(position);
    return true;
}

private void animateToLocation(final org.osmdroid.util.GeoPoint location) {
    mapView.getController().animateTo(location);
}

public abstract void onScroll(int position, float positionOffset);

@butterknife.OnClick(value = R.id.faq_button)
public void onFaqButtonClicked(android.view.View view) {
    android.content.Intent faqIntent = new android.content.Intent(this, com.piemicrosystems.bancus.ui.activities.help.FAQActivity.class);
    startActivity(faqIntent);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        if ((PositionMarker) != null)
            moveMarker(PositionMarker, location);
        
    }
}

@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    vpViewPager.setCurrentItem(tab.getPosition());
}

private void displayJokeActivity() {
    new com.elorri.android.builditbigger.GCEndpointsApiService(getActivity()).execute(getContext());
}

public static void addBitmapToMemoryCache(com.esaych.calc.utils.TextBookLoc key, android.graphics.Bitmap bitmap) {
    if ((com.esaych.calc.utils.ImageCache.imageCache.get(key.toString())) == null) {
        com.esaych.calc.utils.ImageCache.imageCache.put(key.toString(), bitmap);
    }
}

public void addToDb(int id) {
    java.lang.String query_normal = "INSERT INTO %s VALUES ('%d');";
    java.lang.String query = java.lang.String.format(query_normal, DbContract.Bookmarks.TABLE_NAME, id);
    org.fossasia.openevent.dbutils.DbSingleton dbSingleton = org.fossasia.openevent.dbutils.DbSingleton.getInstance();
    dbSingleton.insertQuery(query);
}

@java.lang.Override
public com.github.kolandroid.kol.data.DataCache<java.lang.String, com.github.kolandroid.kol.data.RawSkill> getSkillCache() {
    return skillsCache;
}

private void activateGeofences() {
    android.util.Log.v(com.ngynstvn.android.blocspot.ui.fragment.MapsFragment.TAG, "activateGeofences() called");
    if ((getGeofencingRequest()) == null) {
        return ;
    }
    LocationServices.GeofencingApi.addGeofences(googleApiClient, getGeofencingRequest(), getGeofencePendingIntent()).setResultCallback(this);
}

@java.lang.Override
public boolean onNestedPreFling(android.view.View target, float velocityX, float velocityY) {
    return false;
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mFile = new java.io.File(getActivity().getExternalFilesDir(null), "pic.jpg");
}

@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.app.LoaderManager loaderManager = getLoaderManager();
    loaderManager.initLoader(ahmadadam96.comicbookmovies.MainActivity.MOVIE_LOADER_ID, null, this);
}

public void changeDataSet(java.util.ArrayList<com.bitbudai.fermat_cht_android_sub_app_chat_bitdubai.models.ChatMessage> data) {
    this.chatMessages = data;
}

private static void applyChanges(@android.support.annotation.Nullable
final java.util.List<net.gini.android.vision.internal.camera.photo.PhotoModifier> modifiers) {
    if (modifiers == null) {
        return ;
    }
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
    super.setOnTouchListener(l);
}

