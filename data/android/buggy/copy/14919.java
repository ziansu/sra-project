public void setRunInReverse(boolean set) {
    _runInReverse = set;
    if (_runInReverse) {
        _forward = false;
    }else {
        _forward = true;
    }
}