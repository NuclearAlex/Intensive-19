public class AbelCeremony extends Nominant {
    protected AbelCeremony(Scientist scientist) {
        super(scientist);
    }

    @Override
    public void reward() {
        System.out.print("Abel reward goes to the best mathematician which ");
        scientist.writeArticle();
    }
}
