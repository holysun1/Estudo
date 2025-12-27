
//Exercises-------------------------- EXERCÍCIO 1 -----------------------------
// TwoSum

public static void main(String[] args) {
                System.out.println("------- EXERCÍCIO 1 -------- \n");
    int [] nums = {2,11,7,15};
    int target = 9;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1 ; j < nums.length; j++){
            if (nums[i] + nums [j] == target){
                System.out.println("Indices: " + i + ", " + j + "\n");
            }
        }
    }

    // ----------------------------- EXERCÍCIO 2 -------------------------------
// Remove Duplicates from Sorted Array
                System.out.println("------- EXERCÍCIO 2 -------- \n");
    int [] array2 = {1,2,3,2,4,1};
    int itensUnicos = array2.length;
    for(int i = 0; i < array2.length; i++){
        for(int j = i +1 ; j < array2.length; j++){
            if( array2[i] == array2[j] && array2[j] != 5    
            ){
                array2[j] = 5;
                itensUnicos--;
                break;
            }
        }
    }
     System.out.println("Número de itens únicos: " + itensUnicos);
     int [] newArray = new int[itensUnicos];
     int index = 0;
     for(int i = 0; i < array2.length; i++){
        if( array2[i] != 5 ){
            newArray[index++] = array2[i];
        }
     }
          System.out.println("NewArray:" + Arrays.toString(newArray) +"\n" );

    // ----------------------------- EXERCÍCIO 3 -----------------------------

// FIRST UNIQUE CHARACTER
                System.out.println("------- EXERCÍCIO 3 -------- \n");
//ATRIBUIÇÃO DE VARIÁVEIS E ARRAYS
     String [] arrayString = {"a","b","a","c","b"};
     int n = arrayString.length;
     String [] novoArray = new String[n];
// LOOP PARA PERCORRER O ARRAY PRINCIPAL
     for(int x = 0 ; x < n; x++){
        // ATRIBUIÇÃO DE VARÍAVEL BOOLEANA DE REPETIÇÃO = FALSE
        boolean rpt = false;
        for(int y=0 ; y < n; y++){
            // LOOP PARA IDENTIFICAR VALORES REPETIDOS
            if ( x != y && arrayString[x].equals(arrayString[y]))
                // ENCONTRA O VALOR REPETIDO , BOOLEAN = TRUE
                rpt =true;
                // QUEBRA DE LOOP
            break;
        }
        if(!rpt){
            // ATRIBUIR NOVO VALOR AO ARRAY SE Ñ FOR REPETIDO
        novoArray[x] = arrayString[x] + "=" + x;
        }
     }
             System.err.println(Arrays.toString(novoArray) );

    // ----------------------------- EXERCÍCIO 4 -----------------------------
    
// CONTAINS DUPLICATE
                System.out.println("------- EXERCÍCIO 4 -------- \n");
     int [] array4 = {5,7,2,5};
     int m = array4.length;
         
     for( int a = 0; a < m ;a++){
                     boolean rpto = false;
        for(int b = a+1; b < m ; b++){

            if( array4[a] == (array4[b]) ){
                rpto = true;     
            }               
        }
        if(rpto)
        {
            
        System.out.println(rpto);
            break;
        }
        }

    System.out.println("------- EXERCÍCIO 6 -------- \n");
    // ----------------------------- EXERCÍCIO 6 -----------------------------
    
// MOVE ZEROS
        // DECLARAÇÃO DE VARIÁVEIS E ARRAYS
    int [] lista = {0,1,0,3,12};
    int k = lista.length;
    int [] novalista = new int[k];
    int pos = 0;
    // LOOP PARA PERCORRER O ARRAY
    for(int i=0; i < k; i++){
        // CONDIÇÃO PARA ADICIONAR APENAS OS VALORES DIFERENTES DE ZERO
        if (lista[i] != 0){
            // ADICIONA OS VALORES NA NOVA LISTA
            novalista[pos++] = lista[i];
            // POS++ INCREMENTA A POSIÇÃO DA NOVA LISTA 
        }
    }
    // IMPRESSÃO DA NOVA LISTA
    System.out.println(Arrays.toString(novalista));

    System.out.println("------- EXERCÍCIO 7 -------- \n");
    // ----------------------------- EXERCÍCIO 7 -----------------------------
    // REVERSE A STRING
    // DECLARAÇÃO DE VARIÁVEIS
    String str = "THE SKY IS BLUE";
    String reversed = "";
    String [] words = str.split(" ");
    // LOOP PARA PERCORRER AS PALAVRAS DA STRING
    // LOOP PARA PERCORRER A STRING DE TRÁS PARA FRENTE
    for (int i = words.length - 1; i >= 0; i--) {
        // ADICIONA CADA CARACTERE NA STRING REVERSA
        reversed += words[i];
        if (i>0){
            reversed += " ";
            
        }
    }
    //  IMPRESSÃO DA STRING REVERSA
    System.out.println("Reversed string: " + reversed);

        // ----------------------------- EXERCÍCIO 5 -----------------------------
    
// VALID PARENTHESES
                System.out.println("------- EXERCÍCIO 5 -------- \n");

 //   public abstract class ValidParentheses {
    
    String s = "({[]})";
    String t = "(]{])";
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        if (c == '(') {
            stack.push(')');
        } else if (c == '{') {
            stack.push('}');
        } else if (c == '[') {
            stack.push(']');
        } else if (stack.isEmpty() || stack.pop() != c) {
            System.out.println("false");
            return;
        }
    }
    stack.clear();
    System.out.println("({[]})" + " " +(stack.isEmpty() ? "true" : "false \n"));
    for (char caractere : t.toCharArray()) {
        if (caractere == '(') {
            stack.push(')');
        } else if (caractere == '{') {
            stack.push('}');
        } else if (caractere   == '[') {
            stack.push(']');
        } else if (stack.isEmpty() || stack.pop() != caractere) {
            System.out.println("(]{])"+ " " +"false");
            return;
        }
    }
    
        
    System.out.println("(]{])" + " "+ (stack.isEmpty() ? "true" : "false"));

}



    
        


    



