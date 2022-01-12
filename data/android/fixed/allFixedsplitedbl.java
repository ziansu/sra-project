@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    return false;
}

public static int getDeviceNetwokActivity(android.content.Context context) {
    return 1;
}

public void exit(android.view.View view) {
    finish();
    java.lang.System.exit(0);
}

public void clearRegisteredAuthenticationListener() {
    mAuthListener = null;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        savedInstanceState = getArguments();
    }
    restoreFromBundle(savedInstanceState);
    setDefaultTextValues();
}

public void launchSettingsActivity(android.view.MenuItem item) {
    startActivity(new android.content.Intent(this, com.dita.dev.memoapp.ui.activity.SettingsActivity.class));
    drawer.closeDrawer(GravityCompat.START);
}

@java.lang.Override
public void stopBeat() {
    if ((svc) != null) {
        com.tungnd.android.metronome.MainActivity.playerService.stopBeat();
        beatView.stopBeat();
        stopService(svc);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
    }
}

private boolean is4KEnabled() {
    if ((mProfile.quality) == (android.media.CamcorderProfile.QUALITY_2160P)) {
        return true;
    }else {
        return false;
    }
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    orientation = newConfig.orientation;
    onWindowFocusChanged(true);
}

private void backToFlActivity() {
    android.content.Intent intent;
    intent = new android.content.Intent(this, org.redPanda.ChannelList.FlActivity.class);
    startActivity(intent);
}

public void setPageBlock(com.hyena.coretext.TextEnv textEnv, com.hyena.coretext.blocks.CYPageBlock pageBlock) {
    mTextEnv = textEnv;
    this.mPageBlock = pageBlock;
}

private void sendStatusbarNotification(com.newscombinator.notifier.Doc doc) {
    if ((showNotification) == false) {
        android.util.Log.e(Consts.APP_TAG, "Not showing Notifiction because flag set");
    }
    com.newscombinator.notifier.handler.NotificationHandler.getInstance(context).sendStatusbarNotification(doc);
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent intent = new android.content.Intent(context, edu.washington.prathh.change.Payment_Step2.class);
    intent.putExtra("amount", editText.getText().toString());
    startActivity(intent);
}

protected void processPauseRequest() {
    this.mPlayback.pause();
}

@java.lang.Override
public void finish() {
    setResult(cmput301exchange.exchange.Activities.RESULT_OK, new android.content.Intent());
    super.finish();
}

public org.gearvrf.jassimp.AiMaterial getMeshMaterial(org.gearvrf.GVRAssimpImporter assimpImporter, java.lang.String nodeName, int meshIndex) {
    return assimpImporter.getMeshMaterial(nodeName, meshIndex);
}

private void updateListView() {
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(this, R.layout.simple_row1, R.id.text1, listOfValues);
    listView.setAdapter(adapter);
}

private void onError() {
    if (null != (getActivity())) {
        android.widget.Toast.makeText(getActivity(), getActivity().getString(R.string.could_not_redact), Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public boolean drawFrame(android.graphics.drawable.Drawable parent, android.graphics.Canvas canvas, int frameNumber) {
    return ((mAnimationBackend) != null) && (mAnimationBackend.drawFrame(parent, canvas, frameNumber));
}

private void requestStoragePermissions() {
    com.ripplex.fileobservertester.RuntimePermissionsChecker.requestStoragePermissions(this, com.ripplex.fileobservertester.MainActivity.PERMISSION_REQUEST_CODE);
}

@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    account.setPhoto(bitmap.copy(Bitmap.Config.ARGB_8888, true));
}

public static void e(java.lang.String c, java.lang.String s) {
    if ((org.piwik.sdk.tools.Logy.sLoglevel) != (org.piwik.sdk.tools.Logy.SILENT)) {
        android.util.Log.e(c, s);
    }
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.layout_recycler_view, container, false);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recycler_view)));
    return view;
}

@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult result) {
}

private java.lang.String getSDKVersion() {
    final java.lang.String version = getString(R.string.sdk_version_string, com.spotxchange.sdk.android.SpotxAdSettings.getSdkVersion());
    return version;
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    inflater.inflate(R.menu.record_list_actions, menu);
}

public java.lang.Object getItem(int position) {
    return null;
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    removeItemFromList(position);
    return true;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
}

@java.lang.Override
public void call(android.support.v4.util.Pair<org.unicef.rapidreg.model.Case, retrofit2.Response<com.google.gson.JsonElement>> pair) {
    if ((getView()) != null) {
        getView().setProgressIncrease();
        increaseSyncNumber();
        updateRecordSynced(pair.first, true);
    }
}

@java.lang.Override
public synchronized void queueInput(org.mozilla.gecko.media.Sample sample) throws android.os.RemoteException {
    mInputProcessor.onSample(sample);
}

public void onCameraAvailable(java.lang.String cameraId) {
    mPreferences.setCamActiv(cameraId, false);
    de.simu.decoit.android.decomap.util.Toolbox.logTxt(this.getLocalClassName(), "Camera is not in use!");
}

public static void clearQueue() {
    try {
        if ((com.naman14.timber.MusicPlayer.mService) != null)
            com.naman14.timber.MusicPlayer.mService.removeTracks(0, java.lang.Integer.MAX_VALUE);
        
    } catch (final android.os.RemoteException ignored) {
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    startActivity(new android.content.Intent(this, btracker.example.raggitha.btracker.profileActivity.class));
    finish();
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
}

public void onClick(android.content.DialogInterface dialog, int which) {
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

public static void disableAddProblemMode() {
    org.ecomap.android.app.fragments.EcoMapFragment.addproblemModeIsEnabled = false;
    org.ecomap.android.app.fragments.EcoMapFragment.setMarkerClickType(0);
    org.ecomap.android.app.fragments.EcoMapFragment.mapClusterer.deleteMarker();
    org.ecomap.android.app.fragments.EcoMapFragment.addProblemSnackbar.dismiss();
    org.ecomap.android.app.fragments.EcoMapFragment.fabAddProblem.setImageResource(R.drawable.ic_location_on_white_24dp);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    if (mNotify) {
        if ((mOnRefreshListener) != null) {
            mOnRefreshListener.onRefresh();
        }
        mNotify = false;
    }
}

public void onClick(android.content.DialogInterface dialog, int which) {
    deleteSchoolSubject(parent.getItemAtPosition(position).toString());
}

private android.net.Uri insertActorValues(android.content.ContentValues actorValues) {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "insertActorValues");
    android.net.Uri actor = RadioTheaterContract.ActorsEntry.buildActorsUri();
    return context.getContentResolver().insert(actor, actorValues);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialog.dismiss();
    saveDialog(i);
}

public void onClick(android.view.View v) {
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
    if (iResultCallback != null) {
        iResultCallback.onSuccessResult(object, tag);
    }
}

@java.lang.Override
public void addNewRestaurant() {
    addRestaurant = new in.foodtalk.android.fragment.newpost.AddRestaurant();
    setFragmentView(addRestaurant, R.id.container1, (-1), true);
}

public void speakWord(java.lang.String word, android.view.View v) {
    speaker.speak(word);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_photoscan);
    initData();
    initUI();
}

static long getInstallDate(android.content.Context context) {
    return hotchemi.android.rate.PreferenceHelper.getPreferences(context).getLong(hotchemi.android.rate.PreferenceHelper.PREF_KEY_INSTALL_DATE, new java.util.Date().getTime());
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
}

private void setDefaultConfiguration() {
    com.jstakun.gms.android.data.PersistenceManagerFactory.getFileManager().createDefaultDirs();
    com.jstakun.gms.android.data.PersistenceManagerFactory.getFileManager().readResourceBundleFile(com.jstakun.gms.android.config.ConfigurationManager.configuration, R.raw.defaultconfig, getContext());
    com.jstakun.gms.android.config.ConfigurationManager.changedConfig.clear();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (endSize == 0)
        imgPicture.setVisibility(View.GONE);
    
}

@java.lang.Override
public void onFocusChange(android.view.View view, boolean b) {
    if (!(prevFocus.bool)) {
        showTagsDialog();
    }
    prevFocus.bool = b;
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    initializeAesthetic(primary, accent, false);
    dialog.dismiss();
}

@java.lang.Override
public void onResume() {
    super.onResume();
    _mapView.onResume();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    getFloatingToolbar().setVisibility(View.VISIBLE);
    getFab().setVisibility(View.INVISIBLE);
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    android.util.Log.e(com.hardikarora.spotify_1.service.SpotifyPlayerService.LOG_TAG, "Error occured with the media player.");
    mp.reset();
    return true;
}

public void pauseButton(android.view.MenuItem mi) {
    if ((mPlayer) != null)
        mPlayer.pause(null);
    
}

@org.androidannotations.annotations.UiThread
void displayListView(org.ovirt.mobile.movirt.rest.Disks disks) {
    if (((listView) != null) && (disks != null)) {
        diskListAdapter = new org.ovirt.mobile.movirt.ui.DiskListAdapter(getActivity(), 0, disks);
        listView.setAdapter(diskListAdapter);
    }
}

@butterknife.OnCheckedChanged(value = in.testpress.testpress.R.id.review)
void onChecked(boolean checked) {
    attemptItem.setCurrentReview(checked);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mLayoutType) == (com.malalaoshi.android.fragments.main.ScheduleFragment.LayoutType.UNSIGNUP)) {
        com.malalaoshi.android.utils.AuthUtils.redirectLoginActivity(getContext());
    }else
        if ((mLayoutType) == (com.malalaoshi.android.fragments.main.ScheduleFragment.LayoutType.EMPTY)) {
            onClickEmptyCourse.onClickEmptyCourse(null);
        }
    
}

@android.support.annotation.NonNull
protected android.content.Intent buildUserParcelIntent(java.lang.Class expliciteClass, android.os.Parcelable parcelable) {
    android.content.Intent intent = jumpup.imi.fb4.htw.de.jumpupandroid.util.activity.JumpUpActivity.getExpliciteIntent(this, expliciteClass);
    putExtraUserParcelable(parcelable, intent);
    return intent;
}

public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    if (mProgress.isShowing()) {
        mProgress.dismiss();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    startService(new android.content.Intent(this, smartext.com.smscapture.SmsListenerService.class));
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d("LifeCycle", "Video onSaveInstanceState");
    super.onSaveInstanceState(outState);
    if ((vidView) != null)
        outState.putInt("video_pos", vidView.getCurrentPosition());
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    mTodoIndex = ((mTodoIndex) + 1) % (mTodos.length);
    TodoTextView.setText(mTodos[mTodoIndex]);
}

@java.lang.Override
public void onClick(android.view.View v) {
    setDateFromPicker();
}

public static void loadImageFromResourcesToImageView(android.content.Context context, int resourceId, android.widget.ImageView imageView) {
    com.squareup.picasso.Picasso.with(context).load(resourceId).into(imageView);
}

@java.lang.Override
public void onClick(android.view.View view) {
    stopService(serviceIntent);
    serviceIntent.putExtra("tabNum", 0);
    serviceIntent.putExtra("serviceName", "Stand");
    startService(serviceIntent);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.hasExtra("state")) {
        changeShengDao(true);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (mFab.isOpened()) {
        mFab.close(false);
    }else {
        mFab.open(false);
    }
}

@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    android.util.Log.d("Clicked", java.lang.Integer.toString(position));
}

public void setLogoView(com.android.internal.navigation.fling.FlingLogoView view) {
    mLogoView = view;
    if ((mLogoColor) != (view.getLogoColor())) {
        mLogoView.setLogoColor(mLogoColor);
    }
    animateToCurrentState();
}

@rxbus.ecaray.com.rxbuslib.rxbus.RxBusReact(clazz = { java.lang.String.class , java.lang.String.class , java.lang.String.class }, tag = "tag")
public void showContent(java.lang.String content, java.lang.String k, java.lang.String test) {
    android.util.Log.d("tagutil", ((("收到的参数: " + k) + content) + test));
}

@java.lang.Override
public void onMinuteSelected(int mMinute) {
    minuteSelected = mMinute;
    minute.add(minuteSelected);
}

@android.annotation.SuppressLint(value = "NewApi")
public void stopProcessingThread() {
    if ((processingHandlerThread) != null) {
        processingHandlerThread.quitSafely();
        processingHandlerThread = null;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    finish();
}

@java.lang.Override
public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state) {
    recyclerRef = recycler;
    if (state.isPreLayout()) {
        onPreLayoutChildren(recycler, state);
    }else {
        onRealLayoutChildren(recycler);
    }
}

public static com.tallty.smart_life_android.fragment.cart.SelectAddress newInstance() {
    android.os.Bundle args = new android.os.Bundle();
    com.tallty.smart_life_android.fragment.cart.SelectAddress fragment = new com.tallty.smart_life_android.fragment.cart.SelectAddress();
    fragment.setArguments(args);
    return fragment;
}

public void onClick(android.view.View v) {
    dialog.dismiss();
    com.wynnej1983.RNAppirater.RNAppiraterModule.rateApp(reactContext, editor);
}

public void createBudgetAndAddToUser(money.mezu.mezu.Budget budget, money.mezu.mezu.UserIdentifier uid) {
    android.util.Log.d("", "FirebaseBackend:addBudgetToUser: adding budget to user");
    java.lang.String newBid = createBudget(budget);
    connectBudgetAndUser(newBid, uid.getId().toString());
}

public retrofit2.Call<com.onehilltech.gatekeeper.android.http.JsonBearerToken> getClientToken() {
    com.onehilltech.gatekeeper.android.http.JsonClientCredentials credentials = new com.onehilltech.gatekeeper.android.http.JsonClientCredentials();
    return this.getToken(credentials);
}

@java.lang.Override
public void onActivityResult(int reqCode, int resCode, android.content.Intent intent) {
    command.success();
}

@java.lang.Override
protected void onDestroy() {
    org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.EDITOR_CLOSED);
    mDispatcher.unregister(this);
    super.onDestroy();
}

protected void drawValue(android.graphics.Canvas c, java.lang.String value, float xPos, float yPos) {
    c.drawText(value, xPos, yPos, mValuePaint);
}

private void processError(int errorCode, java.lang.Exception e) {
    mOnErrorListener.onError(errorCode, e);
    releaseResources();
    setState(ee.ioc.phon.android.speak.RecognizerIntentService.State.ERROR);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = com.example.savagavran.criminalintent.DatePickerActivity.newIntent(getActivity(), mCrime.getDate());
    getActivity().startActivityForResult(intent, com.example.savagavran.criminalintent.CrimeFragment.REQUEST_DATE);
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(com.mx.kanjo.openclothes.ui.fragments.ListSalesFragment.LOADER_SALE, null, this);
}

private java.lang.String getPadNameFromInput(android.widget.TextView input) {
    java.lang.String padName = ((java.lang.String) (input.getText().toString().trim()));
    return padName;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    int scrollPositionY = mScrollView.getScrollY();
    outState.putInt("scrollPositionY", scrollPositionY);
}

@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    bnotif = dataSnapshot.getValue(boolean.class);
    if (bnotif) {
        thread = true;
        run_pug();
        android.util.Log.d("Stop", "running");
    }
}

public void startCropMainActivity(java.lang.String path) {
    stopRecording();
    android.content.Intent imageEditorIntent = new com.adobe.creativesdk.aviary.AdobeImageIntent.Builder(this).setData(mStorage.getUriFromPath(path)).build();
    startActivityForResult(imageEditorIntent, com.comp.iitb.vialogue.activity.AudioRecordActivity.REQ_CODE_CSDK_IMAGE_EDITOR);
}

public void onLowMemory() {
    android.util.Log.i("CN1 Mapss", "onLowMemory()");
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
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
    hourOfDay = hour;
    minuteOfDay = minute;
    setAlarm();
}

public int getItemsPerPage(android.content.Context c) {
    return java.lang.Integer.parseInt(android.preference.PreferenceManager.getDefaultSharedPreferences(c).getString(com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.KEY_ITEMSPERPAGE, com.sphericalelephant.zeitgeistng.fragment.preference.PreferenceFacade.DEFAULT_ITEMSPERPAGE));
}

public ru.kazantsev.template.util.FragmentBuilder clearBackStack(java.lang.Class<? extends android.support.v4.app.Fragment> fragmentClass) {
    return clearBackStack(fragmentClass.getSimpleName());
}

public static void recordAndAlignTask() {
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    icepick.Icepick.saveInstanceState(this, outState);
}

@java.lang.Override
public boolean onLongClick(android.view.View view) {
    if ((rowItem.getEntry()) != null) {
        toggleChecked(position, holder.checkImageView);
    }
    return true;
}

