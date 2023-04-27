package enums;

public enum Cereals {
    CRUNCH(50),
    PUFFS(20);

    final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
