package com.example.hairstylechanger.picturechooser;

class BucketItem extends GridItem {

    final int id;
    int images = 1;


    public BucketItem(final String n, final String p,final String taken, int i) {
        super(n, p,taken,0);
        id = i;
    }

}
