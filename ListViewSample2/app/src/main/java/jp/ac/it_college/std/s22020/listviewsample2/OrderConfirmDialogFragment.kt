package jp.ac.it_college.std.s22020.listviewsample2

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class OrderConfirmDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireActivity())
            .setTitle(R.string.dialog_title)
            .setMessage(R.string.dialog_msg)
            .setPositiveButton(R.string.dialog_btn_ok, dialogButtonClickListener)
            .setNegativeButton(R.string.dialog_btn_ng, dialogButtonClickListener)
            .setNeutralButton(R.string.dialog_btn_nu, dialogButtonClickListener)
            .create()

    private val dialogButtonClickListener =
        DialogInterface.OnClickListener { _, which ->
            val msg = when (which) {
                DialogInterface.BUTTON_POSITIVE -> getString(R.string.dialog_ok_toast)
                DialogInterface.BUTTON_NEGATIVE -> getString(R.string.dialog_ng_toast)
                DialogInterface.BUTTON_NEUTRAL -> getString(R.string.dialog_nu_toast)
                else -> getString(R.string.dialog_ng_toast)
            }
            Toast.makeText(activity, msg, Toast.LENGTH_LONG).show()
        }
}