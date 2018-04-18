package com.birkhoffchu.homecomponent;

import android.support.v4.app.Fragment;

import com.birkhoffchu.componentservice.ReadbookService;

/**
 * Created by jerry on 2018/4/13.
 */

public class ReadbookServiceImp implements ReadbookService {


    @Override
    public Fragment getReadbookFragment() {
        return new BlankFragment();
    }
}
