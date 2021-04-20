package com.zhang.design.patterns.structural.adapter;

public class TypeCNormalAdapter extends NormalEarphone implements TypeCPhone  {
    @Override
    public void audioMusic() {
        super.listenMusic();
    }
}
