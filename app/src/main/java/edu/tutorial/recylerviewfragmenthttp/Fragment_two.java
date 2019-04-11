package edu.tutorial.recylerviewfragmenthttp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_two extends Fragment {
    public static Fragment_two newInstance()
    {
        Fragment_two fragmentTwo = new Fragment_two();
        return fragmentTwo;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final  View rootView = inflater.inflate(R.layout.fragmenttwo,container,false);
        return rootView;
    }
}
