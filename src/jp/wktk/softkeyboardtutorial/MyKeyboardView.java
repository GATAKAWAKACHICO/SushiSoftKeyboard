package jp.wktk.softkeyboardtutorial;

import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

public class MyKeyboardView extends KeyboardView{

	public MyKeyboardView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public MyKeyboardView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

}
