private boolean isGoogleMapsInstalled() {
    try {
        getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        showLoginError("Authentication failed.");
    }
}

public void interactionEnded() throws java.io.IOException {
    if ((socket) != null) {
        socket.close();
    }
    socket = null;
    com.android.gscaparrotti.bendermobile.ServerInteractor.instance = null;
}

@butterknife.OnClick(value = R2.id.add)
public void setAdd() {
}

@java.lang.Override
public void onClick(android.view.View v) {
    screen.delete(0, screen.length());
    calculatorScreen.setText("0");
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    barProgress3 = new android.app.ProgressDialog(this);
    barProgress3.setTitle("Sauvegarde de votre alimentation en cours...");
    barProgress3.show();
}

public void onStartClicked(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, edu.dartmouth.cs.project.sixpk.WorkoutActivity.class);
    startActivity(i);
}

@java.lang.Override
public void hideKeyboard() {
    android.view.inputmethod.InputMethodManager manager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    android.view.View view = getCurrentFocus();
    if (view != null) {
        manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.harryjamesuk.ribbit.InboxFragment();
        case 1 :
            return new com.harryjamesuk.ribbit.FriendsFragment();
    }
    return null;
}

@java.lang.Override
public void onClick(android.view.View v) {
    boolean isChecked = ((android.widget.CheckBox) (v)).isChecked();
    mainActivity.playerData.setReady(isChecked);
}

public void decreaseTime(android.view.View view) {
    if ((timeToGetReadyInMinutes) > 0) {
        timeToGetReadyInMinutes -= 5;
    }
    timeToGetReadyTextView.setText(java.lang.String.valueOf(timeToGetReadyInMinutes));
}

private void setClearOff() {
    setClear(true);
    btn_clear.setVisibility(View.GONE);
    setInputQueryLayout(R.id.activity_search_inputbar_btn_mic);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
}

public static boolean restore(android.support.v4.app.FragmentActivity target) {
    com.woodblockwithoutco.beretained.FieldsRetainer<android.support.v4.app.FragmentActivity> retainer = com.woodblockwithoutco.beretained.BeRetained.findFieldsRetainer(target.getClass());
    if (retainer != null) {
        return retainer.restore(target);
    }else {
        return false;
    }
}

@permissions.dispatcher.NeedsPermission(value = { Manifest.permission.READ_EXTERNAL_STORAGE })
void chooseImage() {
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    i.setType("image/*");
    startActivityForResult(android.content.Intent.createChooser(i, "File Chooser"), SELECT_PICTURE);
}

@java.lang.Override
public void onClick(android.view.View view) {
    int adapterPosition = getAdapterPosition();
    if (adapterPosition != 0) {
        callback.onClickStep((adapterPosition - 1));
    }
}

private static void setupGetEvents() {
    com.zulip.android.widget.ZulipWidget.asyncGetEvents = new com.zulip.android.networking.AsyncGetEvents(com.zulip.android.widget.ZulipWidget.intervalMilliseconds);
    com.zulip.android.widget.ZulipWidget.asyncGetEvents.start();
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
}

@java.lang.Override
public void onClick(android.view.View view) {
    isUpdate = true;
    addMark(viewedMark, viewedMarkWeight, viewedMarkDescription, viewedMarkSubject, true);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    if ((getArguments()) != null) {
        mTaskerMode = getArguments().getBoolean(com.ryansteckler.nlpunbounce.AlarmRegexFragment.ARG_TASKER_MODE);
    }
    super.onCreate(savedInstanceState);
    com.ryansteckler.nlpunbounce.helpers.ThemeHelper.onActivityCreateSetTheme(this.getActivity());
}

public android.content.res.AssetManager getAssetsByBundle(java.lang.String bundleName) {
    com.dynamicload.framework.dynamicload.internal.DLPluginPackage dlPluginPackage = getPluginPackageByBundle(bundleName);
    if (dlPluginPackage == null) {
        return null;
    }
    return dlPluginPackage.assetManager;
}

public java.lang.Boolean shouldAskRational(android.app.Activity activity, java.lang.String requestedPermissions) {
    return android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(activity, requestedPermissions);
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(C.getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    if ((mFuture) == null) {
        mFuture = scheduleLocationPull();
    }
}

public void requestLocationUpdates(android.content.Context context) {
    requestLocationUpdates(context, edu.rosehulman.me435.FieldGps.DEFAULT_MIN_TIME_MS, edu.rosehulman.me435.FieldGps.DEFAULT_MIN_DISTANCE);
}

@java.lang.Override
protected void setupCommonUIDelegate(@android.support.annotation.NonNull
com.playground.notification.app.activities.CommonUIDelegate commonUIDelegate) {
    super.setupCommonUIDelegate(commonUIDelegate);
    commonUIDelegate.setDrawerLayout(mBinding.drawerLayout);
    commonUIDelegate.setNavigationView(mBinding.navView);
    commonUIDelegate.setAppListView(mBinding.appListFl);
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.widget.Toast.makeText(this, result, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void setMessage(int message, boolean error) {
    int color = (error) ? android.graphics.Color.RED : android.graphics.Color.GREEN;
    firstedia.com.newsmanagement.utils.SnackBarMessage.message(snackbar, linearLayout, message, color);
}

public void setToVideoWallpaper(android.view.View v) {
    com.bdqn.zev.videowallpaperdemo.VideoLiveWallpaper.setToWallpaper(this);
}

@java.lang.Override
public void run() {
    java.lang.String chandiCode = com.asag.serial.utils.DataUtils.getPreferences("chandi_data", "");
    if (!(android.text.TextUtils.isEmpty(chandiCode))) {
        sendChandiCode(chandiCode);
    }
}

public synchronized void put(final com.evernote.android.job.JobRequest request) {
    store(request);
    updateRequestInCache(request);
}

@java.lang.Override
public void onChartGestureStart(android.view.MotionEvent event, com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture lastPerformedGesture) {
    android.util.Log.i("Gesture", ((("START, x: " + (event.getX())) + ", y: ") + (event.getY())));
}

@java.lang.Override
public void onNext(manoilo.catsapiandroidclient.model.Cat cat) {
    if (cat != null) {
        getCatImgUrl(cat);
        cats.add(cat);
    }
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (mAdapter.isSelectableItem(position)) {
        mAdapter.doClickOnItem(position);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    requestPermissions(new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, com.tamerbarsbay.depothouston.presentation.view.fragment.MapSearchFragment.REQUEST_CODE_LOCATION_PERMISSION);
}

@java.lang.Override
public void onClick(android.view.View view) {
    activity.clickOnSale(id, quantity);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    backKeyCount = 0;
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    app.com.digitallearning.TeacherModule.Classes.EditClassFragment.style = " ";
    TopicFragment.topic = " ";
    DescriptionFragment.description = " ";
    app.com.digitallearning.TeacherModule.Classes.EditClassFragment.topic1 = " ";
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    incrementRoundsStartedEvent();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), de.appphil.categories.activities.game.config.GameConfigActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mOnNumberClickListener) != null) {
        mOnNumberClickListener.onNumberClicked(this);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mChoice) >= 0) {
        process(mChoice);
    }
    dialog.dismiss();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    timber.log.Timber.d(("location string: " + (location.toString())));
    this.location = location;
}

private java.lang.String getQuantityString(@android.support.annotation.PluralsRes
int resId, int n) {
    return getContext().getResources().getQuantityString(resId, n, n);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    displayRecyclerView(1);
    dialog.dismiss();
}

@java.lang.Override
public void onFrameRendered(android.media.MediaCodec codec, long presentationTimeUs, long nanoTime) {
    if ((this) != (tunnelingOnFrameRenderedListener)) {
        return ;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    super.onCreate(savedInstanceState);
    setRecentBar(null, me.ccrama.redditslide.Visuals.Palette.getDefaultColor());
}

private void initialize(android.content.Context context) {
    inflate(context, R.layout.task_strip_view, this);
}

public void onClickPrev(android.view.View view) {
    if ((currPos) > 0) {
        (currPos)--;
        if ((currPos) == 0) {
            currPos = (dict.size()) - 1;
        }
        updateMemorizationView();
    }
}

public void stopTrip() {
    android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean(Constants.IS_DRIVER_ON_TRIP, false).apply();
    addNotification();
    startCalculatingDistanceIfDriverOnTrip();
}

@java.lang.Override
public void showCars(com.automotive.hhi.mileagetracker.adapters.CarAdapter cars) {
    mCarRecyclerView.setAdapter(cars);
    cars.notifyDataSetChanged();
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    mp.start();
    changePlayerState(true);
    changeNotificationMessage();
    com.tan.musicplayer.MusicPlayerApplication.executeDBRunning(mRencentDBRunnable);
}

@java.lang.Override
public void onEvent(int eventType, android.os.Bundle params) {
}

@java.lang.Override
protected android.widget.TextView updateDrawable(final android.graphics.drawable.Drawable newDrawable) {
    final android.widget.TextView view = super.updateDrawable(newDrawable);
    if (view != null) {
        setBounds(cgeo.geocaching.utils.ImageUtils.scaleImageToLineHeight(newDrawable, view));
    }
    return view;
}

public static android.graphics.Bitmap autoPhotoSampling(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
    return jp.itnav.derushio.autophotosampling.AutoPhotoSampling.autoPhotoSampling(imageView, bitmap, null, null, null);
}

public boolean dispatchTouchEvent(android.view.MotionEvent motionevent) {
    super.dispatchTouchEvent(motionevent);
    mFragment.scaleDetector.onTouchEvent(motionevent);
    mFragment.handleTouchEvent(motionevent);
    mFragment.gestureDetector.onTouchEvent(motionevent);
    return mFragment.gestureDetector.onTouchEvent(motionevent);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.Intent intent = new android.content.Intent(this, io.github.sdsstudios.ScoreKeeper.EditGame.class);
    intent.putExtra("gameID", gameID);
    startActivity(intent);
}

@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    if (mImageCaptureUri != null) {
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.graphics.BitmapFactory.Options bitmapOptions = new android.graphics.BitmapFactory.Options();
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(path, bitmapOptions);
    largeImage.setImageBitmap(bitmap);
    largeImage.setVisibility(View.VISIBLE);
}

public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.marco_button :
            break;
        case R.id.end_game_button :
            break;
    }
}

public com.daasuu.library.Container removeChild(@android.support.annotation.NonNull
com.daasuu.library.DisplayObject DisplayObject) {
    mDisplayList.remove(DisplayObject);
    return this;
}

private void registerSyncStatusBroadcastReceiver() {
    syncStatusBroadcastReceiver = new org.ei.opensrp.path.receiver.SyncStatusBroadcastReceiver();
    syncStatusBroadcastReceiver.addSyncStatusListener(this);
    registerReceiver(syncStatusBroadcastReceiver, new android.content.IntentFilter(org.ei.opensrp.path.receiver.SyncStatusBroadcastReceiver.ACTION_SYNC_STATUS));
}

public void attackersConfirmSameStep(android.content.DialogInterface dialog, int id) {
    mBattlefield.confirmAttack();
    setNextStepButtonText();
}

@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    if (isFirstLaunch.compareAndSet(true, false)) {
        onAppDidEnterForeground();
        return ;
    }
    if ((appState) == (com.jenzz.appstate.AppState.BACKGROUND)) {
        onAppDidEnterForeground();
    }
}

@java.lang.Override
public void onTokenRefresh() {
    java.lang.String refreshedToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    com.codepath.socialshopper.socialshopper.Listeners.MyFirebaseInstanceIDService.REGISTRATION_ID = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
    android.util.Log.d(com.codepath.socialshopper.socialshopper.Listeners.MyFirebaseInstanceIDService.TAG, ("Token: " + refreshedToken));
}

@java.lang.Override
public void onInitialized() {
    if (isLoggedIn()) {
        updateMyprofile(false);
    }
}

public boolean allTasksCompleted() {
    if (mTasks.isEmpty())
        return false;
    
    for (com.laytonlabs.android.todotoday.Task t : mTasks) {
        if (!(t.isCompleted())) {
            return false;
        }
    }
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    mRadioManager.startRadio(RADIO_URL[index]);
}

@java.lang.Override
protected void onPostExecute(java.lang.Long localPlayTime) {
    android.util.Log.d(TAG, "OnPostExecute");
    com.speakr.connorriley.speakr.SongTimer songtimer = new com.speakr.connorriley.speakr.SongTimer(localPlayTime, musicSrv, controller, actionstring, context);
}

public static void showLoading(android.support.v4.app.FragmentActivity activity) {
    com.liangmayong.loading.Loading.showLoading(activity, "", (-1), (-1), 0.0F);
}

public static void setMarquee(android.widget.TextView textView) {
    textView.setSingleLine(true);
    textView.setSelected(true);
    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    textView.setMarqueeRepeatLimit((-1));
}

private void setItemsArray(@android.support.annotation.ArrayRes
int arrayResId, @android.support.annotation.LayoutRes
int spinnerItemRes, @android.support.annotation.LayoutRes
int dropdownViewRes) {
    android.widget.ArrayAdapter<java.lang.CharSequence> adapter = android.widget.ArrayAdapter.createFromResource(getContext(), arrayResId, spinnerItemRes);
    adapter.setDropDownViewResource(dropdownViewRes);
    setAdapter(adapter);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = mContext.getPackageManager().getLaunchIntentForPackage(mContext.getPackageName());
    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    mContext.startActivity(i);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    mLevelText.setText(java.lang.String.format(getString(R.string.textLevelFormat), java.lang.String.format(getString(R.string.percentLevelFormat), (progress + 1))));
}

public void clickStart(android.view.View view) {
    receivingDataMode = true;
    output().setLength(0);
    sendCommand(com.adafruit.bleuart.MainActivity.microCommand.START);
    writeLine("\n-- START --\n");
}

@com.facebook.react.bridge.ReactMethod
public void checkForUpdate() {
    android.app.Activity currentActivity = getCurrentActivity();
    if (currentActivity == null) {
        return ;
    }
    if (com.slowpath.hockeyapp.RNHockeyAppModule._initialized) {
        net.hockeyapp.android.UpdateManager.register(currentActivity, com.slowpath.hockeyapp.RNHockeyAppModule._token);
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    prefs.edit().putLong(eu.faircode.backpacktrack2.SettingsFragment.PREF_LAST_WEATHER_VIEWPORT, eu.faircode.backpacktrack2.SettingsFragment.DAY_MS).apply();
    showWeatherGraph(graph);
}

public void setPartner(@android.support.annotation.NonNull
java.lang.String currentText, java.lang.String cursortext, long newID) {
    setPartnername(currentText);
    setPartnerID(newID);
}

private void startConfigFragment() {
    android.app.FragmentManager fm = getFragmentManager();
    com.example.filip.gpsrecorder.ConfigFragment config = new com.example.filip.gpsrecorder.ConfigFragment();
    config.show(fm, "dialog");
}

protected void init(android.content.Context context, android.util.AttributeSet attrs) {
    initAttributes(context, attrs);
}

public static synchronized void registerWakeupBroadcast(android.content.Context context, android.content.Intent intent) {
    com.magnet.mmx.client.api.MMX.getSharedPrefs(context).edit().putString(com.magnet.mmx.client.api.MMX.PREF_WAKEUP_INTENT_URI, intent.toUri(Intent.URI_INTENT_SCHEME)).apply();
}

@java.lang.Override
public void onReceive(com.home.pete.aquarium.Context context, com.home.pete.aquarium.Intent intent) {
    int msg = intent.getIntExtra("ACTION", 0);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game_form);
}

public boolean isLogin(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String token = sharedPreferences.getString(com.example.gssflyaway.mobilecourse.model.UserModel.TOKEN, "");
    if (token.equals(""))
        return true;
    else
        return true;
    
}

@java.lang.Override
@java.lang.Deprecated
public void setBackgroundDrawable(android.graphics.drawable.Drawable background) {
    mBackgroundDrawable = background;
    updateBackgroundDrawableAttrs(true);
    if ((BuildConfig.VERSION_CODE) >= (Build.VERSION_CODES.JELLY_BEAN))
        super.setBackground(mBackgroundDrawable);
    else
        super.setBackgroundDrawable(mBackgroundDrawable);
    
}

@java.lang.Override
public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult result) {
    callback.onAuthenticated();
}

@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a progress bar of n units", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "units" })
public org.protocoderrunner.apprunner.api.widgets.PProgressBar newProgress(int max) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PProgressBar pb = new org.protocoderrunner.apprunner.api.widgets.PProgressBar(getActivity(), android.R.attr.progressBarStyleHorizontal);
    return pb;
}

@java.lang.Override
public void onClick(android.view.View view) {
    addMark();
}

public void stop() {
    synchronized(mTasks) {
        try {
            mbCenterStopped = true;
            mTasks.notifyAll();
            com.androidlogsuite.task.TaskCenter.mSelector.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}

private boolean isIsha(co.ideaportal.srirangadigital.shankara_android.model.Link book) {
    return bookIsha.toString().equals(book.name);
}

protected void onResume() {
    super.onResume();
    stepDetector.onResume();
}

void onPhotoPicked(android.net.Uri uri) {
    if ((photoEmitter) != null) {
        photoEmitter.onNext(uri);
        photoEmitter.onComplete();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_addcompany :
            addCompany();
            break;
        case R.id.btn_add_category :
            addCategory();
            break;
    }
}

@android.support.annotation.Nullable
@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    return null;
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    onItemClickCustom(viewHolder);
}

@java.lang.Override
public void onItemClickListener(android.view.View v, com.peter.parttime.managershare.ManagerShareActivity.Paper p) {
    com.peter.parttime.managershare.ManagerShareActivity.switchToArticle(this, p.mHref, p.mPicture, p.mTitle, v.findViewById(R.id.pic), v);
}

@java.lang.Override
public void onClick(android.view.View view) {
    by.vshkl.translate2.util.Navigation.navigateToAppSettings(this);
}

@java.lang.Override
public com.sfparks.model.Park call(com.google.gson.JsonObject object) {
    return com.sfparks.model.ParksModule.getParkFromRecord(object, jsonParser, latLng);
}

@java.lang.Override
public void onClick(android.view.View v) {
    manager.removeView(view);
}

@java.lang.Override
public void onClick(android.view.View v) {
    doodleView.setPenColor(tempColor);
    doodleView.setPenWidth(tempProgress);
    selectDialog.dismiss();
}

