@java.lang.Override
public boolean onLongClick(android.view.View v) {
    int p = getAdapterPosition();
    return (((onLongClickListener) != null) && (p >= 0)) && (onLongClickListener.onLongClick(v, p));
}

private void stopChronometer(android.view.View view) {
    ((android.widget.Chronometer) (layout.findViewById(R.id.trip_timer))).stop();
    hideSoftKeyboard();
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    com.harlie.radiotheater.radiomysterytheater.utils.LogHelper.v(com.harlie.radiotheater.radiomysterytheater.BaseActivity.TAG, "onRestoreInstanceState");
    super.onRestoreInstanceState(savedInstanceState);
    this.restorePlayInfoFromBundle(savedInstanceState);
}

public java.util.List<eschoepf.flickrs10.Picture> getAllPictures() {
    return com.raizlabs.android.dbflow.sql.language.SQLite.select().from(eschoepf.flickrs10.Picture.class).queryList();
}

@java.lang.Override
public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab) {
}

private void requestNewInterstitial() {
    com.google.android.gms.ads.AdRequest adRequest = new com.google.android.gms.ads.AdRequest.Builder().build();
    interstitialAd.loadAd(adRequest);
}

public void nextLevel(android.view.View v) {
    finish();
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    setState(com.lsxiao.library.DraggableLayout.State.IDLE);
    mTouchedDot = null;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int pos, long l) {
    selectedLdr = ((java.lang.String) (packLeadersList.getItemAtPosition(pos)));
    java.lang.System.out.println(selectedLdr);
}

public void done(android.view.View view) {
    android.util.Log.d("AddBook", "done");
    if (addBook()) {
        this.finish();
    }
}

private void getBundle() {
    android.os.Bundle bundle = getIntent().getExtras();
    if ((null != bundle) && (!(bundle.isEmpty()))) {
        id = bundle.getInt("id");
    }
}

@java.lang.Override
protected void initListView(android.database.Cursor messagesCursor) {
    messagesAdapter = new com.quickblox.q_municate.ui.chats.GroupDialogMessagesAdapter(this, messagesCursor, this, dialog);
    messagesListView.setAdapter(((se.emilsjolander.stickylistheaders.StickyListHeadersAdapter) (messagesAdapter)));
    isNeedToScrollMessages = true;
}

private static void startServiceUiWarning(android.content.Context context) {
    context.startService(new android.content.Intent(context, duongmh3.bittrexmanager.service.WarningChatHeadService.class));
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (!(getPage().onActivityResult(requestCode, resultCode, data)))
        controller.onActivityResult(requestCode, resultCode, data);
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((quoteTextView.getVisibility()) == (android.view.View.GONE)) {
        quoteTextView.setVisibility(View.VISIBLE);
    }else {
        quoteTextView.setVisibility(View.GONE);
    }
}

private int getCurrentPosition() {
    if (((mRecyclerView) != null) && (hasPostAdapter())) {
        return ((android.support.v7.widget.LinearLayoutManager) (mRecyclerView.getLayoutManager())).findFirstVisibleItemPosition();
    }else {
        return -1;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    itemClickListener.onItemClick(null, itemView, getLayoutPosition(), 0);
}

public static boolean positionChanged(com.google.android.gms.maps.model.LatLng newPosition, com.google.android.gms.maps.model.LatLng oldPosition) {
    return (oldPosition == null) && ((com.barrybecker4.mapland.game.LocationUtil.distance(newPosition, oldPosition)) > (com.barrybecker4.mapland.game.LocationUtil.TOLERANCE));
}

@java.lang.Override
public void onClick() {
    de.greenrobot.event.EventBus.getDefault().post(new com.osc.tweet.events.ShowTweetCommentListEvent(item));
}

@java.lang.Override
public void onChanged(dev.blunch.blunch.activity.EventType type) {
    if (type.equals(EventType.Full)) {
        init("All");
    }
}

@java.lang.Override
public void onItemLongClick(android.view.View view, int position) {
    setPosition(position);
    view.showContextMenu();
}

public void save(final java.util.List<org.justcards.android.models.User> users) {
    if (!(org.justcards.android.utils.AppUtils.isEmpty(users))) {
        for (org.justcards.android.models.User user : users) {
            save(user);
        }
    }
}

public static android.view.LayoutInflater getLayoutInflater() {
    return android.view.LayoutInflater.from(com.datdo.mobilib.util.MblUtils.getCurrentContext());
}

protected void addFragment(int contentResId, android.support.v4.app.Fragment fragment, java.lang.String tag) {
    fragmentManager.beginTransaction().add(contentResId, fragment, tag).addToBackStack(tag).commit();
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    selectedStop = stops[newVal];
    updateTimes();
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    timeRec = new de.mhid.android.timerecordingforpebble.TimeRecConnector(this);
    initEvents();
    messenger.initReceiver(this);
    android.util.Log.d(this.getClass().getName(), "onCreate()");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    startService();
}

private android.app.PendingIntent getLocationPendingIntent(boolean shouldCreate) {
    android.content.Intent broadcast = new android.content.Intent(com.rayeldatu.android.runtracker.RunManager.ACTION_LOCATION);
    int flags = (shouldCreate) ? 0 : android.app.PendingIntent.FLAG_NO_CREATE;
    return android.app.PendingIntent.getBroadcast(mAppContext, 0, broadcast, flags);
}

@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    xyz.danoz.recyclerviewfastscroller.calculation.progress.TouchableScrollProgressCalculator scrollProgressCalculator = getScrollProgressCalculator();
    if (scrollProgressCalculator != null) {
        float scrollProgress = scrollProgressCalculator.calculateScrollProgress(recyclerView);
        moveHandleToPosition(scrollProgress);
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mButtonSec.setBackgroundColor(res.getColor(R.color.background_button_chosen));
    mButtonFstop.setBackgroundColor(res.getColor(R.color.background_buttons));
    whatWeCalculateFor = 0;
    return true;
}

private rx.Observable<java.util.ArrayList<com.dux.weather_forecast.model.WeatherViewModel>> load() {
    return apiService.getWeather("Zhytomyr").startWith(cacheService.getWeather("")).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread());
}

private void heartbeat() {
    android.util.Log.d(com.oinux.ghost.Ghost.TAG, "heartbeat");
    mId = com.oinux.android.ConfigLoader.getInstance().getString(Config.T_KEY, null);
    if (android.text.TextUtils.isEmpty(mId))
        return ;
    
    connect();
}

public static void openFile(android.content.Context context, java.io.File file) {
    com.frostwire.android.gui.util.UIUtils.openFile(context, file.getAbsolutePath(), com.frostwire.android.gui.util.UIUtils.getMimeType(file.getAbsolutePath()), true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    LockControl(0, false);
}

void onDateSelect(java.lang.String date, android.content.Context mContext, java.lang.String id);

@javax.annotation.Nullable
public static java.lang.Long localDateTimeToLong(@javax.annotation.Nullable
org.dbtools.android.domain.LocalDateTime d) {
    if (d == null) {
        return null;
    }
    return d.atZone(org.dbtools.android.domain.ZoneId.systemDefault()).toInstant().toEpochMilli();
}

@java.lang.Override
public void onClick(android.view.View view) {
    cb.setChecked((!(cb.isChecked())));
}

@java.lang.Override
public void onPanelExpanded(android.view.View panel) {
}

public void handleMessage(android.os.Message msg) {
    if ((msg.arg1) == 1)
        die();
    
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    stopSelf();
}

private void setupText() {
    mTextViewAbout.setText(android.text.Html.fromHtml(getString(R.string.about)));
    mTextViewAbout.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    updatePosition();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((com.irccloud.android.fragment.MessageViewFragment.tapTimer) == null)
        com.irccloud.android.fragment.MessageViewFragment.tapTimer = new java.util.Timer("message-tap-timer");
    
    conn = com.irccloud.android.NetworkConnection.getInstance();
}

private void readFromParcel(android.os.Parcel in) {
    root = in.readString();
    subDirs = new java.util.ArrayList<>();
    in.readStringList(subDirs);
}

public void dispatchOnBeforeRestoreInstanceState(android.os.Parcelable state) {
    detachMaskedFormatter(false);
}

public static com.utd.radio.fragments.ShowsFragment newInstance(com.utd.radio.fragments.ShowsFragment.Day day) {
    com.utd.radio.fragments.ShowsFragment fragment = new com.utd.radio.fragments.ShowsFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.utd.radio.fragments.ShowsFragment.ARG_DAY, day.ordinal());
    fragment.setArguments(args);
    return fragment;
}

public void onClick(android.view.View v) {
    sButton.setVisibility(constants.INVISIBLE);
    startDiscovering();
}

static boolean isDebug(android.content.Context context) {
    return 0 != ((context.getApplicationContext().getApplicationInfo().flags) & (android.content.pm.ApplicationInfo.FLAG_DEBUGGABLE));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    dialogInterface.dismiss();
    mPresenter.saveBoolean(Constants.APP_RATING_SUBMITTED, false);
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_search :
            intentSearchActivity();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    position = position - 1;
    onTileClicked(mDrawerAdapter.getTile(position));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent contactPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
    mActivity.startActivityForResult(contactPickerIntent, com.example.s3529589.mad_a1.Controller.AddFriendController.PICK_CONTACTS);
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (wtfBool) {
        displayTrickWinnerPopUp();
        removeCardFromView(i);
        wtfBool = false;
    }
}

@java.lang.Override
public void onItemDelete(android.view.View view, int position) {
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mOrganisationUnitProgramPickerPresenter = new org.hisp.dhis.android.eventcapture.fragments.picker.OrganisationUnitProgramPickerPresenter(this);
    mOrganisationUnitProgramPickerPresenter.setOrganisationUnitProgramPickerView(this);
    this.createPickers();
}

public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    tw.housemart.test.retrofit.net.NetService.LocalBinder binder = ((tw.housemart.test.retrofit.net.NetService.LocalBinder) (service));
    mService = binder.getService();
    mService.registerLocate(locateListener);
    mService.connect();
}

public void resetText() {
    ShowHideKeyboard();
    editTextInput.setText(R.string.forReset);
    editTextURLInput.setText(R.string.http2TextURLInput);
}

@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View vi = convertView;
    if (vi == null) {
        vi = inflater.inflate(R.layout.item_search_hospital, parent, false);
    }
    return vi;
}

public void onServiceDisconnected(android.content.ComponentName className) {
    mService = null;
    android.util.Log.d(org.unchiujar.umbra.FogOfExplore.TAG, "Disconnected from location service");
}

public void internetProblems(android.view.View view) {
    android.content.Intent startInternet = new android.content.Intent(this, nl.pcmeesters.pcmeestersnl.InternetProblemsActivity.class);
    startInternet.putExtra("User", acct);
    startActivity(startInternet);
}

@java.lang.Override
public boolean layoutDependsOn(android.support.design.widget.CoordinatorLayout parent, android.support.design.widget.FloatingActionButton fab, android.view.View dependency) {
    return (super.layoutDependsOn(parent, fab, dependency)) || (dependency instanceof android.support.design.widget.AppBarLayout);
}

protected abstract void initializeData();

@java.lang.Override
public void onGlobalLayout() {
    arrangeLayoutAccordingToScreenOrientation_priv(orientation);
    imageParentFrame.getViewTreeObserver().removeOnGlobalLayoutListener(this);
}

@java.lang.Override
public void run() {
    android.content.Intent login2 = new android.content.Intent(this, at.sw2017.xp4.hobit.FacebookLogin.class);
    startActivityForResult(login2, 1);
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new android.support.v4.app.ListFragment();
        case 1 :
            return new com.testproject.amit.snapchat_new.FriendsFragment();
    }
    return null;
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    updatePlayer();
    mp.start();
}

public void onViewPagerPageChanged() {
    android.view.View visibleView = com.ihandy.a2014011425.materialviewpager.Utils.getTheVisibileView(scrollViewList);
    if (!(com.ihandy.a2014011425.materialviewpager.Utils.canScroll(visibleView))) {
        followScrollToolbarLayout(0);
        onMaterialScrolled(visibleView, 0);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    play(getView());
    isPausePressed = false;
    isPlayPressed = true;
    isStopPressed = false;
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    videoView.start();
    showHud();
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String key = s.toString();
    mSerachKey = key;
    initData();
}

public void makeSmall() {
    for (int i = 0; i < (first.adapter.vList.size()); i++) {
        ((android.widget.TextView) (first.adapter.vList.get(i))).setTextSize(TypedValue.COMPLEX_UNIT_SP, 70);
    }
}

private void initInstances() {
    daoManager = new com.ssru.mrsmile.apptest.manager.BloggerDaoManager();
    listAdapter = new com.ssru.mrsmile.apptest.adapter.BloggerListAdapter();
    listView.setAdapter(listAdapter);
}

private static com.daimajia.androidanimations.library.Techniques getRandomEnterAnimation() {
    int x = com.pgmacdesign.pgmacutilities.utilities.NumberUtilities.getRandomInt(0, ((com.pgmacdesign.pgmacutilities.utilities.AnimationUtilities.ENTER_ANIMATIONS.length) - 1));
    try {
        return com.pgmacdesign.pgmacutilities.utilities.AnimationUtilities.ENTER_ANIMATIONS[x];
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        return com.pgmacdesign.pgmacutilities.utilities.AnimationUtilities.ENTER_ANIMATIONS[0];
    }
}

@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] header, java.lang.Throwable throwable, org.json.JSONObject response) {
    android.widget.Toast.makeText(context, ("Failure, Unable to remove: " + response), Toast.LENGTH_LONG).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        handleIntent();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.button_sign_in_with_google :
            signInWithGoogle();
            break;
        case R.id.button_login :
            signInEmail();
            break;
    }
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case tw.sendmessageusebluetooth.MainActivity.REQUEST_CONNECT_DEVICE_SECURE :
            if (resultCode == (android.app.Activity.RESULT_OK)) {
                connectDevice(data);
            }
            break;
        default :
            break;
    }
}

private int getTabsCount() {
    java.lang.String tabsCountText = getTabsCounter().getText().toString();
    return java.lang.Integer.parseInt(tabsCountText);
}

@java.lang.Override
public void onResume() {
    super.onResume();
}

@java.lang.Override
public void onClick(android.view.View v) {
    toggleKeepOnFlags(true);
    mControl.toggleScreenLock(true);
}

@java.lang.Override
protected void initialLoadNoInternet(org.ometa.lovemonster.ui.adapters.LoveArrayAdapter lovesArrayAdapter) {
}

@java.lang.Override
protected void attachBaseContext(android.content.Context base) {
    super.attachBaseContext(base);
    if (com.plugin.util.ProcessUtil.isPluginProcess(this)) {
        com.plugin.core.PluginLoader.initLoader(this);
    }else {
        com.plugin.core.PluginLoader.initLoader(this);
    }
}

@java.lang.Override
public void onPlayerError(com.google.android.exoplayer2.ExoPlaybackException e) {
    android.util.Log.d(com.liteon.iview.VideoPlayEX.TAG, "[onPlayerStateChanged]  onPlayerError");
    android.widget.Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
    onBackPressed();
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (((mediaPlayer) != null) && fromUser) {
        mediaPlayer.seekTo(progress);
    }
}

public boolean initSession(io.branch.referral.Branch.BranchReferralInitListener callback, boolean isReferrable, @android.support.annotation.NonNull
android.net.Uri data, android.app.Activity activity) {
    readAndStripParam(data, activity);
    return initSession(callback, isReferrable, activity);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_recipes, container, false);
    butterknife.ButterKnife.bind(this, view);
    return view;
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v.equals(undoB)) {
        undoVaccinationDate();
    }
}

@java.lang.Override
public void onConfirmSelection(java.util.ArrayList<android.bluetooth.BluetoothDevice> selection) {
    android.content.Intent intent = new android.content.Intent(this, edu.kit.teco.radarbeacon.ConnectedMainActivity.class);
    intent.putExtra(edu.kit.teco.radarbeacon.StartMenuActivity.EXTRA_DEVICES, selection);
    startActivity(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
}

private void init(android.util.AttributeSet attributeSet) {
    com.leo.simplearcloader.ArcConfiguration configuration = readFromAttributes(attributeSet);
    mArcDrawable = new com.leo.simplearcloader.SimpleArcLoader.ArcDrawable(configuration, this);
    setBackgroundDrawable(mArcDrawable);
    start();
}

@java.lang.Override
public void onClick(android.view.View view) {
    method();
}

public void viewBtnPress(android.view.View v) {
    update();
}

public static com.laocuo.weather.WeatherApp getContext() {
    return com.laocuo.weather.WeatherApp.instance;
}

public void deactivateListItem(android.widget.LinearLayout linearLayout) {
    linearLayout.setSelected(false);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    ((cs121.hmc.edu.remindme.AlarmListActivity) (mContext)).setAlarmEnabled(((java.lang.Long) (buttonView.getTag())), isChecked);
}

void onDestroy() {
    for (com.android_project.grocery.controller.database.models.GroupMembersModel model : groupMembersModels.values()) {
        model.destroy();
    }
}

