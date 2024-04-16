public class Kate extends Gyvunas{
    private String kailioSpalva;

    public Kate(String vardas, int amzius, int svoris, String kailioSpalva) {
        super(vardas, amzius, svoris);
        this.kailioSpalva = kailioSpalva;
    }

    public String getKailioSpalva() {
        return kailioSpalva;
    }

    public void setKailioSpalva(String kailioSpalva) {
        this.kailioSpalva = kailioSpalva;
    }

    @Override
    public String toString() {
        return super.toString() + " kailio slaplva: " +kailioSpalva;
    }
}
