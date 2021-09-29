package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;


//TIL you cannot start a dialog from a broadcast receiver so this class will sit here until one day
//it might be useful
public class CallLogDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.alert_prompt)
                .setItems(R.array.log_array, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                        switch (which){
                            case 1:
                                // call was answered -> SQL Update to increment answered calls
                            case 2:
                                // call was not answered -> SQL Update to increment rejected calls
                            case 3:
                                // Incoming call or cancel action - do nothing
                        }
                    }
                });
        return builder.create();
    }
}
