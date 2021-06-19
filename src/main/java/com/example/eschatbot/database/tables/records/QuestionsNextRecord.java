/*
 * This file is generated by jOOQ.
 */
package com.example.eschatbot.database.tables.records;


import com.example.eschatbot.database.tables.QuestionsNext;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionsNextRecord extends TableRecordImpl<QuestionsNextRecord> implements Record5<Integer, String, Integer, Integer, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>chatbot.questions_next.question_id</code>.
     */
    public void setQuestionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>chatbot.questions_next.question_id</code>.
     */
    public Integer getQuestionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>chatbot.questions_next.question</code>.
     */
    public void setQuestion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>chatbot.questions_next.question</code>.
     */
    public String getQuestion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>chatbot.questions_next.journey_id</code>.
     */
    public void setJourneyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>chatbot.questions_next.journey_id</code>.
     */
    public Integer getJourneyId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>chatbot.questions_next.next_ques_id</code>.
     */
    public void setNextQuesId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>chatbot.questions_next.next_ques_id</code>.
     */
    public Integer getNextQuesId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>chatbot.questions_next.flag</code>.
     */
    public void setFlag(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>chatbot.questions_next.flag</code>.
     */
    public Byte getFlag() {
        return (Byte) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, Integer, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Integer, Integer, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return QuestionsNext.QUESTIONS_NEXT.QUESTION_ID;
    }

    @Override
    public Field<String> field2() {
        return QuestionsNext.QUESTIONS_NEXT.QUESTION;
    }

    @Override
    public Field<Integer> field3() {
        return QuestionsNext.QUESTIONS_NEXT.JOURNEY_ID;
    }

    @Override
    public Field<Integer> field4() {
        return QuestionsNext.QUESTIONS_NEXT.NEXT_QUES_ID;
    }

    @Override
    public Field<Byte> field5() {
        return QuestionsNext.QUESTIONS_NEXT.FLAG;
    }

    @Override
    public Integer component1() {
        return getQuestionId();
    }

    @Override
    public String component2() {
        return getQuestion();
    }

    @Override
    public Integer component3() {
        return getJourneyId();
    }

    @Override
    public Integer component4() {
        return getNextQuesId();
    }

    @Override
    public Byte component5() {
        return getFlag();
    }

    @Override
    public Integer value1() {
        return getQuestionId();
    }

    @Override
    public String value2() {
        return getQuestion();
    }

    @Override
    public Integer value3() {
        return getJourneyId();
    }

    @Override
    public Integer value4() {
        return getNextQuesId();
    }

    @Override
    public Byte value5() {
        return getFlag();
    }

    @Override
    public QuestionsNextRecord value1(Integer value) {
        setQuestionId(value);
        return this;
    }

    @Override
    public QuestionsNextRecord value2(String value) {
        setQuestion(value);
        return this;
    }

    @Override
    public QuestionsNextRecord value3(Integer value) {
        setJourneyId(value);
        return this;
    }

    @Override
    public QuestionsNextRecord value4(Integer value) {
        setNextQuesId(value);
        return this;
    }

    @Override
    public QuestionsNextRecord value5(Byte value) {
        setFlag(value);
        return this;
    }

    @Override
    public QuestionsNextRecord values(Integer value1, String value2, Integer value3, Integer value4, Byte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuestionsNextRecord
     */
    public QuestionsNextRecord() {
        super(QuestionsNext.QUESTIONS_NEXT);
    }

    /**
     * Create a detached, initialised QuestionsNextRecord
     */
    public QuestionsNextRecord(Integer questionId, String question, Integer journeyId, Integer nextQuesId, Byte flag) {
        super(QuestionsNext.QUESTIONS_NEXT);

        setQuestionId(questionId);
        setQuestion(question);
        setJourneyId(journeyId);
        setNextQuesId(nextQuesId);
        setFlag(flag);
    }
}