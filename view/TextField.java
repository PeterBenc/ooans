package view;

public class TextField implements Menu{

    private  String text;

    public TextField(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Rendered textfield s textom " + text);
    }



}
