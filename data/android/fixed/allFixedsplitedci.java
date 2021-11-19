private java.util.List<com.google.android.gms.awareness.state.BeaconState.TypeFilter> setupAttachements() {
    return java.util.Arrays.asList(BeaconState.TypeFilter.with(getString(R.string.Namespace), getString(R.string.Type)));
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    pd.dismiss();
}

private android.content.ContentValues createContentValues(io.dojogeek.adminibot.models.TypePaymentMethodModel paymentMethod) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    return contentValues;
}

static void setRecordingBufferLengthMillis(int recordingBufferLengthMillis) {
    ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mBeginningOfBufferPosition.setSessionStartPointerMillis((-(java.lang.Math.abs(recordingBufferLengthMillis))));
}

@java.lang.Override
public void addFragment(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    this.fragment = fragment;
    getSupportFragmentManager().beginTransaction().replace(R.id.main_content, fragment).commit();
    getSupportFragmentManager().executePendingTransactions();
}

void EnableBluetoothModule() {
    com.futsal.manager.LogModule.LogManager.PrintLog("EmbeddedSystemFinderProcesserVer2", "EnableBluetoothModule", "Try enable ble", com.futsal.manager.DefineManager.LOG_LEVEL_DEBUG);
    android.content.Intent enableBluetoothModuleIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
    embeddedSystemFinderVer2.startActivityForResult(enableBluetoothModuleIntent, com.futsal.manager.DefineManager.ENABLE_BLUETOOTH_MODULE_USER_ACCESS_ACCEPT);
}

public void setToggleDrawables(android.graphics.drawable.Drawable[] drawables) {
    mToggleDrawables = drawables;
    setState(mCurrentState, false);
}

@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        broadcastUpdate(com.wm.bloodpro_4_0.BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
    }
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
    android.content.Intent resultIntent = new android.content.Intent();
    setResult(com.scientists.happy.botanist.ui.RESULT_OK, resultIntent);
    finish();
}

public void onClick(android.content.DialogInterface dialog, int id) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.ofcampus.model.SearchData mSearchData = items.get(position);
    if (mSearchData != null) {
        gotToScreen(mSearchData);
    }
}

public void pause() {
    mediaPlayer.pause();
    setState(edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.PAUSED);
    android.util.Log.e("Media Player Service", ("State: " + (getState())));
}

@java.lang.Override
public void onBackPressed() {
    ((com.themealz.themealz.TheMealzApplication) (this.getApplication())).removeFromMealOptionsMap(parentID);
    super.onBackPressed();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    name.gudong.translate.util.Utils.shareText(this, exportText);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    new ru.velkonost.lume.activity.BoardCardActivity.LeaveCard().execute();
    refreshActivity();
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    this.holder = null;
    if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
        releaseMediaPlayer();
        videoPauseFlag = true;
    }else {
        releaseMediaPlayer();
    }
}

public void stopPlaying() {
    if (com.codingspezis.android.metalonly.player.BuildConfig.DEBUG)
        com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.LOGGER.debug("stopPlaying()");
    
    metadataListener.stop();
    timeoutListener.stop();
    com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.mediaPlayer.stop();
    reset();
    releaseLocks();
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.e("MyBindService", "onUnBind");
    mediaPlayer.stop();
    mediaPlayer.release();
    return true;
}

public android.graphics.Rect getSrcRect() {
    return new android.graphics.Rect(0, 0, ((bm.getWidth()) - 1), ((bm.getHeight()) - 1));
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        showDialog(com.flipkart.todo.AddFragment.DATE_DIALOG_ID).show();
        v.setEnabled(false);
        v.setEnabled(true);
    }
}

private void setupView() {
    setContentView(R.layout.activity_login);
    setOnClickListeners(R.id.loginCreateAccountBtn, R.id.loginSignInBtn);
    remember = ((android.widget.CheckBox) (findViewById(R.id.loginRemember)));
}

@java.lang.SuppressWarnings(value = "deprecation")
private void syncCookies() {
    if ((Build.VERSION.SDK_INT) < 21) {
        android.webkit.CookieSyncManager.createInstance(getApplicationContext());
        android.webkit.CookieSyncManager.getInstance().sync();
    }
}

@butterknife.OnClick(value = R.id.baseDialog)
public void baseDialog(android.view.View v) {
    com.bryan.lib.dialog.FastDialog.ShowNormalDialog(context, "提示", "是否确定退出程序?", null, new com.flyco.dialog.listener.OnBtnRightClickL() {
        @java.lang.Override
        public void onBtnRightClick() {
            com.bryan.lib.util.T.showShort(context, "确定");
        }
    });
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mUm = ((android.os.UserManager) (getSystemService(Context.USER_SERVICE)));
    setHasOptionsMenu(true);
}

public void oCEntryMode(android.view.View v) {
    mode = 0;
    setmode();
}

protected void onDestroy() {
    super.onDestroy();
    for (android.support.v4.app.Fragment f : fragments) {
        if (org.kei.android.phone.netcap.OutputFragment.class.isInstance(f))
            ((org.kei.android.phone.netcap.OutputFragment) (f)).delete();
        
    }
}

@java.lang.Override
public void onScanDone(boolean isSuccess) {
    getCurrentState().onScanDone(isSuccess);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.fragment_singing_songlist, container, false);
    inflateList(inflater, ((android.view.ViewGroup) (root)), savedInstanceState);
    return root;
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> table : tables.entrySet()) {
        db.execSQL(table.getValue());
    }
}

protected void onHandleWrappedAdapterItemRangeChanged(int positionStart, int itemCount, java.lang.Object payload) {
    com.h6ah4i.android.widget.advrecyclerview.utils.BaseWrapperAdapter.notifyItemRangeChanged(positionStart, itemCount, payload);
}

public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if (((mParentDelegate) != null) && ((mParentDelegate.mBundle) != null)) {
        bundle = mParentDelegate.mBundle;
    }
    onSaveInstanceState(bundle);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialog.dismiss();
    this.finish();
}

@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
}

@java.lang.Override
public boolean equals(java.lang.Object otherFolder) {
    if (!(otherFolder instanceof com.newsblur.domain.Folder))
        return false;
    
    return android.text.TextUtils.equals(((com.newsblur.domain.Folder) (otherFolder)).name, name);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    audioManager.abandonAudioFocus(afChangeListener);
    if (mp != null) {
        mp.release();
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}

@java.lang.Override
public void onSuccess(final com.github.kulebin.myfoursquareapp.model.Venue venue) {
    mPresenter.setProgress(false);
    if (venue != null) {
        mPresenter.presentVenueToShowData(new com.github.kulebin.myfoursquareapp.view.VenueDisplayData(venue));
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.app.Dialog addPaymentDialog = new com.szymkowski.personaltrainercompanion.payments.AddPaymentDialog(this, this);
    addPaymentDialog.show();
    floatingActionsMenu.collapse();
}

@java.lang.Override
public com.github.abdurahmanovart.notesrealm.adapter.NoteAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View row = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
    return new com.github.abdurahmanovart.notesrealm.adapter.NoteAdapter.ViewHolder(row);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.sharekeg.streetpal.userinfoforlogin.UserInfoForLogin> call, java.lang.Throwable t) {
}

@java.lang.Override
public void on(java.lang.Throwable throwable) {
    if (throwable != null) {
        android.util.Log.e(fr.esir.services.Context_service.TAG, throwable.toString());
    }
}

@java.lang.Override
public boolean add(@android.support.annotation.NonNull
com.gmail.collinsmith70.libgdx.key.MappedKey key) {
    int[] loadedAssignments = load(key);
    key.assign(loadedAssignments);
    return super.add(key);
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    subscribe();
}

@java.lang.Override
public android.content.Intent getParentActivityIntent() {
    android.content.Intent newIntent = null;
    newIntent = new android.content.Intent(this, getIntent().getClass());
    return newIntent;
}

public void setQueue(@android.support.annotation.NonNull
java.util.List<com.marverenic.music.instances.Song> queue, int index) {
    mQueue = queue;
    if (mShuffle) {
        shuffleQueue(index);
        setBackingQueue(0);
    }else {
        setBackingQueue(index);
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt("NumberOfSite", numberOfSite);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    statusView.setBattery(intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0), intent.getIntExtra(BatteryManager.EXTRA_STATUS, 0));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    dialogInterface.dismiss();
}

@java.lang.Override
public void hideProgressBar() {
    if ((mProgressBar) != null)
        mProgressBar.setVisibility(View.GONE);
    
}

public void fetchEventList(android.widget.RelativeLayout mainLayout, android.widget.FrameLayout progressLayout) {
    try {
        new com.groupr.util.GetUserEventsAsyncTask(mContext, java.lang.Long.parseLong(mUserId), mainLayout, progressLayout).execute();
    } catch (java.lang.NumberFormatException exception) {
    }
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((getSelectedItemCount()) == 0) {
        recentListActionModeUtil.startActionMode();
    }
    toggleSelection(position);
    recentListActionModeUtil.updateActionMode(getSelectedItemCount());
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.jxw679.mogul.activities.AddTaskActivity.class);
    intent.putExtra(com.example.jxw679.mogul.activities.ParentViewActivity.PARENT_OBJECT_EXTRA_TAG, currentUser);
    intent.putExtra(com.example.jxw679.mogul.activities.ParentViewActivity.CHILD_LIST_OBJECT_EXTRA_TAG, mChildObjects);
    startActivityForResult(intent, 123);
}

@java.lang.Override
public java.util.List<org.androidannotations.Option> getSupportedOptions() {
    return java.util.Arrays.asList(TraceHandler.OPTION_TRACE, SupposeThreadHandler.OPTION_THREAD_CONTROL, FilesCacheHelper.OPTION_CACHE_FILES, FilesCacheHelper.OPTION_DEBUG_CACHE, FilesCacheHelper.OPTION_CACHE_FILES_IN_PROCESS, Actions.OPTION_DEBUG_ACTIONS);
}

public static com.nicdsmith.test.gamenight.SQLiteHelper getInstance(android.content.Context context) {
    if ((com.nicdsmith.test.gamenight.SQLiteHelper.mInstance) == null) {
        com.nicdsmith.test.gamenight.SQLiteHelper.mInstance = new com.nicdsmith.test.gamenight.SQLiteHelper(context.getApplicationContext());
    }
    return com.nicdsmith.test.gamenight.SQLiteHelper.mInstance;
}

@java.lang.Override
public app.vleon.bitunion.ThreadsAdapter.ViewHolder getViewHolder(android.view.View view) {
    return new app.vleon.bitunion.ThreadsAdapter.ViewHolder(view, false);
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeString(key);
    dest.writeString(type);
}

private void setupPreferences() {
    final android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    setupTileProvidersPreferences(sharedPref);
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    nldr.spamoff.AsyncDataHandler.performInBackground(context, inst, false);
}

@java.lang.Override
public void changeCallDataUsage(long dataUsage) {
    if ((mHandler) == null) {
        return ;
    }
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_CHANGE_CALL_DATA_USAGE, dataUsage).sendToTarget();
}

@java.lang.Override
protected void onPause() {
    android.util.Log.i(TAG, "onPause - start");
    setResult(com.modelingbrain.home.detailModel.RESULT_OK);
    super.onPause();
    android.util.Log.i(TAG, "onPause - finish");
}

protected void clickButton(android.view.View view) {
    startActivity(intent);
}

public com.google.android.gms.ads.AdRequest getAdRequest() {
    return new com.google.android.gms.ads.AdRequest.Builder().build();
}

private void setTitle() {
    if ((currentStory) != null) {
        java.lang.String title = "#" + (currentStory.storyNum);
        ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(title);
    }
}

public static void getCommonlyLibrary() {
    java.lang.System.out.println("compile 'org.jsoup:jsoup:1.8.3'");
    java.lang.System.out.println("compile 'com.miguelcatalan:materialsearchview:1.4.0'");
    java.lang.System.out.println("compile 'com.jakewharton:butterknife:7.0.1'");
    java.lang.System.out.println("compile 'org.immutables:gson:2.1.15'");
    java.lang.System.out.println("compile 'de.greenrobot:eventbus:2.4.0'");
    java.lang.System.out.println("compile 'com.android.volley:volley:1.0.0'");
    java.lang.System.out.println("compile 'com.afollestad.material-dialogs:core:0.8.6.1'");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.akturk.plugin.LocationChecker checker = new com.akturk.plugin.LocationChecker(this);
    checker.start(mRawData);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dlg, int position) {
    if (position == 0) {
        createNewSetList();
    }else {
        addLyricsToSetList(items[position]);
        unCheckAllSelectedItems();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e(com.peets.socialplay.TreasureHuntRestActivity.TAG, "OnClick buttons[0]");
    buttons[0].setText(R.string.connecting);
    participantAccount = accountArray.get(0).getAccountId();
    inviteToPlay();
}

public android.app.Activity getCurrentActivity() {
    android.app.Activity activity = com.hitomi.aslibrary.ActivityManager.activityStack.get(((com.hitomi.aslibrary.ActivityManager.activityStack.size()) - 1));
    return activity;
}

private void clearUI() {
    mDataField.setText(R.string.no_data);
}

void updateHostController(com.mobilesolutionworks.android.app.ControllerHostCallback host) {
}

public void setProfilePicURI(android.net.Uri profilePicURI) {
    com.example.cmput401.classdiscuss.ParseDatabase.getInstance().setUsersImageToParse(this.name, profilePicURI.toString());
    this.profilePicURI = profilePicURI;
}

public java.lang.String getLength(android.widget.EditText length_input) {
    java.lang.String length = length_input.getText().toString();
    android.util.Log.i("LENGTH", length);
    return length;
}

@java.lang.Override
public void _requestBacklogAll(int first, int last, int limit, int additional) {
}

private void setClearOn() {
    setClear(false);
    setInputQueryLayout(R.id.activity_search_inputbar_btn_clear);
    btn_clear.setVisibility(View.VISIBLE);
}

private android.accounts.Account checkAccountNameExistsInDevice(java.lang.String account_name) {
    for (android.accounts.Account this_account : accounts_in_device) {
        if ((this_account.name) == account_name) {
            return this_account;
        }else {
            return null;
        }
    }
    return null;
}

@java.lang.Override
public void onClick(android.view.View v) {
    flagImageView.setRotation(((flagImageView.getRotation()) + 90));
}

public void initPointBullet(com.reisen.danmulib.factory.PointBulletFactory factory, int width, int height, android.graphics.Bitmap image) {
    this.mFactory = factory;
    this.width = width >> 1;
    this.height = height;
    this.image = image;
}

@java.lang.Override
public void onClick(android.view.View view) {
    holder.toggleFavorite();
}

@java.lang.Override
public void onClick(android.view.View v) {
    feedbackManager.giveLikeToFeedback(getItem(pos));
}

@java.lang.Override
public void onSuccess(com.auth0.android.result.UserProfile payload) {
}

public static org.gdg.frisbee.android.chapter.ChapterSelectDialog newInstance(@android.support.annotation.Nullable
org.gdg.frisbee.android.api.model.Chapter selectedChapter) {
    org.gdg.frisbee.android.chapter.ChapterSelectDialog fragment = new org.gdg.frisbee.android.chapter.ChapterSelectDialog();
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable(org.gdg.frisbee.android.chapter.ChapterSelectDialog.EXTRA_SELECTED_CHAPTER, selectedChapter);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void run() {
    android.util.Log.i(null, "Stream requested");
}

private void hideItem(android.view.Menu menu, int itemId) {
    if ((menu != null) && ((menu.findItem(itemId)) != null))
        menu.findItem(itemId).setVisible(false);
    
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mController.setControllerMode(VideoControllerView.PAUSE_MODE);
    mController.show();
    mAnnotationTimer.stop();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) > 1) {
        (mCurrentPage)--;
        showOrLoadPage();
    }
    dialog.dismiss();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    updateMenuItem = menu.findItem(R.id.updateMenuItem);
    remainingFormsToSyncMenuItem = menu.findItem(R.id.remainingFormsToSyncMenuItem);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent LocationView;
    LocationView = new android.content.Intent(this, com.hackathon.thesingularityproject.helpmycity.AddProblemLocation.class);
    startActivity(LocationView);
}

@java.lang.Override
public void onItemClick(int pos, com.application.material.takeacoffee.app.fragments.View v) {
    changeActivity();
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    mActiveSearch = false;
    mPage = 1;
    loadObservations();
}

@java.lang.Override
public void onAnimationStart(final android.animation.Animator animation) {
    if (!(isCancelled())) {
        imageView.setAlpha(0.0F);
        imageView.setImageDrawable(artwork);
    }
}

@java.lang.Override
public void onPINSetup(java.lang.String pin) {
    com.doodeec.lockscreen.LockScreenController.setPIN(pin);
    runnable.run();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSharedPrefsManager = cz.ejstn.gargantua.model.DefaultSharedPreferencesManager.getInstance();
}

public boolean handleActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((billingProcessor) == null) {
        return false;
    }
    return billingProcessor.handleActivityResult(requestCode, resultCode, data);
}

void back(android.support.v4.app.FragmentManager fragmentManager) {
    int count = fragmentManager.getBackStackEntryCount();
    if (count > 1) {
        handleBack(fragmentManager);
    }
}

public void onFinish() {
    if ((this) != null) {
        nextCard.setOnClickYes(this);
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(nextCard, null);
        ft.commitAllowingStateLoss();
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mCurrentPhotoLarge) != null) {
        outState.putParcelable(sk.momosi.fuelapp.activities.UpdateCarActivity.PHOTO, mCurrentPhotoLarge);
    }
}

@java.lang.Override
protected android.content.Intent onFillDeviceDetailIntent(android.content.Context context, li.klass.fhem.domain.core.FhemDevice device, android.content.Intent intent) {
    return intent.putExtra(BundleExtraKeys.FRAGMENT, FragmentType.FLOORPLAN).putExtra(BundleExtraKeys.DEVICE_NAME, device.getName());
}

public static com.example.booker.MyBook newInstance() {
    com.example.booker.MyBook myBook = new com.example.booker.MyBook();
    return myBook;
}

@java.lang.Override
public void onClick(android.view.View view) {
    onLoginClicked();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    attachLogoutMenuItem(menu);
    return true;
}

