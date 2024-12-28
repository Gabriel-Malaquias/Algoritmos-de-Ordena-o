/* Funcionamento

- Compara pares adjacentes e troca se estiverem fora de ordem.
- Após cada passagem, o maior elemento não ordenado "bubbla" para sua posição correta.
- Continua até que nenhuma troca seja necessária.

*/

public class Bubble_SORT {
    public void Ordenacao_bubble(){
        int vetor[] = {10,1,2,3,1,4,5,6,8,12,15};
        int aux;

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length; j++){
                if(vetor[i] < vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        for(int x = 0; x < vetor.length; x++){
            System.out.print(vetor[x] + " ");
        }
    }
}
