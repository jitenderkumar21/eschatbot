/*
 * This file is generated by jOOQ.
 */
package com.example.eschatbot.database.tables.records;


import com.example.eschatbot.database.tables.Customerstate;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerstateRecord extends TableRecordImpl<CustomerstateRecord> implements Record4<Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>chatbot.customerstate.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>chatbot.customerstate.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>chatbot.customerstate.active_ques</code>.
     */
    public void setActiveQues(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>chatbot.customerstate.active_ques</code>.
     */
    public Integer getActiveQues() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>chatbot.customerstate.active_journey</code>.
     */
    public void setActiveJourney(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>chatbot.customerstate.active_journey</code>.
     */
    public Integer getActiveJourney() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>chatbot.customerstate.phone_number</code>.
     */
    public void setPhoneNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>chatbot.customerstate.phone_number</code>.
     */
    public String getPhoneNumber() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Customerstate.CUSTOMERSTATE.CUSTOMER_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Customerstate.CUSTOMERSTATE.ACTIVE_QUES;
    }

    @Override
    public Field<Integer> field3() {
        return Customerstate.CUSTOMERSTATE.ACTIVE_JOURNEY;
    }

    @Override
    public Field<String> field4() {
        return Customerstate.CUSTOMERSTATE.PHONE_NUMBER;
    }

    @Override
    public Integer component1() {
        return getCustomerId();
    }

    @Override
    public Integer component2() {
        return getActiveQues();
    }

    @Override
    public Integer component3() {
        return getActiveJourney();
    }

    @Override
    public String component4() {
        return getPhoneNumber();
    }

    @Override
    public Integer value1() {
        return getCustomerId();
    }

    @Override
    public Integer value2() {
        return getActiveQues();
    }

    @Override
    public Integer value3() {
        return getActiveJourney();
    }

    @Override
    public String value4() {
        return getPhoneNumber();
    }

    @Override
    public CustomerstateRecord value1(Integer value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public CustomerstateRecord value2(Integer value) {
        setActiveQues(value);
        return this;
    }

    @Override
    public CustomerstateRecord value3(Integer value) {
        setActiveJourney(value);
        return this;
    }

    @Override
    public CustomerstateRecord value4(String value) {
        setPhoneNumber(value);
        return this;
    }

    @Override
    public CustomerstateRecord values(Integer value1, Integer value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerstateRecord
     */
    public CustomerstateRecord() {
        super(Customerstate.CUSTOMERSTATE);
    }

    /**
     * Create a detached, initialised CustomerstateRecord
     */
    public CustomerstateRecord(Integer customerId, Integer activeQues, Integer activeJourney, String phoneNumber) {
        super(Customerstate.CUSTOMERSTATE);

        setCustomerId(customerId);
        setActiveQues(activeQues);
        setActiveJourney(activeJourney);
        setPhoneNumber(phoneNumber);
    }
}
