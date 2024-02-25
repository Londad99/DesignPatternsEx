package Builder;

public enum TipoCarro {
    FAMILIAR, DEPORTIVO, LUJO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
