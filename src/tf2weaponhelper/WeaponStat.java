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
    
    private int id;
    private String name;
    private String desc;
    private int type;
    
    /**
     * Creates a new weapon stat. Use this link:
     * https://wiki.teamfortress.com/wiki/List_of_item_attributes
     * @param id Identification number of the attribute
     * @param name Name of the attribute
     * @param desc Description of the attribute
     * @param type Value type of the attribute. 0=percentage, 1=inverted_percentage, 2=additive, 3=constant
     */
    public WeaponStat(int id, String name, String desc, int type){
        if(type < 0 || type > 3 || id < 1)
            throw new IllegalArgumentException();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
    }
}
