public void setMenuItem(android.view.MenuItem menuItem) {
    this.menuItem = menuItem;
    if ((imageView) != null) {
        menuItem.setActionView(imageView);
        if (startAnimation) {
            startAnimation();
        }
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (enterAmount_editText.getText().toString().equals("")) {
        clear_Button.performClick();
    }else
        calculateBill();
    
}

@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mParentTab.handToProgressTab(item);
    v.setEnabled(false);
}

@java.lang.Override
public void onUnexpectedError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.e(im.vector.util.VectorCallManager.LOG_TAG, ("## startIpCall(): onUnexpectedError Msg=" + (e.getLocalizedMessage())));
    callback.onStartCallFailed(e.getLocalizedMessage());
}

@java.lang.Override
public com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = inflater.inflate(R.layout.simple_text_item, null);
    return new com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder(view);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if ((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null) {
        oldState = org.gtlp.yasb.SoundActivity.soundPlayerInstance.isPlaying();
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.pause();
    }
}

public void close() {
    if ((bluetoothGatt) == null) {
        return ;
    }
    disconnect();
    bluetoothGatt.close();
    bluetoothGatt = null;
    android.util.Log.d(DEBUG_TAG, "close() called");
}

private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState, mTrendingAnthology);
    mTrendingAdapter = new com.jparkie.givesmehope.views.adapters.TrendingAdapter(mTrendingAnthology.getStories());
    mTrendingView.setAdapterForRecyclerView(mTrendingAdapter);
}

@java.lang.Override
public void onEditCancelled() {
    android.widget.Toast.makeText(this, "They cancelled (fragment)", Toast.LENGTH_SHORT).show();
    net.idfernando.android.uitools.FragmentTools.removeFragment(this, net.idfernando.android.shoppinglist.EditShoppingListActivity.ADD_OR_EDIT_SHOPPING_ITEM_FRAGMENT);
}

private void setPermissions() {
    java.lang.String[] PERMISSIONS = new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.INTERNET , Manifest.permission.ACCESS_NETWORK_STATE };
    android.support.v4.app.ActivityCompat.requestPermissions(this, PERMISSIONS, MY_PERMISSIONS_REQUEST_CODE);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    android.util.Log.e("READING_LIST", "called");
}

@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    return (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN)) || (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_UP));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    initialize(new com.alaskalinuxuser.criticalvelocity.criticalvelocity(new com.alaskalinuxuser.criticalvelocity.AndroidStringProvider()), config);
}

@java.lang.Override
public void onConnected(android.os.Bundle arg0) {
    mSwipeRefreshLayout.setRefreshing(true);
    mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    startLocationUpdates();
}

@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    getDeviceLocation();
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (this.getChildFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    updateSharedPreferencesWithControlValues();
}

private void refreshTitle() {
    java.lang.String title = getString(R.string.online_number);
    setTitle(java.lang.String.format(title, ((org.puresoftware.chocalandroid.Chocal.getUsers().size()) + 1)));
}

@java.lang.Override
public boolean handleElementClick(de.blau.android.osm.OsmElement element) {
    super.handleElementClick(element);
    if (element == (this.element)) {
        main.performTagEdit(element, null, false);
        return true;
    }
    return false;
}

@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
@java.lang.Override
public void onClick(android.view.View view) {
    if (runningSpeurtocht) {
        stopQuest();
    }else {
        startQuest();
        getRandomGoal();
    }
}

@java.lang.Override
public void dismissProgressDialog() {
    if ((progress) != null) {
        progress.dismiss();
        progress = null;
    }else {
        android.util.Log.e("Progressbar", " is null!");
    }
}

@java.lang.Override
public void onNotificationClicked(java.util.List<com.gimbal.android.Communication> communications) {
    for (com.gimbal.android.Communication communication : communications) {
        if (communication != null) {
            addEvent(java.lang.String.format("Communication Clicked"));
        }
    }
}

private void UiOnAccidentDetected() {
    android.util.Log.d(maustemies.halyttaja.MainActivity.LOG_TAG_MAIN_ACTIVITY, "UiOnAccidentDetected()");
    new maustemies.halyttaja.ApplicationEnforcer().start();
    textViewStatus.setText(R.string.textAccidentDetected);
    textViewAdvice.setText(R.string.textAdvicePressStopToStopAlarm);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    stopPublish();
    quitRoom();
    stopRecordAnimation();
    showDetailDialog();
}

@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    imageView.setVisibility(View.VISIBLE);
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
        mMediaPlayer.reset();
        mMediaPlayer.release();
    }
    return false;
}

@java.lang.Override
public void onBackPressed() {
    if ((mBottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
        android.util.Log.d("CDA", "onKeyDown Called");
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }else {
        super.onBackPressed();
    }
}

@java.lang.Override
public void config() {
    com.booboot.vndbandroid.util.Callback.showToast(context, message);
    if ((com.booboot.vndbandroid.util.Callback.countDownLatch) != null)
        com.booboot.vndbandroid.util.Callback.countDownLatch.countDown();
    
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    finish();
    android.app.NotificationManager nm = ((android.app.NotificationManager) (getSystemService(getApplicationContext().NOTIFICATION_SERVICE)));
    nm.cancel(apier.com.lifttrak.RunWorkout.uniqueID);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
}

@android.support.annotation.NonNull
private java.lang.String getAuthor(org.jsoup.nodes.Document document) {
    org.jsoup.select.Elements author = document.select("div#content div b");
    if (author.isEmpty()) {
        return "";
    }else {
        return author.first().ownText();
    }
}

public void onDestroy() {
    super.onDestroy();
    android.content.SharedPreferences pref = getSharedPreferences("SearchMyCarPreferences", Context.MODE_PRIVATE);
    pref.edit().putInt("isEditFilter", 0).commit();
    android.util.Log.d("lis", "destroyEdit");
}

@com.facebook.react.uimanager.annotations.ReactProp(name = "rawData")
public void setRawData(com.github.barteksc.pdfviewer.PDFView view, java.lang.String rawData) {
    assetName = null;
    filePath = null;
    rawPDFData = android.util.Base64.decode(rawData, Base64.DEFAULT);
    display(false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    boolean checked = ((android.widget.CheckBox) (view)).isChecked();
    object.setChecked((!checked));
}

private void showStopProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    org.onebusaway.android.report.ui.ReportStopProblemFragment.show(this, obaStop, R.id.ri_report_stop_problem, false, this);
}

public void setUpActionBar(android.support.v7.app.ActionBar actionBar) {
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setHomeButtonEnabled(true);
}

@java.lang.Override
public void onRefresh() {
    cursorInterface.updateCursor();
    ((android.support.v4.widget.SwipeRefreshLayout) (findViewById(R.id.swiperefresh))).setRefreshing(false);
}

public static java.lang.String capitalized(@android.support.annotation.NonNull
final java.lang.String string) {
    return (string.substring(0, 1).toUpperCase()) + (string.substring(1));
}

@android.annotation.SuppressLint(value = "NewApi")
public void run() {
    if (_targetView != null) {
        if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.KITKAT)) {
            _targetView.evaluateJavascript(_jsString, null);
        }else {
            _targetView.loadUrl(("javascript:" + _jsString));
        }
    }
}

protected void onPostExecute(java.lang.Boolean result) {
    if (result)
        if (adminChose)
            new com.myApplication.yosef.finalproject.AdminChooseSeries.sendActiveSerie().execute();
        else
            android.widget.Toast.makeText(this, "Cant set game to be active", Toast.LENGTH_LONG).show();
        
    
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
    if (arg1 == true) {
        int k = (arg0.getId()) % 100;
        mCheckedIndex[k] = 1;
    }
}

public void testGetLatestFileName() {
    assertEquals("hello_20141212_120108.png", io.evercam.androidapp.photoview.SnapshotManager.getLatestFileName(ALL_FILES_ARRAY));
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.sunny.leaveme.services.MonitorService.TAG, "MonitorService onDestroy");
    mSensorReader.stop();
    mLocalBroadcastManager.unregisterReceiver(mLocalBroadcastReceiver);
    unregisterReceiver(mLockScreenReceiver);
    stopMonitorTimer();
    stopScreenBlocker();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    setFadeOutAnimation();
    mFabTrackerVisibility = android.view.View.INVISIBLE;
    if ((mFabVisibility) == (android.view.View.VISIBLE))
        mFloatingActionButton.setVisibility(View.INVISIBLE);
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.digitalillusion.droid.iching.utils.Utils.setContext(getApplicationContext());
    loadSettings();
    if ((current.viewId) == null) {
        gotoMain();
    }
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    switch (event.sensor.getType()) {
        case android.hardware.Sensor.TYPE_LINEAR_ACCELERATION :
            showFormulaResult();
            break;
        case android.hardware.Sensor.TYPE_ROTATION_VECTOR :
            showFormulaResult();
            break;
    }
}

public void bind() {
    android.content.Intent i = new android.content.Intent(mContext, org.tlc.whereat.services.LocationService.class);
    mContext.bindService(i, mLocationServiceConnection, Context.BIND_AUTO_CREATE);
}

@java.lang.Override
public void onError() {
    mProgress.setVisibility(View.GONE);
    android.widget.Toast.makeText(getActivity(), getFlexString(R.string.IMG_OPEN_ERROR), Toast.LENGTH_SHORT).show();
}

public void setPanelHolderAndPosition(cz.metaverse.android.bilingualreader.manager.PanelHolder panelHolder, int position) {
    android.util.Log.d(cz.metaverse.android.bilingualreader.selectionwebview.SelectionWebView.LOG, "setPanelHolderAndPosition");
    this.panelHolder = panelHolder;
    panelPosition = position;
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<de.dreier.mytargets.shared.models.Arrow>> loader, java.util.List<de.dreier.mytargets.shared.models.Arrow> data) {
    setList(arrowDataSource, data, new de.dreier.mytargets.fragments.ArrowFragment.ArrowAdapter());
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (isConnected) {
        simpleBluetooth.sendData(dataToSend.getText().toString());
    }
}

@java.lang.Override
public void onError(java.lang.String error) {
    hideProgressDialog();
    android.widget.Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder onCreateChildViewHolder(android.view.ViewGroup parent) {
    android.view.View view = inflater.inflate(R.layout.simple_text_item, null);
    return new com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder(view);
}

protected void parseFeed() {
    new com.treble.www.treble.GetFeed(getApplicationContext()).execute();
    android.util.Log.d("doop", "okayyyyyy");
}

public static void hidePopup() {
    final android.view.WindowManager windowManager = ((android.view.WindowManager) (com.comag.aku.symptomtracker.services.NotificationService.getContext().getSystemService(Context.WINDOW_SERVICE)));
    windowManager.removeView(com.comag.aku.symptomtracker.services.InputPopup.popupLayout);
}

@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
    final android.widget.ImageView toolbar_logo = ((android.widget.ImageView) (getActivity().findViewById(R.id.toolbar_logo)));
    toolbar_logo.setVisibility(View.VISIBLE);
    return true;
}

@java.lang.Override
public info.martinmarinov.drivers.usb.DvbTuner create(info.martinmarinov.drivers.usb.rtl28xx.Rtl28xxDvbDevice.Rtl28xxI2cAdapter adapter, info.martinmarinov.drivers.usb.DvbFrontend.I2GateControl i2GateControl, android.content.res.Resources resources) throws info.martinmarinov.drivers.DvbException {
    return new info.martinmarinov.drivers.usb.rtl28xx.R820tTuner(26, 2, adapter, RafaelChip.CHIP_R820T, info.martinmarinov.drivers.usb.rtl28xx.Rtl28xxTunerType.RTL2832_R820T.xtal, i2GateControl, resources);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    com.planyourexchange.app.PlanYourExchangeApplication.getPlanYourExchangeComponent(getActivity()).inject(this);
}

@java.lang.Override
public void processResponse(java.lang.String output) {
    android.util.Log.d(com.udacity.gradle.builditbigger.MainActivity.YOLOPAD, ((com.udacity.gradle.builditbigger.MainActivity.RESPONSE_FROM_SERVER_IS) + output));
    findViewById(R.id.progress_bar).setVisibility(View.VISIBLE);
    result = output;
}

public int getItemCount() {
    if ((getRealmAdapter()) != null) {
        int size = getRealmAdapter().getCount();
        android.util.Log.e("Note Adapter: ", ("Realm adapter size : " + size));
        return size;
    }
    return 0;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    stopPublish();
    stopRecordAnimation();
    showDetailDialog();
}

public static void i(java.lang.String tag, java.lang.String msg) {
    if (com.cjt2325.cameralibrary.BuildConfig.DEBUG)
        android.util.Log.i(tag, msg);
    
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    jsonAccessToken = s;
    android.widget.Toast.makeText(this, jsonAccessToken, Toast.LENGTH_SHORT).show();
    checkExistUserAccount();
}

@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    switch (requestCode) {
        case MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION :
            {
                return ;
            }
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (org.catrobat.catroid.ProjectManager.getInstance().getComingFromScriptFragmentToSoundFragment()) {
        org.catrobat.catroid.ProjectManager.getInstance().setKillSoundFragmentAfterAddButtonClickedInScriptFragment(true);
    }
    fragment.addSoundRecord();
    this.dismiss();
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.i(name.chadschultz.nearbyapidemo.MainActivity.TAG, "onConnected()");
    showMessage("onConnected()");
    subscribe();
}

public synchronized boolean deleteFavorite(java.lang.String imdbID) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.remove(imdbID);
    editor.apply();
    return true;
}

private void writeStringToParcel(android.os.Parcel p, java.lang.String s) {
    p.writeByte(((byte) (s != null ? 1 : 0)));
    p.writeString(s);
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    me.ccrama.redditslide.Reddit.forceRestart(this, true);
}

public void unregisterAllReceiver() {
    for (android.content.BroadcastReceiver br : receivers) {
        super.unregisterReceiver(br);
    }
    receivers.clear();
}

public void oneone(android.view.View v) {
    (counter)--;
    android.widget.Toast.makeText(con, ("Counted" + (counter)), Toast.LENGTH_LONG).show();
}

public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    setActionBarTitle(mTitle);
    invalidateOptionsMenu();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(context, nyc.c4q.syd.updateme.JobActivity.class);
    intent.putExtra("jobs", ((java.io.Serializable) (jobs)));
    context.startActivity(intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Upload.uploadGridList.add(vn.mbm.phimp.me.gallery.PhimpMeGallery.filePath.get(vn.mbm.phimp.me.gallery.PhimpMeGallery.position));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initiateButtons();
    setContentView(R.layout.activity_stop_error);
    android.widget.Toast toast = android.widget.Toast.makeText(this.getApplicationContext(), "STOP STOP STOP!!!", Toast.LENGTH_LONG);
    toast.show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    task.setStatus(Task.STATUS_UNFINISHED);
    setTextFor(R.id.txt_share_task_edit_status, com.example.vietnguyen.models.Task.STATUS[com.example.vietnguyen.models.Task.STATUS_UNFINISHED]);
    task.save();
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.System.out.println("clicked button2!");
    new com.example.robin.androidproject3b.MainActivity.SendDataToServerTask().execute();
}

public void toggleMapType() {
    if ((mMap.getMapType()) == (com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE)) {
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }else {
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
}

@java.lang.Override
public void onAnimationStart(final android.animation.Animator animation) {
    if (!(isCancelled())) {
        imageView.setAlpha(0.0F);
        imageView.setImageBitmap(null);
        imageView.setImageDrawable(artwork);
    }
}

public void onAccuracyChanged(android.hardware.Sensor s, int i) {
    notify("Accuracy changed", Toast.LENGTH_SHORT);
    return ;
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.ArrayList<com.example.oluwatimilehin.moviebuff.Movies>> loader) {
    loader.forceLoad();
}

@java.lang.Override
public void onClick(android.view.View v) {
    CheckAnswer();
    curQ = (curQ) + 1;
    cDown.cancel();
    QuestionEngine();
}

@java.lang.Override
public void setLocation(android.location.Location location) {
    mUserLocation = location;
    shareLocation();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initData();
    com.changhong.touying.activity.Utils.requireServerVolume(this);
    com.changhong.touying.activity.QuickQuireMessageUtil.getInstance().setFeedbackListener(this, this);
    initViews();
    initEvents();
}

@java.lang.Override
public void onClick(android.view.View v) {
    es.dmoral.toasty.Toasty.success(this, "Change Location", Toast.LENGTH_SHORT).show();
    showCityInput();
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if (!(init)) {
        postInvalidateDelayed(50);
        android.util.Log.e(me.itsrishi.exercisecounter.views.StatsView.TAG, "Data not set");
        return ;
    }
    clearScreen(canvas);
    drawGraph(canvas);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent activity = new android.content.Intent(this, com.example.android.onthespot.MenuActivity.class);
    startActivity(activity);
    finish();
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String s) {
    textSize.setTextSize(storage.getTextSize());
    categoryText.setTextSize(storage.getTextSize());
}

private static void close(android.database.sqlite.SQLiteDatabase db) {
    if ((db != null) && (db.isOpen()))
        db.close();
    
}

public com.ninjapiratestudios.trackercamera.fileContent.FileContent getFileContent() {
    java.io.File f = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Tracker_Camera");
    java.io.File[] files = f.listFiles();
    com.ninjapiratestudios.trackercamera.fileContent.FileContent fC = new com.ninjapiratestudios.trackercamera.fileContent.FileContent(files);
    return fC;
}

@java.lang.Override
protected void onProgressUpdate(java.lang.Object[] values) {
    super.onProgressUpdate(values);
    android.util.Log.v("Log", "progress updating");
    notifyDataSetChanged();
}

private void onThreadWait() {
    try {
        synchronized(this) {
            android.util.Log.d(com.rustfisher.fisherandroidchart.MultiLinesChartSView.TAG, "DrawThread waiting");
            this.wait();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

public static boolean externalBrowserEnabled(android.content.Context context) {
    return android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.pref_custom_tab), false);
}

protected void init() {
    setScaleType(ImageView.ScaleType.MATRIX);
    android.graphics.drawable.Drawable d = getDrawable();
    android.graphics.Bitmap bmp = ((android.graphics.drawable.BitmapDrawable) (d)).getBitmap();
    setImageBitmapReset(bmp, false);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (EditFragment.REQUEST_TAKE_PHOTO)) && (resultCode == (android.app.Activity.RESULT_OK)))
        mEditFrag.onCameraActivityResult();
    
}

public static com.amagh.bakemate.ui.StepDetailsFragment newInstance(com.amagh.bakemate.models.Step step, int stepId) {
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable(com.amagh.bakemate.ui.StepDetailsFragment.BundleKeys.STEP, step);
    com.amagh.bakemate.ui.StepDetailsFragment fragment = new com.amagh.bakemate.ui.StepDetailsFragment();
    fragment.setArguments(args);
    return fragment;
}

public boolean storeWithId(android.content.Context context) {
    boolean wasStore;
    wasStore = insert(context);
    return wasStore;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new com.example.adrian.leagueplayers.activity.GetPlayersTask(this).execute();
    new com.example.adrian.leagueplayers.activity.GetScheduleTask(this).execute();
}

@java.lang.Override
public void into(android.widget.ImageView imageView) {
    com.bumptech.glide.DrawableRequestBuilder drawableRequestBuilder = build();
    drawableRequestBuilder.into(imageview);
}

private void showRecordWeightNotification() {
    showNotification(R.string.record_weight_notification, R.string.record_weight, new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.view.View recordWeight = findViewById(R.id.record_weight);
            showWeightDialog(recordWeight);
            hideNotification();
        }
    });
}

@java.lang.Override
public float SendOSCMessage(java.lang.String message) {
    if (!(com.teotigraphix.caustk.core.CaustkEngine.DEBUG_MESSAGES)) {
        android.util.Log.d(com.teotigraphix.caustk.core.generator.Caustic.TAG, ("Message: " + message));
    }
    return super.SendOSCMessage(message);
}

