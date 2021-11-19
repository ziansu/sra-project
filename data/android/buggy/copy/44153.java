public static yellow5a5.nougatnetworktool.NougatNetworkTool getInstance() {
    if ((yellow5a5.nougatnetworktool.NougatNetworkTool.mInstance) == null) {
        synchronized(yellow5a5.nougatnetworktool.NougatNetworkTool.obj) {
            if ((yellow5a5.nougatnetworktool.NougatNetworkTool.mInstance) == null) {
                return new yellow5a5.nougatnetworktool.NougatNetworkTool();
            }
        }
    }
    return yellow5a5.nougatnetworktool.NougatNetworkTool.mInstance;
}