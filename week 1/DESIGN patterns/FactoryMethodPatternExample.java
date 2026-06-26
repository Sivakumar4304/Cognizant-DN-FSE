interface Document {
    void createDocument();
}

class Word implements Document {
    public void createDocument() {
        System.out.println("Word Document cretaed");
    }
}

class Pdf implements Document {
    public void createDocument() {
        System.out.println("Pdf Document created");
    }
}

class Excel implements Document {
    public void createDocument() {
        System.out.println("Excel Document created");
    }
}

abstract class DocumentFactory {
    abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    Document createDocument() {
        return new Word();
    }
}

class PdfFactory extends DocumentFactory {
    Document createDocument() {
        return new Pdf();
    }
}

class ExcelFactory extends DocumentFactory {
    Document createDocument() {
        return new Excel();
    }
}

class FactoryMethodPatternExample {
    public static void main(String[] args) {

        DocumentFactory f1 = new WordFactory();
        Document d1 = f1.createDocument();
        d1.createDocument();

        DocumentFactory f2 = new PdfFactory();
        Document d2 = f2.createDocument();
        d2.createDocument();

        DocumentFactory f3 = new ExcelFactory();
        Document d3 = f3.createDocument();
        d3.createDocument();

    }
}