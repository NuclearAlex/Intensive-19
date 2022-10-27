public class Runner {
    public static void main(String[] args) {
        Nominant[] nominants = {
                new NobelCeremony(new Physicist()),
                new AbelCeremony(new Mathematician())
        };

        for (Nominant nominant : nominants) {
            nominant.reward();
        }
    }
}
