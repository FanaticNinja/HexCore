package org.hexcraft.util;

import java.util.List;

public class ItemList {
	
	public static void parseItemListFromConfig(List<String> stringsToParse, ItemCollection itemCol)
    {
		itemCol.clear();
		
		for (int i = 0; i < stringsToParse.size(); i++)
		{
			ItemInfo itemInfo = ItemInfo.fromString(stringsToParse.get(i));
		
		    if (itemInfo == null)
		    {
		    	//AddLogEntry("ERROR: Unable to read a item entry from the config file.  Please update your config.yml.");
		
				if (!stringsToParse.get(i).contains("can't"))
				{
					stringsToParse.set(i, stringsToParse.get(i) + "     <-- can't understand this entry: (example 101:Stick)");
				}
		    }
		    else
		    {
		    	itemCol.Add(itemInfo);
		    }
		}
    }

}
