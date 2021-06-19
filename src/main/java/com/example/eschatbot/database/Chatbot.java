/*
 * This file is generated by jOOQ.
 */
package com.example.eschatbot.database;


import com.example.eschatbot.database.tables.Customerstate;
import com.example.eschatbot.database.tables.JourneyMaster;
import com.example.eschatbot.database.tables.QuestionsNext;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Chatbot extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>chatbot</code>
     */
    public static final Chatbot CHATBOT = new Chatbot();

    /**
     * The table <code>chatbot.customerstate</code>.
     */
    public final Customerstate CUSTOMERSTATE = Customerstate.CUSTOMERSTATE;

    /**
     * The table <code>chatbot.journey_master</code>.
     */
    public final JourneyMaster JOURNEY_MASTER = JourneyMaster.JOURNEY_MASTER;

    /**
     * The table <code>chatbot.questions_next</code>.
     */
    public final QuestionsNext QUESTIONS_NEXT = QuestionsNext.QUESTIONS_NEXT;

    /**
     * No further instances allowed
     */
    private Chatbot() {
        super("chatbot", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Customerstate.CUSTOMERSTATE,
            JourneyMaster.JOURNEY_MASTER,
            QuestionsNext.QUESTIONS_NEXT);
    }
}