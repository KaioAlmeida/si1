/**
 * 
 */
package code;

import java.util.Scanner;

/**
 * @author Kaio Almeida
 *
 */
public class NumbersInWords {

	private String[] unidades;	
	private String[] dezena;	
	private String[] dezenas;	
	private String[] centenas;
	
	public NumbersInWords() {		
		unidades = new String[] {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		dezena = new String[] {"dez", "onze", "doze", "treze", "Quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
		dezenas = new String[] {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
		centenas = new String[] {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};		
	}
	
	public String NumberToWords(int num) {
		if (num < 0) { // numeros menores que 0
			return "Numero invalido";
		}		
		if (num < 10) {	// numeros entre 0 e 9
			return unidades[num];			
		}else if (num < 20) { // numeros entre 10 e 19			
			return dezena[num - 10];			
		}else if (num < 100) {	// numeros entre 20 e 99		
			if (num % 10 == 0) {				
				return dezenas[(num/10) - 2];
			}			
			return dezenas[(num/10) - 2] + " e " + unidades[num % 10];	
		}else if (num < 1000) {// numeros entre 100 e 999
			if (num == 100){
	            return "cem";
			}else if (num % 100 == 0) { // numeros entre 101 e 109
				return centenas[(num/100) - 1];
			}else if (num % 100 < 10) { // numeros entre 101 e 109
				return centenas[(num/100) - 1] + " e " + unidades[num % 100];				
			}else if (num % 100 < 20) { // numeros entre 110 e 119
				return centenas[(num/100) - 1] + " e " + dezena[(num % 100) - 10];				
			}else if (num % 10 == 0) { // numeros entre 120 a 990 divisiveis por 10
				return centenas[(num/100) - 1] + " e " + dezenas[((num % 100)/10) -2];
			} // o restante dos numeros
			return centenas[(num/100) - 1] + " e " + dezenas[((num % 100)/10) -2] + " e " + unidades[(num % 100) % 10];	
		}else {
			if (num == 1000) {//mil
				return "mil";
			}else if(num == 1000000){//1 milhao	
				return "um milhão";
			}else if(num == 1000000000){//1 bilhao
				return "um bilhão";
			}else {// numeros entre 1.001 e 1 bilhao
				String numS = Integer.toString(num);
				int numDigitos = numS.length();
				if (numDigitos == 4) {
					int milhares = Integer.parseInt(Integer.toString(num).substring(0, 1));	
					int centenas = Integer.parseInt(Integer.toString(num).substring(1, 4));
					if (milhares == 1) {
						if (centenas <= 100) {
							return "mil e " + NumberToWords(centenas);
						}						
						return "mil " + NumberToWords(centenas);
					}else {
						if (centenas <= 100) {
							return NumberToWords(milhares) + " mil e " + NumberToWords(centenas);
						}
						return NumberToWords(milhares) + " mil " + NumberToWords(centenas);
					}						
				}else if (numDigitos == 5) {
					int milhares = Integer.parseInt(Integer.toString(num).substring(0, 2));	
					int centenas = Integer.parseInt(Integer.toString(num).substring(2, 5));
					if (centenas == 0) {
						return NumberToWords(milhares) + " mil";
					}else if (centenas <= 100) {
						return NumberToWords(milhares) + " mil e " + NumberToWords(centenas);
					}					
					return NumberToWords(milhares) + " mil " + NumberToWords(centenas);						
				}else if (numDigitos == 6) {
					int milhares = Integer.parseInt(Integer.toString(num).substring(0, 3));	
					int centenas = Integer.parseInt(Integer.toString(num).substring(3, 6));
					if (centenas == 0) {
						return NumberToWords(milhares) + " mil";
					}else if (centenas <= 100) {
						return NumberToWords(milhares) + " mil e " + NumberToWords(centenas);
					}					
					return NumberToWords(milhares) + " mil " + NumberToWords(centenas);
				}else if (numDigitos == 7) {
					int milhoes = Integer.parseInt(Integer.toString(num).substring(0, 1));	
					int milhares = Integer.parseInt(Integer.toString(num).substring(1, 4));	
					int centenas = Integer.parseInt(Integer.toString(num).substring(4, 7));
					String milhoess;
					if (milhoes > 1) {
						milhoess = " milhões ";
					}else {
						milhoess = " milhão ";
					}
					if (centenas == 0 && milhares == 0) {
						return NumberToWords(milhoes) + " milhões";
					}else if (milhares == 0) {
						if (centenas <= 100) {
							return NumberToWords(milhoes) + milhoess + "e " + NumberToWords(centenas);
						}						
						return NumberToWords(milhoes) + milhoess + NumberToWords(centenas);
					}else if (centenas == 0) {
						if (milhares < 100) {
							return NumberToWords(milhoes) + milhoess + "e " + NumberToWords(milhares) + " mil";
						}
						return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil";
					}else {
						if (centenas <= 100) {
							return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil e " + NumberToWords(centenas);
						}						
						return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil " + NumberToWords(centenas);
					}	
				}else if(numDigitos == 8) {
					int milhoes = Integer.parseInt(Integer.toString(num).substring(0, 2));	
					int milhares = Integer.parseInt(Integer.toString(num).substring(2, 5));	
					int centenas = Integer.parseInt(Integer.toString(num).substring(5, 8));
					String milhoess;
					if (milhoes > 1) {
						milhoess = " milhões ";
					}else {
						milhoess = " milhão ";
					}
					if (centenas == 0 && milhares == 0) {
						return NumberToWords(milhoes) + " milhões";
					}else if (milhares == 0) {
						if (centenas <= 100) {
							return NumberToWords(milhoes) + milhoess + "e " + NumberToWords(centenas);
						}						
						return NumberToWords(milhoes) + milhoess + NumberToWords(centenas);
					}else if (centenas == 0) {
						if (milhares < 100) {
							return NumberToWords(milhoes) + milhoess + "e " + NumberToWords(milhares) + " mil";
						}
						return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil";
					}else {
						if (centenas <= 100) {
							return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil e " + NumberToWords(centenas);
						}						
						return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil " + NumberToWords(centenas);
					}		
				}else if (numDigitos == 9) {
					int milhoes = Integer.parseInt(Integer.toString(num).substring(0, 3));	
					int milhares = Integer.parseInt(Integer.toString(num).substring(3, 6));	
					int centenas = Integer.parseInt(Integer.toString(num).substring(6, 9));
					String milhoess;
					if (milhoes > 1) {
						milhoess = " milhões ";
					}else {
						milhoess = " milhão ";
					}
					if (centenas == 0 && milhares == 0) {
						return NumberToWords(milhoes) + " milhões";
					}else if (milhares == 0) {
						if (centenas <= 100) {
							return NumberToWords(milhoes) + milhoess + "e " + NumberToWords(centenas);
						}						
						return NumberToWords(milhoes) + milhoess + NumberToWords(centenas);
					}else if (centenas == 0) {
						if (milhares < 100) {
							return NumberToWords(milhoes) + milhoess + "e " + NumberToWords(milhares) + " mil";
						}
						return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil";
					}else {
						if (centenas <= 100) {
							return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil e " + NumberToWords(centenas);
						}						
						return NumberToWords(milhoes) + milhoess + NumberToWords(milhares) + " mil " + NumberToWords(centenas);
					}	
				}				
			}
			return "Numero invalido";
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumbersInWords numberToWords = new  NumbersInWords();
		String number = "";
		System.out.println("Digite um número no intervalo de 0 a 1000000000!\n");
		while(number.equals("")){
            Scanner entrada = new Scanner(System.in);
            number = entrada.nextLine();
            try{
            	System.out.println("\n" + numberToWords.NumberToWords(Integer.parseInt(number)));                    
            }catch(Exception e){
        		number = "";
                System.out.println("\nVocê deve informar um número no intervalo de 0 a 1000000000!\n");
            }
		}
		//System.out.println(numberToWords.NumberToWords(100100));
	}
}