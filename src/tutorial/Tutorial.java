package tutorial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Tutorial.MODID, name = Tutorial.NAME, version = Tutorial.VERSION)
@NetworkMod(clientSideRequired = true)

public class Tutorial {
	public static final String MODID = "Tutorial";
	public static final String NAME = "Forge Modding Tutorials";
	public static final String VERSION = "Tutorialling";
}
