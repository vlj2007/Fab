public class Client {
    private Button button;
    private Checkbox checkbox;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;

        String os = "Windows"; // или "Mac"

        if (os.equals("Windows")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        Client client = new Client(factory);
        client.paint();
    }
}
