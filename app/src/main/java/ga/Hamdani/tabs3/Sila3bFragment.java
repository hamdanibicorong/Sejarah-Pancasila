package ga.Hamdani.tabs3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import ga.Hamdani.pancasila.R;

/**
 * Created by ghostonk on 29/11/16.
 */
public class Sila3bFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_tab2, container, false);

        final WebView mWb = (WebView) mView.findViewById(R.id.wv_Tab2);
        mWb.loadUrl("file:///android_asset/web/sila3/pagemaknaC.html");
        mWb.getSettings().setJavaScriptEnabled(true);

        return mView;
    }
}