# viikko 4 01

1. Debugging.java-tiedostossa on Point-luokan toteutus. Luennolla esitettiin moveAllPointsRightBy-metodi, 
jolla saadaan siirrettyä kaikki listan pisteet oikealle. 
Toteuta tämä loppuun asti niin, että myös testit menevät läpi. 

Vinkki. AssertArrayEquals() käyttää equals()-metodia. Miten varmistetaan pisteiden yhtäsuuruus?


2. Seuraava koodi kolminkertaistaa parilliset luvut ja summaa luvut yhteen.
```
import java.util.stream.IntStream;
public class StreamFilterMapReduce {
  public static void main(String[] args) {
  //  sum of the triples of even integers from 2 to 10
  System.out.printf(
    "Sum of the triples of even integers from 2 to 10 is: %d%n",
    IntStream.rangeClosed(1,10)
            .filter(x -> x%2 == 0)
            .map(x -> x*3)
            .sum());
  }
}
```
a) Kuinka monta kertaa filter-operaatio kutsuu lambdalauseketta?

b) Kuinka monta kertaa map-operaatio kutsuu lambdalauseketta?

c) Jos filter- ja map-operaatioiden järjestys vaihdetaan, kuinka monta kertaa map-operaatio kutsuu lambdalauseketta?


3. Seuraava ratkaisu on melko hidas, vaikka käytetäänkin rinnakkaista vuota. 
Tee samanlainen vertailu kuin ParallelStreamsHarness.java-ohjelmassa erilaisista toteutustavoista. Tee erilaisia ratkaisuja, joissa
- käytetään linkitettyä listaa
- taulukkolistaa
- suoraan IntStreamia

Alusta listat ja vuot riittävän isolla alkioiden määrällä niin, että ajoissa saat eroja.

```
taulukkoLista = new ArrayList<>();
linkitettyLista = new LinkedList<>();

public int hidasNelioSumma() {
        return linkitettyLista.parallelStream()
                                  .map(x -> x * x)
                                  .reduce(0, (acc, x) -> acc + x);
}
```
4. Pystyisitkö rinnakkaistamaan viime viikon ratkaisuasi, joka tekee esiintymälistan kalevala.txt-tiedossa
esiintyvistä sanoista? Vertaa suoritusaikoja eri ratkaisuilla.


