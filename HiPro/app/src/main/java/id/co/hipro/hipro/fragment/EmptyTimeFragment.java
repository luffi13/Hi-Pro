package id.co.hipro.hipro.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.co.hipro.hipro.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EmptyTimeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EmptyTimeFragment extends Fragment {

    public EmptyTimeFragment() {
        // Required empty public constructor
    }

    public static EmptyTimeFragment newInstance(String uid) {
        EmptyTimeFragment fragment = new EmptyTimeFragment();
        Bundle args = new Bundle();
        args.putString("uid",uid);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_empty_time,container,false);

        return view;
    }

}
