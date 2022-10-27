public abstract class Nominant {
    protected Scientist scientist;

    protected Nominant(Scientist scientist) {
        this.scientist = scientist;
    }

    public abstract void reward();
}
