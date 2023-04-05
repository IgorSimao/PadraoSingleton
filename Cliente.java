import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        // Login login = new Login();
        System.out.println("Cadastro!");
        System.out.println("Informe o Login: ");
        
        Scanner scan = new Scanner(System.in);
        String cadastroLogin = scan.next();

        System.out.println("Informe a senha: ");
        String cadastroSenha = scan.next();

        Cadastro usuario = new Cadastro(cadastroLogin, cadastroSenha);

        System.out.println("Usuário Cadastrado com sucesso!");

        System.out.println("Fazer Login!");
        System.out.println("Informe o Login: ");

        String login = scan.next();

        System.out.println("Informe a senha: ");
        String senha = scan.next();

        if(usuario.verificaCredenciais(login, senha)){
            Login instancia = Login.getInstance();
            String codigo = instancia.geraVerificadorBot();

            System.out.println("Informe o código verificador: " + codigo);
            String inputCode = scan.next();
    
            if(instancia.testaVerificadorBot(inputCode)){
                System.out.println("Código Correto!");
                System.out.println("Login Efetuado!");
            }else{
                System.out.println("Código Incorreto!");
            }
            scan.close();
        };

        scan.close();

        
    }
}
