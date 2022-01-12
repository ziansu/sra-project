@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.yourowndecisionlayout);
    this.getResources().openRawResource(R.raw.decisiontreexml);
    setStartOverBtn();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(Config.TAG, "BroadcastReceiver.onReceive()");
    android.support.v4.content.LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this);
    mLastErrorCode = intent.getIntExtra(ApiRequestService.EXTENDED_ERROR_CODE, ErrorCode.NO_ERROR);
    onContentChanged();
}

public void updateAfterSingIn(net.brainas.android.app.infrustructure.UserAccount userAccount) {
    tasksManager = new net.brainas.android.app.domain.helpers.TasksManager(taskDbHelper, accountsManager.getCurrentAccountId());
}

@java.lang.Override
public void onLocationFound(android.location.Location location) {
    android.widget.Toast.makeText(getApplicationContext(), ("Latitude - " + (location.getLatitude())), Toast.LENGTH_SHORT).show();
}

@com.google.gwt.uibinder.client.UiHandler(value = "closeIpadBtn")
public void onIpadCloseClick(com.google.gwt.event.dom.client.ClickEvent clickEvent) {
    ipadSectiondiv.setVisible(false);
    androidSectiondiv.setVisible(false);
    org.ednovo.gooru.shared.util.StringUtil.IPAD_MESSAGE_Close_Click = true;
    org.ednovo.gooru.client.mvp.play.collection.body.CollectionPlayerMetadataView.onClosingAndriodorIpaddiv();
    org.ednovo.gooru.client.mvp.play.resource.body.ResourcePlayerMetadataView.onClosingAndriodorIpaddiv();
}

public retrofit2.Call<java.util.List<kis.agh.edu.pl.childrensupervisiorandroid.database.Task>> getTasksCall() {
    retrofit2.Call<java.util.List<kis.agh.edu.pl.childrensupervisiorandroid.database.Task>> tasksCall = service.getTasks(parentName, childName);
    java.util.List<kis.agh.edu.pl.childrensupervisiorandroid.database.Task> tasks = null;
    return tasksCall;
}

@com.squareup.otto.Subscribe
public void subscribe(today.gacha.android.services.GachaLocationService.LastLocationEvent event) {
    assertFalse(event.isSuccess());
    assertNull(event.getLocation());
    latch.countDown();
}

@java.lang.Override
public boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        getFragmentManager().popBackStack();
    }
    return false;
}

@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    mDrawerToggle.onConfigurationChanged(newConfig);
    if ((newConfig.orientation) != (prevOrientation)) {
        rotated = true;
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.d("*******", "*******************");
    onCreateProductList();
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    android.widget.Toast.makeText(context, ("you clicl on" + prefName), Toast.LENGTH_SHORT).show();
    return false;
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.ListView listView = ((android.widget.ListView) (parent));
    java.lang.String item = ((java.lang.String) (listView.getSelectedItem()));
}

private void putHomeFragmentInTop(boolean back) {
    headertextview.setText(getResources().getString(R.string.principaltext).toUpperCase());
    selectFragment(com.udl.android.bloodpressuremonitor.fragments.HomeFragment.getNewInstace(), true, back);
}

void datainicial() {
    values = filmData.getAllFilmstitol();
    listViewAdapter = new android.widget.ArrayAdapter<com.example.pr_idi.movierecord.Film>(getActivity().getApplicationContext(), R.layout.list_item, R.id.txtitem, values);
    listView.setAdapter(listViewAdapter);
}

public android.database.Cursor radomDateQuery() {
    java.lang.String dateOfDay = com.example.huiweidong.Reminder.DateOfDay.getDateOfDay();
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor c = db.rawQuery("SELECT _id, CONTACT_PERSON,REPEATSNR,REPEATSINTERVAL,UNSHARPENNR,RADOMDATE FROM Reminder_tabledb WHERE RADOMDATE = ?", new java.lang.String[]{ dateOfDay });
    return c;
}

private void open(android.app.Fragment fragment, java.lang.String tag) {
    if ((fragmentManager) != null) {
        fragmentManager.beginTransaction().add(R.id.main_container, fragment).addToBackStack(tag).commit();
    }
}

public void pauseAtCurrentLocation() {
    com.o3dr.android.client.apis.ControlApi.getApi(this).pauseAtCurrentLocation();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.i("GEOFENCE MONITORING", "onLocationChanged ");
    mLastLocation = location;
    tellFragmentLocationChanged();
    requestAllGeofences();
}

@java.lang.Override
public void onSuccess(java.lang.Void aVoid) {
    android.widget.Toast.makeText(this, "Geofences added", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    listener.onAnimationEnd(view);
    view.setVisibility(View.GONE);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((checkbox.getVisibility()) == (android.view.View.VISIBLE)) {
        return ;
    }
    org.catrobat.catroid.ui.fragment.FormulaEditorFragment.showFragment(view, this, getFormulaWithBrickField(BrickField.ROBOME_MOVE_CYCLES));
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        onItemClickListener.onItemClick(holder.itemView, position);
    }
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent event) {
    this.onTouchEvent(event);
    return true;
}

public int getFriendListVersion() {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(preferenceFileName, Context.MODE_PRIVATE);
    return sharedPreferences.getInt("friendListVersion", 0);
}

protected void visitComponent(@android.support.annotation.NonNull
com.oakonell.dndcharacter.model.character.BaseCharacterComponent component) {
    result.addAll(component.getFeatures());
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    it.bsdsoftware.library.BSDImage image = adapter.getItem(position);
    it.bsdsoftware.library.BSDUtility.handleClickItem(getActivity(), image, gallery);
}

@java.lang.Override
public void onDeined(java.lang.String[] dinedPermissions) {
    android.widget.Toast.makeText(this, "无法获取所有权限", Toast.LENGTH_SHORT).show();
    for (java.lang.String permission : dinedPermissions) {
        android.util.Log.e("ss", ("被拒绝的权限:" + permission));
    }
}

@java.lang.Override
protected void doOnCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.d("TEST", "IMPOSSIBLE");
    mainPresenter.setupView();
}

public boolean loadCategories(android.view.MenuItem menuItem) {
    java.lang.System.out.println("------> Attempt to reload categories!");
    listAdapter.setItemCategories(categoryManager.getAllCategories());
    java.lang.System.out.println(("------> Item Categories: " + (categoryManager.getAllCategories())));
    expListView.collapseGroup(0);
    return true;
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    in[0] = langList.get(position);
    validate();
}

@java.lang.Override
public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state) {
    super.onLayoutChildren(recycler, state);
    if ((getOrientation()) == (HORIZONTAL)) {
        detachAndScrapAttachedViews(recycler);
        fill(recycler);
        mAncorPos = 0;
    }
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    com.mintminter.simplelockscreen.Util.putValue(this, Common.KEY_COUNTER, i);
}

public void setClickThreshold(float clickThreshold) {
    if ((clickThreshold < 0) || (clickThreshold > 1.0F))
        android.util.Log.e(TAG, "clickThreshold must range from 0...1.0f inclusive");
    else
        this.clickThreshold = clickThreshold;
    
}

public void getHashtag(java.lang.String name, com.google.firebase.database.ValueEventListener listener) {
    android.util.Log.d("___", name);
    com.google.firebase.database.DatabaseReference dataRef = ref.child("Hashtags").child(name);
    dataRef.addValueEventListener(listener);
}

private void startScan(android.view.View v) {
    btScan.setText(getString(R.string.stop));
    resultContainer.removeAllViewsInLayout();
    showStartNotification();
    presenter.startScan();
}

private void showJoke(java.lang.String jokeString) {
    android.content.Intent jokeViewIntent = new android.content.Intent(this, com.example.eamon.jokeviewer.JokeViewActivity.class);
    jokeViewIntent.putExtra(JokeViewActivity.EXTRA_JOKE, com.example.JokeWizard.getJoke());
    this.startActivity(jokeViewIntent);
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.util.Log.i("onDestroy: ", "called");
}

@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    canvas.drawColor(Color.BLACK);
    note.update(canvas);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mIndexView.readyGoForResult(com.android.yzd.memo.mvp.ui.activity.EditActivity.class);
}

private void signOut() {
    Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
        @java.lang.Override
        public void onResult(com.google.android.gms.common.api.Status status) {
            updateUI(false);
        }
    });
}

protected android.location.Location getBusLocation() {
    return cl.smartcities.isci.transportinspector.positionProvider.PositionProvider.getInstance().getLastKnownLocation();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int which) {
    dialog.dismiss();
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    if ((mAlbumType) != (com.loopeer.android.librarys.imagegroupview.activity.AlbumActivity.TAKE_PHOTO))
        getSupportLoaderManager().initLoader(com.loopeer.android.librarys.imagegroupview.activity.AlbumActivity.LOADER_ID_FOLDER, null, this);
    
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_sort_key)));
    getActionBar().setDisplayHomeAsUpEnabled(true);
}

public static android.graphics.drawable.Drawable getImageResourceByName(android.app.Activity context, java.lang.String imageName) {
    java.lang.String packageName = context.getPackageName();
    int resId = context.getResources().getIdentifier(imageName, "drawable", packageName);
    return context.getDrawable(resId);
}

private int getApplicationVersionCode() {
    try {
        return this.getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
    } catch (android.content.pm.PackageManager e) {
        throw new java.lang.RuntimeException(e.getMessage());
    }
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mCurrentLocation = location;
    mLastUpdateTime = java.text.DateFormat.getTimeInstance().format(new java.util.Date());
    android.widget.Toast.makeText(this, "Location Updated", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onChange(io.realm.RealmResults<com.zhan.budget.Model.Realm.Account> element) {
    element.removeChangeListener(this);
    android.util.Log.d(com.zhan.budget.Fragment.AccountFragment.TAG, "there's a change in results account ");
    accountList = myRealm.copyFromRealm(element);
    accountRecyclerAdapter.setAccountList(accountList);
    populateAccountWithInfo(true);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    A.db.setTransactionSuccessful();
    A.db.endTransaction();
    dialog.cancel();
    act.goHome();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.busao.gyn.stops.list.StopListFragment();
        case 1 :
            return com.busao.gyn.stops.map.BusaoMapFragment.newInstance();
    }
    return null;
}

public void onClick(android.content.DialogInterface dialog, int which) {
    bound.disconnectAll(true, false);
    waitingForDisconnectAll = false;
    setIntent(new android.content.Intent());
    if (closeOnDisconnectAll) {
        finish();
    }
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> l, android.view.View v, int position, long id) {
    adapter.changeSelection(position);
}

public static boolean optionsItemSelected(com.gcode.notes.activities.compose.list.ComposeListActivity composeListActivity, android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
        case android.R.id.home :
            com.gcode.notes.activities.helpers.compose.list.ComposeListSaveHelper.saveList(composeListActivity);
            composeListActivity.finish();
    }
    return false;
}

public static void i(java.lang.String tag, java.lang.String m) {
    android.util.Log.d(tag, m);
    com.newsblur.util.Log.add(com.newsblur.util.Log.I, tag, m, null);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (moviePlayer.isPlaying()) {
        moviePlayer.pause();
    }else {
        try {
            moviePlayer.play();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

@java.lang.Override
public void adapterrefresh(java.util.List<dev.eyesless.simple_weather_for_fishermans.weather_response_classes.Datum> mylist, boolean isdatanew) {
    cfinterface.adapterrefresh(mylist, isdatanew);
    android.util.Log.e("MY_TAG", ("refreshing adapter on presenter " + isdatanew));
}

@java.lang.Override
public void run() {
    io.kuzzle.demo.demo_android.BlinkingMarker marker = markerList.get(userId);
    if (marker != null)
        marker.stopBlinking().removeMarker();
    
}

@java.lang.Override
public void onItemCheckedStateChanged(android.view.ActionMode mode, int position, long id, boolean checked) {
    customImageSelectAdapter.toggleSelection(position, checked);
    mode.setTitle(((java.lang.String.valueOf(customImageSelectAdapter.getCountSelected())) + " selected"));
}

public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            overridePendingTransition(R.anim.slide_out_left_to_right, R.anim.slide_in_left_to_right);
            return true;
    }
    return super.onOptionsItemSelected(item);
}

public void setAnswerShownResult(boolean isAnswerShown) {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(com.akimov.android.geoquiz.CheatActivity.EXTRA_ANSWER_IS_SHOWN, isAnswerShown);
    setResult(com.akimov.android.geoquiz.RESULT_OK, data);
}

public static long readLongPreference(android.content.Context context, java.lang.String preferenceToRead) {
    android.content.SharedPreferences preferences = context.getSharedPreferences(context.getString(R.string.shared_prefs_name), Context.MODE_PRIVATE);
    long preference = preferences.getLong(preferenceToRead, java.lang.System.currentTimeMillis());
    return preference;
}

@java.lang.Override
public void onError(@android.support.annotation.NonNull
android.hardware.camera2.CameraDevice camera, int error) {
    cameraDevice.close();
    cameraDevice = null;
}

private void emptyEntries() {
    java.lang.String deleteQuery = "DELETE FROM " + (Data.RSDBhandler.TABLE_NAME);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    db.execSQL(deleteQuery);
}

@java.lang.Override
public void onStart() {
    android.util.Log.d(TAG, "onStart - start");
    super.onStart();
    linLayout.removeAllViews();
    createInterface();
    android.util.Log.d(TAG, "onStart - finish");
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    boolean retry = true;
    while (retry) {
        try {
            thread.join();
            retry = false;
        } catch (java.lang.InterruptedException e) {
        }
    } 
}

@java.lang.Override
public void onClick(android.view.View v) {
    for (int i = 0; i < (children.priorSels.length); i++) {
        children.priorSels[i] = -1;
    }
    children.priorSels[childPosition] = 1;
    notifyItemChanged(groupPosition);
}

public void measureCurrentView(android.view.View currentView) {
    mCurrentView = currentView;
    this.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            requestLayout();
        }
    });
}

@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    java.lang.System.out.print("email: ");
    android.content.Intent intent = new android.content.Intent(this, com.example.mrides.MainActivity.class);
    startActivity(intent);
}

public static void showText(android.content.Context context, java.lang.String message) {
    android.widget.Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void run() {
    saveCallRecord(1);
    android.view.animation.Animation animation = new android.view.animation.AlphaAnimation(1.0F, 0.0F);
    animation.setDuration(800);
    rootContainer.startAnimation(animation);
    finish();
}

@java.lang.Override
protected void onPostExecute(byte[] result) {
    mProgressDialog.dismiss();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), luc.edu.neuroscienceapp.activities.ImageChannelConversionActivity.class);
    luc.edu.neuroscienceapp.entities.Global.bytesBitmap = result;
    startActivity(intent);
}

@butterknife.OnClick(value = R.id.reload_text)
public void reloadTextViewClick(android.widget.Button button) {
    refreshData();
}

@java.lang.Override
public void onError() {
    android.util.Log.d(be.ugent.zeus.hydra.viewpager.ImagePagerAdapter.TAG, "Image error");
    progressBar.setVisibility(View.GONE);
}

@java.lang.Override
public int compare(android.hardware.Camera.Size a, android.hardware.Camera.Size b) {
    return ((b.width) * (b.height)) - ((a.width) * (a.height));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.d(com.example.vincentmonot.rpgmanager.CharacterSheetActivity.TAG, "Cancelling");
    dialog.cancel();
}

public void getRandomUser(android.view.View view) {
    getRandomJSON();
    nameTV.setText(com.example.test2w3.MainActivity.NAME);
    addressTV.setText(com.example.test2w3.MainActivity.ADDRESS);
    emailTV.setText(com.example.test2w3.MainActivity.EMAIL);
    getImageFromURL();
}

public android.view.View findViewByCard(com.example.james.cardsuite.Card card) {
    for (android.widget.ImageView view : cardViews) {
        if (view.getTag().equals(card))
            return view;
        
    }
    return null;
}

@android.support.annotation.NonNull
public android.content.Intent getFeedbackEmailIntent(@android.support.annotation.NonNull
final java.lang.String[] emailAddresses, @android.support.annotation.NonNull
final java.lang.String emailSubjectLine, @android.support.annotation.NonNull
final android.net.Uri screenshotUri) {
    final android.content.Intent emailIntent = getBaseFeedbackEmailIntent(emailAddresses, emailSubjectLine);
    emailIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
    emailIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
    return emailIntent;
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String rejectedReason = editTextRejectedReason.getText().toString();
    requisition.setRemarks(rejectedReason);
    finish();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    com.example.microfan.tag_emulation.FragmentObject2.instance = this;
    android.view.View rootView = inflater.inflate(R.layout.write_tag_fragment, container, false);
    mainView = rootView;
    SetDefaultText(rootView);
    SetOnClickListeners(rootView);
    return rootView;
}

public static void showLogin(android.app.Fragment fragment, int requestCode) {
    android.content.Intent intent = new android.content.Intent(fragment.getContext(), com.airmap.airmapsdk.ui.activities.LoginActivity.class);
    fragment.startActivityForResult(intent, requestCode);
}

public boolean isReady() {
    com.raizlabs.android.dbflow.data.Blob form = tracingFormDao.getTracingForm().getForm();
    return form != null;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getApplicationContext(), "Deixar na base para continuar depois", Toast.LENGTH_SHORT).show();
    finish();
}

@java.lang.Override
public void onPurchaseHistoryRestored() {
    android.widget.Toast.makeText(this, "restore previous purchase", Toast.LENGTH_SHORT).show();
    ADS_REMOVED = isRemoveAdsPurchased();
}

public cs.android.viewbase.CSView<T> text(int resId, java.lang.Object... formatArgs) {
    asTextView().setText(cs.java.lang.Lang.format(cs.android.viewbase.CSView.getStringResource(resId), formatArgs));
    return this;
}

@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    presenter.onCreateView();
    preCreateView();
    android.app.Dialog result = createDialog(savedInstanceState);
    postCreateView(result, savedInstanceState);
    return result;
}

@java.lang.Override
public void onClick(android.view.View view) {
    hostWillingness = 15;
    mServiceBroadcastingHandler.postDelayed(mServiceBroadcastingRunnable, com.semaphore_soft.apps.cypher.MainActivity.SERVICE_BROADCASTING_INTERVAL);
    discoverService();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    android.app.FragmentTransaction fm = getFragmentManager().beginTransaction();
    fm.replace(R.id.fragment_container, new finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment());
    fm.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    fm.commit();
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    d.onTouchEvent(event);
    return false;
}

public void setEmptyView(android.view.View emptyView) {
    mEmptyView = emptyView;
    addView(mEmptyView, new com.dexafree.materialList.view.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    checkIfEmpty();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(mobileoak.volleyballtracker.adapter.RosterAdapter.TAG, ("Got a click on " + (player.getName())));
    if ((mListener) != null) {
        mListener.rowSelected(player);
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    questionAnswerAdapter.setShowAnswer(true);
    submitButton.setText(R.string.finish);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    android.widget.CheckBox randomCheckBox = ((android.widget.CheckBox) (findViewById(R.id.random)));
    randomCheckBox.setChecked(random);
}

@java.lang.Override
public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    android.util.Log.d(com.lukedeighton.wheelsample.AttendantActivity.TAG, ("beforeTextChanged:" + s));
}

public void setOnItemClickListener(final com.loyalium.cpuloyal.tipcalc.models.TipRecord element, final com.loyalium.cpuloyal.tipcalc.adapters.OnItemClickListener onItemClickListener) {
    itemView.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(element);
            }
        }
    });
}

public void stopService() {
    android.util.Log.d(com.github.pires.obd.reader.io.MockObdGatewayService.TAG, "Stopping service..");
    notificationManager.cancel(com.github.pires.obd.reader.io.NOTIFICATION_ID);
    jobsQueue.clear();
    isRunning = false;
    stopSelf();
}

public void onClick(android.view.View v) {
    com.mun.minh_minhh.interlac.Server.writeReview(new com.mun.minh_minhh.interlac.Review("john", "lol,shit", 0, 2));
}

public static com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please doNextWithRequestCode(android.content.Context context, int requestCode) {
    return new com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please(context, com.idevicesinc.sweetblue.utils.BluetoothEnabler.BluetoothEnablerListener.Please.DO_NEXT_WITH_REQUEST_CODE, requestCode);
}

public void deleteFood() {
    int rowsDeleted = databaseAdapter.deleteFood(foodId);
    if (rowsDeleted == 1) {
        android.widget.Toast.makeText(getActivity(), "Food deleted", Toast.LENGTH_SHORT).show();
        onFoodSaved.onFoodSavedSuccessfully();
    }
}

private int getReplyTo() {
    android.util.Log.i(logTag, ("returning replyto " + (radioReplyTo.indexOfChild(findViewById(radioReplyTo.getCheckedRadioButtonId())))));
    return radioReplyTo.indexOfChild(findViewById(radioReplyTo.getCheckedRadioButtonId()));
}

