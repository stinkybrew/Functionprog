# Git Etärepositorin käyttö


Gitin käytöstä on hyviä tutoriaaleja, kannattaa ensin tutustua niihin.


# 1 Aluksi

## 1.1 Paikallisen repositorin luonti


Aloita kloonaamalla materiaalit:
```
git clone https://github.com/erja/funpro.git
```
Tämä kloonaa etärepositorin kansioon `funpro`, tiedostohallinnassa pitäisi näkyä normaalisti. Voidaksesi ajaa git-komentoja, sinun on
oltava tässä `funpro` hakemistossa.
```
cd funpro/
git status
```
komento git status kertoo missä gitin haarassa olet ja mikä on tilanne tiedostojen suhteen.

## 1.2 Uuden etärepositorin luominen

Tällä hetkellä työskentelet työhakemistossa, joka on kytketty GitHubissa olevaan repositoriin.Kurssin GitHub-repositori on read-only, joten sinun täytyy viedä omat harjoituksesi muualle. Tätä varten luo etärepositori GitLabiin.

Jos sinulla ei ole tunnusta GitLabiin, tee sellainen. Luo senjälkeen GitLabissa uusi projekti klikkaamalla vihreää **New project** -nappia oikeassa yläkulmassa. Anna *project path* -kohdassa **funpro** ja *Description* kohdassa *funktionaalinen ohjelmointi*. Aseta  *visibility level* kohdassa arvoksi  **Private** ja klikkaa **Create Project*. 

Tämän jälkeen muutetaan paikalliseen repositoriin kytketty etärepo. Komenna

```
$ git remote -v
origin	https://github.com/erja/funpro.git (fetch)
origin	https://github.com/erja/funpro.git (push)
```

kuten näkyy, tällä hetkellä etärepo on kurssin repo. Muutetaan tämä komennoilla

```
$ git remote set-url origin oma_GitLab_URL

$ git remote -v

origin	https://gitlab.com/sinun_GitLab_tunnus/oma_repo_nimi.git (fetch)
origin	https://gitlab.com/sinun_GitLab_tunnus/oma_repo_nimi.git (push)
```

Nyt origin osoittaa sinun omaan etärepositoriin.

Aina kun teet muutoksia, jotka haluat viedä omaan etärepooosi, komenna

```
git push origin master
```

Muista aina myös konffata gittiin nimesi ja sähköpostiosoitteesi komennoilla
```
git config --global user.name "Your Name"
git config --global user.email "your_email@example.com"
```


##1.3 Kurssin etärepo on muuttunut

Aina välillä kurssin etärepositoriin tulee uusia tiedostoja, jotka sinun täytyy saada itsellesi. Pannaan *kurssi* osoittamaan 
gitHubin kurssirepositoriin.

```
$ git remote
origin
$ git remote add kurssi https://github.com/erja/funpro.git
$ git remote -v
origin	https://gitlab.com/sinun_GitLab_tunnus/oma_repo_nimi.git (fetch)
origin	https://gitlab.com/sinun_GitLab_tunnus/oma_repo_nimi.git (push)
kurssi	https://github.com/erja/funpro.git (fetch)
kurssi	https://github.com/erja/funpro.git (push)
```

Kun teet seuraav *pull* komennon, saat itsellesi muuttuneen tiedostot kurssireposta

```
$ git pull kurssi master
```


## 1.5 Kommitoi tekemäsi työ paikalliseen repositoriisi

Aina kun saat jotain valmiiksi, tallenna paikalliseen repositoriisi.
```
git status
git add .
git commit -m 'harjoitus xxxx tehty'
```

## 1.6 Vie paikallisesta etärepositoriin

Kun lopetat työskentelyn, vie muutokset vielä omaan etärepositoriisi.
```
git log origin/master..HEAD
git push origin --all
git log origin/master..HEAD
```

