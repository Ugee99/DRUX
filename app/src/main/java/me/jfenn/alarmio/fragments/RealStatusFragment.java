package me.jfenn.alarmio.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.afollestad.aesthetic.Aesthetic;

import org.jetbrains.annotations.NotNull;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.jfenn.alarmio.R;
import me.jfenn.alarmio.interfaces.ContextFragmentInstantiator;

public class RealStatusFragment extends BasePagerFragment {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater,
                             @Nullable @org.jetbrains.annotations.Nullable ViewGroup container,
                             @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_realstatus, container, false);

        ImageButton LED_1 = v.findViewById(R.id.LED_1);
        ImageButton LED_2 = v.findViewById(R.id.LED_2);
        ImageButton LED_3 = v.findViewById(R.id.LED_3);
        ImageButton LED_4 = v.findViewById(R.id.LED_4);
        ImageButton LED_5 = v.findViewById(R.id.LED_5);
        ImageButton LED_6 = v.findViewById(R.id.LED_6);
        ImageButton LED_7 = v.findViewById(R.id.LED_7);

        LED_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LED_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LED_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LED_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LED_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LED_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LED_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;
    }//onCreateView 닫기

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public String getTitle(Context context) {
        return context.getString(R.string.title_RealStatus);
    }

    public static class Instantiator extends ContextFragmentInstantiator {

        public Instantiator(Context context) {
            super(context);
        }

        @Override
        public String getTitle(Context context, int position) {
            return context.getString(R.string.title_RealStatus);
        }

        @Nullable
        @Override
        public BasePagerFragment newInstance(int position) {
            return new RealStatusFragment();
        }
    }
}