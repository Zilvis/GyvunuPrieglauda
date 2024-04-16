public class Gyvunas {
    private String vardas;
    private int amzius;
    private int svoris;

    public Gyvunas(String vardas, int amzius, int svoris) {
        this.vardas = vardas;
        this.amzius = amzius;
        this.svoris = svoris;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    @Override
    public String toString() {
        return  "vardas: " + vardas + " amzius: " + amzius +" svoris: " + svoris;
    }
}
