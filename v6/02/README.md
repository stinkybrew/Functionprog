# viikko 6 02

Viikon 6 perjantain tehtävät.

# Clojuren tietorakenteita ja keskeisiä funktioita (apply ja partial)


1. Haluat määritellä etukäteen erilaisia allekirjoitustapoja sähköposteihin liitettäviksi, esim. muodollinen, epämuodollinen, suomeksi, englanniksi jne. 
Muodollisuuksien lisäksi sähköpostiin  kirjoitetaan aina lähettäjän nimi jossain muodossa.
Esitä, kuinka partial-funktiota hyväksi käyttäen voit luoda erilaisia funktioita, jolla voidaan helposti generoida allekirjoituksia siten, että allekirjoitukseski riittää anttaa parametrina lähettäjän nimi.

2. Oletetaan, että on määritelty vektori, joka sisältää vektoreita: [[1 2 3][4 5 6][7 8 9]].
a) Esitä, kuinka tuotat apply-funktiota käyttäen seq:n, jossa on kunkin osavektorin minimiarvo.
b) Esitä vielä, kuinka saat seq:n muutetuksi vektoriksi, joka sisältää alkioinaan nämä luvut, käyttäen pelkästään apply- ja vector-funktioita.

3. Gitissä on simaresepti (sima.csv) ja koodia reseptin muuttamiseksi peräkkäisiksi map-rakenteiksi (ks. tuntimateriaali).
Tee funktio, jonka avulla voidaan tuottaa simareseptin monikertoja, esim kaksinkertainen, kolminkertainen jne. annos.
Simaresepti on lähtötilanteessa map-rakenteina:
({:aines "Vesi", :yksikko "litraa", :maara 4} {:aines "Sokeri", :yksikko "grammaa", :maara 500} {:aines "Sitruuna", :yksikko "kpl", :maara 2} {:aines "Hiiva", :yksikko "grammaa", :maara 1})

* Vinkki: update-metodista voi olla apua.