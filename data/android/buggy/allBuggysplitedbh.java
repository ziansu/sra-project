@java.lang.Override
public boolean onStartJob(android.app.job.JobParameters params) {
    android.util.Log.v(ca.rmen.android.poetassistant.wotd.WotdJobService.TAG, ("onStartJob: params " + params));
    mTask.execute();
    return true;
}

void openCellWithAnimate(android.widget.ImageView imageView, int coordinate) {
    this.imageView = imageView;
    this.coordinate = coordinate;
    isFastAnimation = false;
    isMineAnimation = false;
    openCell();
    imageView.startAnimation(shrink);
}

@butterknife.OnClick(value = R.id.image_map)
public void showMap() {
    setBottomIconDefaultColor();
    mImageMap.setColorFilter(android.support.v4.content.ContextCompat.getColor(this, R.color.colorPrimary));
}

@java.lang.Override
@android.support.annotation.Nullable
public com.zuluft.autoadapter.renderables.IRenderer getItem(int position) {
    try {
        return mRenderers.get(position);
    } catch (java.lang.IndexOutOfBoundsException ex) {
        return null;
    }
}

@java.lang.Override
public void onPwsResultAbsent(java.lang.String url) {
    android.widget.Toast.makeText(getApplicationContext(), getString(R.string.shorten_error), Toast.LENGTH_LONG).show();
    stopSelf();
    return ;
}

private boolean isTransactionToBeNotified(com.bitdubai.fermat_api.layer.all_definition.transaction_transference_protocol.crypto_transactions.CryptoStatus cryptoStatus) throws com.bitdubai.fermat_api.layer.osa_android.database_system.exceptions.CantExecuteQueryException {
    boolean isPending = assetReceptionDao.isPendingTransactions(cryptoStatus);
    return isPending;
}

@java.lang.Override
public void onMapClick(com.google.android.gms.maps.model.LatLng latLng) {
    com.google.android.gms.maps.model.MarkerOptions options = new com.google.android.gms.maps.model.MarkerOptions().position(latLng);
    options.title(getAddressFromLatLng(latLng));
    options.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker());
}

@butterknife.OnClick(value = R.id.tv_emergency)
void navigateEmergency() {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.zhour.zhoursecurity.activities.GuestAndStaffActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    this.finish();
    overridePendingTransition(R.anim.open_main, R.anim.close_next);
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.nrct.application.main.NrctMainActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    ir.rasen.charsoo.view.dialog.DialogUnfollowBusinessConfirmation d = new ir.rasen.charsoo.view.dialog.DialogUnfollowBusinessConfirmation(context, businessId, progressDialog, iUnfollowBusiness);
    d.show();
    this.dismiss();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    com.techlung.moodtracker.settings.Preferences.initPreferences(context);
    com.techlung.moodtracker.notification.NotificationManager.setNextNotification(context, true);
}

@java.lang.Override
protected void onStart() {
    super.onStart();
    refreshScreen();
    adapter = new android.widget.ArrayAdapter<com.example.owenm_000.countbook2.Counter>(this, android.R.layout.simple_list_item_1, android.R.id.text1, counters);
    listView.setAdapter(adapter);
    loadFromFile();
}

public void cancel() {
    try {
        socket.close();
    } catch (java.io.IOException e) {
        android.util.Log.e(com.henrykvdb.sttt.Bluetooth.TAG, "close() of connect socket failed", e);
    }
}

@java.lang.Override
public void onInputDialogCancelClick() {
    ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))).closeDrawers();
}

public void onClick(android.view.View v) {
    mCountDownTimer.pause();
    android.content.Intent intentMain = new android.content.Intent(this, com.example.masha.countdowntimer.DisplayExercises.class);
    this.startActivity(intentMain);
}

public android.widget.ListAdapter adapter(java.util.ArrayList<java.lang.String> arrayList) {
    return new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeString(location);
    dest.writeLong(date_created);
    dest.writeParcelable(data, 0);
}

@java.lang.Override
public void showOrders(@android.support.annotation.NonNull
java.util.List<com.e1858.building.data.bean.BaseOrder> orders) {
    mAdapter.updateDataSet(processData(orders), true);
    mAdapter.setEndlessProgressItem(new com.e1858.building.base.LoadMoreProgressItem());
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    syncronizeChannels(false);
}

@java.lang.Override
public void onLoadMore(int page, int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    if (com.jakester.nytarticlesapp.managers.InternetManager.getInstance(this).isInternetAvailable()) {
        makeArticlesCall(com.jakester.nytarticlesapp.activities.MainActivity.mQuery, 0);
    }else {
        noInternetDialog.show();
    }
}

@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    com.kong.app.news.beans.NewModel news = mAdapter.getItem(position);
    com.kong.app.news.NewsEntry.get().startBrowser(getContext(), news.newUrl, news.title);
}

public boolean expandParent(int parentPosition) {
    int parentAdapterPosition = getParentAdapterPosition(parentPosition);
    return (parentAdapterPosition != (android.support.v7.widget.RecyclerView.NO_POSITION)) && (expandViews(parentAdapterPosition));
}

public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.codepath.packagetwitter.FileUploadActivity.class);
    i.putExtra("USER", org.parceler.Parcels.wrap(user));
    startActivity(i);
}

@java.lang.Override
void apply(android.text.SpannableStringBuilder sb, int sequencePos, android.content.Context context, java.util.regex.Matcher textMatcher) {
    addEmptyLine(sb, 0.5F);
    sb.append(textMatcher.group(1));
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (!(updating)) {
        updateView(se.mecona.cuttingspeed.MainActivity.SourceEnum.DIAMETER);
    }
}

public void init(android.content.Context context) {
    boolean debug = ((boolean) (com.miguelgaeta.bootstrap.mg_reflection.MGReflection.getBuildConfigValue(context, "DEBUG")));
    timber.log.Timber.plant((debug ? new timber.log.Timber.DebugTree() : new com.miguelgaeta.bootstrap.mg_log.MGLogConfig.ProductionTree(info, error)));
}

@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int whichButton) {
    dialog.dismiss();
}

@java.lang.Override
protected void onDestroy() {
    android.util.Log.w(com.example.dudgns0507.learndoin.Activity.activity.MainActivity.TAG, "Destroy background");
    recycleView(R.id.list_top);
    super.onDestroy();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mFile = getIntent().getParcelableExtra(com.stevenschoen.putionew.tv.TvPlaybackOverlayActivity.ARG_FILE);
    setContentView(R.layout.tv_playback_activity);
    loadViews();
    setupCallbacks();
    overScan();
}

@java.lang.Override
public void onClick(android.view.View view) {
    dialogDrinkAccepted.dismiss();
    winnerDrink = 2;
    finishDialogChooseDrink(position2);
}

@java.lang.Override
public void handleGrip(int pointerIndex, int pointerId, android.view.MotionEvent ev) {
    y = ev.getY(pointerIndex);
    contentBottomFixed = contentBottomCurrent;
    velocityTracker = android.view.VelocityTracker.obtain();
    velocityTracker.addMovement(ev);
    animator.cancel();
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    progressDialog.dismiss();
    myVideoView.seekTo(videoPosition);
    if ((videoPosition) == 0) {
        myVideoView.start();
    }else {
        myVideoView.pause();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_intro);
    prepareStartButton();
}

@java.lang.Override
public void onClick(boolean isPositive) {
    com.onelio.connectu.Device.DeviceManager.addShortcutToHorario(getApplicationContext());
    android.widget.Toast.makeText(getBaseContext(), getString(R.string.created_shortcut), Toast.LENGTH_LONG);
}

public void addTask(com.appers.ayvaz.thetravelingsalesman.models.Task item) {
    android.content.ContentValues values = getContentValues(item);
    mDatabase.insert(DbSchema.TaskTable.NAME, null, values);
}

public void setAccessToken(java.lang.String accessToken) {
    android.util.Log.i("token is", ("" + accessToken));
    googleAccessProtectedResource.setAccessToken(accessToken);
    no.niths.android.common.AppController.token = accessToken;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.inject(this);
    setSupportActionBar(toolbar);
    userInfo = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    appDrawer();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    login_deal_flag = new com.jiaying.workstation.utils.DealFlag();
    com.jiaying.workstation.thread.ObservableZXDCSignalListenerThread observableZXDCSignalListenerThread = new com.jiaying.workstation.thread.ObservableZXDCSignalListenerThread();
    observableZXDCSignalListenerThread.start();
}

@java.lang.Override
public void onClick(android.view.View v) {
    imageViewResult4.setBackgroundColor(getResources().getColor(R.color.Black));
    band4 = 1;
    doCalc();
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    if (com.hungnt.customlogin.fragments.MusicPlayerFragment.isPlaying)
        seekTime();
    
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    savedInstanceState.putInt(com.example.android.quizapp.MainActivity.STATE_SCORE, score);
    super.onSaveInstanceState(savedInstanceState);
}

@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.e("Error", "That didn't work!");
    hideProgressDialog();
    android.widget.Toast.makeText(getApplicationContext(), "Error connecting to server please try again.", Toast.LENGTH_LONG).show();
}

public <T> void addToRequestQueue(com.android.volley.Request<T> req) {
    req.setTag(com.raxdenstudios.http.HttpAsyncClient.TAG);
    getRequestQueue().add(req);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mIntent.putExtra("station", "0");
    StationIntent.putExtra("ID", SelectedID);
    finish();
    startActivity(mIntent);
}

@java.lang.Override
public void run() {
    android.util.Log.d(LOG_TAG, "TaskPresenter");
    presentData();
    if (isRunning)
        timerPresenter.schedule(new obd2.dhbw.de.obd2_reader.MainActivity.TaskPresenter(), PRESENTER_INTERVAL);
    
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.example.android.popularmoviesstagetwo.model.ReviewListResponse> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(getActivity(), "Throw up", Toast.LENGTH_LONG).show();
}

public void onActivityCreated(android.os.Bundle b) {
    if (getArguments().getBoolean(edu.cascadia.doodlebug.DrawFragment.TAKE_PHOTO))
        takePhoto();
    
}

@java.lang.Override
public void onEventClick(com.alamkanak.weekview.WeekViewEvent event, android.graphics.RectF eventRect) {
    android.widget.Toast.makeText(this, ("Clicked " + (event.getName())), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... voids) {
    try {
        deleteLocalUserFiles();
        downloadImages();
        return true;
    } catch (java.lang.Exception e) {
        android.util.Log.e("downloadImages", e.toString());
        return false;
    }
}

@java.lang.Override
public void onSendMessageSuccess() {
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), R.string.message_send_success, Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    (timePlay)++;
    android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_COMPLETED);
    intent.putExtra(AppConst.KEY_TIME_PLAY, timePlay);
    sendBroadcast(intent);
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(net.nitroshare.android.transfer.TransferService.TAG, java.lang.String.format("transfer %d succeeded", transferId));
    showSuccessNotification(transferId, device);
}

void doBindService() {
    android.content.Intent intent = new android.content.Intent(this, com.squareup.leakcanary.assistivetouch.AssistiveGuardService.class);
    intent.putExtra(AssistiveGuardService.BIND_KEY, AssistiveGuardService.BIND_DISPLAY_LEAK_ACTIVITY);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
    mIsBound = true;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    this.setContentView(R.layout.activity_home_screen);
    super.onCreate(savedInstanceState);
}

@java.lang.Override
protected void doEvent(android.app.Activity activity) {
    if (!(net.anei.cadpage.SmsPopupUtils.haveNet(activity)))
        return ;
    
    net.anei.cadpage.donation.DonationManager.instance().refreshStatus(activity);
    closeEvents(activity);
}

public static java.util.List<net.spaceboats.busbus.android.Entites.Entity> queryArrivals() {
    if (net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sDbUpdated)
        net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sArrivals = net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sArrivalDbOperator.query();
    
    return net.spaceboats.busbus.android.DbHelper.EntityDbDelegator.sArrivals;
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_sec, container, false);
    mContext = container.getContext();
    initView(view);
    initListener();
    return view;
}

private boolean saving(android.graphics.Point p1, android.graphics.Point p2) {
    if (isSameColour(p1, p2))
        return true;
    
    return false;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    displayLocation();
    if (mRequestingLocalUpdates) {
        startLocationUpdates();
    }
}

@java.lang.Override
public void onResponse(com.wilee8.coyotereader2.gson.StreamPrefs response) {
    com.wilee8.coyotereader2.mStreamPrefs = response;
    android.util.Log.d("coyotereader", "return json: streamprefs");
    subscriber.onNext(null);
}

private void displayPreviewFromCachedPage(org.wikipedia.page.Page page) {
    if (!(isAdded())) {
        android.util.Log.d(org.wikipedia.page.linkpreview.LinkPreviewDialog.TAG, "Detached from activity, so stopping update.");
        return ;
    }
    progressBar.setVisibility(View.GONE);
    contents = new org.wikipedia.page.linkpreview.LinkPreviewContents(page);
    layoutPreview();
}

public void run() {
    mediaPlayerA.release();
    mediaPlayerA = null;
    handler.postDelayed(this, 2000);
    android.widget.Toast.makeText(getApplicationContext(), "Release mediaPlayerA", Toast.LENGTH_LONG).show();
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(com.nwsuaf.musicPlayer.PlayService.SERVICE_TAG, "---------onBind");
    java.lang.String file = intent.getStringExtra("file");
    android.widget.Toast.makeText(this, file, 0).show();
    return null;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    eventDelegate.onCreate(savedInstanceState);
    onFlutterReady();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    destroyMirror();
    setContentView(com.example.tombarrett.estimotemirror.R.layout.activity_main);
    pickup(product);
    tempProduct = product;
}

public void run() {
    android.content.Intent intent = new android.content.Intent(getApplication(), jp.ac.soka.tkl.sss2017.MainActivity.class);
    startActivity(intent);
    this.finish();
}

private void loadPasscodeView(boolean isEntryAnim) {
    PASSCODE_STEP = 0;
    updateScreen();
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.blank_container, getPasscodeFragment());
    fragmentTransaction.commit();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    android.util.Log.d(MovieApplication.TAG, ((com.example.vit.popularmovies.ui.fragment.MoviesGridFragment.CLASS) + "onAttach()"));
}

public void cacheAccessToken(@android.support.annotation.NonNull
nl.eduvpn.app.entity.Instance instance, @android.support.annotation.NonNull
java.lang.String accessToken) {
    removeAccessTokens(instance.getSanitizedBaseURI());
    _savedTokenList.add(new nl.eduvpn.app.entity.SavedToken(instance, accessToken));
    _save();
}

public void doTrainning(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "Going to Train Yourself activity", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(this, team_uganda.ieltsassistor.TrainYourself.class);
    startActivity(intent);
    finish();
}

public static com.morax.homelibrary.DetailsFragment newInstance() {
    com.morax.homelibrary.DetailsFragment fragment = new com.morax.homelibrary.DetailsFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
    mediaPlayer.create(this, R.raw.de_father);
    mediaPlayer.start();
}

@java.lang.Override
public void onClick(android.view.View thumbnailView) {
    if ((youTubeVideo) != null) {
        free.rm.skytube.gui.businessobjects.YouTubePlayer.launch(youTubeVideo, ((android.content.Context) (listener)));
    }
}

@java.lang.Override
public void onResume() {
    android.util.Log.d(org.eyeseetea.malariacare.DashboardActivity.TAG, "onResume");
    super.onResume();
    getSurveysFromService();
    startProgress();
}

@java.lang.Override
public void onSucess(java.lang.Class view) {
    android.content.Intent intent = new android.content.Intent(this, view);
    intent.putExtra(museum.findit.com.myapplication.view.Activities.LoginActivity.EXTRA_MESSAGE_USERNAME, name);
    startActivity(intent);
}

public void onJokeFetched(java.lang.String joke) {
    hideSpinner();
    final android.content.Intent libraryIntent = new android.content.Intent(this, com.cloudskol.jokemalib.LibraryActivity.class);
    libraryIntent.putExtra(com.cloudskol.jokema.MainActivity.JOKE, joke);
    startActivity(libraryIntent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    mMapFragment.showAllFloors();
    mMapFragment.showMarkersForSpecificFloor(0);
}

@java.lang.Override
public void onFailed() {
    android.widget.Toast.makeText(this, "There was a problem while syncing the data", Toast.LENGTH_SHORT).show();
    onComplete();
}

protected void stopLocationUpdates() {
    if (gapiClient.isConnected()) {
        com.google.android.gms.location.LocationServices.FusedLocationApi.removeLocationUpdates(gapiClient, this);
        android.widget.Toast.makeText(this, "stopLocationUpdates", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    firebaseRef = new com.firebase.client.Firebase(com.example.khumalo.appui.Utils.Constants.FIREBASE_ROUTES_URL);
    android.util.Log.d("Tag", "RoutesListener Service has been created");
}

@java.lang.Override
public void onBitmapFailed(android.graphics.drawable.Drawable errorDrawable) {
    android.util.Log.e(de.mytfg.apps.mytfg.fragments.NewsDetailFragment.TAG, "Error while downloading image");
    android.widget.ImageView imageView = new android.widget.ImageView(getContext());
    imageView.setImageDrawable(errorDrawable);
    insertView(imageView);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    _address = getArguments().getString("address");
    _ble = nl.dobots.crownstone.CrownstoneDevApp.getInstance().getBle();
    createGraph();
}

private void replaceFragment(org.kfjc.android.player.fragment.KfjcFragment fragment) {
    setActionBarBackArrow(false);
    getFragmentManager().beginTransaction().replace(R.id.home_screen_main_fragment, fragment, fragment.getFragmentTag()).addToBackStack(null).commit();
}

public void enableCache(int size) {
    this.objectCache = new android.support.v4.util.LruCache(size);
}

private void setInit() {
    android.graphics.drawable.Drawable drawable = rbBintang.getProgressDrawable();
    drawable.setColorFilter(android.graphics.Color.parseColor("#f7961f"), PorterDuff.Mode.SRC_ATOP);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    refreshEvents();
}

public static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send) {
    com.binarapps.android.cookielogger.AppContext.initialize(context, send, false, com.binarapps.android.cookielogger.CLog.TAG);
}

@java.lang.Override
public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);
    android.view.MenuInflater menuInflater = getActivity().getMenuInflater();
    menuInflater.inflate(R.menu.menu_dictionary_management_long_press, menu);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Members.add(position, dialogInput.getText().toString());
    listViewCrewAdapter.notifyDataSetChanged();
}

public static void removeProceedingOfRoom(java.lang.Long room) {
    new com.activeandroid.query.Delete().from(com.example.houserental.function.model.ProceedingDAO.class).where("room = ?", room).executeSingle();
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "relay on success");
    updateLightBulb(true);
    done();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.d(com.bignerdranch.android.geoquiz.QuizActivity.TAG, "onStart() called");
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkSkillTime();
    android.util.Log.d(askim.eratactics.activities.TacticsGame.TAG, "Third skill clicked");
}

@com.facebook.react.bridge.ReactMethod
public void setAudioOutput(java.lang.String output) {
    android.media.AudioManager audioManager = ((android.media.AudioManager) (mReactContext.getSystemService(Context.AUDIO_SERVICE)));
    audioManager.setMode(AudioManager.MODE_IN_CALL);
    audioManager.setSpeakerphoneOn((output == "speaker"));
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    mParseTools.markChargePaid(mTransactionObjectId, true);
    finish();
}

public android.content.Context getContext() {
    return org.wso2.mdm.agent.proxy.IdentityProxy.context;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    if ((noteExists) && ((note) != null)) {
        controller.deleteNote(note);
    }
    setResult(edu.gatech.androidnoteapp.RESULT_OK);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    workingBoolean.setValue((!(workingBoolean.isValue())));
}

private void loadComponents(android.view.ViewGroup container) {
    recyclerView = ((android.support.v7.widget.RecyclerView) (container.findViewById(R.id.rvModuleDetails)));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    game.setmTitle(presetName[0]);
    createPreset();
    dialog.dismiss();
    displaySpinner(mSpinnerPreset, presetStringArray());
    mSpinnerPreset.setVisibility(View.VISIBLE);
}

