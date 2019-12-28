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

/**
 *
 * @author Matthew Cumbo
 */
public class MainFrame extends javax.swing.JFrame {

    private ArrayList<Weapon> weapons;
    private ArrayList<WeaponStat> stats;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initWeaponDatabase();
        initStatDatabase();
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
    }
    
    private void initStatDatabase(){
        stats = new ArrayList<>();
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
        txtQuality = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblModelPreset = new javax.swing.JLabel();
        txtAmmo = new javax.swing.JTextField();
        boxSlot = new javax.swing.JComboBox<>();
        lblClassname = new javax.swing.JLabel();
        chkUsePreset = new javax.swing.JCheckBox();
        lblAmmo = new javax.swing.JLabel();
        boxModel = new javax.swing.JComboBox<>();
        infAttributes = new javax.swing.JInternalFrame();
        lblIndex1 = new javax.swing.JLabel();
        boxAttribute = new javax.swing.JComboBox<>();
        infWeaponCode = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        codeText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TF2 Custom Weapon Helper");
        setResizable(false);

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
        infBasicSettings.getContentPane().add(txtWeaponNumber);
        txtWeaponNumber.setBounds(210, 10, 90, 23);

        txtClassname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClassname.setText("tf_weapon_rocketlauncher");
        txtClassname.setEnabled(false);
        infBasicSettings.getContentPane().add(txtClassname);
        txtClassname.setBounds(210, 40, 240, 23);

        lblIndex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIndex.setText("Index:");
        infBasicSettings.getContentPane().add(lblIndex);
        lblIndex.setBounds(10, 70, 140, 22);

        txtIndex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIndex.setText("228");
        txtIndex.setEnabled(false);
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

        txtQuality.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuality.setText("6");
        infBasicSettings.getContentPane().add(txtQuality);
        txtQuality.setBounds(210, 130, 50, 23);

        lblLevel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLevel.setText("Level:");
        infBasicSettings.getContentPane().add(lblLevel);
        lblLevel.setBounds(10, 160, 140, 22);

        txtLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLevel.setText("29");
        infBasicSettings.getContentPane().add(txtLevel);
        txtLevel.setBounds(210, 160, 50, 23);

        lblModelPreset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblModelPreset.setText("Model preset:");
        infBasicSettings.getContentPane().add(lblModelPreset);
        lblModelPreset.setBounds(10, 250, 130, 22);

        txtAmmo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmmo.setText("20");
        infBasicSettings.getContentPane().add(txtAmmo);
        txtAmmo.setBounds(210, 190, 80, 23);

        boxSlot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primary", "Secondary", "Melee", "PDA", "Sapper", "Invis watch" }));
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
        boxModel.setSelectedIndex(55);
        infBasicSettings.getContentPane().add(boxModel);
        boxModel.setBounds(140, 250, 360, 23);

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
        boxAttribute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Damage penalty", "Damage bonus", "Lower clip size", "Increased clip size", "Slower firing speed", "Faster firing speed", "Slower heal rate", "Faster heal rate", "Ubercharge rate penalty", "Ubercharge rate bonus", "Overheal bonus", "Overheal decay penalty", "Overheal decay bonus", "Overheal decay disabled", "No random critical hits", "On Hit: Gain up to +%s1 health", "On Hit: %s1% Ubercharge added", "Ubercharge grants 100% critical chance", "On Hit: +%s1% damage bonus", "100% critical hit vs burning players", "Damage penalty vs non-burning players", "No critical hits vs non-burning players", "No compression blast", "100% critical hits from behind", "Increased max health on wearer", "No random critical hits (hidden)", "On Kill: %s1 seconds of 100% critical chance", "On Hit: %s1% chance to slow target", "Cloak Type: Feign Death", "Cloak drain rate", "Cloak regen rate", "Spread penalty", "Alt-Fire: Launches a ball that slows opponents", "%s1% damage vs non-stunned players", "No move penalty from zoom", "Charge rate bonus", "No headshots", "Knockback on the target and shooter", "Increased bullets per shot", "Zoom reduction", "No zoom or damage charge", "Cloak Type: Motion Sensitive", "Disables double jump", "Absorbs %s1% damage while cloaked", "Crits on headshot", "Blocks a single backstab attempt", "Wearer cannot ignite", "Slower move speed on wearer", "Increased health regenerated per second on wearer", "Increased self damage force", "Decreased self damage force", "Increased fire damage resistance on wearer", "Increased fire damage vulnerability on wearer", "Critical hit damage resistance on wearer", "Critical hit damage vulnerability on wearer", "Explosive damage resistance on wearer", "Explosive damage vulnerability on wearer", "Bullet damage resistance on wearer", "Bullet damage vulnerability on wearer", "Increased capture rate", "Decreased health from healers on wearer", "Increased health from healers on wearer", "Afterburn damage bonus", "Afterburn damage penalty", "Increased afterburn duration", "Decreased afterburn duration", "Faster move speed while deployed", "Increased max primary ammo on wearer", "Decreased max primary ammo on wearer", "Increased secondary ammo on wearer", "Decreased secondary ammo on wearer", "Increased max metal on wearer", "Decreased max metal on wearer", "Increased cloak regeneration rate", "Decreased cloak regeneration rate", "Slower spin up time", "Faster spin up time", "Max pipebombs out increased", "Max pipebombs out decreased", "Sniper rifle charge increased", "Sniper rifle charge decreased", "Construction rate increased", "Construction rate decreased", "Faster repair rate", "Slower repair rate", "Slower reload time", "Faster reload time", "On Hit: %s1 health", "Blast radius increased", "Blast radius decreased", "Projectile range increased", "Projectile range decreased", "Projectile speed increased", "Projectile speed decreased", "Decreased max overheal", "Increased accuracy", "Faster move speed on wearer", "Increased health from packs on wearer", "Decreased health from packs on wearer", "On Hit: Gain up to +%s1 health", "Ammo regenerated every 5 seconds on wearer", "Metal regenerated every 5 seconds on wearer", "Mini-crits targets launched airborne by explosions, grapple hooks or rocket packs", "Damage increases as the user becomes injured", "Detonates stickybombs near the crosshair and directly under your feet", "Slower stickybomb arm time", "Able to destroy enemy stickybombs" }));
        infAttributes.getContentPane().add(boxAttribute);
        boxAttribute.setBounds(100, 10, 390, 23);

        tabbedPane.addTab("Attributes", infAttributes);

        infWeaponCode.setFrameIcon(null);
        infWeaponCode.setVisible(true);

        codeText.setEditable(false);
        codeText.setColumns(20);
        codeText.setRows(5);
        codeText.setText("\"10000\"\n{\n\t\"classname\"\t\t\"tf_weapon_rocketlauncher\"\n\t\"index\"\t\t\t\"228\"\n\t\"slot\"\t\t\t\"0\"\n\t\"quality\"\t\t\"6\"\n\t\"level\"\t\t\t\"29\"\n\t\"attribs\"\t\t\"134 ; 19\"\n\t\"ammo\"\t\t\"20\"\n}");
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
        }
        else{
            txtIndex.setEnabled(true);
            txtClassname.setEnabled(true);
            lblModelPreset.setVisible(false);
            boxModel.setVisible(false);
        }
    }//GEN-LAST:event_chkUsePresetActionPerformed

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
    private javax.swing.JComboBox<String> boxAttribute;
    private javax.swing.JComboBox<String> boxModel;
    private javax.swing.JComboBox<String> boxSlot;
    private javax.swing.JCheckBox chkUsePreset;
    private javax.swing.JTextArea codeText;
    private javax.swing.JInternalFrame infAttributes;
    private javax.swing.JInternalFrame infBasicSettings;
    private javax.swing.JInternalFrame infWeaponCode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmmo;
    private javax.swing.JLabel lblClassname;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JLabel lblIndex1;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblModelPreset;
    private javax.swing.JLabel lblQuality;
    private javax.swing.JLabel lblSlot;
    private javax.swing.JLabel lblWeaponNumber;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtAmmo;
    private javax.swing.JTextField txtClassname;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtQuality;
    private javax.swing.JTextField txtWeaponNumber;
    // End of variables declaration//GEN-END:variables
}
