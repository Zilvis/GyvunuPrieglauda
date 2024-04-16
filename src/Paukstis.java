public class Paukstis extends Gyvunas{
    private int sparnuIlgis;

    public Paukstis(String vardas, int amzius, int svoris, int sparnuIlgis) {
        super(vardas, amzius, svoris);
        this.sparnuIlgis = sparnuIlgis;
    }

    public int getSparnuIlgis() {
        return sparnuIlgis;
    }

    public void setSparnuIlgis(int sparnuIlgis) {
        this.sparnuIlgis = sparnuIlgis;
    }

    @Override
    public String toString() {
        return super.toString() + " sparnuIlgis " + sparnuIlgis;
    }
}
