package com.btk.viewmodelsampleapp;

import android.arch.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private int count  = 0;

    public void increamentCount() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
