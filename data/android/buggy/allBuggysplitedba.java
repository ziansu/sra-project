public void onProfileClick(android.view.MenuItem item) {
    android.content.Intent intent = new android.content.Intent(this, com.ravimandala.labs.chirp.activity.ProfileActivity.class);
    startActivity(intent);
}

public java.lang.String loadAvatarThumbnail(org.matrix.androidsdk.HomeserverConnectionConfig hsConfig, android.widget.ImageView imageView, java.lang.String url, int side) {
    return loadBitmap(imageView.getContext(), hsConfig, imageView, url, side, side, 0, ExifInterface.ORIENTATION_UNDEFINED, null, getThumbnailsFolderFile());
}

@java.lang.Override
public void call() {
    application.sendBroadcast(new android.content.Intent(android.content.Intent.ACTION_BATTERY_CHANGED).putExtra(BatteryManager.EXTRA_PLUGGED, BatteryManager.BATTERY_PLUGGED_AC));
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    java.lang.System.out.println("---> save from Details");
    outState.putSerializable("currentVideo", video);
}

@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    aq.id(iv).image(com.florianmski.tracktoid.Utils.shadowBitmap(com.florianmski.tracktoid.Utils.borderBitmap(bm, getActivity()))).animate(android.R.anim.fade_in);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    getSupportFragmentManager().putFragment(outState, "SavedFrag", mCurrentFragment);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent();
    setResult(com.myhitchhikingspots.RESULT_CANCELED, intent);
    finish();
}

@java.lang.Override
public void onCancel(android.view.View view, android.view.MotionEvent event) {
    com.heaven7.android.dragflowlayout.DragFlowLayout.sDebugger.i("onCancel", "------------->");
    releaseDragInternal();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.i(deeplife.gcme.com.deeplife.DeepLife.TAG, "Application Started");
    deeplife.gcme.com.deeplife.DeepLife.mContext = this;
    deeplife.gcme.com.deeplife.DeepLife.myDATABASE = new deeplife.gcme.com.deeplife.Database.Database(this);
    myJobScheduler = me.tatarka.support.job.JobScheduler.getInstance(this);
    JobConstr();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(Constants.FILE_NAME, fileName);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String android_id = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    ph.rateNap(l.id(), which, android_id);
}

@android.databinding.BindingAdapter(value = { "bind:layout_manager" })
public void setLayoutManager(final android.support.v7.widget.RecyclerView rv, final android.support.v7.widget.RecyclerView.LayoutManager lm) {
    if ((rv.getLayoutManager()) != null) {
        rv.setLayoutManager(lm);
    }
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    android.widget.Toast.makeText(this.getActivity(), R.string.home_widget_change, Toast.LENGTH_SHORT).show();
    return true;
}

@java.lang.Override
public void setAdapter(android.widget.SpinnerAdapter adapter) {
    hintAdapter = new fr.ganfra.materialspinner.MaterialSpinner.HintAdapter(adapter, getContext());
    super.setAdapter(hintAdapter);
}

@java.lang.Override
public void onBackPressed() {
    isBackPress = true;
    android.util.Log.d(Utils.TAG, "====================== onBackPress ======================");
    if ((fragment) == null) {
        changeToPauseFragment();
        gcs.sendGameEvent("game_pause", new java.lang.String[]{  });
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    invalidateSavedGame();
    android.content.Intent intent = com.matthias.android.amginori.fragments.BoardFragment.newIntent(getActivity(), mLevel);
    startActivity(intent);
}

@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    jLogger.e(verticalOffset);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((this.language) != null) {
        outState.putInt("CURRENT_LANG", this.language.getId());
        super.onSaveInstanceState(outState);
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(final android.view.Menu menu) {
    enableLoginMenu(menu);
    return true;
}

@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    com.nelson.api.PermissionsHandle.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
}

private void makeLouderExplosion() {
    final android.media.MediaPlayer mp = android.media.MediaPlayer.create(this, R.raw.sunk);
    android.util.Log.v("Ship has been sunk", "Ka-baam");
    mp.start();
}

@java.lang.Override
public void onClick(android.view.View view) {
    dateTimeFragment = com.kunzisoft.switchdatetime.SwitchDateTimeDialogFragment.newInstance(getString(R.string.label_datetime_dialog), getString(android.R.string.ok), getString(android.R.string.cancel));
    setupDatetimeFragment();
    dateTimeFragment.show(getSupportFragmentManager(), com.kunzisoft.switchdatetimesample.Sample.TAG_DATETIME_FRAGMENT);
}

private void privateConstructor(android.content.Context context) {
    mMatrix.set(getImageMatrix());
    super.setScaleType(ScaleType.MATRIX);
    super.setLongClickable(false);
    setClickable(true);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.e(null, "Browse fragment onResume");
    andrzej.example.com.wordunscrambler.fragments.tabs.DictionariesFragment.otherWindowOpened = true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPresenter.checkAutoUpdateByUmeng();
    initRecycleView();
    setTitle(getString(R.string.app_name), false);
    mPresenter.checkVersionInfo();
    java.lang.String ste = "^*";
}

@java.lang.Override
protected void endStageEvent(it.playfellas.superapp.events.game.EndStageEvent event) {
    android.util.Log.d(it.playfellas.superapp.ui.slave.game3.Slave3Presenter.TAG, "------->EndStageEvent received by the Slave Presenter");
    slaveGame3Fragment.getConveyorUp().clear();
    this.pause();
}

public static boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if (Environment.MEDIA_MOUNTED.equals(state)) {
        return true;
    }
    return false;
}

void onScroll(app.ctrlyati.android.lazyquickreturn.QuickReturnHelper.Direction direction, float scrollY);

@com.facebook.react.bridge.ReactMethod
public java.lang.String version(@android.support.annotation.NonNull
com.facebook.react.bridge.Callback callback) {
    java.lang.String version = com.vwo.mobile.VWO.version();
    callback.invoke(version);
    return version;
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if ((savedInstanceState != null) && (savedInstanceState.containsKey(edu.cuhk.bus.RouteListFragment.STATE_ACTIVATED_POSITION))) {
        setActivatedPosition(savedInstanceState.getInt(edu.cuhk.bus.RouteListFragment.STATE_ACTIVATED_POSITION));
    }
}

private int getPXWithDP(java.lang.Integer dp) {
    if (dp == null) {
        return 0;
    }
    return ((int) (android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics())));
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    this.tableLayout = ((android.widget.TableLayout) (this.getActivity().findViewById(R.id.budgetTable)));
    setDataOnTable(this.budgetEntities);
}

@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    com.nanitesol.drivethruconsumer.Misc.TrackConsumerService.orderid = orderId;
    startService(new android.content.Intent(getApplicationContext(), com.nanitesol.drivethruconsumer.Misc.TrackConsumerService.class));
}

private void setNumberInputType() {
    int inputType = android.text.InputType.TYPE_CLASS_NUMBER;
    if ((digsAfterDot) > 0) {
        inputType |= android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL;
    }
    setInputType(inputType);
    setFilters(new android.text.InputFilter[]{ new ru.softbalance.widgets.filters.NumberInputFilter(digsAfterDot, digsBeforeDot) });
}

@java.lang.Override
protected void onResume() {
    android.util.Log.i("Starting", tech.travis.poolpos.MainActivity.getMethodName());
    super.onResume();
    android.util.Log.i("Finished", tech.travis.poolpos.MainActivity.getMethodName());
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    onDrawReady = true;
    imageRenderedAtLeastOnce = true;
    if ((delayedZoomVariables) != null) {
        setZoom(delayedZoomVariables.scale, delayedZoomVariables.focusX, delayedZoomVariables.focusY, delayedZoomVariables.scaleType);
        delayedZoomVariables = null;
    }
    super.onDraw(canvas);
}

@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    currentActivity = null;
    stopMonitoringLightLevels();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    fragString = com.kree.keehoo.yourcarinfo.DialogFragments.EditFieldFragment.newInstance(this, "carBrand");
    fragString.show(ft, "carModel");
    declineEdit();
}

public static void d(java.lang.String tag, java.lang.String msg) {
    if (daylemk.xposed.xbridge.utils.Log.debug) {
        daylemk.xposed.xbridge.utils.Log.xposedLog(tag, msg);
        android.util.Log.d(daylemk.xposed.xbridge.utils.Log.getFormattedTag(tag), msg);
    }
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_opentime, container, false);
    android.widget.ImageView view = ((android.widget.ImageView) (rootView.findViewById(R.id.imageView1)));
    return rootView;
}

@java.lang.Override
public void onPause() {
    super.onPause();
    getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
    ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow(emailRetv.getWindowToken(), 0);
}

private void createList() {
    example.kissanproject.ui.TabFragments.Fragment2.smsRecords = dbHelper.getAllToDos();
    dbHelper.closeDB();
    android.util.Log.e("error_dbinflate", java.lang.String.valueOf(example.kissanproject.ui.TabFragments.Fragment2.smsRecords.get(0).getmNumber()));
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.GONE);
        blockAndDisableAllButtons();
    }else {
        mActions.setVisibility(com.fiberlink.maas360.android.richtexteditor.VISIBLE);
    }
}

@java.lang.Override
public void onAutoFocus(boolean b, android.hardware.Camera camera) {
    if (success) {
        camera.cancelAutoFocus();
    }
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] response, java.lang.Throwable error) {
    com.facebook.react.bridge.WritableMap responseMap = populateResponseData(statusCode, headers, response);
    cb.invoke(error.getMessage(), responseMap);
}

public void startButtonAction(android.view.View view) {
    for (android.widget.CheckBox check : checkBoxes)
        if (!(check.isChecked()))
            return ;
        
    
    android.content.Intent intent = new android.content.Intent(this, com.rizz.pdf.pdfsensing.FullscreenActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    mCallbacks.searchingForChat();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home)) {
        finish();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }
    return super.onOptionsItemSelected(item);
}

boolean isPasswordValid(java.lang.String password) {
    return (android.text.TextUtils.isEmpty(password)) || ((password.length()) <= 8);
}

public static synchronized boolean addClockEntry(mine.android.api.modules.ClockEntry entry) {
    int newId = mine.android.api.ClockEntryAPI.getNextId();
    entry.setId(newId);
    mine.android.api.ClockEntryAPI.list.add(entry);
    mine.android.api.ClockEntryAPI.save();
    mine.android.api.AlarmAPI.activeClock(newId);
    return true;
}

@org.junit.Test
public void checkEmailField() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.txtEmail)).perform(android.support.test.espresso.action.ViewActions.scrollTo()).perform(android.support.test.espresso.action.ViewActions.click());
}

@java.lang.Override
public void run() {
    finish();
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.example.domjonathan.webviewteste.TalaUnicaActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
    super.onSaveInstanceState(outState, outPersistentState);
    icepick.Icepick.saveInstanceState(this, outState);
}

private void removeUserFilter() {
    android.content.SharedPreferences preferences = getActivity().getPreferences(Activity.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = preferences.edit();
    tech.niemandkun.domain.FilterSettings.deleteFromPreferences(editor);
    editor.apply();
}

@java.lang.Override
public void onChildViewRemoved(android.view.View parent, android.view.View child) {
    updateChildIndices();
}

private void startGame(int i) {
    android.util.Log.d(aditi.hangman.MainActivity.TAG, ("clicked on " + i));
    android.content.Intent intent = new android.content.Intent(this, aditi.hangman.Game.class);
    intent.putExtra(Game.KEY_CATEGORY, i);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (buttonAddPatient)) {
        startActivity(new android.content.Intent(this, com.example.aa.electronicpatientscard.AddPatient.class));
    }
}

@java.lang.Override
public void onItemClicked(com.yannickschuchmann.peng.model.entities.User user) {
    android.content.Intent intent = new android.content.Intent(getContext(), com.yannickschuchmann.peng.app.views.activities.ProfileActivity.class);
    intent.putExtra("userId", user.id);
    startActivityWithAnimation(intent);
}

public void disconnectBle() {
    android.util.Log.v(TAG, "disconnectBle");
    mBleGatt.disconnect();
    mBleGatt = null;
}

public static void showNotify(android.content.Context context, android.app.PendingIntent pendingIntent) {
}

@java.lang.Override
public void onAutoFocus(boolean b, android.hardware.Camera camera) {
    sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    android.util.Log.e("tag", "came");
}

public void setNewEdgeNotif() {
    android.util.Log.d("!edgehelper worked", "im ok with life");
    new corve.nohsedge.MainActivity().loadPreferences(true);
    new corve.nohsedge.MainActivity().activateEdgeHelper();
}

public static void checkBlacklist(android.app.Activity activity) {
    appaloosa_store.com.appaloosa_android_tools.tools.AppaloosaTools.getInstance().checkBlacklist(appaloosa_store.com.appaloosa_android_tools.Appaloosa.getStoreId(), appaloosa_store.com.appaloosa_android_tools.Appaloosa.getStoreToken(), activity);
}

private void saveImageUri(android.net.Uri imageUri) {
    preferences.edit().putString("imageUri", imageUri.toString()).apply();
}

@java.lang.Override
public void goWriteComment(java.lang.String comment) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.belatrixsf.allstars.ui.comment.CommentActivity.class);
    intent.putExtra(com.belatrixsf.allstars.ui.givestar.GiveStarFragment.COMMENT_KEY, comment);
    getActivity().startActivityForResult(intent, com.belatrixsf.allstars.ui.givestar.GiveStarFragment.RQ_COMMENT);
}

public void onClick(android.view.View v) {
    android.widget.ImageView image = ((android.widget.ImageView) (findViewById(R.id.editImageView)));
    image.setImageDrawable(null);
    deletePicture.setImageResource(android.R.color.transparent);
    bitmapImage = null;
}

public amagi82.modularcharactersheetcreator.entities.characters.Splat getSplat(int position) {
    android.util.Log.i("AxisFragment", ("getSplat - axisViewModel = " + (axisViewModel)));
    amagi82.modularcharactersheetcreator.entities.characters.Splat splat = axisViewModel.getList().get(position).getSplat();
    updateIfNotEndpoint(splat);
    return splat;
}

@java.lang.Override
public org.smartpaws.recycler.cards.CardDealer onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    return new org.smartpaws.recycler.cards.CardDealer(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_dealer, viewGroup, false), dealers[i]);
}

private void stopPreview() {
    android.util.Log.w(org.thoughtcrime.securesms.components.camera.CameraView.TAG, "stopPreview()");
    camera.startPreview();
    inPreview = false;
    getHost().autoFocusUnavailable();
    camera.stopPreview();
}

@java.lang.Override
public void config() {
    com.booboot.vndbandroid.util.SettingsManager.setUsername(this, null);
    com.booboot.vndbandroid.util.SettingsManager.setPassword(this, null);
    android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    enableAll();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mListener) != null)
        mListener.onClick();
    
}

@java.lang.Override
public void onTick(long millisUntilFinished) {
    android.util.Log.d("Autosave", ("time left: " + (millisUntilFinished - (historian.timeSinceChange))));
    editorActivity.setSaveStatusBar(false);
}

public void reflectSettings() {
    android.content.Context context = getApplicationContext();
    if (context != null) {
        setFontSize(com.app.strkita.measurenote.SettingPrefUtil.getFontSize(context));
        switchTheme(com.app.strkita.measurenote.SettingPrefUtil.isScreenReverse(context));
    }
}

private void changeFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().addToBackStack(fragment.getTag()).replace(R.id.container, fragment).commit();
}

@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    android.util.Log.v(edu.uw.samueldc.assassin_manager.MainActivity.TAG, ("users: " + (dataSnapshot.getValue())));
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putLong(org.dvbviewer.controller.ui.fragments.EpgPager.KEY_GROUP_ID, mGroupId);
    outState.putLong(ChannelPager.KEY_GOUP_INDEX, mGroupIndex);
    outState.putInt(org.dvbviewer.controller.ui.fragments.EpgPager.KEY_CHANNEL_INDEX, mPager.getCurrentItem());
}

@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    mPager.setClickable(false);
}

public static java.lang.String getKeyString(java.lang.String key) {
    android.content.SharedPreferences sharedPref = com.krkeco.dateit.PrefHelper.context.getSharedPreferences("dateit", Context.MODE_PRIVATE);
    java.lang.String host = sharedPref.getString(key, null);
    com.krkeco.dateit.PrefHelper.log(("host is: " + host));
    return host;
}

private void init() {
    tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.tabs)));
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.add_view_pager)));
}

public static void inflateCastMemberFragment(android.support.v4.app.FragmentActivity activity, com.ae.curtain.model.CastMemberListItem castMemberListItem) {
    com.ae.curtain.helper.ViewInflater.inflatePlayFragment(activity, castMemberListItem.getId());
}

@java.lang.Override
public void onEnabled(android.content.Context context) {
    super.onEnabled(context);
    android.util.Log.d("WIDGET", "onEnabled");
}

public static <T extends java.lang.Object> T getCastData(java.lang.String key, android.os.Bundle dataStore) {
    if (!(dataStore.containsKey(key))) {
        return null;
    }
    return ((T) (dataStore.get(key)));
}

@java.lang.Override
public void onResume() {
    super.onDestroy();
    android.util.Log.i(com.playxiangqi.hoxchess.MainActivity.PlaceholderFragment.TAG, "onResume...");
    com.playxiangqi.hoxchess.MainActivity activity = ((com.playxiangqi.hoxchess.MainActivity) (getActivity()));
    activity.onBoardViewResume(activity);
}

@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    android.util.Log.d(com.ashomok.imagetotext.sign_in.social_networks.silent_login.SilentSignInAsyncTask.TAG, "SilentSignInAsyncTask called");
    weakLoginManager.get().trySignInAutomatically();
    return null;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent().addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.setClass(this, cn.y1n9k17.emergencycalldialer.MainActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(com.example.jamie.popularmovies.fragments.MainMovieFragment.MAIN_MOVIE_LOADER, null, this);
    com.example.jamie.popularmovies.fragments.MainMovieFragment.mPosition = getActivity().getIntent().getIntExtra(MovieContract.MovieEntry.POSITION, 0);
    super.onActivityCreated(savedInstanceState);
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.d(askim.eratactics.activities.TacticsGame.TAG, "STOP");
    if (playMusic)
        mBackgroundSound.end();
    
}

public boolean addEpisode(@android.support.annotation.NonNull
org.bottiger.podcast.provider.IEpisode argEpisode, boolean argSilent) {
    if ((mEpisodes.indexOf(argEpisode)) > 0)
        return false;
    
    mEpisodes.add(argEpisode);
    if (!argSilent)
        notifyEpisodeAdded(true);
    
    return true;
}

@java.lang.Override
public int getCount() {
    android.util.Log.d("Get Count Two: ", java.lang.String.valueOf(movieUrls.size()));
    return movieUrls.size();
}

private void onRequestComplete(com.google.protobuf.RpcController controller) {
    se.qxx.android.tools.ResponseMessage msg = checkResponse(controller);
    if ((this.getListener()) != null)
        this.listener.onRequestComplete(msg);
    
}

@java.lang.Override
public void onDestroy() {
    audioManager.unregisterMediaButtonEventReceiver(new android.content.ComponentName(this, com.github.guwenk.smuradio.PlayerService.RemoteControlReceiver.class));
    updateUI(null);
    super.onDestroy();
}

@java.lang.Override
public void onClick(android.view.View v) {
    firstLoad = true;
    processLoadQuestion(eventId, userid);
}

public static int mercatorE7ToLatE7(final int mer) {
    return ((int) ((de.blau.android.util.GeoMath.mercatorToLat((mer / 1.0E7))) * 1.0E7));
}

public float computeDistanceFrom(android.location.Location other) {
    return ((float) ((other.distanceTo(mLocation)) / 1000.0));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_what_is);
    toolbarSetUpCase();
    logo = ((android.widget.ImageView) (findViewById(R.id.pouce_logo)));
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    inviteParticipants(room, participants, (index + 1));
}

public static boolean isMessageFromMe(@android.support.annotation.NonNull
com.nethergrim.vk.models.Message message) {
    return (message.getOut()) == 1;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if (((player) != null) && (player.isPlaying())) {
        outState.putInt(ru.korsander.tedrss.fragment.VideoFragment.POSITION, player.getCurrentPosition());
    }
}

@java.lang.Override
public void onItemClick(android.view.View view, int postion) {
    android.widget.Toast.makeText(getActivity(), ("click --" + postion), Toast.LENGTH_SHORT).show();
}

public static android.graphics.Bitmap getBitmapFromUrl(java.lang.String imageUrl, int readTimeOut) {
    return cn.trinea.android.common.util.ImageUtils.getBitmapFromUrl(imageUrl, readTimeOut, null);
}

