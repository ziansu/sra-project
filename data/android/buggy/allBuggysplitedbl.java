@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if (marker == (markerArrayList.get(0))) {
    }
}

public static int getDeviceNetwokActivity(android.content.Context context) {
    return ((com.cordova.ansensors.plugin.TelephonyManager) (mContext.getSystemService(Context.TELEPHONY_SERVICE))).listen(mPhoneStateListener, ((PhoneStateListener.LISTEN_DATA_CONNECTION_STATE) | (PhoneStateListener.LISTEN_DATA_ACTIVITY)));
}

public void exit(android.view.View view) {
    finish();
    exit(view);
}

public void clearRegisteredAuthenticationListener() {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "clearRegisteredAuthenticationListener");
    mAuthListener = null;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setDefaultTextValues(true);
    if (savedInstanceState == null) {
        savedInstanceState = getArguments();
    }
    restoreFromBundle(savedInstanceState);
}

public void launchSettingsActivity(android.view.MenuItem item) {
    android.content.Intent launchSettings = new android.content.Intent(this, com.dita.dev.memoapp.ui.activity.SettingsActivity.class);
    startActivity(launchSettings);
    drawer.closeDrawer(GravityCompat.START);
}

@java.lang.Override
public void stopBeat() {
    if ((svc) != null) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        com.tungnd.android.metronome.MainActivity.playerService.stopBeat();
        beatView.stopBeat();
        stopService(svc);
    }
}

private boolean is4KEnabled() {
    if (((mProfile.quality) == (android.media.CamcorderProfile.QUALITY_2160P)) || ((mProfile.quality) == (android.media.CamcorderProfile.QUALITY_4kDCI))) {
        return true;
    }else {
        return false;
    }
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    android.util.Log.v("Activity", "onConfigurationChanged");
    android.util.Log.v("Configuration", java.lang.String.valueOf(newConfig.orientation));
    orientation = newConfig.orientation;
    onWindowFocusChanged(true);
}

private void backToFlActivity() {
    android.content.Intent intent;
    intent = new android.content.Intent(this, org.redPanda.ChannelList.FlActivity.class);
    intent.addFlags(((android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP)));
    startActivity(intent);
}

public void setPageBlock(com.hyena.coretext.TextEnv textEnv, com.hyena.coretext.blocks.CYPageBlock pageBlock) {
    mTextEnv = textEnv;
    this.mPageBlock = pageBlock;
    android.util.Log.v("yangzc", "setPageBlock");
}

private void sendStatusbarNotification(com.newscombinator.notifier.Doc doc) {
    if ((showNotification) == false) {
        android.util.Log.e(Consts.APP_TAG, "Not showing Notifiction because flag set");
        return ;
    }
    com.newscombinator.notifier.handler.NotificationHandler.getInstance(context).sendStatusbarNotification(doc);
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent intent = new android.content.Intent(context, edu.washington.prathh.change.Payment_Step2.class);
    intent.putExtra("amount", editText.getText().toString().substring(1));
    startActivity(intent);
}

protected void processPauseRequest() {
    this.mPlayback.pause();
    this.mDelayedStopHandler.removeCallbacksAndMessages(null);
    this.mDelayedStopHandler.sendEmptyMessageDelayed(0, com.dreamdigitizers.androidbaselibrary.views.classes.services.ServiceMediaPlayer.STOP_DELAY);
}

@java.lang.Override
public void finish() {
    user.setInventory(inventory);
    saveUser();
    updateOnline();
    setResult(cmput301exchange.exchange.Activities.RESULT_OK, new android.content.Intent());
    super.finish();
}

public org.gearvrf.jassimp.AiMaterial getMeshMaterial(org.gearvrf.GVRAndroidResource androidResource, java.lang.String nodeName, int meshIndex) {
    org.gearvrf.GVRAssimpImporter assimpImporter = org.gearvrf.GVRImporter.readFileFromResources(this, androidResource, org.gearvrf.GVRImportSettings.getRecommendedSettings());
    return assimpImporter.getMeshMaterial(nodeName, meshIndex);
}

private void updateListView() {
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter<java.lang.String>(this, R.layout.simple_row1, R.id.text1, listOfValues);
    listView.setAdapter(adapter);
}

private void onError() {
    android.widget.Toast.makeText(getActivity(), getActivity().getString(R.string.could_not_redact), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public boolean drawFrame(android.graphics.drawable.Drawable parent, android.graphics.Canvas canvas, int frameNumber) {
    if ((mAnimationBackend) != null) {
        return mAnimationBackend.drawFrame(parent, canvas, frameNumber);
    }
    return false;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (!(com.ripplex.fileobservertester.RuntimePermissionsChecker.checkSelfStoragePermissions(getApplicationContext()))) {
        com.ripplex.fileobservertester.RuntimePermissionsChecker.requestStoragePermissions(this, com.ripplex.fileobservertester.MainActivity.PERMISSION_REQUEST_CODE);
    }
}

@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    account.setPhoto(bitmap.copy(Bitmap.Config.ARGB_8888, true));
    notifyAccountDataChanged();
}

public static void e(java.lang.String c, java.lang.String s) {
    if ((org.piwik.sdk.tools.Logy.sLoglevel) >= (org.piwik.sdk.tools.Logy.SILENT)) {
        android.util.Log.e(c, s);
    }
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.layout_recycler_view, container);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recycler_view)));
    return view;
}

@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult result) {
    android.support.design.widget.Snackbar.make(this.findViewById(R.id.main_activity_view), ("Exception while connecting to Google Play services: " + (result.getErrorMessage())), Snackbar.LENGTH_INDEFINITE).show();
}

private java.lang.String getSDKVersion() {
    final android.content.Context ctx = getActivity();
    final java.lang.String version = ctx.getString(R.string.sdk_version_string, com.spotxchange.sdk.android.SpotxAdSettings.getSdkVersion());
    return version;
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    inflater.inflate(R.menu.record_list_actions, menu);
    Util.Material.tintMenu(menu, getActivity());
}

public java.lang.Object getItem(int position) {
    android.util.Log.i("POSITION", ("GETITEM: " + (java.lang.String.valueOf(position))));
    return null;
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    removeItemFromList(position);
    android.widget.Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
    return true;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            dialog.cancel();
            break;
    }
}

@java.lang.Override
public void call(android.support.v4.util.Pair<org.unicef.rapidreg.model.Case, retrofit2.Response<com.google.gson.JsonElement>> pair) {
    getView().setProgressIncrease();
    increaseSyncNumber();
    updateRecordSynced(pair.first, true);
}

@java.lang.Override
public synchronized void queueInput(org.mozilla.gecko.media.Sample sample) throws android.os.RemoteException {
    if (!(mInputProcessor.onSample(sample))) {
        reportError(org.mozilla.gecko.media.Codec.Error.FATAL, new java.lang.Exception("FAIL: input sample queue is full"));
    }
}

public void onCameraAvailable(java.lang.String cameraId) {
    mPreferences.setCamActiv(false);
    de.simu.decoit.android.decomap.util.Toolbox.logTxt(this.getLocalClassName(), "Camera is not in use!");
}

public static void clearQueue() {
    try {
        com.naman14.timber.MusicPlayer.mService.removeTracks(0, java.lang.Integer.MAX_VALUE);
    } catch (final android.os.RemoteException ignored) {
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (updateProfileImage)
        removeProfilePic();
    
    startActivity(new android.content.Intent(this, btracker.example.raggitha.btracker.profileActivity.class));
    finish();
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            importUnmatchedPrivateKey(key);
        }
    });
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.d("log", "click zamknij");
    gameEnded = true;
    EndGame();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
    }
}

public static void disableAddProblemMode() {
    org.ecomap.android.app.fragments.EcoMapFragment.addproblemModeIsEnabled = false;
    org.ecomap.android.app.fragments.EcoMapFragment.setMarkerClickType(0);
    org.ecomap.android.app.fragments.EcoMapFragment.addProblemFragment = null;
    org.ecomap.android.app.fragments.EcoMapFragment.mapClusterer.deleteMarker();
    org.ecomap.android.app.fragments.EcoMapFragment.addProblemSnackbar.dismiss();
    org.ecomap.android.app.fragments.EcoMapFragment.fabAddProblem.setImageResource(R.drawable.ic_location_on_white_24dp);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    mIsRefreshing = false;
    if (mNotify) {
        if ((mOnRefreshListener) != null) {
            mOnRefreshListener.onRefresh();
        }
    }
}

public void onClick(android.content.DialogInterface dialog, int which) {
    deleteSchoolSubject(parent.getItemAtPosition(position).toString());
    setAdapterList();
}

private android.net.Uri insertActorValues(android.content.ContentValues actorValues) {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "insertActorValues");
    android.net.Uri actor = RadioTheaterContract.ActorsEntry.buildActorsUri();
    return activity.getContentResolver().insert(actor, actorValues);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialog.dismiss();
    saveDialog();
    cleanSlate();
}

public void onClick(android.view.View v) {
    android.content.Intent intentService = new android.content.Intent(this, org.yy.kyvb.VoiceBroadcastService.class);
    stopService(intentService);
    if ((cur_show_ad) != null) {
        cur_show_ad.hide();
        cur_show_ad = null;
    }
    finish();
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    int tag = msg.arg1;
    java.lang.Object object = msg.obj;
    com.paul.okhttpframework.okhttp.callback.IResultCallback iResultCallback = com.paul.okhttpframework.okhttp.manager.OkBD.getAndRemoveHashMap(tag);
    iResultCallback.onSuccessResult(object, tag);
}

@java.lang.Override
public void addNewRestaurant() {
    addRestaurant = new in.foodtalk.android.fragment.newpost.AddRestaurant();
    setFragmentView(addRestaurant, R.id.container1, 0, true);
}

public void speakWord(java.lang.String word, android.view.View v) {
    speaker = new teamtim.teamtimapp.speechSynthesizer.SpeechSynthesizer(v.getContext());
    speaker.speak(word);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_photoscan);
    initData();
    initUI();
}

static long getInstallDate(android.content.Context context) {
    return hotchemi.android.rate.PreferenceHelper.getPreferences(context).getLong(hotchemi.android.rate.PreferenceHelper.PREF_KEY_INSTALL_DATE, 0);
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION }, com.finrobotics.neyyasample.MainActivity.PERMISSION_REQUEST_COARSE_LOCATION);
}

private void setDefaultConfiguration() {
    com.jstakun.gms.android.data.FileManager fm = com.jstakun.gms.android.data.PersistenceManagerFactory.getFileManager();
    fm.readResourceBundleFile(com.jstakun.gms.android.config.ConfigurationManager.configuration, R.raw.defaultconfig, getContext());
    fm.createDefaultDirs();
    com.jstakun.gms.android.config.ConfigurationManager.changedConfig.clear();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (endSize == 0) {
        android.util.Log.e("Yann", "end size is 0");
        imgPicture.setVisibility(View.GONE);
    }
}

@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    if (!(prevFocus.bool)) {
        showTagsDialog();
    }
    if (b) {
        prevFocus.bool = true;
    }else {
        prevFocus.bool = false;
    }
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    initializeAesthetic(primary, accent, true);
    dialog.dismiss();
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "calling onResume");
    _mapView.onResume();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    buildGeoFence();
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    super.onAnimationStart(animation);
    getFloatingToolbar().setVisibility(View.VISIBLE);
    getFab().setVisibility(View.INVISIBLE);
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    android.util.Log.e(com.hardikarora.spotify_1.service.SpotifyPlayerService.LOG_TAG, "Error occured with the media player.");
    mp.reset();
    return false;
}

public void pauseButton(android.view.MenuItem mi) {
    if ((mPlayer) != null)
        mPlayer.pause(null);
    
    mi.setIntent(mi.getIntent());
}

@org.androidannotations.annotations.UiThread
void displayListView(org.ovirt.mobile.movirt.rest.Disks disks) {
    diskListAdapter = new org.ovirt.mobile.movirt.ui.DiskListAdapter(getActivity(), 0, disks);
    listView.setAdapter(diskListAdapter);
}

@butterknife.OnCheckedChanged(value = in.testpress.testpress.R.id.review)
void onChecked(boolean checked) {
    attemptItem.setCurrentReview(checked);
    if (checked)
        questionsView.setBackgroundColor(Color.LTGRAY);
    else
        questionsView.setBackgroundColor(android.R.color.transparent);
    
}

@java.lang.Override
public void onClick() {
    if ((mLayoutType) == (com.malalaoshi.android.fragments.main.ScheduleFragment.LayoutType.UNSIGNUP)) {
        com.malalaoshi.android.utils.AuthUtils.redirectLoginActivity(getContext());
    }else
        if ((mLayoutType) == (com.malalaoshi.android.fragments.main.ScheduleFragment.LayoutType.EMPTY)) {
            onClickEmptyCourse.onClickEmptyCourse(null);
        }
    
}

@android.support.annotation.NonNull
private android.content.Intent buildUserParcelIntent(java.lang.Class expliciteClass, android.os.Parcelable parcelable) {
    android.content.Intent intent = jumpup.imi.fb4.htw.de.jumpupandroid.util.activity.JumpUpActivity.getExpliciteIntent(this, expliciteClass);
    putExtraUserParcelable(parcelable, intent);
    return intent;
}

public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    mWeb.loadUrl(("javascript:(function() { " + ("document.getElementsByClassName(\'summary\').item(0).innerHTML=\'<a href=\\\'#\\\' onclick=\\\'translate()\\\' >Translate</a><br/><br/>\';" + "})()")));
    if (mProgress.isShowing()) {
        mProgress.dismiss();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        startService(new android.content.Intent(this, smartext.com.smscapture.SmsListenerService.class));
    }
    finish();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d("LifeCycle", "Video onSaveInstanceState");
    super.onSaveInstanceState(outState);
    outState.putInt("video_pos", vidView.getCurrentPosition());
}

@java.lang.Override
public void onClick(android.view.View v) {
    mTodoIndex += 1;
    TodoTextView.setText(mTodos[mTodoIndex]);
}

@java.lang.Override
public void onClick(android.view.View v) {
    setDateFromPicker();
    hideKeyboard(v);
}

public static void loadImageFromResourcesToImageView(android.content.Context context, int resourceId, android.widget.ImageView imageView) {
    com.squareup.picasso.Picasso.with(context).load(resourceId).fit().into(imageView);
}

@java.lang.Override
public void onClick(android.view.View view) {
    stopService(serviceIntent);
    serviceIntent.putExtra("tabNum", 2);
    serviceIntent.putExtra("serviceName", "Stand");
    startService(serviceIntent);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.hasExtra("state")) {
        changeShengDao(false);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mFab.isOpened()) {
        mFab.close(true);
    }else {
        mFab.open(true);
    }
}

@java.lang.Override
public void onItemClick(android.view.View v, int position) {
    android.util.Log.d("Clicked", java.lang.Integer.toString(position));
}

public void setLogoView(com.android.internal.navigation.fling.FlingLogoView view) {
    mLogoView = view;
    if ((mLogoColor) != (view.getLogoColor())) {
        view.setLogoColor(mLogoColor);
    }
    view.animate().cancel();
    animateToCurrentState();
}

@rxbus.ecaray.com.rxbuslib.rxbus.RxBusReact(clazz = { java.lang.String.class , java.lang.String.class , java.lang.String.class }, tag = "tag")
public void showContent(java.lang.String content, java.lang.String k, java.lang.String test) {
    android.util.Log.d("tagutil", ("收到的参数: " + content));
}

@java.lang.Override
public void onMinuteSelected(int mMinute) {
    minuteSelected = mMinute;
    minute.add(minuteSelected);
    for (int minutes : minute) {
        android.util.Log.i("Minutes: ", java.lang.String.valueOf(minutes));
    }
}

@android.annotation.SuppressLint(value = "NewApi")
public void stopProcessingThread() {
    if ((processingHandlerThread) != null) {
        processingHandlerThread.quitSafely();
        try {
            processingHandlerThread.join();
            processingHandlerThread = null;
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.matchagames.setmania.activities.MenuActivity.class);
    startActivity(intent);
    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    finish();
}

@java.lang.Override
public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state) {
    recyclerRef = recycler;
    if (state.isPreLayout()) {
        onPreLayoutChildren(recycler);
    }else {
        onRealLayoutChildren(recycler);
    }
}

public static com.tallty.smart_life_android.fragment.cart.SelectAddress newInstance(java.util.ArrayList<com.tallty.smart_life_android.model.Contact> contacts) {
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable(Const.OBJECT_List, contacts);
    com.tallty.smart_life_android.fragment.cart.SelectAddress fragment = new com.tallty.smart_life_android.fragment.cart.SelectAddress();
    fragment.setArguments(args);
    return fragment;
}

public void onClick(android.view.View v) {
    com.wynnej1983.RNAppirater.RNAppiraterModule.rateApp(reactContext, editor);
    dialog.dismiss();
}

public void createBudgetAndAddToUser(money.mezu.mezu.Budget budget, money.mezu.mezu.UserIdentifier uid) {
    android.util.Log.d("", "FirebaseBackend:addBudgetToUser: adding budget to user");
    java.lang.String newBid = createBudget(budget);
    connectBudgetAndUser(newBid, uid.getId().toString(), null);
}

public retrofit2.Call<com.onehilltech.gatekeeper.android.http.JsonBearerToken> getClientToken() {
    com.onehilltech.gatekeeper.android.http.JsonClientCredentials credentials = new com.onehilltech.gatekeeper.android.http.JsonClientCredentials();
    credentials.clientId = this.config_.clientId;
    credentials.clientSecret = this.config_.clientSecret;
    return this.getToken(credentials);
}

@java.lang.Override
public void onActivityResult(int reqCode, int resCode, android.content.Intent intent) {
    if ((command) != null) {
        command.success();
    }
}

@java.lang.Override
protected void onDestroy() {
    org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.EDITOR_CLOSED);
    mDispatcher.unregister(this);
    doUnbindUploadService();
    super.onDestroy();
}

protected void drawValue(android.graphics.Canvas c, float val, float xPos, float yPos, com.github.mikephil.charting.utils.ValueFormatter formatter) {
    java.lang.String value = formatter.getFormattedValue(val);
    c.drawText(value, xPos, yPos, mValuePaint);
}

private void processError(int errorCode, java.lang.Exception e) {
    setState(ee.ioc.phon.android.speak.RecognizerIntentService.State.ERROR);
    mOnErrorListener.onError(errorCode, e);
    releaseResources();
    stopSelf();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = com.example.savagavran.criminalintent.DatePickerActivity.newIntent(getActivity(), mCrime.getDate());
    startActivityForResult(intent, com.example.savagavran.criminalintent.CrimeFragment.REQUEST_DATE);
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(com.mx.kanjo.openclothes.ui.fragments.ListSalesFragment.LOADER_SALE, null, this);
    setTitle();
}

private java.lang.String getPadNameFromInput(android.widget.TextView input) {
    java.lang.String padName = ((java.lang.String) (input.getText().toString()));
    return padName;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    int scrollPositionY = mScrollView.getScrollY();
    android.util.Log.v("TEST", ("Scroll positionXY: " + scrollPositionY));
    outState.putInt("scrollPositionY", scrollPositionY);
}

@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    bnotif = dataSnapshot.getValue(java.lang.Boolean.class);
    if (bnotif) {
        thread = true;
        run_pug();
        android.util.Log.d("Stop", "running");
    }
}

public void startCropMainActivity(java.lang.String path) {
    stopRecording();
    android.content.Intent imageEditorIntent = new com.adobe.creativesdk.aviary.AdobeImageIntent.Builder(this).setData(mStorage.getUriFromPath(currentImagePath)).build();
    startActivityForResult(imageEditorIntent, com.comp.iitb.vialogue.activity.AudioRecordActivity.REQ_CODE_CSDK_IMAGE_EDITOR);
}

public void onLowMemory() {
    android.util.Log.d("CN1 Mapss", "onLowMemory()");
    try {
        if ((view) != null) {
            view.onLowMemory();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (drawerToggle.onOptionsItemSelected(item)) {
        return true;
    }
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
    hourOfDay = hour;
    minuteOfDay = minute;
    setAlarm();
    showDialogMessage("Alarm", "Alarm settings was successful ", SweetAlertDialog.SUCCESS_TYPE);
}

public int getItemsPerPage(android.content.Context c) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(c).getInt(com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.KEY_ITEMSPERPAGE, com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.DEFAULT_ITEMSPERPAGE);
}

public ru.kazantsev.template.util.FragmentBuilder clearBackStack(java.lang.Class<android.support.v4.app.Fragment> fragmentClass) {
    return clearBackStack(fragmentClass.getSimpleName());
}

public static void recordAndAlignTask(android.webkit.WebView userWeb) {
    com.sw551.fairfield.healthcheq.withings.WithingsAuthorization.bindingWeb = userWeb;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    icepick.Icepick.saveInstanceState(this, outState);
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    if ((rowItem.getEntry()) != null) {
        toggleChecked(position1, holder.checkImageView);
    }
    return true;
}

