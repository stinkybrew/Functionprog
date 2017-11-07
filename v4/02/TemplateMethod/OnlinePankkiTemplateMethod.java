//package templatemethod;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Simo
 */
public class OnlinePankkiTemplateMethod {

    public final void kasitteleAsiakas(
            Supplier<String> tervehdi,
            Supplier<Asiakas> uusiAsiakas,
            Predicate<Asiakas> tunnista,
            Predicate<Asiakas> onLuottoa,
            Consumer<Asiakas> otto,
            Consumer<Asiakas> hyvastele) {

        Asiakas a;

        System.out.println(tervehdi.get());
        a = uusiAsiakas.get();
        if (tunnista.test(a)) {
            a.setSaldo(Kanta.getInstance().hae(a.getNimi())); 
            if (onLuottoa.test(a)) {
                otto.accept(a);
                Kanta.getInstance().paivita(a.getNimi(), a.getSaldo());// Vie kantaan a.getSaldo()
            }
        }
        hyvastele.accept(a);

    }

    // Perinteiseen tyyliin ilman käyttäytymisen parametrointia
    // olisi ylikirjoitettu aliluokassa:
    //abstract void tervehdi();
    //abstarct Asiakas uusiasiakas()   
    //abstract boolean tunnista();
    //abstract boolean onLuottoa();   
    //abstract boolean suoritaOtto();
    //abstract void hyvastele();
}
