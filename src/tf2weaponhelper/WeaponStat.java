/*
 * Copyright (C) 2019 Matthew Cumbo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tf2weaponhelper;

/**
 *
 * @author Matthew Cumbo
 */
public class WeaponStat {
    
    private final int id;
    private final String name, desc, type;
    private double value;
    private final boolean is_positive;
    
    /**
     * Creates a new weapon stat. Use this link:
     * https://wiki.teamfortress.com/wiki/List_of_item_attributes
     * @param id Identification number of the attribute
     * @param is_positive This stat is a positive effect
     * @param name Name of the attribute
     * @param desc Description of the attribute
     * @param type Value type of the attribute
     */
    public WeaponStat(int id, boolean is_positive, String name, String desc, String type){
        this.id = id;
        this.is_positive = is_positive;
        this.name = name;
        this.desc = desc;
        this.type = type;
        value = 0.0;
    }
    
    /**
     * Gets the ID number of the stat.
     * @return Stat ID number.
     */
    public int getId(){
        return id;
    }
    
    /**
     * Checks if the stat is a positive effect.
     * @return true if the stat is a positive effect
     */
    public boolean isPositive(){
        return is_positive;
    }
    
    /**
     * Gets the name of the stat.
     * @return Stat name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Gets the description of the stat.
     * @return Stat description
     */
    public String getDescription(){
        return desc;
    }
    
    /**
     * Gets the type of value of the stat.
     * @return Stat type
     */
    public String getType(){
        return type;
    }
    
    /**
     * Gets the current value of the stat.
     * @return Stat value
     */
    public double getValue(){
        return value;
    }
    
    /**
     * Sets the stat's value.
     * @param val Value to set the stat to
     */
    public void setValue(double val){
        value = val;
    }
    
    /**
     * Replaces the %s1's in the description with the real value.
     * @return formatted description
     */
    public String displayAttrib(){
        return desc.replaceAll("%s1", Integer.toString((int)value));
    }
    
    /**
     * Gets the string format of a weapon stat.
     * @return String example: 1 | Damage boost | gives a damage bonus | percentage
     */
    @Override
    public String toString(){
        return (id + " | " + name + " | " + desc + " | " + type);
    }
}
