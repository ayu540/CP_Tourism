package com.example.anshultech.cp_tourism;


import android.content.Context;
import android.support.v4.app.*;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by AnshulTech on 17-Dec-17.
 */

public class Category_Adapter extends FragmentPagerAdapter {

    private Context mContext;

    public Category_Adapter(Context context,FragmentManager fm) {
        super(fm);
        mContext= context;
    }


    public Fragment getItem(int position) {
        if(position==0){
            return new Historical_PlacesFragment();

        }else if(position ==1){
            return new ReligiousPlacesFragment();
        }else if(position ==2){
            return new RestaurantsFragment();
        }else{
            return new ShoppingHubFragment();
        }

    }

    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return mContext.getString(R.string.Historical_Places_title);
        }else if(position ==1){
            return mContext.getString(R.string.Religious_Places_title);
        }else if(position ==2){
            return mContext.getString(R.string.Restraunts_title_title);
        }else{
            return mContext.getString(R.string.Shopping_Hub_title);
        }

    }
}
