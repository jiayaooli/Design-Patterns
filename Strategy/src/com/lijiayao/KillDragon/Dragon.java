package com.lijiayao.KillDragon;

import com.lijiayao.kill.Kill;

public class Dragon {
    String name;
    Kill kill;
    public Dragon() {
    }
    public Dragon(String name, Kill k) {
        this.name = name;
        this.kill = k;
    }
    public void killedBy() {
        kill.killMethod();
    }
}
