package com.zipcodewilmington;

import sun.plugin.dom.css.Counter;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int i = 0;

        // while `counter` is less than length of array
        while (i <= personArray.length -1){
            // begin loop

            result += personArray[i].toString();
            i++;
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

                // end loop

            }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        int i = 0;
        for(i = 0; i <= personArray.length-1; i++){
            result += personArray[i].toString();
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
            String result = "";
            // identify array's type
            // identify array's variable-name
             Person[] p = personArray;
             for(Person j : personArray) {
                  result += j.toString();


             }
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

            return result;

        }

    public Person[] getPersonArray() {
        return null;
    }
}
