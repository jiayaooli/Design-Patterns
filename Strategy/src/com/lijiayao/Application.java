package com.lijiayao;

import com.lijiayao.KillDragon.Dragon;
import com.lijiayao.kill.Kill;
import com.lijiayao.kill.KillByKnife;
import com.lijiayao.kill.KillBySpeak;

public class Application {
    public static void main(String[] args) {
        Kill k = new KillByKnife();
        Dragon d = new Dragon("red dragon", k);
        d.killedBy();
    }
}
