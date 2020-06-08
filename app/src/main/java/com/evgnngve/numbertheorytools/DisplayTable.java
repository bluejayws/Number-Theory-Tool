package com.evgnngve.numbertheorytools;

import android.app.Activity;

import java.util.ArrayList;

public class DisplayTable extends Activity {
    public ArrayList<ArrayList<Integer>> getModTable() {
        return modTable;
    }
    public void setModTable(ArrayList<ArrayList<Integer>> modTable) {
        this.modTable = modTable;
    }
    ArrayList<ArrayList<Integer>> modTable;


}
