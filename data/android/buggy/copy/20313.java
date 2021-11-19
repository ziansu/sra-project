@java.lang.Override
public void handle(@org.jetbrains.annotations.NotNull
net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    if (!(com.teamwizardry.librarianlib.features.helpers.ItemNBTHelper.verifyExistence(stack, "uuid"))) {
        java.util.UUID uuid = java.util.UUID.randomUUID();
        com.teamwizardry.librarianlib.features.helpers.ItemNBTHelper.setUUID(stack, "uuid", uuid);
    }
}