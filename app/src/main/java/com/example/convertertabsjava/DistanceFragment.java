package com.example.convertertabsjava;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;

public class DistanceFragment extends Fragment {

    private RadioGroup optionsGroup;
    private RadioButton optionKmToMiles, optionMilesToKm;
    private EditText inputField;
    private Button convertButton;
    private TextView resultText;

    public DistanceFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_distance, container, false);

        optionsGroup = root.findViewById(R.id.rgDist);
        optionKmToMiles = root.findViewById(R.id.rbKmToMiles);
        optionMilesToKm = root.findViewById(R.id.rbMilesToKm);
        inputField = root.findViewById(R.id.etDistInput);
        convertButton = root.findViewById(R.id.btnConvertDist);
        resultText = root.findViewById(R.id.tvDistResult);

        convertButton.setOnClickListener(v -> performConversion());

        return root;
    }

    private void performConversion() {
        String value = inputField.getText().toString().trim();

        if (TextUtils.isEmpty(value)) {
            Toast.makeText(getContext(), "Veuillez saisir une distance", Toast.LENGTH_SHORT).show();
            return;
        }

        double input = Double.parseDouble(value);
        double output;

        if (optionKmToMiles.isChecked()) {
            output = input * 0.6214;
            resultText.setText(String.format(Locale.getDefault(),
                    "Résultat : %.2f Km = %.2f Miles", input, output));
        } else {
            output = input / 0.6214;
            resultText.setText(String.format(Locale.getDefault(),
                    "Résultat : %.2f Miles = %.2f Km", input, output));
        }
    }
}