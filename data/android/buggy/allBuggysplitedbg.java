@java.lang.Override
public void onBackPressed() {
    if ((bottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
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
    open();
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    if (activity instanceof com.thejakeofink.mountainviewgirlscamp.InitialPageActivity) {
        ((com.thejakeofink.mountainviewgirlscamp.InitialPageActivity) (activity)).registerFragmentHandler(mHandler);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    ru.mail.park.android_wikipedia.fragments.MainFragment.refresh();
    ru.mail.park.android_wikipedia.fragments.SavedArticlesFragment.refresh();
    new ru.mail.park.android_wikipedia.ServiceHelper().cleanDB(getActivity());
}

private void writeData(byte[] buf) throws java.io.IOException {
    android.util.Log.d(TAG, ("Sending: " + (java.util.Arrays.toString(buf))));
    m_device.write(buf, buf.length);
}

@java.lang.Override
public android.view.View getSelectedView() {
    throw new java.lang.UnsupportedOperationException("Not supported.");
}

@java.lang.Override
public void onClick(android.view.View v) {
    super.onClick(v);
    switch (v.getId()) {
        case R.id.index_user :
            startActivity(new android.content.Intent(mContext, com.zzn.aeassistant.activity.user.UserActivity.class));
            break;
    }
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.util.Log.d(com.mpfarmer.facebookintegration.FriendsActivity.TAG, ("onStop() " + (this.hashCode())));
}

void saveAs(android.content.Context context, android.net.Uri uri) {
    ca.rmen.android.poetassistant.main.reader.PoemFile.save(context, uri, poem.get().toString(), mPoemFileCallback);
}

public org.ramonaza.officialramonapp.people.rides.backend.RidesOptimizer setAlgorithm(int algorithm, boolean retainPreexisting) {
    this.algorithm = algorithm;
    this.retainPreexisting = retainPreexisting;
    android.util.Log.d("Opt", ("Algorithm Set: " + algorithm));
    return this;
}

public static void majTheme(android.content.Context context) {
    int theme = fr.ybo.transportsrennes.application.TransportsRennesApplication.getTheme(context);
    switch (theme) {
        case 1 :
            context.setTheme(R.style.Theme_TransportsRennes_black);
            break;
        default :
            context.setTheme(R.style.Theme_TransportsRennes);
            break;
    }
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    ((android.app.Activity) (getContext())).getApplication().unregisterActivityLifecycleCallbacks(this);
}

@java.lang.Override
public void onPushStatus(android.content.Context context, com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus pushSwitchStatus) {
    android.util.Log.i(com.jiang.android.push.flyme.FlymeReceiver.TAG, ("onPushStatus: " + (pushSwitchStatus.toString())));
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return finalView;
}

@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    fabDrawable.startTransition(500);
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.example.buzalo.OneProductActivity.BuyProduct().execute();
    android.widget.Toast.makeText(this, "Спасибо за покупку", Toast.LENGTH_SHORT).show();
}

private void sendData() {
    android.util.Log.d(org.astrobotics.ds2016.io.Protocol.TAG, "Adding Data to send queue");
    sendQueue.offer(new org.astrobotics.ds2016.io.Protocol.ControlData(controlData));
}

@java.lang.Override
public void onClick(android.view.View arg0) {
    android.content.Intent getIntent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    getIntent.setType("image/*");
    android.content.Intent pickIntent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    pickIntent.setType("image/*");
    startActivityForResult(pickIntent, nl.hu.fed.actortemplateapp.activity.CreatePerson.SELECT_PHOTO);
}

@java.lang.Override
public void onClick(android.view.View v) {
    textView1.setText(android.text.Html.fromHtml(getString(R.string.long_text_1)));
}

@java.lang.Override
public void onClick(android.view.View view) {
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    (quantity)--;
    quantityTextView.setText(java.lang.Integer.toString(quantity));
}

@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.school_course_base_fragment, container, false);
    return view;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (establishConnection()) {
        toast(R.string.successful_connection);
        mMessageView.setText(connection.getReply());
        writeHistory();
    }else {
        toast(R.string.failed_connection);
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("data_return", word);
    setResult(com.example.a99460.smartnote.RESULT_OK, intent);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, io.moffat.kitchenpal.AddItem.class);
    intent.putExtra(io.moffat.kitchenpal.ShoppingList.EXTRA_MESSAGE, "shoppingList");
    startActivity(intent);
}

@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull
es.uv.uvlive.data.gateway.response.MessageListResponse messageListResponse) {
    onMessagesReceived(messageListResponse);
    if ((messageListResponse.getMessages().size()) == 0) {
        endList = true;
        return ;
    }
}

public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    ((com.upc.fib.racopocket.MainMenuActivity) (getActivity())).setActionBarDesign("Notifications");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
    mTimer.schedule(mTimerTask, 5000, 3000);
}

@java.lang.Override
public void start(android.app.Activity activity, @android.support.annotation.NonNull
java.lang.String connectionName) {
    checkPermissions(activity, connectionName);
}

public void setOnItemClickListener(@android.support.annotation.Nullable
com.orhanobut.dialogplus.OnItemClickListener listener) {
    if (listener == null) {
        itemListener = listener;
    }
}

@java.lang.Override
public void onBackPressed() {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.example.stairs.MainActivity.class);
    startActivity(intent);
    this.finish();
    init();
}

public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH)) {
        clearSuggestions();
        fromEditingToSearch();
        return true;
    }
    return false;
}

@java.lang.Override
public void toNext() {
    android.net.Uri uri = getPlayInfoInner().nextOne(playRandomly());
    if (uri != null) {
        play(uri, 0);
    }else {
        stop();
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    finish();
    java.lang.System.exit(1);
}

@java.lang.Override
public void onClick(android.view.View view) {
    choiceC.setBackground(drw);
    choiceB.setBackgroundResource(0);
    choiceA.setBackgroundResource(0);
    answers[position] = 2;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(context, "添加", Toast.LENGTH_SHORT).show();
    ((org.bridge.activity.MainActivity) (context)).startPubNoteIntent();
}

private java.lang.String getToken() {
    return mSharedPreferences.getString(eu.marcocattaneo.androidinstagramconnector.connection.InstagramSession.PREF_SHARED_TOKEN, null);
}

@java.lang.Override
public void destroyItem(android.view.View container, int position, java.lang.Object object) {
    ((android.support.v4.view.ViewPager) (container)).removeView(views.get(position));
}

public static void stop(android.content.Context context) {
    if ((aditi.hangman.Music.mp) != null) {
        android.util.Log.v(aditi.hangman.Music.TAG, "stopping music");
        aditi.hangman.Music.mp.stop();
        aditi.hangman.Music.mp.release();
        aditi.hangman.Music.mp = null;
    }
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    view.onResetLocation();
    return true;
}

@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent event) {
    skyMapRenderer.handleDoubleTap(event);
    return true;
}

public static com.google.android.exoplayer.SimpleExoPlayer newSimpleInstance(android.content.Context context, com.google.android.exoplayer.TrackSelector trackSelector) {
    return com.google.android.exoplayer.ExoPlayerFactory.newSimpleInstance(context, trackSelector, null, false);
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.Intent intent;
    intent = new android.content.Intent(this, com.breadwallet.presenter.activities.MainActivity.class);
    startActivity(intent);
    if (!(isDestroyed())) {
        finish();
    }
}

@android.support.annotation.Nullable
@com.google.gson.annotations.SerializedName(value = "location")
@java.lang.SuppressWarnings(value = "mutable")
abstract double[] rawLocation();

@java.lang.Override
public void notifySuccessful() {
    android.widget.Toast.makeText(this.context, ((this.firstnameEditText) + (getString(R.string.user_registered_notify_message))), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected com.example.android.bakingapp.data.RecipeData doInBackground(java.lang.Void... voids) {
    com.example.android.bakingapp.data.RecipeData collection = com.example.android.bakingapp.tools.NetworkUtils.fetch();
    updateRecipeData(collection);
    return collection;
}

public void setSpinnerChoice(com.MagikSquirrel.backgammon.gameBoard gameBoard, int iChoice) {
    android.widget.ArrayAdapter aChoices = ((android.widget.ArrayAdapter) (_sSrcPoint.getAdapter()));
    int iPosition = aChoices.getPosition(java.lang.Integer.toString(iChoice));
    _sSrcPoint.setSelection(iPosition);
}

public java.lang.String BitMapPath(android.graphics.Bitmap bitmap) {
    return marketo.utils.MktoUtils.readPreference(activityContext, com.marketo.plugin.MarketoPlugin.KEY_FOR_NOTIFICATION_ICON);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((isKeyboardShown) && (tapBarMenu.isOpened())) {
        hideKeyboard(dialogView);
        return ;
    }
    tapBarMenu.toggle();
}

public static void initialize(android.content.Context context) {
    com.chenenyu.router.RealRouter.get().initMapping(context);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (((org.gtlp.yasb.SoundActivity.soundPlayerInstance) != null) && (org.gtlp.yasb.SoundActivity.soundPlayerInstance.isPlaying())) {
        org.gtlp.yasb.SoundActivity.soundPlayerInstance.pause();
    }
}

public void onClick(android.view.View v) {
    playerStrawSelected = false;
    coinCycle = genRand(2);
    dialog.dismiss();
    spinCoin();
}

@java.lang.Deprecated
public static synchronized org.empyrn.darkknight.bluetooth.BluetoothGameController getLastInstance(android.content.Context context) {
    if ((org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance) == null) {
        org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance = new org.empyrn.darkknight.bluetooth.BluetoothGameController(context);
        org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance.setDiscoverable(context);
    }
    return org.empyrn.darkknight.bluetooth.BluetoothGameController.mLastInstance;
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((SightingModel.model.getSightings().size()) == 0) {
        (alreadyRead)++;
        launchActivity2();
    }else {
        launchActivity3();
    }
}

public void updateText(java.lang.String newText) {
    android.util.Log.i("ContentView", ((("Calling update text for " + (name)) + " with value ") + (value)));
    value = newText;
    valueView.setText(value);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    auth.addAuthStateListener(authStateListener);
    android.util.Log.d(TAG, "MainActivity onStart: ");
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pay);
    event = getIntent().getParcelableExtra(com.niupiao.niupiao.activities.PayActivity.INTENT_KEY_FOR_EVENT);
    paymentManager = new com.niupiao.niupiao.managers.PaymentManager(event);
    show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.PURCHASE_TICKETS);
}

public void onPrepared(android.media.MediaPlayer player) {
    startPlayer();
    timePlay = 0;
    android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_PREPARED);
    intent.putExtra(AppConst.KEY_DURATION, player.getDuration());
    sendBroadcast(intent);
}

@org.chromium.base.annotations.CalledByNative
private void onIconAvailable(android.graphics.Bitmap icon) {
    mObserver.onIconAvailable(icon);
    mIsInitialized = true;
}

public void openFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().add(R.id.container_main, fragment).commit();
}

protected void addMarkerToMap(com.google.android.gms.maps.model.LatLng loc, int text) {
    com.google.maps.android.ui.IconGenerator iconFactory = new com.google.maps.android.ui.IconGenerator(this.getActivity());
    iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
    addIcon(iconFactory, java.lang.Integer.toString(text), loc);
}

@java.lang.Override
public void onBackPressed() {
    org.looa.vision.PrismSE.getInstant().finish(imageView);
    org.looa.vision.PrismSE.getInstant().overridePendingTransition(0, android.R.anim.fade_out);
}

@java.lang.Override
public boolean onGroupClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, long id) {
    return true;
}

public void setCenter(android.graphics.PointF center) {
    edu.kuzmik.MyLog.v("Sector, SetCenter");
    mCenter = center;
    notifyDataChanged();
}

@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    android.util.Log.d(com.pmdsolutions.gentiantestapp.SICActivity.TAG, ("Services Discovered: " + status));
    com.pmdsolutions.gentiantestapp.SICActivity.mHandler.sendMessage(android.os.Message.obtain(null, com.pmdsolutions.gentiantestapp.SICActivity.MSG_PROGRESS, "Enabling Sensors..."));
    reset();
    writeSecurity();
}

@java.lang.Override
public void onUpdate(boolean root, com.jecelyin.android.file_explorer.io.JecFile f) {
    isRoot = root;
    path = f;
}

public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.widget.Toast.makeText(getContext(), "child removed", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onSuccess(java.lang.Void aVoid) {
    android.widget.Toast.makeText(this, (url + " deleted successfully"), Toast.LENGTH_SHORT).show();
}

public void addRandomColor() {
    int rand = random.nextInt(4);
    java.lang.Integer randButtn = buttonArray[rand];
    computerColors.add(randButtn);
    android.util.Log.d("addRandomColorHasAdded", buttonArray[rand].toString());
}

private void replaceWithChatFragment() {
    it.polito.group05.group05.ChatFragment chat = it.polito.group05.group05.ChatFragment.newInstance();
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    fab.hide();
    transaction.replace(R.id.fragment_container, chat).commit();
}

private void drawSelf(android.graphics.Canvas canvas) {
    android.graphics.Paint paint = new android.graphics.Paint();
    paint.setColor(Color.BLUE);
    canvas.drawCircle(rx, ry, (2 * (radius)), paint);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
    dialog.cancel();
}

@java.lang.Override
public void onClick(android.view.View view) {
    registerPresenter.register(emailText.getText().toString(), nameText.getText().toString(), pwText.getText().toString());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        requestPermissions(new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE }, com.matthias.android.amginori.fragments.MainFragment.REQUEST_READ_EXTERNAL_STORAGE_CODE);
    }else {
        displayFileChooser();
    }
}

public void initSwipeListener() {
    android.support.v7.widget.helper.ItemTouchHelper.Callback vSwipeCallback = new za.co.dvt.taskify.utils.TaskSwipeHelper(mListAdapter, getApplicationContext());
    android.support.v7.widget.helper.ItemTouchHelper vHelper = new android.support.v7.widget.helper.ItemTouchHelper(vSwipeCallback);
    vHelper.attachToRecyclerView(rcToDOItems);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v.isFocused()) {
        com.dqhuynh.gplace.fragment.SearchFragment.selectedPlaceTypes.remove(v.getTag());
        v.setVisibility(View.GONE);
    }
}

protected void onPostExecute(xyz.pinaki.revlchallenge.data.ImageSearchResult result) {
    android.util.Log.i("PINAKI-onPostExecute", "onPostExecute");
    thumbnailRecyclerViewAdapter.update(result);
    thumbnailRecyclerViewAdapter.notifyDataSetChanged();
    offset = (offset) + (count);
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    update_storage();
    android.content.Intent intent = new android.content.Intent(this, com.example.matheus.taskbar.MainActivity.class);
    startActivity(intent);
    finishAffinity();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.v(TAG, "onCreateView()");
    mContentView = inflater.inflate(R.layout.fragment_now_playing, container, false);
    return mContentView;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable("disturbances", disturbances);
    outState.putLong("updated", lastUpdate.getMillis());
}

@java.lang.Override
protected void onPostExecute(java.lang.Integer z) {
    android.util.Log.d("This", this.mContext.getClass().toString());
    com.example.etaspare.stitchcounter.LibraryActivity context = ((com.example.etaspare.stitchcounter.LibraryActivity) (this.mContext));
    context.updateCursor();
}

@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String searchString = profileName.getText().toString();
    new it15ns.friendscom.grpc.GrpcTask(it15ns.friendscom.grpc.GrpcRunnableFactory.getSearchProfileRunnable(searchString, this), getApplicationContext()).execute();
}

private static boolean checkNeed(android.content.Context context) {
    return !(jp.hazuki.yuzubrowser.utils.PermissionUtils.getPref(context).getBoolean(jp.hazuki.yuzubrowser.utils.PermissionUtils.NO_NEED, false));
}

public void startFragment(android.app.Fragment fragment) {
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.create_workout_fragment_container, fragment);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}

@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    synchronized(this) {
        activityStack.pop();
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    Auth.GoogleSignInApi.signOut(mGoogleClient);
    com.example.jeobmallari.ilib.Home.super.onBackPressed();
}

@java.lang.Override
public boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        finish();
        startActivity(getIntent());
    }
    return true;
}

@java.lang.Override
public void onScaleEnd(android.view.ScaleGestureDetector detector) {
    super.onScaleEnd(detector);
    mediaAdapter.setOnClickListener(photosOnClickListener);
    mediaAdapter.setOnLongClickListener(photosOnLongClickListener);
    swipeRefreshLayout.setEnabled(true);
}

public static void storePictureToCollection(android.graphics.Bitmap bitmap, java.lang.String filename) throws java.lang.Exception {
    com.thirty.java.newsapp.PictureApi.storePictureToDir(bitmap, com.thirty.java.newsapp.PictureApi.getPictureCollectionDirectory().toString(), filename);
}

private void deleteIngredient(int position) {
    mIngredientList.remove(position);
    mAddList.remove(position);
    android.widget.Toast.makeText(mContext, "Ingredient removed!", Toast.LENGTH_SHORT).show();
    notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View v) {
    listener.onItemClicked(v, photo);
}

private void updateAccelerometer(final java.util.ArrayList<java.lang.Double> data) {
    android.app.Activity activity = activityRef.get();
    if (activity != null) {
    }
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_refresh)) {
        fetchWCList();
    }
    return true;
}

@java.lang.Override
public boolean onGroupClick(android.widget.ExpandableListView parent, android.view.View v, int groupPosition, long id) {
    startActivity(v.getContext(), groupPosition);
    return false;
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    setValue(getValue(numberPicker));
    dialog.dismiss();
    layout.removeView(numberPicker);
    onClose(true);
}

private java.util.List<android.net.Uri> extractInputUrlsFromIntent(android.content.Intent intent) {
    java.util.ArrayList<android.net.Uri> uris = intent.getParcelableArrayListExtra(vandy.mooc.assignments.assignment.activities.GalleryActivity.INTENT_EXTRA_URLS);
    if (validateInput(uris)) {
        return uris;
    }else {
        return new java.util.ArrayList<android.net.Uri>();
    }
}

public static void handlePowerGroupListener(com.google.firebase.database.ChildEventListener childEventListener, java.lang.String groupName) {
    android.util.Log.d(tomi.piipposoft.blankspellbook.PowerList.PowerListPresenter.TAG, ("handlePowerGroupListener: added new listener: " + childEventListener));
    tomi.piipposoft.blankspellbook.PowerList.PowerListPresenter.powerGroupListeners.put(childEventListener, groupName);
}

private void toggleLaridaar() {
    laridaarMode = !(laridaarMode);
    laridaarSetup();
    ((android.widget.SimpleAdapter) (((android.widget.HeaderViewListAdapter) (shabadView.getAdapter())).getWrappedAdapter())).notifyDataSetChanged();
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UploadService.TAG, "uploadFromUri:onSuccess");
    android.net.Uri downloadUri = taskSnapshot.getMetadata().getDownloadUrl();
    broadcastUploadFinished(downloadUri, fileUri);
    showUploadFinishedNotification(downloadUri, fileUri);
    taskCompleted();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_users, container);
}

@java.lang.Override
public void onPause() {
    android.util.Log.i(com.tapifolti.emotiondetection.EmotionDetectionFragment.TAG, "onPause() called");
    mAppIsResumed = false;
    mUIHandler.removeCallbacks(takePictureTask);
    closeCamera();
    stopBackgroundThreads();
    super.onPause();
}

