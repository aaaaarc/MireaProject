package ru.mirea.vorontsovaov.mireaproject.ui.data;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ru.mirea.vorontsovaov.mireaproject.R;
import ru.mirea.vorontsovaov.mireaproject.databinding.FragmentDataBinding;
import ru.mirea.vorontsovaov.mireaproject.databinding.FragmentInternetBinding;
import ru.mirea.vorontsovaov.mireaproject.databinding.FragmentHomeBinding;
import ru.mirea.vorontsovaov.mireaproject.databinding.FragmentInternetBinding;


public class DataFragment extends Fragment {

    private Button button1;
    private ScrollView scroll1;

    private FragmentDataBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDataBinding.inflate(inflater, container, false);

        scroll1 = binding.scroll1;
        scroll1.setVisibility(View.GONE);
        button1 = binding.materialButton1;
        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll1.setVisibility(View.VISIBLE);

            }
        };
        button1.setOnClickListener(onClick);


        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}