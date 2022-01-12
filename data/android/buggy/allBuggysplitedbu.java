@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.v("LATLNG", "HANLDE");
}

private void initializeActivity(android.os.Bundle savedInstanceState) {
    if (savedInstanceState == null) {
        this.cityId = getIntent().getIntExtra(ru.innopolis.innoweather.presentation.view.activity.MainActivity.INTENT_EXTRA_PARAM_CITY_ID, 2172797);
        addFragment(R.id.fragmentContainer, new ru.innopolis.innoweather.presentation.view.fragment.CitiesListFragment());
    }else {
    }
}

private engine.LocalFolder getStorage() {
    if ((mStorage) == null) {
        java.io.File root = android.os.Environment.getExternalStorageDirectory();
        mStorage = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
        mStorage.setPredefinedThumbnail(R.drawable.ic_home_grey600_24dp);
    }
    return mStorage;
}

@java.lang.Override
public void changePath(org.brandroid.openmanager.data.OpenPath path) {
    try {
        mPathItems = path.list();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (onFocusListener != null) {
        if (hasFocus) {
            performClick();
            clearFocus();
        }
        mHasFocus = hasFocus;
        onFocusListener.onFocusChanged(hasFocus);
    }
}

public void add(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    fileUri = com.example.arjun.nhacks.GroupHardActivity.getOutputMediaFileUri();
    intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
    startActivityForResult(intent, com.example.arjun.nhacks.GroupHardActivity.CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("textview clicked");
}

public void onLoadProductsFail() {
    android.widget.Toast.makeText(getContext(), R.string.products_load_fail, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void stop() {
    android.content.BroadcastReceiver receiver;
    if (((batteryLevelReceiver) != null) && ((receiver = batteryLevelReceiver.get()) != null)) {
        service.unregisterReceiver(receiver);
        batteryLevelReceiver = null;
    }
}

@java.lang.Override
protected void onBeaconInRange(java.lang.String address, double distance) {
    android.util.Log.d(edu.umass.cs.prepare.metawear.BeaconService.TAG, ("address: " + address));
    android.util.Log.d(edu.umass.cs.prepare.metawear.BeaconService.TAG, ("distance: " + distance));
    serviceManager.startMetawearService(address);
}

public void initialize() {
    try {
        mHandle = com.thundersoft.hz.selfportrait.detect.FaceDetect.native_create();
    } catch (java.lang.UnsatisfiedLinkError e) {
        e.printStackTrace();
        android.util.Log.e(com.thundersoft.hz.selfportrait.detect.FaceDetect.TAG, "could not link native handle for ts_detected_face_jni library!");
    }
}

private void loadMain() {
    android.content.Intent intent = new android.content.Intent(this, com.culture.coffee.coffee_culture.Main.class);
    startActivity(intent);
}

@butterknife.OnClick(value = R.id.admin_user_delete)
public void onDeleteClick(android.view.View view) {
    blueprint.com.sage.utility.network.NetworkUtils.logoutCurrentUser(getActivity());
}

@java.lang.Override
public void onItemSelected() {
    super.onItemSelected();
    layout.setAlpha(0.5F);
    android.util.Log.e("DRAG", "DRAG");
}

@java.lang.Override
public void onSessionDestroyed() {
    android.util.Log.v(com.android.bluetooth.avrcp.Avrcp.TAG, "MediaController session destroyed");
    if ((mMediaController) != null) {
        removeMediaController(mMediaController.getWrappedInstance());
        mMediaController.unregisterCallback(mMediaControllerCb);
        mMediaController = null;
    }
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d(PACKAGE_NAME, "AlwaysOnTop : onStartCommand");
    OnTop_view.setSystemUiVisibility(ui_Options);
    timer_start();
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.jonathan.james.eric.project_3.models.ArticleSearch.ArticleSearchList> call, java.lang.Throwable t) {
    android.util.Log.e(com.jonathan.james.eric.project_3.APIServicesDebug.TAG, "onFailure: Could not establish Connection", null);
}

private android.content.res.ThemeConfig getThemeConfig() {
    final android.content.res.Configuration config = getConfiguration();
    return config != null ? config.themeConfig : null;
}

@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onPreMigrate() {
    mQuery = new com.raizlabs.android.dbflow.sql.QueryBuilder(new com.raizlabs.android.dbflow.sql.language.Update().table(mTable).set(mSetConditionQueryBuilder).where(mWhereConditionQueryBuilder).getQuery());
}

@android.support.annotation.NonNull
private <T> rx.Observable<T> toObservable(final java.lang.Class<T> type) {
    return subject.ofType(type);
}

public boolean isSwitcherButtonEnabled() {
    return mIsInLandscapeMode ? ((mSwitcherButtonDP.getVisibility()) == (android.view.View.VISIBLE)) || ((mSwitcherButtonTP.getVisibility()) == (android.view.View.VISIBLE)) : mPortraitButtonHandler.isSwitcherButtonEnabled();
}

@java.lang.Override
protected void onPreExecute() {
    android.util.Log.d("preexe", "edit schedule start");
    super.onPreExecute();
    mProgress.setVisibility(View.VISIBLE);
}

public static void navigateToTestingFolder(io.appium.java_client.android.AndroidDriver driver) {
    com.amaze.filemanager.test.Utilities.Utils.openDrawer(driver);
    driver.findElementByName(com.amaze.filemanager.test.Utilities.Utils.storageText).click();
    com.amaze.filemanager.test.Utilities.Utils.searchInVisibleListWithName(driver, com.amaze.filemanager.test.Utilities.Utils.generalTestingFolder).click();
}

protected android.app.Activity getContext() {
    return currentActivity.get();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    databaseHandler.deleteReminder(specifiedReminders.get(listPos));
    timeOnlyReminders.remove(listPos);
    eventListAdapter.notifyDataSetChanged();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.i(com.intersog.androidcourse.rimma.googlemaphw19.MapsActivity.TAG, "onCreate");
    setContentView(R.layout.activity_maps);
    setUpMapIfNeeded();
    buildGoogleApiClient();
    createLocationRequest();
}

public static void putLong(java.lang.String key, java.lang.String value) {
    android.content.SharedPreferences sharedPreferences = cn.ieclipse.af.util.SharedPrefsUtils.getSharedPreferences();
    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
    edit.putString(key, value);
    edit.commit();
}

private void addMissionItem(int index, com.o3dr.services.android.lib.drone.mission.item.MissionItem missionItem) {
    missionItemProxies.add(index, new org.droidplanner.android.proxy.mission.item.MissionItemProxy(this, missionItem));
    notifyMissionUpdate();
}

public static float dpToPx(float dp, android.content.Context context) {
    android.content.res.Resources resources = context.getResources();
    android.util.DisplayMetrics metrics = resources.getDisplayMetrics();
    float px = dp * ((metrics.densityDpi) / 160.0F);
    return px;
}

public static void start(@android.support.annotation.NonNull
de.jonasrottmann.realmbrowser.Context context, @android.support.annotation.NonNull
java.lang.String realmFileName) {
    android.content.Intent intent = new android.content.Intent(context, de.jonasrottmann.realmbrowser.RealmModelsActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.putExtra(de.jonasrottmann.realmbrowser.RealmModelsActivity.EXTRAS_REALM_FILE_NAME, realmFileName);
    context.startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    tvInfo.setVisibility(View.GONE);
    tvError.setVisibility(View.GONE);
    createAccount();
}

public static void getParcelable(android.os.Bundle savedInstanceState, com.jparkie.givesmehope.models.Anthology anthology) {
    if (savedInstanceState != null) {
        anthology = savedInstanceState.getParcelable(com.jparkie.givesmehope.models.Anthology.PARCELABLE_KEY);
    }else {
        throw new java.lang.IllegalArgumentException(((com.jparkie.givesmehope.models.Anthology.TAG) + ": \'getParcelable\' Method has null argument: savedInstanceState."));
    }
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.TextView currentItem = ((android.widget.TextView) (view));
    strikeThroughTextView(currentItem);
    return false;
}

@java.lang.Override
public void onProgressChanged(android.webkit.WebView view, int newProgress) {
    super.onProgressChanged(view, newProgress);
    if (newProgress > 10) {
        progressBar.setIndeterminate(false);
        progressBar.setProgress(newProgress);
    }
}

private void createDialog() {
    transDialog = new android.support.v7.app.AlertDialog.Builder(com.hitomi.tilibrary.transfer.Transferee.context, getDialogStyle()).setView(transLayout).create();
    transDialog.setOnShowListener(this);
    transDialog.setOnKeyListener(this);
}

public void onClick(android.content.DialogInterface dialog, int whichIn) {
    openDatabase(files[which], false);
}

public android.graphics.Rect draw(android.graphics.Canvas canvas) {
    android.graphics.Rect srcRect = getSrcRect();
    canvas.drawBitmap(bm, srcRect, mScrRect, null);
    return mScrRect;
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    startedAnimators.remove(animation);
    view.setInAnimation(false);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.util.Log.i("MainActivityFragment", "Spinner On Item Selected is chosen");
    updateSortingCriteriaPreference(i);
    updateMovies();
}

@com.facebook.react.bridge.ReactMethod
public java.lang.String version(@android.support.annotation.NonNull
com.facebook.react.bridge.Callback callback) {
    java.lang.String version = com.vwo.mobile.VWO.version();
    callback.invoke(null, version);
    return version;
}

@org.junit.BeforeClass
public static void setUpClass() {
    com.ddiehl.timesincetextview.TimeSinceTextViewAndroidTest.mContext = android.support.test.InstrumentationRegistry.getContext();
}

@java.lang.Override
public void onError(java.lang.Exception error) {
    hideLoginProgress();
    java.lang.String errorMessage = (error == null) ? error.getMessage() : "Error";
    android.widget.Toast.makeText(activity, errorMessage, Toast.LENGTH_LONG).show();
}

public void stopPedometerEvent(android.view.View view) {
    com.samsung.android.sdk.remotesensor.SrsRemoteSensor sensor;
    sensor = pedoSensorList.get(0);
    appsandmaps.temple.edu.self.MainActivity.mServiceManager.unregisterListener(this, sensor);
}

public void connectServer(android.view.View view) {
    _BluetoothUtility.connect(_BluetoothDevice);
    android.widget.Button button = ((android.widget.Button) (findViewById(R.id.button3)));
    button.setEnabled(false);
}

public void changeToSelectedSection(com.mcgearybros.vroomvroom.NavigationSubItem selectedSubItem) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction selectedTransaction = fragmentManager.beginTransaction();
    selectedTransaction.setCustomAnimations(R.anim.slide_out_left, R.anim.slide_in_right, R.anim.slide_in_left, R.anim.slide_out_right);
    changeToNewSection(selectedSubItem, selectedTransaction);
}

public long createPtr(long parent, android.view.Surface surface) {
    return createRenderer(parent, surface);
}

@butterknife.OnClick(value = R.id.sign_up_tv)
public void signUp() {
    android.content.Intent intent = new android.content.Intent(this, com.geekhub.choosehelper.screens.activities.SignUpActivity.class);
    intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NO_ANIMATION) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(intent);
    finish();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.orhanobut.logger.Logger.init("test").hideThreadInfo().setMethodCount(40);
    printNormalLog();
    printPretty();
}

private void openDateDialog() {
    com.example.eliasvensson.busify.DateDialog dialog = new com.example.eliasvensson.busify.DateDialog(this);
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    dialog.show(ft, "DatePicker");
}

@java.lang.Override
public void onClick(android.view.View view, int position) {
    com.exalt.vmuseum.services.PlacesResponseService.getPlaceDetails(position, placeDetailsCallback);
}

private void updateItemList(java.util.List<java.lang.String> titles) {
    if (titles != null)
        itemTitles = titles;
    
    android.widget.ArrayAdapter adapter = new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, itemTitles);
    itemList.setAdapter(adapter);
}

@java.lang.Override
protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
    if ((layoutParams instanceof com.clilystudio.netbook.reader.ReaderViewPager.ct) && (super.checkLayoutParams(layoutParams))) {
        return true;
    }
    return false;
}

public void setActivateOnItemClick(boolean activateOnItemClick) {
    this.activateOnItemClick = activateOnItemClick;
    getListView().setChoiceMode((activateOnItemClick ? android.widget.ListView.CHOICE_MODE_SINGLE : android.widget.ListView.CHOICE_MODE_NONE));
}

public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    this.maybeFireLoadMore();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d("onResume", "GoogleLogIn");
}

public void xMinusClickListener(android.view.View view) {
    cubeRotationView.setXRotation(((cubeRotationView.getXRotation()) + (rotationStep)));
    cubeRotationView.invalidate();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.loopeer.bottomimagepicker.PickerFragment.newInstance(mImageFolders.get(position).images);
}

public void gotoHome() {
    android.content.Intent gotoHome = new android.content.Intent(getBaseContext(), moanainc.com.moana.controllers.HomeActivity.class);
    getBaseContext().startActivity(gotoHome);
}

protected void onHandleWrappedAdapterItemRangeChanged(int positionStart, int itemCount, java.lang.Object payload) {
    com.h6ah4i.android.widget.advrecyclerview.utils.BaseWrapperAdapter.notifyItemRangeChanged(positionStart, itemCount, payload);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    getFragmentManager().beginTransaction().replace(R.id.settings_content, new project.android.udacity.com.popularmovies.app.SettingsFragment()).commit();
}

public void onLowMemory() {
    info("onLowMemory");
    com.androidquery.callback.BitmapAjaxCallback.clearCache();
    cs.java.lang.Lang.application().logger().onLowMemory();
    super.onLowMemory();
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    strBankName = spinnerBankName.getSelectedItem().toString();
    autoBranchCode.setText("");
    fetchBancaBranchdata(strBankName);
}

public static void putFloat(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Float value) {
    long start = java.lang.System.currentTimeMillis();
    com.pepperonas.aesprefs.AesPrefs.put(key, java.lang.String.valueOf(value));
    com.pepperonas.aesprefs.AesPrefs.mDuration += (java.lang.System.currentTimeMillis()) - start;
}

@java.lang.Override
public final void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int position) {
    if (viewHolder instanceof com.pierfrancescosoffritti.shrinkingimagelayout.HeaderRecyclerViewAdapter.HeaderViewHolder)
        return ;
    
    onBindViewHolder_(((VH) (viewHolder)), position);
}

private void fetchViews() {
    listView = ((android.widget.ListView) (rootView.findViewById(R.id.collection_item_list)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    eventExec(nameEditText, nameClickList, "lastName");
    nameEditText.setHint("Tap again to start enter");
}

@java.lang.Override
public void onClick(android.view.View v) {
    popupu(1);
}

@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    mItemTouchHelperAdapter.onItemDismiss(viewHolder.getAdapterPosition());
}

@java.lang.Override
public void putAll(@android.support.annotation.NonNull
final java.util.Map<? extends K, ? extends V> map) {
    for (K key : map.keySet()) {
        put(key, map.get(key));
    }
}

public void foodSelection3(android.view.View view) {
    android.content.Intent startFood3 = new android.content.Intent(this, com.example.jacksonhoang.citygoer.foodActivity3.class);
    startActivity(startFood3);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mDrinkCountOrders.setText((++(countCurrent)));
}

@java.lang.Override
public boolean onItemClick(android.view.View view, int position, com.mikepenz.materialdrawer.model.interfaces.IDrawerItem drawerItem) {
    android.content.Intent intent = new android.content.Intent(activity, com.dreamsofpines.mcunost.ui.activities.CategoriesActivity.class);
    activity.startActivity(intent);
    activity.finish();
    return false;
}

private void handleSetNavigationIcon(java.lang.Object object) {
    navigationIcon = object;
    org.appcelerator.titanium.view.TiDrawableReference tiDrawableReference = org.appcelerator.titanium.view.TiDrawableReference.fromObject(proxy.getActivity(), object);
    ((android.support.v7.widget.Toolbar) (getNativeView())).setNavigationIcon(tiDrawableReference.getDrawable());
}

public void showRoundImage(android.graphics.Bitmap bitmap, android.widget.ImageView view) {
    new lu.schoolido.sukutomo.sukutomo.Card.LoadImage(view).execute(round_card_image, null);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (yesListener != null)
        yesListener.onClick(dialog, which);
    
    displayedAlerts.remove(message);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.admin.a1_workout.ui.WorkoutActivity.startActivity(getApplicationContext(), holder.getAdapterPosition());
}

public double editTextToDouble(android.widget.EditText et) {
    double db = 0.0;
    db = java.lang.Double.parseDouble(et.getText().toString().replace("$", ""));
    return db;
}

private void setUpRecyclerView() {
    adapter = new com.blstream.studybox.decks_view.DecksAdapter();
    adapter.setOnItemClickListener(this);
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.GridLayoutManager(this, columnQuantity));
    recyclerView.setHasFixedSize(true);
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
    ((com.dbl_appdevelopment.group2.todomaster.controller.App) (getApplication())).getTaskManager().getAllTasks().clear();
    startActivity(new android.content.Intent(getMe(), com.dbl_appdevelopment.group2.todomaster.view.StartupActivity.class));
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.widget.Toast.makeText(this, ((error.toString()) + "hello prateek"), Toast.LENGTH_LONG).show();
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d("DEBUG", "onCreate EvacuationActivity");
    setContentView(R.layout.evacuation_activity);
    initViews();
    initComponents(savedInstanceState);
}

@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_demo_selector);
    if ((android.os.Build.VERSION.SDK_INT) >= 11)
        getActionBar().setTitle("Choose Demo Project");
    
    setupChaptersListView();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.lnyp.recyclerview.RecyclerViewStateUtils.setFooterViewState(getActivity(), listJuzi, mHasMore, RecyclerViewLoadingFooter.State.Loading, null);
    com.apkfuns.logutils.LogUtils.e("11111111111111111111");
    qryMeijus();
}

@java.lang.Override
public void onClick(android.view.View view) {
    mMapFragment.showAllFloors();
    mMapFragment.showMarkersForSpecificFloor(2);
}

private static boolean hasWriteSecureSettingsPermission(android.content.Context context) {
    return ((Build.VERSION.SDK_INT) > (Build.VERSION_CODES.M)) && ((context.checkSelfPermission(Manifest.permission.WRITE_SECURE_SETTINGS)) == (android.content.pm.PackageManager.PERMISSION_GRANTED));
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parentView) {
    return ;
}

@java.lang.Override
protected io.dflabs.sample.views.adapters.FruitAdapter.FruitViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType, android.support.v7.widget.RecyclerView recyclerView) {
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fruit, parent, false);
    return new io.dflabs.sample.views.adapters.FruitAdapter.FruitViewHolder(v);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_main);
    initView();
    initData();
    setListener();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((qrCodeReaderView) != null) {
        qrCodeReaderView.stopCamera();
    }
    startActivity(new android.content.Intent(this, com.project.greenfuture.petugas.activity.Main2Activity.class));
    this.finish();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeInt(this.id);
    dest.writeString(this.author);
    dest.writeString(this.content);
    dest.writeString(this.url);
}

@java.lang.Override
public void onObjectReceived(com.android_project.grocery.model.entities.User user) {
    addNewUserToLocal(user);
    handler.onObjectReceived(user);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setupUI(todos);
}

@java.lang.Override
public void openDataContextMenu(android.view.View view) {
    this.getActivity().openContextMenu(view);
}

@java.lang.Override
public int getItemViewType(int position) {
    if (data.isEmpty())
        return com.teinvdlugt.android.greekgods.AllPeopleRecyclerViewAdapter.NO_PEOPLE_ITEM_VIEW_TYPE;
    else
        return com.teinvdlugt.android.greekgods.AllPeopleRecyclerViewAdapter.PERSON_ITEM_VIEW_TYPE;
    
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.i("XXX", "Surface destroyed !!");
    if ((com.example.acedeno.customcamera.CustomCameraActivity.camera) != null) {
        com.example.acedeno.customcamera.CustomCameraActivity.camera.stopPreview();
        com.example.acedeno.customcamera.CustomCameraActivity.camera.release();
        com.example.acedeno.customcamera.CustomCameraActivity.camera = null;
        previewing = false;
    }
}

@java.lang.Override
protected void confirm() {
    android.util.Log.d("looking up: ", mScanResult);
    sRequestManager.requestSearchByCode(mScanResult, mAuthToken, mUserId, new phc.android.Services.ServicesScannerConfirmationFragment.SearchByCodeResponseListener(), new phc.android.Services.ServicesScannerConfirmationFragment.SearchByCodeErrorListener());
}

@java.lang.Override
public void onBackPressed() {
    java.lang.String circStr = parser.elementsToTxt(com.cpen321.circuitsolver.ui.draw.DrawActivity.circuitElms, screenHeight, screenWidth);
    circuitProject.saveCircuitDefinitionFile(circStr);
    android.content.Intent backToHomeIntent = new android.content.Intent(this, com.cpen321.circuitsolver.ui.HomeActivity.class);
    startActivity(backToHomeIntent);
    finish();
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.house_menu, menu);
    super.onCreateOptionsMenu(menu, inflater);
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    anipr.transtech.android.ApplicationClass.applicationInstance = new anipr.transtech.android.ApplicationClass();
    com.crittercism.app.Crittercism.initialize(getApplicationContext(), "54d8c0e651de5e9f042ed84c");
}

public void onClick(android.view.View v) {
    android.widget.Button addButton = myView.findViewWithTag(v.getTag());
    changeButtonColor(addButton, index);
    openShoppingList();
}

