public void onAddItem(android.view.View v) {
    com.codepath.simpletodoapp.activities.EditEntryDialogFragment newEntryFrag = com.codepath.simpletodoapp.activities.EditEntryDialogFragment.newInstance(null, null, "MEDIUM", NEW_WRITE);
    newEntryFrag.show(getSupportFragmentManager(), "fragment_edit_entries");
}

@java.lang.Override
public void onRefreshBegin(in.srain.cube.views.ptr.PtrFrameLayout frame) {
    getData();
    mPtrFrame.refreshComplete();
}

private void initView() {
    mMediaController = ((bf.cloud.BFMediaPlayerControllerVod) (findViewById(R.id.vod_media_controller_vod)));
    mVodPlayer = ((bf.cloud.android.playutils.VodPlayer) (mMediaController.getPlayer()));
    mVodPlayer.setDataSource(mUrls[mVideoIndex]);
}

@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    if (!(com.jasonbutwell.popularmovies.BackgroundTask.TMDBLoader.isLoaded)) {
        com.jasonbutwell.popularmovies.Ui.LoadingIndicator.show(mBinding, true);
        forceLoad();
    }
}

public com.pajato.android.gamechat.account.Account getGroupMember(@android.support.annotation.NonNull
final java.lang.String groupKey, @android.support.annotation.NonNull
final java.lang.String memberKey) {
    java.util.Map<java.lang.String, com.pajato.android.gamechat.account.Account> memberMap = groupMemberMap.get(groupKey);
    if (memberMap == null)
        return null;
    
    return memberMap.get(memberKey);
}

public android.database.Cursor getEntry(java.lang.String query) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.database.Cursor res = db.rawQuery(query, null);
    return res;
}

@java.lang.Override
public android.app.Fragment getItem(int position) {
    return com.ly.badiane.budgetmanager_finalandroidproject.vues.MainActivity.PlaceholderFragment.newInstance(position);
}

public boolean isAutoDisplay() {
    return false;
}

@java.lang.Override
public void onRecordingSuccessful(java.io.File file) {
    if (file != null)
        sendBinaryMessage(android.net.Uri.fromFile(file), AudioDialog.DEFAULT_MIME, false, org.kontalk.message.AudioComponent.class);
    
}

@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    android.content.Intent updateChanges = new android.content.Intent(com.kchen52.twona.SettingsActivity.SETTINGS_CHANGED);
    sendBroadcast(updateChanges);
}

@java.lang.Override
public android.view.View initView() {
    android.view.View root = android.view.View.inflate(mainActivity, R.layout.fragment_content_view, null);
    com.lidroid.xutils.ViewUtils.inject(this, root);
    return root;
}

public void onClick(android.content.DialogInterface dialog, int id) {
    setUpPlacement(currentTurn, true);
    confirmPlacementDialog.dismiss();
}

public void attachTo(android.support.v7.widget.RecyclerView recyclerView) {
    if (recyclerView != null) {
        this.recyclerView = recyclerView;
    }
}

@java.lang.Override
public void onStart() {
    android.util.Log.i(LOG_TAG, ((getId()) + ".onStart()"));
    super.onStart();
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    dialog.dismiss();
    onClose(false);
}

@java.lang.Override
public tsmcomp.question.common.MaterialCardSingleRadioWithTextAndIconViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new tsmcomp.question.common.MaterialCardSingleRadioWithTextAndIconViewHolder(android.view.LayoutInflater.from(getContext()).inflate(R.layout.card_material_single_radio_with_text_and_icon, parent, false));
}

public static android.support.v4.provider.DocumentFile getDirDocument(android.content.Context context, java.lang.String rootPath, java.lang.String... subDirs) {
    return ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(context, android.net.Uri.parse(rootPath), subDirs);
}

@java.lang.Override
public void onFailure(int statusCode, org.apache.http.Header[] headers, byte[] responseBody, java.lang.Throwable error) {
    if (responseBody != null) {
        android.util.Log.d("ERREUR", new java.lang.String(responseBody));
    }
}

@java.lang.Override
public void onCreate() {
    android.util.Log.e("check", "service has started");
    songPosn = 0;
    player = new android.media.MediaPlayer();
    initMusicPlayer();
    super.onCreate();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(getActivity(), edu.josephkorang.criminalintent.CrimeCameraActivity.class);
    startActivityForResult(i, edu.josephkorang.criminalintent.CrimeFragment.REQUEST_PHOTO);
}

@java.lang.Override
public void onClick(android.view.View v) {
    double value = parseDouble(resultString);
    if (value != 0) {
        resultString = df.format((-value));
        updateState();
    }
}

public static void startSelectyCityActivity(android.content.Context context) {
    android.content.Intent i = new android.content.Intent(context, kode.kinopoisk.savin.letmemovie.activity.FirstStartActivity.class);
    context.startActivity(i);
}

@org.robolectric.annotation.Implementation
public void send() throws android.app.PendingIntent.CanceledException {
    send(null, 0, null);
}

@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(0.5F, 0.5F, 0.5F, 1.0F);
    mRand = new java.util.Random();
    mBoard = new org.no_ip.chrisbregg.simon.GameBoard();
}

@java.lang.Override
public int compareTo(de.blau.android.util.IndexSearchResult arg0) {
    if ((arg0.count) > (count)) {
        return -1;
    }else
        if ((arg0.count) < (count)) {
            return +1;
        }
    
    return -1;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    initialize(new me.boxcubed.main.TopDown(false), config);
}

public void takePhoto(android.view.View view) {
    dispatchTakePictureIntent();
}

public com.google.firebase.storage.UploadTask saveUserImage(android.net.Uri file, java.lang.String name) {
    com.google.firebase.storage.StorageReference userProfileRef = mImages.child("images").child("users").child(name);
    return userProfileRef.putFile(file);
}

@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.example.c4q_ac35.justmygoogle.SportsFeed> sportsFeedsArrayList) {
}

@java.lang.Override
public me.iwf.photopicker.adapter.PhotoAdapter.PhotoViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    me.iwf.photopicker.adapter.PhotoAdapter.PhotoViewHolder viewHolder = PhotoPickUtils.holderGenerator.newGridViewHolder2(mContext);
    return viewHolder;
}

public static int getVersion(android.content.Context context, int defaultVersion) {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(io.gresse.hugo.anecdote.storage.SpStorage.SP_KEY, Context.MODE_PRIVATE);
    return sharedPreferences.getInt(io.gresse.hugo.anecdote.storage.SpStorage.SP_KEY_VERSION, defaultVersion);
}

public void onIRCEvent(int what, java.lang.Object o) {
}

public void onClick(android.content.DialogInterface dialog, int id) {
    claimListController.removeClaim(claimId);
    claimListController.deleteClaim(claimId);
    update();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_friends_list);
    butterknife.ButterKnife.bind(this);
    mImageFriends.setColorFilter(android.support.v4.content.ContextCompat.getColor(this, R.color.colorPrimary));
    setToolbarWithBackArrow();
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    float cVal = ((java.lang.Float) (animation.getAnimatedValue()));
    view.setScaleX(cVal);
    view.setScaleY(cVal);
}

@java.lang.Override
public void finish() {
    android.content.Intent sendIntent = new android.content.Intent();
    sendIntent.putExtra("event", event);
    setResult(fr.insapp.insapp.activities.RESULT_OK, sendIntent);
    super.finish();
}

@java.lang.Override
public void onClick(android.view.View view) {
    chooseExercise.show(getFragmentManager(), "choose");
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    mMenu = menu;
    return true;
}

public static <T> void insert(android.content.Context context, android.content.ContentProviderClient provider, T... dataModelObjects) throws android.os.RemoteException {
    za.co.cporm.model.CPSyncHelper.insert(context, true, provider, dataModelObjects);
}

@java.lang.Override
public void onPause() {
    android.content.Intent toService = new android.content.Intent(this, io.github.mthli.Ninja.Service.HolderService.class);
    io.github.mthli.Ninja.Unit.IntentUnit.setClear(false);
    stopService(toService);
    create = false;
    inputBox.clearFocus();
    super.onPause();
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    if ((mListener) != null) {
        mListener.stopDownLoadAnimation();
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (playPokemonGO.isChecked())
        setpokeGO = 1;
    else
        setpokeGO = 0;
    
}

private static com.dataart.android.devicehive.EquipmentData equipmentData(java.lang.String name, java.lang.String code, java.lang.String type) {
    return new com.dataart.android.devicehive.EquipmentData(name, code, type);
}

public static void getPermit(@android.support.annotation.NonNull
java.lang.String permitId, @android.support.annotation.Nullable
com.airmap.airmapsdk.networking.callbacks.AirMapCallback<java.util.List<com.airmap.airmapsdk.models.permits.AirMapAvailablePermit>> callback) {
    if (permitId != null) {
        com.airmap.airmapsdk.networking.services.AirMap.getPermits(permitId, null, callback);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent myIntent = new android.content.Intent(this, com.example.douglass_macbook.ss12_simon_says.ActivityInstruction.class);
    this.startActivityForResult(myIntent, 1);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    folderTitle = this.getArguments().getString(FRAGMENT_ARGS_FOLDER_TITLE);
    setUpToolbar();
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    removeItemFromDatabase(items.get(position));
    items.remove(position);
    itemsAdapter.notifyDataSetChanged();
    return true;
}

@java.lang.Override
public void onPause(boolean multitasking) {
    super.onPause(multitasking);
    com.plugin.gcm.PushPlugin.gForeground = false;
}

public void saveCheckpointAsIncomplete(java.lang.String tableId, java.lang.String rowId, java.lang.String callbackJSON, java.lang.String transId, java.lang.Boolean leaveTransactionOpen) {
    org.opendatakit.common.android.views.ExecutorRequest request = new org.opendatakit.common.android.views.ExecutorRequest(ExecutorRequestType.USER_TABLE_SAVE_CHECKPOINT_AS_INCOMPLETE, tableId, rowId, callbackJSON, transId, leaveTransactionOpen);
    queueRequest(request);
}

private int dpToPx(float dp) {
    final android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
    float px = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
    return java.lang.Math.round(px);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            this.finish();
            return true;
        case R.id.menu_share :
            onClickShare();
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
protected void onDestroy() {
    com.sendbird.android.SendBird.disconnect(new com.sendbird.android.SendBird.DisconnectHandler() {
        @java.lang.Override
        public void onDisconnected() {
        }
    });
    super.onDestroy();
}

@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
}

public void goToMain(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, project.equationinvasion.MainActivity.class);
    startActivity(intent);
    finish();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    storage = com.johnsimon.payback.storage.StorageManager.getStorage(this);
    contactLoader = com.johnsimon.payback.loader.ContactLoader.getLoader(this);
    dataLink = new com.johnsimon.payback.util.DataLinker().link(storage.subscription, contactLoader.contactsLoaded);
}

protected sumimakito.android.quickkv.database.QKVCallback cbkSuccess() {
    return this.isCallbackEnabled ? new sumimakito.android.quickkv.database.QKVCallback() : null;
}

public void registerAuthenticationListener(com.concavenp.artistrymuse.services.UserAuthenticationService.OnAuthenticationListener listener) {
    mAuthListener = listener;
}

@java.lang.Override
public android.view.View findViewById(@android.support.annotation.IdRes
int id) {
    android.view.View v = super.findViewById(id);
    if (v instanceof android.support.v7.widget.SwitchCompat) {
        return null;
    }
    return v;
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.example.android.newsapp.Story>> loader, java.util.List<com.example.android.newsapp.Story> data) {
    if ((mDataset.size()) == 0)
        mDataset.addAll(data);
    
    mAdapter.notifyDataSetChanged();
}

private void changePwdDone(android.os.Bundle data) {
    if (data.getBoolean("status")) {
        com.extenprise.mapp.medico.util.Utility.showMessage(this, R.string.msg_change_pwd);
    }
}

public void updateImage(android.graphics.Bitmap bitmap) {
    if ((mImageView) != null) {
        mImageView.setImageBitmap(bitmap);
    }
    mBitmap = bitmap;
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, world.myblooddy.RegisterActivity.class);
    startActivity(i);
}

@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    com.example.pyeonsangjin.ssmproject.MainActivity.longitude = loc.getLongitude();
    com.example.pyeonsangjin.ssmproject.MainActivity.latitude = loc.getLatitude();
}

@java.lang.Override
public void onClick(android.view.View v) {
    B1.setText(null);
    b1.setVisibility(View.VISIBLE);
    B1.setVisibility(View.GONE);
    (tag_num)--;
}

@java.lang.Override
public void onBtnCreateRouteClick(java.util.Map<java.lang.String, com.google.android.gms.maps.model.Marker> markerArrayMap) {
    getDirection(hu.banyai.robert.mapnotification.data.remote.LocationManager.getInstance().getLastLocation(), markerArrayMap);
    hu.banyai.robert.mapnotification.data.remote.LocationManager.getInstance().requestLocationUpdate(this);
}

public void addMessage(com.taylorstubbs.whodischat.models.Message message) {
    android.util.Log.d(com.taylorstubbs.whodischat.adapters.MessageAdapter.TAG, "adding message");
    mMessages.add(0, message);
    notifyDataSetChanged();
}

public void test_031() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "SIM 卡");
    excute(testcase.Object_ResIdInstance, testcase.Operation_ClickWait, "android:id/summary", "0");
    check(testcase.Object_Text, testcase.Operation_checkExist, "SIM 卡插槽 1");
}

@java.lang.Override
public boolean onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id, com.mikepenz.materialdrawer.model.interfaces.IDrawerItem drawerItem) {
    handleDrawer(position);
    return false;
}

private android.view.ViewPropertyAnimator animateOffScreenRight(int duration) {
    return card.animate().setDuration(SwipeDeck.ANIMATION_DURATION).x(((parentWidth) * 2)).y(0).rotation(30);
}

public static void playNext(android.content.Context context, teamfmg.hangman.MusicPlayer.MusicType type) {
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    drawerToggle.onConfigurationChanged(newConfig);
}

protected void onHandleIntent() {
    android.content.Intent in = new android.content.Intent(com.ford.mobileweather.smartdevicelink.features.WeatherAlertService.ACTION);
    in.putExtra("resultCode", Activity.RESULT_OK);
    in.putExtra("Alert", speakString);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(in);
}

@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    android.widget.Toast.makeText(mContext, "Media player entered Error state ", Toast.LENGTH_SHORT).show();
    mp.reset();
    return false;
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    safeSetTitle(getString(R.string.utah_fishing_report));
    load();
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if (!(newConfig.locale.equals(mLastLocale))) {
        updateQsTile();
    }
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
}

private void setFlag() {
    android.widget.ImageView flag = ((android.widget.ImageView) (findViewById(R.id.flag)));
    if (language.equals("nl")) {
        flag.setImageResource(R.drawable.dutchflag);
    }else {
        flag.setImageResource(R.drawable.englishflag);
    }
}

public java.lang.String getSpinnerValue() {
    return mySpinner.getSelectedItem().toString();
}

@java.lang.Override
public void onBackStackChanged() {
    if (mSelectedFragment.equals(com.nanodegree.gaby.bakerylovers.activities.ReviewOrderActivity.TAG_FRAGMENT_CONFIRM_ORDER)) {
        mSelectedFragment = com.nanodegree.gaby.bakerylovers.activities.ReviewOrderActivity.TAG_FRAGMENT_REVIEW_ORDER;
    }else {
        mSelectedFragment = com.nanodegree.gaby.bakerylovers.activities.ReviewOrderActivity.TAG_FRAGMENT_CONFIRM_ORDER;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fragmentManager = getSupportFragmentManager();
    showFragment(MainFragment.TAG);
    initMenu();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    try {
        initGoLib();
        go.goInterface.GoInterface.Start();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void run() {
    setupMenuItems(false);
    ((android.widget.BaseAdapter) (mDrawerList.getAdapter())).notifyDataSetChanged();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    java.lang.System.out.println("started");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_summary_screen);
    grabData();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    GetInsuranceId();
    com.profilohn.Activities.InputActivity.wage.clearFocus();
    com.profilohn.Activities.InputActivity.taxFree.clearFocus();
}

public void removeCookingComments() {
    java.lang.String key = "cookingComments";
    android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.remove(key);
    editor.commit();
}

@java.lang.Override
public int compare(android.hardware.Camera.Size o1, android.hardware.Camera.Size o2) {
    return ((o2.width) * (o2.height)) - ((o1.width) * (o1.height));
}

@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    drawView.removeBackgroundImage();
    settings.backgroundImagePhone = bitmap;
    drawView.invalidate();
    btnRemoveImage.setVisibility(View.VISIBLE);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    injectDependencies();
}

@java.lang.Override
public void showAcceptButton(java.util.List<de.fau.cs.mad.wanthavers.common.Haver> havers) {
    if (isHaver(havers)) {
        android.view.MenuItem acceptDesireMitem = mOptionsMenu.findItem(R.id.menu_accept_desire);
        if (acceptDesireMitem != null) {
            acceptDesireMitem.setVisible(false);
        }
    }
}

@java.lang.Override
public void onMapTimedDistance(java.lang.String time) {
    android.widget.TextView timeView;
    if ((getView()) != null) {
        timeView = ((android.widget.TextView) (getView().findViewById(R.id.timeToTargetTextView)));
        timeView.setText(time);
    }
}

public static android.content.Intent newIntent(android.content.Context packageContext, java.util.UUID jobId) {
    android.util.Log.d(com.osu.cse5236.oddjobs.EditJobActivity.TAG, "newIntent() called");
    android.content.Intent intent = new android.content.Intent(packageContext, com.osu.cse5236.oddjobs.NewJobActivity.class);
    return intent;
}

@java.lang.Override
public void onPause() {
    super.onPause();
}

@java.lang.Override
public void openPedirInfo(itesm.mx.carpoolingtec.model.firebase.User user) {
    android.content.Intent intent = new android.content.Intent(this, itesm.mx.carpoolingtec.userinfo.PedirInfoActivity.class);
    intent.putExtra("id", 1);
    intent.putExtra("user", user);
    startActivity(intent);
}

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.util.Log.d("flow1", ("response: " + result));
}

public static void d(java.lang.String msg) {
    if ((com.vinci.imageloader.core.util.MLog.DEBUG) || (android.text.TextUtils.isEmpty(msg))) {
        return ;
    }
    android.util.Log.d(com.vinci.imageloader.core.util.MLog.TAG, msg);
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "power on success");
    _sbPwm.setProgress(100);
    done();
}

@java.lang.Override
public void onResume() {
    super.onResume();
    mRefreshMarkers = true;
    mUpdateRefreshHandler = new android.os.Handler();
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.freddykilo.smartdoor.AutoButton.TAG, "AutoButton.onDestroy()");
    super.onDestroy();
}

private android.net.Uri insertWriterValues(android.content.ContentValues writerValues) {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "insertWriterValues");
    android.net.Uri writer = RadioTheaterContract.WritersEntry.buildWritersUri();
    return context.getContentResolver().insert(writer, writerValues);
}

@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        gs.saveProfilePicToParse(prepareProfilePicForSaving());
    }else {
    }
}

