package com.example.vlad.personalwallet;

/**
 * Created by Vlad on 15.03.2016.
 *
 * This class creates a dialog to confirm the deletion category
 */
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ConfirmDeletionDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Вы уверены что хотите удалить эту категорию?")
                .setTitle("Внимание")
                .setPositiveButton("ДА", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((Category) getActivity()).okClickedYesDelete();
                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((Category) getActivity()).cancelClickedNoDelete();
                    }
                });
        return builder.create();
    }
}