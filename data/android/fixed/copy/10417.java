@java.lang.Override
@javax.annotation.Nonnull
public java.lang.String apply(@javax.annotation.Nonnull
net.minecraft.item.ItemStack input) {
    return com.jaquadro.minecraft.storagedrawers.block.EnumKeyType.byMetadata(input.getMetadata()).getName();
}