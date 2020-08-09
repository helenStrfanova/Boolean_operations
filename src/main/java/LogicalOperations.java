/*
 * @author Alona Sviridova
 * @version 1.1
 * DATE 09.08.2020
 * PROJECT NAME "Boolean operations"
 * */

public class LogicalOperations {

    private Boolean var1;
    private Boolean var2;

    /**********************************
              * Constructors
     **********************************/

    public LogicalOperations(Boolean var1, Boolean var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    /**************************************
     * Setters & Getters for all variables
     **************************************/

    public Boolean getVar1() {
        return var1;
    }

    public Boolean getVar2() {
        return var2;
    }

    public void setVar1(Boolean var1) {
        this.var1 = var1;
    }

    public void setVar2(Boolean var2) {
        this.var2 = var2;
    }

    /****************************
        * Conjunction method
     ****************************/

    public Boolean Conunctions() {
        if (var1 == null || var2 == null) {
            return null;
        }
        if (this.var1 == true && this.var2 == true) {
            return true;
        }
        if (this.var1 == false || this.var2 == false) {
            return false;
        }
        else return null;
    }

    /*****************************
        * Disjunction method
    *****************************/
    public Boolean Disunctions() {

        if (var1 == null || var2 == null) {
            return null;
        }
        if (this.var1 == true || this.var2 == true) {
            return true;
        }
        if (this.var1 == false && this.var2 == false) {
            return false;
        }
        else return null;
    }
}
