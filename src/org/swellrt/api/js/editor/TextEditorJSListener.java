package org.swellrt.api.js.editor;

import com.google.gwt.core.client.JavaScriptObject;

import org.swellrt.client.editor.TextEditorListener;
import org.waveprotocol.wave.client.gadget.StateMap;

public class TextEditorJSListener extends JavaScriptObject implements TextEditorListener {

  protected TextEditorJSListener() {

  }

  public native static TextEditorJSListener create(JavaScriptObject f) /*-{
    return { executor : f };
  }-*/;

  @Override
  public final native void onSelectionChange(int start, int end, JavaScriptObject annotations) /*-{
   if (this.executor !== undefined)
      this.executor(annotations, start, end);
  }-*/;

}
