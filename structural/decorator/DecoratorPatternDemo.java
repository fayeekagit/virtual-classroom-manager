public class DecoratorPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new BasicTextEditor();
        editor = new SpellCheckerDecorator(editor);
        editor = new SyntaxHighlighterDecorator(editor);

        System.out.println(editor.getContent());
    }
}
