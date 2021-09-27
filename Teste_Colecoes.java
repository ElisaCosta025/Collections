import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeSet;


@DisplayName("Classe para teste de conversão de unidades")
public class Teste_Colecoes {

    @Test
    public void Count_Test(){
        
	Map<String, Integer> M = new HashMap<String, Integer>();
        M.put("cats", 1);
        M.put("like", 2);
        M.put("and", 1);
        M.put("dogs", 1);
        M.put("I", 2);

        Assertions.assertEquals(Count.Count_Words("I like cats and I like dogs"), M);
    }

    @Test
    public void Convert_Test(){

        Convertor c = new Convertor();
	String TSC = c.Convert();

	TreeSet<String> TS = new TreeSet<>();
	TS.add("Objetos");
	TS.add("Orientada");
	TS.add("Programacao");

        Assertions.assertEquals(TSC, TS.toString());
    }

}
