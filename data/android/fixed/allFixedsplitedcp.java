@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    set_selected_block(3, false);
    Button_LandHere.setSelected(true);
    return false;
}

@java.lang.Override
public com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if ((mInflater) == null) {
        mInflater = android.view.LayoutInflater.from(mContext);
    }
    return com.exemple.android.cookbook.adapters.CategoryRecipeRecyclerAdapter.CustomViewHolder.create(mInflater, parent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    new android.app.AlertDialog.Builder(this).setTitle("Changelog").setMessage(DeprecationHelper.Html.fromHtml(fullUpdateMessage)).setPositiveButton(R.string.dialog_action_positive_close, null).show();
}

public static java.lang.Double getDoubleFromPreferences(android.content.Context context, java.lang.String name) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return ((double) (preferences.getFloat(name, 0)));
}

@java.lang.Override
public void onDestroyView() {
    android.util.Log.d(mclab1.pages.MediaPlayerFragment.tag, ("height = " + (mclab1.pages.MediaPlayerFragment.controller.getHeight())));
    mclab1.pages.MediaPlayerFragment.controller.removeAllViews();
    super.onDestroyView();
}

@android.annotation.SuppressLint(value = "NewApi")
public synchronized void onActivity() {
    cancel();
    inactivityTask = new io.github.marktony.espresso.zxing.utils.InactivityTimer.InactivityAsyncTask();
    inactivityTask.execute();
}

@java.lang.Override
public void run() {
    action.doActionAndScheduleNext(player, trackSelector, surface, mainHandler, null);
    clock.postDelayed(mainHandler, this, repeatIntervalMs);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mColors) != null) {
        mColors.clear();
    }
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }
    bindUi();
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.res.Resources res = getResources();
    java.lang.String[] choices = res.getStringArray(R.array.choices);
    mChoice = choices[which].toLowerCase();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    localMultiplayerView.resume();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((bottomSheetBuilding) != null) {
        setNavigationPOI(bottomSheetBuilding);
    }
}

@java.lang.Override
public void success(java.lang.Object o, retrofit.client.Response response) {
    java.util.ArrayList<com.example.andrew.testapp.Models.RailModel> trainLocationList = ((java.util.ArrayList<com.example.andrew.testapp.Models.RailModel>) (o));
    addTrainLocationsToMap(trainLocationList);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
}

@android.annotation.SuppressLint(value = "DefaultLocale")
private java.lang.String formatPressure(double pressure) {
    return java.lang.String.format(((com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.DOUBLE_FORMAT) + (com.endava.abondarenco.weatherapp.forecasts.ForecastsFormatter.PRESSURE_UNITS)), pressure);
}

private android.graphics.drawable.GradientDrawable getLayer(int n, android.graphics.drawable.LayerDrawable j) {
    return ((android.graphics.drawable.GradientDrawable) (j.getDrawable(n).mutate()));
}

public void executeImport(android.content.Context context, org.mercycorps.translationcards.porting.TxcPortingUtility.ImportSpec importSpec) throws org.mercycorps.translationcards.porting.ImportException {
    loadData(context, importSpec, false);
}

public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_new :
            {
                android.content.Intent intent = new android.content.Intent(this, net.teamsv.selfalarm.NewAlarmActivity.class);
                startActivity(intent);
                break;
            }
        case R.id.btn_record :
            {
                break;
            }
    }
}

public static vision.resourcemanager.RMBottomButtonFragment newInstance(byte type) {
    vision.resourcemanager.RMBottomButtonFragment fragment = new vision.resourcemanager.RMBottomButtonFragment();
    return fragment;
}

@java.lang.Override
public void onStop() {
    if ((this.currentTask) != null) {
        android.util.Log.d("actuseries", "cancelling recup banniere");
        this.currentTask.cancel(true);
        this.currentTask = null;
    }
    super.onPause();
}

public static void closeApp(android.content.Context context) {
    ((android.app.Activity) (context)).finish();
}

public static com.mdsgpp.eef.controller.StateConroller getInstance(android.content.Context contextActivity) {
    if ((com.mdsgpp.eef.controller.StateConroller.instance) == null) {
        com.mdsgpp.eef.controller.StateConroller.instance = new com.mdsgpp.eef.controller.StateConroller(contextActivity);
    }else {
    }
    return com.mdsgpp.eef.controller.StateConroller.instance;
}

public void interactionEnded() throws java.io.IOException {
    if ((socket) != null) {
        socket.close();
    }
    socket = null;
}

@java.lang.Override
public void onBufferReceived(byte[] buffer) {
}

public void onClick(android.view.View v) {
    temp_button.setVisibility(View.GONE);
    food.remove(key);
}

public void navigateToMain() {
    android.content.Intent toMain = new android.content.Intent(this, org.secfirst.umbrella.MainActivity.class);
    toMain.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.support.v4.content.IntentCompat.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(toMain);
}

void setControls() {
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
                break;
            }
        case R.id.fwd_btn_id :
            {
                forwardButtonPressed();
            }
    }
}

public void onLocationChanged(android.location.Location location) {
    mLoc = getLastKnownLocation();
}

@java.lang.Override
public void onGridColorBarFragmentInteraction(android.net.Uri uri) {
    gridColorBarFragment = ((com.pea.jay.redditlists.userInterface.GridColorBarFragment) (getSupportFragmentManager().findFragmentById(R.id.fragment_color_bar)));
}

@android.support.annotation.NonNull
public rx.Observable<com.github.st1hy.countthemcalories.database.IngredientTemplate> saveIntoDatabase() {
    return insertOrUpdateIntoDatabase();
}

@java.lang.Override
public boolean hasNavigationBar() {
    return mHasNavigationBar;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    floatSendCard.setVisibility(View.INVISIBLE);
    fab.show();
}

public int updateProduct(android.content.ContentValues values, java.lang.String selection) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    int updatedRows = 0;
    updatedRows = db.update(com.duffin22.marketingapi.MyDBHandler.TABLE_SUPERSICKS, values, selection, null);
    db.close();
    return updatedRows;
}

@java.lang.Override
public void call() {
    if (!(bluetoothGatt.setCharacteristicNotification(characteristic, isNotificationEnabled))) {
        throw new com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException(characteristic, com.polidea.rxandroidble.exceptions.BleCannotSetCharacteristicNotificationException.CANNOT_SET_LOCAL_NOTIFICATION, null);
    }
}

private void showSubmitBarFragment(android.app.Fragment submitBarFragment) {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
    ft.show(submitBarFragment);
    ft.commit();
}

public void setRatio(float ratio) {
    mRatio = ratio;
    if ((mRatio) < 1.0F)
        mRatio = 1.0F;
    
    android.util.Log.i(com.fourtech.variometer.AltimeterView.TAG, ("setRatio() ratio=" + ratio));
}

public com.afollestad.materialdialogs.MaterialDialog.Builder typeface(android.graphics.Typeface medium, android.graphics.Typeface regular) {
    this.mediumFont = medium;
    this.regularFont = regular;
    return this;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if (i > 0) {
        childRegistryYear = spinnerYears.get((i - 1));
    }
}

public void onFocusChange(android.view.View v, boolean hasFocus) {
    isFocusedSearch = hasFocus;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.item_clear_history :
            db.clearDB();
            break;
    }
    return super.onOptionsItemSelected(item);
}

public static void resetEvents() {
    synchronized(com.aimbrain.androidsdk.library.EventStore.sync) {
        com.aimbrain.androidsdk.library.EventStore.eventList = new org.json.JSONArray();
    }
}

@java.lang.Override
public void onStart() {
    super.onStart();
    mediaBrowser.connect();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    return ((item.getItemId()) == (R.id.action_settings)) || (super.onOptionsItemSelected(item));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_location_armory);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews();
    mMainPresenter = new comkorlex.httpsgithub.videochat.presenter.MainPresenter(this);
    mMainPresenter.outputSessionData();
}

@java.lang.Override
public void run() {
    runOnUiThread(updateListView);
}

@java.lang.Override
public boolean onWebContentClicked(android.webkit.WebView.HitTestResult result, android.view.MotionEvent event) {
    return false;
}

@java.lang.Override
public void onTaskDone() {
    rafraichitListeCommentaire();
}

@java.lang.Override
public void deregister(de.fau.amos.virtualledger.android.views.shared.transactionList.DataListening observer) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(this, www.app.remindme.com.remindme.ConfigureActivity.class));
}

public void goGenerateList(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.zaccianflone.pantrypro.GenerateList.class);
    intent.putExtra(Constants.KEY_LIST_ID, mListId);
    startActivity(intent);
}

public static uncmn.eve.Eve.Builder builder() {
    return new uncmn.eve.Eve.Builder();
}

public static java.lang.String getEmail(android.content.Context context) {
    android.accounts.AccountManager accountManager = android.accounts.AccountManager.get(context);
    java.lang.String account = com.mysjsu.mobsecurity.UserDataUtil.getAccount(accountManager);
    if (account == null) {
        return null;
    }else {
        return account;
    }
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(mBroadcastReceiver, new android.content.IntentFilter(com.stripe.android.view.PaymentFlowActivity.EVENT_SHIPPING_INFO_PROCESSED));
}

public static com.cpiz.android.playground.TakePicture.PhotoHelper.CameraLauncher create(android.app.Activity activity) {
    return new com.cpiz.android.playground.TakePicture.PhotoHelper.CameraLauncher(activity).setPortrait(true).setUseFrontCamera(false).setRatio(1, 1);
}

public void finishActivity(android.app.Activity activity) {
    activityStack.remove(activity);
    if ((activity != null) && (!(activity.isFinishing()))) {
        activity.finish();
    }
}

public void getWifiConnections() {
    mWifiManager.startScan();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.widget.Toast.makeText(getActivity(), "On Destroy", Toast.LENGTH_SHORT).show();
}

public void makeToast(java.lang.String toastString) {
    android.widget.Toast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
}

@android.arch.persistence.room.TypeConverter
public static java.lang.Long dateToTimestamp(java.util.Date date) {
    return date == null ? null : java.util.Calendar.getInstance().getTime().getTime();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new com.example.akgul.movies_application.SettingsActivity.SettingsFragment()).commit();
}

private void buildView(final android.content.Context context, final android.widget.LinearLayout layout, final org.apache.avro.Schema.Field field) {
    android.view.View view = interdroid.vdb.avro.view.factory.AvroViewFactory.buildListView(context, field);
    if (view != null) {
        layout.addView(view);
    }
}

public static void gaussianBlur(android.graphics.Bitmap bitmap) {
    org.quenlen.magic.MagicImage.gaussianBlur(bitmap, 32, false);
}

@android.webkit.JavascriptInterface
public void savePartialFormData(java.lang.String partialData) {
    ((org.ei.opensrp.view.activity.SecuredNativeSmartRegisterActivity) (getActivity())).savePartialFormData(partialData, recordId, formName, getFormFieldsOverrides());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mIsHasUpload) {
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
    }
}

public static java.lang.String getBaseUrl(android.content.Context activity) {
    return (Constants.ROOT_HTTPS) + (Constants.ROOT_URL);
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.zhanghao.androiddemo.chapter5.ActivityController.addActivity(this);
}

private void initViews(android.view.View view) {
    fetchingItems = ((android.widget.LinearLayout) (view.findViewById(R.id.listEmptyView)));
    itemsListRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.photosListRecyclerView)));
}

@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
    updateQuestion();
}

private void showAlert(java.lang.String title, java.lang.CharSequence message) {
    new android.support.v7.app.AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton(getString(R.string.ok), null).create().show();
}

private void logError(java.lang.String message) {
    android.util.Log.e(jp.straylight.scannerapp.ScanResultsReporter.TAG, message);
    if ((listener) != null) {
        listener.onReport(("ERROR: " + message));
    }
}

public void setTransformation(com.remind101.android.views.TokenBackgroundSpan.TextDisplayTransformation transformation) {
    if (transformation != (this.transformation)) {
        this.transformation = transformation;
        setCachedDisplayText(null, 0, 0, null);
    }
}

@java.lang.Override
public void onLoginSuccess() {
    android.content.Intent i = new android.content.Intent(this, gem.training3.enterprisenetwork.screen.main.MainActivity.class);
    startActivity(i);
    finish();
}

@com.facebook.react.bridge.ReactMethod
public void trackWithProperties(java.lang.String event, com.facebook.react.bridge.ReadableMap properties) {
    mixpanel.track(event, this.readableMapToJson(properties));
}

@java.lang.Override
protected void onPreExecute() {
    android.widget.Toast.makeText(this, "Downloading Reports into a CSV...", Toast.LENGTH_LONG);
}

private boolean isJson(java.lang.String jsonString) {
    try {
        new org.json.JSONObject(jsonString);
        return true;
    } catch (org.json.JSONException je) {
        return false;
    }
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    if ((!(super.dispatchTouchEvent(ev))) && ((mGestureDetector) != null))
        mGestureDetector.onTouchEvent(ev);
    
    return true;
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View fragment;
    fragment = inflater.inflate(R.layout.fragment_landing_header, container, false);
    butterknife.ButterKnife.inject(this, fragment);
    return fragment;
}

private void exitWithError() {
    android.widget.Toast.makeText(baseContext, "There was an error initialising the decompiler with the app you selected.", Toast.LENGTH_LONG).show();
    finish();
    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
}

protected void onDraw(android.graphics.Canvas canvas) {
    setPaths(Spinner_A1_Choice, Spinner_A2_Choice, Spinner_D1_Choice, Spinner_D2_Choice);
    createBitmap();
}

@java.lang.Override
public void onItemMove(int fromPosition, int toPosition) {
}

@java.lang.Override
public com.takescoop.americanwhitewaterandroid.controller.BackEventResult onBack() {
    com.takescoop.americanwhitewaterandroid.controller.BackEventResult result = super.onBack();
    if (result == (BackEventResult.NotHandled)) {
        parentListener.onClose();
    }
    return BackEventResult.Handled;
}

private void setupTextView() {
    mProgressSpinner.setVisibility(View.GONE);
    mWrapper.setVisibility(View.VISIBLE);
    mTitle.setText(title);
    if ((content) != null)
        mBody.setText(android.text.Html.fromHtml(content));
    
}

public void setLocalStyle(com.tokbox.android.otsdkwrapper.utils.VideoScale style) {
    if ((mPublisher) != null) {
        if (style == (com.tokbox.android.otsdkwrapper.utils.VideoScale.FILL)) {
            mPublisher.setStyle(BaseVideoRenderer.STYLE_VIDEO_SCALE, BaseVideoRenderer.STYLE_VIDEO_FILL);
        }else {
            mPublisher.setStyle(BaseVideoRenderer.STYLE_VIDEO_SCALE, BaseVideoRenderer.STYLE_VIDEO_FIT);
        }
    }
}

public void onClick(android.view.View button) {
    mIconId = (ib.isChecked()) ? com.sharad.epocket.AddCategoryActivity.UNASSIGNED : label;
    updateIconGroup(ib);
}

protected void setAvatar(java.lang.String path) {
    avatarImagePath = person.getIdPhoto();
    if ((avatarImagePath) != "") {
        avatarView.setImageURI(android.net.Uri.parse(avatarImagePath));
        avatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}

public void setTabText(java.lang.String text) {
    if ((current_tab_position) != (-1)) {
        ((android.widget.TextView) (tabMenuView.getChildAt(current_tab_position))).setText(text);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_learn);
}

@java.lang.Override
public void onFailure(java.lang.String message) {
    if ((getActivity()) != null) {
        setRefreshIndicatorVisiblity(false);
        android.widget.Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    startLocationUpdates();
}

@java.lang.Override
public void run() {
    if (this.isAvailable()) {
        android.content.Intent intent = com.idonans.doodle.demo.DoodlePlayActivity.start(this, path, false);
        this.startActivity(intent);
    }
}

@java.lang.Override
public void finalize() throws java.lang.Throwable {
    if (Logger.DEBUG) {
        android.util.Log.d(TAG, "[finalize]");
    }
    super.finalize();
}

private void onScrollIdle() {
    ss.jaredluo.com.stickerselector.model.Nearest nearest = getNearestScrollOffset();
    scrollViewToCenter(nearest);
}

@java.lang.Override
public void onWebServiceCoordinatorError(java.lang.Exception error) {
    android.util.Log.e(com.mixey69.roulettevideochat.ConnectionManager.LOG_TAG, ("Web Service error: " + (error.getMessage())));
    if ((uiInterface) != null) {
        uiInterface.showWebServiceCoordinatorError(error);
    }
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, "Oops, that address doesn't work!", Toast.LENGTH_LONG).show();
    locationLabel.setText("");
    locationLabel.setHint("Please try again!");
}

private boolean assetExists(java.lang.String assetString, android.content.Context context) {
    android.content.res.AssetManager am = context.getAssets();
    try {
        am.open(assetString);
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}

private void addMood() {
    android.content.Intent intent = new android.content.Intent(this, com.cmput301w17t08.moodr.AddMoodActivity.class);
    startActivityForResult(intent, 1);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    timber.log.Timber.d("Yes for enjoying betch clicked");
    dialogInterface.dismiss();
    getAppStoreDialog().show();
}

protected void onNoNewTweets(@android.support.annotation.StringRes
int messageId) {
    android.support.design.widget.Snackbar.make(coordinatorLayout, messageId, Snackbar.LENGTH_SHORT).show();
}

