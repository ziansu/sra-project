@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    dayAdapter = new org.buildmlearn.mconference.adapters.DayRecyclerView(talks);
    dayRecyclerView.setAdapter(dayAdapter);
}

private void weChatAction(int flag) {
    if (!(checkWXInstalled())) {
        android.widget.Toast.makeText(mContext, getString(R.string.weiChat_not_installed), Toast.LENGTH_SHORT).show();
    }else {
        weChatShare(flag);
        setVisible();
    }
}

private void iniData() {
    new com.kejian.mike.mike_kejian_android.ui.campus.HottestPostListFragment.InitDataTask().execute();
}

public void guestAccessClick(android.view.View view) {
    android.app.DialogFragment dialog = new com.funhausclicker.saxypandabear.funhausclicker.GuestAccessDialog();
    dialog.show(getFragmentManager(), "guest_access");
}

@java.lang.Override
public void answerRandomInput(java.lang.String randomInput) {
    webViewBooker.sendCaptcha(randomInput);
}

private void handleThemeActivated(@android.support.annotation.NonNull
org.wordpress.android.fluxc.store.ThemeStore.ActivateThemePayload payload) {
    org.wordpress.android.fluxc.store.ThemeStore.OnThemeActivated event = new org.wordpress.android.fluxc.store.ThemeStore.OnThemeActivated(payload.site, payload.theme);
    event.error = payload.error;
    emitChange(event);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (((weight.getText().toString()) != null) && ((height.getText().toString()) != null)) {
        cal_BMI();
    }
}

@java.lang.Override
public void onCreate() {
    android.util.Log.d(ListviewFragment.LOG_TAG, "onCreate() called from AutoStartUpService");
    super.onCreate();
    oth_regensburg.automaticnewspaperdownloader.AutoStartUpService.InitService(this);
    oth_regensburg.automaticnewspaperdownloader.AutoStartUpService.setAlarm(this, false);
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    isOnlyMain = false;
}

@java.lang.Override
public void onMessageReceived(com.google.android.gms.wearable.MessageEvent messageEvent) {
    if (messageEvent.getPath().equals("/increase_wear_counter")) {
        tvMessage.setText(java.lang.Integer.toString((++(count))));
    }
}

@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    editNamsinh.setText(java.lang.String.valueOf(((((dayOfMonth + "/") + (monthOfYear + 1)) + "/") + year)));
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    mScale = com.thedeveloperworldisyours.carouselviewpager.CustomPagerAdapter.SMALL_SCALE;
    return com.thedeveloperworldisyours.carouselviewpager.CustomFragment.newInstance(mContext, position, mScale);
}

@java.lang.Override
public void onClick(android.view.View view) {
    contributorDialog(true).show();
    dialog.dismiss();
}

public void onDrawerClosed(android.view.View view) {
    supportInvalidateOptionsMenu();
}

public static void e(final java.lang.Exception e) {
    android.util.Log.e(com.stanko.tools.Log.getMethodName(), e.getMessage(), e);
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        mNavigationHandler.switchFragment(new org.hisp.dhis2.android.sdk.fragments.SettingsFragment(), SettingsFragment.TAG, true);
    }
    return super.onOptionsItemSelected(item);
}

@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_crash_if_unknown_view_class() {
    io.nlopez.smartadapters.builders.AABindableLayoutBuilder builder = new io.nlopez.smartadapters.builders.AABindableLayoutBuilder();
    int viewType = mapper.viewTypeFromViewClass(builder.viewType(0, 0, mapper));
    android.view.View bindableLayout = builder.build(parent, 0, null, mapper);
}

@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    if ((connectionResult.getErrorCode()) == (com.google.android.gms.common.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED)) {
        android.util.Log.i(com.gmail.vanyadubik.managerplus.common.Consts.TAGLOG_GPS, "Google play service not updated");
    }
    locationUpdateListener.cannotReceiveLocationUpdates("Google play service not updated");
}

public void changeTestProviderLocation(android.location.Location location) {
    if ((locationManager) != null) {
        locationManager.setTestProviderLocation(preferredLocationProvider, location);
    }else {
        android.util.Log.w("TagSwipeActivity", "Location manager is null, cannot change the location in the test provider");
    }
}

@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
    return android.view.LayoutInflater.from(context).inflate(R.layout.contact_adapter_view, viewGroup, false);
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
public static void tintNotificationBar(int colorId, android.app.Activity activity) {
    activity.getWindow().setStatusBarColor(activity.getResources().getColor(colorId));
}

private boolean isExternalStorageReadable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    return (Environment.MEDIA_MOUNTED.equals(state)) || (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state));
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, java.lang.Throwable error) {
    android.util.Log.e("Update check", "Couldn't get latest version");
}

public void startGame(android.view.View view) {
    gameView.startGame();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    gapiClient.connect();
}

@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    if (bitmap != null)
        this.photo.setImageBitmap(bitmap);
    
}

@java.lang.Override
public it.zerocool.batmacaana.ContentAdapter.ContentViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = inflater.inflate(R.layout.card_content, parent, false);
    return new it.zerocool.batmacaana.ContentAdapter.ContentViewHolder(view);
}

@java.lang.Override
@android.support.annotation.CallSuper
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResource());
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    if (!(activity.requestCameraPermissions()))
        activity.takePictureWithIntent();
    
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.item_full_screen_image, container, false);
    initUI(rootView);
    initSupportActionBar(rootView);
    return rootView;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((viewDetailsListener) != null)
        viewDetailsListener.onViewClickListener(v.getId(), tradeBackupDataDTO.getTicket(), tradeBackupDataDTO);
    
}

@java.lang.Deprecated
protected android.view.View getViewInternal(int position, android.view.View convertView, android.view.ViewGroup container) {
    if ((getItemCount()) == 0)
        return null;
    
    return getView((position % (getItemCount())), convertView, container);
}

public void uploadSamplesToGithub(android.view.View v) {
    android.content.Intent myIntent = new android.content.Intent(this, de.volzo.tapper.RecordActivity.class);
    myIntent.putExtra("GESTURE", GestureType.DOUBLETAP.toString());
    this.startActivity(myIntent);
}

public void removeNotification(android.content.Context context) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(org.oucho.radio2.PlayerService.NOTIFY_ID);
}

private static void setUses(android.content.SharedPreferences prefs, int uses) {
    prefs.edit().putInt(Constants.PREF_KEY_RATING_USES, uses).commit();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
}

private void guardarUsuarioLogueado(java.lang.Integer idUsuario) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    prefs.edit().putInt(getString(R.string.pref_sesion_inic), idUsuario).apply();
}

public static void storeImage(android.graphics.Bitmap image, java.lang.String saveFilePath) throws java.io.IOException {
    java.io.FileOutputStream fos = new java.io.FileOutputStream(saveFilePath);
    image.compress(Bitmap.CompressFormat.PNG, 70, fos);
    fos.close();
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    friends = new java.util.ArrayList<>();
    newfriends = new java.util.ArrayList<>();
    getfriends();
    bindViews();
    populate();
    getNewfriends();
}

@java.lang.Override
public void onDeleted(android.content.Context context, int[] appWidgetIds) {
}

public byte[] asset(android.content.Context context) throws java.io.IOException {
    return com.echsylon.atlantis.internal.Utils.readAsset(context, asset);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((this.getResources().getConfiguration().orientation) == 1) {
        startAlarm();
    }
}

@java.lang.Override
public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mTasks = com.infiniteloop.mytasks.TaskLab.get(getActivity()).getTasks();
}

private void deactivateView(android.view.View parent) {
    for (android.view.View foo : parent.getTouchables()) {
        foo.setClickable(false);
        foo.setEnabled(false);
    }
    parent.setEnabled(false);
    parent.setClickable(false);
}

public static final void i(java.lang.String tag, java.lang.String msg) {
    if (com.llxx.socket.loger.Ll_Loger.LOGED)
        android.util.Log.i(tag, ((com.llxx.socket.loger.Ll_Loger.LOG_BUILD) + msg));
    
}

public void onClick(android.view.View v) {
    this.changeExpress(ivLike, ivDislike, tvLikeCount, true, true, llLikeAnimator);
}

@java.lang.Override
protected void onSaveInstanceState(@android.support.annotation.NonNull
android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((player) != null) {
        if (player.isPlaying()) {
            outState.putInt("video-position", player.getCurrentPosition());
        }
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diaryentry);
    evaluateData();
}

private android.hardware.Camera getCamera() {
    return getCamera(true);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    com.example.mango.focustime.util.PreferenceUtilities.setForceQuit(mContext, false);
    android.content.Intent intent = new android.content.Intent(mContext, com.example.mango.focustime.Activity.PunishmentActivity.class);
    mContext.startActivity(intent);
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.List<apps.novin.tvcompanion.db.ShowEntity>> loader) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((cm.com.newdon.common.CommonData.bottomBarActivity) != null) {
        CommonData.bottomBarActivity.changePostDonationsFragment(post);
    }
}

public void onClickListenerLog(android.view.View v) {
    addString(getString(R.string.log));
}

public void onClickLanding(android.view.View view) {
    sendCommand(de.hhn.munz.ardrone2.ATCommand.land(), false);
}

private void onGameEnd(int Score, int difficulty) {
    android.content.Intent endGame = new android.content.Intent(this, com.twotowerstudios.clickr.PostGameScreen.class);
    endGame.putExtra("score", Score);
    endGame.putExtra("difficulty", difficulty);
    startActivity(endGame);
}

private boolean sendBroadcast(com.cloudinary.android.sample.model.Resource updatedResource) {
    if (updatedResource != null) {
        return android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(new android.content.Intent(com.cloudinary.android.sample.app.CloudinaryService.ACTION_RESOURCE_MODIFIED).putExtra("resource", updatedResource));
    }
    return false;
}

public static void deletePermit(@android.support.annotation.NonNull
java.lang.String permitId, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.lang.Void> callback) {
    if (permitId != null) {
        com.airmap.airmapsdk.networking.services.PilotService.deletePermit(permitId, callback);
    }
}

public com.hkm.disqus.api.AuthTokenServiceManager createAuthenticationManager(android.content.Context context) {
    return new com.hkm.disqus.api.AuthTokenServiceManager(context, createTokenService(), _config);
}

public java.lang.Object get(java.lang.String link) {
    try {
        return remoteGet.send(link, null);
    } catch (java.lang.Exception e) {
        return e;
    }
}

public void openFragment(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.container, fragment);
    ft.addToBackStack(null);
    ft.commitAllowingStateLoss();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(mName);
    parcel.writeInt(mCurrentPage);
    parcel.writeInt(mTotalPages);
}

@java.lang.Override
public void accept(java.util.List<prada.lab.android.pingo.model.PingoPlace> pingoPlaces) throws java.lang.Exception {
    mLastUpdatedTime.set(java.lang.System.currentTimeMillis());
    mPlaces = new java.util.ArrayList(pingoPlaces);
    mPlacesSubject.onNext(mPlaces);
    success.accept(mPlaces);
}

public void displayImage() {
    android.content.Intent intent = new android.content.Intent(this, com.example.jimmyklein.geosnap.ImageViewActivity.class);
    intent.putExtra("EXTRA_FILE_URI", fileUri.toString());
    startActivity(intent);
}

protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        this.userProfile = rs.veselinromic.eref.wrapper.Wrapper.getUserProfile();
    } catch (java.lang.Exception e) {
        android.util.Log.e("GetUserProfileTask", "e", e);
    }
    return null;
}

@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    java.lang.CharSequence word = bookView.getWordAt(e.getX(), e.getY());
    if (word != null) {
        selectedWord = word;
        openContextMenu(bookView);
    }
}

@java.lang.Override
public void bindLayout(java.lang.Object target, int layoutId) {
    if (layoutId > 0) {
        ((android.app.Activity) (target)).setContentView(layoutId);
    }
}

static boolean isPackageInstalled(java.lang.String packagename, android.content.pm.PackageManager packageManager) {
    try {
        packageManager.getPackageInfo(packagename, 0);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}

public void onClick(android.view.View view) {
    relativeLayout.removeView(screenLayout);
    gameBoardView.removeScoreText();
}

@java.lang.Override
public com.skoczo.animalhealthbook.main.ngview.MyItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_main_layout, parent, false);
    return new com.skoczo.animalhealthbook.main.ngview.MyItemRecyclerViewAdapter.ViewHolder(view, parent.getContext());
}

@java.lang.Override
public void onClick(android.view.View v) {
    feedbackManager.giveLikeToThreadFeedback(currThreadFeedback, pos);
}

@java.lang.Override
public void onFigureMoved(android.graphics.Rect oldArea, android.graphics.Rect newArea) {
    renderThread.execute(new net.dimatomp.tetris.TetrisView.Refresher(oldArea));
}

@javax.inject.Singleton
@dagger.Provides
android.net.ConnectivityManager provideConnectivityManager() {
    return ((android.net.ConnectivityManager) (application.getSystemService(Context.CONNECTIVITY_SERVICE)));
}

public void onClick(android.view.View v) {
    Buttons.get(((v.getId()) + 1)).setText(java.lang.Integer.toString(hideTextArray[v.getId()]));
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            break;
    }
    return super.onOptionsItemSelected(item);
}

public void sendUpdateMessage() {
    if ((communicationManager) == null)
        return ;
    
    de.ohg.fitag.android.discoveryVehicleRemote.DataMessage message = de.ohg.fitag.android.discoveryVehicleRemote.DataMessage.build().append("degree", java.lang.Math.round(new_rotation));
    communicationManager.sendMessage(message);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.jonasgerdes.schauburgr.model.Guide> call, java.lang.Throwable t) {
    android.util.Log.e(com.jonasgerdes.schauburgr.usecase.home.guide.GuidePresenter.TAG, "onFailure: ", t);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentShotObjList) != null) {
        currentShotObjList.clear();
        dribbbleAdapter.notifyDataSetChanged();
    }
    retrieveDataFromAPi();
}

public static void startComm(@android.support.annotation.NonNull
com.airmap.airmapsdk.models.flight.AirMapFlight flight, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.comm.AirMapComm> callback) {
    if (flight != null) {
        com.airmap.airmapsdk.networking.services.FlightService.getCommKey(flight, callback);
    }
}

public static void w(java.lang.String tag, java.lang.String msg) {
    android.util.Log.w(daylemk.xposed.xbridge.utils.Log.getFormattedTag(tag), msg);
}

private void FocusAble(android.widget.EditText te, boolean b) {
    te.setFocusable(b);
    te.setFocusableInTouchMode(b);
}

protected void connectDevice(final org.deviceconnect.android.deviceplugin.hitoe.data.HitoeDevice device) {
    if (org.deviceconnect.android.deviceplugin.hitoe.util.BleUtils.isEnabled(this)) {
        mConnectingDevice = device;
        showProgressDialog(device.getName());
        getManager().connectHitoeDevice(device);
    }
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
}

public static boolean canShowWelcomeScreen(android.content.Context context) {
    final android.content.SharedPreferences prefs = context.getSharedPreferences(com.android.dialer.util.DialerUtils.PREFS_MESSAGE, Context.MODE_PRIVATE);
    return prefs.getBoolean(com.android.dialer.util.DialerUtils.KEY_STATE, false);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.vpn_profile_list);
    setHasOptionsMenu(true);
    refreshList();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
}

@com.facebook.react.bridge.ReactMethod
public void getOrientation(com.facebook.react.bridge.Callback success) {
    com.facebook.react.bridge.WritableNativeMap data = getDataMap();
    success.invoke(data);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
}

void showUnlockDialog() {
    showDialog();
}

public void onClick(android.view.View v) {
}

private void bindNewDetails() {
    textView.setText(arrayList.get(currentPosition).getDescription());
    initializePlayer(android.net.Uri.parse(arrayList.get(currentPosition).getVideoURL()));
}

public void setContext(android.content.Context c) {
    context = c;
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    mAdapter.swapCursor(null);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    controller = new com.app.dimbo.simplecalculator.Controller(this);
    bindViewControls();
}

@java.lang.Override
public void onItemClick(android.view.View view, int position) {
}

@java.lang.Override
public void onAttach(android.content.Context activity) {
    super.onAttach(activity);
    mMeetings = new ca.rmen.android.scrumchatter.meeting.Meetings(((android.support.v4.app.FragmentActivity) (activity)));
}

@java.lang.Override
public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int width, int height) {
    setSize(width, height);
    dispatchSurfaceChanged();
    setTruePreviewSize(mTrueWidth, mTrueHeight);
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    if ((mOnNavItemClickListener) != null) {
        mOnMenuItemSelectedListener.onItemSelected(item);
        closeDrawer();
    }
    return false;
}

