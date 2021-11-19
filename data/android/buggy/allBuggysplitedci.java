private java.util.List<com.google.android.gms.awareness.state.BeaconState.TypeFilter> setupAttachements() {
    java.util.List<com.google.android.gms.awareness.state.BeaconState.TypeFilter> BEACON_TYPE_FILTERS = java.util.Arrays.asList(BeaconState.TypeFilter.with(getString(R.string.Namespace), getString(R.string.Type)));
    return BEACON_TYPE_FILTERS;
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.widget.Toast.makeText(context, "CREATED SQLITE FROM PHP", Toast.LENGTH_SHORT).show();
    pd.dismiss();
}

private android.content.ContentValues createContentValues(io.dojogeek.adminibot.models.TypePaymentMethodModel paymentMethod) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_NAME, paymentMethod.name);
    contentValues.put(TypesPaymentMethodsContract.TypePaymentMethod.COLUMN_DESCRIPTION, paymentMethod.description);
    return contentValues;
}

static void setRecordingBufferLengthMillis(int recordingBufferLengthMillis) {
    ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer.mBeginningOfBufferPosition.setSessionStartPointerMillis(recordingBufferLengthMillis);
}

@java.lang.Override
public void addFragment(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    this.fragment = fragment;
    getSupportFragmentManager().beginTransaction().add(R.id.main_content, fragment).commit();
    getSupportFragmentManager().executePendingTransactions();
}

void EnableBluetoothModule() {
    com.futsal.manager.LogModule.LogManager.PrintLog("EmbeddedSystemFinderProcesserVer2", "EnableBluetoothModule", "Try enable ble", com.futsal.manager.DefineManager.LOG_LEVEL_DEBUG);
    android.content.Intent enableBluetoothModuleIntent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
    enableBluetoothModuleIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    embeddedSystemFinderVer2.startActivityForResult(enableBluetoothModuleIntent, com.futsal.manager.DefineManager.ENABLE_BLUETOOTH_MODULE_USER_ACCESS_ACCEPT);
}

public void setToggleDrawables(android.graphics.drawable.Drawable[] drawables) {
    mToggleDrawables = drawables;
    setState(mCurrentState);
}

@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        broadcastUpdate(com.wm.bloodpro_4_0.BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
    }else {
        java.lang.System.out.println(("onServicesDiscovered received: " + status));
    }
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
    showProgressDialog();
    deleteUser();
    android.content.Intent resultIntent = new android.content.Intent();
    setResult(com.scientists.happy.botanist.ui.RESULT_OK, resultIntent);
    hideProgressDialog();
    finish();
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String Response = text.getText().toString();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.ofcampus.model.SearchData mSearchData = items.get(java.lang.Integer.parseInt(v.getTag().toString()));
    if (mSearchData != null) {
        gotToScreen(mSearchData);
    }
}

public void pause() {
    mediaPlayer.pause();
    state = edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.PAUSED;
    android.util.Log.e("Media Player Service", ("State: " + (getState())));
}

@java.lang.Override
public void onBackPressed() {
    ((com.themealz.themealz.TheMealzApplication) (((android.support.v7.app.AppCompatActivity) (mContext)).getApplication())).removeFromMealOptionsMap(parentID);
    super.onBackPressed();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    name.gudong.translate.util.Utils.shareText(getBaseContext(), exportText);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    ru.velkonost.lume.activity.BoardCardActivity.LeaveCard leaveCard = new ru.velkonost.lume.activity.BoardCardActivity.LeaveCard();
    leaveCard.execute();
    refreshActivity();
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    this.holder = null;
    if (((mMediaPlayer) != null) && (mMediaPlayer.isPlaying())) {
        releaseMediaPlayer();
        videoPauseFlag = true;
    }
}

public void stopPlaying() {
    if (com.codingspezis.android.metalonly.player.BuildConfig.DEBUG)
        com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.LOGGER.debug("stopPlaying()");
    
    metadataListener.stop();
    timeoutListener.stop();
    com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.mediaPlayer.stop();
    com.codingspezis.android.metalonly.player.stream.StreamPlayerInternal.mediaPlayer.reset();
    releaseLocks();
}

@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.e("MyBindService", "onUnBind");
    mediaPlayer.stop();
    mediaPlayer.release();
    return super.onUnbind(intent);
}

public android.graphics.Rect getSrcRect() {
    return new android.graphics.Rect(0, 0, bm.getWidth(), bm.getHeight());
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        showDialog(com.flipkart.todo.AddFragment.DATE_DIALOG_ID).show();
    }
}

private void setupView() {
    setContentView(R.layout.activity_login);
    setOnClickListeners(R.id.loginCreateAccountBtn, R.id.loginForgotPaswordBtn, R.id.loginSignInBtn);
    remember = ((android.widget.CheckBox) (findViewById(R.id.loginRemember)));
}

@java.lang.SuppressWarnings(value = "deprecation")
private void syncCookies() {
    if ((Build.VERSION.SDK_INT) < 21) {
        android.webkit.CookieSyncManager.createInstance(getApplicationContext());
        android.webkit.CookieSyncManager.getInstance().sync();
    }else {
        android.webkit.CookieManager.getInstance().flush();
    }
}

@butterknife.OnClick(value = R.id.baseDialog)
public void baseDialog(android.view.View v) {
    com.bryan.lib.dialog.FastDialog.ShowNormalDialog(context, "提示", "是否确定退出程序?", true, null, new com.flyco.dialog.listener.OnBtnRightClickL() {
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
    mProfiles = new android.util.SparseArray<com.android.settings.accounts.AccountSettings.ProfileData>(2);
    setHasOptionsMenu(true);
}

public void oCEntryMode(android.view.View v) {
    mode = 0;
    setmode();
    android.util.Log.i("Finished", tech.travis.poolpos.MainActivity.getMethodName());
}

protected void onDestroy() {
    super.onDestroy();
    for (android.support.v4.app.Fragment f : fragments) {
        if (org.kei.android.phone.netcap.OutputFragment.class.isInstance(f))
            ((org.kei.android.phone.netcap.OutputFragment) (f)).delete(false);
        
    }
}

@java.lang.Override
public void onScanDone(boolean isSuccess) {
    com.fezrestia.android.viewfinderanywhere.control.OverlayViewFinderController.getInstance().getCurrentState().onScanDone(isSuccess);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.fragment_singing_songlist, container, false);
    inflateList(inflater, root, savedInstanceState);
    return root;
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> table : tables.entrySet()) {
        db.execSQL(table.getValue());
    }
    database = getWritableDatabase();
}

protected void onHandleWrappedAdapterItemRangeChanged(int positionStart, int itemCount, java.lang.Object payload) {
    com.h6ah4i.android.widget.advrecyclerview.utils.BaseWrapperAdapter.notifyItemRangeChanged(positionStart, itemCount);
}

public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if ((mParentDelegate) != null) {
        bundle = mParentDelegate.mChildKeyTagsBundle;
    }
    onSaveInstanceState(bundle);
    mParentDelegate.mBundle.putAll(bundle);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dialog.dismiss();
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.xsdlr.rnjmessage.im.activity.DemoActivity.class);
    startActivity(intent);
    this.finish();
}

public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    android.util.Log.d("drawer", "onDrawerOpened: ");
    getSupportActionBar().setTitle(mDrawerTitle);
    invalidateOptionsMenu();
}

@java.lang.Override
public boolean equals(java.lang.Object otherFolder) {
    return android.text.TextUtils.equals(((com.newsblur.domain.Folder) (otherFolder)).name, name);
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    audioManager.abandonAudioFocus(afChangeListener);
    mediaPlayer.release();
    mediaPlayer = null;
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return false;
}

@java.lang.Override
public void onSuccess(final com.github.kulebin.myfoursquareapp.model.Venue venue) {
    mPresenter.setProgress(false);
    mPresenter.presentVenueToShowData(new com.github.kulebin.myfoursquareapp.view.VenueDisplayData(venue));
    android.util.Log.d("ShowDetailVenueUseCase", venue.getName());
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.app.Dialog addPaymentDialog = new com.szymkowski.personaltrainercompanion.payments.AddPaymentDialog(this, this);
    addPaymentDialog.show();
    updateLastPayment();
    updateNumberOfTrainingsRemaining();
    floatingActionsMenu.collapse();
}

@java.lang.Override
public com.github.abdurahmanovart.notesrealm.adapter.NoteAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View row = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, true);
    return new com.github.abdurahmanovart.notesrealm.adapter.NoteAdapter.ViewHolder(row);
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.sharekeg.streetpal.userinfoforlogin.UserInfoForLogin> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, R.string.smthing_went_wrong, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void on(java.lang.Throwable throwable) {
    if (throwable == null) {
        android.util.Log.e(fr.esir.services.Context_service.TAG, throwable.toString());
    }
}

@java.lang.Override
public boolean add(@android.support.annotation.NonNull
com.gmail.collinsmith70.libgdx.key.MappedKey key) {
    int[] loadedAssignments = load(key);
    if ((loadedAssignments.length) == 0) {
        return super.add(key);
    }
    key.assign(loadedAssignments);
    return true;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.util.Log.d(edu.umbc.cs.iot.clients.android.UMBCIoTApplication.getDebugTag(), "Connected to API client");
    subscribe();
}

@java.lang.Override
public android.content.Intent getParentActivityIntent() {
    android.content.Intent newIntent = null;
    newIntent = new android.content.Intent(this, getIntent().getClass());
    newIntent.putExtra(Constants.IS_INIT, isInit);
    return newIntent;
}

public void setQueue(@android.support.annotation.NonNull
java.util.List<com.marverenic.music.instances.Song> queue, int index) {
    mQueue = queue;
    if (mShuffle) {
        shuffleQueue();
    }
    setBackingQueue(index);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    android.util.Log.v("tabl", ("Save " + (numberOfSite)));
    outState.putInt("NumberOfSite", numberOfSite);
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    statusView.setBattery(intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0), intent.getIntExtra(BatteryManager.EXTRA_SCALE, 0), intent.getIntExtra(BatteryManager.EXTRA_STATUS, (-1)));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    dialogInterface.dismiss();
    finish();
}

@java.lang.Override
public void hideProgressBar() {
    android.util.Log.d(com.example.moyiliu.imagegallerymvp.screen.base.recycler.BaseRecyclerActivity.TAG, "hideProgressBar: ");
    if ((mProgressBar) != null)
        mProgressBar.setVisibility(View.GONE);
    
}

private void fetchEventList(android.widget.RelativeLayout mainLayout, android.widget.FrameLayout progressLayout) {
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
    recentListActionModeUtil.updateActionMode(getItemCount());
    return true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.jxw679.mogul.activities.AddTaskActivity.class);
    intent.putExtra(com.example.jxw679.mogul.activities.ParentViewActivity.PARENT_OBJECT_EXTRA_TAG, mChildObjects);
    intent.putExtra(com.example.jxw679.mogul.activities.ParentViewActivity.CHILD_LIST_OBJECT_EXTRA_TAG, currentUser);
    startActivityForResult(intent, 123);
}

@java.lang.Override
public java.util.List<org.androidannotations.Option> getSupportedOptions() {
    return java.util.Arrays.asList(TraceHandler.OPTION_TRACE, SupposeThreadHandler.OPTION_THREAD_CONTROL, FilesCacheHelper.OPTION_CACHE_FILES, FilesCacheHelper.OPTION_CACHE_FILES_COMPILER_WAIT, FilesCacheHelper.OPTION_DEBUG_CACHE, FilesCacheHelper.OPTION_CACHE_FILES_IN_PROCESS, Actions.OPTION_DEBUG_ACTIONS);
}

public static com.nicdsmith.test.gamenight.SQLiteHelper getInstance(android.content.Context ctx) {
    if ((com.nicdsmith.test.gamenight.SQLiteHelper.mInstance) == null) {
        com.nicdsmith.test.gamenight.SQLiteHelper.mInstance = new com.nicdsmith.test.gamenight.SQLiteHelper(ctx.getApplicationContext());
    }
    return com.nicdsmith.test.gamenight.SQLiteHelper.mInstance;
}

@java.lang.Override
public app.vleon.bitunion.ThreadsAdapter.ViewHolder getViewHolder(android.view.View view) {
    return new app.vleon.bitunion.ThreadsAdapter.ViewHolder(view);
}

@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeString(key);
}

private void setupPreferences() {
    final android.content.Context context = getContext();
    final android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    setupTileProvidersPreferences(sharedPref);
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    nldr.spamoff.AsyncDataHandler.performInBackground(context, inst, true);
}

@java.lang.Override
public void changeCallDataUsage(long dataUsage) {
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_CHANGE_CALL_DATA_USAGE, dataUsage).sendToTarget();
}

@java.lang.Override
protected void onPause() {
    android.util.Log.i(TAG, "onPause - start");
    savingModelInDb();
    setResult(com.modelingbrain.home.detailModel.RESULT_OK);
    super.onPause();
    android.util.Log.i(TAG, "onPause - finish");
}

protected void clickButton() {
    intent = new android.content.Intent(getApplicationContext(), aboli.musicbee.easyGame.class);
    startActivity(intent);
}

public com.google.android.gms.ads.AdRequest getAdRequest() {
    return new com.google.android.gms.ads.AdRequest.Builder().addTestDevice(com.carlospinan.lolguide.helpers.Helper.ADS_DEVICE_TEST).build();
}

private void setTitle() {
    java.lang.String title = null;
    if ((currentStory) != null) {
        title = "#" + (currentStory.storyNum);
    }
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(title);
}

public void getCommonlyLibrary() {
    java.lang.System.out.println("enter here?");
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
    checker.setAdapt(true);
    checker.start(mRawData);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dlg, int position) {
    if (position == 0) {
        createNewSetList();
        unCheckAllSelectedItems();
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
    disableButtons();
    inviteToPlay();
}

public android.app.Activity getCurrentActivity() {
    android.app.Activity activity = com.hitomi.aslibrary.ActivityManager.activityStack.lastElement();
    return activity;
}

private void clearUI() {
    mGattServicesList.setAdapter(((android.widget.SimpleExpandableListAdapter) (null)));
    mDataField.setText(R.string.no_data);
}

void updateHostController(com.mobilesolutionworks.android.app.ControllerHostCallback host) {
    mHost = host;
}

public void setProfilePicURI(android.net.Uri profilePicURI) {
    com.example.cmput401.classdiscuss.ParseDatabase.getInstance().setUsersImageToParse(this.name, profilePicURI.toString());
    com.example.cmput401.classdiscuss.ParseDatabase.getInstance().setDataLocally();
    this.profilePicURI = profilePicURI;
}

public java.lang.String getLength(android.widget.EditText length_input) {
    java.lang.String length = length_input.getText().toString();
    android.widget.Toast.makeText(this, length, Toast.LENGTH_LONG).show();
    android.util.Log.i("LENGTH", length);
    return length;
}

@java.lang.Override
public void _requestBacklogAll(int first, int last, int limit, int additional) {
    android.util.Log.d("libquassel", "request backlog for all");
}

private void setClearOn() {
    setClear(false);
    if (android.speech.SpeechRecognizer.isRecognitionAvailable(getApplicationContext())) {
        btn_mic.setVisibility(View.GONE);
    }
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
}

@java.lang.Override
public void onClick(android.view.View v) {
    flagImageView.startAnimation(clkRotate);
    flagImageView.setRotation(((flagImageView.getRotation()) + 90));
}

public void initPointBullet(com.reisen.danmulib.factory.PointBulletFactory factory, int width, int height, android.graphics.Bitmap image) {
    this.mFactory = factory;
    this.width = width;
    this.height = height;
    this.image = image;
}

@java.lang.Override
public void onClick(android.view.View view) {
    holder.toggleFavorite(view);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("event", "click");
    feedbackManager.giveLikeToFeedback(getItem(pos));
}

@java.lang.Override
public void onSuccess(com.auth0.android.result.UserProfile payload) {
    java.lang.String account_type = payload.getUserMetadata().get("account_type").toString();
    java.lang.System.out.println(account_type);
}

public static org.gdg.frisbee.android.chapter.ChapterSelectDialog newInstance(@android.support.annotation.Nullable
org.gdg.frisbee.android.api.model.Chapter selectedChapter) {
    org.gdg.frisbee.android.chapter.ChapterSelectDialog fragment = new org.gdg.frisbee.android.chapter.ChapterSelectDialog();
    android.os.Bundle args = new android.os.Bundle(2);
    args.putParcelable(org.gdg.frisbee.android.chapter.ChapterSelectDialog.EXTRA_SELECTED_CHAPTER, selectedChapter);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void run() {
    mMeter.meter_settings.target_meter_state = mMeter.METER_RUNNING;
    mMeter.sendMeterSettings(new com.mooshim.mooshimeter.common.Block() {
        @java.lang.Override
        public void run() {
            android.util.Log.i(null, "Mode set");
        }
    });
    android.util.Log.i(null, "Stream requested");
}

private void hideItem(android.view.Menu menu, int itemId) {
    if ((menu.findItem(itemId)) != null)
        menu.findItem(itemId).setVisible(false);
    
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mController.setControllerMode(VideoControllerView.PAUSE_MODE);
    mAnnotationTimer.stop();
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) > 1) {
        sbGotoPage.setProgress(((mCurrentPage) - 2));
    }
    mCurrentPage = mGoToPage;
    showOrLoadPage();
    dialog.dismiss();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    updateMenuItem = menu.findItem(R.id.updateMenuItem);
    remainingFormsToSyncMenuItem = menu.findItem(R.id.remainingFormsToSyncMenuItem);
    updateSyncIndicator();
    updateRemainingFormsToSyncCount();
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (button3)) {
        android.content.Intent LocationView;
        LocationView = new android.content.Intent(this, com.hackathon.thesingularityproject.helpmycity.AddProblemLocation.class);
        startActivity(LocationView);
    }
}

@java.lang.Override
public void onItemClick(int pos, com.application.material.takeacoffee.app.fragments.View v) {
    android.util.Log.e("TAG", "DOING job");
    changeActivity();
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    mActiveSearch = false;
    mPage = 0;
    loadObservations();
}

@java.lang.Override
public void onAnimationStart(final android.animation.Animator animation) {
    if (!(isCancelled())) {
        imageView.setAlpha(0.0F);
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(artwork);
    }
}

@java.lang.Override
public void onPINSetup(java.lang.String pin) {
    android.util.Log.w("PIN", pin);
    com.doodeec.lockscreen.LockScreenController.setPIN(pin);
    runnable.run();
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSharedPrefsManager = cz.ejstn.gargantua.model.DefaultSharedPreferencesManager.getInstance(getContext());
}

public boolean handleActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((billingProcessor) != null) {
        return false;
    }
    return billingProcessor.handleActivityResult(requestCode, resultCode, data);
}

void back(android.support.v4.app.FragmentManager fragmentManager, boolean immediate) {
    int count = fragmentManager.getBackStackEntryCount();
    if (count > 1) {
        handleBack(fragmentManager, immediate);
    }
}

public void onFinish() {
    nextCard.setOnClickYes(this);
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.add(nextCard, null);
    ft.commitAllowingStateLoss();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((mCurrentPhotoLarge) != null) {
        outState.putParcelable(sk.momosi.fuelapp.activities.UpdateCarActivity.PHOTO, mCurrentPhotoLarge);
    }
}

@java.lang.Override
protected android.content.Intent onFillDeviceDetailIntent(android.content.Context context, li.klass.fhem.domain.core.FhemDevice device, android.content.Intent intent) {
    intent.putExtra(BundleExtraKeys.FRAGMENT, FragmentType.FLOORPLAN);
    intent.putExtra(BundleExtraKeys.DEVICE_NAME, device.getName());
    return intent;
}

public static com.example.booker.MyBook newInstance(int page) {
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.example.booker.MyBook.ARG_PAGE, page);
    com.example.booker.MyBook myBook = new com.example.booker.MyBook();
    myBook.setArguments(args);
    return myBook;
}

@java.lang.Override
public void onClick(android.view.View view) {
    onLoginClicked(view);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    attachLogoutMenuItem(menu, R.string.logout);
    return true;
}

