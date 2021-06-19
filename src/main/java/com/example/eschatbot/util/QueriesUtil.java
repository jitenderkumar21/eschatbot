package com.example.eschatbot.util;

import com.example.eschatbot.database.tables.Customerstate;
import com.example.eschatbot.database.tables.records.CustomerstateRecord;
import com.example.eschatbot.responses.CustomerStateResponse;
import org.jooq.DSLContext;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.meta.derby.sys.Sys;

import java.sql.SQLException;
import java.util.Objects;

public class QueriesUtil {

    public static CustomerstateRecord getCustomerState(String phoneNumber) {
         DSLContext context = ConnectionUtil.getInstance().getDSLContext();
         return context
                .selectFrom(Customerstate.CUSTOMERSTATE)
                 .where(Customerstate.CUSTOMERSTATE.PHONE_NUMBER.eq(phoneNumber))
                .fetchAny();

    }



}
