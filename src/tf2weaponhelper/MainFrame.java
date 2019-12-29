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

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Matthew Cumbo
 */
public class MainFrame extends javax.swing.JFrame {

    private ArrayList<Weapon> weapons;
    private ArrayList<WeaponStat> stats, addedStats;
    
    private DefaultListModel<String> positiveStats, negativeStats;
    
    private WeaponStat curWeaponStat;
    
    private String wepNumber, classname, index, slot, quality, level, attribs, ammo;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initWeaponDatabase();
        initStatDatabase();
        initValues();
    }
    
    /**
     * Initializes the string values from the default selected ones.
     */
    private void initValues(){
        wepNumber = "10000";
        classname = "tf_weapon_scattergun";
        index = "13";
        slot = "0";
        quality = "0";
        level = "1";
        attribs = "";
        ammo = "20";
        curWeaponStat = new WeaponStat(1, false, "damage penalty", "%s1% damage penalty", "percentage");
    }
    
    private void initWeaponDatabase(){
        weapons = new ArrayList<>();
        
        //Scout primary
        weapons.add(new Weapon(13, "Scattergun", "tf_weapon_scattergun"));
        weapons.add(new Weapon(45, "Force-A-Nature", "tf_weapon_scattergun"));
        weapons.add(new Weapon(220, "The Shortstop", "tf_weapon_handgun_scout_primary"));
        weapons.add(new Weapon(448, "The Soda Popper", "tf_weapon_soda_popper"));
        weapons.add(new Weapon(669, "Festive Scattergun", "tf_weapon_scattergun"));
        weapons.add(new Weapon(772, "Baby Face's Blaster", "tf_weapon_pep_brawler_blaster"));
        weapons.add(new Weapon(799, "Silver Botkiller Scattergun Mk.I", "tf_weapon_scattergun"));
        weapons.add(new Weapon(808, "Gold Botkiller Scattergun Mk.I", "tf_weapon_scattergun"));
        weapons.add(new Weapon(888, "Rust Botkiller Scattergun Mk.I", "tf_weapon_scattergun"));
        weapons.add(new Weapon(897, "Blood Botkiller Scattergun Mk.I", "tf_weapon_scattergun"));
        weapons.add(new Weapon(906, "Carbonado Botkiller Scattergun Mk.I", "tf_weapon_scattergun"));
        weapons.add(new Weapon(915, "Diamond Botkiller Scattergun Mk.I", "tf_weapon_scattergun"));
        weapons.add(new Weapon(964, "Silver Botkiller Scattergun Mk.II", "tf_weapon_scattergun"));
        weapons.add(new Weapon(973, "Gold Botkiller Scattergun Mk.II", "tf_weapon_scattergun"));
        weapons.add(new Weapon(1078, "Festive Force-A-Nature", "tf_weapon_scattergun"));
        weapons.add(new Weapon(1103, "The Back Scatter", "tf_weapon_scattergun"));
        //Scout secondary
        weapons.add(new Weapon(23, "Scout's Pistol", "tf_weapon_pistol"));
        weapons.add(new Weapon(46, "Bonk! Atomic Punch", "tf_weapon_lunchbox_drink"));
        weapons.add(new Weapon(163, "Crit-A-Cola", "tf_weapon_lunchbox_drink"));
        weapons.add(new Weapon(222, "Mad Milk", "tf_weapon_jar_milk"));
        weapons.add(new Weapon(294, "Lugermorph", "tf_weapon_pistol"));
        weapons.add(new Weapon(449, "The Winger", "tf_weapon_handgun_scout_secondary"));
        weapons.add(new Weapon(773, "Pretty Boy's Pocket Pistol", "tf_weapon_handgun_scout_secondary"));
        weapons.add(new Weapon(812, "The Flying Guillotine", "tf_weapon_cleaver"));
        weapons.add(new Weapon(1121, "Mutated Milk", "tf_weapon_jar_milk"));
        weapons.add(new Weapon(1145, "Festive Bonk!", "tf_weapon_lunchbox_drink"));
        weapons.add(new Weapon(30666, "The C.A.P.P.E.R.", "tf_weapon_pistol"));
        //Scout melee
        weapons.add(new Weapon(0, "Bat", "tf_weapon_bat"));
        weapons.add(new Weapon(44, "The Sandman", "tf_weapon_bat_wood"));
        weapons.add(new Weapon(221, "The Holy Mackerel", "tf_weapon_bat_fish"));
        weapons.add(new Weapon(264, "Frying Pan", "saxxy"));
        weapons.add(new Weapon(317, "The Candy Cane", "tf_weapon_bat"));
        weapons.add(new Weapon(325, "The Boston Basher", "tf_weapon_bat"));
        weapons.add(new Weapon(349, "Sun-on-a-Stick", "tf_weapon_bat"));
        weapons.add(new Weapon(355, "The Fan O'War", "tf_weapon_bat"));
        weapons.add(new Weapon(423, "Saxxy", "saxxy"));
        weapons.add(new Weapon(450, "The Atomizer", "tf_weapon_bat"));
        weapons.add(new Weapon(452, "Three-Rune Blade", "tf_weapon_bat"));
        weapons.add(new Weapon(474, "The Conscientious Objector", "saxxy"));
        weapons.add(new Weapon(572, "Unarmed Combat", "tf_weapon_bat_fish"));
        weapons.add(new Weapon(648, "The Wrap Assassin", "tf_weapon_bat_giftwrap"));
        weapons.add(new Weapon(660, "Festive Bat", "tf_weapon_bat"));
        weapons.add(new Weapon(880, "The Freedom Staff", "saxxy"));
        weapons.add(new Weapon(939, "The Bat Outta Hell", "saxxy"));
        weapons.add(new Weapon(954, "The Memory Maker", "saxxy"));
        weapons.add(new Weapon(999, "Festive Holy Mackerel", "tf_weapon_bat_fish"));
        weapons.add(new Weapon(1013, "The Ham Shank", "saxxy"));
        weapons.add(new Weapon(1071, "Gold Frying Pan", "saxxy"));
        weapons.add(new Weapon(1123, "The Necro Smasher", "saxxy"));
        weapons.add(new Weapon(1127, "The Crossing Guard", "saxxy"));
        weapons.add(new Weapon(30667, "Batsaber", "tf_weapon_bat"));
        weapons.add(new Weapon(30758, "Prinny Machete", "saxxy"));
        //Soldier primary
        weapons.add(new Weapon(18, "Rocket Launcher", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(127, "The Direct Hit", "tf_weapon_rocketlauncher_directhit"));
        weapons.add(new Weapon(228, "The Black Box", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(237, "Rocket Jumper", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(414, "The Liberty Launcher", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(441, "The Cow Mangler 5000", "tf_weapon_particle_cannon"));
        weapons.add(new Weapon(513, "The Original", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(658, "Festive Rocket Launcher", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(730, "The Beggar's Bazooka", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(800, "Silver Botkiller Rocket Launcher Mk.I", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(809, "Gold Botkiller Rocket Launcher Mk.I", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(889, "Rust Botkiller Rocket Launcher Mk.I", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(898, "Blood Botkiller Rocket Launcher Mk.I", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(907, "Carbonado Botkiller Rocket Launcher Mk.I", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(916, "Diamond Botkiller Rocket Launcher Mk.I", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(965, "Silver Botkiller Rocket Launcher Mk.II", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(974, "Gold Botkiller Rocket Launcher Mk.II", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(1085, "Festive Black Box", "tf_weapon_rocketlauncher"));
        weapons.add(new Weapon(1104, "The Air Strike", "tf_weapon_rocketlauncher_airstrike"));
        //Soldier secondary
        weapons.add(new Weapon(10, "Soldier's Shotgun", "tf_weapon_shotgun_soldier"));
        weapons.add(new Weapon(129, "The Buff Banner", "tf_weapon_buff_item"));
        weapons.add(new Weapon(133, "Gunboats", "tf_wearable"));
        weapons.add(new Weapon(226, "The Battalion's Backup", "tf_weapon_buff_item"));
        weapons.add(new Weapon(354, "The Concheror", "tf_weapon_buff_item"));
        weapons.add(new Weapon(415, "The Reserve Shooter", "tf_weapon_shotgun"));
        weapons.add(new Weapon(442, "The Righteous Bison", "tf_weapon_raygun"));
        weapons.add(new Weapon(444, "The Mantreads", "tf_wearable"));
        weapons.add(new Weapon(1001, "Festive Buff Banner", "tf_weapon_buff_item"));
        weapons.add(new Weapon(1101, "The B.A.S.E. Jumper", "tf_weapon_parachute"));
        weapons.add(new Weapon(1141, "Festive Shotgun", "tf_weapon_shotgun"));
        weapons.add(new Weapon(1153, "Panic Attack", "tf_weapon_shotgun"));
        //Soldier melee
        weapons.add(new Weapon(6, "Shovel", "tf_weapon_shovel"));
        weapons.add(new Weapon(128, "The Equalizer", "tf_weapon_shovel"));
        weapons.add(new Weapon(154, "The Pain Train", "tf_weapon_shovel"));
        weapons.add(new Weapon(357, "The Half-Zatoichi", "tf_weapon_katana"));
        weapons.add(new Weapon(416, "The Market Gardener", "tf_weapon_shovel"));
        weapons.add(new Weapon(447, "The Disciplinary Action", "tf_weapon_shovel"));
        weapons.add(new Weapon(775, "The Escape Plan", "tf_weapon_shovel"));
        //Pyro primary
        weapons.add(new Weapon(21, "Flame Thrower", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(40, "The Backburner", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(215, "The Degreaser", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(594, "The Phlogistinator", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(659, "Festive Flame Thrower", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(741, "The Rainblower", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(798, "Silver Botkiller Flame Thrower Mk.I", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(807, "Gold Botkiller Flame Thrower Mk.I", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(887, "Rust Botkiller Flame Thrower Mk.I", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(896, "Blood Botkiller Flame Thrower Mk.I", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(905, "Carbonado Botkiller Flame Thrower Mk.I", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(914, "Diamond Botkiller Flame Thrower Mk.I", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(963, "Silver Botkiller Flame Thrower Mk.II", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(972, "Gold Botkiller Flame Thrower Mk.II", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(1146, "Festive Backburner", "tf_weapon_flamethrower"));
        weapons.add(new Weapon(1178, "Dragon's Fury", "tf_weapon_rocketlauncher_fireball"));
        weapons.add(new Weapon(30474, "Nostromo Napalmer", "tf_weapon_flamethrower"));
        //Pyro secondary
        weapons.add(new Weapon(12, "Pyro's Shotgun", "tf_weapon_shotgun_pyro"));
        weapons.add(new Weapon(39, "The Flare Gun", "tf_weapon_flaregun"));
        weapons.add(new Weapon(351, "The Detonator", "tf_weapon_flaregun"));
        weapons.add(new Weapon(595, "The Manmelter", "tf_weapon_flaregun_revenge"));
        weapons.add(new Weapon(740, "The Scorch Shot", "tf_weapon_flaregun"));
        weapons.add(new Weapon(1081, "Festive Flare Gun", "tf_weapon_flaregun"));
        weapons.add(new Weapon(1179, "Thermal Thruster", "tf_weapon_rocketpack"));
        weapons.add(new Weapon(1180, "Gas Passer", "tf_weapon_jar_gas"));
        //Pyro melee
        weapons.add(new Weapon(2, "Fire Axe", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(38, "The Axtinguisher", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(153, "The Homewrecker", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(214, "The Powerjack", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(326, "The Back Scratcher", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(348, "Sharpened Volcano Fragment", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(457, "The Postal Pummeler", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(466, "The Maul", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(593, "The Third Degree", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(739, "The Lollichop", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(813, "Neon Annihilator", "tf_weapon_breakable_sign"));
        weapons.add(new Weapon(1000, "The Festive Axtinguisher", "tf_weapon_fireaxe"));
        weapons.add(new Weapon(1181, "Hot Hand", "tf_weapon_slap"));
        //Demoman primary
        weapons.add(new Weapon(19, "Grenade Launcher", "tf_weapon_grenadelauncher"));
        weapons.add(new Weapon(308, "The Loch-n-Load", "tf_weapon_grenadelauncher"));
        weapons.add(new Weapon(405, "Ali Baba's Wee Booties", "tf_wearable"));
        weapons.add(new Weapon(608, "The Bootlegger", "tf_wearable"));
        weapons.add(new Weapon(996, "The Loose Cannon", "tf_weapon_cannon"));
        weapons.add(new Weapon(1007, "Festive Grenade Launcher", "tf_weapon_grenadelauncher"));
        weapons.add(new Weapon(1151, "The Iron Bomber", "tf_weapon_grenadelauncher"));
        //Demoman secondary
        weapons.add(new Weapon(20, "Stickybomb Launcher", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(130, "The Scottish Resistance", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(131, "The Chargin' Targe", "tf_wearable_demoshield"));
        weapons.add(new Weapon(265, "Sticky Jumper", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(406, "The Splendid Screen", "tf_wearable_demoshield"));
        weapons.add(new Weapon(661, "Festive Stickybomb Launcher", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(797, "Silver Botkiller Stickybomb Launcher Mk.I", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(806, "Gold Botkiller Stickybomb Launcher Mk.I", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(886, "Rust Botkiller Stickybomb Launcher Mk.I", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(895, "Blood Botkiller Stickybomb Launcher Mk.I", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(904, "Carbonado Botkiller Stickybomb Launcher Mk.I", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(913, "Diamond Botkiller Stickybomb Launcher Mk.I", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(962, "Silver Botkiller Stickybomb Launcher Mk.II", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(971, "Gold Botkiller Stickybomb Launcher Mk.II", "tf_weapon_pipebomblauncher"));
        weapons.add(new Weapon(1099, "The Tide Turner", "tf_wearable_demoshield"));
        weapons.add(new Weapon(1144, "Festive Targe", "tf_wearable_demoshield"));
        weapons.add(new Weapon(1150, "The Quickiebomb Launcher", "tf_weapon_pipebomblauncher"));
        //Demoman melee
        weapons.add(new Weapon(1, "Bottle", "tf_weapon_bottle"));
        weapons.add(new Weapon(132, "The Eyelander", "tf_weapon_sword"));
        weapons.add(new Weapon(172, "The Scotsman's Skullcutter", "tf_weapon_sword"));
        weapons.add(new Weapon(266, "Horseless Headless Horsemann's Headtaker", "tf_weapon_sword"));
        weapons.add(new Weapon(307, "Ullapool Caber", "tf_weapon_stickbomb"));
        weapons.add(new Weapon(327, "The Claidheamh Mor", "tf_weapon_sword"));
        weapons.add(new Weapon(404, "The Persian Persuader", "tf_weapon_sword"));
        weapons.add(new Weapon(482, "Nessie's Nine Iron", "tf_weapon_sword"));
        weapons.add(new Weapon(609, "The Scottish Handshake", "tf_weapon_bottle"));
        weapons.add(new Weapon(1082, "Festive Eyelander", "tf_weapon_sword"));
        //Heavy primary
        weapons.add(new Weapon(15, "Minigun", "tf_weapon_minigun"));
        weapons.add(new Weapon(41, "Natascha", "tf_weapon_minigun"));
        weapons.add(new Weapon(298, "Iron Curtain", "tf_weapon_minigun"));
        weapons.add(new Weapon(312, "The Brass Beast", "tf_weapon_minigun"));
        weapons.add(new Weapon(424, "Tomislav", "tf_weapon_minigun"));
        weapons.add(new Weapon(654, "Festive Minigun", "tf_weapon_minigun"));
        weapons.add(new Weapon(793, "Silver Botkiller Minigun Mk.I", "tf_weapon_minigun"));
        weapons.add(new Weapon(802, "Gold Botkiller Minigun Mk.I", "tf_weapon_minigun"));
        weapons.add(new Weapon(882, "Rust Botkiller Minigun Mk.I", "tf_weapon_minigun"));
        weapons.add(new Weapon(891, "Blood Botkiller Minigun Mk.I", "tf_weapon_minigun"));
        weapons.add(new Weapon(900, "Carbonado Botkiller Minigun Mk.I", "tf_weapon_minigun"));
        weapons.add(new Weapon(909, "Diamond Botkiller Minigun Mk.I", "tf_weapon_minigun"));
        weapons.add(new Weapon(958, "Silver Botkiller Minigun Mk.II", "tf_weapon_minigun"));
        weapons.add(new Weapon(967, "Gold Botkiller Minigun Mk.II", "tf_weapon_minigun"));
        weapons.add(new Weapon(811, "The Huo-Long Heater", "tf_weapon_minigun"));
        //Heavy secondary
        weapons.add(new Weapon(11, "Heavy's Shotgun", "tf_weapon_shotgun_hwg"));
        weapons.add(new Weapon(42, "Sandvich", "tf_weapon_lunchbox"));
        weapons.add(new Weapon(159, "The Dalokohs Bar", "tf_weapon_lunchbox"));
        weapons.add(new Weapon(311, "The Buffalo Steak Sandvich", "tf_weapon_lunchbox"));
        weapons.add(new Weapon(425, "The Family Business", "tf_weapon_shotgun_hwg"));
        weapons.add(new Weapon(433, "Fishcake", "tf_weapon_lunchbox"));
        weapons.add(new Weapon(863, "Robo-Sandvich", "tf_weapon_lunchbox"));
        weapons.add(new Weapon(1002, "Festive Sandvich", "tf_weapon_lunchbox"));
        weapons.add(new Weapon(1190, "Second Banana", "tf_weapon_lunchbox"));
        //Heavy melee
        weapons.add(new Weapon(5, "Fists", "tf_weapon_fists"));
        weapons.add(new Weapon(43, "The Killing Gloves of Boxing", "tf_weapon_fists"));
        weapons.add(new Weapon(239, "Gloves of Running Urgently", "tf_weapon_fists"));
        weapons.add(new Weapon(310, "Warrior's Spirit", "tf_weapon_fists"));
        weapons.add(new Weapon(331, "Fists of Steel", "tf_weapon_fists"));
        weapons.add(new Weapon(426, "The Eviction Notice", "tf_weapon_fists"));
        weapons.add(new Weapon(587, "Apoco-Fists", "tf_weapon_fists"));
        weapons.add(new Weapon(656, "The Holiday Punch", "tf_weapon_fists"));
        weapons.add(new Weapon(1084, "Festive Gloves of Running Urgently", "tf_weapon_fists"));
        weapons.add(new Weapon(1100, "The Bread Bite", "tf_weapon_fists"));
        //Engineer primary
        weapons.add(new Weapon(9, "Engineer's Shotgun", "tf_weapon_shotgun_primary"));
        weapons.add(new Weapon(141, "The Frontier Justice", "tf_weapon_sentry_revenge"));
        weapons.add(new Weapon(527, "The Widowmaker", "tf_weapon_shotgun_primary"));
        weapons.add(new Weapon(588, "The Pomson 6000", "tf_weapon_drg_pomson"));
        weapons.add(new Weapon(997, "The Rescue Ranger", "tf_weapon_shotgun_building_rescue"));
        weapons.add(new Weapon(1004, "Festive Frontier Justice", "tf_weapon_sentry_revenge"));
        //Engineer secondary
        weapons.add(new Weapon(22, "Engineer's Pistol", "tf_weapon_pistol"));
        weapons.add(new Weapon(140, "The Wrangler", "tf_weapon_laser_pointer"));
        weapons.add(new Weapon(528, "The Short Circuit", "tf_weapon_mechanical_arm"));
        weapons.add(new Weapon(1086, "Festive Wrangler", "tf_weapon_laser_pointer"));
        weapons.add(new Weapon(30668, "The Gigar Counter", "tf_weapon_laser_pointer"));
        //Engineer melee
        weapons.add(new Weapon(7, "Wrench", "tf_weapon_wrench"));
        weapons.add(new Weapon(142, "The Gunslinger", "tf_weapon_robot_arm"));
        weapons.add(new Weapon(155, "The Southern Hospitality", "tf_weapon_wrench"));
        weapons.add(new Weapon(169, "Golden Wrench", "tf_weapon_wrench"));
        weapons.add(new Weapon(329, "The Jag", "tf_weapon_wrench"));
        weapons.add(new Weapon(589, "The Eureka Effect", "tf_weapon_wrench"));
        weapons.add(new Weapon(662, "Festive Wrench", "tf_weapon_wrench"));
        weapons.add(new Weapon(795, "Silver Botkiller Wrench Mk.I", "tf_weapon_wrench"));
        weapons.add(new Weapon(804, "Gold Botkiller Wrench Mk.I", "tf_weapon_wrench"));
        weapons.add(new Weapon(884, "Rust Botkiller Wrench Mk.I", "tf_weapon_wrench"));
        weapons.add(new Weapon(893, "Blood Botkiller Wrench Mk.I", "tf_weapon_wrench"));
        weapons.add(new Weapon(902, "Carbonado Botkiller Wrench Mk.I", "tf_weapon_wrench"));
        weapons.add(new Weapon(911, "Diamond Botkiller Wrench Mk.I", "tf_weapon_wrench"));
        weapons.add(new Weapon(960, "Silver Botkiller Wrench Mk.II", "tf_weapon_wrench"));
        weapons.add(new Weapon(969, "Gold Botkiller Wrench Mk.II", "tf_weapon_wrench"));
        //Engineer PDA
        weapons.add(new Weapon(25, "Construction PDA", "tf_weapon_pda_engineer_build"));
        //Medic primary
        weapons.add(new Weapon(17, "Syringe Gun", "tf_weapon_syringegun_medic"));
        weapons.add(new Weapon(36, "The Blutsauger", "tf_weapon_syringegun_medic"));
        weapons.add(new Weapon(305, "Crusader's Crossbow", "tf_weapon_crossbow"));
        weapons.add(new Weapon(412, "The Overdose", "tf_weapon_syringegun_medic"));
        weapons.add(new Weapon(1079, "Festive Crusader's Crossbow", "tf_weapon_crossbow"));
        //Medic secondary
        weapons.add(new Weapon(29, "Medi Gun", "tf_weapon_medigun"));
        weapons.add(new Weapon(35, "The Kritzkrieg", "tf_weapon_medigun"));
        weapons.add(new Weapon(411, "The Quick-Fix", "tf_weapon_medigun"));
        weapons.add(new Weapon(663, "Festive Medi Gun", "tf_weapon_medigun"));
        weapons.add(new Weapon(796, "Silver Botkiller Medi Gun Mk.I", "tf_weapon_medigun"));
        weapons.add(new Weapon(805, "Gold Botkiller Medi Gun Mk.I", "tf_weapon_medigun"));
        weapons.add(new Weapon(885, "Rust Botkiller Medi Gun Mk.I", "tf_weapon_medigun"));
        weapons.add(new Weapon(894, "Blood Botkiller Medi Gun Mk.I", "tf_weapon_medigun"));
        weapons.add(new Weapon(903, "Carbonado Botkiller Medi Gun Mk.I", "tf_weapon_medigun"));
        weapons.add(new Weapon(912, "Diamond Botkiller Medi Gun Mk.I", "tf_weapon_medigun"));
        weapons.add(new Weapon(961, "Silver Botkiller Medi Gun Mk.II", "tf_weapon_medigun"));
        weapons.add(new Weapon(970, "Gold Botkiller Medi Gun Mk.II", "tf_weapon_medigun"));
        weapons.add(new Weapon(998, "The Vaccinator", "tf_weapon_medigun"));
        //Medic melee
        weapons.add(new Weapon(8, "Bonesaw", "tf_weapon_bonesaw"));
        weapons.add(new Weapon(37, "The Ubersaw", "tf_weapon_bonesaw"));
        weapons.add(new Weapon(173, "The Vita-Saw", "tf_weapon_bonesaw"));
        weapons.add(new Weapon(304, "Amputator", "tf_weapon_bonesaw"));
        weapons.add(new Weapon(413, "The Solemn Vow", "tf_weapon_bonesaw"));
        weapons.add(new Weapon(1003, "Festive Ubersaw", "tf_weapon_bonesaw"));
        weapons.add(new Weapon(1143, "Festive Bonesaw", "tf_weapon_bonesaw"));
        //Sniper primary
        weapons.add(new Weapon(14, "Sniper Rifle", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(56, "The Huntsman", "tf_weapon_compound_bow"));
        weapons.add(new Weapon(230, "The Sydney Sleeper", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(402, "The Bazaar Bargain", "tf_weapon_sniperrifle_decap"));
        weapons.add(new Weapon(526, "The Machina", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(752, "The Hitman's Heatmaker", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(792, "Silver Botkiller Sniper Rifle Mk.I", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(801, "Gold Botkiller Sniper Rifle Mk.I", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(851, "The AWPer Hand", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(881, "Rust Botkiller Sniper Rifle Mk.I", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(890, "Blood Botkiller Sniper Rifle Mk.I", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(899, "Carbonado Botkiller Sniper Rifle Mk.I", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(908, "Diamond Botkiller Sniper Rifle Mk.I", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(957, "Silver Botkiller Sniper Rifle Mk.II", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(966, "Gold Botkiller Sniper Rifle Mk.II", "tf_weapon_sniperrifle"));
        weapons.add(new Weapon(1005, "Festive Huntsman", "tf_weapon_compound_bow"));
        weapons.add(new Weapon(1092, "The Fortified Compound", "tf_weapon_compound_bow"));
        weapons.add(new Weapon(1098, "The Classic", "tf_weapon_sniperrifle_classic"));
        weapons.add(new Weapon(30665, "Shooting Star", "tf_weapon_sniperrifle"));
        //Sniper secondary
        weapons.add(new Weapon(16, "SMG", "tf_weapon_smg"));
        weapons.add(new Weapon(57, "The Razorback", "tf_wearable_razorback"));
        weapons.add(new Weapon(58, "Jarate", "tf_weapon_jar"));
        weapons.add(new Weapon(231, "Darwin's Danger Shield", "tf_wearable"));
        weapons.add(new Weapon(642, "Cozy Camper", "tf_wearable"));
        weapons.add(new Weapon(751, "The Cleaner's Carbine", "tf_weapon_charged_smg"));
        weapons.add(new Weapon(1083, "Festive Jarate", "tf_weapon_jar"));
        weapons.add(new Weapon(1105, "The Self-Aware Beauty Mark", "tf_weapon_jar"));
        weapons.add(new Weapon(1149, "Festive SMG", "tf_weapon_smg"));
        //Sniper melee
        weapons.add(new Weapon(3, "Kukri", "tf_weapon_club"));
        weapons.add(new Weapon(171, "The Tribalman's Shiv", "tf_weapon_club"));
        weapons.add(new Weapon(232, "The Bushwacka", "tf_weapon_club"));
        weapons.add(new Weapon(401, "The Shahanshah", "tf_weapon_club"));
        //Spy primary
        weapons.add(new Weapon(24, "Revolver", "tf_weapon_revolver"));
        weapons.add(new Weapon(61, "The Ambassador", "tf_weapon_revolver"));
        weapons.add(new Weapon(161, "Big Kill", "tf_weapon_revolver"));
        weapons.add(new Weapon(224, "L'Etranger", "tf_weapon_revolver"));
        weapons.add(new Weapon(460, "The Enforcer", "tf_weapon_revolver"));
        weapons.add(new Weapon(525, "The Diamondback", "tf_weapon_revolver"));
        weapons.add(new Weapon(1006, "Festive Ambassador", "tf_weapon_revolver"));
        weapons.add(new Weapon(1142, "Festive Revolver", "tf_weapon_revolver"));
        //Spy sapper
        weapons.add(new Weapon(735, "Sapper", "tf_weapon_builder"));
        weapons.add(new Weapon(810, "The Red-Tape Recorder", "tf_weapon_sapper"));
        weapons.add(new Weapon(933, "The Ap-Sap", "tf_weapon_sapper"));
        weapons.add(new Weapon(1080, "Festive Sapper", "tf_weapon_sapper"));
        weapons.add(new Weapon(1102, "The Snack Attack", "tf_weapon_sapper"));
        //Spy melee
        weapons.add(new Weapon(4, "Knife", "tf_weapon_knife"));
        weapons.add(new Weapon(225, "Your Eternal Reward", "tf_weapon_knife"));
        weapons.add(new Weapon(356, "Conniver's Kunai", "tf_weapon_knife"));
        weapons.add(new Weapon(461, "The Big Earner", "tf_weapon_knife"));
        weapons.add(new Weapon(574, "The Wanga Prick", "tf_weapon_knife"));
        weapons.add(new Weapon(638, "The Sharp Dresser", "tf_weapon_knife"));
        weapons.add(new Weapon(649, "The Spy-cicle", "tf_weapon_knife"));
        weapons.add(new Weapon(665, "Festive Knife", "tf_weapon_knife"));
        weapons.add(new Weapon(727, "The Black Rose", "tf_weapon_knife"));
        weapons.add(new Weapon(794, "Silver Botkiller Knife Mk.I", "tf_weapon_knife"));
        weapons.add(new Weapon(803, "Gold Botkiller Knife Mk.I", "tf_weapon_knife"));
        weapons.add(new Weapon(883, "Rust Botkiller Knife Mk.I", "tf_weapon_knife"));
        weapons.add(new Weapon(892, "Blood Botkiller Knife Mk.I", "tf_weapon_knife"));
        weapons.add(new Weapon(901, "Carbonado Botkiller Knife Mk.I", "tf_weapon_knife"));
        weapons.add(new Weapon(910, "Diamond Botkiller Knife Mk.I", "tf_weapon_knife"));
        weapons.add(new Weapon(959, "Silver Botkiller Knife Mk.II", "tf_weapon_knife"));
        weapons.add(new Weapon(968, "Gold Botkiller Knife Mk.II", "tf_weapon_knife"));
        //Spy invis watch
        weapons.add(new Weapon(30, "Invis Watch", "tf_weapon_invis"));
        weapons.add(new Weapon(59, "The Dead Ringer", "tf_weapon_invis"));
        weapons.add(new Weapon(60, "The Cloak and Dagger", "tf_weapon_invis"));
        weapons.add(new Weapon(297, "Enthusiast's Timepiece", "tf_weapon_invis"));
        weapons.add(new Weapon(947, "The Quackenbirdt", "tf_weapon_invis"));
    }
    
    private void initStatDatabase(){
        stats = new ArrayList<>();
        addedStats = new ArrayList<>();
        
        negativeStats = new DefaultListModel<>();
        positiveStats = new DefaultListModel<>();
        
        attribsListPositive.setModel(positiveStats);
        attribsListNegative.setModel(negativeStats);
        
        stats.add(new WeaponStat(1, false, "damage penalty", "%s1% damage penalty", "percentage"));
        stats.add(new WeaponStat(2, true, "damage bonus", "+%s1% damage bonus", "percentage"));
        stats.add(new WeaponStat(3, false, "clip size penalty", "%s1% clip size", "percentage"));
        stats.add(new WeaponStat(4, true, "clip size bonus", "+%s1% clip size", "percentage"));
        stats.add(new WeaponStat(5, false, "fire rate penalty", "%s1% slower firing speed", "inverted_percentage"));
        stats.add(new WeaponStat(6, true, "fire rate bonus", "+%s1% faster firing speed", "inverted_percentage"));
        stats.add(new WeaponStat(7, false, "heal rate penalty", "%s1% heal rate", "percentage"));
        stats.add(new WeaponStat(8, true, "heal rate bonus", "+%s1% heal rate", "percentage"));
        stats.add(new WeaponStat(9, false, "ubercharge rate penalty", "%s1% ÜberCharge rate", "percentage"));
        stats.add(new WeaponStat(10, true, "ubercharge rate bonus", "+%s1% ÜberCharge rate", "percentage"));
        
        stats.add(new WeaponStat(11, true, "overheal bonus", "+%s1% max overheal", "percentage"));
        stats.add(new WeaponStat(12, false, "overheal decay penalty", "%s1% shorter overheal time", "inverted_percentage"));
        stats.add(new WeaponStat(13, true, "overheal decay bonus", "+%s1% longer overheal time", "inverted_percentage"));
        stats.add(new WeaponStat(14, true, "overheal decay disabled", "Overheal bonus doesn't decay", "constant"));
        stats.add(new WeaponStat(15, false, "crit mod disabled", "No random critical hits", "constant"));
        stats.add(new WeaponStat(16, true, "heal on hit for rapidfire", "On Hit: Gain up to +%s1 health", "additive"));
        stats.add(new WeaponStat(17, true, "add uber charge on hit", "On Hit: %s1% ÜberCharge added", "additive_percentage"));
        stats.add(new WeaponStat(18, true, "medigun charge is crit boost", "ÜberCharge grants 100% critical chance", "constant"));
        stats.add(new WeaponStat(19, true, "tmp dmgbuff on hit", "On Hit: +%s1% damage bonus", "additive_percentage"));
        stats.add(new WeaponStat(20, true, "crit vs burning players", "100% critical hit vs burning players", "constant"));
        
        stats.add(new WeaponStat(21, false, "dmg penalty vs nonburning", "%s1% damage vs non-burning players", "percentage"));
        stats.add(new WeaponStat(22, false, "no crit vs nonburning", "No critical hits vs non-burning players", "constant"));
        stats.add(new WeaponStat(23, false, "mod flamethrower push", "No compression blast", "constant"));
        stats.add(new WeaponStat(24, true, "mod flamethrower back crit", "100% critical hits from behind", "constant"));
        stats.add(new WeaponStat(26, true, "max health additive bonus", "+%s1 max health on wearer", "additive"));
        stats.add(new WeaponStat(28, false, "crit mod disabled hidden", "No random critical hits (hidden)", "percentage"));
        
        stats.add(new WeaponStat(31, true, "critboost on kill", "On Kill: %s1 seconds of 100% critical chance", "additive"));
        stats.add(new WeaponStat(32, true, "slow enemy on hit", "On Hit: %s1% chance to slow target", "additive_percentage"));
        stats.add(new WeaponStat(33, true, "set cloak is feign death", "Cloak Type: Feign Death.", "constant"));
        stats.add(new WeaponStat(34, false, "mult cloak meter consume rate", "+%s1% cloak drain rate", "percentage"));
        stats.add(new WeaponStat(35, true, "mult cloak meter regen rate", "+%s1% cloak regen rate", "percentage"));
        stats.add(new WeaponStat(36, false, "spread penalty", "%s1% less accurate", "percentage"));
        stats.add(new WeaponStat(38, true, "mod bat launches balls", "Alt-Fire: Launches a ball that slows opponents", "additive"));
        stats.add(new WeaponStat(39, false, "dmg penalty vs nonstunned", "%s1% damage vs non-stunned players", "percentage"));
        stats.add(new WeaponStat(40, true, "zoom speed mod disabled", "No move speed penalty from zoom", "constant"));
        
        stats.add(new WeaponStat(41, true, "sniper charge per sec", "+%s1% charge rate", "percentage"));
        stats.add(new WeaponStat(42, false, "sniper no headshots", "No headshots", "constant"));
        stats.add(new WeaponStat(44, true, "scattergun has knockback", "Knockback on the target and shooter", "constant"));
        stats.add(new WeaponStat(45, true, "bullets per shot bonus", "+%s1% bullets per shot", "percentage"));
        stats.add(new WeaponStat(46, false, "sniper zoom penalty", "%s1% zoom reduction", "percentage"));
        stats.add(new WeaponStat(47, false, "sniper no charge", "No zoom or damage charge", "constant"));
        stats.add(new WeaponStat(48, true, "set cloak is movement based", "Cloak Type: Motion Sensitive.", "constant"));
        stats.add(new WeaponStat(49, false, "no double jump", "Disables double jump", "constant"));
        stats.add(new WeaponStat(50, true, "absorb damage while cloaked", "Absorbs %s1% damage while cloaked", "percentage"));
        
        stats.add(new WeaponStat(51, true, "revolver use hit locations", "Crits on headshot", "constant"));
        stats.add(new WeaponStat(52, true, "backstab shield", "Blocks a single backstab attempt", "constant"));
        stats.add(new WeaponStat(53, true, "fire retardant", "Wearer cannot ignite", "constant"));
        stats.add(new WeaponStat(54, false, "move speed penalty", "%s1% slower move speed on wearer", "inverted_percentage"));
        stats.add(new WeaponStat(57, true, "health regen", "+%s1 health regenerated per second on wearer", "additive"));
        stats.add(new WeaponStat(58, true, "self dmg push force increased", "+%s1% self damage force", "percentage"));
        stats.add(new WeaponStat(59, false, "self dmg push force decreased", "%s1% self damage force", "percentage"));
        stats.add(new WeaponStat(60, true, "dmg taken from fire reduced", "+%s1% fire damage resistance on wearer", "inverted_percentage"));
        
        stats.add(new WeaponStat(61, false, "dmg taken from fire increased", "%s1% fire damage vulnerability on wearer", "percentage"));
        stats.add(new WeaponStat(62, true, "dmg taken from crit reduced", "+%s1% critical hit damage resistance on wearer", "inverted_percentage"));
        stats.add(new WeaponStat(63, false, "dmg taken from crit increased", "%s1% critical hit damage vulnerability on wearer", "percentage"));
        stats.add(new WeaponStat(64, true, "dmg taken from blast reduced", "+%s1% explosive damage resistance on wearer", "inverted_percentage"));
        stats.add(new WeaponStat(65, false, "dmg taken from blast increased", "%s1% explosive damage vulnerability on wearer", "percentage"));
        stats.add(new WeaponStat(66, true, "dmg taken from bullets reduced", "+%s1% bullet damage resistance on wearer", "inverted_percentage"));
        stats.add(new WeaponStat(67, false, "dmg taken from bullets increased", "%s1% bullet damage vulnerability on wearer", "percentage"));
        stats.add(new WeaponStat(68, true, "increase player capture value", "+%s1 capture rate on wearer", "additive"));
        stats.add(new WeaponStat(69, false, "health from healers reduced", "%s1% health from healers on wearer", "percentage"));
        stats.add(new WeaponStat(70, true, "health from healers increased", "+%s1% health from healers on wearer", "percentage"));
        
        stats.add(new WeaponStat(71, true, "weapon burn dmg increased", "+%s1% afterburn damage bonus", "percentage"));
        stats.add(new WeaponStat(72, false, "weapon burn dmg reduced", "%s1% afterburn damage penalty", "percentage"));
        stats.add(new WeaponStat(73, true, "weapon burn time increased", "+%s1% afterburn duration", "percentage"));
        stats.add(new WeaponStat(74, false, "weapon burn time reduced", "%s1% afterburn duration", "percentage"));
        stats.add(new WeaponStat(75, true, "aiming movespeed increased", "+%s1% faster move speed while deployed", "percentage"));
        stats.add(new WeaponStat(76, true, "maxammo primary increased", "+%s1% max primary ammo on wearer", "percentage"));
        stats.add(new WeaponStat(77, false, "maxammo primary reduced", "%s1% max primary ammo on wearer", "percentage"));
        stats.add(new WeaponStat(78, true, "maxammo secondary increased", "+%s1% max secondary ammo on wearer", "percentage"));
        stats.add(new WeaponStat(79, false, "maxammo secondary reduced", "%s1% max secondary ammo on wearer", "percentage"));
        stats.add(new WeaponStat(80, true, "maxammo metal increased", "+%s1% max metal on wearer", "percentage"));
        
        stats.add(new WeaponStat(81, false, "maxammo metal reduced", "%s1% max metal on wearer", "percentage"));
        stats.add(new WeaponStat(82, false, "cloak consume rate increased", "-%s1% cloak duration", "percentage"));
        stats.add(new WeaponStat(83, true, "cloak consume rate decreased", "+%s1% cloak duration", "inverted_percentage"));
        stats.add(new WeaponStat(84, true, "cloak regen rate increased", "+%s1% cloak regeneration rate", "percentage"));
        stats.add(new WeaponStat(85, false, "cloak regen rate decreased", "%s1% cloak regeneration rate", "percentage"));
        stats.add(new WeaponStat(86, false, "minigun spinup time increased", "%s1% slower spin up time", "percentage"));
        stats.add(new WeaponStat(87, true, "minigun spinup time decreased", "%s1% faster spin up time", "inverted_percentage"));
        stats.add(new WeaponStat(88, true, "max pipebombs increased", "+%s1 max pipebombs out", "additive"));
        stats.add(new WeaponStat(89, false, "max pipebombs decreased", "%s1 max pipebombs out", "additive"));
        stats.add(new WeaponStat(90, true, "SRifle Charge rate increased", "%s1% faster power charge", "percentage"));
        
        stats.add(new WeaponStat(91, false, "SRifle Charge rate decreased", "%s1% slower power charge", "inverted_percentage"));
        stats.add(new WeaponStat(92, true, "Construction rate increased", "Construction hit speed boost increased by %s1%", "percentage"));
        stats.add(new WeaponStat(93, false, "Construction rate decreased", "Construction hit speed boost decreased by %s1%", "inverted_percentage"));
        stats.add(new WeaponStat(94, true, "Repair rate increased", "%s1% faster repair rate", "percentage"));
        stats.add(new WeaponStat(95, false, "Repair rate decreased", "%s1% slower repair rate", "inverted_percentage"));
        stats.add(new WeaponStat(96, false, "Reload time increased", "%s1% slower reload time", "percentage"));
        stats.add(new WeaponStat(97, true, "Reload time decreased", "%s1% faster reload time", "inverted_percentage"));
        stats.add(new WeaponStat(98, false, "selfdmg on hit for rapidfire", "On Hit: %s1 health", "additive"));
        stats.add(new WeaponStat(99, true, "Blast radius increased", "+%s1% explosion radius", "percentage"));
        stats.add(new WeaponStat(100, false, "Blast radius decreased", "%s1% explosion radius", "percentage"));
    }
    
    /**
     * Removes the first attribute in the code.
     */
    private void removeFirstAttrib(){
        int count = 0;
        for(int i=0; i<attribs.length(); i++){
            if(attribs.charAt(i)==';'){
                count++;
            }
            if(count==2){
                attribs = attribs.substring(i+2);
                break;
            }
        }
        if(count<2){
            attribs = "";
        }
    }
    
    /**
     * Updates the text in the code tab.
     */
    private void updateCode(){
        codeText.setText("\"" + wepNumber + "\"\n{\n\t\"classname\"\t\t\"" + classname 
                + "\"\n\t\"index\"\t\t\"" + index + "\"\n\t\"slot\"\t\t\"" + slot + "\"\n\t\"quality\"\t\t\"" 
                + quality + "\"\n\t\"level\"\t\t\"" + level + "\"\n\t\"attribs\"\t\t\"" + attribs + "\"\n\t\"ammo\"\t\t\""
                + ammo + "\"\n}");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        infBasicSettings = new javax.swing.JInternalFrame();
        lblWeaponNumber = new javax.swing.JLabel();
        txtWeaponNumber = new javax.swing.JTextField();
        txtClassname = new javax.swing.JTextField();
        lblIndex = new javax.swing.JLabel();
        txtIndex = new javax.swing.JTextField();
        lblSlot = new javax.swing.JLabel();
        lblQuality = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblModelPreset = new javax.swing.JLabel();
        txtAmmo = new javax.swing.JTextField();
        boxSlot = new javax.swing.JComboBox<>();
        lblClassname = new javax.swing.JLabel();
        chkUsePreset = new javax.swing.JCheckBox();
        lblAmmo = new javax.swing.JLabel();
        boxModel = new javax.swing.JComboBox<>();
        sldLevel = new javax.swing.JSlider();
        boxQuality = new javax.swing.JComboBox<>();
        infAttributes = new javax.swing.JInternalFrame();
        lblIndex1 = new javax.swing.JLabel();
        boxAttribute = new javax.swing.JComboBox<>();
        txtValue = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        attribsListNegative = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lblPercent = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        attribsListPositive = new javax.swing.JList<>();
        lblNegative = new javax.swing.JLabel();
        lblPositive = new javax.swing.JLabel();
        infWeaponCode = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        codeText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TF2 Custom Weapon Helper");
        setResizable(false);

        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        infBasicSettings.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        infBasicSettings.setFrameIcon(null);
        infBasicSettings.setVisible(true);
        infBasicSettings.getContentPane().setLayout(null);

        lblWeaponNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWeaponNumber.setText("Weapon number:");
        infBasicSettings.getContentPane().add(lblWeaponNumber);
        lblWeaponNumber.setBounds(10, 10, 140, 22);

        txtWeaponNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWeaponNumber.setText("10000");
        txtWeaponNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWeaponNumberFocusLost(evt);
            }
        });
        txtWeaponNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeaponNumberActionPerformed(evt);
            }
        });
        txtWeaponNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeaponNumberKeyTyped(evt);
            }
        });
        infBasicSettings.getContentPane().add(txtWeaponNumber);
        txtWeaponNumber.setBounds(210, 10, 90, 23);

        txtClassname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClassname.setText("tf_weapon_scattergun");
        txtClassname.setEnabled(false);
        infBasicSettings.getContentPane().add(txtClassname);
        txtClassname.setBounds(210, 40, 240, 23);

        lblIndex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIndex.setText("Index:");
        infBasicSettings.getContentPane().add(lblIndex);
        lblIndex.setBounds(10, 70, 140, 22);

        txtIndex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIndex.setText("13");
        txtIndex.setEnabled(false);
        txtIndex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIndexKeyTyped(evt);
            }
        });
        infBasicSettings.getContentPane().add(txtIndex);
        txtIndex.setBounds(210, 70, 140, 23);

        lblSlot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSlot.setText("Slot:");
        infBasicSettings.getContentPane().add(lblSlot);
        lblSlot.setBounds(10, 100, 140, 22);

        lblQuality.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuality.setText("Quality:");
        infBasicSettings.getContentPane().add(lblQuality);
        lblQuality.setBounds(10, 130, 140, 22);

        lblLevel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLevel.setText("Level:");
        infBasicSettings.getContentPane().add(lblLevel);
        lblLevel.setBounds(10, 160, 140, 22);

        txtLevel.setEditable(false);
        txtLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLevel.setText("1");
        txtLevel.setFocusable(false);
        infBasicSettings.getContentPane().add(txtLevel);
        txtLevel.setBounds(210, 160, 50, 23);

        lblModelPreset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblModelPreset.setText("Model preset:");
        infBasicSettings.getContentPane().add(lblModelPreset);
        lblModelPreset.setBounds(10, 250, 130, 22);

        txtAmmo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmmo.setText("20");
        txtAmmo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmmoFocusLost(evt);
            }
        });
        txtAmmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmmoKeyTyped(evt);
            }
        });
        infBasicSettings.getContentPane().add(txtAmmo);
        txtAmmo.setBounds(210, 190, 80, 23);

        boxSlot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primary", "Secondary", "Melee", "PDA", "Sapper", "Invis watch" }));
        boxSlot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxSlotItemStateChanged(evt);
            }
        });
        infBasicSettings.getContentPane().add(boxSlot);
        boxSlot.setBounds(210, 100, 180, 23);

        lblClassname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClassname.setText("Classname:");
        infBasicSettings.getContentPane().add(lblClassname);
        lblClassname.setBounds(10, 40, 140, 22);

        chkUsePreset.setSelected(true);
        chkUsePreset.setText("Use preset");
        chkUsePreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUsePresetActionPerformed(evt);
            }
        });
        infBasicSettings.getContentPane().add(chkUsePreset);
        chkUsePreset.setBounds(460, 40, 100, 23);

        lblAmmo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAmmo.setText("Ammo:");
        infBasicSettings.getContentPane().add(lblAmmo);
        lblAmmo.setBounds(10, 190, 140, 22);

        boxModel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scattergun", "Force-A-Nature", "The Shortstop", "The Soda Popper", "Festive Scattergun", "Baby Face's Blaster", "Silver Botkiller Scattergun Mk.I", "Gold Botkiller Scattergun Mk.I", "Rust Botkiller Scattergun Mk.I", "Blood Botkiller Scattergun Mk.I", "Carbonado Botkiller Scattergun Mk.I", "Diamond Botkiller Scattergun Mk.I", "Silver Botkiller Scattergun Mk.II", "Gold Botkiller Scattergun Mk.II", "Festive Force-A-Nature", "The Back Scatter", "Scout's Pistol", "Bonk! Atomic Punch", "Vintage Lugermorph", "Crit-A-Cola", "Mad Milk", "Lugermorph", "The Winger", "Pretty Boy's Pocket Pistol", "The Flying Guillotine", "Mutated Milk", "Festive Bonk!", "The C.A.P.P.E.R.", "Bat", "The Sandman", "The Holy Mackerel", "Frying Pan", "The Candy Cane", "The Boston Basher", "Sun-on-a-Stick", "The Fan O'War", "Saxxy", "The Atomizer", "Three-Rune Blade", "The Conscientious Objector", "Unarmed Combat", "The Wrap Assassin", "Festive Bat", "The Freedom Staff", "The Bat Outta Hell", "The Memory Maker", "Festive Holy Mackerel", "The Ham Shank", "Gold Frying Pan", "The Necro Smasher", "The Crossing Guard", "Batsaber", "Prinny Machete", "Rocket Launcher", "The Direct Hit", "The Black Box", "Rocket Jumper", "The Liberty Launcher", "The Cow Mangler 5000", "The Original", "Festive Rocket Launcher", "The Beggar's Bazooka", "Silver Botkiller Rocket Launcher Mk.I", "Gold Botkiller Rocket Launcher Mk.I", "Rust Botkiller Rocket Launcher Mk.I", "Blood Botkiller Rocket Launcher Mk.I", "Carbonado Botkiller Rocket Launcher Mk.I", "Diamond Botkiller Rocket Launcher Mk.I", "Silver Botkiller Rocket Launcher Mk.II", "Gold Botkiller Rocket Launcher Mk.II", "Festive Black Box", "The Air Strike", "Soldier's Shotgun", "The Buff Banner", "Gunboats", "The Battalion's Backup", "The Righteous Bison", "The Mantreads", "Festive Buff Banner", "The B.A.S.E. Jumper", "Festive Shotgun", "Panic Attack", "Shovel", "The Equalizer", "The Pain Train", "The Half-Zatoichi", "The Market Gardener", "The Disciplinary Action", "The Escape Plan", "Flame Thrower", "The Backburner", "The Degreaser", "The Phlogistinator", "Festive Flame Thrower", "The Rainblower", "Silver Botkiller Flame Thrower Mk.I", "Gold Botkiller Flame Thrower Mk.I", "Rust Botkiller Flame Thrower Mk.I", "Blood Botkiller Flame Thrower Mk.I", "Carbonado Botkiller Flame Thrower Mk.I", "Diamond Botkiller Flame Thrower Mk.I", "Silver Botkiller Flame Thrower Mk.II", "Gold Botkiller Flame Thrower Mk.II", "Festive Backburner", "Dragon's Fury", "Pyro's Shotgun", "The Flare Gun", "The Detonator", "The Reserve Shooter", "The Manmelter", "The Scorch Shot", "Festive Flare Gun", "Fire Axe", "The Axtinguisher", "Homewrecker", "The Powerjack", "The Back Scratcher", "Sharpened Volcano Fragment", "The Postal Pummeler", "The Maul", "The Third Degree", "The Lollichop", "Neon Annihilator", "The Festive Axtinguisher", "Hot Hand", "Grenade Launcher", "The Loch-n-Load", "Ali Baba's Wee Booties", "The Bootlegger", "The Loose Cannon", "Festive Grenade Launcher", "The Iron Bomber", "Stickybomb Launcher", "The Scottish Resistance", "The Chargin' Targe", "Sticky Jumper", "The Splendid Screen", "Festive Stickybomb Launcher", "Silver Botkiller Stickybomb Launcher Mk.I", "Gold Botkiller Stickybomb Launcher Mk.I", "Rust Botkiller Stickybomb Launcher Mk.I", "Blood Botkiller Stickybomb Launcher Mk.I", "Carbonado Botkiller Stickybomb Launcher Mk.I", "Diamond Botkiller Stickybomb Launcher Mk.I", "Silver Botkiller Stickybomb Launcher Mk.II", "Gold Botkiller Stickybomb Launcher Mk.II", "The Tide Turner", "Festive Targe", "The Quickiebomb Launcher", "Bottle", "The Eyelander", "The Pain Train", "The Scotsman's Skullcutter", "Horseless Headless Horsemann's Headtaker", "Ullapool Caber", "The Claidheamh Mor", "The Persian Persuader", "Nessie's Nine Iron", "The Scottish Handshake", "Festive Eyelander", "Minigun", "Natascha", "Iron Curtain", "The Brass Beast", "Tomislav", "Festive Minigun", "Silver Botkiller Minigun Mk.I", "Gold Botkiller Minigun Mk.I", "Rust Botkiller Minigun Mk.I", "Blood Botkiller Minigun Mk.I", "Carbonado Botkiller Minigun Mk.I", "Diamond Botkiller Minigun Mk.I", "Silver Botkiller Minigun Mk.II", "Gold Botkiller Minigun Mk.II", "The Huo-Long Heater", "Heavy's Shotgun", "Sandvich", "The Dalokohs Bar", "The Buffalo Steak Sandvich", "The Family Business", "Fishcake", "Robo-Sandvich", "Festive Sandvich", "Second Banana", "Fists", "The Killing Gloves of Boxing", "Gloves of Running Urgently", "Warrior's Spirit", "Fists of Steel", "The Eviction Notice", "Apoco-Fists", "The Holiday Punch", "Festive Gloves of Running Urgently", "The Bread Bite", "Engineer's Shotgun", "The Frontier Justice", "The Widowmaker", "The Pomson 6000", "The Rescue Ranger", "Festive Frontier Justice", "Engineer's Pistol", "The Wrangler", "The Short Circuit", "Festive Wrangler", "The Gigar Counter", "Wrench", "The Gunslinger", "The Southern Hospitality", "Golden Wrench", "The Jag", "The Eureka Effect", "Festive Wrench", "Silver Botkiller Wrench Mk.I", "Gold Botkiller Wrench Mk.I", "Rust Botkiller Wrench Mk.I", "Blood Botkiller Wrench Mk.I", "Carbonado Botkiller Wrench Mk.I", "Diamond Botkiller Wrench Mk.I", "Silver Botkiller Wrench Mk.II", "Gold Botkiller Wrench Mk.II", "Construction PDA", "Destruction PDA", "Syringe Gun", "The Blutsauger", "Crusader's Crossbow", "The Overdose", "Festive Crusader's Crossbow", "Medi Gun", "The Kritzkrieg", "The Quick-Fix", "Festive Medi Gun", "Silver Botkiller Medi Gun Mk.I", "Gold Botkiller Medi Gun Mk.I", "Rust Botkiller Medi Gun Mk.I", "Blood Botkiller Medi Gun Mk.I", "Carbonado Botkiller Medi Gun Mk.I", "Diamond Botkiller Medi Gun Mk.I", "Silver Botkiller Medi Gun Mk.II", "Gold Botkiller Medi Gun Mk.II", "The Vaccinator", "Bonesaw", "The Ubersaw", "The Vita-Saw", "Amputator", "The Solemn Vow", "Festive Ubersaw", "Festive Bonesaw", "Sniper Rifle", "The Huntsman", "The Syndey Sleeper", "The Bazaar Bargain", "The Machina", "Festive Sniper Rifle", "The Hitman's Heatmaker", "The AWPer Hand", "Silver Botkiller Sniper Rifle Mk.I", "Gold Botkiller Sniper Rifle Mk.I", "Rust Botkiller Sniper Rifle Mk.I", "Blood Botkiller Sniper Rifle Mk.I", "Carbonado Botkiller Sniper Rifle Mk.I", "Diamond Botkiller Sniper Rifle Mk.I", "Silver Botkiller Sniper Rifle Mk.II", "Gold Botkiller Sniper Rifle Mk.II", "Festive Huntsman", "The Fortified Compound", "The Classic", "Shooting Star", "SMG", "The Razorback", "Jarate", "Darwin's Danger Shield", "Cozy Camper", "The Cleaner's Carbine", "Festive Jarate", "The Self-Aware Beauty Mark", "Festive SMG", "Kukri", "The Tribalman's Shiv", "The Bushwacka", "The Shahanshah", "Revolver", "The Ambassador", "Big Kill", "L'Etranger", "The Enforcer", "The Diamondback", "Festive Ambassador", "Festive Revolver", "Sapper", "The Red-Tape Recorder", "The Ap-Sap", "Festive Sapper", "The Snack Attack", "Knife", "Your Eternal Reward", "Conniver's Kunai", "The Big Earner", "The Wanga Prick", "The Sharp Dresser", "The Spy-cicle", "Festive Knife", "The Black Rose", "Silver Botkiller Knife Mk.I", "Gold Botkiller Knife Mk.I", "Rust Botkiller Knife Mk.I", "Blood Botkiller Knife Mk.I", "Carbonado Botkiller Knife Mk.I", "Diamond Botkiller Knife Mk.I", "Silver Botkiller Knife Mk.II", "Gold Botkiller Knife Mk.II", "Invis Watch", "The Dead Ringer", "The Cloak and Dagger", "Enthusiast's Timepiece", "The Quackenbirdt" }));
        boxModel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxModelItemStateChanged(evt);
            }
        });
        infBasicSettings.getContentPane().add(boxModel);
        boxModel.setBounds(140, 250, 360, 23);

        sldLevel.setMinimum(1);
        sldLevel.setValue(1);
        sldLevel.setNextFocusableComponent(txtAmmo);
        sldLevel.setOpaque(false);
        sldLevel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldLevelStateChanged(evt);
            }
        });
        sldLevel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                sldLevelCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        infBasicSettings.getContentPane().add(sldLevel);
        sldLevel.setBounds(270, 160, 200, 20);

        boxQuality.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxQuality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Genuine", "rarity2", "Vintage", "rarity3", "Unusual", "Unique", "Community", "Valve", "Self-Made", "Customized", "Strange", "Completed", "Haunted", "Collector's", "Decorated Weapon" }));
        boxQuality.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxQualityItemStateChanged(evt);
            }
        });
        infBasicSettings.getContentPane().add(boxQuality);
        boxQuality.setBounds(210, 130, 180, 23);

        tabbedPane.addTab("Basic settings", infBasicSettings);

        infAttributes.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        infAttributes.setFrameIcon(null);
        infAttributes.setVisible(true);
        infAttributes.getContentPane().setLayout(null);

        lblIndex1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIndex1.setText("Attribute:");
        infAttributes.getContentPane().add(lblIndex1);
        lblIndex1.setBounds(10, 10, 80, 22);

        boxAttribute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxAttribute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%s1% damage penalty", "+%s1% damage bonus", "%s1% clip size", "+%s1% clip size", "%s1% slower firing speed", "+%s1% faster firing speed", "%s1% heal rate", "+%s1% heal rate", "%s1% ÜberCharge rate", "+%s1% ÜberCharge rate", "+%s1% max overheal", "%s1% shorter overheal time", "+%s1% longer overheal time", "Overheal bonus doesn't decay", "No random critical hits", "On Hit: Gain up to +%s1 health", "On Hit: %s1% ÜberCharge added", "ÜberCharge grants 100% critical chance", "On Hit: +%s1% damage bonus", "100% critical hit vs burning players", "%s1% damage vs non-burning players", "No critical hits vs non-burning players", "No compression blast", "100% critical hits from behind", "+%s1 max health on wearer", "No random critical hits (hidden)", "On Kill: %s1 seconds of 100% critical chance", "On Hit: %s1% chance to slow target", "Cloak Type: Feign Death.", "+%s1% cloak drain rate", "+%s1% cloak regen rate", "%s1% less accurate", "Alt-Fire: Launches a ball that slows opponents", "%s1% damage vs non-stunned players", "No move speed penalty from zoom", "+%s1% charge rate", "No headshots", "Knockback on the target and shooter", "+%s1% bullets per shot", "%s1% zoom reduction", "No zoom or damage charge", "Cloak Type: Motion Sensitive.", "Disables double jump", "Absorbs %s1% damage while cloaked", "Crits on headshot", "Blocks a single backstab attempt", "Wearer cannot ignite", "%s1% slower move speed on wearer", "Coated enemies take mini-crits, Can be used to extinguish fire", "+%s1 health regenerated per second on wearer", "+%s1% self damage force", "%s1% self damage force", "+%s1% fire damage resistance on wearer", "%s1% fire damage vulnerability on wearer", "+%s1% critical hit damage resistance on wearer", "%s1% critical hit damage vulnerability on wearer", "+%s1% explosive damage resistance on wearer", "%s1% explosive damage vulnerability on wearer", "+%s1% bullet damage resistance on wearer", "%s1% bullet damage vulnerability on wearer", "+%s1 capture rate on wearer", "%s1% health from healers on wearer", "+%s1% health from healers on wearer", "+%s1% afterburn damage bonus", "%s1% afterburn damage penalty", "+%s1% afterburn duration", "%s1% afterburn duration", "+%s1% faster move speed while deployed", "+%s1% max primary ammo on wearer", "%s1% max primary ammo on wearer", "+%s1% max secondary ammo on wearer", "%s1% max secondary ammo on wearer", "+%s1% max metal on wearer", "%s1% max metal on wearer", "-%s1% cloak duration", "+%s1% cloak duration", "+%s1% cloak regeneration rate", "%s1% cloak regeneration rate", "%s1% slower spin up time", "%s1% faster spin up time", "+%s1 max pipebombs out", "%s1 max pipebombs out", "%s1% faster power charge", "%s1% slower power charge", "Construction hit speed boost increased by %s1%", "Construction hit speed boost decreased by %s1%", "%s1% faster repair rate", "%s1% slower repair rate", "%s1% slower reload time", "%s1% faster reload time", "On Hit: %s1 health", "+%s1% explosion radius", "%s1% explosion radius", "+%s1% projectile range", "%s1% projectile range", "+%s1% projectile speed", "%s1% projectile speed", "%s1% max overheal", "%s1% more accurate", "+%s1% faster move speed on wearer", "+%s1% health from packs on wearer", "%s1% health from packs on wearer", "On Hit: Gain up to +%s1 health", "On Hit: %s1 health", "+%s1% ammo regenerated every 5 seconds on wearer", "+%s1 metal regenerated every 5 seconds on wearer", "Mini-crits targets launched airborne by explosions, grapple hooks or rocket packs", "Damage increases as the user becomes injured", "%s1% splash damage fall off", "Detonates stickybombs near the crosshair and directly under your feet", "%s1 sec slower bomb arm time", "Able to destroy enemy stickybombs", "%s1% speed boost while active weapon", "Replaces the Sentry with a Mini-Sentry", "%s1 max health on wearer", "%s1 sec faster bomb arm time", "Launched bombs shatter on surfaces", "%s1 health drained per second on wearer", "+%s1% natural regen rate", "-%s1% natural regen rate", "★ Unusual Effect: %s1", "%s1% blast damage from rocket jumps", "mod sentry killed revenge", "+%s1% damage vs buildings", "%s1% damage vs players", "lunchbox adds maxhealth bonus", "+%s1 max health on wearer", "I made this!", "Damage removes Sappers", "Wrench no. %s1", "%s1 metal reduction in building cost", "On Hit: Bleed for %s1 seconds", "Imbued with an ancient power", "Not Tradable or Marketable", "disguise on backstab", "Wearer cannot disguise", "Silent Killer: No attack noise from backstabs", "%s1 sec slower disguise speed", "+%s1% cloak on kill", "%s1 sec longer cloak blink time", "Reduced decloak sound volume", "%s1% less flame spread area", "+%s1% more flame spread area", "%s1% less flame distance", "+%s1% more flame distance", "Airblast can now be charged, which will push enemies further", "+%s1% cloak on hit", "Immune to fire damage while disguised", "+%s1% sentry damage resistance on wearer", "+%s1% airblast cost", "%s1% airblast cost", "Purchased: Not Tradable, Marketable, or Usable in Crafting", "+%s1% flamethrower ammo consumed per second", "%s1% flamethrower ammo consumed per second", "jarate duration", "The wearer cannot be killed by headshots", "%s1% longer weapon switch", "%s1% faster weapon switch", "Crits whenever it would normally mini-crit", "+%s1 health restored on kill", "No self inflicted blast damage taken", "On Hit: Slow target movement by 40% for %s1s", "%s1% slower move speed while deployed", "On death up to %s1% of your stored ÜberCharge is retained", "+%s1 health regenerated per second on wearer", "%s1 health drained per second on wearer", "This is a special Halloween %s1 item", "This weapon holsters %s1% faster", "Alt-Fire: Applies a healing effect to all nearby teammates", "+%s1% faster taunt speed on wearer", "%s1 sec increase in charge duration", "On Kill: A small health pack is dropped", "On Miss: Hit yourself. Idiot.", "%s1% damage from ranged sources while active", "+%s1% damage from melee sources while active", "+%s1% damage to self", "On Hit: target is engulfed in flames", "100% minicrits vs burning players", "Tradable After: %s1", "On Backstab: Absorbs the health from your victim.", "On Hit: One target at a time is Marked-For-Death", "On Kill: Gain %s1% of base health on kill", "On Scoped Bodyshot: Rifle charge rate increased by %s1%", "On Scoped Miss: Rifle charge rate decreased by %s1%", "%s1% increase in damage when health <50% of max", "%s1% decrease in damage when health >50% of max", "Honorbound: Once drawn sheathing deals 50 damage to yourself unless it kills.", "When the medic healing you is killed you gain 2 revenge crits", "Quickfix ÜberCharge", "When the medic healing you is killed you gain mini-crit boost for %s1 seconds", "While a medic is healing you, this weapon's damage is increased by %s1%", "While not being healed by a medic, your weapon switch time is %s1% longer", "Move speed increases as the user becomes injured", "Blocks healing while in use", "On Scoped Headshot: Rifle charge rate increased by %s1%", "Silent Killer: No barrel spin sound", "+%s1% ÜberCharge rate for the medic healing you (no spawn room)", "%s1% faster reload time while being healed", "%s1% slower reload time", "When the medic healing you is killed the killer becomes Marked-For-Death", "%s1% rage lost on hit", "%s1% rage gained on hit", "Gains a damage bonus as rage increases, up to %s1%", "+%s1% increase in turning control while charging", "Can deal charge impact damage at any range", "+%s1% increase in charge impact damage", "+%s1% increase in charge recharge rate", "Grants Triple Jump while deployed. Melee attacks mini-crit while airborne.", "On Hit Teammate: Boosts both players' speed for several seconds", "%s1% reduction in push force taken from damage", "%s1 sec increase in time to cloak", "+%s1% airblast push force", "Ammo collected from ammo boxes becomes health", "Deals 3x falling damage to the player you land on", "%s1% increased melee attack range", "Projectiles penetrate enemy players", "Deals crits while the wielder is rocket jumping", "Base charge rate decreased by %s1%", "Allows you to see enemy health", "Holds a maximum of %s1 charges", "Currently holds %s1 charges", "Each charge lasts %s1 seconds", "Wearer never takes falling damage", "Teleporters can be used in both directions", "+%s1% increase in recharge rate", "+%s1% max misc ammo on wearer", "Does not require ammo", "Cow Mangler Charged Shot Alt-Fire", "Projectile penetrates enemy targets", "Deals only 20% damage to buildings", "Projectile cannot be deflected", "+%s1% max building health", "+%s1% Sentry Gun damage bonus", "Cannot be crit boosted", "Diamondback crits", "Cannot fire unless zoomed", "Per Shot: -%s1 ammo", "On Hit: damage dealt is returned as ammo", "Alt-Fire: Launches a projectile-consuming energy ball. Costs 65 metal.", "Uses metal for ammo", "On Full Charge: +%s1% damage per shot", "Fires tracer rounds", "No headshots when not fully charged", "No reload necessary", "On Full Charge: Projectiles penetrate players", "Killing an enemy with a critical hit will dismember your victim. Painfully.", "%s1% movement speed on targets", "Über duration increased %s1 seconds", "+%s1% buff duration", "+%s1% faster build speed", "Bullets destroy rockets and grenades in-flight.", "Accuracy scales damage", "+%s1% bonus currency from packs", "+%s1% greater jump height when active", "%s1% reduction in airblast vulnerability", "Explode spectacularly on death", "Unable to see enemy health", "On Hit: Victim loses up to %s1% Medigun charge", "On Hit: Victim loses up to %s1% cloak", "On Hit Spy: Reveal cloaked Spy", "On Hit Spy: Reveal disguised Spy", "When backstabbed: Jarate attacker", "+%s1% sentry firing speed", "+%s1% sentry range", "+%s1% dispenser range", "Alt-Fire: Launches a festive ornament that shatters causing bleed", "Backstab turns victim to ice", "Build +%s1 additional disposable-sentry", "Press your reload key to choose to teleport to spawn or your exit teleporter", "Cannot carry buildings", "Stuns enemies who are also wielding this weapon", "Per Shot Missed: -%s1 ammo", "No airblast", "Critical hit forces victim to laugh", "Melts in fire, regenerates in %s1 seconds and by picking up ammo", "All players connected via Medigun beams are hit", "On Hit by Fire: Fireproof for 1 second and Afterburn immunity for %s1 seconds", "Always critical hit from behind", "Critical hits do no damage", "Alt-Fire: Extinguish teammates to gain guaranteed critical hits", "Build 'Mmmph' by dealing damage.", "On Hit: Force enemies to laugh who are also wearing this item", "Generate Rage by dealing damage", "No flinching when aiming and fully charged", "Knockback reduced by %s1% when aiming", "%s1% slower move speed when aiming", "Gain Focus on kills and assists", "Shots go through multiple enemies", "Headshots deal an extra +%s1% damage", "%s1% damage on body shot", "Press 'Reload' to activate focus", "+%s1% faster melee attack speed", "Bullets penetrate +%s1 enemies", "Increase backstab damage against Giant Robots by %s1%", "Wearer cannot carry the intelligence briefcase or PASS Time JACK", "Cannot be backstabbed", "100% critical hit vs disguised players", "100% critical hit vs non-burning players", "On Kill: Burst into joyous laughter", "+%s1% damage bonus while disguised", "+%s1 degrees random projectile deviation", "%s1% damage vulnerability on wearer", "auto fires full clip", "You are Marked-For-Death while active", "Flare knocks back target on hit and explodes when it hits the ground", "Overloading the chamber will cause a misfire", "On Hit: Builds Boost. Run speed increased with Boost", "Boost reduced on air jumps", "No ammo from dispensers when active", "Only visible in Pyroland", "%s1% clip size", "+%s1% sapper damage bonus", "%s1% sapper damage penalty", "+%s1 health regenerated per second for each active sapper", "%s1% sapper health bonus", "%s1% sapper health penalty", "Creates a ring of flames while spun up", "Consumes an additional %s1 ammo per second while spun up", "Reverses enemy building construction", "%s1% sapper damage penalty", "Throw at your enemies to make them bleed!", "100% critical hit vs stunned players", "100% critical hit vs wet players", "On Equip: Visit Pyroland", "Sentry build speed increased by %s1%", "Increases teleporter build speed by %s1%.", "grenade launcher mortar mode", "Cannonballs do not explode on impact", "Alt-Fire: Use %s1 metal to pick up your targeted building from long range", "%s1% damage on contact with surfaces", "Generate building rescue energy on damage", "Self mark for death when hauling buildings", "medigun charge is resists", "Fires a special bolt that can repair friendly buildings", "Cannonballs push players back on impact", "%s1% Overheal build rate.", "Syringes deliver a highly concentrated dose of Mad Milk.", "generate rage on heal", "+%s1% greater jump height when active", "%s1% increase in push force taken from damage", "+%s1% bonus healing from all sources", "Immune to the effects of afterburn.", "Hype Decays Over Time.", "%s1% increase in push force taken from damage", "Increase in push force taken from damage and airblast", "This weapon deploys %s1% faster" }));
        boxAttribute.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxAttributeItemStateChanged(evt);
            }
        });
        infAttributes.getContentPane().add(boxAttribute);
        boxAttribute.setBounds(100, 10, 440, 23);

        txtValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValueFocusLost(evt);
            }
        });
        txtValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValueKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValueKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValueKeyTyped(evt);
            }
        });
        infAttributes.getContentPane().add(txtValue);
        txtValue.setBounds(550, 10, 80, 23);

        attribsListNegative.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attribsListNegative.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attribsListNegativeMousePressed(evt);
            }
        });
        attribsListNegative.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                attribsListNegativeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(attribsListNegative);

        infAttributes.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 260, 410, 130);

        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        infAttributes.getContentPane().add(btnAdd);
        btnAdd.setBounds(270, 50, 73, 30);

        btnRemove.setText("Remove");
        btnRemove.setEnabled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        infAttributes.getContentPane().add(btnRemove);
        btnRemove.setBounds(450, 230, 71, 30);

        lblPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPercent.setText("%");
        infAttributes.getContentPane().add(lblPercent);
        lblPercent.setBounds(630, 10, 20, 20);

        attribsListPositive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attribsListPositive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                attribsListPositiveMousePressed(evt);
            }
        });
        attribsListPositive.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                attribsListPositiveValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(attribsListPositive);

        infAttributes.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 100, 410, 130);

        lblNegative.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNegative.setText("Negative:");
        infAttributes.getContentPane().add(lblNegative);
        lblNegative.setBounds(20, 240, 60, 14);

        lblPositive.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPositive.setText("Positive:");
        infAttributes.getContentPane().add(lblPositive);
        lblPositive.setBounds(20, 80, 50, 14);

        tabbedPane.addTab("Attributes", infAttributes);

        infWeaponCode.setFrameIcon(null);
        infWeaponCode.setVisible(true);

        codeText.setEditable(false);
        codeText.setColumns(20);
        codeText.setRows(5);
        codeText.setText("\"10000\"\n{\n\t\"classname\"\t\t\"tf_weapon_scattergun\"\n\t\"index\"\t\t\t\"13\"\n\t\"slot\"\t\t\t\"0\"\n\t\"quality\"\t\t\"0\"\n\t\"level\"\t\t\t\"1\"\n\t\"attribs\"\t\t\"\"\n\t\"ammo\"\t\t\"20\"\n}");
        codeText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(codeText);

        javax.swing.GroupLayout infWeaponCodeLayout = new javax.swing.GroupLayout(infWeaponCode.getContentPane());
        infWeaponCode.getContentPane().setLayout(infWeaponCodeLayout);
        infWeaponCodeLayout.setHorizontalGroup(
            infWeaponCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        infWeaponCodeLayout.setVerticalGroup(
            infWeaponCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Weapon code", infWeaponCode);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkUsePresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUsePresetActionPerformed
        if(chkUsePreset.isSelected()){
            txtIndex.setEnabled(false);
            txtClassname.setEnabled(false);
            lblModelPreset.setVisible(true);
            boxModel.setVisible(true);
            for(Weapon w: weapons){
                if(w.getName().equals(boxModel.getSelectedItem().toString())){
                    txtClassname.setText(w.getWeaponClass());
                    txtIndex.setText(Integer.toString(w.getIndex()));
                    break;
                }
            }
        }
        else{
            txtIndex.setEnabled(true);
            txtClassname.setEnabled(true);
            lblModelPreset.setVisible(false);
            boxModel.setVisible(false);
        }
    }//GEN-LAST:event_chkUsePresetActionPerformed

    private void txtWeaponNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeaponNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeaponNumberActionPerformed

    private void txtWeaponNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeaponNumberKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtWeaponNumberKeyTyped

    private void txtIndexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndexKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtIndexKeyTyped

    private void txtAmmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmmoKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtAmmoKeyTyped

    private void sldLevelCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_sldLevelCaretPositionChanged
        //Delete
    }//GEN-LAST:event_sldLevelCaretPositionChanged

    private void sldLevelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldLevelStateChanged
        txtLevel.setText(Integer.toString(sldLevel.getValue()));
        level = txtLevel.getText();
    }//GEN-LAST:event_sldLevelStateChanged

    private void boxModelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxModelItemStateChanged
        for(Weapon w: weapons){
            if(w.getName().equals(boxModel.getSelectedItem().toString())){
                txtClassname.setText(w.getWeaponClass());
                txtIndex.setText(Integer.toString(w.getIndex()));
                break;
            }
        }
    }//GEN-LAST:event_boxModelItemStateChanged

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        wepNumber = txtWeaponNumber.getText();
        ammo = txtAmmo.getText();
        index = txtIndex.getText();
        classname = txtClassname.getText();
        updateCode();
    }//GEN-LAST:event_tabbedPaneStateChanged

    private void txtWeaponNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWeaponNumberFocusLost
        if(txtWeaponNumber.getText().isEmpty()){
            txtWeaponNumber.setText("0");
        }
    }//GEN-LAST:event_txtWeaponNumberFocusLost

    private void txtAmmoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmmoFocusLost
        if(txtAmmo.getText().isEmpty()){
            txtAmmo.setText("0");
        }
    }//GEN-LAST:event_txtAmmoFocusLost

    private void boxQualityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxQualityItemStateChanged
        quality = Integer.toString(boxQuality.getSelectedIndex());
    }//GEN-LAST:event_boxQualityItemStateChanged

    private void boxSlotItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxSlotItemStateChanged
        slot = Integer.toString(boxSlot.getSelectedIndex());
    }//GEN-LAST:event_boxSlotItemStateChanged

    private void txtValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValueFocusLost

    private void txtValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValueKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtValueKeyTyped

    private void boxAttributeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxAttributeItemStateChanged
        for(WeaponStat w: stats){
            if(boxAttribute.getSelectedItem().equals(w.getDescription())){
                switch (w.getType()) {
                    case "percentage":
                    case "inverted_percentage":
                        lblPercent.setVisible(true);
                        txtValue.setVisible(true);
                        txtValue.setText("");
                        btnAdd.setEnabled(false);
                        break;
                    case "constant":
                        lblPercent.setVisible(false);
                        txtValue.setVisible(false);
                        txtValue.setText("");
                        w.setValue(1);
                        btnAdd.setEnabled(true);
                        break;
                    default:
                        //Additive
                        lblPercent.setVisible(false);
                        txtValue.setVisible(true);
                        txtValue.setText("");
                        btnAdd.setEnabled(false);
                        break;
                }
                curWeaponStat = w;
                break;
            }
        }
    }//GEN-LAST:event_boxAttributeItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        btnAdd.setEnabled(false);
        if(!curWeaponStat.getType().equals("constant"))
            curWeaponStat.setValue(Double.parseDouble(txtValue.getText()));
        if(!addedStats.contains(curWeaponStat)){
            addedStats.add(curWeaponStat);
            if(curWeaponStat.isPositive()){
                positiveStats.addElement(curWeaponStat.displayAttrib());
            }
            else{
                negativeStats.addElement(curWeaponStat.displayAttrib());
            }
            if(attribs.isEmpty()){
                attribs = curWeaponStat.getCode();
            }
            else{
                attribs += " ; " + curWeaponStat.getCode();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValueKeyPressed
        
    }//GEN-LAST:event_txtValueKeyPressed

    private void txtValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValueKeyReleased
        if(txtValue.getText().isEmpty()){
            btnAdd.setEnabled(false);
        }
        else{
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_txtValueKeyReleased

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String str = attribs;
        
        
        
        if(attribsListPositive.getSelectedValue()!=null){
            addedStats.remove(attribsListPositive.getSelectedIndex());
            positiveStats.remove(attribsListPositive.getSelectedIndex());
        }
        else if(attribsListNegative.getSelectedValue()!=null){
            addedStats.remove(attribsListNegative.getSelectedIndex());
            negativeStats.remove(attribsListNegative.getSelectedIndex());
        }
        btnRemove.setEnabled(false);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void attribsListPositiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attribsListPositiveMousePressed
        attribsListNegative.clearSelection();
    }//GEN-LAST:event_attribsListPositiveMousePressed

    private void attribsListNegativeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attribsListNegativeMousePressed
        attribsListPositive.clearSelection();
    }//GEN-LAST:event_attribsListNegativeMousePressed

    private void attribsListPositiveValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_attribsListPositiveValueChanged
        btnRemove.setEnabled(true);
    }//GEN-LAST:event_attribsListPositiveValueChanged

    private void attribsListNegativeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_attribsListNegativeValueChanged
        btnRemove.setEnabled(true);
    }//GEN-LAST:event_attribsListNegativeValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> attribsListNegative;
    private javax.swing.JList<String> attribsListPositive;
    private javax.swing.JComboBox<String> boxAttribute;
    private javax.swing.JComboBox<String> boxModel;
    private javax.swing.JComboBox<String> boxQuality;
    private javax.swing.JComboBox<String> boxSlot;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBox chkUsePreset;
    private javax.swing.JTextArea codeText;
    private javax.swing.JInternalFrame infAttributes;
    private javax.swing.JInternalFrame infBasicSettings;
    private javax.swing.JInternalFrame infWeaponCode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAmmo;
    private javax.swing.JLabel lblClassname;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JLabel lblIndex1;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblModelPreset;
    private javax.swing.JLabel lblNegative;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblPositive;
    private javax.swing.JLabel lblQuality;
    private javax.swing.JLabel lblSlot;
    private javax.swing.JLabel lblWeaponNumber;
    private javax.swing.JSlider sldLevel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtAmmo;
    private javax.swing.JTextField txtClassname;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtValue;
    private javax.swing.JTextField txtWeaponNumber;
    // End of variables declaration//GEN-END:variables
}
