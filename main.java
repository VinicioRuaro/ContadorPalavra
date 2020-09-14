package ContadorDePalavras;

public class main{
public static void main (String[]args){
    //leitorArquivo   V
    //arrumarTamanho  V
    //separadorPalavras  V
    //stopWords       V
    System.out.println(separadorPalavras.retorno(arrumarTamanho.arrumarTamanho(leitorArquivo.leitorArquivo())));
    System.out.println(stopWords.stopWords(separadorPalavras.retorno(arrumarTamanho.arrumarTamanho(leitorArquivo.leitorArquivo()))));
    
    stopWords.stopWords(separadorPalavras.retorno(arrumarTamanho.arrumarTamanho(leitorArquivo.leitorArquivo())));
}
}