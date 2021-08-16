import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = """
                Alons enfant de la patrie.
                Le jour de gloire est arrivé.
                Contre nous de la tyrannie.
                L'étendart sanglant est levé
                Entendez vous dans les campagnes
                Mugir ces féroces soldats
                Ils viennent jusque dans vos bras,
                Egorger vos fils, vos compagnes
                Aux armes citoyens! Formez vos bataillons!
                Marchons, oui marchons,
                Qu'un sang impur abreuve nos sillons, sillon.""";


        List<String> dictionary = Translator.translator(text) ;
        System.out.println("Список слов: ");
        dictionary.forEach(System.out::println);
    }

}