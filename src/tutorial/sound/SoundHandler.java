package tutorial.sound;

import tutorial.Tutorial;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundHandler {
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSoundLoaded(SoundLoadEvent event) {
		// Usage: world.playSoundEffect(x + 0.5, y + 0.5, z  + 0.5, Tutorial.Reference.ASSETS + ":" + "hurt", 1.0F, 1.0F);
		
		event.manager.addSound(Tutorial.Reference.ASSETS + ":" + "hurt1.ogg");
		event.manager.addSound(Tutorial.Reference.ASSETS + ":" + "hurt2.ogg");
	}
}
