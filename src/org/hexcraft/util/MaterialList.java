package org.hexcraft.util;

import java.util.List;

public class MaterialList {

    public static void parseMaterialListFromConfig(List<String> stringsToParse, MaterialCollection matCol)
    {
    	matCol.clear();

    	for (int i = 0; i < stringsToParse.size(); i++)
    	{
    		MaterialInfo materialInfo = MaterialInfo.fromString(stringsToParse.get(i));
    		
    		if (materialInfo == null)
    		{
    			//AddLogEntry("ERROR: Unable to read a material entry from the config file.  Please update your config.yml.");

    			if (!stringsToParse.get(i).contains("can't"))
    			{
    				stringsToParse.set(i, stringsToParse.get(i) + "     <-- can't understand this entry, see BukkitDev documentation");
    			}
    			//return false;

			}
			else
			{
				matCol.Add(materialInfo);
			}
    	}
    	
		//return true;
    }
	
}
