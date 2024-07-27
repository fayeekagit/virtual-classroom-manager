class SpellCheckerDecorator extends TextEditorDecorator {
    public SpellCheckerDecorator(TextEditor editor) {
        super(editor);
    }

    @Override
    public String getContent() {
        return editor.getContent() + " [Spell-Checked]";
    }
}
