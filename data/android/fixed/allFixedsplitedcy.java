@java.lang.Override
public void onClick(android.view.View v) {
    com.example.mervesimsek.vehicleapp.common.CommonObjectManager.VehicleListSelectedRowModel = holder.vehicleViewHolder;
    showVehicleDetailActivityController(currentContext);
}

@android.support.annotation.CallSuper
protected void onBackground() {
    superCalled = true;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    superOnBackPressed();
    if (((fileName) != null) && (!(newFileName.isEmpty()))) {
        deletePicRef(newPicRef);
    }
}

@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        handleIntent(getIntent());
    }
}

@java.lang.Override
protected void onPause() {
    super.onPause();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
}

public void update() {
    data = com.wagner.marcel.ManagedSettings.Generaldata.Modeprocessing.ModeFactory.getModeListArray(getContext());
    adapter = new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, data);
    listView.setAdapter(adapter);
    getActivity().recreate();
}

public void onItemClick(android.view.View view, int position) {
    if (position != 0)
        de.oerntec.votenote.MainDialogHelper.showChangeLessonDialog(((de.oerntec.votenote.MainActivity) (getActivity())), mSubjectId, ((java.lang.Integer) (view.getTag())));
    
}

@java.lang.Override
public void onCharacteristicWrite(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_report);
    initializeHelpers();
    initializeWidgets();
    initializeGoogleApiClient();
}

private void setPlayButton() {
    android.util.Log.d("control", "setPlayButton-play button set to play");
    playButton.setImageResource(R.drawable.ic_play_arrow_black_48dp);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.os.Bundle bundle = intent.getExtras();
    if ((gridViewUser) != null)
        gridViewUser.hideRequestAnnouncement();
    
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onAdFailedToLoad(int error) {
    android.util.Log.d(com.samcodes.admob.InterstitialListener.TAG, "onInterstitialFailedToLoad");
    com.samcodes.admob.AdMobExtension.callHaxe("onInterstitialFailedToLoad", new java.lang.Object[]{ id });
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    mClearMapLimit = true;
    mPage = 1;
    refreshActiveFilters();
    loadObservations();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View v, int position, long id) {
    mAction = mAdapter.getItem(position);
    updateListToShowCurrentAction(true);
    return ;
}

@java.lang.Override
public long getItemId(int position) {
    if (position < (mResults.size())) {
        return mResults.get(position).getDateAdded();
    }
    return android.support.v7.widget.RecyclerView.NO_ID;
}

@java.lang.Override
public void onTagSelected(prada.lab.android.pingo.model.Tag tag, boolean selected) {
    mRootVm.updateTagState(tag, selected);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.i(LOG_TAG, ((getId()) + ".onSaveInstanceState()"));
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(app.program.SettingsActivity.SettingsFragment.KEY_PREF_LANGUAGE)) {
        android.widget.Toast.makeText(getActivity(), sharedPreferences.toString(), Toast.LENGTH_SHORT).show();
    }
}

public static com.github.xzwj87.todolist.schedule.observer.ScheduleDataObserver getInstance(java.lang.String type) {
    return new com.github.xzwj87.todolist.schedule.observer.ScheduleDataObserver(type, new android.os.Handler());
}

private void clearPreviousView(android.widget.TextView previousView) {
    if (previousView != null) {
        previousView.setText("");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.slavyanin.example.loginpasswordform.LoginPasswordActivity.class);
    startActivity(intent);
}

@java.lang.Override
public android.support.design.widget.TextInputLayout createViewInstance(com.facebook.react.uimanager.ThemedReactContext context) {
    android.support.design.widget.TextInputLayout textInputLayout = new android.support.design.widget.TextInputLayout(context);
    return textInputLayout;
}

private void log(@android.support.annotation.NonNull
java.lang.String message) {
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.test_layout);
    initView();
    initListener();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.sensorberg.SensorbergApplicationBootstrapper.getComponent().inject(this);
    Logger.log.logServiceState("onCreate");
}

public void init() {
    android.os.HandlerThread handlerThread = new android.os.HandlerThread("zz_handler_thread");
    handlerThread.start();
    android.os.Looper looper = handlerThread.getLooper();
    mHandler = new android.os.Handler(looper);
}

public static void deleteSensorFromDB(com.example.ludvig.sens.SensorDBItem sensor, android.database.sqlite.SQLiteDatabase db) {
    nl.qbusict.cupboard.CupboardFactory.cupboard().withDatabase(db).delete(sensor);
}

void onClick(int rowIndex, com.example.android.mastermind.LineOfCirclesViewHolder viewHolder);

@java.lang.Override
public void run() {
}

@java.lang.Override
public void onLoadItem(int position, com.github.yuqilin.qmediaplayerapp.media.MediaWrapper video) {
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((intent.getAction().equals(WifiManager.WIFI_STATE_CHANGED_ACTION)) && (!(mWifiHelper.isConnectedToWifi()))) {
        stop(false);
    }
}

private void requestDeparture() {
    journeyPlanner.getDepartureBoard(this, java.util.Calendar.getInstance(), stopLocation);
    departureSwipeRefreshLayout.setRefreshing(true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    onChipInteraction(this, translateIdToConst(v));
}

@java.lang.Override
public void onClick(android.view.View view) {
    restartApp();
}

private int getContactID(android.database.Cursor contactLookupCursor) {
    int phoneContactID = -1;
    if ((null != contactLookupCursor) && (contactLookupCursor.moveToFirst())) {
        phoneContactID = contactLookupCursor.getInt(contactLookupCursor.getColumnIndexOrThrow(ContactsContract.PhoneLookup._ID));
    }
    return phoneContactID;
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
}

@java.lang.Override
public boolean onCreate() {
    mDBhelper = new com.example.android.fitnessapp.database.ExerciseOpenHelper(getContext());
    return true;
}

@java.lang.Override
public void onAdError(com.google.ads.interactivemedia.v3.api.AdErrorEvent adErrorEvent) {
    android.util.Log.e(TAG, ("Ad Error: " + (adErrorEvent.getError().getMessage())));
    if ((mVideoPlayer) != null) {
        mVideoPlayer.setPlayWhenReady(true);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mProgressBar = ((com.antonzorin.dottedprogressbar.DottedProgressBar) (findViewById(R.id.progress)));
    mProgressBar.setClockWiseDots(false);
}

@java.lang.Override
public boolean onAnimationEnd(android.view.View view) {
    setVisibility(com.radiationpressure.mickhardins.mtgrecall.searchview.GONE);
    return false;
}

@java.lang.Override
public void delete() {
    executeTransaction(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder<>(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel<com.raizlabs.android.dbflow.structure.TModel>() {
        @java.lang.Override
        public void processModel(com.raizlabs.android.dbflow.structure.TModel model) {
            model.delete();
        }
    }).add(model).build());
}

public void run() {
    android.app.Fragment currentFragment = fm.findFragmentByTag(MainActivity.MAP_FRAGMENT_TAG);
    if (currentFragment instanceof lk.steps.breakdownassist.Fragments.GmapFragment) {
        lk.steps.breakdownassist.Fragments.GmapFragment GmapFrag = ((lk.steps.breakdownassist.Fragments.GmapFragment) (currentFragment));
        GmapFrag.FocusBreakdown(BreakdonwList.get(position));
    }
}

public static void destroyInstance() {
    if ((com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance) != null) {
        com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance.destroy();
        com.android_project.grocery.controller.database.models.UserGroceryListsModel.instance = null;
    }
}

@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.back_arrow_image :
            finish();
            break;
        case R.id.focused_action_fab :
            addEventView();
            break;
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    updateDesktopClock();
}

public abstract void bind(android.content.Context context, M item, int position);

@java.lang.Override
public void onClick(android.view.View v) {
    if ((itemClickListener) != null)
        itemClickListener.onItemClick(null, itemView, getLayoutPosition(), 0);
    
}

private boolean checkPermission() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, com.duyuan.photoview.PhotoActivity.PERMISSIONS[0])) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, com.duyuan.photoview.PhotoActivity.PERMISSIONS, com.duyuan.photoview.PhotoActivity.PERMISSION_CODE);
        return false;
    }
    return true;
}

protected android.content.Intent addDestinationIntent(com.indragie.cmput301as1.Destination destination) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(com.indragie.cmput301as1.DestinationAddActivity.EXTRA_DESTINATION, destination);
    return intent;
}

public void setEmptyView(boolean isHeadAndEmpty, android.view.View emptyView) {
    setEmptyView(isHeadAndEmpty, false, emptyView);
}

protected void setView(android.widget.ImageView imageView, int image_loading, int image_error) {
    mImageView = imageView;
    if (image_loading != 0)
        mLoadingImage = image_loading;
    
    if (image_error != 0)
        mErrorImage = image_error;
    
}

@java.lang.Override
public void onStartFailure(int errorCode) {
    if (errorCode != (ADVERTISE_FAILED_ALREADY_STARTED)) {
        java.lang.String msg = "Service failed to start: " + errorCode;
        mHandler.sendMessage(android.os.Message.obtain(null, 0, msg));
    }else {
    }
}

public void exoPlayerPlay() {
    if ((isPlaying()) == false) {
        play();
    }
}

@java.lang.Override
protected int sizeOf(java.lang.String key, android.graphics.Bitmap bitmap) {
    return bitmap.getByteCount();
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
}

private com.kontakt.sdk.android.ble.configuration.ScanPeriod getScanPeriod(java.lang.String mode) throws java.lang.Exception {
    switch (mode) {
        case "RANGING" :
            return com.kontakt.sdk.android.ble.configuration.ScanPeriod.RANGING;
        case "MONITORING" :
            return com.kontakt.sdk.android.ble.configuration.ScanPeriod.MONITORING;
        default :
            throw new java.lang.Exception("scanPeriod default value has to be either RANGING or MONITORING");
    }
}

private void saveNewBestTime(long newBestTime) {
    android.content.SharedPreferences.Editor prefEditor = sharedPref.edit();
    prefEditor.putLong("bestTime", newBestTime);
    prefEditor.commit();
}

@java.lang.Override
public void onLeScan(final android.bluetooth.BluetoothDevice device, final int rssi, byte[] scanRecord) {
    addDevice(device, rssi);
}

@java.lang.Override
public void onCompleted(java.lang.Exception e, android.widget.ImageView result) {
    if (e != null)
        return ;
    
    loaded = true;
    progressbar.setVisibility(View.GONE);
    attacher = new uk.co.senab.photoview.PhotoViewAttacher(imageView);
    attacher.setMaximumScale(25);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initContainer(savedInstanceState);
}

@java.lang.Override
public void onEnabled(android.content.Context context) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        onItemClickListener.onItemClick(getAdapterPosition());
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.util.Log.i(TAG, "MainActivity.onCreateOptionsMenu()");
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    mMenu = menu;
    return true;
}

private void selectPgnFileDialog() {
    selectFileDialog(org.mdc.chess.MDChess.pgnDir, R.string.select_pgn_file, R.string.no_pgn_files, "currentPGNFile", new org.mdc.chess.MDChess.Loader() {
        @java.lang.Override
        public void load(java.lang.String pathName) {
            loadPGNFromFile(pathName);
        }
    });
}

@java.lang.Override
public boolean onStartNestedScroll(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.widget.AppBarLayout child, android.view.View directTargetChild, android.view.View target, int nestedScrollAxes) {
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplication(), heartware.com.heartware_master.ViewWorkout.class);
    intent.putExtra(DBAdapter.PROFILE_ID, mCurrentProfileId);
    startActivityForResult(intent, 1);
    android.util.Log.d(heartware.com.heartware_master.WorkoutsActivity.TAG, "Creating a New Workout.");
}

private void showHint(java.lang.String message) {
    if (message != null) {
    }
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    butterknife.ButterKnife.bind(this, view);
    super.onViewCreated(view, savedInstanceState);
}

public boolean isValiable() {
    if ((((id) < (org.droidplanner.android.ruan.RcConfigParam.mRcCount)) && ((id) >= 0)) && (valiable)) {
        return true;
    }else {
        return false;
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
    typeID = radioGroup.indexOfChild(findViewById(i));
}

public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
}

@java.lang.Override
public void onProviderDisabled(java.lang.String provider) {
    android.widget.Toast.makeText(getApplicationContext(), "Please Enable Location", Toast.LENGTH_LONG).show();
    if ((actionBarMenu) != null) {
        actionBarMenu.findItem(R.id.action_park).setVisible(false);
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
        context.startService(new android.content.Intent(context, com.ganet.catfish.ganet_service.GaNetService.class));
    }
}

@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_sign_in);
    setUpButtons();
}

@java.lang.Override
public void onClick(android.view.View view) {
    new com.example.android.popularmoviesstagetwo.tasks.ManageFavouritesAsyncTask(getActivity(), favouriteButton, movieDetails, true).execute();
}

@java.lang.Override
public void onDestroy() {
    org.brandroid.utils.Logger.LogDebug(("->onDestroy - " + (getClassName())));
    super.onDestroy();
}

public static boolean canUseToken(android.content.Context context, int instance) {
    return false;
}

@java.lang.Override
public int getColour(java.lang.String markerName) throws android.os.RemoteException {
    return markers.get(markerName).getColor();
}

@java.lang.Override
public novoda.lib.sqliteprovider.util.Constraint parseRow(android.database.Cursor cursor) {
    int isUnique = cursor.getInt(2);
    if (isUnique == 1) {
        java.lang.String indexName = cursor.getString(1);
        return getConstraintFromIndex(indexName);
    }
    return null;
}

void onDashboarButtonClick(android.view.View view);

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.example.portable.firebasetests.network.FirebaseUtils.getInstance().deleteTag(tag);
}

public com.brouding.simpledialog.SimpleDialog.Builder setGuideImage(@android.support.annotation.DrawableRes
int imageId) {
    setGuideImage(imageId, null);
    return this;
}

public static android.graphics.Bitmap decodeBase64(java.lang.String input) {
    input = input.replace("~", "/");
    byte[] decodedBytes = android.util.Base64.decode(input, Base64.NO_WRAP);
    return android.graphics.BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    ((com.example.user.worktime.TimeTablePagerFragment) (getParentFragment())).changeSelectedDate(new org.joda.time.LocalDate(year, (month + 1), dayOfMonth));
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
}

@java.lang.Override
public void onResult(com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    ru.avb.iremember.G.Log("On result");
    ru.avb.iremember.Google.handleSignInResult(this, googleSignInResult);
}

@java.lang.Override
public void run() {
    com.nordman.big.life.GridView theGrid = mGridView.get();
    if ((theGrid.currentMode) == (com.nordman.big.life.GridView.RUNNING)) {
        theGrid.update();
        theGrid.invalidate();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.cg.historicalfiguresquiz.CategoriesActivity.class);
    this.finish();
    startActivity(i);
}

@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
}

@java.lang.Override
public void onNotificationPosted(android.service.notification.StatusBarNotification sbn) {
    new a2dp.Vol.NotificationCatcher.Readit().execute(sbn);
}

@java.lang.Override
public void run() {
    if ((copy) == null) {
        android.util.Log.v(TDDatabase.TAG, "cannot notify client, client is null");
    }else {
        android.util.Log.v(TDDatabase.TAG, "about to notify client");
        copy.changeTrackerReceivedChange(change);
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, rray.me.androidresume.EducationEditActivity.class);
    startActivityForResult(intent, rray.me.androidresume.MainActivity.REQ_CODE_EDUCATION_EDIT);
}

@java.lang.Override
public void onResponse(retrofit2.Call<okhttp3.ResponseBody> call, retrofit2.Response<okhttp3.ResponseBody> response) {
    android.util.Log.d("RESPONSE", "Feed Remove");
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked)
        cb_nveg.setChecked(false);
    else
        if (!(cb_nveg.isChecked()))
            cb_veg.setChecked(true);
        
    
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    this.setHeight(height);
}

@java.lang.Override
public com.claimant.dev.wheresmybus.adapter.PlatformGridRecyclerViewAdapter.ItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(mContext).inflate(R.layout.item_platform_grid, parent, false);
    return new com.claimant.dev.wheresmybus.adapter.PlatformGridRecyclerViewAdapter.ItemViewHolder(itemView);
}

