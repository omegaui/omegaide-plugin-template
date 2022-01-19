package com.company;
import java.net.URL;

import omega.plugin.Plugin;
import omega.plugin.PluginCategory;
public class UniquePluginID implements Plugin{
	@Override
	public boolean init() {
		System.out.println("Got Initialized...");
		return true;
	}
	
	@Override
	public boolean enable() {
		System.out.println("Got Enabled...");
		return true;
	}
	
	@Override
	public boolean disable() {
		System.out.println("Got Disbaled...");
		return true;
	}

	@Override
	public URL getImage() {
		try{
			return getClass().getResource("/plugin.png");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String getName() {
		return "Plugin Name";
	}
	
	@Override
	public String getVersion() {
		return "vIDEVersion";
	}
	
	@Override
	public String getPluginCategory() {
		return PluginCategory.ANY_CATEGORY;
	}
	
	@Override
	public String getDescription() {
		return "Single line short description";
	}
	
	@Override
	public String getAuthor() {
		return "Company/Author Name";
	}
	
	@Override
	public String getLicense() {
		return "GNU GPL v3";
	}
	
	@Override
	public boolean needsRestart() {
		return false;
	}
	
	@Override
	public String getSizeInMegaBytes() {
		return "0.001 MB";
	}
	
}
