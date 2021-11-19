@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    onAnimationEnd(animation);
    topSearch.setVisibility(View.VISIBLE);
}

@java.lang.Override
public void onTick(long millisUntilFinished) {
    android.util.Log.d(ru.ifmo.geoquiz.GameScreen.LOG_TAG, "Tick...");
}

@android.annotation.SuppressLint(value = "NewApi")
public void start() {
    uk.digitalsquid.netspoofer.misc.AsyncTaskHelper.execute(launchTask);
}

@java.lang.Override
public boolean apply(com.android.volley.Request<?> request) {
    return (request.getTag()) == tag;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((editroomName) != null) {
        add();
    }else {
        android.widget.Toast.makeText(this, "請輸入房間名稱", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    com.nearit.ui_bindings.feedback.views.NearItUIRatingBar.SavedState savedState = ((com.nearit.ui_bindings.feedback.views.NearItUIRatingBar.SavedState) (state));
    super.onRestoreInstanceState(savedState.getSuperState());
    setRating(savedState.rating);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, net.biospherecorp.microdoro.MyPreferenceActivity.class);
    intent.putExtra("orientation", getRequestedOrientation());
    startActivityForResult(intent, 1);
}

@java.lang.Override
public void onClick(android.view.View v) {
    isReadFolder = true;
    openBooksLayout.setVisibility(View.GONE);
    listBookLayout.setVisibility(View.VISIBLE);
    handleChooseFileLayout.setVisibility(View.VISIBLE);
    getDirectory(rootDirectory);
    showFileOptionButton(2);
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.detailfragment, menu);
    android.view.MenuItem menuItem = menu.findItem(R.id.action_share);
    android.widget.ShareActionProvider mShareActionProvider = ((android.widget.ShareActionProvider) (android.view.MenuItem.getActionProvider(menuItem)));
}

public boolean onItemLongClick(android.widget.AdapterView parent, android.view.View view, int position, long id) {
    latLongList.remove(position);
    latLongList.clear();
    mAdapter.notifyDataSetChanged();
    saveData();
    return true;
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.home, menu);
    setTitle(mtitle);
    return true;
}

@java.lang.Override
public void addDataListeningObject(de.fau.amos.virtualledger.android.views.shared.transactionList.DataListening observer) {
    if (this.dataListenings.isEmpty()) {
        this.contactsDataManager.addObserver(this);
    }
    this.dataListenings.add(observer);
}

private void startReadRequest() {
    android.util.Log.i(net.fishandwhistle.openpos.BarcodeReaderActivity.TAG, ("Launching read request " + (currentReadRequest)));
    currentReadRequest = java.lang.System.currentTimeMillis();
    enableScanning = true;
}

@org.junit.Test
public void validateEditText() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.locationEditText)).perform(android.support.test.espresso.action.ViewActions.typeText("Portland")).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.withText("Portland")));
}

@java.lang.Override
public synchronized void setLayoutAlgorithm(android.webkit.LayoutAlgorithm l) {
    if (l == (LayoutAlgorithm.TEXT_AUTOSIZING)) {
        throw new java.lang.IllegalArgumentException("WebViewClassic does not support TEXT_AUTOSIZING layout mode");
    }
    if ((mLayoutAlgorithm) != l) {
        mLayoutAlgorithm = l;
        postSync();
    }
}

public void run() {
    android.util.Log.v(li.zeitgeist.android.GalleryAdapter.TAG, ("NOTIFY DATASET CHANGED : " + (java.lang.String.valueOf(getCount()))));
    galleryActivity.hideProgressDialog();
    notifyDataSetChanged();
}

@java.lang.Override
public void onFocusChange(android.view.View v, boolean event) {
    if (!event) {
        this.validateCreditCardNumber(true);
    }
}

public void newEvent() {
    android.content.Intent intent = new android.content.Intent(this, com.parse.starter.EventViewerActivity.class);
    intent.putExtra("EVENT_ID", "");
    startActivity(intent);
}

private void setUpNavigationDrawer() {
    android.content.Context context = getApplicationContext();
    drawerAdapter = new com.blstream.studybox.components.DrawerAdapter(navigationView, drawerLayout, toolbar, context);
    drawerAdapter.attachDrawer();
}

@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition arg0) {
    if (ignoreNextChange) {
        ignoreNextChange = false;
    }else {
        centerOnMylocation = false;
        ignoreNextChange = false;
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    int index = model.removeGroceryItem(groceryId);
    if (index > 0) {
        adapter.notifyItemRemoved(index);
    }
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progressValue, boolean fromUser) {
    User = fromUser;
    progress = ((int) (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(progressValue)));
}

@android.support.annotation.Nullable
@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "onBind");
    return mBinder;
}

public void getDistance(android.view.View view) {
    coor1 = null;
    coor2 = null;
    com.example.kygrykhon.knownuggettrial.MainActivity.dialog = android.app.ProgressDialog.show(getApplicationContext(), "Getting distance..", "Please wait while we fetch coordinates..", true);
    acquireCoordinate();
    acquireCoordinate();
}

@java.lang.Override
public void onClick(android.view.View view) {
    isInUpdateMode = false;
    saveSubject("", false, "", false, 0);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    mDrawerToggle.onConfigurationChanged(newConfig);
    if ((newConfig.orientation) != (prevOrientation)) {
        prevOrientation = newConfig.orientation;
        rotated = true;
    }
}

@java.lang.Override
public void onResume() {
    edu.berkeley.cs.amplab.carat.android.CaratApplication.setActionList(this);
    refresh();
    super.onResume();
}

public void onAddNewAmountClick(android.view.View view) {
    if ((adapter) == null)
        adapter = new com.sarahehabm.carbcalculator.item.view.AddNewItemAmountsAdapter();
    
    adapter.addItem();
    validQuantities = adapter.isValidAmounts();
    supportInvalidateOptionsMenu();
    invalidateOptionsMenu();
}

@java.lang.Override
public void onPlaybackError(java.lang.Error error) {
    android.util.Log.e(agency.tango.skald.spotify.player.callbacks.SpotifyNotificationCallback.TAG, java.lang.String.format("PlaybackError occurred %s", error.toString()));
    for (agency.tango.skald.core.listeners.OnPlaybackListener onPlaybackListener : onPlaybackListeners) {
        onPlaybackListener.onError(new agency.tango.skald.core.errors.PlaybackError());
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    button7.setText(((mark) + ""));
    placeMarkOnBoard(2, 0);
    button7.setEnabled(false);
    changeCurrentPlayer();
    checkForWinOrDraw();
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    android.app.Activity c = ((android.app.Activity) (getContext()));
    return c.onKeyDown(keyCode, event);
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult result) {
    mCurrentMatch = result.getMatch();
    takeTurn();
    mEditor.putString(Constants.PREFERENCES_MATCH_ID, mCurrentMatchId);
    mEditor.commit();
}

@java.lang.Override
protected synchronized void onLayout(boolean changed, int left, int top, int right, int bottom) {
    if (changed) {
        dst = new android.graphics.Rect(0, 0, getWidth(), getHeight());
    }
}

@java.lang.Override
public void onSubmissionClick(com.example.android.grader.models.Submission submission, java.lang.String assignmentTitle) {
    com.example.android.grader.fragments.SubmissionDetailFragment submissionDetailFragment = com.example.android.grader.fragments.SubmissionDetailFragment.newInstance(submission, assignmentTitle);
    fragmentManager.beginTransaction().replace(R.id.fragmentContainer, submissionDetailFragment, com.example.android.grader.activities.MainActivity.SUBMISSION_DETAIL_FRAGMENT).addToBackStack(null).commit();
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
    com.example.whatsmymood.AddMoodController.processResult(requestCode, resultCode, intent);
}

public static void showUnderDevelopmentDialog(android.content.Context context) {
    new android.app.AlertDialog.Builder(context).setMessage(R.string.under_development_message).setPositiveButton(context.getResources().getString(R.string.ok), null).show();
}

@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    android.view.MenuInflater inflater = mode.getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    return true;
}

@java.lang.Override
public void protocolDidReceiveCustomData(int[] data, int length) {
    android.util.Log.e(TAG, ("protocolDidReceiveCustomData: " + data));
}

private void onFavoritesChanged() {
    android.database.Cursor c = getActivity().getContentResolver().query(MovieContract.MovieEntry.CONTENT_URI, null, null, null, null);
    mAdapter.swapCursor(c);
}

private com.example.caxidy.proyectojuego.Bola crearSprite(int res) {
    android.graphics.Bitmap bmp = android.graphics.BitmapFactory.decodeResource(getResources(), res);
    return new com.example.caxidy.proyectojuego.Bola(this, bmp);
}

protected static <F extends ru.kazantsev.template.fragments.BaseFragment> F show(ru.kazantsev.template.util.FragmentBuilder builder, @android.support.annotation.IdRes
int container, java.lang.Class<F> fragmentClass) {
    return builder.newFragment().addToBackStack().replaceFragment(container, fragmentClass);
}

@java.lang.Override
public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);
    getActivity().getMenuInflater().inflate(R.menu.em_delete_message, menu);
}

@java.lang.Override
protected void onPostExecute(byte[] bytes) {
    super.onPostExecute(bytes);
    reliUser.setAvatar(bytes);
    android.util.Log.w("LIOR", "Finished with avatar!");
}

protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    saveState();
    outState.putSerializable(TodoDatabaseAdapter.KEY_ROWID, mRowId);
}

@org.junit.Before
public void BeforeRunTest() throws java.lang.Exception {
    ctx = android.support.test.InstrumentationRegistry.getTargetContext();
    android.util.Log.e(com.example.boba.lookapplication.TestWriteFile.TAG, ("----------------------Own context2: " + (java.lang.String.valueOf(ctx))));
}

private void newFieldValueSelected(int position, com.example.willpassidomo.androidcomponents.FieldValue newQuestion) {
    com.example.willpassidomo.androidcomponents.FieldValue newQ = out.get(position);
    out.remove(position);
    in.add(in.size(), newQuestion);
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mMovieCursorAdapter.notifyDataSetChanged();
    mMovieCursorAdapter.swapCursor(data);
}

public void restoreInstanceState(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
}

public void success(com.bopr.android.smailer.MailMessage message) {
    com.bopr.android.smailer.ActivityLogItem item = new com.bopr.android.smailer.ActivityLogItem(com.bopr.android.smailer.ActivityLog.LEVEL_INFO);
    item.setMessage(formatMessage(message, R.string.activity_log_message_send_email_success));
    add(item);
}

public static android.net.Uri appendLimit(@android.support.annotation.NonNull
final android.net.Uri uri, @android.support.annotation.NonNull
final java.lang.String limit) {
    if (uri == null) {
        throw new java.lang.IllegalArgumentException("Uri can't be null");
    }
    return uri.buildUpon().appendQueryParameter(AbstractContentProviderProcessor.QUERY_PARAMETER_LIMIT, limit).build();
}

public boolean changeApplicationBluetoothState(boolean on, android.bluetooth.BluetoothAdapter.BluetoothStateChangeCallback callback) {
    if (callback == null)
        return false;
    
    return false;
}

private boolean onTouchEvent(android.view.View v, android.view.MotionEvent e) {
    if (!(mClickDetector.onTouchEvent(v, e))) {
        return false;
    }
    return super.onTouchEvent(e);
}

public static com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer getPlayer() {
    if ((com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.singletone) == null) {
        android.util.Log.e(com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.TAG, "getPlayer: Creating a new AlertPlayer");
        com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.singletone = new com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer();
    }else {
        android.util.Log.e("tag", "getPlayer: Using existing AlertPlayer");
    }
    return com.eveningoutpost.dexdrip.UtilityModels.AlertPlayer.singletone;
}

public static void startUpdate(android.content.Context context, boolean force) {
    org.omnirom.omnijaws.WeatherService.start(context, org.omnirom.omnijaws.WeatherService.ACTION_UPDATE, force);
}

@android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
@java.lang.Override
public void sendBroadcastAsUser(final android.content.Intent intent, final android.os.UserHandle user) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run(final android.content.Intent intent) {
            com.oasisfeng.condom.CondomContext.super.sendBroadcastAsUser(intent, user);
        }
    });
}

public void handleSetUp() throws java.lang.InterruptedException {
    android.content.Intent intent = new android.content.Intent(this, mobilegroup1.npcgenerator.HubActivity.class);
    mobilegroup1.npcgenerator.Singleton.getInstance();
    wait(5000);
    startActivity(intent);
}

public void moveView(int from, int to) {
    android.view.View view = getChildAt(from);
    removeViewAt(from);
    addView(view, to);
}

public static int dp2px(android.content.Context context, float dp) {
    android.content.res.Resources r = context.getResources();
    float px = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
    return ((int) (px));
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(new android.content.Intent(context, luizventurote.minhagrana.MovimentacaoFinanceiraActivity.class));
    finish();
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    if (!(net.anei.cadpage.ManagePreferences.checkNoShowInCall(((android.preference.CheckBoxPreference) (preference)), ((java.lang.Boolean) (newValue)))))
        return false;
    
    return true;
}

public static java.lang.Double convertToBitcoinFromCurrency(android.content.Context ctx, java.lang.Double currency) {
    java.lang.Double bitcoin;
    bitcoin = currency / (ctx.getSharedPreferences(Constant.PREF_CURRENT_USER, Context.MODE_PRIVATE).getFloat(Constant.CURRENCY_VALUE, 1.0F));
    return bitcoin;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(starace.learn.com.musicfilter.Song.SongListAdapter.TAG_SONG_ADAPTER, ("This item has been clicked " + position));
    starace.learn.com.musicfilter.Song.SongListAdapter.RecyclerClickEvent clickEvent = new starace.learn.com.musicfilter.Song.SongListFragment();
    clickEvent.handleRecyclerClickEvent(curSong.getUri());
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent msg) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        this.finish();
        startActivity(new android.content.Intent(this, com.voidcode.diasporawebclient.MainActivity.class));
        return false;
    }else {
        return true;
    }
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    android.util.Log.d(com.example.android.quakereport.EarthquakeActivity.TAG, "Inside onPreExecute() in main...");
    earthquakeListView.setVisibility(View.GONE);
    reloadButton.setVisibility(View.GONE);
    progressBar.setVisibility(View.VISIBLE);
    textView.setVisibility(View.VISIBLE);
}

private android.support.v7.widget.PopupMenu createPopupMenu(android.view.View view) {
    android.support.v7.widget.PopupMenu popup = new android.support.v7.widget.PopupMenu(getContext(), view);
    popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());
    return popup;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    brickType = R.id.twoSix;
    bufferSize = android.media.AudioRecord.getMinBufferSize(sampleRate, audioFormat, AudioFormat.ENCODING_PCM_16BIT);
    checkPermissions();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if ((com.example.rapid.MainActivity.authenticated) == false) {
        loginProcess();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null)
        onItemClickListener.onItemClick(v, getAdapterPosition());
    
}

@java.lang.Override
public void onSuccess(com.owsega.hellotractorsample.model.FarmerEntity[] results) {
    android.util.Log.e("seyi", ("farmer fetch successful " + (results.length)));
    com.owsega.hellotractorsample.model.Farmer.saveFarmers(results);
}

public void sendData(java.lang.String data) {
    android.util.Log.d("SIMPLEBT", ("Sending data: " + data));
    bluetoothUtility.sendData(data);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    if (iFragment.useEventBus())
        org.simple.eventbus.EventBus.getDefault().register(mFragment);
    
    this.iPresenter = iFragment.obtainPresenter();
    iFragment.setPresenter(iPresenter);
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mService.onCommand(MediaService.ACTION_SETTIME, java.lang.String.valueOf((((float) (seekBar.getProgress())) / 1000)), 0);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_refresh)) {
        mWeatherTextView.setText("");
        loadWeatherData();
        return true;
    }
    return false;
}

@java.lang.Override
public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CaptureResult partialResult) {
    process(partialResult);
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.cit.abakar.application.ExampleClasses.Equipment>> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, "Нет соединения", Toast.LENGTH_SHORT);
    progressBar.setVisibility(View.GONE);
}

public void onDestroy() {
    android.util.Log.d(App.TAG, "onDestroy");
    mediaPlayer.stop();
    model.setInvalidState(false);
}

@java.lang.Override
public olx.com.olxapp1.category.CategoryListAdapterLevelOne.ItemViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemLayoutView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.category_adapter_level_one, null);
    android.util.Log.d("dd", "VIEW POPULATED FOR after product adapter");
    return new olx.com.olxapp1.category.CategoryListAdapterLevelOne.ItemViewHolder(itemLayoutView);
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        bottomNavigationViewFixed.setVisibility(View.INVISIBLE);
        bottomNavigationViewShifting.setVisibility(View.VISIBLE);
        bottomNavigationViewShifting.setTranslucentNavigationBar(me.timbals.materialdesigncomponents.BotttomNavigationActivity.hasNavBar(getWindowManager()));
    }
}

@java.lang.Override
public void onPlay() {
    android.util.Log.d(io.welle.welle.DabService.TAG, "play");
    handlePlayRequest();
}

@java.lang.Override
public android.support.v4.content.Loader<com.expidev.gcmapp.model.Assignment> onCreateLoader(final int id, @android.support.annotation.Nullable
final android.os.Bundle args) {
    switch (id) {
        case com.expidev.gcmapp.MeasurementDetailsActivity.LOADER_CURRENT_ASSIGNMENT :
            return new com.expidev.gcmapp.support.v4.content.CurrentAssignmentLoader(this);
        default :
            return null;
    }
}

private static void showMessagePopup(android.content.Context context, java.lang.String message, android.content.DialogInterface.OnClickListener listener) {
    new android.app.AlertDialog.Builder(context).setMessage(message).setCancelable(false).setNegativeButton(R.string.ok, listener).show();
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (showTargetArc) {
        addArcAnimation(activity);
    }else {
        addPathAnimation(activity);
    }
}

@java.lang.Override
public com.softdesign.devintensive.ui.adapters.UsersAdapter.UserViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    mContext = parent.getContext();
    android.view.View converView = android.view.LayoutInflater.from(mContext).inflate(R.layout.item_user_list, parent, false);
    return new com.softdesign.devintensive.ui.adapters.UsersAdapter.UserViewHolder(converView, mListener);
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.menu_main, menu);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    saveStopwatchTime();
    mGame.setmCompleted(true);
    updateGameInDatabase();
    startActivity(mHomeIntent);
}

private void updatePickers() {
    android.util.Log.d("KG: updatePickers:", "");
    for (com.hornet.dateconverter.DatePicker.DatePickerDialog.OnDateChangedListener listener : mListeners)
        listener.onDateChanged();
    
}

private void openSocket(int port) throws java.lang.Exception {
    socket = new java.net.Socket(IP, port);
    android.util.Log.d("openSocket", "openSocket");
}

public static void nullSafeAppend(android.widget.TextView textView, java.util.Date date, java.text.DateFormat dateFormat) {
    if (date == null) {
        return ;
    }else {
        textView.append(dateFormat.format(date));
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_camera :
            selectImage();
            break;
    }
    return true;
}

@dagger.Provides
@com.tomeokin.lspush.injection.scope.PerActivity
public com.tomeokin.lspush.biz.usercase.SendCaptchaAction provideSendCaptchaAction(@com.tomeokin.lspush.injection.qualifier.ActivityContext
android.content.Context context, com.tomeokin.lspush.data.remote.LsPushService lsPushService, com.tomeokin.lspush.common.SMSCaptchaUtils smsCaptchaUtils) {
    return new com.tomeokin.lspush.biz.usercase.SendCaptchaAction(context.getResources(), lsPushService, smsCaptchaUtils);
}

public static long getSelectedStoryPageSecondary(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong(utils.UWPreferenceManager.STORY_PAGE_SECONDARY, (-1));
}

@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    android.util.Log.i("BACKGROUND", "started");
    ++(start);
}

@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    android.util.Log.d("KhSY", " 2");
    return dialog;
}

@java.lang.Override
public void unfriend(com.android.summer.csula.foodvoter.models.User user) {
    foodVoterFirebaseDb.unfriendUser(userId, user);
}

public static boolean requestActivity(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.Class tClass, int updateRate) {
    return com.adsamcik.signalcollector.services.ActivityService.requestActivity(context, tClass.hashCode(), updateRate);
}

@java.lang.Override
public void onClick(android.view.View v) {
    twenty.setBackgroundColor(Color.LTGRAY);
    ten.setBackgroundColor(Color.GREEN);
    fifteen.setBackgroundColor(Color.LTGRAY);
    calculate(0.1);
}

@java.lang.Override
public void onMenuItemSelect(@android.support.annotation.IdRes
final int itemId, final int position) {
    setCurrentFragment(position);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    stopService(de.jamsk.mrx.MrXMap.startMrXService);
    de.jamsk.mrx.MrXMap.gameFinished.show();
    new de.jamsk.mrx.MrXMap.endGame().execute(((de.jamsk.mrx.MrXMap.Token) + ",endGame"));
    dialog.cancel();
}

private void setHeadline(java.lang.String clickedItem) {
    java.lang.String headlineText = clickedItem;
    android.widget.TextView headline = ((android.widget.TextView) (findViewById(R.id.header)));
    headline.setText(clickedItem);
}

