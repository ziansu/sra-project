@java.lang.Override
protected void onPostExecute(byte[] bytes) {
    super.onPostExecute(bytes);
    reliUser.setAvatar(bytes);
}