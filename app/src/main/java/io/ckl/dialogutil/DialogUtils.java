package io.ckl.dialogutil;

import android.app.ProgressDialog;
import android.content.Context;

public class DialogUtils {

	private static ProgressDialog progressDialog;

	private DialogUtils() {
	}

	public static void showTransparentLoadingDialog(Context context) {
		showTransparentLoadingDialog(context, false);
	}

	public static void showTransparentLoadingDialog(Context context, boolean cancelable) {
		if (progressDialog != null) {
			progressDialog.setCancelable(cancelable);
			return;
		}

		progressDialog = new ProgressDialog(context, R.style.DialogUtil_Theme);
		progressDialog.setCancelable(cancelable);
		progressDialog.show();
	}

	public static void hideProgressDialog() {
		progressDialog = hideDialog(progressDialog);
	}

	private static ProgressDialog hideDialog(ProgressDialog dialog) {
		if (dialog != null && dialog.isShowing()) {
			dialog.dismiss();
		}

		return null;
	}
}
