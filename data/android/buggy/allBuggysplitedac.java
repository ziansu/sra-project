@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    mCallbacks.onNavigationDrawerItemSelected(0);
}

@java.lang.Override
public com.example.nobell.project4.FeedAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_feed, null);
    return new com.example.nobell.project4.FeedAdapter.ViewHolder(v);
}

@android.support.annotation.MainThread
public void notifyPlaylistChanged() {
    android.util.Log.d(org.bottiger.podcast.playlist.Playlist.TAG, "notifyPlaylistChanged");
    org.bottiger.podcast.SoundWaves.getRxBus().send(this);
    org.bottiger.podcast.SoundWaves.getBus().post(this);
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    loadingInternetDialog = new android.app.ProgressDialog(this);
    loadingInternetDialog.setMessage("Loading...");
    loadingInternetDialog.show();
}

public void startMain() {
    android.content.Intent intent = new android.content.Intent(activity, com.fu.group10.capstone.apps.teachermobileapp.activity.ListRoomActivity.class);
    intent.putExtra("username", username);
    startActivity(intent);
    activity.finish();
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(com.example.android.inventoryapp.data.InventoryDbHelper.SQL_CREATE_ENTRIES);
    onCreate(db);
}

public void showStats(android.view.View view) {
    topDarkActionbar.showStats(0);
}

public void add(android.graphics.Bitmap bitmap) {
    ivList.add(bitmap);
    this.notifyDataSetChanged();
}

public static void api(java.lang.String s) {
    if ((com.joe.zatuji.Constant.IS_DEBUG) || (com.joe.zatuji.helper.SettingHelper.isDebug())) {
        android.util.Log.d("api", s);
    }
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i(logTAG, "SailfishNotificationService starting");
    com.splunk.mint.Mint.initAndStartSession(this, Constants.MINT_API_KEY);
    getPrefAndConnect();
    return START_STICKY;
}

private void setGenderSpinner() {
    android.widget.ArrayAdapter<java.lang.String> spinnerAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, R.layout.support_simple_spinner_dropdown_item, new java.lang.String[]{ "Gender" , "Male" , "Female" });
    spGender.setAdapter(spinnerAdapter);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            showLogoutDialog();
            return true;
        case R.id.action_logout :
            showLogoutDialog();
            return true;
        default :
            return false;
    }
}

protected void profileClick(android.view.View view) {
    startActivity(new android.content.Intent(this, android.duke290.com.loco.ProfileActivity.class));
    finish();
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    event.offsetLocation(offsetX, offsetY);
    controller.touched(event);
    invalidate();
    return true;
}

@java.lang.Override
public void onTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    android.util.Log.e(com.chad.library.adapter.base.listener.SimpleClickListener.TAG, "onTouchEvent: ");
    mGestureDetector.onTouchEvent(e);
}

public void doGuidedTakeoff(double altitude) {
    com.o3dr.android.client.apis.ControlApi.getApi(this).takeoff(altitude);
}

@java.lang.Override
public void onSuccess() {
    android.content.Intent intent = new android.content.Intent(this, framgia.vn.framgiacrb.ui.activity.SplashActivity.class);
    getPlaceFromServer(Session.sAuthToken);
    getUserFromServer(Session.sAuthToken);
    startActivity(intent);
    finish();
}

private void addDatabaseLabel(java.lang.String experimentId, java.lang.String trialId, com.google.android.apps.forscience.whistlepunk.filemetadata.Label label, com.google.android.apps.forscience.whistlepunk.filemetadata.LabelValue labelValue) {
    synchronized(mLock) {
        final android.database.sqlite.SQLiteDatabase db = mDbHelper.getWritableDatabase();
        com.google.android.apps.forscience.whistlepunk.metadata.SimpleMetaDataManager.addDatabaseLabel(db, experimentId, trialId, label, labelValue);
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String createQuery = "";
    for (com.labs.fi141.devicecare.db.Table table : tables.values()) {
        createQuery += table.getCREATE();
    }
    db.execSQL(createQuery);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_signup, container, false);
    initializeButtons();
    setcontrolls();
    LoginFacebook();
    return view;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_screen);
    playername = ((android.widget.EditText) (findViewById(R.id.editText)));
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.Intent intent = new android.content.Intent(this, com.android.grabhouse.FetchAndSaveDataService.class);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
}

@java.lang.Override
public void onPrepareLoad(android.graphics.drawable.Drawable placeHolderDrawable) {
    android.util.Log.i("TAG", "onPrepareLoad bitmap");
}

@java.lang.Override
public java.lang.Boolean pendingData(android.os.Bundle arg) throws java.lang.Exception {
    return au.com.pactera.pacterapulse.helper.NetworkHelper.postVote(vote, context);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mButton.setText("develop");
    int i = 0;
    int j = 0;
    int k = 0;
    int z = 0;
    java.lang.String extra = "master 再次提交";
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.btn_submit :
            submit();
            break;
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
    }else {
    }
}

@android.support.annotation.CallSuper
@android.support.annotation.NonNull
protected io.reactivex.functions.Consumer<java.lang.Throwable> onRefreshItemsLoadFail() {
    return new io.reactivex.functions.Consumer<java.lang.Throwable>() {
        @java.lang.Override
        public void accept(java.lang.Throwable throwable) throws java.lang.Exception {
            doCancelLoading();
        }
    };
}

public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mYear = year;
    mMonth = monthOfYear;
    mDay = dayOfMonth;
    showDialog(getirbitaksi.hackathon.com.getirbitaksihackathon.event.CreateNewEventActivity.TIME_DIALOG_ID);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mButtonSec.setBackgroundColor(res.getColor(R.color.background_buttons));
    mButtonFstop.setBackgroundColor(res.getColor(R.color.background_button_chosen));
    whatWeCalculateFor = 1;
    return false;
}

public void activateBus() {
    synchronized(me.sniggle.android.utils.otto.ActivatorBus.LOCK) {
        for (java.lang.Object event : eventCache) {
            post(event);
        }
        eventCache.clear();
        active = true;
    }
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if (((mCallback) != null) && (mp != null)) {
        mCallback.playerStateChanged(KPlayerCallback.ENDED);
    }
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    tasksDB.deleteTask(getTasks().get(itemPosition));
    getTasks().remove(itemPosition);
    getAdapter().notifyDataSetChanged();
    return true;
}

private android.graphics.drawable.Drawable getColoredBackground(int color) {
    android.graphics.drawable.Drawable circle = getResources().getDrawable(R.drawable.circle);
    circle.setColorFilter(new android.graphics.PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
    return circle;
}

public static android.database.Cursor getFavoriteMovieData(android.content.Context context) {
    com.omegaspocktari.movieprojectone.utilities.TMDbUtils.currentSortingMethod = context.getString(R.string.pref_sorting_favorites);
    return context.getContentResolver().query(FavoriteMovies.CONTENT_URI, null, null, null, null);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    fieldPos = 99;
    ydLn = calcYdLn(fieldPos);
    dialog.cancel();
}

@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.e("Test", "Stop");
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
    TimeManager.TEST.add(radonsoft.mireaassistant.helpers.Global.scheduleNamesOddStringBackup[0]);
    progressDialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View view) {
    view.setMinimumHeight(500);
}

@java.lang.Override
public void onError(android.content.Context context, net.gotev.uploadservice.UploadInfo uploadInfo, net.gotev.uploadservice.ServerResponse serverResponse, java.lang.Exception exception) {
    attach.hasUpload = false;
    cb.failed("上传失败");
}

private boolean isTopVisible(android.support.v7.widget.RecyclerView recyclerView) {
    int position = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager())).findFirstVisibleItemPosition();
    if (position == 0)
        return true;
    else
        return false;
    
}

private void init(android.content.Context context) {
    this.context = context;
    if (de.christinecoenen.code.zapp.utils.ShortcutHelper.areShortcutsSupported()) {
        loadChannelList();
        setSummaryToSelectedChannels();
    }
}

@java.lang.Override
public int getCount() {
    android.util.Log.d("cursor", ((java.lang.Integer.toString(mDB.getCursor().getCount())) + " getCount"));
    return mCS.getCount();
}

@java.lang.Override
public void onAnimationStart(android.view.View view) {
    super.onAnimationStart(view);
    getFab().setVisibility(View.VISIBLE);
    android.support.v4.view.ViewCompat.animate(getFab()).setListener(null);
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getApplicationContext(), "Couldn't get json from server. Check LogCat for possible errors!", Toast.LENGTH_LONG).show();
    (zmiennik)++;
    if ((zmiennik) < 5) {
        runAsync();
    }
    return ;
}

public void increment(android.view.View view) {
    int numberOfCoffees = (quantity) + 1;
    (quantity)++;
    display(numberOfCoffees);
}

@java.lang.Override
public void run() {
    popWindow.setAnimationStyle(android.R.style.Animation);
    popWindow.dismiss();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    rememberEulaAccepted(context);
    login(serverText.toString(), usernameEditText.toString(), passwordEditText.toString());
}

@butterknife.OnClick(value = R.id.searchButton)
void searchProducts(android.view.View view) {
    be.fenego.android_spotshop.utilities.ProductUtility.getProductByText(this, searchEditText.getText().toString());
}

public void onClientConnectionFail() {
    log("Client connection fail !");
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (mRunning) {
                clientConnect();
            }
        }
    }, 5000);
}

public static org.dbtools.android.domain.LocalDateTime longToLocalDateTime(long l) {
    return org.dbtools.android.domain.Instant.ofEpochMilli(l).atZone(org.dbtools.android.domain.ZoneId.systemDefault()).toLocalDateTime();
}

@java.lang.Override
public void onUDPReceive(at.android.smartrobot.network.UDPReceiveEvent e) {
    timeReceiveAcknowlage = e.getTimestamp();
    android.util.Log.d(at.android.smartrobotapp.activities.SmartActivity.TAG, ("ACK: " + (timeReceiveAcknowlage)));
}

@java.lang.Override
protected void onPostExecute(java.lang.String[] result) {
    android.util.Log.v(LOG_TAG, ("Uber total fare is: " + (result[0])));
}

public static void post(java.lang.String url, com.loopj.android.http.RequestParams params, com.loopj.android.http.AsyncHttpResponseHandler responseHandler) {
    ca.shahnewazkhan.locator.LocatorRestClient.client.post(ca.shahnewazkhan.locator.LocatorRestClient.getAbsoluteUrl(url), params, responseHandler);
}

@java.lang.Override
public void OnFalure(java.lang.String msg) {
    if ((mView) == null)
        return ;
    
    isLoading = false;
    android.util.Log.e("tag", ("onFalure    " + msg));
    mView.showMsg(msg);
    mView.hideProgress();
}

public static void showToast(android.content.Context context, int messageiId) {
    android.widget.Toast.makeText(context, context.getResources().getString(messageiId), Toast.LENGTH_SHORT);
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.im_getStarted :
            navigateNextScreen();
            break;
        default :
            break;
    }
}

private static java.util.Set<java.lang.String> getAllKanjiFromRadicalList(java.util.List<com.example.x.androidkanjilookup.RadicalLookup.Radical> radicalList) {
    java.util.HashSet<java.lang.String> output = new java.util.HashSet<java.lang.String>();
    for (com.example.x.androidkanjilookup.RadicalLookup.Radical r : radicalList)
        output.addAll(r.relatedKanji);
    
    return output;
}

@java.lang.Override
public void success(java.lang.Object o, retrofit.client.Response response) {
    android.widget.Toast.makeText(mContext, "Post uploaded!", Toast.LENGTH_SHORT);
    android.util.Log.d("Chooser", "Post uploaded!");
}

public void test_045() {
    framework.common.ClockCommon.switchMode("秒表");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "开始");
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.deskclock:id/right_button");
    check(testcase.Object_Description, testcase.Operation_checkExist, "分享");
    excute(testcase.Object_Description, testcase.Operation_ClickWait, "重置");
}

@java.lang.Override
public void call(android.location.Location location) {
    fragment.setAdapterLocation(location);
    if (location != null) {
        animateTo(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
    }
}

void attachView(V view, android.os.Bundle savedInstanceState, boolean isAttachedOnBackPressed);

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
    }
    return "UNKNOWN";
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (mRbName.isChecked()) {
        mActvNamePreview.setText(s);
    }else {
        mActvLocationPreview.setText(s);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String task = java.lang.String.valueOf(DialogText.getText());
    addEntry(task);
}

private void moveToSignUpActivity() {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.ahmedsaleh.dbse.SignUp.class);
    startActivity(i);
    setContentView(R.layout.activity_sign_up);
}

@java.lang.Override
public void onConnectionSuspended(int i) {
    android.widget.Toast.makeText(this, "onConnectionSuspended", Toast.LENGTH_SHORT).show();
    android.util.Log.d(com.tacticsgames.dontdie.activities.PlayServicesActivity.TAG, "onConnectionSuspended(): attempting to reconnect");
    googleApiClient.connect();
}

private boolean checkPermitGallery() {
    return ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.MANAGE_DOCUMENTS)) == (android.content.pm.PackageManager.PERMISSION_GRANTED));
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        fadeDateTime(1, 300);
        resetState();
        return true;
    }else {
        return super.onKeyDown(keyCode, event);
    }
}

@java.lang.Override
public void onBindViewHolder(com.example.xunhu.xunchat.View.AllAdapters.PhotoGalleryAdapter.ViewHolder holder, int position) {
    android.graphics.Bitmap bitmap = getBitmapFromMediaStore(position);
    if (bitmap != null) {
        holder.getIvPhotoGallery().setImageBitmap(bitmap);
    }
}

private void updateListHeight(android.widget.ListView listView, com.medic.medicapp.WarningAdapter adapter) {
    adapter.notifyDataSetChanged();
    com.medic.medicapp.UIUtils.setListViewHeightBasedOnItems(listView);
}

public static com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment newInstance(boolean isSummaryView) {
    android.os.Bundle args = new android.os.Bundle();
    args.putBoolean(com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment.ARG_SUMMARY_VIEW, isSummaryView);
    com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment fragment = new com.flaredown.flaredownApp.Checkin.FlaringQuestionFragment();
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
protected void onPostExecute(java.lang.String json) {
    android.content.Intent intent = new android.content.Intent(this, ljuboandtedi.fridger.activties.ShowMealActivity.class);
    intent.putExtra("json", json);
    intent.putExtra("search", searchedInfo);
    startActivity(intent);
}

public static void main(java.lang.String[] argArray) throws java.io.IOException {
    int result = new com.android.dx.command.dexer.Main().run(arguments, null, null);
    if (result != 0) {
        java.lang.System.exit(result);
    }
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    mediaPlayer.reset();
    mediaPlayer.release();
    return super.onUnbind(intent);
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.util.Log.i(SmartClosetConstants.SMARTCLOSET_DEBUG_TAG, (((ssar.smartcloset.MainActivity.CLASSNAME) + ": ID token: ") + result));
    if (result != null) {
        tokenId = result;
        authenticateWithBackendServer();
    }else {
    }
}

@java.lang.Override
protected void onStop() {
    android.util.Log.d(com.project.uoft.thermostat_interface.MainActivity.TAG, "onStop");
    super.onStop();
    mNest.removeAllListeners();
    com.project.uoft.thermostat_interface.Auth.removeAuthListener();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    n = $missing$;
    setupToolbar();
    setupSlidingMenu();
    displayView(0);
}

public android.app.Activity getPreActivity() {
    int size = com.hitomi.aslibrary.ActivityManager.activityStack.size();
    if (size < 2)
        return null;
    
    return com.hitomi.aslibrary.ActivityManager.activityStack.elementAt((size - 2));
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    hideProgressDialog();
    if (isFinishing()) {
        stopScan();
        no.nordicsemi.android.thingylib.ThingySdkManager.clearInstance();
    }
}

public static edu.sdsu.cs.sharepic.model.Account[] supportedAccounts(android.content.Context context) {
    if ((edu.sdsu.cs.sharepic.model.Account.accounts) == null) {
        edu.sdsu.cs.sharepic.model.Account.accounts = new edu.sdsu.cs.sharepic.model.Account[]{ edu.sdsu.cs.sharepic.model.FlickrAccount.getInstance(context) , edu.sdsu.cs.sharepic.model.Dropbox.getInstance(context) };
    }
    return edu.sdsu.cs.sharepic.model.Account.accounts;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String strName = arrayAdapterSort.getItem(which);
    android.util.Log.i("onClick: Des: ", java.lang.String.valueOf(which));
    meadSort(which, com.inspiredpanama.inspiredmead.MeadActivity.SORT_TYPE_DEC);
    mAdapter.notifyDataSetChanged();
}

public void reset() {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "reset");
    if ((mediaPlayer) != null) {
        this.currentState = com.github.rtoshiro.view.video.FullscreenVideoView.State.IDLE;
        releaseObjects();
        initObjects();
    }else
        throw new java.lang.RuntimeException("Media Player is not initialized");
    
}

public void onclickSolve(android.view.View view) {
    if ((its.farkel.MainFarkel.hand.held) != 6) {
        return ;
    }
    its.farkel.MainFarkel.hand = its.farkel.MainFarkel.hand.bestHand();
    redisplay();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentIndex) < (mPagination.size())) {
        (mCurrentIndex)++;
        update();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, id.ac.its.ezlyn.TutorialActivity.class);
    startActivity(intent);
    finish();
}

public void showDdc(java.lang.String url, java.lang.String title) {
    android.content.Intent intent = new android.content.Intent(context, com.odong.buddhismhomework.pages.DdcActivity.class);
    intent.putExtra("url", url);
    intent.putExtra("title", title);
    context.startActivity(intent);
}

private void showGameError() {
    new android.app.AlertDialog.Builder(this).setMessage(R.string.error_message).setNeutralButton(android.R.string.ok, null).create();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (mode_active) {
        mapView.getController().setCenter(mMyLocationOverlay.getMyLocation());
    }
}

public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_ENTER)) {
        clearSuggestions();
        fromEditingToSearch();
        return true;
    }
    return false;
}

@java.lang.Override
protected void onStop() {
    android.util.Log.i(TAG, "onStopActivity");
    unReceiver();
}

@java.lang.Override
public void onClick(android.view.View view) {
    int viewId = view.getId();
    switch (viewId) {
        case R.id.id_rb_only_wifi :
            break;
        case R.id.id_rb_any_network :
            break;
    }
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent e) {
    goToNearestOrigin();
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    editCourse(name.getText().toString(), code.getText().toString());
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i("HERE", "start called.");
    mPresenter.start();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    entryFragmentListener.onSightingEntryPositiveClick(this);
    editFragmentListener.onSightingEditNegativeClick(this);
}

@java.lang.Override
public int getItemViewType(int position) {
    android.util.Log.d("raytest", ("Current Item View Position:" + position));
    if ((position + 1) == (getItemCount())) {
        return com.ray.rssmovie.adapter.EasyListingAdapter.TYPE_ITEM_FOOTER;
    }else {
        return com.ray.rssmovie.adapter.EasyListingAdapter.TYPE_ITEM_NORMAL;
    }
}

private void onHome(android.view.View view) {
    exitReveal();
    view.setClickable(false);
    periodButton.setClickable(true);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    final android.view.View decorView = getDialog().getWindow().getDecorView();
    decorView.animate().alphaBy(0.1F).setDuration(1000).start();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.EditText editText = ((android.widget.EditText) (v));
    editText.setHint("");
    editText.setText("");
}

