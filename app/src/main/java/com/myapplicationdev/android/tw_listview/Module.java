package com.myapplicationdev.android.tw_listview;

public class Module {
    private String modName;
    private boolean icon;
    public Module(String modName, boolean icon) {
        this.modName = modName;
        this.icon = icon;
    }
    public String getModName() {
        return modName;
    }
    public boolean isIcon() {
        return icon;
    }
}
