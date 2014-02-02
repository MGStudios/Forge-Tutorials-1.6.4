package tutorial.proxy;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class CommonProxy {
	public void initSounds() {}
	
	public void initRenderers() {}

	public void initConfig(File modConfigurationDirectory) {
		File configFile = new File(modConfigurationDirectory, "MGStudios/Tutorial.cfg");
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		config.save();
	}

	public void initContent() {}
}
