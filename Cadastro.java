public class Cadastro{
    private String login;
    private String senha;


    public Cadastro(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }


    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Boolean verificaCredenciais(String login, String senha){
        if(this.login.equals(login) && this.senha.equals(senha)){
            return true;
        }
        return false;
    }
    


}