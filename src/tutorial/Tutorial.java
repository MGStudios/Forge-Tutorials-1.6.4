package tutorial;

import tutorial.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Tutorial.Reference.MODID, name = Tutorial.Reference.NAME, version = Tutorial.Reference.VERSION)
@NetworkMod(clientSideRequired = true)

public class Tutorial {
	@Instance(Reference.MODID)
	public static Tutorial instance;
	
	@SidedProxy(clientSide = Reference.PROXY + ".ClientProxy", serverSide = Reference.PROXY + ".CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.initConfig(event.getModConfigurationDirectory());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.initContent();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	public static class Reference {
		public static final String MODID = "Tutorial";
		public static final String NAME = "Forge Modding Tutorials";
		public static final String VERSION = "Tutorialling";
		
		public static final String PROXY = "tutorial.proxy";
		
		public static final String TEXTURE = "tutorial";
	}
}
