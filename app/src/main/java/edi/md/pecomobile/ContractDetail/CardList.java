package edi.md.pecomobile.ContractDetail;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edi.md.pecomobile.R;

public class CardList extends Fragment {
    View rootViewAdmin;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootViewAdmin = inflater.inflate(R.layout.fragment_news, container, false);


        return rootViewAdmin;
    }
}
