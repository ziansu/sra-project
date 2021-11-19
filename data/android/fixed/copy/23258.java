public java.lang.Object Get_by_or_fail(int key) {
    synchronized(tmp_key) {
        return hash.Get_by_or_fail(tmp_key.Val_(key));
    }
}