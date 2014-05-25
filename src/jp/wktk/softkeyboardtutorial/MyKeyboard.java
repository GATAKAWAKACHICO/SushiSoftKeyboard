package jp.wktk.softkeyboardtutorial;

import android.content.Context;
import android.inputmethodservice.Keyboard;

public class MyKeyboard extends Keyboard{

	public MyKeyboard(Context context, int xmlLayoutResId) {
		super(context, xmlLayoutResId);
	}

	public MyKeyboard(Context context, int layoutTemplateResId, 
            CharSequence characters, int columns, int horizontalPadding) {
        super(context, layoutTemplateResId, characters, columns, horizontalPadding);
    }
}
