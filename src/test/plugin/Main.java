package test.plugin;
import com.company.UniquePluginID;

import omega.IDE;
public class Main {
	public static void main(String[] args){
		IDE.main(args);
		UniquePluginID plugin = new UniquePluginID();
		plugin.init();
		plugin.enable();
	}
}
