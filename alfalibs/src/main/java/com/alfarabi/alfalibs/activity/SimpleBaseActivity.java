package com.alfarabi.alfalibs.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.alfarabi.alfalibs.fragments.interfaze.SimpleFragmentInitiator;
import com.alfarabi.alfalibs.tools.Gilimanuk;
import com.alfarabi.alfalibs.tools.WLog;


/**
 * Created by Alfarabi on 6/15/17.
 */

public abstract class SimpleBaseActivity extends AppCompatActivity implements SimpleActivityInitiator{

    public String TAG = SimpleBaseActivity.class.getName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getTAG();
        WLog.d(TAG,"onCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        WLog.d(TAG,"onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        WLog.d(TAG,"onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        WLog.d(TAG,"onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        WLog.d(TAG,"onStop()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        WLog.d(TAG,"onRestart()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        WLog.d(TAG,"onDestroy()");
        System.gc();
    }

    @Override
    public void onBackPressed() {
        WLog.d(TAG,"onBackPressed()");

        /**
         * commented by asad 19-10-2021
         * */
//        if(Gilimanuk.currentFragment(this)!=null){
//            Fragment fragment = Gilimanuk.currentFragment(this); //getSupportFragmentManager().findFragmentByTag(getFragmentTag());
//            if(fragment !=null && fragment instanceof SimpleFragmentInitiator){
//                if(!((SimpleFragmentInitiator) fragment).onBackPressed()){
//                    // Disable Back During Fragment OnBack Pressed Returned FALSE
//                    // It Can Be used to prevent back navigation and make a custom action inside fragment when User click back
//                    return;
//                }
//            }
//        }
//        if(Gilimanuk.canGoBack(this)){
//            // Will be navigate to previous fragment
//            Gilimanuk.backstack(this);
//            return ;
//        }
        // Will be navigate to previous activity nor finish current
        super.onBackPressed();

    }

}
