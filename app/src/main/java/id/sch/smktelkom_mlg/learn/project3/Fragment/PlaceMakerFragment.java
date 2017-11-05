package id.sch.smktelkom_mlg.learn.project3.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom_mlg.learn.project3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceMakerFragment extends Fragment {


    public PlaceMakerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place_maker, container, false);
    }

}
