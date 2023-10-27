package good.patterns.v2;

import good.patterns.v2.abstractPackage.IUserChoseQuantity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserChoseQuantity implements IUserChoseQuantity {
    @Override
    public Integer choseQuantity() throws InputMismatchException {
        System.out.println("Chose number of unit you want to order: ");
        Scanner scanner = new Scanner(System.in);
        Integer quantity = 0;

        try {
            quantity = scanner.nextInt();
            if (quantity != 0){
                System.out.println("You have select '" + quantity + "' units");
            } else {
                System.out.println("You chose quantity '0'... please try again");
            }
        } catch (InputMismatchException e){
            System.out.println("Incorrect value chose... please try again");
        }
        return quantity;
    }
}
