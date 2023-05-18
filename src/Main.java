import exceptions.WrongAccountException;

public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000", 50, "USD");
        }catch(exceptions.WrongAccountException WrongAccountException){
            System.out.println("This account doesn't exist.");
        }catch (exceptions.WrongCurrencyException WrongCurrencyException){
            System.out.println("This account have another currency.");
        }catch (exceptions.WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }catch (Exception e){
            System.out.println("There is an error during the processing, try again please.");
        }finally{
            System.out.println("Thank you for using our services!");
        }


        try {
            bankApplication.process("accountId003", 2500, "HRV");
        }catch(exceptions.WrongAccountException WrongAccountException){
            System.out.println("This account doesn't exist.");
        }catch (exceptions.WrongCurrencyException WrongCurrencyException){
            System.out.println("This account have another currency.");
        }catch (exceptions.WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }catch (Exception e){
            System.out.println("There is an error during the processing, try again please.");
        }finally{
            System.out.println("Thank you for using our services!");
        }


        try {
            bankApplication.process("accountId001", 50, "EUR");
        }catch(exceptions.WrongAccountException WrongAccountException){
            System.out.println("This account doesn't exist.");
        }catch (exceptions.WrongCurrencyException WrongCurrencyException){
            System.out.println("This account have another currency.");
        }catch (exceptions.WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }catch (Exception e){
            System.out.println("There is an error during the processing, try again please.");
        }finally{
            System.out.println("Thank you for using our services!");
        }


        try {
            bankApplication.process("accountId005", -1, "USD");
        }catch(exceptions.WrongAccountException WrongAccountException){
            System.out.println("This account doesn't exist.");
        }catch (exceptions.WrongCurrencyException WrongCurrencyException){
            System.out.println("This account have another currency.");
        }catch (exceptions.WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }catch (Exception e){
            System.out.println("There is an error during the processing, try again please.");
        }finally{
            System.out.println("Thank you for using our services!");
        }



    }
}