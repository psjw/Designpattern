public class Application_StatePattern {
    public static void main(String[] args) {
        Light light=new Light();
        light.off();
        light.off();
        light.off();
        light.on();
        light.on();
        light.on();

        light.on();
        light.off();
        light.on();
        light.off();
        light.on();
        light.off();

    }
}
