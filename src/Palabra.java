/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Palabra {
    String elegida;
    private String analizada [];
    private String[] palabras;
    String nueva;
    
    public Palabra(){
        palabras=new String[6];
        palabras[0]="LENTE";
        palabras[1]="MARCA";
        palabras[2]="LAPIZ";
        palabras[3]="HOJAS";
        palabras[4]="FOTOS";
        palabras[5]="FACIL";
        elegida=seleccionarPalabra();
        analizada=new String [elegida.length()];
        llenarAnalizada();
    }
    
    String seleccionarPalabra (){
        
        int aleatorio=(int)((Math.random()*6));
        return palabras[aleatorio];
        }
    
    void llenarAnalizada(){
        int contador =0;
        for(int i = 0; i < analizada.length; i++)
        {
            analizada [i] = "*";
        }
    }
    
    public String comparar(char letra){
        String aux="";
        String nueva="";
        int contador = 0;
        while(contador < elegida.length())
        {
            if((letra == elegida.charAt(contador)) && (analizada[contador].equals("*")))
            {
                aux += letra;
                analizada[contador] = aux;
                aux="";
                contador++;
            }else{
                contador++;
            } 
        }
        for(int i=0; i<analizada.length;i++)
        {
            nueva+= analizada[i];
        }
        return nueva;
    }
    
    int determinar(char letra){
        int bandera=0;
        int contador =0;
        while(contador < elegida.length())
        {
            if(letra != elegida.charAt(contador))
            {
                contador++;
                bandera++;
            }else{
                contador++;
            }
        }
        return bandera;
    }
      
    public String getElegida()
    {
        return elegida;
    }
    
}
