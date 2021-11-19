@java.lang.Override
public void free(long ptr) {
    allocator.free(ptr);
    org.lwjgl.system.MemoryManage.DebugAllocator.untrack(ptr);
}