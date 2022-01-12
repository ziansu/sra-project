private void showResult(java.lang.Integer message) {
    android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
}

private void initView() {
    mPicker = new wuxian.me.filepicker.FilePickerImpl(new wuxian.me.filepicker.ListViewProxy(getBaseContext(), ((android.widget.ListView) (findViewById(R.id.listView)))), mListener);
    mPicker.listRootFiles();
}

public void tellJoke(android.view.View view) {
    if ((fragment) != null) {
        fragment.onCallFragment();
    }
    progressBar.setVisibility(View.VISIBLE);
    jokesAsyncTask = new com.udacity.gradle.builditbigger.tasks.JokesAsyncTask(this);
    jokesAsyncTask.execute();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(this.server);
    dest.writeString(this.email);
    dest.writeValue(this.is_shib);
    dest.writeString(this.token);
}

@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onAttach(android.app.Activity activity) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M)) {
        dagger.android.AndroidInjection.inject(this);
        super.onAttach(activity);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    BI2.setVisibility(View.GONE);
    (tag_num)--;
    buttonStack.push(BI2);
}

private static void disableAnimations() {
    int permStatus = org.xbmc.kore.testhelpers.Utils.context.checkCallingOrSelfPermission(org.xbmc.kore.testhelpers.Utils.ANIMATION_PERMISSION);
    if (permStatus == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        org.xbmc.kore.testhelpers.Utils.setSystemAnimationsScale(org.xbmc.kore.testhelpers.Utils.DISABLED);
    }
}

@java.lang.Override
public void onScrollStateChanged(android.support.v7.widget.RecyclerView recyclerView, int newState) {
    super.onScrollStateChanged(recyclerView, newState);
    android.util.Log.d(com.ray.rssmovie.widget.EasyListingView.TAG, ("EasyListingView scroll stated:" + newState));
}

@java.lang.Override
public void onErrorCreationCustomer() {
    android.widget.Toast.makeText(getActivity(), "Email is already in use, choose a different one", Toast.LENGTH_SHORT).show();
    android.widget.Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
}

public void get(android.view.View view) {
    android.util.Log.d("info", "get called");
    overlandthomas.shopinglistalpha.UnitConversions.Unit u = new overlandthomas.shopinglistalpha.UnitConversions.Unit("Cup", 0, "volume");
    add(u, "test item add");
}

@java.lang.Override
public void onActivityUpdated(com.google.android.gms.location.DetectedActivity a) {
    android.widget.Toast.makeText(getApplicationContext(), ("Latitude : " + (com.example.omair.minethetag.LoginActivity.latitude)), Toast.LENGTH_SHORT).show();
}

public void onClick(android.content.DialogInterface arg0, int arg1) {
    finish();
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    numWords = progress + 3;
    numWordsDisplay.setText(java.lang.String.valueOf(numWords));
}

public static synchronized com.tinyweather.model.TinyWeatherDB getInstance(android.content.Context cintext) {
    if ((com.tinyweather.model.TinyWeatherDB.tinyWeatherDB) == null) {
        com.tinyweather.model.TinyWeatherDB.tinyWeatherDB = new com.tinyweather.model.TinyWeatherDB(cintext);
    }
    return com.tinyweather.model.TinyWeatherDB.tinyWeatherDB;
}

public boolean remove(int id) {
    android.database.sqlite.SQLiteDatabase db2 = urlHistory.getWritableDatabase();
    return (db2.delete(com.example.koti.androidbrowser.HistoryAdapter2.UrlHistory.TABLE_NAME, (((com.example.koti.androidbrowser.HistoryAdapter2.UrlHistory.ID) + " = ") + id), null)) > 0;
}

@java.lang.Override
public com.example.android.popularmovies.fragments.MovieListFragment getItem(int position) {
    android.os.Bundle args = new android.os.Bundle();
    switch (position) {
        case 0 :
            return mPopularFrag;
        case 1 :
            return mTopRatedFrag;
        case 2 :
            return mFavoritesFrag;
        default :
            return mPopularFrag;
    }
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    setUpMapIfNeeded();
    android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, ("onResume " + (mGoogleApiClient.isConnected())));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.button_right)) {
        headBar.setRightButtonIcon("fa-chevron-up");
        initmPopupWindowView();
        popupwindow.showAsDropDown(v, 0, 3);
    }
}

public static void getInfoForTourLocation(android.app.Activity activity, com.example.john.norfolktouring.TourLocation tourLocation) {
    java.util.List<com.example.john.norfolktouring.TourLocation> tourLocations = new java.util.ArrayList(java.util.Arrays.asList(tourLocation));
    com.example.john.norfolktouring.Utils.PlacesUtils.getInfoForTourLocations(activity, tourLocations, null);
}

@android.support.annotation.Nullable
public com.charlesmadere.hummingbird.models.LibraryUpdate getLibraryUpdate() {
    if (mLibraryUpdate.containsModifications(mLibraryEntry)) {
        return mLibraryUpdate;
    }else {
        return null;
    }
}

private synchronized void addUpdate(android.content.ContentProviderOperation update) {
    mDataUpdateList.add(update);
    if ((mDataUpdateList.size()) > (org.tvbrowser.tvbrowser.TvDataUpdateService.TABLE_OPERATION_MIN_SIZE)) {
        update(mDataUpdateList);
    }
}

@java.lang.Override
public void onFailure(retrofit2.Call<io.filepicker.models.FPFile> call, java.lang.Throwable throwable) {
    android.util.Log.e(io.filepicker.services.ContentService.LOG_TAG, "failure", throwable);
    countDownLatch.countDown();
}

private void setupPlayer() {
    android.util.Log.v(Constants.LOG_TAG, "Setting up the player...");
    uk.co.qubitssolutions.bharatradios.app.services.BackgroundAudioPlayerService.audioPlayer.initPlayer();
    acquireWakeLock();
    acquireWifiLock();
    setupAudioFocus();
    setupMediaSession();
    android.util.Log.v(Constants.LOG_TAG, "Player setup successfully");
}

public android.content.Intent[] getSavedIntents() {
    return savedIntents;
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    setStarted(true);
    com.example.jose.updated.controller.NotificationService.pagesToTrack = pagesHolder.getPagesToTrack();
    com.example.jose.updated.controller.NotificationService.updatedPages = pagesHolder.getUpdatedPages();
    createTimerTask();
    setUpTimer(updateTimerTask);
}

private void OnCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.yes_service_activity);
}

private void resetMediaPlayer() {
    if (mMediaPlayer.isPlaying()) {
        mMediaPlayer.stop();
    }
    mMediaPlayer = new android.media.MediaPlayer();
}

public void load(TModel model, com.raizlabs.android.dbflow.structure.database.DatabaseWrapper databaseWrapper) {
    getSingleModelLoader().load(databaseWrapper, com.raizlabs.android.dbflow.sql.language.SQLite.select().from(getModelClass()).where(getPrimaryConditionClause(model)).getQuery());
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case 1 :
            wrongPasswordAlert.setVisibility(View.GONE);
            passwordInput.setText("");
            passwordInput.setInputType(InputType.TYPE_CLASS_NUMBER);
            break;
        default :
            break;
    }
}

private static android.content.Context getContext() {
    synchronized(com.unbelievable.library.android.utils.PreferencesUtil.class) {
        if ((com.unbelievable.library.android.utils.PreferencesUtil.getContext()) == null) {
            throw new java.lang.NullPointerException("Call PreferencesUtil.initialize(context) within your Application onCreate() method.");
        }else {
            return com.unbelievable.library.android.utils.PreferencesUtil.mContext;
        }
    }
}

public void attach() {
    android.util.Log.e(li.klass.fhem.util.UIBroadcastReceiver.class.getName(), "attach");
    activity.registerReceiver(this, intentFilter);
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    hidingAlphaBeforeRepeatWorking = true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    for (fiskinfoo.no.sintef.fiskinfoo.Baseclasses.ToolEntry toolEntry : unconfirmedRemovedTools) {
        toolEntry.setToolStatus(ToolEntryStatus.STATUS_REMOVED);
    }
    user.writeToSharedPref(v.getContext());
    dialog.dismiss();
}

@java.lang.Override
public void run() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null)
        getSupportActionBar().hide();
    
}

private void onRegistreClicked(android.view.View view) {
    mListener.onFragmentInteraction("");
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    world.model.player.baseTraits.maxHP = 500;
    world.model.player.health.max = world.model.player.baseTraits.maxHP;
    controllerContext.actorStatsController.setActorMaxHealth(world.model.player);
    world.model.player.conditions.clear();
    showToast(mainActivity, "DEBUG: hp set to max", Toast.LENGTH_SHORT);
}

@com.mindorks.placeholderview.annotations.swipe.SwipingDirection
private void onSwipingDirection(com.mindorks.placeholderview.SwipeDirection direction) {
    android.util.Log.d(LOG_TAG, ("SwipingDirection " + (direction.name())));
}

public void submit(android.view.View v) {
    if (checkForm()) {
        android.widget.Toast.makeText(this, "Informaton saved to the database successfully.", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onScrollStateChanged(android.widget.AbsListView view, int scrollState) {
    android.util.Log.e("ListView", "onScrollStateChanged");
}

@java.lang.Override
public void loadingLoginPage(java.lang.String loginUrl) {
    final android.app.ActionBar ab = getActionBar();
    ab.setTitle(loginUrl);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((context) instanceof internetofeveryone.ioe.Downloads.DownloadsView) {
        ((internetofeveryone.ioe.Downloads.DownloadsView) (context)).onClickOpen(getItem(position));
    }else {
    }
}

public static java.lang.String getPublicPath(android.content.Context context, android.net.Uri uri) throws edu.mit.mobile.android.locast.data.NoPublicPath {
    return edu.mit.mobile.android.locast.data.MediaProvider.getPublicPath(context, uri, null, false);
}

private void initImageGetter() {
    mImageGetter = new com.heaven7.android.util2.ImageHelper(getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath(), this, new com.heaven7.android.util2.demo.sample.TestGetImageInN.ImageCallbackImpl()) {    };
}

@java.lang.Override
public void onItemClick(int position) {
    mAdapterNavigationCallback.onItemClick(position);
    com.pentapus.pentapusdmh.Fragments.EncounterPrep.ImageGridAdapter.selectedUri = android.net.Uri.parse(imageUris[position].toString());
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d("onDestroy", category);
    galleryPresenter.destroy();
    super.onDestroy();
}

public static de.dfki.iui.mmir.plugins.speech.nuance.NuanceEngine getInstance() {
    android.util.Log.d(de.dfki.iui.mmir.plugins.speech.nuance.NuanceEngine.PLUGIN_NAME, "getInstance called");
    return de.dfki.iui.mmir.plugins.speech.nuance.NuanceEngine.instance;
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    android.util.Log.i("TM tabEditorActWBtns", ("page finished loading " + url));
    createWebPrintJob(view);
    mWebView = null;
}

@java.lang.Override
public void onAttachedToRecyclerView(android.support.v7.widget.RecyclerView recyclerView) {
    super.onAttachedToRecyclerView(recyclerView);
    android.util.Log.d(getClass().getSimpleName(), "Attaching to recycler view");
    mLastSelectedViewHolder.mLastSelectedItem = mSharedPreferences.getLong(DEADLINES_LAST_SELECTED_ITEM_KEY, (-1));
}

public void updateScaleData(com.health.openscale.core.datatypes.ScaleData scaleData) {
    scaleDB.updateEntry(android.R.attr.id, scaleData);
    alarmHandler.entryChanged(context, scaleData);
    updateScaleData();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
}

@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    initLocation();
    updateLocation(false);
}

@java.lang.Override
public void finishUpdate(android.view.View container) {
    if ((fragmentTransaction) != null) {
        fragmentTransaction.commitAllowingStateLoss();
    }
    fragmentTransaction = null;
    fragmentManager.executePendingTransactions();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.main_preferences);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(R.string.settings_title);
}

public void logoutCurrentUser() {
    android.util.Log.e(org.ei.opensrp.view.activity.DrishtiApplication.TAG, "Child classes should implement this function");
}

@java.lang.Override
public void onImageSelected(android.net.Uri uri) {
    imagePreview(uri);
    android.widget.Toast.makeText(this, "length ", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    if (result != null)
        icon.setImageBitmap(result);
    else
        icon.setImageResource(R.drawable.icon);
    
}

public void setSlideOffset(int offset) {
    mSlideOffset = java.lang.Math.min(java.lang.Math.max(0, offset), mSlideMaxHeight);
    android.util.Log.d("Slide", ("mSlideOffset -> " + (mSlideOffset)));
    requestLayout();
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.lang.String> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(getActivity(), "An error occurred", Toast.LENGTH_SHORT).show();
    android.util.Log.d("TAG", java.lang.String.valueOf(t));
}

@java.lang.Override
public void modificarRuta(com.google.android.gms.maps.model.LatLng miPosicion) {
    controlador.obtenerRuta(this, ubicacion, miPosicion);
    cambiarFragmento(fragMapa, fragRincones, fragMisRincones, getString(R.string.fragmento_mapa));
}

public void setData(final T object) {
    itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            onItemViewClick(object);
        }
    });
}

@java.lang.Override
public void setSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelable(com.mycvapps.rav.vk1000.WallFragment.RECYCLER_STATE_TAG, mLayoutManager.onSaveInstanceState());
}

protected void addCursorRow(android.database.MatrixCursor cursor, jp.redmine.redmineclient.entity.IMasterRecord changes, int id, int title_id) {
    if (changes == null)
        return ;
    
    cursor.addRow(new java.lang.Object[]{ id , title_id , null , changes.getName() });
}

public void showAndLock(android.view.animation.Animation.AnimationListener listener) {
    if (!(mLogoEnabled)) {
        return ;
    }
    unlockAndShow(listener);
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_SHOW;
}

@java.lang.Override
public void onDestroyActionMode(android.support.v7.view.ActionMode mode) {
    enableSelectionMode(false);
    runSelection(false);
    allGpxAdapter.notifyDataSetChanged();
}

private void sendBroadcastWithPermission(android.content.Intent intent, java.lang.String receiverPermission) {
    java.util.List<org.robolectric.shadows.ShadowApplication.Wrapper> wrappers = getAppropriateWrappers(intent, receiverPermission);
    postToWrappers(wrappers, intent, receiverPermission);
}

public void backupOriginalImage() {
    android.util.Log.d("PuzzleAdapter", "Backuping...");
    bitmapOriginalImage = img.copy(Bitmap.Config.ARGB_8888, true);
    android.util.Log.d("PuzzleAdapter", "Backuping done");
}

@java.lang.Override
public void doFrame(long vsyncTimeNs) {
    sampledVsyncTimeNs = vsyncTimeNs;
    choreographer.postFrameCallbackDelayed(this, com.google.android.exoplayer2.video.VideoFrameReleaseTimeHelper.CHOREOGRAPHER_SAMPLE_DELAY_MILLIS);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
}

@dagger.Provides
android.app.ProgressDialog provideMainPresenter() {
    android.app.ProgressDialog dialog = new android.app.ProgressDialog(activity, android.app.ProgressDialog.STYLE_SPINNER);
    dialog.setCancelable(false);
    dialog.setCanceledOnTouchOutside(false);
    return dialog;
}

public void openDataBase() throws java.sql.SQLException {
    java.lang.String myPath = (dataBasePath) + (is.bjorfinnur.bjorfinnur.DataBaseManager.DB_NAME);
    myDataBase = android.database.sqlite.SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
}

public void handleMessage(android.os.Message msg) {
    mTime.setText(getTime());
    mScore.setText(getString(R.string.score, mScoreValue));
    mGameView.update();
}

public boolean isEmpty(android.widget.EditText string) {
    if ((string.getText().toString()) == "")
        return true;
    else
        return false;
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e("ApplicationScreen", "onClick");
    if ((com.almalence.opencam.ApplicationScreen.mApplicationStarted) && (com.almalence.opencam.ApplicationScreen.mCameraStarted))
        com.almalence.opencam.ApplicationScreen.getGUIManager().onClick(v);
    
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    de.jochen_manns.buyitv0.ListActivity.getMenuInflater().inflate(m_menu, menu);
    android.view.MenuItem newItem = menu.findItem(R.id.action_new);
    newItem.setTitle(R.string.action_new);
    return true;
}

public static void log(java.lang.String packageName, java.lang.String msg) {
    if (tw.fatminmin.xposed.minminguard.blocker.Util.pref.getBoolean((packageName + "_log"), false)) {
        de.robv.android.xposed.XposedBridge.log(msg);
        android.util.Log.d(tw.fatminmin.xposed.minminguard.blocker.Util.TAG, msg);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
    android.content.Intent intent = new android.content.Intent(this, com.mlabs.bbm.iquiz.On_Touch.class);
    startActivity(intent);
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    org.give2peer.give2peer.entity.Server newServer = new org.give2peer.give2peer.entity.Server().loadDummy();
    newServer.save();
    refreshView();
    return true;
}

private void initButtonRow() {
    mColor = getResources().getIntArray(R.array.pickerColors)[0];
    btnVibrate = ((android.widget.ToggleButton) (findViewById(R.id.btnToggleVibration)));
    btnColor = ((android.widget.ImageButton) (findViewById(R.id.btnPickColor)));
}

@java.lang.Override
public void done(java.util.List<reli.reliapp.co.il.reli.dataStructures.Discussion> li, com.parse.ParseException e) {
    dia.dismiss();
    ((android.widget.TextView) (bla.findViewById(textId))).setText(java.lang.Integer.toString(li.size()));
}

public void reading(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.binil.reading.quick_response_code.CaptureActivity.class);
    finish();
    startActivity(i);
}

public void tellJoke(android.view.View view) {
    android.widget.Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
    new com.shentuo.builditbigger.EndpointsAsyncTask().execute(new android.util.Pair<android.content.Context, java.lang.String>(this, "Testing from BuildItBigger"));
}

@java.lang.Override
public void onConnectionSuspended(int arg0) {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(Drive.API).addScope(Drive.SCOPE_FILE).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    mGoogleApiClient.connect();
}

@java.lang.Override
public void onTabReSelected(@android.support.annotation.IdRes
int tabId) {
    if (tabId == (id.contacts)) {
        android.content.Intent contactsIntent = new android.content.Intent(getApplicationContext(), com.example.user.kchat01.GroupsActivity.class);
        startActivity(contactsIntent);
    }
}

protected void checkLocationPermission() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION }, ch.kanti_baden.ma.ninemensmorrisapp.MainActivity.REQUEST_COARSE_LOCATION);
    }else
        mBluetoothAdapter.startDiscovery();
    
}

@java.lang.Override
public void evaluate() throws java.lang.Throwable {
    de.czyrux.store.toolbox.idlingresource.RxIdlingResource rxIdlingResource = new de.czyrux.store.toolbox.idlingresource.RxIdlingResource();
    android.support.test.espresso.Espresso.registerIdlingResources(rxIdlingResource);
    io.reactivex.plugins.RxJavaPlugins.setScheduleHandler(rxIdlingResource);
    base.evaluate();
    android.support.test.espresso.Espresso.unregisterIdlingResources(rxIdlingResource);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    HoursLeft = new java.lang.Long(0);
    MinutesLeft = new java.lang.Long(2);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_parcourt_choice, container, false);
    initFragment(v);
    return v;
}

@android.support.annotation.Nullable
public static java.lang.Long getLong(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Long defaultValue) {
    long start = java.lang.System.currentTimeMillis();
    return java.lang.Long.valueOf(com.pepperonas.aesprefs.AesPrefs.get(key, java.lang.String.valueOf(defaultValue)));
}

public void addUser(io.angelhack.verd.model.User user) {
    java.lang.String id = user.getId().toString();
    java.lang.String name = user.getName();
    android.graphics.Bitmap photo = user.getPhoto();
}

@java.lang.Override
public void nextStory(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.sweets.rumandapp.StageSelectActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)));
    startActivity(intent);
    this.finish();
}

private void finishTurn() {
    super.finishTurn(getNextParticipantId());
    mInstructionsTV.setText(R.string.games_waiting_for_other_player_turn);
    disableGui();
    android.util.Log.i(com.levigilad.javaplay.yaniv.YanivPlayFragment.TAG, "Turn Ended");
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    android.util.Log.i("Check", "onCompletion");
    divyang.musicapp_v6.BackgroundMediaService.mediaPlayer.stop();
    setMediaPlaybackState(PlaybackState.STATE_STOPPED);
    stopForeground(true);
    showPausedNotification();
}

@java.lang.Override
public void onUnlockUser(@android.annotation.UserIdInt
final int userHandle) {
    mService.mHandler.sendMessage(mService.mHandler.obtainMessage(com.android.server.InputMethodManagerService.MSG_SYSTEM_UNLOCK_USER, userHandle));
}

@java.lang.Override
public void handleResult(com.google.zxing.Result rawResult) {
    android.util.Log.d(br.usp.ime.mac5743.ep1.seminarioime.activity.ReadQRCodeActivity.TAG, rawResult.getText());
    android.util.Log.d(br.usp.ime.mac5743.ep1.seminarioime.activity.ReadQRCodeActivity.TAG, rawResult.getBarcodeFormat().toString());
    saveResult(rawResult.getText());
}

@java.lang.Override
public void loadUrl(final java.lang.String url, boolean clearNavigationStack, android.util.Map<java.lang.String, java.lang.String> headers) {
    webView.loadUrl(url, headers);
}

private void setMonth(int month) {
    android.widget.Spinner s = ((android.widget.Spinner) (findViewById(R.id.spnMonth)));
    s.setSelection(month);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.release();
    currentState = com.trojx.fangyan.activity.StoryActivity.STATUS_IDLE;
    ad.stop();
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if ((mNetworkService) != null) {
        waiters.put(msg.what, msg);
        mNetworkService.downloadImage(msg.what);
    }else {
        synchronized(msg) {
            msg.notify();
        }
    }
}

@java.lang.Override
public io.reactivex.ObservableSource<? extends java.lang.String> call() throws java.lang.Exception {
    android.os.SystemClock.sleep(500);
    return io.reactivex.Observable.just("test1", "test2", "test3");
}

@java.lang.Override
protected com.bitdubai.sub_app.intra_user_community.holders.AppNotificationsHolder createHolder(android.view.View itemView, int type) {
    return null;
}

