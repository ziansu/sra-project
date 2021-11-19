@java.lang.Override
public void onBackPressed() {
    if (((bottomSheetBehavior) != null) && ((bottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED))) {
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }else {
        super.onBackPressed();
    }
}

public void close() {
    android.view.View drawer = robo.activity.findViewById(R.id.navigation_drawer);
    android.support.v4.widget.DrawerLayout view = ((android.support.v4.widget.DrawerLayout) (robo.activity.findViewById(R.id.drawer_layout)));
    view.closeDrawer(drawer);
    updateOpenCloseState();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
}

private void refresh() {
    ru.mail.park.android_wikipedia.fragments.MainFragment.refresh();
    ru.mail.park.android_wikipedia.fragments.SavedArticlesFragment.refresh();
}

private void writeData(byte[] buf) throws java.io.IOException {
    m_device.write(buf, buf.length);
}

@java.lang.Override
public android.view.View getSelectedView() {
    return null;
}

@java.lang.Override
public void onClick(android.view.View v) {
    super.onClick(v);
    switch (v.getId()) {
        case R.id.index_user :
            startActivity(new android.content.Intent(mContext, com.zzn.aeassistant.activity.user.UserActivity.class));
            break;
        default :
            break;
    }
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.d(com.mpfarmer.facebookintegration.FriendsActivity.TAG, "onStop() ");
}

void saveAs(android.content.Context context, android.net.Uri uri) {
    ca.rmen.android.poetassistant.main.reader.PoemFile.save(context, uri, poem.get(), mPoemFileCallback);
}

public org.ramonaza.officialramonapp.people.rides.backend.RidesOptimizer setAlgorithm(int algorithm, boolean retainPreexisting) {
    this.algorithm = algorithm;
    this.retainPreexisting = retainPreexisting;
    return this;
}

public static void majTheme(android.content.Context context) {
    context.setTheme(fr.ybo.transportsrennes.application.TransportsRennesApplication.getTheme(context).getTheme());
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    if (activity == (getContext())) {
        ((android.app.Activity) (getContext())).getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}

@java.lang.Override
public void onPushStatus(android.content.Context context, com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus pushSwitchStatus) {
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((finalView) != null) {
        return finalView;
    }
    return super.onCreateView(inflater, container, savedInstanceState);
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.example.buzalo.OneProductActivity.BuyProduct().execute();
}

private void sendData() {
    sendQueue.offer(new org.astrobotics.ds2016.io.Protocol.ControlData(controlData));
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent getIntent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    getIntent.setType("image/*");
    android.content.Intent pickIntent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    pickIntent.setType("image/*");
    startActivityForResult(pickIntent, nl.hu.fed.actortemplateapp.activity.CreatePerson.SELECT_PHOTO);
}

@java.lang.Override
public void onClick(android.view.View v) {
    setText(android.text.Html.fromHtml(getString(R.string.long_text_1)));
}

@java.lang.Override
public void onClick(android.view.View view) {
    (quantity)--;
    quantityTextView.setText(java.lang.Integer.toString(quantity));
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.school_course_base_fragment, container, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    establishConnection();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, io.moffat.kitchenpal.AddItem.class);
    startActivity(intent);
}

@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull
es.uv.uvlive.data.gateway.response.MessageListResponse messageListResponse) {
    onMessagesReceived(messageListResponse);
    if ((messageListResponse.getMessages().size()) == 0) {
        endList = true;
    }
}

public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
    mTimer.schedule(mTimerTask, 5000, 5000);
}

@java.lang.Override
public void start(android.app.Activity activity, @android.support.annotation.NonNull
java.lang.String connectionName) {
    checkPermissions(activity, connectionName, true);
}

public void setOnItemClickListener(@android.support.annotation.Nullable
com.orhanobut.dialogplus.OnItemClickListener listener) {
    if (listener != null) {
        itemListener = listener;
    }
}

@java.lang.Override
public void onBackPressed() {
    finish();
}

public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH)) {
        clearSuggestions();
        fromEditingToSearch(true);
        return true;
    }
    return false;
}

@java.lang.Override
public void toNext() {
    android.net.Uri uri = getPlayInfoInner().nextOne(playRandomly());
    stop();
    if (uri != null) {
        play(uri, 0);
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    finish();
    java.lang.System.exit(0);
}

@java.lang.Override
public void onClick(android.view.View view) {
    choiceA.setBackground(drw);
    choiceB.setBackgroundResource(0);
    choiceC.setBackgroundResource(0);
    answers[position] = 1;
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((org.bridge.activity.MainActivity) (context)).startPubNoteIntent();
}

public java.lang.String getToken() {
    return mSharedPreferences.getString(eu.marcocattaneo.androidinstagramconnector.connection.InstagramSession.PREF_SHARED_TOKEN, null);
}

@java.lang.Override
public void destroyItem(android.view.View container, int position, java.lang.Object object) {
    ((android.support.v4.view.ViewPager) (container)).removeView(((android.view.View) (object)));
}

public static void stop(android.content.Context context) {
    if ((aditi.hangman.Music.mp) != null) {
        aditi.hangman.Music.mp.stop();
        aditi.hangman.Music.mp.release();
        aditi.hangman.Music.mp = null;
    }
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    return false;
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    return true;
}

public static com.google.android.exoplayer.SimpleExoPlayer newSimpleInstance(android.content.Context context, com.google.android.exoplayer.TrackSelector trackSelector) {
    return com.google.android.exoplayer.ExoPlayerFactory.newSimpleInstance(context, trackSelector, null);
}

@java.lang.Override
protected void onPause() {
    super.onPause();
}

@android.support.annotation.Nullable
@com.google.gson.annotations.SerializedName(value = "location")
@java.lang.SuppressWarnings(value = { "mutable" , "WeakerAccess" })
protected abstract double[] rawLocation();

@java.lang.Override
public void notifySuccessful() {
    android.widget.Toast.makeText(getContext(), ((this.firstnameEditText.getText().toString()) + (getString(R.string.user_registered_notify_message))), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected com.example.android.bakingapp.data.RecipeData doInBackground(java.lang.Void... voids) {
    com.example.android.bakingapp.data.RecipeData data = com.example.android.bakingapp.tools.NetworkUtils.fetch();
    updateRecipeData(data);
    return data;
}

public void setSpinnerChoice(int iChoice) {
    android.widget.ArrayAdapter aChoices = ((android.widget.ArrayAdapter) (_sSrcPoint.getAdapter()));
    int iPosition = aChoices.getPosition(java.lang.Integer.toString(iChoice));
    _sSrcPoint.setSelection(iPosition);
}

public java.lang.String BitMapPath() {
    return marketo.utils.MktoUtils.readPreference(activityContext, com.marketo.plugin.MarketoPlugin.KEY_FOR_NOTIFICATION_ICON);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (tapBarMenu.isOpened()) {
        hideKeyboard(dialogView);
    }
    tapBarMenu.toggle();
}

public static void initialize(android.content.Context context) {
    com.chenenyu.router.RealRouter.get().initMapping();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (((org.gtlp.yasb.SoundActivity.soundPlayerInstance.get()) != null) && (!(org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().isPlaying()))) {
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.get().start();
    }
}

public void onClick(android.view.View v) {
    playerStrawSelected = true;
    coinCycle = genRand(2);
    dialog.dismiss();
    spinCoin();
}

@java.lang.Deprecated
public static synchronized org.empyrn.darkknight.bluetooth.BluetoothGameController getLastInstance(android.content.Context context) {
    if ((org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance) == null) {
        org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance = new org.empyrn.darkknight.bluetooth.BluetoothGameController(context);
    }
    return org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance;
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((SightingModel.model.getSightings().size()) <= 1) {
        (alreadyRead)++;
        launchActivity2();
    }else {
        launchActivity3();
    }
}

public java.lang.String getName() {
    return name;
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.d(TAG, "MainActivity onStart: ");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pay);
    event = getIntent().getParcelableExtra(com.niupiao.niupiao.activities.PayActivity.INTENT_KEY_FOR_EVENT);
    paymentManager = new com.niupiao.niupiao.managers.PaymentManager(event, this);
    show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.PURCHASE_TICKETS);
}

public void onPrepared(android.media.MediaPlayer player) {
    error = false;
    startPlayer();
    timePlay = 0;
    android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_PREPARED);
    intent.putExtra(AppConst.KEY_DURATION, player.getDuration());
    sendBroadcast(intent);
}

@org.chromium.base.annotations.CalledByNative
private void onIconAvailable(android.graphics.Bitmap icon) {
    mIsInitialized = true;
    mObserver.onIconAvailable(icon);
}

public void openFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().replace(R.id.container_main, fragment).commit();
}

protected void addMarkerToMap(com.google.android.gms.maps.model.LatLng loc, int text) {
    com.google.maps.android.ui.IconGenerator iconFactory = new com.google.maps.android.ui.IconGenerator(getActivity());
    addIcon(iconFactory, java.lang.Integer.toString(text), loc);
}

@java.lang.Override
public void onBackPressed() {
    org.looa.vision.PrismSE.getInstant().finish(imageView);
}

@java.lang.Override
public boolean onGroupClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, long id) {
    return false;
}

public void setCenter(android.graphics.PointF center) {
    mCenter = center;
    notifyDataChanged();
}

@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    android.util.Log.d(com.pmdsolutions.gentiantestapp.SICActivity.TAG, ("Services Discovered: " + status));
    writeSecurity(gatt);
}

@java.lang.Override
public void onUpdate(com.jecelyin.android.file_explorer.io.JecFile f) {
    path = f;
}

public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
}

@java.lang.Override
public void onSuccess(java.lang.Void aVoid) {
    android.widget.Toast.makeText(this, (item + " deleted successfully"), Toast.LENGTH_SHORT).show();
}

public void addRandomColor() {
    int rand = random.nextInt(4);
    java.lang.Integer randButtn = buttonArray[rand];
    computerColors.add(randButtn);
}

private void replaceWithChatFragment() {
    it.polito.group05.group05.ChatFragment chat = it.polito.group05.group05.ChatFragment.newInstance();
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_container, chat).commit();
    fab.hide();
}

private void drawSelf(android.graphics.Canvas canvas) {
    android.graphics.Paint paint = new android.graphics.Paint();
    paint.setColor(Color.BLUE);
    canvas.drawCircle(rx, ry, radius, paint);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
}

@java.lang.Override
public void onClick(android.view.View view) {
    registerPresenter.register(emailText.getText().toString(), pwText.getText().toString(), nameText.getText().toString());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        displayFileChooser();
    }else {
        requestPermissions(new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE }, com.matthias.android.amginori.fragments.MainFragment.REQUEST_READ_EXTERNAL_STORAGE_CODE);
    }
}

public void initSwipeListener() {
    android.support.v7.widget.helper.ItemTouchHelper.Callback vSwipeCallback = new za.co.dvt.taskify.utils.TaskSwipeHelper(mListAdapter, this);
    android.support.v7.widget.helper.ItemTouchHelper vHelper = new android.support.v7.widget.helper.ItemTouchHelper(vSwipeCallback);
    vHelper.attachToRecyclerView(rcToDOItems);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.dqhuynh.gplace.fragment.SearchFragment.selectedPlaceTypes.remove(v.getTag());
    v.setVisibility(View.GONE);
}

protected void onPostExecute(xyz.pinaki.revlchallenge.data.ImageSearchResult result) {
    thumbnailRecyclerViewAdapter.update(result);
    thumbnailRecyclerViewAdapter.notifyDataSetChanged();
    offset = (offset) + (count);
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    update_storage();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mContentView = inflater.inflate(R.layout.fragment_now_playing, container, false);
    return mContentView;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((lastUpdate) != null) {
        outState.putSerializable("disturbances", disturbances);
        outState.putLong("updated", lastUpdate.getMillis());
    }
}

@java.lang.Override
protected void onPostExecute(java.lang.Integer z) {
    com.example.etaspare.stitchcounter.LibraryActivity context = ((com.example.etaspare.stitchcounter.LibraryActivity) (this.mContext));
    context.updateCursor();
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String searchString = profileName.getText().toString().toLowerCase();
    new it15ns.friendscom.grpc.GrpcTask(it15ns.friendscom.grpc.GrpcRunnableFactory.getSearchProfileRunnable(searchString, this), getApplicationContext()).execute();
}

public static boolean checkNeed(android.content.Context context) {
    return !(jp.hazuki.yuzubrowser.utils.PermissionUtils.getPref(context).getBoolean(jp.hazuki.yuzubrowser.utils.PermissionUtils.NO_NEED, false));
}

public void startFragment(android.app.Fragment fragment) {
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.create_workout_fragment_container, fragment);
    fragmentTransaction.commit();
}

@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    activityStack.remove(activity);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    if ((mGoogleClient) != null) {
        Auth.GoogleSignInApi.signOut(mGoogleClient);
        com.example.jeobmallari.ilib.Home.super.onBackPressed();
    }else {
        com.example.jeobmallari.ilib.Home.super.onBackPressed();
    }
}

@java.lang.Override
public boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        finish();
        startActivity(getIntent());
        return true;
    }
    return false;
}

@java.lang.Override
public void onScaleEnd(android.view.ScaleGestureDetector detector) {
    super.onScaleEnd(detector);
    swipeRefreshLayout.setEnabled(true);
}

private static void storePictureToCollection(android.graphics.Bitmap bitmap, java.lang.String filename) throws java.lang.Exception {
    com.thirty.java.newsapp.PictureApi.storePictureToDir(bitmap, com.thirty.java.newsapp.PictureApi.getPictureCollectionDirectory().toString(), filename);
}

private void deleteIngredient(int position) {
    mIngredientList.remove(position);
    mAddList.remove(position);
    notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((listener) != null)
        listener.onItemClicked(v, photo);
    
}

private void updateAccelerometer(final java.util.ArrayList<java.lang.Double> data) {
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    return true;
}

@java.lang.Override
public boolean onGroupClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, long id) {
    startActivity(v.getContext(), groupPosition);
    return true;
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    setValue(getValue(numberPicker));
    dialog.dismiss();
    onClose(true);
}

private java.util.List<android.net.Uri> extractInputUrlsFromIntent(android.content.Intent intent) {
    java.util.ArrayList<android.net.Uri> uris = intent.getParcelableArrayListExtra(vandy.mooc.assignments.assignment.activities.GalleryActivity.INTENT_EXTRA_URLS);
    if (validateInput(uris)) {
        return uris;
    }else {
        return null;
    }
}

public static void handlePowerGroupListener(com.google.firebase.database.ChildEventListener childEventListener, java.lang.String groupName) {
    android.util.Log.d(tomi.piipposoft.blankspellbook.PowerList.PowerListPresenter.TAG, ("handlePowerGroupListener: added new listener: " + childEventListener));
    tomi.piipposoft.blankspellbook.PowerList.PowerListPresenter.powerGroupListeners.put(groupName, childEventListener);
}

private void toggleLaridaar() {
    laridaarMode = !(laridaarMode);
    laridaarSetup();
    shabadView.getAdapter().notifyDataSetChanged();
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UploadService.TAG, "uploadFromUri:onSuccess");
    android.net.Uri downloadUri = taskSnapshot.getMetadata().getDownloadUrl();
    broadcastUploadFinished(downloadUri, fileUri);
    taskCompleted();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
}

@java.lang.Override
public void onPause() {
    android.util.Log.i(com.tapifolti.emotiondetection.EmotionDetectionFragment.TAG, "onPause() called");
    mAppIsResumed = false;
    mUIHandler.removeCallbacks(takePictureTask);
    stopBackgroundThreads();
    closeCamera();
    super.onPause();
}

