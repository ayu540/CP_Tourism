package com.example.anshultech.cp_tourism;

/**
 * Created by AnshulTech on 18-Dec-17.
 */

public class word {

    private String mName;

    private String mDetails;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public word(String defaultTranslation, String miwokTranslation, int imageResourceID){

        mName=defaultTranslation;
        mDetails=miwokTranslation;
        mImageResourceID =imageResourceID;


    }

    public String getmName(){return mName;}

    public String getmDetails(){return mDetails;}

    public int getmImageResourceID(){return mImageResourceID;}

    public  boolean hasImage(){
        return mImageResourceID!= NO_IMAGE_PROVIDED;

    }

}
