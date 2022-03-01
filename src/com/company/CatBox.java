package com.company;

public class CatBox {
    private int weight;
    private int height;
    private int depth;

    CatBox(int w, int h, int d) {
        this.weight = w;
        this.height = h;
        this.depth = d;
    }

    int getVolume() {
        return weight * height * depth;

    }
    void setDim(int w, int h, int d) {
        weight = w;
        height = h;
        depth = d;
    }
}
