package model;

public abstract class Results {
    public int squat() {
        return (int) (Math.random() * 200);
    }

    public int benchpress() {
        return (int) (Math.random() * 150);
    }

    public int deadlift() {
        return (int) (Math.random() * 250);
    }
}
