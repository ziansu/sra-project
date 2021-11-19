public void messageFromReceiver(java.lang.String message) {
    com.example.leonid.chatzilla.Chat.ChatFactory.addBackgroundText(getActivity(), message).doTask();
    com.example.leonid.chatzilla.Utilities.UtilitiesFactory.appendFile(getActivity(), AppController.mPhoneNum, message).doTask();
}