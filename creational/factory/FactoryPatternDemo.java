public class FactoryPatternDemo {
    public static void main(String[] args) {
        DocumentCreator creator = new PDFDocumentCreator();
        creator.openDocument();

        creator = new WordDocumentCreator();
        creator.openDocument();
    }
}
