@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d(com.discflux.android.spotifystreamer.PlayFragment.LOG_TAG, "Activity Resumed");
    getActivity().bindService(mPlaybackService, mConnection, Context.BIND_AUTO_CREATE);
}

@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.widget.ArrayAdapter adapterAutoComplete = new android.widget.ArrayAdapter(context, android.R.layout.simple_list_item_1, autoCompleteNames);
    fragment.autoCompleteStringFillerAsyncTaskOnPostExecute(adapterAutoComplete, cities);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayout());
    initializeNameableList();
    com.idgi.event.ApplicationBus.register(this);
    super.initializeWithTitle(getTitleName());
}

@java.lang.Override
public RecyclerView.ViewHolder onCreateRowHeaderViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layout = android.view.LayoutInflater.from(m_jContext).inflate(R.layout.table_view_row_header_layout, parent, false);
    com.evrencoskun.tableviewsample.tableview.TableViewAdapter.RowHeaderViewHolder rowHeaderViewHolder = new com.evrencoskun.tableviewsample.tableview.TableViewAdapter.RowHeaderViewHolder(layout);
    return rowHeaderViewHolder;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d("hell", "Alarm receiver works perfectly");
    android.content.Intent in = new android.content.Intent(context, com.delta.attendancemanager.Userhome.class);
    in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(in);
}

@java.lang.Override
public void onShow(android.content.DialogInterface arg0) {
    alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.BLUE);
    alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(Color.BLUE);
}

@java.lang.Override
public void onServiceResolved(android.net.nsd.NsdServiceInfo serviceInfo) {
    android.util.Log.e(moe.retro.unijoysticle.BaseActivity.TAG, ("Resolve Succeeded. " + serviceInfo));
    mServerInetAddress = serviceInfo.getHost();
    mFinishedResolve = true;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    Wearable.DataApi.addListener(mGoogleApiClient, this);
    if (android.util.Log.isLoggable(LOG_TAG, Log.DEBUG)) {
        android.util.Log.d(LOG_TAG, "onConnected");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), superheroesintechnology.gl3am.Activities.LoadSMSActivity.class);
    startActivityForResult(intent, 2);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    pes.twochange.domain.themes.AdTheme.getInstance().remove(username, wantedProducts.get(position).getId());
    loadProductList();
}

@java.lang.Override
protected void onActivityResult(int request, int response, android.content.Intent data) {
    super.onActivityResult(request, response, data);
    mHelper.onActivityResult(request, response, data);
}

public void endSession(android.view.View view) {
    mMetricsManager.printMetrics();
    this.finish();
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putBoolean("noBt", ((btManager) == null));
    finishActivity(tw.edu.ncku.letsdance.MainActivity.REQUEST_ENABLE_BT);
}

private boolean hasPlay() {
    boolean res = false;
    try {
        res = (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context)) != (com.google.android.gms.common.ConnectionResult.SUCCESS);
    } catch (java.lang.Exception e) {
    }
    return res;
}

@java.lang.Override
public void callback(java.util.ArrayList<cl.smartcities.isci.transportinspector.backend.Event> response) {
    if (!(getStrategyContext().isCurrentStrategyInstance(this))) {
        android.util.Log.d(cl.smartcities.isci.transportinspector.map.strategies.TAG, "It is not the same strategy -> cancel information update for bus");
        return ;
    }
    updateElementById(response, null, getBusId());
}

@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    position = savedInstanceState.getInt("Position");
    myVideoView.seekTo(position);
}

public void onLongpress(final com.google.android.maps.MapView view, final com.google.android.maps.GeoPoint longpressLocation) {
    getSearchLayoutHeight();
    activity.geoPoint = longpressLocation;
    activity.executeGeocodingTask();
}

@java.lang.Override
public void onProviderDisabled(java.lang.String s) {
    android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    startActivity(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_normal_key_board);
    valueList = virtualKeyboardView.getValueList();
    initAnim();
    initView();
}

@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    java.lang.Long orderValue = ((java.lang.Long) (dataSnapshot.getValue()));
    android.util.Log.e("Order update:", ("" + orderValue));
    orderRef.setValue((orderValue - 1));
}

public void init() {
    if ((!(isInit)) && (com.rayboot.scantool.cv.org.opencv.android.OpenCVLoader.initDebug())) {
        mLoaderCallback.onManagerConnected(org.opencv.android.LoaderCallbackInterface.SUCCESS);
        isInit = true;
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            getFragmentManager().popBackStack();
            break;
        case R.id.action_settings :
            break;
    }
    return true;
}

public static boolean removeBond(java.lang.Class btClass, android.bluetooth.BluetoothDevice btDevice) throws java.lang.Exception {
    java.lang.reflect.Method removeBondMethod = btClass.getMethod("removeBond");
    java.lang.Boolean returnValue = ((java.lang.Boolean) (removeBondMethod.invoke(btDevice)));
    return returnValue.booleanValue();
}

@java.lang.Override
public void onOpen(android.database.sqlite.SQLiteDatabase db) {
    super.onOpen(db);
    if (!(db.isReadOnly())) {
        db.setForeignKeyConstraintsEnabled(true);
    }
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    reloadState(ch.grze.frogment.activity.StateAwareFrogmentActivity.getIntent(), savedInstanceState);
    super.onCreate(savedInstanceState);
}

public void UpdateEmail(java.lang.String email) {
    ((android.widget.TextView) (header.findViewById(R.id.email))).setText(email);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    android.util.Log.i(com.nineinchmales.longcircuit.database.DBHelper.LOG_TAG, "Creating tables");
    createTables(db);
    com.nineinchmales.longcircuit.SampleData.load();
}

@java.lang.Override
public void onSelect(java.lang.String text) {
    android.widget.Toast.makeText(this, ("Level " + text), Toast.LENGTH_SHORT).show();
    int level = java.lang.Integer.parseInt(text);
    com.example.zieng.gl3dosmos.Level.setLevel(level);
}

public java.lang.String getIp() {
    synchronized(mSocketLock) {
        if ((android.text.TextUtils.isEmpty(mIpAddress)) && ((mSocket) != null)) {
            mIpAddress = mSocket.getInetAddress().getHostAddress();
        }
    }
    return mIpAddress;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.TextView tv1 = ((android.widget.TextView) (view.findViewById(R.id.textView1)));
    tv1.setText("Hello");
    ((com.example.spff.fc.MainActivity) (getActivity())).switchFragment(2);
}

private void setFragmentOnFragmentContainer(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
    trans.remove(getSupportFragmentManager().findFragmentById(R.id.teams_layout_fragment_container));
    trans.replace(R.id.teams_layout_fragment_container, fragment);
    trans.commit();
}

public void stopPlaying(android.view.View v) {
    mediaPlayer.release();
    mediaPlayer = null;
}

@java.lang.Override
public void onMovLibFragmentInteraction(java.lang.String id) {
    android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "Thanks for clicking the move ...", Toast.LENGTH_SHORT);
    toast.show();
}

@java.lang.Override
public void onChangeMonth(int month, int year) {
    java.lang.String text = (("month: " + month) + " year: ") + year;
    android.widget.Toast.makeText(getActivity().getApplicationContext(), "onChangeMonth", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    com.prolificinteractive.materialcalendarview.CalendarUtils.logd("CPV.onDraw", getFirstViewDay());
    canvas.drawColor(Color.YELLOW);
}

private void setTime(long time) {
    android.widget.TextView post_title = ((android.widget.TextView) (mView.findViewById(R.id.post_time)));
    post_title.setText(convertTime(time));
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
@java.lang.Override
public boolean onPreferenceClick(android.support.v7.preference.Preference preference) {
    showDateDialog(0);
    return false;
}

@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    net.micode.fileexplorer.FileListItem.mFileViewInteractionHub.clearSelection();
    ((net.micode.fileexplorer.FileExplorerTabActivity) (net.micode.fileexplorer.FileListItem.mContext)).setActionMode(null);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    if (ua.itstep.android11.moneyflow.utils.Prefs.DEBUG)
        android.util.Log.d(Prefs.LOG_TAG, "ExpensesFragment onResume ");
    
    getActivity().getContentResolver().registerContentObserver(Prefs.URI_EXPENSES, false, observerExpenses);
}

@java.lang.Override
public void run() {
    android.util.Log.d(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("handleTag " + (savedTag)));
    fireTagEvent(tag);
}

public void initVoiceCommandPlayer(final android.app.Activity uiContext) {
    showDialogInitializingCommandPlayer(uiContext, true, null, false);
}

public synchronized void stopScannerAndAdvertiser() {
    android.util.Log.i(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, "stopScannerAndAdvertiser");
    android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ("stopScannerAndAdvertiser: " + (org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BleAdvertiser.currentThreadToString())));
    stopPeerAddressHelperAdvertiser();
    stopScanner();
    stopAdvertiser();
}

protected com.box.androidsdk.content.auth.OAuthWebView.OAuthWebViewClient createOAuthWebViewClient(java.lang.String optionalState) {
    return new com.box.androidsdk.content.auth.OAuthWebView.OAuthWebViewClient(this, mRedirectUrl, optionalState);
}

public boolean onConsoleMessage(net.gree.unitywebview.ConsoleMessage cm) {
    android.util.Log.d("Webview", cm.message());
    return true;
}

public static void getAndPostWithingsData(android.content.Context context) {
    java.lang.String url = NetworkConstants.WITHINGS_URL_DATA;
    new com.wearables.networking.NetworkingTask(url, true, com.wearables.networking.NetworkConstants.METHOD_TYPE.GET, com.wearables.networking.NetworkConstants.REQUEST_TYPE.WITHINGS_DATA_ACCESS, context).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
}

@java.lang.Override
protected void onPrepareDialogBuilder(final android.app.AlertDialog.Builder builder) {
    builder.setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, this).setNeutralButton(R.string.button_default, null);
}

public void initComponent() {
    com.intellij.openapi.projectRoots.SdkType.findInstance(org.jetbrains.android.sdk.AndroidSdkType.class);
}

public android.widget.TextView addSubItem(int id, @android.support.annotation.StringRes
int textId) {
    return addSubItem(id, getContext().getText(textId), 0);
}

private void drawCurrentMonth(android.graphics.Canvas canvas) {
    setCalenderToFirstDayOfMonth(calendarWithFirstDayOfMonth, currentDate, (-(monthsScrolledSoFar)), 0);
    drawMonth(canvas, calendarWithFirstDayOfMonth, ((width) * (-(monthsScrolledSoFar))));
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.bumptech.glide.Glide.with(this).load(url).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView1);
}

@java.lang.Override
public void onNext(com.meisolsson.githubsdk.model.User user) {
    super.onNext(user);
    if (!(com.github.pockethub.android.accounts.AccountUtils.isUser(getActivity(), user)))
        startActivity(com.github.pockethub.android.ui.user.UserViewActivity.createIntent(user));
    
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(com.suta.MainApplication.mCallbackManager), new com.imagepicker.ImagePickerPackage(), new cl.json.RNSharePackage());
}

@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    android.util.Log.i(LOG_TAG, "onStatusChanged");
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    getPreferences().setSetting("warn", "pager", true);
    getPreferences().setSetting("global", "pref_pagers", false);
    goHome();
    finish();
}

@java.lang.Override
public void onDestroy() {
    com.urbanairship.cordova.gimbal.GimbalAdapter.shared().stop();
    super.onDestroy();
    sendBroadcast(new android.content.Intent(com.urbanairship.cordova.gimbal.GimbalAdapterService.INTENT_START));
}

private void setUpTestDuration() {
    android.widget.TextView mDuration = ((android.widget.TextView) (findViewById(R.id.duration)));
    mDuration.setText(((getString(R.string.test_duration)) + (mTest.getDurationToDisplay())));
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.example.rj.cryptodisplay.model.CurrencyAPI>> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, "Error :(", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onSuccess() {
    mManager.discoverServices(mChannel, new android.net.wifi.p2p.WifiP2pManager.ActionListener() {
        @java.lang.Override
        public void onSuccess() {
            java.lang.System.out.println("ServiceDiscovery Started");
        }

        @java.lang.Override
        public void onFailure(int error) {
            java.lang.System.out.println("ServiceDiscovery Failed");
        }
    });
}

public boolean isFull() {
    if ((this.nb_person_in) >= (this.capacity)) {
        android.util.Log.i("Elevator", ((this.id) + " is full"));
        return true;
    }else
        return false;
    
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_add :
            listener.onAddPokemonClick();
            return true;
        case android.R.id.home :
            android.util.Log.e("ANDROID", "LE ARROW PRESSED");
        default :
            return false;
    }
}

public com.danimahardhika.cafebar.CafeBar.Builder customView(@android.support.annotation.LayoutRes
int res, boolean adjustCustomView) {
    mCustomView = android.view.View.inflate(mContext, res, null);
    mAdjustCustomView = adjustCustomView;
    return this;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent sensor = new android.content.Intent(context, v1.app.com.codenutrient.Services.Pedometer.class);
    sensor.putExtra("conter", intent.getSerializableExtra("counter"));
    context.startService(sensor);
}

@java.lang.Override
public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int width, int height) {
    setSize(width, height);
    configureTransform();
    dispatchSurfaceChanged();
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    if ((sensorFragInterface.getGraphConfig().getSelectedSensor()) != position) {
        sensorFragInterface.getGraphConfig().setSelectedSensor(position);
        listItemSelected = position;
    }
    notifyDataSetChanged();
}

public static com.example.evoca.evocaforandroidlearning.fragments.LessonFragment newInstance(com.example.evoca.evocaforandroidlearning.Model.Child lesson) {
    com.example.evoca.evocaforandroidlearning.fragments.LessonFragment fragment = new com.example.evoca.evocaforandroidlearning.fragments.LessonFragment();
    com.example.evoca.evocaforandroidlearning.activity.ListActivity.lesson = lesson;
    com.example.evoca.evocaforandroidlearning.fragments.LessonFragment.lesson = lesson;
    android.os.Bundle args = new android.os.Bundle();
    return fragment;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(context, "Will open gallery", Toast.LENGTH_LONG).show();
    com.theartofdev.edmodo.cropper.CropImage.activity().setGuidelines(CropImageView.Guidelines.ON).setAspectRatio(1, 1).start(this);
}

public static void cameraPermissions(android.app.Activity activity, int id, com.liangmayong.base.support.permission.ActivityPermission.OnPermissionListener listener) {
    java.lang.String[] permissionsNeeded = new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.WRITE_EXTERNAL_STORAGE , Manifest.permission.READ_EXTERNAL_STORAGE };
    com.liangmayong.base.support.permission.ActivityPermission.requestPermissions(activity, id, permissionsNeeded, listener);
}

public void addTask(android.content.ContentValues data) {
    this.database.insert(DefaultValue.value.DB_table_name, null, data);
    this.notifyChange(getTask().toString());
}

@java.lang.Override
public void connected(org.jivesoftware.smack.XMPPConnection connection) {
    android.util.Log.d("SMACK", ("BUS -- > new connection: " + (com.pz.supportchat.PostingConnectionChangeListener.CONNECTED)));
    mBus.post(new com.pz.supportchat.PostingConnectionChangeListener.XMPPConnectionStatus(com.pz.supportchat.PostingConnectionChangeListener.CONNECTED));
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    android.util.Log.e("ListView", "onNothingSelected:");
}

public void cancel() {
    try {
        serverSocket.close();
    } catch (java.io.IOException e) {
        android.util.Log.e("listenThread", e.getMessage());
    }
}

public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    android.widget.Toast.makeText(this, (position + "#Selected"), Toast.LENGTH_LONG).show();
    makeDialog(listHomeTracks.get(position));
}

protected AlertDialog.Builder get_builder() {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
    builder.setCancelable(true);
    return new android.app.AlertDialog.Builder(getActivity());
}

public void morphFromFab(android.view.View fab, long showSheetDuration, long showSheetColorDuration, com.gordonwong.materialsheetfab.animations.AnimationListener listener) {
    sheet.setVisibility(View.VISIBLE);
    revealSheetWithFab(getFabRevealRadius(fab), getSheetRevealRadius(), showSheetDuration, fabColor, sheetColor, showSheetColorDuration, listener);
}

public static java.lang.String isCellReceptionOKRequest(android.content.Context context, java.lang.String requestRecipient) {
    return context.getResources().getString(R.string.reception_ok_message);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar refocusSeekBar, int progress, boolean fromuser) {
    int depth = progress / (com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.PROGRESS_PER_DOF);
    if (depth == 0) {
        depth = 1;
    }
    mDofView.setText(com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.DOFDATA[(depth / 2)]);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.playposse.egoeater.util.SimpleAlertDialog.show(getApplicationContext(), R.string.match_lock_icon_title, R.string.match_lock_icon_explanation);
}

@java.lang.Override
public void setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener l) {
    mCreateContextMenuListener = ((l == null) || (l == (this))) ? null : l;
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    setViewState();
    numUpdates = ((numUpdates)++) % 1440;
}

@java.lang.Override
public com.vathsav.blink.model.LogViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layout = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.card_log, parent);
    return new com.vathsav.blink.model.LogViewHolder(layout, context);
}

@java.lang.SuppressWarnings(value = "WeakerAccess")
@android.support.annotation.NonNull
public ru.spbau.mit.placenotifier.Alarm.AlarmBuilder change() {
    return new ru.spbau.mit.placenotifier.Alarm.AlarmBuilder(this);
}

@android.support.annotation.Nullable
public java.lang.String getExisting(java.lang.String name) {
    java.lang.String existing = mCanonicalMap.get(makeCanonical(name));
    return existing == null ? name : existing;
}

@java.lang.Override
public void onResponseReceived(java.lang.String result) {
    android.util.Log.i("Gobinath", result);
}

@android.support.annotation.Nullable
public java.lang.String getString(java.lang.String key, @android.support.annotation.Nullable
java.lang.String defValue) {
    java.lang.Object obj = mMap.get(key);
    return ((java.lang.String) (obj));
}

private void updateWeather() {
    java.lang.String location = com.example.krishnadamarla.sunshine.helpers.Utility.getPreferredLocation(getActivity());
    android.widget.Toast.makeText(getActivity(), location, Toast.LENGTH_SHORT).show();
    com.example.krishnadamarla.sunshine.sync.SunshineSyncAdapter.syncImmediately(getActivity());
}

@com.mindorks.placeholderview.annotations.Click(value = R.id.photoImageView)
private void onClick() {
    android.util.Log.d("EVENT", "profileImageView click");
    togglePhotoAddOns();
}

@java.lang.Override
public void onGameDraw() {
    turnTextBox.setText("");
    android.widget.Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
    board.setOnBoardInteractionListener(null);
}

protected void onPostExecute(java.util.ArrayList<com.uwo.crystalli.jukebox.VideoResult> videos) {
    mSearchResultsAdapter.clear();
    if (videos != null)
        android.util.Log.v(LOG_TAG, videos.toString());
    
    mSearchResultsAdapter.addAll(videos);
}

private void handleOnCompletion() {
    android.util.Log.i(LOG_TAG, "handleOnCompletion - start");
}

public static com.helger.jcodemodel.JDefinedClass intentBuilder(com.helger.jcodemodel.JDefinedClass activity, de.nenick.androidannotations.plugin.mvp.utils.PluginBaseAnnotationHandler base) {
    for (com.helger.jcodemodel.JDefinedClass innerClass : activity.classes()) {
        if (de.nenick.androidannotations.plugin.mvp.utils.GeneratedClasses.isIntentBuilder(innerClass.name())) {
            return innerClass;
        }
    }
    throw new java.lang.IllegalStateException();
}

@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    savedInstanceState.getInt(com.example.android.quizapp.MainActivity.STATE_SCORE);
}

public double sendPrice(int fuelKind, android.content.Context context) {
    double price = 0;
    com.vp3000r.yourfuelconsumption.Model model = new com.vp3000r.yourfuelconsumption.Model(context);
    price = com.vp3000r.yourfuelconsumption.Model.sendFuelConsumption(fuelKind);
    return price;
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.content.IntentFilter filter = new android.content.IntentFilter(android.content.Intent.ACTION_SCREEN_ON);
    filter.addAction(Intent.ACTION_SCREEN_OFF);
    android.content.BroadcastReceiver mReceiver = new com.halfdotfull.panchi_app.Services.ScreenReceiver();
    registerReceiver(mReceiver, filter);
}

public boolean tryUpdate(android.content.Context context) {
    return this.isUpdate;
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    model.updateMap(mMap, mLastLocation);
}

@java.lang.Override
public void onClick(android.view.View v) {
    gridLayout.setMinimumImageSize(1, 400);
}

@butterknife.OnClick(value = R.id.playTrackPlayButton)
public void onPlayButtonPress() {
    android.util.Log.v(io.crispcode.spotifystreamer.PlayTrackFragment.LOG_TAG, "Play button was pressed");
    mStreamPlayerService.play();
    mPlayButtonDown = true;
    configureUIState();
}

private void nextRound() {
    android.util.Log.d("aaa", "nextRound");
    for (ma.com.eclipsecalculator.model.Ship ship : attackers) {
        ship.nextRound();
    }
    for (ma.com.eclipsecalculator.model.Ship ship : defenders) {
        ship.nextRound();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    int i = v.getId();
    if (i == (R.id.button_facebook_signout)) {
        signOut();
    }
}

@java.lang.Override
public boolean onDown(android.view.MotionEvent event) {
    butTrigSettings.setBackgroundColor(-1442807680);
    return super.onDown(event);
}

