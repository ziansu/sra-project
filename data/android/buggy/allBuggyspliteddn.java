@java.lang.Override
public void onClick(android.view.View v) {
    com.example.yass8n.whozthis.activities.MainActivity.current_conversation = conversation;
    startActivity(new android.content.Intent(getActivity(), com.example.yass8n.whozthis.activities.MessagingActivity.class));
}

@java.lang.Override
protected void afterHookedMethod(nz.pbomb.xposed.anzmods.MethodHookParam param) throws java.lang.Throwable {
    if (nz.pbomb.xposed.anzmods.XposedMod.prefs.getBoolean(PREFERENCES.KEYS.ANZ.SPOOF_DEVICE, PREFERENCES.DEFAULT_VALUES.ANZ.SPOOF_DEVICE)) {
        de.robv.android.xposed.XposedHelpers.callMethod(param.thisObject, "b04160416041604160416ЖЖ0416", new java.lang.Class<?>[]{ java.lang.String.class }, deviceInfo.Build.BOARD);
    }
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.dailynews.dailynews.widget.fragment.PageFragment.newInstance(tabTitles[position]);
}

private android.animation.Animator createHollowSelectorAnimator() {
    return android.animation.ObjectAnimator.ofObject(null, net.ganin.darv.DpadAwareRecyclerView.BOUNDS_PROP_NAME, new net.ganin.darv.RectEvaluator(), mSelectorSourceRect, mSelectorDestRect);
}

public void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
    _handleRedirect(url);
    super.onPageStarted(view, url, favicon);
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    getPresenter().onDismiss();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    this.menu = menu;
    return true;
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(("DROP TABLE IF EXISTS " + (com.karambit.bookie.helper.DBHandler.USER_TABLE_NAME)));
    onCreate(db);
    if (db.isOpen()) {
        db.close();
    }
}

private void addPicureToGallery(java.io.File imageFile) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    android.net.Uri contentUri = android.net.Uri.fromFile(imageFile);
    mediaScanIntent.setData(contentUri);
    com.example.dell.fieldit.Model.MyApplication.getAppContext().sendBroadcast(mediaScanIntent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    abort(null, returnToChooser);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int responseCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, responseCode, intent);
    callbackManager.onActivityResult(requestCode, responseCode, intent);
}

@java.lang.Override
public void onPageSelected(int position) {
    android.widget.Toast.makeText(getApplicationContext(), ("Trip " + (position + 1)), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    initialize(com.widesteppe.Controller.getInstance(), config);
}

@java.lang.Override
public void onClick(android.view.View view) {
    int record = 0;
    if (record == 0) {
        startRecording();
        record++;
    }else {
        stopRecording();
        record = 0;
    }
}

private void showToast(final java.lang.String message) {
    final android.content.Context ctx = this;
    this.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
        }
    });
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    onBackpackSceneCompleteListener.onBackpackSceneComplete(false, true);
    dialog.dismiss();
}

@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    if (databaseError == null) {
        android.util.Log.d(com.flatshare.domain.interactors.matchingoverview.impl.MatchingOverviewInteractorImpl.TAG, ("onComplete: Sandro" + path));
        notifySuccess();
    }else {
        notifyError(databaseError.getMessage());
    }
}

@java.lang.Override
protected void onSetupUiState() {
    android.util.Log.d(com.ayuget.redface.ui.TopicsActivity.LOG_TAG, "Setting up initial state for TopicsActivity");
    com.ayuget.redface.ui.fragment.DefaultFragment defaultFragment = com.ayuget.redface.ui.fragment.DefaultFragment.newInstance();
    getSupportFragmentManager().beginTransaction().replace(R.id.container, defaultFragment, com.ayuget.redface.ui.TopicsActivity.DEFAULT_FRAGMENT_TAG).commit();
}

@java.lang.Override
public void writeToParcel(android.os.Parcel parcel, int i) {
    parcel.writeString(this.uID);
    parcel.writeString(this.firstName);
    parcel.writeString(this.lastName);
    parcel.writeString(this.currency);
}

@java.lang.Override
public void onClick(it.neokree.materialnavigationdrawer.elements.MaterialSection section) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    org.numixproject.hermes.HomeFragment fragment = ((org.numixproject.hermes.HomeFragment) (fm.findFragmentByTag("serverFragment")));
    fragment.openServerPane();
}

public void initMediaPlayer() {
    mediaPlayer = new android.media.MediaPlayer();
    mediaPlayer.setOnPreparedListener(this);
    mediaPlayer.setOnErrorListener(this);
    mediaPlayer.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
    state = edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.STOPPED;
}

public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mOpenTileFromLeftDrawer = true;
    onTileClicked(mDrawerAdapter.getTile(position));
}

public void unlockAndShow(android.view.animation.Animation.AnimationListener listener) {
    if (!(mLogoEnabled)) {
        return ;
    }
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_DISABLED;
    show(listener);
}

@java.lang.Override
public void onBackPressed() {
    finish();
    if ((bluetoothStateMonitor) != null)
        bluetoothStateMonitor.removeListener();
    
    android.bluetooth.BluetoothAdapter.getDefaultAdapter().disable();
    overridePendingTransition(R.anim.slide_right_in, R.anim.slide_right_out);
}

public void markTextAsRead(final int textNo) {
    android.util.Log.d(org.lindev.androkom.KomServer.TAG, ("markTextAsRead:" + textNo));
    readMarker.mark(textNo);
    android.util.Log.d(org.lindev.androkom.KomServer.TAG, ("markTextAsRead done:" + textNo));
}

private void setStorageFile() {
    java.io.File storageDirectory = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    storageDirectory.mkdir();
    imagePath = (((getString(R.string.app_name)) + ".") + (com.jets.medicalreminder.edit.EditMedicineFragment.IMAGE_FORMAT)) + storageDirectory;
}

@java.lang.Override
public void onMapReady(com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap) {
    map = mapboxMap;
    new com.mapbox.mapboxandroiddemo.examples.mas.TurfInsideActivity.DrawGeoJson().execute();
    map.setOnMapClickListener(this);
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    videoview.setVideoId("sl8da4jjbxa3c15f99bc37545693f7f9_s");
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String outgoingID = ((android.widget.TextView) (view.findViewById(R.id.outgoingIdTV))).getText().toString();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    getCurrentSelections();
    android.util.Log.d(ray.cyberpup.com.touchframework.InterceptsDialog.LOG_TAG, "onStart");
}

public void SGFingerPresentCallback() {
    autoOn.stop();
    fingerDetectedHandler.sendMessage(new android.os.Message());
}

private boolean performBackActionH5(android.view.accessibility.AccessibilityNodeInfo root) {
    return performBackAction(root, "com.alipay.mobile.nebula:id/h5_tv_nav_back", false);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    try {
        mImageUrlInterface = ((com.example.randomlocks.gamesnote.DialogFragment.ImageUrlFragment.ImageUrlInterface) (getTargetFragment()));
    } catch (java.lang.Exception e) {
        com.example.randomlocks.gamesnote.HelperClass.Toaster.make(getContext(), "interface cast exception");
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    io.kimo.gameoflifeview.view.GameOfLifeView gameOfLifeView = new io.kimo.gameoflifeview.view.GameOfLifeView(this);
    setContentView(gameOfLifeView);
    gameOfLifeView.resume();
}

public void startCam() {
    client.setCamera("640", "480");
    client.start("android_test");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initializeComponents();
    processLoginIfTokenExists();
    android.util.Log.d("Chooser", "Login loaded");
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    com.bookstore.booklist.CategoryBookListFragment.DeteleSelectedBooksTask deleteTask = new com.bookstore.booklist.CategoryBookListFragment.DeteleSelectedBooksTask(mode);
    deleteTask.execute();
}

public void onLoginSuccess() {
    _loginButton.setEnabled(true);
    startActivity(new android.content.Intent(getApplicationContext(), unical.master.computerscience.yellit.graphic.Activities.WelcomeActivity.class));
    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    finish();
}

public void setTitle(java.lang.CharSequence title, java.lang.CharSequence subtitle, org.kontalk.data.Contact contact) {
    android.support.v7.app.ActionBar bar = getSupportActionBar();
    if (title != null)
        bar.setTitle(title);
    
    if (subtitle != null)
        bar.setSubtitle(subtitle);
    
}

public co.vendoo.vendooepicodus.ui.StoreDetailFragment newInstance(co.vendoo.vendooepicodus.models.Store store) {
    co.vendoo.vendooepicodus.ui.StoreDetailFragment storeDetailFragment = new co.vendoo.vendooepicodus.ui.StoreDetailFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable("store", org.parceler.Parcels.wrap(store));
    storeDetailFragment.setArguments(args);
    return storeDetailFragment;
}

@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    if ((motionEvent.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
    }
    return true;
}

@java.lang.Override
public void onIconClicked(android.view.View v) {
}

public void setRootDir(java.lang.String root) {
    android.util.Log.i(TAG, (("MyServer.setRootDir(" + root) + ")"));
    com.wade.webserver.MyServer.rootDir = root;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapter, android.view.View view, int position, long id) {
    org.sfbtmc.bean.MainPageListBean listBean = mainPageMsgBean.getMsgBeanList().get(position);
    viewDetailMainPageListMsg(listBean);
}

void initialize(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    mImpl = com.slaterama.fab2.widget.roundedbutton.RoundedButtonImpl.newInstance(this, fillAttributes(context, attrs, defStyleAttr, defStyleRes));
}

private android.graphics.drawable.AnimationDrawable getMultAnim() {
    return ((android.graphics.drawable.AnimationDrawable) (multiplier.getBackground()));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, in.ac.iitm.students.ProfileActivity.class);
    startActivity(intent);
}

public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if ((mParentDelegate) != null) {
        bundle = mParentDelegate.mBundle;
    }else {
    }
    onCreate(bundle);
}

public synchronized int getPosition() {
    if (((currentTrackPlayer) != null) && (currentTrackPlayer.isPlaying()))
        return currentTrackPlayer.getCurrentPosition();
    
    android.util.Log.d(org.fitchfamily.android.symphony.MusicService.TAG, "getPosition() not playing?");
    return 0;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(perla)) {
        pulsante.setText(getResources().getString(peerla_switch()));
    }else {
        pulsante.setText("Cojone");
        perla = false;
    }
}

@java.lang.Override
public void onCancelled(com.firebase.client.FirebaseError firebaseError) {
    android.util.Log.i(xyz.efritz.bikecurious.RideHistoryActivity.TAG, "cancelled");
}

public void go(android.view.View view) {
    android.content.Intent fight = new android.content.Intent(this, sikware.com.gladitor.Fight.class);
    fight.putExtra("arena", rbg.getCheckedRadioButtonId());
    startActivity(fight);
    finish();
}

public void sendString(java.lang.String s) {
    if ((null != s) && (!(android.text.TextUtils.isEmpty(s)))) {
        pubnubService.publishToPubnubChannel(s);
    }
}

@java.lang.Override
public void start(int time) {
    android.util.Log.i("BroadcastMorse", " vibration play");
    vibrator.vibrate(time);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Reddit.seen.edit().putBoolean(SettingValues.PREF_FAB_CLEAR, true).apply();
    me.ccrama.redditslide.Reddit.fabClear = true;
    clearSeenPosts(true);
}

private void removeGroundOverlays(java.util.HashMap<com.google.maps.android.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> groundOverlays) {
    for (com.google.android.gms.maps.model.GroundOverlay groundOverlay : groundOverlays.values()) {
        groundOverlay.remove();
    }
}

public void onQuoteSelected(boolean selected) {
    if (selected) {
        android.app.FragmentManager fm = getFragmentManager();
        testproject.halfmoonstudios.com.ponder.QuoteFragment quoteFrag = ((testproject.halfmoonstudios.com.ponder.QuoteFragment) (fm.findFragmentById(R.id.fragmentContainer)));
        quoteFrag.setQuoteText();
    }
}

public static synchronized de.blau.android.Logic newLogic(java.util.de.blau.android.Map map) {
    if ((de.blau.android.Application.logic) == null) {
        de.blau.android.Application.logic = new de.blau.android.Logic(map);
    }
    return de.blau.android.Application.logic;
}

@java.lang.Override
public void onDataParsed(java.util.ArrayList data) {
    android.util.Log.i("ffs", data.toString());
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (!(mOptionsVisible)) {
        mOptionsVisible = !(mOptionsVisible);
        animationOptionsOntoScreen();
    }
}

@java.lang.Override
public boolean onPreferenceClick(final android.preference.Preference preference) {
    de.geithonline.wallpaperdesigner.settings.SettingsIO.loadDesignTheFancyWay(getActivity(), Settings.prefs, true);
    return false;
}

void showAnnotation() {
    if ((annotation) == null) {
        annotation = new org.redpin.android.ui.mapview.LocationMarkerAnnotation(this);
        container.addView(annotation);
    }
    annotation.setEnabled(enabled);
    annotation.setVisibility(getVisibility());
}

protected void toggleToolbar(boolean shouldBeVisible) {
    int deltaY = (shouldBeVisible) ? 0 : -(mToolbar.getHeight());
    mToolbar.animate().translationY(deltaY).setInterpolator(new android.view.animation.AccelerateInterpolator(2));
}

@java.lang.Override
public void onMonthChanged(org.unimelb.itime.vendor.helper.MyCalendar calendar) {
    android.util.Log.i(org.unimelb.itime.test.david.YinActivity.TAG, ("onMonthChanged: " + (calendar.getCalendar().getTime())));
}

@java.lang.Override
public int compareTo(@android.support.annotation.NonNull
com.jpgrego.thesisapp.thesisapp.data.WifiAP another) {
    return (another.dbm) - (this.dbm);
}

@java.lang.Override
public void onClick(android.view.View v) {
    buttonplayer2Pressed = true;
    buttonplayer2.setEnabled(false);
    buttonplayer1.setEnabled(false);
    android.widget.Toast.makeText(getApplicationContext(), "Sucht nach Geräte...", Toast.LENGTH_SHORT).show();
    findDevices();
}

@java.lang.Override
public void run() {
    android.util.Log.d(com.example.keshavdulal.a14_simple_drawing.MainActivity.TAG, "Start Recording");
    com.example.keshavdulal.a14_simple_drawing.AudioRecordClass.startRecord();
}

@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(sleepTime);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    startActivity(new android.content.Intent(getApplicationContext(), com.inklin.openinwechat.ShiftActivity.class));
    sleepTime += 100;
}

@java.lang.Override
public void onSuccess(java.lang.String operationId, android.os.Bundle data) {
    org.techteam.decider.util.Toaster.toast(getApplicationContext(), "GetUser: ok");
    retrieveUserTask = new org.techteam.decider.gui.activities.MainActivity.RetrieveUserTask();
    retrieveUserTask.execute();
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(ml.puredark.hviewer.activities.SettingActivity.SettingFragment.KEY_PREF_PROXY_ENABLED)) {
        updateProxyOptions(sharedPreferences.getBoolean(key, true));
    }
}

@java.lang.Override
public void onAbort(final com.hound.android.sdk.VoiceSearchInfo info) {
    voiceSearch = null;
    resetUIState();
}

@java.lang.Override
public void onPageSelected(int position) {
    android.util.Log.i(com.kimkevin.android.MainActivity.TAG, ("onPageSelected : " + position));
}

public abstract void onLoadMore(int page, int totalItemsCount, android.support.v7.widget.RecyclerView view);

private void canBack() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(((fm.getBackStackEntryCount()) > 0));
    }
}

boolean isPanicTrigger(android.content.Intent intent) {
    return (intent != null) && (acr.browser.lightning.activity.BrowserActivity.INTENT_PANIC_TRIGGER.equals(intent.getAction()));
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult) {
    hideProgressDialog();
    handleSignInResult(googleSignInResult);
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    if (mGoogleApiClient.isConnected()) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, ((com.google.android.gms.location.LocationListener) (this)));
        mGoogleApiClient.disconnect();
    }
}

public void selectPic() {
    android.content.Intent intent = new android.content.Intent();
    intent.setType("image/*");
    intent.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(android.content.Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
}

public void registerListener() {
    android.util.Log.e(com.yueqiu.YueQiuApp.TAG, ">>>>>>>>>>>>>>registerListener<<<<<<<<<<<<");
    com.gotye.api.GotyeAPI.getInstance().addListerer(this);
}

@java.lang.Override
public void onError(int i, java.lang.String s) {
    android.util.Log.d(context.getPackageName(), ("queryReply err: " + s));
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.exemple.respectmovement.GiveRespectFragment.newInstance(position);
        case 1 :
        case 2 :
        default :
            android.util.Log.e(DEBUGER_TAG, "Out of range position");
    }
    return null;
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View notificappView = inflater.inflate(R.layout.fragment_notificapptor, container, false);
    butterknife.ButterKnife.bind(this, notificappView);
    notifyMe();
    return notificappView;
}

public static java.util.List<java.lang.String> filterWordList(android.content.Context c, java.lang.String list, int mastery) {
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.home_fragment_container, new pl.mirko.home.HomeFragment());
    fragmentTransaction.commit();
}

@java.lang.Override
protected void onCancelled(java.util.ArrayList arrayList) {
    super.onCancelled(arrayList);
    mViewPagerAdapter.setLoadingNewBill(false, false);
    android.util.Log.d("FragmentNewBill", "onCancelled.");
}

@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    map.setMyLocationEnabled(true);
    map.setOnMarkerClickListener(this);
    map.setOnInfoWindowClickListener(this);
}

private java.lang.Long loadBestTime() {
    android.content.SharedPreferences sharedPref = getSharedPreferences("Runner", com.runrmby.runner.MODE_PRIVATE);
    java.lang.Long time = sharedPref.getLong("bestTime", 0L);
    return time;
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public void run() {
    try {
        someTask(savedText);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.content_create_group);
    context = this;
    initElementsWithIds();
    initElementsWithListeners();
    mStorageRef = com.google.firebase.storage.FirebaseStorage.getInstance().getReference();
}

@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    hideInfoText();
    selectDrawerItem(item);
    return false;
}

@java.lang.Override
public adityagurjar.people.contactsListAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_row, parent, false);
    return new adityagurjar.people.contactsListAdapter.MyViewHolder(itemView);
}

@java.lang.Override
public byte[] getBody() throws com.android.volley.AuthFailureError {
    org.json.JSONObject obj = new org.json.JSONObject(params);
    return obj.toString().getBytes();
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.fragment_tab_operations, container, false);
    loadUserRequestByDate();
    return rootView;
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    homePresenter.getPageSuggestions(searchEdittext.getText().toString());
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeTypedList(this.dots);
    dest.writeParcelable(((android.os.Parcelable) (this.listener)), flags);
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.util.Log.d("index value", java.lang.String.valueOf(i));
    listView.setFastScrollEnabled(true);
}

static int getScreenWidth(android.content.Context context) {
    final int width = context.getResources().getDisplayMetrics().widthPixels;
    return width;
}

@java.lang.Override
public void onCallReported() {
    android.util.Log.d(org.a5calls.android.a5calls.controller.IssueActivity.TAG, "call reported successfully!");
    android.support.design.widget.Snackbar.make(issueName, getResources().getString(R.string.call_reported), Snackbar.LENGTH_SHORT).show();
    setButtonsEnabled(true);
    tryLoadingNextContact();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (mediaPlayer != null) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}

private boolean validateName(java.lang.String input) {
    if (android.text.TextUtils.isEmpty(input)) {
        toast(R.string.goal_add_err_user_firstname__empty);
        return false;
    }
    return true;
}

