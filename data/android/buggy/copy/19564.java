private void heapify(int count, nl.weeaboo.lua2.vm.LuaValue cmpfunc) {
    for (int start = (count / 2) - 1; start >= 0; --start) {
        siftDown(start, (count - 1), cmpfunc);
    }
}