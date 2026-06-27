interface image {
    public void display();
}

class RealImage implements image {
    String filename;

    RealImage(String filename) {
        this.filename = filename;
        System.out.println("Loading image from remote server");
    }

    public void display() {
        System.out.println("Displaying image from remote server ");
    }
}

class ProxyImage implements image {
    RealImage realImage;

    public void display() {
        if (realImage == null) {
            realImage = new RealImage("nature.jpg");
        }
        realImage.display();
    }
}

public class ProxyPatternExample {
    public static void main(String[] args) {

        image i = new ProxyImage();
        i.display();
    }
}