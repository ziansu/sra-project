public static synchronized com.github.vatbub.common.core.Common getInstance() {
    if ((com.github.vatbub.common.core.Common.instance) == null) {
        com.github.vatbub.common.core.Common.instance = new com.github.vatbub.common.core.Common();
    }
    return com.github.vatbub.common.core.Common.instance;
}