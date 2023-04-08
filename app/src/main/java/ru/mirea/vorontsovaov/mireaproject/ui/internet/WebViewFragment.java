package ru.mirea.vorontsovaov.mireaproject.ui.internet;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ru.mirea.vorontsovaov.mireaproject.R;
import ru.mirea.vorontsovaov.mireaproject.databinding.FragmentInternetBinding;
import ru.mirea.vorontsovaov.mireaproject.databinding.FragmentHomeBinding;
import ru.mirea.vorontsovaov.mireaproject.databinding.FragmentInternetBinding;


public class WebViewFragment extends Fragment {

    private FragmentInternetBinding binding;
    public WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_internet, container, false);
        webView = (WebView)v.findViewById(R.id.wb);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/");



        binding = FragmentInternetBinding.inflate(inflater, container, false);
        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}