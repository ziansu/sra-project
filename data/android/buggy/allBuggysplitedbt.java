@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    super.onSaveInstanceState();
    if ((mRecyclerView) != null) {
        return mRecyclerView.getLayoutManager().onSaveInstanceState();
    }
    return null;
}

@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    if (activity instanceof com.example.alex.motoproject.screenMain.MainActivity) {
        mMainActivityVisible = true;
        android.widget.Toast.makeText(this, "Started", Toast.LENGTH_SHORT).show();
    }
}

public final android.content.res.Resources.Theme newTheme() {
    android.content.res.Resources.Theme theme = new android.content.res.Resources.Theme();
    theme.setImpl(mResourcesImpl.newThemeImpl());
    mThemeRefs.add(new java.lang.ref.WeakReference<>(theme));
    return theme;
}

public android.database.Cursor swapCursor(android.database.Cursor cursor) {
    if ((mCursor) == cursor)
        return null;
    
    android.database.Cursor tempCursor = mCursor;
    mCursor = cursor;
    if (cursor != null)
        this.notifyDataSetChanged();
    
    return tempCursor;
}

private void showDocument(@android.support.annotation.NonNull
android.net.Uri documentUri, @android.support.annotation.NonNull
final com.pspdfkit.configuration.activity.PdfActivityConfiguration configuration, @android.support.annotation.Nullable
final java.lang.String password, @android.support.annotation.NonNull
final org.apache.cordova.CallbackContext callbackContext) {
    showDocumentForUri(documentUri, configuration, password);
    callbackContext.success();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.net.Uri uri = null;
    uri = android.net.Uri.fromFile(photo[0]);
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(captureImage, ggr.tpl7.AthleteFragment.REQUEST_PHOTO);
}

@java.lang.Override
public void finishUpdate(android.view.View view) {
    java.lang.System.err.println("UpdateView");
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    UI.updateUI(this);
    android.util.Log.d("mainactivity", "onCreate");
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.d("LoginActivity", "Clear Calendar from database success");
    saveCalendarToDatabase();
}

@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    java.lang.System.out.println("szw onScrolled()");
    rvOther.scrollBy(dx, dy);
}

private void afterSetContentView(android.view.View v) {
    mView = v;
    init(v);
    if ((mLoadingView) != null) {
        mLoadingView.register(this);
    }
}

@java.lang.Override
public void categoryChanged(int activePosition) {
    android.util.Log.d(com.shakenbeer.babalex.MainActivity.TAG, ("categoryChanged: " + activePosition));
    categoriesManager.onCategoryChanged(activePosition);
    categoryAdapter.setSelected(activePosition);
    showNextCategoryText();
}

public void setTitle(java.lang.CharSequence title, android.widget.TextView.BufferType bufferType) {
    if (title != null) {
        mTitleView.setText(title);
        mTitleView.setVisibility(edu.mit.mitmobile2.VISIBLE);
    }else {
        mTitleView.setVisibility(edu.mit.mitmobile2.GONE);
    }
}

private void init(android.content.Context context) {
    inflate(context, R.layout.comm_view_search_edittext, null);
    initView();
}

private void restartActivity() {
    android.content.Intent intent = getIntent();
    finish();
    startActivity(intent);
}

private java.lang.CharSequence getDOW(int position) {
    int todayDOW = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK);
    return io.github.dramaapppj.android.controller.activity.current.CurrentPagerAdapter.WEEK_NAME[(((todayDOW - 1) + (7 - position)) % 7)];
}

@java.lang.Override
public void onClick(android.view.View v) {
    int position = getAdapterPosition();
    android.support.design.widget.Snackbar.make(v, ("Click detected on item " + position), Snackbar.LENGTH_LONG).setAction("Action", null).show();
}

private void drawJustified(android.graphics.Canvas canvas) {
    drawJustified(canvas, this.getLayout());
}

@java.lang.Override
public void run() {
    android.widget.ArrayAdapter<java.lang.CharSequence> adapter = android.widget.ArrayAdapter.createFromResource(getBaseContext(), R.array.activities, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
}

@android.annotation.SystemApi
public boolean getDataEnabled() {
    try {
        return getITelephony().getDataEnabled();
    } catch (android.os.RemoteException e) {
        android.util.Log.e(android.telephony.TelephonyManager.TAG, "Error calling ITelephony#getDataEnabled", e);
    }
    return false;
}

public void logoutUser() {
    session.setLogin(false);
    db.deleteUsers();
    android.content.Intent intent = new android.content.Intent(this, app.com.cvjuanresume.juansandoval.cvjuanresume.LoginActivity.class);
    finish();
    startActivity(intent);
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    com.azi.tethermote.SwitchNotification.Check(this, ((com.azi.tethermote.WirelessTools.getRemoteTetherState(this)) != (WirelessTools.TETHERING_ENABLED)));
}

@java.lang.Override
public void onGastosFavoritosItemSelected(java.lang.String id) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
}

@java.lang.Override
public void onGroupSelected(java.lang.String groupName, java.lang.String groupOrder) {
    android.util.Log.i(com.github.charmasaur.alpsinsects.ui.MainActivity.TAG, ("Group selected: " + groupName));
    fragmentController.pushFragment(groupName, null, com.github.charmasaur.alpsinsects.ui.fragments.GroupFragment.newInstance(groupOrder), "GROUP", 4);
}

@java.lang.Override
public boolean onTouchEvent(final android.view.MotionEvent ev) {
    return (!(lockMode.allowsTouch())) || (super.onTouchEvent(ev));
}

@retrofit2.http.GET(value = "good_deals/{id}")
io.reactivex.Observable<im.goody.android.data.dto.Deal> getDeal(@retrofit2.http.Path(value = "id")
long id);

public void executeAudioCallBack() {
    try {
        this.interpreter.eval(audioCallBack);
    } catch (bsh.EvalError e) {
        au.org.intersect.faims.android.log.FLog.e("error when executing the callback for the audio", e);
    }
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.seekTo(((mp.getCurrentPosition()) - 1));
    mp.pause();
}

@java.lang.Override
public void doCommand() {
    for (com.google.maps.android.geojson.GeoJsonFeature feature : addList) {
        geoJsonLayer.addFeature(feature);
    }
    for (com.google.maps.android.geojson.GeoJsonFeature feature : removeList) {
        geoJsonLayer.removeFeature(feature);
    }
}

@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status result) {
    if (!(result.isSuccess())) {
        callback.onSuccess();
    }else {
        callback.onError(result.toString());
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    c.setData(b);
    android.util.Log.e(io.github.sdsstudios.ScoreKeeper.Activity.TAG, "onCheckedChanged");
    saveGameToDatabase();
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    uni_spacestudio.blueconsole.BluetoothCommService.BluetoothCommBinder binder = ((uni_spacestudio.blueconsole.BluetoothCommService.BluetoothCommBinder) (service));
    bluetoothService = binder.getService();
    binder.setHandler(bluetoothCommHandler);
}

@java.lang.Override
public void onReceivedIcon(android.webkit.WebView view, android.graphics.Bitmap icon) {
    mWebChromeClient.onReceivedIcon(view, icon);
}

public int increasePrice(int oldPrice, int upgradeAmount) {
    int newPrice = oldPrice * (2 * upgradeAmount);
    android.util.Log.d("Test 2", ("" + upgradeAmount));
    return newPrice;
}

@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    android.util.Log.d(com.bruyu.imagewalker.LimitedGridActivity.TAG, "call onDestroyActionMode() ");
    mode.finish();
    inActionMode = false;
    mGrid.setChoiceMode(GridView.CHOICE_MODE_SINGLE);
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.apps.gabothekiller.debaterbluetooth.MainActivity.SUCCESS_CONNECT :
            android.widget.Toast.makeText(this, "CONNECT", Toast.LENGTH_SHORT).show();
            break;
    }
}

@java.lang.Override
public void showMessage(java.lang.String message) {
    android.widget.Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
}

public sumimakito.android.quickkv.database.QKVCallback cbkFailed(java.lang.String msg) {
    return this.isCallbackEnabled ? new sumimakito.android.quickkv.database.QKVCallback(false, QKVCallback.CODE_FAILED, msg) : null;
}

private android.bluetooth.BluetoothGattService getMiliService() {
    if (!(setupComplete))
        setupBluetooth();
    
    return mGatt.getService(MiBandConstants.UUID_SERVICE_MILI_SERVICE);
}

@java.lang.Override
public void onDestroy() {
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.TripFragment.TAG, "onDestroy");
    }
    getPersistenceManager().getDatabase().unregisterTripRowListener(this);
    super.onDestroy();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this.getBaseContext(), com.snippet.snippet.view.UntaggedPhotosActivity.class);
    intent.putExtra(UntaggedPhotosActivity.pathsExtraKey, paths);
    startActivity(intent);
}

@java.lang.Override
public void newTrackClicked(int selectedTrack) {
    android.util.Log.v(au.com.kbrsolutions.spotifystreamer.activities.SpotifyStreamerActivity.LOG_TAG, "newTrackClicked - start");
    showPlayerController(selectedTrack);
}

public void onClick(android.view.View v) {
    android.content.Intent nextActivity = new android.content.Intent(this, com.turboocelots.oasis.controllers.WelcomeActivity.class);
    nextActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    nextActivity.putExtra("CurrentUser", currentUser.getUsername());
    startActivity(nextActivity);
}

private void activateView(android.view.View parent) {
    for (android.view.View foo : spinnerPlayers.getTouchables()) {
        foo.setClickable(true);
        foo.setEnabled(true);
    }
    parent.setEnabled(true);
}

public static void setBitmapToMemoryCache(java.lang.String key, android.graphics.Bitmap bitmap) {
    if ((nigelhenshaw.com.cameraintenttutorial.CamaraIntentActivity.getBitmapFromMemoryCache(key)) == null) {
        nigelhenshaw.com.cameraintenttutorial.CamaraIntentActivity.mMemoryCache.put(key, bitmap);
    }
}

private boolean isTripSet() {
    if (((origAbbr) == null) || ((destAbbr) == null)) {
        android.widget.Toast.makeText(this, "Please select stations in the trip planner.", Toast.LENGTH_SHORT).show();
        return false;
    }
    return true;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    myTimer.stop();
    dialogInterface.dismiss();
    android.widget.Toast.makeText(this, "Timer stopped.", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    int position = viewHolder.getAdapterPosition();
    mProductAdapter.removeAt(position);
    mProducts.remove(position);
    mRetainedFragment.setProducts(mProducts);
}

@android.annotation.SuppressLint(value = "ShowToast")
@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_setting :
            android.widget.Toast.makeText(this, "setting", Toast.LENGTH_SHORT);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.SuppressWarnings(value = "deprecation")
public android.content.Intent createShareIntent(java.lang.String shareText) {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
    return shareIntent;
}

public void refreshListUI(java.util.List<com.example.administrator.leehom.model.MusicModel> modelList) {
    android.util.Log.i(com.example.administrator.leehom.fragment.MainFragment.TAG, ("refreshListUI modelList :" + modelList));
    if (com.example.administrator.leehom.utils.Utils.checkNull(mFragmentAdapter)) {
        mFragmentAdapter.updataRefresh(modelList);
    }
}

public void autoUpButton(android.app.ActionBar actionBar) {
    (this.actionBar = actionBar).setDisplayHomeAsUpEnabled(false);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View mainView = inflater.inflate(getLayoutResId(), container, false);
    butterknife.ButterKnife.bind(this, mainView);
    return mainView;
}

protected int getErrorCode(final android.content.Intent response) {
    int errorCode = response.getIntExtra(DConnectMessage.EXTRA_ERROR_CODE, DConnectMessage.ErrorCode.UNKNOWN.getCode());
    return errorCode;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            break;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mRackets = com.plew.android.simpleracketdb.RacketList.get(getActivity()).getRackets();
    getActivity().setTitle("Racket List");
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onClickBtnOK(android.view.View v) {
    mDBHelper.deleteUser(mUsers.get(mPosition));
    mUsers.remove(mPosition);
    notifyDataSetChanged();
    dialog.dismiss();
}

@java.lang.Override
protected void onDestroy() {
    unregisterBroadCastReceivers();
    if (isFinishing()) {
        stopService(new android.content.Intent(this, de.roughriders.jf.eta.services.DistanceNotificationService.class));
        de.roughriders.jf.eta.helpers.Logger.getInstance().close();
    }
    super.onDestroy();
}

private boolean gitRepoIsClean() {
    try {
        com.orgzly.android.git.Status status = git.status().call();
        return status.hasUncommittedChanges();
    } catch (org.eclipse.jgit.api.errors.GitAPIException e) {
        return false;
    }
}

public android.database.Cursor select(java.lang.String query) {
    return mDB.rawQuery(query, null);
}

public void showRateDay(android.view.View view) {
    hirondelle.date4j.DateTime today = hirondelle.date4j.DateTime.today(java.util.TimeZone.getDefault());
    showRateDayPopup(today);
}

public void initHeroesBasicsLocally(android.content.Context context) throws java.io.IOException {
    java.io.InputStream inputStream = context.getResources().openRawResource(R.raw.heroesjson);
    initHeroesBasics(inputStream);
}

public static java.util.ArrayList<ca.ualberta.cs.expensemaster.Claim> getClaimsList(android.content.Context ctx) {
    if ((ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims) == null) {
        ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims = new ca.ualberta.cs.expensemaster.ClaimsList();
        ca.ualberta.cs.expensemaster.ExpenseMasterApplication.loadFromFile(ctx);
    }
    return ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims.getClaims();
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    java.lang.String timerMessage = "" + (msg.obj);
    tvTimer.setText(timerMessage);
}

@java.lang.Override
public void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
    super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    org.mozilla.gecko.GeckoAccessibility.onLayerViewFocusChanged(this, gainFocus);
}

public static java.lang.String getSeparatorTime(@android.support.annotation.Nullable
android.content.res.Resources resources, org.threeten.bp.LocalDateTime now, org.threeten.bp.LocalDateTime then, boolean is24HourFormat, org.threeten.bp.ZoneId timeZone, boolean epocIsJustNow) {
    return com.waz.zclient.utils.ZTimeFormatter.getSeparatorTime(resources, now, then, is24HourFormat, timeZone, epocIsJustNow, true);
}

@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... strings) {
    mFileContents = downloadXMLFile(params[0]);
    if ((mFileContents) == null) {
        android.util.Log.d("DownloadData", "Error downloading");
    }
    return mFileContents;
}

private com.orgzly.android.repos.VersionedRook currentVersionedRook(com.orgzly.android.repos.VersionedRook last) throws java.io.IOException {
    org.eclipse.jgit.revwalk.RevCommit newCommit = synchronizer.currentHead();
    return new com.orgzly.android.repos.VersionedRook(last, newCommit.toString(), newCommit.getCommitTime());
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.widget.Toast.makeText(this, query, Toast.LENGTH_SHORT).show();
    mAdapter = new com.mynotes.android.mynotes.NotesAdapter(this, query, this);
    mRecyclerView.setAdapter(mAdapter);
    return false;
}

@java.lang.Override
public void OnRingtoneSelected(java.lang.String ringtoneName, android.net.Uri ringtoneUri) {
    alarm.setAlarmTonePath(ringtoneUri.getPath());
    alarm.setAlarmToneName(ringtoneName);
    text2.setText(ringtoneName);
    setMathAlarm(alarm);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    mActivity = ((com.xhy.weibo.ui.activity.StatusDetailActivity) (activity));
    ((com.xhy.weibo.ui.activity.StatusDetailActivity) (activity)).setmHandler(mHandler);
}

@java.lang.Override
public void onGPSConnect(com.example.user01.planit.GPSEvent e) {
    if (requestingLocationUpdates) {
        android.widget.Toast.makeText(this, "Begin location updates", Toast.LENGTH_SHORT).show();
        gps.startLocationUpdates();
        currLocation = e.getLocation();
    }
}

public com.github.javiersantos.bottomdialogs.BottomDialog.Builder setNegativeText(@android.support.annotation.StringRes
int buttonTextRes) {
    setPositiveText(this.context.getString(buttonTextRes));
    return this;
}

private void logInfo(java.lang.String message) {
    android.util.Log.i(jp.straylight.scannerapp.ScanResultsReporter.TAG, message);
    listener.onReport(message);
}

@com.taobao.weex.ui.component.WXComponentProp(name = "size")
public void setTextSizeValue(int size) {
    ((android.widget.TextView) (mHost)).setTextSize(size);
}

@java.lang.Override
public void onClick(android.view.View v) {
    getFragmentManager().popBackStack();
    getActivity().setTitle(getString(R.string.app_name));
}

@java.lang.Override
public void rowSelected(mobileoak.volleyballtracker.model.Player player) {
    android.util.Log.d("tag", ("Called with player " + (player.getName())));
    mPlayerName.setText(player.getName());
}

public void tryToEnableBluetooth() {
    android.util.Log.d("BT", "tryToEnableBluetooth");
    if (!(mBluetoothAdapter.isEnabled())) {
        android.content.Intent enableBluetooth = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        owner.startActivityForResult(enableBluetooth, 0);
    }
}

protected void onPostExecute(java.lang.Void aVoid) {
    android.util.Log.i("System.out", ("Size is " + (ambiesoft.start.fragment.GoogleMapFragment.artworks.size())));
    ambiesoft.start.fragment.GoogleMapFragment.artworkArrayListCreatedBefore = true;
    drawArtworksMarker();
}

public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    startActivity(new android.content.Intent(this, com.example.adityadesai.cng.Activities.ChooseActivity.class));
    finish();
}

@java.lang.Override
public void loadImage(android.widget.ImageView imageView, java.lang.String url, int index) {
    com.bumptech.glide.Glide.with(this).load(url).into(imageView);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_parcourt_list_fresque_bd, container, false);
    initParcourt();
    initFragment();
    return v;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    koofService = org.bosik.diacomp.android.backend.common.Storage.getKoofService(getContentResolver());
}

protected void onStop() {
    super.onStop();
    android.util.Log.e("Tracking", "onStop");
    handler.removeCallbacks(thread);
    if ((doAsynchronousTask) != null)
        doAsynchronousTask.cancel();
    
}

private void notifyChange(java.lang.String what) {
    android.content.Intent i = new android.content.Intent(what);
    i.putExtra("album", getAlbumName());
    i.putExtra("track", getTrackName());
    sendBroadcast(i);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_college_search);
    addListenerOnButton();
    addListenerOnSpinnerItemSelection();
}

private void restartTheme() {
    android.content.Intent intent = this.getIntent();
    startActivity(intent);
    overridePendingTransition(R.anim.fade_in_real, R.anim.fading_out_real);
    finish();
}

@java.lang.Override
public void onFailure(java.lang.Exception error) {
    android.util.Log.e(cs446.mezzo.art.AlbumArtManager.TAG, ("MusicBrainz failed " + (error.getMessage())));
    setDefaultCoverArt(view);
    paletteCallback.onFailure(error);
}

private void startLocationService() {
    if (!(checkPermission(android.Manifest.permission.ACCESS_FINE_LOCATION))) {
        requestPermission();
    }else {
        buildGoogleApiClient();
        makeLocationRequest();
        loadWeatherListFragment(LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient));
    }
}

private void showAddAddressDialog(java.lang.String title, java.lang.String address) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.DialogFragment frag = com.coinblesk.client.addresses.EditAddressFragment.newInstance(title, address);
    frag.show(fm, "fragment_edit_address");
}

@java.lang.Override
public void onBackPressed() {
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }else {
        super.onBackPressed();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    saveBudget();
    getActivity().finish();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.activity_map, container, false);
    initMap();
    initLoc();
    return view;
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String itemName = "";
    int itemPrice = 0;
    java.lang.String itemFlavors = "";
    android.util.Log.i("Finished", tech.travis.poolpos.MainActivity.getMethodName());
}

public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.opensource_dialog, container, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((usedBitmap) != (defaultBitmap)) {
        usedBitmap.recycle();
        usedBitmap = defaultBitmap;
    }
    finish();
}

@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    view.setFocusable(true);
    view.setFocusableInTouchMode(true);
}

@java.lang.Override
protected void onRemoveItemRequestFocus(android.view.View previousItem, boolean wasFocused) {
    android.widget.EditText editText = getEditTextFromView(previousItem);
    smoothScrollToView(previousItem);
    editText.requestFocus();
}

protected com.wade.webserver.Response getNotFoundResponse() {
    com.wade.webserver.Response r = newFixedLengthResponse(Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Error 404, file not found.");
    android.util.Log.i(TAG, (("MyServer.getNotFoundResponse(" + (r.toString())) + ")"));
    return r;
}

public static android.content.ContentValues parse(long pubId, long userId) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.gemapps.picapp.data.PicappContract.BookmarkEntry.COLUMN_PUBLICATION_ID, pubId);
    contentValues.put(com.gemapps.picapp.data.PicappContract.BookmarkEntry.COLUMN_USER_ID, userId);
    return contentValues;
}

