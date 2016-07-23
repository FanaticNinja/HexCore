package org.hexcraft.util;

import java.util.ArrayList;

public class ItemCollection
{
  ArrayList<ItemInfo> items = new ArrayList<ItemInfo>();

  public void Add(ItemInfo item)
  {
	  this.items.add(item);
    //for (int i = 0; (i < this.items.size()) && (((ItemInfo)this.items.get(i)).typeID <= item.typeID); i++)
	  //for (int i = 0; i < this.items.size(); i++)
    //{
    	//this.items.add(i, item);
   // }
    	
  }

  public boolean Contains(ItemInfo item)
  {
    for (int i = 0; i < this.items.size(); i++)
    {
    	ItemInfo thisMaterial = (ItemInfo)this.items.get(i);
      if (item.typeID == thisMaterial.typeID)
      {
        return true;
      }
    }

    return false;
  }

  public String toString()
  {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < this.items.size(); i++)
    {
      stringBuilder.append(((ItemInfo)this.items.get(i)).toString() + " ");
    }

    return stringBuilder.toString();
  }

  public int size()
  {
    return this.items.size();
  }

  public void clear()
  {
    this.items.clear();
  }
}