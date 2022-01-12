@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    if ((mRecyclerView) != null) {
        return mRecyclerView.getLayoutManager().onSaveInstanceState();
    }
    return super.onSaveInstanceState();
}

@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    if (activity instanceof com.example.alex.motoproject.screenMain.MainActivity) {
        mMainActivityVisible = true;
    }
}

public final android.content.res.Resources.Theme newTheme() {
    android.content.res.Resources.Theme theme = new android.content.res.Resources.Theme();
    theme.setImpl(mResourcesImpl.newThemeImpl());
    synchronized(mThemeRefs) {
        mThemeRefs.add(new java.lang.ref.WeakReference<>(theme));
    }
    return theme;
}

public android.database.Cursor swapCursor(android.database.Cursor cursor) {
    if ((mCursor) == cursor)
        return null;
    
    android.database.Cursor tempCursor = mCursor;
    mCursor = cursor;
    if (cursor != null)
        notifyDataSetChanged();
    
    return tempCursor;
}

private void showDocument(@android.support.annotation.NonNull
android.net.Uri documentUri, @android.support.annotation.Nullable
final java.lang.String password, @android.support.annotation.NonNull
final com.pspdfkit.configuration.activity.PdfActivityConfiguration configuration, @android.support.annotation.NonNull
final org.apache.cordova.CallbackContext callbackContext) {
    showDocumentForUri(documentUri, password, configuration);
    callbackContext.success();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.net.Uri uri = android.net.Uri.fromFile(photo[0]);
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(captureImage, ggr.tpl7.AthleteFragment.REQUEST_PHOTO);
}

@java.lang.Override
public void finishUpdate(android.view.View view) {
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    UI.updateUI(this);
}

@java.lang.Override
public void onSuccess() {
    saveCalendarToDatabase();
}

@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    rvOther.scrollBy(dx, dy);
}

private void afterSetContentView() {
    init(mView);
    if ((mLoadingView) != null) {
        mLoadingView.register(this);
    }
}

@java.lang.Override
public void categoryChanged(int activePosition) {
    categoriesManager.onCategoryChanged(activePosition);
    categoryAdapter.setSelected(activePosition);
    showNextCategoryText();
}

public void setTitle(java.lang.CharSequence title, android.widget.TextView.BufferType bufferType) {
    if (title != null) {
        mTitleView.setText(title, bufferType);
        mTitleView.setVisibility(edu.mit.mitmobile2.VISIBLE);
    }else {
        mTitleView.setVisibility(edu.mit.mitmobile2.GONE);
    }
}

private void init(android.content.Context context) {
    inflate(context, R.layout.comm_view_search_edittext, this);
    initView();
}

public void restartActivity() {
    android.content.Intent intent = getIntent();
    finish();
    startActivity(intent);
}

private java.lang.CharSequence getDOW(int position) {
    int todayDOW = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK);
    return io.github.dramaapppj.android.controller.activity.current.CurrentPagerAdapter.WEEK_NAME[(((todayDOW - 1) + position) % 7)];
}

@java.lang.Override
public void onClick(android.view.View v) {
    int position = getAdapterPosition();
}

private void drawJustified(android.graphics.Canvas canvas) {
    if ((this.getLayout()) == null) {
        return ;
    }
    drawJustified(canvas, this.getLayout());
}

@java.lang.Override
public void run() {
    adapter = android.widget.ArrayAdapter.createFromResource(getBaseContext(), R.array.activities, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
}

@android.annotation.SystemApi
public boolean getDataEnabled() {
    try {
        return getITelephony().getDataEnabled();
    } catch (android.os.RemoteException e) {
        android.util.Log.e(android.telephony.TelephonyManager.TAG, "Error calling ITelephony#getDataEnabled", e);
    } catch (java.lang.NullPointerException e) {
    }
    return false;
}

public void logoutUser() {
    session.setLogin(false);
    db.deleteUsers();
    android.content.Intent intent = new android.content.Intent(this, app.com.cvjuanresume.juansandoval.cvjuanresume.LoginActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    com.azi.tethermote.SwitchNotification.Check(this);
}

@java.lang.Override
public void onGastosFavoritosItemSelected(java.lang.String id) {
}

@java.lang.Override
public void onGroupSelected(java.lang.String groupName, java.lang.String groupOrder) {
    android.util.Log.i(com.github.charmasaur.alpsinsects.ui.MainActivity.TAG, ("Group selected: " + groupName));
    fragmentController.pushFragment(groupName, null, com.github.charmasaur.alpsinsects.ui.fragments.GroupFragment.newInstance(groupOrder), 4);
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if (lockMode.allowsTouch()) {
        return super.onTouchEvent(ev);
    }else {
        return false;
    }
}

@retrofit2.http.GET(value = "good_deals/{id}")
io.reactivex.Observable<im.goody.android.data.dto.Deal> getDeal(@retrofit2.http.Header(value = "X-User-Token")
java.lang.String token, @retrofit2.http.Path(value = "id")
long id);

public void executeAudioCallBack() {
    try {
        this.interpreter.eval(audioCallBack);
    } catch (java.lang.Exception e) {
        au.org.intersect.faims.android.log.FLog.e("error when executing the callback for the audio", e);
    }
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.pause();
}

@java.lang.Override
public void doCommand() {
    for (com.google.maps.android.geojson.GeoJsonFeature feature : removeList) {
        geoJsonLayer.removeFeature(feature);
    }
    for (com.google.maps.android.geojson.GeoJsonFeature feature : addList) {
        geoJsonLayer.addFeature(feature);
    }
}

@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status result) {
    if (result.isSuccess()) {
        callback.onSuccess();
    }else {
        callback.onError(result.toString());
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    c.setData(b);
    saveGameToDatabase();
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    uni_spacestudio.blueconsole.BluetoothCommService.BluetoothCommBinder binder = ((uni_spacestudio.blueconsole.BluetoothCommService.BluetoothCommBinder) (service));
    bluetoothService = binder.getService();
    bluetoothService.setHandler(bluetoothCommHandler);
}

@java.lang.Override
public void onReceivedIcon(android.webkit.WebView view, android.graphics.Bitmap icon) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onReceivedIcon(view, icon);
    }
}

public int increasePrice(int oldPrice, int upgradeAmount) {
    if (upgradeAmount == 0) {
        return oldPrice;
    }else {
        int newPrice = oldPrice * (2 * upgradeAmount);
        return newPrice;
    }
}

@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    mode.finish();
    inActionMode = false;
    mGrid.setChoiceMode(GridView.CHOICE_MODE_SINGLE);
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.apps.gabothekiller.debaterbluetooth.MainActivity.SUCCESS_CONNECT :
            break;
    }
}

@java.lang.Override
public void showMessage(java.lang.String message) {
    if ((getContext()) != null) {
        android.widget.Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}

protected sumimakito.android.quickkv.database.QKVCallback cbkFailed(java.lang.String msg) {
    return this.isCallbackEnabled ? new sumimakito.android.quickkv.database.QKVCallback(false, QKVCallback.CODE_FAILED, msg) : null;
}

private android.bluetooth.BluetoothGattService getMiliService() {
    return mGatt.getService(MiBandConstants.UUID_SERVICE_MILI_SERVICE);
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(co.smartreceipts.android.fragments.TripFragment.TAG, "onDestroy");
    getPersistenceManager().getDatabase().unregisterTripRowListener(this);
    super.onDestroy();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this.getBaseContext(), com.snippet.snippet.view.UntaggedPhotosActivity.class);
    intent.putExtra(UntaggedPhotosActivity.pathsExtraKey, ((java.util.ArrayList<java.lang.String>) (paths)));
    startActivity(intent);
}

@java.lang.Override
public void newTrackClicked(int selectedTrack) {
    showPlayerController(selectedTrack);
}

public void onClick(android.view.View v) {
    android.content.Intent nextActivity = new android.content.Intent(this, com.turboocelots.oasis.controllers.WelcomeActivity.class);
    startActivity(nextActivity);
}

private void activateView(android.view.View parent) {
    for (android.view.View foo : parent.getTouchables()) {
        foo.setClickable(true);
        foo.setEnabled(true);
    }
    parent.setEnabled(true);
    parent.setClickable(true);
}

public static void setBitmapToMemoryCache(java.lang.String key, android.graphics.Bitmap bitmap) {
    if (bitmap != null) {
        if ((nigelhenshaw.com.cameraintenttutorial.CamaraIntentActivity.getBitmapFromMemoryCache(key)) == null) {
            nigelhenshaw.com.cameraintenttutorial.CamaraIntentActivity.mMemoryCache.put(key, bitmap);
        }
    }
}

private boolean isTripSet() {
    if (((origAbbr) == null) || ((destAbbr) == null))
        return false;
    
    return true;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    myTimer.stop();
    dialogInterface.dismiss();
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int swipeDir) {
    int position = viewHolder.getAdapterPosition();
    mProductAdapter.removeAt(position);
    mRetainedFragment.setProducts(mProducts);
}

@android.annotation.SuppressLint(value = "ShowToast")
@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.SuppressWarnings(value = "deprecation")
private android.content.Intent createShareIntent(java.lang.String shareText) {
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
    return shareIntent;
}

public void refreshListUI(java.util.List<com.example.administrator.leehom.model.MusicModel> modelList) {
    android.util.Log.i(com.example.administrator.leehom.fragment.MainFragment.TAG, ("refreshListUI modelList :" + modelList));
    if (!(com.example.administrator.leehom.utils.Utils.checkNull(mFragmentAdapter))) {
        mFragmentAdapter.updataRefresh(modelList);
    }
}

public void autoUpButton(android.app.ActionBar actionBar) {
    if (actionBar != null)
        (this.actionBar = actionBar).setDisplayHomeAsUpEnabled(false);
    
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
}

protected int getErrorCode(final android.content.Intent response) {
    return response.getIntExtra(DConnectMessage.EXTRA_ERROR_CODE, DConnectMessage.ErrorCode.UNKNOWN.getCode());
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mRackets = com.plew.android.simpleracketdb.RacketList.get(getActivity()).getRackets();
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onClickBtnOK(android.view.View v) {
    mDBHelper.deleteUser(mUsers.get(mPosition));
    mUsers.remove(mPosition);
    dialog.dismiss();
}

@java.lang.Override
protected void onDestroy() {
    unregisterBroadCastReceivers();
    super.onDestroy();
}

private boolean gitRepoIsClean() {
    try {
        com.orgzly.android.git.Status status = git.status().call();
        return !(status.hasUncommittedChanges());
    } catch (org.eclipse.jgit.api.errors.GitAPIException e) {
        return false;
    }
}

private android.database.Cursor select(java.lang.String query) {
    return mDB.rawQuery(query, null);
}

public void showRateDay() {
    hirondelle.date4j.DateTime today = hirondelle.date4j.DateTime.today(java.util.TimeZone.getDefault());
    showRateDayPopup(today);
}

private void initHeroesBasicsLocally(android.content.Context context) throws java.io.IOException {
    java.io.InputStream inputStream = context.getResources().openRawResource(R.raw.heroesjson);
    initHeroesBasics(inputStream);
}

public static ca.ualberta.cs.expensemaster.ClaimsList getClaimsList(android.content.Context ctx) {
    if ((ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims) == null) {
        ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims = new ca.ualberta.cs.expensemaster.ClaimsList();
        ca.ualberta.cs.expensemaster.ExpenseMasterApplication.loadFromFile(ctx);
    }
    return ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims;
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    timerMessage = "" + (msg.obj);
    tvTimer.setText(timerMessage);
}

@java.lang.Override
public void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
    super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    org.mozilla.gecko.GeckoAccessibility.onLayerViewFocusChanged(gainFocus);
}

public static java.lang.String getSeparatorTime(@android.support.annotation.Nullable
android.content.Context context, org.threeten.bp.LocalDateTime now, org.threeten.bp.LocalDateTime then, boolean is24HourFormat, org.threeten.bp.ZoneId timeZone, boolean epocIsJustNow) {
    return com.waz.zclient.utils.ZTimeFormatter.getSeparatorTime(context, now, then, is24HourFormat, timeZone, epocIsJustNow, true);
}

@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    mFileContents = downloadXMLFile(params[0]);
    if ((mFileContents) == null) {
        android.util.Log.d("DownloadData", "Error downloading");
    }
    return mFileContents;
}

private com.orgzly.android.repos.VersionedRook currentVersionedRook(com.orgzly.android.repos.VersionedRook last) throws java.io.IOException {
    org.eclipse.jgit.revwalk.RevCommit newCommit = synchronizer.currentHead();
    return new com.orgzly.android.repos.VersionedRook(last, newCommit.name(), newCommit.getCommitTime());
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    mAdapter = new com.mynotes.android.mynotes.NotesAdapter(this, query, this);
    mRecyclerView.setAdapter(mAdapter);
    return false;
}

@java.lang.Override
public void OnRingtoneSelected(java.lang.String ringtoneName, android.net.Uri ringtoneUri) {
    alarm.setAlarmTonePath(ringtoneUri.toString());
    alarm.setAlarmToneName(ringtoneName);
    text2.setText(ringtoneName);
    setMathAlarm(alarm);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    mActivity = ((com.xhy.weibo.ui.activity.StatusDetailActivity) (context));
    mActivity.setmHandler(mHandler);
}

@java.lang.Override
public void onGPSConnect(com.example.user01.planit.GPSEvent e) {
    if (requestingLocationUpdates) {
        gps.startLocationUpdates();
        currLocation = e.getLocation();
    }
}

public com.github.javiersantos.bottomdialogs.BottomDialog.Builder setNegativeText(@android.support.annotation.StringRes
int buttonTextRes) {
    setNegativeText(this.context.getString(buttonTextRes));
    return this;
}

private void logInfo(java.lang.String message) {
    android.util.Log.i(jp.straylight.scannerapp.ScanResultsReporter.TAG, message);
    if ((listener) != null) {
        listener.onReport(message);
    }
}

@com.taobao.weex.ui.component.WXComponentProp(name = "size")
public void setTextSizeValue(int size) {
    mHost.setTextSize(size);
}

@java.lang.Override
public void onClick(android.view.View v) {
    getFragmentManager().popBackStack();
}

@java.lang.Override
public void rowSelected(mobileoak.volleyballtracker.model.Player player) {
    mPlayerName.setText(player.getName());
}

public void tryToEnableBluetooth() {
    android.util.Log.i("BT", "tryToEnableBluetooth");
    if (!(mBluetoothAdapter.isEnabled())) {
        android.content.Intent enableBluetooth = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        owner.startActivityForResult(enableBluetooth, 0);
    }
}

protected void onPostExecute(java.lang.Void aVoid) {
    android.util.Log.i("System.out", ("Size is " + (ambiesoft.start.fragment.GoogleMapFragment.artworks.size())));
    drawArtworksMarker();
}

public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
}

@java.lang.Override
public void loadImage(android.widget.ImageView imageView, int index) {
    com.bumptech.glide.Glide.with(this).load(list.get(index)).into(imageView);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_parcourt_list_fresque_bd, container, false);
    initParcourt();
    v = initFragment(v);
    return v;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    koofService = org.bosik.diacomp.android.backend.common.Storage.getKoofService(getContentResolver());
    super.onCreate(savedInstanceState);
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.e("Tracking", "onStop");
}

private void notifyChange(java.lang.String what) {
    android.content.Intent i = new android.content.Intent(what);
    sendBroadcast(i);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_college_search);
    addListenerOnButton();
}

private void restartTheme() {
    android.content.Intent intent = this.getIntent();
    finish();
    startActivity(intent);
    overridePendingTransition(R.anim.fade_in_real, R.anim.fading_out_real);
}

@java.lang.Override
public void onFailure(java.lang.Exception error) {
    android.util.Log.e(cs446.mezzo.art.AlbumArtManager.TAG, ("MusicBrainz failed " + (error.getMessage())));
    setDefaultCoverArt(view);
    if (paletteCallback != null) {
        paletteCallback.onFailure(error);
    }
}

private void startLocationService() {
    if (!(checkPermission(android.Manifest.permission.ACCESS_FINE_LOCATION))) {
        requestPermission();
    }else {
        buildGoogleApiClient();
        makeLocationRequest();
    }
}

private void showAddAddressDialog(java.lang.String label, java.lang.String address) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.DialogFragment frag = com.coinblesk.client.addresses.EditAddressFragment.newInstance(label, address);
    frag.show(fm, "fragment_edit_address");
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
}

@java.lang.Override
public void onClick(android.view.View v) {
    getActivity().finish();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.activity_map, container, false);
    initMap();
    initLoc();
    return view;
}

@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String itemName = "";
    int itemPrice = 0;
    java.lang.String itemFlavors = "";
}

public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.opensource_dialog, container, false);
    return view;
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
}

@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    view.setFocusable(true);
}

@java.lang.Override
protected void onRemoveItemRequestFocus(android.view.View previousItem, boolean wasFocused) {
    if (previousItem != null) {
        android.widget.EditText editText = getEditTextFromView(previousItem);
        smoothScrollToView(previousItem);
        editText.requestFocus();
    }
}

protected com.wade.webserver.Response getNotFoundResponse() {
    com.wade.webserver.Response r = newFixedLengthResponse(Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Error 404, file not found.");
    return r;
}

public static android.content.ContentValues parse(long userId, long pubId) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.gemapps.picapp.data.PicappContract.BookmarkEntry.COLUMN_PUBLICATION_ID, pubId);
    contentValues.put(com.gemapps.picapp.data.PicappContract.BookmarkEntry.COLUMN_USER_ID, userId);
    return contentValues;
}

