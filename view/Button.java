package view;

public class Button implements Menu {
    private String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    @Override
    public void render() {
        System.out.println("Rendered button s nazvom " + caption);
    }

}


