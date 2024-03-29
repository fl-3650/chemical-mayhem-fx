/*
 * Copyright (c) 2024. RGBTeam
 */

 
package com.rgbteam.cmf.chemistry;

public class PeriodicTable {
    private static final Element[] TABLE = {
            new Element("H", "Hydrogen", 1, "Nonmetals", 1.008),
            new Element("He", "Helium", 2, "Noble gases", 4.0026),
            new Element("Li", "Lithium", 3, "Alkali metals", 6.94),
            new Element("Be", "Beryllium", 4, "Alkaline earth metals", 9.0122),
            new Element("B", "Boron", 5, "Metalloids", 10.81),
            new Element("C", "Carbon", 6, "Nonmetals", 12.011),
            new Element("N", "Nitrogen", 7, "Nonmetals", 14.007),
            new Element("O", "Oxygen", 8, "Nonmetals", 15.999),
            new Element("F", "Fluorine", 9, "Halogen", 18.998),
            new Element("Ne", "Neon", 10, "Noble gases", 20.180),
            new Element("Na", "Sodium", 11, "Alkali metals", 22.990),
            new Element("Mg", "Magnesium", 12, "Alkaline earth metals", 24.305),
            new Element("Al", "Aluminum", 13, "Post-transition metals", 26.982),
            new Element("Si", "Silicon", 14, "Metalloids", 28.085),
            new Element("P", "Phosphorus", 15, "Nonmetals", 30.974),
            new Element("S", "Sulfur", 16, "Nonmetals", 32.06),
            new Element("Cl", "Chlorine", 17, "Halogen", 35.45),
            new Element("Ar", "Argon", 18, "Noble gases", 39.948),
            new Element("K", "Potassium", 19, "Alkali metals", 39.098),
            new Element("Ca", "Calcium", 20, "Alkaline earth metals", 40.078),
            new Element("Sc", "Scandium", 21, "Transition metals", 44.956),
            new Element("Ti", "Titanium", 22, "Transition metals", 47.867),
            new Element("V", "Vanadium", 23, "Transition metals", 50.942),
            new Element("Cr", "Chromium", 24, "Transition metals", 51.996),
            new Element("Mn", "Manganese", 25, "Transition metals", 54.938),
            new Element("Fe", "Iron", 26, "Transition metals", 55.845),
            new Element("Co", "Cobalt", 27, "Transition metals", 58.933),
            new Element("Ni", "Nickel", 28, "Transition metals", 58.693),
            new Element("Cu", "Copper", 29, "Transition metals", 63.546),
            new Element("Zn", "Zinc", 30, "Transition metals", 65.38),
            new Element("Ga", "Gallium", 31, "Post-transition metals", 69.723),
            new Element("Ge", "Germanium", 32, "Metalloids", 72.630),
            new Element("As", "Arsenic", 33, "Metalloids", 74.922),
            new Element("Se", "Selenium", 34, "Nonmetals", 78.971),
            new Element("Br", "Bromine", 35, "Halogen", 79.904),
            new Element("Kr", "Krypton", 36, "Noble gases", 83.798),
            new Element("Rb", "Rubidium", 37, "Alkali metals", 85.468),
            new Element("Sr", "Strontium", 38, "Alkaline earth metals", 87.62),
            new Element("Y", "Yttrium", 39, "Transition metals", 88.906),
            new Element("Zr", "Zirconium", 40, "Transition metals", 91.224),
            new Element("Nb", "Niobium", 41, "Transition metals", 92.906),
            new Element("Mo", "Molybdenum", 42, "Transition metals", 95.95),
            new Element("Tc", "Technetium", 43, "Transition metals", 98.0),
            new Element("Ru", "Ruthenium", 44, "Transition metals", 101.07),
            new Element("Rh", "Rhodium", 45, "Transition metals", 102.91),
            new Element("Pd", "Palladium", 46, "Transition metals", 106.42),
            new Element("Ag", "Silver", 47, "Transition metals", 107.87),
            new Element("Cd", "Cadmium", 48, "Transition metals", 112.41),
            new Element("In", "Indium", 49, "Post-transition metals", 114.82),
            new Element("Sn", "Tin", 50, "Post-transition metals", 118.71),
            new Element("Sb", "Antimony", 51, "Metalloids", 121.76),
            new Element("Te", "Tellurium", 52, "Metalloids", 127.60),
            new Element("I", "Iodine", 53, "Halogen", 126.904),
            new Element("Xe", "Xenon", 54, "Noble gases", 131.294),
            new Element("Cs", "Cesium", 55, "Alkali metals", 132.91),
            new Element("Ba", "Barium", 56, "Alkaline earth metals", 137.33),
            new Element("La", "Lanthanum", 57, "Lanthanoids", 138.91),
            new Element("Ce", "Cerium", 58, "Lanthanoids", 140.12),
            new Element("Pr", "Praseodymium", 59, "Lanthanoids", 140.91),
            new Element("Nd", "Neodymium", 60, "Lanthanoids", 144.24),
            new Element("Pm", "Promethium", 61, "Lanthanoids", 145.0),
            new Element("Sm", "Samarium", 62, "Lanthanoids", 150.36),
            new Element("Eu", "Europium", 63, "Lanthanoids", 151.96),
            new Element("Gd", "Gadolinium", 64, "Lanthanoids", 157.25),
            new Element("Tb", "Terbium", 65, "Lanthanoids", 158.93),
            new Element("Dy", "Dysprosium", 66, "Lanthanoids", 162.50),
            new Element("Ho", "Holmium", 67, "Lanthanoids", 164.93),
            new Element("Er", "Erbium", 68, "Lanthanoids", 167.26),
            new Element("Tm", "Thulium", 69, "Lanthanoids", 168.93),
            new Element("Yb", "Ytterbium", 70, "Lanthanoids", 173.05),
            new Element("Lu", "Lutetium", 71, "Lanthanoids", 174.97),
            new Element("Hf", "Hafnium", 72, "Transition metals", 178.49),
            new Element("Ta", "Tantalum", 73, "Transition metals", 180.9479),
            new Element("W", "Tungsten", 74, "Transition metals", 183.84),
            new Element("Re", "Rhenium", 75, "Transition metals", 186.207),
            new Element("Os", "Osmium", 76, "Transition metals", 190.2),
            new Element("Ir", "Iridium", 77, "Transition metals", 192.22),
            new Element("Pt", "Platinum", 78, "Transition metals", 195.08),
            new Element("Au", "Gold", 79, "Transition metals", 196.96657),
            new Element("Hg", "Mercury", 80, "Transition metals", 200.59),
            new Element("Tl", "Thallium", 81, "Post-transition metals", 204.383),
            new Element("Pb", "Lead", 82, "Post-transition metals", 207.0),
            new Element("Bi", "Bismuth", 83, "Post-transition metals", 208.98040),
            new Element("Po", "Polonium", 84, "Metalloids", 208.98243),
            new Element("At", "Astatine", 85, "Halogen", 209.98715),
            new Element("Rn", "Radon", 86, "Noble gases", 222.01758),
            new Element("Fr", "Francium", 87, "Alkali metals", 223.01973),
            new Element("Ra", "Radium", 88, "Alkaline earth metals", 226.02541),
            new Element("Ac", "Actinium", 89, "Actinoids", 227.02775),
            new Element("Th", "Thorium", 90, "Actinoids", 232.038),
            new Element("Pa", "Protactinium", 91, "Actinoids", 231.03588),
            new Element("U", "Uranium", 92, "Actinoids", 238.0289),
            new Element("Np", "Neptunium", 93, "Actinoids", 237.048172),
            new Element("Pu", "Plutonium", 94, "Actinoids", 244.06420),
            new Element("Am", "Americium", 95, "Actinoids", 243.061380),
            new Element("Cm", "Curium", 96, "Actinoids", 247.07035),
            new Element("Bk", "Berkelium", 97, "Actinoids", 247.07031),
            new Element("Cf", "Californium", 98, "Actinoids", 251.07959),
            new Element("Es", "Einsteinium", 99, "Actinoids", 252.0830),
            new Element("Fm", "Fermium", 100, "Actinoids", 257.09511),
            new Element("Md", "Mendelevium", 101, "Actinoids", 258.09843),
            new Element("No", "Nobelium", 102, "Actinoids", 259.10100),
            new Element("Lr", "Lawrencium", 103, "Actinoids", 266.120),
            new Element("Rf", "Rutherfordium", 104, "Transition metals", 267.122),
            new Element("Db", "Dubnium", 105, "Transition metals", 268.126),
            new Element("Sg", "Seaborgium", 106, "Transition metals", 269.128),
            new Element("Bh", "Bohrium", 107, "Transition metals", 270.133),
            new Element("Hs", "Hassium", 108, "Transition metals", 269.1336),
            new Element("Mt", "Meitnerium", 109, "Transition metals", 277.154),
            new Element("Ds", "Darmstadtium", 110, "Transition metals", 282.166),
            new Element("Rg", "Roentgenium", 111, "Transition metals", 282.169),
            new Element("Cn", "Copernicium", 112, "Transition metals", 286.179),
            new Element("Nh", "Nihonium", 113, "Post-transition metals", 286.182),
            new Element("Fl", "Flerovium", 114, "Post-transition metals", 290.192),
            new Element("Mc", "Moscovium", 115, "Post-transition metals", 290.196),
            new Element("Lv", "Livermorium", 116, "Post-transition metals", 293.205),
            new Element("Ts", "Tennessine", 117, "Halogen", 294.211),
            new Element("Og", "Oganesson", 118, "Noble gases", 295.216)
    };

    public static Element getElementByNumber(int queryNumber) {
        if (queryNumber >= 1 && queryNumber <= TABLE.length)
            return TABLE[queryNumber - 1];

        return null;
    }

    public static Element getElementByShortName(String queryShortName) {
        for (Element item : TABLE)
            if (item.getShortName().equalsIgnoreCase(queryShortName))
                return item;

        return null;
    }

    public static Element getElementByFullName(String queryFullName) {
        for (Element item : TABLE)
            if (item.getFullName().equalsIgnoreCase(queryFullName))
                return item;

        return null;
    }

    public static String getElementGroup(int queryNumber) {
        if (queryNumber >= 1 && queryNumber <= TABLE.length) {
            Element e = TABLE[queryNumber - 1];
            return e.getGroupElement();
        }
        return null;
    }
}
