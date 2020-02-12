package factorymethod.v2;

public class App {
    public static void main(String[] args) {
        TextSplitterFactory textSplitterFactory = new TextSplitterFactory();
        MainForm mainForm = new MainForm(textSplitterFactory);
        mainForm.buttonClick();
        BinarySplitterFactory binarySplitterFactory = new BinarySplitterFactory();
        MainForm mainForm2 = new MainForm(binarySplitterFactory);
        mainForm2.buttonClick();
    }
}
