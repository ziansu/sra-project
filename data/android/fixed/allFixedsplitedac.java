@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
}

@java.lang.Override
public com.example.nobell.project4.FeedAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_feed, parent, false);
    return new com.example.nobell.project4.FeedAdapter.ViewHolder(v);
}

@android.support.annotation.MainThread
public void notifyPlaylistChanged() {
    android.util.Log.d(org.bottiger.podcast.playlist.Playlist.TAG, "notifyPlaylistChanged");
    org.bottiger.podcast.SoundWaves.getRxBus().send(this);
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
}

public void startMain() {
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
}

public void showStats(android.view.View view) {
    topDarkActionbar.showStats(0, 0);
}

public void add(android.graphics.Bitmap bitmap) {
    ivList.add(bitmap);
    notifyDataSetChanged();
}

public static void api(java.lang.String s) {
    if (com.joe.zatuji.Constant.IS_DEBUG) {
        android.util.Log.d("api", s);
    }
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i(logTAG, "SailfishNotificationService starting");
    com.splunk.mint.Mint.initAndStartSession(this, Constants.MINT_API_KEY);
    return START_STICKY;
}

private void setGenderSpinner() {
    android.widget.ArrayAdapter<java.lang.String> spinnerAdapter = new android.widget.ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, new java.lang.String[]{ "Gender" , "Male" , "Female" });
    spGender.setAdapter(spinnerAdapter);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            showLogoutDialog();
            return true;
        default :
            return false;
    }
}

protected void profileClick(android.view.View view) {
    startActivity(new android.content.Intent(this, android.duke290.com.loco.ProfileActivity.class));
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    controller.touched(event);
    invalidate();
    return true;
}

@java.lang.Override
public void onTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    mGestureDetector.onTouchEvent(e);
}

public void doGuidedTakeoff(double altitude) {
    com.o3dr.android.client.apis.ControlApi.getApi(this).takeoff(altitude, null);
}

@java.lang.Override
public void onSuccess() {
    android.content.Intent intent = new android.content.Intent(this, framgia.vn.framgiacrb.ui.activity.SplashActivity.class);
    getPlaceFromServer(Session.sAuthToken);
    startActivity(intent);
    finish();
}

@com.google.common.annotations.VisibleForTesting
void addDatabaseLabel(java.lang.String experimentId, java.lang.String trialId, com.google.android.apps.forscience.whistlepunk.filemetadata.Label label, com.google.android.apps.forscience.whistlepunk.filemetadata.LabelValue labelValue) {
    synchronized(mLock) {
        final android.database.sqlite.SQLiteDatabase db = mDbHelper.getWritableDatabase();
        com.google.android.apps.forscience.whistlepunk.metadata.SimpleMetaDataManager.addDatabaseLabel(db, experimentId, trialId, label, labelValue);
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    for (com.labs.fi141.devicecare.db.Table table : tables.values()) {
        db.execSQL(table.getCREATE());
    }
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_signup, container, false);
    initializeButtons();
    return view;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    intent = null;
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_screen);
    playername = ((android.widget.EditText) (findViewById(R.id.editText)));
}

@java.lang.Override
protected void onResume() {
    android.content.Intent intent = new android.content.Intent(this, com.android.grabhouse.FetchAndSaveDataService.class);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
    super.onResume();
}

@java.lang.Override
public void onPrepareLoad(android.graphics.drawable.Drawable placeHolderDrawable) {
}

@java.lang.Override
public java.lang.Boolean pendingData(android.os.Bundle arg) throws java.lang.Exception {
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mButton.setText("develop");
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.imageView_user_picture :
            new ir.rasen.charsoo.view.dialog.PopupSelectCameraGallery(this).show();
            break;
    }
}

@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
    }
}

@android.support.annotation.NonNull
protected io.reactivex.functions.Consumer<java.lang.Throwable> onRefreshItemsLoadFail() {
    return new io.reactivex.functions.Consumer<java.lang.Throwable>() {
        @java.lang.Override
        public void accept(java.lang.Throwable throwable) throws java.lang.Exception {
        }
    };
}

public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mYear = year;
    mMonth = monthOfYear + 1;
    mDay = dayOfMonth;
    showDialog(getirbitaksi.hackathon.com.getirbitaksihackathon.event.CreateNewEventActivity.TIME_DIALOG_ID);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mButtonSec.setBackgroundColor(res.getColor(R.color.background_buttons));
    mButtonFstop.setBackgroundColor(res.getColor(R.color.background_button_chosen));
    whatWeCalculateFor = 1;
    return true;
}

public void activateBus() {
    synchronized(me.sniggle.android.utils.otto.ActivatorBus.LOCK) {
        for (java.lang.Object event : eventCache) {
            post(event, true);
        }
        eventCache.clear();
        active = true;
    }
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mCallback.playerStateChanged(KPlayerCallback.ENDED);
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    getTasks().remove(itemPosition);
    tasksDB.deleteTask(getTasks().get(itemPosition));
    getAdapter().notifyDataSetChanged();
    return true;
}

private android.graphics.drawable.Drawable getColoredBackground(int color) {
    android.graphics.drawable.Drawable circle = getResources().getDrawable(R.drawable.circle);
    circle.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
    return circle;
}

public static android.database.Cursor getFavoriteMovieData(android.content.Context context) {
    return context.getContentResolver().query(FavoriteMovies.CONTENT_URI, null, null, null, null);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    fieldPos = 1;
    ydLn = calcYdLn(fieldPos);
    dialog.cancel();
}

@java.lang.Override
public void onStop() {
    super.onStop();
    if (progressDialog.isShowing()) {
        progressDialog.dismiss();
        progressDialog.hide();
    }
}

@java.lang.Override
public void onError(@io.reactivex.annotations.NonNull
java.lang.Throwable error) {
    android.util.Log.e("Schedule", error.toString(), error);
    radonsoft.mireaassistant.helpers.Global.groupID = groupIDBackup;
    radonsoft.mireaassistant.helpers.Global.instituteID = instituteIDBackup;
    progressDialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public void onError(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo, net.gotev.uploadservice.ServerResponse serverResponse, java.lang.Exception exception) {
    cb.failed("上传失败");
}

private boolean isTopVisible(android.support.v7.widget.RecyclerView recyclerView) {
    int position = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager())).findFirstVisibleItemPosition();
    return position == 0;
}

private void init(android.content.Context context) {
    this.context = context;
    if (de.christinecoenen.code.zapp.utils.ShortcutHelper.areShortcutsSupported()) {
        loadChannelList();
        setSummaryToSelectedChannels();
        setEnabled(true);
    }
}

@java.lang.Override
public int getCount() {
    return mCS.getCount();
}

@java.lang.Override
public void onAnimationStart(android.view.View view) {
    getFab().setVisibility(View.VISIBLE);
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getApplicationContext(), "Couldn't get json from server. Check LogCat for possible errors!", Toast.LENGTH_LONG).show();
    return ;
}

public void increment(android.view.View view) {
    (quantity)++;
    display(quantity);
}

@java.lang.Override
public void run() {
    popWindow.setAnimationStyle(android.R.style.Animation);
    popWindow.update();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    rememberEulaAccepted(context);
    login(serverText.getText().toString(), usernameEditText.getText().toString(), passwordEditText.getText().toString());
}

@butterknife.OnClick(value = R.id.searchButton)
void searchProducts(android.view.View view) {
    if (!(searchEditText.getText().toString().isEmpty())) {
        be.fenego.android_spotshop.utilities.ProductUtility.getProductByText(this, searchEditText.getText().toString());
    }
}

public void onClientConnectionFail() {
    log("Client connection fail !");
}

@javax.annotation.Nullable
public static org.dbtools.android.domain.LocalDateTime longToLocalDateTime(@javax.annotation.Nullable
java.lang.Long l) {
    if (l == null) {
        return null;
    }
    return org.dbtools.android.domain.Instant.ofEpochMilli(l).atZone(org.dbtools.android.domain.ZoneId.systemDefault()).toLocalDateTime();
}

@java.lang.Override
public void onUDPReceive(at.android.smartrobot.network.UDPReceiveEvent e) {
    timeReceiveAcknowlage = e.getTimestamp();
}

@java.lang.Override
protected void onPostExecute(java.lang.String[] result) {
    if (result != null)
        android.util.Log.v(LOG_TAG, ("Uber total fare is: " + (result[0])));
    
}

public static void post(java.lang.String url, com.loopj.android.http.RequestParams params, com.loopj.android.http.AsyncHttpResponseHandler responseHandler) {
    ca.shahnewazkhan.locator.LocatorRestClient.client.post(url, params, responseHandler);
}

@java.lang.Override
public void OnFalure(java.lang.String msg) {
    isLoading = false;
    if ((mView) == null)
        return ;
    
    android.util.Log.e("tag", ("onFalure    " + msg));
    mView.showMsg(msg);
    mView.hideProgress();
}

public static void showToast(android.content.Context context, int messageiId) {
    android.widget.Toast.makeText(context, context.getResources().getString(messageiId), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.im_getStarted :
            break;
        default :
            break;
    }
}

public static java.util.Set<java.lang.String> getAllKanjiFromRadicalList(java.util.List<com.example.x.androidkanjilookup.RadicalLookup.Radical> radicalList) {
    java.util.HashSet<java.lang.String> output = new java.util.HashSet<>();
    for (com.example.x.androidkanjilookup.RadicalLookup.Radical r : radicalList)
        output.addAll(r.relatedKanji);
    
    return output;
}

@java.lang.Override
public void success(java.lang.Object o, retrofit.client.Response response) {
    android.widget.Toast.makeText(mContext, "Post uploaded!", Toast.LENGTH_SHORT).show();
    android.util.Log.d("Chooser", "Post uploaded!");
}

public void test_045() {
    framework.common.ClockCommon.switchMode("秒表");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "开始");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/right_button");
    check(testcase.Object_Description, testcase.Operation_checkExist, "分享");
}

@java.lang.Override
public void call(android.location.Location location) {
    this.location = location;
    fragment.setAdapterLocation(location);
}

void attachView(V view, android.os.Bundle savedInstanceState);

private java.lang.String reasonDescription() {
    switch (reason) {
        case com.polidea.rxandroidble.exceptions.BleScanException.BLUETOOTH_CANNOT_START :
            return "BLUETOOTH_CANNOT_START";
        case com.polidea.rxandroidble.exceptions.BleScanException.BLUETOOTH_DISABLED :
            return "BLUETOOTH_DISABLED";
        case com.polidea.rxandroidble.exceptions.BleScanException.BLUETOOTH_NOT_AVAILABLE :
            return "BLUETOOTH_NOT_AVAILABLE";
        case com.polidea.rxandroidble.exceptions.BleScanException.LOCATION_PERMISSION_MISSING :
            return "LOCATION_PERMISSION_MISSING";
        case com.polidea.rxandroidble.exceptions.BleScanException.LOCATION_SERVICES_DISABLED :
            return "LOCATION_SERVICES_DISABLED";
        default :
            return "UNKNOWN";
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String task = java.lang.String.valueOf(DialogText.getText());
    if ((task.length()) > 0)
        addEntry(task);
    
}

private void moveToSignUpActivity() {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.ahmedsaleh.dbse.SignUp.class);
    startActivity(i);
}

@java.lang.Override
public void onConnectionSuspended(int i) {
    android.util.Log.d(com.tacticsgames.dontdie.activities.PlayServicesActivity.TAG, "onConnectionSuspended(): attempting to reconnect");
    googleApiClient.connect();
}

private boolean checkPermitGallery() {
    return (android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        resetState();
        return true;
    }else {
        return super.onKeyDown(keyCode, event);
    }
}

@java.lang.Override
public void onBindViewHolder(com.example.xunhu.xunchat.View.AllAdapters.PhotoGalleryAdapter.ViewHolder holder, int position) {
    bitmap = getBitmapFromMediaStore(position);
    if ((bitmap) != null) {
        holder.getIvPhotoGallery().setImageBitmap(bitmap);
    }
}

private void updateListHeight(android.widget.ListView listView, com.medic.medicapp.WarningAdapter adapter) {
    com.medic.medicapp.UIUtils.setListViewHeightBasedOnItems(listView);
    adapter.notifyDataSetChanged();
}

public static com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment newInstance(boolean isSummaryView) {
    com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment fragment = new com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putBoolean(com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment.ARG_SUMMARY_VIEW, isSummaryView);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
protected void onPostExecute(java.lang.String json) {
    android.content.Intent intent = new android.content.Intent(this, ljuboandtedi.fridger.activties.ShowMealActivity.class);
    intent.putExtra("json", json);
    startActivity(intent);
}

public static void main(java.lang.String[] argArray) throws java.io.IOException {
    int result = new com.android.dx.command.dexer.Main().run(argArray, null, null);
    if (result != 0) {
        java.lang.System.exit(result);
    }
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    return super.onUnbind(intent);
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.util.Log.i(SmartClosetConstants.SMARTCLOSET_DEBUG_TAG, (((ssar.smartcloset.MainActivity.CLASSNAME) + ": ID token: ") + result));
    if (result != null) {
        tokenId = result;
    }else {
    }
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.d(com.project.uoft.thermostat_interface.MainActivity.TAG, "onStop");
    mNest.removeAllListeners();
    com.project.uoft.thermostat_interface.Auth.removeAuthListener();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setupToolbar();
    setupSlidingMenu();
    displayView(0);
}

public android.app.Activity getPreActivity() {
    int size = com.hitomi.aslibrary.ActivityManager.activityStack.size();
    if (size < 2)
        return null;
    
    return com.hitomi.aslibrary.ActivityManager.activityStack.get((size - 2));
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    hideProgressDialog();
    stopScan();
    if (isFinishing()) {
        no.nordicsemi.android.thingylib.ThingySdkManager.clearInstance();
    }
}

public static edu.sdsu.cs.sharepic.model.Account[] supportedAccounts(android.content.Context context) {
    if ((edu.sdsu.cs.sharepic.model.Account.accounts) == null) {
        edu.sdsu.cs.sharepic.model.Account.accounts = new edu.sdsu.cs.sharepic.model.Account[]{ edu.sdsu.cs.sharepic.model.Dropbox.getInstance(context) };
    }
    return edu.sdsu.cs.sharepic.model.Account.accounts;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String strName = arrayAdapterSort.getItem(which);
    meadSort(which, com.inspiredpanama.inspiredmead.MeadActivity.SORT_TYPE_DEC);
    mAdapter.notifyDataSetChanged();
}

public void reset() {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "reset");
    releaseObjects();
    initObjects();
}

public void onclickSolve(android.view.View view) {
    its.farkel.MainFarkel.hand = its.farkel.MainFarkel.hand.bestHand();
    redisplay();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentIndex) < ((mPagination.size()) - 1)) {
        (mCurrentIndex)++;
        update();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, id.ac.its.ezlyn.TutorialActivity.class);
    startActivity(intent);
}

public void showDdc(java.lang.String url) {
    android.content.Intent intent = new android.content.Intent(context, com.odong.buddhismhomework.pages.DdcActivity.class);
    intent.putExtra("url", url);
    context.startActivity(intent);
}

private void showGameError() {
    new android.app.AlertDialog.Builder(this).setMessage(R.string.error_message).setNeutralButton(android.R.string.ok, this).create().show();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if ((mode_active) && ((mMyLocationOverlay.getMyLocation()) != null)) {
        mapView.getController().setCenter(mMyLocationOverlay.getMyLocation());
    }
}

public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_ENTER)) {
        clearSuggestions();
        fromEditingToSearch(true);
        return true;
    }
    return false;
}

@java.lang.Override
protected void onStop() {
    android.util.Log.i(TAG, "onStopActivity");
    unReceiver();
    super.onStop();
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent e) {
    goToNearestOrigin();
    return false;
}

@java.lang.Override
public void onClick(android.view.View view) {
    editCourse(position, name.getText().toString(), code.getText().toString());
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mPresenter.start();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    if (entryFragmentListener.onSightingEntryPositiveClick(this)) {
        editFragmentListener.onSightingEditNegativeClick(this);
    }
}

@java.lang.Override
public int getItemViewType(int position) {
    if ((position + 1) == (getItemCount())) {
        return com.ray.rssmovie.adapter.EasyListingAdapter.TYPE_ITEM_FOOTER;
    }else {
        return com.ray.rssmovie.adapter.EasyListingAdapter.TYPE_ITEM_NORMAL;
    }
}

public void onHome(android.view.View view) {
    exitReveal();
    view.setClickable(false);
    periodButton.setClickable(true);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    final android.view.View decorView = getDialog().getWindow().getDecorView();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.EditText editText = ((android.widget.EditText) (v));
    editText.setText("");
}

