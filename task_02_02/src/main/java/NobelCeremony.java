public class NobelCeremony extends Nominant{
    protected NobelCeremony(Scientist scientist) {
        super(scientist);
    }

    @Override
    public void reward() {
        System.out.print("Nobel reward goes to the best physicist which ");
        scientist.writeArticle();
    }
}
