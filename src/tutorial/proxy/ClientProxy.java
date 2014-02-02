package tutorial.proxy;

import net.minecraftforge.common.MinecraftForge;
import tutorial.sound.SoundHandler;

public class ClientProxy extends CommonProxy {
	@Override
	public void initSounds() {
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
	
	@Override
	public void initRenderers() {
	}
}
