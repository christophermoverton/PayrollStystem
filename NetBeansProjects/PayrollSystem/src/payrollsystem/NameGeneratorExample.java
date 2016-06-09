/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;
import io.codearte.jfairy.Fairy;


/**
 *
 * @author strangequark
 */
public class NameGeneratorExample {
    public static void main(String[] args) {
        
		Fairy fairy = Fairy.create();

		Person person = fairy.person();
		System.out.println(person.fullName());
    }
}
