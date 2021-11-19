@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.ensipoly.events.activities.MapsActivity.SETTING_CODE))
        createLocationRequest(false);
    else
        super.onActivityResult(requestCode, resultCode, data);
    
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mActivity = getActivity();
    setMainTitleListener = ((com.xiaodong.dream.catcher.demo.express.OnSetMainTitleListener) (mActivity));
    setMainTitleListener.onSetMainTitle(R.string.express_title);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mNotRegisteredText.setTextColor(getResources().getColor(R.color.colorAccent));
    android.content.Intent registerIntent = new android.content.Intent(this, koala.com.koalaapp.RegisterActivity.class);
    startActivity(registerIntent);
}

@butterknife.OnClick(value = R.id.image_view_setting)
void clickSetting() {
    startActivity(new android.content.Intent(this, app.com.warattil.activities.SettingActivity.class));
}

public void inactiveTimerReset() {
    if ((inactiveTimer) != null) {
        inactiveTimer.cancel();
        inactiveTimer = null;
    }
    inactiveTimerStart();
}

@java.lang.Override
public void onClick(android.view.View view) {
    holder.toggleItemsSection();
}

@java.lang.Override
public void onSeekComplete(@android.support.annotation.NonNull
com.devbrackets.android.playlistcore.api.MediaPlayerApi mediaPlayerApi) {
    if (pausedForSeek) {
        performPlay();
        pausedForSeek = false;
    }
}

public void firstChoiceMade(android.view.View view) {
    (level_move)++;
    if ((this.result_choices[3]) == 1) {
        updateScore(true);
    }
    timer.cancel();
    newMove();
}

@java.lang.Override
public void onFinishFilterDialog(java.lang.String sortByVal, java.lang.String beginDateVal, java.lang.String newsDeskVal) {
    sortBy = sortByVal;
    beginDate = beginDateVal;
    newsDesk = newsDeskVal;
}

@android.annotation.SuppressLint(value = "InlinedApi")
@java.lang.Override
public void run() {
    mRootView.setSystemUiVisibility(((((android.view.View.SYSTEM_UI_FLAG_FULLSCREEN) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE)) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)));
}

@java.lang.Override
public void onError(java.util.List<java.lang.String> errors) {
}

private void reformData() {
    android.os.Bundle bundle = getArguments();
    if (bundle != null) {
        specialitySelected = bundle.getBooleanArray(PatientViewActivity.PATIENT);
    }else {
        specialitySelected = null;
    }
}

public static com.sylvainautran.nanodegree.capstoneproject.data.loaders.CallsLoader getAllCalls(android.content.Context context) {
    return new com.sylvainautran.nanodegree.capstoneproject.data.loaders.CallsLoader(context, AppelContract.CallEntry.CONTENT_URI, com.sylvainautran.nanodegree.capstoneproject.data.loaders.CallsLoader.Query.PROJECTION, null, null, AppelContract.CallEntry.MULTIPLE_SORT);
}

@java.lang.Override
public void onDisabled(android.content.Context context) {
    super.onDisabled(context);
    com.ppyy.ppweatherplus.utils.L.e("WeatherHorizontalAppWidget onDisabled");
    com.ppyy.ppweatherplus.service.AppWidgetService.stopService();
}

public android.database.Cursor findAllStudentsForOverview() {
    return readableDb.query(dbStudent.TABLE_NAME, null, null, null, null, null, null);
}

@java.lang.Override
public void done(byte[] bytes, com.parse.ParseException e) {
    if ((bytes.length) != 0) {
        android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        itemImage.setImageBitmap(bitmap);
    }
}

public static java.lang.String getUserName(android.content.Context c) {
    android.content.SharedPreferences pref = c.getSharedPreferences(ru.meefik.linuxdeploy.PrefStore.getCurrentProfile(c), Context.MODE_PRIVATE);
    return pref.getString("username", c.getString(R.string.username)).trim();
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    close();
    return super.onUnbind(intent);
}

private synchronized void setAuthToken(java.lang.String newAuthToken) {
    authToken = newAuthToken;
}

private int requestFailure(java.util.concurrent.atomic.AtomicInteger executionCounter) throws java.lang.InterruptedException {
    executionCounter.incrementAndGet();
    java.lang.Thread.sleep(eu.unicate.retroauth.LockingStrategyTests.FAILING_REQUEST_TIME);
    throw new eu.unicate.retroauth.exceptions.AuthenticationCanceledException(new android.accounts.OperationCanceledException());
}

public void loadAsync(final android.net.Uri sourceUri, final com.isseiaoki.simplecropview.callback.LoadCallback callback) {
    loadAsync(sourceUri, false, null, callback);
}

private com.sisa.tabata.ui.activity.WorkoutEditActivity getCheckedContext(final android.view.View view) {
    com.sisa.tabata.validation.Assert.isInstanceOf(com.sisa.tabata.ui.activity.WorkoutEditActivity.class, view.getContext(), "View context is not a WorkoutEditActivity");
    return ((com.sisa.tabata.ui.activity.WorkoutEditActivity) (view.getContext()));
}

public void changeProgressBarVisibility(android.widget.ProgressBar progress, int visibility) {
}

@java.lang.Override
public void onUnLiked(com.example.user.cloudplayer.model.Like like) {
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(contentView());
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(v.getContext(), com.teamlz.cheTajo.activity.MainActivity.class);
    startActivity(i);
}

public void updateLibrary(android.content.Context context, java.lang.Integer libraryId) {
    this.context = context;
    com.sylweb.myplex.LibraryUtils.UpdateThread thread = new com.sylweb.myplex.LibraryUtils.UpdateThread(libraryId, context);
    thread.start();
}

private synchronized void actionStop() {
    endActiveElements();
    mCurrentTime = 0;
    mCurrentElement = 0;
    mCurrentSlide = 0;
    mState = com.android.mms.dom.smil.SmilPlayer.SmilPlayerState.STOPPED;
    mAction = com.android.mms.dom.smil.SmilPlayer.SmilPlayerAction.NO_ACTIVE_ACTION;
}

public void init(android.hardware.Camera camera) {
    setCamera(camera);
    getHolder().addCallback(this);
    getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
}

@java.lang.Override
public void run() {
    android.util.Log.i("TTM", "Successfully loaded offline globals for week fragment.");
    applyGlobalContent(true, false, rootView, activity);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    spinner = ((android.widget.ProgressBar) (findViewById(R.id.progressBar)));
    open(findViewById(R.id.progressBar));
}

public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
}

@java.lang.Override
public void call() {
    logger.d(org.hisp.dhis.android.eventcapture.presenters.FormSectionPresenterImpl.TAG, "onComplete");
    gettingLocation = false;
    locationProvider.stopUpdates();
}

@java.lang.Override
public void onClick(android.view.View v) {
    privateRadio.setChecked(false);
    edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.SHARED_BATHROOM);
    edit.remove(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.PRIVATE_BATHROOM);
    edit.putBoolean(com.example.toshiba.airbnb.Profile.BecomeAHost.BasicQuestions.BathroomFragment.SHARED_BATHROOM, true);
    edit.apply();
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    android.util.Log.d("Main", "Stop Clicked");
    logicController.stopStreaming();
}

@java.lang.Override
public void run() {
    mAdapter.notifyDataSetChanged();
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    return false;
}

protected com.android.internal.telephony.uicc.IccRecords getUiccRecords(int appFamily) {
    return mUiccController.getIccRecords(mPhone.getPhoneId(), appFamily);
}

public void popBitmap() {
    if (stack.empty())
        return ;
    
    android.graphics.Bitmap bitmap = stack.pop();
    mReusableBitmaps.add(new java.lang.ref.SoftReference<android.graphics.Bitmap>(bitmap));
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.d(com.csipsimple.ui.SipHome.THIS_FILE, "---DESTROY SIP HOME END---");
}

public void setFaction(boolean myFaction) {
    startFactionIsTerror = myFaction;
    eco = new com.evilcorp.csgo_shadow.Eco(startFactionIsTerror);
    updateRoundView();
}

public void request_connect_handler(android.view.View v) {
    is_client = true;
    init();
    get_Bonded_device_and_chat();
    bRequest_connect.setVisibility(View.GONE);
    bWait_connect.setVisibility(View.GONE);
}

@java.lang.Override
public void onClick(android.view.View v) {
    (com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter)--;
    com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter = ((com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter) < 0) ? (com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.questArr.length) - 1 : com.rmr.ngusarov.geoquiz.GeoQuizMainActivity.counter;
    refreshQuest();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.apple.newsingit_project.CreateFolderActivity.class);
    startActivityForResult(intent, com.example.apple.newsingit_project.SelectNewsDetailActivity.RC_CREATEFOLDER);
    scrap_folder_recyclerview.addHeaderView(headerview);
}

private static android.content.SharedPreferences getSharedPreferences(java.lang.String spName) {
    return com.category.base.BaseApplication.getContext().getSharedPreferences(spName, Context.MODE_PRIVATE);
}

@java.lang.Override
public void drawMe(android.graphics.Canvas canvas) {
    canvas.drawText(text, startX, startY, paint);
}

@java.lang.Override
public void beforeRegistration() {
    isFailed = false;
}

public static dalbers.com.noise.LoopMediaPlayer create(android.content.Context context) {
    dalbers.com.noise.LoopMediaPlayer looper = new dalbers.com.noise.LoopMediaPlayer(context);
    return looper;
}

private void updateViews(java.util.List<com.johnhiott.darkskyandroidlib.models.DataPoint> dataPoints) {
    com.desmond.myweatherapp.ListViewAdapter adapter = new com.desmond.myweatherapp.ListViewAdapter(getContext(), dataPoints);
    listView.setAdapter(adapter);
}

@java.lang.Override
public android.content.Context getContext() {
    return getActivity();
}

public boolean isCombining() {
    return type.isCombining();
}

@java.lang.Override
public net.chokethe.killerdealer.adapters.BlindsAdapter.BlindViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(mContext).inflate(R.layout.blind_layout, parent, false);
    return new net.chokethe.killerdealer.adapters.BlindsAdapter.BlindViewHolder(view);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    handler = new android.os.Handler(android.os.Looper.getMainLooper());
}

public void addNewDevice(android.support.v4.util.Pair<java.lang.String, java.lang.String> newDevice) {
    if (!(mNewDevices.contains(newDevice))) {
        mNewDevices.add(newDevice);
    }
    notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    browserController.showAlbum(albumController, false);
}

protected final android.view.accessibility.AccessibilityNodeInfo findNodeByText(java.lang.String id, int parents) {
    return findNodeByText(id, 0, parents);
}

public static boolean requestActivity(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.Class tClass) {
    return com.adsamcik.signalcollector.services.ActivityService.requestActivity(context, tClass.hashCode(), com.adsamcik.signalcollector.utility.Preferences.get(context).getInt(Preferences.PREF_ACTIVITY_UPDATE_RATE, Preferences.DEFAULT_ACTIVITY_UPDATE_RATE), false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.i("IGOR", "MAIN - on STOP");
    startActivity(startupIntent);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment = com.framgia.wsm.screen.main.MainContainerFragment.newInstance(position);
    mFragments.set(position, fragment);
    return fragment;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplication(), heartware.com.heartware_master.ViewWorkout.class);
    intent.putExtra(DBAdapter.PROFILE_ID, mCurrentProfileId);
    startActivityForResult(intent, 0);
    android.util.Log.d(heartware.com.heartware_master.WorkoutsActivity.TAG, "Creating a New Workout.");
}

@android.support.annotation.CheckResult
public com.oasisfeng.hack.Hack.HackInvocation<R, C, T1, T2, T3> invoke(A1 arg1, A2 arg2, A3 arg3, A4 arg4, A5 arg5) {
    return super.invoke(arg1, arg2, arg3, arg4, arg5);
}

@java.lang.Override
public void onError(java.lang.Throwable e) {
    showLoadingSpinner(false, false);
    showLoginErrorDialog();
    if ((e.getMessage()) != null) {
        android.util.Log.e("PokeNotify", e.getMessage());
    }
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.oblador.vectoricons.VectorIconsPackage(), new com.i18n.reactnativei18n.ReactNativeI18n(), new com.facebook.reactnative.androidsdk.FBSDKPackage(com.este.MainApplication.mCallbackManager));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentLocation) != null) {
        mapView.setCenterCoordinate(new com.mapbox.mapboxsdk.geometry.LatLng(mCurrentLocation));
    }
}

public static boolean getSeen(android.content.Context c, java.lang.String key) {
    return c.getSharedPreferences("Kantidroid", Context.MODE_PRIVATE).contains(key);
}

public void onStart() {
    super.onStart();
}

public void toast(java.lang.String text) {
    android.widget.Toast.makeText(this, text, Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(SQL_CREATE_CATEGORY_TABLE);
    db.execSQL(SQL_CREATE_INTERESTING_FACT_TABLE);
    db.execSQL(SQL_CREATE_ANSWER_TABLE);
    db.execSQL(SQL_CREATE_QUESTION_TABLE);
}

private void onMissingDisplayNamesComplete(java.lang.StringBuffer debugMessage) {
    if (debugMessage != null) {
        android.util.Log.w(Global.LOG_CONTEXT, ((mDebugPrefix) + debugMessage));
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    itemLongClickListener.onItemLongClick(i);
    return false;
}

private void addInBitmapOptions(android.graphics.BitmapFactory.Options options) {
    options.inMutable = true;
    if ((bitmapPool) != null) {
        options.inBitmap = bitmapPool.getReusableBitmap(options);
    }
}

@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent e) {
    return de.viktorreiser.bansheeremote.activity.CurrentSongActivity.handleKeyEvent(e) ? true : super.dispatchKeyEvent(e);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

public static void init(android.content.Context context) {
    if ((xiaofei.library.hermes.Hermes.sContext) != null) {
        return ;
    }
    xiaofei.library.hermes.Hermes.sContext = context.getApplicationContext();
}

@java.lang.Override
public void onSuccess(java.lang.Void aVoid) {
    java.lang.String name = userModel.getDisplayName();
    android.widget.Toast.makeText(userName.getContext(), (name + " Has added"), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_main_container, new com.ritwik.android.madfbla201415.SignupFragment()).commit();
}

protected android.view.ActionMode.Callback getWindowCallback() {
    return window.getCallback();
}

private void showFragment(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    work.beltran.discogsbrowser.ui.main.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.fragment_container, fragment, tag);
    ft.commit();
}

@java.lang.Override
public boolean onCreateOptionsMenu(final android.view.Menu menu) {
    enableLoginMenu(menu);
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.util.Log.d("TKT_info", "onOptionMenu");
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mBinding = android.databinding.DataBindingUtil.setContentView(this, com.demo.awareness.app.activities.MapsActivity.LAYOUT);
}

public void usedInPattern(com.geekeclectic.android.stashcache.StashPattern pattern) {
    if (!(mUsedIn.contains(pattern))) {
        mUsedIn.add(pattern);
    }
}

@java.lang.Override
protected void onPause() {
    super.onPause();
}

private void editButtonPressed() {
    android.content.Intent intent = new android.content.Intent(getActivity(), termine24.secondinterviewtest.app.activities.EditActivity.class);
    intent.putExtra(Contact.EXTRA_CONTACT, ((android.os.Parcelable) (contact)));
    startActivityForResult(intent, Contact.REQUEST_EDIT_CONTACT);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mainActivity = ((net.hadifar.dope.ui.activity.MainActivity) (getActivity()));
    getFragmentManager().addOnBackStackChangedListener(this);
    shouldDisplayHomeUp();
}

private void init() {
    setSelectAllOnFocus(true);
    setEms(10);
    setInputType(((android.text.InputType.TYPE_CLASS_NUMBER) | (android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL)));
}

public static void getPilot(@android.support.annotation.NonNull
java.lang.String pilotId, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.pilot.AirMapPilot> callback) {
    if (pilotId != null) {
        com.airmap.airmapsdk.networking.services.PilotService.getPilot(pilotId, callback);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.kalongip.chatapp.RegisterActivity.class);
    startActivity(intent);
}

public void GoToSessionTwo(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, jp.ac.tsukuba.cs.iplab.www.barotouchexperimentalapplications.SessionTwoActivity.class);
    intent.putExtra("Calibration", calibration);
    startActivity(intent);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.kosbrother.mongmongwoo.fragments.ProductImageFragment.newInstance(urls.get(position), position);
}

@java.lang.Override
public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    return super.shouldOverrideUrlLoading(view, url);
}

public static void setErrorActivityClass(java.lang.Class<? extends android.app.Activity> errorActivityClass) {
    cat.ereza.customactivityoncrash.CustomActivityOnCrash.errorActivityClass = errorActivityClass;
}

@org.springframework.web.bind.annotation.RequestMapping(value = "/restaurant/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addRestaurant(@org.springframework.web.bind.annotation.RequestBody
eu.epitech.serverandroid.beans.Params<eu.epitech.serverandroid.beans.Restaurant> params) {
    java.lang.System.out.println("test");
    java.lang.System.out.println(params.getValue());
    eu.epitech.serverandroid.dao.RestaurantDao dao = new eu.epitech.serverandroid.dao.RestaurantDao();
    return dao.addRestaurant(params);
}

@java.lang.Override
public void onDialogCancelClick(android.app.DialogFragment dialog, int positionOfAdapter, java.lang.String kindOfAdapter) {
    getFragment().noteCardsChoosenAfterCancelDialog(kindOfAdapter, positionOfAdapter);
}

@java.lang.Override
public void onShowPress(android.view.MotionEvent e) {
    mAnimMode = 0;
    super.onShowPress(e);
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
}

public void startSingleSemesterActivity(java.lang.String number) {
    android.content.Intent i = new android.content.Intent(this, com.example.menuka.loginandregistration.SingleSemesterActivity.class);
    i.putExtra("semester", number);
    startActivity(i);
    finish();
}

private void startNewGame() {
    android.content.Intent intent = new android.content.Intent(this, com.tomade.saufomat.activity.CreatePlayerActivity.class);
    intent.putExtra(IntentParameter.MainGame.NEW_GAME, true);
    this.startActivity(intent);
}

void drawRootLayer() {
    org.mozilla.gecko.gfx.Layer rootLayer = mView.getController().getRoot();
    if (rootLayer == null) {
        return ;
    }
    rootLayer.draw(mPageContext);
}

