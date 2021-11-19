public android.graphics.Bitmap peekBitmap() {
    if (stack.empty())
        return null;
    
    return stack.peek();
}

@java.lang.Override
public void OnCartItemsLoaded() {
    itemsList = mCart.cartProducts;
    adapter.itemsList = itemsList;
    adapter.notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((android.content.DialogInterface.BUTTON_POSITIVE) == which) {
        clearModelManager();
        copyDefaultConfig();
        loadModelManager();
        isAlertDialogShown = false;
    }
}

public android.view.View getLeftOuterView() {
    return mLeftOuterView;
}

@java.lang.Override
public void switchToDetailFragment(comcsse483.github.scoutr.models.Match match) {
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.fragment_container, new comcsse483.github.scoutr.fragments.ViewDataFragment());
    ft.commit();
}

public static void loadBitmap(android.content.Context context, android.widget.ImageView img, java.lang.String url) {
    com.bumptech.glide.Glide.with(context).load(url).asBitmap().into(img);
}

private void swipeLeft(int distance, android.view.View animationView) {
    android.widget.RelativeLayout.LayoutParams params = ((android.widget.RelativeLayout.LayoutParams) (animationView.getLayoutParams()));
    params.rightMargin = -distance;
    params.leftMargin = distance;
    animationView.setLayoutParams(params);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 100) {
        if (resultCode == (RESULT_OK)) {
            iv_takeImage.setImageURI(file);
        }
    }
}

private void publishResults(com.example.mappingservice.Result result) {
    android.content.Intent intent = new android.content.Intent(com.example.mappingservice.MappingService.NOTIFICATION);
    intent.putExtra("result", result);
    sendBroadcast(intent);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((videoView) != null) {
        stopPosition = videoView.getCurrentPosition();
        videoView.pause();
        outState.putInt("position", stopPosition);
    }
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    backPressed = true;
}

@rxbus.ecaray.com.rxbuslib.rxbus.RxBusReact(clazz = { java.lang.String.class , java.lang.Integer.class , java.lang.Double.class }, tag = "tag")
public void showContent2(java.lang.String content, int i, double k) {
    android.util.Log.d("tagutil", ((("收到的参数: " + k) + content) + i));
}

public void pauseSong() {
    mediaPlayer.pause();
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    rescheduleNotifications();
}

@java.lang.Override
public void onResult(com.google.android.gms.wearable.Node selectedNode) {
    if (selectedNode == null) {
        nodeName = null;
        return ;
    }
    nodeName = selectedNode.getDisplayName();
}

@org.junit.Test
public void testDataItemNotInAdapter() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.listView)).check(android.support.test.espresso.assertion.ViewAssertions.matches(org.hamcrest.CoreMatchers.not(withAdaptedData(withUnitName("kgl")))));
}

@java.lang.Override
public void onClick(android.view.View view) {
    stop();
    startActivityForResult(new android.content.Intent(this, com.entersnowman.alarmclock.ListOfRingtonesActivity.class), com.entersnowman.alarmclock.MusicSettingsActivity.LIST_OF_RINGTONES);
}

public void removeElement(edu.istic.tdf.dfclient.domain.element.IElement element) {
    com.google.android.gms.maps.model.Marker marker = getMarker(element);
    if (marker != null) {
        marker.remove();
        markersList.remove(marker);
    }
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    if (this.enabled) {
        return super.onTouchEvent(event);
    }
    return false;
}

private void leaveLobby() {
    android.util.Log.d(com.github.mrm1st3r.cards.lobby.LobbyActivity.TAG, "leaving lobby");
    if ((conn) != null) {
        conn.setOnConnectionChangeHandler(null);
        conn.close();
        conn = null;
    }
    playerList.clear();
}

@java.lang.Override
public void onLoadMore() {
    (page)++;
    new com.androidbelieve.drawerwithswipetabs.FilmsFragment.LoadFilms().execute();
}

public void addLabel(android.database.sqlite.SQLiteDatabase db, java.lang.String text) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(exjobb.selfannotationsystem.Database.DBLabelHelper.COLUMN_VALUE, text);
    db.insert(exjobb.selfannotationsystem.Database.DBLabelHelper.TABLE_LABELS, null, values);
}

@org.jetbrains.annotations.NotNull
private com.jaspersoft.android.sdk.service.report.ReportExport performExport(com.jaspersoft.android.sdk.service.report.RunExportCriteria criteria) throws com.jaspersoft.android.sdk.service.exception.ServiceException {
    com.jaspersoft.android.sdk.network.entity.export.ExportExecutionDescriptor exportDetails = runExport(criteria);
    waitForExportReadyStatus(exportDetails);
    com.jaspersoft.android.sdk.network.entity.execution.ReportExecutionDescriptor currentDetails = requestExecutionDetails();
    return mExportFactory.create(criteria, currentDetails, exportDetails);
}

private void signInGoogle() {
    signInIntent = Auth.GoogleSignInApi.getSignInIntent(SIM.getmGoogleApiClient());
    startActivityForResult(signInIntent, nl.rug.www.summerschool.controller.myprofile.SignInFragment.GOOGLE_SIGN_IN);
    signInIntent = null;
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
}

public void setView() {
    setTextColor((fullMode ? android.graphics.Color.WHITE : color));
    setGravity(Gravity.CENTER);
}

public static void readAnswers() {
}

public static java.lang.String restoreDefaultFont(android.content.Context context) {
    android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(context.getString(R.string.settings_change_font_key), context.getString(R.string.settings_change_font_default_value)).apply();
    return context.getString(R.string.settings_change_font_default_value);
}

public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    setDatePickerEditText(year, monthOfYear, dayOfMonth);
    selectedYear = year;
    selectedMonth = monthOfYear;
    selectedDay = dayOfMonth;
}

public void onImageSearch(android.view.View v) {
    java.lang.String query = searchView.getQuery().toString();
    fetchSearchResults(query, 0, true);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home)) {
        getActivity().onBackPressed();
        return true;
    }
    return false;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString("tState", tView.getSaveState());
    outState.putString("selectedFilePath", tView.getSelectedFilePath());
    super.onSaveInstanceState(outState);
}

public void checkPerm() {
    boolean hasPermission = (android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
    if (!hasPermission) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, qwikstats.qwikcut.kerbysoft.com.qwikstats.MainActivity.REQUEST_WRITE_STORAGE);
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    configureImageButton1();
    configureImageButton2();
    configureImageButton3();
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    com.zzzmode.appopsx.ui.core.LangHelper.updateLanguage(this);
    super.onCreate(savedInstanceState);
    android.support.v7.app.AppCompatDelegate.setDefaultNightMode(com.zzzmode.appopsx.ui.core.SpHelper.getThemeMode(this));
}

protected void closeRealm() {
    myRealm.close();
    android.util.Log.d(com.zhan.budget.Fragment.BaseRealmFragment.TAG, "----- CLOSE REALM -----");
}

protected void onPreExecute() {
    this.dialog = new android.app.ProgressDialog(this);
    this.dialog.setMessage("Please wait while finishing the installation...");
    dialog.setCanceledOnTouchOutside(false);
    dialog.setCancelable(false);
    this.dialog.show();
}

public static void display(final android.content.Context mContext, java.lang.String url, final android.widget.ImageView img) {
    com.bumptech.glide.Glide.with(mContext).load(url).dontAnimate().placeholder(com.xinyi.czbasedevtool.base.manager.ui_about.GlideMaster.placeHolderRes).error(com.xinyi.czbasedevtool.base.manager.ui_about.GlideMaster.errorHolderRes).into(img);
}

public void time() {
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.saveCategory)) {
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public boolean onSelection(com.afollestad.materialdialogs.MaterialDialog dialog, android.view.View view, int which, java.lang.CharSequence why) {
    return true;
}

private void setPaymentInstallment() {
    if (((layoutInstallment.getVisibility()) == (android.view.View.VISIBLE)) && ((installmentCurrentPosition) > 0)) {
        ((com.midtrans.sdk.uikit.activities.CreditCardFlowActivity) (getActivity())).setInstallment(installmentCurrentPosition);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    if (com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.DEBUG)
        android.util.Log.d(com.vibejukebox.jukebox.activities.VibeJukeboxMainActivity.TAG, "onCreate()");
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_jukebox_main);
}

private void disconnectGoogleApiClient() {
    if ((googleApiClient) != null) {
        googleApiClient.disconnect();
    }
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    com.byagowi.persiancalendar.view.AthanVolumePreference.audioManager.setStreamVolume(AudioManager.STREAM_ALARM, progress, 0);
}

@java.lang.Override
public void onSuccess(java.lang.String deviceId) {
    setStatus(("Device Registered Successfully " + deviceId), true);
    push.listen(notificationListener);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences);
    android.preference.PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences, false);
    initSummary(getPreferenceScreen());
}

@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
    if ((resClient) != null) {
        resClient.stopPreview();
    }
    return false;
}

@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.widget.Toast.makeText(this, ("搜索" + query), Toast.LENGTH_SHORT).show();
    return false;
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.i(LOG_TAG, "on handle intent");
    handleIntent(intent);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_send);
    textView = ((android.widget.TextView) (findViewById(R.id.full_json_data)));
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.activity_feed, container, false);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initFeedButton();
    initFeedPanel();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.nutricampus.app.activities.CadastrarPropriedadeActivity.class);
    startActivity(intent);
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putBoolean("hasInitializedFirstFragment", mHasInitializedFirstFragment);
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.thefe.newsmartkedex.PokemonDetails.class);
    i.putExtra("id", ((pokeID) - 1));
    startActivity(i);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isConnected)) {
        bluetoothHandler.scanLeDevice(true);
    }else {
        killService();
    }
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    mRevealView.setBackgroundColor(toColor);
    mRevealView.setVisibility(View.VISIBLE);
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
}

@java.lang.Override
public void onChange(boolean selfChange) {
    if (DebugLog.DEBUG)
        android.util.Log.d(edu.nd.darts.cimon.MMSInfoService.TAG, "MMSInfoService - MmsContentObserver: changed");
    
    getMmsData();
    super.onChange(selfChange);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    android.util.Log.i("seekBar val", java.lang.Integer.toString(progress));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(m.mRequestingLocationUpdates)) {
        startLocationUpdatesButton.setText(getString(R.string.stop_location_updates_button));
    }else {
        startLocationUpdatesButton.setText(getString(R.string.start_location_updates_button));
    }
}

public com.x91tec.appshelf.v7.XDividerDecoration build() {
    checkParams();
    return new com.x91tec.appshelf.v7.XDividerDecoration(this);
}

@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    inflater.inflate(R.menu.menu_detail, menu);
    finishCreatingMenu(menu);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mapView.refreshMap();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    dsHexSection = new org.digitalillusion.droid.iching.utils.sql.HexSectionDataSource(getApplicationContext());
    current = new org.digitalillusion.droid.iching.IChingActivityRenderer.CurrentState();
}

public static java.lang.String getPublicPath(android.content.Context context, android.net.Uri uri) throws edu.mit.mobile.android.locast.data.NoPublicPath {
    return edu.mit.mobile.android.locast.data.MediaProvider.getPublicPath(context, uri, false);
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_TABLE_CITIES);
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_TABLE_FORECASTS);
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_CURRENT_WEATHER);
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_TABLE_CITIES_TO_WATCH);
    fillCityDatabase(db);
}

public void updateViews(com.darrienglasser.clockwork.AlarmData data) {
    mGridView.invalidateViews();
    ((com.darrienglasser.clockwork.AlarmAdapter) (mGridView.getAdapter())).updateData(data);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
}

@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
}

@java.lang.Override
public void onUndo(android.os.Parcelable parcelable) {
    org.wordpress.android.ui.reader.actions.ReaderBlogActions.undoBlockBlogFromReader(blockResult);
    refreshPosts(false);
}

@java.lang.Override
public void onFailGetPartyList(de.dhbw.model.Party[] parties) {
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), "Parties laden ist fehlgeschlagen. Alte Liste wurde geladen.", Toast.LENGTH_SHORT).show();
        mSwipeRefreshLayout.setRefreshing(false);
    }
}

public void CreateCategory(java.lang.String categoryName, android.database.sqlite.SQLiteDatabase db) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(team5.diabetesself_managmentapp.DatabaseHelper.CATEGORY_NAME, categoryName);
    db.insert(team5.diabetesself_managmentapp.DatabaseHelper.TABLE_CATEGORIES, null, values);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootLayout = inflater.inflate(R.layout.fragment_cht_identity_create, container, false);
    initViews(rootLayout);
    return rootLayout;
}

protected boolean checkInternetConnectivity() {
    if (!(com.thetidbitapp.util.InternetUtil.isOnline(mContext))) {
        return false;
    }
    return true;
}

public void signout(android.view.MenuItem item) {
    session.logoutUser();
    finish();
}

public void viewFish(android.view.View view) {
    android.util.Log.d(com.home.pete.aquarium.MainActivity.TAG, "Viewing my fish");
    startActivity(m_webview);
}

@java.lang.Override
public void load() {
    getLoaderManager().restartLoader(0, null, mLoaderCallbacks);
}

public void cleanup() {
    if ((mContext) == null)
        return ;
    
    commitPending();
    android.content.SharedPreferences globalPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    globalPrefs.unregisterOnSharedPreferenceChangeListener(this);
    mContext = null;
}

public void unsubscribeUpdates(com.example.jonathan.myapplication.GPSUpdate removeListener) {
    synchronized(this.notificationSetLock) {
        android.util.Log.d("GPS", (("Removing " + (removeListener.toString())) + " from GPS event listener pool."));
        this.notificationSet.remove(removeListener);
    }
}

protected void onDestroy() {
    super.onDestroy();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((getActivity()) == null) {
        return ;
    }
    startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
}

@java.lang.Override
public android.graphics.Bitmap onPreSetBitmap(android.widget.ImageView imageView, android.graphics.Bitmap loadedBitmap, java.lang.String url, boolean loadedFromCache) {
    return loadedBitmap;
}

@java.lang.Override
protected void onLoad(android.os.Bundle savedInstanceState) {
    super.onLoad(savedInstanceState);
}

@java.lang.Override
public void setSurface(android.view.Surface surface) {
    android.util.Log.d(com.example.xwalkproxy.XWalkExoMediaPlayer.TAG, "==== in setSurface ");
    player.setSurface(surface);
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((oldState) && ((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null))
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().start();
    
}

@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    inActionMode = true;
    mode.setTitle("select items");
    return true;
}

private void updateRecipeData(com.example.android.bakingapp.data.RecipeData data) {
    mRecipeData = data;
    if ((mDetailFragment) != null) {
        mDetailFragment.setRecipeData(mRecipeData);
    }
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
}

@java.lang.Override
public boolean updatePerson(net.hokiegeek.android.dondeestas.data.Person p) {
    android.util.Log.v(net.hokiegeek.android.dondeestas.datasource.DbSource.TAG, "updatePerson()");
    org.json.JSONObject resp = this.req(net.hokiegeek.android.dondeestas.datasource.DbSource.PATH_UPDATE_LOCATION, net.hokiegeek.android.dondeestas.Util.PersonToJson(p));
    return true;
}

@java.lang.Override
public void run() {
    notifyInterfaceClassActivity(type, DataConnectionRealTimeInfo.DC_POWER_STATE_HIGH, android.os.SystemClock.elapsedRealtimeNanos(), true);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_menu);
}

@java.lang.Override
public void onClick(android.view.View v) {
    floatingActionsMenu.collapse();
    startActivity(shts.jp.android.nogifeed.utils.ShareUtils.getShareBlogIntent(blog));
}

public void deleteAllChannel() {
    com.tcl.gc.popgrid.util.Db4oUtil.delAll(com.tcl.gc.popgrid.dao.CategoryItem.class);
}

@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    if (!(mInitSuccesful)) {
        initRecorder(mHolder.getSurface());
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int choice) {
    switch (choice) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}

private java.lang.String getAlbumTitleWithYearAsPrefix(android.database.Cursor cursor) {
    java.lang.String albumTitleWithYear = cursor.getString(MyLibrary.IDX_ALBUM);
    int releaseYear = cursor.getInt(MyLibrary.IDX_YEAR);
    if (releaseYear > 0) {
        albumTitleWithYear = (releaseYear + " - ") + albumTitleWithYear;
    }
    return albumTitleWithYear;
}

@java.lang.Override
public void onClick(android.view.View view) {
    dialog.dismiss();
}

@java.lang.Override
public void run() {
    notifyInterfaceClassActivity(params.type, DataConnectionRealTimeInfo.DC_POWER_STATE_LOW, android.os.SystemClock.elapsedRealtimeNanos(), false);
}

