abstract class TextEditorDecorator implements TextEditor {
    protected TextEditor editor;

    public TextEditorDecorator(TextEditor editor) {
        this.editor = editor;
    }
}
