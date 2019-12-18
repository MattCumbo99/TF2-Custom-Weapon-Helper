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
public class Weapon {
    
    private final int index;
    private final String name;
    private final String weapon_class;
    
    /**
     * Creates a new weapon under the database. Use 
     * https://wiki.alliedmods.net/Team_Fortress_2_Item_Definition_Indexes
     * @param index Index of the weapon
     * @param name Name of the weapon
     * @param weapon_class The classname of the weapon
     */
    public Weapon(int index, String name, String weapon_class){
        this.index = index;
        this.name = name;
        this.weapon_class = weapon_class;
    }
    
    public int getIndex(){
        return index;
    }
    
    public String getName(){
        return name;
    }
    
    public String getWeaponClass(){
        return weapon_class;
    }
}
