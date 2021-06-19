package com.example.eschatbot.services;

import com.example.eschatbot.database.tables.Customerstate;
import com.example.eschatbot.database.tables.records.CustomerstateRecord;
import com.example.eschatbot.responses.CustomerStateResponse;
import com.example.eschatbot.util.ConnectionUtil;
import com.example.eschatbot.util.QueriesUtil;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerStateService {
    public static CustomerStateResponse getCustomerState(String phoneNumber) {

        CustomerstateRecord record = QueriesUtil.getCustomerState(phoneNumber);
        return getCustomerStateResponse(record, phoneNumber);
    }

    public static CustomerstateRecord addNewUser(String phoneNumber){

        DSLContext context = ConnectionUtil.getInstance().getDSLContext();
        List<Integer> prevUserId = context.selectFrom(Customerstate.CUSTOMERSTATE).orderBy(Customerstate.CUSTOMERSTATE.CUSTOMER_ID.desc()).limit(1).fetch(Customerstate.CUSTOMERSTATE.CUSTOMER_ID);

        // New User details
        int newUserId = prevUserId.get(0) + 1;
        int newUserActiveQues = 1;
        int newUserActiveJourneyId = 1;
        context.insertInto(Customerstate.CUSTOMERSTATE, Customerstate.CUSTOMERSTATE.CUSTOMER_ID,  Customerstate.CUSTOMERSTATE.ACTIVE_QUES,
                Customerstate.CUSTOMERSTATE.ACTIVE_JOURNEY, Customerstate.CUSTOMERSTATE.PHONE_NUMBER).values(newUserId, newUserActiveQues,
                newUserActiveJourneyId, phoneNumber).execute();
        CustomerstateRecord record = QueriesUtil.getCustomerState(phoneNumber);
        return record;

    }


    private static CustomerStateResponse getCustomerStateResponse(CustomerstateRecord record, String phoneNumber) {
        CustomerStateResponse response = new CustomerStateResponse();

        // null value handling
        if(record == null){
//            response.setExceptionMessage("Couldn't find an entry for the given phone number!");
            record = addNewUser(phoneNumber);
//            return response;

            // Jitender - Add entry if no record found and return the newly created customer state
        }

        response.setCustomerId(record.getCustomerId());
        response.setPhoneNumber(record.getPhoneNumber());
        response.setActiveJourney(record.getActiveJourney());
        response.setActiveQues(record.getActiveQues());

        return response;
    }
}
