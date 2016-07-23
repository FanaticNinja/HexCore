package org.hexcraft;

import java.lang.reflect.Modifier;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class HexCore extends JavaPlugin {
	
	public Logger log = Logger.getLogger("Minecraft");
	public Gson gson;
	
	public HexCore()
	{
		if (gson == null)
		{
			gson = getGsonBuilder().create();
		}
	}
	
	// -------------------------------------------- //
	// ENABLE
	// -------------------------------------------- //
	
	private long timeEnableStart;
	public boolean preEnable()
	{
		timeEnableStart = System.currentTimeMillis();
		
		log("[" + this.getDescription().getName() + " " + this.getDescription().getVersion() + "] " + "=== ENABLE START ===");
		//log("=== ENABLE START ===");
		
		// Create Gson
		gson = this.getGsonBuilder().create();
		
		return true;
	}
	
	public void postEnable()
	{
		log("[" + this.getDescription().getName() + " " + this.getDescription().getVersion() + "] " + "=== ENABLE COMPLETE ==="+ " (Took "+(System.currentTimeMillis()-timeEnableStart)+"ms)");
		//log("=== ENABLE " + this.getDescription().getName() + " COMPLETE " + this.getDescription().getVersion() + " (Took "+(System.currentTimeMillis()-timeEnableStart)+"ms) ===");
		
	}
	
	// -------------------------------------------- //
	// DISABLE
	// -------------------------------------------- //
	
	public void onDisable()
	{
		log("Disabled");
	}
	
	// -------------------------------------------- //
	// GSON
	// -------------------------------------------- //
	
	public GsonBuilder getGsonBuilder()
	{
		return new GsonBuilder()
		.serializeNulls()
		.setPrettyPrinting()
		.disableHtmlEscaping()
		.excludeFieldsWithModifiers(Modifier.TRANSIENT);
	}
	
	
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void onEnable()
	{
		
		if ( ! preEnable()) return;
		
		this.postEnable();
	}
	
	public void log(String entry)
    {
      log.info(entry);
    }

}