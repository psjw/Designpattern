package step2;

public class BPlayerImpl implements BPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("(B) "+fileName);
    }

    @Override
    public void stop() {

    }
}
