package org.hexcraft.util;

import java.util.ArrayList;

public class MaterialCollection
{
  ArrayList<MaterialInfo> materials = new ArrayList<MaterialInfo>();

  public void Add(MaterialInfo material)
  {
	  this.materials.add(material);
    //for (int i = 0; (i < this.materials.size()) && (((MaterialInfo)this.materials.get(i)).typeID <= material.typeID); i++)
    	//this.materials.add(i, material);
  }
  
  public MaterialInfo ContainsReturnName(MaterialInfo material)
  {
    for (int i = 0; i < this.materials.size(); i++)
    {
      MaterialInfo thisMaterial = (MaterialInfo)this.materials.get(i);
      if ((material.typeID == thisMaterial.typeID) && ((thisMaterial.allDataValues) || (material.data == thisMaterial.data)))
      {
        return thisMaterial;
      }
    }

    return null;
  }

  boolean Contains(MaterialInfo material)
  {
    for (int i = 0; i < this.materials.size(); i++)
    {
      MaterialInfo thisMaterial = (MaterialInfo)this.materials.get(i);
      if ((material.typeID == thisMaterial.typeID) && ((thisMaterial.allDataValues) || (material.data == thisMaterial.data)))
      {
        return true;
      }
    }

    return false;
  }

  public String toString()
  {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < this.materials.size(); i++)
    {
      stringBuilder.append(((MaterialInfo)this.materials.get(i)).toString() + " ");
    }

    return stringBuilder.toString();
  }

  public int size()
  {
    return this.materials.size();
  }

  public void clear()
  {
    this.materials.clear();
  }
}