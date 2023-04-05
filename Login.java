
public class Login {
    private static Login instance = null;



    public Login(){

    }


    public static synchronized Login getInstance(){
        if(instance == null){
            instance = new Login();
        }
        return instance;
    }

    
    public String geraVerificadorBot(){
        String code = "";
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 10);
            code += random;
        }

        return code;

    }

    public Boolean testaVerificadorBot(String code){

        if(code.equals(geraVerificadorBot())){
            return true;
        }
        return false;
    }


}
