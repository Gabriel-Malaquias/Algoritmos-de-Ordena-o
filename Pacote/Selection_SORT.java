public class Selection_SORT{
    public void Ordenacao_selection(){
      int valor[] = {9,5,8,7,4,6,3,2,1,0};
      int auxiliar, menor_valor;

      for(int x=0; x<=valor.length-1;x++){
        menor_valor = x;

        for(int y=x+1;y<=valor.length-1;y++){
          if(valor[y] < valor[menor_valor]){
              menor_valor = y;
          }
        }
        auxiliar = valor[menor_valor];
        valor[menor_valor] = valor[x];
        valor[x] = auxiliar;
      }

      for(int x=0; x<=valor.length-1;x++){
        System.out.print(valor[x] + " ");
      }
  }
}