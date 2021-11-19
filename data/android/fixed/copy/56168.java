private static void untrack(long address) {
    if (address == (NULL))
        return ;
    
    org.lwjgl.system.MemoryManage.DebugAllocator.Allocation allocation = org.lwjgl.system.MemoryManage.DebugAllocator.ALLOCATIONS.remove(address);
    if (allocation == null)
        throw new java.lang.IllegalStateException("The memory address specified is not being tracked");
    
}