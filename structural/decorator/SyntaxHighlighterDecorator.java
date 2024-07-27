class SyntaxHighlighterDecorator extends TextEditorDecorator {
    public SyntaxHighlighterDecorator(TextEditor editor) {
        super(editor);
    }

    @Override
    public String getContent() {
        return editor.getContent() + " [Syntax-Highlighted]";
    }
}
