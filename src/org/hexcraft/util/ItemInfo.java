package org.hexcraft.util;

public class ItemInfo
{
  int typeID;
  String description;
  
  public ItemInfo(int typeID)
  {
    this.typeID = typeID;
    this.description = null;
  }

  public ItemInfo(int typeID, String description)
  {
    this.typeID = typeID;
    this.description = description;
  }

  public String toString()
  {
    String returnValue = String.valueOf(this.typeID);
    if (this.description != null) returnValue = returnValue + ":" + this.description;

    return returnValue;
  }

  public static ItemInfo fromString(String string)
  {
    if ((string == null) || (string.isEmpty())) return null;

    String[] parts = string.split(":");
    if (parts.length < 2) return null;

    try
    {
      int typeID = Integer.parseInt(parts[0]);

      return new ItemInfo(typeID, parts[1]);
    }
    catch (NumberFormatException exception) {
    }
    return null;
  }
}