package Tests;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import code.NumbersInWords;

/**
 * Testes feitos para a classe NumbersInWords.
 * 
 * @author Kaio Almeida
 *
 */
public class TestNumbersInWords {
	NumbersInWords numberToWords;

	
	@Before
    public void init() {
            numberToWords = new  NumbersInWords();
            
    }
    
    @Test 
    public void testUnidades() {
            Assert.assertEquals("zero", numberToWords.NumberToWords(0));
            Assert.assertEquals("um", numberToWords.NumberToWords(1));
            Assert.assertEquals("dois", numberToWords.NumberToWords(2));
            Assert.assertEquals("três", numberToWords.NumberToWords(3));
            Assert.assertEquals("quatro", numberToWords.NumberToWords(4));
            Assert.assertEquals("cinco", numberToWords.NumberToWords(5));
            Assert.assertEquals("seis", numberToWords.NumberToWords(6));
            Assert.assertEquals("sete", numberToWords.NumberToWords(7));
            Assert.assertEquals("oito", numberToWords.NumberToWords(8));
            Assert.assertEquals("nove", numberToWords.NumberToWords(9));
    }
    
    @Test 
    public void testDezenas() {
            Assert.assertEquals("dez", numberToWords.NumberToWords(10));
            Assert.assertEquals("quarenta", numberToWords.NumberToWords(40));
            Assert.assertEquals("noventa", numberToWords.NumberToWords(90));
            Assert.assertEquals("onze", numberToWords.NumberToWords(11));
            Assert.assertEquals("treze", numberToWords.NumberToWords(13));
            Assert.assertEquals("dezessete", numberToWords.NumberToWords(17));            
            Assert.assertEquals("vinte e três", numberToWords.NumberToWords(23));            
            Assert.assertEquals("trinta e cinco", numberToWords.NumberToWords(35));
            Assert.assertEquals("quarenta e um", numberToWords.NumberToWords(41));          
            Assert.assertEquals("cinquenta e dois", numberToWords.NumberToWords(52));
            Assert.assertEquals("sessenta e oito", numberToWords.NumberToWords(68));
            Assert.assertEquals("setenta e seis", numberToWords.NumberToWords(76));
            Assert.assertEquals("oitenta e quatro", numberToWords.NumberToWords(84));
            Assert.assertEquals("noventa e nove", numberToWords.NumberToWords(99));
    }
    
    @Test 
    public void testCentenas() {
            Assert.assertEquals("cem", numberToWords.NumberToWords(100));
            Assert.assertEquals("seiscentos", numberToWords.NumberToWords(600));
            Assert.assertEquals("novecentos", numberToWords.NumberToWords(900));            
            Assert.assertEquals("cento e dois", numberToWords.NumberToWords(102));
            Assert.assertEquals("cento e dezenove", numberToWords.NumberToWords(119));
            Assert.assertEquals("cento e trinta", numberToWords.NumberToWords(130));
            Assert.assertEquals("trezentos e setenta", numberToWords.NumberToWords(370));
            Assert.assertEquals("quinhentos e vinte e seis", numberToWords.NumberToWords(526));
            Assert.assertEquals("seiscentos e trinta e sete", numberToWords.NumberToWords(637));
            Assert.assertEquals("setecentos e oitenta e um", numberToWords.NumberToWords(781));
            Assert.assertEquals("oitocentos e três", numberToWords.NumberToWords(803));
            Assert.assertEquals("novecentos e noventa e nove", numberToWords.NumberToWords(999));
    }
    
    @Test 
    public void testMilhar() {         
            Assert.assertEquals("mil", numberToWords.NumberToWords(1000));
            Assert.assertEquals("mil e dois", numberToWords.NumberToWords(1002));
            Assert.assertEquals("mil e cinquenta e três", numberToWords.NumberToWords(1053));
            Assert.assertEquals("mil e cem", numberToWords.NumberToWords(1100));
            Assert.assertEquals("mil novecentos e quinze", numberToWords.NumberToWords(1915));
            Assert.assertEquals("dois mil e dezoito", numberToWords.NumberToWords(2018));
            Assert.assertEquals("três mil cento e vinte", numberToWords.NumberToWords(3120));            
            Assert.assertEquals("quatro mil quinhentos e trinta e três", numberToWords.NumberToWords(4533));            
            Assert.assertEquals("cinco mil novecentos e sete", numberToWords.NumberToWords(5907));          
            Assert.assertEquals("seis mil setecentos e sessenta e oito", numberToWords.NumberToWords(6768));
            Assert.assertEquals("sete mil duzentos e cinquenta e dois", numberToWords.NumberToWords(7252));
            Assert.assertEquals("sete mil e vinte e um", numberToWords.NumberToWords(7021));
            Assert.assertEquals("oito mil trezentos e sessenta e dois", numberToWords.NumberToWords(8362));
            Assert.assertEquals("nove mil seiscentos e dezessete", numberToWords.NumberToWords(9617));
            Assert.assertEquals("nove mil novecentos e sessenta e um", numberToWords.NumberToWords(9961));         
    }
    
    @Test 
    public void testDezenaDeMilhar() {
    		Assert.assertEquals("dez mil", numberToWords.NumberToWords(10000));
            Assert.assertEquals("onze mil e cem", numberToWords.NumberToWords(11100));
            Assert.assertEquals("quinze mil e setenta e seis", numberToWords.NumberToWords(15076));
            Assert.assertEquals("onze mil setecentos e oito", numberToWords.NumberToWords(11708));
            Assert.assertEquals("vinte e nove mil novecentos e sessenta", numberToWords.NumberToWords(29960));
            Assert.assertEquals("trinta e um mil oitocentos e quinze", numberToWords.NumberToWords(31815));
            Assert.assertEquals("quarenta e dois mil cento e vinte", numberToWords.NumberToWords(42120));
            Assert.assertEquals("cinquenta e três mil cento e cinquenta", numberToWords.NumberToWords(53150));
            Assert.assertEquals("sessenta e sete mil e um", numberToWords.NumberToWords(67001));
            Assert.assertEquals("setenta e sete mil duzentos e cinquenta e sete", numberToWords.NumberToWords(77257));
            Assert.assertEquals("oitenta e oito mil e onze", numberToWords.NumberToWords(88011));
            Assert.assertEquals("noventa e quatro mil quinhentos e vinte e quatro", numberToWords.NumberToWords(94524));          
    }
    
    @Test 
    public void testCentenaDeMilhar() {
    		Assert.assertEquals("cem mil", numberToWords.NumberToWords(100000));    		
    		Assert.assertEquals("cento e onze mil e setenta", numberToWords.NumberToWords(111070));
    		Assert.assertEquals("duzentos e quatro mil quinhentos e trinta e quatro", numberToWords.NumberToWords(204534));	
    		Assert.assertEquals("trezentos e onze mil cento e quinze", numberToWords.NumberToWords(311115));
    		Assert.assertEquals("quatrocentos e onze mil cento e quinze", numberToWords.NumberToWords(411115));
    		Assert.assertEquals("quinhentos mil e cem", numberToWords.NumberToWords(500100));
    		Assert.assertEquals("seiscentos mil cento e quinze", numberToWords.NumberToWords(600115));
    		Assert.assertEquals("setecentos e oitenta mil", numberToWords.NumberToWords(780000));
    		Assert.assertEquals("oitocentos e onze mil cento e quinze", numberToWords.NumberToWords(811115));
            Assert.assertEquals("novecentos e cinquenta e nove mil e cinquenta e seis", numberToWords.NumberToWords(959056));      
    }
	
    @Test 
    public void testMilhoes(){
    	 	Assert.assertEquals("um milhão", numberToWords.NumberToWords(1000000));    	
            Assert.assertEquals("um milhão cem mil e cem", numberToWords.NumberToWords(1100100));
            Assert.assertEquals("dois milhões quatrocentos e quatro mil quinhentos e trinta e quatro", numberToWords.NumberToWords(2404534));
            Assert.assertEquals("três milhões setecentos e sete mil e um", numberToWords.NumberToWords(3707001));
            Assert.assertEquals("quatro milhões setecentos e oitenta mil e onze", numberToWords.NumberToWords(4780011));
            Assert.assertEquals("cinco milhões quatrocentos e vinte e um mil e oitenta e três", numberToWords.NumberToWords(5421083));
            Assert.assertEquals("seis milhões um mil cento e dez", numberToWords.NumberToWords(6001110));
            Assert.assertEquals("sete milhões setecentos e sete mil e um", numberToWords.NumberToWords(7707001));
            Assert.assertEquals("oito milhões setecentos e sete mil e um", numberToWords.NumberToWords(8707001));
            Assert.assertEquals("nove milhões cinquenta e nove mil e vinte e seis", numberToWords.NumberToWords(9059026));            
    }
    
    @Test 
    public void testDezenaDeMilhoes(){
    		Assert.assertEquals("dez milhões", numberToWords.NumberToWords(10000000));    	
            Assert.assertEquals("dezessete milhões cento e onze mil e sete", numberToWords.NumberToWords(17111007));
            Assert.assertEquals("vinte e quatro milhões quinhentos e quatro mil quinhentos e quarenta e quatro", numberToWords.NumberToWords(24504544));
            Assert.assertEquals("trinta e sete milhões oitocentos mil e cem", numberToWords.NumberToWords(37800100));
            Assert.assertEquals("quarenta e sete milhões oitocentos mil", numberToWords.NumberToWords(47800000));
            Assert.assertEquals("cinquenta e quatro milhões setenta mil trezentos e cinquenta e três", numberToWords.NumberToWords(54070353));
            Assert.assertEquals("sessenta milhões um mil cento e dez", numberToWords.NumberToWords(60001110));            
            Assert.assertEquals("setenta e um milhões novecentos e onze mil cento e quinze", numberToWords.NumberToWords(71911115));
            Assert.assertEquals("oitenta milhões cinquenta e nove mil e vinte e um", numberToWords.NumberToWords(80059021));
            Assert.assertEquals("noventa e nove milhões novecentos e noventa e nove mil novecentos e noventa e nove", numberToWords.NumberToWords(99999999));
    }
    
    @Test 
    public void testCentenaDeMilhoes(){
            Assert.assertEquals("cem milhões", numberToWords.NumberToWords(100000000));            
            Assert.assertEquals("cem milhões e cem", numberToWords.NumberToWords(100000100));            
            Assert.assertEquals("duzentos e dez milhões quinhentos mil trezentos e noventa e dois", numberToWords.NumberToWords(210500392));
            Assert.assertEquals("trezentos e noventa e nove milhões novecentos e noventa e nove mil novecentos e noventa e nove", numberToWords.NumberToWords(399999999));
            Assert.assertEquals("quatrocentos e cinquenta e sete milhões quatrocentos e vinte e um mil e oitenta", numberToWords.NumberToWords(457421080));
            Assert.assertEquals("quinhentos e dez milhões quinhentos mil trezentos e noventa e dois", numberToWords.NumberToWords(510500392));
            Assert.assertEquals("seiscentos e vinte milhões quinhentos mil trezentos e noventa e dois", numberToWords.NumberToWords(620500392));
            Assert.assertEquals("setecentos e cinquenta e sete milhões quatrocentos e vinte e um mil e oitenta", numberToWords.NumberToWords(757421080));
            Assert.assertEquals("oitocentos e cinquenta e sete milhões quatrocentos e vinte e um mil e oitenta e sete", numberToWords.NumberToWords(857421087));
            Assert.assertEquals("novecentos e noventa e nove milhões novecentos e noventa e nove mil novecentos e noventa e nove", numberToWords.NumberToWords(999999999));
    }
    
    @Test 
    public void testBilhao(){
            Assert.assertEquals("um bilhão", numberToWords.NumberToWords(1000000000));
    } 
	
}
