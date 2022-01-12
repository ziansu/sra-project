@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    Button_LandHere.setSelected(true);
    set_selected_block(3, false);
    return false;
}

@java.lang.Override
public com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if ((mInflater) == null) {
        mInflater = android.view.LayoutInflater.from(mContext);
    }
    return com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder.create(mInflater, parent, mClickListener);
}

@java.lang.Override
public void onClick(android.view.View v) {
    new android.app.AlertDialog.Builder(getParent()).setTitle("Changelog").setMessage(DeprecationHelper.Html.fromHtml(fullUpdateMessage)).setPositiveButton(R.string.dialog_action_positive_close, null).show();
}

public static java.lang.Double getDoubleFromPreferences(android.content.Context context, java.lang.String name) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return java.lang.Double.valueOf(preferences.getFloat(name, 0));
}

@java.lang.Override
public void onDestroyView() {
    android.util.Log.d(mclab1.pages.MediaPlayerFragment.tag, ("height = " + (mclab1.pages.MediaPlayerFragment.controller.getHeight())));
    mclab1.pages.MediaPlayerFragment.controller.removeAllViews();
    stopService();
    super.onDestroyView();
}

@android.annotation.SuppressLint(value = "NewApi")
public synchronized void onActivity() {
    cancel();
    inactivityTask = new io.github.marktony.espresso.zxing.utils.InactivityTimer.InactivityAsyncTask();
    if ((Build.VERSION.SDK_INT) >= 11) {
        inactivityTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }else {
        inactivityTask.execute();
    }
}

@java.lang.Override
public void run() {
    action.doActionAndScheduleNext(player, trackSelector, surface, mainHandler, next);
    if ((repeatIntervalMs) != (com.google.android.exoplayer2.C.TIME_UNSET)) {
        clock.postDelayed(mainHandler, this, repeatIntervalMs);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mColors.clear();
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }
    bindUi();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.res.Resources res = getResources();
    java.lang.String[] choices = res.getStringArray(R.array.choices);
    mChoice = choices[which];
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.d("Testing", "Resume");
    localMultiplayerView.resume();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((bottomSheetBuilding) != null) {
        setNavigationPOI(bottomSheetBuilding);
        showBuildingInfoFragment(false);
    }
}

@java.lang.Override
public void success(java.lang.Object o, retrofit.client.Response response) {
    android.util.Log.d("Debug", "success");
    java.util.ArrayList<com.example.andrew.testapp.Models.RailModel> trainLocationList = ((java.util.ArrayList<com.example.andrew.testapp.Models.RailModel>) (o));
    addTrainLocationsToMap(trainLocationList);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if (mp.isPlaying()) {
        pause();
    }
}

@android.annotation.SuppressLint(value = "DefaultLocale")
private java.lang.String formatPressure(double pressure) {
    return java.lang.String.format((((com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.DOUBLE_FORMAT) + (com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.VALUE_UNITS_SEPARATOR)) + (com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.PRESSURE_UNITS)), pressure);
}

private android.graphics.drawable.GradientDrawable getLayer(int n, android.graphics.drawable.LayerDrawable drawableNormal) {
    return ((android.graphics.drawable.GradientDrawable) (drawableNormal.getDrawable(n).mutate()));
}

public void executeImport(android.content.Context context, org.mercycorps.translationcards.porting.TxcPortingUtility.ImportSpec importSpec) throws org.mercycorps.translationcards.porting.ImportException {
    loadData(context, importSpec);
}

public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_new :
            android.content.Intent intent = new android.content.Intent(this, net.teamsv.selfalarm.NewAlarmActivity.class);
            startActivity(intent);
            break;
        case R.id.btn_record :
            break;
    }
}

public static vision.resourcemanager.RMBottomButtonFragment newInstance(byte type) {
    vision.resourcemanager.RMBottomButtonFragment fragment = new vision.resourcemanager.RMBottomButtonFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putByte(vision.resourcemanager.RMBottomButtonFragment.ARG_PARAM1, type);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void onStop() {
    if ((this.currentTask) != null) {
        android.util.Log.d("actuseries", "cancelling recup banniere");
        this.currentTask.cancel(true);
    }
    super.onPause();
}

public static void closeApp(android.content.Context context) {
    android.widget.Toast.makeText(context, ((com.familyparking.app.utility.Tools.getAppName(context)) + " cannot work without location services!"), Toast.LENGTH_LONG).show();
    ((android.app.Activity) (context)).finish();
}

public static com.mdsgpp.eef.controller.StateConroller getInstance(android.content.Context contextActivity) {
    if ((com.mdsgpp.eef.controller.StateConroller.instance) == null)
        com.mdsgpp.eef.controller.StateConroller.instance = new com.mdsgpp.eef.controller.StateConroller(contextActivity);
    
    return com.mdsgpp.eef.controller.StateConroller.instance;
}

public void interactionEnded() throws java.io.IOException {
    if ((socket) != null) {
        socket.close();
    }
    socket = null;
    com.android.gscaparrotti.bendermobile.network.ServerInteractor.instance = null;
}

@java.lang.Override
public void onBufferReceived(byte[] buffer) {
    android.util.Log.d(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.TAG, "onBufferReceived");
}

public void onClick(android.view.View v) {
    temp_button.setVisibility(View.GONE);
    food.remove(entry.getKey());
}

private void navigateToMain() {
    android.content.Intent toMain = new android.content.Intent(this, org.secfirst.umbrella.MainActivity.class);
    toMain.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.support.v4.content.IntentCompat.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(toMain);
}

void setControls() {
    lisCate = ((android.widget.ListView) (getActivity().findViewById(R.id.lisCategoryFragment)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.bck_btn_id :
            {
                backButtonPressed();
                break;
            }
        case R.id.home_btn_id :
            {
                homeButtonPressed();
            }
        case R.id.fwd_btn_id :
            {
                forwardButtonPressed();
            }
    }
}

public void onLocationChanged(android.location.Location location) {
    mLoc = com.example.daniel.app0.MyLocationListener.mLocationManager.getLastKnownLocation(com.example.daniel.app0.MyLocationListener.mProvider);
}

@java.lang.Override
public void onGridColorBarFragmentInteraction(android.net.Uri uri) {
    com.pea.jay.redditlists.userInterface.GridColorBarFragment gridColorBarFragment = ((com.pea.jay.redditlists.userInterface.GridColorBarFragment) (getSupportFragmentManager().findFragmentById(R.id.fragment_color_bar)));
}

@android.support.annotation.NonNull
public rx.Observable<com.github.st1hy.countthemcalories.database.IngredientTemplate> saveIntoDatabase() {
    java.util.List<com.github.st1hy.countthemcalories.activities.addingredient.fragment.model.IngredientTypeCreateException.ErrorType> errorList = canCreateIngredient();
    if (errorList.isEmpty()) {
        return insertOrUpdateIntoDatabase();
    }else {
        return rx.Observable.error(new com.github.st1hy.countthemcalories.activities.addingredient.fragment.model.IngredientTypeCreateException(errorList));
    }
}

@java.lang.Override
public boolean hasNavigationBar() {
    return mOverWriteHasNavigationBar ? mHasNavigationBar : mContext.getResources().getBoolean(com.android.internal.R.bool.config_showNavigationBar);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    fab.show();
    floatSendCard.setVisibility(View.INVISIBLE);
}

public int updateProduct(android.content.ContentValues values, java.lang.String selection) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    int updatedRows = 0;
    updatedRows = db.update(com.duffin22.marketingapi.MyDBHandler.TABLE_SUPERSICKS, values, selection);
    db.close();
    return updatedRows;
}

@java.lang.Override
public void call() {
    if (!(bluetoothGatt.setCharacteristicNotification(characteristic, isNotificationEnabled))) {
        throw new com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException(characteristic, com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException.CANNOT_SET_LOCAL_NOTIFICATION);
    }
}

private void showSubmitBarFragment(android.app.Fragment submitBarFragment) {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
    ft.show(submitBarFragment);
}

public void setRatio(float ratio) {
    mRatio = ratio;
    if ((mRatio) < 10.0F)
        mRatio = 10.0F;
    
    android.util.Log.i(com.fourtech.variometer.AltimeterView.TAG, ("setRatio() ratio=" + ratio));
}

public com.afollestad.materialdialogs.MaterialDialog.Builder typeface(android.graphics.Typeface medium, android.graphics.Typeface regular) {
    this.mediumFont = medium;
    this.regularFont = regular;
    this.useCustomFonts = true;
    return this;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if (!(i == (-1))) {
        childRegistryYear = spinnerYears.get((i - 1));
    }
}

public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        isFocusedSearch = true;
    }else {
        isFocusedSearch = false;
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.item_clear_history :
            db.clearDB();
            break;
        case R.id.item_history :
            break;
    }
    return super.onOptionsItemSelected(item);
}

public static void resetEvents() {
    synchronized(com.aimbrain.androidsdk.library.EventStore.sync) {
        if ((com.aimbrain.androidsdk.library.EventStore.eventList) == null) {
            com.aimbrain.androidsdk.library.EventStore.eventList = new org.json.JSONArray();
        }
    }
}

@java.lang.Override
public void onStart() {
    super.onStart();
    mediaBrowser.connect();
    if (!(android.support.v17.leanback.app.BackgroundManager.getInstance(getActivity()).isAttached())) {
        prepareBackgroundManager();
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return (id == (R.id.action_settings)) || (super.onOptionsItemSelected(item));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_location_armory);
    game = nl.tudelft.pixelperfect.client.GameClient.getInstance();
    nl.tudelft.pixelperfect.pixelperfect.LocationArmoryActivity.ship = nl.tudelft.pixelperfect.pixelperfect.Spaceship.getInstance();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews();
    initPublisher();
    mMainPresenter = new comkorlex.httpsgithub.videochat.presenter.MainPresenter(this);
    mMainPresenter.outputSessionData();
}

@java.lang.Override
public void run() {
    android.util.Log.d("RACEMANAGERY", "UPDATELISTVIEW RUNONUITHREAD");
    runOnUiThread(updateListView);
}

@java.lang.Override
public void onWebContentClicked(android.webkit.WebView.HitTestResult result, android.view.MotionEvent event) {
}

@java.lang.Override
public void onTaskDone() {
    rafraichitListeCommentaire();
    ((android.support.v7.app.ActionBarActivity) (getActivity())).setSupportProgressBarIndeterminateVisibility(false);
}

@java.lang.Override
public void deregister(de.fau.amos.virtualledger.android.views.shared.transactionList.DataListening observer) {
    this.dataListenings.remove(observer);
    if (this.dataListenings.isEmpty()) {
        this.contactsDataManager.deleteObserver(this);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, www.app.remindme.com.remindme.ConfigureActivity.class));
    startMainService(v);
}

public void goGenerateList(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.zaccianflone.pantrypro.GenerateList.class);
    intent.putExtra(Constants.KEY_LIST_ID, mListId);
    arrayAdapter.clear();
    startActivity(intent);
}

public static uncmn.eve.Eve.Builder builder(android.content.Context context) {
    return new uncmn.eve.Eve.Builder(context);
}

public static java.lang.String getEmail(android.content.Context context) {
    android.accounts.AccountManager accountManager = android.accounts.AccountManager.get(context);
    android.accounts.Account account = com.mysjsu.mobsecurity.UserDataUtil.getAccount(accountManager);
    if (account == null) {
        return null;
    }else {
        return account.name;
    }
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(mAlertBroadcastReceiver, new android.content.IntentFilter(com.stripe.android.CustomerSession.ACTION_API_EXCEPTION));
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(mBroadcastReceiver, new android.content.IntentFilter(com.stripe.android.view.PaymentFlowActivity.EVENT_SHIPPING_INFO_PROCESSED));
}

public static com.cpiz.android.playground.TakePicture.PhotoHelper.CameraLauncher create(android.app.Activity activity) {
    return new com.cpiz.android.playground.TakePicture.PhotoHelper.CameraLauncher(activity).setPortrait(true).setUseFrontCamera(false).setRatio(1, 1).setPreferredSize(1080, 1080);
}

public void finishActivity(android.app.Activity activity) {
    if ((activity != null) && (!(activity.isFinishing()))) {
        activityStack.remove(activity);
        activity.finish();
    }
}

public void getWifiConnections(android.app.Activity activity) {
    android.support.v4.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION }, 0);
    mWifiManager.startScan();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    camera.release();
    android.widget.Toast.makeText(getActivity(), "On Destroy", Toast.LENGTH_SHORT).show();
}

public void makeToast(java.lang.String toastString) {
    android.widget.Toast.makeText(this, toastString, Toast.LENGTH_SHORT);
}

@android.arch.persistence.room.TypeConverter
public static java.lang.Long dateToTimestamp(java.util.Date date) {
    return java.util.Calendar.getInstance().getTime().getTime();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new com.example.akgul.movies_application.SettingsActivity.SettingsFragment()).commit();
    setupActionBar();
}

private void buildView(final android.content.Context context, final android.widget.LinearLayout layout, final org.apache.avro.Schema.Field field) {
    android.view.View view = interdroid.vdb.avro.view.factory.AvroViewFactory.buildListView(context, field);
    layout.addView(view);
}

public static void gaussianBlur(android.graphics.Bitmap bitmap) {
    org.quenlen.magic.MagicImage.gaussianBlur(bitmap, 32);
}

@android.webkit.JavascriptInterface
public void savePartialFormData(java.lang.String partialData) {
    android.widget.Toast.makeText(mContext, "saving un-submitted form data", Toast.LENGTH_LONG).show();
    ((org.ei.opensrp.view.activity.SecuredNativeSmartRegisterActivity) (getActivity())).savePartialFormData(partialData, recordId, formName, getFormFieldsOverrides());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mIsHasUpload) {
        mQrUploadTv.setClickable(false);
        mQrUploadTv.setTextColor(getResources().getColor(R.color.gray_character));
        uploadData();
        mIsHasUpload = !(mIsHasUpload);
    }
}

@java.lang.SuppressWarnings(value = "unused")
public void getSelf(com.emreeran.android.instagram.Instagram.UserCallback callback) {
    com.emreeran.android.instagram.controllers.UserController controller = new com.emreeran.android.instagram.controllers.UserController(mContext);
    java.lang.String token = getAccessToken();
    if (token != null) {
        controller.getSelf(token, callback);
    }else {
        login();
    }
}

public static java.lang.String getBaseUrl(android.content.Context activity) {
    boolean useHttps = android.preference.PreferenceManager.getDefaultSharedPreferences(activity).getBoolean(Constants.PREF_USE_HTTPS, false);
    if (useHttps)
        return (Constants.ROOT_HTTPS) + (Constants.ROOT_URL);
    else
        return (Constants.ROOT_HTTP) + (Constants.ROOT_URL);
    
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    com.zhanghao.androiddemo.chapter5.ActivityController.addActivity(this);
}

private void initViews(android.view.View view) {
    fetchingItems = ((android.widget.LinearLayout) (view.findViewById(R.id.listEmptyView)));
    itemsListRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.photosListRecyclerView)));
    makeSnackBar();
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
    mIsCheater = false;
    updateQuestion();
}

private void showAlert(java.lang.String title, java.lang.String message) {
    new android.support.v7.app.AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton(getString(R.string.ok), null).create().show();
}

private void logError(java.lang.String message) {
    android.util.Log.e(jp.straylight.scannerapp.ScanResultsReporter.TAG, message);
    listener.onReport(("ERROR: " + message));
}

public void setTransformation(com.remind101.android.views.TokenBackgroundSpan.TextDisplayTransformation transformation) {
    this.transformation = transformation;
    setCachedDisplayText(null, 0, 0, null);
}

@java.lang.Override
public void onLoginSuccess(retrofit2.Response<gem.training3.enterprisenetwork.network.dto.ResponseDTO> response) {
    android.content.Intent i = new android.content.Intent(this, gem.training3.enterprisenetwork.screen.main.MainActivity.class);
    startActivity(i);
    finish();
}

public void trackWithProperties(java.lang.String event, com.facebook.react.bridge.ReadableMap properties) {
    mixpanel.track(event, this.readableMapToJson(properties));
    android.util.Log.d("mixpanel", "trackWithProperties");
}

@java.lang.Override
protected void onPreExecute() {
    android.widget.Toast.makeText(getApplicationContext(), "Downloading Reports into a CSV...", Toast.LENGTH_LONG);
}

private boolean isJson(java.lang.String jsonString) {
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject(jsonString);
        return true;
    } catch (org.json.JSONException je) {
        android.util.Log.e("CoverosMobileApp", "isJson is false", je);
        return false;
    }
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    if (!(super.dispatchTouchEvent(ev)))
        mGestureDetector.onTouchEvent(ev);
    
    return true;
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View fragment;
    fragment = inflater.inflate(R.layout.fragment_landing_header, container);
    butterknife.ButterKnife.inject(this, fragment);
    return fragment;
}

private void exitWithError() {
    finish();
    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    android.widget.Toast.makeText(baseContext, "There was an error initialising the decompiler with the app you selected.", Toast.LENGTH_LONG).show();
}

protected void onDraw(android.graphics.Canvas canvas) {
    setPaths(Spinner_A1_Choice, Spinner_A2_Choice, Spinner_D1_Choice, Spinner_D2_Choice);
    if (canvas == null)
        createBitmap();
    
}

@java.lang.Override
public void onItemMove(int fromPosition, int toPosition) {
    java.util.Collections.swap(categoryList, fromPosition, toPosition);
    android.util.Log.d("ZHAP", ((("2 moved from " + fromPosition) + " to ") + toPosition));
}

@java.lang.Override
public com.takescoop.americanwhitewaterandroid.controller.BackEventResult onBack() {
    com.takescoop.americanwhitewaterandroid.controller.BackEventResult result = super.onBack();
    if (result == (BackEventResult.NotHandled)) {
        parentListener.onClose(filterContainer.getFilter());
    }
    return BackEventResult.Handled;
}

private void setupTextView() {
    mProgressSpinner.setVisibility(View.GONE);
    mWrapper.setVisibility(View.VISIBLE);
    mTitle.setText(title);
    mBody.setText(android.text.Html.fromHtml(content));
}

public void setLocalStyle(com.tokbox.android.otsdkwrapper.utils.VideoScale style) {
    if (style == (com.tokbox.android.otsdkwrapper.utils.VideoScale.FILL)) {
        mPublisher.setStyle(BaseVideoRenderer.STYLE_VIDEO_SCALE, BaseVideoRenderer.STYLE_VIDEO_FILL);
    }else {
        mPublisher.setStyle(BaseVideoRenderer.STYLE_VIDEO_SCALE, BaseVideoRenderer.STYLE_VIDEO_FIT);
    }
}

public void onClick(android.view.View button) {
    mIconId = (ib.isChecked()) ? com.sharad.epocket.AddCategoryActivity.UNASSIGNED : label;
    updateIconGroup();
}

private void setAvatar(java.lang.String path) {
    avatarImagePath = person.getIdPhoto();
    if ((avatarImagePath) != "") {
        avatarView.setImageURI(android.net.Uri.parse(avatarImagePath));
        avatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}

public void setTabText(java.lang.String text) {
    if ((current_tab_position) != 1) {
        ((android.widget.TextView) (tabMenuView.getChildAt(current_tab_position))).setText(text);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_learn);
}

@java.lang.Override
public void onFailure(java.lang.String message) {
    if ((getActivity()) != null) {
        setRefreshIndicatorVisiblity(true);
        android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    startLocationUpdates(true);
    android.util.Log.d(Constants.TAG, "Starting location updates...");
}

@java.lang.Override
public void run() {
    if (this.isAvailable()) {
        android.content.Intent intent = com.idonans.doodle.demo.DoodlePlayActivity.start(this, path);
        this.startActivity(intent);
    }
}

@java.lang.Override
public void finalize() throws java.lang.Throwable {
    if (Logger.DEBUG) {
        android.util.Log.d(TAG, "[finalize]");
    }
    cleanup();
    super.finalize();
}

private void onScrollIdle() {
    ss.jaredluo.com.stickerselector.model.Nearest nearest = getNearestScrollOffset();
    android.util.Log.i("JARED", ("Nearest position: " + (nearest.getNearestPosition())));
    scrollViewToCenter(nearest);
}

@java.lang.Override
public void onWebServiceCoordinatorError(java.lang.Exception error) {
    android.util.Log.e(com.mixey69.roulettevideochat.ConnectionManager.LOG_TAG, ("Web Service error: " + (error.getMessage())));
    uiInterface.showWebServiceCoordinatorError(error);
}

@java.lang.Override
public void run() {
    com.epicodus.shakeitup.MainActivity.loadingDialog.hide();
    android.widget.Toast.makeText(this, "Oops, that address doesn't work!", Toast.LENGTH_LONG).show();
    locationLabel.setText("");
    locationLabel.setHint("Please try again!");
}

private boolean assetExists(java.lang.String assetString, android.content.Context context) {
    android.content.res.AssetManager am = context.getAssets();
    try {
        java.io.InputStream inputStream = am.open(assetString);
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}

private void addMood() {
    filter.filter("");
    android.content.Intent intent = new android.content.Intent(this, com.cmput301w17t08.moodr.AddMoodActivity.class);
    startActivityForResult(intent, 1);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    timber.log.Timber.d("Yes for enjoying betch clicked");
    getAppStoreDialog().show();
    dialogInterface.dismiss();
}

protected void onNoNewTweets(@android.support.annotation.StringRes
int messageId) {
    android.support.design.widget.Snackbar.make(coordinatorLayout, messageId, Snackbar.LENGTH_SHORT).show();
    timeline.hasMoreTweetsFlag = net.kyouko.cloudier.model.Timeline.FLAG_NO_MORE;
}

