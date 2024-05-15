public class ControleFluxo {
    public static void main(String[] args) throws Exception {
        /*Controle de FLuxo, existem comandos que usam a habilidade de usar tarefas.
         * Existem classificações
         * Condicionais     if-else, switch-case
         *  Simples, compostas, 
         *  possibilita a escolhe de um grupo de ações e comportamentos a serem executados.*/
            double saldo = 25.0;
            double valorSolicitado = 17.0;
            
            if (valorSolicitado < saldo){ 
                saldo = saldo - valorSolicitado;
                System.out.println(saldo);
            
            }else 
                System.out.println("Saldo insuficiente.");
                
            

         /* Repetição        for, while, do-while
         * Exceções         try-catch-finally, throw.
         * 
         */
    }
}
