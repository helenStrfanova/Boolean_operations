import org.junit.Assert;

import java.util.logging.Logger;

/*
 * @author Alona Sviridova
 * @version 1.1
 * DATE 09.08.2020
 * PROJECT NAME "Boolean operations"
 * */

public class LogicalOperationsTest {

    private static final Logger LOGGER = Logger
            .getLogger(LogicalOperations.class.getName());

    LogicalOperations trueTrue = new LogicalOperations(true, true);
    LogicalOperations trueFalse = new LogicalOperations(true, false);
    LogicalOperations trueNull = new LogicalOperations(true,null);

    LogicalOperations falseTrue = new LogicalOperations(false, true);
    LogicalOperations falseFalse = new LogicalOperations(false, false);
    LogicalOperations falseNull = new LogicalOperations(false, null);

    LogicalOperations nullTrue = new LogicalOperations(null, true);
    LogicalOperations nullFalse = new LogicalOperations(null, false);
    LogicalOperations nullNull = new LogicalOperations(null, null);

    /*****************************************************************
       * Testing conjunction method
    *****************************************************************/
    @org.junit.Test
    public void whenVar1TrueVar2TrueThenConjunctionTrue() {
        LOGGER.info("CONJUNCTION_TRUE");
        Assert.assertEquals(true, trueTrue.Conunctions());
    }

    @org.junit.Test
    public void whenVar1TrueVar2FalseThenConjunctionFalse() {
        LOGGER.info("CONJUNCTION_FALSE");
        Assert.assertEquals(false, trueFalse.Conunctions());
    }

    @org.junit.Test
    public void whenVar1TrueVar2NullThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, trueNull.Conunctions());
    }

    @org.junit.Test
    public void whenVar1FalseVar2TrueThenConjunctionFalse() {
        LOGGER.info("CONJUNCTION_FALSE");
        Assert.assertEquals(false, falseTrue.Conunctions());
    }

    @org.junit.Test
    public void whenVar1FalseVar2FalseThenConjunctionFalse() {
        LOGGER.info("CONJUNCTION_FALSE");
        Assert.assertEquals(false, falseFalse.Conunctions());
    }

    @org.junit.Test
    public void whenVar1FalseVar2NullThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, falseNull.Conunctions());
    }

    @org.junit.Test
    public void whenVar1NullVar2TrueThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, nullTrue.Conunctions());
    }

    @org.junit.Test
    public void whenVar1NullVar2FalseThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, nullFalse.Conunctions());
    }

    @org.junit.Test
    public void whenVar1NullVar2NullThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, nullNull.Conunctions());
    }

    /*****************************************************************
            * Testing disjunction method
    ******************************************************************/

    @org.junit.Test
    public void whenVar1TrueVar2TrueThenDisjunctionTrue() {
        LOGGER.info("DISJUNCTION_TRUE");
        Assert.assertEquals(true, trueTrue.Disunctions());
    }

    @org.junit.Test
    public void whenVar1TrueVar2FalseThenDisjunctionTrue() {
        LOGGER.info("DISJUNCTION_TRUE");
        Assert.assertEquals(true, trueFalse.Disunctions());
    }

    @org.junit.Test
    public void whenVar1TrueVar2NullThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, trueNull.Disunctions());
    }

    @org.junit.Test
    public void whenVar1FalseVar2TrueThenDisjunctionTrue() {
        LOGGER.info("DISJUNCTION_TRUE");
        Assert.assertEquals(true, falseTrue.Disunctions());
    }

    @org.junit.Test
    public void whenVar1FalseVar2FalseThenDisjunctionFalse() {
        LOGGER.info("DISJUNCTION_FALSE");
        Assert.assertEquals(false, falseFalse.Disunctions());
    }

    @org.junit.Test
    public void whenVar1FalseVar2NullThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, falseNull.Disunctions());
    }

    @org.junit.Test
    public void whenVar1NullVar2TrueThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, nullTrue.Disunctions());
    }

    @org.junit.Test
    public void whenVar1NullVar2FalseThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, nullFalse.Disunctions());
    }

    @org.junit.Test
    public void whenVar1NullVar2NullThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, nullNull.Disunctions());
    }
}