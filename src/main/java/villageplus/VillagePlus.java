package villageplus;

import net.minecraft.init.Blocks;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import villageplus.world.gen.structure.StructureVillagePlusPieces;

@Mod(modid = VillagePlus.MODID, version = VillagePlus.VERSION)
public class VillagePlus
{
    public static final String MODID = "village-plus";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        StructureVillagePlusPieces.registerVillagePlusPieces();
        StructureVillagePlusPieces.registerVillageCreationHandler();
    }
}
