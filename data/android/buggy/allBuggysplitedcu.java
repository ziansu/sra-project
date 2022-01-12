@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map1844);
    whereClause = getIntent().getStringExtra("where");
    setUpMapIfNeeded(currentMap);
}

public void onRemoveClicked(android.view.View view) {
    cbpos1989.com.sqlitedatabase.DBHandler dbHandler = new cbpos1989.com.sqlitedatabase.DBHandler(getApplicationContext());
    dbHandler.removePerson(person.getId());
    setResult(1);
    finish();
}

@java.lang.Override
public void onStop() {
    android.util.Log.e(rocks.throw20.funwithcountries.GameActivityFragment.LOG_TAG, ("onStop " + true));
    cancelGame();
    super.onStop();
}

@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    try {
        return super.onInterceptTouchEvent(ev);
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
    }
    return false;
}

public android.support.v4.app.Fragment getFragment(ir.rasen.charsoo.view.fragment.search.FragmentSearch.SearchType searchType) {
    switch (searchType) {
        case PRODUCTS :
            return fragmentSearchProduct;
        case BUSINESSES :
            return fragmentSearchBusiness;
        case USERS :
            return fragmentSearchUser;
        default :
            return null;
    }
}

protected android.content.Context getContext() {
    return es.javocsoft.android.lib.toolbox.gcm.NotificationModule.APPLICATION_CONTEXT;
}

@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    data = event.values;
    if ((event.sensor.getType()) == 1) {
        android.util.Log.d("kuuntelija", ("voi ei!" + (randomi)));
    }
}

@java.lang.Override
public void onNetworkConnected() {
    android.util.Log.e("Network", "Network CONNNNNECTED");
    android.widget.Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show();
    sendLocation();
}

public void filter(java.lang.String searchTerm) {
    for (android.support.v4.app.Fragment currentFragment : fragments) {
        de.fhws.campusapp.fragment.ModuleListFragment moduleFragment = ((de.fhws.campusapp.fragment.ModuleListFragment) (currentFragment));
        if (moduleFragment.isVisible()) {
            moduleFragment.filter(searchTerm);
        }
    }
}

void onItemClicked(int mPosition, com.gnest.remember.data.SelectableMemo mMemo, android.widget.TextView mTextView);

protected void removeFilter(com.raizlabs.android.coreutils.functions.Predicate<T> filter) {
    this.filters.removePredicate(filter);
    update();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    se.chalmers.projektgrupplp4.studentlivinggbg.AccommodationRecyclerViewAdapter recyclerViewAdapter = new se.chalmers.projektgrupplp4.studentlivinggbg.AccommodationRecyclerViewAdapter(se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.Accommodation.getFavorites(), getApplicationContext());
    new se.chalmers.projektgrupplp4.studentlivinggbg.view.FavoritesView(this, recyclerViewAdapter);
    new se.chalmers.projektgrupplp4.studentlivinggbg.controller.FavoritesController(this, recyclerViewAdapter);
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    TAG = com.boun.swe.wawwe.App.getInstance().getString(R.string.title_menu_menuDetail);
}

java.lang.String[] parsingDate(java.lang.String nextEpisodedate) {
    java.lang.String[] date = nextEpisodedate.split("-");
    android.util.Log.d("CALENDAR", ("ParseDate: " + date));
    return date;
}

public com.afollestad.bridge.Config requestConverter(@android.support.annotation.NonNull
java.lang.String contentType, @android.support.annotation.Nullable
com.afollestad.bridge.conversion.base.RequestConverter converter) {
    if (converter == null)
        mRequestConverters.remove(contentType);
    else
        mRequestConverters.put(contentType, converter);
    
    return this;
}

public void initialize() {
    btnFind = ((android.widget.Button) (findViewById(R.id.btn_find)));
    btnFind.setOnClickListener(this);
    textOut = ((android.widget.TextView) (findViewById(R.id.textView2)));
}

@java.lang.Override
public void onDetach() {
    super.onDetach();
    _plot1.clear();
    _plot1 = null;
    android.util.Log.i(com.produce.ciro.bchart4.OrderBookFragment.TAG, "on detach");
}

@java.lang.Override
public void onDetach() {
    super.onDetach();
    android.util.Log.d(udacity.nanodegree.android.p2.model.movie.MoviesFragment.TAG, "onDetach: ");
    onMovieSelectedListener = OnMovieSelectedListener.EMPTY;
}

@java.lang.Override
public void onCameraUnavailable(@android.support.annotation.NonNull
java.lang.String cameraId) {
    super.onCameraUnavailable(cameraId);
    if (proto.ttt.cds.green_data.Class.SequencePictureTaker.DEBUG)
        android.util.Log.d(proto.ttt.cds.green_data.Class.SequencePictureTaker.TAG, ("onCameraUnavailable, id = " + cameraId));
    
    updateUnavailableCameras(("" + cameraId), true);
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
private void selectItem(final int position) {
    mDrawerLayout.closeDrawer(mDrawerList);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            onPostClosed(position);
        }
    }, 200);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((negativeListener) == null) {
        dismiss();
    }else {
        negativeListener.onClick(this, DialogInterface.BUTTON_NEGATIVE);
    }
}

@java.lang.Override
public void onNext(java.util.List<com.ayuget.redface.data.api.model.Category> categories) {
    android.util.Log.d(com.ayuget.redface.ui.BaseDrawerActivity.LOG_TAG, "onNext loadCategories ===");
    populateNavDrawerCategories(categories);
    onCategoriesLoaded();
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d("QR Fragment", "Pausing");
    mScannerView.stopCamera();
}

public void setDockIcon(java.lang.String packageName, java.lang.String componentName, android.widget.ImageView place) {
    setIconImpl(packageName, componentName, place, com.inipage.homelylauncher.icons.IconCache.DOCK_TASK);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    nl.mpcjanssen.simpletask.TodoApplication app = ((nl.mpcjanssen.simpletask.TodoApplication) (getApplication()));
    setTheme(app.getActiveTheme());
    setTheme(app.getActiveFont());
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View view) {
    publishNextWord();
    enableTranslationAndNotSubmittionButtons(true);
    questionnaire.markKnown(currentTranslation);
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((android.widget.TextView) (getActivity().findViewById(R.id.textToChange))).setText(("New text. And now, here's a number: " + (new java.util.Random().nextInt(100))));
}

@java.lang.Override
public void onError(java.lang.Throwable t) {
    android.util.Log.i(org.almende.proheal.MainActivity.TAG, "error: ", t);
    onConnectionError();
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    android.widget.Toast.makeText(getApplicationContext(), (((getString(R.string.location)) + (com.assignment.doormint.common.Constants.ST_COLON)) + location), Toast.LENGTH_SHORT).show();
    return true;
}

@java.lang.Override
protected void onMyLocationChanged(android.location.Location myLocationNew) {
    super.onMyLocationChanged(myLocationNew);
    if ((screenStatus) == (Const.MainUserStatus.START_TRIP)) {
        drawRoute(Const.DrawRouteUserTypes.STARTED_DRIVE, acceptedOrder, 100);
    }
}

@java.lang.Override
public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
    view.onApplyWindowInsets(windowInsets);
    mTopInset = windowInsets.getSystemWindowInsetTop();
    mUpButtonContainer.setTranslationY(mTopInset);
    updateUpButtonPosition();
    return windowInsets;
}

@android.annotation.TargetApi(value = 11)
private void setUpCameraGingerbread(final android.hardware.Camera camera) {
    try {
        mRenderer.setUpSurfaceTexture(camera);
        camera.setPreviewTexture(new android.graphics.SurfaceTexture(0));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
protected void onStart() {
    attachDatabaseReadListenerDeliveryStatus();
    attachDatabaseReadListenertoListView();
    super.onStart();
    com.george.getreadychat.UserToUserMessageNotification.isActiveNotification = true;
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(UserDetails.UserChatsWith, 1);
}

public void start_payment_activity(java.lang.String recipient_info, java.lang.String amount, java.lang.String note) {
    android.content.Intent venmoIntent = com.example.h.mogo.VenmoLibrary.openVenmoPayment("2843", "Mogo", recipient_info, amount, note, "pay");
    startActivityForResult(venmoIntent, 1);
    return ;
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.e("UTIL", "stop");
    saveData();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.mzwee.randrestaurant.YelpQuery.class);
    intent.putExtra("category", "mediterranean");
    startActivity(intent);
}

private void showMessage(android.os.Bundle args) {
    com.edulectronics.tinycircuit.Views.Message dialogFragment = new com.edulectronics.tinycircuit.Views.Message();
    dialogFragment.setArguments(args);
    dialogFragment.show(fragmentManager, "");
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.location.Location mCurrentLocation = location;
    android.widget.Toast.makeText(this, ("Point2 :" + (mCurrentLocation.getLatitude())), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onDestroy() {
    stopService(new android.content.Intent(this, techkids.com.android9_hackathon2_breakworkout.BroadcastService.class));
    android.util.Log.i(techkids.com.android9_hackathon2_breakworkout.views.AlarmScene.TAG, "Stopped service");
    super.onDestroy();
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<de.dominikwieners.androidhive.model.Post>> call, java.lang.Throwable t) {
    progressDoalog.dismiss();
    android.util.Log.d("RetrofitResponse", "Error");
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(takePictureIntent, nl.hu.fed.actortemplateapp.activity.CreatePerson.TAKE_PHOTO);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_results);
    db = new com.example.raqib.instadate.DatabaseTableForSearch(this);
    android.util.Log.e("Hello", "Search Is Working1");
    handleIntent(getIntent());
}

@java.lang.Override
public void attachView(android.view.View header, int i) {
    mParent.attachView(header, i);
}

@java.lang.Override
public void onClick(android.view.View v) {
    assignmentsLayoutManager.scrollToPositionWithOffset(getCurrentDayIndex(), 0);
    edu.byu.dtaylor.homeworknotifier.notifications.AlarmReceiver ar = new edu.byu.dtaylor.homeworknotifier.notifications.AlarmReceiver();
    ar.onReceive(this, null);
}

@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    mListView.clearChoices();
    deselectAll();
    mSelectedMap.clear();
    mActionMode = null;
}

@java.lang.Override
public void onLoginFailure(java.lang.String msg) {
    android.util.Log.d(com.curiosity.mycalendar.sysinfo.presenter.LoginPresenter.TAG, "onLoginFailure: ");
    mLoginView.showProgress(false);
    mLoginView.onLoginFailed();
    mLoginView.makeToast(msg);
}

private void setupViewPager(android.support.v4.view.ViewPager viewPager) {
    com.skywindow.app.tamed.MainActivity.ViewPagerAdapter adapter = new com.skywindow.app.tamed.MainActivity.ViewPagerAdapter(getSupportFragmentManager());
    adapter.addFragment(new com.skywindow.app.tamed.DogFragment(this), "DOG");
    viewPager.setAdapter(adapter);
}

public void onDrawerClosed(android.view.View drawerView) {
    updateBufferRead();
    updateBufferRead();
    ((com.iskrembilen.quasseldroid.gui.fragments.BufferFragment) (manager.bufferFragment)).finishActionMode();
    setTitleAndMenu();
}

@java.lang.Override
public void onLeScan(android.bluetooth.BluetoothDevice device, int rssi, byte[] scanRecord) {
    java.util.List<java.util.UUID> records = parseUuids(scanRecord);
    if (records.contains(serviceUUID))
        handleNewlyScannedDevice(device);
    else
        timber.log.Timber.d("Got advertisement which did not include target service");
    
}

@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    log("got a new intent");
    setIntent(intent);
}

private void applyClickEvents(com.linked_sys.hasatraining.adapters.TeacherAttendProgramsAdapter.MyViewHolder holder, final int position) {
    holder.courseRow.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            listener.onProgramRowClicked(position);
        }
    });
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    mSymbol = getArguments().getString(Constants.SYMBOL_BUNDLE_KEY).toUpperCase();
}

@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    canvas.save();
    drawBackground(canvas, mPaint);
    drawCenterDrawable(canvas, mDrawableCenter);
}

@java.lang.Override
public void onLoadMore() {
    android.util.Log.i(com.enthusiast94.reddit_reader.app.fragments.PostsFragment.TAG, "onLoadMore");
    loadPosts(subreddit, sort, after);
}

@java.lang.Override
public java.lang.Boolean call(java.util.List<com.ladwa.aditya.offlinefirstapp.data.local.models.Post> posts) {
    android.util.Log.d("Repo", posts.get(0).getTitle());
    return posts != null;
}

@java.lang.Override
public void onCaldroidViewCreated() {
    if ((caldroidFragment.getLeftArrowButton()) != null) {
        android.widget.Toast.makeText(getActivity().getApplicationContext(), "Caldroid view is created", Toast.LENGTH_SHORT).show();
    }
}

private void cancelAlarmManager() {
    android.util.Log.i(com.example.sifat.gobar.LOG_TAG_TAXIPOSITIONSERVICE, "cancelAlarmManager");
    android.content.Context context = getBaseContext();
    alarmManager.cancel(pendingIntent);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (btnSignUp)) {
        registerUser();
    }
    if (view == (btnLogInPrompt)) {
        finish();
        startActivity(new android.content.Intent(this, com.sarahrobinson.finalyearproject.activities.LoginActivity.class));
    }
}

@java.lang.Deprecated
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, com.github.aistech.orp.activities.ORPActivity thisActivity) {
    super.onCreate(savedInstanceState);
    initializingParsing(savedInstanceState);
}

@java.lang.Override
public void onClick(android.view.View v) {
    apiTest(com.awingcorsair.simpleweather.activity.ShowWeatherActivity.countyName);
    showWeather();
    android.widget.Toast.makeText(this, "更新完成", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    android.media.MediaPlayer.create(getApplicationContext(), R.raw.highway_info);
    delayedHide(100);
}

public void setData(java.lang.Object c, final android.content.Context context) {
    setData(c, context, View.GONE);
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas c) {
    b.setCanvas(c, getWidth(), getHeight());
    if ((board) != null)
        board.paint(b);
    
}

@java.lang.Override
public void onAudioTrackEvent(java.lang.String callerPackage, int event) throws android.os.RemoteException {
    device.onAudioTrackEvent(callerPackage, event);
    showToast(((callerPackage + ": AudioTrack ") + (audioTrackStateName(event))));
}

public double answerForQ5() {
    android.widget.RadioButton radioButton = ((android.widget.RadioButton) (findViewById(R.id.five_radio_button)));
    if (radioButton.isSelected()) {
        overallScore += 1;
    }
    return overallScore;
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    com.wpam.scrabble.mobile.bt.BluetoothManager.getInstance().startDiscovery();
    com.wpam.scrabble.mobile.bt.BluetoothManager.getInstance().cancelDiscovery();
}

@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.HONEYCOMB))
        return ;
    
    int color;
}

private void getCamera() {
    if ((myCamera) == null) {
        try {
            myCamera = android.hardware.Camera.open();
            myParameters = myCamera.getParameters();
        } catch (java.lang.RuntimeException e) {
            throw e;
        }
    }
}

@java.lang.Override
public void onResume() {
    getActivity().registerReceiver(mConnectivityReceiver, new android.content.IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION));
    getLocalBroadcastManager().registerReceiver(mBroadcastReceiver, getIntentFilter());
    super.onResume();
    updateUI();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, ca.ualberta.cs.cmput301w15t12.NewAccountActivity.class);
    intent.putExtra("username", name);
    startActivity(intent);
}

@java.lang.Override
public barqsoft.footballscores.widget.RemoteViewsFactory onGetViewFactory(final android.content.Intent intent) {
    android.util.Log.e("RemoteService", "onGetViewFactory");
    return new barqsoft.footballscores.widget.WidgetFactory(this.getApplicationContext(), intent);
}

private void connectToGoogleClientAPIandSendMessage() {
    if (!(mResolvingError)) {
        mGoogleApiClient.connect();
        android.widget.Toast.makeText(this, "connecting", Toast.LENGTH_SHORT).show();
    }
}

public static boolean getBoolean(android.content.Context context, java.lang.String name) {
    android.content.SharedPreferences settings = context.getSharedPreferences(duxeye.com.entourage.Utility.Utility.ENTOURAGE_DATA, 0);
    return settings.getBoolean(name, false);
}

@java.lang.Override
public void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, android.os.Bundle newOptions) {
    context.startService(new android.content.Intent(context, kamini.app.moviecollection.widget.MovieWidgetIntentService.class));
}

private void showSnackbar(@android.support.annotation.StringRes
int messageId) {
    android.support.design.widget.Snackbar.make(getView().getRootView(), messageId, Snackbar.LENGTH_SHORT).show();
}

@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(fyp.qian3.lib.srv.PedoEventService.TAG, "Srv onBind()");
    updateDatabase();
    return mBinder;
}

public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putFloat(com.idonans.app.DoodleActionPanel.EXTRA_SIZE, mSize);
    outState.putInt(com.idonans.app.DoodleActionPanel.EXTRA_ALPHA, mAlpha);
    outState.putInt(com.idonans.app.DoodleActionPanel.EXTRA_COLOR, mColor);
    outState.putInt(com.idonans.app.DoodleActionPanel.EXTRA_BRUSH_TYPE, mBrushType);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onListItemSelectedListener(getName);
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    de.beacon.tom.viibenav_radiomapper.model.BluetoothScan.getBtScan(this).onResumeOperation();
    init();
    android.util.Log.d(de.beacon.tom.viibenav_radiomapper.controller.InfoActivity.TAG, "RESUMING IN INFO");
}

@java.lang.Override
public void onPixelUnselected() {
    pixelColorView.setBackgroundColor(android.graphics.Color.parseColor("#FFFFFFFF"));
    pixelColorSeekbar.setProgress(0);
    pixelColorNumber.setText("");
    pixelXText.setText("");
    pixelYText.setText("");
}

private void setAnswerShownResult(boolean isAnswerShown) {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(com.microlands.android.geoquiz.CheatActivity.EXTRA_ANSWER_SHOWN, isAnswerShown);
    mIsAnswerShown = isAnswerShown;
    setResult(com.microlands.android.geoquiz.RESULT_OK, data);
}

public void setSubtitle(java.lang.String title) {
    this.title = title;
    android.support.v7.app.ActionBar actionBar = ((ua.boberproduction.floristx.MainActivity) (getActivity())).getSupportActionBar();
    if (actionBar != null) {
        actionBar.setSubtitle(title);
    }
}

private void checkPermissions() {
    java.lang.String[] requestPermissions = getPermissionsRequestArray(io.straas.android.sdk.streaming.demo.ScreencastSettingsActivity.STREAM_PERMISSIONS);
    if ((requestPermissions.length) != 0) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, requestPermissions, io.straas.android.sdk.streaming.demo.ScreencastSettingsActivity.STREAM_PERMISSION_REQUEST);
    }
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    return (gestureDetector.onTouchEvent(ev)) || (super.onTouchEvent(ev));
}

public void labelTouch(android.view.View v) {
    if (mResolutionLayoutVisible) {
        return ;
    }
    finishWithResult("label");
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((mItemAdapter) != null) {
        outState.putString(com.muqdd.iuob2.features.schedule_builder.SectionsFilterActivity.SECTIONS_LIST, new com.google.gson.Gson().toJson(mItemAdapter.getAdapterItems(), com.muqdd.iuob2.features.schedule_builder.SectionsFilterActivity.SECTIONS_LIST_TYPE));
    }
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onClick(android.view.View view) {
    showImageMetadata(image1, "image1");
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    currentLocation = LocationServices.FusedLocationApi.getLastLocation(mApiClient);
    if ((currentLocation) != null) {
        animateCamera(currentLocation.getLatitude(), currentLocation.getLongitude());
    }
}

@java.lang.Override
public void onLoginSuccess(studios.codelight.smartloginlibrary.users.SmartUser user) {
    android.widget.Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();
    refreshLayout();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera_activity2);
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
    startActivityForResult(intent, com.toogooddesign.selfiesmash.CameraActivity2.request_image_capture);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPluginManager = org.cobaltians.cobalt.plugin.CobaltPluginManager.getInstance(mContext);
    setRetainInstance(true);
    mAllowCommit = true;
}

@java.lang.Override
public void onClick(android.view.View view) {
    currentLocationButton.setEnabled(false);
    android.widget.Toast.makeText(getActivity(), getResources().getString(R.string.fetching_data), Toast.LENGTH_SHORT).show();
    new com.sanchez.geoopposite.MainFragment.LaunchMapTask().execute();
}

private void setupRecyclerView() {
    gridView.setLayoutManager(new android.support.v7.widget.GridLayoutManager(this, gridSize));
    adapter = new mobile.theopenvoicefactory.org.theopenvoicefactory.adapter.GridAdapter(this, mGrid);
    gridView.setAdapter(adapter);
}

@java.lang.Override
public java.lang.Boolean call(java.lang.CharSequence username, java.lang.CharSequence pwd, java.lang.Boolean isChecked) {
    return ((!(com.alibaba.android.arouter.utils.TextUtils.isEmpty(username))) && (!(com.alibaba.android.arouter.utils.TextUtils.isEmpty(username)))) && isChecked;
}

@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    com.snapsigns.utilities.FireBaseUtility fireBaseUtility = new com.snapsigns.utilities.FireBaseUtility(this);
    myImageSigns = fireBaseUtility.getUserSigns();
    sendBroadcast(fireBaseUtility.mySignsIntent);
    startLocationUpdates();
}

@java.lang.Override
public void onClick(android.view.View view) {
    crossfade(findViewById(R.id.content_main_id), findViewById(R.id.content_add_date_id), getResources().getInteger(android.R.integer.config_mediumAnimTime));
}

java.util.ArrayList<java.lang.String> getArrayStringFromAssets(android.app.Activity activity) {
    android.content.res.AssetManager am = activity.getAssets();
    return convertStreamToArrayString(activity);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_list, container, false);
    timesTxt = ((android.widget.TextView) (view.findViewById(R.id.listTimes)));
    return view;
}

public void onNewApiaryFragmentInteraction(android.net.Uri uri);

@java.lang.Override
public void onHandshakeResponse(java.lang.String reply) {
    if (!(reply.startsWith("ERROR"))) {
        android.util.Log.d(edu.mtu.cs3421.voto.MainActivity.TAG, "Handshake Recieved");
        startSession();
    }
}

