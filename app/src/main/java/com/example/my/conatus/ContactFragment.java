package com.example.my.conatus;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContactFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        String fbvalue = "<html><a href=\"http://www.facebook.com/conatus.akg/\">Join us on:</a></html>";
        TextView fbtext = (TextView) view.findViewById(R.id.fblink);
        fbtext.setText(Html.fromHtml(fbvalue));
        fbtext.setMovementMethod(LinkMovementMethod.getInstance());

        String instavalue = "<html><a href=\"http://www.instagram.com/conatus.akg/\">Follow us on:</a></html>";
        TextView instatext = (TextView) view.findViewById(R.id.instalink);
        instatext.setText(Html.fromHtml(instavalue));
        instatext.setMovementMethod(LinkMovementMethod.getInstance());



         return view;


    }
}
