public class Main {
    public static void main(String[] args) {
        var prieglauda = new Prieglauda();
        prieglauda.prieglaudaUi();
    }
}

//Parašykite programą, "Gyvūnų prieglauda". Jums reikės sukurti pagrindinę klasę Gyvūnas,
// kuri turės šiuos atributus: vardas, amžius ir svoris. Sukurkite reikiamus getterius ir setterius,
// taip pat konstruktorių, leidžiantį sukurti gyvūno objektą su nurodytais atributais.
//
//Toliau sukurti tris subklases: Šuo, Katė ir Paukštis. Kiekviena subklasė turi papildomus atributus, pavyzdžiui,
// šuo turi veislę, katė turi kailio spalvą ir paukštis turi sparnų ilgį.
// Kiekviena subklasė taip pat turi turėti savo konstruktorių, kuris prideda šiuos papildomus atributus,
// ir tinkamus getterius ir setterius.
//
//Pridėkite funkcionalumą, kuris leidžia gyvūnus prisidėti prie prieglaudos sąrašo,
// juos pašalinti iš sąrašo ir parodyti informaciją apie visus prieglaudos gyvūnus, įskaitant jų papildomus atributus.
//
//Jūsų programa turėtų leisti vartotojui interaktyviai valdyti gyvūnų prieglaudos funkcijas,
// įskaitant pridėjimą, pašalinimą ir informacijos rodymą. Taip pat svarbu,
// kad visi gyvūnai būtų tinkamai atpažįstami pagal savo tipą ir turėtų skirtingas charakteristikas, priklausomai nuo subklasės,
// kuriai jie priklauso. (Su įvestimi Scanner)