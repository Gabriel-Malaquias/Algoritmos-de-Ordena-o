/* Funcionamento

- Compara pares adjacentes e troca se estiverem fora de ordem.
- Após cada passagem, o maior elemento não ordenado "bubbla" para sua posição correta.
- Continua até que nenhuma troca seja necessária.

*/

public class Insertion_SORT{
    public void Ordenacao_insertion() {
        int vetor[] = {8,7,1,2,3,6,9,10,15,22,30,11};
        int aux, j;

        System.out.println("Vetor Desordenado");
        for(int x = 0; x < vetor.length; x++){
            System.out.print(vetor[x] + " ");
        }

        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;

            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }

        System.out.println("\nVetor Ordenado");
        for(int y = 0; y < vetor.length; y++){
            System.out.print(vetor[y] + " ");
        }
    }
}
