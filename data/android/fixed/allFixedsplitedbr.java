@java.lang.Override
protected void onPermissionGranted() {
    android.widget.Toast.makeText(getActivity(), "Permission Granted...", Toast.LENGTH_LONG).show();
}

public void onScanQRClick(android.view.View view) {
    mScannerView.setResultHandler(this);
    mScannerView.startCamera(0);
    showCameraDialog();
}

public void zoomOut(@android.support.annotation.NonNull
final android.opengl.GLSurfaceView view) {
    zoom(view, mIndex, ((VIEW_SIZE) / 2), _R, _R_NEAR, 0, FAR, null);
}

private static boolean verifyPermissions(int[] grantResults) {
    if ((grantResults.length) <= 0)
        return false;
    
    for (int grantResult : grantResults) {
        if (grantResult != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            return false;
        }
    }
    return true;
}

private void onUseretail(bhartiairtel.themehackathon.pojo.GetUserDetailsResponseBean result) {
    android.content.Intent in = new android.content.Intent(this, bhartiairtel.themehackathon.main.NavigationDrawerActivity.class);
    in.putExtra("result", result);
    startActivity(in);
    finish();
}

@java.lang.Override
public boolean canSwipeRefreshChildScrollUp() {
    return ((mRecyclerView) != null) && (android.support.v4.view.ViewCompat.canScrollVertically(mRecyclerView, (-1)));
}

@java.lang.Override
public void onPanelSlide(android.view.View panel, float slideOffset) {
    android.util.Log.i(com.pipit.waffle.TestFragmentNew.TAG, ("onPanelSlide, offset " + slideOffset));
    if (isExpanded) {
    }
}

@java.lang.Override
public void run() {
    ((android.widget.TextView) (findViewById(R.id.passingTime))).setText(java.lang.String.valueOf(seconds));
    (seconds)++;
    timerHandler.postDelayed(this, 1000);
}

private void checkNullSession() {
    android.content.SharedPreferences prefs = this.getSharedPreferences("Sessions", com.mobshep.shepherdlogin.MODE_PRIVATE);
    java.lang.String sessionId = prefs.getString("sessionId", null);
    if (sessionId == null) {
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent profileViewIntent = new android.content.Intent(getApplicationContext(), com.socialteinc.socialate.ViewOtherUserProfile.class);
    profileViewIntent.putExtra("entertainmentUploader", mEntertainmentUploader);
    startActivity(profileViewIntent);
}

@java.lang.Override
public void onSuccess() {
    android.widget.Toast.makeText(getApplicationContext(), "Password successfully changed", Toast.LENGTH_LONG).show();
    changePDialog.cancel();
    return ;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    super.onSaveInstanceState(bundle);
    bundle.putSerializable(aaku492.smartfoodtracker.inventory.AddEditItemFragment.ITEM, item);
}

protected static boolean isNightMode(android.content.Context context) {
    return false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            serversAdapter.removeItem(position);
            server.delete();
            break;
    }
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    isCount = false;
    setText(overtxt);
    setEnabled(true);
    onTimeListener.endTime();
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.example.luc.controlbluetooth.HomePage.ConnectedThread(com.example.luc.controlbluetooth.HomePage.btSocket).start();
}

private boolean archivePermissionsGranted(int[] permissionRequestResults) {
    return ((permissionRequestResults.length) > 0) && (this.archivePermissionsGranted(permissionRequestResults[0]));
}

public void onDestroy() {
    super.onDestroy();
}

@java.lang.Override
public void onLessonUnitPrepared(org.stepic.droid.model.Lesson lesson, @android.support.annotation.NonNull
org.stepic.droid.model.Unit unit, org.stepic.droid.model.Section section) {
    this.lesson = lesson;
    this.section = section;
    this.unit = unit;
    init(lesson);
}

public void setContext(android.content.Context context) {
    this.context = context;
}

@java.lang.Override
public void onLoadFinished(Loader<List<? extends org.oucho.mpdclient.mpd.item.Item>> loader, List<? extends org.oucho.mpdclient.mpd.item.Item> albumList) {
    mAdapter.setData(albumList);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
    communicator.welcomeMessageState(true);
}

@java.lang.Override
protected void onBeforeClusterRendered(com.google.maps.android.clustering.Cluster<com.iolab.sightlocator.SightMarkerItem> cluster, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    super.onBeforeClusterRendered(cluster, markerOptions);
}

public void glUniformMatrix3(int location, boolean transpose, java.nio.FloatBuffer value) {
    android.opengl.GLES20.glUniformMatrix3fv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, (3 * 3)), transpose, value);
}

@de.greenrobot.event.Subscribe
public void onGetProductDTOEvent(com.example.winify.cvsi.dto.ListDto<com.example.winify.cvsi.dto.templates.ProductTemplate> event) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((actionState) == (com.playposse.ghostphoto.PhotoFragment.ActionState.running)) {
        stopTakingPhotos();
    }else {
        startTakingPhotos();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onSelect(res, position, activePos);
    int tmp = activePos;
    activePos = position;
    notifyItemChanged(tmp);
    notifyItemChanged(position);
}

@retrofit2.http.GET(value = ((("services/rest/?" + ((("format=json" + "&nojsoncallback=1") + "&extras=url_s") + "&method=")) + (com.rpham64.android.photogallery.network.CoreApi.METHOD_FETCH_RECENTS)) + "&api_key=") + (com.rpham64.android.photogallery.network.CoreApi.API_KEY))
rx.Observable<com.rpham64.android.photogallery.network.response.FlickrResponse> getRecentPhotosRx(@retrofit2.http.Query(value = "page")
int page);

@java.lang.Override
public com.swerly.wifiheatmap.views.HeatmapDataViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(context).inflate(R.layout.card_heatmap, parent, false);
    com.swerly.wifiheatmap.views.HeatmapDataViewHolder heatmapDataViewHolder = new com.swerly.wifiheatmap.views.HeatmapDataViewHolder(listener, v);
    return heatmapDataViewHolder;
}

@java.lang.Override
public void onEnabled(android.content.Context context) {
    super.onEnabled(context);
    com.ppyy.ppweatherplus.utils.L.e("WeatherVerticalAppWidget onEnable");
    com.ppyy.ppweatherplus.service.AppWidgetService.sShouldStopService = false;
    com.ppyy.ppweatherplus.service.AppWidgetService.sUpdateAppWidget = true;
    com.xdandroid.hellodaemon.DaemonEnv.startServiceMayBind(com.ppyy.ppweatherplus.service.AppWidgetService.class);
}

public int getTcpServerPort() {
    return java.lang.Integer.parseInt(prefs.getString(org.droidplanner.android.utils.prefs.DroidPlannerPrefs.PREF_TCP_SERVER_PORT, org.droidplanner.android.utils.prefs.DroidPlannerPrefs.DEFAULT_TCP_SERVER_PORT).trim());
}

public static edu.rosehulman.lix4.petlf.fragments.AccountFragment newInstance(edu.rosehulman.lix4.petlf.models.User currentUser) {
    edu.rosehulman.lix4.petlf.fragments.AccountFragment fragment = new edu.rosehulman.lix4.petlf.fragments.AccountFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.setArguments(args);
    return fragment;
}

@android.support.annotation.NonNull
public com.tonyodev.fetch.request.Request addHeader(@android.support.annotation.NonNull
java.lang.String header, @android.support.annotation.Nullable
java.lang.String value) {
    return addHeader(new com.tonyodev.fetch.request.Header(header, value));
}

public void clearArchives(android.view.View view) {
    mArchiveLayout.removeAllViews();
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    new net.mpross.pws.MainActivity.datagrab().execute("");
}

public static <T> de.chefkoch.raclette.android.support.CompositionMultiViewBindingAdapter.ViewTypeBuilder<T> builder(de.chefkoch.raclette.android.support.ItemViewTypeMapping<T> itemViewTypeMapping) {
    return new de.chefkoch.raclette.android.support.CompositionMultiViewBindingAdapter.Builder(itemViewTypeMapping);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent i = new android.content.Intent(getActivity(), com.sanchez.geoopposite.OtherLocationActivity.class);
    startActivity(i);
}

@java.lang.Override
protected void loadMoreItems() {
    isLoading = true;
    (mCurrentPage)++;
    loadNextPage();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((mView) == null) {
        mView = inflater.inflate(R.layout.fragment_search, container, false);
    }
    return mView;
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = super.onCreateView(inflater, container, savedInstanceState);
    com.github.stakkato95.sprint3.event.EventBus.register(getActivity(), EventBus.EVENT_FILTER_SELECTED, mReceiver);
    return view;
}

public void onClickDownloadFavorite(java.lang.String name) {
    presenter.onDownloadClickedFavorite(name);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mainActivity.onClickItem(getAdapterPosition());
    selectedItem = getAdapterPosition();
    notifyDataSetChanged();
}

private void saveUserFilter() {
    android.content.SharedPreferences.Editor editor = getPreferences().edit();
    settings.writeToPreferences(editor);
    editor.apply();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.lasergiraffe.rideshare.util.SignUp.class);
    startActivity(i);
}

public void imageReceived(int requestId);

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    int itemPosition = position;
    java.lang.String itemValue = scanList.getItemAtPosition(position).toString();
}

public static void setTypo(int p_type, android.widget.Button p_button) {
    p_button.getPaint().setAntiAlias(true);
}

protected synchronized void buildGoogleApiClient() {
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getContext()).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(getString(R.string.pref_key))) {
        getSupportLoaderManager().restartLoader(org.sluman.movies.MovieListActivity.MOVIE_LOADER, null, this);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.sargent.mark.todolist.AddToDoFragment frag = new com.sargent.mark.todolist.AddToDoFragment();
    frag.show(fm, "addtodofragment");
}

@java.lang.Override
public void onLoaderReset(android.content.Loader<android.database.Cursor> loader) {
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    performTimerAction(((com.romanpulov.symphonytimer.DMTimerRec) (parent.getItemAtPosition(position))));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_sheet);
    butterknife.ButterKnife.bind(this);
    initializeContentView();
    initializeBottomSheet();
}

@java.lang.Override
public void onClickSwitch(boolean switchToPanel) {
    if (switchToPanel) {
        mEmotionsEditText.clearFocus();
    }else {
        mEmotionsEditText.requestFocus();
    }
}

public static org.wordpress.android.ui.accounts.SignInDialogFragment newInstance(java.lang.String title, java.lang.String message, int imageSource, java.lang.String buttonLabel) {
    return org.wordpress.android.ui.accounts.SignInDialogFragment.newInstance(title, message, imageSource, 1, buttonLabel, "", "", 0, 0, "", "");
}

@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return view == object;
}

@android.support.annotation.Nullable
@java.lang.Override
@android.support.annotation.CallSuper
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    final android.view.View fragmentView = inflater.inflate(getLayoutResource(), container);
    return fragmentView;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), android.trikarya.sales_hisamitsu.DetailOutlet.class);
    intent.putExtra("kd_outlet", currentOutlet.getKode());
    startActivity(intent);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
}

@java.lang.Override
public void post(final java.lang.Object event) {
    synchronized(me.sniggle.android.utils.otto.ActivatorBus.LOCK) {
        post(event, active);
    }
}

private int getRadius(android.graphics.Rect rect) {
    return ((rect.right) - (rect.left)) / 2;
}

private void broadcastNumSteps() {
    android.content.Intent intent = new android.content.Intent(org.smcnus.irace_gaittester.Service.GaitAnalyzer.MSG_NUM_STEPS);
    intent.putExtra(org.smcnus.irace_gaittester.Service.GaitAnalyzer.MSG_NUM_STEPS, numSteps);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    android.util.Log.d(org.smcnus.irace_gaittester.Service.GaitAnalyzer.TAG, "found a step");
}

void onError(java.lang.Exception exception) {
    if ((handler) == null) {
        handleError(exception);
    }else {
        sendMessage(handler.obtainMessage(FileDownloadStatus.error, exception));
    }
}

public void thirdChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 3) {
        updateScore(true);
    }
    timer.cancel();
    newMove();
}

@java.lang.Override
public boolean isRunning() {
    return (com.github.ybq.android.spinkit.animation.AnimationUtils.isRunning(sprites)) || (super.isRunning());
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mCrime.setSolved(isChecked);
}

public int getRandomColor() {
    return android.graphics.Color.argb(255, 255, 0, 0);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    progressDialog.setMessage("Loading dates from yahoo...");
    progressDialog.setCancelable(false);
    progressDialog.show();
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    return (isSlide) || (super.onInterceptTouchEvent(ev));
}

public void clearPins(android.view.View view) {
    Car = null;
    mMap.clear();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    if ((searchView) != null)
        savedInstanceState.putString(Constants.SavedInstanceState.Characters.LAST_ITEM_SEARCHED, java.lang.String.valueOf(searchView.getQuery()));
    
    super.onSaveInstanceState(savedInstanceState);
}

public int getPoiColorById(int id) {
    return android.graphics.Color.parseColor(CColor.POI_CIRCLES.get(id));
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    unbindService(mServiceConnection);
    com.example.sdp11.wmd.MainActivity.mBluetoothLEService = null;
    unregisterReceiver(mGattUpdateReceiver);
}

@java.lang.Override
public void onClick(android.view.View p1) {
    dialog.dismiss();
}

@java.lang.Override
public void onLoadFinished(Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    adapter.swapCursor(cursor);
    adapter.notifyDataSetChanged();
}

@java.lang.Override
protected void onResume() {
    android.util.Log.v("here", "resuming");
    super.onResume();
    new com.jumboeats.kate.jumboeats.MainActivity.GetData().execute();
}

protected synchronized void buildGoogleApiClient() {
    if ((mGoogleApiClient) == null) {
        mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
    }
}

public void deleteFavoites(java.lang.String id) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(com.projects.nosleepproject.data.ListingDbHelper.TABLE_NAME_FAVORITES, ((com.projects.nosleepproject.data.ListingDbHelper.COLUMN_ID) + "=?"), new java.lang.String[]{ id });
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    showUpdateFragment(participationArrayList.toArray(new soccer.gruppe5.at.soccerappapi.Data.Participation[participationArrayList.size()])[(i - 1)]);
    return false;
}

private void addMarkersToMap(com.paranoidandroid.journey.models.Journey journey) {
    getMapViewFragment().addMarkersFromLegs(journey.getLegs(), 0);
}

@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONObject jsonObject) {
    android.content.Intent intent = new android.content.Intent(this, com.codepath.apps.twitterzzz.activities.TimelineActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onAdClosed() {
    requestNewInterstitial();
    listeJoueurs.clearAllPlayers();
}

protected void talk(java.lang.String aString) {
    android.util.Log.e(((getName()) + ": "), aString);
}

public void setClockAndDateWidth(int width, int mode) {
    mClockAndDateWidth = width;
}

@java.lang.Override
public void run() {
}

@java.lang.Override
public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
    super.onSurfaceChanged(gl, width, height);
    mRender.onSurfaceChanged(gl, width, height);
    android.opengl.GLES20.glViewport(0, 0, width, height);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_questao, container, false);
    butterknife.ButterKnife.bind(this, view);
    montarQuestao();
    return view;
}

public void changeState(com.nusclimb.live.crimp.hello.scan.ScanFragment.State state) {
    mState = state;
    updateUI();
    doWork();
}

public void selectRecipeAtPosition(int position) {
    com.groupd.cookbook.objects.Recipe selected = RADP.getItem(position);
    name = selected.getName();
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent event) {
    return true;
}

public static app.utils.DataCalculator getIntance(android.database.sqlite.SQLiteDatabase db) {
    if ((app.utils.DataCalculator.instance) == null) {
        app.utils.DataCalculator.instance = new app.utils.DataCalculator(db);
    }
    return app.utils.DataCalculator.instance;
}

@java.lang.Override
public com.mynanodegreeapps.bakingapp.widget.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
    return new com.mynanodegreeapps.bakingapp.widget.BakingAppRemoteViewFactory(this.getApplicationContext());
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    seekTo(currentTime);
    updateSeekbar();
}

@java.lang.Override
public java.lang.Boolean apply(com.quran.labs.androidquran.model.bookmark.RecentPageModel.PersistRecentPagesRequest update) throws java.lang.Exception {
    if ((update.deleteRangeStart) != null) {
        bookmarksDBAdapter.replaceRecentRangeWithPage(update.deleteRangeStart, update.deleteRangeEnd, update.page);
    }else {
        bookmarksDBAdapter.addRecentPage(update.page);
    }
    return true;
}

void save(android.content.Context context) {
    ca.rmen.android.poetassistant.main.reader.PoemFile savedPoem = mPoemPrefs.getSavedPoem();
    ca.rmen.android.poetassistant.main.reader.PoemFile.save(context, savedPoem.uri, poem.get(), mPoemFileCallback);
}

void initToolbar() {
    android.support.v7.app.ActionBar ab = getSupportActionBar();
    if (ab != null) {
        ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayShowTitleEnabled(false);
        ab.setLogo(R.drawable.gwlogo);
    }
}

@java.lang.Override
protected void onStart() {
    broadcastReceiver = new com.kiwi.flickrbatchdownload.photodetail.PhotoDetailAsyncTaskLoaderActivity.DownloadBroadcastReceiver();
    android.util.Log.d("Jane", "register Receiver");
    registerReceiver(broadcastReceiver, new android.content.IntentFilter(com.kiwi.flickrbatchdownload.download.DownloadService.IMAGE_TASKINFO_SENDBACK_ACTION));
    super.onStart();
}

@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.v("2", "onStop");
    if (!(mRegisterReceiver)) {
        android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mReceiver);
        mRegisterReceiver = true;
    }
}

private static native void naRenderAFrame(android.graphics.Bitmap _bitmap, int _width, int _height, float _roiSh, float _roiSw, float _roiEh, float _roiEw);

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            helper.deleteSchedule(db, actName, hour, day, month, year);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}

