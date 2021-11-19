@java.lang.Override
public void onSuccess(com.google.android.gms.location.LocationSettingsResponse locationSettingsResponse) {
    mFusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, android.os.Looper.myLooper());
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
}

public static java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getPairs() {
    return (com.inipage.homelylauncher.background.SequentialLauncherService.pairs) != null ? com.inipage.homelylauncher.background.SequentialLauncherService.pairs : new java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>>();
}

public static void i(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        android.util.Log.i(tag, msg, tr);
    }
}

private boolean isValidEmail(java.lang.CharSequence target) {
    return (!(android.text.TextUtils.isEmpty(target))) && (android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches());
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(articleActivity, str, Toast.LENGTH_SHORT).show();
}

public void onClickEditProgramButton(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, lu.uni.trailassistant.activities.EditTrainingProgramExercisesActivity.class);
    intent.putExtra("training_program_id", tpca.getItemId(lastSelectedIndex));
    startActivity(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

void bind(com.blumental.lifesliceapp.model.Record record, android.support.v4.util.LruCache<java.lang.String, android.graphics.Bitmap> avatarCache) {
    itemView.setTag(record.getVideoUrl());
    setAvatar(record, avatarCache);
    username.setText(record.getUsername());
}

public void onClick(android.view.View v) {
    if ((gearNum) >= 1) {
        (gearNum)--;
    }
    android.util.Log.d(TAG, ("Gears = " + (gearNum)));
    txt_GearsPlaced.setText(java.lang.Integer.toString(gearNum));
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    final android.widget.ScrollView scrollView = ((android.widget.ScrollView) (getActivity().findViewById(R.id.aboutScroll)));
    scrollView.fullScroll(View.FOCUS_DOWN);
}

@java.lang.Override
public void onReadyStateChange(com.byteshaft.requests.HttpRequest request, int readyState) {
    switch (readyState) {
        case com.byteshaft.requests.HttpRequest.STATE_DONE :
            switch (request.getStatus()) {
                case java.net.HttpURLConnection.HTTP_NO_CONTENT :
                    break;
            }
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    transitionToFragment(new com.adafruit.bluefruit.le.connect.Patient.ExerciseResultsFragment());
}

private void setAndDumpActivity(android.app.Activity activity) {
    setupActivity(activity);
    createFloatView();
}

@java.lang.Override
protected void onUpdateIntend(java.lang.String modifiedContent) {
    android.content.Intent newIntent = cloneIntent(modifiedContent);
    editableIntent = newIntent;
    showAllIntentData(uri);
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    deleteProject(position, section);
    return false;
}

@java.lang.Override
public void onAllDataRemoved(int itemCount) {
    mAdapter.notifyItemRangeRemoved(0, itemCount);
}

private java.lang.Boolean isHowToSortOnMostPopular() {
    return com.example.worldwide.popularmovies1.MainActivity.howToSort.equals(Constants.MOST_POPULAR_MOVIES);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
}

public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.tberroa.girodicerapp.activities.RegisterActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION).setAction(Params.RELOAD);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    fr.sims.coachingproject.ui.activity.RegisterActivity.startActivity(getActivity());
}

public boolean isValid() {
    synchronized(mSync) {
        return (!((mSurface) instanceof android.view.Surface)) || (((android.view.Surface) (mSurface)).isValid());
    }
}

public void showAlertDialog(android.content.Context context) {
    android.app.AlertDialog.Builder am = new android.app.AlertDialog.Builder(context);
    am.setTitle(getString(R.string.gps_off_title));
    am.setMessage(getString(R.string.gps_off));
    am.show();
}

public boolean onTouchSuper(android.view.View view, android.view.MotionEvent event) {
    return super.onTouchEvent(event);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mDays) != 1) {
        (mDays)--;
        mDaysTextView.setText(java.lang.Integer.toString(mDays));
    }
}

private boolean isCurrPosition(float childY, android.view.View itemView) {
    return (childY >= (itemView.getTop())) && (childY <= (itemView.getBottom()));
}

@java.lang.Override
public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
    super.onCaptureCompleted(session, request, result);
    sampleCameraPreview();
}

@java.lang.Override
public void setTTYMode(int ttyMode, android.os.Message onComplete) {
    super.setTTYMode(ttyMode, onComplete);
    if ((mImsPhone) != null) {
        mImsPhone.setTTYMode(ttyMode, onComplete);
    }
}

static boolean checkExpiration(android.content.Context context, java.io.File file) {
    long expiration = (java.lang.System.currentTimeMillis()) - (file.lastModified());
    return expiration < (com.bbtfr.merusuto.DataManager.EXPIRATION);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (changedInstitute) {
        ma.sortGroups(ma.groups, ma.institute, java.lang.String.valueOf(ma.instituteID));
        changedInstitute = false;
    }
    showGroupChooseDialog();
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.d(com.example.amps.fyp_amps_android_yishan.ProjectDetailsActivity.TAG, "onDestroy()");
}

@java.lang.Override
public void onError(java.lang.Exception e) {
    android.util.Log.e("ChatSocket", ("Encountered error " + (e.getMessage())), e);
}

@java.lang.Override
public int getItemViewType(int id) {
    return separators.contains(id) ? com.orgzly.android.ui.AgendaListViewAdapter.TYPE_SEPARATOR : com.orgzly.android.ui.AgendaListViewAdapter.TYPE_ITEM;
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if ((callback) != null) {
        callback.onDismiss();
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        safetyCB.setChecked(false);
        returnedYdLnEditText.setText("0");
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public void onClick(android.view.View view) {
    seqRepeat.setBackgroundColor(Color.BLACK);
    seqRepeat.setTextColor(Color.WHITE);
    seqORlgt = false;
    lgtRepeat.setBackgroundColor(Color.LTGRAY);
    lgtRepeat.setTextColor(Color.BLACK);
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((android.support.v7.widget.LinearLayoutManager) (rv.getLayoutManager())).scrollToPositionWithOffset(1, headerHeight);
    resetScroll(false);
}

public static viewholders.SingleFlightResultVH create(final android.content.Context context, final android.view.ViewGroup parent) {
    return new viewholders.SingleFlightResultVH(context, android.view.LayoutInflater.from(context).inflate(R.layout.single_flight_result_row_item, parent, false));
}

private boolean hasPermissions() {
    int permission = android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    return permission == (android.content.pm.PackageManager.PERMISSION_GRANTED);
}

@java.lang.Override
public void onLoaderReset(Loader<List<? extends org.oucho.mpdclient.mpd.item.Item>> loader) {
}

@java.lang.Override
public void onTaskComplete(android.graphics.Movie movie) {
    if (movie == null) {
        return ;
    }
    mAdapter.appendImageData(movie);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mFragment.showEditWordDialog(vocable);
}

public void setDrawerEnabled(boolean enabled) {
    if ((mDrawer) != null) {
        int lockMode = (enabled) ? android.support.v4.widget.DrawerLayout.LOCK_MODE_UNLOCKED : android.support.v4.widget.DrawerLayout.LOCK_MODE_LOCKED_CLOSED;
        mDrawer.setDrawerLockMode(lockMode);
        drawerToggle.setDrawerIndicatorEnabled(enabled);
    }
}

@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    android.util.Log.d(com.pajato.android.gamechat.database.handler.MessagesChangeHandler.TAG, java.lang.String.format(java.util.Locale.US, com.pajato.android.gamechat.database.handler.MessagesChangeHandler.LOG_FORMAT, "onChildChanged", dataSnapshot, s));
    process(dataSnapshot, com.pajato.android.gamechat.event.MessageChangeEvent.CHANGED);
}

@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    this.finish();
}

public static com.gigigo.rx_clean.domain.interactors.GetUserInteractorRx provideGetUsersInteractorRx() {
    com.gigigo.rx_clean.domain.datasources.UsersDataSource usersDataSource = com.gigigo.rx_clean.di.Injector.provideUsersDataSource();
    return new com.gigigo.rx_clean.domain.interactors.GetUserInteractorRx(usersDataSource, io.reactivex.android.schedulers.AndroidSchedulers.mainThread(), io.reactivex.schedulers.Schedulers.io());
}

@android.support.annotation.NonNull
private com.novoda.pianohero.RoundViewModel createViewModel(com.novoda.pianohero.Sequence updatedSequence) {
    int nextNotesPosition = updatedSequence.position();
    java.util.List<java.lang.String> notations = getNotations(nextNotesPosition);
    java.lang.String statusMessage = getStatusMessage(updatedSequence);
    return new com.novoda.pianohero.RoundViewModel(notations, statusMessage);
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    showPanel(com.android.gallery3d.filtershow.category.MainPanel.DUALCAM);
}

@java.lang.Override
public void onSuccess(android.net.Uri uri) {
    com.squareup.picasso.Picasso.with(this).load(uri).fit().centerCrop().into(profileIcon);
}

private void initFragment(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
    transaction.replace(R.id.fragment_container, fragment);
    transaction.commit();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_add_main_category, container, false);
}

@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    com.alejandro_castilla.cloudfitforwear.services.bluetooth.BluetoothService.BluetoothServiceBinder bluetoothServiceBinder = ((com.alejandro_castilla.cloudfitforwear.services.bluetooth.BluetoothService.BluetoothServiceBinder) (service));
    bluetoothService = bluetoothServiceBinder.getService();
    bluetoothService.findBluetoothDevice("C8:3E:99:0D:DD:43");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_open_works);
    addData();
    listViewItemClick();
}

@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    android.content.Intent intent = new android.content.Intent(this, com.dchen93.deliverysystem.HomeActivity.class);
    finish();
    this.startActivity(intent);
    return null;
}

public void configure(android.content.Context context, java.lang.String setBaseUrl) {
    configure(context, setBaseUrl, false);
}

private void redirectedAcordingToPn(int userinfo) {
    viewPager.setCurrentItem(3, false);
    navigationTabBar.setModelIndex(3, false);
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError volleyError) {
    super.onErrorResponse(volleyError);
    if ((txt_no_learning) != null) {
        txt_no_learning.setVisibility(View.VISIBLE);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    asyncTaskListener.onTaskComplete(false, error.getMessage());
}

private void initUI() {
    edt_check.setTypeface(com.itrax.utils.Utility.getMaterialIconsRegular(this));
    com.itrax.activities.DashBoardActivity.edt_delivery_date = ((android.widget.EditText) (findViewById(R.id.edt_delivery_date)));
    isVerified = false;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    this.onItemClick(i);
    if (listener != null)
        listener.onItemClick(adapterView, view, i, l);
    
}

public static void openIt(final android.content.Context context, final com.paulvarry.intra42.api.UserLTE user, com.paulvarry.intra42.AppClass app) {
    if (user != null)
        com.paulvarry.intra42.tab.user.UserActivity.openIt(context, user.login, app);
    
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    drawChartBg(canvas);
    drawXAxis(canvas);
    drawXAxisLabel(canvas);
    drawYAxis(canvas);
    drawLine(canvas);
    drawYAxisLabel(canvas);
    drawBaseLine(canvas);
}

protected void onPostExecute(java.lang.StringBuilder results) {
}

private void sendEvent(java.lang.String eventName, @android.support.annotation.Nullable
com.facebook.react.bridge.WritableMap params) {
    this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit(eventName, params);
}

@android.support.annotation.Nullable
public com.lee.hansol.bakingtime.models.Ingredient getIngredientObjectAt(int index) {
    if ((index >= (ingredients.length)) || (index < 0))
        return null;
    else
        return ingredients[index];
    
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    org.unpidf.univmobile.data.entities.Poi poi = mMarkers.get(marker);
    showPoiDetails(mTabPosition, poi, false);
    return true;
}

private float[] getAgentSpeed(int Id, com.mygdx.game.android.GameState.AgentInfo[] Status) {
    if ((Status[Id]) == null) {
        java.lang.System.out.println(("Exception null Status Block : " + Id));
        return null;
    }
    return Status[Id].speedVector;
}

@java.lang.Override
public boolean onTouch(final android.view.View view, final android.view.MotionEvent event) {
    return detector.onTouchEvent(event);
}

public static int getPixelsFromDps(int dps, android.content.Context context) {
    final float scale = context.getResources().getDisplayMetrics().density;
    return ((int) ((dps * scale) + 0.5F));
}

@java.lang.Override
public void onRefreshBegin(in.srain.cube.views.ptr.PtrFrameLayout frame) {
    getAnswerList();
    mPtrFrame.refreshComplete();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.zatpatatm.app.Intent intent = new com.zatpatatm.app.Intent(getApplicationContext(), com.zatpatatm.app.ticket.TicketActivity.class);
    intent.putExtra("filterTicketTab", 1);
    startActivity(intent);
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    android.util.Log.d(TAG, "onRestoreInstanceState()");
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (android.R.id.home))
        android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
    
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    mediaPlayer.setLooping(true);
}

public java.lang.String getLoginInfoParams(java.lang.String key) {
    android.content.SharedPreferences sharedPreferences = this.getSharedPreferences("loginInfo", Context.MODE_PRIVATE);
    return sharedPreferences.getString(key, "");
}

@java.lang.Override
public void onClick(android.view.View v) {
    onClickListener.onClick(this, v);
}

@java.lang.Override
public void onActivityResult(android.app.Activity activity, int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.showlocationservicesdialogbox.LocationServicesDialogBoxModule.ENABLE_LOCATION_SERVICES)) {
        currentActivity = activity;
    }
}

public synchronized void addPendingAlarm(android.content.Intent intent) {
    alarmPendingList.add(intent);
    android.util.Log.d(mobile.dp.velocityalarmclock.AlarmCoordinator.TAG, ("addPendingAlarm - pending alarm added. new size of pending list is: " + (alarmPendingList.size())));
}

public void launchCamera() {
    org.wordpress.android.ui.media.WordPressMediaUtils.launchCamera(this, this);
}

@java.lang.Override
public void onError(int error) {
    android.util.Log.e(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, ("failed to connect/discover: " + error));
    dlg.dismiss();
    if ((getActivity()) != null) {
        getActivity().finish();
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_edit_toolbar, menu);
    return true;
}

public void setGradientResourceId(android.content.res.Resources res, int gradientResourceId) {
    mGradientResourceId = gradientResourceId;
}

@com.facebook.react.bridge.ReactMethod
public void clearEvents() {
    if ((socketService) == null)
        return ;
    
    for (com.homypiandroid.SocketListener listener : com.homypiandroid.SocketConnection.jsEvents) {
        listener.unlink(socketService);
    }
}

@java.lang.Override
public android.view.View getVideoLoadingProgressView() {
    if ((mWebChromeClient) != null) {
        return mWebChromeClient.getVideoLoadingProgressView();
    }
    return null;
}

public void setInterruptPersistence(int persistence) {
    if ((persistence >= 0) && (persistence < 16)) {
        writeRegister(nz.geek.android.things.drivers.i2c.Tcs34725.PERS, persistence);
    }
}

private void cancelAllForward() {
    java.lang.String disableAllForwardString = "#21#";
    android.content.Intent intentCallForward = new android.content.Intent(android.content.Intent.ACTION_CALL);
    android.net.Uri uri = android.net.Uri.fromParts("tel", disableAllForwardString, "");
    intentCallForward.setData(uri);
    startActivity(intentCallForward);
}

private void bindView(org.amahi.anywhere.server.model.ServerFile file, org.amahi.anywhere.server.model.ServerFileMetadata fileMetadata, android.view.View fileView) {
    if (fileMetadata == null) {
        org.amahi.anywhere.adapter.ServerFilesMetadataAdapter.bindFileView(file, fileView);
    }else {
        bindFileMetadataView(file, fileMetadata, fileView);
    }
}

@java.lang.Override
public void onFail() {
    pCircle.dismiss();
}

@java.lang.Override
public void onProgressChanged(android.webkit.WebView view, int newProgress) {
    if ((mWebChromeClient) != null) {
        mWebChromeClient.onProgressChanged(view, newProgress);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((com.abition.self.MainActivity) (context)).newPlanDialog.show(((com.abition.self.MainActivity) (context)).getSupportFragmentManager(), null);
}

private void playSFX(int sound) {
    android.media.MediaPlayer mp = android.media.MediaPlayer.create(this, sound);
    mp.start();
}

public void setName(java.lang.String name) {
    android.widget.TextView field = ((android.widget.TextView) (mView.findViewById(R.id.name_text)));
    field.setText(name);
}

public void clickMbtilesPositiveButton() {
    if ((mbtilesDialog) != null) {
        mbtilesDialog.getButton(DialogInterface.BUTTON_POSITIVE).performClick();
    }else {
        android.util.Log.w("MapActivity", "The mbtiles dialog is either null or not showing, cannot perform positive click");
    }
}

public android.graphics.Bitmap getImage() {
    if ((image) == null) {
        return null;
    }
    android.graphics.Bitmap newimage = android.graphics.BitmapFactory.decodeByteArray(image.toByteArray(), 0, image.size());
    return newimage;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mndev.groupreminder.Fragments.TimePickerFragment timePickerFragment = new mndev.groupreminder.Fragments.TimePickerFragment();
    mndev.groupreminder.DataCache.getInstance().push(TimePickerFragment.TAG, timePicker);
    timePickerFragment.show(getActivity().getFragmentManager(), TimePickerFragment.TAG);
}

public static void start(android.content.Context context, java.lang.String realmFileName) {
    android.content.Intent intent = new android.content.Intent(context, de.jonasrottmann.realmbrowser.RealmBrowserActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.putExtra(de.jonasrottmann.realmbrowser.RealmBrowserActivity.EXTRAS_REALM_FILE_NAME, realmFileName);
    context.startActivity(intent);
}

private boolean verifyGifImage(android.net.Uri gifUri) {
    return (gifUri != null) && (gifUri.toString().endsWith(".gif"));
}

