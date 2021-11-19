@java.lang.Override
protected void onPermissionGranted() {
    android.widget.Toast.makeText(mActivity, "Permission Granted...", Toast.LENGTH_LONG).show();
}

public void onScanQRClick(android.view.View view) {
    mScannerView.setResultHandler(this);
    mScannerView.startCamera(0);
    cameraDialog = showCameraDialog();
}

public void zoomOut(@android.support.annotation.NonNull
final android.opengl.GLSurfaceView view) {
    zoom(view, mIndex, ((VIEW_SIZE) / 2), _R, _R_NEAR, 0, FAR);
}

private static boolean verifyPermissions(int[] grantResults) {
    for (int grantResult : grantResults) {
        if (grantResult != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            return false;
        }
    }
    return true;
}

private void onUseretail(bhartiairtel.themehackathon.pojo.GetUserDetailsResponseBean result) {
    android.content.Intent in = new android.content.Intent();
    in.putExtra("result", result);
    startActivity(new android.content.Intent(this, bhartiairtel.themehackathon.main.NavigationDrawerActivity.class));
    finish();
}

@java.lang.Override
public boolean canSwipeRefreshChildScrollUp() {
    if ((mRecyclerView) != null)
        return android.support.v4.view.ViewCompat.canScrollVertically(mRecyclerView, (-1));
    
    return false;
}

@java.lang.Override
public void onPanelSlide(android.view.View panel, float slideOffset) {
    android.util.Log.i(com.pipit.waffle.TestFragmentNew.TAG, ("onPanelSlide, offset " + slideOffset));
    if (isExpanded) {
        mLayout.setDragView(entire_drag_view);
        isExpanded = false;
    }
}

@java.lang.Override
public void run() {
    (seconds)++;
    ((android.widget.TextView) (findViewById(R.id.passingTime))).setText(java.lang.String.valueOf(seconds));
    timerHandler.postDelayed(this, 1000);
}

private void checkNullSession() {
    android.content.SharedPreferences prefs = this.getSharedPreferences("Sessions", com.mobshep.shepherdlogin.MODE_PRIVATE);
    java.lang.String sessionId = prefs.getString("sessionId", null);
    if (sessionId == null) {
        this.finishActivity(0);
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent profileViewIntent = new android.content.Intent(getApplicationContext(), com.socialteinc.socialate.ViewOtherUserProfile.class);
    profileViewIntent.putExtra("entertainmentUploader", mEntertainmentUploader);
    profileViewIntent.putExtra("entertainmentKey", mEntertainmentKey);
    startActivity(profileViewIntent);
}

@java.lang.Override
public void onSuccess() {
    android.widget.Toast.makeText(getApplicationContext(), "Password successfully changed", Toast.LENGTH_LONG).show();
    changePDialog.cancel();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    bundle.putSerializable(aaku492.smartfoodtracker.inventory.AddEditItemFragment.ITEM, item);
}

protected static boolean isNightMode(android.content.Context context) {
    int currentNightMode = (context.getResources().getConfiguration().uiMode) & (android.content.res.Configuration.UI_MODE_NIGHT_MASK);
    return currentNightMode == (android.content.res.Configuration.UI_MODE_NIGHT_YES);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            treehou.se.habit.core.Server server = serversAdapter.getItem(position);
            serversAdapter.removeItem(position);
            server.delete();
            break;
    }
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    isCount = false;
    setText(overtxt);
    onTimeListener.endTime();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.example.luc.controlbluetooth.HomePage.btSocket) == null) {
        makeToast("还未连接到蓝牙或者连接蓝牙失败");
    }
    com.example.luc.controlbluetooth.HomePage.ConnectedThread connectedThread = new com.example.luc.controlbluetooth.HomePage.ConnectedThread(com.example.luc.controlbluetooth.HomePage.btSocket);
    connectedThread.start();
}

private boolean archivePermissionsGranted(int[] permissionRequestResults) {
    return ((permissionRequestResults.length) > 0) && ((permissionRequestResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED));
}

public void onDestroy() {
    android.widget.Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    super.onDestroy();
}

@java.lang.Override
public void onLessonUnitPrepared(org.stepic.droid.model.Lesson lesson, @android.support.annotation.NonNull
org.stepic.droid.model.Unit unit, org.stepic.droid.model.Section section) {
    init(lesson, unit, section);
}

public void setContext(android.content.Context context) {
    org.wso2.mdm.agent.proxy.IdentityProxy.context = context;
}

@java.lang.Override
public void onLoadFinished(Loader<List<? extends org.oucho.mpdclient.mpd.item.Item>> loader, List<? extends org.oucho.mpdclient.mpd.item.Item> albumList) {
    android.util.Log.i(org.oucho.mpdclient.fragments.AlbumSongsFragment.TAG, ("onLoadFinished " + albumList));
    mAdapter.setData(albumList);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
    communicator.welcomeMessageState(false);
}

@java.lang.Override
protected void onBeforeClusterRendered(com.google.maps.android.clustering.Cluster<com.iolab.sightlocator.SightMarkerItem> cluster, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    android.util.Log.d("MyLogs", ("onBeforeClusterItemRendered, " + (cluster.getSize())));
    super.onBeforeClusterRendered(cluster, markerOptions);
}

public void glUniformMatrix3(int location, boolean transpose, java.nio.FloatBuffer value) {
    com.jme3.renderer.android.AndroidGL.checkPosition(value);
    android.opengl.GLES20.glUniformMatrix3fv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, (3 * 3)), transpose, value);
}

@de.greenrobot.event.Subscribe
public void onGetProductDTOEvent(com.example.winify.cvsi.dto.ListDto<com.example.winify.cvsi.dto.templates.ProductTemplate> event) {
    android.widget.Toast.makeText(this, ("ceva" + (event.getList().get(0).getTitle())), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((actionState) == (com.playposse.ghostphoto.PhotoFragment.ActionState.running)) {
        stopTakingPhotos();
        actionState = com.playposse.ghostphoto.PhotoFragment.ActionState.stopped;
    }else {
        startTakingPhotos();
        actionState = com.playposse.ghostphoto.PhotoFragment.ActionState.running;
    }
    refreshActionButton();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onSelect(res, position);
    int tmp = activePos;
    activePos = position;
    notifyItemChanged(tmp);
    notifyItemChanged(position);
}

@retrofit2.http.GET(value = "services/rest/?format=json&nojsoncallback=1&extras=url_s")
rx.Observable<com.rpham64.android.photogallery.network.response.FlickrResponse> getRecentPhotosRx(@retrofit2.http.Query(value = "page")
int page, @retrofit2.http.Query(value = "method")
java.lang.String method, @retrofit2.http.Query(value = "api_key")
java.lang.String key);

@java.lang.Override
public com.swerly.wifiheatmap.views.HeatmapDataViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.card_heatmap, parent, false);
    com.swerly.wifiheatmap.views.HeatmapDataViewHolder heatmapDataViewHolder = new com.swerly.wifiheatmap.views.HeatmapDataViewHolder(listener, v);
    return heatmapDataViewHolder;
}

@java.lang.Override
public void onEnabled(android.content.Context context) {
    super.onEnabled(context);
    com.ppyy.ppweatherplus.appwidgets.WeatherVerticalAppWidget.sAppWidgetAvailable = true;
    com.ppyy.ppweatherplus.utils.L.e("WeatherVerticalAppWidget onEnable");
    com.ppyy.ppweatherplus.service.AppWidgetService.sShouldStopService = false;
    com.ppyy.ppweatherplus.service.AppWidgetService.sUpdateAppWidget = true;
    com.xdandroid.hellodaemon.DaemonEnv.startServiceMayBind(com.ppyy.ppweatherplus.service.AppWidgetService.class);
}

public int getTcpServerPort() {
    return java.lang.Integer.parseInt(prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_TCP_SERVER_PORT, org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_TCP_SERVER_PORT));
}

public static edu.rosehulman.lix4.petlf.fragments.AccountFragment newInstance(edu.rosehulman.lix4.petlf.models.User currentUser) {
    edu.rosehulman.lix4.petlf.fragments.AccountFragment fragment = new edu.rosehulman.lix4.petlf.fragments.AccountFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable(edu.rosehulman.lix4.petlf.fragments.AccountFragment.ARG_USER, currentUser);
    fragment.setArguments(args);
    return fragment;
}

@android.support.annotation.NonNull
public com.tonyodev.fetch.request.Request addHeader(@android.support.annotation.NonNull
java.lang.String header, @android.support.annotation.Nullable
java.lang.String value) {
    headers.add(new com.tonyodev.fetch.request.Header(header, value));
    return this;
}

public void clearArchives(android.view.View view) {
    MainActivity.mArchives.edit().clear().apply();
    mArchiveLayout.removeAllViews();
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    new net.mpross.pws.MainActivity.datagrab().execute("");
    super.onConfigurationChanged(newConfig);
}

public static <T> de.chefkoch.raclette.android.support.CompositionMultiViewBindingAdapter.ViewTypeBuilder<T> builder(de.chefkoch.raclette.android.support.ItemViewTypeMapping<T> itemViewTypeMapping) {
    return new de.chefkoch.raclette.android.support.CompositionMultiViewBindingAdapter.Builder<T>();
}

@java.lang.Override
public void onClick(android.view.View view) {
    otherLocationButton.setEnabled(false);
    android.content.Intent i = new android.content.Intent(getActivity(), com.sanchez.geoopposite.OtherLocationActivity.class);
    startActivity(i);
}

@java.lang.Override
protected void loadMoreItems() {
    isLoading = true;
    (mCurrentPage)++;
    android.widget.Toast.makeText(getActivity(), "loading next page", Toast.LENGTH_LONG).show();
    loadNextPage();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mView = inflater.inflate(R.layout.fragment_search, container, false);
    return mView;
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    com.github.stakkato95.sprint3.event.EventBus.register(getActivity(), EventBus.EVENT_FILTER_SELECTED, mReceiver);
    return super.onCreateView(inflater, container, savedInstanceState);
}

public void onClickDownloadFavorite(java.lang.String name) {
    android.widget.Toast.makeText(this, "Your Website has been downloaded", Toast.LENGTH_SHORT);
    presenter.onDownloadClickedFavorite(name);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mainActivity.onClickItem(view, getAdapterPosition());
    selectedItem = getAdapterPosition();
    notifyDataSetChanged();
}

private void saveUserFilter() {
    android.content.SharedPreferences preferences = getActivity().getPreferences(Activity.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = preferences.edit();
    settings.writeToPreferences(editor);
    editor.apply();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.lasergiraffe.rideshare.util.SignUp.class);
    startActivity(i);
    finish();
}

public void imageReceived(android.graphics.Bitmap bitamp, int requestId);

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    int itemPosition = position;
    java.lang.String itemValue = ((java.lang.String) (scanList.getItemAtPosition(position)));
}

public static void setTypo(int p_type, android.widget.Button p_button) {
    p_button.setTypeface(bimedia.c2is.com.com.Typo.getTypoFromType(p_type));
    p_button.getPaint().setAntiAlias(true);
}

protected synchronized void buildGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getContext()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    mGoogleApiClient.connect();
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(getString(R.string.pref_key))) {
        org.sluman.movies.sync.MoviesSyncAdapter.syncImmediately(this);
        getSupportLoaderManager().restartLoader(org.sluman.movies.MovieListActivity.MOVIE_LOADER, null, this);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    setContentView(R.layout.item);
    com.sargent.mark.todolist.AddToDoFragment frag = new com.sargent.mark.todolist.AddToDoFragment();
    frag.show(fm, "addtodofragment");
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
    mNameEditText.setText("");
    mBreedEditText.setText("");
    mWeightEditText.setText("");
    mGenderSpinner.setSelection(0);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.d("SymphonyArrayAdapter", "ItemClick");
    performTimerAction(((com.romanpulov.symphonytimer.DMTimerRec) (parent.getItemAtPosition(position))));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_sheet);
    butterknife.ButterKnife.bind(this);
    setUpToolbar();
    initializeContentView();
    initializeBottomSheet();
}

@java.lang.Override
public void onClickSwitch(boolean switchToPanel) {
    android.widget.Toast.makeText(this, ("" + switchToPanel), Toast.LENGTH_SHORT).show();
    if (switchToPanel) {
        mEmotionsEditText.clearFocus();
    }else {
        mEmotionsEditText.requestFocus();
    }
}

public static org.wordpress.android.ui.accounts.SignInDialogFragment newInstance(java.lang.String title, java.lang.String message, int imageSource, java.lang.String buttonLabel) {
    return org.wordpress.android.ui.accounts.SignInDialogFragment.newInstance(title, message, imageSource, 1, buttonLabel, "", "", 0, 0, 0, "", "");
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return false;
}

@android.support.annotation.Nullable
@java.lang.Override
@android.support.annotation.CallSuper
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    final android.view.View fragmentView = inflater.inflate(getLayoutResource(), container);
    butterknife.ButterKnife.bind(fragmentView);
    return fragmentView;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), android.trikarya.sales_hisamitsu.DetailOutlet.class);
    intent.putExtra("kd_outlet", currentOutlet.getKode());
    startActivity(intent);
    this.finish();
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((s.length()) > (len)) {
        setSelection(len);
    }else {
        setSelection(s.length());
    }
}

@java.lang.Override
public void post(final java.lang.Object event) {
    synchronized(me.sniggle.android.utils.otto.ActivatorBus.LOCK) {
        if (active) {
            postEvent(event);
        }else {
            eventCache.add(event);
        }
    }
}

public int getRadius(android.graphics.Rect rect) {
    return ((rect.right) - (rect.left)) / 2;
}

private void broadcastNumSteps() {
    android.content.Intent intent = new android.content.Intent(org.smcnus.irace_gaittester.Service.GaitAnalyzer.MSG_NUM_STEPS);
    intent.putExtra(org.smcnus.irace_gaittester.Service.GaitAnalyzer.MSG_NUM_STEPS, numSteps);
    android.util.Log.d(org.smcnus.irace_gaittester.Service.GaitAnalyzer.TAG, "found a step");
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}

void onError(java.lang.Exception exception) {
    if ((handler) == null) {
        handleError(exception);
    }else {
        final android.os.Message message = handler.obtainMessage(FileDownloadStatus.error, exception);
        handler.sendMessage(message);
    }
}

public void thirdChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 3) {
        updateScore();
    }
    timer.cancel();
    newMove();
}

@java.lang.Override
public boolean isRunning() {
    return (com.github.ybq.android.spinkit.animation.AnimationUtils.isRunning(sprites)) || (com.github.ybq.android.spinkit.animation.AnimationUtils.isRunning(getAnimation()));
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mCrime.setSolved(isChecked);
    mListener.onModelChangedCallback(mCrime.getId().toString());
    returnResult();
}

public int getRandomColor() {
    return android.graphics.Color.argb(255, 0, 0, 255);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.e("Test", "Start");
    progressDialog.setMessage("Loading dates from yahoo...");
    progressDialog.setCancelable(false);
    progressDialog.show();
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    if (isSlide) {
        return true;
    }else {
        return super.onInterceptTouchEvent(ev);
    }
}

public void clearPins(android.view.View view) {
    Car = null;
    Person = null;
    mMap.clear();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    savedInstanceState.putString(Constants.SavedInstanceState.Characters.LAST_ITEM_SEARCHED, java.lang.String.valueOf(searchView.getQuery()));
    super.onSaveInstanceState(savedInstanceState);
}

private int getPoiColorById(int id) {
    return android.graphics.Color.parseColor(CColor.POI_CIRCLES.get(id));
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.e(com.example.sdp11.wmd.MainActivity.TAG, "onDestroy");
    unbindService(mServiceConnection);
    com.example.sdp11.wmd.MainActivity.mBluetoothLEService = null;
    unregisterReceiver(mGattUpdateReceiver);
}

@java.lang.Override
public void onClick(android.view.View p1) {
    switch (Listener) {
        case "update" :
            dialog.dismiss();
            break;
        default :
            finish();
            break;
    }
}

@java.lang.Override
public void onLoadFinished(Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
    } 
    adapter.swapCursor(cursor);
    adapter.notifyDataSetChanged();
}

@java.lang.Override
protected void onResume() {
    android.util.Log.v("here", "resuming");
    super.onResume();
    new com.jumboeats.kate.jumboeats.MainActivity.GetData(getApplicationContext()).execute();
}

protected synchronized void buildGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    mGoogleApiClient.connect();
}

public void deleteFavoites(java.lang.String id) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.util.Log.e("deletefav", id);
    db.delete(com.projects.nosleepproject.data.ListingDbHelper.TABLE_NAME_FAVORITES, ((com.projects.nosleepproject.data.ListingDbHelper.COLUMN_ID) + "=?"), new java.lang.String[]{ id });
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    showUpdateFragment(participationArrayList.toArray(new soccer.gruppe5.at.soccerappapi.Data.Participation[participationArrayList.size()])[i]);
    return false;
}

private void addMarkersToMap(com.paranoidandroid.journey.models.Journey journey) {
    getMapViewFragment().addMarkersFromLegs(journey.getLegs());
}

@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONObject jsonObject) {
    android.content.Intent intent = new android.content.Intent(this, com.codepath.apps.twitterzzz.activities.TimelineActivity.class);
    intent.putExtra("newTweet", newTweetContent);
    startActivity(intent);
}

@java.lang.Override
public void onAdClosed() {
    requestNewInterstitial();
    android.content.Intent intentStart = new android.content.Intent(getApplicationContext(), hantizlabs.jeuduroi.StartActivity.class);
    listeJoueurs.clearAllPlayers();
    startActivity(intentStart);
}

public void talk(java.lang.String aString) {
    android.util.Log.e(((getName()) + ": "), aString);
}

public void setClockAndDateWidth(int width, int mode) {
    mClockAndDateWidth = width;
    mCenterClock = (mode == (com.android.systemui.statusbar.policy.Clock.STYLE_CLOCK_CENTER)) && (enabled);
}

@java.lang.Override
public void run() {
    if (org.owntracks.android.support.Preferences.getEnableWidget())
        org.owntracks.android.services.ServiceProxy.getServiceApplication().requestWaypoints(c);
    
}

@java.lang.Override
public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
    mRender.setViewSize(width, height);
    android.opengl.GLES20.glViewport(0, 0, width, height);
    super.onSurfaceChanged(gl, width, height);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_questao, container, false);
    butterknife.ButterKnife.bind(this, view);
    montarQuestao();
    adicionaCorAoRating();
    return view;
}

public void changeState(com.nusclimb.live.crimp.hello.scan.ScanFragment.State state) {
    if (DEBUG)
        android.util.Log.d(TAG, ((("Change state: " + (mState)) + " -> ") + state));
    
    mState = state;
    updateUI();
    doWork();
}

public void selectRecipeAtPosition(int position) {
    com.groupd.cookbook.objects.Recipe selected = RADP.getItem(position);
    android.widget.EditText editName = ((android.widget.EditText) (findViewById(R.id.recyTitle)));
    name = selected.getName();
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent event) {
    android.util.Log.d(com.vitaminbacon.lockscreendialer.LockScreenActivity.MyGestureListener.TAG, ("onDown is " + (event.getY())));
    return true;
}

public static app.utils.DataCalculator getIntance(android.database.sqlite.SQLiteDatabase db) {
    if ((app.utils.DataCalculator.instance) == null) {
        return new app.utils.DataCalculator(db);
    }
    return app.utils.DataCalculator.instance;
}

@java.lang.Override
public com.mynanodegreeapps.bakingapp.widget.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
    java.lang.System.out.println("--> onGetViewFactory ");
    return new com.mynanodegreeapps.bakingapp.widget.BakingAppRemoteViewFactory(this.getApplicationContext());
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((currentTime) == (song.getSongDuration())) {
    }else {
        seekTo(currentTime);
    }
    updateSeekbar();
}

@java.lang.Override
public java.lang.Void apply(com.quran.labs.androidquran.model.bookmark.RecentPageModel.PersistRecentPagesRequest update) throws java.lang.Exception {
    if ((update.deleteRangeStart) != null) {
        bookmarksDBAdapter.replaceRecentRangeWithPage(update.deleteRangeStart, update.deleteRangeEnd, update.page);
    }else {
        bookmarksDBAdapter.addRecentPage(update.page);
    }
    return null;
}

void save(android.content.Context context) {
    ca.rmen.android.poetassistant.main.reader.PoemFile savedPoem = mPoemPrefs.getSavedPoem();
    ca.rmen.android.poetassistant.main.reader.PoemFile.save(context, savedPoem.uri, poem.get().toString(), mPoemFileCallback);
}

void initToolbar() {
    android.support.v7.app.ActionBar ab = getSupportActionBar();
    ab.setDisplayShowHomeEnabled(true);
    ab.setDisplayShowTitleEnabled(false);
    ab.setLogo(R.drawable.gwlogo);
}

@java.lang.Override
protected void onStart() {
    broadcastReceiver = new com.kiwi.flickrbatchdownload.photodetail.PhotoDetailAsyncTaskLoaderActivity.DownloadBroadcastReceiver();
    android.util.Log.d("Jane", "register Receiver");
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new android.content.IntentFilter(com.kiwi.flickrbatchdownload.download.DownloadService.IMAGE_TASKINFO_SENDBACK_ACTION));
    super.onStart();
}

@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.v("2", "onStop");
    if (!(mRegisterReceiver)) {
        android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mReceiver);
    }
}

private static native void naRenderAFrame(android.graphics.Bitmap _bitmap, int _zoomLevelUpdate, int _width, int _height, float _roiSh, float _roiSw, float _roiEh, float _roiEw);

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            helper.deleteSchedule(db, actName, hour, day, month, year);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
    showSchedule();
}

