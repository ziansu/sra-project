public int getTxDataSize(org.opendaylight.yangtools.yang.binding.InstanceIdentifier<?> instanceIdentifier) {
    return this.txDataMap.containsKey(instanceIdentifier) ? this.txDataMap.get(instanceIdentifier).size() : 0;
}