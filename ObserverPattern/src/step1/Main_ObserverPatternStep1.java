package step1;

public class Main_ObserverPatternStep1 {
    public static void main(String[] args) {
        Button button=new Button();

//        button.setOnClickListener(new ButtonClick());
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println(button+" is Clickced");
            }
        });
        button.onClick();
    }


}


class ButtonClick implements Button.OnClickListener{

    @Override
    public void onClick(Button button) {
        System.out.println(button+" is Clickced");
    }
}
