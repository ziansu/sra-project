public void setMenuItem(android.view.MenuItem menuItem) {
    this.menuItem = menuItem;
    menuItem.setActionView(imageView);
    if (startAnimation) {
        startAnimation();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    calculateBill();
}

@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mParentTab.handToProgressTab(item);
}

@java.lang.Override
public void onUnexpectedError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.e(im.vector.util.VectorCallManager.LOG_TAG, ("## startIpCall(): onUnexpectedError Msg=" + (e.getLocalizedMessage())));
    callback.onStartCallFailed(e.getLocalizedMessage(), null);
}

@java.lang.Override
public com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = inflater.inflate(R.layout.simple_text_item, parent, false);
    return new com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder(view);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null) {
        oldState = org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().isPlaying();
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().pause();
    }
}

public void close() {
    if ((bluetoothGatt) == null) {
        return ;
    }
    bluetoothGatt.close();
    bluetoothGatt = null;
    android.util.Log.d(DEBUG_TAG, "close() called");
}

private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    mTrendingAnthology = com.jparkie.givesmehope.models.Anthology.getParcelable(savedInstanceState);
    mTrendingAdapter = new com.jparkie.givesmehope.views.adapters.TrendingAdapter(mTrendingAnthology.getStories());
    mTrendingView.setAdapterForRecyclerView(mTrendingAdapter);
}

@java.lang.Override
public void onEditCancelled() {
}

private void setPermissions() {
    java.lang.String[] PERMISSIONS = new java.lang.String[]{ Manifest.permission.CAMERA };
    android.support.v4.app.ActivityCompat.requestPermissions(this, PERMISSIONS, MY_PERMISSIONS_REQUEST_CODE);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
}

@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN)) || (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_UP))) {
        return true;
    }
    return super.onKeyUp(keyCode, event);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    initialize(new com.alaskalinuxuser.criticalvelocity.criticalvelocity(new com.alaskalinuxuser.criticalvelocity.AndroidStringProvider(this)), config);
}

@java.lang.Override
public void onConnected(android.os.Bundle arg0) {
    mSwipeRefreshLayout.setRefreshing(true);
    startLocationUpdates();
}

@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (this.getChildFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
    getDeviceLocation();
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
}

private void refreshTitle() {
    java.lang.String title = getString(R.string.online_number);
    setTitle(java.lang.String.format(title, org.puresoftware.chocalandroid.Chocal.getUsers().size()));
}

@java.lang.Override
public boolean handleElementClick(de.blau.android.osm.OsmElement element) {
    super.handleElementClick(element);
    if (element == (this.element)) {
        main.performTagEdit(element, null, false, false);
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
        getRandomGoal();
        startQuest();
    }
}

@java.lang.Override
public void dismissProgressDialog() {
    if ((progress) != null) {
        progress.dismiss();
        progress = null;
    }
}

@java.lang.Override
public void onNotificationClicked(java.util.List<com.gimbal.android.Communication> communications) {
    for (com.gimbal.android.Communication communication : communications) {
        if (communication != null) {
            addEvent("Communication Clicked");
        }
    }
}

private void UiOnAccidentDetected() {
    android.util.Log.d(maustemies.halyttaja.MainActivity.LOG_TAG_MAIN_ACTIVITY, "UiOnAccidentDetected()");
    textViewStatus.setText(R.string.textAccidentDetected);
    textViewAdvice.setText(R.string.textAdvicePressStopToStopAlarm);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    stopPublish();
    stopRecordAnimation();
    showDetailDialog();
}

@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    return false;
}

@java.lang.Override
public void onBackPressed() {
    if ((mBottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED))
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    else
        super.onBackPressed();
    
}

@java.lang.Override
public void config() {
    com.booboot.vndbandroid.util.Callback.showToast(context, message);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.app.NotificationManager nm = ((android.app.NotificationManager) (getSystemService(getApplicationContext().NOTIFICATION_SERVICE)));
    nm.cancel(apier.com.lifttrak.RunWorkout.uniqueID);
    dialog.dismiss();
    finish();
}

public void onClick(android.content.DialogInterface dialog, int id) {
}

@android.support.annotation.NonNull
protected java.lang.String getAuthor(org.jsoup.nodes.Document document) {
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
}

@com.facebook.react.uimanager.annotations.ReactProp(name = "rawData")
public void setRawData(com.github.barteksc.pdfviewer.PDFView view, java.lang.String rawData) {
    assetName = null;
    filePath = null;
    rawPDFData = (rawData == null) ? null : android.util.Base64.decode(rawData, Base64.DEFAULT);
    display(view, false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    boolean checked = ((android.widget.CheckBox) (view)).isChecked();
    object.setChecked(checked);
}

private void showStopProblemFragment(org.onebusaway.android.io.elements.ObaStop obaStop) {
    org.onebusaway.android.report.ui.ReportStopProblemFragment.show(this, obaStop, R.id.ri_report_stop_problem, false);
}

public void setUpActionBar(android.support.v7.app.ActionBar actionBar) {
    if (actionBar == null) {
        return ;
    }
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setHomeButtonEnabled(true);
}

@java.lang.Override
public void onRefresh() {
    cursorInterface.updateCursor();
}

public static java.lang.String capitalized(@android.support.annotation.NonNull
final java.lang.String string) {
    return string.isEmpty() ? string : (string.substring(0, 1).toUpperCase()) + (string.substring(1));
}

@android.annotation.SuppressLint(value = "NewApi")
public void run() {
    if (_targetView != null) {
        _targetView.loadUrl(("javascript:" + _jsString));
    }
}

protected void onPostExecute(java.lang.Boolean result) {
    if (result)
        if (adminChose)
            new com.myApplication.yosef.finalproject.AdminChooseSeries.sendActiveSerie().execute();
        
    
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
    int k = (arg0.getId()) % 100;
    if (arg1 == true) {
        mCheckedIndex[k] = 1;
    }else {
        mCheckedIndex[k] = 0;
    }
}

public void testGetLatestFileName() {
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
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
    if ((mFabVisibility) == (android.view.View.VISIBLE))
        mFloatingActionButton.setVisibility(View.INVISIBLE);
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.digitalillusion.droid.iching.utils.Utils.setContext(getApplicationContext());
    loadSettings();
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    showFormulaResult();
}

public boolean bind() {
    android.content.Intent i = new android.content.Intent(mContext, org.tlc.whereat.services.LocationService.class);
    return mContext.bindService(i, mLocationServiceConnection, Context.BIND_AUTO_CREATE);
}

@java.lang.Override
public void onError() {
    mProgress.setVisibility(View.GONE);
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), getFlexString(R.string.IMG_OPEN_ERROR), Toast.LENGTH_SHORT).show();
    }
}

public void setPanelHolderAndPosition(cz.metaverse.android.bilingualreader.manager.PanelHolder panelHolder, int position) {
    this.panelHolder = panelHolder;
    panelPosition = position;
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<de.dreier.mytargets.shared.models.Arrow>> loader, java.util.List<de.dreier.mytargets.shared.models.Arrow> data) {
    setList(arrowDataSource, data, new de.dreier.mytargets.fragments.ArrowFragment.ArrowAdapter(getContext()));
}

@java.lang.Override
public void onClick(android.view.View view) {
    simpleBluetooth.sendData(dataToSend.getText().toString());
}

@java.lang.Override
public void onError(java.lang.String error) {
    android.widget.Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder onCreateChildViewHolder(android.view.ViewGroup parent) {
    android.view.View view = inflater.inflate(R.layout.simple_text_item, parent, false);
    return new com.devbrackets.android.recyclerextdemo.ui.viewholder.SimpleTextViewHolder(view);
}

private void parseFeed() {
    new com.treble.www.treble.GetFeed(getApplicationContext()).execute();
    android.util.Log.d("doop", "okayyyyyy");
}

public static void hidePopup() {
    final android.view.WindowManager windowManager = ((android.view.WindowManager) (com.comag.aku.symptomtracker.services.NotificationService.getContext().getSystemService(Context.WINDOW_SERVICE)));
    if ((com.comag.aku.symptomtracker.services.InputPopup.popupLayout) != null)
        windowManager.removeView(com.comag.aku.symptomtracker.services.InputPopup.popupLayout);
    
}

@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
    toolbar_logo.setVisibility(View.VISIBLE);
    return true;
}

@java.lang.Override
public info.martinmarinov.drivers.usb.DvbTuner create(info.martinmarinov.drivers.usb.rtl28xx.Rtl28xxDvbDevice.Rtl28xxI2cAdapter adapter, info.martinmarinov.drivers.usb.DvbFrontend.I2GateControl i2GateControl, android.content.res.Resources resources) throws info.martinmarinov.drivers.DvbException {
    return new info.martinmarinov.drivers.usb.rtl28xx.R820tTuner(26, adapter, RafaelChip.CHIP_R820T, info.martinmarinov.drivers.usb.rtl28xx.Rtl28xxTunerType.RTL2832_R820T.xtal, i2GateControl, resources);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.planyourexchange.app.PlanYourExchangeApplication.getPlanYourExchangeComponent(getActivity()).inject(this);
}

@java.lang.Override
public void processResponse(java.lang.String output) {
    android.util.Log.d(com.udacity.gradle.builditbigger.MainActivity.YOLOPAD, ((com.udacity.gradle.builditbigger.MainActivity.RESPONSE_FROM_SERVER_IS) + output));
    result = output;
}

public int getItemCount() {
    if ((getRealmAdapter()) != null) {
        int size = getRealmAdapter().getCount();
        return size;
    }
    return 0;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    stopRecordAnimation();
    showDetailDialog();
}

public static void i(java.lang.String tag, java.lang.String msg) {
    android.util.Log.i(tag, msg);
}

@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    jsonAccessToken = s;
    checkExistUserAccount();
}

@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    switch (requestCode) {
        case MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION :
            {
            }
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    fragment.addSoundRecord();
    this.dismiss();
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.i(name.chadschultz.nearbyapidemo.MainActivity.TAG, "onConnected()");
    subscribe();
}

public synchronized boolean deleteFavorite(java.lang.String imdbID) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.remove(imdbID);
    editor.commit();
    return true;
}

private void writeStringToParcel(android.os.Parcel p, java.lang.String s) {
    p.writeByte(((byte) (s != null ? 1 : 0)));
    if (s != null)
        p.writeString(s);
    
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    java.lang.System.exit(0);
}

public void unregisterAllReceiver() {
    for (android.content.BroadcastReceiver br : receivers) {
        if (br != null) {
            super.unregisterReceiver(br);
        }
    }
    receivers.clear();
}

public void oneone(android.view.View v) {
    if ((counter) > 1)
        (counter)--;
    
    android.widget.Toast.makeText(con, ("Counted" + (counter)), Toast.LENGTH_LONG).show();
}

public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    setActionBarTitle();
    invalidateOptionsMenu();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(context, nyc.c4q.syd.updateme.JobActivity.class);
    context.startActivity(intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (!(Upload.uploadGridList.contains(vn.mbm.phimp.me.gallery.PhimpMeGallery.filePath.get(vn.mbm.phimp.me.gallery.PhimpMeGallery.position))))
        Upload.uploadGridList.add(vn.mbm.phimp.me.gallery.PhimpMeGallery.filePath.get(vn.mbm.phimp.me.gallery.PhimpMeGallery.position));
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_stop_error);
    initiateButtons();
    android.widget.Toast toast = android.widget.Toast.makeText(this.getApplicationContext(), "STOP STOP STOP!!!", Toast.LENGTH_LONG);
    toast.show();
}

@java.lang.Override
public void onClick(android.view.View view) {
    status = com.example.vietnguyen.models.Task.STATUS_UNFINISHED;
    setTextFor(R.id.txt_share_task_edit_status, com.example.vietnguyen.models.Task.STATUS[com.example.vietnguyen.models.Task.STATUS_UNFINISHED]);
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.example.robin.androidproject3b.MainActivity.SendDataToServerTask().execute();
}

private void toggleMapType() {
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
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(artwork);
    }
}

public void onAccuracyChanged(android.hardware.Sensor s, int i) {
    return ;
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.ArrayList<com.example.oluwatimilehin.moviebuff.Movies>> loader) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    cDown.cancel();
    CheckAnswer();
}

@java.lang.Override
public void setLocation(android.location.Location location) {
    mUserLocation = location;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initData();
    initViews();
    initEvents();
}

@java.lang.Override
public void onClick(android.view.View v) {
    showCityInput();
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    clearScreen(canvas);
    if (!(init)) {
        postInvalidateDelayed(50);
        android.util.Log.e(me.itsrishi.exercisecounter.views.StatsView.TAG, "Data not set");
        return ;
    }
    drawGraph(canvas);
}

@java.lang.Override
public void onClick(android.view.View v) {
    finish();
}

void setTextSize() {
    textSize.setTextSize(storage.getTextSize());
    categoryText.setTextSize(storage.getTextSize());
}

private static void close(android.database.sqlite.SQLiteDatabase db) {
}

public void getFileContent() {
    java.io.File f = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Tracker_Camera");
    java.io.File[] files = f.listFiles();
}

@java.lang.Override
protected void onProgressUpdate(java.lang.Integer[] values) {
    super.onProgressUpdate(values);
    android.util.Log.v("Log", "progress updating");
    notifyDataSetChanged();
}

private void onThreadWait() {
    try {
        synchronized(this) {
            this.wait();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

public static boolean externalBrowserEnabled(android.content.Context context) {
    return android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.pref_custom_tab), true);
}

protected void init() {
    setScaleType(ImageView.ScaleType.MATRIX);
    android.graphics.drawable.Drawable d = getDrawable();
    android.graphics.Bitmap bmp = ((android.graphics.drawable.BitmapDrawable) (d)).getBitmap();
    setImageBitmapReset(bmp, true);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (EditFragment.REQUEST_TAKE_PHOTO))
        mEditFrag.onCameraActivityResult(resultCode);
    
}

public static com.amagh.bakemate.ui.StepDetailsFragment newInstance(com.amagh.bakemate.models.Step step) {
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable(com.amagh.bakemate.ui.StepDetailsFragment.BundleKeys.STEP, step);
    com.amagh.bakemate.ui.StepDetailsFragment fragment = new com.amagh.bakemate.ui.StepDetailsFragment();
    fragment.setArguments(args);
    return fragment;
}

public boolean storeWithId(android.content.Context context) {
    boolean wasStore;
    wasStore = insert(context, true);
    return wasStore;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new com.example.adrian.leagueplayers.activity.GetScheduleTask(this).execute();
}

@java.lang.Override
public void into(android.widget.ImageView imageView) {
    com.bumptech.glide.DrawableRequestBuilder drawableRequestBuilder = build();
    this.imageview = imageView;
    drawableRequestBuilder.into(imageview);
}

@java.lang.Override
public void onClick(android.view.View v) {
    hideNotification();
}

@java.lang.Override
public float SendOSCMessage(java.lang.String message) {
    if (com.teotigraphix.caustk.core.CaustkEngine.DEBUG_MESSAGES) {
        android.util.Log.d(com.teotigraphix.caustk.core.generator.Caustic.TAG, ("Message: " + message));
    }
    return super.SendOSCMessage(message);
}

