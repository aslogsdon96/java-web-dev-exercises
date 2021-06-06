package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        Integer price1 = (int)o1.getCost();
        Integer price2 = (int)o1.getCost();
        return price1.compareTo(price2);
    }
}
