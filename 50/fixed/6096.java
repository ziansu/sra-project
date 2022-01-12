@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    _camera = new net.biospherecorp.umorse.SimpleCamera(_main);
    _camera.initCamera();
    _flashLight = _camera.new net.biospherecorp.umorse.SimpleCamera.FlashLight();
}