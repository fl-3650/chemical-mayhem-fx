/*
 * Copyright (c) 2024. RGBTeam
 */


package com.rgbteam.cmf;

import com.rgbteam.cmf.chemistry.Compound;
import com.rgbteam.cmf.chemistry.Element;
import com.rgbteam.cmf.chemistry.InvalidCompoundException;
import com.rgbteam.cmf.chemistry.PeriodicTable;

public class GeneralFlowController {
    public Element retrieveElementByNumber(int number) {
        return PeriodicTable.getElementByNumber(number);
    }

    public Element retrieveElementByShortName(String shortName) {
        return PeriodicTable.getElementByShortName(shortName);
    }

    public Element retrieveElementByFullName(String fullName) {
        return PeriodicTable.getElementByFullName(fullName);
    }

    public Double calculateCompoundsAtomicMass(String rawCompound) throws InvalidCompoundException {
        return 31212321.0;
    }

    public String retrieveElementGroup(int number) {
        return PeriodicTable.getElementGroup(number);
    }
}
