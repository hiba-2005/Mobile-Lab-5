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

public class TempFragment extends Fragment {

    private RadioGroup optionsGroup;
    private RadioButton optionCtoF, optionFtoC;
    private EditText inputField;
    private Button convertButton;
    private TextView resultText;

    public TempFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_temp, container, false);

        optionsGroup = root.findViewById(R.id.rgTemp);
        optionCtoF = root.findViewById(R.id.rbCtoF);
        optionFtoC = root.findViewById(R.id.rbFtoC);
        inputField = root.findViewById(R.id.etTempInput);
        convertButton = root.findViewById(R.id.btnConvertTemp);
        resultText = root.findViewById(R.id.tvTempResult);

        convertButton.setOnClickListener(v -> performConversion());

        return root;
    }

    private void performConversion() {
        String value = inputField.getText().toString().trim();

        if (TextUtils.isEmpty(value)) {
            Toast.makeText(getContext(), "Veuillez saisir une température", Toast.LENGTH_SHORT).show();
            return;
        }

        double input = Double.parseDouble(value);
        double output;

        if (optionCtoF.isChecked()) {
            output = (1.8 * input) + 32;
            resultText.setText(String.format(Locale.getDefault(),
                    "Résultat : %.2f °C = %.2f °F", input, output));
        } else {
            output = (input - 32) / 1.8;
            resultText.setText(String.format(Locale.getDefault(),
                    "Résultat : %.2f °F = %.2f °C", input, output));
        }
    }
}