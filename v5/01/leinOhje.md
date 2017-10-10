
# Työtilan päivittäminen Clojurea varten

Voit lähteä liikkeelle siitä työtilasta Cloud9:ssä, missä olet työskennellyt Javascript-ohjelmien
kanssa.

1.  Downloadaa lein-skripti https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein

- vaikka ensin paikalliselle koneelle ja sitten Cloud9:ssä upload files, niin saat skriptin C9:iin.

2. Java pitäisi olla valmiina kaikissa C9 workspaceissa, tarkista tämä seuraavalla komennolla
```
	enikunen:~/workspace$ java -version 
```
3. Siirrä lein skripti /bin-hakemistoon
```
	enikunen:~/workspace$ sudo mv lein /bin/
```

4. Muuta tiedoston suojaukset kohdalleen
```
	enikunen:~/workspace$ sudo chmod a+x /bin/lein
```

5. Pane PATH-muuttuja vielä kuntoon
```
	enikunen:~/workspace$ export PATH=$PATH:/bin
```

6. Voit varmistaa, että kaikki on mennyt oikein kysymällä esimerkiksi versiota
```
	enikunen:~/workspace$ lein version
```

7. Poista workspacesta turhat viemästä tilaa
```
	enikunen:~/workspace$ sudo apt-get remove php5 python3
```
8. Tee leiningenin avulla uusi projekti, tässä nimeltään test_lein
```
	enikunen:~/workspace<oikeapaikka> $ lein new app test_lein
	Generating a project called test_lein based on the 'app' template.
```
Tämä luo seuraavan tiedostorakenteen.

![](img/leinproj.png)


9. Käynnistä tämän jälkeen repl (vaatii project.clj olemassaolon)
```
	enikunen:~/workspace/v5/01/test_lein (master) $ lein repl
	nREPL server started on port 35269 on host 127.0.0.1 - nrepl://127.0.0.1:35269
	REPL-y 0.3.7, nREPL 0.2.12
	Clojure 1.8.0
	OpenJDK 64-Bit Server VM 1.7.0_121-b00
    	Docs: (doc function-name-here)
    	      (find-doc "part-of-name-here")
  	Source: (source function-name-here)
 	Javadoc: (javadoc java-object-or-class-here)
    	Exit: Control+D or (exit) or (quit)
 	Results: Stored in vars *1, *2, *3, an exception in *e

	test-lein.core=> (+ 1 2)
	3
	test-lein.core=> Bye for now!

	enikunen:~/workspace<oikeapaikka> $ ls
	CHANGELOG.md  LICENSE  README.md  doc/  project.clj  resources/  src/  target/  test/
```

10. Voi myös ensin vain kääntää compile-komennolla
```
enikunen:~/workspace<oikeapaikka> $ lein compile
```

11. Koko projektin voi ajaa run-komennolla
```
	enikunen:~/workspace<oikeapaikka> $ lein run
	Hello, World!
```

12. Pelkät testit voit ajaa test-komennolla 
```
	enikunen:~/workspace<oikeapaikka> $ lein test

	lein test test-lein.core-testlein run 

	lein test :only test-lein.core-test/a-test

	FAIL in (a-test) (core_test.clj:7)
	FIXME, I fail.
	expected: (= 0 1)
	  actual: (not (= 0 1))

	Ran 1 tests containing 1 assertions.
	1 failures, 0 errors.
	Tests failed.
```




